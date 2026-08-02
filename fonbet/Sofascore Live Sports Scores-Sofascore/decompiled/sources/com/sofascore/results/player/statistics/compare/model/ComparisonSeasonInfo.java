package com.sofascore.results.player.statistics.compare.model;

import android.os.Parcel;
import android.os.Parcelable;
import defpackage.lnb;
import defpackage.mz1;
import defpackage.wv8;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006À\u0006\u0003"}, d2 = {"Lcom/sofascore/results/player/statistics/compare/model/ComparisonSeasonInfo;", "Landroid/os/Parcelable;", "UniqueTournamentSeasonInfo", "TennisYearInfo", "Lcom/sofascore/results/player/statistics/compare/model/ComparisonSeasonInfo$TennisYearInfo;", "Lcom/sofascore/results/player/statistics/compare/model/ComparisonSeasonInfo$UniqueTournamentSeasonInfo;", "mobile_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes6.dex */
public interface ComparisonSeasonInfo extends Parcelable {

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/sofascore/results/player/statistics/compare/model/ComparisonSeasonInfo$TennisYearInfo;", "Lcom/sofascore/results/player/statistics/compare/model/ComparisonSeasonInfo;", "mobile_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class TennisYearInfo implements ComparisonSeasonInfo {

        @NotNull
        public static final Parcelable.Creator<TennisYearInfo> CREATOR = new a();
        public final String a;

        public TennisYearInfo(String str) {
            str.getClass();
            this.a = str;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof TennisYearInfo) && Intrinsics.c(this.a, ((TennisYearInfo) obj).a);
        }

        public final int hashCode() {
            return this.a.hashCode();
        }

        public final String toString() {
            return lnb.o("TennisYearInfo(year=", this.a, ")");
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.getClass();
            parcel.writeString(this.a);
        }
    }

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/sofascore/results/player/statistics/compare/model/ComparisonSeasonInfo$UniqueTournamentSeasonInfo;", "Lcom/sofascore/results/player/statistics/compare/model/ComparisonSeasonInfo;", "mobile_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class UniqueTournamentSeasonInfo implements ComparisonSeasonInfo {

        @NotNull
        public static final Parcelable.Creator<UniqueTournamentSeasonInfo> CREATOR = new b();
        public final int a;
        public final int b;
        public final String c;

        public UniqueTournamentSeasonInfo(int i, int i2, String str) {
            str.getClass();
            this.a = i;
            this.b = i2;
            this.c = str;
        }

        public static UniqueTournamentSeasonInfo a(UniqueTournamentSeasonInfo uniqueTournamentSeasonInfo, String str) {
            int i = uniqueTournamentSeasonInfo.a;
            int i2 = uniqueTournamentSeasonInfo.b;
            str.getClass();
            return new UniqueTournamentSeasonInfo(i, i2, str);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof UniqueTournamentSeasonInfo)) {
                return false;
            }
            UniqueTournamentSeasonInfo uniqueTournamentSeasonInfo = (UniqueTournamentSeasonInfo) obj;
            return this.a == uniqueTournamentSeasonInfo.a && this.b == uniqueTournamentSeasonInfo.b && Intrinsics.c(this.c, uniqueTournamentSeasonInfo.c);
        }

        public final int hashCode() {
            return this.c.hashCode() + wv8.a(this.b, Integer.hashCode(this.a) * 31, 31);
        }

        public final String toString() {
            return mz1.o(lnb.s(this.a, this.b, "UniqueTournamentSeasonInfo(uniqueTournamentId=", ", seasonId=", ", subSeasonType="), this.c, ")");
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.getClass();
            parcel.writeInt(this.a);
            parcel.writeInt(this.b);
            parcel.writeString(this.c);
        }
    }
}
