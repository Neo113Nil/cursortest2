package com.vk.api.generated.shortVideo.dto;

import android.os.Parcel;
import android.os.Parcelable;
import com.vk.api.generated.actionLinks.dto.ActionLinksActionDto;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import xsna.dn;
import xsna.en;
import xsna.epx;
import xsna.ms9;
import xsna.nr;
import xsna.pmi0;
import xsna.zcl;

/* compiled from: ShortVideoInteractiveDto.kt */
/* loaded from: classes15.dex */
public final class ShortVideoInteractiveDto implements Parcelable {
    public static final Parcelable.Creator<ShortVideoInteractiveDto> CREATOR = new a();

    @pmi0("buttons")
    private final List<ActionLinksActionDto> buttons;

    @pmi0("overlay_duration_ts")
    private final Integer overlayDurationTs;

    @pmi0("overlay_show_ts")
    private final Integer overlayShowTs;

    @pmi0("question")
    private final String question;

    /* compiled from: ShortVideoInteractiveDto.kt */
    public static final class a implements Parcelable.Creator<ShortVideoInteractiveDto> {
        @Override // android.os.Parcelable.Creator
        public final ShortVideoInteractiveDto createFromParcel(Parcel parcel) {
            ArrayList arrayList = null;
            Integer valueOf = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            Integer valueOf2 = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            String readString = parcel.readString();
            if (parcel.readInt() != 0) {
                int readInt = parcel.readInt();
                ArrayList arrayList2 = new ArrayList(readInt);
                int i = 0;
                while (i != readInt) {
                    i = en.a(ActionLinksActionDto.CREATOR, parcel, arrayList2, i, 1);
                }
                arrayList = arrayList2;
            }
            return new ShortVideoInteractiveDto(valueOf, valueOf2, readString, arrayList);
        }

        @Override // android.os.Parcelable.Creator
        public final ShortVideoInteractiveDto[] newArray(int i) {
            return new ShortVideoInteractiveDto[i];
        }
    }

    public ShortVideoInteractiveDto() {
        this(null, null, null, null, 15, null);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ShortVideoInteractiveDto)) {
            return false;
        }
        ShortVideoInteractiveDto shortVideoInteractiveDto = (ShortVideoInteractiveDto) obj;
        return epx.f(this.overlayDurationTs, shortVideoInteractiveDto.overlayDurationTs) && epx.f(this.overlayShowTs, shortVideoInteractiveDto.overlayShowTs) && epx.f(this.question, shortVideoInteractiveDto.question) && epx.f(this.buttons, shortVideoInteractiveDto.buttons);
    }

    public final int hashCode() {
        Integer num = this.overlayDurationTs;
        int hashCode = (num == null ? 0 : num.hashCode()) * 31;
        Integer num2 = this.overlayShowTs;
        int hashCode2 = (hashCode + (num2 == null ? 0 : num2.hashCode())) * 31;
        String str = this.question;
        int hashCode3 = (hashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        List<ActionLinksActionDto> list = this.buttons;
        return hashCode3 + (list != null ? list.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ShortVideoInteractiveDto(overlayDurationTs=");
        sb.append(this.overlayDurationTs);
        sb.append(", overlayShowTs=");
        sb.append(this.overlayShowTs);
        sb.append(", question=");
        sb.append(this.question);
        sb.append(", buttons=");
        return ms9.a(')', sb, this.buttons);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        Integer num = this.overlayDurationTs;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            nr.a(parcel, 1, num);
        }
        Integer num2 = this.overlayShowTs;
        if (num2 == null) {
            parcel.writeInt(0);
        } else {
            nr.a(parcel, 1, num2);
        }
        parcel.writeString(this.question);
        List<ActionLinksActionDto> list = this.buttons;
        if (list == null) {
            parcel.writeInt(0);
            return;
        }
        Iterator f = dn.f(parcel, list, 1);
        while (f.hasNext()) {
            ((ActionLinksActionDto) f.next()).writeToParcel(parcel, i);
        }
    }

    public ShortVideoInteractiveDto(Integer num, Integer num2, String str, List<ActionLinksActionDto> list) {
        this.overlayDurationTs = num;
        this.overlayShowTs = num2;
        this.question = str;
        this.buttons = list;
    }

    public /* synthetic */ ShortVideoInteractiveDto(Integer num, Integer num2, String str, List list, int i, zcl zclVar) {
        this((i & 1) != 0 ? null : num, (i & 2) != 0 ? null : num2, (i & 4) != 0 ? null : str, (i & 8) != 0 ? null : list);
    }
}
