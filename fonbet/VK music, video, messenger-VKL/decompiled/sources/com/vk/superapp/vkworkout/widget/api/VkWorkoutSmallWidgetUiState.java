package com.vk.superapp.vkworkout.widget.api;

import android.os.Parcel;
import android.os.Parcelable;
import com.huawei.hms.framework.network.grs.GrsBaseInfo;
import xsna.asp;
import xsna.shy;
import xsna.zrp;

/* compiled from: VkWorkoutSmallWidgetUiState.kt */
/* loaded from: classes6.dex */
public final class VkWorkoutSmallWidgetUiState implements Parcelable {
    public static final Parcelable.Creator<VkWorkoutSmallWidgetUiState> CREATOR = new a();
    public final int b;
    public final int c;
    public final State d;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: VkWorkoutSmallWidgetUiState.kt */
    public static final class State {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ State[] $VALUES;
        public static final State ACCESS_ERROR;
        public static final State COMMON;
        public static final State ERROR;
        public static final State UNKNOWN;

        static {
            State state = new State("COMMON", 0);
            COMMON = state;
            State state2 = new State(GrsBaseInfo.CountryCodeSource.UNKNOWN, 1);
            UNKNOWN = state2;
            State state3 = new State("ERROR", 2);
            ERROR = state3;
            State state4 = new State("ACCESS_ERROR", 3);
            ACCESS_ERROR = state4;
            State[] stateArr = {state, state2, state3, state4};
            $VALUES = stateArr;
            $ENTRIES = new asp(stateArr);
        }

        public State() {
            throw null;
        }

        public static State valueOf(String str) {
            return (State) Enum.valueOf(State.class, str);
        }

        public static State[] values() {
            return (State[]) $VALUES.clone();
        }
    }

    /* compiled from: VkWorkoutSmallWidgetUiState.kt */
    public static final class a implements Parcelable.Creator<VkWorkoutSmallWidgetUiState> {
        @Override // android.os.Parcelable.Creator
        public final VkWorkoutSmallWidgetUiState createFromParcel(Parcel parcel) {
            return new VkWorkoutSmallWidgetUiState(parcel.readInt(), parcel.readInt(), State.valueOf(parcel.readString()));
        }

        @Override // android.os.Parcelable.Creator
        public final VkWorkoutSmallWidgetUiState[] newArray(int i) {
            return new VkWorkoutSmallWidgetUiState[i];
        }
    }

    public VkWorkoutSmallWidgetUiState(int i, int i2, State state) {
        this.b = i;
        this.c = i2;
        this.d = state;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof VkWorkoutSmallWidgetUiState)) {
            return false;
        }
        VkWorkoutSmallWidgetUiState vkWorkoutSmallWidgetUiState = (VkWorkoutSmallWidgetUiState) obj;
        return this.b == vkWorkoutSmallWidgetUiState.b && this.c == vkWorkoutSmallWidgetUiState.c && this.d == vkWorkoutSmallWidgetUiState.d;
    }

    public final int hashCode() {
        return this.d.hashCode() + shy.a(this.c, Integer.hashCode(this.b) * 31, 31);
    }

    public final String toString() {
        return "VkWorkoutSmallWidgetUiState(workoutsCount=" + this.b + ", distance=" + this.c + ", state=" + this.d + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.b);
        parcel.writeInt(this.c);
        parcel.writeString(this.d.name());
    }
}
