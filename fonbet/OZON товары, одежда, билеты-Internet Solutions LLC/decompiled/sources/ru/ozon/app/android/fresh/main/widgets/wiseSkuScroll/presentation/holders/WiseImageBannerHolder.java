package ru.ozon.app.android.fresh.main.widgets.wiseSkuScroll.presentation.holders;

import Sc.InterfaceC4008j;
import Sc.k;
import WZ.l;
import WZ.t;
import android.graphics.Outline;
import android.graphics.drawable.GradientDrawable;
import android.view.View;
import android.view.ViewOutlineProvider;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import l20.d;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.fresh.main.databinding.ItemWiseBannerBinding;
import ru.ozon.app.android.fresh.main.widgets.wiseSkuScroll.presentation.vo.WiseBannerVO;
import ru.ozon.app.android.pikazon.extensions.ImageViewExtKt;
import ru.ozon.uni.android.atom.badge.BadgeView;
import ru.ozon.uni.android.atom.text.TextAtomV2View;
import ru.ozon.uni.android.uikitsdk.ext.UiExtKt;
import ru.ozon.uni.android.uikitsdk.ext.ViewExtKt;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.data.common.CornerRadius;
import ru.ozon.uni.atoms.data.text.TextDTO;
import ru.ozon.uni.atoms.v3.holders.dsBadge.BadgeHolderKt;
import ru.ozon.uni.atoms.v3.holders.text.TextHolderKt;

@Metadata(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0010\u0018\u0000 (2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001(B/\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\n\u0010\u0007\u001a\u00060\u0005j\u0002`\u0006\u0012\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\b¢\u0006\u0004\b\f\u0010\rJ'\u0010\u0012\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\u00022\u000e\u0010\u0011\u001a\n\u0018\u00010\u000fj\u0004\u0018\u0001`\u0010H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0014\u001a\u00020\nH\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u0017\u0010\u0018\u001a\u00020\n2\u0006\u0010\u0017\u001a\u00020\u0016H\u0004¢\u0006\u0004\b\u0018\u0010\u0019J\u0019\u0010\u001a\u001a\u00020\n2\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016H\u0004¢\u0006\u0004\b\u001a\u0010\u0019J\u0019\u0010\u001c\u001a\u00020\n2\b\u0010\u0017\u001a\u0004\u0018\u00010\u001bH\u0004¢\u0006\u0004\b\u001c\u0010\u001dJ\u0019\u0010\u001f\u001a\u00020\n2\b\u0010\u0017\u001a\u0004\u0018\u00010\u001eH\u0004¢\u0006\u0004\b\u001f\u0010 R\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010!R\u001b\u0010'\u001a\u00020\"8DX\u0084\u0084\u0002¢\u0006\f\n\u0004\b#\u0010$\u001a\u0004\b%\u0010&¨\u0006)"}, d2 = {"Lru/ozon/app/android/fresh/main/widgets/wiseSkuScroll/presentation/holders/WiseImageBannerHolder;", "Lru/ozon/app/android/fresh/main/widgets/wiseSkuScroll/presentation/holders/BindableViewHolder;", "Lru/ozon/app/android/fresh/main/widgets/wiseSkuScroll/presentation/vo/WiseBannerVO;", "Lru/ozon/app/android/fresh/main/databinding/ItemWiseBannerBinding;", "binding", "LWZ/l;", "Lru/ozon/app/android/analytics/modules/tokenized/TokenizedAnalytics;", "tokenizedAnalytics", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "", "actionHandler", "<init>", "(Lru/ozon/app/android/fresh/main/databinding/ItemWiseBannerBinding;LWZ/l;Lkotlin/jvm/functions/Function1;)V", "item", "Ll20/d;", "Lru/ozon/app/android/composer/view/WidgetInfo;", "widgetInfo", "bind", "(Lru/ozon/app/android/fresh/main/widgets/wiseSkuScroll/presentation/vo/WiseBannerVO;Ll20/d;)V", "onViewInVisibleBounds", "()V", "", "state", "bindBackgroundImage", "(Ljava/lang/String;)V", "bindLabel", "Lru/ozon/app/android/fresh/main/widgets/wiseSkuScroll/presentation/vo/WiseBannerVO$BadgeVO;", "bindBadge", "(Lru/ozon/app/android/fresh/main/widgets/wiseSkuScroll/presentation/vo/WiseBannerVO$BadgeVO;)V", "Lru/ozon/uni/atoms/data/text/TextDTO;", "bindTitle", "(Lru/ozon/uni/atoms/data/text/TextDTO;)V", "Lru/ozon/app/android/fresh/main/databinding/ItemWiseBannerBinding;", "Landroid/graphics/drawable/GradientDrawable;", "paranjaDrawable$delegate", "LSc/j;", "getParanjaDrawable", "()Landroid/graphics/drawable/GradientDrawable;", "paranjaDrawable", "Companion", "widgets-main_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public class WiseImageBannerHolder extends BindableViewHolder<WiseBannerVO> {

    @NotNull
    protected static final Companion Companion = new Companion(null);
    private static final float cornerRadius = UiExtKt.toPxF(CornerRadius.RADIUS_400.getPx());

    @NotNull
    private static final ViewOutlineProvider roundedOutline = new ViewOutlineProvider() { // from class: ru.ozon.app.android.fresh.main.widgets.wiseSkuScroll.presentation.holders.WiseImageBannerHolder$Companion$roundedOutline$1
        @Override // android.view.ViewOutlineProvider
        public void getOutline(View view, Outline outline) {
            Intrinsics.checkNotNullParameter(view, "view");
            Intrinsics.checkNotNullParameter(outline, "outline");
            outline.setRoundRect(view.getPaddingLeft(), view.getPaddingTop(), view.getWidth() - view.getPaddingRight(), view.getHeight() - view.getPaddingBottom(), WiseImageBannerHolder.Companion.getCornerRadius());
        }
    };

    @NotNull
    private final ItemWiseBannerBinding binding;

    /* renamed from: paranjaDrawable$delegate, reason: from kotlin metadata */
    @NotNull
    private final InterfaceC4008j paranjaDrawable;

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0084\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\bR\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\n\u0010\u000bR\u0014\u0010\f\u001a\u00020\t8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\f\u0010\u000bR\u0014\u0010\r\u001a\u00020\t8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\r\u0010\u000bR\u0014\u0010\u000e\u001a\u00020\t8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000e\u0010\u000b¨\u0006\u000f"}, d2 = {"Lru/ozon/app/android/fresh/main/widgets/wiseSkuScroll/presentation/holders/WiseImageBannerHolder$Companion;", "", "<init>", "()V", "", "cornerRadius", "F", "getCornerRadius", "()F", "", "BANNER_IMAGE_VIEW", "Ljava/lang/String;", "BANNER_IMAGE_TITLE", "BANNER_IMAGE_LABEL", "BANNER_IMAGE_ADS_BADGE", "widgets-main_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    protected static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final float getCornerRadius() {
            return WiseImageBannerHolder.cornerRadius;
        }

        private Companion() {
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public WiseImageBannerHolder(@NotNull ItemWiseBannerBinding binding, @NotNull l tokenizedAnalytics, @NotNull Function1<? super AtomAction, Unit> actionHandler) {
        super(r0, tokenizedAnalytics, actionHandler);
        Intrinsics.checkNotNullParameter(binding, "binding");
        Intrinsics.checkNotNullParameter(tokenizedAnalytics, "tokenizedAnalytics");
        Intrinsics.checkNotNullParameter(actionHandler, "actionHandler");
        RelativeLayout constraintLayout = binding.getConstraintLayout();
        Intrinsics.checkNotNullExpressionValue(constraintLayout, "getRoot(...)");
        this.binding = binding;
        this.paranjaDrawable = k.b(new WiseImageBannerHolder$paranjaDrawable$2(this));
        binding.backgroundImageView.setContentDescription("type_image");
        binding.titleTextView.setLocatorTag("wiseSkuScrollBannerTitle");
        binding.labelImageView.setContentDescription("wiseSkuScrollBannerLabel");
        binding.badgeView.setLocatorTag("wiseSkuScrollBannerAdsBadge");
        RelativeLayout constraintLayout2 = binding.getConstraintLayout();
        constraintLayout2.setOutlineProvider(roundedOutline);
        constraintLayout2.setClipToOutline(true);
    }

    protected final void bindBackgroundImage(@NotNull String state) {
        Intrinsics.checkNotNullParameter(state, "state");
        try {
            ImageView backgroundImageView = this.binding.backgroundImageView;
            Intrinsics.checkNotNullExpressionValue(backgroundImageView, "backgroundImageView");
            ImageViewExtKt.load$default(backgroundImageView, state, null, null, null, null, false, null, 126, null);
        } catch (Exception e11) {
            Lm0.a.f17149a.e(e11);
        }
        this.binding.paranjaImageView.setImageDrawable(getParanjaDrawable());
    }

    protected final void bindBadge(WiseBannerVO.BadgeVO state) {
        if (state != null) {
            BadgeView badgeView = this.binding.badgeView;
            Intrinsics.checkNotNullExpressionValue(badgeView, "badgeView");
            BadgeHolderKt.bind(badgeView, state.getBadge(), getActionHandler());
        } else {
            BadgeView badgeView2 = this.binding.badgeView;
            Intrinsics.checkNotNullExpressionValue(badgeView2, "badgeView");
            ViewExtKt.gone(badgeView2);
        }
    }

    protected final void bindLabel(String state) {
        ImageView labelImageView = this.binding.labelImageView;
        Intrinsics.checkNotNullExpressionValue(labelImageView, "labelImageView");
        ImageViewExtKt.loadImageOrGone(labelImageView, state);
    }

    protected final void bindTitle(TextDTO state) {
        TextAtomV2View titleTextView = this.binding.titleTextView;
        Intrinsics.checkNotNullExpressionValue(titleTextView, "titleTextView");
        TextHolderKt.bindOrGone$default(titleTextView, state, null, 2, null);
        this.binding.titleTextView.setTextIsSelectable(false);
    }

    @NotNull
    protected final GradientDrawable getParanjaDrawable() {
        return (GradientDrawable) this.paranjaDrawable.getValue();
    }

    @Override // ru.ozon.app.android.fresh.main.widgets.wiseSkuScroll.presentation.holders.BindableViewHolder, jk0.j, lk0.b
    public void onViewInVisibleBounds() {
        WiseBannerVO.BadgeVO adsBadge;
        super.onViewInVisibleBounds();
        Function1<t, Unit> onView = getOnView();
        WiseBannerVO item = getItem();
        onView.invoke((item == null || (adsBadge = item.getAdsBadge()) == null) ? null : adsBadge.getTokenizedEvent());
    }

    @Override // ru.ozon.app.android.fresh.main.widgets.wiseSkuScroll.presentation.holders.BindableViewHolder
    public void bind(@NotNull WiseBannerVO item, d widgetInfo) {
        Intrinsics.checkNotNullParameter(item, "item");
        super.bind((WiseImageBannerHolder) item, widgetInfo);
        bindBackgroundImage(item.getImageUrl());
        bindLabel(item.getPromoBadgeUrl());
        bindTitle(item.getTitle());
        bindBadge(item.getAdsBadge());
    }
}
