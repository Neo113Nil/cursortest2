package ru.ozon.uni.ozi.components.island.presets;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import l1.C7807Z;
import org.jetbrains.annotations.NotNull;
import q1.AbstractC8972b;
import ru.ozon.uni.ozi.theme.OziColorsKeyTokens;
import ru.ozon.uni.ozi.utils.internal.presets.DeferredColor;

@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0001\u0015B-\b\u0004\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nR\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0010X\u0090\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u000b\u001a\u0004\b\f\u0010\rR\u001a\u0010\u0005\u001a\u00020\u00048\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0006\u001a\u00020\u00048\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u000e\u001a\u0004\b\u0011\u0010\u0010R\u001a\u0010\b\u001a\u00020\u00078\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\b\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014\u0082\u0001\u0001\u0016¨\u0006\u0017"}, d2 = {"Lru/ozon/uni/ozi/components/island/presets/OziIslandStyle;", "", "Lq1/b;", "backgroundPainter", "Lru/ozon/uni/ozi/utils/internal/presets/DeferredColor;", "backgroundDefColor", "borderDefColor", "LZ1/h;", "borderWidth", "<init>", "(Lq1/b;Ljava/lang/Object;Ljava/lang/Object;F)V", "Lq1/b;", "getBackgroundPainter$uni_release", "()Lq1/b;", "Ljava/lang/Object;", "getBackgroundDefColor-uaV1wGU$uni_release", "()Ljava/lang/Object;", "getBorderDefColor-uaV1wGU$uni_release", "F", "getBorderWidth-D9Ej5fM$uni_release", "()F", "Primary", "Lru/ozon/uni/ozi/components/island/presets/OziIslandStyle$Primary;", "uni_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public abstract class OziIslandStyle {

    @NotNull
    private final Object backgroundDefColor;
    private final AbstractC8972b backgroundPainter;

    @NotNull
    private final Object borderDefColor;
    private final float borderWidth;

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, d2 = {"Lru/ozon/uni/ozi/components/island/presets/OziIslandStyle$Primary;", "Lru/ozon/uni/ozi/components/island/presets/OziIslandStyle;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "uni_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class Primary extends OziIslandStyle {

        @NotNull
        public static final Primary INSTANCE = new Primary();

        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        private Primary() {
            super(null, r3, DeferredColor.m3249constructorimpl(r0), 0, 1, null);
            long j11;
            Object m3251constructorimpl = DeferredColor.m3251constructorimpl(OziColorsKeyTokens.LayerFloor1);
            int i11 = C7807Z.f72260n;
            j11 = C7807Z.f72259m;
        }

        public boolean equals(Object other) {
            return this == other || (other instanceof Primary);
        }

        public int hashCode() {
            return -1977514476;
        }

        @NotNull
        public String toString() {
            return "Primary";
        }
    }

    public /* synthetic */ OziIslandStyle(AbstractC8972b abstractC8972b, Object obj, Object obj2, float f7, DefaultConstructorMarker defaultConstructorMarker) {
        this(abstractC8972b, obj, obj2, f7);
    }

    @NotNull
    /* renamed from: getBackgroundDefColor-uaV1wGU$uni_release, reason: not valid java name and from getter */
    public final Object getBackgroundDefColor() {
        return this.backgroundDefColor;
    }

    /* renamed from: getBackgroundPainter$uni_release, reason: from getter */
    public AbstractC8972b getBackgroundPainter() {
        return this.backgroundPainter;
    }

    @NotNull
    /* renamed from: getBorderDefColor-uaV1wGU$uni_release, reason: not valid java name and from getter */
    public final Object getBorderDefColor() {
        return this.borderDefColor;
    }

    /* renamed from: getBorderWidth-D9Ej5fM$uni_release, reason: not valid java name and from getter */
    public final float getBorderWidth() {
        return this.borderWidth;
    }

    private OziIslandStyle(AbstractC8972b abstractC8972b, Object backgroundDefColor, Object borderDefColor, float f7) {
        Intrinsics.checkNotNullParameter(backgroundDefColor, "backgroundDefColor");
        Intrinsics.checkNotNullParameter(borderDefColor, "borderDefColor");
        this.backgroundPainter = abstractC8972b;
        this.backgroundDefColor = backgroundDefColor;
        this.borderDefColor = borderDefColor;
        this.borderWidth = f7;
    }

    public /* synthetic */ OziIslandStyle(AbstractC8972b abstractC8972b, Object obj, Object obj2, float f7, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? null : abstractC8972b, obj, obj2, f7, null);
    }
}
