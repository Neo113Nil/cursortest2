package com.ironsource;

import java.lang.ref.WeakReference;
import xsna.p7f0;
import xsna.qcy;

/* renamed from: com.ironsource.d7, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C4276d7 {

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* renamed from: com.ironsource.d7$a */
    public static final class a<T> implements p7f0<Object, T> {
        private WeakReference<T> a;

        public a(T t) {
            this.a = new WeakReference<>(t);
        }

        public final WeakReference<T> a() {
            return this.a;
        }

        @Override // xsna.i7f0
        public T getValue(Object obj, qcy<?> qcyVar) {
            return this.a.get();
        }

        @Override // xsna.p7f0
        public void setValue(Object obj, qcy<?> qcyVar, T t) {
            this.a = new WeakReference<>(t);
        }

        public final void a(WeakReference<T> weakReference) {
            this.a = weakReference;
        }
    }

    public static /* synthetic */ p7f0 a(Object obj, int i, Object obj2) {
        if ((i & 1) != 0) {
            obj = null;
        }
        return a(obj);
    }

    public static final <T> p7f0<Object, T> a(T t) {
        return new a(t);
    }
}
