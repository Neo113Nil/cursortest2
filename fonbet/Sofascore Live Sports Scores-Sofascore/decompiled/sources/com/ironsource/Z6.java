package com.ironsource;

import defpackage.znf;
import java.lang.ref.WeakReference;
import kotlin.reflect.KProperty;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes4.dex */
public final class Z6 {
    public static /* synthetic */ znf a(Object obj, int i, Object obj2) {
        if ((i & 1) != 0) {
            obj = null;
        }
        return a(obj);
    }

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    public static final class a implements znf {

        @NotNull
        private WeakReference<T> a;

        public a(T t) {
            this.a = new WeakReference<>(t);
        }

        public final void a(@NotNull WeakReference<T> weakReference) {
            weakReference.getClass();
            this.a = weakReference;
        }

        /* JADX WARN: Type inference failed for: r0v2, types: [T, java.lang.Object] */
        @Override // defpackage.xnf
        @Nullable
        public T getValue(@NotNull Object obj, @NotNull KProperty<?> kProperty) {
            obj.getClass();
            kProperty.getClass();
            return this.a.get();
        }

        @Override // defpackage.znf
        public void setValue(@NotNull Object obj, @NotNull KProperty<?> kProperty, @Nullable T t) {
            obj.getClass();
            kProperty.getClass();
            this.a = new WeakReference<>(t);
        }

        @NotNull
        public final WeakReference<T> a() {
            return this.a;
        }
    }

    @NotNull
    public static final <T> znf a(@Nullable T t) {
        return new a(t);
    }
}
