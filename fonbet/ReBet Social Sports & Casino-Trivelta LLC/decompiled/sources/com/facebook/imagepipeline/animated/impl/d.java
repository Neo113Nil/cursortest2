package com.facebook.imagepipeline.animated.impl;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import v7.C6647b;
import v7.C6650e;
import v7.InterfaceC6646a;

/* loaded from: classes2.dex */
public class d {

    /* renamed from: a, reason: collision with root package name */
    public final InterfaceC6646a f30573a;

    /* renamed from: b, reason: collision with root package name */
    public final b f30574b;

    /* renamed from: c, reason: collision with root package name */
    public final Paint f30575c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f30576d;

    public static /* synthetic */ class a {
        static final /* synthetic */ int[] $SwitchMap$com$facebook$imagepipeline$animated$impl$AnimatedImageCompositor$FrameNeededResult;

        static {
            int[] iArr = new int[c.values().length];
            $SwitchMap$com$facebook$imagepipeline$animated$impl$AnimatedImageCompositor$FrameNeededResult = iArr;
            try {
                iArr[c.REQUIRED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$facebook$imagepipeline$animated$impl$AnimatedImageCompositor$FrameNeededResult[c.NOT_REQUIRED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$facebook$imagepipeline$animated$impl$AnimatedImageCompositor$FrameNeededResult[c.ABORT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$com$facebook$imagepipeline$animated$impl$AnimatedImageCompositor$FrameNeededResult[c.SKIP.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    public interface b {
        void a(int i10, Bitmap bitmap);

        H6.a b(int i10);
    }

    public enum c {
        REQUIRED,
        NOT_REQUIRED,
        SKIP,
        ABORT
    }

    public d(InterfaceC6646a interfaceC6646a, boolean z10, b bVar) {
        this.f30573a = interfaceC6646a;
        this.f30574b = bVar;
        this.f30576d = z10;
        Paint paint = new Paint();
        this.f30575c = paint;
        paint.setColor(0);
        paint.setStyle(Paint.Style.FILL);
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC));
    }

    public final void a(Canvas canvas, C6647b c6647b) {
        canvas.drawRect(c6647b.f67044b, c6647b.f67045c, r0 + c6647b.f67046d, r1 + c6647b.f67047e, this.f30575c);
    }

    public final c b(int i10) {
        C6647b c10 = this.f30573a.c(i10);
        C6647b.EnumC0938b enumC0938b = c10.f67049g;
        return enumC0938b == C6647b.EnumC0938b.DISPOSE_DO_NOT ? c.REQUIRED : enumC0938b == C6647b.EnumC0938b.DISPOSE_TO_BACKGROUND ? c(c10) ? c.NOT_REQUIRED : c.REQUIRED : enumC0938b == C6647b.EnumC0938b.DISPOSE_TO_PREVIOUS ? c.SKIP : c.ABORT;
    }

    public final boolean c(C6647b c6647b) {
        return c6647b.f67044b == 0 && c6647b.f67045c == 0 && c6647b.f67046d == this.f30573a.j() && c6647b.f67047e == this.f30573a.h();
    }

    public final boolean d(int i10) {
        if (i10 == 0) {
            return true;
        }
        C6647b c10 = this.f30573a.c(i10);
        C6647b c11 = this.f30573a.c(i10 - 1);
        if (c10.f67048f == C6647b.a.NO_BLEND && c(c10)) {
            return true;
        }
        return c11.f67049g == C6647b.EnumC0938b.DISPOSE_TO_BACKGROUND && c(c11);
    }

    public final void e(Bitmap bitmap) {
        C6650e k10 = this.f30573a.k();
        if (k10 == null) {
            return;
        }
        k10.c();
    }

    public final int f(int i10, Canvas canvas) {
        while (i10 >= 0) {
            int i11 = a.$SwitchMap$com$facebook$imagepipeline$animated$impl$AnimatedImageCompositor$FrameNeededResult[b(i10).ordinal()];
            if (i11 == 1) {
                C6647b c10 = this.f30573a.c(i10);
                H6.a b10 = this.f30574b.b(i10);
                if (b10 != null) {
                    try {
                        canvas.drawBitmap((Bitmap) b10.z0(), 0.0f, 0.0f, (Paint) null);
                        if (c10.f67049g == C6647b.EnumC0938b.DISPOSE_TO_BACKGROUND) {
                            a(canvas, c10);
                        }
                        return i10 + 1;
                    } finally {
                        if (!this.f30576d) {
                            b10.close();
                        }
                    }
                }
                if (d(i10)) {
                    return i10;
                }
                i10--;
            } else {
                if (i11 == 2) {
                    return i10 + 1;
                }
                if (i11 == 3) {
                    return i10;
                }
                i10--;
            }
        }
        return 0;
    }

    public void g(int i10, Bitmap bitmap) {
        this.f30573a.i(i10, new Canvas(bitmap));
    }

    public void h(int i10, Bitmap bitmap) {
        if (this.f30576d) {
            g(i10, bitmap);
            return;
        }
        Canvas canvas = new Canvas(bitmap);
        canvas.drawColor(0, PorterDuff.Mode.SRC);
        for (int f10 = !d(i10) ? f(i10 - 1, canvas) : i10; f10 < i10; f10++) {
            C6647b c10 = this.f30573a.c(f10);
            C6647b.EnumC0938b enumC0938b = c10.f67049g;
            if (enumC0938b != C6647b.EnumC0938b.DISPOSE_TO_PREVIOUS) {
                if (c10.f67048f == C6647b.a.NO_BLEND) {
                    a(canvas, c10);
                }
                this.f30573a.e(f10, canvas);
                this.f30574b.a(f10, bitmap);
                if (enumC0938b == C6647b.EnumC0938b.DISPOSE_TO_BACKGROUND) {
                    a(canvas, c10);
                }
            }
        }
        C6647b c11 = this.f30573a.c(i10);
        if (c11.f67048f == C6647b.a.NO_BLEND) {
            a(canvas, c11);
        }
        this.f30573a.e(i10, canvas);
        e(bitmap);
    }
}
