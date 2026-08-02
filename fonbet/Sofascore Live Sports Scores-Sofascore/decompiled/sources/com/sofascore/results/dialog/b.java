package com.sofascore.results.dialog;

import android.os.Parcel;
import android.os.Parcelable;
import com.sofascore.model.mvvm.model.StageType;
import com.sofascore.results.dialog.FollowSubStagesViewModel;
import java.util.HashSet;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class b implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        parcel.getClass();
        int readInt = parcel.readInt();
        String readString = parcel.readString();
        int readInt2 = parcel.readInt();
        HashSet hashSet = new HashSet(readInt2);
        for (int i = 0; i != readInt2; i++) {
            hashSet.add(StageType.valueOf(parcel.readString()));
        }
        return new FollowSubStagesViewModel.SubStageInfo(readInt, readString, hashSet);
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i) {
        return new FollowSubStagesViewModel.SubStageInfo[i];
    }
}
