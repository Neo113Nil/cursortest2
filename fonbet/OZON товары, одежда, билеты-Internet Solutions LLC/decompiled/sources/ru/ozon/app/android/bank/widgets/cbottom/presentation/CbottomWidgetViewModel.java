package ru.ozon.app.android.bank.widgets.cbottom.presentation;

import L80.a;
import androidx.lifecycle.w0;
import h20.InterfaceC6786a;
import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.U;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;
import ru.ozon.app.android.bank.widgets.cbottom.core.CbottomWidgetListenersStore;
import ru.ozon.app.android.bank.widgets.cbottom.presentation.CbottomWidgetViewModel;
import ru.ozon.fintech.exchanger.datapass.ActionResult2;
import ru.ozon.fintech.exchanger.datapass.ComposerTrackingInfo;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.data.AtomActionDTO;
import ru.ozon.uni.atoms.data.AtomActionMapperKt;

@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\t\n\u0002\b\u0004\b\u0000\u0018\u0000 \u001c2\u00020\u00012\u00060\u0002j\u0002`\u0003:\u0001\u001cB\u0011\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0015\u0010\n\u001a\u0004\u0018\u00010\t*\u00020\bH\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\r\u0010\u000eJ)\u0010\u0014\u001a\u00020\f2\u0006\u0010\u0010\u001a\u00020\u000f2\u0012\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\f0\u0011¢\u0006\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0016R$\u0010\u0017\u001a\u0010\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\f\u0018\u00010\u00118\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u0018\u0010\u001a\u001a\u0004\u0018\u00010\u00198\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001a\u0010\u001b¨\u0006\u001d"}, d2 = {"Lru/ozon/app/android/bank/widgets/cbottom/presentation/CbottomWidgetViewModel;", "Landroidx/lifecycle/w0;", "Lh20/a;", "Lru/ozon/app/android/composer/viewmodel/ComposerWidgetViewModel;", "Lru/ozon/app/android/bank/widgets/cbottom/core/CbottomWidgetListenersStore;", "listenersStore", "<init>", "(Lru/ozon/app/android/bank/widgets/cbottom/core/CbottomWidgetListenersStore;)V", "", "Lru/ozon/uni/atoms/data/AtomActionDTO$Behavior;", "toAtomActionValue", "(Ljava/lang/String;)Lru/ozon/uni/atoms/data/AtomActionDTO$Behavior;", "", "onCleared", "()V", "Lru/ozon/app/android/bank/widgets/cbottom/presentation/CbottomWidgetVO;", "viewObject", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "action", "init", "(Lru/ozon/app/android/bank/widgets/cbottom/presentation/CbottomWidgetVO;Lkotlin/jvm/functions/Function1;)V", "Lru/ozon/app/android/bank/widgets/cbottom/core/CbottomWidgetListenersStore;", "actionHandler", "Lkotlin/jvm/functions/Function1;", "", "viewObjectId", "Ljava/lang/Long;", "Companion", "ozonbank_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class CbottomWidgetViewModel extends w0 implements InterfaceC6786a {
    private Function1<? super AtomAction, Unit> actionHandler;

    @NotNull
    private final CbottomWidgetListenersStore listenersStore;
    private Long viewObjectId;

    public CbottomWidgetViewModel(@NotNull CbottomWidgetListenersStore listenersStore) {
        Intrinsics.checkNotNullParameter(listenersStore, "listenersStore");
        this.listenersStore = listenersStore;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void init$lambda$4(CbottomWidgetViewModel cbottomWidgetViewModel, ActionResult2 act) {
        AtomActionDTO.Behavior atomActionValue;
        LinkedHashMap linkedHashMap;
        Intrinsics.checkNotNullParameter(act, "act");
        a.a("CbottomWidgetViewModel", act.toString());
        String composerActionBehavior = act.getComposerActionBehavior();
        if (composerActionBehavior == null || (atomActionValue = cbottomWidgetViewModel.toAtomActionValue(composerActionBehavior)) == null) {
            return;
        }
        AtomActionDTO atomActionDTO = new AtomActionDTO(atomActionValue, act.getComposerActionLink(), act.getComposerActionId(), act.getComposerActionParams());
        Map<String, ComposerTrackingInfo> composerTrackingInfo = act.getComposerTrackingInfo();
        if (composerTrackingInfo != null) {
            LinkedHashMap linkedHashMap2 = new LinkedHashMap();
            for (Map.Entry<String, ComposerTrackingInfo> entry : composerTrackingInfo.entrySet()) {
                String actionType = entry.getValue().getActionType();
                if (actionType != null && actionType.length() > 0) {
                    linkedHashMap2.put(entry.getKey(), entry.getValue());
                }
            }
            linkedHashMap = new LinkedHashMap(U.h(linkedHashMap2.size()));
            for (Map.Entry entry2 : linkedHashMap2.entrySet()) {
                Object key = entry2.getKey();
                ComposerTrackingInfo composerTrackingInfo2 = (ComposerTrackingInfo) entry2.getValue();
                linkedHashMap.put(key, new TokenizedTrackingInfo(String.valueOf(composerTrackingInfo2.getActionType()), String.valueOf(composerTrackingInfo2.getKey()), composerTrackingInfo2.getSliceKey(), null, composerTrackingInfo2.getCustom(), 8, null));
            }
        } else {
            linkedHashMap = null;
        }
        Function1<? super AtomAction, Unit> function1 = cbottomWidgetViewModel.actionHandler;
        if (function1 != null) {
            function1.invoke(AtomActionMapperKt.toAtomAction(atomActionDTO, linkedHashMap));
        }
    }

    private final AtomActionDTO.Behavior toAtomActionValue(String str) {
        try {
            String upperCase = str.toUpperCase(Locale.ROOT);
            Intrinsics.checkNotNullExpressionValue(upperCase, "toUpperCase(...)");
            return AtomActionDTO.Behavior.valueOf(upperCase);
        } catch (Exception unused) {
            return null;
        }
    }

    public final void init(@NotNull CbottomWidgetVO viewObject, @NotNull Function1<? super AtomAction, Unit> action) {
        Intrinsics.checkNotNullParameter(viewObject, "viewObject");
        Intrinsics.checkNotNullParameter(action, "action");
        Lm0.a.f17149a.d("CbottomWidgetViewModel", viewObject);
        this.actionHandler = action;
        this.viewObjectId = Long.valueOf(viewObject.getId());
        this.listenersStore.addCallback(viewObject.getId(), new CbottomWidgetListenersStore.Callback() { // from class: tm.a
            @Override // ru.ozon.app.android.bank.widgets.cbottom.core.CbottomWidgetListenersStore.Callback
            public final void call(ActionResult2 actionResult2) {
                CbottomWidgetViewModel.init$lambda$4(CbottomWidgetViewModel.this, actionResult2);
            }
        });
    }

    @Override // androidx.lifecycle.w0
    public void onCleared() {
        Long l11 = this.viewObjectId;
        if (l11 != null) {
            this.listenersStore.removeCallback(l11.longValue());
        }
    }
}
