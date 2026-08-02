package defpackage;

import android.text.TextUtils;
import java.util.Collections;
import java.util.HashSet;
import org.json.JSONObject;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public final class l1o extends w0o {
    public final HashSet c;
    public final JSONObject d;
    public final long e;
    public final /* synthetic */ int f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l1o(c0l c0lVar, HashSet hashSet, JSONObject jSONObject, long j, int i) {
        super(c0lVar);
        this.f = i;
        this.c = new HashSet(hashSet);
        this.d = jSONObject;
        this.e = j;
    }

    @Override // defpackage.w0o
    /* renamed from: a */
    public final void onPostExecute(String str) {
        tsn tsnVar;
        switch (this.f) {
            case 0:
                b(str);
                super.onPostExecute(str);
                break;
            default:
                if (!TextUtils.isEmpty(str) && (tsnVar = tsn.c) != null) {
                    for (i2o i2oVar : Collections.unmodifiableCollection(tsnVar.a)) {
                        if (this.c.contains(i2oVar.g)) {
                            d7n d7nVar = i2oVar.d;
                            if (this.e >= d7nVar.a) {
                                d7nVar.b = 2;
                                nun.a.a(d7nVar.a(), "setNativeViewHierarchy", str, (String) d7nVar.c);
                            }
                        }
                    }
                }
                super.onPostExecute(str);
                break;
        }
    }

    public void b(String str) {
        tsn tsnVar = tsn.c;
        if (tsnVar != null) {
            for (i2o i2oVar : Collections.unmodifiableCollection(tsnVar.a)) {
                if (this.c.contains(i2oVar.g)) {
                    d7n d7nVar = i2oVar.d;
                    if (this.e >= d7nVar.a && d7nVar.b != 3) {
                        d7nVar.b = 3;
                        nun.a.a(d7nVar.a(), "setNativeViewHierarchy", str, (String) d7nVar.c);
                    }
                }
            }
        }
    }

    @Override // android.os.AsyncTask
    public final Object doInBackground(Object[] objArr) {
        int i = this.f;
        JSONObject jSONObject = this.d;
        switch (i) {
            case 0:
                break;
            default:
                c0l c0lVar = this.b;
                if (!myn.e(jSONObject, (JSONObject) c0lVar.b)) {
                    c0lVar.b = jSONObject;
                    break;
                }
                break;
        }
        return jSONObject.toString();
    }

    @Override // defpackage.w0o, android.os.AsyncTask
    public final /* synthetic */ void onPostExecute(Object obj) {
        switch (this.f) {
            case 0:
                String str = (String) obj;
                b(str);
                super.onPostExecute(str);
                break;
            default:
                onPostExecute((String) obj);
                break;
        }
    }
}
