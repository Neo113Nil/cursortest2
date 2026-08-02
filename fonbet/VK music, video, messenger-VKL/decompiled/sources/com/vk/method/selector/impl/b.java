package com.vk.method.selector.impl;

import android.content.Context;
import com.vk.auth.smartflow.api.data.VerificationMethodTypes;
import com.vk.method.selector.impl.a;
import java.util.List;
import xsna.ak20;
import xsna.bpn0;
import xsna.e43;
import xsna.enr0;
import xsna.f2s;
import xsna.otu0;
import xsna.sim;
import xsna.vk20;
import xsna.wj20;

/* compiled from: MethodSelectorPresenter.kt */
/* loaded from: classes3.dex */
public final class b {
    public final ak20 a;
    public String c;
    public boolean d;
    public String e;
    public VerificationMethodTypes f;
    public final Context g;
    public MethodSelectorView h;
    public wj20 i;
    public vk20 k;
    public final enr0 n;
    public final bpn0 b = new bpn0(new sim(this, 20));
    public final f2s j = new f2s(this, 23);
    public final List<VerificationMethodTypes> l = e43.l(VerificationMethodTypes.RESERVE_CODE, VerificationMethodTypes.PASSKEY, VerificationMethodTypes.PASSWORD, VerificationMethodTypes.CODEGEN);
    public final io.reactivex.rxjava3.disposables.b m = new io.reactivex.rxjava3.disposables.b();
    public a o = a.c.a;
    public final c p = new c();

    public b(Context context, ak20 ak20Var, otu0 otu0Var) {
        this.a = ak20Var;
        this.g = context.getApplicationContext();
        this.n = new enr0(context);
    }
}
