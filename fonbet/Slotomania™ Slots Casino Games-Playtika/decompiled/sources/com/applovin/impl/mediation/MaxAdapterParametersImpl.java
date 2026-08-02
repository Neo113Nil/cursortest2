package com.applovin.impl.mediation;

import android.os.Bundle;
import com.applovin.impl.a3;
import com.applovin.impl.f5;
import com.applovin.impl.m3;
import com.applovin.mediation.MaxAdFormat;
import com.applovin.mediation.adapter.parameters.MaxAdapterInitializationParameters;
import com.applovin.mediation.adapter.parameters.MaxAdapterResponseParameters;
import com.applovin.mediation.adapter.parameters.MaxAdapterSignalCollectionParameters;
import java.util.Map;

/* loaded from: classes8.dex */
public class MaxAdapterParametersImpl implements MaxAdapterResponseParameters, MaxAdapterSignalCollectionParameters, MaxAdapterInitializationParameters {
    private String a;
    private Map b;
    private Bundle c;
    private Bundle d;
    private Boolean e;
    private Boolean f;
    private String g;
    private boolean h;
    private String i;
    private String j;
    private long k;
    private MaxAdFormat l;

    private MaxAdapterParametersImpl() {
    }

    static MaxAdapterParametersImpl a(a3 a3Var) {
        MaxAdapterParametersImpl a = a((m3) a3Var);
        a.i = a3Var.U();
        a.j = a3Var.E();
        a.k = a3Var.D();
        return a;
    }

    @Override // com.applovin.mediation.adapter.parameters.MaxAdapterSignalCollectionParameters
    public MaxAdFormat getAdFormat() {
        return this.l;
    }

    @Override // com.applovin.mediation.adapter.parameters.MaxAdapterParameters
    public String getAdUnitId() {
        return this.a;
    }

    @Override // com.applovin.mediation.adapter.parameters.MaxAdapterResponseParameters
    public long getBidExpirationMillis() {
        return this.k;
    }

    @Override // com.applovin.mediation.adapter.parameters.MaxAdapterResponseParameters
    public String getBidResponse() {
        return this.j;
    }

    @Override // com.applovin.mediation.adapter.parameters.MaxAdapterParameters
    public String getConsentString() {
        return this.g;
    }

    @Override // com.applovin.mediation.adapter.parameters.MaxAdapterParameters
    public Bundle getCustomParameters() {
        return this.d;
    }

    @Override // com.applovin.mediation.adapter.parameters.MaxAdapterParameters
    public Map<String, Object> getLocalExtraParameters() {
        return this.b;
    }

    @Override // com.applovin.mediation.adapter.parameters.MaxAdapterParameters
    public Bundle getServerParameters() {
        return this.c;
    }

    @Override // com.applovin.mediation.adapter.parameters.MaxAdapterResponseParameters
    public String getThirdPartyAdPlacementId() {
        return this.i;
    }

    @Override // com.applovin.mediation.adapter.parameters.MaxAdapterParameters
    public Boolean hasUserConsent() {
        return this.e;
    }

    @Override // com.applovin.mediation.adapter.parameters.MaxAdapterParameters
    public Boolean isAgeRestrictedUser() {
        return null;
    }

    @Override // com.applovin.mediation.adapter.parameters.MaxAdapterParameters
    public Boolean isDoNotSell() {
        return this.f;
    }

    @Override // com.applovin.mediation.adapter.parameters.MaxAdapterParameters
    public boolean isTesting() {
        return this.h;
    }

    static MaxAdapterParametersImpl a(f5 f5Var, String str, MaxAdFormat maxAdFormat) {
        MaxAdapterParametersImpl a = a(f5Var);
        a.a = str;
        a.l = maxAdFormat;
        return a;
    }

    static MaxAdapterParametersImpl a(m3 m3Var) {
        MaxAdapterParametersImpl maxAdapterParametersImpl = new MaxAdapterParametersImpl();
        maxAdapterParametersImpl.a = m3Var.getAdUnitId();
        maxAdapterParametersImpl.e = m3Var.n();
        maxAdapterParametersImpl.f = m3Var.o();
        maxAdapterParametersImpl.g = m3Var.d();
        maxAdapterParametersImpl.b = m3Var.i();
        maxAdapterParametersImpl.c = m3Var.l();
        maxAdapterParametersImpl.d = m3Var.f();
        maxAdapterParametersImpl.h = m3Var.p();
        return maxAdapterParametersImpl;
    }
}
