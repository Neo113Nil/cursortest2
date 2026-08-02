package com.blaze.blazesdk.features.videos.models.args;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.core.app.NotificationCompat;
import com.blaze.blazesdk.ads.models.ui.BlazeVideosAdsConfigType;
import com.blaze.blazesdk.analytics.enums.WidgetType;
import com.blaze.blazesdk.features.videos.models.ui.i;
import com.blaze.blazesdk.players.models.B;
import com.blaze.blazesdk.prefetch.models.BlazeCachingLevel;
import com.blaze.blazesdk.shared.BlazeSDK;
import defpackage.hom;
import defpackage.o6a;
import defpackage.u0a;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class b implements Parcelable, hom {

    @NotNull
    public static final Parcelable.Creator<b> CREATOR = new a();
    public final com.blaze.blazesdk.features.videos.models.ui.a a;
    public final String b;
    public final String c;
    public final String d;
    public final WidgetType e;
    public final B f;
    public final BlazeVideosAdsConfigType g;
    public final String h;
    public final boolean i;
    public final BlazeCachingLevel j;
    public final boolean k;
    public final boolean l;
    public final boolean m;
    public final String n;
    public final i o;

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            i iVar;
            BlazeVideosAdsConfigType blazeVideosAdsConfigType;
            boolean z;
            i iVar2;
            boolean z2;
            boolean z3;
            parcel.getClass();
            com.blaze.blazesdk.features.videos.models.ui.a aVar = (com.blaze.blazesdk.features.videos.models.ui.a) parcel.readParcelable(b.class.getClassLoader());
            String readString = parcel.readString();
            String readString2 = parcel.readString();
            String readString3 = parcel.readString();
            WidgetType createFromParcel = parcel.readInt() == 0 ? null : WidgetType.CREATOR.createFromParcel(parcel);
            B createFromParcel2 = B.CREATOR.createFromParcel(parcel);
            BlazeVideosAdsConfigType valueOf = BlazeVideosAdsConfigType.valueOf(parcel.readString());
            String readString4 = parcel.readString();
            boolean z4 = false;
            if (parcel.readInt() != 0) {
                iVar = null;
                blazeVideosAdsConfigType = valueOf;
                z = true;
            } else {
                iVar = null;
                blazeVideosAdsConfigType = valueOf;
                z = false;
            }
            BlazeCachingLevel valueOf2 = BlazeCachingLevel.valueOf(parcel.readString());
            if (parcel.readInt() != 0) {
                iVar2 = iVar;
                z2 = true;
            } else {
                iVar2 = iVar;
                z2 = false;
            }
            if (parcel.readInt() != 0) {
                z3 = false;
                z4 = true;
            } else {
                z3 = false;
            }
            boolean z5 = parcel.readInt() == 0 ? z3 : true;
            String readString5 = parcel.readString();
            if (parcel.readInt() != 0) {
                iVar2 = i.CREATOR.createFromParcel(parcel);
            }
            return new b(aVar, readString, readString2, readString3, createFromParcel, createFromParcel2, blazeVideosAdsConfigType, readString4, z, valueOf2, z2, z4, z5, readString5, iVar2);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new b[i];
        }
    }

    public /* synthetic */ b(com.blaze.blazesdk.features.videos.models.ui.a aVar, String str, String str2, String str3, WidgetType widgetType, B b, BlazeVideosAdsConfigType blazeVideosAdsConfigType, String str4, boolean z, BlazeCachingLevel blazeCachingLevel, boolean z2, boolean z3, boolean z4, String str5, i iVar, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(aVar, str, str2, str3, widgetType, b, blazeVideosAdsConfigType, (i & 128) != 0 ? null : str4, (i & NotificationCompat.FLAG_LOCAL_ONLY) != 0 ? false : z, (i & 512) != 0 ? BlazeSDK.INSTANCE.getCachingLevel$blazesdk_release() : blazeCachingLevel, (i & 1024) != 0 ? false : z2, (i & com.ironsource.mediationsdk.metadata.a.o) != 0 ? false : z3, z4, (i & 8192) != 0 ? null : str5, (i & 16384) != 0 ? null : iVar);
    }

    public static b copy$default(b bVar, com.blaze.blazesdk.features.videos.models.ui.a aVar, String str, String str2, String str3, WidgetType widgetType, B b, BlazeVideosAdsConfigType blazeVideosAdsConfigType, String str4, boolean z, BlazeCachingLevel blazeCachingLevel, boolean z2, boolean z3, boolean z4, String str5, i iVar, int i, Object obj) {
        com.blaze.blazesdk.features.videos.models.ui.a aVar2 = (i & 1) != 0 ? bVar.a : aVar;
        String str6 = (i & 2) != 0 ? bVar.b : str;
        String str7 = (i & 4) != 0 ? bVar.c : str2;
        String str8 = (i & 8) != 0 ? bVar.d : str3;
        WidgetType widgetType2 = (i & 16) != 0 ? bVar.e : widgetType;
        B b2 = (i & 32) != 0 ? bVar.f : b;
        BlazeVideosAdsConfigType blazeVideosAdsConfigType2 = (i & 64) != 0 ? bVar.g : blazeVideosAdsConfigType;
        String str9 = (i & 128) != 0 ? bVar.h : str4;
        boolean z5 = (i & NotificationCompat.FLAG_LOCAL_ONLY) != 0 ? bVar.i : z;
        BlazeCachingLevel blazeCachingLevel2 = (i & 512) != 0 ? bVar.j : blazeCachingLevel;
        boolean z6 = (i & 1024) != 0 ? bVar.k : z2;
        boolean z7 = (i & com.ironsource.mediationsdk.metadata.a.o) != 0 ? bVar.l : z3;
        boolean z8 = (i & 4096) != 0 ? bVar.m : z4;
        String str10 = (i & 8192) != 0 ? bVar.n : str5;
        i iVar2 = (i & 16384) != 0 ? bVar.o : iVar;
        bVar.getClass();
        aVar2.getClass();
        str6.getClass();
        str7.getClass();
        b2.getClass();
        blazeVideosAdsConfigType2.getClass();
        blazeCachingLevel2.getClass();
        return new b(aVar2, str6, str7, str8, widgetType2, b2, blazeVideosAdsConfigType2, str9, z5, blazeCachingLevel2, z6, z7, z8, str10, iVar2);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return Intrinsics.c(this.a, bVar.a) && Intrinsics.c(this.b, bVar.b) && Intrinsics.c(this.c, bVar.c) && Intrinsics.c(this.d, bVar.d) && this.e == bVar.e && Intrinsics.c(this.f, bVar.f) && this.g == bVar.g && Intrinsics.c(this.h, bVar.h) && this.i == bVar.i && this.j == bVar.j && this.k == bVar.k && this.l == bVar.l && this.m == bVar.m && Intrinsics.c(this.n, bVar.n) && Intrinsics.c(this.o, bVar.o);
    }

    public final int hashCode() {
        int k = o6a.k(this.c, o6a.k(this.b, this.a.hashCode() * 31));
        String str = this.d;
        int hashCode = (k + (str == null ? 0 : str.hashCode())) * 31;
        WidgetType widgetType = this.e;
        int hashCode2 = (this.g.hashCode() + ((this.f.hashCode() + ((hashCode + (widgetType == null ? 0 : widgetType.hashCode())) * 31)) * 31)) * 31;
        String str2 = this.h;
        int t = u0a.t(u0a.t(u0a.t((this.j.hashCode() + u0a.t((hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31, this.i)) * 31, this.k), this.l), this.m);
        String str3 = this.n;
        int hashCode3 = (t + (str3 == null ? 0 : str3.hashCode())) * 31;
        i iVar = this.o;
        return hashCode3 + (iVar != null ? iVar.hashCode() : 0);
    }

    public final String toString() {
        return "VideosPlayerViewArgs(playerPresentationMode=" + this.a + ", entryId=" + this.b + ", broadcasterId=" + this.c + ", analyticsLabelExpressionRepresentation=" + this.d + ", widgetType=" + this.e + ", playerSessionTracker=" + this.f + ", videosAdsConfigType=" + this.g + ", videoId=" + this.h + ", isSingleVideo=" + this.i + ", cachingLevel=" + this.j + ", isEmbeddedInContainer=" + this.k + ", shouldClearRepoAfterSessionEnd=" + this.l + ", shouldAutoPlayOnStart=" + this.m + ", clientSourceId=" + this.n + ", playbackConfiguration=" + this.o + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeParcelable(this.a, i);
        parcel.writeString(this.b);
        parcel.writeString(this.c);
        parcel.writeString(this.d);
        WidgetType widgetType = this.e;
        if (widgetType == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            widgetType.writeToParcel(parcel, i);
        }
        this.f.writeToParcel(parcel, i);
        parcel.writeString(this.g.name());
        parcel.writeString(this.h);
        parcel.writeInt(this.i ? 1 : 0);
        parcel.writeString(this.j.name());
        parcel.writeInt(this.k ? 1 : 0);
        parcel.writeInt(this.l ? 1 : 0);
        parcel.writeInt(this.m ? 1 : 0);
        parcel.writeString(this.n);
        i iVar = this.o;
        if (iVar == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            iVar.writeToParcel(parcel, i);
        }
    }

    public b(@NotNull com.blaze.blazesdk.features.videos.models.ui.a aVar, @NotNull String str, @NotNull String str2, @Nullable String str3, @Nullable WidgetType widgetType, @NotNull B b, @NotNull BlazeVideosAdsConfigType blazeVideosAdsConfigType, @Nullable String str4, boolean z, @NotNull BlazeCachingLevel blazeCachingLevel, boolean z2, boolean z3, boolean z4, @Nullable String str5, @Nullable i iVar) {
        aVar.getClass();
        str.getClass();
        str2.getClass();
        b.getClass();
        blazeVideosAdsConfigType.getClass();
        blazeCachingLevel.getClass();
        this.a = aVar;
        this.b = str;
        this.c = str2;
        this.d = str3;
        this.e = widgetType;
        this.f = b;
        this.g = blazeVideosAdsConfigType;
        this.h = str4;
        this.i = z;
        this.j = blazeCachingLevel;
        this.k = z2;
        this.l = z3;
        this.m = z4;
        this.n = str5;
        this.o = iVar;
    }
}
