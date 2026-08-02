package com.vk.onboardingpromo.impl.domain.objects;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.List;
import kotlin.collections.EmptyList;
import xsna.epx;
import xsna.ms9;
import xsna.pmi0;
import xsna.zcl;

/* compiled from: OnboardingPromoActionDo.kt */
/* loaded from: classes4.dex */
public final class OnboardingPromoActionDo implements Parcelable {
    public static final Parcelable.Creator<OnboardingPromoActionDo> CREATOR = new a();

    @pmi0("params")
    private final List<String> params;

    @pmi0("type")
    private final OnboardingPromoCtaClickTypeDo type;

    /* compiled from: OnboardingPromoActionDo.kt */
    public static final class a implements Parcelable.Creator<OnboardingPromoActionDo> {
        @Override // android.os.Parcelable.Creator
        public final OnboardingPromoActionDo createFromParcel(Parcel parcel) {
            return new OnboardingPromoActionDo(OnboardingPromoCtaClickTypeDo.valueOf(parcel.readString()), parcel.createStringArrayList());
        }

        @Override // android.os.Parcelable.Creator
        public final OnboardingPromoActionDo[] newArray(int i) {
            return new OnboardingPromoActionDo[i];
        }
    }

    public OnboardingPromoActionDo() {
        this(null, null, 3, null);
    }

    public final List<String> d() {
        return this.params;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final OnboardingPromoCtaClickTypeDo e() {
        return this.type;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof OnboardingPromoActionDo)) {
            return false;
        }
        OnboardingPromoActionDo onboardingPromoActionDo = (OnboardingPromoActionDo) obj;
        return this.type == onboardingPromoActionDo.type && epx.f(this.params, onboardingPromoActionDo.params);
    }

    public final int hashCode() {
        int hashCode = this.type.hashCode() * 31;
        List<String> list = this.params;
        return hashCode + (list == null ? 0 : list.hashCode());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("OnboardingPromoActionDo(type=");
        sb.append(this.type);
        sb.append(", params=");
        return ms9.a(')', sb, this.params);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.type.name());
        parcel.writeStringList(this.params);
    }

    public OnboardingPromoActionDo(OnboardingPromoCtaClickTypeDo onboardingPromoCtaClickTypeDo, List<String> list) {
        this.type = onboardingPromoCtaClickTypeDo;
        this.params = list;
    }

    public OnboardingPromoActionDo(OnboardingPromoCtaClickTypeDo onboardingPromoCtaClickTypeDo, List list, int i, zcl zclVar) {
        this((i & 1) != 0 ? OnboardingPromoCtaClickTypeDo.CLOSE : onboardingPromoCtaClickTypeDo, (i & 2) != 0 ? EmptyList.b : list);
    }
}
