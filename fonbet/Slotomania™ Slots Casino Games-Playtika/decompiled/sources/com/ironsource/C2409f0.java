package com.ironsource;

import java.util.HashMap;
import java.util.Map;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.ironsource.f0, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C2409f0 implements InterfaceC2427g0 {
    public static final a b = new a(null);
    private static final String c = "ext_";
    private final Map<String, String> a = new HashMap();

    /* renamed from: com.ironsource.f0$a */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    @Override // com.ironsource.InterfaceC2427g0
    public void a(HashMap<String, String> params) {
        Intrinsics.checkNotNullParameter(params, "params");
        this.a.putAll(params);
    }

    @Override // com.ironsource.InterfaceC2427g0
    public void b(String key, String value) {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(value, "value");
        this.a.put("ext_" + key, value);
    }

    @Override // com.ironsource.InterfaceC2427g0
    public Map<String, String> get() {
        return this.a;
    }

    @Override // com.ironsource.InterfaceC2427g0
    public void a(String key, String value) {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(value, "value");
        this.a.put(key, value);
    }
}
