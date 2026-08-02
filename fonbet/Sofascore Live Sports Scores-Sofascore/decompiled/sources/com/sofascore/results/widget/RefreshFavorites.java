package com.sofascore.results.widget;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;
import defpackage.a70;
import defpackage.aba;
import defpackage.auh;
import defpackage.d11;
import defpackage.lu3;
import defpackage.nb;
import defpackage.puf;
import defpackage.pzc;
import defpackage.re0;
import defpackage.rq3;
import defpackage.sq3;
import defpackage.td4;
import defpackage.y6a;
import kotlin.Metadata;
import kotlin.Unit;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/sofascore/results/widget/RefreshFavorites;", "Lnb;", "<init>", "()V", "mobile_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class RefreshFavorites implements nb {
    /* JADX WARN: Code restructure failed: missing block: B:21:0x00ed, code lost:
    
        if (defpackage.td4.y0(r9, r10, r12) == r13) goto L50;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x00db, code lost:
    
        if (defpackage.ml4.u0(r10, r9, r11, r12) == r13) goto L50;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x0098, code lost:
    
        if (defpackage.n4o.y(500, r12) != r13) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x0073, code lost:
    
        if (defpackage.ml4.u0(r10, r11, r9, r12) == r13) goto L50;
     */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0029  */
    @Override // defpackage.nb
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(Context context, re0 re0Var, pzc pzcVar, rq3 rq3Var) {
        puf pufVar;
        lu3 lu3Var;
        int i;
        auh auhVar;
        Context context2;
        re0 re0Var2;
        Context context3;
        NetworkCapabilities networkCapabilities;
        if (rq3Var instanceof puf) {
            pufVar = (puf) rq3Var;
            int i2 = pufVar.v;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                pufVar.v = i2 - Integer.MIN_VALUE;
                Object obj = pufVar.t;
                lu3Var = lu3.a;
                i = pufVar.v;
                int i3 = 0;
                int i4 = 2;
                rq3 rq3Var2 = null;
                if (i != 0) {
                    y6a.M(obj);
                    d11 d11Var = new d11(i4, rq3Var2, 13);
                    pufVar.r = context;
                    pufVar.s = re0Var;
                    pufVar.v = 1;
                } else if (i == 1) {
                    re0Var = pufVar.s;
                    context = pufVar.r;
                    y6a.M(obj);
                } else if (i == 2) {
                    re0Var2 = pufVar.s;
                    context2 = pufVar.r;
                    y6a.M(obj);
                    pufVar.r = context2;
                    pufVar.s = re0Var2;
                    pufVar.v = 3;
                } else if (i == 3) {
                    re0Var2 = pufVar.s;
                    context2 = pufVar.r;
                    y6a.M(obj);
                    re0 re0Var3 = re0Var2;
                    context3 = context2;
                    Object systemService = context3.getSystemService("connectivity");
                    systemService.getClass();
                    ConnectivityManager connectivityManager = (ConnectivityManager) systemService;
                    Network activeNetwork = connectivityManager.getActiveNetwork();
                    if (activeNetwork != null && (networkCapabilities = connectivityManager.getNetworkCapabilities(activeNetwork)) != null && networkCapabilities.hasCapability(12) && networkCapabilities.hasCapability(16)) {
                        aba.E(context3);
                        return Unit.a;
                    }
                    d11 d11Var2 = new d11(i4, rq3Var2, 14);
                    pufVar.r = context3;
                    pufVar.s = null;
                    pufVar.v = 4;
                } else {
                    if (i != 4) {
                        if (i == 5) {
                            y6a.M(obj);
                            return Unit.a;
                        }
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    context3 = pufVar.r;
                    y6a.M(obj);
                    auh auhVar2 = new auh(i3);
                    pufVar.r = null;
                    pufVar.s = null;
                    pufVar.v = 5;
                }
                auhVar = new auh(i3);
                pufVar.r = context;
                pufVar.s = re0Var;
                pufVar.v = 2;
                if (td4.y0(auhVar, context, pufVar) != lu3Var) {
                    re0 re0Var4 = re0Var;
                    context2 = context;
                    re0Var2 = re0Var4;
                    pufVar.r = context2;
                    pufVar.s = re0Var2;
                    pufVar.v = 3;
                }
                return lu3Var;
            }
        }
        pufVar = new puf(this, (sq3) rq3Var);
        Object obj2 = pufVar.t;
        lu3Var = lu3.a;
        i = pufVar.v;
        int i32 = 0;
        int i42 = 2;
        rq3 rq3Var22 = null;
        if (i != 0) {
        }
        auhVar = new auh(i32);
        pufVar.r = context;
        pufVar.s = re0Var;
        pufVar.v = 2;
        if (td4.y0(auhVar, context, pufVar) != lu3Var) {
        }
        return lu3Var;
    }
}
