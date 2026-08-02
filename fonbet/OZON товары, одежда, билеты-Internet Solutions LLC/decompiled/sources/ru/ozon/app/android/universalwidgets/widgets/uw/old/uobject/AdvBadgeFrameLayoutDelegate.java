package ru.ozon.app.android.universalwidgets.widgets.uw.old.uobject;

import android.content.Context;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import gk0.q;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.N;
import org.jetbrains.annotations.NotNull;
import ru.ozon.uni.android.atom.badge.BadgeView;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.data.dsBadge.BadgeDTO;
import ru.ozon.uni.atoms.v3.holders.dsBadge.BadgeHolderKt;

@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001:\u0001\u0014B#\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ(\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\u0014\u0010\u0010\u001a\u0010\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\r\u0018\u00010\u0011H\u0016J\b\u0010\u0013\u001a\u00020\rH\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\n\u001a\u0004\u0018\u00010\u000bX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0015"}, d2 = {"Lru/ozon/app/android/universalwidgets/widgets/uw/old/uobject/AdvBadgeFrameLayoutDelegate;", "Lru/ozon/app/android/universalwidgets/widgets/uw/old/uobject/AdvBadgeDelegate;", "container", "Landroid/widget/FrameLayout;", "badgeMargin", "", "containerPaddings", "Lru/ozon/app/android/universalwidgets/widgets/uw/old/uobject/AdvBadgeFrameLayoutDelegate$ContainerPaddings;", "<init>", "(Landroid/widget/FrameLayout;ILru/ozon/app/android/universalwidgets/widgets/uw/old/uobject/AdvBadgeFrameLayoutDelegate$ContainerPaddings;)V", "badgeView", "Lru/ozon/uni/android/atom/badge/BadgeView;", "setAdvBadgeOrGone", "", "badge", "Lru/ozon/uni/atoms/data/dsBadge/BadgeDTO;", "onAction", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "initBadgeView", "ContainerPaddings", "universalwidgets_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class AdvBadgeFrameLayoutDelegate implements AdvBadgeDelegate {
    private final int badgeMargin;
    private BadgeView badgeView;

    @NotNull
    private final FrameLayout container;

    @NotNull
    private final ContainerPaddings containerPaddings;

    public AdvBadgeFrameLayoutDelegate(@NotNull FrameLayout container, int i11, @NotNull ContainerPaddings containerPaddings) {
        Intrinsics.checkNotNullParameter(container, "container");
        Intrinsics.checkNotNullParameter(containerPaddings, "containerPaddings");
        this.container = container;
        this.badgeMargin = i11;
        this.containerPaddings = containerPaddings;
    }

    private final void initBadgeView() {
        BadgeView badgeView = (BadgeView) q.f64554a.i(N.b(BadgeView.class), this.container.getContext());
        if (badgeView == null) {
            Context context = this.container.getContext();
            Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
            badgeView = new BadgeView(context, null, 0, 0, 14, null);
        }
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
        layoutParams.gravity = 8388661;
        layoutParams.setMargins(this.containerPaddings.getStart() + this.badgeMargin, this.containerPaddings.getTop() + this.badgeMargin, this.containerPaddings.getEnd() + this.badgeMargin, ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin);
        badgeView.setLayoutParams(layoutParams);
        this.container.addView(badgeView);
        this.badgeView = badgeView;
    }

    @Override // ru.ozon.app.android.universalwidgets.widgets.uw.old.uobject.AdvBadgeDelegate
    public void setAdvBadgeOrGone(BadgeDTO badge, Function1<? super AtomAction, Unit> onAction) {
        BadgeView badgeView = this.badgeView;
        if (badgeView == null && badge == null) {
            return;
        }
        if (badgeView == null) {
            initBadgeView();
        }
        BadgeView badgeView2 = this.badgeView;
        if (badgeView2 != null) {
            BadgeHolderKt.bindOrGone(badgeView2, badge, onAction);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\r\u0018\u00002\u00020\u0001B/\u0012\b\b\u0003\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0003\u0010\u0004\u001a\u00020\u0002\u0012\b\b\u0003\u0010\u0005\u001a\u00020\u0002\u0012\b\b\u0003\u0010\u0006\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\bR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\t\u001a\u0004\b\n\u0010\u000bR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\t\u001a\u0004\b\f\u0010\u000bR\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u0010\t\u001a\u0004\b\r\u0010\u000bR\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010\t\u001a\u0004\b\u000e\u0010\u000b¨\u0006\u000f"}, d2 = {"Lru/ozon/app/android/universalwidgets/widgets/uw/old/uobject/AdvBadgeFrameLayoutDelegate$ContainerPaddings;", "", "", "top", "end", "start", "bottom", "<init>", "(IIII)V", "I", "getTop", "()I", "getEnd", "getStart", "getBottom", "universalwidgets_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class ContainerPaddings {
        private final int bottom;
        private final int end;
        private final int start;
        private final int top;

        public ContainerPaddings(int i11, int i12, int i13, int i14) {
            this.top = i11;
            this.end = i12;
            this.start = i13;
            this.bottom = i14;
        }

        public final int getEnd() {
            return this.end;
        }

        public final int getStart() {
            return this.start;
        }

        public final int getTop() {
            return this.top;
        }

        public /* synthetic */ ContainerPaddings(int i11, int i12, int i13, int i14, int i15, DefaultConstructorMarker defaultConstructorMarker) {
            this((i15 & 1) != 0 ? 0 : i11, (i15 & 2) != 0 ? 0 : i12, (i15 & 4) != 0 ? 0 : i13, (i15 & 8) != 0 ? 0 : i14);
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public /* synthetic */ AdvBadgeFrameLayoutDelegate(FrameLayout frameLayout, int i11, ContainerPaddings containerPaddings, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this(frameLayout, i11, containerPaddings);
        if ((i12 & 4) != 0) {
            containerPaddings = new ContainerPaddings(0, 0, 0, 0, 15, null);
        }
    }
}
