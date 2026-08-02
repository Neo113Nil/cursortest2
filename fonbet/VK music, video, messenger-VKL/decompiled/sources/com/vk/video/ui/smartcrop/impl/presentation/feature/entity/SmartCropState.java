package com.vk.video.ui.smartcrop.impl.presentation.feature.entity;

import android.os.Parcel;
import android.os.Parcelable;
import com.ironsource.mediationsdk.logger.IronSourceError;
import io.reactivex.rxjava3.subjects.b;
import one.video.player.OneVideoPlayer;
import xsna.bh10;
import xsna.bpn0;
import xsna.epx;
import xsna.iq;
import xsna.lm50;
import xsna.m5k0;
import xsna.n4k0;
import xsna.n5k0;
import xsna.nm0;
import xsna.q500;
import xsna.qoy;
import xsna.sht0;
import xsna.vtk0;
import xsna.xh50;
import xsna.zcl;

/* compiled from: SmartCropState.kt */
/* loaded from: classes7.dex */
public final class SmartCropState implements lm50, Parcelable {
    public static final Parcelable.Creator<SmartCropState> CREATOR = new a();
    public final sht0 b;
    public final OneVideoPlayer c;
    public final OneVideoPlayer.d d;
    public final xh50<Long> e;
    public final q500 f;
    public final long g;
    public final boolean h;
    public final CropVideoProgress i;
    public final boolean j;
    public final boolean k;
    public final m5k0 l;
    public final bpn0 m;

    /* compiled from: SmartCropState.kt */
    public static final class a implements Parcelable.Creator<SmartCropState> {
        @Override // android.os.Parcelable.Creator
        public final SmartCropState createFromParcel(Parcel parcel) {
            Parcel parcel2;
            CropVideoProgress createFromParcel;
            q500 q500Var = new q500(parcel.readLong(), parcel.readLong());
            long readLong = parcel.readLong();
            boolean z = parcel.readInt() != 0;
            if (parcel.readInt() == 0) {
                createFromParcel = null;
                parcel2 = parcel;
            } else {
                parcel2 = parcel;
                createFromParcel = CropVideoProgress.CREATOR.createFromParcel(parcel2);
            }
            return new SmartCropState(null, null, null, null, q500Var, readLong, z, createFromParcel, parcel2.readInt() != 0, parcel2.readInt() != 0, null, IronSourceError.ERROR_IS_SHOW_EXCEPTION, null);
        }

        @Override // android.os.Parcelable.Creator
        public final SmartCropState[] newArray(int i) {
            return new SmartCropState[i];
        }
    }

    public SmartCropState() {
        this(null, null, null, null, null, 0L, false, null, false, false, null, 2047, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r14v18, types: [one.video.player.OneVideoPlayer$d] */
    public static SmartCropState a(SmartCropState smartCropState, sht0 sht0Var, OneVideoPlayer oneVideoPlayer, n4k0 n4k0Var, q500 q500Var, long j, boolean z, CropVideoProgress cropVideoProgress, boolean z2, boolean z3, m5k0 m5k0Var, int i) {
        if ((i & 1) != 0) {
            sht0Var = smartCropState.b;
        }
        sht0 sht0Var2 = sht0Var;
        if ((i & 2) != 0) {
            oneVideoPlayer = smartCropState.c;
        }
        OneVideoPlayer oneVideoPlayer2 = oneVideoPlayer;
        n4k0 n4k0Var2 = (i & 4) != 0 ? smartCropState.d : n4k0Var;
        xh50<Long> xh50Var = smartCropState.e;
        q500 q500Var2 = (i & 16) != 0 ? smartCropState.f : q500Var;
        long j2 = (i & 32) != 0 ? smartCropState.g : j;
        boolean z4 = (i & 64) != 0 ? smartCropState.h : z;
        CropVideoProgress cropVideoProgress2 = (i & 128) != 0 ? smartCropState.i : cropVideoProgress;
        boolean z5 = (i & 256) != 0 ? smartCropState.j : z2;
        boolean z6 = (i & 512) != 0 ? smartCropState.k : z3;
        m5k0 m5k0Var2 = (i & 1024) != 0 ? smartCropState.l : m5k0Var;
        smartCropState.getClass();
        return new SmartCropState(sht0Var2, oneVideoPlayer2, n4k0Var2, xh50Var, q500Var2, j2, z4, cropVideoProgress2, z5, z6, m5k0Var2);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SmartCropState)) {
            return false;
        }
        SmartCropState smartCropState = (SmartCropState) obj;
        return epx.f(this.b, smartCropState.b) && epx.f(this.c, smartCropState.c) && epx.f(this.d, smartCropState.d) && epx.f(this.e, smartCropState.e) && epx.f(this.f, smartCropState.f) && this.g == smartCropState.g && this.h == smartCropState.h && epx.f(this.i, smartCropState.i) && this.j == smartCropState.j && this.k == smartCropState.k && epx.f(this.l, smartCropState.l);
    }

    public final int hashCode() {
        sht0 sht0Var = this.b;
        int hashCode = (sht0Var == null ? 0 : sht0Var.hashCode()) * 31;
        OneVideoPlayer oneVideoPlayer = this.c;
        int hashCode2 = (hashCode + (oneVideoPlayer == null ? 0 : oneVideoPlayer.hashCode())) * 31;
        OneVideoPlayer.d dVar = this.d;
        int b = qoy.b(bh10.a((this.f.hashCode() + ((this.e.hashCode() + ((hashCode2 + (dVar == null ? 0 : dVar.hashCode())) * 31)) * 31)) * 31, 31, this.g), 31, this.h);
        CropVideoProgress cropVideoProgress = this.i;
        int b2 = qoy.b(qoy.b((b + (cropVideoProgress == null ? 0 : cropVideoProgress.hashCode())) * 31, 31, this.j), 31, this.k);
        m5k0 m5k0Var = this.l;
        return b2 + (m5k0Var != null ? m5k0Var.hashCode() : 0);
    }

    public final String toString() {
        return "SmartCropState(videoSource=" + this.b + ", player=" + this.c + ", playerPositionChangeListener=" + this.d + ", playPositionMs=" + this.e + ", cropRangeMs=" + this.f + ", thumbsOffsetMs=" + this.g + ", isSmartCrop=" + this.h + ", progress=" + this.i + ", isAbortConfirmDialogVisible=" + this.j + ", isExitConfirmDialogVisible=" + this.k + ", snackbar=" + this.l + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        q500 q500Var = this.f;
        parcel.writeLong(q500Var.b);
        parcel.writeLong(q500Var.c);
        parcel.writeLong(this.g);
        parcel.writeInt(this.h ? 1 : 0);
        CropVideoProgress cropVideoProgress = this.i;
        if (cropVideoProgress == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            cropVideoProgress.writeToParcel(parcel, i);
        }
        parcel.writeInt(this.j ? 1 : 0);
        parcel.writeInt(this.k ? 1 : 0);
    }

    public SmartCropState(sht0 sht0Var, OneVideoPlayer oneVideoPlayer, OneVideoPlayer.d dVar, xh50<Long> xh50Var, q500 q500Var, long j, boolean z, CropVideoProgress cropVideoProgress, boolean z2, boolean z3, m5k0 m5k0Var) {
        this.b = sht0Var;
        this.c = oneVideoPlayer;
        this.d = dVar;
        this.e = xh50Var;
        this.f = q500Var;
        this.g = j;
        this.h = z;
        this.i = cropVideoProgress;
        this.j = z2;
        this.k = z3;
        this.l = m5k0Var;
        this.m = new bpn0(new nm0(29));
    }

    /* compiled from: SmartCropState.kt */
    public static final class CropVideoProgress implements Parcelable {
        public static final Parcelable.Creator<CropVideoProgress> CREATOR = new a();
        public final Long b;
        public final boolean c;
        public final long d;
        public final Long e;

        /* compiled from: SmartCropState.kt */
        public static final class a implements Parcelable.Creator<CropVideoProgress> {
            @Override // android.os.Parcelable.Creator
            public final CropVideoProgress createFromParcel(Parcel parcel) {
                return new CropVideoProgress(parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong()), parcel.readInt() != 0, parcel.readLong(), parcel.readInt() != 0 ? Long.valueOf(parcel.readLong()) : null);
            }

            @Override // android.os.Parcelable.Creator
            public final CropVideoProgress[] newArray(int i) {
                return new CropVideoProgress[i];
            }
        }

        public CropVideoProgress(Long l, boolean z, long j, Long l2) {
            this.b = l;
            this.c = z;
            this.d = j;
            this.e = l2;
        }

        public static CropVideoProgress a(CropVideoProgress cropVideoProgress, Long l, Long l2, int i) {
            if ((i & 1) != 0) {
                l = cropVideoProgress.b;
            }
            Long l3 = l;
            boolean z = cropVideoProgress.c;
            long j = cropVideoProgress.d;
            if ((i & 8) != 0) {
                l2 = cropVideoProgress.e;
            }
            cropVideoProgress.getClass();
            return new CropVideoProgress(l3, z, j, l2);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof CropVideoProgress)) {
                return false;
            }
            CropVideoProgress cropVideoProgress = (CropVideoProgress) obj;
            return epx.f(this.b, cropVideoProgress.b) && this.c == cropVideoProgress.c && this.d == cropVideoProgress.d && epx.f(this.e, cropVideoProgress.e);
        }

        public final int hashCode() {
            Long l = this.b;
            int a2 = bh10.a(qoy.b((l == null ? 0 : l.hashCode()) * 31, 31, this.c), 31, this.d);
            Long l2 = this.e;
            return a2 + (l2 != null ? l2.hashCode() : 0);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("CropVideoProgress(ovId=");
            sb.append(this.b);
            sb.append(", isSmartCrop=");
            sb.append(this.c);
            sb.append(", startTimeMs=");
            sb.append(this.d);
            sb.append(", estimatedEndTimeMs=");
            return iq.b(sb, this.e, ')');
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            Long l = this.b;
            if (l == null) {
                parcel.writeInt(0);
            } else {
                b.f(parcel, 1, l);
            }
            parcel.writeInt(this.c ? 1 : 0);
            parcel.writeLong(this.d);
            Long l2 = this.e;
            if (l2 == null) {
                parcel.writeInt(0);
            } else {
                b.f(parcel, 1, l2);
            }
        }

        public /* synthetic */ CropVideoProgress(Long l, boolean z, long j, Long l2, int i, zcl zclVar) {
            this((i & 1) != 0 ? null : l, z, j, (i & 8) != 0 ? null : l2);
        }
    }

    public /* synthetic */ SmartCropState(sht0 sht0Var, OneVideoPlayer oneVideoPlayer, OneVideoPlayer.d dVar, xh50 xh50Var, q500 q500Var, long j, boolean z, CropVideoProgress cropVideoProgress, boolean z2, boolean z3, m5k0 m5k0Var, int i, zcl zclVar) {
        this((i & 1) != 0 ? null : sht0Var, (i & 2) != 0 ? null : oneVideoPlayer, (i & 4) != 0 ? null : dVar, (i & 8) != 0 ? vtk0.a(0L) : xh50Var, (i & 16) != 0 ? n5k0.a : q500Var, (i & 32) == 0 ? j : 0L, (i & 64) != 0 ? false : z, (i & 128) != 0 ? null : cropVideoProgress, (i & 256) != 0 ? false : z2, (i & 512) == 0 ? z3 : false, (i & 1024) != 0 ? null : m5k0Var);
    }
}
