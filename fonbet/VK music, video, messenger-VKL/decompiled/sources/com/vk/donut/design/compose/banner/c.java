package com.vk.donut.design.compose.banner;

import java.util.List;
import xsna.epx;
import xsna.ho8;
import xsna.jr;

/* compiled from: DonutBanner.kt */
/* loaded from: classes18.dex */
public interface c {

    /* compiled from: DonutBanner.kt */
    public static final class a implements c {
        public final List a;

        public a(List list) {
            this.a = list;
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
            return jr.a(')', new StringBuilder("DonutContent(orderedList="), this.a);
        }
    }

    /* compiled from: DonutBanner.kt */
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
            int hashCode = this.a.hashCode() * 31;
            String str = this.b;
            return hashCode + (str == null ? 0 : str.hashCode());
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("SubtitleContent(subtitle=");
            sb.append(this.a);
            sb.append(", accessibilitySubtitle=");
            return ho8.a(sb, this.b, ')');
        }
    }
}
