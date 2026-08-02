package ru.ozon.app.android.common.disclaimer;

import Vg.d;
import android.view.View;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.action.ActionHandler;
import ru.ozon.app.android.atoms.v3.holders.disclaimer.DisclaimerHolderKt;
import ru.ozon.app.android.atoms.v3.molecules.DisclaimerContainer;
import ru.ozon.app.android.common.disclaimer.databinding.WidgetDisclaimerLayoutBinding;
import ru.ozon.app.android.composer.ComposerReferences;
import ru.ozon.composer.ui.widget.k;
import ru.ozon.uni.R$attr;
import ru.ozon.uni.android.uikit.common.StyleParser;
import ru.ozon.uni.android.uikit.extensions.ResourceExtKt;
import ru.ozon.uni.android.uikit.extensions.ThemeExtKt;
import ru.ozon.uni.android.uikit.extensions.view.ViewExtKt;
import ru.ozon.uni.atoms.af.AtomAction;

@Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0016\u0018\u00002\u0012\u0012\u0004\u0012\u00020\u00020\u0001j\b\u0012\u0004\u0012\u00020\u0002`\u0003B#\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\n\u0010\b\u001a\u00060\u0006j\u0002`\u0007\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ#\u0010\u0012\u001a\u00020\u00112\u0006\u0010\r\u001a\u00020\u00022\n\u0010\u0010\u001a\u00060\u000ej\u0002`\u000fH\u0014¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0014R\u0018\u0010\b\u001a\u00060\u0006j\u0002`\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\u0015R\u0014\u0010\u0017\u001a\u00020\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u0014\u0010\u001a\u001a\u00020\u00198\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u0014\u0010\u001c\u001a\u00020\u00198\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001bR \u0010\u001f\u001a\u000e\u0012\u0004\u0012\u00020\u001e\u0012\u0004\u0012\u00020\u00110\u001d8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010 ¨\u0006!"}, d2 = {"Lru/ozon/app/android/common/disclaimer/DisclaimerWidgetViewHolder;", "Lru/ozon/composer/ui/widget/k;", "Lru/ozon/app/android/common/disclaimer/DisclaimerVO;", "Lru/ozon/app/android/composer/widgets/base/WidgetViewHolder;", "Landroid/view/View;", "containerView", "LVg/d;", "Lru/ozon/app/android/action/custom/CustomActionHandlersStoreFactory;", "customActionHandlersStoreFactory", "Lru/ozon/app/android/composer/ComposerReferences;", "refs", "<init>", "(Landroid/view/View;LVg/d;Lru/ozon/app/android/composer/ComposerReferences;)V", "item", "Ll20/d;", "Lru/ozon/app/android/composer/view/WidgetInfo;", "info", "", "bind", "(Lru/ozon/app/android/common/disclaimer/DisclaimerVO;Ll20/d;)V", "Landroid/view/View;", "LVg/d;", "Lru/ozon/app/android/common/disclaimer/databinding/WidgetDisclaimerLayoutBinding;", "binding", "Lru/ozon/app/android/common/disclaimer/databinding/WidgetDisclaimerLayoutBinding;", "", "HORIZONTAL_PADDING", "I", "VERTICAL_PADDING", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "actionHandler", "Lkotlin/jvm/functions/Function1;", "disclaimer_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public class DisclaimerWidgetViewHolder extends k<DisclaimerVO> {
    private final int HORIZONTAL_PADDING;
    private final int VERTICAL_PADDING;

    @NotNull
    private final Function1<AtomAction, Unit> actionHandler;

    @NotNull
    private final WidgetDisclaimerLayoutBinding binding;

    @NotNull
    private final View containerView;

    @NotNull
    private final d customActionHandlersStoreFactory;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DisclaimerWidgetViewHolder(@NotNull View containerView, @NotNull d customActionHandlersStoreFactory, @NotNull ComposerReferences refs) {
        super(containerView);
        Intrinsics.checkNotNullParameter(containerView, "containerView");
        Intrinsics.checkNotNullParameter(customActionHandlersStoreFactory, "customActionHandlersStoreFactory");
        Intrinsics.checkNotNullParameter(refs, "refs");
        this.containerView = containerView;
        this.customActionHandlersStoreFactory = customActionHandlersStoreFactory;
        WidgetDisclaimerLayoutBinding bind = WidgetDisclaimerLayoutBinding.bind(containerView);
        Intrinsics.checkNotNullExpressionValue(bind, "bind(...)");
        this.binding = bind;
        this.HORIZONTAL_PADDING = ResourceExtKt.toPx(16, getContext());
        this.VERTICAL_PADDING = ResourceExtKt.toPx(8, getContext());
        this.actionHandler = new ActionHandler.Builder(refs, this).customActionHandlers(new DisclaimerWidgetViewHolder$actionHandler$1(this)).buildHandler();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // ru.ozon.composer.ui.widget.k
    public void bind(@NotNull DisclaimerVO item, @NotNull l20.d info) {
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(info, "info");
        if (item.getIsRounded()) {
            View view = this.containerView;
            int i11 = this.HORIZONTAL_PADDING;
            int i12 = this.VERTICAL_PADDING;
            ViewExtKt.updatePadding(view, i11, i12, i11, i12);
            this.containerView.setBackgroundColor(ThemeExtKt.themeColor(getContext(), R$attr.oz_semantic_bg_secondary));
        } else {
            ViewExtKt.updatePadding(this.containerView, 0, 0, 0, 0);
            Integer parseColor = StyleParser.INSTANCE.parseColor(getContext(), item.getDisclaimer().getBackgroundColor());
            if (parseColor != null) {
                this.containerView.setBackgroundColor(parseColor.intValue());
            }
        }
        DisclaimerContainer disclaimerContainer = this.binding.disclaimerContainer;
        Intrinsics.checkNotNullExpressionValue(disclaimerContainer, "disclaimerContainer");
        DisclaimerHolderKt.bind(disclaimerContainer, item.getDisclaimer(), this.actionHandler);
    }
}
