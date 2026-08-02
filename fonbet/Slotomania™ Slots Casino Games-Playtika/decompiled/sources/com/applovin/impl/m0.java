package com.applovin.impl;

import com.applovin.sdk.AppLovinSdkConfiguration;

/* loaded from: classes.dex */
public class m0 {
    private final AppLovinSdkConfiguration.ConsentFlowUserGeography a;

    public m0(AppLovinSdkConfiguration.ConsentFlowUserGeography consentFlowUserGeography) {
        this.a = consentFlowUserGeography;
    }

    protected boolean a(Object obj) {
        return obj instanceof m0;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof m0)) {
            return false;
        }
        m0 m0Var = (m0) obj;
        if (!m0Var.a(this)) {
            return false;
        }
        AppLovinSdkConfiguration.ConsentFlowUserGeography a = a();
        AppLovinSdkConfiguration.ConsentFlowUserGeography a2 = m0Var.a();
        return a != null ? a.equals(a2) : a2 == null;
    }

    public int hashCode() {
        AppLovinSdkConfiguration.ConsentFlowUserGeography a = a();
        return (a == null ? 43 : a.hashCode()) + 59;
    }

    public String toString() {
        return "CmpAdapterParameters(debugUserGeography=" + a() + ")";
    }

    public AppLovinSdkConfiguration.ConsentFlowUserGeography a() {
        return this.a;
    }
}
