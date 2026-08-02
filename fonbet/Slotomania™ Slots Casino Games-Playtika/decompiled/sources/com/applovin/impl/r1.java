package com.applovin.impl;

import com.facebook.internal.AnalyticsEvents;

/* loaded from: classes3.dex */
public class r1 {
    private final long a;
    private String b;
    private a3 c;
    private com.applovin.impl.sdk.ad.b d;

    public r1(Object obj, long j) {
        this.a = j;
        if (obj instanceof com.applovin.impl.sdk.ad.b) {
            com.applovin.impl.sdk.ad.b bVar = (com.applovin.impl.sdk.ad.b) obj;
            this.d = bVar;
            this.b = bVar.getAdZone().d() != null ? this.d.getAdZone().d().getLabel() : null;
        } else if (obj instanceof a3) {
            a3 a3Var = (a3) obj;
            this.c = a3Var;
            this.b = a3Var.getFormat().getLabel();
        }
    }

    public void a(Object obj) {
        if (obj instanceof com.applovin.impl.sdk.ad.b) {
            this.d = (com.applovin.impl.sdk.ad.b) obj;
        } else if (obj instanceof a3) {
            this.c = (a3) obj;
        }
    }

    public long b() {
        return this.a;
    }

    public com.applovin.impl.sdk.ad.b c() {
        return this.d;
    }

    public String d() {
        String str = this.b;
        return str != null ? str : AnalyticsEvents.PARAMETER_DIALOG_OUTCOME_VALUE_UNKNOWN;
    }

    public a3 e() {
        return this.c;
    }

    public String f() {
        if (this.d != null) {
            return "AppLovin";
        }
        a3 a3Var = this.c;
        return a3Var != null ? a3Var.getNetworkName() : AnalyticsEvents.PARAMETER_DIALOG_OUTCOME_VALUE_UNKNOWN;
    }

    public Object a() {
        com.applovin.impl.sdk.ad.b bVar = this.d;
        return bVar != null ? bVar : this.c;
    }
}
