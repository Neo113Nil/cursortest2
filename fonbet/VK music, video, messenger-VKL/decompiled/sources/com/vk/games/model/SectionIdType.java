package com.vk.games.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.ironsource.C4504q2;
import xsna.epx;
import xsna.ho8;
import xsna.zcl;

/* compiled from: GamesHeaderSectionInfo.kt */
/* loaded from: classes17.dex */
public abstract class SectionIdType implements Parcelable {
    public static final a CREATOR = new a();
    public final String b;

    /* compiled from: GamesHeaderSectionInfo.kt */
    public static final class CategoriesScreen extends SectionIdType {
        public static final CategoriesScreen c = new CategoriesScreen("screen_categories", null);

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof CategoriesScreen);
        }

        public final int hashCode() {
            return 1386133690;
        }

        public final String toString() {
            return "CategoriesScreen";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.writeString("screen_categories");
        }
    }

    /* compiled from: GamesHeaderSectionInfo.kt */
    public static final class Custom extends SectionIdType {
        public final String c;

        public Custom(String str) {
            super(str, null);
            this.c = str;
        }

        @Override // com.vk.games.model.SectionIdType
        public final String d() {
            return this.c;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Custom) && epx.f(this.c, ((Custom) obj).c);
        }

        public final int hashCode() {
            return this.c.hashCode();
        }

        public final String toString() {
            return ho8.a(new StringBuilder("Custom(sectionId="), this.c, ')');
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.writeString(this.c);
        }
    }

    /* compiled from: GamesHeaderSectionInfo.kt */
    public static final class FriendsActivity extends SectionIdType {
        public static final FriendsActivity c = new FriendsActivity("friends_activity", null);

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof FriendsActivity);
        }

        public final int hashCode() {
            return -1195129230;
        }

        public final String toString() {
            return "FriendsActivity";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.writeString("friends_activity");
        }
    }

    /* compiled from: GamesHeaderSectionInfo.kt */
    public static final class Installed extends SectionIdType {
        public static final Installed c = new Installed("installed", null);

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof Installed);
        }

        public final int hashCode() {
            return -2142053208;
        }

        public final String toString() {
            return "Installed";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.writeString("installed");
        }
    }

    /* compiled from: GamesHeaderSectionInfo.kt */
    public static final class New extends SectionIdType {
        public static final New c = new New("new", null);

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof New);
        }

        public final int hashCode() {
            return -1647294130;
        }

        public final String toString() {
            return "New";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.writeString("new");
        }
    }

    /* compiled from: GamesHeaderSectionInfo.kt */
    public static final class Notifications extends SectionIdType {
        public static final Notifications c = new Notifications(C4504q2.x, null);

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof Notifications);
        }

        public final int hashCode() {
            return -1097075946;
        }

        public final String toString() {
            return "Notifications";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.writeString(C4504q2.x);
        }
    }

    /* compiled from: GamesHeaderSectionInfo.kt */
    public static final class Recommended extends SectionIdType {
        public static final Recommended c = new Recommended("recommended", null);

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof Recommended);
        }

        public final int hashCode() {
            return -1929908215;
        }

        public final String toString() {
            return "Recommended";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.writeString("recommended");
        }
    }

    /* compiled from: GamesHeaderSectionInfo.kt */
    public static final class a implements Parcelable.Creator<SectionIdType> {
        /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
        @Override // android.os.Parcelable.Creator
        public final SectionIdType createFromParcel(Parcel parcel) {
            String readString = parcel.readString();
            switch (readString.hashCode()) {
                case -1910923313:
                    if (readString.equals("screen_categories")) {
                        return CategoriesScreen.c;
                    }
                    break;
                case 108960:
                    if (readString.equals("new")) {
                        return New.c;
                    }
                    break;
                case 29046650:
                    if (readString.equals("installed")) {
                        return Installed.c;
                    }
                    break;
                case 1272354024:
                    if (readString.equals(C4504q2.x)) {
                        return Notifications.c;
                    }
                    break;
                case 1437916763:
                    if (readString.equals("recommended")) {
                        return Recommended.c;
                    }
                    break;
                case 2027344505:
                    if (readString.equals("friends_activity")) {
                        return FriendsActivity.c;
                    }
                    break;
            }
            return new Custom(readString);
        }

        @Override // android.os.Parcelable.Creator
        public final SectionIdType[] newArray(int i) {
            return new SectionIdType[i];
        }
    }

    public SectionIdType(String str, zcl zclVar) {
        this.b = str;
    }

    public String d() {
        return this.b;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }
}
