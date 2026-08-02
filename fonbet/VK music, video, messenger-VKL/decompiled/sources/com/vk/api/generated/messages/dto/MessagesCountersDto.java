package com.vk.api.generated.messages.dto;

import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.soloader.MinElf;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import ru.ok.android.webrtc.stat.listener.mapper.RTCStatsConstants;
import xsna.dn;
import xsna.en;
import xsna.epx;
import xsna.nr;
import xsna.pmi0;
import xsna.zcl;

/* compiled from: MessagesCountersDto.kt */
/* loaded from: classes15.dex */
public final class MessagesCountersDto implements Parcelable {
    public static final Parcelable.Creator<MessagesCountersDto> CREATOR = new a();

    @pmi0("ad_tag")
    private final Integer adTag;

    @pmi0("business_notify")
    private final Integer businessNotify;

    @pmi0("business_notify_all")
    private final Integer businessNotifyAll;

    @pmi0("calls")
    private final Integer calls;

    @pmi0(RTCStatsConstants.KEY_CHANNELS)
    private final MessagesChannelsCounterDto channels;

    @pmi0("groups_folder")
    private final MessagesGroupsFolderCountersDto groupsFolder;

    @pmi0("important")
    private final Integer important;

    @pmi0("message_requests")
    private final Integer messageRequests;

    @pmi0("messages")
    private final Integer messages;

    @pmi0("messages_archive")
    private final Integer messagesArchive;

    @pmi0("messages_archive_mentions_count")
    private final Integer messagesArchiveMentionsCount;

    @pmi0("messages_archive_unread")
    private final Integer messagesArchiveUnread;

    @pmi0("messages_archive_unread_unmuted")
    private final Integer messagesArchiveUnreadUnmuted;

    @pmi0("messages_folders")
    private final List<MessagesFoldersCounterItemDto> messagesFolders;

    @pmi0("messages_unread_unmuted")
    private final Integer messagesUnreadUnmuted;

    @pmi0("unanswered")
    private final Integer unanswered;

    /* compiled from: MessagesCountersDto.kt */
    public static final class a implements Parcelable.Creator<MessagesCountersDto> {
        @Override // android.os.Parcelable.Creator
        public final MessagesCountersDto createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            Integer valueOf = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            Integer valueOf2 = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            Integer valueOf3 = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            Integer valueOf4 = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            Integer valueOf5 = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            Integer valueOf6 = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            Integer valueOf7 = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int readInt = parcel.readInt();
                ArrayList arrayList2 = new ArrayList(readInt);
                int i = 0;
                while (i != readInt) {
                    i = en.a(MessagesFoldersCounterItemDto.CREATOR, parcel, arrayList2, i, 1);
                }
                arrayList = arrayList2;
            }
            return new MessagesCountersDto(valueOf, valueOf2, valueOf3, valueOf4, valueOf5, valueOf6, valueOf7, arrayList, parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readInt() == 0 ? null : MessagesChannelsCounterDto.CREATOR.createFromParcel(parcel), parcel.readInt() != 0 ? MessagesGroupsFolderCountersDto.CREATOR.createFromParcel(parcel) : null);
        }

        @Override // android.os.Parcelable.Creator
        public final MessagesCountersDto[] newArray(int i) {
            return new MessagesCountersDto[i];
        }
    }

    public MessagesCountersDto() {
        this(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, MinElf.PN_XNUM, null);
    }

    public final Integer d() {
        return this.businessNotify;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final Integer e() {
        return this.businessNotifyAll;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MessagesCountersDto)) {
            return false;
        }
        MessagesCountersDto messagesCountersDto = (MessagesCountersDto) obj;
        return epx.f(this.messages, messagesCountersDto.messages) && epx.f(this.messageRequests, messagesCountersDto.messageRequests) && epx.f(this.messagesArchive, messagesCountersDto.messagesArchive) && epx.f(this.messagesArchiveUnread, messagesCountersDto.messagesArchiveUnread) && epx.f(this.messagesArchiveUnreadUnmuted, messagesCountersDto.messagesArchiveUnreadUnmuted) && epx.f(this.messagesArchiveMentionsCount, messagesCountersDto.messagesArchiveMentionsCount) && epx.f(this.messagesUnreadUnmuted, messagesCountersDto.messagesUnreadUnmuted) && epx.f(this.messagesFolders, messagesCountersDto.messagesFolders) && epx.f(this.calls, messagesCountersDto.calls) && epx.f(this.businessNotify, messagesCountersDto.businessNotify) && epx.f(this.businessNotifyAll, messagesCountersDto.businessNotifyAll) && epx.f(this.important, messagesCountersDto.important) && epx.f(this.unanswered, messagesCountersDto.unanswered) && epx.f(this.adTag, messagesCountersDto.adTag) && epx.f(this.channels, messagesCountersDto.channels) && epx.f(this.groupsFolder, messagesCountersDto.groupsFolder);
    }

    public final MessagesChannelsCounterDto f() {
        return this.channels;
    }

    public final MessagesGroupsFolderCountersDto g() {
        return this.groupsFolder;
    }

    public final int hashCode() {
        Integer num = this.messages;
        int hashCode = (num == null ? 0 : num.hashCode()) * 31;
        Integer num2 = this.messageRequests;
        int hashCode2 = (hashCode + (num2 == null ? 0 : num2.hashCode())) * 31;
        Integer num3 = this.messagesArchive;
        int hashCode3 = (hashCode2 + (num3 == null ? 0 : num3.hashCode())) * 31;
        Integer num4 = this.messagesArchiveUnread;
        int hashCode4 = (hashCode3 + (num4 == null ? 0 : num4.hashCode())) * 31;
        Integer num5 = this.messagesArchiveUnreadUnmuted;
        int hashCode5 = (hashCode4 + (num5 == null ? 0 : num5.hashCode())) * 31;
        Integer num6 = this.messagesArchiveMentionsCount;
        int hashCode6 = (hashCode5 + (num6 == null ? 0 : num6.hashCode())) * 31;
        Integer num7 = this.messagesUnreadUnmuted;
        int hashCode7 = (hashCode6 + (num7 == null ? 0 : num7.hashCode())) * 31;
        List<MessagesFoldersCounterItemDto> list = this.messagesFolders;
        int hashCode8 = (hashCode7 + (list == null ? 0 : list.hashCode())) * 31;
        Integer num8 = this.calls;
        int hashCode9 = (hashCode8 + (num8 == null ? 0 : num8.hashCode())) * 31;
        Integer num9 = this.businessNotify;
        int hashCode10 = (hashCode9 + (num9 == null ? 0 : num9.hashCode())) * 31;
        Integer num10 = this.businessNotifyAll;
        int hashCode11 = (hashCode10 + (num10 == null ? 0 : num10.hashCode())) * 31;
        Integer num11 = this.important;
        int hashCode12 = (hashCode11 + (num11 == null ? 0 : num11.hashCode())) * 31;
        Integer num12 = this.unanswered;
        int hashCode13 = (hashCode12 + (num12 == null ? 0 : num12.hashCode())) * 31;
        Integer num13 = this.adTag;
        int hashCode14 = (hashCode13 + (num13 == null ? 0 : num13.hashCode())) * 31;
        MessagesChannelsCounterDto messagesChannelsCounterDto = this.channels;
        int hashCode15 = (hashCode14 + (messagesChannelsCounterDto == null ? 0 : messagesChannelsCounterDto.hashCode())) * 31;
        MessagesGroupsFolderCountersDto messagesGroupsFolderCountersDto = this.groupsFolder;
        return hashCode15 + (messagesGroupsFolderCountersDto != null ? messagesGroupsFolderCountersDto.hashCode() : 0);
    }

    public final Integer i() {
        return this.messageRequests;
    }

    public final Integer j() {
        return this.messages;
    }

    public final Integer k() {
        return this.messagesArchive;
    }

    public final Integer l() {
        return this.messagesArchiveMentionsCount;
    }

    public final Integer n() {
        return this.messagesArchiveUnread;
    }

    public final Integer o() {
        return this.messagesArchiveUnreadUnmuted;
    }

    public final List<MessagesFoldersCounterItemDto> p() {
        return this.messagesFolders;
    }

    public final String toString() {
        return "MessagesCountersDto(messages=" + this.messages + ", messageRequests=" + this.messageRequests + ", messagesArchive=" + this.messagesArchive + ", messagesArchiveUnread=" + this.messagesArchiveUnread + ", messagesArchiveUnreadUnmuted=" + this.messagesArchiveUnreadUnmuted + ", messagesArchiveMentionsCount=" + this.messagesArchiveMentionsCount + ", messagesUnreadUnmuted=" + this.messagesUnreadUnmuted + ", messagesFolders=" + this.messagesFolders + ", calls=" + this.calls + ", businessNotify=" + this.businessNotify + ", businessNotifyAll=" + this.businessNotifyAll + ", important=" + this.important + ", unanswered=" + this.unanswered + ", adTag=" + this.adTag + ", channels=" + this.channels + ", groupsFolder=" + this.groupsFolder + ')';
    }

    public final Integer u() {
        return this.messagesUnreadUnmuted;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        Integer num = this.messages;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            nr.a(parcel, 1, num);
        }
        Integer num2 = this.messageRequests;
        if (num2 == null) {
            parcel.writeInt(0);
        } else {
            nr.a(parcel, 1, num2);
        }
        Integer num3 = this.messagesArchive;
        if (num3 == null) {
            parcel.writeInt(0);
        } else {
            nr.a(parcel, 1, num3);
        }
        Integer num4 = this.messagesArchiveUnread;
        if (num4 == null) {
            parcel.writeInt(0);
        } else {
            nr.a(parcel, 1, num4);
        }
        Integer num5 = this.messagesArchiveUnreadUnmuted;
        if (num5 == null) {
            parcel.writeInt(0);
        } else {
            nr.a(parcel, 1, num5);
        }
        Integer num6 = this.messagesArchiveMentionsCount;
        if (num6 == null) {
            parcel.writeInt(0);
        } else {
            nr.a(parcel, 1, num6);
        }
        Integer num7 = this.messagesUnreadUnmuted;
        if (num7 == null) {
            parcel.writeInt(0);
        } else {
            nr.a(parcel, 1, num7);
        }
        List<MessagesFoldersCounterItemDto> list = this.messagesFolders;
        if (list == null) {
            parcel.writeInt(0);
        } else {
            Iterator f = dn.f(parcel, list, 1);
            while (f.hasNext()) {
                ((MessagesFoldersCounterItemDto) f.next()).writeToParcel(parcel, i);
            }
        }
        Integer num8 = this.calls;
        if (num8 == null) {
            parcel.writeInt(0);
        } else {
            nr.a(parcel, 1, num8);
        }
        Integer num9 = this.businessNotify;
        if (num9 == null) {
            parcel.writeInt(0);
        } else {
            nr.a(parcel, 1, num9);
        }
        Integer num10 = this.businessNotifyAll;
        if (num10 == null) {
            parcel.writeInt(0);
        } else {
            nr.a(parcel, 1, num10);
        }
        Integer num11 = this.important;
        if (num11 == null) {
            parcel.writeInt(0);
        } else {
            nr.a(parcel, 1, num11);
        }
        Integer num12 = this.unanswered;
        if (num12 == null) {
            parcel.writeInt(0);
        } else {
            nr.a(parcel, 1, num12);
        }
        Integer num13 = this.adTag;
        if (num13 == null) {
            parcel.writeInt(0);
        } else {
            nr.a(parcel, 1, num13);
        }
        MessagesChannelsCounterDto messagesChannelsCounterDto = this.channels;
        if (messagesChannelsCounterDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            messagesChannelsCounterDto.writeToParcel(parcel, i);
        }
        MessagesGroupsFolderCountersDto messagesGroupsFolderCountersDto = this.groupsFolder;
        if (messagesGroupsFolderCountersDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            messagesGroupsFolderCountersDto.writeToParcel(parcel, i);
        }
    }

    public MessagesCountersDto(Integer num, Integer num2, Integer num3, Integer num4, Integer num5, Integer num6, Integer num7, List<MessagesFoldersCounterItemDto> list, Integer num8, Integer num9, Integer num10, Integer num11, Integer num12, Integer num13, MessagesChannelsCounterDto messagesChannelsCounterDto, MessagesGroupsFolderCountersDto messagesGroupsFolderCountersDto) {
        this.messages = num;
        this.messageRequests = num2;
        this.messagesArchive = num3;
        this.messagesArchiveUnread = num4;
        this.messagesArchiveUnreadUnmuted = num5;
        this.messagesArchiveMentionsCount = num6;
        this.messagesUnreadUnmuted = num7;
        this.messagesFolders = list;
        this.calls = num8;
        this.businessNotify = num9;
        this.businessNotifyAll = num10;
        this.important = num11;
        this.unanswered = num12;
        this.adTag = num13;
        this.channels = messagesChannelsCounterDto;
        this.groupsFolder = messagesGroupsFolderCountersDto;
    }

    public /* synthetic */ MessagesCountersDto(Integer num, Integer num2, Integer num3, Integer num4, Integer num5, Integer num6, Integer num7, List list, Integer num8, Integer num9, Integer num10, Integer num11, Integer num12, Integer num13, MessagesChannelsCounterDto messagesChannelsCounterDto, MessagesGroupsFolderCountersDto messagesGroupsFolderCountersDto, int i, zcl zclVar) {
        this((i & 1) != 0 ? null : num, (i & 2) != 0 ? null : num2, (i & 4) != 0 ? null : num3, (i & 8) != 0 ? null : num4, (i & 16) != 0 ? null : num5, (i & 32) != 0 ? null : num6, (i & 64) != 0 ? null : num7, (i & 128) != 0 ? null : list, (i & 256) != 0 ? null : num8, (i & 512) != 0 ? null : num9, (i & 1024) != 0 ? null : num10, (i & 2048) != 0 ? null : num11, (i & 4096) != 0 ? null : num12, (i & 8192) != 0 ? null : num13, (i & 16384) != 0 ? null : messagesChannelsCounterDto, (i & 32768) != 0 ? null : messagesGroupsFolderCountersDto);
    }
}
