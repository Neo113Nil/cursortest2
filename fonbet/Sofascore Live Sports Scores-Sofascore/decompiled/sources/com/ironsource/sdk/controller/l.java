package com.ironsource.sdk.controller;

import android.app.Activity;
import android.content.Context;
import com.ironsource.C4197m8;
import com.ironsource.InterfaceC4247p4;
import com.ironsource.InterfaceC4265q4;
import com.ironsource.InterfaceC4282r4;
import com.ironsource.Lb;
import com.ironsource.Q4;
import com.ironsource.sdk.controller.f;
import java.util.Map;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes4.dex */
public interface l {

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    public interface a {
        void a(@NotNull f.a aVar);
    }

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    public interface b {
        void a(@NotNull Lb lb);
    }

    void a();

    void a(Activity activity);

    void a(Context context);

    void a(Q4 q4);

    void a(Q4 q4, Map<String, String> map, InterfaceC4247p4 interfaceC4247p4);

    void a(Q4 q4, Map<String, String> map, InterfaceC4265q4 interfaceC4265q4);

    void a(f.c cVar, @Nullable a aVar);

    void a(String str, InterfaceC4265q4 interfaceC4265q4);

    void a(String str, String str2, Q4 q4, InterfaceC4247p4 interfaceC4247p4);

    void a(String str, String str2, Q4 q4, InterfaceC4265q4 interfaceC4265q4);

    void a(String str, String str2, Q4 q4, InterfaceC4282r4 interfaceC4282r4);

    void a(JSONObject jSONObject);

    void a(JSONObject jSONObject, InterfaceC4247p4 interfaceC4247p4);

    void a(JSONObject jSONObject, InterfaceC4265q4 interfaceC4265q4);

    void a(JSONObject jSONObject, InterfaceC4282r4 interfaceC4282r4);

    boolean a(String str);

    void b();

    void b(Context context);

    void b(Q4 q4);

    void b(Q4 q4, Map<String, String> map, InterfaceC4265q4 interfaceC4265q4);

    void b(JSONObject jSONObject);

    void e();

    @Deprecated
    void f();

    void g();

    C4197m8.c h();
}
