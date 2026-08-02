package com.vk.clips.sdk.models;

import android.os.Parcel;
import android.os.Parcelable;
import com.vk.dto.common.id.UserId;
import defpackage.q0;
import xsna.epx;
import xsna.nr;
import xsna.qoy;

/* compiled from: SdkOwner.kt */
/* loaded from: classes17.dex */
public final class SdkOwner implements Parcelable {
    public static final Parcelable.Creator<SdkOwner> CREATOR = new a();
    public static final SdkOwner r = new SdkOwner(null, null, SdkImages.d, null, false, false, false, false, null, null, null, null, false, null, null, false);
    public final UserId b;
    public final String c;
    public final SdkImages d;
    public final String e;
    public final boolean f;
    public final boolean g;
    public final boolean h;
    public final boolean i;
    public final SdkVerifyInfo j;
    public final SdkImages k;
    public final ExternalOwner l;
    public final Parcelable m;
    public final boolean n;
    public final Integer o;
    public final SdkFriendsInfo p;
    public final boolean q;

    /* compiled from: SdkOwner.kt */
    public static final class a implements Parcelable.Creator<SdkOwner> {
        /*  JADX ERROR: NullPointerException in pass: ConstructorVisitor
            java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.RegisterArg.sameRegAndSVar(jadx.core.dex.instructions.args.InsnArg)" because "resultArg" is null
            	at jadx.core.dex.visitors.MoveInlineVisitor.processMove(MoveInlineVisitor.java:52)
            	at jadx.core.dex.visitors.MoveInlineVisitor.moveInline(MoveInlineVisitor.java:41)
            	at jadx.core.dex.visitors.ConstructorVisitor.visit(ConstructorVisitor.java:43)
            */
        @Override // android.os.Parcelable.Creator
        public final com.vk.clips.sdk.models.SdkOwner createFromParcel(
        /*  JADX ERROR: Method generation error
            jadx.core.utils.exceptions.JadxRuntimeException: Code variable not set in r21v0 ??
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
        public final SdkOwner[] newArray(int i) {
            return new SdkOwner[i];
        }
    }

    public SdkOwner(UserId userId, String str, SdkImages sdkImages, String str2, boolean z, boolean z2, boolean z3, boolean z4, SdkVerifyInfo sdkVerifyInfo, SdkImages sdkImages2, ExternalOwner externalOwner, Parcelable parcelable, boolean z5, Integer num, SdkFriendsInfo sdkFriendsInfo, boolean z6) {
        this.b = userId;
        this.c = str;
        this.d = sdkImages;
        this.e = str2;
        this.f = z;
        this.g = z2;
        this.h = z3;
        this.i = z4;
        this.j = sdkVerifyInfo;
        this.k = sdkImages2;
        this.l = externalOwner;
        this.m = parcelable;
        this.n = z5;
        this.o = num;
        this.p = sdkFriendsInfo;
        this.q = z6;
    }

    public static SdkOwner a(SdkOwner sdkOwner, boolean z) {
        UserId userId = sdkOwner.b;
        String str = sdkOwner.c;
        SdkImages sdkImages = sdkOwner.d;
        String str2 = sdkOwner.e;
        boolean z2 = sdkOwner.f;
        boolean z3 = sdkOwner.h;
        boolean z4 = sdkOwner.i;
        SdkVerifyInfo sdkVerifyInfo = sdkOwner.j;
        SdkImages sdkImages2 = sdkOwner.k;
        ExternalOwner externalOwner = sdkOwner.l;
        Parcelable parcelable = sdkOwner.m;
        boolean z5 = sdkOwner.n;
        Integer num = sdkOwner.o;
        SdkFriendsInfo sdkFriendsInfo = sdkOwner.p;
        boolean z6 = sdkOwner.q;
        sdkOwner.getClass();
        return new SdkOwner(userId, str, sdkImages, str2, z2, z, z3, z4, sdkVerifyInfo, sdkImages2, externalOwner, parcelable, z5, num, sdkFriendsInfo, z6);
    }

    public final UserId d() {
        return this.b;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SdkOwner)) {
            return false;
        }
        SdkOwner sdkOwner = (SdkOwner) obj;
        return epx.f(this.b, sdkOwner.b) && epx.f(this.c, sdkOwner.c) && epx.f(this.d, sdkOwner.d) && epx.f(this.e, sdkOwner.e) && this.f == sdkOwner.f && this.g == sdkOwner.g && this.h == sdkOwner.h && this.i == sdkOwner.i && epx.f(this.j, sdkOwner.j) && epx.f(this.k, sdkOwner.k) && epx.f(this.l, sdkOwner.l) && epx.f(this.m, sdkOwner.m) && this.n == sdkOwner.n && epx.f(this.o, sdkOwner.o) && epx.f(this.p, sdkOwner.p) && this.q == sdkOwner.q;
    }

    public final int hashCode() {
        UserId userId = this.b;
        int hashCode = (userId == null ? 0 : Long.hashCode(userId.b)) * 31;
        String str = this.c;
        int hashCode2 = (this.d.hashCode() + ((hashCode + (str == null ? 0 : str.hashCode())) * 31)) * 31;
        String str2 = this.e;
        int b = qoy.b(qoy.b(qoy.b(qoy.b((hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31, 31, this.f), 31, this.g), 31, this.h), 31, this.i);
        SdkVerifyInfo sdkVerifyInfo = this.j;
        int hashCode3 = (b + (sdkVerifyInfo == null ? 0 : sdkVerifyInfo.hashCode())) * 31;
        SdkImages sdkImages = this.k;
        int hashCode4 = (hashCode3 + (sdkImages == null ? 0 : sdkImages.hashCode())) * 31;
        ExternalOwner externalOwner = this.l;
        int hashCode5 = (hashCode4 + (externalOwner == null ? 0 : externalOwner.hashCode())) * 31;
        Parcelable parcelable = this.m;
        int b2 = qoy.b((hashCode5 + (parcelable == null ? 0 : parcelable.hashCode())) * 31, 31, this.n);
        Integer num = this.o;
        int hashCode6 = (b2 + (num == null ? 0 : num.hashCode())) * 31;
        SdkFriendsInfo sdkFriendsInfo = this.p;
        return Boolean.hashCode(this.q) + ((hashCode6 + (sdkFriendsInfo != null ? sdkFriendsInfo.hashCode() : 0)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SdkOwner(id=");
        sb.append(this.b);
        sb.append(", name=");
        sb.append(this.c);
        sb.append(", images=");
        sb.append(this.d);
        sb.append(", description=");
        sb.append(this.e);
        sb.append(", canSubscribe=");
        sb.append(this.f);
        sb.append(", isSubscribed=");
        sb.append(this.g);
        sb.append(", isClosed=");
        sb.append(this.h);
        sb.append(", isVerified=");
        sb.append(this.i);
        sb.append(", verifyInfo=");
        sb.append(this.j);
        sb.append(", clipsImageStatus=");
        sb.append(this.k);
        sb.append(", externalOwner=");
        sb.append(this.l);
        sb.append(", extendedOwnerModel=");
        sb.append(this.m);
        sb.append(", isDeactivated=");
        sb.append(this.n);
        sb.append(", membersCount=");
        sb.append(this.o);
        sb.append(", friends=");
        sb.append(this.p);
        sb.append(", isOwnerLive=");
        return q0.a(sb, this.q, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.b, i);
        parcel.writeString(this.c);
        this.d.writeToParcel(parcel, i);
        parcel.writeString(this.e);
        parcel.writeInt(this.f ? 1 : 0);
        parcel.writeInt(this.g ? 1 : 0);
        parcel.writeInt(this.h ? 1 : 0);
        parcel.writeInt(this.i ? 1 : 0);
        SdkVerifyInfo sdkVerifyInfo = this.j;
        if (sdkVerifyInfo == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            sdkVerifyInfo.writeToParcel(parcel, i);
        }
        SdkImages sdkImages = this.k;
        if (sdkImages == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            sdkImages.writeToParcel(parcel, i);
        }
        ExternalOwner externalOwner = this.l;
        if (externalOwner == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            externalOwner.writeToParcel(parcel, i);
        }
        parcel.writeParcelable(this.m, i);
        parcel.writeInt(this.n ? 1 : 0);
        Integer num = this.o;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            nr.a(parcel, 1, num);
        }
        SdkFriendsInfo sdkFriendsInfo = this.p;
        if (sdkFriendsInfo == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            sdkFriendsInfo.writeToParcel(parcel, i);
        }
        parcel.writeInt(this.q ? 1 : 0);
    }
}
