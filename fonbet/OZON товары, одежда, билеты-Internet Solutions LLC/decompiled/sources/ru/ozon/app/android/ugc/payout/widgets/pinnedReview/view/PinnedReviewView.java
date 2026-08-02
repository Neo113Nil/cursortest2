package ru.ozon.app.android.ugc.payout.widgets.pinnedReview.view;

import V4.C4073b;
import V4.n;
import android.content.Context;
import android.graphics.drawable.GradientDrawable;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.content.a;
import androidx.core.graphics.c;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.pdp.utils.Dimens;
import ru.ozon.app.android.pdp.utils.DrawableExtKt;
import ru.ozon.app.android.ugc.core.widgets.commentsListV3.data.CommentV3DTO;
import ru.ozon.app.android.ugc.payout.R$id;
import ru.ozon.app.android.ugc.payout.widgets.pinnedReview.presentation.PinnedReviewFooter;
import ru.ozon.app.android.ugc.payout.widgets.pinnedReview.presentation.PinnedReviewVO;
import ru.ozon.uni.android.uikit.extensions.ResourceExtKt;
import ru.ozon.uni.android.uikit.extensions.view.ViewExtKt;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.data.common.CornerRadius;
import ru.ozon.uni.core.R$color;

@Metadata(d1 = {"\u0000\u0081\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004*\u0001\u000f\b\u0000\u0018\u0000 12\u00020\u0001:\u00011B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0012\u0010\u001f\u001a\u00020\u001e2\b\u0010 \u001a\u0004\u0018\u00010!H\u0016J\"\u0010\"\u001a\u00020#2\u0006\u0010$\u001a\u00020%2\u0012\u0010&\u001a\u000e\u0012\u0004\u0012\u00020(\u0012\u0004\u0012\u00020#0'J\u0018\u0010)\u001a\u00020#2\u0006\u0010*\u001a\u00020\u001e2\b\b\u0002\u0010+\u001a\u00020\u001eJ\"\u0010,\u001a\u00020#2\u0006\u0010-\u001a\u00020.2\u0012\u0010&\u001a\u000e\u0012\u0004\u0012\u00020(\u0012\u0004\u0012\u00020#0'J\u0010\u0010/\u001a\u00020#2\u0006\u00100\u001a\u00020\nH\u0002R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\fX\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u000e\u001a\u00020\u000fX\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u0010R\u000e\u0010\u0011\u001a\u00020\u0012X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0014X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\u0016X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0017\u001a\u00020\u0018X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0019\u001a\u00020\u001aX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u001b\u001a\u00020\u001cX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u001d\u001a\u00020\u001eX\u0082\u000e¢\u0006\u0002\n\u0000¨\u00062"}, d2 = {"Lru/ozon/app/android/ugc/payout/widgets/pinnedReview/view/PinnedReviewView;", "Landroid/widget/FrameLayout;", "context", "Landroid/content/Context;", "<init>", "(Landroid/content/Context;)V", "fadeColor", "", "backgroundColor", "backgroundCornerRadius", "", "backgroundDrawable", "Landroid/graphics/drawable/GradientDrawable;", "gradientDrawable", "expandTransition", "ru/ozon/app/android/ugc/payout/widgets/pinnedReview/view/PinnedReviewView$expandTransition$1", "Lru/ozon/app/android/ugc/payout/widgets/pinnedReview/view/PinnedReviewView$expandTransition$1;", "containerSv", "Landroid/widget/ScrollView;", "containerLl", "Landroid/widget/LinearLayout;", "headerView", "Lru/ozon/app/android/ugc/payout/widgets/pinnedReview/view/PinnedReviewHeader;", "bodyView", "Lru/ozon/app/android/ugc/payout/widgets/pinnedReview/view/PinnedReviewBodyView;", "footerView", "Lru/ozon/app/android/ugc/payout/widgets/pinnedReview/view/PinnedReviewFooterView;", "bottomGradient", "Landroid/view/View;", "isCollapsed", "", "onInterceptTouchEvent", "ev", "Landroid/view/MotionEvent;", "bind", "", "item", "Lru/ozon/app/android/ugc/payout/widgets/pinnedReview/presentation/PinnedReviewVO;", "actionHandler", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "updateExpand", "collapsed", "withAnimation", "updateFooter", CommentV3DTO.FOOTER_FIELD_NAME, "Lru/ozon/app/android/ugc/payout/widgets/pinnedReview/presentation/PinnedReviewFooter;", "setBackground", "cornerRadius", "Companion", "payout_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class PinnedReviewView extends FrameLayout {

    @NotNull
    private static final Companion Companion = new Companion(null);
    private static final int bottomGradientHeight = ResourceExtKt.toPx(50);
    private static final int collapsedHeight = ResourceExtKt.toPx(124);
    private final int backgroundColor;
    private float backgroundCornerRadius;

    @NotNull
    private final GradientDrawable backgroundDrawable;

    @NotNull
    private final PinnedReviewBodyView bodyView;

    @NotNull
    private final View bottomGradient;

    @NotNull
    private final LinearLayout containerLl;

    @NotNull
    private final ScrollView containerSv;

    @NotNull
    private final PinnedReviewView$expandTransition$1 expandTransition;
    private final int fadeColor;

    @NotNull
    private final PinnedReviewFooterView footerView;

    @NotNull
    private final GradientDrawable gradientDrawable;

    @NotNull
    private final PinnedReviewHeader headerView;
    private boolean isCollapsed;

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0006X\u0086T¢\u0006\u0006\n\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lru/ozon/app/android/ugc/payout/widgets/pinnedReview/view/PinnedReviewView$Companion;", "", "<init>", "()V", "", "CONTENT_PADDING", "F", "", "EXPAND_DURATION", "J", "payout_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    private static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Type inference failed for: r0v4, types: [ru.ozon.app.android.ugc.payout.widgets.pinnedReview.view.PinnedReviewView$expandTransition$1] */
    public PinnedReviewView(@NotNull Context context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        int color = a.getColor(context, R$color.bg_primary);
        this.fadeColor = color;
        int color2 = a.getColor(context, R$color.bg_primary);
        this.backgroundColor = color2;
        this.backgroundCornerRadius = ResourceExtKt.toPxF(CornerRadius.RADIUS_500.getPx());
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setShape(0);
        gradientDrawable.setColor(color2);
        float f7 = this.backgroundCornerRadius;
        gradientDrawable.setCornerRadii(DrawableExtKt.createCornerRadii(f7, f7, f7, f7));
        this.backgroundDrawable = gradientDrawable;
        GradientDrawable gradientDrawable2 = new GradientDrawable(GradientDrawable.Orientation.TOP_BOTTOM, new int[]{c.f(color, 0), color});
        gradientDrawable2.setShape(0);
        gradientDrawable2.setGradientType(0);
        this.gradientDrawable = gradientDrawable2;
        this.expandTransition = new C4073b() { // from class: ru.ozon.app.android.ugc.payout.widgets.pinnedReview.view.PinnedReviewView$expandTransition$1
            {
                setDuration(200L);
            }
        };
        ScrollView scrollView = new ScrollView(context);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -2);
        layoutParams.gravity = 17;
        scrollView.setLayoutParams(layoutParams);
        scrollView.setVerticalScrollBarEnabled(false);
        this.containerSv = scrollView;
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setLayoutParams(new FrameLayout.LayoutParams(-1, -2));
        linearLayout.setOrientation(1);
        this.containerLl = linearLayout;
        PinnedReviewHeader pinnedReviewHeader = new PinnedReviewHeader(context);
        pinnedReviewHeader.setId(R$id.reviewHeaderView);
        pinnedReviewHeader.setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
        this.headerView = pinnedReviewHeader;
        PinnedReviewBodyView pinnedReviewBodyView = new PinnedReviewBodyView(context);
        pinnedReviewBodyView.setId(R$id.reviewBodyView);
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-1, -2);
        Dimens dimens = Dimens.INSTANCE;
        layoutParams2.setMargins(0, dimens.getDP_8(), 0, 0);
        pinnedReviewBodyView.setLayoutParams(layoutParams2);
        this.bodyView = pinnedReviewBodyView;
        PinnedReviewFooterView pinnedReviewFooterView = new PinnedReviewFooterView(context);
        pinnedReviewFooterView.setId(R$id.reviewFooterView);
        pinnedReviewFooterView.setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
        this.footerView = pinnedReviewFooterView;
        View view = new View(context);
        view.setId(R$id.pinnedReviewBottomGradient);
        FrameLayout.LayoutParams layoutParams3 = new FrameLayout.LayoutParams(-1, bottomGradientHeight);
        layoutParams3.gravity = 80;
        view.setLayoutParams(layoutParams3);
        view.setBackground(gradientDrawable2);
        this.bottomGradient = view;
        this.isCollapsed = true;
        setId(R$id.reviewContainer);
        setBackground(gradientDrawable);
        ConstraintLayout.b bVar = new ConstraintLayout.b(-1, collapsedHeight);
        bVar.setMargins(dimens.getDP_16(), 0, dimens.getDP_16(), 0);
        setLayoutParams(bVar);
        ViewExtKt.setPaddingsDp(this, 12.0f);
        addView(scrollView);
        addView(view);
        scrollView.addView(linearLayout);
        linearLayout.addView(pinnedReviewHeader);
        linearLayout.addView(pinnedReviewBodyView);
        linearLayout.addView(pinnedReviewFooterView);
    }

    private final void setBackground(float cornerRadius) {
        if (this.backgroundCornerRadius == cornerRadius) {
            return;
        }
        this.backgroundDrawable.setCornerRadii(DrawableExtKt.createCornerRadii(cornerRadius, cornerRadius, cornerRadius, cornerRadius));
        this.backgroundCornerRadius = cornerRadius;
        setBackground(this.backgroundDrawable);
    }

    public static /* synthetic */ void updateExpand$default(PinnedReviewView pinnedReviewView, boolean z11, boolean z12, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            z12 = false;
        }
        pinnedReviewView.updateExpand(z11, z12);
    }

    public final void bind(@NotNull PinnedReviewVO item, @NotNull Function1<? super AtomAction, Unit> actionHandler) {
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(actionHandler, "actionHandler");
        setBackground(ResourceExtKt.toPxF(item.getCornerRadius().getPx()));
        boolean isCollapsed = item.getIsCollapsed();
        this.isCollapsed = isCollapsed;
        if ((!isCollapsed && getHeight() != -2) || (this.isCollapsed && getHeight() != collapsedHeight)) {
            updateExpand$default(this, this.isCollapsed, false, 2, null);
        }
        this.headerView.bind(item.getHeader(), actionHandler);
        this.bodyView.bindOrGone(item.getBody(), actionHandler);
        this.footerView.bind(item.getFooter(), actionHandler);
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent ev) {
        if (this.isCollapsed) {
            return true;
        }
        return super.onInterceptTouchEvent(ev);
    }

    public final void updateExpand(boolean collapsed, boolean withAnimation) {
        this.isCollapsed = collapsed;
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        if (layoutParams == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
        }
        layoutParams.height = collapsed ? collapsedHeight : -2;
        setLayoutParams(layoutParams);
        if (withAnimation) {
            n.a(this, this.expandTransition);
        }
        ViewExtKt.showOrGone(this.bottomGradient, Boolean.valueOf(collapsed));
    }

    public final void updateFooter(@NotNull PinnedReviewFooter footer, @NotNull Function1<? super AtomAction, Unit> actionHandler) {
        Intrinsics.checkNotNullParameter(footer, "footer");
        Intrinsics.checkNotNullParameter(actionHandler, "actionHandler");
        this.footerView.bind(footer, actionHandler);
    }
}
