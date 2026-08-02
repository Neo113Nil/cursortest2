package com.vk.clips.interests.impl.ui;

import xsna.epx;
import xsna.fld;
import xsna.kj50;

/* compiled from: ClipsInterestsAction.kt */
/* loaded from: classes16.dex */
public abstract class a implements kj50 {

    /* compiled from: ClipsInterestsAction.kt */
    /* renamed from: com.vk.clips.interests.impl.ui.a$a, reason: collision with other inner class name */
    public static final class C0621a extends a {
        public static final C0621a b = new C0621a();
    }

    /* compiled from: ClipsInterestsAction.kt */
    public static final class b extends a {
        public final fld b;

        public b(fld fldVar) {
            this.b = fldVar;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && epx.f(this.b, ((b) obj).b);
        }

        public final int hashCode() {
            return this.b.hashCode();
        }

        public final String toString() {
            return "ItemClick(itemId=" + this.b + ')';
        }
    }

    /* compiled from: ClipsInterestsAction.kt */
    public static abstract class c extends a {

        /* compiled from: ClipsInterestsAction.kt */
        /* renamed from: com.vk.clips.interests.impl.ui.a$c$a, reason: collision with other inner class name */
        public static final class C0622a extends c {
            public static final C0622a b = new C0622a();
        }
    }

    /* compiled from: ClipsInterestsAction.kt */
    public static final class d extends a {
        public static final d b = new d();
    }

    /* compiled from: ClipsInterestsAction.kt */
    public static final class e extends a {
        public static final e b = new e();
    }

    /* compiled from: ClipsInterestsAction.kt */
    public static final class f extends a {
        public static final f b = new f();
    }

    /* compiled from: ClipsInterestsAction.kt */
    public static final class g extends a {
        public static final g b = new g();
    }
}
