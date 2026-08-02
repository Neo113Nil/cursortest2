package com.vk.api.generated.messages.dto;

import android.os.Parcel;
import android.os.Parcelable;
import com.ironsource.mediationsdk.logger.IronSourceError;
import io.reactivex.rxjava3.subjects.b;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import ru.ok.android.webrtc.signaling.api.SignalingProtocol;
import xsna.dn;
import xsna.en;
import xsna.epx;
import xsna.k73;
import xsna.pmi0;
import xsna.sn;
import xsna.tn;
import xsna.zcl;

/* compiled from: MessagesConversationInfoDto.kt */
/* loaded from: classes15.dex */
public final class MessagesConversationInfoDto implements Parcelable {
    public static final Parcelable.Creator<MessagesConversationInfoDto> CREATOR = new a();

    @pmi0("cmids_flags")
    private final List<MessagesUpdatedCmidDto> cmidsFlags;

    @pmi0("cmids_updated_reactions")
    private final List<Long> cmidsUpdatedReactions;

    @pmi0("contact_id")
    private final Long contactId;

    @pmi0(SignalingProtocol.KEY_CONVERSATION)
    private final MessagesConversationDto conversation;

    @pmi0("conversation_diff")
    private final MessagesConversationDiffDto conversationDiff;

    @pmi0("invalidate")
    private final Boolean invalidate;

    @pmi0("members_changed")
    private final Boolean membersChanged;

    @pmi0("message")
    private final List<MessagesMessageDto> message;

    @pmi0("range_deleted_cmids")
    private final List<MessagesRangeDto> rangeDeletedCmids;

    @pmi0("range_updated_cmids")
    private final List<MessagesRangeDto> rangeUpdatedCmids;

    /* compiled from: MessagesConversationInfoDto.kt */
    public static final class a implements Parcelable.Creator<MessagesConversationInfoDto> {
        @Override // android.os.Parcelable.Creator
        public final MessagesConversationInfoDto createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            ArrayList arrayList2;
            ArrayList arrayList3;
            Boolean valueOf;
            ArrayList arrayList4;
            ArrayList arrayList5;
            Boolean bool = null;
            MessagesConversationDiffDto createFromParcel = parcel.readInt() == 0 ? null : MessagesConversationDiffDto.CREATOR.createFromParcel(parcel);
            MessagesConversationDto createFromParcel2 = parcel.readInt() == 0 ? null : MessagesConversationDto.CREATOR.createFromParcel(parcel);
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int readInt = parcel.readInt();
                arrayList = new ArrayList(readInt);
                int i = 0;
                while (i != readInt) {
                    i = en.a(MessagesRangeDto.CREATOR, parcel, arrayList, i, 1);
                }
            }
            if (parcel.readInt() == 0) {
                arrayList2 = null;
            } else {
                int readInt2 = parcel.readInt();
                arrayList2 = new ArrayList(readInt2);
                int i2 = 0;
                while (i2 != readInt2) {
                    i2 = en.a(MessagesRangeDto.CREATOR, parcel, arrayList2, i2, 1);
                }
            }
            if (parcel.readInt() == 0) {
                arrayList3 = null;
            } else {
                int readInt3 = parcel.readInt();
                arrayList3 = new ArrayList(readInt3);
                int i3 = 0;
                while (i3 != readInt3) {
                    i3 = en.a(MessagesUpdatedCmidDto.CREATOR, parcel, arrayList3, i3, 1);
                }
            }
            if (parcel.readInt() == 0) {
                valueOf = null;
            } else {
                valueOf = Boolean.valueOf(parcel.readInt() != 0);
            }
            if (parcel.readInt() == 0) {
                arrayList4 = null;
            } else {
                int readInt4 = parcel.readInt();
                ArrayList arrayList6 = new ArrayList(readInt4);
                int i4 = 0;
                while (i4 != readInt4) {
                    i4 = en.a(MessagesMessageDto.CREATOR, parcel, arrayList6, i4, 1);
                }
                arrayList4 = arrayList6;
            }
            if (parcel.readInt() == 0) {
                arrayList5 = null;
            } else {
                int readInt5 = parcel.readInt();
                ArrayList arrayList7 = new ArrayList(readInt5);
                int i5 = 0;
                while (i5 != readInt5) {
                    i5 = k73.b(parcel, arrayList7, i5, 1);
                }
                arrayList5 = arrayList7;
            }
            Long valueOf2 = parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong());
            if (parcel.readInt() != 0) {
                bool = Boolean.valueOf(parcel.readInt() != 0);
            }
            return new MessagesConversationInfoDto(createFromParcel, createFromParcel2, arrayList, arrayList2, arrayList3, valueOf, arrayList4, arrayList5, valueOf2, bool);
        }

        @Override // android.os.Parcelable.Creator
        public final MessagesConversationInfoDto[] newArray(int i) {
            return new MessagesConversationInfoDto[i];
        }
    }

    public MessagesConversationInfoDto() {
        this(null, null, null, null, null, null, null, null, null, null, IronSourceError.ERROR_RV_SHOW_CALLED_WRONG_STATE, null);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MessagesConversationInfoDto)) {
            return false;
        }
        MessagesConversationInfoDto messagesConversationInfoDto = (MessagesConversationInfoDto) obj;
        return epx.f(this.conversationDiff, messagesConversationInfoDto.conversationDiff) && epx.f(this.conversation, messagesConversationInfoDto.conversation) && epx.f(this.rangeDeletedCmids, messagesConversationInfoDto.rangeDeletedCmids) && epx.f(this.rangeUpdatedCmids, messagesConversationInfoDto.rangeUpdatedCmids) && epx.f(this.cmidsFlags, messagesConversationInfoDto.cmidsFlags) && epx.f(this.invalidate, messagesConversationInfoDto.invalidate) && epx.f(this.message, messagesConversationInfoDto.message) && epx.f(this.cmidsUpdatedReactions, messagesConversationInfoDto.cmidsUpdatedReactions) && epx.f(this.contactId, messagesConversationInfoDto.contactId) && epx.f(this.membersChanged, messagesConversationInfoDto.membersChanged);
    }

    public final int hashCode() {
        MessagesConversationDiffDto messagesConversationDiffDto = this.conversationDiff;
        int hashCode = (messagesConversationDiffDto == null ? 0 : messagesConversationDiffDto.hashCode()) * 31;
        MessagesConversationDto messagesConversationDto = this.conversation;
        int hashCode2 = (hashCode + (messagesConversationDto == null ? 0 : messagesConversationDto.hashCode())) * 31;
        List<MessagesRangeDto> list = this.rangeDeletedCmids;
        int hashCode3 = (hashCode2 + (list == null ? 0 : list.hashCode())) * 31;
        List<MessagesRangeDto> list2 = this.rangeUpdatedCmids;
        int hashCode4 = (hashCode3 + (list2 == null ? 0 : list2.hashCode())) * 31;
        List<MessagesUpdatedCmidDto> list3 = this.cmidsFlags;
        int hashCode5 = (hashCode4 + (list3 == null ? 0 : list3.hashCode())) * 31;
        Boolean bool = this.invalidate;
        int hashCode6 = (hashCode5 + (bool == null ? 0 : bool.hashCode())) * 31;
        List<MessagesMessageDto> list4 = this.message;
        int hashCode7 = (hashCode6 + (list4 == null ? 0 : list4.hashCode())) * 31;
        List<Long> list5 = this.cmidsUpdatedReactions;
        int hashCode8 = (hashCode7 + (list5 == null ? 0 : list5.hashCode())) * 31;
        Long l = this.contactId;
        int hashCode9 = (hashCode8 + (l == null ? 0 : l.hashCode())) * 31;
        Boolean bool2 = this.membersChanged;
        return hashCode9 + (bool2 != null ? bool2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("MessagesConversationInfoDto(conversationDiff=");
        sb.append(this.conversationDiff);
        sb.append(", conversation=");
        sb.append(this.conversation);
        sb.append(", rangeDeletedCmids=");
        sb.append(this.rangeDeletedCmids);
        sb.append(", rangeUpdatedCmids=");
        sb.append(this.rangeUpdatedCmids);
        sb.append(", cmidsFlags=");
        sb.append(this.cmidsFlags);
        sb.append(", invalidate=");
        sb.append(this.invalidate);
        sb.append(", message=");
        sb.append(this.message);
        sb.append(", cmidsUpdatedReactions=");
        sb.append(this.cmidsUpdatedReactions);
        sb.append(", contactId=");
        sb.append(this.contactId);
        sb.append(", membersChanged=");
        return tn.a(sb, this.membersChanged, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        MessagesConversationDiffDto messagesConversationDiffDto = this.conversationDiff;
        if (messagesConversationDiffDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            messagesConversationDiffDto.writeToParcel(parcel, i);
        }
        MessagesConversationDto messagesConversationDto = this.conversation;
        if (messagesConversationDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            messagesConversationDto.writeToParcel(parcel, i);
        }
        List<MessagesRangeDto> list = this.rangeDeletedCmids;
        if (list == null) {
            parcel.writeInt(0);
        } else {
            Iterator f = dn.f(parcel, list, 1);
            while (f.hasNext()) {
                ((MessagesRangeDto) f.next()).writeToParcel(parcel, i);
            }
        }
        List<MessagesRangeDto> list2 = this.rangeUpdatedCmids;
        if (list2 == null) {
            parcel.writeInt(0);
        } else {
            Iterator f2 = dn.f(parcel, list2, 1);
            while (f2.hasNext()) {
                ((MessagesRangeDto) f2.next()).writeToParcel(parcel, i);
            }
        }
        List<MessagesUpdatedCmidDto> list3 = this.cmidsFlags;
        if (list3 == null) {
            parcel.writeInt(0);
        } else {
            Iterator f3 = dn.f(parcel, list3, 1);
            while (f3.hasNext()) {
                ((MessagesUpdatedCmidDto) f3.next()).writeToParcel(parcel, i);
            }
        }
        Boolean bool = this.invalidate;
        if (bool == null) {
            parcel.writeInt(0);
        } else {
            sn.f(parcel, 1, bool);
        }
        List<MessagesMessageDto> list4 = this.message;
        if (list4 == null) {
            parcel.writeInt(0);
        } else {
            Iterator f4 = dn.f(parcel, list4, 1);
            while (f4.hasNext()) {
                ((MessagesMessageDto) f4.next()).writeToParcel(parcel, i);
            }
        }
        List<Long> list5 = this.cmidsUpdatedReactions;
        if (list5 == null) {
            parcel.writeInt(0);
        } else {
            Iterator f5 = dn.f(parcel, list5, 1);
            while (f5.hasNext()) {
                parcel.writeLong(((Number) f5.next()).longValue());
            }
        }
        Long l = this.contactId;
        if (l == null) {
            parcel.writeInt(0);
        } else {
            b.f(parcel, 1, l);
        }
        Boolean bool2 = this.membersChanged;
        if (bool2 == null) {
            parcel.writeInt(0);
        } else {
            sn.f(parcel, 1, bool2);
        }
    }

    public MessagesConversationInfoDto(MessagesConversationDiffDto messagesConversationDiffDto, MessagesConversationDto messagesConversationDto, List<MessagesRangeDto> list, List<MessagesRangeDto> list2, List<MessagesUpdatedCmidDto> list3, Boolean bool, List<MessagesMessageDto> list4, List<Long> list5, Long l, Boolean bool2) {
        this.conversationDiff = messagesConversationDiffDto;
        this.conversation = messagesConversationDto;
        this.rangeDeletedCmids = list;
        this.rangeUpdatedCmids = list2;
        this.cmidsFlags = list3;
        this.invalidate = bool;
        this.message = list4;
        this.cmidsUpdatedReactions = list5;
        this.contactId = l;
        this.membersChanged = bool2;
    }

    public /* synthetic */ MessagesConversationInfoDto(MessagesConversationDiffDto messagesConversationDiffDto, MessagesConversationDto messagesConversationDto, List list, List list2, List list3, Boolean bool, List list4, List list5, Long l, Boolean bool2, int i, zcl zclVar) {
        this((i & 1) != 0 ? null : messagesConversationDiffDto, (i & 2) != 0 ? null : messagesConversationDto, (i & 4) != 0 ? null : list, (i & 8) != 0 ? null : list2, (i & 16) != 0 ? null : list3, (i & 32) != 0 ? null : bool, (i & 64) != 0 ? null : list4, (i & 128) != 0 ? null : list5, (i & 256) != 0 ? null : l, (i & 512) != 0 ? null : bool2);
    }
}
