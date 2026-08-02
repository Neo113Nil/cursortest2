package com.vk.api.generated.messagesEdu.dto;

import android.os.Parcel;
import android.os.Parcelable;
import com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import xsna.ao;
import xsna.en;
import xsna.epx;
import xsna.fw3;
import xsna.ho8;
import xsna.pmi0;
import xsna.zcl;

/* compiled from: MessagesEduTransitionOnboardingBannerDto.kt */
/* loaded from: classes15.dex */
public final class MessagesEduTransitionOnboardingBannerDto implements Parcelable {
    public static final Parcelable.Creator<MessagesEduTransitionOnboardingBannerDto> CREATOR = new a();

    @pmi0("collapsed_text")
    private final String collapsedText;

    @pmi0(HandleInvocationsFromAdViewer.KEY_PRIVACY_UPDATE_CONTENT)
    private final List<MessagesEduTransitionOnboardingBannerContentDto> content;

    @pmi0("id")
    private final String id;

    @pmi0("show_rule")
    private final MessagesEduTransitionOnboardingBannerShowRuleDto showRule;

    /* compiled from: MessagesEduTransitionOnboardingBannerDto.kt */
    public static final class a implements Parcelable.Creator<MessagesEduTransitionOnboardingBannerDto> {
        @Override // android.os.Parcelable.Creator
        public final MessagesEduTransitionOnboardingBannerDto createFromParcel(Parcel parcel) {
            String readString = parcel.readString();
            int readInt = parcel.readInt();
            ArrayList arrayList = new ArrayList(readInt);
            int i = 0;
            while (i != readInt) {
                i = en.a(MessagesEduTransitionOnboardingBannerContentDto.CREATOR, parcel, arrayList, i, 1);
            }
            return new MessagesEduTransitionOnboardingBannerDto(readString, arrayList, parcel.readInt() == 0 ? null : MessagesEduTransitionOnboardingBannerShowRuleDto.CREATOR.createFromParcel(parcel), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final MessagesEduTransitionOnboardingBannerDto[] newArray(int i) {
            return new MessagesEduTransitionOnboardingBannerDto[i];
        }
    }

    public MessagesEduTransitionOnboardingBannerDto(String str, List<MessagesEduTransitionOnboardingBannerContentDto> list, MessagesEduTransitionOnboardingBannerShowRuleDto messagesEduTransitionOnboardingBannerShowRuleDto, String str2) {
        this.id = str;
        this.content = list;
        this.showRule = messagesEduTransitionOnboardingBannerShowRuleDto;
        this.collapsedText = str2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MessagesEduTransitionOnboardingBannerDto)) {
            return false;
        }
        MessagesEduTransitionOnboardingBannerDto messagesEduTransitionOnboardingBannerDto = (MessagesEduTransitionOnboardingBannerDto) obj;
        return epx.f(this.id, messagesEduTransitionOnboardingBannerDto.id) && epx.f(this.content, messagesEduTransitionOnboardingBannerDto.content) && epx.f(this.showRule, messagesEduTransitionOnboardingBannerDto.showRule) && epx.f(this.collapsedText, messagesEduTransitionOnboardingBannerDto.collapsedText);
    }

    public final int hashCode() {
        int a2 = fw3.a(this.id.hashCode() * 31, 31, this.content);
        MessagesEduTransitionOnboardingBannerShowRuleDto messagesEduTransitionOnboardingBannerShowRuleDto = this.showRule;
        int hashCode = (a2 + (messagesEduTransitionOnboardingBannerShowRuleDto == null ? 0 : messagesEduTransitionOnboardingBannerShowRuleDto.hashCode())) * 31;
        String str = this.collapsedText;
        return hashCode + (str != null ? str.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("MessagesEduTransitionOnboardingBannerDto(id=");
        sb.append(this.id);
        sb.append(", content=");
        sb.append(this.content);
        sb.append(", showRule=");
        sb.append(this.showRule);
        sb.append(", collapsedText=");
        return ho8.a(sb, this.collapsedText, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.id);
        Iterator a2 = ao.a(parcel, this.content);
        while (a2.hasNext()) {
            ((MessagesEduTransitionOnboardingBannerContentDto) a2.next()).writeToParcel(parcel, i);
        }
        MessagesEduTransitionOnboardingBannerShowRuleDto messagesEduTransitionOnboardingBannerShowRuleDto = this.showRule;
        if (messagesEduTransitionOnboardingBannerShowRuleDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            messagesEduTransitionOnboardingBannerShowRuleDto.writeToParcel(parcel, i);
        }
        parcel.writeString(this.collapsedText);
    }

    public /* synthetic */ MessagesEduTransitionOnboardingBannerDto(String str, List list, MessagesEduTransitionOnboardingBannerShowRuleDto messagesEduTransitionOnboardingBannerShowRuleDto, String str2, int i, zcl zclVar) {
        this(str, list, (i & 4) != 0 ? null : messagesEduTransitionOnboardingBannerShowRuleDto, (i & 8) != 0 ? null : str2);
    }
}
