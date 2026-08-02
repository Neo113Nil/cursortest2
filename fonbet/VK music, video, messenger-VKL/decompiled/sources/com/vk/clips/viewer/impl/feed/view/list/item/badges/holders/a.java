package com.vk.clips.viewer.impl.feed.view.list.item.badges.holders;

import android.util.Size;
import xsna.rzt0;
import xsna.shy;
import xsna.tlo0;
import xsna.x7g;

/* compiled from: BaseBadgeHolder.kt */
/* loaded from: classes17.dex */
public final class a implements rzt0 {
    public final tlo0.h a;
    public final x7g b;
    public final C0710a c;

    /* compiled from: BaseBadgeHolder.kt */
    /* renamed from: com.vk.clips.viewer.impl.feed.view.list.item.badges.holders.a$a, reason: collision with other inner class name */
    public static final class C0710a {
        public final Size a;
        public final x7g b;

        public C0710a(Size size, x7g x7gVar) {
            this.a = size;
            this.b = x7gVar;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C0710a)) {
                return false;
            }
            C0710a c0710a = (C0710a) obj;
            return this.a.equals(c0710a.a) && this.b.equals(c0710a.b);
        }

        public final int hashCode() {
            return Integer.hashCode(this.b.a) + (this.a.hashCode() * 31);
        }

        public final String toString() {
            return "SeparatorConfig(size=" + this.a + ", color=" + this.b + ')';
        }
    }

    public a(tlo0.h hVar, x7g x7gVar, C0710a c0710a) {
        this.a = hVar;
        this.b = x7gVar;
        this.c = c0710a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return this.a.equals(aVar.a) && this.b.equals(aVar.b) && this.c.equals(aVar.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + shy.a(this.b.a, this.a.a.hashCode() * 31, 31);
    }

    public final String toString() {
        return "LabelWithSeparator(label=" + this.a + ", labelColor=" + this.b + ", leadingSeparatorConfig=" + this.c + ')';
    }
}
