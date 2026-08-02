package com.vk.qrcode;

import com.vk.qrcode.d;
import kotlin.Pair;
import xsna.dw20;
import xsna.gzs;
import xsna.hz20;
import xsna.s3q0;

/* compiled from: QRViewUtils.kt */
/* loaded from: classes5.dex */
public final class e implements hz20 {
    public final /* synthetic */ Pair<String, gzs<s3q0>> b;
    public final /* synthetic */ d.a c;
    public final /* synthetic */ Pair<String, gzs<s3q0>> d;
    public final /* synthetic */ d.a e;

    /* JADX WARN: Multi-variable type inference failed */
    public e(Pair<String, ? extends gzs<s3q0>> pair, d.a aVar, Pair<String, ? extends gzs<s3q0>> pair2, d.a aVar2) {
        this.b = pair;
        this.c = aVar;
        this.d = pair2;
        this.e = aVar2;
    }

    @Override // xsna.hz20
    public final void a(int i) {
        dw20 dw20Var;
        gzs<s3q0> gzsVar;
        dw20 dw20Var2;
        gzs<s3q0> gzsVar2;
        dw20 dw20Var3;
        gzs<s3q0> j;
        dw20 dw20Var4;
        gzs<s3q0> j2;
        d.a aVar = this.e;
        if (i == -5) {
            if (aVar != null && (gzsVar = aVar.b) != null) {
                gzsVar.invoke();
            }
            if ((aVar == null || !aVar.c) && (dw20Var = d.k) != null) {
                dw20Var.dismiss();
                return;
            }
            return;
        }
        d.a aVar2 = this.c;
        if (i == -4) {
            if (aVar2 != null && (gzsVar2 = aVar2.b) != null) {
                gzsVar2.invoke();
            }
            if ((aVar2 == null || !aVar2.c) && (dw20Var2 = d.k) != null) {
                dw20Var2.dismiss();
                return;
            }
            return;
        }
        if (i == -2) {
            Pair<String, gzs<s3q0>> pair = this.d;
            if (pair != null && (j = pair.j()) != null) {
                j.invoke();
            }
            if (aVar != null || (dw20Var3 = d.k) == null) {
                return;
            }
            dw20Var3.dismiss();
            return;
        }
        if (i != -1) {
            return;
        }
        Pair<String, gzs<s3q0>> pair2 = this.b;
        if (pair2 != null && (j2 = pair2.j()) != null) {
            j2.invoke();
        }
        if (aVar2 != null || (dw20Var4 = d.k) == null) {
            return;
        }
        dw20Var4.dismiss();
    }
}
