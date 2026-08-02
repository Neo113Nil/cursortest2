package com.blaze.blazesdk.ads.ima.models.args;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.core.app.NotificationCompat;
import com.blaze.blazesdk.ads.models.ui.BlazeContentExtraInfo;
import com.blaze.blazesdk.analytics.enums.ContentType;
import com.blaze.blazesdk.analytics.enums.WidgetType;
import com.blaze.blazesdk.players.models.c;
import defpackage.lnb;
import defpackage.o6a;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class a implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<a> CREATOR = new C0005a();
    public final c a;
    public final WidgetType b;
    public final String c;
    public final String d;
    public final String e;
    public final String f;
    public final String g;
    public final String h;
    public final String i;
    public final String j;
    public final ContentType k;
    public final String l;
    public final BlazeContentExtraInfo m;
    public final String n;

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    /* renamed from: com.blaze.blazesdk.ads.ima.models.args.a$a, reason: collision with other inner class name */
    public static final class C0005a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            parcel.getClass();
            c createFromParcel = parcel.readInt() == 0 ? null : c.CREATOR.createFromParcel(parcel);
            WidgetType createFromParcel2 = parcel.readInt() == 0 ? null : WidgetType.CREATOR.createFromParcel(parcel);
            String readString = parcel.readString();
            String readString2 = parcel.readString();
            String readString3 = parcel.readString();
            String readString4 = parcel.readString();
            String readString5 = parcel.readString();
            String readString6 = parcel.readString();
            BlazeContentExtraInfo blazeContentExtraInfo = null;
            String readString7 = parcel.readString();
            String readString8 = parcel.readString();
            ContentType createFromParcel3 = parcel.readInt() == 0 ? null : ContentType.CREATOR.createFromParcel(parcel);
            String readString9 = parcel.readString();
            if (parcel.readInt() != 0) {
                blazeContentExtraInfo = BlazeContentExtraInfo.CREATOR.createFromParcel(parcel);
            }
            return new a(createFromParcel, createFromParcel2, readString, readString2, readString3, readString4, readString5, readString6, readString7, readString8, createFromParcel3, readString9, blazeContentExtraInfo, parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new a[i];
        }
    }

    public a(@Nullable c cVar, @Nullable WidgetType widgetType, @NotNull String str, @Nullable String str2, @Nullable String str3, @Nullable String str4, @Nullable String str5, @Nullable String str6, @Nullable String str7, @Nullable String str8, @Nullable ContentType contentType, @NotNull String str9, @Nullable BlazeContentExtraInfo blazeContentExtraInfo, @Nullable String str10) {
        str.getClass();
        str9.getClass();
        this.a = cVar;
        this.b = widgetType;
        this.c = str;
        this.d = str2;
        this.e = str3;
        this.f = str4;
        this.g = str5;
        this.h = str6;
        this.i = str7;
        this.j = str8;
        this.k = contentType;
        this.l = str9;
        this.m = blazeContentExtraInfo;
        this.n = str10;
    }

    public static a copy$default(a aVar, c cVar, WidgetType widgetType, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, ContentType contentType, String str9, BlazeContentExtraInfo blazeContentExtraInfo, String str10, int i, Object obj) {
        c cVar2 = (i & 1) != 0 ? aVar.a : cVar;
        WidgetType widgetType2 = (i & 2) != 0 ? aVar.b : widgetType;
        String str11 = (i & 4) != 0 ? aVar.c : str;
        String str12 = (i & 8) != 0 ? aVar.d : str2;
        String str13 = (i & 16) != 0 ? aVar.e : str3;
        String str14 = (i & 32) != 0 ? aVar.f : str4;
        String str15 = (i & 64) != 0 ? aVar.g : str5;
        String str16 = (i & 128) != 0 ? aVar.h : str6;
        String str17 = (i & NotificationCompat.FLAG_LOCAL_ONLY) != 0 ? aVar.i : str7;
        String str18 = (i & 512) != 0 ? aVar.j : str8;
        ContentType contentType2 = (i & 1024) != 0 ? aVar.k : contentType;
        String str19 = (i & com.ironsource.mediationsdk.metadata.a.o) != 0 ? aVar.l : str9;
        BlazeContentExtraInfo blazeContentExtraInfo2 = (i & 4096) != 0 ? aVar.m : blazeContentExtraInfo;
        String str20 = (i & 8192) != 0 ? aVar.n : str10;
        aVar.getClass();
        str11.getClass();
        str19.getClass();
        return new a(cVar2, widgetType2, str11, str12, str13, str14, str15, str16, str17, str18, contentType2, str19, blazeContentExtraInfo2, str20);
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
        return Intrinsics.c(this.a, aVar.a) && this.b == aVar.b && Intrinsics.c(this.c, aVar.c) && Intrinsics.c(this.d, aVar.d) && Intrinsics.c(this.e, aVar.e) && Intrinsics.c(this.f, aVar.f) && Intrinsics.c(this.g, aVar.g) && Intrinsics.c(this.h, aVar.h) && Intrinsics.c(this.i, aVar.i) && Intrinsics.c(this.j, aVar.j) && this.k == aVar.k && Intrinsics.c(this.l, aVar.l) && Intrinsics.c(this.m, aVar.m) && Intrinsics.c(this.n, aVar.n);
    }

    public final int hashCode() {
        c cVar = this.a;
        int hashCode = (cVar == null ? 0 : cVar.hashCode()) * 31;
        WidgetType widgetType = this.b;
        int k = o6a.k(this.c, (hashCode + (widgetType == null ? 0 : widgetType.hashCode())) * 31);
        String str = this.d;
        int hashCode2 = (k + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.e;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f;
        int hashCode4 = (hashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.g;
        int hashCode5 = (hashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.h;
        int hashCode6 = (hashCode5 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.i;
        int hashCode7 = (hashCode6 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.j;
        int hashCode8 = (hashCode7 + (str7 == null ? 0 : str7.hashCode())) * 31;
        ContentType contentType = this.k;
        int k2 = o6a.k(this.l, (hashCode8 + (contentType == null ? 0 : contentType.hashCode())) * 31);
        BlazeContentExtraInfo blazeContentExtraInfo = this.m;
        int hashCode9 = (k2 + (blazeContentExtraInfo == null ? 0 : blazeContentExtraInfo.hashCode())) * 31;
        String str8 = this.n;
        return hashCode9 + (str8 != null ? str8.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ImaPresenterActivityArgs(externalContentToShow=");
        sb.append(this.a);
        sb.append(", widgetType=");
        sb.append(this.b);
        sb.append(", entryId=");
        sb.append(this.c);
        sb.append(", analyticsLabelExpressionRepresentation=");
        sb.append(this.d);
        sb.append(", storyTitle=");
        sb.append(this.e);
        sb.append(", storyId=");
        sb.append(this.f);
        sb.append(", momentTitle=");
        sb.append(this.g);
        sb.append(", momentId=");
        sb.append(this.h);
        sb.append(", videoTitle=");
        sb.append(this.i);
        sb.append(", videoId=");
        sb.append(this.j);
        sb.append(", contentType=");
        sb.append(this.k);
        sb.append(", sessionId=");
        sb.append(this.l);
        sb.append(", contentExtraInfo=");
        sb.append(this.m);
        sb.append(", backofficeCampaignData=");
        return lnb.q(sb, this.n, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        c cVar = this.a;
        if (cVar == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            cVar.writeToParcel(parcel, i);
        }
        WidgetType widgetType = this.b;
        if (widgetType == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            widgetType.writeToParcel(parcel, i);
        }
        parcel.writeString(this.c);
        parcel.writeString(this.d);
        parcel.writeString(this.e);
        parcel.writeString(this.f);
        parcel.writeString(this.g);
        parcel.writeString(this.h);
        parcel.writeString(this.i);
        parcel.writeString(this.j);
        ContentType contentType = this.k;
        if (contentType == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            contentType.writeToParcel(parcel, i);
        }
        parcel.writeString(this.l);
        BlazeContentExtraInfo blazeContentExtraInfo = this.m;
        if (blazeContentExtraInfo == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            blazeContentExtraInfo.writeToParcel(parcel, i);
        }
        parcel.writeString(this.n);
    }
}
