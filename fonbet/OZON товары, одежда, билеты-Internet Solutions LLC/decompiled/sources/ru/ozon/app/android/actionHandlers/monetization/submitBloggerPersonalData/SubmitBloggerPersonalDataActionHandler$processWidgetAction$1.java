package ru.ozon.app.android.actionHandlers.monetization.submitBloggerPersonalData;

import Sc.r;
import Sc.s;
import Tg.b;
import Vg.f;
import Wc.a;
import androidx.lifecycle.K;
import androidx.lifecycle.w0;
import androidx.lifecycle.z0;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import java.util.Map;
import java.util.concurrent.CancellationException;
import k20.C7475g;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.j;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.app.android.action.v2.ActionV2Repository;
import ru.ozon.app.android.action.v2.models.ActionV2Request;
import ru.ozon.app.android.action.v2.models.ActionV2Response;
import ru.ozon.app.android.actionHandlers.monetization.ActionHandlerExtKt;
import ru.ozon.app.android.composer.di.composer.RetainComposerComponentApi;
import ru.ozon.app.android.uikit.utils.NotificationBarHelperKt;
import ru.ozon.app.android.utils.WhenExtKt;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.data.AtomActionDTO;
import ru.ozon.uni.atoms.data.AtomActionMapperKt;
import ru.ozon.uni.atoms.data.notification.NotificationDTO;
import xe.B0;
import xe.C10727i;
import xe.M;
import z00.g;

@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
final class SubmitBloggerPersonalDataActionHandler$processWidgetAction$1 extends AbstractC7737t implements Function0<Unit> {
    final /* synthetic */ b $action;
    final /* synthetic */ C7475g $widgetComponentStorage;
    final /* synthetic */ f.a $widgetInfo;
    final /* synthetic */ SubmitBloggerPersonalDataActionHandler this$0;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lxe/M;", "", "<anonymous>", "(Lxe/M;)V"}, k = 3, mv = {2, 0, 0})
    @e(c = "ru.ozon.app.android.actionHandlers.monetization.submitBloggerPersonalData.SubmitBloggerPersonalDataActionHandler$processWidgetAction$1$1", f = "SubmitBloggerPersonalDataActionHandler.kt", l = {UserVerificationMethods.USER_VERIFY_EYEPRINT}, m = "invokeSuspend")
    /* renamed from: ru.ozon.app.android.actionHandlers.monetization.submitBloggerPersonalData.SubmitBloggerPersonalDataActionHandler$processWidgetAction$1$1, reason: invalid class name */
    static final class AnonymousClass1 extends j implements Function2<M, d<? super Unit>, Object> {
        final /* synthetic */ b $action;
        final /* synthetic */ BloggerPersonalDataFormViewModel $viewModel;
        final /* synthetic */ C7475g $widgetComponentStorage;
        final /* synthetic */ f.a $widgetInfo;
        private /* synthetic */ Object L$0;
        int label;
        final /* synthetic */ SubmitBloggerPersonalDataActionHandler this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(SubmitBloggerPersonalDataActionHandler submitBloggerPersonalDataActionHandler, b bVar, BloggerPersonalDataFormViewModel bloggerPersonalDataFormViewModel, f.a aVar, C7475g c7475g, d<? super AnonymousClass1> dVar) {
            super(2, dVar);
            this.this$0 = submitBloggerPersonalDataActionHandler;
            this.$action = bVar;
            this.$viewModel = bloggerPersonalDataFormViewModel;
            this.$widgetInfo = aVar;
            this.$widgetComponentStorage = c7475g;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final d<Unit> create(Object obj, d<?> dVar) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, this.$action, this.$viewModel, this.$widgetInfo, this.$widgetComponentStorage, dVar);
            anonymousClass1.L$0 = obj;
            return anonymousClass1;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            ActionV2Repository actionV2Repository;
            Object mo479requestActionResult0E7RQCE;
            NotificationDTO createDefaultErrorNotification;
            NotificationDTO createDefaultErrorNotification2;
            Map<String, String> errors;
            Unit unit;
            a aVar = a.COROUTINE_SUSPENDED;
            int i11 = this.label;
            if (i11 == 0) {
                s.b(obj);
                M m11 = (M) this.L$0;
                actionV2Repository = this.this$0.actionV2Repository;
                String actionName = ((AtomAction.ComposerAction) this.$action).getActionName();
                b bVar = this.$action;
                BloggerPersonalDataFormViewModel bloggerPersonalDataFormViewModel = this.$viewModel;
                Tc.d builder = new Tc.d();
                Map<String, String> params = ((AtomAction.ComposerAction) bVar).getParams();
                if (params != null) {
                    builder.putAll(params);
                }
                for (Map.Entry<String, BloggerPersonalDataFormInputState> entry : bloggerPersonalDataFormViewModel.getInputs().getValue().entrySet()) {
                    String key = entry.getKey();
                    BloggerPersonalDataFormInputState value = entry.getValue();
                    if (value.getValue().length() > 0) {
                        builder.put(key, value.getValue());
                    }
                }
                Intrinsics.checkNotNullParameter(builder, "builder");
                ActionV2Request actionV2Request = new ActionV2Request(builder.u(), actionName, false, 4, null);
                this.L$0 = m11;
                this.label = 1;
                mo479requestActionResult0E7RQCE = actionV2Repository.mo479requestActionResult0E7RQCE(actionV2Request, SubmitBloggerPersonalDataResponse.class, this);
                if (mo479requestActionResult0E7RQCE == aVar) {
                    return aVar;
                }
            } else {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                s.b(obj);
                mo479requestActionResult0E7RQCE = ((r) obj).getF26106a();
            }
            SubmitBloggerPersonalDataActionHandler submitBloggerPersonalDataActionHandler = this.this$0;
            BloggerPersonalDataFormViewModel bloggerPersonalDataFormViewModel2 = this.$viewModel;
            f.a aVar2 = this.$widgetInfo;
            C7475g c7475g = this.$widgetComponentStorage;
            r.Companion companion = r.INSTANCE;
            if (!(mo479requestActionResult0E7RQCE instanceof r.b)) {
                submitBloggerPersonalDataActionHandler.currentJob = null;
                SubmitBloggerPersonalDataResponse submitBloggerPersonalDataResponse = (SubmitBloggerPersonalDataResponse) ((ActionV2Response) mo479requestActionResult0E7RQCE).getData();
                if (submitBloggerPersonalDataResponse != null) {
                    NotificationDTO notificationBar = submitBloggerPersonalDataResponse.getNotificationBar();
                    if (notificationBar != null) {
                        submitBloggerPersonalDataActionHandler.showNotification(notificationBar, aVar2);
                    }
                    if (submitBloggerPersonalDataResponse.getSuccess() != null) {
                        AtomActionDTO action = submitBloggerPersonalDataResponse.getSuccess().getAction();
                        if (action != null) {
                            ActionHandlerExtKt.createActionHandler(aVar2, c7475g).invoke(AtomActionMapperKt.toAtomAction(action, null));
                            unit = Unit.f71690a;
                            WhenExtKt.getExhaustive(unit);
                        }
                        unit = null;
                        WhenExtKt.getExhaustive(unit);
                    } else {
                        if (submitBloggerPersonalDataResponse.getError() != null && (errors = submitBloggerPersonalDataResponse.getError().getErrors()) != null) {
                            bloggerPersonalDataFormViewModel2.onInputError$action_handlers_prodGoogleAllVendorsRelease(errors);
                            unit = Unit.f71690a;
                            WhenExtKt.getExhaustive(unit);
                        }
                        unit = null;
                        WhenExtKt.getExhaustive(unit);
                    }
                } else {
                    createDefaultErrorNotification2 = submitBloggerPersonalDataActionHandler.createDefaultErrorNotification();
                    submitBloggerPersonalDataActionHandler.showNotification(createDefaultErrorNotification2, aVar2);
                }
            }
            SubmitBloggerPersonalDataActionHandler submitBloggerPersonalDataActionHandler2 = this.this$0;
            f.a aVar3 = this.$widgetInfo;
            Throwable b11 = r.b(mo479requestActionResult0E7RQCE);
            if (b11 != null) {
                submitBloggerPersonalDataActionHandler2.currentJob = null;
                if (b11 instanceof CancellationException) {
                    throw b11;
                }
                if (g.c(b11)) {
                    submitBloggerPersonalDataActionHandler2.showNotification(NotificationBarHelperKt.createNetworkErrorNotificationDTO$default(false, 1, null), aVar3);
                } else {
                    createDefaultErrorNotification = submitBloggerPersonalDataActionHandler2.createDefaultErrorNotification();
                    submitBloggerPersonalDataActionHandler2.showNotification(createDefaultErrorNotification, aVar3);
                }
            }
            return Unit.f71690a;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(M m11, d<? super Unit> dVar) {
            return ((AnonymousClass1) create(m11, dVar)).invokeSuspend(Unit.f71690a);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    SubmitBloggerPersonalDataActionHandler$processWidgetAction$1(f.a aVar, C7475g c7475g, SubmitBloggerPersonalDataActionHandler submitBloggerPersonalDataActionHandler, b bVar) {
        super(0);
        this.$widgetInfo = aVar;
        this.$widgetComponentStorage = c7475g;
        this.this$0 = submitBloggerPersonalDataActionHandler;
        this.$action = bVar;
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.f71690a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        B0 b02;
        BloggerPersonalDataFormViewModel bloggerPersonalDataFormViewModel = (BloggerPersonalDataFormViewModel) new z0(this.$widgetInfo.b().a(), new z0.c() { // from class: ru.ozon.app.android.actionHandlers.monetization.submitBloggerPersonalData.SubmitBloggerPersonalDataActionHandler$processWidgetAction$1$invoke$$inlined$viewModel$1
            @Override // androidx.lifecycle.z0.c, androidx.lifecycle.z0.b
            public <T extends w0> T create(Class<T> modelClass) {
                Intrinsics.checkNotNullParameter(modelClass, "modelClass");
                return new BloggerPersonalDataFormViewModel();
            }
        }).a(BloggerPersonalDataFormViewModel.class);
        if (bloggerPersonalDataFormViewModel.validateInputs$action_handlers_prodGoogleAllVendorsRelease()) {
            if (!bloggerPersonalDataFormViewModel.getInputsChanged()) {
                ((RetainComposerComponentApi) this.$widgetComponentStorage.getComponent(RetainComposerComponentApi.class)).getComposerNavigator().popBackStack();
                return;
            }
            b02 = this.this$0.currentJob;
            if (b02 != null) {
                b02.j(null);
            }
            this.this$0.currentJob = C10727i.c(K.a(this.$widgetInfo.a().g()), null, null, new AnonymousClass1(this.this$0, this.$action, bloggerPersonalDataFormViewModel, this.$widgetInfo, this.$widgetComponentStorage, null), 3);
        }
    }
}
