package ru.ozon.app.android.common.disclaimer.customActions;

import Lm0.a;
import Sc.InterfaceC4008j;
import Sc.k;
import a00.C4911f;
import android.content.Context;
import android.view.ViewGroup;
import androidx.fragment.app.r;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.account.eventBus.EmailActualizedEventBus;
import ru.ozon.app.android.action.custom.CustomActionHandler;
import ru.ozon.app.android.action.v2.ActionV2Repository;
import ru.ozon.app.android.composer.ComposerReferences;
import ru.ozon.uni.android.flashbar.factory.FlashbarFactory;
import ru.ozon.uni.android.uikit.extensions.view.ContextExtKt;
import ru.ozon.uni.atoms.af.AtomAction;
import xe.C10727i;
import xe.M;

@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0019\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u001f\u0010\r\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u001f\u0010\u0013\u001a\u00020\f2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0015R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0016R\u001b\u0010\u001c\u001a\u00020\u00178BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u001b\u0010!\u001a\u00020\u001d8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001e\u0010\u0019\u001a\u0004\b\u001f\u0010 R\u001a\u0010#\u001a\u00020\"8\u0016X\u0096D¢\u0006\f\n\u0004\b#\u0010$\u001a\u0004\b%\u0010&¨\u0006'"}, d2 = {"Lru/ozon/app/android/common/disclaimer/customActions/ActualizeEmailActionHandler;", "Lru/ozon/app/android/action/custom/CustomActionHandler;", "Lru/ozon/app/android/action/v2/ActionV2Repository;", "actionV2Repository", "Landroid/content/Context;", "context", "<init>", "(Lru/ozon/app/android/action/v2/ActionV2Repository;Landroid/content/Context;)V", "", "throwable", "Lru/ozon/app/android/composer/ComposerReferences;", "refs", "", "onError", "(Ljava/lang/Throwable;Lru/ozon/app/android/composer/ComposerReferences;)V", "Lru/ozon/uni/atoms/af/AtomAction;", "action", "Lru/ozon/app/android/action/custom/CustomActionHandler$HandlerReferences;", "handlerRefs", "processAction", "(Lru/ozon/uni/atoms/af/AtomAction;Lru/ozon/app/android/action/custom/CustomActionHandler$HandlerReferences;)V", "Lru/ozon/app/android/action/v2/ActionV2Repository;", "Landroid/content/Context;", "Lxe/M;", "coroutineScope$delegate", "LSc/j;", "getCoroutineScope", "()Lxe/M;", "coroutineScope", "Lru/ozon/app/android/account/eventBus/EmailActualizedEventBus;", "emailActualizedEventBus$delegate", "getEmailActualizedEventBus", "()Lru/ozon/app/android/account/eventBus/EmailActualizedEventBus;", "emailActualizedEventBus", "", "actionId", "Ljava/lang/String;", "getActionId", "()Ljava/lang/String;", "disclaimer_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class ActualizeEmailActionHandler extends CustomActionHandler {

    @NotNull
    private final String actionId;

    @NotNull
    private final ActionV2Repository actionV2Repository;

    @NotNull
    private final Context context;

    /* renamed from: coroutineScope$delegate, reason: from kotlin metadata */
    @NotNull
    private final InterfaceC4008j coroutineScope;

    /* renamed from: emailActualizedEventBus$delegate, reason: from kotlin metadata */
    @NotNull
    private final InterfaceC4008j emailActualizedEventBus;

    public ActualizeEmailActionHandler(@NotNull ActionV2Repository actionV2Repository, @NotNull Context context) {
        Intrinsics.checkNotNullParameter(actionV2Repository, "actionV2Repository");
        Intrinsics.checkNotNullParameter(context, "context");
        this.actionV2Repository = actionV2Repository;
        this.context = context;
        this.coroutineScope = k.b(ActualizeEmailActionHandler$coroutineScope$2.INSTANCE);
        this.emailActualizedEventBus = k.b(new ActualizeEmailActionHandler$emailActualizedEventBus$2(this));
        this.actionId = "actualizeEmail";
    }

    private final M getCoroutineScope() {
        return (M) this.coroutineScope.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final EmailActualizedEventBus getEmailActualizedEventBus() {
        return (EmailActualizedEventBus) this.emailActualizedEventBus.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void onError(Throwable throwable, ComposerReferences refs) {
        ViewGroup rootView;
        a.f17149a.d(throwable);
        C4911f container = refs.getContainer();
        r a11 = container.a();
        if (a11 == null || (rootView = ContextExtKt.getRootView(a11)) == null) {
            return;
        }
        FlashbarFactory.createDefaultError$default(FlashbarFactory.INSTANCE, rootView, null, null, null, null, null, container.g(), 62, null).show();
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
            C10727i.c(getCoroutineScope(), null, null, new ActualizeEmailActionHandler$processAction$1(this, action, handlerRefs, null), 3);
        }
    }
}
