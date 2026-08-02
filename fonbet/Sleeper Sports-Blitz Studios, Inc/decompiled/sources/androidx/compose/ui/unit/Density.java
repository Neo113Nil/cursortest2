package androidx.compose.ui.unit;

import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.geometry.Size;
import kotlin.Metadata;

/* compiled from: Density.kt */
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bg\u0018\u00002\u00020\u0001J\u0013\u0010\b\u001a\u00020\u0003*\u00020\tH\u0017¢\u0006\u0004\b\n\u0010\u000bJ\u0013\u0010\f\u001a\u00020\r*\u00020\tH\u0017¢\u0006\u0004\b\u000e\u0010\u000fJ\u0013\u0010\b\u001a\u00020\u0003*\u00020\u0010H\u0017¢\u0006\u0004\b\u0011\u0010\u0012J\u0013\u0010\f\u001a\u00020\r*\u00020\u0010H\u0017¢\u0006\u0004\b\u0013\u0010\u0014J\u0013\u0010\u0015\u001a\u00020\t*\u00020\rH\u0017¢\u0006\u0004\b\u0016\u0010\u0017J\u0013\u0010\u0018\u001a\u00020\u0010*\u00020\rH\u0017¢\u0006\u0004\b\u0019\u0010\u001aJ\u0013\u0010\u0015\u001a\u00020\t*\u00020\u0003H\u0017¢\u0006\u0004\b\u0016\u0010\u000bJ\u0013\u0010\u0018\u001a\u00020\u0010*\u00020\u0003H\u0017¢\u0006\u0004\b\u0019\u0010\u001bJ\f\u0010\u001c\u001a\u00020\u001d*\u00020\u001eH\u0017J\u0013\u0010\u001f\u001a\u00020 *\u00020!H\u0017¢\u0006\u0004\b\"\u0010#J\u0013\u0010$\u001a\u00020!*\u00020 H\u0017¢\u0006\u0004\b%\u0010#R\u001a\u0010\u0002\u001a\u00020\u00038&X§\u0004¢\u0006\f\u0012\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006&À\u0006\u0003"}, d2 = {"Landroidx/compose/ui/unit/Density;", "Landroidx/compose/ui/unit/FontScaling;", "density", "", "getDensity$annotations", "()V", "getDensity", "()F", "toPx", "Landroidx/compose/ui/unit/Dp;", "toPx-0680j_4", "(F)F", "roundToPx", "", "roundToPx-0680j_4", "(F)I", "Landroidx/compose/ui/unit/TextUnit;", "toPx--R2X_6o", "(J)F", "roundToPx--R2X_6o", "(J)I", "toDp", "toDp-u2uoSUM", "(I)F", "toSp", "toSp-kPz2Gy4", "(I)J", "(F)J", "toRect", "Landroidx/compose/ui/geometry/Rect;", "Landroidx/compose/ui/unit/DpRect;", "toSize", "Landroidx/compose/ui/geometry/Size;", "Landroidx/compose/ui/unit/DpSize;", "toSize-XkaWNTQ", "(J)J", "toDpSize", "toDpSize-k-rfVVM", "ui-unit"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public interface Density extends FontScaling {
    float getDensity();

    /* compiled from: Density.kt */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final class DefaultImpls {
        public static /* synthetic */ void getDensity$annotations() {
        }

        @Deprecated
        /* renamed from: toDp-GaN1DYA, reason: not valid java name */
        public static float m8786toDpGaN1DYA(Density density, long j) {
            return Density.super.mo739toDpGaN1DYA(j);
        }

        @Deprecated
        /* renamed from: toSp-0xMU5do, reason: not valid java name */
        public static long m8793toSp0xMU5do(Density density, float f) {
            return Density.super.mo746toSp0xMU5do(f);
        }

        @Deprecated
        /* renamed from: toPx-0680j_4, reason: not valid java name */
        public static float m8791toPx0680j_4(Density density, float f) {
            return Density.super.mo744toPx0680j_4(f);
        }

        @Deprecated
        /* renamed from: roundToPx-0680j_4, reason: not valid java name */
        public static int m8785roundToPx0680j_4(Density density, float f) {
            return Density.super.mo738roundToPx0680j_4(f);
        }

        @Deprecated
        /* renamed from: toPx--R2X_6o, reason: not valid java name */
        public static float m8790toPxR2X_6o(Density density, long j) {
            return Density.super.mo743toPxR2X_6o(j);
        }

        @Deprecated
        /* renamed from: roundToPx--R2X_6o, reason: not valid java name */
        public static int m8784roundToPxR2X_6o(Density density, long j) {
            return Density.super.mo737roundToPxR2X_6o(j);
        }

        @Deprecated
        /* renamed from: toDp-u2uoSUM, reason: not valid java name */
        public static float m8788toDpu2uoSUM(Density density, int i) {
            return Density.super.mo741toDpu2uoSUM(i);
        }

        @Deprecated
        /* renamed from: toSp-kPz2Gy4, reason: not valid java name */
        public static long m8795toSpkPz2Gy4(Density density, int i) {
            return Density.super.mo748toSpkPz2Gy4(i);
        }

        @Deprecated
        /* renamed from: toDp-u2uoSUM, reason: not valid java name */
        public static float m8787toDpu2uoSUM(Density density, float f) {
            return Density.super.mo740toDpu2uoSUM(f);
        }

        @Deprecated
        /* renamed from: toSp-kPz2Gy4, reason: not valid java name */
        public static long m8794toSpkPz2Gy4(Density density, float f) {
            return Density.super.mo747toSpkPz2Gy4(f);
        }

        @Deprecated
        public static Rect toRect(Density density, DpRect dpRect) {
            return Density.super.toRect(dpRect);
        }

        @Deprecated
        /* renamed from: toSize-XkaWNTQ, reason: not valid java name */
        public static long m8792toSizeXkaWNTQ(Density density, long j) {
            return Density.super.mo745toSizeXkaWNTQ(j);
        }

        @Deprecated
        /* renamed from: toDpSize-k-rfVVM, reason: not valid java name */
        public static long m8789toDpSizekrfVVM(Density density, long j) {
            return Density.super.mo742toDpSizekrfVVM(j);
        }
    }

    /* renamed from: toPx-0680j_4 */
    default float mo744toPx0680j_4(float f) {
        return f * getDensity();
    }

    /* renamed from: roundToPx-0680j_4 */
    default int mo738roundToPx0680j_4(float f) {
        float mo744toPx0680j_4 = mo744toPx0680j_4(f);
        if (Float.isInfinite(mo744toPx0680j_4)) {
            return Integer.MAX_VALUE;
        }
        return Math.round(mo744toPx0680j_4);
    }

    /* renamed from: toPx--R2X_6o */
    default float mo743toPxR2X_6o(long j) {
        if (!TextUnitType.m9020equalsimpl0(TextUnit.m8991getTypeUIouoOA(j), TextUnitType.INSTANCE.m9025getSpUIouoOA())) {
            InlineClassHelperKt.throwIllegalStateException("Only Sp can convert to Px");
        }
        return mo744toPx0680j_4(mo739toDpGaN1DYA(j));
    }

    /* renamed from: roundToPx--R2X_6o */
    default int mo737roundToPxR2X_6o(long j) {
        return Math.round(mo743toPxR2X_6o(j));
    }

    /* renamed from: toDp-u2uoSUM */
    default float mo741toDpu2uoSUM(int i) {
        return Dp.m8798constructorimpl(i / getDensity());
    }

    /* renamed from: toSp-kPz2Gy4 */
    default long mo748toSpkPz2Gy4(int i) {
        return mo746toSp0xMU5do(mo741toDpu2uoSUM(i));
    }

    /* renamed from: toDp-u2uoSUM */
    default float mo740toDpu2uoSUM(float f) {
        return Dp.m8798constructorimpl(f / getDensity());
    }

    /* renamed from: toSp-kPz2Gy4 */
    default long mo747toSpkPz2Gy4(float f) {
        return mo746toSp0xMU5do(mo740toDpu2uoSUM(f));
    }

    default Rect toRect(DpRect dpRect) {
        return new Rect(mo744toPx0680j_4(dpRect.m8881getLeftD9Ej5fM()), mo744toPx0680j_4(dpRect.m8883getTopD9Ej5fM()), mo744toPx0680j_4(dpRect.m8882getRightD9Ej5fM()), mo744toPx0680j_4(dpRect.m8880getBottomD9Ej5fM()));
    }

    /* renamed from: toSize-XkaWNTQ */
    default long mo745toSizeXkaWNTQ(long j) {
        if (j != androidx.compose.ui.geometry.InlineClassHelperKt.UnspecifiedPackedFloats) {
            float mo744toPx0680j_4 = mo744toPx0680j_4(DpSize.m8896getWidthD9Ej5fM(j));
            float mo744toPx0680j_42 = mo744toPx0680j_4(DpSize.m8894getHeightD9Ej5fM(j));
            return Size.m5831constructorimpl((Float.floatToRawIntBits(mo744toPx0680j_42) & 4294967295L) | (Float.floatToRawIntBits(mo744toPx0680j_4) << 32));
        }
        return Size.INSTANCE.m5848getUnspecifiedNHjbRc();
    }

    /* renamed from: toDpSize-k-rfVVM */
    default long mo742toDpSizekrfVVM(long j) {
        if (j != androidx.compose.ui.geometry.InlineClassHelperKt.UnspecifiedPackedFloats) {
            return DpKt.m8820DpSizeYgX7TsA(mo740toDpu2uoSUM(Float.intBitsToFloat((int) (j >> 32))), mo740toDpu2uoSUM(Float.intBitsToFloat((int) (j & 4294967295L))));
        }
        return DpSize.INSTANCE.m8905getUnspecifiedMYxV2XQ();
    }
}
