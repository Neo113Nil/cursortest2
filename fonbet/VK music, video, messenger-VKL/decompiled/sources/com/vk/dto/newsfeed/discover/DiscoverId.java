package com.vk.dto.newsfeed.discover;

import android.os.Parcel;
import com.vk.core.serialize.Serializer;
import com.vk.dto.newsfeed.discover.DiscoverCategoryType;
import xsna.bh10;
import xsna.epx;
import xsna.qoy;
import xsna.r11;
import xsna.shy;
import xsna.vu5;

/* compiled from: DiscoverId.kt */
/* loaded from: classes18.dex */
public final class DiscoverId implements Serializer.StreamParcelable {
    public final String b;
    public final int c;
    public final DiscoverCategoryType d;
    public final String e;
    public final boolean f;
    public final long g;
    public final long h;
    public static final DiscoverId i = new DiscoverId(null, -1, DiscoverCategoryType.DISCOVER_MEDIA, null, false, 0, 0, 112, null);
    public static final Serializer.c<DiscoverId> CREATOR = new b();

    /* compiled from: DiscoverId.kt */
    public static final class a {
        public static DiscoverId a(DiscoverCategory discoverCategory, int i) {
            DiscoverId discoverId = DiscoverId.i;
            return new DiscoverId(discoverCategory.b, i, discoverCategory.d, discoverCategory.c, false, 0L, 0L, 96, null);
        }

        public static String b(DiscoverId discoverId, String str) {
            String str2 = discoverId.b;
            StringBuilder c = r11.c(str, "?type=");
            c.append(discoverId.d.h());
            if (discoverId.f) {
                c.append("&custom_id=");
                c.append(str2);
            } else if (str2 != null) {
                c.append("&index=");
                c.append(discoverId.c);
            }
            return c.toString();
        }
    }

    /* compiled from: Serializer.kt */
    public static final class b extends Serializer.c<DiscoverId> {
        @Override // com.vk.core.serialize.Serializer.c
        public final DiscoverId a(Serializer serializer) {
            DiscoverCategoryType discoverCategoryType;
            String H = serializer.H();
            int u = serializer.u();
            DiscoverCategoryType.a aVar = DiscoverCategoryType.Companion;
            String H2 = serializer.H();
            aVar.getClass();
            DiscoverCategoryType[] values = DiscoverCategoryType.values();
            int length = values.length;
            int i = 0;
            while (true) {
                if (i >= length) {
                    discoverCategoryType = null;
                    break;
                }
                discoverCategoryType = values[i];
                if (epx.f(discoverCategoryType.h(), H2)) {
                    break;
                }
                i++;
            }
            return new DiscoverId(H, u, discoverCategoryType, serializer.H(), serializer.m(), serializer.w(), serializer.w());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new DiscoverId[i];
        }
    }

    public DiscoverId(String str, int i2, DiscoverCategoryType discoverCategoryType, String str2, boolean z, long j, long j2) {
        this.b = str;
        this.c = i2;
        this.d = discoverCategoryType;
        this.e = str2;
        this.f = z;
        this.g = j;
        this.h = j2;
    }

    @Override // com.vk.core.serialize.Serializer.StreamParcelable
    public final void O7(Serializer serializer) {
        serializer.j0(this.b);
        serializer.S(this.c);
        serializer.j0(this.d.h());
        serializer.j0(this.e);
        serializer.L(this.f ? (byte) 1 : (byte) 0);
        serializer.Y(this.g);
        serializer.Y(this.h);
    }

    public final DiscoverCategoryType d() {
        return this.d;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String e() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DiscoverId)) {
            return false;
        }
        DiscoverId discoverId = (DiscoverId) obj;
        return epx.f(this.b, discoverId.b) && this.c == discoverId.c && this.d == discoverId.d && epx.f(this.e, discoverId.e) && this.f == discoverId.f && this.g == discoverId.g && this.h == discoverId.h;
    }

    public final long f() {
        return this.h;
    }

    public final boolean g() {
        return this.f;
    }

    public final int hashCode() {
        String str = this.b;
        int hashCode = (this.d.hashCode() + shy.a(this.c, (str == null ? 0 : str.hashCode()) * 31, 31)) * 31;
        String str2 = this.e;
        return Long.hashCode(this.h) + bh10.a(qoy.b((hashCode + (str2 != null ? str2.hashCode() : 0)) * 31, 31, this.f), 31, this.g);
    }

    public final long i() {
        return this.g;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("DiscoverId(customId=");
        sb.append(this.b);
        sb.append(", cacheIndex=");
        sb.append(this.c);
        sb.append(", categoryType=");
        sb.append(this.d);
        sb.append(", title=");
        sb.append(this.e);
        sb.append(", temporary=");
        sb.append(this.f);
        sb.append(", ttl=");
        sb.append(this.g);
        sb.append(", seenTtl=");
        return vu5.a(')', this.h, sb);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i2) {
        Serializer.StreamParcelable.a.a(this, parcel);
    }

    /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
        java.lang.NullPointerException
        */
    public /* synthetic */ DiscoverId(java.lang.String r12, int r13, com.vk.dto.newsfeed.discover.DiscoverCategoryType r14, java.lang.String r15, boolean r16, long r17, long r19, int r21, xsna.zcl r22) {
        /*
            r11 = this;
            r0 = r21 & 16
            if (r0 == 0) goto L7
            r0 = 0
            r6 = r0
            goto L9
        L7:
            r6 = r16
        L9:
            r0 = r21 & 32
            r1 = -1
            if (r0 == 0) goto L11
            r7 = r1
            goto L13
        L11:
            r7 = r17
        L13:
            r0 = r21 & 64
            if (r0 == 0) goto L1e
            r9 = r1
            r3 = r13
            r4 = r14
            r5 = r15
            r1 = r11
            r2 = r12
            goto L25
        L1e:
            r9 = r19
            r1 = r11
            r2 = r12
            r3 = r13
            r4 = r14
            r5 = r15
        L25:
            r1.<init>(r2, r3, r4, r5, r6, r7, r9)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.vk.dto.newsfeed.discover.DiscoverId.<init>(java.lang.String, int, com.vk.dto.newsfeed.discover.DiscoverCategoryType, java.lang.String, boolean, long, long, int, xsna.zcl):void");
    }
}
