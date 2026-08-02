package androidx.media3.transformer;

import androidx.media3.common.audio.AudioProcessor;
import com.google.common.collect.ImmutableList;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import java.util.Objects;
import org.json.JSONException;
import org.json.JSONObject;
import xsna.ahn;
import xsna.dz5;
import xsna.fkk0;
import xsna.fxc0;
import xsna.kr10;
import xsna.p8p;
import xsna.uxo0;
import xsna.v9p;

/* compiled from: EditedMediaItem.java */
/* loaded from: classes12.dex */
public final class m {
    public final kr10 a;
    public final boolean b;
    public final boolean c;
    public final long d;
    public final int e;
    public final v9p f;
    public final fkk0.a g;
    public final boolean h;
    public long i;

    /* compiled from: EditedMediaItem.java */
    public static final class a {
        public kr10 a;
        public boolean b;
        public boolean c;
        public long d;
        public int e;
        public v9p f;
        public fkk0.a g;
        public boolean h;
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x0073, code lost:
    
        if (((androidx.media3.common.audio.f) r0).c.equals(r1) == false) goto L36;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public m(a aVar) {
        boolean z = aVar.b;
        fkk0.a aVar2 = aVar.g;
        fxc0.A((z && aVar.c) ? false : true, "Audio and video cannot both be removed");
        boolean d = d(aVar.a);
        fkk0.a aVar3 = fkk0.a;
        if (d) {
            fxc0.p(aVar.d != C.TIME_UNSET);
            fxc0.p(!aVar.b);
            fxc0.p(aVar.f.a.isEmpty());
            fxc0.p(aVar2 == aVar3);
        }
        if (aVar2 != aVar3) {
            if (aVar.h) {
                v9p v9pVar = aVar.f;
                ImmutableList<AudioProcessor> immutableList = v9pVar.a;
                ImmutableList<p8p> immutableList2 = v9pVar.b;
                boolean z2 = false;
                if (!immutableList.isEmpty()) {
                    AudioProcessor audioProcessor = v9pVar.a.get(0);
                    if (audioProcessor instanceof androidx.media3.common.audio.f) {
                    }
                }
                if (!immutableList2.isEmpty()) {
                    p8p p8pVar = immutableList2.get(0);
                    if (p8pVar instanceof uxo0) {
                        z2 = ((uxo0) p8pVar).b.equals(aVar2);
                        fxc0.z(z2);
                        fxc0.z(!c0.a(aVar.f, true));
                    }
                }
                z2 = true;
                fxc0.z(z2);
                fxc0.z(!c0.a(aVar.f, true));
            } else {
                fxc0.z(!c0.a(aVar.f, false));
            }
        }
        this.a = aVar.a;
        this.b = aVar.b;
        this.c = aVar.c;
        this.d = aVar.d;
        this.e = aVar.e;
        this.f = aVar.f;
        this.g = aVar2;
        this.h = aVar.h;
        this.i = C.TIME_UNSET;
    }

    public static boolean d(kr10 kr10Var) {
        return Objects.equals(kr10Var.a, "androidx-media3-GapMediaItem");
    }

    public static JSONObject e(kr10 kr10Var) throws JSONException {
        String uri;
        int lastIndexOf;
        JSONObject jSONObject = new JSONObject();
        kr10.f fVar = kr10Var.b;
        kr10.c cVar = kr10Var.f;
        jSONObject.put("extension", (fVar == null || (lastIndexOf = (uri = fVar.a.toString()).lastIndexOf(46)) <= 0 || lastIndexOf >= uri.length() + (-1)) ? "UNSET" : uri.substring(lastIndexOf + 1));
        if (cVar.equals(kr10.b.f)) {
            jSONObject.put("clipping", "UNSET");
            return jSONObject;
        }
        long j = cVar.c;
        String valueOf = j == Long.MIN_VALUE ? "END_OF_SOURCE" : String.valueOf(j);
        jSONObject.put("clippingStartMs", cVar.a);
        jSONObject.put("clippingEndMs", valueOf);
        return jSONObject;
    }

    public final a a() {
        a aVar = new a();
        aVar.a = this.a;
        aVar.b = this.b;
        aVar.c = this.c;
        aVar.d = this.d;
        aVar.e = this.e;
        aVar.f = this.f;
        aVar.g = this.g;
        aVar.h = this.h;
        return aVar;
    }

    public final long b(long j) {
        long j2;
        fkk0.a aVar = fkk0.a;
        fkk0.a aVar2 = this.g;
        if (aVar2 != aVar) {
            return dz5.z(aVar2, j);
        }
        boolean z = this.b;
        v9p v9pVar = this.f;
        long j3 = C.TIME_UNSET;
        if (z) {
            j2 = -9223372036854775807L;
        } else {
            ImmutableList.b listIterator = v9pVar.a.listIterator(0);
            j2 = j;
            while (listIterator.hasNext()) {
                j2 = ((AudioProcessor) listIterator.next()).c(j2);
            }
        }
        if (!this.c) {
            ImmutableList.b listIterator2 = v9pVar.b.listIterator(0);
            while (listIterator2.hasNext()) {
                j = ((p8p) listIterator2.next()).f(j);
            }
            j3 = j;
        }
        return Math.max(j2, j3);
    }

    public final long c() {
        if (this.i == C.TIME_UNSET) {
            kr10 kr10Var = this.a;
            boolean equals = kr10Var.f.equals(kr10.b.f);
            long j = this.d;
            if (equals || j == C.TIME_UNSET) {
                this.i = j;
            } else {
                kr10.c cVar = kr10Var.f;
                long j2 = cVar.b;
                long j3 = cVar.d;
                if (j3 == Long.MIN_VALUE) {
                    this.i = j - j2;
                } else {
                    fxc0.p(j3 <= j);
                    this.i = j3 - j2;
                }
            }
            this.i = b(this.i);
        }
        return this.i;
    }

    public final JSONObject f() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("mediaItem", e(this.a));
            jSONObject.put("effects", this.f.a());
            jSONObject.put("removeAudio", this.b);
            jSONObject.put("removeVideo", this.c);
            jSONObject.put("durationUs", this.d);
            jSONObject.put("presentationDuration", c());
            return jSONObject;
        } catch (JSONException e) {
            ahn.G("JSON conversion failed.", e);
            return new JSONObject();
        }
    }

    public final String toString() {
        return f().toString();
    }
}
