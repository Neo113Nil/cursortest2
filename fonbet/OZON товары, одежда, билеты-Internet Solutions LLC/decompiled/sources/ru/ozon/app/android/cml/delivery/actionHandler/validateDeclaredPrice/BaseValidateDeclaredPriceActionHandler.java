package ru.ozon.app.android.cml.delivery.actionHandler.validateDeclaredPrice;

import Pc.a;
import Sc.s;
import Tg.b;
import Vg.f;
import W10.c;
import a00.C4911f;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.ComponentCallbacksC5392m;
import androidx.lifecycle.D;
import androidx.lifecycle.K;
import androidx.lifecycle.w0;
import androidx.lifecycle.z0;
import androidx.recyclerview.widget.LinearLayoutManager;
import i10.l;
import java.util.Map;
import java.util.concurrent.CancellationException;
import k20.C7475g;
import kotlin.Metadata;
import kotlin.collections.U;
import kotlin.coroutines.d;
import kotlin.jvm.internal.Intrinsics;
import l10.InterfaceC7851b;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.action.v2.ActionV2Repository;
import ru.ozon.app.android.action.v2.models.ActionV2Request;
import ru.ozon.app.android.action.v2.models.ActionV2Response;
import ru.ozon.app.android.cml.delivery.data.PreorderParamsStore;
import ru.ozon.app.android.cml.delivery.widgets.inputCurtain.presentation.InputCurtainViewModel;
import ru.ozon.app.android.composer.di.composer.RetainComposerComponentApi;
import ru.ozon.app.android.composer.view.ComposerViewExtensionKt;
import ru.ozon.app.android.platform.R$string;
import ru.ozon.app.android.uikit.text.StringProvider;
import ru.ozon.uni.android.notificationbar.CoordinatorLayoutManagerKt;
import ru.ozon.uni.android.notificationbar.NotificationBar;
import ru.ozon.uni.android.notificationbar.NotificationLayoutManager;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.data.notification.NotificationDTO;
import xe.B0;
import xe.C10727i;

@Metadata(d1 = {"\u0000n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\b \u0018\u0000 -2\u00020\u0001:\u0001-B\u001d\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0007\u0010\bJB\u0010\u0015\u001a\u0004\u0018\u00010\u00142\u0006\u0010\n\u001a\u00020\t2\n\u0010\r\u001a\u00060\u000bj\u0002`\f2\n\u0010\u0010\u001a\u00060\u000ej\u0002`\u000f2\u000e\u0010\u0013\u001a\n\u0018\u00010\u0011j\u0004\u0018\u0001`\u0012H\u0082@¢\u0006\u0004\b\u0015\u0010\u0016J#\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u0018\u001a\u00020\u00172\n\u0010\u0010\u001a\u00060\u000ej\u0002`\u000fH\u0002¢\u0006\u0004\b\u001a\u0010\u001bJ\u001b\u0010\u001c\u001a\u00020\u00192\n\u0010\u0010\u001a\u00060\u000ej\u0002`\u000fH\u0002¢\u0006\u0004\b\u001c\u0010\u001dJ#\u0010\u001e\u001a\u00020\u00192\u0006\u0010\u0018\u001a\u00020\u00172\n\u0010\u0010\u001a\u00060\u000ej\u0002`\u000fH\u0002¢\u0006\u0004\b\u001e\u0010\u001bJ'\u0010$\u001a\u00020\u00192\u0006\u0010\n\u001a\u00020\u001f2\u0006\u0010!\u001a\u00020 2\u0006\u0010#\u001a\u00020\"H\u0016¢\u0006\u0004\b$\u0010%R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010&R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010'R\u0018\u0010)\u001a\u0004\u0018\u00010(8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b)\u0010*R\u0018\u0010+\u001a\u0004\u0018\u00010\u00058\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b+\u0010,¨\u0006."}, d2 = {"Lru/ozon/app/android/cml/delivery/actionHandler/validateDeclaredPrice/BaseValidateDeclaredPriceActionHandler;", "LVg/f;", "Lru/ozon/app/android/action/v2/ActionV2Repository;", "actionV2Repository", "LPc/a;", "Lru/ozon/app/android/cml/delivery/widgets/inputCurtain/presentation/InputCurtainViewModel;", "inputCurtainViewModelProvider", "<init>", "(Lru/ozon/app/android/action/v2/ActionV2Repository;LPc/a;)V", "Lru/ozon/uni/atoms/af/AtomAction$ComposerAction;", "action", "Ll10/b;", "Lru/ozon/app/android/composer/ComposerController;", "controller", "La00/f;", "Lru/ozon/app/android/composer/OwnerContainer;", "container", "LW10/c;", "Lru/ozon/app/android/composer/widgets/base/TrackingData;", "widgetTrackingData", "Lru/ozon/app/android/cml/delivery/actionHandler/validateDeclaredPrice/ValidateDeclaredPriceResponseDTO;", "callActionWithLoading", "(Lru/ozon/uni/atoms/af/AtomAction$ComposerAction;Ll10/b;La00/f;LW10/c;Lkotlin/coroutines/d;)Ljava/lang/Object;", "Lru/ozon/uni/atoms/data/notification/NotificationDTO;", "notificationBar", "", "showNotification", "(Lru/ozon/uni/atoms/data/notification/NotificationDTO;La00/f;)V", "showError", "(La00/f;)V", "showNotificationInternal", "LTg/b;", "LVg/f$a;", "widgetInfo", "Lk20/g;", "widgetComponentStorage", "processWidgetAction", "(LTg/b;LVg/f$a;Lk20/g;)V", "Lru/ozon/app/android/action/v2/ActionV2Repository;", "LPc/a;", "Lxe/B0;", "actionJob", "Lxe/B0;", "viewModel", "Lru/ozon/app/android/cml/delivery/widgets/inputCurtain/presentation/InputCurtainViewModel;", "Companion", "delivery_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public abstract class BaseValidateDeclaredPriceActionHandler extends f {
    private B0 actionJob;

    @NotNull
    private final ActionV2Repository actionV2Repository;

    @NotNull
    private final a<InputCurtainViewModel> inputCurtainViewModelProvider;
    private InputCurtainViewModel viewModel;

    public BaseValidateDeclaredPriceActionHandler(@NotNull ActionV2Repository actionV2Repository, @NotNull a<InputCurtainViewModel> inputCurtainViewModelProvider) {
        Intrinsics.checkNotNullParameter(actionV2Repository, "actionV2Repository");
        Intrinsics.checkNotNullParameter(inputCurtainViewModelProvider, "inputCurtainViewModelProvider");
        this.actionV2Repository = actionV2Repository;
        this.inputCurtainViewModelProvider = inputCurtainViewModelProvider;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:16:0x00d6  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0100  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0027  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object callActionWithLoading(AtomAction.ComposerAction composerAction, InterfaceC7851b interfaceC7851b, C4911f c4911f, c cVar, d<? super ValidateDeclaredPriceResponseDTO> dVar) {
        BaseValidateDeclaredPriceActionHandler$callActionWithLoading$1 baseValidateDeclaredPriceActionHandler$callActionWithLoading$1;
        int i11;
        Throwable th2;
        BaseValidateDeclaredPriceActionHandler baseValidateDeclaredPriceActionHandler;
        C4911f c4911f2;
        BaseValidateDeclaredPriceActionHandler baseValidateDeclaredPriceActionHandler2;
        Tc.d builder;
        Exception exc;
        C4911f c4911f3;
        InputCurtainViewModel inputCurtainViewModel;
        InputCurtainViewModel inputCurtainViewModel2;
        InterfaceC7851b interfaceC7851b2 = interfaceC7851b;
        try {
            if (dVar instanceof BaseValidateDeclaredPriceActionHandler$callActionWithLoading$1) {
                BaseValidateDeclaredPriceActionHandler$callActionWithLoading$1 baseValidateDeclaredPriceActionHandler$callActionWithLoading$12 = (BaseValidateDeclaredPriceActionHandler$callActionWithLoading$1) dVar;
                int i12 = baseValidateDeclaredPriceActionHandler$callActionWithLoading$12.label;
                if ((i12 & LinearLayoutManager.INVALID_OFFSET) != 0) {
                    baseValidateDeclaredPriceActionHandler$callActionWithLoading$12.label = i12 - LinearLayoutManager.INVALID_OFFSET;
                    baseValidateDeclaredPriceActionHandler$callActionWithLoading$1 = baseValidateDeclaredPriceActionHandler$callActionWithLoading$12;
                    Object obj = baseValidateDeclaredPriceActionHandler$callActionWithLoading$1.result;
                    Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
                    i11 = baseValidateDeclaredPriceActionHandler$callActionWithLoading$1.label;
                    if (i11 != 0) {
                        s.b(obj);
                        try {
                            try {
                                interfaceC7851b2.e(new l.a.b(0L, null, 3));
                                try {
                                    try {
                                        builder = new Tc.d();
                                        if (Intrinsics.d(getActionId(), "validateOrderDeclaredPrice")) {
                                            try {
                                                builder.putAll(PreorderParamsStore.INSTANCE.getPreorderParams());
                                            } catch (Exception e11) {
                                                e = e11;
                                                baseValidateDeclaredPriceActionHandler2 = this;
                                                c4911f2 = c4911f;
                                                Lm0.a.f17149a.e(e);
                                                baseValidateDeclaredPriceActionHandler2.showError(c4911f2);
                                                inputCurtainViewModel = baseValidateDeclaredPriceActionHandler2.viewModel;
                                                if (inputCurtainViewModel != null) {
                                                }
                                                interfaceC7851b2.hideLoader();
                                                return null;
                                            }
                                        }
                                        Map<String, String> params = composerAction.getParams();
                                        if (params == null) {
                                            params = U.c();
                                        }
                                        builder.putAll(params);
                                    } catch (Exception e12) {
                                        c4911f2 = c4911f;
                                        exc = e12;
                                    }
                                } catch (Exception e13) {
                                    e = e13;
                                    c4911f2 = c4911f;
                                }
                            } catch (Exception e14) {
                                e = e14;
                                c4911f2 = c4911f;
                            }
                            try {
                                Intrinsics.checkNotNullParameter(builder, "builder");
                                Tc.d u11 = builder.u();
                                ActionV2Repository actionV2Repository = this.actionV2Repository;
                                ActionV2Request actionV2Request = new ActionV2Request(u11, composerAction.getActionName(), false, 4, null);
                                c cVar2 = cVar == null ? new c(null, null, null) : cVar;
                                baseValidateDeclaredPriceActionHandler$callActionWithLoading$1.L$0 = this;
                                baseValidateDeclaredPriceActionHandler$callActionWithLoading$1.L$1 = interfaceC7851b2;
                                c4911f2 = c4911f;
                                try {
                                    baseValidateDeclaredPriceActionHandler$callActionWithLoading$1.L$2 = c4911f2;
                                    baseValidateDeclaredPriceActionHandler$callActionWithLoading$1.label = 1;
                                    obj = actionV2Repository.callActionWithTrackingSuspend(actionV2Request, cVar2, ValidateDeclaredPriceResponseDTO.class, baseValidateDeclaredPriceActionHandler$callActionWithLoading$1);
                                    if (obj == aVar) {
                                        return aVar;
                                    }
                                    baseValidateDeclaredPriceActionHandler2 = this;
                                    c4911f3 = c4911f2;
                                } catch (Exception e15) {
                                    e = e15;
                                    baseValidateDeclaredPriceActionHandler2 = this;
                                    Lm0.a.f17149a.e(e);
                                    baseValidateDeclaredPriceActionHandler2.showError(c4911f2);
                                    inputCurtainViewModel = baseValidateDeclaredPriceActionHandler2.viewModel;
                                    if (inputCurtainViewModel != null) {
                                        inputCurtainViewModel.setExecutingAction(false);
                                    }
                                    interfaceC7851b2.hideLoader();
                                    return null;
                                }
                            } catch (Exception e16) {
                                c4911f2 = c4911f;
                                exc = e16;
                                e = exc;
                                baseValidateDeclaredPriceActionHandler2 = this;
                                Lm0.a.f17149a.e(e);
                                baseValidateDeclaredPriceActionHandler2.showError(c4911f2);
                                inputCurtainViewModel = baseValidateDeclaredPriceActionHandler2.viewModel;
                                if (inputCurtainViewModel != null) {
                                }
                                interfaceC7851b2.hideLoader();
                                return null;
                            }
                        } catch (CancellationException e17) {
                            throw e17;
                        } catch (Throwable th3) {
                            th2 = th3;
                            baseValidateDeclaredPriceActionHandler = this;
                            InputCurtainViewModel inputCurtainViewModel3 = baseValidateDeclaredPriceActionHandler.viewModel;
                            if (inputCurtainViewModel3 != null) {
                                inputCurtainViewModel3.setExecutingAction(false);
                            }
                            interfaceC7851b2.hideLoader();
                            throw th2;
                        }
                    } else {
                        if (i11 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        c4911f3 = (C4911f) baseValidateDeclaredPriceActionHandler$callActionWithLoading$1.L$2;
                        interfaceC7851b2 = (InterfaceC7851b) baseValidateDeclaredPriceActionHandler$callActionWithLoading$1.L$1;
                        baseValidateDeclaredPriceActionHandler2 = (BaseValidateDeclaredPriceActionHandler) baseValidateDeclaredPriceActionHandler$callActionWithLoading$1.L$0;
                        try {
                            s.b(obj);
                        } catch (CancellationException e18) {
                            throw e18;
                        } catch (Exception e19) {
                            e = e19;
                            c4911f2 = c4911f3;
                            Lm0.a.f17149a.e(e);
                            baseValidateDeclaredPriceActionHandler2.showError(c4911f2);
                            inputCurtainViewModel = baseValidateDeclaredPriceActionHandler2.viewModel;
                            if (inputCurtainViewModel != null) {
                            }
                            interfaceC7851b2.hideLoader();
                            return null;
                        }
                    }
                    ValidateDeclaredPriceResponseDTO validateDeclaredPriceResponseDTO = (ValidateDeclaredPriceResponseDTO) ((ActionV2Response) obj).getData();
                    inputCurtainViewModel2 = baseValidateDeclaredPriceActionHandler2.viewModel;
                    if (inputCurtainViewModel2 != null) {
                        inputCurtainViewModel2.setExecutingAction(false);
                    }
                    interfaceC7851b2.hideLoader();
                    return validateDeclaredPriceResponseDTO;
                }
            }
            if (i11 != 0) {
            }
            ValidateDeclaredPriceResponseDTO validateDeclaredPriceResponseDTO2 = (ValidateDeclaredPriceResponseDTO) ((ActionV2Response) obj).getData();
            inputCurtainViewModel2 = baseValidateDeclaredPriceActionHandler2.viewModel;
            if (inputCurtainViewModel2 != null) {
            }
            interfaceC7851b2.hideLoader();
            return validateDeclaredPriceResponseDTO2;
        } catch (Throwable th4) {
            th2 = th4;
            baseValidateDeclaredPriceActionHandler = baseValidateDeclaredPriceActionHandler$callActionWithLoading$1;
        }
        baseValidateDeclaredPriceActionHandler$callActionWithLoading$1 = new BaseValidateDeclaredPriceActionHandler$callActionWithLoading$1(this, dVar);
        Object obj2 = baseValidateDeclaredPriceActionHandler$callActionWithLoading$1.result;
        Wc.a aVar2 = Wc.a.COROUTINE_SUSPENDED;
        i11 = baseValidateDeclaredPriceActionHandler$callActionWithLoading$1.label;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void showError(C4911f container) {
        showNotificationInternal(new NotificationDTO(StringProvider.getString(R$string.common_message_request_problem), null, null, null, null, null, null, null, null, NotificationDTO.Preset.NEGATIVE, 478, null), container);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void showNotification(NotificationDTO notificationBar, C4911f container) {
        showNotificationInternal(notificationBar, container);
    }

    private final void showNotificationInternal(NotificationDTO notificationBar, C4911f container) {
        View view;
        ViewGroup composerContainer;
        NotificationLayoutManager asNotificationLayoutManager$default;
        ComponentCallbacksC5392m c11 = container.c();
        if (c11 == null || (view = c11.getView()) == null || (composerContainer = ComposerViewExtensionKt.composerContainer(view)) == null || (asNotificationLayoutManager$default = CoordinatorLayoutManagerKt.asNotificationLayoutManager$default(composerContainer, null, 1, null)) == null) {
            return;
        }
        NotificationBar.Companion.make$default(NotificationBar.INSTANCE, asNotificationLayoutManager$default, notificationBar, container.i(), null, 8, null).show();
    }

    @Override // Vg.f
    public void processWidgetAction(@NotNull b action, @NotNull f.a widgetInfo, @NotNull C7475g widgetComponentStorage) {
        Intrinsics.checkNotNullParameter(action, "action");
        Intrinsics.checkNotNullParameter(widgetInfo, "widgetInfo");
        Intrinsics.checkNotNullParameter(widgetComponentStorage, "widgetComponentStorage");
        if (action instanceof AtomAction.ComposerAction) {
            C4911f a11 = widgetInfo.a();
            D a12 = K.a(a11.g());
            InterfaceC7851b composerController = ((RetainComposerComponentApi) widgetComponentStorage.getComponent(RetainComposerComponentApi.class)).getComposerController();
            this.viewModel = (InputCurtainViewModel) new z0(widgetInfo.b().a(), new z0.c() { // from class: ru.ozon.app.android.cml.delivery.actionHandler.validateDeclaredPrice.BaseValidateDeclaredPriceActionHandler$processWidgetAction$$inlined$viewModel$1
                @Override // androidx.lifecycle.z0.c, androidx.lifecycle.z0.b
                public <T extends w0> T create(Class<T> modelClass) {
                    a aVar;
                    Intrinsics.checkNotNullParameter(modelClass, "modelClass");
                    aVar = BaseValidateDeclaredPriceActionHandler.this.inputCurtainViewModelProvider;
                    InputCurtainViewModel inputCurtainViewModel = (InputCurtainViewModel) aVar.get();
                    Intrinsics.g(inputCurtainViewModel, "null cannot be cast to non-null type T of ru.ozon.app.android.utils.lifecycle.ViewModelExtKt.vmFactory.<no name provided>.create");
                    return inputCurtainViewModel;
                }
            }).a(InputCurtainViewModel.class);
            B0 b02 = this.actionJob;
            if (b02 != null) {
                b02.j(null);
            }
            this.actionJob = C10727i.c(a12, null, null, new BaseValidateDeclaredPriceActionHandler$processWidgetAction$2(this, action, composerController, a11, widgetInfo, null), 3);
        }
    }
}
