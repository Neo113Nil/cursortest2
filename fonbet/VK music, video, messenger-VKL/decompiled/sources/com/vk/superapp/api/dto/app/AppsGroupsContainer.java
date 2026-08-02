package com.vk.superapp.api.dto.app;

import android.os.Parcel;
import android.os.Parcelable;
import com.ironsource.C4217a2;
import com.vk.superapp.api.dto.group.WebGroup;
import xsna.asp;
import xsna.epx;
import xsna.qoy;
import xsna.urd0;
import xsna.zrp;

/* compiled from: AppsGroupsContainer.kt */
/* loaded from: classes6.dex */
public final class AppsGroupsContainer implements Parcelable {
    public static final Parcelable.Creator<AppsGroupsContainer> CREATOR = new a();
    public final WebGroup b;
    public final boolean c;
    public final String d;
    public final CheckboxState e;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: AppsGroupsContainer.kt */
    public static final class CheckboxState {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ CheckboxState[] $VALUES;
        public static final CheckboxState AVAILABLE;
        public static final CheckboxState DISABLE;
        public static final CheckboxState HIDDEN;
        private final String state;

        static {
            CheckboxState checkboxState = new CheckboxState("AVAILABLE", 0, "available");
            AVAILABLE = checkboxState;
            CheckboxState checkboxState2 = new CheckboxState("DISABLE", 1, C4217a2.e);
            DISABLE = checkboxState2;
            CheckboxState checkboxState3 = new CheckboxState("HIDDEN", 2, "hidden");
            HIDDEN = checkboxState3;
            CheckboxState[] checkboxStateArr = {checkboxState, checkboxState2, checkboxState3};
            $VALUES = checkboxStateArr;
            $ENTRIES = new asp(checkboxStateArr);
        }

        public CheckboxState(String str, int i, String str2) {
            this.state = str2;
        }

        public static CheckboxState valueOf(String str) {
            return (CheckboxState) Enum.valueOf(CheckboxState.class, str);
        }

        public static CheckboxState[] values() {
            return (CheckboxState[]) $VALUES.clone();
        }
    }

    /* compiled from: AppsGroupsContainer.kt */
    public static final class a implements Parcelable.Creator<AppsGroupsContainer> {
        @Override // android.os.Parcelable.Creator
        public final AppsGroupsContainer createFromParcel(Parcel parcel) {
            return new AppsGroupsContainer((WebGroup) parcel.readParcelable(AppsGroupsContainer.class.getClassLoader()), parcel.readInt() != 0, parcel.readString(), CheckboxState.valueOf(parcel.readString()));
        }

        @Override // android.os.Parcelable.Creator
        public final AppsGroupsContainer[] newArray(int i) {
            return new AppsGroupsContainer[i];
        }
    }

    public AppsGroupsContainer(WebGroup webGroup, boolean z, String str, CheckboxState checkboxState) {
        this.b = webGroup;
        this.c = z;
        this.d = str;
        this.e = checkboxState;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AppsGroupsContainer)) {
            return false;
        }
        AppsGroupsContainer appsGroupsContainer = (AppsGroupsContainer) obj;
        return epx.f(this.b, appsGroupsContainer.b) && this.c == appsGroupsContainer.c && epx.f(this.d, appsGroupsContainer.d) && this.e == appsGroupsContainer.e;
    }

    public final int hashCode() {
        return this.e.hashCode() + urd0.a(qoy.b(this.b.hashCode() * 31, 31, this.c), 31, this.d);
    }

    public final String toString() {
        return "AppsGroupsContainer(group=" + this.b + ", isCanInstall=" + this.c + ", installDescription=" + this.d + ", pushCheckboxState=" + this.e + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.b, i);
        parcel.writeInt(this.c ? 1 : 0);
        parcel.writeString(this.d);
        parcel.writeString(this.e.name());
    }
}
