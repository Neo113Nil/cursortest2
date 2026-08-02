package ru.ozon.app.android.cml.delivery.widgets.personalInfoVerification.presentation;

import Ae.x0;
import Sc.r;
import Sc.s;
import Wc.a;
import java.util.Map;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.U;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.j;
import kotlin.jvm.functions.Function2;
import ru.ozon.app.android.cml.delivery.widgets.personalInfoVerification.data.PersonalInfoVerificationDTO;
import ru.ozon.app.android.cml.delivery.widgets.personalInfoVerification.presentation.PersonalInfoAsyncUpdateUiState;
import ru.ozon.app.android.composer.widgets.async.data.ComposerAsyncWidgetRepository;
import ru.ozon.app.android.composer.widgets.async.data.api.ComposerAsyncWidgetResponse;
import xe.M;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lxe/M;", "", "<anonymous>", "(Lxe/M;)V"}, k = 3, mv = {2, 0, 0})
@e(c = "ru.ozon.app.android.cml.delivery.widgets.personalInfoVerification.presentation.PersonalInfoVerificationViewModel$updateWidget$1", f = "PersonalInfoVerificationViewModel.kt", l = {83, 92, 95}, m = "invokeSuspend")
/* loaded from: classes11.dex */
final class PersonalInfoVerificationViewModel$updateWidget$1 extends j implements Function2<M, d<? super Unit>, Object> {
    final /* synthetic */ Map<String, String> $actionParams;
    final /* synthetic */ String $asyncData;
    private /* synthetic */ Object L$0;
    Object L$1;
    int label;
    final /* synthetic */ PersonalInfoVerificationViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    PersonalInfoVerificationViewModel$updateWidget$1(PersonalInfoVerificationViewModel personalInfoVerificationViewModel, String str, Map<String, String> map, d<? super PersonalInfoVerificationViewModel$updateWidget$1> dVar) {
        super(2, dVar);
        this.this$0 = personalInfoVerificationViewModel;
        this.$asyncData = str;
        this.$actionParams = map;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d<Unit> create(Object obj, d<?> dVar) {
        PersonalInfoVerificationViewModel$updateWidget$1 personalInfoVerificationViewModel$updateWidget$1 = new PersonalInfoVerificationViewModel$updateWidget$1(this.this$0, this.$asyncData, this.$actionParams, dVar);
        personalInfoVerificationViewModel$updateWidget$1.L$0 = obj;
        return personalInfoVerificationViewModel$updateWidget$1;
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x008a, code lost:
    
        if (r14 == r1) goto L40;
     */
    /* JADX WARN: Removed duplicated region for block: B:10:0x00ad  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x007f  */
    @Override // kotlin.coroutines.jvm.internal.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Throwable th2;
        PersonalInfoVerificationViewModel$updateWidget$1 personalInfoVerificationViewModel$updateWidget$1;
        Object a11;
        Object obj2;
        Object handleAsyncUpdate;
        Throwable b11;
        x0 x0Var;
        Throwable th3;
        ComposerAsyncWidgetRepository composerAsyncWidgetRepository;
        a aVar = a.COROUTINE_SUSPENDED;
        int i11 = this.label;
        try {
        } catch (Throwable th4) {
            th2 = th4;
            personalInfoVerificationViewModel$updateWidget$1 = this;
        }
        if (i11 == 0) {
            s.b(obj);
            PersonalInfoVerificationViewModel personalInfoVerificationViewModel = this.this$0;
            String str = this.$asyncData;
            Map<String, String> map = this.$actionParams;
            try {
                r.Companion companion = r.INSTANCE;
                composerAsyncWidgetRepository = personalInfoVerificationViewModel.asyncWidgetRepository;
                if (map == null) {
                    map = U.c();
                }
                Map i12 = U.i(new Pair("extraBody", map));
                this.label = 1;
                personalInfoVerificationViewModel$updateWidget$1 = this;
                try {
                    obj = ComposerAsyncWidgetRepository.DefaultImpls.fetchWidget$default(composerAsyncWidgetRepository, str, i12, PersonalInfoVerificationDTO.class, null, personalInfoVerificationViewModel$updateWidget$1, 8, null);
                } catch (Throwable th5) {
                    th = th5;
                    th2 = th;
                    r.Companion companion2 = r.INSTANCE;
                    a11 = s.a(th2);
                    obj2 = a11;
                    PersonalInfoVerificationViewModel personalInfoVerificationViewModel2 = personalInfoVerificationViewModel$updateWidget$1.this$0;
                    if (!(obj2 instanceof r.b)) {
                    }
                    PersonalInfoVerificationViewModel personalInfoVerificationViewModel3 = personalInfoVerificationViewModel$updateWidget$1.this$0;
                    b11 = r.b(obj2);
                    if (b11 != null) {
                    }
                    return Unit.f71690a;
                }
            } catch (Throwable th6) {
                th = th6;
                personalInfoVerificationViewModel$updateWidget$1 = this;
                th2 = th;
                r.Companion companion22 = r.INSTANCE;
                a11 = s.a(th2);
                obj2 = a11;
                PersonalInfoVerificationViewModel personalInfoVerificationViewModel22 = personalInfoVerificationViewModel$updateWidget$1.this$0;
                if (!(obj2 instanceof r.b)) {
                }
                PersonalInfoVerificationViewModel personalInfoVerificationViewModel32 = personalInfoVerificationViewModel$updateWidget$1.this$0;
                b11 = r.b(obj2);
                if (b11 != null) {
                }
                return Unit.f71690a;
            }
            if (obj == aVar) {
                return aVar;
            }
        } else {
            if (i11 != 1) {
                if (i11 != 2) {
                    if (i11 != 3) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    th3 = (Throwable) this.L$1;
                    s.b(obj);
                    if (!(th3 instanceof CancellationException)) {
                        throw th3;
                    }
                    Lm0.a.f17149a.e(th3);
                    return Unit.f71690a;
                }
                obj2 = this.L$0;
                s.b(obj);
                personalInfoVerificationViewModel$updateWidget$1 = this;
                PersonalInfoVerificationViewModel personalInfoVerificationViewModel322 = personalInfoVerificationViewModel$updateWidget$1.this$0;
                b11 = r.b(obj2);
                if (b11 != null) {
                    x0Var = personalInfoVerificationViewModel322.uiStateFlow;
                    PersonalInfoAsyncUpdateUiState.Error error = PersonalInfoAsyncUpdateUiState.Error.INSTANCE;
                    personalInfoVerificationViewModel$updateWidget$1.L$0 = obj2;
                    personalInfoVerificationViewModel$updateWidget$1.L$1 = b11;
                    personalInfoVerificationViewModel$updateWidget$1.label = 3;
                    if (x0Var.emit(error, this) != aVar) {
                        th3 = b11;
                        if (!(th3 instanceof CancellationException)) {
                        }
                    }
                    return aVar;
                }
                return Unit.f71690a;
            }
            s.b(obj);
            personalInfoVerificationViewModel$updateWidget$1 = this;
        }
        a11 = (ComposerAsyncWidgetResponse) obj;
        r.Companion companion3 = r.INSTANCE;
        obj2 = a11;
        PersonalInfoVerificationViewModel personalInfoVerificationViewModel222 = personalInfoVerificationViewModel$updateWidget$1.this$0;
        if (!(obj2 instanceof r.b)) {
            personalInfoVerificationViewModel$updateWidget$1.L$0 = obj2;
            personalInfoVerificationViewModel$updateWidget$1.label = 2;
            handleAsyncUpdate = personalInfoVerificationViewModel222.handleAsyncUpdate((ComposerAsyncWidgetResponse) obj2, this);
        }
        PersonalInfoVerificationViewModel personalInfoVerificationViewModel3222 = personalInfoVerificationViewModel$updateWidget$1.this$0;
        b11 = r.b(obj2);
        if (b11 != null) {
        }
        return Unit.f71690a;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(M m11, d<? super Unit> dVar) {
        return ((PersonalInfoVerificationViewModel$updateWidget$1) create(m11, dVar)).invokeSuspend(Unit.f71690a);
    }
}
