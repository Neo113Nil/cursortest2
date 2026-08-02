package ru.ozon.app.android.fresh.feature.b2b.widgets.changeEmail.presentation;

import Sc.r;
import Sc.s;
import Wc.a;
import com.google.android.gms.common.Scopes;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.j;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.h;
import retrofit2.Response;
import ru.ozon.app.android.cart.common.dynamicElement.DynamicElementDTO;
import ru.ozon.app.android.fresh.feature.b2b.widgets.changeEmail.domain.ActionResponseDTO;
import ru.ozon.app.android.fresh.feature.b2b.widgets.changeEmail.domain.B2bGetOtpResponseDTO;
import ru.ozon.app.android.fresh.feature.b2b.widgets.changeEmail.domain.ChangeEmailParamsEncoderKt;
import ru.ozon.app.android.fresh.feature.b2b.widgets.changeEmail.domain.ChangeEmailRepository;
import ru.ozon.app.android.fresh.feature.b2b.widgets.changeEmail.presentation.ChangeEmailViewModel;
import ru.ozon.uni.atoms.af.AtomAction;
import xe.M;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lxe/M;", "", "<anonymous>", "(Lxe/M;)V"}, k = 3, mv = {2, 0, 0})
@e(c = "ru.ozon.app.android.fresh.feature.b2b.widgets.changeEmail.presentation.ChangeEmailViewModel$b2bGetOtpAction$2", f = "ChangeEmailViewModel.kt", l = {135}, m = "invokeSuspend")
/* loaded from: classes12.dex */
final class ChangeEmailViewModel$b2bGetOtpAction$2 extends j implements Function2<M, d<? super Unit>, Object> {
    final /* synthetic */ AtomAction.ComposerAction $action;
    final /* synthetic */ String $email;
    final /* synthetic */ Map<String, String> $lexemes;
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ ChangeEmailViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ChangeEmailViewModel$b2bGetOtpAction$2(ChangeEmailViewModel changeEmailViewModel, AtomAction.ComposerAction composerAction, String str, Map<String, String> map, d<? super ChangeEmailViewModel$b2bGetOtpAction$2> dVar) {
        super(2, dVar);
        this.this$0 = changeEmailViewModel;
        this.$action = composerAction;
        this.$email = str;
        this.$lexemes = map;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d<Unit> create(Object obj, d<?> dVar) {
        ChangeEmailViewModel$b2bGetOtpAction$2 changeEmailViewModel$b2bGetOtpAction$2 = new ChangeEmailViewModel$b2bGetOtpAction$2(this.this$0, this.$action, this.$email, this.$lexemes, dVar);
        changeEmailViewModel$b2bGetOtpAction$2.L$0 = obj;
        return changeEmailViewModel$b2bGetOtpAction$2;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Object a11;
        String lexemeOrDefault;
        ActionResponseDTO actionResponseDTO;
        B2bGetOtpResponseDTO b2bGetOtpResponseDTO;
        Integer w02;
        ChangeEmailRepository changeEmailRepository;
        a aVar = a.COROUTINE_SUSPENDED;
        int i11 = this.label;
        try {
            if (i11 == 0) {
                s.b(obj);
                ChangeEmailViewModel changeEmailViewModel = this.this$0;
                AtomAction.ComposerAction composerAction = this.$action;
                String str = this.$email;
                r.Companion companion = r.INSTANCE;
                changeEmailRepository = changeEmailViewModel.repository;
                String actionName = composerAction.getActionName();
                this.label = 1;
                obj = changeEmailRepository.sendGetOtp(actionName, str, this);
                if (obj == aVar) {
                    return aVar;
                }
            } else {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                s.b(obj);
            }
            a11 = (Response) obj;
            r.Companion companion2 = r.INSTANCE;
        } catch (Throwable th2) {
            r.Companion companion3 = r.INSTANCE;
            a11 = s.a(th2);
        }
        ChangeEmailViewModel changeEmailViewModel2 = this.this$0;
        String str2 = this.$email;
        if (!(a11 instanceof r.b) && (actionResponseDTO = (ActionResponseDTO) ((Response) a11).body()) != null && (b2bGetOtpResponseDTO = (B2bGetOtpResponseDTO) actionResponseDTO.getData()) != null) {
            if (b2bGetOtpResponseDTO.getError() != null) {
                changeEmailViewModel2.emitAction(new ChangeEmailViewModel.Action.ShowError(b2bGetOtpResponseDTO.getError()));
            } else {
                String timer = b2bGetOtpResponseDTO.getTimer();
                if (timer != null && (w02 = h.w0(timer)) != null) {
                    changeEmailViewModel2.startTimer(w02.intValue());
                }
                Tc.d builder = new Tc.d();
                builder.put(Scopes.EMAIL, str2);
                String otpId = b2bGetOtpResponseDTO.getOtpId();
                if (otpId != null) {
                    builder.put("otpId", otpId);
                }
                String timer2 = b2bGetOtpResponseDTO.getTimer();
                if (timer2 != null) {
                    builder.put(DynamicElementDTO.TIMER, timer2);
                }
                Integer otpLength = b2bGetOtpResponseDTO.getOtpLength();
                if (otpLength != null) {
                    builder.put("otpLength", new Integer(otpLength.intValue()));
                }
                Intrinsics.checkNotNullParameter(builder, "builder");
                Tc.d u11 = builder.u();
                changeEmailViewModel2.emailFromParams = str2;
                changeEmailViewModel2.emitAction(new ChangeEmailViewModel.Action.RefreshWithParams(ChangeEmailParamsEncoderKt.toBase64(u11)));
            }
        }
        ChangeEmailViewModel changeEmailViewModel3 = this.this$0;
        Map<String, String> map = this.$lexemes;
        if (r.b(a11) != null) {
            lexemeOrDefault = changeEmailViewModel3.lexemeOrDefault(map);
            changeEmailViewModel3.emitAction(new ChangeEmailViewModel.Action.ShowError(lexemeOrDefault));
        }
        return Unit.f71690a;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(M m11, d<? super Unit> dVar) {
        return ((ChangeEmailViewModel$b2bGetOtpAction$2) create(m11, dVar)).invokeSuspend(Unit.f71690a);
    }
}
