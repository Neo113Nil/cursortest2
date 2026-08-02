package ru.ozon.app.android.pdp.widgets.characteristics.presentation.characteristics;

import WZ.l;
import android.view.View;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.pdp.ui.configurators.analitycs.TokenizedAnalyticsExtKt;
import ru.ozon.app.android.pdp.widgets.characteristics.presentation.CharacteristicsItem;
import ru.ozon.app.android.pdp.widgets.characteristics.presentation.CharacteristicsVH;
import ru.ozon.app.android.pdp.widgets.characteristics.presentation.CharacteristicsValues;
import ru.ozon.uni.android.uikit.extensions.view.ViewExtKt;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.v3.holders.text.TextHolderKt;

@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0001\u0018\u00002\u00020\u0001B+\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\u000e\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0010R \u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u0011R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u0012¨\u0006\u0013"}, d2 = {"Lru/ozon/app/android/pdp/widgets/characteristics/presentation/characteristics/CharacteristicsValueVH;", "Lru/ozon/app/android/pdp/widgets/characteristics/presentation/CharacteristicsVH;", "Lru/ozon/app/android/pdp/widgets/characteristics/presentation/characteristics/CharacteristicsValueView;", "view", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "", "actionHandler", "LWZ/l;", "tokenizedAnalytics", "<init>", "(Lru/ozon/app/android/pdp/widgets/characteristics/presentation/characteristics/CharacteristicsValueView;Lkotlin/jvm/functions/Function1;LWZ/l;)V", "Lru/ozon/app/android/pdp/widgets/characteristics/presentation/CharacteristicsItem;", "item", "bind", "(Lru/ozon/app/android/pdp/widgets/characteristics/presentation/CharacteristicsItem;)V", "Lru/ozon/app/android/pdp/widgets/characteristics/presentation/characteristics/CharacteristicsValueView;", "Lkotlin/jvm/functions/Function1;", "LWZ/l;", "pdp_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class CharacteristicsValueVH extends CharacteristicsVH {

    @NotNull
    private final Function1<AtomAction, Unit> actionHandler;

    @NotNull
    private final l tokenizedAnalytics;

    @NotNull
    private final CharacteristicsValueView view;

    @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
    /* renamed from: ru.ozon.app.android.pdp.widgets.characteristics.presentation.characteristics.CharacteristicsValueVH$1, reason: invalid class name */
    static final class AnonymousClass1 extends AbstractC7737t implements Function1<View, Unit> {
        AnonymousClass1() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(View view) {
            invoke2(view);
            return Unit.f71690a;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(View it) {
            Intrinsics.checkNotNullParameter(it, "it");
            CharacteristicsValues boundData = CharacteristicsValueVH.this.getBoundData();
            if (boundData != null) {
                CharacteristicsValueVH characteristicsValueVH = CharacteristicsValueVH.this;
                AtomAction action = boundData.getAction();
                if (action != null) {
                    characteristicsValueVH.actionHandler.invoke(action);
                }
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public CharacteristicsValueVH(@NotNull CharacteristicsValueView view, @NotNull Function1<? super AtomAction, Unit> actionHandler, @NotNull l tokenizedAnalytics) {
        super(view);
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(actionHandler, "actionHandler");
        Intrinsics.checkNotNullParameter(tokenizedAnalytics, "tokenizedAnalytics");
        this.view = view;
        this.actionHandler = actionHandler;
        this.tokenizedAnalytics = tokenizedAnalytics;
        ViewExtKt.setOnClickListenerThrottle$default(view.getClickableAreaL(), 0L, new AnonymousClass1(), 1, null);
    }

    @Override // ru.ozon.app.android.pdp.widgets.characteristics.presentation.CharacteristicsVH
    public void bind(@NotNull CharacteristicsItem item) {
        Intrinsics.checkNotNullParameter(item, "item");
        CharacteristicsValues characteristicsValues = (CharacteristicsValues) item;
        super.bind(item);
        CharacteristicsValueView characteristicsValueView = this.view;
        TextHolderKt.bind$default(characteristicsValueView.getTitleTav(), characteristicsValues.getName(), null, 2, null);
        TextHolderKt.bind(characteristicsValueView.getValueTav(), characteristicsValues.getValue(), this.actionHandler);
        ru.ozon.app.android.pdp.utils.ViewExtKt.bindOrGone$default(characteristicsValueView.getCopyButtonIv(), characteristicsValues.getIcon(), null, 2, null);
        String copyButtonIndex = characteristicsValues.getCopyButtonIndex();
        if (copyButtonIndex != null) {
            characteristicsValueView.getCopyButtonIv().setContentDescription(copyButtonIndex);
        }
        TokenizedAnalyticsExtKt.processViewEvents(this.tokenizedAnalytics, characteristicsValues.getTokenizedEvent());
    }
}
