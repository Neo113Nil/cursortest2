package x6;

import java.util.ArrayList;
import org.json.JSONArray;
import org.json.JSONException;
import u6.C9975a;

/* renamed from: x6.b, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
final class C10664b {

    /* renamed from: a, reason: collision with root package name */
    private final C10665c f105039a = new C10665c();

    C10664b() {
    }

    public final Object a(String str) throws w6.c {
        try {
            ArrayList arrayList = new ArrayList();
            JSONArray jSONArray = new JSONArray(str);
            int length = jSONArray.length();
            for (int i11 = 0; i11 < length; i11++) {
                arrayList.add((C9975a) this.f105039a.a(jSONArray.getString(i11)));
            }
            return arrayList;
        } catch (JSONException | w6.c e11) {
            throw new w6.c("Failed to deserialize CardList", e11);
        }
    }
}
