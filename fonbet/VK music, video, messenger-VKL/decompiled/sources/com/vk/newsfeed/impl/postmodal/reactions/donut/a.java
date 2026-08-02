package com.vk.newsfeed.impl.postmodal.reactions.donut;

import java.util.List;
import xsna.be;
import xsna.epx;
import xsna.kj50;
import xsna.ms9;

/* compiled from: ModalPostDonutAction.kt */
/* loaded from: classes4.dex */
public abstract class a implements kj50 {

    /* compiled from: ModalPostDonutAction.kt */
    /* renamed from: com.vk.newsfeed.impl.postmodal.reactions.donut.a$a, reason: collision with other inner class name */
    public static final class C1395a extends a {
        public static final C1395a b = new C1395a();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof C1395a);
        }

        public final int hashCode() {
            return 50584180;
        }

        public final String toString() {
            return "ErrorReceived";
        }
    }

    /* compiled from: ModalPostDonutAction.kt */
    public static final class b extends a {
        public static final b b = new b();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof b);
        }

        public final int hashCode() {
            return -1189040571;
        }

        public final String toString() {
            return "Init";
        }
    }

    /* compiled from: ModalPostDonutAction.kt */
    public static final class c extends a {
        public final List<be> b;

        /* JADX WARN: Multi-variable type inference failed */
        public c(List<? extends be> list) {
            this.b = list;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof c) && epx.f(this.b, ((c) obj).b);
        }

        public final int hashCode() {
            return this.b.hashCode();
        }

        public final String toString() {
            return ms9.a(')', new StringBuilder("NewItemsReceived(items="), this.b);
        }
    }
}
