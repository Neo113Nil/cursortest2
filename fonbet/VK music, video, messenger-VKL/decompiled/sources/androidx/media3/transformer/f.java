package androidx.media3.transformer;

import com.google.common.collect.ImmutableList;
import java.util.Iterator;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import xsna.ahn;
import xsna.dds0;
import xsna.fxc0;
import xsna.v9p;

/* compiled from: Composition.java */
/* loaded from: classes12.dex */
public final class f {
    public final ImmutableList<n> a;
    public final dds0 b;
    public final v9p c;
    public final boolean d;
    public final boolean e;

    /* compiled from: Composition.java */
    public static final class a {
        public ImmutableList<n> a;
        public dds0 b;
        public v9p c;
        public boolean d;
        public boolean e;

        public final f a() {
            return new f(this.a, this.b, this.c, this.d, this.e);
        }

        public final void b(List list) {
            fxc0.q(!list.isEmpty(), "The composition must contain at least one EditedMediaItemSequence.");
            this.a = ImmutableList.m(list);
        }
    }

    public f(ImmutableList immutableList, dds0 dds0Var, v9p v9pVar, boolean z, boolean z2) {
        boolean z3;
        Iterator<E> it = immutableList.iterator();
        if (it.hasNext()) {
            ((n) it.next()).getClass();
            z3 = true;
        } else {
            z3 = false;
        }
        fxc0.q(z3, "Composition must have at least one non-looping sequence.");
        this.a = ImmutableList.m(immutableList);
        this.b = dds0Var;
        this.c = v9pVar;
        this.d = z;
        this.e = z2;
    }

    public final a a() {
        a aVar = new a();
        aVar.a = this.a;
        aVar.b = this.b;
        aVar.c = this.c;
        aVar.d = this.d;
        aVar.e = this.e;
        return aVar;
    }

    public final String toString() {
        ImmutableList<n> immutableList = this.a;
        JSONObject jSONObject = new JSONObject();
        try {
            JSONArray jSONArray = new JSONArray();
            for (int i = 0; i < immutableList.size(); i++) {
                jSONArray.put(immutableList.get(i).b());
            }
            jSONObject.put("sequences", jSONArray);
            jSONObject.put("effects", this.c.a());
            jSONObject.put("transmuxAudio", false);
            jSONObject.put("transmuxVideo", this.d);
            jSONObject.put("hdrMode", 0);
            jSONObject.put("retainHdrFromUltraHdrImage", this.e);
        } catch (JSONException e) {
            ahn.G("JSON conversion failed.", e);
            jSONObject = new JSONObject();
        }
        return jSONObject.toString();
    }
}
