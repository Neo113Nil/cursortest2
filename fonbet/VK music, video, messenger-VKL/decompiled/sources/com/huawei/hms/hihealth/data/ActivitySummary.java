package com.huawei.hms.hihealth.data;

import android.os.Parcelable;
import com.huawei.hms.common.internal.Preconditions;
import com.huawei.hms.health.aabq;
import com.huawei.hms.health.aabv;
import com.huawei.hms.health.aabw;
import com.huawei.hms.health.aaby;
import com.huawei.hms.health.aabz;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import xsna.ub0;
import xsna.vp;

/* loaded from: classes13.dex */
public class ActivitySummary extends aabq {
    public static final Parcelable.Creator<ActivitySummary> CREATOR = new aabq.aab(ActivitySummary.class);
    private static final int SECTION_INDEX_START = 0;
    private static final String TAG = "ActivitySummary";

    @aaby(id = 3)
    private SamplePoint activityFeature;

    @aaby(id = 2)
    private List<SamplePoint> dataSummary;

    @aaby(id = 1)
    private PaceSummary paceSummary;

    @aaby(id = 4)
    private List<SampleSection> sectionSummary;

    public ActivitySummary() {
        this.paceSummary = new PaceSummary();
        this.dataSummary = new ArrayList();
        this.activityFeature = null;
        this.sectionSummary = new ArrayList();
        aabz.aabb(TAG, "ActivitySummary() constructor");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ int aab(SampleSection sampleSection, SampleSection sampleSection2) {
        return sampleSection.getSectionNum() - sampleSection2.getSectionNum();
    }

    private void checkSectionSummaryLegacy(List<SampleSection> list) {
        if (!aabz.aaba(list).booleanValue()) {
            aabz.aabc(TAG, "sectionSummary is empty");
            return;
        }
        Collections.sort(list, new ub0());
        int sectionNum = list.get(0).getSectionNum() - 1;
        Preconditions.checkArgument(sectionNum == 0, "SectionNum not start from 1.");
        Iterator<SampleSection> it = list.iterator();
        while (it.hasNext()) {
            sectionNum++;
            Preconditions.checkArgument(it.next().getSectionNum() == sectionNum, "SectionNum is inconsecutive.");
        }
    }

    public void addDataSummary(SamplePoint samplePoint) {
        if (this.dataSummary == null) {
            this.dataSummary = new ArrayList();
        }
        this.dataSummary.add(samplePoint);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ActivitySummary)) {
            return false;
        }
        ActivitySummary activitySummary = (ActivitySummary) obj;
        return Objects.equals(this.paceSummary, activitySummary.paceSummary) && Objects.equals(this.dataSummary, activitySummary.dataSummary) && Objects.equals(this.activityFeature, activitySummary.activityFeature) && Objects.equals(this.sectionSummary, activitySummary.sectionSummary);
    }

    public SamplePoint getActivityFeature() {
        return this.activityFeature;
    }

    public List<SamplePoint> getDataSummary() {
        return this.dataSummary;
    }

    public PaceSummary getPaceSummary() {
        return this.paceSummary;
    }

    public List<SampleSection> getSectionSummary() {
        return this.sectionSummary;
    }

    public int hashCode() {
        return com.huawei.hms.common.internal.Objects.hashCode(this.paceSummary, this.dataSummary, this.activityFeature, this.sectionSummary);
    }

    public void setActivityFeature(SamplePoint samplePoint) {
        this.activityFeature = samplePoint;
    }

    public void setDataSummary(List<SamplePoint> list) {
        this.dataSummary = list;
    }

    public void setPaceSummary(PaceSummary paceSummary) {
        this.paceSummary = paceSummary;
    }

    public void setSectionSummary(List<SampleSection> list) {
        checkSectionSummaryLegacy(list);
        this.sectionSummary = list;
    }

    public String toString() {
        StringBuilder aab = com.huawei.hms.health.aab.aab("ActivitySummary{paceSummary = ");
        aab.append(this.paceSummary);
        aab.append(", dataSummary = ");
        aab.append(this.dataSummary);
        aab.append(", dataSummary = ");
        aab.append(this.activityFeature);
        aab.append(", sectionSummary = ");
        return vp.b("}", aab, this.sectionSummary);
    }

    @aabw
    public ActivitySummary(@aabv(id = 1) PaceSummary paceSummary, @aabv(id = 2) List<SamplePoint> list, @aabv(id = 3) SamplePoint samplePoint, @aabv(id = 4) List<SampleSection> list2) {
        aabz.aabb(TAG, "ActivitySummary() SafePrimary");
        checkSectionSummaryLegacy(list2);
        this.paceSummary = paceSummary;
        this.dataSummary = list;
        this.activityFeature = samplePoint;
        this.sectionSummary = list2;
    }
}
