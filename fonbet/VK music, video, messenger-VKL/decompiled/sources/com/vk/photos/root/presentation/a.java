package com.vk.photos.root.presentation;

import xsna.kj50;
import xsna.vu5;

/* compiled from: PhotosRootAction.kt */
/* loaded from: classes4.dex */
public abstract class a implements kj50 {

    /* compiled from: PhotosRootAction.kt */
    /* renamed from: com.vk.photos.root.presentation.a$a, reason: collision with other inner class name */
    public static final class C1509a extends a {
        public static final C1509a b = new C1509a();
    }

    /* compiled from: PhotosRootAction.kt */
    public static final class b extends a {
        public static final b b = new b();
    }

    /* compiled from: PhotosRootAction.kt */
    public static final class c extends a {
        public static final c b = new c();
    }

    /* compiled from: PhotosRootAction.kt */
    public static final class d extends a {
        public static final d b = new d();
    }

    /* compiled from: PhotosRootAction.kt */
    public static final class e extends a {
        public final int b;

        public e(int i) {
            this.b = i;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof e) && this.b == ((e) obj).b;
        }

        public final int hashCode() {
            return Integer.hashCode(this.b);
        }

        public final String toString() {
            return vu5.b(new StringBuilder("SelectTab(position="), this.b, ')');
        }
    }

    /* compiled from: PhotosRootAction.kt */
    public static final class f extends a {
        public final boolean b;

        public f(boolean z) {
            this.b = z;
        }
    }

    /* compiled from: PhotosRootAction.kt */
    public static final class g extends a {
        public static final g b = new g();
    }

    /* compiled from: PhotosRootAction.kt */
    public static final class h extends a {
        public static final h b = new h();
    }

    /* compiled from: PhotosRootAction.kt */
    public static final class i extends a {
        public final boolean b = true;
    }

    /* compiled from: PhotosRootAction.kt */
    public static final class j extends a {
        public final boolean b;

        public j(boolean z) {
            this.b = z;
        }
    }
}
