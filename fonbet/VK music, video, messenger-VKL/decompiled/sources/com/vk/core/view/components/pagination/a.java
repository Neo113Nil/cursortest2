package com.vk.core.view.components.pagination;

import xsna.xq;

/* compiled from: PaginationDotsMode.kt */
/* loaded from: classes17.dex */
public interface a {

    /* compiled from: PaginationDotsMode.kt */
    /* renamed from: com.vk.core.view.components.pagination.a$a, reason: collision with other inner class name */
    public static final class C0850a implements a {
        public static final C0850a a = new C0850a();
    }

    /* compiled from: PaginationDotsMode.kt */
    public static final class b implements a {
        public final float a;

        public b(float f) {
            this.a = f;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && Float.compare(this.a, ((b) obj).a) == 0;
        }

        public final int hashCode() {
            return Float.hashCode(this.a);
        }

        public final String toString() {
            return xq.c(')', this.a, new StringBuilder("Progress(progress="));
        }
    }
}
