package com.mbridge.msdk.thrid.okio;

import android.support.v4.media.session.PlaybackStateCompat;
import androidx.annotation.Nullable;

/* compiled from: SegmentPool.java */
/* loaded from: classes14.dex */
final class p {

    @Nullable
    static o a;
    static long b;

    private p() {
    }

    public static o a() {
        synchronized (p.class) {
            try {
                o oVar = a;
                if (oVar == null) {
                    return new o();
                }
                a = oVar.f;
                oVar.f = null;
                b -= PlaybackStateCompat.ACTION_PLAY_FROM_URI;
                return oVar;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static void a(o oVar) {
        if (oVar.f == null && oVar.g == null) {
            if (oVar.d) {
                return;
            }
            synchronized (p.class) {
                try {
                    long j = b + PlaybackStateCompat.ACTION_PLAY_FROM_URI;
                    if (j > PlaybackStateCompat.ACTION_PREPARE_FROM_SEARCH) {
                        return;
                    }
                    b = j;
                    oVar.f = a;
                    oVar.c = 0;
                    oVar.b = 0;
                    a = oVar;
                    return;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        throw new IllegalArgumentException();
    }
}
