package com.vk.video.ui.upload.impl.coverchoose.presentation.feature.entity;

import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.os.Parcel;
import android.os.Parcelable;
import defpackage.q0;
import ru.ok.android.webrtc.signaling.api.SignalingProtocol;
import xsna.asp;
import xsna.epx;
import xsna.lm50;
import xsna.zcl;
import xsna.zrp;

/* compiled from: CoverChooseState.kt */
/* loaded from: classes7.dex */
public final class CoverChooseState implements lm50, Parcelable {
    public static final Parcelable.Creator<CoverChooseState> CREATOR = new a();
    public final CoverDestination b;
    public final Bitmap c;
    public final Rect d;
    public final Matrix e;
    public final boolean f;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: CoverChooseState.kt */
    public static final class CoverDestination {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ CoverDestination[] $VALUES;
        public static final CoverDestination ALBUM;
        public static final a Companion;
        public static final CoverDestination VIDEO;

        /* compiled from: CoverChooseState.kt */
        public static final class a {
        }

        static {
            CoverDestination coverDestination = new CoverDestination(SignalingProtocol.MEDIA_OPTION_VIDEO, 0);
            VIDEO = coverDestination;
            CoverDestination coverDestination2 = new CoverDestination("ALBUM", 1);
            ALBUM = coverDestination2;
            CoverDestination[] coverDestinationArr = {coverDestination, coverDestination2};
            $VALUES = coverDestinationArr;
            $ENTRIES = new asp(coverDestinationArr);
            Companion = new a();
        }

        public CoverDestination() {
            throw null;
        }

        public static CoverDestination valueOf(String str) {
            return (CoverDestination) Enum.valueOf(CoverDestination.class, str);
        }

        public static CoverDestination[] values() {
            return (CoverDestination[]) $VALUES.clone();
        }
    }

    /* compiled from: CoverChooseState.kt */
    public static final class a implements Parcelable.Creator<CoverChooseState> {
        @Override // android.os.Parcelable.Creator
        public final CoverChooseState createFromParcel(Parcel parcel) {
            return new CoverChooseState(CoverDestination.valueOf(parcel.readString()), null, (Rect) parcel.readParcelable(CoverChooseState.class.getClassLoader()), null, parcel.readInt() != 0, 10, null);
        }

        @Override // android.os.Parcelable.Creator
        public final CoverChooseState[] newArray(int i) {
            return new CoverChooseState[i];
        }
    }

    public CoverChooseState(CoverDestination coverDestination, Bitmap bitmap, Rect rect, Matrix matrix, boolean z) {
        this.b = coverDestination;
        this.c = bitmap;
        this.d = rect;
        this.e = matrix;
        this.f = z;
    }

    public static CoverChooseState a(CoverChooseState coverChooseState, Bitmap bitmap, Rect rect, Matrix matrix, boolean z, int i) {
        Bitmap bitmap2 = bitmap;
        CoverDestination coverDestination = coverChooseState.b;
        if ((i & 2) != 0) {
            bitmap2 = coverChooseState.c;
        }
        if ((i & 4) != 0) {
            rect = coverChooseState.d;
        }
        if ((i & 8) != 0) {
            matrix = coverChooseState.e;
        }
        if ((i & 16) != 0) {
            z = coverChooseState.f;
        }
        boolean z2 = z;
        coverChooseState.getClass();
        Matrix matrix2 = matrix;
        return new CoverChooseState(coverDestination, bitmap2, rect, matrix2, z2);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CoverChooseState)) {
            return false;
        }
        CoverChooseState coverChooseState = (CoverChooseState) obj;
        return this.b == coverChooseState.b && epx.f(this.c, coverChooseState.c) && epx.f(this.d, coverChooseState.d) && epx.f(this.e, coverChooseState.e) && this.f == coverChooseState.f;
    }

    public final int hashCode() {
        int hashCode = this.b.hashCode() * 31;
        Bitmap bitmap = this.c;
        int hashCode2 = (hashCode + (bitmap == null ? 0 : bitmap.hashCode())) * 31;
        Rect rect = this.d;
        int hashCode3 = (hashCode2 + (rect == null ? 0 : rect.hashCode())) * 31;
        Matrix matrix = this.e;
        return Boolean.hashCode(this.f) + ((hashCode3 + (matrix != null ? matrix.hashCode() : 0)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("CoverChooseState(coverDestination=");
        sb.append(this.b);
        sb.append(", image=");
        sb.append(this.c);
        sb.append(", coverRect=");
        sb.append(this.d);
        sb.append(", coverMatrix=");
        sb.append(this.e);
        sb.append(", isSaving=");
        return q0.a(sb, this.f, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.b.name());
        parcel.writeParcelable(this.d, i);
        parcel.writeInt(this.f ? 1 : 0);
    }

    public /* synthetic */ CoverChooseState(CoverDestination coverDestination, Bitmap bitmap, Rect rect, Matrix matrix, boolean z, int i, zcl zclVar) {
        this(coverDestination, (i & 2) != 0 ? null : bitmap, (i & 4) != 0 ? null : rect, (i & 8) != 0 ? null : matrix, (i & 16) != 0 ? false : z);
    }
}
