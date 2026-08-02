package com.ironsource;

import com.ironsource.sdk.utils.IronSourceStorageUtils;
import java.util.ArrayList;
import java.util.Iterator;
import org.json.JSONObject;

/* loaded from: classes13.dex */
public class Ob {
    private String a;

    public Ob(String str) {
        this.a = str;
    }

    private C4671z8 a() throws Exception {
        C4671z8 c4671z8 = new C4671z8(this.a, "metadata.json");
        if (!c4671z8.exists()) {
            a(c4671z8);
        }
        return c4671z8;
    }

    public synchronized JSONObject b() throws Exception {
        return new JSONObject(IronSourceStorageUtils.readFile(a()));
    }

    private void a(C4671z8 c4671z8) throws Exception {
        IronSourceStorageUtils.saveFile(new JSONObject().toString().getBytes(), c4671z8.getPath());
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

    public boolean a(ArrayList<C4671z8> arrayList) throws Exception {
        Iterator<C4671z8> it = arrayList.iterator();
        boolean z = true;
        while (it.hasNext()) {
            if (!a(it.next().getName())) {
                z = false;
            }
        }
        return z;
    }
}
