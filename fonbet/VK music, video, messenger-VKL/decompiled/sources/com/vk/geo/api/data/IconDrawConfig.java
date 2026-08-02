package com.vk.geo.api.data;

import android.graphics.Color;
import android.os.Parcel;
import android.os.Parcelable;
import com.mbridge.msdk.playercommon.exoplayer2.source.ExtractorMediaSource;
import com.unity3d.services.UnityAdsConstants;
import io.reactivex.rxjava3.subjects.b;
import io.requery.android.database.sqlite.SQLiteDatabase;
import xsna.epx;
import xsna.nr;
import xsna.qoy;
import xsna.shy;
import xsna.vu5;
import xsna.zcl;

/* compiled from: IconDrawConfig.kt */
/* loaded from: classes18.dex */
public final class IconDrawConfig implements Parcelable {
    public static final Parcelable.Creator<IconDrawConfig> CREATOR = new a();
    public static final int w = Color.parseColor("#F88C75");
    public static final IconDrawConfig x;
    public static final IconDrawConfig y;
    public static final IconDrawConfig z;
    public final boolean b;
    public final int c;
    public final int d;
    public final int e;
    public final int f;
    public final Integer g;
    public final float h;
    public final float i;
    public final int j;
    public final int k;
    public final Integer l;
    public final float m;
    public final float n;
    public final int o;
    public final int p;
    public final int q;
    public final boolean r;
    public final float s;
    public final float t;
    public final int u;
    public final int v;

    /* compiled from: IconDrawConfig.kt */
    public static final class a implements Parcelable.Creator<IconDrawConfig> {
        @Override // android.os.Parcelable.Creator
        public final IconDrawConfig createFromParcel(Parcel parcel) {
            boolean z;
            boolean z2;
            if (parcel.readInt() != 0) {
                z2 = false;
                z = true;
            } else {
                z = false;
                z2 = false;
            }
            int readInt = parcel.readInt();
            int readInt2 = parcel.readInt();
            boolean z3 = z2;
            int readInt3 = parcel.readInt();
            int readInt4 = parcel.readInt();
            Integer valueOf = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            float readFloat = parcel.readFloat();
            Integer num = valueOf;
            float readFloat2 = parcel.readFloat();
            Integer num2 = null;
            int readInt5 = parcel.readInt();
            int readInt6 = parcel.readInt();
            if (parcel.readInt() != 0) {
                num2 = Integer.valueOf(parcel.readInt());
            }
            float readFloat3 = parcel.readFloat();
            float readFloat4 = parcel.readFloat();
            Integer num3 = num2;
            int readInt7 = parcel.readInt();
            boolean z4 = true;
            int readInt8 = parcel.readInt();
            int readInt9 = parcel.readInt();
            if (parcel.readInt() == 0) {
                z4 = z3;
            }
            return new IconDrawConfig(z, readInt, readInt2, readInt3, readInt4, num, readFloat, readFloat2, readInt5, readInt6, num3, readFloat3, readFloat4, readInt7, readInt8, readInt9, z4, parcel.readFloat(), parcel.readFloat(), parcel.readInt(), parcel.readInt());
        }

        @Override // android.os.Parcelable.Creator
        public final IconDrawConfig[] newArray(int i) {
            return new IconDrawConfig[i];
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    static {
        Color.parseColor("#F36C9D");
        Color.parseColor("#55C99F");
        Color.parseColor("#777CE9");
        Color.parseColor("#44C2BB");
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        float f = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        float f2 = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        int i4 = 0;
        float f3 = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        float f4 = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        int i5 = 0;
        int i6 = 0;
        float f5 = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        float f6 = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        int i7 = 0;
        IconDrawConfig iconDrawConfig = new IconDrawConfig(true, 0, i, i2, i3, null, f, f2, 0, i4, null, f3, f4, 0, i5, i6, false, f5, f6, 0, i7, 2097150, null);
        x = iconDrawConfig;
        y = iconDrawConfig;
        z = new IconDrawConfig(null == true ? 1 : 0, i, i2, i3, -1, -16777216, f2, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, i4, -3355444, -7829368, f4, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, i5, i6, null == true ? 1 : 0, false, f6, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, i7, 0, 2095566, null);
    }

    public IconDrawConfig() {
        this(false, 0, 0, 0, 0, null, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 0, 0, null, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 0, 0, 0, false, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 0, 0, 2097151, null);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof IconDrawConfig)) {
            return false;
        }
        IconDrawConfig iconDrawConfig = (IconDrawConfig) obj;
        return this.b == iconDrawConfig.b && this.c == iconDrawConfig.c && this.d == iconDrawConfig.d && this.e == iconDrawConfig.e && this.f == iconDrawConfig.f && epx.f(this.g, iconDrawConfig.g) && Float.compare(this.h, iconDrawConfig.h) == 0 && Float.compare(this.i, iconDrawConfig.i) == 0 && this.j == iconDrawConfig.j && this.k == iconDrawConfig.k && epx.f(this.l, iconDrawConfig.l) && Float.compare(this.m, iconDrawConfig.m) == 0 && Float.compare(this.n, iconDrawConfig.n) == 0 && this.o == iconDrawConfig.o && this.p == iconDrawConfig.p && this.q == iconDrawConfig.q && this.r == iconDrawConfig.r && Float.compare(this.s, iconDrawConfig.s) == 0 && Float.compare(this.t, iconDrawConfig.t) == 0 && this.u == iconDrawConfig.u && this.v == iconDrawConfig.v;
    }

    public final int hashCode() {
        int a2 = shy.a(this.f, shy.a(this.e, shy.a(this.d, shy.a(this.c, Boolean.hashCode(this.b) * 31, 31), 31), 31), 31);
        Integer num = this.g;
        int a3 = shy.a(this.k, shy.a(this.j, b.a(this.i, b.a(this.h, (a2 + (num == null ? 0 : num.hashCode())) * 31, 31), 31), 31), 31);
        Integer num2 = this.l;
        return Integer.hashCode(this.v) + shy.a(this.u, b.a(this.t, b.a(this.s, qoy.b(shy.a(this.q, shy.a(this.p, shy.a(this.o, b.a(this.n, b.a(this.m, (a3 + (num2 != null ? num2.hashCode() : 0)) * 31, 31), 31), 31), 31), 31), 31, this.r), 31), 31), 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("IconDrawConfig(isLightThemeConfig=");
        sb.append(this.b);
        sb.append(", maxTitleLines=");
        sb.append(this.c);
        sb.append(", maxSubtitleLines=");
        sb.append(this.d);
        sb.append(", titleTextSize=");
        sb.append(this.e);
        sb.append(", titleTextColor=");
        sb.append(this.f);
        sb.append(", titleOutlineTextColor=");
        sb.append(this.g);
        sb.append(", titleOutlineTextWidth=");
        sb.append(this.h);
        sb.append(", titleTopMargin=");
        sb.append(this.i);
        sb.append(", subtitleTextSize=");
        sb.append(this.j);
        sb.append(", subtitleTextColor=");
        sb.append(this.k);
        sb.append(", subtitleOutlineTextColor=");
        sb.append(this.l);
        sb.append(", subtitleOutlineTextWidth=");
        sb.append(this.m);
        sb.append(", subtitleTopMargin=");
        sb.append(this.n);
        sb.append(", categoryTintColor=");
        sb.append(this.o);
        sb.append(", dotFillColor=");
        sb.append(this.p);
        sb.append(", dotStrokeColor=");
        sb.append(this.q);
        sb.append(", useCircleIcons=");
        sb.append(this.r);
        sb.append(", iconWidth=");
        sb.append(this.s);
        sb.append(", iconHeight=");
        sb.append(this.t);
        sb.append(", maxTextWidth=");
        sb.append(this.u);
        sb.append(", dotSize=");
        return vu5.b(sb, this.v, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.b ? 1 : 0);
        parcel.writeInt(this.c);
        parcel.writeInt(this.d);
        parcel.writeInt(this.e);
        parcel.writeInt(this.f);
        Integer num = this.g;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            nr.a(parcel, 1, num);
        }
        parcel.writeFloat(this.h);
        parcel.writeFloat(this.i);
        parcel.writeInt(this.j);
        parcel.writeInt(this.k);
        Integer num2 = this.l;
        if (num2 == null) {
            parcel.writeInt(0);
        } else {
            nr.a(parcel, 1, num2);
        }
        parcel.writeFloat(this.m);
        parcel.writeFloat(this.n);
        parcel.writeInt(this.o);
        parcel.writeInt(this.p);
        parcel.writeInt(this.q);
        parcel.writeInt(this.r ? 1 : 0);
        parcel.writeFloat(this.s);
        parcel.writeFloat(this.t);
        parcel.writeInt(this.u);
        parcel.writeInt(this.v);
    }

    public IconDrawConfig(boolean z2, int i, int i2, int i3, int i4, Integer num, float f, float f2, int i5, int i6, Integer num2, float f3, float f4, int i7, int i8, int i9, boolean z3, float f5, float f6, int i10, int i11) {
        this.b = z2;
        this.c = i;
        this.d = i2;
        this.e = i3;
        this.f = i4;
        this.g = num;
        this.h = f;
        this.i = f2;
        this.j = i5;
        this.k = i6;
        this.l = num2;
        this.m = f3;
        this.n = f4;
        this.o = i7;
        this.p = i8;
        this.q = i9;
        this.r = z3;
        this.s = f5;
        this.t = f6;
        this.u = i10;
        this.v = i11;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public /* synthetic */ IconDrawConfig(boolean z2, int i, int i2, int i3, int i4, Integer num, float f, float f2, int i5, int i6, Integer num2, float f3, float f4, int i7, int i8, int i9, boolean z3, float f5, float f6, int i10, int i11, int i12, zcl zclVar) {
        this((i12 & 1) != 0 ? true : z2, (i12 & 2) != 0 ? 3 : i, (i12 & 4) != 0 ? 2 : i2, (i12 & 8) != 0 ? 12 : i3, (i12 & 16) != 0 ? -16777216 : i4, (i12 & 32) != 0 ? r2 : num, (i12 & 64) != 0 ? 1.0f : f, (i12 & 128) != 0 ? 2.0f : f2, (i12 & 256) != 0 ? 10 : i5, (i12 & 512) == 0 ? i6 : -16777216, (i12 & 1024) == 0 ? num2 : -1, (i12 & 2048) != 0 ? 0.05f : f3, (i12 & 4096) != 0 ? 0.5f : f4, (i12 & 8192) != 0 ? -1 : i7, (i12 & 16384) != 0 ? w : i8, (i12 & 32768) != 0 ? -1 : i9, (i12 & 65536) != 0 ? true : z3, (i12 & 131072) != 0 ? 20.0f : f5, (i12 & SQLiteDatabase.OPEN_PRIVATECACHE) != 0 ? 21.5f : f6, (i12 & 524288) != 0 ? 120 : i10, (i12 & ExtractorMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES) != 0 ? 8 : i11);
    }
}
