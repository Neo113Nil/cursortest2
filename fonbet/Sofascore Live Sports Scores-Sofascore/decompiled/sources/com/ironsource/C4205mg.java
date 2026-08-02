package com.ironsource;

import android.text.TextUtils;
import com.ironsource.mediationsdk.model.NetworkSettings;
import java.util.ArrayList;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* renamed from: com.ironsource.mg, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public class C4205mg {
    private NetworkSettings b;
    private ArrayList<String> a = new ArrayList<>();
    private JSONObject c = null;
    private boolean d = true;

    public void a(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        this.a.add(str);
    }

    public JSONObject b() {
        return this.c;
    }

    @Nullable
    public NetworkSettings c() {
        return this.b;
    }

    public ArrayList<String> d() {
        return this.a;
    }

    public boolean e() {
        return this.d;
    }

    public void a(NetworkSettings networkSettings) {
        this.b = networkSettings;
    }

    public void a(JSONObject jSONObject) {
        this.c = jSONObject;
    }

    public void a(boolean z) {
        this.d = z;
    }

    public static C4205mg a() {
        return new C4205mg();
    }
}
