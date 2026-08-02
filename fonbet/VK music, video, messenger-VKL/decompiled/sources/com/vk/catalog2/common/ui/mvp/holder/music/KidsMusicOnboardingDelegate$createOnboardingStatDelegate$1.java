package com.vk.catalog2.common.ui.mvp.holder.music;

import android.os.Parcel;
import com.vk.onboarding.api.dto.VkOnboardingCampaign;
import com.vk.onboarding.api.dto.VkOnboardingType;
import com.vk.onboarding.api.stat.VkOnboardingStat$Delegate;
import xsna.e8v0;
import xsna.tiy;

/* compiled from: KidsMusicOnboardingDelegate.kt */
/* loaded from: classes16.dex */
public final class KidsMusicOnboardingDelegate$createOnboardingStatDelegate$1 implements VkOnboardingStat$Delegate {
    public final /* synthetic */ tiy b;
    public final /* synthetic */ VkOnboardingCampaign c;

    public KidsMusicOnboardingDelegate$createOnboardingStatDelegate$1(tiy tiyVar, VkOnboardingCampaign vkOnboardingCampaign) {
        this.b = tiyVar;
        this.c = vkOnboardingCampaign;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, kotlin.Lazy] */
    @Override // com.vk.onboarding.api.stat.VkOnboardingStat$Delegate
    public final void d4(e8v0 e8v0Var) {
        tiy tiyVar = this.b;
        tiyVar.a.a(this.c, VkOnboardingType.Tooltip, e8v0Var);
        ((VkOnboardingStat$Delegate) tiyVar.c.getValue()).d4(e8v0Var);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
    }
}
