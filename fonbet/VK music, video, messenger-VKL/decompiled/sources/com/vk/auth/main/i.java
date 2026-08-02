package com.vk.auth.main;

import com.vk.auth.main.SignUpRouter;
import java.util.List;
import xsna.e43;
import xsna.j5g;

/* compiled from: SignUpStrategy.kt */
/* loaded from: classes.dex */
public final class i {
    public static final List<SignUpRouter.DataScreen> b = e43.l(SignUpRouter.DataScreen.AGREEMENT, SignUpRouter.DataScreen.PHONE, SignUpRouter.DataScreen.EMAIL, SignUpRouter.DataScreen.NAME, SignUpRouter.DataScreen.PASSWORD);
    public static final i c;
    public final List<SignUpRouter.DataScreen> a;

    /* compiled from: SignUpStrategy.kt */
    public static final class a {
        public final List<? extends SignUpRouter.DataScreen> a;

        public a() {
            List<SignUpRouter.DataScreen> list = i.b;
            this.a = i.b;
        }
    }

    static {
        a aVar = new a();
        if (aVar.a.size() != j5g.S0(aVar.a).size()) {
            throw new IllegalArgumentException("signUpDataScreenOrder should not contain any element twice");
        }
        c = new i(aVar.a);
    }

    public i(List list) {
        this.a = list;
    }
}
