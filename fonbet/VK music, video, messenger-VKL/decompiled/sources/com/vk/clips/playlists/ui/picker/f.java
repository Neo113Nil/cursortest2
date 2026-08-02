package com.vk.clips.playlists.ui.picker;

import com.vk.clips.playlists.ui.picker.ClipsPlaylistPickerState;
import java.util.List;
import xsna.ao50;
import xsna.epx;
import xsna.fi50;
import xsna.fm50;
import xsna.h0u0;
import xsna.n0u0;
import xsna.qoy;
import xsna.shy;
import xsna.tlo0;
import xsna.uqi;
import xsna.yzt0;

/* compiled from: ClipsPlaylistPickerViewState.kt */
/* loaded from: classes16.dex */
public final class f implements ao50 {
    public final fi50 a;
    public final fi50 b;
    public final fi50 c;

    /* compiled from: ClipsPlaylistPickerViewState.kt */
    public static final class a implements fm50<ClipsPlaylistPickerState.Content> {
        public final yzt0<List<Object>> a;
        public final yzt0<d> b;

        public a(h0u0 h0u0Var, h0u0 h0u0Var2) {
            this.a = h0u0Var;
            this.b = h0u0Var2;
        }
    }

    /* compiled from: ClipsPlaylistPickerViewState.kt */
    public static final class b implements fm50<ClipsPlaylistPickerState.a> {
        public final yzt0<d> a;

        public b(h0u0 h0u0Var) {
            this.a = h0u0Var;
        }
    }

    /* compiled from: ClipsPlaylistPickerViewState.kt */
    public static final class c implements fm50<ClipsPlaylistPickerState.b> {
        public final yzt0<d> a;

        public c(h0u0 h0u0Var) {
            this.a = h0u0Var;
        }
    }

    /* compiled from: ClipsPlaylistPickerViewState.kt */
    public interface d {

        /* compiled from: ClipsPlaylistPickerViewState.kt */
        public static final class a implements d {
            public static final a a = new a();
        }

        /* compiled from: ClipsPlaylistPickerViewState.kt */
        public static final class b implements d {
            public final a a;

            /* compiled from: ClipsPlaylistPickerViewState.kt */
            public static final class a {
                public final com.vk.clips.playlists.ui.picker.a a;
                public final tlo0.f b;
                public final boolean c;
                public final Integer d;

                public a(com.vk.clips.playlists.ui.picker.a aVar, tlo0.f fVar, boolean z, Integer num) {
                    this.a = aVar;
                    this.b = fVar;
                    this.c = z;
                    this.d = num;
                }

                public final Integer a() {
                    return this.d;
                }

                public final tlo0 b() {
                    return this.b;
                }

                public final boolean c() {
                    return this.c;
                }

                public final boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    if (!(obj instanceof a)) {
                        return false;
                    }
                    a aVar = (a) obj;
                    return this.a.equals(aVar.a) && this.b.equals(aVar.b) && this.c == aVar.c && epx.f(this.d, aVar.d);
                }

                public final int hashCode() {
                    int b = qoy.b(shy.a(this.b.a, this.a.hashCode() * 31, 31), 31, this.c);
                    Integer num = this.d;
                    return b + (num == null ? 0 : num.hashCode());
                }

                public final String toString() {
                    StringBuilder sb = new StringBuilder("Action(action=");
                    sb.append(this.a);
                    sb.append(", text=");
                    sb.append(this.b);
                    sb.append(", isEnabled=");
                    sb.append(this.c);
                    sb.append(", badgeCount=");
                    return uqi.b(sb, this.d, ')');
                }
            }

            public b(a aVar) {
                this.a = aVar;
            }

            public final a a() {
                return this.a;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof b) && epx.f(this.a, ((b) obj).a);
            }

            public final int hashCode() {
                return this.a.hashCode();
            }

            public final String toString() {
                return "Enabled(bottomAction=" + this.a + ')';
            }
        }
    }

    public f(fi50 fi50Var, fi50 fi50Var2, fi50 fi50Var3) {
        this.a = fi50Var;
        this.b = fi50Var2;
        this.c = fi50Var3;
    }

    public final n0u0<a> a() {
        return this.b;
    }

    public final n0u0<b> b() {
        return this.c;
    }

    public final n0u0<c> c() {
        return this.a;
    }
}
