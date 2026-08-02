package com.ironsource.sdk.controller;

import android.app.Activity;
import android.content.Context;
import com.ironsource.C4492p8;
import com.ironsource.InterfaceC4541s4;
import com.ironsource.InterfaceC4559t4;
import com.ironsource.InterfaceC4577u4;
import com.ironsource.Nb;
import com.ironsource.T4;
import com.ironsource.sdk.controller.f;
import java.util.Map;
import org.json.JSONObject;

/* loaded from: classes13.dex */
public interface l {

    public interface a {
        void a(f.a aVar);
    }

    public interface b {
        void a(Nb nb);
    }

    void a();

    void a(Activity activity);

    void a(Context context);

    void a(T4 t4);

    void a(T4 t4, Map<String, String> map, InterfaceC4541s4 interfaceC4541s4);

    void a(T4 t4, Map<String, String> map, InterfaceC4559t4 interfaceC4559t4);

    void a(f.c cVar, a aVar);

    void a(String str, InterfaceC4559t4 interfaceC4559t4);

    void a(String str, String str2, T4 t4, InterfaceC4541s4 interfaceC4541s4);

    void a(String str, String str2, T4 t4, InterfaceC4559t4 interfaceC4559t4);

    void a(String str, String str2, T4 t4, InterfaceC4577u4 interfaceC4577u4);

    void a(JSONObject jSONObject);

    void a(JSONObject jSONObject, InterfaceC4541s4 interfaceC4541s4);

    void a(JSONObject jSONObject, InterfaceC4559t4 interfaceC4559t4);

    void a(JSONObject jSONObject, InterfaceC4577u4 interfaceC4577u4);

    boolean a(String str);

    void b();

    void b(Context context);

    void b(T4 t4);

    void b(T4 t4, Map<String, String> map, InterfaceC4559t4 interfaceC4559t4);

    void b(JSONObject jSONObject);

    void e();

    @Deprecated
    void f();

    void g();

    C4492p8.c h();
}
