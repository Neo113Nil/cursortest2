package com.fyber.inneractive.sdk.config;

import android.text.TextUtils;
import com.fyber.inneractive.sdk.external.InvalidAppIdException;
import com.fyber.inneractive.sdk.network.i1;
import com.fyber.inneractive.sdk.network.k1;
import com.fyber.inneractive.sdk.util.IAlog;
import java.io.FileNotFoundException;

/* loaded from: classes12.dex */
public final class b0 implements com.fyber.inneractive.sdk.network.f0 {
    public final /* synthetic */ IAConfigManager a;

    public b0(IAConfigManager iAConfigManager) {
        this.a = iAConfigManager;
    }

    @Override // com.fyber.inneractive.sdk.network.f0
    public final void a(Object obj, Exception exc, boolean z) {
        int i;
        h0 h0Var = (h0) obj;
        if (h0Var != null) {
            if (z) {
                IAConfigManager iAConfigManager = this.a;
                IAConfigManager iAConfigManager2 = IAConfigManager.N;
                iAConfigManager.getClass();
                iAConfigManager.e = h0Var.c;
                iAConfigManager.d = h0Var.b;
                iAConfigManager.a = h0Var.d;
                iAConfigManager.b = h0Var.e;
            } else {
                IAConfigManager.O = System.currentTimeMillis();
                IAConfigManager iAConfigManager3 = this.a;
                iAConfigManager3.getClass();
                IAlog.a("Got new remote configuration from server:", new Object[0]);
                iAConfigManager3.e = h0Var.c;
                iAConfigManager3.d = h0Var.b;
                iAConfigManager3.a = h0Var.d;
                iAConfigManager3.b = h0Var.e;
            }
        } else if (exc instanceof com.fyber.inneractive.sdk.network.g) {
            IAConfigManager.O = System.currentTimeMillis();
        }
        if (z) {
            return;
        }
        IAConfigManager iAConfigManager4 = this.a;
        IAConfigManager iAConfigManager5 = IAConfigManager.N;
        if (iAConfigManager5.e != null) {
            iAConfigManager4.a(true, null);
        } else {
            iAConfigManager4.getClass();
            if ((exc instanceof InvalidAppIdException) || (exc instanceof FileNotFoundException) || (!(exc instanceof k1) ? !TextUtils.isEmpty(iAConfigManager4.c.trim()) : (i = ((k1) exc).a) < 400 || i >= 500)) {
                iAConfigManager4.a(false, new InvalidAppIdException());
            } else if (exc instanceof com.fyber.inneractive.sdk.network.b) {
                iAConfigManager4.a(false, exc);
            } else {
                iAConfigManager4.a(false, new i0());
            }
        }
        if (iAConfigManager5.e != null) {
            IAConfigManager iAConfigManager6 = this.a;
            if (iAConfigManager6.B == null) {
                iAConfigManager6.B = new com.fyber.inneractive.sdk.network.v0(new e0(iAConfigManager6), iAConfigManager6.f, new com.fyber.inneractive.sdk.config.global.m());
            }
            i1 i1Var = iAConfigManager6.B.f;
            if (i1Var == i1.RUNNING || i1Var == i1.QUEUED) {
                return;
            }
            iAConfigManager5.r.a(iAConfigManager6.B);
        }
    }
}
