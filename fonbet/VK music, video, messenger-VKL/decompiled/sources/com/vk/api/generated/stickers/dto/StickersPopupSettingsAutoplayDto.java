package com.vk.api.generated.stickers.dto;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import xsna.ao;
import xsna.epx;
import xsna.ms9;
import xsna.pm0;
import xsna.pmi0;
import xsna.qoy;

/* compiled from: StickersPopupSettingsAutoplayDto.kt */
/* loaded from: classes15.dex */
public final class StickersPopupSettingsAutoplayDto implements Parcelable {
    public static final Parcelable.Creator<StickersPopupSettingsAutoplayDto> CREATOR = new a();

    @pmi0("disabled_peer_ids")
    private final List<Integer> disabledPeerIds;

    @pmi0("on_get")
    private final boolean onGet;

    @pmi0("on_send")
    private final boolean onSend;

    /* compiled from: StickersPopupSettingsAutoplayDto.kt */
    public static final class a implements Parcelable.Creator<StickersPopupSettingsAutoplayDto> {
        @Override // android.os.Parcelable.Creator
        public final StickersPopupSettingsAutoplayDto createFromParcel(Parcel parcel) {
            int i = 0;
            boolean z = parcel.readInt() != 0;
            boolean z2 = parcel.readInt() != 0;
            int readInt = parcel.readInt();
            ArrayList arrayList = new ArrayList(readInt);
            while (i != readInt) {
                i = pm0.b(parcel, arrayList, i, 1);
            }
            return new StickersPopupSettingsAutoplayDto(z, z2, arrayList);
        }

        @Override // android.os.Parcelable.Creator
        public final StickersPopupSettingsAutoplayDto[] newArray(int i) {
            return new StickersPopupSettingsAutoplayDto[i];
        }
    }

    public StickersPopupSettingsAutoplayDto(boolean z, boolean z2, List<Integer> list) {
        this.onSend = z;
        this.onGet = z2;
        this.disabledPeerIds = list;
    }

    public final List<Integer> d() {
        return this.disabledPeerIds;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean e() {
        return this.onGet;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof StickersPopupSettingsAutoplayDto)) {
            return false;
        }
        StickersPopupSettingsAutoplayDto stickersPopupSettingsAutoplayDto = (StickersPopupSettingsAutoplayDto) obj;
        return this.onSend == stickersPopupSettingsAutoplayDto.onSend && this.onGet == stickersPopupSettingsAutoplayDto.onGet && epx.f(this.disabledPeerIds, stickersPopupSettingsAutoplayDto.disabledPeerIds);
    }

    public final boolean f() {
        return this.onSend;
    }

    public final int hashCode() {
        return this.disabledPeerIds.hashCode() + qoy.b(Boolean.hashCode(this.onSend) * 31, 31, this.onGet);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("StickersPopupSettingsAutoplayDto(onSend=");
        sb.append(this.onSend);
        sb.append(", onGet=");
        sb.append(this.onGet);
        sb.append(", disabledPeerIds=");
        return ms9.a(')', sb, this.disabledPeerIds);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.onSend ? 1 : 0);
        parcel.writeInt(this.onGet ? 1 : 0);
        Iterator a2 = ao.a(parcel, this.disabledPeerIds);
        while (a2.hasNext()) {
            parcel.writeInt(((Number) a2.next()).intValue());
        }
    }
}
