package com.vk.clips.upload.vk.ui.impl.fragment.entity.type;

import android.os.Parcel;
import android.os.Parcelable;
import java.lang.Number;
import xsna.asp;
import xsna.epx;
import xsna.zrp;

/* compiled from: ConditionalNumber.kt */
/* loaded from: classes17.dex */
public final class ConditionalNumber<T extends Number> implements Parcelable {
    public static final Parcelable.Creator<ConditionalNumber<?>> CREATOR = new a();
    public final T b;
    public final State c;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: ConditionalNumber.kt */
    public static final class State {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ State[] $VALUES;
        public static final State DISABLED;
        public static final State HIDDEN;
        public static final State SHOWN;

        static {
            State state = new State("SHOWN", 0);
            SHOWN = state;
            State state2 = new State("DISABLED", 1);
            DISABLED = state2;
            State state3 = new State("HIDDEN", 2);
            HIDDEN = state3;
            State[] stateArr = {state, state2, state3};
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

    /* compiled from: ConditionalNumber.kt */
    public static final class a implements Parcelable.Creator<ConditionalNumber<?>> {
        @Override // android.os.Parcelable.Creator
        public final ConditionalNumber<?> createFromParcel(Parcel parcel) {
            return new ConditionalNumber<>((Number) parcel.readSerializable(), State.valueOf(parcel.readString()));
        }

        @Override // android.os.Parcelable.Creator
        public final ConditionalNumber<?>[] newArray(int i) {
            return new ConditionalNumber[i];
        }
    }

    public ConditionalNumber(T t, State state) {
        this.b = t;
        this.c = state;
    }

    public static ConditionalNumber a(ConditionalNumber conditionalNumber, Long l, State state, int i) {
        if ((i & 1) != 0) {
            l = conditionalNumber.b;
        }
        if ((i & 2) != 0) {
            state = conditionalNumber.c;
        }
        return new ConditionalNumber(l, state);
    }

    public final T d() {
        if (this.c == State.SHOWN) {
            return this.b;
        }
        return null;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ConditionalNumber)) {
            return false;
        }
        ConditionalNumber conditionalNumber = (ConditionalNumber) obj;
        return epx.f(this.b, conditionalNumber.b) && this.c == conditionalNumber.c;
    }

    public final int hashCode() {
        T t = this.b;
        return this.c.hashCode() + ((t == null ? 0 : t.hashCode()) * 31);
    }

    public final String toString() {
        return "ConditionalNumber(data=" + this.b + ", state=" + this.c + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeSerializable(this.b);
        parcel.writeString(this.c.name());
    }
}
