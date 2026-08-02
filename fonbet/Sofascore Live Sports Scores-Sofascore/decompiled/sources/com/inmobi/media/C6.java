package com.inmobi.media;

import androidx.media3.exoplayer.ExoPlayer;
import com.inmobi.media.core.config.models.AdConfig;
import com.inmobi.media.videoPlayer.model.TrackPercentage;
import defpackage.a70;
import defpackage.b1d;
import defpackage.g51;
import defpackage.ku3;
import defpackage.lu3;
import defpackage.sq3;
import defpackage.vg6;
import defpackage.y6a;
import defpackage.yda;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Unit;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes4.dex */
public final class C6 {
    public final ExoPlayer a;
    public final ku3 b;
    public final b1d c;
    public final AtomicBoolean d;
    public yda e;
    public yda f;
    public int g;
    public boolean[] h;
    public final int[] i;
    public final AbstractC3712qm[] j;
    public final long k;
    public final long l;

    public C6(ExoPlayer exoPlayer, AdConfig.HybridNativeConfig hybridNativeConfig, ku3 ku3Var, long j, b1d b1dVar, TrackPercentage trackPercentage) {
        exoPlayer.getClass();
        hybridNativeConfig.getClass();
        ku3Var.getClass();
        b1dVar.getClass();
        trackPercentage.getClass();
        this.a = exoPlayer;
        this.b = ku3Var;
        this.c = b1dVar;
        this.d = new AtomicBoolean(false);
        this.g = -1;
        boolean[] zArr = new boolean[4];
        for (int i = 0; i < 4; i++) {
            zArr[i] = false;
        }
        this.h = zArr;
        this.i = new int[]{trackPercentage.getQ1(), trackPercentage.getQ2(), trackPercentage.getQ3(), trackPercentage.getQ4()};
        this.j = new AbstractC3712qm[]{Wm.a, Hn.a, Qn.a, Xm.a};
        this.k = 200L;
        long minProgressInterval = hybridNativeConfig.getMinProgressInterval();
        this.l = j < minProgressInterval ? minProgressInterval : j;
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x00ab, code lost:
    
        if (r9.a(r2, r0) != r1) goto L44;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x00ad, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x00a2, code lost:
    
        if (r10 == r1) goto L43;
     */
    /* JADX WARN: Removed duplicated region for block: B:20:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object a(C6 c6, sq3 sq3Var) {
        C3929z6 c3929z6;
        int i;
        int currentPosition;
        Object emit;
        c6.getClass();
        if (sq3Var instanceof C3929z6) {
            c3929z6 = (C3929z6) sq3Var;
            int i2 = c3929z6.d;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                c3929z6.d = i2 - Integer.MIN_VALUE;
                Object obj = c3929z6.b;
                Object obj2 = lu3.a;
                i = c3929z6.d;
                if (i != 0) {
                    y6a.M(obj);
                    if (!((g51) c6.a).isPlaying()) {
                        return Unit.a;
                    }
                    int duration = (int) ((vg6) c6.a).getDuration();
                    if (duration <= 0) {
                        return Unit.a;
                    }
                    currentPosition = (((int) ((vg6) c6.a).getCurrentPosition()) * 100) / duration;
                    if (c6.g == 2 && currentPosition < c6.i[0]) {
                        c6.g = -1;
                        boolean[] zArr = new boolean[4];
                        for (int i3 = 0; i3 < 4; i3++) {
                            zArr[i3] = false;
                        }
                        c6.h = zArr;
                    }
                    c3929z6.a = currentPosition;
                    c3929z6.d = 1;
                    if (c6.g >= 0) {
                        emit = Unit.a;
                    } else {
                        c6.g = 0;
                        emit = c6.c.emit(new Jn("ExoVideoProgressTracker", duration), c3929z6);
                        if (emit != lu3.a) {
                            emit = Unit.a;
                        }
                    }
                } else {
                    if (i != 1) {
                        if (i == 2) {
                            y6a.M(obj);
                            return Unit.a;
                        }
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    currentPosition = c3929z6.a;
                    y6a.M(obj);
                }
                c3929z6.d = 2;
            }
        }
        c3929z6 = new C3929z6(c6, sq3Var);
        Object obj3 = c3929z6.b;
        Object obj22 = lu3.a;
        i = c3929z6.d;
        if (i != 0) {
        }
        c3929z6.d = 2;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:13:0x0045 -> B:10:0x0064). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:15:0x004b -> B:10:0x0064). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:17:0x0061 -> B:10:0x0064). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(int i, sq3 sq3Var) {
        C3877x6 c3877x6;
        int i2;
        int i3;
        int i4;
        int length;
        if (sq3Var instanceof C3877x6) {
            c3877x6 = (C3877x6) sq3Var;
            int i5 = c3877x6.f;
            if ((i5 & Integer.MIN_VALUE) != 0) {
                c3877x6.f = i5 - Integer.MIN_VALUE;
                Object obj = c3877x6.d;
                lu3 lu3Var = lu3.a;
                i2 = c3877x6.f;
                if (i2 != 0) {
                    y6a.M(obj);
                    i3 = 0;
                    i4 = i;
                    length = this.i.length;
                    if (i3 < length) {
                    }
                } else {
                    if (i2 != 1) {
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    length = c3877x6.c;
                    i3 = c3877x6.b;
                    int i6 = c3877x6.a;
                    y6a.M(obj);
                    i4 = i6;
                    i3++;
                    if (i3 < length) {
                        if (i4 >= this.i[i3]) {
                            boolean[] zArr = this.h;
                            if (!zArr[i3]) {
                                zArr[i3] = true;
                                b1d b1dVar = this.c;
                                AbstractC3712qm abstractC3712qm = this.j[i3];
                                c3877x6.a = i4;
                                c3877x6.b = i3;
                                c3877x6.c = length;
                                c3877x6.f = 1;
                                if (b1dVar.emit(abstractC3712qm, c3877x6) == lu3Var) {
                                    return lu3Var;
                                }
                            }
                        }
                        i3++;
                        if (i3 < length) {
                        }
                    } else {
                        return Unit.a;
                    }
                }
            }
        }
        c3877x6 = new C3877x6(this, sq3Var);
        Object obj2 = c3877x6.d;
        lu3 lu3Var2 = lu3.a;
        i2 = c3877x6.f;
        if (i2 != 0) {
        }
    }

    public final void a() {
        if (this.d.getAndSet(false)) {
            P6.a(this.e);
            P6.a(this.f);
            this.e = null;
            this.f = null;
        }
    }

    public static final Object a(C6 c6, B6 b6) {
        if (!((g51) c6.a).isPlaying()) {
            return Unit.a;
        }
        long duration = ((vg6) c6.a).getDuration();
        if (duration <= 0) {
            return Unit.a;
        }
        long currentPosition = ((vg6) c6.a).getCurrentPosition();
        if (c6.g == 2) {
            return Unit.a;
        }
        Object emit = c6.c.emit(new C3775t8(currentPosition, duration), b6);
        return emit == lu3.a ? emit : Unit.a;
    }
}
