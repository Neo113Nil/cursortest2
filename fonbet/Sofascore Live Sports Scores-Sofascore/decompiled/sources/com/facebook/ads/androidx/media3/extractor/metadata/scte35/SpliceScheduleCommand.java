package com.facebook.ads.androidx.media3.extractor.metadata.scte35;

import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.ads.redexgen.core.C14594v;
import com.facebook.ads.redexgen.core.C1783Ib;
import com.facebook.ads.redexgen.core.IZ;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* loaded from: assets/audience_network/classes2.dex */
public final class SpliceScheduleCommand extends SpliceCommand {
    public static final Parcelable.Creator<SpliceScheduleCommand> CREATOR = new IZ();
    public final List<C1783Ib> A00;

    public SpliceScheduleCommand(Parcel parcel) {
        C1783Ib A00;
        int readInt = parcel.readInt();
        ArrayList arrayList = new ArrayList(readInt);
        for (int i = 0; i < readInt; i++) {
            A00 = C1783Ib.A00(parcel);
            arrayList.add(A00);
        }
        this.A00 = Collections.unmodifiableList(arrayList);
    }

    public /* synthetic */ SpliceScheduleCommand(Parcel parcel, IZ iz) {
        this(parcel);
    }

    public SpliceScheduleCommand(List<C1783Ib> list) {
        this.A00 = Collections.unmodifiableList(list);
    }

    public static SpliceScheduleCommand A00(C14594v c14594v) {
        C1783Ib A02;
        int A0I = c14594v.A0I();
        ArrayList arrayList = new ArrayList(A0I);
        for (int i = 0; i < A0I; i++) {
            A02 = C1783Ib.A02(c14594v);
            arrayList.add(A02);
        }
        return new SpliceScheduleCommand(arrayList);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int size = this.A00.size();
        parcel.writeInt(size);
        for (int i2 = 0; i2 < size; i2++) {
            this.A00.get(i2).A04(parcel);
        }
    }
}
