package com.mbridge.msdk.playercommon.exoplayer2.upstream;

import android.net.Uri;
import android.util.Base64;
import com.blaze.blazesdk.data_source.BlazeDataSourcePersonalizedType;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import com.mbridge.msdk.playercommon.exoplayer2.ParserException;
import com.mbridge.msdk.playercommon.exoplayer2.util.Util;
import defpackage.dmi;
import defpackage.yhk;
import java.io.IOException;
import java.net.URLDecoder;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes4.dex */
public final class DataSchemeDataSource implements DataSource {
    public static final String SCHEME_DATA = "data";
    private int bytesRead;
    private byte[] data;
    private DataSpec dataSpec;

    @Override // com.mbridge.msdk.playercommon.exoplayer2.upstream.DataSource
    public void close() throws IOException {
        this.dataSpec = null;
        this.data = null;
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.upstream.DataSource
    public Uri getUri() {
        DataSpec dataSpec = this.dataSpec;
        if (dataSpec != null) {
            return dataSpec.uri;
        }
        return null;
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.upstream.DataSource
    public long open(DataSpec dataSpec) throws IOException {
        byte[] decode;
        this.dataSpec = dataSpec;
        Uri uri = dataSpec.uri;
        String scheme = uri.getScheme();
        if (!"data".equals(scheme)) {
            yhk.k(dmi.q("Unsupported scheme: ", scheme));
            return 0L;
        }
        String[] split = Util.split(uri.getSchemeSpecificPart(), BlazeDataSourcePersonalizedType.STRING_SEPARATOR);
        if (split.length != 2) {
            yhk.k(dmi.m(uri, "Unexpected URI format: "));
            return 0L;
        }
        String str = split[1];
        if (split[0].contains(";base64")) {
            try {
                decode = Base64.decode(str, 0);
                this.data = decode;
            } catch (IllegalArgumentException e) {
                throw new ParserException(dmi.q("Error while parsing Base64 encoded string: ", str), e);
            }
        } else {
            decode = URLDecoder.decode(str, C.ASCII_NAME).getBytes();
            this.data = decode;
        }
        return decode.length;
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.upstream.DataSource
    public int read(byte[] bArr, int i, int i2) {
        if (i2 == 0) {
            return 0;
        }
        int length = this.data.length - this.bytesRead;
        if (length == 0) {
            return -1;
        }
        int min = Math.min(i2, length);
        System.arraycopy(this.data, this.bytesRead, bArr, i, min);
        this.bytesRead += min;
        return min;
    }
}
