package com.facebook.ads.androidx.media3.extractor.metadata.scte35;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.exoplayer2.C;
import com.instagram.common.viewpoint.core.AnonymousClass53;
import com.instagram.common.viewpoint.core.C05024v;
import com.instagram.common.viewpoint.core.C0827Ic;

/* loaded from: assets/audience_network/classes2.dex */
public final class TimeSignalCommand extends SpliceCommand {
    public static String[] A02 = {"fBCCr7VwDgvhDxdGkzRiY2TvWvmZmARS", "lBD0fDkRFVdGPYWDbMcaGx4cyXv4WEJh", "6y4HJXgmtxqVkaNMzYZBmSXA6CGxm4DJ", "vpsLDrGqE5zherZQZMMLL6G3cLRsG8Dm", "qp0fDGr3Nzl8ahCuvet6k2311zos", "c5cBfT4Hj52dvZvyRqGaKhWxL68ft04u", "OtVyWYxYdMxR9geYu5t1Sc80NPuk", "8DkmlbSWSEaEI0nee1I51BPAFd"};
    public static final Parcelable.Creator<TimeSignalCommand> CREATOR = new C0827Ic();
    public final long A00;
    public final long A01;

    public TimeSignalCommand(long j, long j2) {
        this.A01 = j;
        this.A00 = j2;
    }

    public /* synthetic */ TimeSignalCommand(long j, long j2, C0827Ic c0827Ic) {
        this(j, j2);
    }

    public static long A00(C05024v c05024v, long j) {
        long A0I = c05024v.A0I();
        if ((128 & A0I) == 0) {
            return C.TIME_UNSET;
        }
        long firstByte = c05024v.A0Q();
        long j2 = (((1 & A0I) << 32) | firstByte) + j;
        if (A02[7].length() == 21) {
            throw new RuntimeException();
        }
        String[] strArr = A02;
        strArr[5] = "5vtaLYhnTEc2lUg08l0YEv2QqnnKhzp8";
        strArr[0] = "gGhCeZV4kOFdoFbuN1d60dh6MMvStMtQ";
        return j2 & 8589934591L;
    }

    public static TimeSignalCommand A01(C05024v c05024v, long j, AnonymousClass53 anonymousClass53) {
        long A00 = A00(c05024v, j);
        return new TimeSignalCommand(A00, anonymousClass53.A06(A00));
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeLong(this.A01);
        parcel.writeLong(this.A00);
    }
}
