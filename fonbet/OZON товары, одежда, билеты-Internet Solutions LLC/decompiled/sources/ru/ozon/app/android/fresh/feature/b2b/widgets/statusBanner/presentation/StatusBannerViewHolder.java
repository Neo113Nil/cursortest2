package ru.ozon.app.android.fresh.feature.b2b.widgets.statusBanner.presentation;

import Ae.C2399j;
import Ae.C2408n0;
import Bl.b;
import Dc0.n;
import android.content.Context;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.ShapeDrawable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.graphics.drawable.a;
import androidx.lifecycle.J;
import androidx.lifecycle.K;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.d;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.action.ActionHandler;
import ru.ozon.app.android.composer.ComposerReferences;
import ru.ozon.app.android.composer.view.ComposerViewExtensionKt;
import ru.ozon.app.android.fresh.feature.b2b.databinding.WidgetStatusBannerBinding;
import ru.ozon.app.android.pdp.utils.ContextExtKt;
import ru.ozon.app.android.pdp.utils.CornersConfig;
import ru.ozon.app.android.pdp.utils.Dimens;
import ru.ozon.composer.ui.widget.k;
import ru.ozon.uni.android.atom.badge.BadgeView;
import ru.ozon.uni.android.atom.image.Image;
import ru.ozon.uni.android.atom.text.TextAtomV2View;
import ru.ozon.uni.android.controls.buttonV3.IconButtonV3View;
import ru.ozon.uni.android.notificationbar.CoordinatorLayoutManagerKt;
import ru.ozon.uni.android.notificationbar.NotificationBar;
import ru.ozon.uni.android.notificationbar.NotificationLayoutManager;
import ru.ozon.uni.android.uikit.common.StyleParser;
import ru.ozon.uni.android.uikit.extensions.ResourceExtKt;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.data.AtomActionDTO;
import ru.ozon.uni.atoms.data.AtomActionMapperKt;
import ru.ozon.uni.atoms.data.controls.CommonControlSettings;
import ru.ozon.uni.atoms.data.dsBadge.BadgeDTO;
import ru.ozon.uni.atoms.data.notification.NotificationDTO;
import ru.ozon.uni.atoms.v3.holders.controls.buttonV3.IconButtonV3HolderKt;
import ru.ozon.uni.atoms.v3.holders.dsBadge.BadgeHolderKt;
import ru.ozon.uni.atoms.v3.holders.image.ImageHolderKt;
import ru.ozon.uni.atoms.v3.holders.text.TextHolderKt;
import ru.ozon.uni.core.UniColors;

@Metadata(d1 = {"\u0000v\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0001\u0018\u0000 72\u0012\u0012\u0004\u0012\u00020\u00020\u0001j\b\u0012\u0004\u0012\u00020\u0002`\u0003:\u00017B\u001f\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\u000e\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0011\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u0019\u0010\u0015\u001a\u00020\u00102\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013H\u0002¢\u0006\u0004\b\u0015\u0010\u0016J!\u0010\u001b\u001a\u00020\u00192\b\u0010\u0018\u001a\u0004\u0018\u00010\u00172\u0006\u0010\u001a\u001a\u00020\u0019H\u0002¢\u0006\u0004\b\u001b\u0010\u001cJ\u001d\u0010\u001f\u001a\u00020\u0010*\u00020\u001d2\b\u0010\u001e\u001a\u0004\u0018\u00010\u0017H\u0002¢\u0006\u0004\b\u001f\u0010 J\u0017\u0010#\u001a\u00020\u00102\u0006\u0010\"\u001a\u00020!H\u0014¢\u0006\u0004\b#\u0010$J\u001f\u0010(\u001a\u00020\u00102\u0006\u0010%\u001a\u00020\u00022\u0006\u0010'\u001a\u00020&H\u0014¢\u0006\u0004\b(\u0010)R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010*R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010+R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010,R \u0010/\u001a\u000e\u0012\u0004\u0012\u00020.\u0012\u0004\u0012\u00020\u00100-8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b/\u00100R\u0014\u00102\u001a\u0002018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b2\u00103R\u0014\u00104\u001a\u0002018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b4\u00103R\u0014\u00105\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b5\u00106¨\u00068"}, d2 = {"Lru/ozon/app/android/fresh/feature/b2b/widgets/statusBanner/presentation/StatusBannerViewHolder;", "Lru/ozon/composer/ui/widget/k;", "Lru/ozon/app/android/fresh/feature/b2b/widgets/statusBanner/presentation/StatusBannerVO;", "Lru/ozon/app/android/composer/widgets/base/WidgetViewHolder;", "Lru/ozon/app/android/fresh/feature/b2b/databinding/WidgetStatusBannerBinding;", "binding", "Lru/ozon/app/android/fresh/feature/b2b/widgets/statusBanner/presentation/StatusBannerViewModel;", "viewModel", "Lru/ozon/app/android/composer/ComposerReferences;", "references", "<init>", "(Lru/ozon/app/android/fresh/feature/b2b/databinding/WidgetStatusBannerBinding;Lru/ozon/app/android/fresh/feature/b2b/widgets/statusBanner/presentation/StatusBannerViewModel;Lru/ozon/app/android/composer/ComposerReferences;)V", "statusBanner", "Landroid/graphics/drawable/LayerDrawable;", "setupBannerBackground", "(Lru/ozon/app/android/fresh/feature/b2b/widgets/statusBanner/presentation/StatusBannerVO;)Landroid/graphics/drawable/LayerDrawable;", "", "closeBanner", "()V", "Lru/ozon/uni/atoms/data/notification/NotificationDTO;", "notification", "showNotificationBar", "(Lru/ozon/uni/atoms/data/notification/NotificationDTO;)V", "", "color", "", "defaultColorRes", "getColorRes", "(Ljava/lang/String;I)I", "Landroid/view/ViewGroup;", "itemBackgroundColor", "setBackgroundColor", "(Landroid/view/ViewGroup;Ljava/lang/String;)V", "Landroidx/lifecycle/J;", "lifecycle", "onAttachViewModel", "(Landroidx/lifecycle/J;)V", "item", "Ll20/d;", "info", "bind", "(Lru/ozon/app/android/fresh/feature/b2b/widgets/statusBanner/presentation/StatusBannerVO;Ll20/d;)V", "Lru/ozon/app/android/fresh/feature/b2b/databinding/WidgetStatusBannerBinding;", "Lru/ozon/app/android/fresh/feature/b2b/widgets/statusBanner/presentation/StatusBannerViewModel;", "Lru/ozon/app/android/composer/ComposerReferences;", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "actionHandler", "Lkotlin/jvm/functions/Function1;", "Landroid/graphics/drawable/ShapeDrawable;", "bottomDrawable", "Landroid/graphics/drawable/ShapeDrawable;", "roundedDrawable", "layerDrawable", "Landroid/graphics/drawable/LayerDrawable;", "Companion", "b2b_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class StatusBannerViewHolder extends k<StatusBannerVO> {

    @NotNull
    private final Function1<AtomAction, Unit> actionHandler;

    @NotNull
    private final WidgetStatusBannerBinding binding;

    @NotNull
    private final ShapeDrawable bottomDrawable;

    @NotNull
    private final LayerDrawable layerDrawable;

    @NotNull
    private final ComposerReferences references;

    @NotNull
    private final ShapeDrawable roundedDrawable;

    @NotNull
    private final StatusBannerViewModel viewModel;

    @NotNull
    private static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Lru/ozon/app/android/fresh/feature/b2b/widgets/statusBanner/presentation/StatusBannerViewHolder$Companion;", "", "<init>", "()V", "ID_PARAM", "", "b2b_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    private static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public StatusBannerViewHolder(@NotNull WidgetStatusBannerBinding binding, @NotNull StatusBannerViewModel viewModel, @NotNull ComposerReferences references) {
        super(r0);
        Intrinsics.checkNotNullParameter(binding, "binding");
        Intrinsics.checkNotNullParameter(viewModel, "viewModel");
        Intrinsics.checkNotNullParameter(references, "references");
        FrameLayout constraintLayout = binding.getConstraintLayout();
        Intrinsics.checkNotNullExpressionValue(constraintLayout, "getRoot(...)");
        this.binding = binding;
        this.viewModel = viewModel;
        this.references = references;
        this.actionHandler = new ActionHandler.Builder(references, this).onComposerAction(new StatusBannerViewHolder$actionHandler$1(this)).buildHandler();
        ShapeDrawable createRoundRectShape$default = ContextExtKt.createRoundRectShape$default(getContext(), 0.0f, null, 0, 0, null, 30, null);
        this.bottomDrawable = createRoundRectShape$default;
        ShapeDrawable createRoundRectShape$default2 = ContextExtKt.createRoundRectShape$default(getContext(), Dimens.INSTANCE.getDP_24(), CornersConfig.ALL, 0, 0, null, 28, null);
        this.roundedDrawable = createRoundRectShape$default2;
        LayerDrawable layerDrawable = new LayerDrawable(new ShapeDrawable[]{createRoundRectShape$default, createRoundRectShape$default2});
        this.layerDrawable = layerDrawable;
        binding.getConstraintLayout().setBackground(layerDrawable);
        binding.clickableArea.setOnClickListener(new n(this, 21));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void _init_$lambda$0(StatusBannerViewHolder statusBannerViewHolder, View view) {
        BadgeDTO badge;
        CommonControlSettings common;
        AtomActionDTO action;
        AtomAction atomAction;
        StatusBannerVO boundData = statusBannerViewHolder.getBoundData();
        if (boundData == null || (badge = boundData.getBadge()) == null || (common = badge.getCommon()) == null || (action = common.getAction()) == null || (atomAction = AtomActionMapperKt.toAtomAction(action, common.getTrackingInfo())) == null) {
            return;
        }
        statusBannerViewHolder.actionHandler.invoke(atomAction);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void closeBanner() {
        StatusBannerVO boundData = getBoundData();
        if (boundData != null) {
            this.references.getController().m(boundData.getId());
        }
    }

    private final int getColorRes(String color, int defaultColorRes) {
        Object obj;
        Iterator<E> it = UniColors.getEntries().iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (Intrinsics.d(((UniColors) obj).getToken(), color)) {
                break;
            }
        }
        UniColors uniColors = (UniColors) obj;
        return uniColors != null ? uniColors.getResId() : defaultColorRes;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ Object onAttachViewModel$showNotificationBar(StatusBannerViewHolder statusBannerViewHolder, NotificationDTO notificationDTO, d dVar) {
        statusBannerViewHolder.showNotificationBar(notificationDTO);
        return Unit.f71690a;
    }

    private final void setBackgroundColor(ViewGroup viewGroup, String str) {
        StyleParser styleParser = StyleParser.INSTANCE;
        Context context = viewGroup.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        int parseColor = styleParser.parseColor(context, str, UniColors.BG_SECONDARY.getResId());
        Drawable background = viewGroup.getBackground();
        Intrinsics.checkNotNullExpressionValue(background, "wrap(...)");
        a.i(background, parseColor);
    }

    private final LayerDrawable setupBannerBackground(StatusBannerVO statusBanner) {
        FrameLayout constraintLayout = this.binding.getConstraintLayout();
        Paint paint = this.bottomDrawable.getPaint();
        Context context = constraintLayout.getContext();
        String rootBackgroundColor = statusBanner.getRootBackgroundColor();
        UniColors uniColors = UniColors.LAYER_FLOOR_1;
        paint.setColor(androidx.core.content.a.getColor(context, getColorRes(rootBackgroundColor, uniColors.getResId())));
        this.roundedDrawable.getPaint().setColor(androidx.core.content.a.getColor(constraintLayout.getContext(), getColorRes(statusBanner.getContainerBackgroundColor(), uniColors.getResId())));
        Integer verticalPadding = statusBanner.getVerticalPadding();
        int px = verticalPadding != null ? ResourceExtKt.toPx(verticalPadding.intValue()) : 0;
        LayerDrawable layerDrawable = this.layerDrawable;
        layerDrawable.setLayerInsetTop(1, px);
        layerDrawable.setLayerInsetBottom(1, px);
        if (!Intrinsics.d(statusBanner.getHasRoundCorners(), Boolean.TRUE)) {
            Dimens dimens = Dimens.INSTANCE;
            layerDrawable.setLayerInsetLeft(1, dimens.getDP_16());
            layerDrawable.setLayerInsetRight(1, dimens.getDP_16());
        }
        return layerDrawable;
    }

    private final void showNotificationBar(NotificationDTO notification) {
        ViewGroup b11;
        ViewGroup composerContainer;
        NotificationLayoutManager asNotificationLayoutManager$default;
        if (notification == null || (b11 = b.b(this.references)) == null || (composerContainer = ComposerViewExtensionKt.composerContainer(b11)) == null || (asNotificationLayoutManager$default = CoordinatorLayoutManagerKt.asNotificationLayoutManager$default(composerContainer, null, 1, null)) == null) {
            return;
        }
        NotificationBar.INSTANCE.make(asNotificationLayoutManager$default, notification, this.references.getContainer().i(), this.actionHandler).show();
    }

    @Override // ru.ozon.composer.ui.widget.k
    protected void onAttachViewModel(@NotNull J lifecycle) {
        Intrinsics.checkNotNullParameter(lifecycle, "lifecycle");
        C2399j.C(new C2408n0(this.viewModel.getShouldShowBanner(), new StatusBannerViewHolder$onAttachViewModel$1(this, null)), K.a(lifecycle));
        C2399j.C(new C2408n0(this.viewModel.getNotificationBar(), new StatusBannerViewHolder$onAttachViewModel$2(this)), K.a(lifecycle));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x0114, code lost:
    
        if (r8 != (r4 != null ? r4.bottomMargin : 0)) goto L48;
     */
    @Override // ru.ozon.composer.ui.widget.k
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void bind(@NotNull StatusBannerVO item, @NotNull l20.d info) {
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(info, "info");
        WidgetStatusBannerBinding widgetStatusBannerBinding = this.binding;
        setupBannerBackground(item);
        ConstraintLayout contentContainer = widgetStatusBannerBinding.contentContainer;
        Intrinsics.checkNotNullExpressionValue(contentContainer, "contentContainer");
        setBackgroundColor(contentContainer, item.getBackgroundColor());
        if (item.getContainerVerticalPadding() != null) {
            ConstraintLayout contentContainer2 = widgetStatusBannerBinding.contentContainer;
            Intrinsics.checkNotNullExpressionValue(contentContainer2, "contentContainer");
            ViewGroup.LayoutParams layoutParams = contentContainer2.getLayoutParams();
            if (layoutParams == null) {
                throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
            }
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
            int px = ResourceExtKt.toPx(item.getContainerVerticalPadding().intValue());
            marginLayoutParams.topMargin = px;
            marginLayoutParams.bottomMargin = px;
            contentContainer2.setLayoutParams(marginLayoutParams);
        }
        TextAtomV2View title = widgetStatusBannerBinding.title;
        Intrinsics.checkNotNullExpressionValue(title, "title");
        TextHolderKt.bind$default(title, item.getTitle(), null, 2, null);
        TextAtomV2View description = widgetStatusBannerBinding.description;
        Intrinsics.checkNotNullExpressionValue(description, "description");
        TextHolderKt.bindOrGone$default(description, item.getDescription(), null, 2, null);
        TextAtomV2View textAtomV2View = widgetStatusBannerBinding.description;
        textAtomV2View.setPadding(textAtomV2View.getPaddingLeft(), widgetStatusBannerBinding.description.getPaddingTop(), widgetStatusBannerBinding.description.getPaddingRight(), item.getBadge() == null ? Dimens.INSTANCE.getDP_16() : 0);
        IconButtonV3View closeButton = widgetStatusBannerBinding.closeButton;
        Intrinsics.checkNotNullExpressionValue(closeButton, "closeButton");
        IconButtonV3HolderKt.bindOrGone(closeButton, item.getCloseButton(), this.actionHandler);
        BadgeView badge = widgetStatusBannerBinding.badge;
        Intrinsics.checkNotNullExpressionValue(badge, "badge");
        BadgeHolderKt.bindOrGone$default(badge, item.getBadge(), (Function1) null, 2, (Object) null);
        BadgeView badge2 = widgetStatusBannerBinding.badge;
        Intrinsics.checkNotNullExpressionValue(badge2, "badge");
        ViewGroup.LayoutParams layoutParams2 = badge2.getLayoutParams();
        ViewGroup.MarginLayoutParams marginLayoutParams2 = layoutParams2 instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams2 : null;
        if (marginLayoutParams2 != null) {
            int i11 = marginLayoutParams2.leftMargin;
            int i12 = marginLayoutParams2.topMargin;
            int i13 = marginLayoutParams2.rightMargin;
            int i14 = marginLayoutParams2.bottomMargin;
            marginLayoutParams2.topMargin = item.getDescription() != null ? Dimens.INSTANCE.getDP_12() : 0;
            if (i11 == marginLayoutParams2.leftMargin) {
                ViewGroup.LayoutParams layoutParams3 = badge2.getLayoutParams();
                ViewGroup.MarginLayoutParams marginLayoutParams3 = layoutParams3 instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams3 : null;
                if (i12 == (marginLayoutParams3 != null ? marginLayoutParams3.topMargin : 0)) {
                    ViewGroup.LayoutParams layoutParams4 = badge2.getLayoutParams();
                    ViewGroup.MarginLayoutParams marginLayoutParams4 = layoutParams4 instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams4 : null;
                    if (i13 == (marginLayoutParams4 != null ? marginLayoutParams4.rightMargin : 0)) {
                        ViewGroup.LayoutParams layoutParams5 = badge2.getLayoutParams();
                        ViewGroup.MarginLayoutParams marginLayoutParams5 = layoutParams5 instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams5 : null;
                    }
                }
            }
            badge2.setLayoutParams(marginLayoutParams2);
        }
        Image image = widgetStatusBannerBinding.image;
        Intrinsics.checkNotNullExpressionValue(image, "image");
        ImageHolderKt.bindOrGone$default(image, item.getImage(), null, 2, null);
    }
}
