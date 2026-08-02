package com.blaze.blazesdk.features.moments.models.args;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.core.app.NotificationCompat;
import com.blaze.blazesdk.ads.models.ui.BlazeMomentsAdsConfigType;
import com.blaze.blazesdk.analytics.enums.WidgetType;
import com.blaze.blazesdk.players.models.B;
import com.blaze.blazesdk.prefetch.models.BlazeCachingLevel;
import com.blaze.blazesdk.shared.BlazeSDK;
import com.blaze.blazesdk.style.players.moments.BlazeMomentsPlayerStyle;
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
    public final BlazeMomentsPlayerStyle a;
    public final String b;
    public final String c;
    public final String d;
    public final WidgetType e;
    public final B f;
    public final BlazeMomentsAdsConfigType g;
    public final String h;
    public final boolean i;
    public final BlazeCachingLevel j;
    public final boolean k;
    public final boolean l;
    public final String m;
    public final com.blaze.blazesdk.features.moments.models.ui.a n;

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    public static final class a implements Parcelable.Creator {
        /*  JADX ERROR: NullPointerException in pass: ConstructorVisitor
            java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.RegisterArg.sameRegAndSVar(jadx.core.dex.instructions.args.InsnArg)" because "resultArg" is null
            	at jadx.core.dex.visitors.MoveInlineVisitor.processMove(MoveInlineVisitor.java:52)
            	at jadx.core.dex.visitors.MoveInlineVisitor.moveInline(MoveInlineVisitor.java:41)
            	at jadx.core.dex.visitors.ConstructorVisitor.visit(ConstructorVisitor.java:43)
            */
        @Override // android.os.Parcelable.Creator
        public final java.lang.Object createFromParcel(
        /*  JADX ERROR: Method generation error
            jadx.core.utils.exceptions.JadxRuntimeException: Code variable not set in r18v0 ??
            	at jadx.core.dex.instructions.args.SSAVar.getCodeVar(SSAVar.java:238)
            	at jadx.core.codegen.MethodGen.addMethodArguments(MethodGen.java:223)
            	at jadx.core.codegen.MethodGen.addDefinition(MethodGen.java:168)
            	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:401)
            	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:335)
            	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$3(ClassGen.java:301)
            	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:184)
            	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
            	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
            	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:261)
            */
        /*  JADX ERROR: NullPointerException in pass: ConstructorVisitor
            java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.RegisterArg.sameRegAndSVar(jadx.core.dex.instructions.args.InsnArg)" because "resultArg" is null
            	at jadx.core.dex.visitors.MoveInlineVisitor.processMove(MoveInlineVisitor.java:52)
            	at jadx.core.dex.visitors.MoveInlineVisitor.moveInline(MoveInlineVisitor.java:41)
            */

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new b[i];
        }
    }

    public /* synthetic */ b(BlazeMomentsPlayerStyle blazeMomentsPlayerStyle, String str, String str2, String str3, WidgetType widgetType, B b, BlazeMomentsAdsConfigType blazeMomentsAdsConfigType, String str4, boolean z, BlazeCachingLevel blazeCachingLevel, boolean z2, boolean z3, String str5, com.blaze.blazesdk.features.moments.models.ui.a aVar, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(blazeMomentsPlayerStyle, str, str2, str3, widgetType, b, blazeMomentsAdsConfigType, (i & 128) != 0 ? null : str4, (i & NotificationCompat.FLAG_LOCAL_ONLY) != 0 ? false : z, (i & 512) != 0 ? BlazeSDK.INSTANCE.getCachingLevel$blazesdk_release() : blazeCachingLevel, (i & 1024) != 0 ? false : z2, (i & com.ironsource.mediationsdk.metadata.a.o) != 0 ? false : z3, (i & 4096) != 0 ? null : str5, aVar);
    }

    public static b copy$default(b bVar, BlazeMomentsPlayerStyle blazeMomentsPlayerStyle, String str, String str2, String str3, WidgetType widgetType, B b, BlazeMomentsAdsConfigType blazeMomentsAdsConfigType, String str4, boolean z, BlazeCachingLevel blazeCachingLevel, boolean z2, boolean z3, String str5, com.blaze.blazesdk.features.moments.models.ui.a aVar, int i, Object obj) {
        BlazeMomentsPlayerStyle blazeMomentsPlayerStyle2 = (i & 1) != 0 ? bVar.a : blazeMomentsPlayerStyle;
        String str6 = (i & 2) != 0 ? bVar.b : str;
        String str7 = (i & 4) != 0 ? bVar.c : str2;
        String str8 = (i & 8) != 0 ? bVar.d : str3;
        WidgetType widgetType2 = (i & 16) != 0 ? bVar.e : widgetType;
        B b2 = (i & 32) != 0 ? bVar.f : b;
        BlazeMomentsAdsConfigType blazeMomentsAdsConfigType2 = (i & 64) != 0 ? bVar.g : blazeMomentsAdsConfigType;
        String str9 = (i & 128) != 0 ? bVar.h : str4;
        boolean z4 = (i & NotificationCompat.FLAG_LOCAL_ONLY) != 0 ? bVar.i : z;
        BlazeCachingLevel blazeCachingLevel2 = (i & 512) != 0 ? bVar.j : blazeCachingLevel;
        boolean z5 = (i & 1024) != 0 ? bVar.k : z2;
        boolean z6 = (i & com.ironsource.mediationsdk.metadata.a.o) != 0 ? bVar.l : z3;
        String str10 = (i & 4096) != 0 ? bVar.m : str5;
        com.blaze.blazesdk.features.moments.models.ui.a aVar2 = (i & 8192) != 0 ? bVar.n : aVar;
        bVar.getClass();
        str6.getClass();
        str7.getClass();
        b2.getClass();
        blazeMomentsAdsConfigType2.getClass();
        blazeCachingLevel2.getClass();
        aVar2.getClass();
        return new b(blazeMomentsPlayerStyle2, str6, str7, str8, widgetType2, b2, blazeMomentsAdsConfigType2, str9, z4, blazeCachingLevel2, z5, z6, str10, aVar2);
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
        return Intrinsics.c(this.a, bVar.a) && Intrinsics.c(this.b, bVar.b) && Intrinsics.c(this.c, bVar.c) && Intrinsics.c(this.d, bVar.d) && this.e == bVar.e && Intrinsics.c(this.f, bVar.f) && this.g == bVar.g && Intrinsics.c(this.h, bVar.h) && this.i == bVar.i && this.j == bVar.j && this.k == bVar.k && this.l == bVar.l && Intrinsics.c(this.m, bVar.m) && Intrinsics.c(this.n, bVar.n);
    }

    public final int hashCode() {
        BlazeMomentsPlayerStyle blazeMomentsPlayerStyle = this.a;
        int k = o6a.k(this.c, o6a.k(this.b, (blazeMomentsPlayerStyle == null ? 0 : blazeMomentsPlayerStyle.hashCode()) * 31));
        String str = this.d;
        int hashCode = (k + (str == null ? 0 : str.hashCode())) * 31;
        WidgetType widgetType = this.e;
        int hashCode2 = (this.g.hashCode() + ((this.f.hashCode() + ((hashCode + (widgetType == null ? 0 : widgetType.hashCode())) * 31)) * 31)) * 31;
        String str2 = this.h;
        int t = u0a.t(u0a.t((this.j.hashCode() + u0a.t((hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31, this.i)) * 31, this.k), this.l);
        String str3 = this.m;
        return this.n.a.hashCode() + ((t + (str3 != null ? str3.hashCode() : 0)) * 31);
    }

    public final String toString() {
        return "MomentsPlayerViewArgs(playerStyle=" + this.a + ", entryId=" + this.b + ", broadcasterId=" + this.c + ", analyticsLabelExpressionRepresentation=" + this.d + ", widgetType=" + this.e + ", playerSessionTracker=" + this.f + ", momentsAdsConfigType=" + this.g + ", momentId=" + this.h + ", isSingleMoment=" + this.i + ", cachingLevel=" + this.j + ", isEmbeddedInContainer=" + this.k + ", shouldClearRepoAfterSessionEnd=" + this.l + ", clientSourceId=" + this.m + ", playbackConfiguration=" + this.n + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        BlazeMomentsPlayerStyle blazeMomentsPlayerStyle = this.a;
        if (blazeMomentsPlayerStyle == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            blazeMomentsPlayerStyle.writeToParcel(parcel, i);
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
        parcel.writeInt(this.i ? 1 : 0);
        parcel.writeString(this.j.name());
        parcel.writeInt(this.k ? 1 : 0);
        parcel.writeInt(this.l ? 1 : 0);
        parcel.writeString(this.m);
        com.blaze.blazesdk.features.moments.models.ui.a aVar = this.n;
        aVar.getClass();
        parcel.writeParcelable(aVar.a, i);
    }

    public b(@Nullable BlazeMomentsPlayerStyle blazeMomentsPlayerStyle, @NotNull String str, @NotNull String str2, @Nullable String str3, @Nullable WidgetType widgetType, @NotNull B b, @NotNull BlazeMomentsAdsConfigType blazeMomentsAdsConfigType, @Nullable String str4, boolean z, @NotNull BlazeCachingLevel blazeCachingLevel, boolean z2, boolean z3, @Nullable String str5, @NotNull com.blaze.blazesdk.features.moments.models.ui.a aVar) {
        str.getClass();
        str2.getClass();
        b.getClass();
        blazeMomentsAdsConfigType.getClass();
        blazeCachingLevel.getClass();
        aVar.getClass();
        this.a = blazeMomentsPlayerStyle;
        this.b = str;
        this.c = str2;
        this.d = str3;
        this.e = widgetType;
        this.f = b;
        this.g = blazeMomentsAdsConfigType;
        this.h = str4;
        this.i = z;
        this.j = blazeCachingLevel;
        this.k = z2;
        this.l = z3;
        this.m = str5;
        this.n = aVar;
    }
}
