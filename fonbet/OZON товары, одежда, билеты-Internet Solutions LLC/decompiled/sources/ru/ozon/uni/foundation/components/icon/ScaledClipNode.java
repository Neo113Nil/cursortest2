package ru.ozon.uni.foundation.components.icon;

import A0.h;
import D1.InterfaceC2819t;
import P9.a;
import Sc.o;
import Z1.d;
import Z1.s;
import androidx.compose.ui.e;
import k1.C7459e;
import k1.C7460f;
import k1.C7462h;
import k1.C7464j;
import k1.C7465k;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import l1.AbstractC7839p0;
import l1.C7786D;
import l1.C7790H;
import l1.InterfaceC7802U;
import l1.J0;
import l1.s0;
import n1.InterfaceC8410c;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u000f\n\u0002\u0010\u0007\n\u0002\b\u0002\b\u0002\u0018\u00002\u00020\u00012\u00020\u0002B\u0017\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u001f\u0010\u000f\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u0013\u0010\u0012\u001a\u00020\u0011*\u00020\u0010H\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\"\u0010\u0004\u001a\u00020\u00038\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0004\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018R\"\u0010\u0006\u001a\u00020\u00058\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0006\u0010\u0019\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001dR\u0018\u0010\u001e\u001a\u0004\u0018\u00010\u00038\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001e\u0010\u0014R\u0016\u0010\u001f\u001a\u00020\u000b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001f\u0010 R\u0016\u0010\"\u001a\u00020!8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\"\u0010\u0019¨\u0006#"}, d2 = {"Lru/ozon/uni/foundation/components/icon/ScaledClipNode;", "Landroidx/compose/ui/e$c;", "LD1/t;", "Ll1/J0;", "shape", "LZ1/h;", "inset", "<init>", "(Ll1/J0;FLkotlin/jvm/internal/DefaultConstructorMarker;)V", "LZ1/d;", "density", "Lk1/j;", "size", "recomputeScaledShape-d16Qtg0", "(LZ1/d;J)Ll1/J0;", "recomputeScaledShape", "Ln1/c;", "", "draw", "(Ln1/c;)V", "Ll1/J0;", "getShape", "()Ll1/J0;", "setShape", "(Ll1/J0;)V", "F", "getInset-D9Ej5fM", "()F", "setInset-0680j_4", "(F)V", "cachedShape", "cachedSize", "J", "", "cachedInsetPx", "uni_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
final class ScaledClipNode extends e.c implements InterfaceC2819t {
    private float cachedInsetPx;
    private J0 cachedShape;
    private long cachedSize;
    private float inset;

    @NotNull
    private J0 shape;

    public /* synthetic */ ScaledClipNode(J0 j02, float f7, DefaultConstructorMarker defaultConstructorMarker) {
        this(j02, f7);
    }

    /* renamed from: recomputeScaledShape-d16Qtg0, reason: not valid java name */
    private final J0 m2997recomputeScaledShaped16Qtg0(d density, long size) {
        final float v12 = density.v1(this.inset);
        float e11 = C7464j.e(size) / 2.0f;
        if (e11 <= v12) {
            v12 = e11;
        }
        if (v12 == this.cachedInsetPx && C7464j.c(size, this.cachedSize)) {
            J0 j02 = this.cachedShape;
            Intrinsics.f(j02);
            return j02;
        }
        this.cachedInsetPx = v12;
        this.cachedSize = size;
        if (Intrinsics.d(this.shape, h.e())) {
            J0 j03 = new J0() { // from class: ru.ozon.uni.foundation.components.icon.ScaledClipNode$recomputeScaledShape$1
                @Override // l1.J0
                /* renamed from: createOutline-Pq9zytI */
                public AbstractC7839p0 mo1createOutlinePq9zytI(long size2, s layoutDirection, d density2) {
                    Intrinsics.checkNotNullParameter(layoutDirection, "layoutDirection");
                    Intrinsics.checkNotNullParameter(density2, "density");
                    float f7 = 2;
                    long a11 = C7465k.a(C7464j.f(size2) - (v12 * f7), C7464j.d(size2) - (f7 * v12));
                    float f11 = v12;
                    long a12 = a.a(f11, f11);
                    C7786D a13 = C7790H.a();
                    a13.u(new C7460f(C7459e.g(a12), C7459e.h(a12), C7464j.f(a11) + C7459e.g(a12), C7464j.d(a11) + C7459e.h(a12)), s0.a.CounterClockwise);
                    return new AbstractC7839p0.a(a13);
                }
            };
            this.cachedShape = j03;
            return j03;
        }
        J0 j04 = new J0() { // from class: ru.ozon.uni.foundation.components.icon.ScaledClipNode$recomputeScaledShape$2
            @Override // l1.J0
            /* renamed from: createOutline-Pq9zytI */
            public AbstractC7839p0 mo1createOutlinePq9zytI(long size2, s layoutDirection, d density2) {
                Intrinsics.checkNotNullParameter(layoutDirection, "layoutDirection");
                Intrinsics.checkNotNullParameter(density2, "density");
                float f7 = 2;
                AbstractC7839p0 mo1createOutlinePq9zytI = this.getShape().mo1createOutlinePq9zytI(C7465k.a(C7464j.f(size2) - (v12 * f7), C7464j.d(size2) - (f7 * v12)), layoutDirection, density2);
                float f11 = v12;
                long a11 = a.a(f11, f11);
                if (mo1createOutlinePq9zytI instanceof AbstractC7839p0.b) {
                    return new AbstractC7839p0.b(((AbstractC7839p0.b) mo1createOutlinePq9zytI).b().A(a11));
                }
                if (mo1createOutlinePq9zytI instanceof AbstractC7839p0.c) {
                    C7462h b11 = ((AbstractC7839p0.c) mo1createOutlinePq9zytI).b();
                    return new AbstractC7839p0.c(new C7462h(b11.e() + C7459e.g(a11), b11.g() + C7459e.h(a11), b11.f() + C7459e.g(a11), b11.a() + C7459e.h(a11), b11.h(), b11.i(), b11.c(), b11.b()));
                }
                if (!(mo1createOutlinePq9zytI instanceof AbstractC7839p0.a)) {
                    throw new o();
                }
                C7786D a12 = C7790H.a();
                a12.v(((AbstractC7839p0.a) mo1createOutlinePq9zytI).b(), a11);
                return new AbstractC7839p0.a(a12);
            }
        };
        this.cachedShape = j04;
        return j04;
    }

    @Override // D1.InterfaceC2819t
    public void draw(@NotNull InterfaceC8410c interfaceC8410c) {
        s0 b11;
        Intrinsics.checkNotNullParameter(interfaceC8410c, "<this>");
        J0 m2997recomputeScaledShaped16Qtg0 = m2997recomputeScaledShaped16Qtg0(interfaceC8410c, interfaceC8410c.i());
        InterfaceC7802U a11 = interfaceC8410c.w0().a();
        AbstractC7839p0 mo1createOutlinePq9zytI = m2997recomputeScaledShaped16Qtg0.mo1createOutlinePq9zytI(interfaceC8410c.i(), interfaceC8410c.getLayoutDirection(), interfaceC8410c);
        if (mo1createOutlinePq9zytI instanceof AbstractC7839p0.b) {
            b11 = C7790H.a();
            b11.d(((AbstractC7839p0.b) mo1createOutlinePq9zytI).b(), s0.a.CounterClockwise);
        } else if (mo1createOutlinePq9zytI instanceof AbstractC7839p0.c) {
            b11 = C7790H.a();
            b11.s(((AbstractC7839p0.c) mo1createOutlinePq9zytI).b(), s0.a.CounterClockwise);
        } else {
            if (!(mo1createOutlinePq9zytI instanceof AbstractC7839p0.a)) {
                throw new o();
            }
            b11 = ((AbstractC7839p0.a) mo1createOutlinePq9zytI).b();
        }
        try {
            a11.save();
            a11.u(b11);
            interfaceC8410c.F0();
        } finally {
            a11.p();
        }
    }

    @NotNull
    public final J0 getShape() {
        return this.shape;
    }

    /* renamed from: setInset-0680j_4, reason: not valid java name */
    public final void m2998setInset0680j_4(float f7) {
        this.inset = f7;
    }

    public final void setShape(@NotNull J0 j02) {
        Intrinsics.checkNotNullParameter(j02, "<set-?>");
        this.shape = j02;
    }

    private ScaledClipNode(J0 shape, float f7) {
        Intrinsics.checkNotNullParameter(shape, "shape");
        this.shape = shape;
        this.inset = f7;
        this.cachedSize = 0L;
    }
}
