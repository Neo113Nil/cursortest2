package com.vk.clips.design.view.component.badge;

import android.util.Size;
import xsna.epx;
import xsna.rzt0;

/* compiled from: ClipBadge.kt */
/* loaded from: classes16.dex */
public interface a {

    /* compiled from: ClipBadge.kt */
    /* renamed from: com.vk.clips.design.view.component.badge.a$a, reason: collision with other inner class name */
    public static final class C0568a implements a {
        public final Size a;
        public final rzt0 b;

        public C0568a(Size size, rzt0 rzt0Var) {
            this.a = size;
            this.b = rzt0Var;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C0568a)) {
                return false;
            }
            C0568a c0568a = (C0568a) obj;
            return epx.f(this.a, c0568a.a) && epx.f(this.b, c0568a.b);
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.a.hashCode() * 31);
        }

        public final String toString() {
            return "Image(size=" + this.a + ", viewParams=" + this.b + ')';
        }
    }
}
