package com.vk.api.generated.messages.dto;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import xsna.dn;
import xsna.en;
import xsna.epx;
import xsna.pmi0;
import xsna.zcl;

/* compiled from: MessagesConversationStyleBackgroundVectorDto.kt */
/* loaded from: classes15.dex */
public final class MessagesConversationStyleBackgroundVectorDto implements Parcelable {
    public static final Parcelable.Creator<MessagesConversationStyleBackgroundVectorDto> CREATOR = new a();

    @pmi0("blur")
    private final MessagesConversationStyleBackgroundBlurDto blur;

    @pmi0("color_ellipses")
    private final List<MessagesConversationStyleBackgroundColorEllipseDto> colorEllipses;

    @pmi0("gradient")
    private final MessagesConversationStyleGradientDto gradient;

    @pmi0("svg")
    private final MessagesConversationStyleBackgroundSvgDto svg;

    /* compiled from: MessagesConversationStyleBackgroundVectorDto.kt */
    public static final class a implements Parcelable.Creator<MessagesConversationStyleBackgroundVectorDto> {
        @Override // android.os.Parcelable.Creator
        public final MessagesConversationStyleBackgroundVectorDto createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            MessagesConversationStyleBackgroundSvgDto createFromParcel = parcel.readInt() == 0 ? null : MessagesConversationStyleBackgroundSvgDto.CREATOR.createFromParcel(parcel);
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int readInt = parcel.readInt();
                arrayList = new ArrayList(readInt);
                int i = 0;
                while (i != readInt) {
                    i = en.a(MessagesConversationStyleBackgroundColorEllipseDto.CREATOR, parcel, arrayList, i, 1);
                }
            }
            return new MessagesConversationStyleBackgroundVectorDto(createFromParcel, arrayList, parcel.readInt() == 0 ? null : MessagesConversationStyleGradientDto.CREATOR.createFromParcel(parcel), parcel.readInt() != 0 ? MessagesConversationStyleBackgroundBlurDto.CREATOR.createFromParcel(parcel) : null);
        }

        @Override // android.os.Parcelable.Creator
        public final MessagesConversationStyleBackgroundVectorDto[] newArray(int i) {
            return new MessagesConversationStyleBackgroundVectorDto[i];
        }
    }

    public MessagesConversationStyleBackgroundVectorDto() {
        this(null, null, null, null, 15, null);
    }

    public final MessagesConversationStyleBackgroundBlurDto d() {
        return this.blur;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final List<MessagesConversationStyleBackgroundColorEllipseDto> e() {
        return this.colorEllipses;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MessagesConversationStyleBackgroundVectorDto)) {
            return false;
        }
        MessagesConversationStyleBackgroundVectorDto messagesConversationStyleBackgroundVectorDto = (MessagesConversationStyleBackgroundVectorDto) obj;
        return epx.f(this.svg, messagesConversationStyleBackgroundVectorDto.svg) && epx.f(this.colorEllipses, messagesConversationStyleBackgroundVectorDto.colorEllipses) && epx.f(this.gradient, messagesConversationStyleBackgroundVectorDto.gradient) && epx.f(this.blur, messagesConversationStyleBackgroundVectorDto.blur);
    }

    public final MessagesConversationStyleGradientDto f() {
        return this.gradient;
    }

    public final MessagesConversationStyleBackgroundSvgDto g() {
        return this.svg;
    }

    public final int hashCode() {
        MessagesConversationStyleBackgroundSvgDto messagesConversationStyleBackgroundSvgDto = this.svg;
        int hashCode = (messagesConversationStyleBackgroundSvgDto == null ? 0 : messagesConversationStyleBackgroundSvgDto.hashCode()) * 31;
        List<MessagesConversationStyleBackgroundColorEllipseDto> list = this.colorEllipses;
        int hashCode2 = (hashCode + (list == null ? 0 : list.hashCode())) * 31;
        MessagesConversationStyleGradientDto messagesConversationStyleGradientDto = this.gradient;
        int hashCode3 = (hashCode2 + (messagesConversationStyleGradientDto == null ? 0 : messagesConversationStyleGradientDto.hashCode())) * 31;
        MessagesConversationStyleBackgroundBlurDto messagesConversationStyleBackgroundBlurDto = this.blur;
        return hashCode3 + (messagesConversationStyleBackgroundBlurDto != null ? messagesConversationStyleBackgroundBlurDto.hashCode() : 0);
    }

    public final String toString() {
        return "MessagesConversationStyleBackgroundVectorDto(svg=" + this.svg + ", colorEllipses=" + this.colorEllipses + ", gradient=" + this.gradient + ", blur=" + this.blur + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        MessagesConversationStyleBackgroundSvgDto messagesConversationStyleBackgroundSvgDto = this.svg;
        if (messagesConversationStyleBackgroundSvgDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            messagesConversationStyleBackgroundSvgDto.writeToParcel(parcel, i);
        }
        List<MessagesConversationStyleBackgroundColorEllipseDto> list = this.colorEllipses;
        if (list == null) {
            parcel.writeInt(0);
        } else {
            Iterator f = dn.f(parcel, list, 1);
            while (f.hasNext()) {
                ((MessagesConversationStyleBackgroundColorEllipseDto) f.next()).writeToParcel(parcel, i);
            }
        }
        MessagesConversationStyleGradientDto messagesConversationStyleGradientDto = this.gradient;
        if (messagesConversationStyleGradientDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            messagesConversationStyleGradientDto.writeToParcel(parcel, i);
        }
        MessagesConversationStyleBackgroundBlurDto messagesConversationStyleBackgroundBlurDto = this.blur;
        if (messagesConversationStyleBackgroundBlurDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            messagesConversationStyleBackgroundBlurDto.writeToParcel(parcel, i);
        }
    }

    public MessagesConversationStyleBackgroundVectorDto(MessagesConversationStyleBackgroundSvgDto messagesConversationStyleBackgroundSvgDto, List<MessagesConversationStyleBackgroundColorEllipseDto> list, MessagesConversationStyleGradientDto messagesConversationStyleGradientDto, MessagesConversationStyleBackgroundBlurDto messagesConversationStyleBackgroundBlurDto) {
        this.svg = messagesConversationStyleBackgroundSvgDto;
        this.colorEllipses = list;
        this.gradient = messagesConversationStyleGradientDto;
        this.blur = messagesConversationStyleBackgroundBlurDto;
    }

    public /* synthetic */ MessagesConversationStyleBackgroundVectorDto(MessagesConversationStyleBackgroundSvgDto messagesConversationStyleBackgroundSvgDto, List list, MessagesConversationStyleGradientDto messagesConversationStyleGradientDto, MessagesConversationStyleBackgroundBlurDto messagesConversationStyleBackgroundBlurDto, int i, zcl zclVar) {
        this((i & 1) != 0 ? null : messagesConversationStyleBackgroundSvgDto, (i & 2) != 0 ? null : list, (i & 4) != 0 ? null : messagesConversationStyleGradientDto, (i & 8) != 0 ? null : messagesConversationStyleBackgroundBlurDto);
    }
}
