package com.ironsource.sdk.controller;

import android.app.Activity;
import android.content.Context;
import com.ironsource.C2578o8;
import com.ironsource.InterfaceC2645s4;
import com.ironsource.InterfaceC2663t4;
import com.ironsource.InterfaceC2681u4;
import com.ironsource.Mb;
import com.ironsource.T4;
import com.ironsource.sdk.controller.f;
import java.util.Map;
import org.json.JSONObject;

/* loaded from: classes8.dex */
public interface l {

    public interface a {
        void a(f.a aVar);
    }

    public interface b {
        void a(Mb mb);
    }

    void a();

    void a(Activity activity);

    void a(Context context);

    void a(T4 t4);

    void a(T4 t4, Map<String, String> map, InterfaceC2645s4 interfaceC2645s4);

    void a(T4 t4, Map<String, String> map, InterfaceC2663t4 interfaceC2663t4);

    void a(f.c cVar, a aVar);

    void a(String str, InterfaceC2663t4 interfaceC2663t4);

    void a(String str, String str2, T4 t4, InterfaceC2645s4 interfaceC2645s4);

    void a(String str, String str2, T4 t4, InterfaceC2663t4 interfaceC2663t4);

    void a(String str, String str2, T4 t4, InterfaceC2681u4 interfaceC2681u4);

    void a(JSONObject jSONObject);

    void a(JSONObject jSONObject, InterfaceC2645s4 interfaceC2645s4);

    void a(JSONObject jSONObject, InterfaceC2663t4 interfaceC2663t4);

    void a(JSONObject jSONObject, InterfaceC2681u4 interfaceC2681u4);

    boolean a(String str);

    void b();

    void b(Context context);

    void b(T4 t4);

    void b(T4 t4, Map<String, String> map, InterfaceC2663t4 interfaceC2663t4);

    void b(JSONObject jSONObject);

    void e();

    @Deprecated
    void f();

    void g();

    C2578o8.c h();
}
