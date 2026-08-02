package com.inmobi.media;

import android.media.MediaPlayer;
import defpackage.a70;
import defpackage.an5;
import defpackage.b1d;
import defpackage.ku3;
import defpackage.lu3;
import defpackage.sq3;
import defpackage.xw3;
import defpackage.y6a;
import defpackage.yda;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Unit;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes4.dex */
public final class En {
    public final MediaPlayer a;
    public final ku3 b;
    public final long c;
    public final b1d d;
    public final AtomicBoolean e;
    public yda f;
    public int g;

    public En(MediaPlayer mediaPlayer, ku3 ku3Var, long j, b1d b1dVar) {
        mediaPlayer.getClass();
        ku3Var.getClass();
        b1dVar.getClass();
        this.a = mediaPlayer;
        this.b = ku3Var;
        this.c = j;
        this.d = b1dVar;
        this.e = new AtomicBoolean(false);
        this.g = -1;
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0107  */
    /* JADX WARN: Removed duplicated region for block: B:22:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x010a  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0100  */
    /* JADX WARN: Removed duplicated region for block: B:34:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00c7  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0029  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object a(En en, sq3 sq3Var) {
        Cn cn;
        lu3 lu3Var;
        int i;
        boolean z;
        int currentPosition;
        Object emit;
        int i2;
        Object obj;
        int i3;
        Object emit2;
        en.getClass();
        if (sq3Var instanceof Cn) {
            cn = (Cn) sq3Var;
            int i4 = cn.e;
            if ((i4 & Integer.MIN_VALUE) != 0) {
                cn.e = i4 - Integer.MIN_VALUE;
                Object obj2 = cn.c;
                lu3Var = lu3.a;
                i = cn.e;
                if (i != 0) {
                    y6a.M(obj2);
                    MediaPlayer mediaPlayer = en.a;
                    mediaPlayer.getClass();
                    try {
                        z = mediaPlayer.isPlaying();
                    } catch (IllegalStateException unused) {
                        z = false;
                    }
                    if (z) {
                        currentPosition = en.a.getCurrentPosition();
                        int duration = en.a.getDuration();
                        int i5 = -1;
                        if (duration == -1) {
                            return Unit.a;
                        }
                        int i6 = duration > 0 ? (currentPosition * 100) / duration : 0;
                        int i7 = en.g;
                        if (i7 != 4 || i6 >= 25) {
                            i5 = i7;
                        } else {
                            en.g = -1;
                        }
                        cn.a = currentPosition;
                        cn.b = i6;
                        cn.e = 1;
                        if (i5 >= 0) {
                            emit = Unit.a;
                        } else {
                            en.g = 0;
                            emit = en.d.emit(new Jn("VideoProgressTracker", duration), cn);
                            if (emit != lu3.a) {
                                emit = Unit.a;
                            }
                        }
                        if (emit == lu3Var) {
                            return lu3Var;
                        }
                        i2 = i6;
                        cn.a = currentPosition;
                        cn.b = i2;
                        cn.e = 2;
                        if (!en.a(i2, 25, 1)) {
                        }
                        if (obj != lu3Var) {
                        }
                    }
                    return Unit.a;
                }
                if (i == 1) {
                    i2 = cn.b;
                    int i8 = cn.a;
                    y6a.M(obj2);
                    currentPosition = i8;
                    cn.a = currentPosition;
                    cn.b = i2;
                    cn.e = 2;
                    if (!en.a(i2, 25, 1)) {
                        en.g = 1;
                        obj = en.d.emit(Wm.a, cn);
                        if (obj != lu3.a) {
                            obj = Unit.a;
                        }
                    } else if (en.a(i2, 50, 2)) {
                        en.g = 2;
                        obj = en.d.emit(Hn.a, cn);
                        if (obj != lu3.a) {
                            obj = Unit.a;
                        }
                    } else if (en.a(i2, 75, 3)) {
                        en.g = 3;
                        obj = en.d.emit(Qn.a, cn);
                        if (obj != lu3.a) {
                            obj = Unit.a;
                        }
                    } else {
                        obj = Unit.a;
                    }
                    if (obj != lu3Var) {
                        return lu3Var;
                    }
                    i3 = currentPosition;
                } else {
                    if (i != 2) {
                        if (i == 3) {
                            y6a.M(obj2);
                            return Unit.a;
                        }
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    i2 = cn.b;
                    i3 = cn.a;
                    y6a.M(obj2);
                }
                cn.e = 3;
                if (en.g != 4) {
                    emit2 = Unit.a;
                } else {
                    emit2 = en.d.emit(new C3868wn(i3, i2), cn);
                    if (emit2 != lu3.a) {
                        emit2 = Unit.a;
                    }
                }
                if (emit2 == lu3Var) {
                    return lu3Var;
                }
                return Unit.a;
            }
        }
        cn = new Cn(en, sq3Var);
        Object obj22 = cn.c;
        lu3Var = lu3.a;
        i = cn.e;
        if (i != 0) {
        }
        cn.e = 3;
        if (en.g != 4) {
        }
        if (emit2 == lu3Var) {
        }
        return Unit.a;
    }

    public final void b() {
        if (this.e.getAndSet(true)) {
            return;
        }
        this.f = xw3.L(this.b, null, null, new Dn(this, null), 3);
        a();
    }

    public final void c() {
        if (this.e.getAndSet(false)) {
            this.a.setOnCompletionListener(null);
            P6.a(this.f);
            this.f = null;
        }
    }

    public final void a() {
        this.a.setOnCompletionListener(new an5(this, 0));
    }

    public static final void a(En en, MediaPlayer mediaPlayer) {
        en.g = 4;
        xw3.L(en.b, null, null, new Bn(en, null), 3);
    }

    public final boolean a(int i, int i2, int i3) {
        return i3 >= -1 && i3 <= 4 && i >= i2 && this.g == i3 - 1;
    }
}
