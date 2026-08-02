package com.vk.geo.api.data;

import android.os.Parcel;
import android.os.Parcelable;
import defpackage.q0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import xsna.ao;
import xsna.en;
import xsna.epx;
import xsna.fw3;
import xsna.ho8;
import xsna.qoy;
import xsna.shy;
import xsna.urd0;
import xsna.zjh0;

/* compiled from: GeoStaticPreviewInput.kt */
/* loaded from: classes18.dex */
public final class GeoStaticPreviewInput implements Parcelable {
    public static final Parcelable.Creator<GeoStaticPreviewInput> CREATOR = new a();
    public final int b;
    public final int c;
    public final int d;
    public final Background e;
    public final boolean f;
    public final boolean g;
    public final boolean h;
    public final List<Item> i;
    public final IconDrawConfig j;
    public final int k;
    public final int l;
    public final boolean m;
    public final boolean n;

    /* compiled from: GeoStaticPreviewInput.kt */
    public interface Background extends Parcelable {

        /* compiled from: GeoStaticPreviewInput.kt */
        public static final class AsColorInt implements Background {
            public static final Parcelable.Creator<AsColorInt> CREATOR = new a();
            public final int b;

            /* compiled from: GeoStaticPreviewInput.kt */
            public static final class a implements Parcelable.Creator<AsColorInt> {
                @Override // android.os.Parcelable.Creator
                public final AsColorInt createFromParcel(Parcel parcel) {
                    return new AsColorInt(parcel.readInt());
                }

                @Override // android.os.Parcelable.Creator
                public final AsColorInt[] newArray(int i) {
                    return new AsColorInt[i];
                }
            }

            public AsColorInt(int i) {
                this.b = i;
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel parcel, int i) {
                parcel.writeInt(this.b);
            }
        }

        /* compiled from: GeoStaticPreviewInput.kt */
        public static final class AsColorRes implements Background {
            public static final Parcelable.Creator<AsColorRes> CREATOR = new a();
            public final int b;

            /* compiled from: GeoStaticPreviewInput.kt */
            public static final class a implements Parcelable.Creator<AsColorRes> {
                @Override // android.os.Parcelable.Creator
                public final AsColorRes createFromParcel(Parcel parcel) {
                    return new AsColorRes(parcel.readInt());
                }

                @Override // android.os.Parcelable.Creator
                public final AsColorRes[] newArray(int i) {
                    return new AsColorRes[i];
                }
            }

            public AsColorRes(int i) {
                this.b = i;
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel parcel, int i) {
                parcel.writeInt(this.b);
            }
        }

        /* compiled from: GeoStaticPreviewInput.kt */
        public static final class AsDrawableRes implements Background {
            public static final Parcelable.Creator<AsDrawableRes> CREATOR = new a();
            public final int b;

            /* compiled from: GeoStaticPreviewInput.kt */
            public static final class a implements Parcelable.Creator<AsDrawableRes> {
                @Override // android.os.Parcelable.Creator
                public final AsDrawableRes createFromParcel(Parcel parcel) {
                    return new AsDrawableRes(parcel.readInt());
                }

                @Override // android.os.Parcelable.Creator
                public final AsDrawableRes[] newArray(int i) {
                    return new AsDrawableRes[i];
                }
            }

            public AsDrawableRes(int i) {
                this.b = i;
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel parcel, int i) {
                parcel.writeInt(this.b);
            }
        }
    }

    /* compiled from: GeoStaticPreviewInput.kt */
    public static final class Item implements Parcelable {
        public static final Parcelable.Creator<Item> CREATOR = new a();
        public final String b;
        public final String c;
        public final double d;
        public final double e;
        public final double f;
        public final String g;

        /* compiled from: GeoStaticPreviewInput.kt */
        public static final class a implements Parcelable.Creator<Item> {
            @Override // android.os.Parcelable.Creator
            public final Item createFromParcel(Parcel parcel) {
                return new Item(parcel.readString(), parcel.readString(), parcel.readDouble(), parcel.readDouble(), parcel.readDouble(), parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final Item[] newArray(int i) {
                return new Item[i];
            }
        }

        public Item(String str, String str2, double d, double d2, double d3, String str3) {
            this.b = str;
            this.c = str2;
            this.d = d;
            this.e = d2;
            this.f = d3;
            this.g = str3;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Item)) {
                return false;
            }
            Item item = (Item) obj;
            return epx.f(this.b, item.b) && epx.f(this.c, item.c) && Double.compare(this.d, item.d) == 0 && Double.compare(this.e, item.e) == 0 && Double.compare(this.f, item.f) == 0 && epx.f(this.g, item.g);
        }

        public final int hashCode() {
            int b = zjh0.b(this.f, zjh0.b(this.e, zjh0.b(this.d, urd0.a(this.b.hashCode() * 31, 31, this.c), 31), 31), 31);
            String str = this.g;
            return b + (str == null ? 0 : str.hashCode());
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("Item(id=");
            sb.append(this.b);
            sb.append(", title=");
            sb.append(this.c);
            sb.append(", latitude=");
            sb.append(this.d);
            sb.append(", longitude=");
            sb.append(this.e);
            sb.append(", score=");
            sb.append(this.f);
            sb.append(", imageUrl=");
            return ho8.a(sb, this.g, ')');
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.writeString(this.b);
            parcel.writeString(this.c);
            parcel.writeDouble(this.d);
            parcel.writeDouble(this.e);
            parcel.writeDouble(this.f);
            parcel.writeString(this.g);
        }
    }

    /* compiled from: GeoStaticPreviewInput.kt */
    public static final class a implements Parcelable.Creator<GeoStaticPreviewInput> {
        /* JADX WARN: Multi-variable type inference failed */
        @Override // android.os.Parcelable.Creator
        public final GeoStaticPreviewInput createFromParcel(Parcel parcel) {
            int i;
            boolean z;
            int i2;
            boolean z2;
            boolean z3;
            boolean z4;
            int readInt = parcel.readInt();
            int readInt2 = parcel.readInt();
            int readInt3 = parcel.readInt();
            Background background = (Background) parcel.readParcelable(GeoStaticPreviewInput.class.getClassLoader());
            boolean z5 = false;
            boolean z6 = 1;
            if (parcel.readInt() != 0) {
                i = 0;
                z5 = true;
            } else {
                i = 0;
            }
            if (parcel.readInt() != 0) {
                z = true;
            } else {
                z = true;
                z6 = i;
            }
            if (parcel.readInt() != 0) {
                i2 = z ? 1 : 0;
                z2 = z;
            } else {
                i2 = z ? 1 : 0;
                z2 = i;
            }
            int readInt4 = parcel.readInt();
            int i3 = i2;
            ArrayList arrayList = new ArrayList(readInt4);
            int i4 = i;
            while (i4 != readInt4) {
                i4 = en.a(Item.CREATOR, parcel, arrayList, i4, i3);
            }
            IconDrawConfig createFromParcel = IconDrawConfig.CREATOR.createFromParcel(parcel);
            int readInt5 = parcel.readInt();
            int i5 = i3;
            int readInt6 = parcel.readInt();
            if (parcel.readInt() != 0) {
                z3 = i5 == true ? 1 : 0;
                z4 = i5;
            } else {
                z3 = i5 == true ? 1 : 0;
                z4 = i;
            }
            boolean z7 = z3;
            if (parcel.readInt() == 0) {
                z7 = i;
            }
            return new GeoStaticPreviewInput(readInt, readInt2, readInt3, background, z5, z6, z2, arrayList, createFromParcel, readInt5, readInt6, z4, z7);
        }

        @Override // android.os.Parcelable.Creator
        public final GeoStaticPreviewInput[] newArray(int i) {
            return new GeoStaticPreviewInput[i];
        }
    }

    public GeoStaticPreviewInput(int i, int i2, int i3, Background background, boolean z, boolean z2, boolean z3, List<Item> list, IconDrawConfig iconDrawConfig, int i4, int i5, boolean z4, boolean z5) {
        this.b = i;
        this.c = i2;
        this.d = i3;
        this.e = background;
        this.f = z;
        this.g = z2;
        this.h = z3;
        this.i = list;
        this.j = iconDrawConfig;
        this.k = i4;
        this.l = i5;
        this.m = z4;
        this.n = z5;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof GeoStaticPreviewInput)) {
            return false;
        }
        GeoStaticPreviewInput geoStaticPreviewInput = (GeoStaticPreviewInput) obj;
        return this.b == geoStaticPreviewInput.b && this.c == geoStaticPreviewInput.c && this.d == geoStaticPreviewInput.d && epx.f(this.e, geoStaticPreviewInput.e) && this.f == geoStaticPreviewInput.f && this.g == geoStaticPreviewInput.g && this.h == geoStaticPreviewInput.h && epx.f(this.i, geoStaticPreviewInput.i) && epx.f(this.j, geoStaticPreviewInput.j) && this.k == geoStaticPreviewInput.k && this.l == geoStaticPreviewInput.l && this.m == geoStaticPreviewInput.m && this.n == geoStaticPreviewInput.n;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.n) + qoy.b(shy.a(this.l, shy.a(this.k, (this.j.hashCode() + fw3.a(qoy.b(qoy.b(qoy.b((this.e.hashCode() + shy.a(this.d, shy.a(this.c, Integer.hashCode(this.b) * 31, 31), 31)) * 31, 31, this.f), 31, this.g), 31, this.h), 31, this.i)) * 31, 31), 31), 31, this.m);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("GeoStaticPreviewInput(width=");
        sb.append(this.b);
        sb.append(", height=");
        sb.append(this.c);
        sb.append(", cornerRadius=");
        sb.append(this.d);
        sb.append(", background=");
        sb.append(this.e);
        sb.append(", resetBackground=");
        sb.append(this.f);
        sb.append(", isLightTheme=");
        sb.append(this.g);
        sb.append(", needClustering=");
        sb.append(this.h);
        sb.append(", items=");
        sb.append(this.i);
        sb.append(", config=");
        sb.append(this.j);
        sb.append(", dotsCount=");
        sb.append(this.k);
        sb.append(", postsCount=");
        sb.append(this.l);
        sb.append(", debugDrawMarkersOnStaticApi=");
        sb.append(this.m);
        sb.append(", drawScoreAsSubtitle=");
        return q0.a(sb, this.n, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.b);
        parcel.writeInt(this.c);
        parcel.writeInt(this.d);
        parcel.writeParcelable(this.e, i);
        parcel.writeInt(this.f ? 1 : 0);
        parcel.writeInt(this.g ? 1 : 0);
        parcel.writeInt(this.h ? 1 : 0);
        Iterator a2 = ao.a(parcel, this.i);
        while (a2.hasNext()) {
            ((Item) a2.next()).writeToParcel(parcel, i);
        }
        this.j.writeToParcel(parcel, i);
        parcel.writeInt(this.k);
        parcel.writeInt(this.l);
        parcel.writeInt(this.m ? 1 : 0);
        parcel.writeInt(this.n ? 1 : 0);
    }

    /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
        java.lang.NullPointerException
        */
    public GeoStaticPreviewInput(int r18, int r19, int r20, com.vk.geo.api.data.GeoStaticPreviewInput.Background r21, boolean r22, boolean r23, boolean r24, java.util.List r25, com.vk.geo.api.data.IconDrawConfig r26, int r27, int r28, boolean r29, boolean r30, int r31, xsna.zcl r32) {
        /*
            r17 = this;
            r0 = r31
            r1 = r0 & 1
            r2 = -1
            if (r1 == 0) goto L9
            r4 = r2
            goto Lb
        L9:
            r4 = r18
        Lb:
            r1 = r0 & 2
            if (r1 == 0) goto L11
            r5 = r2
            goto L13
        L11:
            r5 = r19
        L13:
            r1 = r0 & 4
            r2 = 10
            if (r1 == 0) goto L1b
            r6 = r2
            goto L1d
        L1b:
            r6 = r20
        L1d:
            r1 = r0 & 8
            if (r1 == 0) goto L2b
            com.vk.geo.api.data.GeoStaticPreviewInput$Background$AsColorInt r1 = new com.vk.geo.api.data.GeoStaticPreviewInput$Background$AsColorInt
            r3 = -7829368(0xffffffffff888888, float:NaN)
            r1.<init>(r3)
            r7 = r1
            goto L2d
        L2b:
            r7 = r21
        L2d:
            r1 = r0 & 16
            r3 = 0
            if (r1 == 0) goto L34
            r8 = r3
            goto L36
        L34:
            r8 = r22
        L36:
            r1 = r0 & 64
            if (r1 == 0) goto L3d
            r1 = 1
            r10 = r1
            goto L3f
        L3d:
            r10 = r24
        L3f:
            r1 = r0 & 256(0x100, float:3.59E-43)
            if (r1 == 0) goto L49
            android.os.Parcelable$Creator<com.vk.geo.api.data.IconDrawConfig> r1 = com.vk.geo.api.data.IconDrawConfig.CREATOR
            com.vk.geo.api.data.IconDrawConfig r1 = com.vk.geo.api.data.IconDrawConfig.x
            r12 = r1
            goto L4b
        L49:
            r12 = r26
        L4b:
            r1 = r0 & 512(0x200, float:7.17E-43)
            if (r1 == 0) goto L51
            r13 = r2
            goto L53
        L51:
            r13 = r27
        L53:
            r1 = r0 & 1024(0x400, float:1.435E-42)
            if (r1 == 0) goto L5a
            r1 = 2
            r14 = r1
            goto L5c
        L5a:
            r14 = r28
        L5c:
            r1 = r0 & 2048(0x800, float:2.87E-42)
            if (r1 == 0) goto L62
            r15 = r3
            goto L64
        L62:
            r15 = r29
        L64:
            r0 = r0 & 4096(0x1000, float:5.74E-42)
            if (r0 == 0) goto L71
            r16 = r3
            r9 = r23
            r11 = r25
            r3 = r17
            goto L79
        L71:
            r16 = r30
            r3 = r17
            r9 = r23
            r11 = r25
        L79:
            r3.<init>(r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.vk.geo.api.data.GeoStaticPreviewInput.<init>(int, int, int, com.vk.geo.api.data.GeoStaticPreviewInput$Background, boolean, boolean, boolean, java.util.List, com.vk.geo.api.data.IconDrawConfig, int, int, boolean, boolean, int, xsna.zcl):void");
    }
}
