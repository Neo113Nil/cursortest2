package com.vk.dto.common.data;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.vk.log.L;
import java.util.Collection;
import java.util.Iterator;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import xsna.aay;
import xsna.bxx;
import xsna.izs;

/* loaded from: classes18.dex */
public class VKList<T> extends PaginatedList<T> implements bxx {
    protected int more;

    @Nullable
    protected String nextFrom;
    protected int total;

    public class a extends aay<T> {
        public final /* synthetic */ izs a;

        public a(izs izsVar) {
            this.a = izsVar;
        }

        @Override // xsna.aay
        public final T a(JSONObject jSONObject) throws JSONException {
            return (T) this.a.invoke(jSONObject);
        }
    }

    public VKList(int i, Collection collection) {
        super(collection);
        this.nextFrom = null;
        this.total = i;
        this.more = 0;
    }

    public static <Original, New> VKList<New> p(VKList<Original> vKList, izs<Original, New> izsVar) {
        VKList<New> vKList2 = new VKList<>();
        Iterator<Original> it = vKList.iterator();
        while (it.hasNext()) {
            vKList2.add(izsVar.invoke(it.next()));
        }
        vKList2.total = vKList.total;
        vKList2.more = vKList.more;
        vKList2.nextFrom = vKList.nextFrom;
        return vKList2;
    }

    @Override // xsna.bxx
    @NonNull
    public final JSONObject e5() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("count", this.total);
            jSONObject.put("more", this.more);
            jSONObject.put("next_from", this.nextFrom);
            if (size() != 0) {
                JSONArray jSONArray = new JSONArray();
                Iterator<T> it = iterator();
                while (it.hasNext()) {
                    jSONArray.put(it.next());
                }
                jSONObject.put("items", jSONArray);
            }
            return jSONObject;
        } catch (JSONException e) {
            L.e(e);
            return new JSONObject();
        }
    }

    @Override // com.vk.dto.common.data.PaginatedList
    public final int i() {
        return this.total;
    }

    @Nullable
    public final String j() {
        return this.nextFrom;
    }

    public final int k() {
        return this.more;
    }

    public final void l(boolean z) {
        this.more = z ? 1 : 0;
    }

    public final void n(@Nullable String str) {
        this.nextFrom = str;
    }

    public final void o(int i) {
        this.total = i;
    }

    public VKList(Collection<? extends T> collection) {
        super(collection);
        this.more = 1;
        this.nextFrom = null;
        this.total = collection.size();
        this.more = 0;
    }

    public VKList() {
        this.more = 1;
        this.nextFrom = null;
    }

    public VKList(int i, int i2) {
        this.nextFrom = null;
        this.total = i;
        this.more = i2;
    }

    public VKList(JSONObject jSONObject, izs<JSONObject, T> izsVar) throws JSONException {
        this(jSONObject, new a(izsVar));
    }

    public VKList(JSONObject jSONObject, aay<T> aayVar) throws JSONException {
        this.more = 1;
        this.nextFrom = null;
        this.total = jSONObject.optInt("count", 0);
        this.more = jSONObject.optInt("more", 0);
        this.nextFrom = jSONObject.optString("next_from");
        JSONArray optJSONArray = jSONObject.optJSONArray("items");
        if (optJSONArray == null) {
            return;
        }
        for (int i = 0; i < optJSONArray.length(); i++) {
            T a2 = aayVar.a(optJSONArray.getJSONObject(i));
            if (a2 != null) {
                add(a2);
            }
        }
    }
}
