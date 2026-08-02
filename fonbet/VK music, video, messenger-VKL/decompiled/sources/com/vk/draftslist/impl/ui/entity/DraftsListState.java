package com.vk.draftslist.impl.ui.entity;

import android.os.Parcel;
import android.os.Parcelable;
import com.vk.dto.common.id.UserId;
import com.vk.dto.newsfeed.entries.Post;
import defpackage.q0;
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
import xsna.qoy;
import xsna.shy;
import xsna.zcl;
import xsna.zrp;

/* compiled from: DraftsListState.kt */
/* loaded from: classes18.dex */
public final class DraftsListState implements lm50, Parcelable {
    public static final Parcelable.Creator<DraftsListState> CREATOR = new a();
    public final UserId b;
    public final List<Post> c;
    public final LoadingState d;
    public final int e;
    public final boolean f;
    public final boolean g;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: DraftsListState.kt */
    public static final class LoadingState {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ LoadingState[] $VALUES;
        public static final LoadingState ERROR_INITIAL_LOAD;
        public static final LoadingState ERROR_PAGINATION;
        public static final LoadingState ERROR_REFRESH;
        public static final LoadingState IDLE;
        public static final LoadingState LOADING_INITIAL;
        public static final LoadingState LOADING_PAGINATION;
        public static final LoadingState LOADING_REFRESH;
        public static final LoadingState NOT_INITIALIZED;

        static {
            LoadingState loadingState = new LoadingState("NOT_INITIALIZED", 0);
            NOT_INITIALIZED = loadingState;
            LoadingState loadingState2 = new LoadingState("IDLE", 1);
            IDLE = loadingState2;
            LoadingState loadingState3 = new LoadingState("LOADING_INITIAL", 2);
            LOADING_INITIAL = loadingState3;
            LoadingState loadingState4 = new LoadingState("LOADING_PAGINATION", 3);
            LOADING_PAGINATION = loadingState4;
            LoadingState loadingState5 = new LoadingState("LOADING_REFRESH", 4);
            LOADING_REFRESH = loadingState5;
            LoadingState loadingState6 = new LoadingState("ERROR_INITIAL_LOAD", 5);
            ERROR_INITIAL_LOAD = loadingState6;
            LoadingState loadingState7 = new LoadingState("ERROR_REFRESH", 6);
            ERROR_REFRESH = loadingState7;
            LoadingState loadingState8 = new LoadingState("ERROR_PAGINATION", 7);
            ERROR_PAGINATION = loadingState8;
            LoadingState[] loadingStateArr = {loadingState, loadingState2, loadingState3, loadingState4, loadingState5, loadingState6, loadingState7, loadingState8};
            $VALUES = loadingStateArr;
            $ENTRIES = new asp(loadingStateArr);
        }

        public LoadingState() {
            throw null;
        }

        public static LoadingState valueOf(String str) {
            return (LoadingState) Enum.valueOf(LoadingState.class, str);
        }

        public static LoadingState[] values() {
            return (LoadingState[]) $VALUES.clone();
        }
    }

    /* compiled from: DraftsListState.kt */
    public static final class a implements Parcelable.Creator<DraftsListState> {
        @Override // android.os.Parcelable.Creator
        public final DraftsListState createFromParcel(Parcel parcel) {
            UserId userId = (UserId) parcel.readParcelable(DraftsListState.class.getClassLoader());
            int readInt = parcel.readInt();
            ArrayList arrayList = new ArrayList(readInt);
            int i = 0;
            while (i != readInt) {
                i = bo.b(DraftsListState.class, parcel, arrayList, i, 1);
            }
            return new DraftsListState(userId, arrayList, LoadingState.valueOf(parcel.readString()), parcel.readInt(), parcel.readInt() != 0, parcel.readInt() != 0);
        }

        @Override // android.os.Parcelable.Creator
        public final DraftsListState[] newArray(int i) {
            return new DraftsListState[i];
        }
    }

    public DraftsListState(UserId userId, List<Post> list, LoadingState loadingState, int i, boolean z, boolean z2) {
        this.b = userId;
        this.c = list;
        this.d = loadingState;
        this.e = i;
        this.f = z;
        this.g = z2;
    }

    public static DraftsListState a(DraftsListState draftsListState, List list, LoadingState loadingState, int i, boolean z, boolean z2, int i2) {
        List list2 = list;
        UserId userId = draftsListState.b;
        if ((i2 & 2) != 0) {
            list2 = draftsListState.c;
        }
        if ((i2 & 4) != 0) {
            loadingState = draftsListState.d;
        }
        if ((i2 & 8) != 0) {
            i = draftsListState.e;
        }
        if ((i2 & 16) != 0) {
            z = draftsListState.f;
        }
        if ((i2 & 32) != 0) {
            z2 = draftsListState.g;
        }
        boolean z3 = z2;
        draftsListState.getClass();
        boolean z4 = z;
        int i3 = i;
        return new DraftsListState(userId, list2, loadingState, i3, z4, z3);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DraftsListState)) {
            return false;
        }
        DraftsListState draftsListState = (DraftsListState) obj;
        return epx.f(this.b, draftsListState.b) && epx.f(this.c, draftsListState.c) && this.d == draftsListState.d && this.e == draftsListState.e && this.f == draftsListState.f && this.g == draftsListState.g;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.g) + qoy.b(shy.a(this.e, (this.d.hashCode() + fw3.a(Long.hashCode(this.b.b) * 31, 31, this.c)) * 31, 31), 31, this.f);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("DraftsListState(ownerId=");
        sb.append(this.b);
        sb.append(", items=");
        sb.append(this.c);
        sb.append(", loadingState=");
        sb.append(this.d);
        sb.append(", currentPaginationOffset=");
        sb.append(this.e);
        sb.append(", isAllDraftsLoaded=");
        sb.append(this.f);
        sb.append(", needScrollToTop=");
        return q0.a(sb, this.g, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.b, i);
        Iterator a2 = ao.a(parcel, this.c);
        while (a2.hasNext()) {
            parcel.writeParcelable((Parcelable) a2.next(), i);
        }
        parcel.writeString(this.d.name());
        parcel.writeInt(this.e);
        parcel.writeInt(this.f ? 1 : 0);
        parcel.writeInt(this.g ? 1 : 0);
    }

    public DraftsListState(UserId userId, List list, LoadingState loadingState, int i, boolean z, boolean z2, int i2, zcl zclVar) {
        this(userId, (i2 & 2) != 0 ? EmptyList.b : list, (i2 & 4) != 0 ? LoadingState.NOT_INITIALIZED : loadingState, (i2 & 8) != 0 ? 0 : i, (i2 & 16) != 0 ? false : z, (i2 & 32) != 0 ? false : z2);
    }
}
