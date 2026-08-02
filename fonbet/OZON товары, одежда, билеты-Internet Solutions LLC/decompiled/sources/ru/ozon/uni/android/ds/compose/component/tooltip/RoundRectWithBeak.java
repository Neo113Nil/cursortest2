package ru.ozon.uni.android.ds.compose.component.tooltip;

import Sc.o;
import Z1.d;
import Z1.s;
import k1.C7456b;
import k1.C7462h;
import k1.C7464j;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import l1.AbstractC7839p0;
import l1.C7790H;
import l1.J0;
import l1.s0;
import org.jetbrains.annotations.NotNull;
import ru.ozon.uni.android.ds.compose.component.tooltip.DsTooltipBeakPosition;
import ru.ozon.uni.android.ds.compose.util.DsSpacings;

@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\u00020\u0001B7\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\b\u001a\u00020\u0002\u0012\b\b\u0002\u0010\t\u001a\u00020\u0002¢\u0006\u0004\b\n\u0010\u000bJ'\u0010\u0015\u001a\u00020\u00122\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0016R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0017R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u0018R\u0014\u0010\b\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\u0016R\u0014\u0010\t\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u0016R\u0014\u0010\u001a\u001a\u00020\u00198\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001b¨\u0006\u001c"}, d2 = {"Lru/ozon/uni/android/ds/compose/component/tooltip/RoundRectWithBeak;", "Ll1/J0;", "LZ1/h;", "cornerRadius", "Lru/ozon/uni/android/ds/compose/component/tooltip/DsTooltipBeakPosition;", "beakPosition", "", "beakOffset", "beakWidth", "beakHeight", "<init>", "(FLru/ozon/uni/android/ds/compose/component/tooltip/DsTooltipBeakPosition;IFFLkotlin/jvm/internal/DefaultConstructorMarker;)V", "Lk1/j;", "size", "LZ1/s;", "layoutDirection", "LZ1/d;", "density", "Ll1/p0;", "createOutline-Pq9zytI", "(JLZ1/s;LZ1/d;)Ll1/p0;", "createOutline", "F", "Lru/ozon/uni/android/ds/compose/component/tooltip/DsTooltipBeakPosition;", "I", "Ll1/s0;", "path", "Ll1/s0;", "uni_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class RoundRectWithBeak implements J0 {
    private final float beakHeight;
    private final int beakOffset;

    @NotNull
    private final DsTooltipBeakPosition beakPosition;
    private final float beakWidth;
    private final float cornerRadius;

    @NotNull
    private final s0 path;

    public /* synthetic */ RoundRectWithBeak(float f7, DsTooltipBeakPosition dsTooltipBeakPosition, int i11, float f11, float f12, DefaultConstructorMarker defaultConstructorMarker) {
        this(f7, dsTooltipBeakPosition, i11, f11, f12);
    }

    @Override // l1.J0
    @NotNull
    /* renamed from: createOutline-Pq9zytI */
    public AbstractC7839p0 mo1createOutlinePq9zytI(long size, @NotNull s layoutDirection, @NotNull d density) {
        DsTooltipBeakPosition.Left left;
        float f7;
        Intrinsics.checkNotNullParameter(layoutDirection, "layoutDirection");
        Intrinsics.checkNotNullParameter(density, "density");
        float v12 = density.v1(this.cornerRadius);
        float v13 = density.v1(this.beakWidth);
        float v14 = density.v1(this.beakHeight);
        DsSpacings dsSpacings = DsSpacings.INSTANCE;
        float v15 = density.v1(dsSpacings.m1842getDp12D9Ej5fM());
        float v16 = density.v1(dsSpacings.m1847getDp2D9Ej5fM());
        DsTooltipBeakPosition dsTooltipBeakPosition = this.beakPosition;
        DsTooltipBeakPosition.BottomCenter bottomCenter = DsTooltipBeakPosition.BottomCenter.INSTANCE;
        float d11 = (Intrinsics.d(dsTooltipBeakPosition, bottomCenter) || (dsTooltipBeakPosition instanceof DsTooltipBeakPosition.BottomCustom)) ? C7464j.d(size) - v15 : C7464j.d(size);
        DsTooltipBeakPosition dsTooltipBeakPosition2 = this.beakPosition;
        DsTooltipBeakPosition.Right right = DsTooltipBeakPosition.Right.INSTANCE;
        float f11 = Intrinsics.d(dsTooltipBeakPosition2, right) ? C7464j.f(size) - v15 : C7464j.f(size);
        DsTooltipBeakPosition dsTooltipBeakPosition3 = this.beakPosition;
        DsTooltipBeakPosition.Left left2 = DsTooltipBeakPosition.Left.INSTANCE;
        if (Intrinsics.d(dsTooltipBeakPosition3, left2)) {
            left = left2;
            f7 = v15;
        } else {
            left = left2;
            f7 = 0.0f;
        }
        DsTooltipBeakPosition dsTooltipBeakPosition4 = this.beakPosition;
        DsTooltipBeakPosition.TopCenter topCenter = DsTooltipBeakPosition.TopCenter.INSTANCE;
        float f12 = (Intrinsics.d(dsTooltipBeakPosition4, topCenter) || (dsTooltipBeakPosition4 instanceof DsTooltipBeakPosition.TopCustom)) ? v15 : 0.0f;
        long a11 = C7456b.a(v12, v12);
        DsTooltipBeakPosition.Left left3 = left;
        C7462h c7462h = new C7462h(f7, f12, f11, d11, a11, a11, a11, a11);
        this.path.s(c7462h, s0.a.CounterClockwise);
        DsTooltipBeakPosition dsTooltipBeakPosition5 = this.beakPosition;
        if (Intrinsics.d(dsTooltipBeakPosition5, topCenter)) {
            float f13 = 2;
            float j11 = c7462h.j() / f13;
            float f14 = v13 / f13;
            float f15 = j11 - f14;
            this.path.a(f15, c7462h.g());
            float f16 = f14 + f15;
            this.path.b(f16 - v16, (c7462h.g() - v14) + v16);
            this.path.p(f16, c7462h.g() - v14, f16 + v16, (c7462h.g() - v14) + v16);
            this.path.b(f15 + v13, c7462h.g());
        } else if (dsTooltipBeakPosition5 instanceof DsTooltipBeakPosition.TopCustom) {
            int i11 = this.beakOffset;
            if (i11 != -1) {
                float f17 = v13 / 2;
                float f18 = i11 - f17;
                if (v12 < f18) {
                    v12 = f18;
                }
                this.path.a(v12, c7462h.g());
                float f19 = f17 + v12;
                this.path.b(f19 - v16, (c7462h.g() - v14) + v16);
                this.path.p(f19, c7462h.g() - v14, f19 + v16, (c7462h.g() - v14) + v16);
                this.path.b(v12 + v13, c7462h.g());
            }
        } else if (Intrinsics.d(dsTooltipBeakPosition5, left3)) {
            float f21 = 2;
            float d12 = c7462h.d() / f21;
            float f22 = v13 / f21;
            float f23 = d12 - f22;
            this.path.a(c7462h.e(), f23);
            float f24 = f22 + f23;
            this.path.b((c7462h.e() - v14) + v16, f24 - v16);
            this.path.p(c7462h.e() - v14, f24, (c7462h.e() - v14) + v16, f24 + v16);
            this.path.b(c7462h.e(), f23 + v13);
        } else if (Intrinsics.d(dsTooltipBeakPosition5, right)) {
            float f25 = 2;
            float d13 = c7462h.d() / f25;
            float f26 = v13 / f25;
            float f27 = d13 - f26;
            this.path.a(f11, f27);
            float f28 = v14 + f11;
            float f29 = f28 - v16;
            float f31 = f26 + f27;
            this.path.b(f29, f31 - v16);
            this.path.p(f28, f31, f29, f31 + v16);
            this.path.b(f11, f27 + v13);
        } else if (Intrinsics.d(dsTooltipBeakPosition5, bottomCenter)) {
            float f32 = 2;
            float j12 = c7462h.j() / f32;
            float f33 = v13 / f32;
            float f34 = j12 - f33;
            float d14 = c7462h.d();
            this.path.a(f34, d14);
            float f35 = f33 + f34;
            float f36 = v14 + d14;
            float f37 = f36 - v16;
            this.path.b(f35 - v16, f37);
            this.path.p(f35, f36, f35 + v16, f37);
            this.path.b(f34 + v13, d14);
        } else {
            if (!(dsTooltipBeakPosition5 instanceof DsTooltipBeakPosition.BottomCustom)) {
                throw new o();
            }
            int i12 = this.beakOffset;
            if (i12 != -1) {
                float f38 = v13 / 2;
                float f39 = i12 - f38;
                if (v12 < f39) {
                    v12 = f39;
                }
                float d15 = c7462h.d();
                this.path.a(v12, d15);
                float f41 = f38 + v12;
                float f42 = v14 + d15;
                float f43 = f42 - v16;
                this.path.b(f41 - v16, f43);
                this.path.p(f41, f42, f41 + v16, f43);
                this.path.b(v12 + v13, d15);
            }
        }
        return new AbstractC7839p0.a(this.path);
    }

    private RoundRectWithBeak(float f7, DsTooltipBeakPosition beakPosition, int i11, float f11, float f12) {
        Intrinsics.checkNotNullParameter(beakPosition, "beakPosition");
        this.cornerRadius = f7;
        this.beakPosition = beakPosition;
        this.beakOffset = i11;
        this.beakWidth = f11;
        this.beakHeight = f12;
        this.path = C7790H.a();
    }

    public /* synthetic */ RoundRectWithBeak(float f7, DsTooltipBeakPosition dsTooltipBeakPosition, int i11, float f11, float f12, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this(f7, (i12 & 2) != 0 ? DsTooltipBeakPosition.BottomCenter.INSTANCE : dsTooltipBeakPosition, (i12 & 4) != 0 ? 0 : i11, (i12 & 8) != 0 ? DsSpacings.INSTANCE.m1845getDp16D9Ej5fM() : f11, (i12 & 16) != 0 ? DsSpacings.INSTANCE.m1861getDp8D9Ej5fM() : f12, null);
    }
}
