package ru.ozon.app.android.travel.actionhandler.performActionsList;

import Tg.b;
import Vg.f;
import androidx.lifecycle.B;
import androidx.lifecycle.K;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import k20.C7475g;
import kotlin.Metadata;
import kotlin.collections.C7714v;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import l10.InterfaceC7851b;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.composerCommonViewKit.parsing.JsonParser;
import ru.ozon.app.android.composer.di.composer.RetainComposerComponentApi;
import ru.ozon.app.android.travel.actionhandler.performActionsList.PerformActionsListDTO;
import ru.ozon.app.android.utils.dispatcherprovider.CoroutineDispatcherProvider;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.data.AtomActionMapperKt;
import xe.C10727i;
import xe.J;

@Metadata(d1 = {"\u0000p\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 +2\u00020\u0001:\u0001+B\u001d\b\u0007\u0012\n\u0010\u0004\u001a\u00060\u0002j\u0002`\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\f\u001a\u00060\nj\u0002`\u000b*\u00020\tH\u0002¢\u0006\u0004\b\f\u0010\rJ\u0019\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f*\u00020\u000eH\u0002¢\u0006\u0004\b\u0011\u0010\u0012J'\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0017\u001a\u00020\tH\u0016¢\u0006\u0004\b\u0019\u0010\u001aR\u0018\u0010\u0004\u001a\u00060\u0002j\u0002`\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u001bR\u001a\u0010\u001d\u001a\u00020\u001c8\u0016X\u0096D¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 R\u0014\u0010\"\u001a\u00020!8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010#R\u0014\u0010%\u001a\u00020$8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010&R\u0018\u0010*\u001a\u00020'*\u00020\u00158BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b(\u0010)¨\u0006,"}, d2 = {"Lru/ozon/app/android/travel/actionhandler/performActionsList/PerformActionsListActionHandler;", "LVg/f;", "Lru/ozon/android/composerCommonViewKit/parsing/JsonParser;", "Lru/ozon/app/android/network/serialize/JsonDeserializer;", "jsonDeserializer", "Lru/ozon/app/android/utils/dispatcherprovider/CoroutineDispatcherProvider;", "dispatcherProvider", "<init>", "(Lru/ozon/android/composerCommonViewKit/parsing/JsonParser;Lru/ozon/app/android/utils/dispatcherprovider/CoroutineDispatcherProvider;)V", "Lk20/g;", "Ll10/b;", "Lru/ozon/app/android/composer/ComposerController;", "getController", "(Lk20/g;)Ll10/b;", "Lru/ozon/app/android/travel/actionhandler/performActionsList/PerformActionsListDTO;", "", "Lru/ozon/app/android/travel/actionhandler/performActionsList/ActionWithDelay;", "map", "(Lru/ozon/app/android/travel/actionhandler/performActionsList/PerformActionsListDTO;)Ljava/util/List;", "LTg/b;", "action", "LVg/f$a;", "widgetInfo", "widgetComponentStorage", "", "processWidgetAction", "(LTg/b;LVg/f$a;Lk20/g;)V", "Lru/ozon/android/composerCommonViewKit/parsing/JsonParser;", "", "actionId", "Ljava/lang/String;", "getActionId", "()Ljava/lang/String;", "Lxe/J;", "exceptionHandler", "Lxe/J;", "Lkotlin/coroutines/CoroutineContext;", "coroutineContext", "Lkotlin/coroutines/CoroutineContext;", "Landroidx/lifecycle/B;", "getLifecycleScope", "(LVg/f$a;)Landroidx/lifecycle/B;", "lifecycleScope", "Companion", "actionhandler_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class PerformActionsListActionHandler extends f {

    @NotNull
    private static final Companion Companion = new Companion(null);

    @NotNull
    private final String actionId;

    @NotNull
    private final CoroutineContext coroutineContext;

    @NotNull
    private final J exceptionHandler;

    @NotNull
    private final JsonParser jsonDeserializer;

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Lru/ozon/app/android/travel/actionhandler/performActionsList/PerformActionsListActionHandler$Companion;", "", "<init>", "()V", "ACTIONS_WITH_DELAY_KEY", "", "actionhandler_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    private static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    public PerformActionsListActionHandler(@NotNull JsonParser jsonDeserializer, @NotNull CoroutineDispatcherProvider dispatcherProvider) {
        Intrinsics.checkNotNullParameter(jsonDeserializer, "jsonDeserializer");
        Intrinsics.checkNotNullParameter(dispatcherProvider, "dispatcherProvider");
        this.jsonDeserializer = jsonDeserializer;
        this.actionId = "performActionsList";
        PerformActionsListActionHandler$special$$inlined$CoroutineExceptionHandler$1 performActionsListActionHandler$special$$inlined$CoroutineExceptionHandler$1 = new PerformActionsListActionHandler$special$$inlined$CoroutineExceptionHandler$1(J.f105405n0);
        this.exceptionHandler = performActionsListActionHandler$special$$inlined$CoroutineExceptionHandler$1;
        this.coroutineContext = performActionsListActionHandler$special$$inlined$CoroutineExceptionHandler$1.plus(dispatcherProvider.getIO());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final InterfaceC7851b getController(C7475g c7475g) {
        return ((RetainComposerComponentApi) c7475g.getComponent(RetainComposerComponentApi.class)).getComposerController();
    }

    private final B getLifecycleScope(f.a aVar) {
        return K.a(aVar.a().e());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final List<ActionWithDelay> map(PerformActionsListDTO performActionsListDTO) {
        List<PerformActionsListDTO.ActionWithDelay> actionsWithDelay = performActionsListDTO.getActionsWithDelay();
        ArrayList arrayList = new ArrayList(C7714v.z(actionsWithDelay, 10));
        for (PerformActionsListDTO.ActionWithDelay actionWithDelay : actionsWithDelay) {
            arrayList.add(new ActionWithDelay(AtomActionMapperKt.toAtomAction(actionWithDelay.getAction(), null), actionWithDelay.getDelayMs()));
        }
        return arrayList;
    }

    @Override // Vg.f
    @NotNull
    public String getActionId() {
        return this.actionId;
    }

    @Override // Vg.f
    public void processWidgetAction(@NotNull b action, @NotNull f.a widgetInfo, @NotNull C7475g widgetComponentStorage) {
        Map<String, String> params;
        String str;
        Intrinsics.checkNotNullParameter(action, "action");
        Intrinsics.checkNotNullParameter(widgetInfo, "widgetInfo");
        Intrinsics.checkNotNullParameter(widgetComponentStorage, "widgetComponentStorage");
        if (!(action instanceof AtomAction.Click) || (params = ((AtomAction.Click) action).getParams()) == null || (str = params.get("actionsWithDelayKey")) == null) {
            return;
        }
        C10727i.c(getLifecycleScope(widgetInfo), this.coroutineContext, null, new PerformActionsListActionHandler$processWidgetAction$1(this, widgetComponentStorage, str, null), 2);
    }
}
