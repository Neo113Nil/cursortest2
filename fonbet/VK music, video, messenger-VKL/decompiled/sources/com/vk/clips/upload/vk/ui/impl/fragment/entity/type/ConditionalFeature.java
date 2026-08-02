package com.vk.clips.upload.vk.ui.impl.fragment.entity.type;

import android.os.Parcel;
import android.os.Parcelable;
import xsna.asp;
import xsna.epx;
import xsna.zrp;

/* compiled from: ConditionalFeature.kt */
/* loaded from: classes17.dex */
public final class ConditionalFeature<T extends Parcelable> implements Parcelable {
    public static final Parcelable.Creator<ConditionalFeature<?>> CREATOR = new a();
    public final T b;
    public final State c;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: ConditionalFeature.kt */
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

    /* compiled from: ConditionalFeature.kt */
    public static final class a implements Parcelable.Creator<ConditionalFeature<?>> {
        @Override // android.os.Parcelable.Creator
        public final ConditionalFeature<?> createFromParcel(Parcel parcel) {
            return new ConditionalFeature<>(parcel.readParcelable(ConditionalFeature.class.getClassLoader()), State.valueOf(parcel.readString()));
        }

        @Override // android.os.Parcelable.Creator
        public final ConditionalFeature<?>[] newArray(int i) {
            return new ConditionalFeature[i];
        }
    }

    public ConditionalFeature(T t, State state) {
        this.b = t;
        this.c = state;
    }

    public static ConditionalFeature a(ConditionalFeature conditionalFeature, Parcelable parcelable, State state, int i) {
        if ((i & 1) != 0) {
            parcelable = conditionalFeature.b;
        }
        if ((i & 2) != 0) {
            state = conditionalFeature.c;
        }
        conditionalFeature.getClass();
        return new ConditionalFeature(parcelable, state);
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
        if (!(obj instanceof ConditionalFeature)) {
            return false;
        }
        ConditionalFeature conditionalFeature = (ConditionalFeature) obj;
        return epx.f(this.b, conditionalFeature.b) && this.c == conditionalFeature.c;
    }

    public final int hashCode() {
        T t = this.b;
        return this.c.hashCode() + ((t == null ? 0 : t.hashCode()) * 31);
    }

    public final String toString() {
        return "ConditionalFeature(data=" + this.b + ", state=" + this.c + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.b, i);
        parcel.writeString(this.c.name());
    }
}
