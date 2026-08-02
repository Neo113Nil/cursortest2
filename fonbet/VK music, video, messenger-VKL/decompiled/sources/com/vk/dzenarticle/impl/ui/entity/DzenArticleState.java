package com.vk.dzenarticle.impl.ui.entity;

import android.os.Parcel;
import android.os.Parcelable;
import com.vk.dzenarticle.impl.domain.DzenArticle;
import com.vk.dzenarticle.impl.domain.ReadStatState;
import defpackage.q0;
import xsna.asp;
import xsna.epx;
import xsna.lm50;
import xsna.xi0;
import xsna.zcl;
import xsna.zrp;

/* compiled from: DzenArticleState.kt */
/* loaded from: classes18.dex */
public final class DzenArticleState implements lm50, Parcelable {
    public static final Parcelable.Creator<DzenArticleState> CREATOR = new a();
    public final String b;
    public final DzenArticle c;
    public final ReadStatState d;
    public final LoadingState e;
    public final xi0 f;
    public final xi0 g;
    public final boolean h;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: DzenArticleState.kt */
    public static final class LoadingState {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ LoadingState[] $VALUES;
        public static final LoadingState ERROR_INITIAL_LOAD;
        public static final LoadingState IDLE;
        public static final LoadingState LOADING_INITIAL;
        public static final LoadingState NOT_INITIALIZED;

        static {
            LoadingState loadingState = new LoadingState("NOT_INITIALIZED", 0);
            NOT_INITIALIZED = loadingState;
            LoadingState loadingState2 = new LoadingState("IDLE", 1);
            IDLE = loadingState2;
            LoadingState loadingState3 = new LoadingState("LOADING_INITIAL", 2);
            LOADING_INITIAL = loadingState3;
            LoadingState loadingState4 = new LoadingState("ERROR_INITIAL_LOAD", 3);
            ERROR_INITIAL_LOAD = loadingState4;
            LoadingState[] loadingStateArr = {loadingState, loadingState2, loadingState3, loadingState4};
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

    /* compiled from: DzenArticleState.kt */
    public static final class a implements Parcelable.Creator<DzenArticleState> {
        @Override // android.os.Parcelable.Creator
        public final DzenArticleState createFromParcel(Parcel parcel) {
            return new DzenArticleState(parcel.readString(), parcel.readInt() == 0 ? null : DzenArticle.CREATOR.createFromParcel(parcel), ReadStatState.CREATOR.createFromParcel(parcel), LoadingState.valueOf(parcel.readString()), null, null, parcel.readInt() != 0, 48, null);
        }

        @Override // android.os.Parcelable.Creator
        public final DzenArticleState[] newArray(int i) {
            return new DzenArticleState[i];
        }
    }

    public DzenArticleState(String str, DzenArticle dzenArticle, ReadStatState readStatState, LoadingState loadingState, xi0 xi0Var, xi0 xi0Var2, boolean z) {
        this.b = str;
        this.c = dzenArticle;
        this.d = readStatState;
        this.e = loadingState;
        this.f = xi0Var;
        this.g = xi0Var2;
        this.h = z;
    }

    public static DzenArticleState a(DzenArticleState dzenArticleState, DzenArticle dzenArticle, ReadStatState readStatState, LoadingState loadingState, xi0 xi0Var, xi0 xi0Var2, boolean z, int i) {
        DzenArticle dzenArticle2 = dzenArticle;
        String str = dzenArticleState.b;
        if ((i & 2) != 0) {
            dzenArticle2 = dzenArticleState.c;
        }
        if ((i & 4) != 0) {
            readStatState = dzenArticleState.d;
        }
        if ((i & 8) != 0) {
            loadingState = dzenArticleState.e;
        }
        if ((i & 16) != 0) {
            xi0Var = dzenArticleState.f;
        }
        if ((i & 32) != 0) {
            xi0Var2 = dzenArticleState.g;
        }
        if ((i & 64) != 0) {
            z = dzenArticleState.h;
        }
        boolean z2 = z;
        dzenArticleState.getClass();
        xi0 xi0Var3 = xi0Var2;
        xi0 xi0Var4 = xi0Var;
        LoadingState loadingState2 = loadingState;
        return new DzenArticleState(str, dzenArticle2, readStatState, loadingState2, xi0Var4, xi0Var3, z2);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DzenArticleState)) {
            return false;
        }
        DzenArticleState dzenArticleState = (DzenArticleState) obj;
        return epx.f(this.b, dzenArticleState.b) && epx.f(this.c, dzenArticleState.c) && epx.f(this.d, dzenArticleState.d) && this.e == dzenArticleState.e && epx.f(this.f, dzenArticleState.f) && epx.f(this.g, dzenArticleState.g) && this.h == dzenArticleState.h;
    }

    public final int hashCode() {
        int hashCode = this.b.hashCode() * 31;
        DzenArticle dzenArticle = this.c;
        int hashCode2 = (this.e.hashCode() + ((this.d.hashCode() + ((hashCode + (dzenArticle == null ? 0 : dzenArticle.hashCode())) * 31)) * 31)) * 31;
        xi0 xi0Var = this.f;
        int hashCode3 = (hashCode2 + (xi0Var == null ? 0 : xi0Var.hashCode())) * 31;
        xi0 xi0Var2 = this.g;
        return Boolean.hashCode(this.h) + ((hashCode3 + (xi0Var2 != null ? xi0Var2.hashCode() : 0)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("DzenArticleState(articleId=");
        sb.append(this.b);
        sb.append(", article=");
        sb.append(this.c);
        sb.append(", readTimeState=");
        sb.append(this.d);
        sb.append(", loadingState=");
        sb.append(this.e);
        sb.append(", topAdState=");
        sb.append(this.f);
        sb.append(", middleAdState=");
        sb.append(this.g);
        sb.append(", displayInfoDialog=");
        return q0.a(sb, this.h, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.b);
        DzenArticle dzenArticle = this.c;
        if (dzenArticle == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            dzenArticle.writeToParcel(parcel, i);
        }
        this.d.writeToParcel(parcel, i);
        parcel.writeString(this.e.name());
        parcel.writeInt(this.h ? 1 : 0);
    }

    public /* synthetic */ DzenArticleState(String str, DzenArticle dzenArticle, ReadStatState readStatState, LoadingState loadingState, xi0 xi0Var, xi0 xi0Var2, boolean z, int i, zcl zclVar) {
        this(str, (i & 2) != 0 ? null : dzenArticle, (i & 4) != 0 ? new ReadStatState(0L, false, false, false, false, false, false, 127, null) : readStatState, (i & 8) != 0 ? LoadingState.NOT_INITIALIZED : loadingState, (i & 16) != 0 ? null : xi0Var, (i & 32) == 0 ? xi0Var2 : null, (i & 64) != 0 ? false : z);
    }
}
