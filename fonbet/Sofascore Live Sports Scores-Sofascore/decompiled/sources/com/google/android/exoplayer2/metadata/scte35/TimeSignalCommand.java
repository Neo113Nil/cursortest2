package com.google.android.exoplayer2.metadata.scte35;

import android.os.Parcel;
import android.os.Parcelable;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import defpackage.dyh;
import defpackage.nkk;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public final class TimeSignalCommand extends SpliceCommand {
    public static final Parcelable.Creator<TimeSignalCommand> CREATOR = new dyh(7);
    public final long a;
    public final long b;

    public TimeSignalCommand(long j, long j2) {
        this.a = j;
        this.b = j2;
    }

    public static long a(long j, nkk nkkVar) {
        long s = nkkVar.s();
        return (128 & s) != 0 ? 8589934591L & ((((s & 1) << 32) | nkkVar.t()) + j) : C.TIME_UNSET;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeLong(this.a);
        parcel.writeLong(this.b);
    }
}
