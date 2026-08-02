package com.vk.video.ui.upload.impl.publish.presentation.albumchoose.feature.entity;

import android.os.Parcel;
import android.os.Parcelable;
import defpackage.q0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import xsna.ao;
import xsna.dn;
import xsna.en;
import xsna.epx;
import xsna.lm50;
import xsna.pm0;
import xsna.qoy;
import xsna.shy;

/* compiled from: AlbumChooseState.kt */
/* loaded from: classes7.dex */
public final class AlbumChooseState implements lm50, Parcelable {
    public static final Parcelable.Creator<AlbumChooseState> CREATOR = new a();
    public final List<VideoAlbumData> b;
    public final List<Integer> c;
    public final int d;
    public final boolean e;
    public final boolean f;
    public final boolean g;
    public final boolean h;

    /* compiled from: AlbumChooseState.kt */
    public static final class a implements Parcelable.Creator<AlbumChooseState> {
        @Override // android.os.Parcelable.Creator
        public final AlbumChooseState createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            int readInt = parcel.readInt();
            ArrayList arrayList2 = new ArrayList(readInt);
            int i = 0;
            while (i != readInt) {
                i = en.a(VideoAlbumData.CREATOR, parcel, arrayList2, i, 1);
            }
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int readInt2 = parcel.readInt();
                arrayList = new ArrayList(readInt2);
                int i2 = 0;
                while (i2 != readInt2) {
                    i2 = pm0.b(parcel, arrayList, i2, 1);
                }
            }
            return new AlbumChooseState(arrayList2, arrayList, parcel.readInt(), parcel.readInt() != 0, parcel.readInt() != 0, parcel.readInt() != 0, parcel.readInt() != 0);
        }

        @Override // android.os.Parcelable.Creator
        public final AlbumChooseState[] newArray(int i) {
            return new AlbumChooseState[i];
        }
    }

    public AlbumChooseState() {
        this(null, null, 0, false, false, false, false, 127, null);
    }

    public static AlbumChooseState a(AlbumChooseState albumChooseState, List list, List list2, int i, boolean z, boolean z2, boolean z3, int i2) {
        if ((i2 & 1) != 0) {
            list = albumChooseState.b;
        }
        List list3 = list;
        if ((i2 & 2) != 0) {
            list2 = albumChooseState.c;
        }
        List list4 = list2;
        if ((i2 & 4) != 0) {
            i = albumChooseState.d;
        }
        int i3 = i;
        if ((i2 & 8) != 0) {
            z = albumChooseState.e;
        }
        boolean z4 = z;
        if ((i2 & 16) != 0) {
            z2 = albumChooseState.f;
        }
        boolean z5 = z2;
        if ((i2 & 32) != 0) {
            z3 = albumChooseState.g;
        }
        boolean z6 = albumChooseState.h;
        albumChooseState.getClass();
        return new AlbumChooseState(list3, list4, i3, z4, z5, z3, z6);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AlbumChooseState)) {
            return false;
        }
        AlbumChooseState albumChooseState = (AlbumChooseState) obj;
        return epx.f(this.b, albumChooseState.b) && epx.f(this.c, albumChooseState.c) && this.d == albumChooseState.d && this.e == albumChooseState.e && this.f == albumChooseState.f && this.g == albumChooseState.g && this.h == albumChooseState.h;
    }

    public final int hashCode() {
        int hashCode = this.b.hashCode() * 31;
        List<Integer> list = this.c;
        return Boolean.hashCode(this.h) + qoy.b(qoy.b(qoy.b(shy.a(this.d, (hashCode + (list == null ? 0 : list.hashCode())) * 31, 31), 31, this.e), 31, this.f), 31, this.g);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AlbumChooseState(albumList=");
        sb.append(this.b);
        sb.append(", initialSelectedAlbumIdList=");
        sb.append(this.c);
        sb.append(", nextLoadingOffset=");
        sb.append(this.d);
        sb.append(", isDataLoading=");
        sb.append(this.e);
        sb.append(", isAllDataLoaded=");
        sb.append(this.f);
        sb.append(", shouldReloadOnResume=");
        sb.append(this.g);
        sb.append(", isRedesignEnabled=");
        return q0.a(sb, this.h, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        Iterator a2 = ao.a(parcel, this.b);
        while (a2.hasNext()) {
            ((VideoAlbumData) a2.next()).writeToParcel(parcel, i);
        }
        List<Integer> list = this.c;
        if (list == null) {
            parcel.writeInt(0);
        } else {
            Iterator f = dn.f(parcel, list, 1);
            while (f.hasNext()) {
                parcel.writeInt(((Number) f.next()).intValue());
            }
        }
        parcel.writeInt(this.d);
        parcel.writeInt(this.e ? 1 : 0);
        parcel.writeInt(this.f ? 1 : 0);
        parcel.writeInt(this.g ? 1 : 0);
        parcel.writeInt(this.h ? 1 : 0);
    }

    public AlbumChooseState(List<VideoAlbumData> list, List<Integer> list2, int i, boolean z, boolean z2, boolean z3, boolean z4) {
        this.b = list;
        this.c = list2;
        this.d = i;
        this.e = z;
        this.f = z2;
        this.g = z3;
        this.h = z4;
    }

    /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
        java.lang.NullPointerException
        */
    public AlbumChooseState(java.util.List r2, java.util.List r3, int r4, boolean r5, boolean r6, boolean r7, boolean r8, int r9, xsna.zcl r10) {
        /*
            r1 = this;
            r10 = r9 & 1
            if (r10 == 0) goto L6
            kotlin.collections.EmptyList r2 = kotlin.collections.EmptyList.b
        L6:
            r10 = r9 & 2
            if (r10 == 0) goto Lb
            r3 = 0
        Lb:
            r10 = r9 & 4
            r0 = 0
            if (r10 == 0) goto L11
            r4 = r0
        L11:
            r10 = r9 & 8
            if (r10 == 0) goto L16
            r5 = r0
        L16:
            r10 = r9 & 16
            if (r10 == 0) goto L1b
            r6 = r0
        L1b:
            r10 = r9 & 32
            if (r10 == 0) goto L20
            r7 = r0
        L20:
            r9 = r9 & 64
            if (r9 == 0) goto L2d
            r10 = r0
            r8 = r6
            r9 = r7
            r6 = r4
            r7 = r5
            r4 = r2
            r5 = r3
            r3 = r1
            goto L35
        L2d:
            r10 = r8
            r9 = r7
            r7 = r5
            r8 = r6
            r5 = r3
            r6 = r4
            r3 = r1
            r4 = r2
        L35:
            r3.<init>(r4, r5, r6, r7, r8, r9, r10)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.vk.video.ui.upload.impl.publish.presentation.albumchoose.feature.entity.AlbumChooseState.<init>(java.util.List, java.util.List, int, boolean, boolean, boolean, boolean, int, xsna.zcl):void");
    }
}
