package com.vk.newsfeed.impl.postmodal.reactions.donut;

import java.util.List;
import xsna.be;
import xsna.epx;
import xsna.ms9;
import xsna.xl50;

/* compiled from: ModalPostDonutPatch.kt */
/* loaded from: classes4.dex */
public abstract class c implements xl50 {

    /* compiled from: ModalPostDonutPatch.kt */
    public static final class a extends c {
        public static final a b = new a();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof a);
        }

        public final int hashCode() {
            return 1015169311;
        }

        public final String toString() {
            return "Error";
        }
    }

    /* compiled from: ModalPostDonutPatch.kt */
    public static final class b extends c {
        public final List<be> b;

        /* JADX WARN: Multi-variable type inference failed */
        public b(List<? extends be> list) {
            this.b = list;
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
            return ms9.a(')', new StringBuilder("ListReceived(items="), this.b);
        }
    }

    /* compiled from: ModalPostDonutPatch.kt */
    /* renamed from: com.vk.newsfeed.impl.postmodal.reactions.donut.c$c, reason: collision with other inner class name */
    public static final class C1396c extends c {
        public static final C1396c b = new C1396c();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof C1396c);
        }

        public final int hashCode() {
            return -1859197293;
        }

        public final String toString() {
            return "Loading";
        }
    }
}
