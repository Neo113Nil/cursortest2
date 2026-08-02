package ru.ozon.uni.components.tagButton;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import l1.AbstractC7799Q;
import org.jetbrains.annotations.NotNull;
import ru.ozon.uni.utils.DeferredBrush;
import ru.ozon.uni.utils.DeferredColor;

@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\n\b\u0007\u0018\u00002\u00020\u0001B1\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nB1\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u000b\u0012\u0006\u0010\u0004\u001a\u00020\u000b\u0012\u0006\u0010\u0005\u001a\u00020\u000b\u0012\u0006\u0010\u0006\u001a\u00020\u000b\u0012\u0006\u0010\b\u001a\u00020\f¢\u0006\u0004\b\t\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001H\u0096\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0013\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u0013\u0010\u0014R\u001a\u0010\u0003\u001a\u00020\u00028\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u001a\u0010\u0004\u001a\u00020\u00028\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0015\u001a\u0004\b\u0018\u0010\u0017R\u001a\u0010\u0005\u001a\u00020\u00028\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0015\u001a\u0004\b\u0019\u0010\u0017R\u001a\u0010\u0006\u001a\u00020\u00028\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0015\u001a\u0004\b\u001a\u0010\u0017R\u001a\u0010\b\u001a\u00020\u00078\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\b\u0010\u0015\u001a\u0004\b\u001b\u0010\u0017¨\u0006\u001c"}, d2 = {"Lru/ozon/uni/components/tagButton/UniTagButtonColors;", "", "Lru/ozon/uni/utils/DeferredColor;", "textColor", "iconColor", "closeIconColor", "loaderColor", "Lru/ozon/uni/utils/DeferredBrush;", "backgroundColor", "<init>", "(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "Ll1/Z;", "Ll1/Q;", "(JJJJLl1/Q;Lkotlin/jvm/internal/DefaultConstructorMarker;)V", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "Ljava/lang/Object;", "getTextColor-e_QkOiY$uni_release", "()Ljava/lang/Object;", "getIconColor-e_QkOiY$uni_release", "getCloseIconColor-e_QkOiY$uni_release", "getLoaderColor-e_QkOiY$uni_release", "getBackgroundColor-QAoP-dQ$uni_release", "uni_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class UniTagButtonColors {

    @NotNull
    private final Object backgroundColor;

    @NotNull
    private final Object closeIconColor;

    @NotNull
    private final Object iconColor;

    @NotNull
    private final Object loaderColor;

    @NotNull
    private final Object textColor;

    public /* synthetic */ UniTagButtonColors(long j11, long j12, long j13, long j14, AbstractC7799Q abstractC7799Q, DefaultConstructorMarker defaultConstructorMarker) {
        this(j11, j12, j13, j14, abstractC7799Q);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!UniTagButtonColors.class.equals(other != null ? other.getClass() : null)) {
            return false;
        }
        Intrinsics.g(other, "null cannot be cast to non-null type ru.ozon.uni.components.tagButton.UniTagButtonColors");
        UniTagButtonColors uniTagButtonColors = (UniTagButtonColors) other;
        return DeferredColor.m3264equalsimpl0(this.textColor, uniTagButtonColors.textColor) && DeferredColor.m3264equalsimpl0(this.iconColor, uniTagButtonColors.iconColor) && DeferredColor.m3264equalsimpl0(this.closeIconColor, uniTagButtonColors.closeIconColor) && DeferredColor.m3264equalsimpl0(this.loaderColor, uniTagButtonColors.loaderColor) && DeferredBrush.m3258equalsimpl0(this.backgroundColor, uniTagButtonColors.backgroundColor);
    }

    @NotNull
    /* renamed from: getBackgroundColor-QAoP-dQ$uni_release, reason: not valid java name and from getter */
    public final Object getBackgroundColor() {
        return this.backgroundColor;
    }

    @NotNull
    /* renamed from: getCloseIconColor-e_QkOiY$uni_release, reason: not valid java name and from getter */
    public final Object getCloseIconColor() {
        return this.closeIconColor;
    }

    @NotNull
    /* renamed from: getIconColor-e_QkOiY$uni_release, reason: not valid java name and from getter */
    public final Object getIconColor() {
        return this.iconColor;
    }

    @NotNull
    /* renamed from: getLoaderColor-e_QkOiY$uni_release, reason: not valid java name and from getter */
    public final Object getLoaderColor() {
        return this.loaderColor;
    }

    @NotNull
    /* renamed from: getTextColor-e_QkOiY$uni_release, reason: not valid java name and from getter */
    public final Object getTextColor() {
        return this.textColor;
    }

    public int hashCode() {
        return DeferredBrush.m3259hashCodeimpl(this.backgroundColor) + ((DeferredColor.m3265hashCodeimpl(this.loaderColor) + ((DeferredColor.m3265hashCodeimpl(this.closeIconColor) + ((DeferredColor.m3265hashCodeimpl(this.iconColor) + (DeferredColor.m3265hashCodeimpl(this.textColor) * 31)) * 31)) * 31)) * 31);
    }

    public /* synthetic */ UniTagButtonColors(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, DefaultConstructorMarker defaultConstructorMarker) {
        this(obj, obj2, obj3, obj4, obj5);
    }

    private UniTagButtonColors(Object textColor, Object iconColor, Object closeIconColor, Object loaderColor, Object backgroundColor) {
        Intrinsics.checkNotNullParameter(textColor, "textColor");
        Intrinsics.checkNotNullParameter(iconColor, "iconColor");
        Intrinsics.checkNotNullParameter(closeIconColor, "closeIconColor");
        Intrinsics.checkNotNullParameter(loaderColor, "loaderColor");
        Intrinsics.checkNotNullParameter(backgroundColor, "backgroundColor");
        this.textColor = textColor;
        this.iconColor = iconColor;
        this.closeIconColor = closeIconColor;
        this.loaderColor = loaderColor;
        this.backgroundColor = backgroundColor;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    private UniTagButtonColors(long j11, long j12, long j13, long j14, AbstractC7799Q backgroundColor) {
        this(DeferredColor.m3260constructorimpl(j11), DeferredColor.m3260constructorimpl(j12), DeferredColor.m3260constructorimpl(j13), DeferredColor.m3260constructorimpl(j14), DeferredBrush.m3255constructorimpl(backgroundColor), (DefaultConstructorMarker) null);
        Intrinsics.checkNotNullParameter(backgroundColor, "backgroundColor");
    }
}
