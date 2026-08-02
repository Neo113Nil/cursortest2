package com.vk.libvideo.pip.v2;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.List;
import xsna.asp;
import xsna.j5g;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: PipTrigger.kt */
/* loaded from: classes3.dex */
public final class PipTrigger implements Parcelable {
    private static final /* synthetic */ zrp $ENTRIES;
    private static final /* synthetic */ PipTrigger[] $VALUES;
    public static final PipTrigger Back;
    public static final Parcelable.Creator<PipTrigger> CREATOR;
    public static final a Companion;
    public static final PipTrigger Gesture;
    public static final PipTrigger LeaveHint;
    public static final PipTrigger Other;

    /* compiled from: PipTrigger.kt */
    public static final class a {
        public static List a() {
            return j5g.O0(PipTrigger.i());
        }
    }

    /* compiled from: PipTrigger.kt */
    public static final class b implements Parcelable.Creator<PipTrigger> {
        @Override // android.os.Parcelable.Creator
        public final PipTrigger createFromParcel(Parcel parcel) {
            return PipTrigger.valueOf(parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final PipTrigger[] newArray(int i) {
            return new PipTrigger[i];
        }
    }

    static {
        PipTrigger pipTrigger = new PipTrigger("LeaveHint", 0);
        LeaveHint = pipTrigger;
        PipTrigger pipTrigger2 = new PipTrigger("Back", 1);
        Back = pipTrigger2;
        PipTrigger pipTrigger3 = new PipTrigger("Gesture", 2);
        Gesture = pipTrigger3;
        PipTrigger pipTrigger4 = new PipTrigger("Other", 3);
        Other = pipTrigger4;
        PipTrigger[] pipTriggerArr = {pipTrigger, pipTrigger2, pipTrigger3, pipTrigger4};
        $VALUES = pipTriggerArr;
        $ENTRIES = new asp(pipTriggerArr);
        Companion = new a();
        CREATOR = new b();
    }

    public PipTrigger() {
        throw null;
    }

    public static zrp<PipTrigger> i() {
        return $ENTRIES;
    }

    public static PipTrigger valueOf(String str) {
        return (PipTrigger) Enum.valueOf(PipTrigger.class, str);
    }

    public static PipTrigger[] values() {
        return (PipTrigger[]) $VALUES.clone();
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(name());
    }
}
