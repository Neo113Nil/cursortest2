package com.ironsource;

import com.ironsource.sdk.utils.IronSourceStorageUtils;
import java.util.ArrayList;
import java.util.Iterator;
import org.json.JSONObject;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes4.dex */
public class Nb {
    private String a;

    public Nb(String str) {
        this.a = str;
    }

    public boolean a(ArrayList<C4376w8> arrayList) throws Exception {
        Iterator<C4376w8> it = arrayList.iterator();
        boolean z = true;
        while (it.hasNext()) {
            if (!a(it.next().getName())) {
                z = false;
            }
        }
        return z;
    }

    public synchronized boolean b(String str, JSONObject jSONObject) throws Exception {
        JSONObject b;
        try {
            b = b();
            JSONObject optJSONObject = b.optJSONObject(str);
            if (optJSONObject != null) {
                Iterator<String> keys = jSONObject.keys();
                while (keys.hasNext()) {
                    String next = keys.next();
                    optJSONObject.putOpt(next, jSONObject.opt(next));
                }
            } else {
                b.putOpt(str, jSONObject);
            }
        } catch (Throwable th) {
            throw th;
        }
        return a(b);
    }

    private void a(C4376w8 c4376w8) throws Exception {
        IronSourceStorageUtils.saveFile(new JSONObject().toString().getBytes(), c4376w8.getPath());
    }

    private boolean a(JSONObject jSONObject) throws Exception {
        return IronSourceStorageUtils.saveFile(jSONObject.toString().getBytes(), a().getPath()) != 0;
    }

    public synchronized boolean a(String str, JSONObject jSONObject) throws Exception {
        JSONObject b;
        b = b();
        b.put(str, jSONObject);
        return a(b);
    }

    public synchronized boolean a(String str) throws Exception {
        JSONObject b = b();
        if (!b.has(str)) {
            return true;
        }
        b.remove(str);
        return a(b);
    }

    private C4376w8 a() throws Exception {
        C4376w8 c4376w8 = new C4376w8(this.a, "metadata.json");
        if (!c4376w8.exists()) {
            a(c4376w8);
        }
        return c4376w8;
    }

    public synchronized JSONObject b() throws Exception {
        return new JSONObject(IronSourceStorageUtils.readFile(a()));
    }
}
