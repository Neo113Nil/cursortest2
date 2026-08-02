package com.sofascore.results.player.statistics.career.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.sofascore.model.mvvm.model.UniqueTournament;
import com.sofascore.results.player.statistics.career.model.PickerItem;
import defpackage.wk2;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class b implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        parcel.getClass();
        Boolean bool = null;
        wk2 valueOf = parcel.readInt() == 0 ? null : wk2.valueOf(parcel.readString());
        UniqueTournament uniqueTournament = (UniqueTournament) parcel.readSerializable();
        if (parcel.readInt() != 0) {
            bool = Boolean.valueOf(parcel.readInt() != 0);
        }
        return new PickerItem.Tournament(valueOf, uniqueTournament, bool);
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i) {
        return new PickerItem.Tournament[i];
    }
}
