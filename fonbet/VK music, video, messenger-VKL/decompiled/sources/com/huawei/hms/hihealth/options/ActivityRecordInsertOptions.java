package com.huawei.hms.hihealth.options;

import android.os.Parcelable;
import com.huawei.hms.common.internal.Objects;
import com.huawei.hms.common.internal.Preconditions;
import com.huawei.hms.health.aabq;
import com.huawei.hms.health.aabv;
import com.huawei.hms.health.aabw;
import com.huawei.hms.health.aaby;
import com.huawei.hms.hihealth.data.ActivityRecord;
import com.huawei.hms.hihealth.data.DataCollector;
import com.huawei.hms.hihealth.data.SamplePoint;
import com.huawei.hms.hihealth.data.SampleSet;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;

/* loaded from: classes13.dex */
public class ActivityRecordInsertOptions extends aabq {
    private static final long FIVE_DAYS_MS = 432000000;

    @aaby(id = 1)
    private final ActivityRecord mActivityRecord;

    @aaby(id = 2)
    private final List<SamplePoint> mSamplePointList;

    @aaby(id = 3)
    private final List<SampleSet> mSampleSetList;
    public static final Parcelable.Creator<ActivityRecordInsertOptions> CREATOR = new aabq.aab(ActivityRecordInsertOptions.class);
    private static final TimeUnit TIME_UNIT = TimeUnit.MILLISECONDS;

    public static class Builder {
        private ActivityRecord mActivityRecord;
        private List<SamplePoint> mSamplePointList = new ArrayList();
        private List<SampleSet> mSampleSetList = new ArrayList();
        private List<DataCollector> mDataCollectorList = new ArrayList();

        private void modifySamplePointTimeInfo(SamplePoint samplePoint) {
            Preconditions.checkState(this.mActivityRecord != null, "Activity record should not be null.");
            ActivityRecord activityRecord = this.mActivityRecord;
            TimeUnit timeUnit = TimeUnit.NANOSECONDS;
            long startTime = activityRecord.getStartTime(timeUnit);
            long endTime = this.mActivityRecord.getEndTime(timeUnit);
            long samplingTime = samplePoint.getSamplingTime(timeUnit);
            if (samplingTime != 0) {
                if (samplingTime < startTime || samplingTime > endTime) {
                    samplingTime = timeUnit.convert(ActivityRecordInsertOptions.TIME_UNIT.convert(samplingTime, timeUnit), ActivityRecordInsertOptions.TIME_UNIT);
                }
                Preconditions.checkState(samplingTime >= startTime && samplingTime <= endTime, "Timestamp of sample point exceeds record interval");
                if (samplePoint.getSamplingTime(timeUnit) != samplingTime) {
                    samplePoint.setSamplingTime(samplingTime, timeUnit);
                }
            }
            long startTime2 = samplePoint.getStartTime(timeUnit);
            long endTime2 = samplePoint.getEndTime(timeUnit);
            if (startTime2 == 0 || endTime2 == 0) {
                return;
            }
            if (endTime2 > endTime) {
                endTime2 = timeUnit.convert(ActivityRecordInsertOptions.TIME_UNIT.convert(endTime2, timeUnit), ActivityRecordInsertOptions.TIME_UNIT);
            }
            Preconditions.checkState(startTime2 >= startTime && endTime2 <= endTime, "Start time or end time of sample point exceeds record interval");
            if (endTime2 != samplePoint.getEndTime(timeUnit)) {
                samplePoint.setTimeInterval(startTime2, endTime2, timeUnit);
            }
        }

        public Builder addPolymerizedSamplePoint(SamplePoint samplePoint) {
            Preconditions.checkArgument(samplePoint != null, "Sample point should not be null.");
            DataCollector dataCollector = samplePoint.getDataCollector();
            Preconditions.checkState(true ^ this.mDataCollectorList.contains(dataCollector), "Sample set or sample point for this data collector is already added.");
            this.mDataCollectorList.add(dataCollector);
            this.mSamplePointList.add(samplePoint);
            return this;
        }

        public Builder addSampleSet(SampleSet sampleSet) {
            Preconditions.checkArgument(sampleSet != null, "Sample set should not be null.");
            DataCollector dataCollector = sampleSet.getDataCollector();
            Preconditions.checkState(!this.mDataCollectorList.contains(dataCollector), "Sample set or sample point for this data collector is already added.");
            Preconditions.checkArgument(true ^ sampleSet.getSamplePoints().isEmpty(), "The data points list in the input sample set should not be empty.");
            this.mDataCollectorList.add(dataCollector);
            this.mSampleSetList.add(sampleSet);
            return this;
        }

        public ActivityRecordInsertOptions build() {
            Preconditions.checkState(this.mActivityRecord != null, "Activity record should not be null.");
            ActivityRecord activityRecord = this.mActivityRecord;
            TimeUnit timeUnit = TimeUnit.MILLISECONDS;
            Preconditions.checkState(activityRecord.getEndTime(timeUnit) != 0, "The end time of the record is not set, cannot insert the record until it is stopped.");
            Preconditions.checkState(this.mActivityRecord.getEndTime(timeUnit) - this.mActivityRecord.getStartTime(timeUnit) <= ActivityRecordInsertOptions.FIVE_DAYS_MS, "The interval between the start time and end time cannot exceed 5 days. ");
            Iterator<SampleSet> it = this.mSampleSetList.iterator();
            while (it.hasNext()) {
                Iterator<SamplePoint> it2 = it.next().getSamplePoints().iterator();
                while (it2.hasNext()) {
                    modifySamplePointTimeInfo(it2.next());
                }
            }
            Iterator<SamplePoint> it3 = this.mSamplePointList.iterator();
            while (it3.hasNext()) {
                modifySamplePointTimeInfo(it3.next());
            }
            return new ActivityRecordInsertOptions(this);
        }

        public Builder setActivityRecord(ActivityRecord activityRecord) {
            this.mActivityRecord = activityRecord;
            return this;
        }
    }

    public ActivityRecordInsertOptions(ActivityRecord activityRecord, ActivityRecordInsertOptions activityRecordInsertOptions) {
        this(activityRecord, activityRecordInsertOptions.getPolymerizedSamplePoints(), activityRecordInsertOptions.getSampleSets());
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ActivityRecordInsertOptions) {
            ActivityRecordInsertOptions activityRecordInsertOptions = (ActivityRecordInsertOptions) obj;
            if (Objects.equal(this.mActivityRecord, activityRecordInsertOptions.mActivityRecord) && Objects.equal(this.mSamplePointList, activityRecordInsertOptions.mSamplePointList) && Objects.equal(this.mSampleSetList, activityRecordInsertOptions.mSampleSetList)) {
                return true;
            }
        }
        return false;
    }

    public ActivityRecord getActivityRecord() {
        return this.mActivityRecord;
    }

    public final List<SamplePoint> getPolymerizedSamplePoints() {
        return this.mSamplePointList;
    }

    public final List<SampleSet> getSampleSets() {
        return this.mSampleSetList;
    }

    public int hashCode() {
        return Objects.hashCode(this.mActivityRecord, this.mSamplePointList, this.mSampleSetList);
    }

    public String toString() {
        return Objects.toStringHelper(this).add("activityRecord", this.mActivityRecord).add("samplePoints", this.mSamplePointList).add("sampleSets", this.mSampleSetList).toString();
    }

    @aabw
    private ActivityRecordInsertOptions(@aabv(id = 1) ActivityRecord activityRecord, @aabv(id = 2) List<SamplePoint> list, @aabv(id = 3) List<SampleSet> list2) {
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        Preconditions.checkState(activityRecord.getEndTime(timeUnit) - activityRecord.getStartTime(timeUnit) <= FIVE_DAYS_MS, "The interval between the start time and end time cannot exceed 5 days. ");
        this.mActivityRecord = activityRecord;
        this.mSamplePointList = Collections.unmodifiableList(list);
        this.mSampleSetList = Collections.unmodifiableList(list2);
    }

    private ActivityRecordInsertOptions(Builder builder) {
        this(builder.mActivityRecord, builder.mSamplePointList, builder.mSampleSetList);
    }
}
