package com.ironsource;

import java.util.HashMap;
import java.util.Map;
import xsna.zcl;

/* renamed from: com.ironsource.f0, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C4305f0 implements InterfaceC4323g0 {
    public static final a b = new a(null);
    private static final String c = "ext_";
    private final Map<String, String> a = new HashMap();

    /* renamed from: com.ironsource.f0$a */
    public static final class a {
        public /* synthetic */ a(zcl zclVar) {
            this();
        }

        private a() {
        }
    }

    @Override // com.ironsource.InterfaceC4323g0
    public void a(HashMap<String, String> hashMap) {
        this.a.putAll(hashMap);
    }

    @Override // com.ironsource.InterfaceC4323g0
    public void b(String str, String str2) {
        this.a.put("ext_".concat(str), str2);
    }

    @Override // com.ironsource.InterfaceC4323g0
    public Map<String, String> get() {
        return this.a;
    }

    @Override // com.ironsource.InterfaceC4323g0
    public void a(String str, String str2) {
        this.a.put(str, str2);
    }
}
