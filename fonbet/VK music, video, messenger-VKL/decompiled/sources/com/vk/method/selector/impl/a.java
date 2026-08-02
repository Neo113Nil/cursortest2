package com.vk.method.selector.impl;

import java.util.List;
import xsna.epx;
import xsna.ms9;
import xsna.vgg;
import xsna.yj20;

/* compiled from: MethodSelectorContract.kt */
/* loaded from: classes3.dex */
public interface a {

    /* compiled from: MethodSelectorContract.kt */
    /* renamed from: com.vk.method.selector.impl.a$a, reason: collision with other inner class name */
    public static abstract class AbstractC1275a implements a {
        public final vgg a;

        /* compiled from: MethodSelectorContract.kt */
        /* renamed from: com.vk.method.selector.impl.a$a$a, reason: collision with other inner class name */
        public static final class C1276a extends AbstractC1275a {
        }

        /* compiled from: MethodSelectorContract.kt */
        /* renamed from: com.vk.method.selector.impl.a$a$b */
        public static final class b extends AbstractC1275a {
        }

        /* compiled from: MethodSelectorContract.kt */
        /* renamed from: com.vk.method.selector.impl.a$a$c */
        public static final class c extends AbstractC1275a {
        }

        /* compiled from: MethodSelectorContract.kt */
        /* renamed from: com.vk.method.selector.impl.a$a$d */
        public static final class d extends AbstractC1275a {
        }

        /* compiled from: MethodSelectorContract.kt */
        /* renamed from: com.vk.method.selector.impl.a$a$e */
        public static final class e extends AbstractC1275a {
        }

        public AbstractC1275a(vgg vggVar) {
            this.a = vggVar;
        }
    }

    /* compiled from: MethodSelectorContract.kt */
    public static final class b implements a {
        public final List<yj20> a;

        /* JADX WARN: Multi-variable type inference failed */
        public b(List<? extends yj20> list) {
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
            return ms9.a(')', new StringBuilder("Loaded(data="), this.a);
        }
    }

    /* compiled from: MethodSelectorContract.kt */
    public static final class c implements a {
        public static final c a = new c();
    }
}
