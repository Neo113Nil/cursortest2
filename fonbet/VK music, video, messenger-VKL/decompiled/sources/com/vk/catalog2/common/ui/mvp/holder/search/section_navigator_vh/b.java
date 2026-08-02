package com.vk.catalog2.common.ui.mvp.holder.search.section_navigator_vh;

import java.util.ArrayList;
import xsna.bo;
import xsna.epx;
import xsna.ho8;
import xsna.urd0;

/* compiled from: SectionNavigationLinksState.kt */
/* loaded from: classes16.dex */
public final class b {
    public final String a;
    public final String b;
    public final String c;
    public final a d;
    public final ArrayList e;

    /* compiled from: SectionNavigationLinksState.kt */
    public static final class a {
        public final String a;
        public final String b;
        public final String c;

        public a(String str, String str2, String str3) {
            this.a = str;
            this.b = str2;
            this.c = str3;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return epx.f(this.a, aVar.a) && epx.f(this.b, aVar.b) && epx.f(this.c, aVar.c);
        }

        public final int hashCode() {
            int a = urd0.a(this.a.hashCode() * 31, 31, this.b);
            String str = this.c;
            return a + (str == null ? 0 : str.hashCode());
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("Link(sectionName=");
            sb.append(this.a);
            sb.append(", targetSectionId=");
            sb.append(this.b);
            sb.append(", trackCode=");
            return ho8.a(sb, this.c, ')');
        }
    }

    public b(String str, String str2, String str3, a aVar, ArrayList arrayList) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = aVar;
        this.e = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return epx.f(this.a, bVar.a) && this.b.equals(bVar.b) && epx.f(this.c, bVar.c) && this.d.equals(bVar.d) && this.e.equals(bVar.e);
    }

    public final int hashCode() {
        return this.e.hashCode() + ((this.d.hashCode() + urd0.a(urd0.a(this.a.hashCode() * 31, 31, this.b), 31, this.c)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SectionNavigationLinksState(title=");
        sb.append(this.a);
        sb.append(", subtitle=");
        sb.append(this.b);
        sb.append(", imageUrl=");
        sb.append(this.c);
        sb.append(", primaryLink=");
        sb.append(this.d);
        sb.append(", links=");
        return bo.c(')', sb, this.e);
    }
}
