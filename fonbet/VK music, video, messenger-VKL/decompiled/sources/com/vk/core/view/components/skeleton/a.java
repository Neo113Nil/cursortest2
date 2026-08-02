package com.vk.core.view.components.skeleton;

import android.graphics.Rect;
import android.view.ViewGroup;
import xsna.epx;
import xsna.yq;

/* compiled from: VkShimmerArea.kt */
/* loaded from: classes17.dex */
public abstract class a {

    /* compiled from: VkShimmerArea.kt */
    /* renamed from: com.vk.core.view.components.skeleton.a$a, reason: collision with other inner class name */
    public static final class C0863a extends a {
        public final ViewGroup a;

        public C0863a(ViewGroup viewGroup) {
            this.a = viewGroup;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C0863a) && epx.f(this.a, ((C0863a) obj).a);
        }

        public final int hashCode() {
            return this.a.hashCode();
        }

        public final String toString() {
            return "Container(container=" + this.a + ')';
        }
    }

    /* compiled from: VkShimmerArea.kt */
    public static final class b extends a {
        public final Rect a;

        public b(Rect rect) {
            this.a = rect;
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
            return yq.c(new StringBuilder("LocationOnScreen(screenRect="), this.a, ')');
        }
    }

    /* compiled from: VkShimmerArea.kt */
    public static final class c extends a {
        public static final c a = new c();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof c);
        }

        public final int hashCode() {
            return -1766983577;
        }

        public final String toString() {
            return "ThisView";
        }
    }
}
