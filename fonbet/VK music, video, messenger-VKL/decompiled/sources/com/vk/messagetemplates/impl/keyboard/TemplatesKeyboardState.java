package com.vk.messagetemplates.impl.keyboard;

import android.os.Parcel;
import android.os.Parcelable;
import com.vk.im.engine.models.messages.MsgTemplate;
import com.vk.messagetemplates.impl.common.TemplateArgs;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import xsna.ao;
import xsna.asp;
import xsna.bo;
import xsna.epx;
import xsna.fw3;
import xsna.lm50;
import xsna.zcl;
import xsna.zrp;

/* compiled from: TemplatesKeyboardState.kt */
/* loaded from: classes3.dex */
public final class TemplatesKeyboardState implements lm50, Parcelable {
    public static final Parcelable.Creator<TemplatesKeyboardState> CREATOR = new a();
    public final TemplateArgs b;
    public final List<MsgTemplate> c;
    public final State d;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: TemplatesKeyboardState.kt */
    public static final class State {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ State[] $VALUES;
        public static final State LOADED;
        public static final State LOADING;

        static {
            State state = new State("LOADED", 0);
            LOADED = state;
            State state2 = new State("LOADING", 1);
            LOADING = state2;
            State[] stateArr = {state, state2};
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

    /* compiled from: TemplatesKeyboardState.kt */
    public static final class a implements Parcelable.Creator<TemplatesKeyboardState> {
        @Override // android.os.Parcelable.Creator
        public final TemplatesKeyboardState createFromParcel(Parcel parcel) {
            TemplateArgs createFromParcel = TemplateArgs.CREATOR.createFromParcel(parcel);
            int readInt = parcel.readInt();
            ArrayList arrayList = new ArrayList(readInt);
            int i = 0;
            while (i != readInt) {
                i = bo.b(TemplatesKeyboardState.class, parcel, arrayList, i, 1);
            }
            return new TemplatesKeyboardState(createFromParcel, arrayList, State.valueOf(parcel.readString()));
        }

        @Override // android.os.Parcelable.Creator
        public final TemplatesKeyboardState[] newArray(int i) {
            return new TemplatesKeyboardState[i];
        }
    }

    public TemplatesKeyboardState(TemplateArgs templateArgs, List<MsgTemplate> list, State state) {
        this.b = templateArgs;
        this.c = list;
        this.d = state;
    }

    public static TemplatesKeyboardState a(TemplatesKeyboardState templatesKeyboardState, List list) {
        TemplateArgs templateArgs = templatesKeyboardState.b;
        State state = templatesKeyboardState.d;
        templatesKeyboardState.getClass();
        return new TemplatesKeyboardState(templateArgs, list, state);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TemplatesKeyboardState)) {
            return false;
        }
        TemplatesKeyboardState templatesKeyboardState = (TemplatesKeyboardState) obj;
        return epx.f(this.b, templatesKeyboardState.b) && epx.f(this.c, templatesKeyboardState.c) && this.d == templatesKeyboardState.d;
    }

    public final int hashCode() {
        return this.d.hashCode() + fw3.a(this.b.hashCode() * 31, 31, this.c);
    }

    public final String toString() {
        return "TemplatesKeyboardState(templateArgs=" + this.b + ", items=" + this.c + ", state=" + this.d + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        this.b.writeToParcel(parcel, i);
        Iterator a2 = ao.a(parcel, this.c);
        while (a2.hasNext()) {
            parcel.writeParcelable((Parcelable) a2.next(), i);
        }
        parcel.writeString(this.d.name());
    }

    public /* synthetic */ TemplatesKeyboardState(TemplateArgs templateArgs, List list, State state, int i, zcl zclVar) {
        this(templateArgs, list, (i & 4) != 0 ? State.LOADING : state);
    }
}
