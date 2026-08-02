package com.google.android.exoplayer2.metadata.scte35;

import android.os.Parcel;
import android.os.Parcelable;
import defpackage.dyh;
import defpackage.fyh;
import defpackage.gyh;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public final class SpliceScheduleCommand extends SpliceCommand {
    public static final Parcelable.Creator<SpliceScheduleCommand> CREATOR = new dyh(1);
    public final List a;

    public SpliceScheduleCommand(Parcel parcel) {
        int readInt = parcel.readInt();
        ArrayList arrayList = new ArrayList(readInt);
        for (int i = 0; i < readInt; i++) {
            arrayList.add(new gyh(parcel));
        }
        this.a = Collections.unmodifiableList(arrayList);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        List list = this.a;
        int size = list.size();
        parcel.writeInt(size);
        for (int i2 = 0; i2 < size; i2++) {
            gyh gyhVar = (gyh) list.get(i2);
            parcel.writeLong(gyhVar.a);
            parcel.writeByte(gyhVar.b ? (byte) 1 : (byte) 0);
            parcel.writeByte(gyhVar.c ? (byte) 1 : (byte) 0);
            parcel.writeByte(gyhVar.d ? (byte) 1 : (byte) 0);
            List list2 = gyhVar.f;
            int size2 = list2.size();
            parcel.writeInt(size2);
            for (int i3 = 0; i3 < size2; i3++) {
                fyh fyhVar = (fyh) list2.get(i3);
                parcel.writeInt(fyhVar.a);
                parcel.writeLong(fyhVar.b);
            }
            parcel.writeLong(gyhVar.e);
            parcel.writeByte(gyhVar.g ? (byte) 1 : (byte) 0);
            parcel.writeLong(gyhVar.h);
            parcel.writeInt(gyhVar.i);
            parcel.writeInt(gyhVar.j);
            parcel.writeInt(gyhVar.k);
        }
    }

    public SpliceScheduleCommand(ArrayList arrayList) {
        this.a = Collections.unmodifiableList(arrayList);
    }
}
