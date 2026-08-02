package com.vk.clips.viewer.impl.utils.performance;

import android.os.Parcel;
import android.os.Parcelable;
import com.vk.clips.sdk.shared.api.utils.performance.StartScreenType;
import java.util.UUID;
import xsna.okh0;
import xsna.yw90;
import xsna.zcl;
import xsna.zrd0;

/* compiled from: ClipsScreenProductScoreReporter.kt */
/* loaded from: classes17.dex */
public final class ClipsScreenProductScoreReporter implements Parcelable, okh0 {
    public static final a CREATOR = new a();
    public final UUID b;
    public final yw90 c;

    /* compiled from: ClipsScreenProductScoreReporter.kt */
    public static final class a implements Parcelable.Creator<ClipsScreenProductScoreReporter> {
        @Override // android.os.Parcelable.Creator
        public final ClipsScreenProductScoreReporter createFromParcel(Parcel parcel) {
            return new ClipsScreenProductScoreReporter(parcel, (zcl) null);
        }

        @Override // android.os.Parcelable.Creator
        public final ClipsScreenProductScoreReporter[] newArray(int i) {
            return new ClipsScreenProductScoreReporter[i];
        }
    }

    public ClipsScreenProductScoreReporter(UUID uuid, yw90 yw90Var) {
        this.b = uuid;
        this.c = yw90Var;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // xsna.okh0
    public final void g() {
        yw90 yw90Var = this.c;
        if (yw90Var != null) {
            yw90Var.a();
        }
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(String.valueOf(this.b));
    }

    public ClipsScreenProductScoreReporter(Parcel parcel, zcl zclVar) {
        String readString = parcel.readString();
        yw90 yw90Var = null;
        UUID fromString = (readString == null || readString.length() == 0) ? null : UUID.fromString(readString);
        this.b = fromString;
        if (fromString != null) {
            zrd0 zrd0Var = zrd0.a;
            yw90Var = zrd0.e.get(fromString);
        }
        this.c = yw90Var;
    }

    @Override // xsna.okh0
    public final void d() {
    }

    @Override // xsna.okh0
    public final void e() {
    }

    @Override // xsna.okh0
    public final void f() {
    }

    @Override // xsna.okh0
    public final void a(StartScreenType startScreenType) {
    }

    @Override // xsna.okh0
    public final void i(long j, long j2) {
    }
}
