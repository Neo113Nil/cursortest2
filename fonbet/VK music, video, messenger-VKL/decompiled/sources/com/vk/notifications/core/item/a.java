package com.vk.notifications.core.item;

import com.vk.notifications.core.item.NotificationImage;
import java.util.List;
import xsna.epx;
import xsna.ho8;
import xsna.snv;

/* compiled from: NotificationAttachment.kt */
/* loaded from: classes4.dex */
public interface a {

    /* compiled from: NotificationAttachment.kt */
    /* renamed from: com.vk.notifications.core.item.a$a, reason: collision with other inner class name */
    public static final class C1441a implements a {
        public final CharSequence a;
        public final String b;
        public final snv c;

        public C1441a() {
            this(7);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C1441a)) {
                return false;
            }
            C1441a c1441a = (C1441a) obj;
            return epx.f(this.a, c1441a.a) && epx.f(this.b, c1441a.b) && epx.f(this.c, c1441a.c);
        }

        public final int hashCode() {
            CharSequence charSequence = this.a;
            int hashCode = (charSequence == null ? 0 : charSequence.hashCode()) * 31;
            String str = this.b;
            int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
            snv snvVar = this.c;
            return hashCode2 + (snvVar != null ? snvVar.hashCode() : 0);
        }

        public final String toString() {
            return "Bubble(primaryText=" + ((Object) this.a) + ", secondaryText=" + this.b + ", action=" + this.c + ')';
        }

        public /* synthetic */ C1441a(int i) {
            this((i & 1) != 0 ? null : "abc", (i & 2) != 0 ? null : "abc", null);
        }

        public C1441a(CharSequence charSequence, String str, snv snvVar) {
            this.a = charSequence;
            this.b = str;
            this.c = snvVar;
        }
    }

    /* compiled from: NotificationAttachment.kt */
    public static final class b implements a {
        public final List<String> a;
        public final String b;

        public b(List<String> list, String str) {
            this.a = list;
            this.b = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return epx.f(this.a, bVar.a) && epx.f(this.b, bVar.b);
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.a.hashCode() * 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("UserStack(images=");
            sb.append(this.a);
            sb.append(", text=");
            return ho8.a(sb, this.b, ')');
        }
    }

    /* compiled from: NotificationAttachment.kt */
    public static final class c implements a {
        public final List<NotificationImage> a;
        public final NotificationImage.Shape b;

        public c(List<NotificationImage> list, NotificationImage.Shape shape) {
            this.a = list;
            this.b = shape;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return epx.f(this.a, cVar.a) && this.b == cVar.b;
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.a.hashCode() * 31);
        }

        public final String toString() {
            return "Visual(images=" + this.a + ", shape=" + this.b + ')';
        }
    }
}
