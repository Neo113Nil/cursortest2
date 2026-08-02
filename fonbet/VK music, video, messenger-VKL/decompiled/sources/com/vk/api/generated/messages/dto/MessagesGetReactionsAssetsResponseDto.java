package com.vk.api.generated.messages.dto;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import xsna.ao;
import xsna.dn;
import xsna.en;
import xsna.epx;
import xsna.fw3;
import xsna.pm0;
import xsna.pmi0;
import xsna.zcl;

/* compiled from: MessagesGetReactionsAssetsResponseDto.kt */
/* loaded from: classes15.dex */
public final class MessagesGetReactionsAssetsResponseDto implements Parcelable {
    public static final Parcelable.Creator<MessagesGetReactionsAssetsResponseDto> CREATOR = new a();

    @pmi0("assets")
    private final List<MessagesReactionAssetItemDto> assets;

    @pmi0("channel_paid_reaction")
    private final MessagesReactionAssetItemLinksDto channelPaidReaction;

    @pmi0("override_assets")
    private final List<MessagesReactionAssetItemDto> overrideAssets;

    @pmi0("reaction_ids")
    private final List<Integer> reactionIds;

    @pmi0("version")
    private final int version;

    /* compiled from: MessagesGetReactionsAssetsResponseDto.kt */
    public static final class a implements Parcelable.Creator<MessagesGetReactionsAssetsResponseDto> {
        @Override // android.os.Parcelable.Creator
        public final MessagesGetReactionsAssetsResponseDto createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            int readInt = parcel.readInt();
            int readInt2 = parcel.readInt();
            ArrayList arrayList2 = new ArrayList(readInt2);
            int i = 0;
            while (i != readInt2) {
                i = en.a(MessagesReactionAssetItemDto.CREATOR, parcel, arrayList2, i, 1);
            }
            int readInt3 = parcel.readInt();
            int i2 = 0;
            ArrayList arrayList3 = new ArrayList(readInt3);
            int i3 = 0;
            while (i3 != readInt3) {
                i3 = pm0.b(parcel, arrayList3, i3, 1);
            }
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int readInt4 = parcel.readInt();
                ArrayList arrayList4 = new ArrayList(readInt4);
                while (i2 != readInt4) {
                    i2 = en.a(MessagesReactionAssetItemDto.CREATOR, parcel, arrayList4, i2, 1);
                }
                arrayList = arrayList4;
            }
            return new MessagesGetReactionsAssetsResponseDto(readInt, arrayList2, arrayList3, arrayList, parcel.readInt() != 0 ? MessagesReactionAssetItemLinksDto.CREATOR.createFromParcel(parcel) : null);
        }

        @Override // android.os.Parcelable.Creator
        public final MessagesGetReactionsAssetsResponseDto[] newArray(int i) {
            return new MessagesGetReactionsAssetsResponseDto[i];
        }
    }

    public MessagesGetReactionsAssetsResponseDto(int i, List<MessagesReactionAssetItemDto> list, List<Integer> list2, List<MessagesReactionAssetItemDto> list3, MessagesReactionAssetItemLinksDto messagesReactionAssetItemLinksDto) {
        this.version = i;
        this.assets = list;
        this.reactionIds = list2;
        this.overrideAssets = list3;
        this.channelPaidReaction = messagesReactionAssetItemLinksDto;
    }

    public final List<MessagesReactionAssetItemDto> d() {
        return this.assets;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final MessagesReactionAssetItemLinksDto e() {
        return this.channelPaidReaction;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MessagesGetReactionsAssetsResponseDto)) {
            return false;
        }
        MessagesGetReactionsAssetsResponseDto messagesGetReactionsAssetsResponseDto = (MessagesGetReactionsAssetsResponseDto) obj;
        return this.version == messagesGetReactionsAssetsResponseDto.version && epx.f(this.assets, messagesGetReactionsAssetsResponseDto.assets) && epx.f(this.reactionIds, messagesGetReactionsAssetsResponseDto.reactionIds) && epx.f(this.overrideAssets, messagesGetReactionsAssetsResponseDto.overrideAssets) && epx.f(this.channelPaidReaction, messagesGetReactionsAssetsResponseDto.channelPaidReaction);
    }

    public final List<MessagesReactionAssetItemDto> f() {
        return this.overrideAssets;
    }

    public final List<Integer> g() {
        return this.reactionIds;
    }

    public final int hashCode() {
        int a2 = fw3.a(fw3.a(Integer.hashCode(this.version) * 31, 31, this.assets), 31, this.reactionIds);
        List<MessagesReactionAssetItemDto> list = this.overrideAssets;
        int hashCode = (a2 + (list == null ? 0 : list.hashCode())) * 31;
        MessagesReactionAssetItemLinksDto messagesReactionAssetItemLinksDto = this.channelPaidReaction;
        return hashCode + (messagesReactionAssetItemLinksDto != null ? messagesReactionAssetItemLinksDto.hashCode() : 0);
    }

    public final int i() {
        return this.version;
    }

    public final String toString() {
        return "MessagesGetReactionsAssetsResponseDto(version=" + this.version + ", assets=" + this.assets + ", reactionIds=" + this.reactionIds + ", overrideAssets=" + this.overrideAssets + ", channelPaidReaction=" + this.channelPaidReaction + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.version);
        Iterator a2 = ao.a(parcel, this.assets);
        while (a2.hasNext()) {
            ((MessagesReactionAssetItemDto) a2.next()).writeToParcel(parcel, i);
        }
        Iterator a3 = ao.a(parcel, this.reactionIds);
        while (a3.hasNext()) {
            parcel.writeInt(((Number) a3.next()).intValue());
        }
        List<MessagesReactionAssetItemDto> list = this.overrideAssets;
        if (list == null) {
            parcel.writeInt(0);
        } else {
            Iterator f = dn.f(parcel, list, 1);
            while (f.hasNext()) {
                ((MessagesReactionAssetItemDto) f.next()).writeToParcel(parcel, i);
            }
        }
        MessagesReactionAssetItemLinksDto messagesReactionAssetItemLinksDto = this.channelPaidReaction;
        if (messagesReactionAssetItemLinksDto == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            messagesReactionAssetItemLinksDto.writeToParcel(parcel, i);
        }
    }

    public /* synthetic */ MessagesGetReactionsAssetsResponseDto(int i, List list, List list2, List list3, MessagesReactionAssetItemLinksDto messagesReactionAssetItemLinksDto, int i2, zcl zclVar) {
        this(i, list, list2, (i2 & 8) != 0 ? null : list3, (i2 & 16) != 0 ? null : messagesReactionAssetItemLinksDto);
    }
}
