package com.vk.onboardingpromo.impl.domain.objects;

import android.os.Parcel;
import android.os.Parcelable;
import io.reactivex.rxjava3.subjects.b;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.EmptyList;
import xsna.ao;
import xsna.bh10;
import xsna.en;
import xsna.epx;
import xsna.fw3;
import xsna.pmi0;
import xsna.qoy;
import xsna.urd0;
import xsna.zcl;

/* compiled from: OnboardingPromoDo.kt */
/* loaded from: classes4.dex */
public final class OnboardingPromoDo implements Parcelable {
    public static final Parcelable.Creator<OnboardingPromoDo> CREATOR = new a();

    @pmi0("cache_time")
    private final long cacheTime;

    @pmi0("campaign_name")
    private final String campaignName;

    @pmi0("control")
    private final OnboardingPromoControlDo control;

    @pmi0("id")
    private final long id;

    @pmi0("is_media_in_full_screen")
    private final boolean isMediaInFullScreen;

    @pmi0("show_at")
    private final Long showAt;

    @pmi0("slides")
    private final List<OnboardingPromoSlideDo> slides;

    /* compiled from: OnboardingPromoDo.kt */
    public static final class a implements Parcelable.Creator<OnboardingPromoDo> {
        @Override // android.os.Parcelable.Creator
        public final OnboardingPromoDo createFromParcel(Parcel parcel) {
            int i;
            long readLong = parcel.readLong();
            Long valueOf = parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong());
            long readLong2 = parcel.readLong();
            String readString = parcel.readString();
            boolean z = false;
            if (parcel.readInt() != 0) {
                i = 0;
                z = true;
            } else {
                i = 0;
            }
            int readInt = parcel.readInt();
            ArrayList arrayList = new ArrayList(readInt);
            while (i != readInt) {
                i = en.a(OnboardingPromoSlideDo.CREATOR, parcel, arrayList, i, 1);
            }
            return new OnboardingPromoDo(readLong, valueOf, readLong2, readString, z, arrayList, OnboardingPromoControlDo.CREATOR.createFromParcel(parcel));
        }

        @Override // android.os.Parcelable.Creator
        public final OnboardingPromoDo[] newArray(int i) {
            return new OnboardingPromoDo[i];
        }
    }

    public OnboardingPromoDo() {
        this(0L, null, 0L, null, false, null, null, 127, null);
    }

    public final long d() {
        return this.cacheTime;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String e() {
        return this.campaignName;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof OnboardingPromoDo)) {
            return false;
        }
        OnboardingPromoDo onboardingPromoDo = (OnboardingPromoDo) obj;
        return this.id == onboardingPromoDo.id && epx.f(this.showAt, onboardingPromoDo.showAt) && this.cacheTime == onboardingPromoDo.cacheTime && epx.f(this.campaignName, onboardingPromoDo.campaignName) && this.isMediaInFullScreen == onboardingPromoDo.isMediaInFullScreen && epx.f(this.slides, onboardingPromoDo.slides) && epx.f(this.control, onboardingPromoDo.control);
    }

    public final OnboardingPromoControlDo f() {
        return this.control;
    }

    public final long g() {
        return this.id;
    }

    public final int hashCode() {
        int hashCode = Long.hashCode(this.id) * 31;
        Long l = this.showAt;
        return this.control.hashCode() + fw3.a(qoy.b(urd0.a(bh10.a((hashCode + (l == null ? 0 : l.hashCode())) * 31, 31, this.cacheTime), 31, this.campaignName), 31, this.isMediaInFullScreen), 31, this.slides);
    }

    public final Long i() {
        return this.showAt;
    }

    public final List<OnboardingPromoSlideDo> j() {
        return this.slides;
    }

    public final boolean k() {
        return this.isMediaInFullScreen;
    }

    public final String toString() {
        return "OnboardingPromoDo(id=" + this.id + ", showAt=" + this.showAt + ", cacheTime=" + this.cacheTime + ", campaignName=" + this.campaignName + ", isMediaInFullScreen=" + this.isMediaInFullScreen + ", slides=" + this.slides + ", control=" + this.control + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeLong(this.id);
        Long l = this.showAt;
        if (l == null) {
            parcel.writeInt(0);
        } else {
            b.f(parcel, 1, l);
        }
        parcel.writeLong(this.cacheTime);
        parcel.writeString(this.campaignName);
        parcel.writeInt(this.isMediaInFullScreen ? 1 : 0);
        Iterator a2 = ao.a(parcel, this.slides);
        while (a2.hasNext()) {
            ((OnboardingPromoSlideDo) a2.next()).writeToParcel(parcel, i);
        }
        this.control.writeToParcel(parcel, i);
    }

    public OnboardingPromoDo(long j, Long l, long j2, String str, boolean z, List<OnboardingPromoSlideDo> list, OnboardingPromoControlDo onboardingPromoControlDo) {
        this.id = j;
        this.showAt = l;
        this.cacheTime = j2;
        this.campaignName = str;
        this.isMediaInFullScreen = z;
        this.slides = list;
        this.control = onboardingPromoControlDo;
    }

    public OnboardingPromoDo(long j, Long l, long j2, String str, boolean z, List list, OnboardingPromoControlDo onboardingPromoControlDo, int i, zcl zclVar) {
        this((i & 1) != 0 ? 0L : j, (i & 2) != 0 ? null : l, (i & 4) == 0 ? j2 : 0L, (i & 8) != 0 ? "" : str, (i & 16) != 0 ? false : z, (i & 32) != 0 ? EmptyList.b : list, (i & 64) != 0 ? new OnboardingPromoControlDo(0, false, false, null, 15, null) : onboardingPromoControlDo);
    }
}
