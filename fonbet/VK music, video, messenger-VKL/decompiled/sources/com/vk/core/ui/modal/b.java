package com.vk.core.ui.modal;

import android.view.View;
import android.view.ViewGroup;
import defpackage.q0;
import xsna.br;
import xsna.c5v0;
import xsna.epx;
import xsna.qoy;

/* compiled from: ModalContent.kt */
/* loaded from: classes17.dex */
public interface b {

    /* compiled from: ModalContent.kt */
    public interface a extends b {

        /* compiled from: ModalContent.kt */
        /* renamed from: com.vk.core.ui.modal.b$a$a, reason: collision with other inner class name */
        public static final class C0789a implements a {
            public final ViewGroup a;
            public final boolean b;

            public C0789a(ViewGroup viewGroup, boolean z) {
                this.a = viewGroup;
                this.b = z;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof C0789a)) {
                    return false;
                }
                C0789a c0789a = (C0789a) obj;
                return this.a.equals(c0789a.a) && this.b == c0789a.b;
            }

            public final int hashCode() {
                return Boolean.hashCode(this.b) + (this.a.hashCode() * 31);
            }

            public final String toString() {
                StringBuilder sb = new StringBuilder("Custom(contentView=");
                sb.append(this.a);
                sb.append(", hasCloseButton=");
                return q0.a(sb, this.b, ')');
            }
        }

        /* compiled from: ModalContent.kt */
        /* renamed from: com.vk.core.ui.modal.b$a$b, reason: collision with other inner class name */
        public static final class C0790b implements a {
            public final c5v0.c a;
            public final c5v0.b b;
            public final View c;
            public final c5v0.a d;
            public final boolean e;
            public final boolean f;

            public C0790b() {
                this(null, null, null, null, 63);
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof C0790b)) {
                    return false;
                }
                C0790b c0790b = (C0790b) obj;
                return epx.f(this.a, c0790b.a) && epx.f(this.b, c0790b.b) && epx.f(this.c, c0790b.c) && epx.f(this.d, c0790b.d) && this.e == c0790b.e && this.f == c0790b.f;
            }

            public final int hashCode() {
                c5v0.c cVar = this.a;
                int hashCode = (cVar == null ? 0 : cVar.hashCode()) * 31;
                c5v0.b bVar = this.b;
                int hashCode2 = (hashCode + (bVar == null ? 0 : bVar.hashCode())) * 31;
                View view = this.c;
                int hashCode3 = (hashCode2 + (view == null ? 0 : view.hashCode())) * 31;
                c5v0.a aVar = this.d;
                return Boolean.hashCode(this.f) + qoy.b((hashCode3 + (aVar != null ? aVar.hashCode() : 0)) * 31, 31, this.e);
            }

            public final String toString() {
                StringBuilder sb = new StringBuilder("Default(topContent=");
                sb.append(this.a);
                sb.append(", mainContent=");
                sb.append(this.b);
                sb.append(", bottomContent=");
                sb.append(this.c);
                sb.append(", buttonsContent=");
                sb.append(this.d);
                sb.append(", isWithPaddings=");
                sb.append(this.e);
                sb.append(", hasCloseButton=");
                return q0.a(sb, this.f, ')');
            }

            public /* synthetic */ C0790b(c5v0.c cVar, c5v0.b bVar, View view, c5v0.a aVar, int i) {
                this((i & 1) != 0 ? null : cVar, (i & 2) != 0 ? null : bVar, (i & 4) != 0 ? null : view, (i & 8) != 0 ? null : aVar, true, (i & 32) == 0);
            }

            public C0790b(c5v0.c cVar, c5v0.b bVar, View view, c5v0.a aVar, boolean z, boolean z2) {
                this.a = cVar;
                this.b = bVar;
                this.c = view;
                this.d = aVar;
                this.e = z;
                this.f = z2;
            }
        }
    }

    /* compiled from: ModalContent.kt */
    /* renamed from: com.vk.core.ui.modal.b$b, reason: collision with other inner class name */
    public static final class C0791b implements b {
        public final View a;
        public final View b;

        public C0791b(View view, ViewGroup viewGroup) {
            this.a = view;
            this.b = viewGroup;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C0791b)) {
                return false;
            }
            C0791b c0791b = (C0791b) obj;
            return epx.f(this.a, c0791b.a) && epx.f(this.b, c0791b.b);
        }

        public final int hashCode() {
            int hashCode = this.a.hashCode() * 31;
            View view = this.b;
            return hashCode + (view == null ? 0 : view.hashCode());
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("Page(contentView=");
            sb.append(this.a);
            sb.append(", topBar=");
            return br.b(sb, this.b, ')');
        }
    }
}
