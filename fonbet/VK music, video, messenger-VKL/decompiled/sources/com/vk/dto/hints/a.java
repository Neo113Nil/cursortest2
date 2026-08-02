package com.vk.dto.hints;

import com.vk.core.serialize.Serializer;
import com.vk.dto.hints.Hint;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;
import xsna.bxx;
import xsna.epx;

/* compiled from: Hints.kt */
/* loaded from: classes.dex */
public final class a implements bxx {
    public final ArrayList<Hint> b;

    public a() {
        this(null);
    }

    public final a a(Hint hint) {
        a aVar = new a(null);
        ArrayList<Hint> arrayList = this.b;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            if (!hint.equals(arrayList.get(i))) {
                aVar.b.add(arrayList.get(i));
            }
        }
        return aVar;
    }

    public final a b(List<Hint> list) {
        a aVar = new a(null);
        ArrayList arrayList = new ArrayList();
        Iterator<Hint> it = this.b.iterator();
        while (it.hasNext()) {
            Hint next = it.next();
            if (!list.contains(next)) {
                arrayList.add(next);
            }
        }
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            aVar.b.add((Hint) it2.next());
        }
        return aVar;
    }

    public final Hint c(String str) {
        Object obj;
        Iterator<T> it = this.b.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (epx.f(((Hint) obj).getId(), str)) {
                break;
            }
        }
        return (Hint) obj;
    }

    @Override // xsna.bxx
    public final JSONObject e5() {
        JSONArray jSONArray = new JSONArray();
        Iterator<T> it = this.b.iterator();
        while (it.hasNext()) {
            jSONArray.put(((Hint) it.next()).Ab());
        }
        return new JSONObject().put("items", jSONArray);
    }

    public a(JSONObject jSONObject) {
        this.b = new ArrayList<>();
        if (jSONObject != null) {
            JSONArray optJSONArray = jSONObject.optJSONArray("items");
            int length = optJSONArray.length();
            for (int i = 0; i < length; i++) {
                Serializer.c<Hint> cVar = Hint.CREATOR;
                Hint a = Hint.a.a(optJSONArray.optJSONObject(i));
                if (a != null) {
                    this.b.add(a);
                }
            }
        }
    }
}
