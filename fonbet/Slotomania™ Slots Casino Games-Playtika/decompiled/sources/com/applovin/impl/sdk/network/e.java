package com.applovin.impl.sdk.network;

import com.applovin.impl.sdk.l;
import com.applovin.impl.sdk.network.a;
import com.applovin.impl.w4;
import com.applovin.impl.z4;
import java.util.Map;
import org.json.JSONObject;

/* loaded from: classes5.dex */
public class e extends com.applovin.impl.sdk.network.a {
    private String s;
    private boolean t;

    public static class a extends a.C0111a {
        private String r;
        private boolean s;

        public a(l lVar) {
            super(lVar);
            this.h = ((Integer) lVar.a(z4.L2)).intValue();
            this.i = ((Integer) lVar.a(z4.K2)).intValue();
            this.j = ((Integer) lVar.a(z4.X2)).intValue();
        }

        @Override // com.applovin.impl.sdk.network.a.C0111a
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public a a(String str) {
            this.c = str;
            return this;
        }

        @Override // com.applovin.impl.sdk.network.a.C0111a
        /* renamed from: e, reason: merged with bridge method [inline-methods] */
        public a b(int i) {
            this.j = i;
            return this;
        }

        @Override // com.applovin.impl.sdk.network.a.C0111a
        /* renamed from: f, reason: merged with bridge method [inline-methods] */
        public a b(String str) {
            this.b = str;
            return this;
        }

        @Override // com.applovin.impl.sdk.network.a.C0111a
        /* renamed from: g, reason: merged with bridge method [inline-methods] */
        public a c(String str) {
            this.a = str;
            return this;
        }

        public a h(boolean z) {
            this.s = z;
            return this;
        }

        @Override // com.applovin.impl.sdk.network.a.C0111a
        /* renamed from: i, reason: merged with bridge method [inline-methods] */
        public a b(boolean z) {
            this.p = z;
            return this;
        }

        @Override // com.applovin.impl.sdk.network.a.C0111a
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public a b(Map map) {
            this.d = map;
            return this;
        }

        public a e(String str) {
            this.r = str;
            return this;
        }

        @Override // com.applovin.impl.sdk.network.a.C0111a
        /* renamed from: f, reason: merged with bridge method [inline-methods] */
        public a c(int i) {
            this.i = i;
            return this;
        }

        @Override // com.applovin.impl.sdk.network.a.C0111a
        /* renamed from: g, reason: merged with bridge method [inline-methods] */
        public a a(boolean z) {
            this.n = z;
            return this;
        }

        @Override // com.applovin.impl.sdk.network.a.C0111a
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public a a(Map map) {
            this.e = map;
            return this;
        }

        @Override // com.applovin.impl.sdk.network.a.C0111a
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public a a(int i) {
            this.h = i;
            return this;
        }

        @Override // com.applovin.impl.sdk.network.a.C0111a
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public a a(JSONObject jSONObject) {
            this.f = jSONObject;
            return this;
        }

        @Override // com.applovin.impl.sdk.network.a.C0111a
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public a a(Object obj) {
            this.g = obj;
            return this;
        }

        @Override // com.applovin.impl.sdk.network.a.C0111a
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public a a(w4.a aVar) {
            this.q = aVar;
            return this;
        }

        @Override // com.applovin.impl.sdk.network.a.C0111a
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public e a() {
            return new e(this);
        }
    }

    protected e(a aVar) {
        super(aVar);
        this.s = aVar.r;
        this.t = aVar.s;
    }

    public static a b(l lVar) {
        return new a(lVar);
    }

    public String s() {
        return this.s;
    }

    public boolean t() {
        return this.s != null;
    }

    public boolean u() {
        return this.t;
    }
}
