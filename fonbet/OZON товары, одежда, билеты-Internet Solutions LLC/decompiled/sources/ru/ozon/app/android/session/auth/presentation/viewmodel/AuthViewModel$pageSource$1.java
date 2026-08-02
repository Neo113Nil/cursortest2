package ru.ozon.app.android.session.auth.presentation.viewmodel;

import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.collections.C7714v;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.app.android.session.auth.data.AuthVO;

@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\u0010\u0000\u001a\"\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003 \u0004*\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00010\u00012\u0006\u0010\u0005\u001a\u00020\u0003H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"<anonymous>", "Lkotlin/Pair;", "Lru/ozon/app/android/session/auth/data/AuthVO;", "", "kotlin.jvm.PlatformType", "silent", "invoke", "(Z)Lkotlin/Pair;"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
final class AuthViewModel$pageSource$1 extends AbstractC7737t implements Function1<Boolean, Pair<? extends AuthVO, ? extends Boolean>> {
    final /* synthetic */ AuthViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    AuthViewModel$pageSource$1(AuthViewModel authViewModel) {
        super(1);
        this.this$0 = authViewModel;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Pair<? extends AuthVO, ? extends Boolean> invoke(Boolean bool) {
        return invoke(bool.booleanValue());
    }

    public final Pair<AuthVO, Boolean> invoke(boolean z11) {
        AuthVO authVO;
        AuthVO authVO2;
        AuthVO copy;
        ConcurrentHashMap concurrentHashMap;
        AuthVO.Input copy$default;
        authVO = this.this$0.page;
        if (authVO == null) {
            Intrinsics.n("page");
            throw null;
        }
        authVO2 = this.this$0.page;
        if (authVO2 == null) {
            Intrinsics.n("page");
            throw null;
        }
        List<AuthVO.Input> inputs = authVO2.getInputs();
        AuthViewModel authViewModel = this.this$0;
        ArrayList arrayList = new ArrayList(C7714v.z(inputs, 10));
        for (AuthVO.Input input : inputs) {
            concurrentHashMap = authViewModel.changedValues;
            AuthVO.Input input2 = (AuthVO.Input) concurrentHashMap.get(input.getName());
            if (input2 != null && (copy$default = AuthVO.Input.copy$default(input, null, null, null, null, input2.getValue(), input2.getError(), input2.getRequestFocus(), 0, false, 399, null)) != null) {
                input = copy$default;
            }
            arrayList.add(input);
        }
        ArrayList arrayList2 = new ArrayList();
        for (Object obj : arrayList) {
            if (((AuthVO.Input) obj).getIsVisible()) {
                arrayList2.add(obj);
            }
        }
        copy = authVO.copy((r29 & 1) != 0 ? authVO.id : 0L, (r29 & 2) != 0 ? authVO.title : null, (r29 & 4) != 0 ? authVO.subtitle : null, (r29 & 8) != 0 ? authVO.origin : null, (r29 & 16) != 0 ? authVO.inputs : arrayList2, (r29 & 32) != 0 ? authVO.advertisement : null, (r29 & 64) != 0 ? authVO.submitButton : null, (r29 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0 ? authVO.hintButtons : null, (r29 & 256) != 0 ? authVO.loginBySberIdButton : null, (r29 & UserVerificationMethods.USER_VERIFY_NONE) != 0 ? authVO.alertEntry : null, (r29 & UserVerificationMethods.USER_VERIFY_ALL) != 0 ? authVO.annotation : null, (r29 & 2048) != 0 ? authVO.termsOfUseText : null, (r29 & 4096) != 0 ? authVO.translationLexemes : null);
        return new Pair<>(copy, Boolean.valueOf(z11));
    }
}
