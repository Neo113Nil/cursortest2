package ru.ozon.app.android.storefront.widgets.rateApp;

import Bc.e;
import Bc.i;
import Bc.t;
import DM.a;
import Sc.o;
import Vg.d;
import W10.c;
import a00.C4911f;
import android.view.ViewGroup;
import io.reactivex.y;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import l10.InterfaceC7851b;
import mc.C8125a;
import org.jetbrains.annotations.NotNull;
import qc.InterfaceC9019a;
import ru.ozon.app.android.action.custom.CustomActionHandler;
import ru.ozon.app.android.action.v2.ActionV2Repository;
import ru.ozon.app.android.action.v2.models.ActionV2Request;
import ru.ozon.app.android.platform.customActionHandlers.composerActionWithAction.ComposerActionWithActionDTO;
import ru.ozon.app.android.uikit.R$drawable;
import ru.ozon.app.android.utils.rx.RxExtKt;
import ru.ozon.uni.android.flashbar.factory.FlashbarFactory;
import ru.ozon.uni.android.uikit.extensions.view.ContextExtKt;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.utils.OzonSpannableStringKt;
import ru.ozon.uni.core.UniColors;

@Metadata(d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\b\u0007\u0018\u00002\u00020\u0001B\u001d\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\u0010\u0006\u001a\u00060\u0004j\u0002`\u0005¢\u0006\u0004\b\u0007\u0010\bJ#\u0010\u000f\u001a\u00020\u000e2\n\u0010\u000b\u001a\u00060\tj\u0002`\n2\u0006\u0010\r\u001a\u00020\fH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J'\u0010\u0014\u001a\u0012\u0012\u0006\u0012\u0004\u0018\u00010\u0012\u0012\u0006\u0012\u0004\u0018\u00010\u00130\u00112\u0006\u0010\r\u001a\u00020\fH\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u001b\u0010\u0016\u001a\u00020\u000e2\n\u0010\u000b\u001a\u00060\tj\u0002`\nH\u0002¢\u0006\u0004\b\u0016\u0010\u0017J5\u0010\u001d\u001a\u0010\u0012\f\u0012\n \u001c*\u0004\u0018\u00018\u00008\u00000\u0019\"\u0004\b\u0000\u0010\u0018*\b\u0012\u0004\u0012\u00028\u00000\u00192\u0006\u0010\u001b\u001a\u00020\u001aH\u0002¢\u0006\u0004\b\u001d\u0010\u001eJ\u001f\u0010#\u001a\u00020\u000e2\u0006\u0010 \u001a\u00020\u001f2\u0006\u0010\"\u001a\u00020!H\u0016¢\u0006\u0004\b#\u0010$R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010%R\u0018\u0010\u0006\u001a\u00060\u0004j\u0002`\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010&R\u001a\u0010'\u001a\u00020\u00138\u0016X\u0096D¢\u0006\f\n\u0004\b'\u0010(\u001a\u0004\b)\u0010*¨\u0006+"}, d2 = {"Lru/ozon/app/android/storefront/widgets/rateApp/CompositeCustomActionHandler;", "Lru/ozon/app/android/action/custom/CustomActionHandler;", "Lru/ozon/app/android/action/v2/ActionV2Repository;", "actionV2Repository", "LVg/d;", "Lru/ozon/app/android/action/custom/CustomActionHandlersStoreFactory;", "customActionHandlersStoreFactory", "<init>", "(Lru/ozon/app/android/action/v2/ActionV2Repository;LVg/d;)V", "La00/f;", "Lru/ozon/app/android/composer/OwnerContainer;", "container", "Lru/ozon/app/android/platform/customActionHandlers/composerActionWithAction/ComposerActionWithActionDTO$MessageDTO;", "message", "", "showMessage", "(La00/f;Lru/ozon/app/android/platform/customActionHandlers/composerActionWithAction/ComposerActionWithActionDTO$MessageDTO;)V", "Lkotlin/Pair;", "", "", "getMessageIcon", "(Lru/ozon/app/android/platform/customActionHandlers/composerActionWithAction/ComposerActionWithActionDTO$MessageDTO;)Lkotlin/Pair;", "showError", "(La00/f;)V", "T", "Lio/reactivex/y;", "Ll10/b;", "controller", "kotlin.jvm.PlatformType", "withLoader", "(Lio/reactivex/y;Ll10/b;)Lio/reactivex/y;", "Lru/ozon/uni/atoms/af/AtomAction;", "action", "Lru/ozon/app/android/action/custom/CustomActionHandler$HandlerReferences;", "handlerRefs", "processAction", "(Lru/ozon/uni/atoms/af/AtomAction;Lru/ozon/app/android/action/custom/CustomActionHandler$HandlerReferences;)V", "Lru/ozon/app/android/action/v2/ActionV2Repository;", "LVg/d;", "actionId", "Ljava/lang/String;", "getActionId", "()Ljava/lang/String;", "storefront_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class CompositeCustomActionHandler extends CustomActionHandler {

    @NotNull
    private final String actionId;

    @NotNull
    private final ActionV2Repository actionV2Repository;

    @NotNull
    private final d customActionHandlersStoreFactory;

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    /* loaded from: classes2.dex */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[ComposerActionWithActionDTO.MessageDTO.MessageTypeDTO.values().length];
            try {
                iArr[ComposerActionWithActionDTO.MessageDTO.MessageTypeDTO.TYPE_PLAIN.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ComposerActionWithActionDTO.MessageDTO.MessageTypeDTO.TYPE_SUCCESS.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[ComposerActionWithActionDTO.MessageDTO.MessageTypeDTO.TYPE_WARNING.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public CompositeCustomActionHandler(@NotNull ActionV2Repository actionV2Repository, @NotNull d customActionHandlersStoreFactory) {
        Intrinsics.checkNotNullParameter(actionV2Repository, "actionV2Repository");
        Intrinsics.checkNotNullParameter(customActionHandlersStoreFactory, "customActionHandlersStoreFactory");
        this.actionV2Repository = actionV2Repository;
        this.customActionHandlersStoreFactory = customActionHandlersStoreFactory;
        this.actionId = "composerActionWithAction";
    }

    private final Pair<Integer, String> getMessageIcon(ComposerActionWithActionDTO.MessageDTO message) {
        int i11 = WhenMappings.$EnumSwitchMapping$0[message.getType().ordinal()];
        if (i11 == 1) {
            return new Pair<>(null, null);
        }
        if (i11 == 2) {
            return new Pair<>(Integer.valueOf(R$drawable.ic_check_green), UniColors.BG_POSITIVE_PRIMARY.getToken());
        }
        if (i11 == 3) {
            return new Pair<>(Integer.valueOf(R$drawable.ic_warning), UniColors.BG_ATTENTION_PRIMARY.getToken());
        }
        throw new o();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void showError(C4911f container) {
        ViewGroup rootView = ContextExtKt.getRootView(container.a());
        if (rootView == null) {
            return;
        }
        FlashbarFactory.createDefaultError$default(FlashbarFactory.INSTANCE, rootView, null, null, null, null, null, container.g(), 62, null).show();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void showMessage(C4911f container, ComposerActionWithActionDTO.MessageDTO message) {
        ViewGroup rootView = ContextExtKt.getRootView(container.a());
        if (rootView == null) {
            return;
        }
        Pair<Integer, String> messageIcon = getMessageIcon(message);
        FlashbarFactory.create$default(FlashbarFactory.INSTANCE, rootView, null, OzonSpannableStringKt.toOzonSpannableString(message.getMessage()), null, null, messageIcon.a(), null, messageIcon.b(), null, null, null, null, null, 3000L, null, null, container.g(), 57178, null).show();
    }

    private final <T> y<T> withLoader(y<T> yVar, final InterfaceC7851b interfaceC7851b) {
        a aVar = new a(new CompositeCustomActionHandler$withLoader$1(interfaceC7851b), 1);
        yVar.getClass();
        e eVar = new e(new i(yVar, aVar), new InterfaceC9019a() { // from class: HL.a
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
            t g10 = actionV2Repository.callActionWithTracking(actionV2Request, trackingData, ComposerActionWithActionDTO.class).g(C8125a.a());
            Intrinsics.checkNotNullExpressionValue(g10, "observeOn(...)");
            RxExtKt.subscribe(withLoader(g10, handlerRefs.getRefs().getController()), container.g(), new CompositeCustomActionHandler$processAction$1(this, container, handlerRefs), new CompositeCustomActionHandler$processAction$2(this, container));
        }
    }
}
