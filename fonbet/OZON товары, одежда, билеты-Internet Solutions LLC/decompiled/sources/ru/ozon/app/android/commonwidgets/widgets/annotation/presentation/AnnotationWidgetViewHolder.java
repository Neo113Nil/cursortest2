package ru.ozon.app.android.commonwidgets.widgets.annotation.presentation;

import WZ.t;
import android.text.method.LinkMovementMethod;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.cardview.widget.CardView;
import androidx.lifecycle.DefaultLifecycleObserver;
import androidx.lifecycle.J;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import l20.d;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.action.ActionHandler;
import ru.ozon.app.android.analytics.modules.tokenized.TokenizedAnalyticsExtensionsKt;
import ru.ozon.app.android.commonwidgets.databinding.WidgetAnnotationLayoutBinding;
import ru.ozon.app.android.composer.ComposerReferences;
import ru.ozon.app.android.composer.R$id;
import ru.ozon.app.android.favorites.ui.atomactionsheethandlers.CreateFavoritesListDelegate;
import ru.ozon.app.android.pikazon.extensions.ImageViewExtKt;
import ru.ozon.app.android.storefrontcommonwidgets.core.appType.AppTypeResolver;
import ru.ozon.app.android.uikit.R$dimen;
import ru.ozon.composer.ui.widget.k;
import ru.ozon.uni.R$attr;
import ru.ozon.uni.R$color;
import ru.ozon.uni.android.uikit.common.StyleParser;
import ru.ozon.uni.android.uikit.extensions.ResourceExtKt;
import ru.ozon.uni.android.uikit.extensions.ThemeExtKt;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.core.UniColors;

@Metadata(d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u0012\u0012\u0004\u0012\u00020\u00020\u0001j\b\u0012\u0004\u0012\u00020\u0002`\u0003B\u001f\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\fH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0011\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0011\u0010\u0012J#\u0010\u0017\u001a\u00020\u000e2\u0006\u0010\u0013\u001a\u00020\u00022\n\u0010\u0016\u001a\u00060\u0014j\u0002`\u0015H\u0014¢\u0006\u0004\b\u0017\u0010\u0018J\u0015\u0010\u0017\u001a\u00020\u000e2\u0006\u0010\u0013\u001a\u00020\u0002¢\u0006\u0004\b\u0017\u0010\u0019R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u001dR\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u001eR\u0014\u0010 \u001a\u00020\u001f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010!R \u0010$\u001a\u000e\u0012\u0004\u0012\u00020#\u0012\u0004\u0012\u00020\u000e0\"8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010%R\u0014\u0010'\u001a\u00020&8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b'\u0010(¨\u0006)"}, d2 = {"Lru/ozon/app/android/commonwidgets/widgets/annotation/presentation/AnnotationWidgetViewHolder;", "Lru/ozon/composer/ui/widget/k;", "Lru/ozon/app/android/commonwidgets/widgets/annotation/presentation/AnnotationVO;", "Lru/ozon/app/android/composer/widgets/base/WidgetViewHolder;", "Landroid/view/View;", "containerView", "Lru/ozon/app/android/composer/ComposerReferences;", "refs", "Lru/ozon/app/android/favorites/ui/atomactionsheethandlers/CreateFavoritesListDelegate;", "createFavoritesListDelegate", "<init>", "(Landroid/view/View;Lru/ozon/app/android/composer/ComposerReferences;Lru/ozon/app/android/favorites/ui/atomactionsheethandlers/CreateFavoritesListDelegate;)V", "", "isFullWidth", "", "showShadow", "(Z)V", "onAttach", "()V", "item", "Ll20/d;", "Lru/ozon/app/android/composer/view/WidgetInfo;", "info", "bind", "(Lru/ozon/app/android/commonwidgets/widgets/annotation/presentation/AnnotationVO;Ll20/d;)V", "(Lru/ozon/app/android/commonwidgets/widgets/annotation/presentation/AnnotationVO;)V", "Landroid/view/View;", "getContainerView", "()Landroid/view/View;", "Lru/ozon/app/android/composer/ComposerReferences;", "Lru/ozon/app/android/favorites/ui/atomactionsheethandlers/CreateFavoritesListDelegate;", "Lru/ozon/app/android/commonwidgets/databinding/WidgetAnnotationLayoutBinding;", "binding", "Lru/ozon/app/android/commonwidgets/databinding/WidgetAnnotationLayoutBinding;", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "actionHandler", "Lkotlin/jvm/functions/Function1;", "Lru/ozon/app/android/commonwidgets/widgets/annotation/presentation/AnnotationButtonsAdapter;", "adapter", "Lru/ozon/app/android/commonwidgets/widgets/annotation/presentation/AnnotationButtonsAdapter;", "commonwidgets_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class AnnotationWidgetViewHolder extends k<AnnotationVO> {

    @NotNull
    private final Function1<AtomAction, Unit> actionHandler;

    @NotNull
    private final AnnotationButtonsAdapter adapter;

    @NotNull
    private final WidgetAnnotationLayoutBinding binding;

    @NotNull
    private final View containerView;

    @NotNull
    private final CreateFavoritesListDelegate createFavoritesListDelegate;

    @NotNull
    private final ComposerReferences refs;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AnnotationWidgetViewHolder(@NotNull View containerView, @NotNull ComposerReferences refs, @NotNull CreateFavoritesListDelegate createFavoritesListDelegate) {
        super(containerView);
        Intrinsics.checkNotNullParameter(containerView, "containerView");
        Intrinsics.checkNotNullParameter(refs, "refs");
        Intrinsics.checkNotNullParameter(createFavoritesListDelegate, "createFavoritesListDelegate");
        this.containerView = containerView;
        this.refs = refs;
        this.createFavoritesListDelegate = createFavoritesListDelegate;
        WidgetAnnotationLayoutBinding bind = WidgetAnnotationLayoutBinding.bind(containerView);
        Intrinsics.checkNotNullExpressionValue(bind, "bind(...)");
        this.binding = bind;
        Function1<AtomAction, Unit> buildHandler = new ActionHandler.Builder(refs, this).onPreProcess(new AnnotationWidgetViewHolder$actionHandler$1(this)).onComposerAction(new AnnotationWidgetViewHolder$actionHandler$2(this)).buildHandler();
        this.actionHandler = buildHandler;
        AnnotationButtonsAdapter annotationButtonsAdapter = new AnnotationButtonsAdapter(buildHandler);
        this.adapter = annotationButtonsAdapter;
        bind.buttonsRv.setAdapter(annotationButtonsAdapter);
        bind.textTv.setMovementMethod(LinkMovementMethod.getInstance());
        bind.getConstraintLayout().setTag(R$id.skip_composer_default_widget_background, Unit.f71690a);
        if (AppTypeResolver.INSTANCE.isSelect(getContext())) {
            return;
        }
        bind.getConstraintLayout().setBackgroundColor(getContext().getColor(R$color.layer_floor_1));
    }

    private final void showShadow(boolean isFullWidth) {
        CardView cardView = this.binding.cardCv;
        cardView.setRadius(isFullWidth ? 0.0f : cardView.getResources().getDimension(R$dimen.extra_extra_large_radius));
        ViewGroup.LayoutParams layoutParams = cardView.getLayoutParams();
        ViewGroup.MarginLayoutParams marginLayoutParams = layoutParams instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams : null;
        if (marginLayoutParams != null) {
            int dimensionPixelOffset = isFullWidth ? 0 : cardView.getResources().getDimensionPixelOffset(R$dimen.default_margin);
            marginLayoutParams.setMargins(dimensionPixelOffset, dimensionPixelOffset, dimensionPixelOffset, dimensionPixelOffset);
        }
    }

    @Override // ru.ozon.composer.ui.widget.k, jk0.j
    public void onAttach() {
        super.onAttach();
        getLifecycle().a(new DefaultLifecycleObserver() { // from class: ru.ozon.app.android.commonwidgets.widgets.annotation.presentation.AnnotationWidgetViewHolder$onAttach$1
            @Override // androidx.lifecycle.DefaultLifecycleObserver
            public void onDestroy(J owner) {
                CreateFavoritesListDelegate createFavoritesListDelegate;
                Intrinsics.checkNotNullParameter(owner, "owner");
                createFavoritesListDelegate = AnnotationWidgetViewHolder.this.createFavoritesListDelegate;
                createFavoritesListDelegate.clear();
            }

            @Override // androidx.lifecycle.DefaultLifecycleObserver
            public void onStop(J owner) {
                CreateFavoritesListDelegate createFavoritesListDelegate;
                Intrinsics.checkNotNullParameter(owner, "owner");
                createFavoritesListDelegate = AnnotationWidgetViewHolder.this.createFavoritesListDelegate;
                createFavoritesListDelegate.clear();
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // ru.ozon.composer.ui.widget.k
    public void bind(@NotNull AnnotationVO item, @NotNull d info) {
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(info, "info");
        bind(item);
    }

    public final void bind(@NotNull AnnotationVO item) {
        int color;
        Intrinsics.checkNotNullParameter(item, "item");
        if (AppTypeResolver.INSTANCE.isSelect(getContext())) {
            color = ThemeExtKt.themeColor(getContext(), R$attr.textTertiaryOnDark);
        } else {
            color = ResourceExtKt.color(getContext(), item.getTextColor());
        }
        this.binding.textTv.setText(item.getText());
        this.binding.textTv.setTextColor(color);
        this.binding.textTv.setLinkTextColor(item.getLinkTextColor());
        if (item.getIcon() != null) {
            ImageView iconIv = this.binding.iconIv;
            Intrinsics.checkNotNullExpressionValue(iconIv, "iconIv");
            ImageViewExtKt.load$default(iconIv, item.getIcon(), null, null, null, null, false, null, 126, null);
        } else {
            this.binding.iconIv.setImageResource(item.getDefaultIcon());
        }
        ImageView iconIv2 = this.binding.iconIv;
        Intrinsics.checkNotNullExpressionValue(iconIv2, "iconIv");
        ThemeExtKt.tint(iconIv2, Integer.valueOf(color));
        this.binding.cardCv.setCardBackgroundColor(StyleParser.INSTANCE.parseColor(getContext(), item.getBgColor(), UniColors.LAYER_FLOOR_0.getResId()));
        showShadow(item.getIsFullWidth());
        this.adapter.setItems(item.getActionButtons());
        t tokenizedEvent = item.getTokenizedEvent();
        if (tokenizedEvent != null) {
            TokenizedAnalyticsExtensionsKt.processViewEvents$default(this.refs.getTokenizedAnalytics(), tokenizedEvent, null, 2, null);
        }
    }
}
