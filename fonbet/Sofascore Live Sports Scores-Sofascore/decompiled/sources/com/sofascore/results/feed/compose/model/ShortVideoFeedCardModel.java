package com.sofascore.results.feed.compose.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.appsflyer.internal.i;
import defpackage.bf3;
import defpackage.d1c;
import defpackage.dl6;
import defpackage.dmi;
import defpackage.ljg;
import defpackage.w31;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003¨\u0006\u0004"}, d2 = {"Lcom/sofascore/results/feed/compose/model/ShortVideoFeedCardModel;", "Lw31;", "Ldl6;", "Landroid/os/Parcelable;", "mobile_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class ShortVideoFeedCardModel extends w31 implements dl6, Parcelable {

    @NotNull
    public static final Parcelable.Creator<ShortVideoFeedCardModel> CREATOR = new d1c(26);
    public final int g;
    public final String h;
    public final String i;
    public final long j;
    public final String k;
    public final String l;
    public final String m;
    public final Long n;
    public final boolean o;

    public ShortVideoFeedCardModel(int i, String str, String str2, long j, String str3, String str4, String str5, Long l, boolean z) {
        super(str, str2, null, null, false);
        this.g = i;
        this.h = str;
        this.i = str2;
        this.j = j;
        this.k = str3;
        this.l = str4;
        this.m = str5;
        this.n = l;
        this.o = z;
    }

    @Override // defpackage.dl6
    /* renamed from: d, reason: from getter */
    public final String getK() {
        return this.k;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ShortVideoFeedCardModel)) {
            return false;
        }
        ShortVideoFeedCardModel shortVideoFeedCardModel = (ShortVideoFeedCardModel) obj;
        return this.g == shortVideoFeedCardModel.g && Intrinsics.c(this.h, shortVideoFeedCardModel.h) && Intrinsics.c(this.i, shortVideoFeedCardModel.i) && this.j == shortVideoFeedCardModel.j && Intrinsics.c(this.k, shortVideoFeedCardModel.k) && Intrinsics.c(this.l, shortVideoFeedCardModel.l) && Intrinsics.c(this.m, shortVideoFeedCardModel.m) && Intrinsics.c(this.n, shortVideoFeedCardModel.n) && this.o == shortVideoFeedCardModel.o;
    }

    @Override // defpackage.w31
    /* renamed from: g, reason: from getter */
    public final String getI() {
        return this.i;
    }

    public final int hashCode() {
        int hashCode = Integer.hashCode(this.g) * 31;
        String str = this.h;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.i;
        int c = ljg.c((hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31, 31, this.j);
        String str3 = this.k;
        int hashCode3 = (c + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.l;
        int hashCode4 = (hashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.m;
        int hashCode5 = (hashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
        Long l = this.n;
        return Boolean.hashCode(this.o) + ((hashCode5 + (l != null ? l.hashCode() : 0)) * 31);
    }

    @Override // defpackage.w31
    /* renamed from: i, reason: from getter */
    public final int getG() {
        return this.g;
    }

    @Override // defpackage.w31
    /* renamed from: k, reason: from getter */
    public final String getH() {
        return this.h;
    }

    public final String toString() {
        StringBuilder t = dmi.t(this.g, "ShortVideoFeedCardModel(id=", ", title=", this.h, ", body=");
        i.n(this.j, this.i, ", createdAtTimestamp=", t);
        bf3.v(t, ", contentId=", this.k, ", externalUrl=", this.l);
        t.append(", thumbnailUrl=");
        t.append(this.m);
        t.append(", publishedAtTimestamp=");
        t.append(this.n);
        t.append(", isEmbeddable=");
        t.append(this.o);
        t.append(")");
        return t.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeInt(this.g);
        parcel.writeString(this.h);
        parcel.writeString(this.i);
        parcel.writeLong(this.j);
        parcel.writeString(this.k);
        parcel.writeString(this.l);
        parcel.writeString(this.m);
        Long l = this.n;
        if (l == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeLong(l.longValue());
        }
        parcel.writeInt(this.o ? 1 : 0);
    }
}
