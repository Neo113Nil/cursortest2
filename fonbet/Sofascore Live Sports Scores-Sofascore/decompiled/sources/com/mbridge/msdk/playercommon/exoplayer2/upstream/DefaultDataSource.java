package com.mbridge.msdk.playercommon.exoplayer2.upstream;

import android.content.Context;
import android.net.Uri;
import com.mbridge.msdk.playercommon.exoplayer2.util.Assertions;
import com.mbridge.msdk.playercommon.exoplayer2.util.Util;
import defpackage.vp2;
import java.io.IOException;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes4.dex */
public final class DefaultDataSource implements DataSource {
    private static final String SCHEME_ASSET = "asset";
    private static final String SCHEME_CONTENT = "content";
    private static final String SCHEME_RAW = "rawresource";
    private static final String SCHEME_RTMP = "rtmp";
    private static final String TAG = "DefaultDataSource";
    private DataSource assetDataSource;
    private final DataSource baseDataSource;
    private DataSource contentDataSource;
    private final Context context;
    private DataSource dataSchemeDataSource;
    private DataSource dataSource;
    private DataSource fileDataSource;
    private final TransferListener<? super DataSource> listener;
    private DataSource rawResourceDataSource;
    private DataSource rtmpDataSource;

    public DefaultDataSource(Context context, TransferListener<? super DataSource> transferListener, DataSource dataSource) {
        this.context = context.getApplicationContext();
        this.listener = transferListener;
        this.baseDataSource = (DataSource) Assertions.checkNotNull(dataSource);
    }

    private DataSource getAssetDataSource() {
        DataSource dataSource = this.assetDataSource;
        if (dataSource != null) {
            return dataSource;
        }
        AssetDataSource assetDataSource = new AssetDataSource(this.context, this.listener);
        this.assetDataSource = assetDataSource;
        return assetDataSource;
    }

    private DataSource getContentDataSource() {
        DataSource dataSource = this.contentDataSource;
        if (dataSource != null) {
            return dataSource;
        }
        ContentDataSource contentDataSource = new ContentDataSource(this.context, this.listener);
        this.contentDataSource = contentDataSource;
        return contentDataSource;
    }

    private DataSource getDataSchemeDataSource() {
        DataSource dataSource = this.dataSchemeDataSource;
        if (dataSource != null) {
            return dataSource;
        }
        DataSchemeDataSource dataSchemeDataSource = new DataSchemeDataSource();
        this.dataSchemeDataSource = dataSchemeDataSource;
        return dataSchemeDataSource;
    }

    private DataSource getFileDataSource() {
        DataSource dataSource = this.fileDataSource;
        if (dataSource != null) {
            return dataSource;
        }
        FileDataSource fileDataSource = new FileDataSource(this.listener);
        this.fileDataSource = fileDataSource;
        return fileDataSource;
    }

    private DataSource getRawResourceDataSource() {
        DataSource dataSource = this.rawResourceDataSource;
        if (dataSource != null) {
            return dataSource;
        }
        RawResourceDataSource rawResourceDataSource = new RawResourceDataSource(this.context, this.listener);
        this.rawResourceDataSource = rawResourceDataSource;
        return rawResourceDataSource;
    }

    private DataSource getRtmpDataSource() {
        DataSource dataSource = this.rtmpDataSource;
        if (dataSource != null) {
            return dataSource;
        }
        try {
            this.rtmpDataSource = (DataSource) Class.forName("com.mbridge.msdk.playercommon.exoplayer2.ext.rtmp.RtmpDataSource").getConstructor(null).newInstance(null);
        } catch (ClassNotFoundException unused) {
        } catch (Exception e) {
            vp2.e("Error instantiating RTMP extension", e);
            return null;
        }
        DataSource dataSource2 = this.rtmpDataSource;
        if (dataSource2 != null) {
            return dataSource2;
        }
        DataSource dataSource3 = this.baseDataSource;
        this.rtmpDataSource = dataSource3;
        return dataSource3;
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.upstream.DataSource
    public void close() throws IOException {
        DataSource dataSource = this.dataSource;
        if (dataSource != null) {
            try {
                dataSource.close();
            } finally {
                this.dataSource = null;
            }
        }
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.upstream.DataSource
    public Uri getUri() {
        DataSource dataSource = this.dataSource;
        if (dataSource == null) {
            return null;
        }
        return dataSource.getUri();
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.upstream.DataSource
    public long open(DataSpec dataSpec) throws IOException {
        DataSource dataSource;
        Assertions.checkState(this.dataSource == null);
        String scheme = dataSpec.uri.getScheme();
        if (Util.isLocalFileUri(dataSpec.uri)) {
            if (dataSpec.uri.getPath().startsWith("/android_asset/")) {
                dataSource = getAssetDataSource();
                this.dataSource = dataSource;
            } else {
                dataSource = getFileDataSource();
                this.dataSource = dataSource;
            }
        } else if (SCHEME_ASSET.equals(scheme)) {
            dataSource = getAssetDataSource();
            this.dataSource = dataSource;
        } else if ("content".equals(scheme)) {
            dataSource = getContentDataSource();
            this.dataSource = dataSource;
        } else if (SCHEME_RTMP.equals(scheme)) {
            dataSource = getRtmpDataSource();
            this.dataSource = dataSource;
        } else if ("data".equals(scheme)) {
            dataSource = getDataSchemeDataSource();
            this.dataSource = dataSource;
        } else if ("rawresource".equals(scheme)) {
            dataSource = getRawResourceDataSource();
            this.dataSource = dataSource;
        } else {
            dataSource = this.baseDataSource;
            this.dataSource = dataSource;
        }
        return dataSource.open(dataSpec);
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.upstream.DataSource
    public int read(byte[] bArr, int i, int i2) throws IOException {
        return this.dataSource.read(bArr, i, i2);
    }

    public DefaultDataSource(Context context, TransferListener<? super DataSource> transferListener, String str, int i, int i2, boolean z) {
        this(context, transferListener, new DefaultHttpDataSource(str, null, transferListener, i, i2, z, null));
    }

    public DefaultDataSource(Context context, TransferListener<? super DataSource> transferListener, String str, boolean z) {
        this(context, transferListener, str, 8000, 8000, z);
    }
}
