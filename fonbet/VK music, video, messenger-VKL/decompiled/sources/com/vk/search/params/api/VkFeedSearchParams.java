package com.vk.search.params.api;

import android.os.Parcel;
import com.vk.core.serialize.Serializer;
import java.util.Objects;
import xsna.asp;
import xsna.zrp;

/* compiled from: VkFeedSearchParams.kt */
/* loaded from: classes5.dex */
public final class VkFeedSearchParams implements SearchParams {
    public SortType b = d;
    public boolean c = true;
    public static final SortType d = SortType.DATE;
    public static final Serializer.c<VkFeedSearchParams> CREATOR = new a();

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: VkFeedSearchParams.kt */
    public static final class SortType {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ SortType[] $VALUES;
        public static final SortType DATE;
        public static final SortType RELEVANT;
        private final int apiValue;

        static {
            SortType sortType = new SortType("DATE", 0, 0);
            DATE = sortType;
            SortType sortType2 = new SortType("RELEVANT", 1, 2);
            RELEVANT = sortType2;
            SortType[] sortTypeArr = {sortType, sortType2};
            $VALUES = sortTypeArr;
            $ENTRIES = new asp(sortTypeArr);
        }

        public SortType(String str, int i, int i2) {
            this.apiValue = i2;
        }

        public static SortType valueOf(String str) {
            return (SortType) Enum.valueOf(SortType.class, str);
        }

        public static SortType[] values() {
            return (SortType[]) $VALUES.clone();
        }

        public final int h() {
            return this.apiValue;
        }
    }

    /* compiled from: Serializer.kt */
    public static final class a extends Serializer.c<VkFeedSearchParams> {
        @Override // com.vk.core.serialize.Serializer.c
        public final VkFeedSearchParams a(Serializer serializer) {
            VkFeedSearchParams vkFeedSearchParams = new VkFeedSearchParams();
            SortType sortType = (SortType) serializer.C();
            if (sortType == null) {
                sortType = vkFeedSearchParams.b;
            }
            vkFeedSearchParams.b = sortType;
            vkFeedSearchParams.c = serializer.m();
            return vkFeedSearchParams;
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new VkFeedSearchParams[i];
        }
    }

    @Override // com.vk.search.params.api.SearchParams
    public final boolean I() {
        return this.b == d && this.c;
    }

    @Override // com.vk.core.serialize.Serializer.StreamParcelable
    public final void O7(Serializer serializer) {
        serializer.g0(this.b);
        serializer.L(this.c ? (byte) 1 : (byte) 0);
    }

    @Override // com.vk.search.params.api.SearchParams
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public final VkFeedSearchParams copy() {
        VkFeedSearchParams vkFeedSearchParams = new VkFeedSearchParams();
        vkFeedSearchParams.h5(this);
        return vkFeedSearchParams;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof VkFeedSearchParams)) {
            return false;
        }
        VkFeedSearchParams vkFeedSearchParams = (VkFeedSearchParams) obj;
        return this.b == vkFeedSearchParams.b && this.c == vkFeedSearchParams.c;
    }

    @Override // com.vk.search.params.api.SearchParams
    public final <T extends SearchParams> void h5(T t) {
        if (t instanceof VkFeedSearchParams) {
            VkFeedSearchParams vkFeedSearchParams = (VkFeedSearchParams) t;
            this.b = vkFeedSearchParams.b;
            this.c = vkFeedSearchParams.c;
        }
    }

    public final int hashCode() {
        return Objects.hash(this.b, Boolean.valueOf(this.c));
    }

    @Override // com.vk.search.params.api.SearchParams
    public final void reset() {
        this.b = d;
        this.c = true;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        Serializer.StreamParcelable.a.a(this, parcel);
    }
}
