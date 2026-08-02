package com.vk.dto.clips.model;

import android.os.Parcel;
import android.os.Parcelable;
import defpackage.q0;
import xsna.epx;
import xsna.qoy;

/* compiled from: ClipsEditorSessionParams.kt */
/* loaded from: classes18.dex */
public final class ClipsEditorSessionParams implements Parcelable {
    public static final Parcelable.Creator<ClipsEditorSessionParams> CREATOR = new a();
    public final String b;
    public final boolean c;
    public final boolean d;
    public final boolean e;
    public final ClipsEditorNextButtonState f;
    public final boolean g;

    /* compiled from: ClipsEditorSessionParams.kt */
    public static final class a implements Parcelable.Creator<ClipsEditorSessionParams> {
        @Override // android.os.Parcelable.Creator
        public final ClipsEditorSessionParams createFromParcel(Parcel parcel) {
            boolean z;
            boolean z2;
            String readString = parcel.readString();
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
            ClipsEditorNextButtonState valueOf = ClipsEditorNextButtonState.valueOf(parcel.readString());
            if (parcel.readInt() == 0) {
                z2 = z;
            }
            return new ClipsEditorSessionParams(readString, z5, z3, z4, valueOf, z2);
        }

        @Override // android.os.Parcelable.Creator
        public final ClipsEditorSessionParams[] newArray(int i) {
            return new ClipsEditorSessionParams[i];
        }
    }

    public ClipsEditorSessionParams() {
        this(null, false, false, false, null, false, 63, null);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ClipsEditorSessionParams)) {
            return false;
        }
        ClipsEditorSessionParams clipsEditorSessionParams = (ClipsEditorSessionParams) obj;
        return epx.f(this.b, clipsEditorSessionParams.b) && this.c == clipsEditorSessionParams.c && this.d == clipsEditorSessionParams.d && this.e == clipsEditorSessionParams.e && this.f == clipsEditorSessionParams.f && this.g == clipsEditorSessionParams.g;
    }

    public final int hashCode() {
        String str = this.b;
        return Boolean.hashCode(this.g) + ((this.f.hashCode() + qoy.b(qoy.b(qoy.b((str == null ? 0 : str.hashCode()) * 31, 31, this.c), 31, this.d), 31, this.e)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ClipsEditorSessionParams(clipsEditorResultPath=");
        sb.append(this.b);
        sb.append(", disableDraftSavingDialog=");
        sb.append(this.c);
        sb.append(", disableDraftAutoSync=");
        sb.append(this.d);
        sb.append(", deleteDraftOnExit=");
        sb.append(this.e);
        sb.append(", nextButtonState=");
        sb.append(this.f);
        sb.append(", removeCloseButton=");
        return q0.a(sb, this.g, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.b);
        parcel.writeInt(this.c ? 1 : 0);
        parcel.writeInt(this.d ? 1 : 0);
        parcel.writeInt(this.e ? 1 : 0);
        parcel.writeString(this.f.name());
        parcel.writeInt(this.g ? 1 : 0);
    }

    public ClipsEditorSessionParams(String str, boolean z, boolean z2, boolean z3, ClipsEditorNextButtonState clipsEditorNextButtonState, boolean z4) {
        this.b = str;
        this.c = z;
        this.d = z2;
        this.e = z3;
        this.f = clipsEditorNextButtonState;
        this.g = z4;
    }

    /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
        java.lang.NullPointerException
        */
    public /* synthetic */ ClipsEditorSessionParams(java.lang.String r2, boolean r3, boolean r4, boolean r5, com.vk.dto.clips.model.ClipsEditorNextButtonState r6, boolean r7, int r8, xsna.zcl r9) {
        /*
            r1 = this;
            r9 = r8 & 1
            if (r9 == 0) goto L5
            r2 = 0
        L5:
            r9 = r8 & 2
            r0 = 0
            if (r9 == 0) goto Lb
            r3 = r0
        Lb:
            r9 = r8 & 4
            if (r9 == 0) goto L10
            r4 = r0
        L10:
            r9 = r8 & 8
            if (r9 == 0) goto L15
            r5 = r0
        L15:
            r9 = r8 & 16
            if (r9 == 0) goto L1b
            com.vk.dto.clips.model.ClipsEditorNextButtonState r6 = com.vk.dto.clips.model.ClipsEditorNextButtonState.Next
        L1b:
            r8 = r8 & 32
            if (r8 == 0) goto L27
            r9 = r0
            r7 = r5
            r8 = r6
            r5 = r3
            r6 = r4
            r3 = r1
            r4 = r2
            goto L2e
        L27:
            r9 = r7
            r8 = r6
            r6 = r4
            r7 = r5
            r4 = r2
            r5 = r3
            r3 = r1
        L2e:
            r3.<init>(r4, r5, r6, r7, r8, r9)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.vk.dto.clips.model.ClipsEditorSessionParams.<init>(java.lang.String, boolean, boolean, boolean, com.vk.dto.clips.model.ClipsEditorNextButtonState, boolean, int, xsna.zcl):void");
    }
}
