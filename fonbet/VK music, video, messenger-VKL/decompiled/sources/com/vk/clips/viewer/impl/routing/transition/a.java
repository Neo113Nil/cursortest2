package com.vk.clips.viewer.impl.routing.transition;

import android.view.View;
import java.util.List;
import xsna.epx;
import xsna.io2;
import xsna.q8e;
import xsna.qoy;
import xsna.yg5;

/* compiled from: ClipFullscreenTransitionArguments.kt */
/* loaded from: classes17.dex */
public final class a {
    public final b a;
    public final C0714a b;

    /* compiled from: ClipFullscreenTransitionArguments.kt */
    /* renamed from: com.vk.clips.viewer.impl.routing.transition.a$a, reason: collision with other inner class name */
    public static final class C0714a {
        public final List<View> a;
        public final q8e b;
        public final boolean c;
        public final yg5 d;

        public C0714a(List list, q8e q8eVar, boolean z, yg5 yg5Var) {
            this.a = list;
            this.b = q8eVar;
            this.c = z;
            this.d = yg5Var;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C0714a)) {
                return false;
            }
            C0714a c0714a = (C0714a) obj;
            return epx.f(this.a, c0714a.a) && this.b.equals(c0714a.b) && this.c == c0714a.c && epx.f(this.d, c0714a.d);
        }

        public final int hashCode() {
            int b = qoy.b((this.b.hashCode() + (this.a.hashCode() * 31)) * 31, 31, this.c);
            yg5 yg5Var = this.d;
            return b + (yg5Var == null ? 0 : yg5Var.hashCode());
        }

        public final String toString() {
            return "FeedArguments(fadeViews=" + this.a + ", recyclerView=" + this.b + ", isFocusedInitialItem=" + this.c + ", focusedAutoPlay=" + this.d + ')';
        }
    }

    /* compiled from: ClipFullscreenTransitionArguments.kt */
    public static final class b {
        public final io2 a;

        public b(io2 io2Var) {
            this.a = io2Var;
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
            return "SourceArguments(animationCallback=" + this.a + ')';
        }
    }

    public a(b bVar, C0714a c0714a) {
        this.a = bVar;
        this.b = c0714a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return epx.f(this.a, aVar.a) && epx.f(this.b, aVar.b);
    }

    public final int hashCode() {
        b bVar = this.a;
        int hashCode = (bVar == null ? 0 : bVar.a.hashCode()) * 31;
        C0714a c0714a = this.b;
        return hashCode + (c0714a != null ? c0714a.hashCode() : 0);
    }

    public final String toString() {
        return "ClipFullscreenTransitionArguments(sourceArguments=" + this.a + ", feedArguments=" + this.b + ')';
    }
}
