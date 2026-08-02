package ru.ozon.app.android.travel.actionhandler.addPassToWallet;

import Lm0.a;
import Sc.s;
import Tg.b;
import Wc.a;
import a00.C4911f;
import i10.l;
import java.util.Locale;
import java.util.Set;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.j;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import l10.InterfaceC7851b;
import ru.ozon.app.android.action.v2.ActionV2Repository;
import ru.ozon.app.android.action.v2.models.ActionV2Request;
import ru.ozon.app.android.action.v2.models.ActionV2Response;
import ru.ozon.app.android.logger.LoggerExtKt;
import ru.ozon.app.android.travel.actionhandler.utils.extensions.ActionV2ExtensionsKt;
import ru.ozon.app.android.travel.actionhandler.utils.extensions.ActionV2RepositoryError;
import ru.ozon.app.android.travel.logger.TravelActionLogger;
import ru.ozon.app.android.utils.buildUtils.BuildUtils;
import ru.ozon.uni.atoms.af.AtomAction;
import xe.M;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lxe/M;", "", "<anonymous>", "(Lxe/M;)V"}, k = 3, mv = {2, 0, 0})
@e(c = "ru.ozon.app.android.travel.actionhandler.addPassToWallet.AddPassToWalletActionHandler$processWidgetAction$1", f = "AddPassToWalletActionHandler.kt", l = {157}, m = "invokeSuspend")
/* loaded from: classes2.dex */
final class AddPassToWalletActionHandler$processWidgetAction$1 extends j implements Function2<M, d<? super Unit>, Object> {
    final /* synthetic */ b $action;
    final /* synthetic */ C4911f $container;
    final /* synthetic */ InterfaceC7851b $controller;
    int label;
    final /* synthetic */ AddPassToWalletActionHandler this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    AddPassToWalletActionHandler$processWidgetAction$1(InterfaceC7851b interfaceC7851b, AddPassToWalletActionHandler addPassToWalletActionHandler, b bVar, C4911f c4911f, d<? super AddPassToWalletActionHandler$processWidgetAction$1> dVar) {
        super(2, dVar);
        this.$controller = interfaceC7851b;
        this.this$0 = addPassToWalletActionHandler;
        this.$action = bVar;
        this.$container = c4911f;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d<Unit> create(Object obj, d<?> dVar) {
        return new AddPassToWalletActionHandler$processWidgetAction$1(this.$controller, this.this$0, this.$action, this.$container, dVar);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        ActionV2Response actionV2Response;
        AddPassToWalletResponse addPassToWalletResponse;
        Set set;
        ActionV2Repository actionV2Repository;
        a aVar = a.COROUTINE_SUSPENDED;
        int i11 = this.label;
        try {
            if (i11 != 0) {
                try {
                    if (i11 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    s.b(obj);
                } catch (Throwable th2) {
                    this.$controller.hideLoader();
                    throw th2;
                }
            } else {
                s.b(obj);
                this.$controller.e(new l.a.C1079a(0L, null, 3));
                actionV2Repository = this.this$0.actionV2Repository;
                ActionV2Request actionV2Request = new ActionV2Request(((AtomAction.ComposerAction) this.$action).getParams(), ((AtomAction.ComposerAction) this.$action).getActionName(), true);
                this.label = 1;
                obj = actionV2Repository.callActionSuspend(actionV2Request, AddPassToWalletResponse.class, this);
                if (obj == aVar) {
                    return aVar;
                }
            }
            actionV2Response = ActionV2ExtensionsKt.ensureSuccessful((ActionV2Response) obj);
            this.$controller.hideLoader();
        } catch (CancellationException e11) {
            throw e11;
        } catch (Throwable th3) {
            if (th3 instanceof ActionV2RepositoryError) {
                TravelActionLogger.INSTANCE.logException(th3, "travel_addPassToWallet");
            } else {
                LoggerExtKt.sendNonFatal$default(th3, null, "travel_addPassToWallet", null, 10, null);
            }
            BuildUtils buildUtils = BuildUtils.INSTANCE;
            if (buildUtils.isQaFlavor() || buildUtils.isDebug()) {
                a.b bVar = Lm0.a.f17149a;
                bVar.b("travel_addPassToWallet");
                bVar.e(th3);
            }
            AddPassToWalletActionHandler.showError$default(this.this$0, this.$container, null, 2, null);
            this.$controller.hideLoader();
            actionV2Response = null;
        }
        if (actionV2Response != null && (addPassToWalletResponse = (AddPassToWalletResponse) actionV2Response.getData()) != null) {
            AddPassToWalletActionHandler addPassToWalletActionHandler = this.this$0;
            C4911f c4911f = this.$container;
            String lowerCase = addPassToWalletResponse.getExtension().toLowerCase(Locale.ROOT);
            Intrinsics.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
            set = addPassToWalletActionHandler.supportedFileExtensions;
            if (set.contains(lowerCase)) {
                addPassToWalletActionHandler.openFile(c4911f, addPassToWalletResponse.getPass(), addPassToWalletResponse.getExtension());
            } else {
                Lm0.a.f17149a.e(Nk.a.b("Unsupported file extension: ", addPassToWalletResponse.getExtension()), new Object[0]);
            }
        }
        return Unit.f71690a;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(M m11, d<? super Unit> dVar) {
        return ((AddPassToWalletActionHandler$processWidgetAction$1) create(m11, dVar)).invokeSuspend(Unit.f71690a);
    }
}
