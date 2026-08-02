package com.vk.clips.favorites.impl.ui.folders.content;

import com.vk.clips.favorites.impl.ui.folders.content.ClipsFavoriteFolderContentListState;
import com.vk.clips.favorites.impl.ui.folders.content.a;
import defpackage.q0;
import io.reactivex.rxjava3.internal.operators.mixed.j;
import java.util.ArrayList;
import java.util.List;
import xsna.ao50;
import xsna.asp;
import xsna.epx;
import xsna.fi50;
import xsna.fm50;
import xsna.h0u0;
import xsna.ms9;
import xsna.qoy;
import xsna.shy;
import xsna.tlo0;
import xsna.yzt0;
import xsna.zrp;

/* compiled from: ClipsFavoriteFolderContentListViewState.kt */
/* loaded from: classes16.dex */
public final class ClipsFavoriteFolderContentListViewState implements ao50 {
    public final fi50 a;
    public final fi50 b;
    public final fi50 c;
    public final fi50 d;
    public final fi50 e;

    /* compiled from: ClipsFavoriteFolderContentListViewState.kt */
    public static final class EmptyViewState {
        public final tlo0.f a;
        public final Mode b;

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        /* compiled from: ClipsFavoriteFolderContentListViewState.kt */
        public static final class Mode {
            private static final /* synthetic */ zrp $ENTRIES;
            private static final /* synthetic */ Mode[] $VALUES;
            public static final Mode ADD_CLIPS;
            public static final Mode VIEW_CLIPS;

            static {
                Mode mode = new Mode("VIEW_CLIPS", 0);
                VIEW_CLIPS = mode;
                Mode mode2 = new Mode("ADD_CLIPS", 1);
                ADD_CLIPS = mode2;
                Mode[] modeArr = {mode, mode2};
                $VALUES = modeArr;
                $ENTRIES = new asp(modeArr);
            }

            public Mode() {
                throw null;
            }

            public static Mode valueOf(String str) {
                return (Mode) Enum.valueOf(Mode.class, str);
            }

            public static Mode[] values() {
                return (Mode[]) $VALUES.clone();
            }
        }

        public EmptyViewState(tlo0.f fVar, Mode mode) {
            this.a = fVar;
            this.b = mode;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof EmptyViewState)) {
                return false;
            }
            EmptyViewState emptyViewState = (EmptyViewState) obj;
            return this.a.equals(emptyViewState.a) && this.b == emptyViewState.b;
        }

        public final int hashCode() {
            return this.b.hashCode() + (Integer.hashCode(this.a.a) * 31);
        }

        public final String toString() {
            return "EmptyViewState(description=" + this.a + ", mode=" + this.b + ')';
        }
    }

    /* compiled from: ClipsFavoriteFolderContentListViewState.kt */
    public static final class a implements fm50<ClipsFavoriteFolderContentListState.Content> {
        public final yzt0<g> a;
        public final yzt0<List<Object>> b;
        public final yzt0<Boolean> c;

        public a(h0u0 h0u0Var, h0u0 h0u0Var2, h0u0 h0u0Var3) {
            this.a = h0u0Var;
            this.b = h0u0Var2;
            this.c = h0u0Var3;
        }
    }

    /* compiled from: ClipsFavoriteFolderContentListViewState.kt */
    public static final class b implements fm50<ClipsFavoriteFolderContentListState.Content> {
        public final yzt0<g> a;
        public final yzt0<EmptyViewState> b;
        public final yzt0<Boolean> c;

        public b(h0u0 h0u0Var, h0u0 h0u0Var2, h0u0 h0u0Var3) {
            this.a = h0u0Var;
            this.b = h0u0Var2;
            this.c = h0u0Var3;
        }
    }

    /* compiled from: ClipsFavoriteFolderContentListViewState.kt */
    public static final class c implements fm50<ClipsFavoriteFolderContentListState.a> {
        public final yzt0<g> a;

        public c(h0u0 h0u0Var) {
            this.a = h0u0Var;
        }
    }

    /* compiled from: ClipsFavoriteFolderContentListViewState.kt */
    public static final class d implements fm50<ClipsFavoriteFolderContentListState.b> {
        public final yzt0<g> a;

        public d(h0u0 h0u0Var) {
            this.a = h0u0Var;
        }
    }

    /* compiled from: ClipsFavoriteFolderContentListViewState.kt */
    public interface e {

        /* compiled from: ClipsFavoriteFolderContentListViewState.kt */
        public static final class a implements e {
            public static final a a = new a();
        }

        /* compiled from: ClipsFavoriteFolderContentListViewState.kt */
        public static final class b implements e {
            public final ArrayList a;

            public b(ArrayList arrayList) {
                this.a = arrayList;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof b) && this.a.equals(((b) obj).a);
            }

            public final int hashCode() {
                return this.a.hashCode();
            }

            public final String toString() {
                return j.b(')', new StringBuilder("Enabled(actions="), this.a);
            }
        }
    }

    /* compiled from: ClipsFavoriteFolderContentListViewState.kt */
    public static final class f {
        public final int a;
        public final int b;
        public final tlo0.f c;
        public final com.vk.clips.favorites.impl.ui.folders.content.a d;

        public f(int i, int i2, tlo0.f fVar, com.vk.clips.favorites.impl.ui.folders.content.a aVar) {
            this.a = i;
            this.b = i2;
            this.c = fVar;
            this.d = aVar;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof f)) {
                return false;
            }
            f fVar = (f) obj;
            return this.a == fVar.a && this.b == fVar.b && this.c.equals(fVar.c) && this.d.equals(fVar.d);
        }

        public final int hashCode() {
            return this.d.hashCode() + shy.a(this.c.a, shy.a(this.b, Integer.hashCode(this.a) * 31, 31), 31);
        }

        public final String toString() {
            return "MorePopupAction(icon=" + this.a + ", iconTint=" + this.b + ", text=" + this.c + ", action=" + this.d + ')';
        }
    }

    /* compiled from: ClipsFavoriteFolderContentListViewState.kt */
    public interface g {

        /* compiled from: ClipsFavoriteFolderContentListViewState.kt */
        public static final class a implements g {
            public static final a a = new a();
        }

        /* compiled from: ClipsFavoriteFolderContentListViewState.kt */
        public static final class b implements g {
            public final List<a> a;

            /* compiled from: ClipsFavoriteFolderContentListViewState.kt */
            public static final class a {
                public final a.e a;
                public final tlo0 b;
                public final boolean c;
                public final boolean d;

                public a(a.e eVar, tlo0 tlo0Var, boolean z, boolean z2) {
                    this.a = eVar;
                    this.b = tlo0Var;
                    this.c = z;
                    this.d = z2;
                }

                public final boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    if (!(obj instanceof a)) {
                        return false;
                    }
                    a aVar = (a) obj;
                    return this.a.equals(aVar.a) && this.b.equals(aVar.b) && this.c == aVar.c && this.d == aVar.d;
                }

                public final int hashCode() {
                    return Boolean.hashCode(this.d) + qoy.b(com.vk.movika.sdk.base.model.history.b.a(this.a.hashCode() * 31, 31, this.b), 31, this.c);
                }

                public final String toString() {
                    StringBuilder sb = new StringBuilder("Action(action=");
                    sb.append(this.a);
                    sb.append(", text=");
                    sb.append(this.b);
                    sb.append(", isPrimary=");
                    sb.append(this.c);
                    sb.append(", isEnabled=");
                    return q0.a(sb, this.d, ')');
                }
            }

            public b(List<a> list) {
                this.a = list;
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
                return ms9.a(')', new StringBuilder("Enabled(bottomActions="), this.a);
            }
        }
    }

    /* compiled from: ClipsFavoriteFolderContentListViewState.kt */
    public static final class h implements fm50<ClipsFavoriteFolderContentListState> {
        public final yzt0<tlo0> a;
        public final yzt0<e> b;

        public h(h0u0 h0u0Var, h0u0 h0u0Var2) {
            this.a = h0u0Var;
            this.b = h0u0Var2;
        }
    }

    public ClipsFavoriteFolderContentListViewState(fi50 fi50Var, fi50 fi50Var2, fi50 fi50Var3, fi50 fi50Var4, fi50 fi50Var5) {
        this.a = fi50Var;
        this.b = fi50Var2;
        this.c = fi50Var3;
        this.d = fi50Var4;
        this.e = fi50Var5;
    }
}
