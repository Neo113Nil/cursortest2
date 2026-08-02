package ru.ozon.app.android.authCustomActionHandlers.email;

import De.s;
import Sc.o;
import Wc.a;
import a00.C4911f;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.coroutines.d;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import l10.InterfaceC7851b;
import org.jetbrains.annotations.NotNull;
import org.json.JSONObject;
import ru.ozon.app.android.account.eventBus.EmailActualizedEventBus;
import ru.ozon.app.android.action.ActionHandler;
import ru.ozon.app.android.action.custom.CustomActionHandler;
import ru.ozon.app.android.action.v2.ActionV2Repository;
import ru.ozon.app.android.action.v2.models.ActionV2Request;
import ru.ozon.app.android.authCustomActionHandlers.email.ActionDTO;
import ru.ozon.app.android.uikit.R$drawable;
import ru.ozon.app.android.utils.CoroutineUtilsKt;
import ru.ozon.uni.android.uikit.common.StyleParser;
import ru.ozon.uni.atoms.af.AtomAction;
import xe.C10720e0;
import xe.C10727i;
import xe.M;

@Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\b&\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J$\u0010\u000e\u001a\u00020\r2\n\u0010\n\u001a\u00060\bj\u0002`\t2\u0006\u0010\f\u001a\u00020\u000bH\u0082@¢\u0006\u0004\b\u000e\u0010\u000fJ'\u0010\u0013\u001a\u0012\u0012\u0006\u0012\u0004\u0018\u00010\u0011\u0012\u0006\u0012\u0004\u0018\u00010\u00120\u00102\u0006\u0010\f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u001c\u0010\u0015\u001a\u00020\r2\n\u0010\n\u001a\u00060\bj\u0002`\tH\u0082@¢\u0006\u0004\b\u0015\u0010\u0016J\u001f\u0010\u001a\u001a\u000e\u0012\u0004\u0012\u00020\u0019\u0012\u0004\u0012\u00020\r0\u0018*\u00020\u0017H\u0002¢\u0006\u0004\b\u001a\u0010\u001bJ\u001f\u0010\u001e\u001a\u00020\r2\u0006\u0010\u001c\u001a\u00020\u00192\u0006\u0010\u001d\u001a\u00020\u0017H\u0016¢\u0006\u0004\b\u001e\u0010\u001fR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010 R\u0016\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010!R\u0014\u0010#\u001a\u00020\"8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010$¨\u0006%"}, d2 = {"Lru/ozon/app/android/authCustomActionHandlers/email/EmailActionHandler;", "Lru/ozon/app/android/action/custom/CustomActionHandler;", "Lru/ozon/app/android/action/v2/ActionV2Repository;", "actionV2Repository", "Lru/ozon/app/android/account/eventBus/EmailActualizedEventBus;", "emailActualizedEventBus", "<init>", "(Lru/ozon/app/android/action/v2/ActionV2Repository;Lru/ozon/app/android/account/eventBus/EmailActualizedEventBus;)V", "La00/f;", "Lru/ozon/app/android/composer/OwnerContainer;", "container", "Lru/ozon/app/android/authCustomActionHandlers/email/ActionDTO$MessageDTO;", "message", "", "showMessage", "(La00/f;Lru/ozon/app/android/authCustomActionHandlers/email/ActionDTO$MessageDTO;Lkotlin/coroutines/d;)Ljava/lang/Object;", "Lkotlin/Pair;", "", "", "getMessageIcon", "(Lru/ozon/app/android/authCustomActionHandlers/email/ActionDTO$MessageDTO;)Lkotlin/Pair;", "showError", "(La00/f;Lkotlin/coroutines/d;)Ljava/lang/Object;", "Lru/ozon/app/android/action/custom/CustomActionHandler$HandlerReferences;", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "createActionHandler", "(Lru/ozon/app/android/action/custom/CustomActionHandler$HandlerReferences;)Lkotlin/jvm/functions/Function1;", "action", "handlerRefs", "processAction", "(Lru/ozon/uni/atoms/af/AtomAction;Lru/ozon/app/android/action/custom/CustomActionHandler$HandlerReferences;)V", "Lru/ozon/app/android/action/v2/ActionV2Repository;", "Lru/ozon/app/android/account/eventBus/EmailActualizedEventBus;", "Lxe/M;", "scope", "Lxe/M;", "custom-action-handler_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public abstract class EmailActionHandler extends CustomActionHandler {

    @NotNull
    private final ActionV2Repository actionV2Repository;
    private final EmailActualizedEventBus emailActualizedEventBus;

    @NotNull
    private final M scope;

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    /* loaded from: classes11.dex */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[ActionDTO.MessageDTO.MessageTypeDTO.values().length];
            try {
                iArr[ActionDTO.MessageDTO.MessageTypeDTO.TYPE_PLAIN.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ActionDTO.MessageDTO.MessageTypeDTO.TYPE_SUCCESS.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[ActionDTO.MessageDTO.MessageTypeDTO.TYPE_WARNING.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public EmailActionHandler(@NotNull ActionV2Repository actionV2Repository, EmailActualizedEventBus emailActualizedEventBus) {
        Intrinsics.checkNotNullParameter(actionV2Repository, "actionV2Repository");
        this.actionV2Repository = actionV2Repository;
        this.emailActualizedEventBus = emailActualizedEventBus;
        this.scope = CoroutineUtilsKt.getSafeScope();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Function1<AtomAction, Unit> createActionHandler(CustomActionHandler.HandlerReferences handlerReferences) {
        return new ActionHandler.Builder(handlerReferences.getRefs(), handlerReferences.getNestedPagesProvider(), new EmailActionHandler$createActionHandler$1(handlerReferences), new EmailActionHandler$createActionHandler$2(handlerReferences)).buildHandler();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Pair<Integer, String> getMessageIcon(ActionDTO.MessageDTO message) {
        int i11 = WhenMappings.$EnumSwitchMapping$0[message.getType().ordinal()];
        if (i11 == 1) {
            return new Pair<>(null, null);
        }
        if (i11 == 2) {
            return new Pair<>(Integer.valueOf(R$drawable.ic_check_green), StyleParser.OzColor.OZ_COLOR_GREEN_UI.getValue());
        }
        if (i11 == 3) {
            return new Pair<>(Integer.valueOf(R$drawable.ic_warning), StyleParser.OzColor.OZ_COLOR_ORANGE.getValue());
        }
        throw new o();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object showError(C4911f c4911f, d<? super Unit> dVar) {
        C10720e0 c10720e0 = C10720e0.f105451a;
        Object f7 = C10727i.f(s.f6650a, new EmailActionHandler$showError$2(c4911f, null), dVar);
        return f7 == a.COROUTINE_SUSPENDED ? f7 : Unit.f71690a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object showMessage(C4911f c4911f, ActionDTO.MessageDTO messageDTO, d<? super Unit> dVar) {
        C10720e0 c10720e0 = C10720e0.f105451a;
        Object f7 = C10727i.f(s.f6650a, new EmailActionHandler$showMessage$2(c4911f, this, messageDTO, null), dVar);
        return f7 == a.COROUTINE_SUSPENDED ? f7 : Unit.f71690a;
    }

    @Override // ru.ozon.app.android.action.custom.CustomActionHandler
    public void processAction(@NotNull AtomAction action, @NotNull CustomActionHandler.HandlerReferences handlerRefs) {
        Intrinsics.checkNotNullParameter(action, "action");
        Intrinsics.checkNotNullParameter(handlerRefs, "handlerRefs");
        if (action instanceof AtomAction.ComposerAction) {
            C4911f container = handlerRefs.getRefs().getContainer();
            InterfaceC7851b controller = handlerRefs.getRefs().getController();
            AtomAction.ComposerAction composerAction = (AtomAction.ComposerAction) action;
            String actionName = composerAction.getActionName();
            Object params = composerAction.getParams();
            if (params == null) {
                params = new JSONObject();
            }
            C10727i.c(this.scope, null, null, new EmailActionHandler$processAction$1(controller, this, new ActionV2Request(params, actionName, false, 4, null), handlerRefs, container, null), 3);
        }
    }
}
