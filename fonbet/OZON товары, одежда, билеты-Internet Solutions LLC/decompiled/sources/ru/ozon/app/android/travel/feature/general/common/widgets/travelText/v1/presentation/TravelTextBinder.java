package ru.ozon.app.android.travel.feature.general.common.widgets.travelText.v1.presentation;

import android.content.Context;
import d20.AbstractC6065b;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import l10.i;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.action.ActionHandler;
import ru.ozon.app.android.composer.ComposerReferences;
import ru.ozon.composer.ui.widget.k;
import ru.ozon.uni.R$color;
import ru.ozon.uni.android.uikit.common.StyleParser;
import ru.ozon.uni.android.uikit.view.atoms.texts.TextAtomView;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.v3.holders.texts.TextAtomHolderKt;

@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J1\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0012\u0010\n\u001a\u000e\u0012\u0002\b\u00030\bj\u0006\u0012\u0002\b\u0003`\t¢\u0006\u0004\b\f\u0010\rJ)\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u000f\u001a\u00020\u000e2\n\u0010\u0011\u001a\u0006\u0012\u0002\b\u00030\u0010¢\u0006\u0004\b\f\u0010\u0012J\u0015\u0010\u0015\u001a\u00020\u000b2\u0006\u0010\u0014\u001a\u00020\u0013¢\u0006\u0004\b\u0015\u0010\u0016R\u0018\u0010\u0017\u001a\u0004\u0018\u00010\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R*\u0010\u001c\u001a\u0016\u0012\u0004\u0012\u00020\u001a\u0012\u0004\u0012\u00020\u000b\u0018\u00010\u0019j\u0004\u0018\u0001`\u001b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001c\u0010\u001d¨\u0006\u001e"}, d2 = {"Lru/ozon/app/android/travel/feature/general/common/widgets/travelText/v1/presentation/TravelTextBinder;", "", "<init>", "()V", "Lru/ozon/uni/android/uikit/view/atoms/texts/TextAtomView;", "textAtomView", "Lru/ozon/app/android/composer/ComposerReferences;", "references", "Lru/ozon/composer/ui/widget/k;", "Lru/ozon/app/android/composer/widgets/base/WidgetViewHolder;", "widgetViewHolder", "", "init", "(Lru/ozon/uni/android/uikit/view/atoms/texts/TextAtomView;Lru/ozon/app/android/composer/ComposerReferences;Lru/ozon/composer/ui/widget/k;)V", "Ll10/i;", "container", "Ld20/b;", "overlayWidgetHolder", "(Lru/ozon/uni/android/uikit/view/atoms/texts/TextAtomView;Ll10/i;Ld20/b;)V", "Lru/ozon/app/android/travel/feature/general/common/widgets/travelText/v1/presentation/TravelTextVO;", "item", "bind", "(Lru/ozon/app/android/travel/feature/general/common/widgets/travelText/v1/presentation/TravelTextVO;)V", "textTav", "Lru/ozon/uni/android/uikit/view/atoms/texts/TextAtomView;", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "Lru/ozon/app/android/action/BuildedActionHandler;", "actionHandler", "Lkotlin/jvm/functions/Function1;", "common_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class TravelTextBinder {
    private Function1<? super AtomAction, Unit> actionHandler;
    private TextAtomView textTav;

    public final void bind(@NotNull TravelTextVO item) {
        Intrinsics.checkNotNullParameter(item, "item");
        TextAtomView textAtomView = this.textTav;
        if (textAtomView != null) {
            TextAtomHolderKt.bind(textAtomView, item.getText(), this.actionHandler);
            textAtomView.setPadding(item.getOffsetHorizontal(), item.getOffsetTop(), item.getOffsetHorizontal(), item.getOffsetBottom());
            StyleParser styleParser = StyleParser.INSTANCE;
            Context context = textAtomView.getContext();
            Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
            textAtomView.setBackgroundColor(styleParser.parseColor(context, item.getBackgroundColor(), R$color.transparent));
            textAtomView.setTextAlignment(item.getTextAlignment());
        }
    }

    public final void init(@NotNull TextAtomView textAtomView, @NotNull ComposerReferences references, @NotNull k<?> widgetViewHolder) {
        Intrinsics.checkNotNullParameter(textAtomView, "textAtomView");
        Intrinsics.checkNotNullParameter(references, "references");
        Intrinsics.checkNotNullParameter(widgetViewHolder, "widgetViewHolder");
        this.textTav = textAtomView;
        this.actionHandler = new ActionHandler.Builder(references, widgetViewHolder).buildHandler();
    }

    public final void init(@NotNull TextAtomView textAtomView, @NotNull i container, @NotNull AbstractC6065b<?> overlayWidgetHolder) {
        Intrinsics.checkNotNullParameter(textAtomView, "textAtomView");
        Intrinsics.checkNotNullParameter(container, "container");
        Intrinsics.checkNotNullParameter(overlayWidgetHolder, "overlayWidgetHolder");
        this.textTav = textAtomView;
        this.actionHandler = new ActionHandler.Builder(container, overlayWidgetHolder).buildHandler();
    }
}
