package com.applovin.impl;

import com.applovin.impl.d5;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import org.json.JSONObject;

/* loaded from: classes4.dex */
public class f5 extends m3 {
    private final c3 k;

    public f5(c3 c3Var, JSONObject jSONObject, JSONObject jSONObject2, com.applovin.impl.sdk.l lVar) {
        super(c3Var.e(), jSONObject, jSONObject2, lVar);
        this.k = c3Var;
    }

    public boolean A() {
        return a("use_cached_adapter", Boolean.TRUE).booleanValue();
    }

    public d5.b t() {
        return d5.b.values()[a("signal_cache_level", ((Integer) this.a.a(t3.b8)).intValue())];
    }

    @Override // com.applovin.impl.m3
    public String toString() {
        return "SignalProviderSpec{adObject=" + a() + AbstractJsonLexerKt.END_OBJ;
    }

    public c3 u() {
        return this.k;
    }

    public long v() {
        return a("signal_expiration_ms", ((Long) this.a.a(t3.a8)).longValue());
    }

    public boolean w() {
        return a("only_collect_signal_when_initialized", Boolean.FALSE).booleanValue();
    }

    public boolean x() {
        return a("prefer_collect_signal_when_initialized", Boolean.TRUE).booleanValue();
    }

    public boolean y() {
        return a("fail_collection_for_empty_signal", (Boolean) this.a.a(t3.K8)).booleanValue();
    }

    public boolean z() {
        return a("ignore_init_failure", Boolean.FALSE).booleanValue();
    }
}
