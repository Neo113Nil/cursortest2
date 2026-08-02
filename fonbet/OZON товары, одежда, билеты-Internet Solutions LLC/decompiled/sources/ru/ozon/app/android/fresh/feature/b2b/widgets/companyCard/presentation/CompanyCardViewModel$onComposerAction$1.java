package ru.ozon.app.android.fresh.feature.b2b.widgets.companyCard.presentation;

import Ae.w0;
import Sc.r;
import Sc.s;
import Wc.a;
import com.google.protobuf.DescriptorProtos$FileOptions;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.U;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.j;
import kotlin.jvm.functions.Function2;
import retrofit2.Response;
import ru.ozon.app.android.fresh.feature.b2b.widgets.companyCard.data.ActionResponseDTO;
import ru.ozon.app.android.fresh.feature.b2b.widgets.companyCard.data.CheckCanChangeEmailResponseDTO;
import ru.ozon.app.android.fresh.feature.b2b.widgets.companyCard.data.CompanyCardRepository;
import ru.ozon.app.android.fresh.feature.b2b.widgets.companyCard.data.NotificationResponseDTO;
import ru.ozon.app.android.fresh.feature.b2b.widgets.companyCard.presentation.CompanyCardViewModel;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.data.AtomActionDTO;
import ru.ozon.uni.atoms.data.AtomActionMapperKt;
import ru.ozon.uni.atoms.data.notification.NotificationDTO;
import xe.M;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lxe/M;", "", "<anonymous>", "(Lxe/M;)V"}, k = 3, mv = {2, 0, 0})
@e(c = "ru.ozon.app.android.fresh.feature.b2b.widgets.companyCard.presentation.CompanyCardViewModel$onComposerAction$1", f = "CompanyCardViewModel.kt", l = {DescriptorProtos$FileOptions.OBJC_CLASS_PREFIX_FIELD_NUMBER, 41, DescriptorProtos$FileOptions.RUBY_PACKAGE_FIELD_NUMBER, 49}, m = "invokeSuspend")
/* loaded from: classes12.dex */
final class CompanyCardViewModel$onComposerAction$1 extends j implements Function2<M, d<? super Unit>, Object> {
    final /* synthetic */ AtomAction.ComposerAction $action;
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ CompanyCardViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    CompanyCardViewModel$onComposerAction$1(CompanyCardViewModel companyCardViewModel, AtomAction.ComposerAction composerAction, d<? super CompanyCardViewModel$onComposerAction$1> dVar) {
        super(2, dVar);
        this.this$0 = companyCardViewModel;
        this.$action = composerAction;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d<Unit> create(Object obj, d<?> dVar) {
        CompanyCardViewModel$onComposerAction$1 companyCardViewModel$onComposerAction$1 = new CompanyCardViewModel$onComposerAction$1(this.this$0, this.$action, dVar);
        companyCardViewModel$onComposerAction$1.L$0 = obj;
        return companyCardViewModel$onComposerAction$1;
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x00d8, code lost:
    
        if (r3.emit(r4, r7) == r0) goto L49;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0098, code lost:
    
        if (r8.emit(r5, r7) == r0) goto L49;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x00b8, code lost:
    
        if (r8.emit(r5, r7) == r0) goto L49;
     */
    /* JADX WARN: Removed duplicated region for block: B:17:0x00c3  */
    @Override // kotlin.coroutines.jvm.internal.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Object a11;
        Object obj2;
        ActionResponseDTO actionResponseDTO;
        CheckCanChangeEmailResponseDTO checkCanChangeEmailResponseDTO;
        NotificationDTO notificationBar;
        w0 w0Var;
        w0 w0Var2;
        w0 w0Var3;
        NotificationDTO defaultNotificationDTO;
        CompanyCardRepository companyCardRepository;
        a aVar = a.COROUTINE_SUSPENDED;
        int i11 = this.label;
        try {
        } catch (Throwable th2) {
            r.Companion companion = r.INSTANCE;
            a11 = s.a(th2);
        }
        if (i11 == 0) {
            s.b(obj);
            CompanyCardViewModel companyCardViewModel = this.this$0;
            AtomAction.ComposerAction composerAction = this.$action;
            r.Companion companion2 = r.INSTANCE;
            companyCardRepository = companyCardViewModel.repository;
            String actionName = composerAction.getActionName();
            Map<String, String> params = composerAction.getParams();
            if (params == null) {
                params = U.c();
            }
            this.label = 1;
            obj = companyCardRepository.canChangeEmail(actionName, params, this);
            if (obj == aVar) {
                return aVar;
            }
        } else {
            if (i11 != 1) {
                if (i11 != 2 && i11 != 3) {
                    if (i11 != 4) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    s.b(obj);
                    return Unit.f71690a;
                }
                obj2 = this.L$0;
                s.b(obj);
                CompanyCardViewModel companyCardViewModel2 = this.this$0;
                if (r.b(obj2) != null) {
                    w0Var3 = companyCardViewModel2._actions;
                    defaultNotificationDTO = companyCardViewModel2.getDefaultNotificationDTO();
                    CompanyCardViewModel.Action.ShowNotification showNotification = new CompanyCardViewModel.Action.ShowNotification(defaultNotificationDTO);
                    this.L$0 = obj2;
                    this.label = 4;
                }
                return Unit.f71690a;
            }
            s.b(obj);
        }
        a11 = (Response) obj;
        r.Companion companion3 = r.INSTANCE;
        obj2 = a11;
        CompanyCardViewModel companyCardViewModel3 = this.this$0;
        if (!(obj2 instanceof r.b) && (actionResponseDTO = (ActionResponseDTO) ((Response) obj2).body()) != null && (checkCanChangeEmailResponseDTO = (CheckCanChangeEmailResponseDTO) actionResponseDTO.getData()) != null) {
            AtomActionDTO action = checkCanChangeEmailResponseDTO.getAction();
            if (action != null) {
                AtomAction atomAction = AtomActionMapperKt.toAtomAction(action, null);
                w0Var2 = companyCardViewModel3._actions;
                CompanyCardViewModel.Action.PerformAction performAction = new CompanyCardViewModel.Action.PerformAction(atomAction);
                this.L$0 = obj2;
                this.label = 2;
            } else {
                NotificationResponseDTO notification = checkCanChangeEmailResponseDTO.getNotification();
                if (notification != null && (notificationBar = notification.getNotificationBar()) != null) {
                    w0Var = companyCardViewModel3._actions;
                    CompanyCardViewModel.Action.ShowNotification showNotification2 = new CompanyCardViewModel.Action.ShowNotification(notificationBar);
                    this.L$0 = obj2;
                    this.label = 3;
                }
            }
            return Unit.f71690a;
        }
        CompanyCardViewModel companyCardViewModel22 = this.this$0;
        if (r.b(obj2) != null) {
        }
        return Unit.f71690a;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(M m11, d<? super Unit> dVar) {
        return ((CompanyCardViewModel$onComposerAction$1) create(m11, dVar)).invokeSuspend(Unit.f71690a);
    }
}
