package com.blaze.blazesdk.features.stories.models.args;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.core.app.NotificationCompat;
import com.blaze.blazesdk.ads.models.ui.BlazeStoriesAdsConfigType;
import com.blaze.blazesdk.analytics.enums.WidgetType;
import com.blaze.blazesdk.players.models.B;
import com.blaze.blazesdk.prefetch.models.BlazeCachingLevel;
import com.blaze.blazesdk.style.players.stories.BlazeStoryPlayerStyle;
import defpackage.hom;
import defpackage.lnb;
import defpackage.o6a;
import defpackage.u0a;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class b implements Parcelable, hom {

    @NotNull
    public static final Parcelable.Creator<b> CREATOR = new a();
    public final BlazeStoryPlayerStyle a;
    public final String b;
    public final String c;
    public final String d;
    public final WidgetType e;
    public final B f;
    public final BlazeStoriesAdsConfigType g;
    public final BlazeCachingLevel h;
    public final String i;
    public final String j;
    public final boolean k;
    public final boolean l;
    public final String m;

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    public static final class a implements Parcelable.Creator {
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
            BlazeCachingLevel valueOf2 = BlazeCachingLevel.valueOf(parcel.readString());
            String readString4 = parcel.readString();
            String readString5 = parcel.readString();
            boolean z2 = false;
            if (parcel.readInt() != 0) {
                z = false;
                z2 = true;
            } else {
                z = false;
            }
            return new b(createFromParcel, readString, readString2, readString3, createFromParcel2, createFromParcel3, valueOf, valueOf2, readString4, readString5, z2, parcel.readInt() == 0 ? z : true, parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new b[i];
        }
    }

    /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
        java.lang.NullPointerException
        */
    public /* synthetic */ b(com.blaze.blazesdk.style.players.stories.BlazeStoryPlayerStyle r17, java.lang.String r18, java.lang.String r19, java.lang.String r20, com.blaze.blazesdk.analytics.enums.WidgetType r21, com.blaze.blazesdk.players.models.B r22, com.blaze.blazesdk.ads.models.ui.BlazeStoriesAdsConfigType r23, com.blaze.blazesdk.prefetch.models.BlazeCachingLevel r24, java.lang.String r25, java.lang.String r26, boolean r27, boolean r28, java.lang.String r29, int r30, kotlin.jvm.internal.DefaultConstructorMarker r31) {
        /*
            r16 = this;
            r0 = r30
            r1 = r0 & 128(0x80, float:1.8E-43)
            if (r1 == 0) goto Le
            com.blaze.blazesdk.shared.BlazeSDK r1 = com.blaze.blazesdk.shared.BlazeSDK.INSTANCE
            com.blaze.blazesdk.prefetch.models.BlazeCachingLevel r1 = r1.getCachingLevel$blazesdk_release()
            r10 = r1
            goto L10
        Le:
            r10 = r24
        L10:
            r1 = r0 & 256(0x100, float:3.59E-43)
            r2 = 0
            if (r1 == 0) goto L17
            r11 = r2
            goto L19
        L17:
            r11 = r25
        L19:
            r1 = r0 & 512(0x200, float:7.17E-43)
            if (r1 == 0) goto L1f
            r12 = r2
            goto L21
        L1f:
            r12 = r26
        L21:
            r1 = r0 & 1024(0x400, float:1.435E-42)
            r3 = 0
            if (r1 == 0) goto L28
            r13 = r3
            goto L2a
        L28:
            r13 = r27
        L2a:
            r1 = r0 & 2048(0x800, float:2.87E-42)
            if (r1 == 0) goto L30
            r14 = r3
            goto L32
        L30:
            r14 = r28
        L32:
            r0 = r0 & 4096(0x1000, float:5.74E-42)
            if (r0 == 0) goto L48
            r15 = r2
            r3 = r17
            r4 = r18
            r5 = r19
            r6 = r20
            r7 = r21
            r8 = r22
            r9 = r23
            r2 = r16
            goto L5a
        L48:
            r15 = r29
            r2 = r16
            r3 = r17
            r4 = r18
            r5 = r19
            r6 = r20
            r7 = r21
            r8 = r22
            r9 = r23
        L5a:
            r2.<init>(r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.blaze.blazesdk.features.stories.models.args.b.<init>(com.blaze.blazesdk.style.players.stories.BlazeStoryPlayerStyle, java.lang.String, java.lang.String, java.lang.String, com.blaze.blazesdk.analytics.enums.WidgetType, com.blaze.blazesdk.players.models.B, com.blaze.blazesdk.ads.models.ui.BlazeStoriesAdsConfigType, com.blaze.blazesdk.prefetch.models.BlazeCachingLevel, java.lang.String, java.lang.String, boolean, boolean, java.lang.String, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }

    public static b copy$default(b bVar, BlazeStoryPlayerStyle blazeStoryPlayerStyle, String str, String str2, String str3, WidgetType widgetType, B b, BlazeStoriesAdsConfigType blazeStoriesAdsConfigType, BlazeCachingLevel blazeCachingLevel, String str4, String str5, boolean z, boolean z2, String str6, int i, Object obj) {
        if ((i & 1) != 0) {
            blazeStoryPlayerStyle = bVar.a;
        }
        String str7 = (i & 2) != 0 ? bVar.b : str;
        String str8 = (i & 4) != 0 ? bVar.c : str2;
        String str9 = (i & 8) != 0 ? bVar.d : str3;
        WidgetType widgetType2 = (i & 16) != 0 ? bVar.e : widgetType;
        B b2 = (i & 32) != 0 ? bVar.f : b;
        BlazeStoriesAdsConfigType blazeStoriesAdsConfigType2 = (i & 64) != 0 ? bVar.g : blazeStoriesAdsConfigType;
        BlazeCachingLevel blazeCachingLevel2 = (i & 128) != 0 ? bVar.h : blazeCachingLevel;
        String str10 = (i & NotificationCompat.FLAG_LOCAL_ONLY) != 0 ? bVar.i : str4;
        String str11 = (i & 512) != 0 ? bVar.j : str5;
        boolean z3 = (i & 1024) != 0 ? bVar.k : z;
        boolean z4 = (i & com.ironsource.mediationsdk.metadata.a.o) != 0 ? bVar.l : z2;
        String str12 = (i & 4096) != 0 ? bVar.m : str6;
        bVar.getClass();
        str7.getClass();
        str8.getClass();
        b2.getClass();
        blazeStoriesAdsConfigType2.getClass();
        blazeCachingLevel2.getClass();
        return new b(blazeStoryPlayerStyle, str7, str8, str9, widgetType2, b2, blazeStoriesAdsConfigType2, blazeCachingLevel2, str10, str11, z3, z4, str12);
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
        return Intrinsics.c(this.a, bVar.a) && Intrinsics.c(this.b, bVar.b) && Intrinsics.c(this.c, bVar.c) && Intrinsics.c(this.d, bVar.d) && this.e == bVar.e && Intrinsics.c(this.f, bVar.f) && this.g == bVar.g && this.h == bVar.h && Intrinsics.c(this.i, bVar.i) && Intrinsics.c(this.j, bVar.j) && this.k == bVar.k && this.l == bVar.l && Intrinsics.c(this.m, bVar.m);
    }

    public final int hashCode() {
        BlazeStoryPlayerStyle blazeStoryPlayerStyle = this.a;
        int k = o6a.k(this.c, o6a.k(this.b, (blazeStoryPlayerStyle == null ? 0 : blazeStoryPlayerStyle.hashCode()) * 31));
        String str = this.d;
        int hashCode = (k + (str == null ? 0 : str.hashCode())) * 31;
        WidgetType widgetType = this.e;
        int hashCode2 = (this.h.hashCode() + ((this.g.hashCode() + ((this.f.hashCode() + ((hashCode + (widgetType == null ? 0 : widgetType.hashCode())) * 31)) * 31)) * 31)) * 31;
        String str2 = this.i;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.j;
        int t = u0a.t(u0a.t((hashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31, this.k), this.l);
        String str4 = this.m;
        return t + (str4 != null ? str4.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("StoriesPlayerViewArgs(playerStyle=");
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
        sb.append(", widgetCachingLevel=");
        sb.append(this.h);
        sb.append(", storyId=");
        sb.append(this.i);
        sb.append(", pageId=");
        sb.append(this.j);
        sb.append(", isSingleStory=");
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
        parcel.writeString(this.h.name());
        parcel.writeString(this.i);
        parcel.writeString(this.j);
        parcel.writeInt(this.k ? 1 : 0);
        parcel.writeInt(this.l ? 1 : 0);
        parcel.writeString(this.m);
    }

    public b(@Nullable BlazeStoryPlayerStyle blazeStoryPlayerStyle, @NotNull String str, @NotNull String str2, @Nullable String str3, @Nullable WidgetType widgetType, @NotNull B b, @NotNull BlazeStoriesAdsConfigType blazeStoriesAdsConfigType, @NotNull BlazeCachingLevel blazeCachingLevel, @Nullable String str4, @Nullable String str5, boolean z, boolean z2, @Nullable String str6) {
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
        this.h = blazeCachingLevel;
        this.i = str4;
        this.j = str5;
        this.k = z;
        this.l = z2;
        this.m = str6;
    }
}
