package com.ironsource;

import com.ironsource.sdk.utils.IronSourceStorageUtils;
import com.safedk.android.internal.partials.IronSourceNetworkBridge;
import java.util.ArrayList;
import java.util.Iterator;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public class Nb {
    private String a;

    public Nb(String str) {
        this.a = str;
    }

    private C2757y8 a() throws Exception {
        C2757y8 c2757y8 = new C2757y8(this.a, "metadata.json");
        if (!c2757y8.exists()) {
            a(c2757y8);
        }
        return c2757y8;
    }

    synchronized JSONObject b() throws Exception {
        return IronSourceNetworkBridge.jsonObjectInit(IronSourceStorageUtils.readFile(a()));
    }

    private void a(C2757y8 c2757y8) throws Exception {
        IronSourceStorageUtils.saveFile(IronSourceNetworkBridge.jsonObjectInit().toString().getBytes(), c2757y8.getPath());
    }

    synchronized boolean b(String str, JSONObject jSONObject) throws Exception {
        JSONObject b;
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
        return a(b);
    }

    private boolean a(JSONObject jSONObject) throws Exception {
        return IronSourceStorageUtils.saveFile(jSONObject.toString().getBytes(), a().getPath()) != 0;
    }

    synchronized boolean a(String str, JSONObject jSONObject) throws Exception {
        JSONObject b;
        b = b();
        b.put(str, jSONObject);
        return a(b);
    }

    synchronized boolean a(String str) throws Exception {
        JSONObject b = b();
        if (!b.has(str)) {
            return true;
        }
        b.remove(str);
        return a(b);
    }

    boolean a(ArrayList<C2757y8> arrayList) throws Exception {
        Iterator<C2757y8> it = arrayList.iterator();
        boolean z = true;
        while (it.hasNext()) {
            if (!a(it.next().getName())) {
                z = false;
            }
        }
        return z;
    }
}
