package androidx.media3.transformer;

import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableSet;
import java.util.ArrayList;
import java.util.Collection;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import xsna.ahn;
import xsna.fxc0;
import xsna.owj0;

/* compiled from: EditedMediaItemSequence.java */
/* loaded from: classes12.dex */
public final class n {
    public static final ImmutableSet<Integer> e = ImmutableSet.m(2, 1, 2);
    public final com.google.common.collect.g a;
    public final ImmutableSet<Integer> b;

    @Deprecated
    public final boolean c;

    @Deprecated
    public final boolean d;

    public n(a aVar) {
        com.google.common.collect.g g = aVar.a.g();
        this.a = g;
        boolean z = true;
        fxc0.q(!g.isEmpty(), "The sequence must contain at least one EditedMediaItem.");
        ImmutableSet<Integer> immutableSet = aVar.b;
        if (immutableSet.contains(-2)) {
            if (m.d(((m) g.get(0)).a) && !immutableSet.contains(1) && !immutableSet.contains(2)) {
                z = false;
            }
            fxc0.q(z, "If the first item in the sequence is a Gap, then forceAudioTrack or forceVideoTrack flag must be set");
        }
        this.b = immutableSet;
        this.c = immutableSet.contains(1);
        this.d = immutableSet.contains(2);
    }

    public final boolean a() {
        int i = 0;
        while (true) {
            com.google.common.collect.g gVar = this.a;
            if (i >= gVar.e) {
                return false;
            }
            if (m.d(((m) gVar.get(i)).a)) {
                return true;
            }
            i++;
        }
    }

    public final JSONObject b() {
        JSONObject jSONObject = new JSONObject();
        try {
            JSONArray jSONArray = new JSONArray();
            int i = 0;
            while (true) {
                com.google.common.collect.g gVar = this.a;
                if (i >= gVar.e) {
                    jSONObject.put("mediaItems", jSONArray);
                    jSONObject.put("trackTypes", new JSONArray((Collection) this.b));
                    jSONObject.put("isLooping", false);
                    return jSONObject;
                }
                jSONArray.put(((m) gVar.get(i)).f());
                i++;
            }
        } catch (JSONException e2) {
            ahn.G("JSON conversion failed.", e2);
            return new JSONObject();
        }
    }

    public final String toString() {
        return b().toString();
    }

    /* compiled from: EditedMediaItemSequence.java */
    public static final class a {
        public final ImmutableList.a<m> a;
        public ImmutableSet<Integer> b;

        public a(ImmutableSet immutableSet) {
            fxc0.z(!immutableSet.isEmpty());
            fxc0.A(n.e.containsAll(immutableSet), "trackTypes must only contain TRACK_TYPE_AUDIO and/or TRACK_TYPE_VIDEO.");
            this.b = ImmutableSet.n(immutableSet);
            this.a = new ImmutableList.a<>();
        }

        @Deprecated
        public a(m... mVarArr) {
            int i = ImmutableSet.d;
            this.b = new owj0(-2);
            ImmutableList.a<m> aVar = new ImmutableList.a<>();
            aVar.d(mVarArr);
            this.a = aVar;
        }

        @Deprecated
        public a(ArrayList arrayList) {
            int i = ImmutableSet.d;
            this.b = new owj0(-2);
            ImmutableList.a<m> aVar = new ImmutableList.a<>();
            aVar.e(arrayList);
            this.a = aVar;
        }
    }
}
