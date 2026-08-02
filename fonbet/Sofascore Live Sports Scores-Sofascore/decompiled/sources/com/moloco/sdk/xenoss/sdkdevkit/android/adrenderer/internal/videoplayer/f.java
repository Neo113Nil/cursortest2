package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.videoplayer;

import android.net.Uri;
import com.moloco.sdk.internal.MolocoLogger;
import defpackage.qe4;
import defpackage.sn4;
import defpackage.td4;
import defpackage.we4;
import java.io.IOException;
import java.io.RandomAccessFile;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes4.dex */
public final class f implements qe4 {
    public final String a;
    public final com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.media.j b;
    public RandomAccessFile c;
    public long d;
    public boolean e;
    public boolean f;

    public f(String str, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.media.j jVar) {
        str.getClass();
        jVar.getClass();
        this.a = str;
        this.b = jVar;
    }

    public final com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.media.stream.h b(String str) {
        return (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.media.stream.h) td4.t0(kotlin.coroutines.g.a, new e(this, str, null, 1));
    }

    @Override // defpackage.qe4
    public final void c(sn4 sn4Var) {
        sn4Var.getClass();
        MolocoLogger.info$default(MolocoLogger.INSTANCE, "ProgressiveMediaFileDataSource", "addTransferListener", null, false, 12, null);
    }

    @Override // defpackage.qe4
    public final void close() {
        try {
            RandomAccessFile randomAccessFile = this.c;
            if (randomAccessFile != null) {
                randomAccessFile.close();
            }
        } finally {
            this.c = null;
        }
    }

    @Override // defpackage.qe4
    public final Uri getUri() {
        return Uri.parse(this.a);
    }

    @Override // defpackage.qe4
    public final long k(we4 we4Var) {
        return ((Number) td4.t0(kotlin.coroutines.g.a, new e(this, we4Var, null, 0))).longValue();
    }

    @Override // defpackage.fe4, defpackage.ge4
    public final int read(byte[] bArr, int i, int i2) {
        IOException iOException;
        int i3;
        bArr.getClass();
        try {
            if (i2 == 0) {
                MolocoLogger.info$default(MolocoLogger.INSTANCE, "ProgressiveMediaFileDataSource", "Read length is 0", null, false, 12, null);
                return 0;
            }
            long j = this.d;
            String str = this.a;
            if (j == 0 && (b(str) instanceof com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.media.stream.d)) {
                MolocoLogger.info$default(MolocoLogger.INSTANCE, "ProgressiveMediaFileDataSource", "Media stream is complete", null, false, 12, null);
                return -1;
            }
            com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.media.stream.h b = b(str);
            if (b instanceof com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.media.stream.e) {
                MolocoLogger.error$default(MolocoLogger.INSTANCE, "ProgressiveMediaFileDataSource", "Streaming failed: " + str, null, false, 12, null);
                this.f = true;
                return 0;
            }
            if (b instanceof com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.media.stream.d) {
                RandomAccessFile randomAccessFile = this.c;
                r5 = randomAccessFile != null ? randomAccessFile.read(bArr, i, i2) : 0;
                if (r5 > 0) {
                    this.e = true;
                    this.d -= r5;
                }
                return r5;
            }
            loop0: while (true) {
                i3 = 0;
                while (i3 <= 0) {
                    try {
                        if (!(b(str) instanceof com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.media.stream.f)) {
                            break loop0;
                        }
                        RandomAccessFile randomAccessFile2 = this.c;
                        if (randomAccessFile2 != null) {
                            i3 = randomAccessFile2.read(bArr, i, i2);
                        }
                    } catch (IOException e) {
                        iOException = e;
                        r5 = i3;
                        MolocoLogger.error$default(MolocoLogger.INSTANCE, "ProgressiveMediaFileDataSource", "Waiting for more data", iOException, false, 8, null);
                        return r5;
                    }
                }
            }
            if (i3 > 0) {
                this.e = true;
                this.d -= i3;
            }
            return i3;
        } catch (IOException e2) {
            iOException = e2;
        }
    }
}
