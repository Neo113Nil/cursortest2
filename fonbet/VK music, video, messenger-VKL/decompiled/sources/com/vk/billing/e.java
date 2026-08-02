package com.vk.billing;

import android.app.Activity;
import com.vkontakte.android.R;
import java.util.ArrayList;
import xsna.ang;
import xsna.h7u0;
import xsna.mge0;
import xsna.nge0;
import xsna.q76;

/* compiled from: InternalPurchasesManagerImpl.kt */
/* loaded from: classes15.dex */
public final class e extends q76 {
    public final /* synthetic */ Activity c;
    public final /* synthetic */ ang.a d;
    public final /* synthetic */ ArrayList e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(Activity activity, ArrayList arrayList, ang.a aVar) {
        super(activity);
        this.c = activity;
        this.d = aVar;
        this.e = arrayList;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // xsna.hx2
    public final void b(Object obj) {
        nge0 nge0Var = (nge0) obj;
        String str = nge0Var.f;
        String str2 = nge0Var.e;
        if (str2.length() > 0 || str.length() > 0) {
            int i = h7u0.p;
            h7u0.a a = h7u0.b.a(this.c);
            a.g0(R.string.error);
            if (str2.length() != 0) {
                str = str2;
            }
            a.a.f = str;
            a.c0(R.string.ok, null);
            a.m();
        }
        int i2 = nge0Var.a;
        ArrayList arrayList = this.e;
        ang.a aVar = this.d;
        if (i2 == 1) {
            aVar.c((mge0) arrayList.get(0), nge0Var);
        } else if (nge0Var.l != null) {
            aVar.c((mge0) arrayList.get(0), nge0Var);
        }
    }
}
