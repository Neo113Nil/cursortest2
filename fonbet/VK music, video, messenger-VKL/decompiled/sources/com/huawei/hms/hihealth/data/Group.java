package com.huawei.hms.hihealth.data;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Nullable;
import androidx.core.app.NotificationCompat;
import com.huawei.hms.common.internal.Objects;
import com.huawei.hms.health.aacc;
import com.huawei.hms.health.aacs;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

/* loaded from: classes13.dex */
public class Group implements Parcelable {
    public static final Parcelable.Creator<Group> CREATOR = new aab();
    public static final int TYPE_ACTIVITY_FRAGMENT = 4;
    public static final int TYPE_ACTIVITY_RECORD = 2;
    public static final int TYPE_ACTIVITY_TYPE = 3;
    public static final int TYPE_INTERVALS = 5;
    public static final int TYPE_TIME = 1;
    private final ActivityRecord activityRecord;
    private final int activityType;
    private final long endTime;
    private final int groupType;
    private boolean hasMoreSample;
    private final List<SampleSet> sampleSets;
    private final long startTime;

    public class aab implements Parcelable.Creator<Group> {
        @Override // android.os.Parcelable.Creator
        public Group createFromParcel(Parcel parcel) {
            return new Group(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public Group[] newArray(int i) {
            return new Group[i];
        }
    }

    public Group(long j, long j2, @Nullable ActivityRecord activityRecord, int i, List<SampleSet> list, int i2, boolean z) {
        this.startTime = j;
        this.endTime = j2;
        this.activityRecord = activityRecord;
        this.activityType = i;
        this.sampleSets = list;
        this.groupType = i2;
        this.hasMoreSample = z;
    }

    public static String getGroupTypeString(int i) {
        return i != 0 ? i != 1 ? i != 2 ? i != 3 ? i != 4 ? i != 5 ? NotificationCompat.CATEGORY_ERROR : "intervals" : "activityFragment" : "activityType" : "activityRecord" : "time" : "none";
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof Group) {
            Group group = (Group) obj;
            if (this.groupType == group.groupType && this.startTime == group.startTime && this.endTime == group.endTime && this.hasMoreSample == group.hasMoreSample && this.activityType == group.activityType && Objects.equal(this.sampleSets, group.sampleSets)) {
                return true;
            }
        }
        return false;
    }

    public String getActivity() {
        return aacc.aab(this.activityType);
    }

    @Nullable
    public ActivityRecord getActivityRecord() {
        return this.activityRecord;
    }

    public final int getActivityType() {
        return this.activityType;
    }

    public long getEndTime(TimeUnit timeUnit) {
        return timeUnit.convert(this.endTime, TimeUnit.MILLISECONDS);
    }

    public int getGroupType() {
        return this.groupType;
    }

    @Nullable
    public SampleSet getSampleSet(DataType dataType) {
        for (SampleSet sampleSet : this.sampleSets) {
            if (sampleSet.getDataType().equals(dataType)) {
                return sampleSet;
            }
        }
        return null;
    }

    public List<SampleSet> getSampleSets() {
        return this.sampleSets;
    }

    public long getStartTime(TimeUnit timeUnit) {
        return timeUnit.convert(this.startTime, TimeUnit.MILLISECONDS);
    }

    public final boolean hasMoreSample() {
        return this.hasMoreSample || this.sampleSets.iterator().hasNext();
    }

    public final boolean hasSameSample(Group group) {
        return this.groupType == group.groupType && this.startTime == group.startTime && this.endTime == group.endTime && this.activityType == group.activityType;
    }

    public int hashCode() {
        return Objects.hashCode(Integer.valueOf(this.groupType), Long.valueOf(this.startTime), Long.valueOf(this.endTime), Integer.valueOf(this.activityType));
    }

    public String toString() {
        return Objects.toStringHelper(this).add("groupType", getGroupTypeString(this.groupType)).add("startTime", Long.valueOf(this.startTime)).add("endTime", Long.valueOf(this.endTime)).add("hasMoreSample", Boolean.valueOf(this.hasMoreSample)).add("activityType", Integer.valueOf(this.activityType)).add("sampleSets", this.sampleSets).toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.groupType);
        parcel.writeLong(this.startTime);
        parcel.writeLong(this.endTime);
        parcel.writeInt(hasMoreSample() ? 1 : 0);
        parcel.writeInt(this.activityType);
        parcel.writeParcelable(null, i);
        parcel.writeTypedList(this.sampleSets);
    }

    public Group(Parcel parcel) {
        this.groupType = parcel.readInt();
        this.startTime = parcel.readLong();
        this.endTime = parcel.readLong();
        this.hasMoreSample = parcel.readInt() != 0;
        this.activityType = parcel.readInt();
        this.activityRecord = (ActivityRecord) parcel.readParcelable(ActivityRecord.class.getClassLoader());
        ArrayList arrayList = new ArrayList();
        this.sampleSets = arrayList;
        aacs.aab(parcel, arrayList, SampleSet.CREATOR);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Group(Group group, List<DataCollector> list) {
        this(group.getStartTime(r12), group.getEndTime(r12), group.getActivityRecord(), group.getActivityType(), new ArrayList(group.getSampleSets().size()), group.getGroupType(), group.hasMoreSample());
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        this.sampleSets.addAll(group.getSampleSets());
    }
}
