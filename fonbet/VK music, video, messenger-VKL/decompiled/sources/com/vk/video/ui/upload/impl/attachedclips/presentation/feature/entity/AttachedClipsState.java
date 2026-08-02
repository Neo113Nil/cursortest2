package com.vk.video.ui.upload.impl.attachedclips.presentation.feature.entity;

import android.os.Parcel;
import android.os.Parcelable;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.vk.dto.common.VideoFile;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import xsna.bo;
import xsna.bpn0;
import xsna.dn;
import xsna.e9k0;
import xsna.en;
import xsna.epx;
import xsna.lm50;
import xsna.qoy;
import xsna.s5;
import xsna.t5;
import xsna.zcl;

/* compiled from: AttachedClipsState.kt */
/* loaded from: classes7.dex */
public final class AttachedClipsState implements lm50, Parcelable {
    public static final Parcelable.Creator<AttachedClipsState> CREATOR = new a();
    public final List<VideoFile> b;
    public final List<ClipState> c;
    public final String d;
    public final List<VideoFile> e;
    public final ClipAlreadyAttachedDialogState f;
    public final boolean g;
    public final boolean h;
    public final boolean i;
    public final boolean j;
    public final e9k0 k;
    public final bpn0 l;
    public final bpn0 m;
    public final bpn0 n;

    /* compiled from: AttachedClipsState.kt */
    public static final class a implements Parcelable.Creator<AttachedClipsState> {
        @Override // android.os.Parcelable.Creator
        public final AttachedClipsState createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            ArrayList arrayList2;
            ArrayList arrayList3;
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int readInt = parcel.readInt();
                ArrayList arrayList4 = new ArrayList(readInt);
                int i = 0;
                while (i != readInt) {
                    i = bo.b(AttachedClipsState.class, parcel, arrayList4, i, 1);
                }
                arrayList = arrayList4;
            }
            if (parcel.readInt() == 0) {
                arrayList2 = null;
            } else {
                int readInt2 = parcel.readInt();
                ArrayList arrayList5 = new ArrayList(readInt2);
                int i2 = 0;
                while (i2 != readInt2) {
                    i2 = en.a(ClipState.CREATOR, parcel, arrayList5, i2, 1);
                }
                arrayList2 = arrayList5;
            }
            String readString = parcel.readString();
            if (parcel.readInt() == 0) {
                arrayList3 = null;
            } else {
                int readInt3 = parcel.readInt();
                ArrayList arrayList6 = new ArrayList(readInt3);
                int i3 = 0;
                while (i3 != readInt3) {
                    i3 = bo.b(AttachedClipsState.class, parcel, arrayList6, i3, 1);
                }
                arrayList3 = arrayList6;
            }
            return new AttachedClipsState(arrayList, arrayList2, readString, arrayList3, parcel.readInt() != 0 ? ClipAlreadyAttachedDialogState.CREATOR.createFromParcel(parcel) : null, parcel.readInt() != 0, parcel.readInt() != 0, parcel.readInt() != 0, parcel.readInt() != 0, null, 512, null);
        }

        @Override // android.os.Parcelable.Creator
        public final AttachedClipsState[] newArray(int i) {
            return new AttachedClipsState[i];
        }
    }

    public AttachedClipsState() {
        this(null, null, null, null, null, false, false, false, false, null, IronSourceError.ERROR_RV_SHOW_CALLED_WRONG_STATE, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static AttachedClipsState a(AttachedClipsState attachedClipsState, List list, ArrayList arrayList, String str, List list2, ClipAlreadyAttachedDialogState clipAlreadyAttachedDialogState, boolean z, boolean z2, boolean z3, boolean z4, e9k0 e9k0Var, int i) {
        if ((i & 1) != 0) {
            list = attachedClipsState.b;
        }
        List list3 = list;
        List list4 = arrayList;
        if ((i & 2) != 0) {
            list4 = attachedClipsState.c;
        }
        List list5 = list4;
        if ((i & 4) != 0) {
            str = attachedClipsState.d;
        }
        String str2 = str;
        if ((i & 8) != 0) {
            list2 = attachedClipsState.e;
        }
        List list6 = list2;
        ClipAlreadyAttachedDialogState clipAlreadyAttachedDialogState2 = (i & 16) != 0 ? attachedClipsState.f : clipAlreadyAttachedDialogState;
        boolean z5 = (i & 32) != 0 ? attachedClipsState.g : z;
        boolean z6 = (i & 64) != 0 ? attachedClipsState.h : z2;
        boolean z7 = (i & 128) != 0 ? attachedClipsState.i : z3;
        boolean z8 = (i & 256) != 0 ? attachedClipsState.j : z4;
        e9k0 e9k0Var2 = (i & 512) != 0 ? attachedClipsState.k : e9k0Var;
        attachedClipsState.getClass();
        return new AttachedClipsState(list3, list5, str2, list6, clipAlreadyAttachedDialogState2, z5, z6, z7, z8, e9k0Var2);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AttachedClipsState)) {
            return false;
        }
        AttachedClipsState attachedClipsState = (AttachedClipsState) obj;
        return epx.f(this.b, attachedClipsState.b) && epx.f(this.c, attachedClipsState.c) && epx.f(this.d, attachedClipsState.d) && epx.f(this.e, attachedClipsState.e) && epx.f(this.f, attachedClipsState.f) && this.g == attachedClipsState.g && this.h == attachedClipsState.h && this.i == attachedClipsState.i && this.j == attachedClipsState.j && epx.f(this.k, attachedClipsState.k);
    }

    public final int hashCode() {
        List<VideoFile> list = this.b;
        int hashCode = (list == null ? 0 : list.hashCode()) * 31;
        List<ClipState> list2 = this.c;
        int hashCode2 = (hashCode + (list2 == null ? 0 : list2.hashCode())) * 31;
        String str = this.d;
        int hashCode3 = (hashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        List<VideoFile> list3 = this.e;
        int hashCode4 = (hashCode3 + (list3 == null ? 0 : list3.hashCode())) * 31;
        ClipAlreadyAttachedDialogState clipAlreadyAttachedDialogState = this.f;
        int b = qoy.b(qoy.b(qoy.b(qoy.b((hashCode4 + (clipAlreadyAttachedDialogState == null ? 0 : clipAlreadyAttachedDialogState.b.hashCode())) * 31, 31, this.g), 31, this.h), 31, this.i), 31, this.j);
        e9k0 e9k0Var = this.k;
        return b + (e9k0Var != null ? e9k0Var.hashCode() : 0);
    }

    public final List<VideoFile> j() {
        return (List) this.l.getValue();
    }

    public final String toString() {
        return "AttachedClipsState(sourceClips=" + this.b + ", clips=" + this.c + ", clipsPaginationStartFrom=" + this.d + ", unloadedSelectedClips=" + this.e + ", clipAlreadyAttachedDialogState=" + this.f + ", isClipHasCoauthorsDialogVisible=" + this.g + ", isExitConfirmDialogVisible=" + this.h + ", isExitConfirmDialogAfterBackPress=" + this.i + ", isSaving=" + this.j + ", snackbar=" + this.k + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        List<VideoFile> list = this.b;
        if (list == null) {
            parcel.writeInt(0);
        } else {
            Iterator f = dn.f(parcel, list, 1);
            while (f.hasNext()) {
                parcel.writeParcelable((Parcelable) f.next(), i);
            }
        }
        List<ClipState> list2 = this.c;
        if (list2 == null) {
            parcel.writeInt(0);
        } else {
            Iterator f2 = dn.f(parcel, list2, 1);
            while (f2.hasNext()) {
                ((ClipState) f2.next()).writeToParcel(parcel, i);
            }
        }
        parcel.writeString(this.d);
        List<VideoFile> list3 = this.e;
        if (list3 == null) {
            parcel.writeInt(0);
        } else {
            Iterator f3 = dn.f(parcel, list3, 1);
            while (f3.hasNext()) {
                parcel.writeParcelable((Parcelable) f3.next(), i);
            }
        }
        ClipAlreadyAttachedDialogState clipAlreadyAttachedDialogState = this.f;
        if (clipAlreadyAttachedDialogState == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            clipAlreadyAttachedDialogState.writeToParcel(parcel, i);
        }
        parcel.writeInt(this.g ? 1 : 0);
        parcel.writeInt(this.h ? 1 : 0);
        parcel.writeInt(this.i ? 1 : 0);
        parcel.writeInt(this.j ? 1 : 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public AttachedClipsState(List<? extends VideoFile> list, List<ClipState> list2, String str, List<? extends VideoFile> list3, ClipAlreadyAttachedDialogState clipAlreadyAttachedDialogState, boolean z, boolean z2, boolean z3, boolean z4, e9k0 e9k0Var) {
        this.b = list;
        this.c = list2;
        this.d = str;
        this.e = list3;
        this.f = clipAlreadyAttachedDialogState;
        this.g = z;
        this.h = z2;
        this.i = z3;
        this.j = z4;
        this.k = e9k0Var;
        this.l = new bpn0(new s5(this, 4));
        this.m = new bpn0(new t5(this, 5));
        this.n = new bpn0(new com.vk.newsfeed.posting.mediapicker.photovk.base.a(this, 5));
    }

    public /* synthetic */ AttachedClipsState(List list, List list2, String str, List list3, ClipAlreadyAttachedDialogState clipAlreadyAttachedDialogState, boolean z, boolean z2, boolean z3, boolean z4, e9k0 e9k0Var, int i, zcl zclVar) {
        this((i & 1) != 0 ? null : list, (i & 2) != 0 ? null : list2, (i & 4) != 0 ? null : str, (i & 8) != 0 ? null : list3, (i & 16) != 0 ? null : clipAlreadyAttachedDialogState, (i & 32) != 0 ? false : z, (i & 64) != 0 ? false : z2, (i & 128) != 0 ? false : z3, (i & 256) != 0 ? false : z4, (i & 512) != 0 ? null : e9k0Var);
    }
}
