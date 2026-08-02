package com.vk.posting.presentation.video.search;

import xsna.epx;
import xsna.ewp;
import xsna.o2t0;
import xsna.wia0;
import xsna.xl50;

/* compiled from: SearchVideoPickerPatch.kt */
/* loaded from: classes5.dex */
public abstract class c implements xl50 {

    /* compiled from: SearchVideoPickerPatch.kt */
    public static abstract class a extends c {

        /* compiled from: SearchVideoPickerPatch.kt */
        /* renamed from: com.vk.posting.presentation.video.search.c$a$a, reason: collision with other inner class name */
        public static final class C1547a extends a {
            public final ewp b;

            public C1547a(ewp ewpVar) {
                this.b = ewpVar;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof C1547a) && epx.f(this.b, ((C1547a) obj).b);
            }

            public final int hashCode() {
                return this.b.a.hashCode();
            }

            public final String toString() {
                return "Error(errorLoading=" + this.b + ')';
            }
        }

        /* compiled from: SearchVideoPickerPatch.kt */
        public static final class b extends a {
            public static final b b = new b();
        }

        /* compiled from: SearchVideoPickerPatch.kt */
        /* renamed from: com.vk.posting.presentation.video.search.c$a$c, reason: collision with other inner class name */
        public static final class C1548c extends a {
            public final wia0<o2t0> b;

            public C1548c(wia0<o2t0> wia0Var) {
                this.b = wia0Var;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof C1548c) && epx.f(this.b, ((C1548c) obj).b);
            }

            public final int hashCode() {
                return this.b.hashCode();
            }

            public final String toString() {
                return "Success(videoList=" + this.b + ')';
            }
        }
    }
}
