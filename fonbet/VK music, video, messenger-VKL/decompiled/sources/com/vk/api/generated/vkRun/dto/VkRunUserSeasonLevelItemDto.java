package com.vk.api.generated.vkRun.dto;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.core.app.NotificationCompat;
import defpackage.q0;
import io.reactivex.rxjava3.subjects.b;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import xsna.ao;
import xsna.en;
import xsna.epx;
import xsna.fw3;
import xsna.pmi0;
import xsna.shy;

/* compiled from: VkRunUserSeasonLevelItemDto.kt */
/* loaded from: classes15.dex */
public final class VkRunUserSeasonLevelItemDto implements Parcelable {
    public static final Parcelable.Creator<VkRunUserSeasonLevelItemDto> CREATOR = new a();

    @pmi0("is_reached")
    private final boolean isReached;

    @pmi0(NotificationCompat.CATEGORY_PROGRESS)
    private final float progress;

    @pmi0("rewards")
    private final List<VkRunSeasonRewardDto> rewards;

    @pmi0("target_steps")
    private final int targetSteps;

    @pmi0("users")
    private final VkRunSeasonLevelUsersDto users;

    @pmi0("value")
    private final int value;

    /* compiled from: VkRunUserSeasonLevelItemDto.kt */
    public static final class a implements Parcelable.Creator<VkRunUserSeasonLevelItemDto> {
        @Override // android.os.Parcelable.Creator
        public final VkRunUserSeasonLevelItemDto createFromParcel(Parcel parcel) {
            int readInt = parcel.readInt();
            float readFloat = parcel.readFloat();
            VkRunSeasonLevelUsersDto createFromParcel = VkRunSeasonLevelUsersDto.CREATOR.createFromParcel(parcel);
            int readInt2 = parcel.readInt();
            ArrayList arrayList = new ArrayList(readInt2);
            int i = 0;
            while (i != readInt2) {
                i = en.a(VkRunSeasonRewardDto.CREATOR, parcel, arrayList, i, 1);
            }
            return new VkRunUserSeasonLevelItemDto(readInt, readFloat, createFromParcel, arrayList, parcel.readInt(), parcel.readInt() != 0);
        }

        @Override // android.os.Parcelable.Creator
        public final VkRunUserSeasonLevelItemDto[] newArray(int i) {
            return new VkRunUserSeasonLevelItemDto[i];
        }
    }

    public VkRunUserSeasonLevelItemDto(int i, float f, VkRunSeasonLevelUsersDto vkRunSeasonLevelUsersDto, List<VkRunSeasonRewardDto> list, int i2, boolean z) {
        this.value = i;
        this.progress = f;
        this.users = vkRunSeasonLevelUsersDto;
        this.rewards = list;
        this.targetSteps = i2;
        this.isReached = z;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof VkRunUserSeasonLevelItemDto)) {
            return false;
        }
        VkRunUserSeasonLevelItemDto vkRunUserSeasonLevelItemDto = (VkRunUserSeasonLevelItemDto) obj;
        return this.value == vkRunUserSeasonLevelItemDto.value && Float.compare(this.progress, vkRunUserSeasonLevelItemDto.progress) == 0 && epx.f(this.users, vkRunUserSeasonLevelItemDto.users) && epx.f(this.rewards, vkRunUserSeasonLevelItemDto.rewards) && this.targetSteps == vkRunUserSeasonLevelItemDto.targetSteps && this.isReached == vkRunUserSeasonLevelItemDto.isReached;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.isReached) + shy.a(this.targetSteps, fw3.a((this.users.hashCode() + b.a(this.progress, Integer.hashCode(this.value) * 31, 31)) * 31, 31, this.rewards), 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("VkRunUserSeasonLevelItemDto(value=");
        sb.append(this.value);
        sb.append(", progress=");
        sb.append(this.progress);
        sb.append(", users=");
        sb.append(this.users);
        sb.append(", rewards=");
        sb.append(this.rewards);
        sb.append(", targetSteps=");
        sb.append(this.targetSteps);
        sb.append(", isReached=");
        return q0.a(sb, this.isReached, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.value);
        parcel.writeFloat(this.progress);
        this.users.writeToParcel(parcel, i);
        Iterator a2 = ao.a(parcel, this.rewards);
        while (a2.hasNext()) {
            ((VkRunSeasonRewardDto) a2.next()).writeToParcel(parcel, i);
        }
        parcel.writeInt(this.targetSteps);
        parcel.writeInt(this.isReached ? 1 : 0);
    }
}
