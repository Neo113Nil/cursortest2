package ru.ozon.app.android.fresh.unsorted.widgets.deliveryProblems.presentation;

import GD.a;
import WZ.t;
import android.content.Context;
import android.view.View;
import android.widget.ImageView;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import l20.d;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.analytics.modules.tokenized.TokenizedAnalyticsExtensionsKt;
import ru.ozon.app.android.composer.ComposerReferences;
import ru.ozon.app.android.fresh.unsorted.databinding.WidgetDeliveryProblemsBinding;
import ru.ozon.app.android.pikazon.extensions.ImageViewExtKt;
import ru.ozon.composer.ui.widget.k;
import ru.ozon.uni.android.uikit.common.StyleParser;
import ru.ozon.uni.android.uikit.extensions.ThemeExtKt;
import ru.ozon.uni.android.uikit.view.atoms.texts.TextAtomView;
import ru.ozon.uni.atoms.v3.holders.texts.TextAtomHolderKt;

@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u0012\u0012\u0004\u0012\u00020\u00020\u0001j\b\u0012\u0004\u0012\u00020\u0002`\u0003B\u0017\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u000e\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u000e\u0010\rJ#\u0010\u0012\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\u00022\n\u0010\u0011\u001a\u00060\u000fj\u0002`\u0010H\u0014¢\u0006\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0018\u001a\u00020\u00178\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019¨\u0006\u001a"}, d2 = {"Lru/ozon/app/android/fresh/unsorted/widgets/deliveryProblems/presentation/DeliveryProblemsViewHolder;", "Lru/ozon/composer/ui/widget/k;", "Lru/ozon/app/android/fresh/unsorted/widgets/deliveryProblems/presentation/DeliveryProblemsVO;", "Lru/ozon/app/android/composer/widgets/base/WidgetViewHolder;", "Landroid/view/View;", "containerView", "Lru/ozon/app/android/composer/ComposerReferences;", "composerReferences", "<init>", "(Landroid/view/View;Lru/ozon/app/android/composer/ComposerReferences;)V", "item", "", "trackAnalytics", "(Lru/ozon/app/android/fresh/unsorted/widgets/deliveryProblems/presentation/DeliveryProblemsVO;)V", "bindIcon", "Ll20/d;", "Lru/ozon/app/android/composer/view/WidgetInfo;", "info", "bind", "(Lru/ozon/app/android/fresh/unsorted/widgets/deliveryProblems/presentation/DeliveryProblemsVO;Ll20/d;)V", "Lru/ozon/app/android/composer/ComposerReferences;", "getComposerReferences", "()Lru/ozon/app/android/composer/ComposerReferences;", "Lru/ozon/app/android/fresh/unsorted/databinding/WidgetDeliveryProblemsBinding;", "binding", "Lru/ozon/app/android/fresh/unsorted/databinding/WidgetDeliveryProblemsBinding;", "widgets-unsorted_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class DeliveryProblemsViewHolder extends k<DeliveryProblemsVO> {

    @NotNull
    private final WidgetDeliveryProblemsBinding binding;

    @NotNull
    private final ComposerReferences composerReferences;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DeliveryProblemsViewHolder(@NotNull View containerView, @NotNull ComposerReferences composerReferences) {
        super(containerView);
        Intrinsics.checkNotNullParameter(containerView, "containerView");
        Intrinsics.checkNotNullParameter(composerReferences, "composerReferences");
        this.composerReferences = composerReferences;
        WidgetDeliveryProblemsBinding bind = WidgetDeliveryProblemsBinding.bind(containerView);
        Intrinsics.checkNotNullExpressionValue(bind, "bind(...)");
        this.binding = bind;
    }

    private final void bindIcon(DeliveryProblemsVO item) {
        ImageView imageView = this.binding.deliveryProblemsImageView;
        Intrinsics.f(imageView);
        ImageViewExtKt.load$default(imageView, item.getIcon().getImage(), null, null, null, null, false, null, 126, null);
        StyleParser styleParser = StyleParser.INSTANCE;
        Context context = imageView.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        ThemeExtKt.tint(imageView, styleParser.parseColor(context, item.getIcon().getTintColor()));
    }

    private final void trackAnalytics(DeliveryProblemsVO item) {
        t trackingInfo = item.getTrackingInfo();
        if (trackingInfo != null) {
            TokenizedAnalyticsExtensionsKt.processViewEvents$default(this.composerReferences.getTokenizedAnalytics(), trackingInfo, null, 2, null);
        }
        this.binding.deliveryProblemsContainer.setOnClickListener(new a(3, item, this));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void trackAnalytics$lambda$2(DeliveryProblemsVO deliveryProblemsVO, DeliveryProblemsViewHolder deliveryProblemsViewHolder, View view) {
        t trackingInfo = deliveryProblemsVO.getTrackingInfo();
        if (trackingInfo != null) {
            TokenizedAnalyticsExtensionsKt.processClickEvents$default(deliveryProblemsViewHolder.composerReferences.getTokenizedAnalytics(), trackingInfo, null, 2, null);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // ru.ozon.composer.ui.widget.k
    public void bind(@NotNull DeliveryProblemsVO item, @NotNull d info) {
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(info, "info");
        TextAtomView deliveryProblemsTextView = this.binding.deliveryProblemsTextView;
        Intrinsics.checkNotNullExpressionValue(deliveryProblemsTextView, "deliveryProblemsTextView");
        TextAtomHolderKt.bind$default(deliveryProblemsTextView, item.getText(), null, 2, null);
        bindIcon(item);
        trackAnalytics(item);
    }
}
