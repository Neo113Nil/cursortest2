package com.vk.dto.stories.model;

import android.location.Location;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.vk.core.serialize.Serializer;
import com.vk.dto.stories.entities.OrdData;
import com.vk.dto.stories.entities.stat.StoryStatContainer;
import com.vk.dto.stories.model.clickable.ClickableStickers;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/* loaded from: classes18.dex */
public class StoryUploadParams extends Serializer.StreamParcelableAdapter {
    public static final Serializer.c<StoryUploadParams> CREATOR = new a();

    @Nullable
    public Integer A;

    @Nullable
    public Integer B;

    @Nullable
    public String C;

    @Nullable
    public Integer D;
    public boolean E;
    public StoriesInvolvementChoice F;

    @Nullable
    public String G;
    public boolean H;

    @Nullable
    public String I;
    public boolean J;

    @Nullable
    public String K;

    @Nullable
    public String L;

    @Nullable
    public Long M;

    @Nullable
    public Long N;

    @Nullable
    public StorySessionParams O;

    @Nullable
    public String b;

    @Nullable
    public String c;

    @Nullable
    public Integer d;

    @Nullable
    public Location e;

    @Nullable
    public CameraType f;
    public boolean g;
    public StoryStatContainer h;
    public String i;

    @Nullable
    public ClickableStickers j;

    @Nullable
    public Boolean k;

    @Nullable
    public Boolean l;

    @Nullable
    public Integer m;

    @Nullable
    public Boolean n;

    @Nullable
    public Boolean o;

    @Nullable
    public Boolean p;

    @Nullable
    public String q;

    @Nullable
    public Integer r;
    public String s;

    @Nullable
    public String t;
    public boolean u;
    public ArrayList v;

    @Nullable
    public Boolean w;

    @Nullable
    public Integer x;

    @Nullable
    public Integer y;

    @Nullable
    public OrdData z;

    public enum CameraType {
        BACK("back"),
        FRONT("front"),
        GALLERY("gallery"),
        GALLERY_MULTI("gallery_multi"),
        BACK_MULTI_VIDEO("back_multi_video"),
        FRONT_MULTI_VIDEO("front_multi_video"),
        AVATAR("avatar"),
        STORY_BOX("storybox"),
        REPOST("repost"),
        UNDEFINED(StringUtils.UNDEFINED);

        private final String name;

        CameraType(String str) {
            this.name = str;
        }

        @Override // java.lang.Enum
        @NonNull
        public final String toString() {
            return this.name;
        }
    }

    public class a extends Serializer.c<StoryUploadParams> {
        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.vk.core.serialize.Serializer.c
        public final StoryUploadParams a(@NonNull Serializer serializer) {
            StoryUploadParams storyUploadParams = new StoryUploadParams();
            storyUploadParams.g = false;
            Boolean bool = Boolean.FALSE;
            storyUploadParams.o = bool;
            storyUploadParams.p = bool;
            storyUploadParams.q = null;
            storyUploadParams.r = null;
            storyUploadParams.s = null;
            storyUploadParams.t = null;
            storyUploadParams.u = true;
            storyUploadParams.x = null;
            storyUploadParams.y = null;
            storyUploadParams.A = null;
            storyUploadParams.B = null;
            storyUploadParams.C = null;
            storyUploadParams.D = null;
            storyUploadParams.E = false;
            storyUploadParams.F = null;
            storyUploadParams.H = false;
            storyUploadParams.I = null;
            storyUploadParams.J = false;
            storyUploadParams.O = null;
            storyUploadParams.c = serializer.H();
            storyUploadParams.d = serializer.v();
            if (serializer.m()) {
                String H = serializer.H();
                double r = serializer.r();
                double r2 = serializer.r();
                Location location = new Location(H);
                storyUploadParams.e = location;
                location.setLatitude(r);
                storyUploadParams.e.setLongitude(r2);
            }
            int u = serializer.u();
            storyUploadParams.f = u == -1 ? null : CameraType.values()[u];
            storyUploadParams.h = (StoryStatContainer) serializer.G(StoryStatContainer.class.getClassLoader());
            storyUploadParams.g = serializer.m();
            storyUploadParams.i = serializer.H();
            storyUploadParams.j = (ClickableStickers) serializer.G(ClickableStickers.class.getClassLoader());
            storyUploadParams.k = serializer.n();
            storyUploadParams.l = serializer.n();
            storyUploadParams.m = serializer.v();
            storyUploadParams.n = serializer.n();
            storyUploadParams.o = serializer.n();
            storyUploadParams.p = serializer.n();
            storyUploadParams.q = serializer.H();
            storyUploadParams.r = serializer.v();
            storyUploadParams.s = serializer.H();
            storyUploadParams.t = serializer.H();
            storyUploadParams.u = serializer.m();
            storyUploadParams.b = serializer.H();
            storyUploadParams.v = serializer.l(QuestionInfo.class.getClassLoader());
            storyUploadParams.w = serializer.n();
            storyUploadParams.x = serializer.v();
            storyUploadParams.y = serializer.v();
            storyUploadParams.z = (OrdData) serializer.G(OrdData.class.getClassLoader());
            storyUploadParams.A = serializer.v();
            storyUploadParams.B = serializer.v();
            storyUploadParams.C = serializer.H();
            storyUploadParams.D = serializer.v();
            storyUploadParams.E = serializer.m();
            int u2 = serializer.u();
            storyUploadParams.F = u2 != -1 ? (StoriesInvolvementChoice) StoriesInvolvementChoice.h().get(u2) : null;
            storyUploadParams.G = serializer.I();
            storyUploadParams.H = serializer.m();
            storyUploadParams.I = serializer.I();
            storyUploadParams.J = Boolean.TRUE.equals(serializer.n());
            storyUploadParams.O = (StorySessionParams) serializer.A(StorySessionParams.class.getClassLoader());
            storyUploadParams.L = serializer.I();
            storyUploadParams.K = serializer.I();
            storyUploadParams.M = serializer.x();
            storyUploadParams.N = serializer.x();
            return storyUploadParams;
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new StoryUploadParams[i];
        }
    }

    public StoryUploadParams() {
        this.g = false;
        Boolean bool = Boolean.FALSE;
        this.o = bool;
        this.p = bool;
        this.q = null;
        this.r = null;
        this.s = null;
        this.t = null;
        this.u = true;
        this.x = null;
        this.y = null;
        this.A = null;
        this.B = null;
        this.C = null;
        this.D = null;
        this.E = false;
        this.F = null;
        this.H = false;
        this.I = null;
        this.J = false;
        this.O = null;
    }

    @Nullable
    public final CameraType Ab() {
        return this.f;
    }

    @Nullable
    public final ClickableStickers Bb() {
        return this.j;
    }

    @Nullable
    public final String Cb() {
        return this.q;
    }

    @Nullable
    public final StoriesInvolvementChoice Db() {
        return this.F;
    }

    @Nullable
    public final Integer Eb() {
        return this.D;
    }

    @Nullable
    public final Location Fb() {
        return this.e;
    }

    @Nullable
    public final String Gb() {
        return this.c;
    }

    @Nullable
    public final String Hb() {
        return this.K;
    }

    @Nullable
    public final String Ib() {
        return this.s;
    }

    @Nullable
    public final OrdData Jb() {
        return this.z;
    }

    public final String Kb() {
        return this.C;
    }

    @Nullable
    public final Integer Lb() {
        return this.y;
    }

    @Nullable
    public final List<QuestionInfo> Mb() {
        return this.v;
    }

    @Nullable
    public final Integer Nb() {
        return this.d;
    }

    @Override // com.vk.core.serialize.Serializer.StreamParcelable
    public final void O7(@NonNull Serializer serializer) {
        serializer.j0(this.c);
        serializer.V(this.d);
        if (this.e != null) {
            serializer.L((byte) 1);
            serializer.j0(this.e.getProvider());
            serializer.O(this.e.getLatitude());
            serializer.O(this.e.getLongitude());
        } else {
            serializer.L((byte) 0);
        }
        CameraType cameraType = this.f;
        serializer.S(cameraType == null ? -1 : cameraType.ordinal());
        serializer.i0(this.h);
        serializer.L(this.g ? (byte) 1 : (byte) 0);
        serializer.j0(this.i);
        serializer.i0(this.j);
        serializer.J(this.k);
        serializer.J(this.l);
        serializer.V(this.m);
        serializer.J(this.n);
        serializer.J(this.o);
        serializer.J(this.p);
        serializer.j0(this.q);
        serializer.V(this.r);
        serializer.j0(this.s);
        serializer.j0(this.t);
        serializer.L(this.u ? (byte) 1 : (byte) 0);
        serializer.j0(this.b);
        serializer.W(this.v);
        serializer.J(this.w);
        serializer.V(this.x);
        serializer.V(this.y);
        serializer.i0(this.z);
        serializer.V(this.A);
        serializer.V(this.B);
        serializer.j0(this.C);
        serializer.V(this.D);
        serializer.L(this.E ? (byte) 1 : (byte) 0);
        StoriesInvolvementChoice storiesInvolvementChoice = this.F;
        serializer.S(storiesInvolvementChoice != null ? storiesInvolvementChoice.ordinal() : -1);
        serializer.m0(this.G);
        serializer.L(this.H ? (byte) 1 : (byte) 0);
        serializer.m0(this.I);
        serializer.J(Boolean.valueOf(this.J));
        serializer.e0(this.O);
        serializer.m0(this.L);
        serializer.m0(this.K);
        serializer.b0(this.M);
        serializer.b0(this.N);
    }

    @Nullable
    public final Integer Ob() {
        return this.x;
    }

    public final StoryStatContainer Pb() {
        return this.h;
    }

    @Nullable
    public final Integer Qb() {
        return this.B;
    }

    @Nullable
    public final Integer Rb() {
        return this.A;
    }

    public final boolean Sb() {
        return this.g;
    }

    public final boolean Tb() {
        return this.E;
    }

    @Nullable
    public final Boolean Ub() {
        return this.n;
    }

    public final void Vb() {
        this.g = true;
    }

    public final void Wb(@Nullable Boolean bool) {
        this.n = bool;
    }

    public final void Xb(@Nullable Integer num) {
        this.B = num;
    }

    public final void Yb(@Nullable Integer num) {
        this.A = num;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof StoryUploadParams) {
                StoryUploadParams storyUploadParams = (StoryUploadParams) obj;
                Location location = this.e;
                boolean z = location == null || storyUploadParams.e == null ? location == storyUploadParams.e : Objects.equals(location.getProvider(), storyUploadParams.e.getProvider()) && Double.valueOf(this.e.getLatitude()).equals(Double.valueOf(storyUploadParams.e.getLatitude())) && Double.valueOf(this.e.getLongitude()).equals(Double.valueOf(storyUploadParams.e.getLongitude()));
                if (this.g != storyUploadParams.g || this.u != storyUploadParams.u || !Objects.equals(this.b, storyUploadParams.b) || !Objects.equals(this.c, storyUploadParams.c) || !Objects.equals(this.d, storyUploadParams.d) || !z || this.f != storyUploadParams.f || !Objects.equals(this.h, storyUploadParams.h) || !Objects.equals(this.i, storyUploadParams.i) || !Objects.equals(this.j, storyUploadParams.j) || !Objects.equals(this.k, storyUploadParams.k) || !Objects.equals(this.l, storyUploadParams.l) || !Objects.equals(this.m, storyUploadParams.m) || !Objects.equals(this.n, storyUploadParams.n) || !Objects.equals(this.o, storyUploadParams.o) || !Objects.equals(this.p, storyUploadParams.p) || !Objects.equals(this.q, storyUploadParams.q) || !Objects.equals(this.r, storyUploadParams.r) || !Objects.equals(this.s, storyUploadParams.s) || !Objects.equals(this.t, storyUploadParams.t) || !Objects.equals(this.v, storyUploadParams.v) || !Objects.equals(this.w, storyUploadParams.w) || !Objects.equals(this.x, storyUploadParams.x) || !Objects.equals(this.y, storyUploadParams.y) || !Objects.equals(this.z, storyUploadParams.z) || !Objects.equals(this.A, storyUploadParams.A) || !Objects.equals(this.B, storyUploadParams.B) || !Objects.equals(this.C, storyUploadParams.C) || !Objects.equals(this.D, storyUploadParams.D) || !Boolean.valueOf(this.E).equals(Boolean.valueOf(storyUploadParams.E)) || !Objects.equals(this.F, storyUploadParams.F) || !Objects.equals(this.G, storyUploadParams.G) || !Boolean.valueOf(this.H).equals(Boolean.valueOf(storyUploadParams.H)) || !Objects.equals(this.I, storyUploadParams.I) || this.J != storyUploadParams.J || !Objects.equals(this.O, storyUploadParams.O) || !Objects.equals(this.L, storyUploadParams.L) || !Objects.equals(this.K, storyUploadParams.K) || !Objects.equals(this.M, storyUploadParams.M) || !Objects.equals(this.N, storyUploadParams.N)) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        Location location = this.e;
        return Objects.hash(this.b, this.c, this.d, Integer.valueOf(location != null ? Objects.hash(location.getProvider(), Double.valueOf(this.e.getLatitude()), Double.valueOf(this.e.getLongitude())) : 0), this.f, Boolean.valueOf(this.g), this.h, this.i, this.j, this.k, this.l, this.m, this.n, this.o, this.p, this.q, this.r, this.s, this.t, Boolean.valueOf(this.u), this.v, this.w, this.x, this.y, this.A, this.B, this.z, this.C, this.D, Boolean.valueOf(this.E), this.F, this.G, Boolean.valueOf(this.H), this.I, Boolean.valueOf(this.J), this.O, this.L, this.K);
    }

    public final String zb() {
        return this.i;
    }

    public StoryUploadParams(StoryUploadParams storyUploadParams) {
        this.g = false;
        Boolean bool = Boolean.FALSE;
        this.o = bool;
        this.p = bool;
        this.q = null;
        this.r = null;
        this.s = null;
        this.t = null;
        this.u = true;
        this.x = null;
        this.y = null;
        this.A = null;
        this.B = null;
        this.C = null;
        this.D = null;
        this.E = false;
        this.F = null;
        this.H = false;
        this.I = null;
        this.J = false;
        this.O = null;
        this.c = storyUploadParams.c;
        this.d = storyUploadParams.d;
        this.e = storyUploadParams.e;
        this.f = storyUploadParams.f;
        this.g = storyUploadParams.g;
        this.h = storyUploadParams.h;
        this.i = storyUploadParams.i;
        this.j = storyUploadParams.j;
        this.k = storyUploadParams.k;
        this.l = storyUploadParams.l;
        this.m = storyUploadParams.m;
        this.n = storyUploadParams.n;
        this.o = storyUploadParams.o;
        this.p = storyUploadParams.p;
        this.q = storyUploadParams.q;
        this.r = storyUploadParams.r;
        this.s = storyUploadParams.s;
        this.t = storyUploadParams.t;
        this.u = storyUploadParams.u;
        this.b = storyUploadParams.b;
        this.v = storyUploadParams.v;
        this.w = storyUploadParams.w;
        this.x = storyUploadParams.x;
        this.y = storyUploadParams.y;
        this.z = storyUploadParams.z;
        this.A = storyUploadParams.A;
        this.B = storyUploadParams.B;
        this.C = storyUploadParams.C;
        this.D = storyUploadParams.D;
        this.E = storyUploadParams.E;
        this.F = storyUploadParams.F;
        this.G = storyUploadParams.G;
        this.H = storyUploadParams.H;
        this.I = storyUploadParams.I;
        this.J = storyUploadParams.J;
        this.O = storyUploadParams.O;
        this.L = storyUploadParams.L;
        this.K = storyUploadParams.K;
        this.M = storyUploadParams.M;
        this.N = storyUploadParams.N;
    }
}
