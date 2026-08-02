package com.sofascore.results.player.statistics.career.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.sofascore.model.mvvm.model.UniqueTournament;
import defpackage.joa;
import defpackage.vxd;
import defpackage.wk2;
import defpackage.wt3;
import defpackage.xxb;
import defpackage.ypa;
import defpackage.ysa;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006"}, d2 = {"Lcom/sofascore/results/player/statistics/career/model/PickerItem;", "Landroid/os/Parcelable;", "Category", "Tournament", "Lcom/sofascore/results/player/statistics/career/model/PickerItem$Category;", "Lcom/sofascore/results/player/statistics/career/model/PickerItem$Tournament;", "mobile_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes6.dex */
public abstract class PickerItem implements Parcelable {

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/sofascore/results/player/statistics/career/model/PickerItem$Category;", "Lcom/sofascore/results/player/statistics/career/model/PickerItem;", "mobile_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Category extends PickerItem {

        @NotNull
        public static final Parcelable.Creator<Category> CREATOR = new a();
        public final wk2 a;
        public final ArrayList b;
        public boolean c;
        public final joa d;

        public Category(wk2 wk2Var, ArrayList arrayList, boolean z) {
            wk2Var.getClass();
            this.a = wk2Var;
            this.b = arrayList;
            this.c = z;
            this.d = ypa.a(ysa.c, new xxb(this, 25));
        }

        @Override // com.sofascore.results.player.statistics.career.model.PickerItem
        public final int a() {
            return 0;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Category)) {
                return false;
            }
            Category category = (Category) obj;
            return this.a == category.a && this.b.equals(category.b) && this.c == category.c;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.c) + vxd.d(this.b, this.a.hashCode() * 31, 31);
        }

        public final String toString() {
            boolean z = this.c;
            StringBuilder sb = new StringBuilder("Category(competitionType=");
            sb.append(this.a);
            sb.append(", tournaments=");
            sb.append(this.b);
            sb.append(", isExpanded=");
            return wt3.p(sb, z, ")");
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.getClass();
            parcel.writeString(this.a.name());
            ArrayList arrayList = this.b;
            parcel.writeInt(arrayList.size());
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                parcel.writeSerializable((Serializable) it.next());
            }
            parcel.writeInt(this.c ? 1 : 0);
        }
    }

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/sofascore/results/player/statistics/career/model/PickerItem$Tournament;", "Lcom/sofascore/results/player/statistics/career/model/PickerItem;", "mobile_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class Tournament extends PickerItem {

        @NotNull
        public static final Parcelable.Creator<Tournament> CREATOR = new b();
        public final wk2 a;
        public final UniqueTournament b;
        public final Boolean c;

        public Tournament(wk2 wk2Var, UniqueTournament uniqueTournament, Boolean bool) {
            this.a = wk2Var;
            this.b = uniqueTournament;
            this.c = bool;
        }

        @Override // com.sofascore.results.player.statistics.career.model.PickerItem
        public final int a() {
            return 1;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Tournament)) {
                return false;
            }
            Tournament tournament = (Tournament) obj;
            return this.a == tournament.a && Intrinsics.c(this.b, tournament.b) && Intrinsics.c(this.c, tournament.c);
        }

        public final int hashCode() {
            wk2 wk2Var = this.a;
            int hashCode = (wk2Var == null ? 0 : wk2Var.hashCode()) * 31;
            UniqueTournament uniqueTournament = this.b;
            int hashCode2 = (hashCode + (uniqueTournament == null ? 0 : uniqueTournament.hashCode())) * 31;
            Boolean bool = this.c;
            return hashCode2 + (bool != null ? bool.hashCode() : 0);
        }

        public final String toString() {
            return "Tournament(competitionType=" + this.a + ", uniqueTournament=" + this.b + ", hasDivider=" + this.c + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.getClass();
            wk2 wk2Var = this.a;
            if (wk2Var == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                parcel.writeString(wk2Var.name());
            }
            parcel.writeSerializable(this.b);
            Boolean bool = this.c;
            if (bool == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                parcel.writeInt(bool.booleanValue() ? 1 : 0);
            }
        }
    }

    public abstract int a();
}
