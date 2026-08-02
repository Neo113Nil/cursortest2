package ru.ozon.app.android.returns.ui.domain.actionhandlers;

import He.b;
import Sc.o;
import Wc.a;
import a00.C4911f;
import android.graphics.Insets;
import android.os.Build;
import android.view.ViewGroup;
import android.view.WindowInsets;
import androidx.lifecycle.H;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.coroutines.d;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.action.ActionHandler;
import ru.ozon.app.android.action.v2.ActionV2Repository;
import ru.ozon.app.android.action.v2.models.ActionV2Request;
import ru.ozon.app.android.action.v2.models.ActionV2Response;
import ru.ozon.app.android.composer.ComposerReferences;
import ru.ozon.app.android.platform.customActionHandlers.composerActionWithAction.ComposerActionWithActionDTO;
import ru.ozon.app.android.uikit.R$drawable;
import ru.ozon.uni.android.flashbar.factory.FlashbarFactory;
import ru.ozon.uni.android.uikit.extensions.ResourceExtKt;
import ru.ozon.uni.android.uikit.extensions.view.ContextExtKt;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.data.AtomActionDTO;
import ru.ozon.uni.atoms.data.AtomActionMapperKt;
import ru.ozon.uni.atoms.utils.OzonSpannableStringKt;
import ru.ozon.uni.core.UniColors;
import xe.C10720e0;
import xe.C10727i;

@Metadata(d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\t\b&\u0018\u0000 +2\u00020\u0001:\u0001+B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\t\u0010\nJ\u001e\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r2\u0006\u0010\f\u001a\u00020\u000bH\u0082@¢\u0006\u0004\b\u000f\u0010\u0010J\u0019\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011H\u0002¢\u0006\u0004\b\u0014\u0010\u0015J#\u0010\u001b\u001a\u00020\u00132\n\u0010\u0018\u001a\u00060\u0016j\u0002`\u00172\u0006\u0010\u001a\u001a\u00020\u0019H\u0002¢\u0006\u0004\b\u001b\u0010\u001cJ'\u0010\u001f\u001a\u0012\u0012\u0006\u0012\u0004\u0018\u00010\b\u0012\u0006\u0012\u0004\u0018\u00010\u001e0\u001d2\u0006\u0010\u001a\u001a\u00020\u0019H\u0002¢\u0006\u0004\b\u001f\u0010 J\u001b\u0010!\u001a\u00020\u00132\n\u0010\u0018\u001a\u00060\u0016j\u0002`\u0017H\u0002¢\u0006\u0004\b!\u0010\"J\u0015\u0010$\u001a\u00020\u00132\u0006\u0010\u0012\u001a\u00020#¢\u0006\u0004\b$\u0010%J\u0017\u0010'\u001a\u00020\u00132\u0006\u0010&\u001a\u00020#H$¢\u0006\u0004\b'\u0010%J\u000f\u0010(\u001a\u00020\bH\u0004¢\u0006\u0004\b(\u0010\nR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010)R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010*¨\u0006,"}, d2 = {"Lru/ozon/app/android/returns/ui/domain/actionhandlers/BaseCreationOrderComposerActionWithActionHandler;", "", "Lru/ozon/app/android/action/v2/ActionV2Repository;", "actionV2Repository", "Lru/ozon/app/android/composer/ComposerReferences;", "refs", "<init>", "(Lru/ozon/app/android/action/v2/ActionV2Repository;Lru/ozon/app/android/composer/ComposerReferences;)V", "", "getStatusBarHeight", "()I", "Lru/ozon/app/android/action/v2/models/ActionV2Request;", "request", "Lru/ozon/app/android/action/v2/models/ActionV2Response;", "Lru/ozon/app/android/platform/customActionHandlers/composerActionWithAction/ComposerActionWithActionDTO;", "callActionWithTracking", "(Lru/ozon/app/android/action/v2/models/ActionV2Request;Lkotlin/coroutines/d;)Ljava/lang/Object;", "Lru/ozon/uni/atoms/data/AtomActionDTO;", "action", "", "handleOtherAction", "(Lru/ozon/uni/atoms/data/AtomActionDTO;)V", "La00/f;", "Lru/ozon/app/android/composer/OwnerContainer;", "container", "Lru/ozon/app/android/platform/customActionHandlers/composerActionWithAction/ComposerActionWithActionDTO$MessageDTO;", "message", "showMessage", "(La00/f;Lru/ozon/app/android/platform/customActionHandlers/composerActionWithAction/ComposerActionWithActionDTO$MessageDTO;)V", "Lkotlin/Pair;", "", "getMessageIcon", "(Lru/ozon/app/android/platform/customActionHandlers/composerActionWithAction/ComposerActionWithActionDTO$MessageDTO;)Lkotlin/Pair;", "showError", "(La00/f;)V", "Lru/ozon/uni/atoms/af/AtomAction$ComposerAction;", "handle", "(Lru/ozon/uni/atoms/af/AtomAction$ComposerAction;)V", "composerAction", "handleRefresh", "getScrollOffset", "Lru/ozon/app/android/action/v2/ActionV2Repository;", "Lru/ozon/app/android/composer/ComposerReferences;", "Companion", "returns_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public abstract class BaseCreationOrderComposerActionWithActionHandler {
    private static final int SCROLL_OFFSET_PADDING = ResourceExtKt.toPx(8);

    @NotNull
    private final ActionV2Repository actionV2Repository;

    @NotNull
    private final ComposerReferences refs;

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
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

    public BaseCreationOrderComposerActionWithActionHandler(@NotNull ActionV2Repository actionV2Repository, @NotNull ComposerReferences refs) {
        Intrinsics.checkNotNullParameter(actionV2Repository, "actionV2Repository");
        Intrinsics.checkNotNullParameter(refs, "refs");
        this.actionV2Repository = actionV2Repository;
        this.refs = refs;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object callActionWithTracking(ActionV2Request actionV2Request, d<? super ActionV2Response<ComposerActionWithActionDTO>> dVar) {
        C10720e0 c10720e0 = C10720e0.f105451a;
        b bVar = b.f10879b;
        Object callActionSuspend = this.actionV2Repository.callActionSuspend(actionV2Request, ComposerActionWithActionDTO.class, dVar);
        return callActionSuspend == a.COROUTINE_SUSPENDED ? callActionSuspend : (ActionV2Response) callActionSuspend;
    }

    private final Pair<Integer, String> getMessageIcon(ComposerActionWithActionDTO.MessageDTO message) {
        int i11 = WhenMappings.$EnumSwitchMapping$0[message.getType().ordinal()];
        if (i11 == 1) {
            return new Pair<>(null, null);
        }
        if (i11 == 2) {
            return new Pair<>(Integer.valueOf(R$drawable.ic_check_green), UniColors.GRAPHIC_POSITIVE_PRIMARY.getToken());
        }
        if (i11 == 3) {
            return new Pair<>(Integer.valueOf(R$drawable.ic_warning), UniColors.GRAPHIC_WARNING_PRIMARY.getToken());
        }
        throw new o();
    }

    private final int getStatusBarHeight() {
        WindowInsets rootWindowInsets;
        int systemBars;
        Insets insets;
        int i11;
        ViewGroup rootView = ContextExtKt.getRootView(this.refs.getContainer().a());
        if (rootView == null || (rootWindowInsets = rootView.getRootWindowInsets()) == null) {
            return 0;
        }
        if (Build.VERSION.SDK_INT < 30) {
            return rootWindowInsets.getSystemWindowInsetTop();
        }
        systemBars = WindowInsets.Type.systemBars();
        insets = rootWindowInsets.getInsets(systemBars);
        i11 = insets.top;
        return i11;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void handleOtherAction(AtomActionDTO action) {
        if (action == null) {
            return;
        }
        new ActionHandler.Builder(this.refs, BaseCreationOrderComposerActionWithActionHandler$handleOtherAction$1.INSTANCE, BaseCreationOrderComposerActionWithActionHandler$handleOtherAction$2.INSTANCE, BaseCreationOrderComposerActionWithActionHandler$handleOtherAction$3.INSTANCE).buildHandler().invoke(AtomActionMapperKt.toAtomAction(action, null));
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

    protected final int getScrollOffset() {
        return getStatusBarHeight() + SCROLL_OFFSET_PADDING;
    }

    public final void handle(@NotNull AtomAction.ComposerAction action) {
        Intrinsics.checkNotNullParameter(action, "action");
        C4911f container = this.refs.getContainer();
        C10727i.c(H.a(container.g().getLifecycle()), null, null, new BaseCreationOrderComposerActionWithActionHandler$handle$1(this, action, container, null), 3);
    }

    protected abstract void handleRefresh(@NotNull AtomAction.ComposerAction composerAction);
}
