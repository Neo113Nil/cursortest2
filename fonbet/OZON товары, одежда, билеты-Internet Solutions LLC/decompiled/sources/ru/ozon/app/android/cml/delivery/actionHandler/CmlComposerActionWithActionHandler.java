package ru.ozon.app.android.cml.delivery.actionHandler;

import Bc.e;
import Bc.i;
import Bc.t;
import Dp.C2877a;
import Sc.o;
import Vg.d;
import W10.c;
import a00.C4911f;
import android.view.ViewGroup;
import io.reactivex.y;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import l10.InterfaceC7851b;
import mc.C8125a;
import org.jetbrains.annotations.NotNull;
import qc.InterfaceC9019a;
import ru.ozon.app.android.action.ActionHandler;
import ru.ozon.app.android.action.custom.CustomActionHandler;
import ru.ozon.app.android.action.v2.ActionV2Repository;
import ru.ozon.app.android.action.v2.models.ActionV2Request;
import ru.ozon.app.android.cml.delivery.actionHandler.CmlComposerActionWithActionDTO;
import ru.ozon.app.android.cml.domain.refresh.CmlEventsController;
import ru.ozon.app.android.uikit.R$drawable;
import ru.ozon.app.android.utils.rx.RxExtKt;
import ru.ozon.uni.android.flashbar.factory.FlashbarFactory;
import ru.ozon.uni.android.uikit.extensions.view.ContextExtKt;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.utils.OzonSpannableStringKt;
import ru.ozon.uni.core.UniColors;

@Metadata(d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0010\b\u0000\u0018\u0000 22\u00020\u0001:\u00012B%\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\u0010\u0006\u001a\u00060\u0004j\u0002`\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ#\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000f0\r2\u0006\u0010\f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J#\u0010\u0017\u001a\u00020\u000f2\n\u0010\u0014\u001a\u00060\u0012j\u0002`\u00132\u0006\u0010\u0016\u001a\u00020\u0015H\u0002¢\u0006\u0004\b\u0017\u0010\u0018J'\u0010\u001c\u001a\u0012\u0012\u0006\u0012\u0004\u0018\u00010\u001a\u0012\u0006\u0012\u0004\u0018\u00010\u001b0\u00192\u0006\u0010\u0016\u001a\u00020\u0015H\u0002¢\u0006\u0004\b\u001c\u0010\u001dJ\u001b\u0010\u001e\u001a\u00020\u000f2\n\u0010\u0014\u001a\u00060\u0012j\u0002`\u0013H\u0002¢\u0006\u0004\b\u001e\u0010\u001fJ9\u0010&\u001a\u0010\u0012\f\u0012\n %*\u0004\u0018\u00018\u00008\u00000!\"\u0004\b\u0000\u0010 *\b\u0012\u0004\u0012\u00028\u00000!2\n\u0010$\u001a\u00060\"j\u0002`#H\u0002¢\u0006\u0004\b&\u0010'J\u001f\u0010)\u001a\u00020\u000f2\u0006\u0010(\u001a\u00020\u000e2\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b)\u0010*R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010+R\u0018\u0010\u0006\u001a\u00060\u0004j\u0002`\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010,R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010-R\u001a\u0010.\u001a\u00020\u001b8\u0016X\u0096D¢\u0006\f\n\u0004\b.\u0010/\u001a\u0004\b0\u00101¨\u00063"}, d2 = {"Lru/ozon/app/android/cml/delivery/actionHandler/CmlComposerActionWithActionHandler;", "Lru/ozon/app/android/action/custom/CustomActionHandler;", "Lru/ozon/app/android/action/v2/ActionV2Repository;", "actionV2Repository", "LVg/d;", "Lru/ozon/app/android/action/custom/CustomActionHandlersStoreFactory;", "customActionHandlersStoreFactory", "Lru/ozon/app/android/cml/domain/refresh/CmlEventsController;", "cmlEventsController", "<init>", "(Lru/ozon/app/android/action/v2/ActionV2Repository;LVg/d;Lru/ozon/app/android/cml/domain/refresh/CmlEventsController;)V", "Lru/ozon/app/android/action/custom/CustomActionHandler$HandlerReferences;", "handlerRefs", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "", "createActionHandler", "(Lru/ozon/app/android/action/custom/CustomActionHandler$HandlerReferences;)Lkotlin/jvm/functions/Function1;", "La00/f;", "Lru/ozon/app/android/composer/OwnerContainer;", "container", "Lru/ozon/app/android/cml/delivery/actionHandler/CmlComposerActionWithActionDTO$MessageDTO;", "message", "showMessage", "(La00/f;Lru/ozon/app/android/cml/delivery/actionHandler/CmlComposerActionWithActionDTO$MessageDTO;)V", "Lkotlin/Pair;", "", "", "getMessageIcon", "(Lru/ozon/app/android/cml/delivery/actionHandler/CmlComposerActionWithActionDTO$MessageDTO;)Lkotlin/Pair;", "showError", "(La00/f;)V", "T", "Lio/reactivex/y;", "Ll10/b;", "Lru/ozon/app/android/composer/ComposerController;", "controller", "kotlin.jvm.PlatformType", "withLoader", "(Lio/reactivex/y;Ll10/b;)Lio/reactivex/y;", "action", "processAction", "(Lru/ozon/uni/atoms/af/AtomAction;Lru/ozon/app/android/action/custom/CustomActionHandler$HandlerReferences;)V", "Lru/ozon/app/android/action/v2/ActionV2Repository;", "LVg/d;", "Lru/ozon/app/android/cml/domain/refresh/CmlEventsController;", "actionId", "Ljava/lang/String;", "getActionId", "()Ljava/lang/String;", "Companion", "delivery_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class CmlComposerActionWithActionHandler extends CustomActionHandler {

    @NotNull
    private static final Companion Companion = new Companion(null);

    @NotNull
    private final String actionId;

    @NotNull
    private final ActionV2Repository actionV2Repository;

    @NotNull
    private final CmlEventsController cmlEventsController;

    @NotNull
    private final d customActionHandlersStoreFactory;

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Lru/ozon/app/android/cml/delivery/actionHandler/CmlComposerActionWithActionHandler$Companion;", "", "<init>", "()V", "RENAME_DRAFT_ACTION_NAME", "", "delivery_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    /* loaded from: classes11.dex */
    private static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    /* loaded from: classes11.dex */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[CmlComposerActionWithActionDTO.MessageDTO.MessageTypeDTO.values().length];
            try {
                iArr[CmlComposerActionWithActionDTO.MessageDTO.MessageTypeDTO.TYPE_PLAIN.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[CmlComposerActionWithActionDTO.MessageDTO.MessageTypeDTO.TYPE_SUCCESS.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[CmlComposerActionWithActionDTO.MessageDTO.MessageTypeDTO.TYPE_WARNING.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public CmlComposerActionWithActionHandler(@NotNull ActionV2Repository actionV2Repository, @NotNull d customActionHandlersStoreFactory, @NotNull CmlEventsController cmlEventsController) {
        Intrinsics.checkNotNullParameter(actionV2Repository, "actionV2Repository");
        Intrinsics.checkNotNullParameter(customActionHandlersStoreFactory, "customActionHandlersStoreFactory");
        Intrinsics.checkNotNullParameter(cmlEventsController, "cmlEventsController");
        this.actionV2Repository = actionV2Repository;
        this.customActionHandlersStoreFactory = customActionHandlersStoreFactory;
        this.cmlEventsController = cmlEventsController;
        this.actionId = "composerActionWithAction";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Function1<AtomAction, Unit> createActionHandler(CustomActionHandler.HandlerReferences handlerRefs) {
        return new ActionHandler.Builder(handlerRefs.getRefs(), handlerRefs.getNestedPagesProvider(), new CmlComposerActionWithActionHandler$createActionHandler$1(handlerRefs), new CmlComposerActionWithActionHandler$createActionHandler$2(handlerRefs)).customActionHandlers(new CmlComposerActionWithActionHandler$createActionHandler$3(this)).buildHandler();
    }

    private final Pair<Integer, String> getMessageIcon(CmlComposerActionWithActionDTO.MessageDTO message) {
        int i11 = WhenMappings.$EnumSwitchMapping$0[message.getType().ordinal()];
        if (i11 == 1) {
            return new Pair<>(null, null);
        }
        if (i11 == 2) {
            return new Pair<>(Integer.valueOf(R$drawable.ic_check_green), UniColors.BG_POSITIVE_PRIMARY.getToken());
        }
        if (i11 == 3) {
            return new Pair<>(Integer.valueOf(R$drawable.ic_warning), UniColors.BG_ACCENT_PRIMARY.getToken());
        }
        throw new o();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void showError(C4911f container) {
        ViewGroup rootView = ContextExtKt.getRootView(container.c());
        if (rootView == null && (rootView = ContextExtKt.getRootView(container.a())) == null) {
            return;
        }
        FlashbarFactory.createDefaultError$default(FlashbarFactory.INSTANCE, rootView, null, null, null, null, null, container.g(), 62, null).show();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void showMessage(C4911f container, CmlComposerActionWithActionDTO.MessageDTO message) {
        ViewGroup rootView = ContextExtKt.getRootView(container.a());
        if (rootView == null) {
            return;
        }
        Pair<Integer, String> messageIcon = getMessageIcon(message);
        FlashbarFactory.create$default(FlashbarFactory.INSTANCE, rootView, null, OzonSpannableStringKt.toOzonSpannableString(message.getMessage()), null, null, messageIcon.a(), null, messageIcon.b(), null, null, null, null, null, 3000L, null, null, container.g(), 57178, null).show();
    }

    private final <T> y<T> withLoader(y<T> yVar, final InterfaceC7851b interfaceC7851b) {
        C2877a c2877a = new C2877a(new CmlComposerActionWithActionHandler$withLoader$1(interfaceC7851b), 0);
        yVar.getClass();
        e eVar = new e(new i(yVar, c2877a), new InterfaceC9019a() { // from class: Dp.b
            @Override // qc.InterfaceC9019a
            public final void run() {
                InterfaceC7851b.this.hideLoader();
            }
        });
        Intrinsics.checkNotNullExpressionValue(eVar, "doAfterTerminate(...)");
        return eVar;
    }

    @Override // Vg.f
    @NotNull
    public String getActionId() {
        return this.actionId;
    }

    @Override // ru.ozon.app.android.action.custom.CustomActionHandler
    public void processAction(@NotNull AtomAction action, @NotNull CustomActionHandler.HandlerReferences handlerRefs) {
        Intrinsics.checkNotNullParameter(action, "action");
        Intrinsics.checkNotNullParameter(handlerRefs, "handlerRefs");
        if (action instanceof AtomAction.ComposerAction) {
            C4911f container = handlerRefs.getRefs().getContainer();
            AtomAction.ComposerAction composerAction = (AtomAction.ComposerAction) action;
            ActionV2Request actionV2Request = new ActionV2Request(composerAction.getParams(), composerAction.getActionName(), false, 4, null);
            ActionV2Repository actionV2Repository = this.actionV2Repository;
            c trackingData = handlerRefs.getTrackingData();
            if (trackingData == null) {
                trackingData = new c(null, null, null);
            }
            t g10 = actionV2Repository.callActionWithTracking(actionV2Request, trackingData, CmlComposerActionWithActionDTO.class).g(C8125a.a());
            Intrinsics.checkNotNullExpressionValue(g10, "observeOn(...)");
            RxExtKt.subscribe(withLoader(g10, handlerRefs.getRefs().getController()), container.g(), new CmlComposerActionWithActionHandler$processAction$1(this, container, action, handlerRefs), new CmlComposerActionWithActionHandler$processAction$2(this, container));
        }
    }
}
