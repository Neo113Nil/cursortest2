package com.blaze.blazesdk.features.stories.models.args;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.core.app.NotificationCompat;
import com.blaze.blazesdk.ads.models.ui.BlazeStoriesAdsConfigType;
import com.blaze.blazesdk.analytics.enums.WidgetType;
import com.blaze.blazesdk.players.models.B;
import com.blaze.blazesdk.prefetch.models.BlazeCachingLevel;
import com.blaze.blazesdk.shared.BlazeSDK;
import com.blaze.blazesdk.style.players.stories.BlazeStoryPlayerStyle;
import defpackage.lnb;
import defpackage.o6a;
import defpackage.u0a;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class a implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<a> CREATOR = new C0009a();
    public final BlazeStoryPlayerStyle a;
    public final String b;
    public final String c;
    public final String d;
    public final WidgetType e;
    public final B f;
    public final BlazeStoriesAdsConfigType g;
    public final String h;
    public final String i;
    public final boolean j;
    public final BlazeCachingLevel k;
    public final boolean l;
    public final String m;

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    /* renamed from: com.blaze.blazesdk.features.stories.models.args.a$a, reason: collision with other inner class name */
    public static final class C0009a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            boolean z;
            parcel.getClass();
            BlazeStoryPlayerStyle createFromParcel = parcel.readInt() == 0 ? null : BlazeStoryPlayerStyle.CREATOR.createFromParcel(parcel);
            String readString = parcel.readString();
            String readString2 = parcel.readString();
            String readString3 = parcel.readString();
            WidgetType createFromParcel2 = parcel.readInt() != 0 ? WidgetType.CREATOR.createFromParcel(parcel) : null;
            B createFromParcel3 = B.CREATOR.createFromParcel(parcel);
            BlazeStoriesAdsConfigType valueOf = BlazeStoriesAdsConfigType.valueOf(parcel.readString());
            String readString4 = parcel.readString();
            String readString5 = parcel.readString();
            boolean z2 = false;
            if (parcel.readInt() != 0) {
                z = false;
                z2 = true;
            } else {
                z = false;
            }
            BlazeCachingLevel valueOf2 = BlazeCachingLevel.valueOf(parcel.readString());
            if (parcel.readInt() != 0) {
                z = true;
            }
            return new a(createFromParcel, readString, readString2, readString3, createFromParcel2, createFromParcel3, valueOf, readString4, readString5, z2, valueOf2, z, parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new a[i];
        }
    }

    public /* synthetic */ a(BlazeStoryPlayerStyle blazeStoryPlayerStyle, String str, String str2, String str3, WidgetType widgetType, B b, BlazeStoriesAdsConfigType blazeStoriesAdsConfigType, String str4, String str5, boolean z, BlazeCachingLevel blazeCachingLevel, boolean z2, String str6, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(blazeStoryPlayerStyle, str, str2, str3, widgetType, b, blazeStoriesAdsConfigType, (i & 128) != 0 ? null : str4, (i & NotificationCompat.FLAG_LOCAL_ONLY) != 0 ? null : str5, (i & 512) != 0 ? false : z, (i & 1024) != 0 ? BlazeSDK.INSTANCE.getCachingLevel$blazesdk_release() : blazeCachingLevel, (i & com.ironsource.mediationsdk.metadata.a.o) != 0 ? false : z2, (i & 4096) != 0 ? null : str6);
    }

    public static a copy$default(a aVar, BlazeStoryPlayerStyle blazeStoryPlayerStyle, String str, String str2, String str3, WidgetType widgetType, B b, BlazeStoriesAdsConfigType blazeStoriesAdsConfigType, String str4, String str5, boolean z, BlazeCachingLevel blazeCachingLevel, boolean z2, String str6, int i, Object obj) {
        if ((i & 1) != 0) {
            blazeStoryPlayerStyle = aVar.a;
        }
        String str7 = (i & 2) != 0 ? aVar.b : str;
        String str8 = (i & 4) != 0 ? aVar.c : str2;
        String str9 = (i & 8) != 0 ? aVar.d : str3;
        WidgetType widgetType2 = (i & 16) != 0 ? aVar.e : widgetType;
        B b2 = (i & 32) != 0 ? aVar.f : b;
        BlazeStoriesAdsConfigType blazeStoriesAdsConfigType2 = (i & 64) != 0 ? aVar.g : blazeStoriesAdsConfigType;
        String str10 = (i & 128) != 0 ? aVar.h : str4;
        String str11 = (i & NotificationCompat.FLAG_LOCAL_ONLY) != 0 ? aVar.i : str5;
        boolean z3 = (i & 512) != 0 ? aVar.j : z;
        BlazeCachingLevel blazeCachingLevel2 = (i & 1024) != 0 ? aVar.k : blazeCachingLevel;
        boolean z4 = (i & com.ironsource.mediationsdk.metadata.a.o) != 0 ? aVar.l : z2;
        String str12 = (i & 4096) != 0 ? aVar.m : str6;
        aVar.getClass();
        str7.getClass();
        str8.getClass();
        b2.getClass();
        blazeStoriesAdsConfigType2.getClass();
        blazeCachingLevel2.getClass();
        return new a(blazeStoryPlayerStyle, str7, str8, str9, widgetType2, b2, blazeStoriesAdsConfigType2, str10, str11, z3, blazeCachingLevel2, z4, str12);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return Intrinsics.c(this.a, aVar.a) && Intrinsics.c(this.b, aVar.b) && Intrinsics.c(this.c, aVar.c) && Intrinsics.c(this.d, aVar.d) && this.e == aVar.e && Intrinsics.c(this.f, aVar.f) && this.g == aVar.g && Intrinsics.c(this.h, aVar.h) && Intrinsics.c(this.i, aVar.i) && this.j == aVar.j && this.k == aVar.k && this.l == aVar.l && Intrinsics.c(this.m, aVar.m);
    }

    public final int hashCode() {
        BlazeStoryPlayerStyle blazeStoryPlayerStyle = this.a;
        int k = o6a.k(this.c, o6a.k(this.b, (blazeStoryPlayerStyle == null ? 0 : blazeStoryPlayerStyle.hashCode()) * 31));
        String str = this.d;
        int hashCode = (k + (str == null ? 0 : str.hashCode())) * 31;
        WidgetType widgetType = this.e;
        int hashCode2 = (this.g.hashCode() + ((this.f.hashCode() + ((hashCode + (widgetType == null ? 0 : widgetType.hashCode())) * 31)) * 31)) * 31;
        String str2 = this.h;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.i;
        int t = u0a.t((this.k.hashCode() + u0a.t((hashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31, this.j)) * 31, this.l);
        String str4 = this.m;
        return t + (str4 != null ? str4.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("StoriesPlayerActivityArgs(playerStyle=");
        sb.append(this.a);
        sb.append(", entryId=");
        sb.append(this.b);
        sb.append(", broadcasterId=");
        sb.append(this.c);
        sb.append(", analyticsLabelExpressionRepresentation=");
        sb.append(this.d);
        sb.append(", widgetType=");
        sb.append(this.e);
        sb.append(", playerSessionTracker=");
        sb.append(this.f);
        sb.append(", storiesAdsConfigType=");
        sb.append(this.g);
        sb.append(", storyId=");
        sb.append(this.h);
        sb.append(", pageId=");
        sb.append(this.i);
        sb.append(", isSingleStory=");
        sb.append(this.j);
        sb.append(", widgetCachingLevel=");
        sb.append(this.k);
        sb.append(", shouldClearRepoAfterSessionEnd=");
        sb.append(this.l);
        sb.append(", clientSourceId=");
        return lnb.q(sb, this.m, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        BlazeStoryPlayerStyle blazeStoryPlayerStyle = this.a;
        if (blazeStoryPlayerStyle == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            blazeStoryPlayerStyle.writeToParcel(parcel, i);
        }
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
        parcel.writeString(this.i);
        parcel.writeInt(this.j ? 1 : 0);
        parcel.writeString(this.k.name());
        parcel.writeInt(this.l ? 1 : 0);
        parcel.writeString(this.m);
    }

    public a(@Nullable BlazeStoryPlayerStyle blazeStoryPlayerStyle, @NotNull String str, @NotNull String str2, @Nullable String str3, @Nullable WidgetType widgetType, @NotNull B b, @NotNull BlazeStoriesAdsConfigType blazeStoriesAdsConfigType, @Nullable String str4, @Nullable String str5, boolean z, @NotNull BlazeCachingLevel blazeCachingLevel, boolean z2, @Nullable String str6) {
        str.getClass();
        str2.getClass();
        b.getClass();
        blazeStoriesAdsConfigType.getClass();
        blazeCachingLevel.getClass();
        this.a = blazeStoryPlayerStyle;
        this.b = str;
        this.c = str2;
        this.d = str3;
        this.e = widgetType;
        this.f = b;
        this.g = blazeStoriesAdsConfigType;
        this.h = str4;
        this.i = str5;
        this.j = z;
        this.k = blazeCachingLevel;
        this.l = z2;
        this.m = str6;
    }
}
