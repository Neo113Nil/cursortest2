package com.vk.api.generated.superApp.dto;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import xsna.ao;
import xsna.en;
import xsna.epx;
import xsna.ms9;
import xsna.pmi0;
import xsna.shy;

/* compiled from: SuperAppMiniWidgetSettingsDto.kt */
/* loaded from: classes15.dex */
public final class SuperAppMiniWidgetSettingsDto implements Parcelable {
    public static final Parcelable.Creator<SuperAppMiniWidgetSettingsDto> CREATOR = new a();

    @pmi0("is_mini_widgets_enabled")
    private final boolean isMiniWidgetsEnabled;

    @pmi0("items")
    private final List<SuperAppMiniWidgetSettingDto> items;

    @pmi0("saving_delay")
    private final int savingDelay;

    /* compiled from: SuperAppMiniWidgetSettingsDto.kt */
    public static final class a implements Parcelable.Creator<SuperAppMiniWidgetSettingsDto> {
        @Override // android.os.Parcelable.Creator
        public final SuperAppMiniWidgetSettingsDto createFromParcel(Parcel parcel) {
            int i = 0;
            boolean z = parcel.readInt() != 0;
            int readInt = parcel.readInt();
            int readInt2 = parcel.readInt();
            ArrayList arrayList = new ArrayList(readInt2);
            while (i != readInt2) {
                i = en.a(SuperAppMiniWidgetSettingDto.CREATOR, parcel, arrayList, i, 1);
            }
            return new SuperAppMiniWidgetSettingsDto(z, readInt, arrayList);
        }

        @Override // android.os.Parcelable.Creator
        public final SuperAppMiniWidgetSettingsDto[] newArray(int i) {
            return new SuperAppMiniWidgetSettingsDto[i];
        }
    }

    public SuperAppMiniWidgetSettingsDto(boolean z, int i, List<SuperAppMiniWidgetSettingDto> list) {
        this.isMiniWidgetsEnabled = z;
        this.savingDelay = i;
        this.items = list;
    }

    public final List<SuperAppMiniWidgetSettingDto> d() {
        return this.items;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final int e() {
        return this.savingDelay;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SuperAppMiniWidgetSettingsDto)) {
            return false;
        }
        SuperAppMiniWidgetSettingsDto superAppMiniWidgetSettingsDto = (SuperAppMiniWidgetSettingsDto) obj;
        return this.isMiniWidgetsEnabled == superAppMiniWidgetSettingsDto.isMiniWidgetsEnabled && this.savingDelay == superAppMiniWidgetSettingsDto.savingDelay && epx.f(this.items, superAppMiniWidgetSettingsDto.items);
    }

    public final boolean f() {
        return this.isMiniWidgetsEnabled;
    }

    public final int hashCode() {
        return this.items.hashCode() + shy.a(this.savingDelay, Boolean.hashCode(this.isMiniWidgetsEnabled) * 31, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SuperAppMiniWidgetSettingsDto(isMiniWidgetsEnabled=");
        sb.append(this.isMiniWidgetsEnabled);
        sb.append(", savingDelay=");
        sb.append(this.savingDelay);
        sb.append(", items=");
        return ms9.a(')', sb, this.items);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.isMiniWidgetsEnabled ? 1 : 0);
        parcel.writeInt(this.savingDelay);
        Iterator a2 = ao.a(parcel, this.items);
        while (a2.hasNext()) {
            ((SuperAppMiniWidgetSettingDto) a2.next()).writeToParcel(parcel, i);
        }
    }
}
