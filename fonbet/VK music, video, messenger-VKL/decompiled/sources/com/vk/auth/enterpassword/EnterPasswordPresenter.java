package com.vk.auth.enterpassword;

import com.vk.auth.main.AuthStatSender;
import com.vk.auth.main.SignUpDataHolder;
import com.vk.superapp.api.dto.account.AccountCheckPasswordResponse;
import com.vk.superapp.core.api.models.SignUpParams;
import io.reactivex.rxjava3.disposables.c;
import xsna.e0a;
import xsna.p66;
import xsna.yop;

/* compiled from: EnterPasswordPresenter.kt */
/* loaded from: classes15.dex */
public final class EnterPasswordPresenter extends p66<yop> {
    public c A;
    public boolean B;
    public final int C;
    public String x;
    public String y;
    public final e0a z;

    /* compiled from: EnterPasswordPresenter.kt */
    public static final class PasswordEqualityException extends IllegalStateException {
    }

    /* compiled from: EnterPasswordPresenter.kt */
    public static final class PasswordIsTooShortException extends IllegalStateException {
        private final int minLength;

        public PasswordIsTooShortException(int i) {
            this.minLength = i;
        }
    }

    /* compiled from: EnterPasswordPresenter.kt */
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[AccountCheckPasswordResponse.SecurityLevel.values().length];
            try {
                iArr[AccountCheckPasswordResponse.SecurityLevel.ERROR.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[AccountCheckPasswordResponse.SecurityLevel.INVALID.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[AccountCheckPasswordResponse.SecurityLevel.NORMAL.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[AccountCheckPasswordResponse.SecurityLevel.OK.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public EnterPasswordPresenter() {
        SignUpDataHolder signUpDataHolder = this.p;
        String str = (signUpDataHolder != null ? signUpDataHolder : null).n;
        str = str == null ? "" : str;
        this.x = str;
        this.y = str;
        this.z = new e0a(signUpDataHolder != null ? signUpDataHolder : null);
        SignUpParams signUpParams = (signUpDataHolder == null ? null : signUpDataHolder).J;
        this.C = signUpParams != null ? signUpParams.b : 8;
    }

    @Override // xsna.p66, xsna.z55
    public final void e() {
        super.e();
        c cVar = this.A;
        if (cVar != null) {
            cVar.dispose();
        }
    }

    @Override // xsna.z55
    public final AuthStatSender.Screen g0() {
        return AuthStatSender.Screen.PASSWORD;
    }
}
