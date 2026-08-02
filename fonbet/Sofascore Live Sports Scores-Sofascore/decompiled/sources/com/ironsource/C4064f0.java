package com.ironsource;

import java.util.HashMap;
import java.util.Map;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* renamed from: com.ironsource.f0, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C4064f0 implements InterfaceC4082g0 {

    @NotNull
    public static final a b = new a(null);

    @NotNull
    private static final String c = "ext_";

    @NotNull
    private final Map<String, String> a = new HashMap();

    @Override // com.ironsource.InterfaceC4082g0
    public void a(@NotNull String str, @NotNull String str2) {
        str.getClass();
        str2.getClass();
        this.a.put(str, str2);
    }

    @Override // com.ironsource.InterfaceC4082g0
    public void b(@NotNull String str, @NotNull String str2) {
        str.getClass();
        str2.getClass();
        this.a.put("ext_" + str, str2);
    }

    @Override // com.ironsource.InterfaceC4082g0
    @NotNull
    public Map<String, String> get() {
        return this.a;
    }

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    /* renamed from: com.ironsource.f0$a */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    @Override // com.ironsource.InterfaceC4082g0
    public void a(@NotNull HashMap<String, String> hashMap) {
        hashMap.getClass();
        this.a.putAll(hashMap);
    }
}
