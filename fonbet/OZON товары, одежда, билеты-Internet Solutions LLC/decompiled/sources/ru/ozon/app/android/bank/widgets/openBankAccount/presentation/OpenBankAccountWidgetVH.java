package ru.ozon.app.android.bank.widgets.openBankAccount.presentation;

import EI.a;
import W10.c;
import WZ.t;
import android.R;
import android.graphics.Matrix;
import android.view.View;
import android.widget.ImageView;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import l20.d;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.action.ActionHandler;
import ru.ozon.app.android.analytics.modules.tokenized.TokenizedAnalyticsExtensionsKt;
import ru.ozon.app.android.bank.databinding.WidgetOpenBankAccountBinding;
import ru.ozon.app.android.composer.ComposerReferences;
import ru.ozon.app.android.pikazon.extensions.ImageViewExtKt;
import ru.ozon.app.android.storefront.core.socialAtoms.text.SocialTextAtomHolderKt;
import ru.ozon.app.android.storefront.core.socialAtoms.text.SocialTextAtomView;
import ru.ozon.composer.ui.widget.f;
import ru.ozon.composer.ui.widget.k;
import ru.ozon.uni.android.uikit.extensions.ResourceExtKt;
import ru.ozon.uni.android.uikit.view.atoms.texts.TextAtomView;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.v3.holders.texts.TextAtomHolderKt;

@Metadata(d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u0000 $2\u0012\u0012\u0004\u0012\u00020\u00020\u0001j\b\u0012\u0004\u0012\u00020\u0002`\u0003:\u0001$B\u0017\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ#\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\n\u001a\u00020\u00022\n\u0010\r\u001a\u00060\u000bj\u0002`\fH\u0014¢\u0006\u0004\b\u000f\u0010\u0010J3\u0010\u0017\u001a\u00020\u000e2\u0006\u0010\n\u001a\u00020\u00022\n\u0010\u0013\u001a\u00060\u0011j\u0002`\u00122\u000e\u0010\u0016\u001a\n\u0018\u00010\u0014j\u0004\u0018\u0001`\u0015H\u0016¢\u0006\u0004\b\u0017\u0010\u0018R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u0019R\u0014\u0010\u001b\u001a\u00020\u001a8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u0016\u0010\u001e\u001a\u00020\u001d8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR \u0010\"\u001a\u000e\u0012\u0004\u0012\u00020!\u0012\u0004\u0012\u00020\u000e0 8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010#¨\u0006%"}, d2 = {"Lru/ozon/app/android/bank/widgets/openBankAccount/presentation/OpenBankAccountWidgetVH;", "Lru/ozon/composer/ui/widget/k;", "Lru/ozon/app/android/bank/widgets/openBankAccount/presentation/OpenBankAccountVO;", "Lru/ozon/app/android/composer/widgets/base/WidgetViewHolder;", "Landroid/view/View;", "containerView", "Lru/ozon/app/android/composer/ComposerReferences;", "ref", "<init>", "(Landroid/view/View;Lru/ozon/app/android/composer/ComposerReferences;)V", "item", "Ll20/d;", "Lru/ozon/app/android/composer/view/WidgetInfo;", "info", "", "bind", "(Lru/ozon/app/android/bank/widgets/openBankAccount/presentation/OpenBankAccountVO;Ll20/d;)V", "LW10/c;", "Lru/ozon/app/android/composer/widgets/base/TrackingData;", "trackingData", "Lru/ozon/composer/ui/widget/f;", "Lru/ozon/app/android/tools/ViewedPond;", "viewedPond", "trackView", "(Lru/ozon/app/android/bank/widgets/openBankAccount/presentation/OpenBankAccountVO;LW10/c;Lru/ozon/composer/ui/widget/f;)V", "Lru/ozon/app/android/composer/ComposerReferences;", "Lru/ozon/app/android/bank/databinding/WidgetOpenBankAccountBinding;", "binding", "Lru/ozon/app/android/bank/databinding/WidgetOpenBankAccountBinding;", "", "shortAnimationDuration", "I", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "actionHandler", "Lkotlin/jvm/functions/Function1;", "Companion", "ozonbank_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class OpenBankAccountWidgetVH extends k<OpenBankAccountVO> {

    @NotNull
    private final Function1<AtomAction, Unit> actionHandler;

    @NotNull
    private final WidgetOpenBankAccountBinding binding;

    @NotNull
    private final ComposerReferences ref;
    private int shortAnimationDuration;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OpenBankAccountWidgetVH(@NotNull View containerView, @NotNull ComposerReferences ref) {
        super(containerView);
        Intrinsics.checkNotNullParameter(containerView, "containerView");
        Intrinsics.checkNotNullParameter(ref, "ref");
        this.ref = ref;
        WidgetOpenBankAccountBinding bind = WidgetOpenBankAccountBinding.bind(this.itemView);
        Intrinsics.checkNotNullExpressionValue(bind, "bind(...)");
        this.binding = bind;
        this.actionHandler = new ActionHandler.Builder(ref, this).buildHandler();
        containerView.setClipToOutline(true);
        containerView.setOnClickListener(new a(this, 13));
        bind.titleTv.setOnClickListener(new EJ.a(this, 9));
        this.shortAnimationDuration = getResources().getInteger(R.integer.config_shortAnimTime);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void _init_$lambda$2(OpenBankAccountWidgetVH openBankAccountWidgetVH, View view) {
        AtomAction action;
        OpenBankAccountVO boundedData = openBankAccountWidgetVH.getBoundedData();
        if (boundedData == null || (action = boundedData.getAction()) == null) {
            return;
        }
        openBankAccountWidgetVH.actionHandler.invoke(action);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void lambda$1$lambda$0(OpenBankAccountWidgetVH openBankAccountWidgetVH, View view) {
        AtomAction action;
        OpenBankAccountVO boundedData = openBankAccountWidgetVH.getBoundedData();
        if (boundedData == null || (action = boundedData.getAction()) == null) {
            return;
        }
        openBankAccountWidgetVH.actionHandler.invoke(action);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // ru.ozon.composer.ui.widget.k
    public void bind(@NotNull OpenBankAccountVO item, @NotNull d info) {
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(info, "info");
        this.binding.cardContainerCl.setClipToOutline(true);
        this.binding.imageContainer.setClipToOutline(false);
        this.binding.imageContainer.setClipChildren(false);
        SocialTextAtomView titleTv = this.binding.titleTv;
        Intrinsics.checkNotNullExpressionValue(titleTv, "titleTv");
        SocialTextAtomHolderKt.bind$default(titleTv, item.getTitle(), null, 2, null);
        String image = item.getImage();
        if (image != null) {
            ImageView rightIv = this.binding.rightIv;
            Intrinsics.checkNotNullExpressionValue(rightIv, "rightIv");
            ImageViewExtKt.load$default(rightIv, image, null, null, null, null, false, null, 126, null);
            ImageView imageView = this.binding.rightIv;
            Matrix matrix = new Matrix();
            matrix.setTranslate(ResourceExtKt.toPxF(0), -ResourceExtKt.toPxF(10));
            imageView.setImageMatrix(matrix);
        }
        if (item.getSubTitle() == null) {
            TextAtomView subTitleTv = this.binding.subTitleTv;
            Intrinsics.checkNotNullExpressionValue(subTitleTv, "subTitleTv");
            subTitleTv.setVisibility(8);
        } else {
            TextAtomView subTitleTv2 = this.binding.subTitleTv;
            Intrinsics.checkNotNullExpressionValue(subTitleTv2, "subTitleTv");
            TextAtomHolderKt.bind$default(subTitleTv2, item.getSubTitle(), null, 2, null);
            TextAtomView subTitleTv3 = this.binding.subTitleTv;
            Intrinsics.checkNotNullExpressionValue(subTitleTv3, "subTitleTv");
            subTitleTv3.setVisibility(0);
        }
    }

    @Override // ru.ozon.composer.ui.widget.k
    public void trackView(@NotNull OpenBankAccountVO item, @NotNull c trackingData, f viewedPond) {
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(trackingData, "trackingData");
        t tokenizedEvent = item.getTokenizedEvent();
        if (tokenizedEvent != null) {
            TokenizedAnalyticsExtensionsKt.processViewEvents$default(this.ref.getTokenizedAnalytics(), tokenizedEvent, null, 2, null);
        }
    }
}
