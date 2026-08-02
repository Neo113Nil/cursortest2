package com.vk.photos.root.presentation;

import defpackage.q0;
import xsna.vu5;
import xsna.xl50;

/* compiled from: PhotosRootPatch.kt */
/* loaded from: classes4.dex */
public abstract class c implements xl50 {

    /* compiled from: PhotosRootPatch.kt */
    public static final class a extends c {
        public final boolean b;

        public a(boolean z) {
            this.b = z;
        }
    }

    /* compiled from: PhotosRootPatch.kt */
    public static final class b extends c {
        public final boolean b;

        public b(boolean z) {
            this.b = z;
        }
    }

    /* compiled from: PhotosRootPatch.kt */
    /* renamed from: com.vk.photos.root.presentation.c$c, reason: collision with other inner class name */
    public static final class C1510c extends c {
        public final boolean b;

        public C1510c(boolean z) {
            this.b = z;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C1510c) && this.b == ((C1510c) obj).b;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.b);
        }

        public final String toString() {
            return q0.a(new StringBuilder("TabSelectMode(enable="), this.b, ')');
        }
    }

    /* compiled from: PhotosRootPatch.kt */
    public static final class d extends c {
        public final int b;

        public d(int i) {
            this.b = i;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof d) && this.b == ((d) obj).b;
        }

        public final int hashCode() {
            return Integer.hashCode(this.b);
        }

        public final String toString() {
            return vu5.b(new StringBuilder("TabSelected(position="), this.b, ')');
        }
    }
}
