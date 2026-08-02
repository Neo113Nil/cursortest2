package com.sofascore.results.player.statistics.career.modal;

import android.os.Parcel;
import android.os.Parcelable;
import com.sofascore.model.mvvm.model.Team;
import com.sofascore.results.player.statistics.career.modal.CareerStatsFilterModal;
import defpackage.fzg;
import defpackage.vk2;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class a implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        parcel.getClass();
        return new CareerStatsFilterModal.CareerStatsFilterData((Team) parcel.readSerializable(), vk2.valueOf(parcel.readString()), fzg.valueOf(parcel.readString()), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readInt() != 0 ? Integer.valueOf(parcel.readInt()) : null);
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i) {
        return new CareerStatsFilterModal.CareerStatsFilterData[i];
    }
}
