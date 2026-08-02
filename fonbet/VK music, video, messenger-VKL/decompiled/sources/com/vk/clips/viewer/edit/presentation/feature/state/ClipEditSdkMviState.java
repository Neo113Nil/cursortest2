package com.vk.clips.viewer.edit.presentation.feature.state;

import android.os.Parcel;
import android.os.Parcelable;
import com.vk.clips.models.SdkClipOrdData;
import com.vk.clips.viewer.edit.presentation.feature.state.coauthors.ClipsEditCoauthorsState;
import com.vk.clips.viewer.edit.presentation.feature.state.ord.ClipsEditOrdState;
import com.vk.clips.viewer.edit.presentation.feature.state.trends.ClipsTrendingHashtagsState;
import com.vk.clips.viewer.edit.presentation.feature.state.videoattach.ClipEditVideoAttachState;
import defpackage.q0;
import xsna.d9k0;
import xsna.epx;
import xsna.lm50;
import xsna.qoy;
import xsna.r8d;
import xsna.urd0;
import xsna.zcl;

/* compiled from: ClipEditSdkMviState.kt */
/* loaded from: classes17.dex */
public final class ClipEditSdkMviState implements lm50, Parcelable {
    public static final Parcelable.Creator<ClipEditSdkMviState> CREATOR = new a();
    public final String b;
    public final String c;
    public final SdkClipOrdData d;
    public final ClipEditVideoAttachState e;
    public final ClipsEditCoauthorsState f;
    public final ClipsEditOrdState g;
    public final ClipsTrendingHashtagsState h;
    public final ImmutableClipState i;
    public final boolean j;
    public final d9k0 k;
    public final boolean l;
    public final boolean m;
    public final r8d n;
    public final boolean o;

    /* compiled from: ClipEditSdkMviState.kt */
    public static final class a implements Parcelable.Creator<ClipEditSdkMviState> {
        @Override // android.os.Parcelable.Creator
        public final ClipEditSdkMviState createFromParcel(Parcel parcel) {
            boolean z;
            boolean z2;
            String readString = parcel.readString();
            String readString2 = parcel.readString();
            SdkClipOrdData sdkClipOrdData = (SdkClipOrdData) parcel.readParcelable(ClipEditSdkMviState.class.getClassLoader());
            ClipEditVideoAttachState clipEditVideoAttachState = (ClipEditVideoAttachState) parcel.readParcelable(ClipEditSdkMviState.class.getClassLoader());
            ClipsEditCoauthorsState clipsEditCoauthorsState = (ClipsEditCoauthorsState) parcel.readParcelable(ClipEditSdkMviState.class.getClassLoader());
            ClipsEditOrdState clipsEditOrdState = (ClipsEditOrdState) parcel.readParcelable(ClipEditSdkMviState.class.getClassLoader());
            ClipsTrendingHashtagsState clipsTrendingHashtagsState = (ClipsTrendingHashtagsState) parcel.readParcelable(ClipEditSdkMviState.class.getClassLoader());
            ImmutableClipState createFromParcel = ImmutableClipState.CREATOR.createFromParcel(parcel);
            boolean z3 = false;
            boolean z4 = true;
            boolean z5 = parcel.readInt() != 0;
            if (parcel.readInt() != 0) {
                z = false;
                z3 = true;
            } else {
                z = false;
            }
            if (parcel.readInt() != 0) {
                z2 = true;
            } else {
                z2 = true;
                z4 = z;
            }
            return new ClipEditSdkMviState(readString, readString2, sdkClipOrdData, clipEditVideoAttachState, clipsEditCoauthorsState, clipsEditOrdState, clipsTrendingHashtagsState, createFromParcel, z5, null, z3, z4, null, parcel.readInt() != 0 ? z2 : z, 4608, null);
        }

        @Override // android.os.Parcelable.Creator
        public final ClipEditSdkMviState[] newArray(int i) {
            return new ClipEditSdkMviState[i];
        }
    }

    public ClipEditSdkMviState(String str, String str2, SdkClipOrdData sdkClipOrdData, ClipEditVideoAttachState clipEditVideoAttachState, ClipsEditCoauthorsState clipsEditCoauthorsState, ClipsEditOrdState clipsEditOrdState, ClipsTrendingHashtagsState clipsTrendingHashtagsState, ImmutableClipState immutableClipState, boolean z, d9k0 d9k0Var, boolean z2, boolean z3, r8d r8dVar, boolean z4) {
        this.b = str;
        this.c = str2;
        this.d = sdkClipOrdData;
        this.e = clipEditVideoAttachState;
        this.f = clipsEditCoauthorsState;
        this.g = clipsEditOrdState;
        this.h = clipsTrendingHashtagsState;
        this.i = immutableClipState;
        this.j = z;
        this.k = d9k0Var;
        this.l = z2;
        this.m = z3;
        this.n = r8dVar;
        this.o = z4;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v12, types: [xsna.d9k0] */
    public static ClipEditSdkMviState a(ClipEditSdkMviState clipEditSdkMviState, String str, String str2, SdkClipOrdData sdkClipOrdData, ClipEditVideoAttachState clipEditVideoAttachState, ClipsEditCoauthorsState clipsEditCoauthorsState, ClipsTrendingHashtagsState clipsTrendingHashtagsState, boolean z, d9k0.a aVar, boolean z2, boolean z3, r8d r8dVar, int i) {
        String str3 = (i & 1) != 0 ? clipEditSdkMviState.b : str;
        String str4 = (i & 2) != 0 ? clipEditSdkMviState.c : str2;
        SdkClipOrdData sdkClipOrdData2 = (i & 4) != 0 ? clipEditSdkMviState.d : sdkClipOrdData;
        ClipEditVideoAttachState clipEditVideoAttachState2 = (i & 8) != 0 ? clipEditSdkMviState.e : clipEditVideoAttachState;
        ClipsEditCoauthorsState clipsEditCoauthorsState2 = (i & 16) != 0 ? clipEditSdkMviState.f : clipsEditCoauthorsState;
        ClipsEditOrdState clipsEditOrdState = clipEditSdkMviState.g;
        ClipsTrendingHashtagsState clipsTrendingHashtagsState2 = (i & 64) != 0 ? clipEditSdkMviState.h : clipsTrendingHashtagsState;
        ImmutableClipState immutableClipState = clipEditSdkMviState.i;
        boolean z4 = (i & 256) != 0 ? clipEditSdkMviState.j : z;
        d9k0.a aVar2 = (i & 512) != 0 ? clipEditSdkMviState.k : aVar;
        boolean z5 = (i & 1024) != 0 ? clipEditSdkMviState.l : z2;
        boolean z6 = (i & 2048) != 0 ? clipEditSdkMviState.m : z3;
        r8d r8dVar2 = (i & 4096) != 0 ? clipEditSdkMviState.n : r8dVar;
        boolean z7 = clipEditSdkMviState.o;
        clipEditSdkMviState.getClass();
        return new ClipEditSdkMviState(str3, str4, sdkClipOrdData2, clipEditVideoAttachState2, clipsEditCoauthorsState2, clipsEditOrdState, clipsTrendingHashtagsState2, immutableClipState, z4, aVar2, z5, z6, r8dVar2, z7);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ClipEditSdkMviState)) {
            return false;
        }
        ClipEditSdkMviState clipEditSdkMviState = (ClipEditSdkMviState) obj;
        return epx.f(this.b, clipEditSdkMviState.b) && epx.f(this.c, clipEditSdkMviState.c) && epx.f(this.d, clipEditSdkMviState.d) && epx.f(this.e, clipEditSdkMviState.e) && epx.f(this.f, clipEditSdkMviState.f) && epx.f(this.g, clipEditSdkMviState.g) && epx.f(this.h, clipEditSdkMviState.h) && epx.f(this.i, clipEditSdkMviState.i) && this.j == clipEditSdkMviState.j && epx.f(this.k, clipEditSdkMviState.k) && this.l == clipEditSdkMviState.l && this.m == clipEditSdkMviState.m && epx.f(this.n, clipEditSdkMviState.n) && this.o == clipEditSdkMviState.o;
    }

    public final int hashCode() {
        int a2 = urd0.a(this.b.hashCode() * 31, 31, this.c);
        SdkClipOrdData sdkClipOrdData = this.d;
        int b = qoy.b((this.i.hashCode() + ((this.h.hashCode() + ((this.g.hashCode() + ((this.f.hashCode() + ((this.e.hashCode() + ((a2 + (sdkClipOrdData == null ? 0 : sdkClipOrdData.hashCode())) * 31)) * 31)) * 31)) * 31)) * 31)) * 31, 31, this.j);
        d9k0 d9k0Var = this.k;
        int b2 = qoy.b(qoy.b((b + (d9k0Var == null ? 0 : d9k0Var.hashCode())) * 31, 31, this.l), 31, this.m);
        r8d r8dVar = this.n;
        return Boolean.hashCode(this.o) + ((b2 + (r8dVar != null ? r8dVar.hashCode() : 0)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ClipEditSdkMviState(clipDescription=");
        sb.append(this.b);
        sb.append(", updatedCoverPathUri=");
        sb.append(this.c);
        sb.append(", ordData=");
        sb.append(this.d);
        sb.append(", attachedVideoState=");
        sb.append(this.e);
        sb.append(", coauthors=");
        sb.append(this.f);
        sb.append(", ordState=");
        sb.append(this.g);
        sb.append(", trendingHashtagsState=");
        sb.append(this.h);
        sb.append(", initialClipState=");
        sb.append(this.i);
        sb.append(", isLoading=");
        sb.append(this.j);
        sb.append(", snackbarViewState=");
        sb.append(this.k);
        sb.append(", isPrivateProfileOwner=");
        sb.append(this.l);
        sb.append(", isPrivateClip=");
        sb.append(this.m);
        sb.append(", overlayDialogState=");
        sb.append(this.n);
        sb.append(", isClipAttachVideoNewNamingEnabled=");
        return q0.a(sb, this.o, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.b);
        parcel.writeString(this.c);
        parcel.writeParcelable(this.d, i);
        parcel.writeParcelable(this.e, i);
        parcel.writeParcelable(this.f, i);
        parcel.writeParcelable(this.g, i);
        parcel.writeParcelable(this.h, i);
        this.i.writeToParcel(parcel, i);
        parcel.writeInt(this.j ? 1 : 0);
        parcel.writeInt(this.l ? 1 : 0);
        parcel.writeInt(this.m ? 1 : 0);
        parcel.writeInt(this.o ? 1 : 0);
    }

    public /* synthetic */ ClipEditSdkMviState(String str, String str2, SdkClipOrdData sdkClipOrdData, ClipEditVideoAttachState clipEditVideoAttachState, ClipsEditCoauthorsState clipsEditCoauthorsState, ClipsEditOrdState clipsEditOrdState, ClipsTrendingHashtagsState clipsTrendingHashtagsState, ImmutableClipState immutableClipState, boolean z, d9k0 d9k0Var, boolean z2, boolean z3, r8d r8dVar, boolean z4, int i, zcl zclVar) {
        this(str, str2, sdkClipOrdData, clipEditVideoAttachState, clipsEditCoauthorsState, clipsEditOrdState, clipsTrendingHashtagsState, immutableClipState, z, (i & 512) != 0 ? null : d9k0Var, z2, z3, (i & 4096) != 0 ? null : r8dVar, z4);
    }
}
