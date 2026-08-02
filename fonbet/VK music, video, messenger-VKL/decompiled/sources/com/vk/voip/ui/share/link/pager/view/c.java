package com.vk.voip.ui.share.link.pager.view;

import xsna.epx;
import xsna.ho8;

/* compiled from: VoipShareLinkPagerLinkType.kt */
/* loaded from: classes7.dex */
public interface c {

    /* compiled from: VoipShareLinkPagerLinkType.kt */
    public static final class a implements c {
        public final String a;

        public a(String str) {
            this.a = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && epx.f(this.a, ((a) obj).a);
        }

        public final int hashCode() {
            return this.a.hashCode();
        }

        public final String toString() {
            return ho8.a(new StringBuilder("Long(link="), this.a, ')');
        }
    }

    /* compiled from: VoipShareLinkPagerLinkType.kt */
    public static final class b implements c {
        public final String a;
        public final String b;

        public b(String str, String str2) {
            this.a = str;
            this.b = str2;
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
            StringBuilder sb = new StringBuilder("ShortWithPassword(link=");
            sb.append(this.a);
            sb.append(", password=");
            return ho8.a(sb, this.b, ')');
        }
    }
}
