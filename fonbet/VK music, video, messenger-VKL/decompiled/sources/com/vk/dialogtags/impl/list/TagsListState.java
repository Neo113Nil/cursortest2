package com.vk.dialogtags.impl.list;

import android.os.Parcel;
import android.os.Parcelable;
import com.vk.im.engine.models.dialogs.DialogTag;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.EmptyList;
import xsna.ao;
import xsna.asp;
import xsna.bo;
import xsna.epx;
import xsna.fw3;
import xsna.lm50;
import xsna.pm0;
import xsna.zcl;
import xsna.zrp;

/* compiled from: TagsListState.kt */
/* loaded from: classes18.dex */
public final class TagsListState implements lm50, Parcelable {
    public static final Parcelable.Creator<TagsListState> CREATOR = new a();
    public final List<DialogTag> b;
    public final List<Integer> c;
    public final State d;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: TagsListState.kt */
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

    /* compiled from: TagsListState.kt */
    public static final class a implements Parcelable.Creator<TagsListState> {
        @Override // android.os.Parcelable.Creator
        public final TagsListState createFromParcel(Parcel parcel) {
            int readInt = parcel.readInt();
            ArrayList arrayList = new ArrayList(readInt);
            int i = 0;
            int i2 = 0;
            while (i2 != readInt) {
                i2 = bo.b(TagsListState.class, parcel, arrayList, i2, 1);
            }
            int readInt2 = parcel.readInt();
            ArrayList arrayList2 = new ArrayList(readInt2);
            while (i != readInt2) {
                i = pm0.b(parcel, arrayList2, i, 1);
            }
            return new TagsListState(arrayList, arrayList2, State.valueOf(parcel.readString()));
        }

        @Override // android.os.Parcelable.Creator
        public final TagsListState[] newArray(int i) {
            return new TagsListState[i];
        }
    }

    public TagsListState(List<DialogTag> list, List<Integer> list2, State state) {
        this.b = list;
        this.c = list2;
        this.d = state;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static TagsListState a(TagsListState tagsListState, List list, ArrayList arrayList, int i) {
        if ((i & 1) != 0) {
            list = tagsListState.b;
        }
        List list2 = arrayList;
        if ((i & 2) != 0) {
            list2 = tagsListState.c;
        }
        State state = tagsListState.d;
        tagsListState.getClass();
        return new TagsListState(list, list2, state);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TagsListState)) {
            return false;
        }
        TagsListState tagsListState = (TagsListState) obj;
        return epx.f(this.b, tagsListState.b) && epx.f(this.c, tagsListState.c) && this.d == tagsListState.d;
    }

    public final int hashCode() {
        return this.d.hashCode() + fw3.a(this.b.hashCode() * 31, 31, this.c);
    }

    public final String toString() {
        return "TagsListState(items=" + this.b + ", filteredIds=" + this.c + ", state=" + this.d + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        Iterator a2 = ao.a(parcel, this.b);
        while (a2.hasNext()) {
            parcel.writeParcelable((Parcelable) a2.next(), i);
        }
        Iterator a3 = ao.a(parcel, this.c);
        while (a3.hasNext()) {
            parcel.writeInt(((Number) a3.next()).intValue());
        }
        parcel.writeString(this.d.name());
    }

    public TagsListState(List list, List list2, State state, int i, zcl zclVar) {
        this(list, (i & 2) != 0 ? EmptyList.b : list2, (i & 4) != 0 ? State.LOADING : state);
    }
}
