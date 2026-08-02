package com.vk.im.engine.models.attaches.miniapp;

import android.os.Parcel;
import com.vk.core.serialize.Serializer;
import org.json.JSONObject;
import xsna.asp;
import xsna.epx;
import xsna.zrp;

/* compiled from: AttachMiniAppButton.kt */
/* loaded from: classes2.dex */
public final class AttachMiniAppButton implements Serializer.StreamParcelable {
    public static final Serializer.c<AttachMiniAppButton> CREATOR = new a();
    public final String b;
    public final State c;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: AttachMiniAppButton.kt */
    public static final class State {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ State[] $VALUES;
        public static final State ARROW;
        public static final State BLUE;
        public static final a Companion;
        public static final State GAME;
        public static final State GRAY;
        public static final State MINI_APP;
        private final String value;

        /* compiled from: AttachMiniAppButton.kt */
        public static final class a {
            public static State a(String str) {
                State state;
                State[] values = State.values();
                int length = values.length;
                int i = 0;
                while (true) {
                    if (i >= length) {
                        state = null;
                        break;
                    }
                    state = values[i];
                    if (epx.f(state.h(), str)) {
                        break;
                    }
                    i++;
                }
                return state == null ? State.MINI_APP : state;
            }
        }

        static {
            State state = new State("ARROW", 0, "arrow");
            ARROW = state;
            State state2 = new State("BLUE", 1, "blue");
            BLUE = state2;
            State state3 = new State("GRAY", 2, "gray");
            GRAY = state3;
            State state4 = new State("MINI_APP", 3, "mini_app");
            MINI_APP = state4;
            State state5 = new State("GAME", 4, "game");
            GAME = state5;
            State[] stateArr = {state, state2, state3, state4, state5};
            $VALUES = stateArr;
            $ENTRIES = new asp(stateArr);
            Companion = new a();
        }

        public State(String str, int i, String str2) {
            this.value = str2;
        }

        public static State valueOf(String str) {
            return (State) Enum.valueOf(State.class, str);
        }

        public static State[] values() {
            return (State[]) $VALUES.clone();
        }

        public final String h() {
            return this.value;
        }
    }

    /* compiled from: Serializer.kt */
    public static final class a extends Serializer.c<AttachMiniAppButton> {
        @Override // com.vk.core.serialize.Serializer.c
        public final AttachMiniAppButton a(Serializer serializer) {
            return new AttachMiniAppButton(serializer);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new AttachMiniAppButton[i];
        }
    }

    public AttachMiniAppButton(String str, State state) {
        this.b = str;
        this.c = state;
    }

    @Override // com.vk.core.serialize.Serializer.StreamParcelable
    public final void O7(Serializer serializer) {
        serializer.j0(this.b);
        serializer.S(this.c.ordinal());
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AttachMiniAppButton)) {
            return false;
        }
        AttachMiniAppButton attachMiniAppButton = (AttachMiniAppButton) obj;
        return epx.f(this.b, attachMiniAppButton.b) && this.c == attachMiniAppButton.c;
    }

    public final int hashCode() {
        return this.c.hashCode() + (this.b.hashCode() * 31);
    }

    public final String toString() {
        return "AttachMiniAppButton(buttonText=" + this.b + ", state=" + this.c + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        Serializer.StreamParcelable.a.a(this, parcel);
    }

    public AttachMiniAppButton(Serializer serializer) {
        this(serializer.H(), State.values()[serializer.u()]);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public AttachMiniAppButton(JSONObject jSONObject) {
        this(r0, State.a.a(r4));
        String optString = jSONObject.optString("button_text");
        State.a aVar = State.Companion;
        String optString2 = jSONObject.optString("state");
        aVar.getClass();
    }
}
