package com.google.android.gms.fitness.data;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import com.google.android.gms.fitness.data.Goal;
import java.util.ArrayList;

/* compiled from: com.google.android.gms:play-services-fitness@@21.2.0 */
/* loaded from: classes12.dex */
public final class d implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int D = SafeParcelReader.D(parcel);
        ArrayList arrayList = new ArrayList();
        Goal.Recurrence recurrence = null;
        Goal.MetricObjective metricObjective = null;
        Goal.DurationObjective durationObjective = null;
        Goal.FrequencyObjective frequencyObjective = null;
        int i = 0;
        long j = 0;
        long j2 = 0;
        while (parcel.dataPosition() < D) {
            int readInt = parcel.readInt();
            switch ((char) readInt) {
                case 1:
                    j = SafeParcelReader.z(parcel, readInt);
                    break;
                case 2:
                    j2 = SafeParcelReader.z(parcel, readInt);
                    break;
                case 3:
                    SafeParcelReader.y(parcel, readInt, arrayList, d.class.getClassLoader());
                    break;
                case 4:
                    recurrence = (Goal.Recurrence) SafeParcelReader.h(parcel, readInt, Goal.Recurrence.CREATOR);
                    break;
                case 5:
                    i = SafeParcelReader.w(parcel, readInt);
                    break;
                case 6:
                    metricObjective = (Goal.MetricObjective) SafeParcelReader.h(parcel, readInt, Goal.MetricObjective.CREATOR);
                    break;
                case 7:
                    durationObjective = (Goal.DurationObjective) SafeParcelReader.h(parcel, readInt, Goal.DurationObjective.CREATOR);
                    break;
                case '\b':
                    frequencyObjective = (Goal.FrequencyObjective) SafeParcelReader.h(parcel, readInt, Goal.FrequencyObjective.CREATOR);
                    break;
                default:
                    SafeParcelReader.C(parcel, readInt);
                    break;
            }
        }
        SafeParcelReader.n(parcel, D);
        return new Goal(j, j2, arrayList, recurrence, i, metricObjective, durationObjective, frequencyObjective);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        return new Goal[i];
    }
}
