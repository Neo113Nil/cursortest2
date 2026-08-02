package com.vk.dto.newsfeed.entries;

import android.os.Parcel;
import com.vk.core.serialize.Serializer;
import com.vk.dto.common.LinkButton;
import com.vk.dto.common.actions.Action;
import com.vk.feed.core.models.news.NewsEntry;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import xsna.c5g;
import xsna.epx;
import xsna.ho8;
import xsna.iux0;
import xsna.j5g;
import xsna.urd0;

/* compiled from: Digest.kt */
/* loaded from: classes18.dex */
public final class Digest extends NewsEntry implements iux0 {
    public static final Serializer.c<Digest> CREATOR = new a();
    public final String i;
    public final String j;
    public final Header k;
    public final Footer l;
    public final List<DigestItem> m;
    public int n;
    public final String o;
    public String p;
    public final ArrayList q;

    /* compiled from: Digest.kt */
    public static final class Button implements Serializer.StreamParcelable {
        public static final Serializer.c<Button> CREATOR = new a();
        public final String b;
        public final Action c;

        /* compiled from: Serializer.kt */
        public static final class a extends Serializer.c<Button> {
            @Override // com.vk.core.serialize.Serializer.c
            public final Button a(Serializer serializer) {
                return new Button(serializer.H(), (Action) serializer.G(Action.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Button[i];
            }
        }

        public Button(String str, Action action) {
            this.b = str;
            this.c = action;
        }

        @Override // com.vk.core.serialize.Serializer.StreamParcelable
        public final void O7(Serializer serializer) {
            serializer.j0(this.b);
            serializer.i0(this.c);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Button)) {
                return false;
            }
            Button button = (Button) obj;
            return epx.f(this.b, button.b) && epx.f(this.c, button.c);
        }

        public final int hashCode() {
            int hashCode = this.b.hashCode() * 31;
            Action action = this.c;
            return hashCode + (action == null ? 0 : action.hashCode());
        }

        public final String toString() {
            return "Button(title=" + this.b + ", action=" + this.c + ')';
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            Serializer.StreamParcelable.a.a(this, parcel);
        }
    }

    /* compiled from: Digest.kt */
    public static final class Footer implements Serializer.StreamParcelable {
        public static final Serializer.c<Footer> CREATOR = new a();
        public final String b;
        public final String c;
        public final LinkButton d;
        public final String e;

        /* compiled from: Serializer.kt */
        public static final class a extends Serializer.c<Footer> {
            @Override // com.vk.core.serialize.Serializer.c
            public final Footer a(Serializer serializer) {
                return new Footer(serializer.H(), serializer.H(), (LinkButton) serializer.G(LinkButton.class.getClassLoader()), serializer.H());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Footer[i];
            }
        }

        public Footer(String str, String str2, LinkButton linkButton, String str3) {
            this.b = str;
            this.c = str2;
            this.d = linkButton;
            this.e = str3;
        }

        @Override // com.vk.core.serialize.Serializer.StreamParcelable
        public final void O7(Serializer serializer) {
            serializer.j0(this.b);
            serializer.j0(this.c);
            serializer.i0(this.d);
            serializer.j0(this.e);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Footer)) {
                return false;
            }
            Footer footer = (Footer) obj;
            return epx.f(this.b, footer.b) && epx.f(this.c, footer.c) && epx.f(this.d, footer.d) && epx.f(this.e, footer.e);
        }

        public final int hashCode() {
            int hashCode = this.b.hashCode() * 31;
            String str = this.c;
            int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
            LinkButton linkButton = this.d;
            int hashCode3 = (hashCode2 + (linkButton == null ? 0 : linkButton.hashCode())) * 31;
            String str2 = this.e;
            return hashCode3 + (str2 != null ? str2.hashCode() : 0);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("Footer(style=");
            sb.append(this.b);
            sb.append(", text=");
            sb.append(this.c);
            sb.append(", button=");
            sb.append(this.d);
            sb.append(", feedId=");
            return ho8.a(sb, this.e, ')');
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            Serializer.StreamParcelable.a.a(this, parcel);
        }
    }

    /* compiled from: Digest.kt */
    public static final class Header implements Serializer.StreamParcelable {
        public static final Serializer.c<Header> CREATOR = new a();
        public final String b;
        public final String c;
        public final String d;
        public final String e;
        public final Button f;

        /* compiled from: Serializer.kt */
        public static final class a extends Serializer.c<Header> {
            @Override // com.vk.core.serialize.Serializer.c
            public final Header a(Serializer serializer) {
                return new Header(serializer.H(), serializer.H(), serializer.H(), serializer.H(), (Button) serializer.G(Button.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Header[i];
            }
        }

        public Header(String str, String str2, String str3, String str4, Button button) {
            this.b = str;
            this.c = str2;
            this.d = str3;
            this.e = str4;
            this.f = button;
        }

        @Override // com.vk.core.serialize.Serializer.StreamParcelable
        public final void O7(Serializer serializer) {
            serializer.j0(this.b);
            serializer.j0(this.c);
            serializer.j0(this.d);
            serializer.j0(this.e);
            serializer.i0(this.f);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Header)) {
                return false;
            }
            Header header = (Header) obj;
            return epx.f(this.b, header.b) && epx.f(this.c, header.c) && epx.f(this.d, header.d) && epx.f(this.e, header.e) && epx.f(this.f, header.f);
        }

        public final int hashCode() {
            int a2 = urd0.a(this.b.hashCode() * 31, 31, this.c);
            String str = this.d;
            int hashCode = (a2 + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.e;
            int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
            Button button = this.f;
            return hashCode2 + (button != null ? button.hashCode() : 0);
        }

        public final String toString() {
            return "Header(style=" + this.b + ", title=" + this.c + ", badgeText=" + this.d + ", subtitle=" + this.e + ", button=" + this.f + ')';
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            Serializer.StreamParcelable.a.a(this, parcel);
        }
    }

    /* compiled from: Serializer.kt */
    public static final class a extends Serializer.c<Digest> {
        @Override // com.vk.core.serialize.Serializer.c
        public final Digest a(Serializer serializer) {
            return new Digest(serializer.H(), serializer.H(), (Header) serializer.G(Header.class.getClassLoader()), (Footer) serializer.G(Footer.class.getClassLoader()), serializer.j(DigestItem.CREATOR), serializer.u(), serializer.H(), serializer.H());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new Digest[i];
        }
    }

    public Digest(String str, String str2, Header header, Footer footer, List<DigestItem> list, int i, String str3, String str4) {
        super(new NewsEntry.TrackData(str3, 0, 0L, false, false, null, null, 0, 254, null));
        this.i = str;
        this.j = str2;
        this.k = header;
        this.l = footer;
        this.m = list;
        this.n = i;
        this.o = str3;
        this.p = str4;
        List<DigestItem> list2 = list;
        ArrayList arrayList = new ArrayList(c5g.u(list2, 10));
        Iterator<T> it = list2.iterator();
        while (it.hasNext()) {
            arrayList.add(((DigestItem) it.next()).g);
        }
        this.q = arrayList;
    }

    @Override // com.vk.feed.core.models.news.NewsEntry
    public final String Ab() {
        return "digest_" + this.i;
    }

    @Override // com.vk.feed.core.models.news.NewsEntry
    public final String Bb() {
        return Ab();
    }

    @Override // com.vk.feed.core.models.news.NewsEntry
    public final String Db() {
        return "digest";
    }

    @Override // com.vk.core.serialize.Serializer.StreamParcelable
    public final void O7(Serializer serializer) {
        serializer.j0(this.i);
        serializer.j0(this.j);
        serializer.i0(this.k);
        serializer.i0(this.l);
        serializer.o0(this.m);
        serializer.S(this.n);
        serializer.j0(this.o);
        serializer.j0(this.p);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!Digest.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        Digest digest = (Digest) obj;
        return epx.f(this.i, digest.i) && epx.f(this.j, digest.j) && epx.f(j5g.a0(this.m), j5g.a0(digest.m));
    }

    @Override // xsna.iux0, xsna.kru
    public final String getTitle() {
        return this.p;
    }

    public final int hashCode() {
        int hashCode = this.i.hashCode() * 31;
        String str = this.j;
        int hashCode2 = hashCode + (str != null ? str.hashCode() : 0);
        DigestItem digestItem = (DigestItem) j5g.a0(this.m);
        if (digestItem != null) {
            return digestItem.hashCode() + (hashCode2 * 31);
        }
        return hashCode2;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Digest(template=");
        sb.append(this.i);
        sb.append(", feedId=");
        sb.append(this.j);
        sb.append(", header=");
        sb.append(this.k);
        sb.append(", footer=");
        sb.append(this.l);
        sb.append(", items=");
        sb.append(this.m);
        sb.append(", flags=");
        sb.append(this.n);
        sb.append(", trackCode=");
        sb.append(this.o);
        sb.append(", title=");
        return ho8.a(sb, this.p, ')');
    }

    @Override // com.vk.feed.core.models.news.NewsEntry
    public final int zb() {
        return 24;
    }

    /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
        java.lang.NullPointerException
        */
    public Digest(java.lang.String r10, java.lang.String r11, com.vk.dto.newsfeed.entries.Digest.Header r12, com.vk.dto.newsfeed.entries.Digest.Footer r13, java.util.List r14, int r15, java.lang.String r16, java.lang.String r17, int r18, xsna.zcl r19) {
        /*
            r9 = this;
            r0 = r18
            r0 = r0 & 128(0x80, float:1.8E-43)
            if (r0 == 0) goto L17
            if (r12 == 0) goto Lb
            java.lang.String r0 = r12.c
            goto Lc
        Lb:
            r0 = 0
        Lc:
            r8 = r0
            r1 = r10
            r2 = r11
            r3 = r12
            r4 = r13
            r5 = r14
            r6 = r15
            r7 = r16
            r0 = r9
            goto L22
        L17:
            r8 = r17
            r0 = r9
            r1 = r10
            r2 = r11
            r3 = r12
            r4 = r13
            r5 = r14
            r6 = r15
            r7 = r16
        L22:
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.vk.dto.newsfeed.entries.Digest.<init>(java.lang.String, java.lang.String, com.vk.dto.newsfeed.entries.Digest$Header, com.vk.dto.newsfeed.entries.Digest$Footer, java.util.List, int, java.lang.String, java.lang.String, int, xsna.zcl):void");
    }
}
