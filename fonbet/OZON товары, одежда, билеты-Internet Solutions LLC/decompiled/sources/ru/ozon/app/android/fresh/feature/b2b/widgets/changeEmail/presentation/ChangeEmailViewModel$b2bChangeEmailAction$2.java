package ru.ozon.app.android.fresh.feature.b2b.widgets.changeEmail.presentation;

import Ae.x0;
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
import retrofit2.Response;
import ru.ozon.app.android.cart.common.dynamicElement.DynamicElementDTO;
import ru.ozon.app.android.fresh.feature.b2b.widgets.changeEmail.domain.ActionResponseDTO;
import ru.ozon.app.android.fresh.feature.b2b.widgets.changeEmail.domain.B2bChangeEmailResponseDTO;
import ru.ozon.app.android.fresh.feature.b2b.widgets.changeEmail.domain.ChangeEmailParamsEncoderKt;
import ru.ozon.app.android.fresh.feature.b2b.widgets.changeEmail.domain.ChangeEmailRepository;
import ru.ozon.app.android.fresh.feature.b2b.widgets.changeEmail.domain.NotificationResponseDTO;
import ru.ozon.app.android.fresh.feature.b2b.widgets.changeEmail.presentation.ChangeEmailViewModel;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.data.notification.NotificationDTO;
import xe.M;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lxe/M;", "", "<anonymous>", "(Lxe/M;)V"}, k = 3, mv = {2, 0, 0})
@e(c = "ru.ozon.app.android.fresh.feature.b2b.widgets.changeEmail.presentation.ChangeEmailViewModel$b2bChangeEmailAction$2", f = "ChangeEmailViewModel.kt", l = {181}, m = "invokeSuspend")
/* loaded from: classes12.dex */
final class ChangeEmailViewModel$b2bChangeEmailAction$2 extends j implements Function2<M, d<? super Unit>, Object> {
    final /* synthetic */ AtomAction.ComposerAction $action;
    final /* synthetic */ String $email;
    final /* synthetic */ Map<String, String> $lexemes;
    final /* synthetic */ String $otpId;
    final /* synthetic */ String $otpValue;
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ ChangeEmailViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ChangeEmailViewModel$b2bChangeEmailAction$2(ChangeEmailViewModel changeEmailViewModel, AtomAction.ComposerAction composerAction, String str, String str2, String str3, Map<String, String> map, d<? super ChangeEmailViewModel$b2bChangeEmailAction$2> dVar) {
        super(2, dVar);
        this.this$0 = changeEmailViewModel;
        this.$action = composerAction;
        this.$otpId = str;
        this.$otpValue = str2;
        this.$email = str3;
        this.$lexemes = map;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d<Unit> create(Object obj, d<?> dVar) {
        ChangeEmailViewModel$b2bChangeEmailAction$2 changeEmailViewModel$b2bChangeEmailAction$2 = new ChangeEmailViewModel$b2bChangeEmailAction$2(this.this$0, this.$action, this.$otpId, this.$otpValue, this.$email, this.$lexemes, dVar);
        changeEmailViewModel$b2bChangeEmailAction$2.L$0 = obj;
        return changeEmailViewModel$b2bChangeEmailAction$2;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x012d  */
    @Override // kotlin.coroutines.jvm.internal.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        ChangeEmailViewModel$b2bChangeEmailAction$2 changeEmailViewModel$b2bChangeEmailAction$2;
        ChangeEmailRepository changeEmailRepository;
        boolean z11;
        Throwable th2;
        Object a11;
        String lexemeOrDefault;
        B2bChangeEmailResponseDTO b2bChangeEmailResponseDTO;
        x0 x0Var;
        String lexemeOrDefault2;
        a aVar = a.COROUTINE_SUSPENDED;
        int i11 = this.label;
        if (i11 == 0) {
            s.b(obj);
            ChangeEmailViewModel changeEmailViewModel = this.this$0;
            AtomAction.ComposerAction composerAction = this.$action;
            String str = this.$otpId;
            String str2 = this.$otpValue;
            String str3 = this.$email;
            try {
                r.Companion companion = r.INSTANCE;
                changeEmailRepository = changeEmailViewModel.repository;
                String actionName = composerAction.getActionName();
                z11 = changeEmailViewModel.commsPermission;
                this.label = 1;
                changeEmailViewModel$b2bChangeEmailAction$2 = this;
                try {
                    obj = changeEmailRepository.sendChangeEmail(actionName, str, str2, str3, z11, changeEmailViewModel$b2bChangeEmailAction$2);
                    if (obj == aVar) {
                        return aVar;
                    }
                } catch (Throwable th3) {
                    th = th3;
                    th2 = th;
                    r.Companion companion2 = r.INSTANCE;
                    a11 = s.a(th2);
                    ChangeEmailViewModel changeEmailViewModel2 = changeEmailViewModel$b2bChangeEmailAction$2.this$0;
                    Map<String, String> map = changeEmailViewModel$b2bChangeEmailAction$2.$lexemes;
                    String str4 = changeEmailViewModel$b2bChangeEmailAction$2.$email;
                    String str5 = changeEmailViewModel$b2bChangeEmailAction$2.$otpId;
                    String str6 = changeEmailViewModel$b2bChangeEmailAction$2.$otpValue;
                    if (!(a11 instanceof r.b)) {
                    }
                    ChangeEmailViewModel changeEmailViewModel3 = changeEmailViewModel$b2bChangeEmailAction$2.this$0;
                    Map<String, String> map2 = changeEmailViewModel$b2bChangeEmailAction$2.$lexemes;
                    if (r.b(a11) != null) {
                    }
                    return Unit.f71690a;
                }
            } catch (Throwable th4) {
                th = th4;
                changeEmailViewModel$b2bChangeEmailAction$2 = this;
                th2 = th;
                r.Companion companion22 = r.INSTANCE;
                a11 = s.a(th2);
                ChangeEmailViewModel changeEmailViewModel22 = changeEmailViewModel$b2bChangeEmailAction$2.this$0;
                Map<String, String> map3 = changeEmailViewModel$b2bChangeEmailAction$2.$lexemes;
                String str42 = changeEmailViewModel$b2bChangeEmailAction$2.$email;
                String str52 = changeEmailViewModel$b2bChangeEmailAction$2.$otpId;
                String str62 = changeEmailViewModel$b2bChangeEmailAction$2.$otpValue;
                if (!(a11 instanceof r.b)) {
                }
                ChangeEmailViewModel changeEmailViewModel32 = changeEmailViewModel$b2bChangeEmailAction$2.this$0;
                Map<String, String> map22 = changeEmailViewModel$b2bChangeEmailAction$2.$lexemes;
                if (r.b(a11) != null) {
                }
                return Unit.f71690a;
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            try {
                s.b(obj);
                changeEmailViewModel$b2bChangeEmailAction$2 = this;
            } catch (Throwable th5) {
                th2 = th5;
                changeEmailViewModel$b2bChangeEmailAction$2 = this;
                r.Companion companion222 = r.INSTANCE;
                a11 = s.a(th2);
                ChangeEmailViewModel changeEmailViewModel222 = changeEmailViewModel$b2bChangeEmailAction$2.this$0;
                Map<String, String> map32 = changeEmailViewModel$b2bChangeEmailAction$2.$lexemes;
                String str422 = changeEmailViewModel$b2bChangeEmailAction$2.$email;
                String str522 = changeEmailViewModel$b2bChangeEmailAction$2.$otpId;
                String str622 = changeEmailViewModel$b2bChangeEmailAction$2.$otpValue;
                if (!(a11 instanceof r.b)) {
                }
                ChangeEmailViewModel changeEmailViewModel322 = changeEmailViewModel$b2bChangeEmailAction$2.this$0;
                Map<String, String> map222 = changeEmailViewModel$b2bChangeEmailAction$2.$lexemes;
                if (r.b(a11) != null) {
                }
                return Unit.f71690a;
            }
        }
        a11 = (Response) obj;
        r.Companion companion3 = r.INSTANCE;
        ChangeEmailViewModel changeEmailViewModel2222 = changeEmailViewModel$b2bChangeEmailAction$2.this$0;
        Map<String, String> map322 = changeEmailViewModel$b2bChangeEmailAction$2.$lexemes;
        String str4222 = changeEmailViewModel$b2bChangeEmailAction$2.$email;
        String str5222 = changeEmailViewModel$b2bChangeEmailAction$2.$otpId;
        String str6222 = changeEmailViewModel$b2bChangeEmailAction$2.$otpValue;
        if (!(a11 instanceof r.b)) {
            Response response = (Response) a11;
            if (response.isSuccessful()) {
                ActionResponseDTO actionResponseDTO = (ActionResponseDTO) response.body();
                if (actionResponseDTO != null && (b2bChangeEmailResponseDTO = (B2bChangeEmailResponseDTO) actionResponseDTO.getData()) != null) {
                    Boolean isSuccess = b2bChangeEmailResponseDTO.isSuccess();
                    Boolean bool = Boolean.TRUE;
                    if (Intrinsics.d(isSuccess, bool)) {
                        NotificationResponseDTO notification = b2bChangeEmailResponseDTO.getNotification();
                        NotificationDTO notificationBar = notification != null ? notification.getNotificationBar() : null;
                        if (notificationBar != null) {
                            changeEmailViewModel2222.emitAction(new ChangeEmailViewModel.Action.ShowNotification(notificationBar));
                            x0Var = changeEmailViewModel2222._emailSet;
                            x0Var.setValue(bool);
                        }
                    } else if (Intrinsics.d(b2bChangeEmailResponseDTO.isOtpExpired(), bool)) {
                        Tc.d builder = new Tc.d();
                        builder.put(Scopes.EMAIL, str4222);
                        builder.put("otpId", str5222);
                        builder.put("otpValue", str6222);
                        Boolean isSuccess2 = b2bChangeEmailResponseDTO.isSuccess();
                        if (isSuccess2 != null) {
                            builder.put("isSuccess", isSuccess2);
                        }
                        builder.put("isOtpExpired", b2bChangeEmailResponseDTO.isOtpExpired());
                        Integer timer = b2bChangeEmailResponseDTO.getTimer();
                        if (timer != null) {
                            builder.put(DynamicElementDTO.TIMER, new Integer(timer.intValue()));
                        }
                        Intrinsics.checkNotNullParameter(builder, "builder");
                        changeEmailViewModel2222.emitAction(new ChangeEmailViewModel.Action.RefreshWithParams(ChangeEmailParamsEncoderKt.toBase64(builder.u())));
                    } else if (b2bChangeEmailResponseDTO.getError() != null) {
                        changeEmailViewModel2222.emitAction(new ChangeEmailViewModel.Action.ShowError(b2bChangeEmailResponseDTO.getError()));
                    }
                }
            } else {
                lexemeOrDefault2 = changeEmailViewModel2222.lexemeOrDefault(map322);
                changeEmailViewModel2222.emitAction(new ChangeEmailViewModel.Action.ShowError(lexemeOrDefault2));
            }
        }
        ChangeEmailViewModel changeEmailViewModel3222 = changeEmailViewModel$b2bChangeEmailAction$2.this$0;
        Map<String, String> map2222 = changeEmailViewModel$b2bChangeEmailAction$2.$lexemes;
        if (r.b(a11) != null) {
            lexemeOrDefault = changeEmailViewModel3222.lexemeOrDefault(map2222);
            changeEmailViewModel3222.emitAction(new ChangeEmailViewModel.Action.ShowError(lexemeOrDefault));
        }
        return Unit.f71690a;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(M m11, d<? super Unit> dVar) {
        return ((ChangeEmailViewModel$b2bChangeEmailAction$2) create(m11, dVar)).invokeSuspend(Unit.f71690a);
    }
}
