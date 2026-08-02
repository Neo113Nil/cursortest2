package com.vk.api.generated.vkRun.dto;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.gson.internal.bind.TreeTypeAdapter;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import xsna.a9y;
import xsna.ao;
import xsna.b9y;
import xsna.bo;
import xsna.epx;
import xsna.fw3;
import xsna.go9;
import xsna.ho8;
import xsna.pmi0;
import xsna.qoy;
import xsna.shy;
import xsna.up;
import xsna.z8y;
import xsna.zcl;

/* compiled from: VkRunTaskExtraDataDto.kt */
/* loaded from: classes15.dex */
public abstract class VkRunTaskExtraDataDto implements Parcelable {

    /* compiled from: VkRunTaskExtraDataDto.kt */
    public static final class Deserializer implements a9y<VkRunTaskExtraDataDto> {
        /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue
        java.lang.NullPointerException: Cannot invoke "java.util.List.iterator()" because the return value of "jadx.core.dex.visitors.regions.SwitchOverStringVisitor$SwitchData.getNewCases()" is null
        	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.restoreSwitchOverString(SwitchOverStringVisitor.java:109)
        	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visitRegion(SwitchOverStringVisitor.java:66)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:77)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:82)
         */
        @Override // xsna.a9y
        public final Object a(b9y b9yVar, z8y z8yVar) {
            String f = up.f(b9yVar, "type");
            if (f != null) {
                switch (f.hashCode()) {
                    case -2026704927:
                        if (f.equals("follow_url")) {
                            return (VkRunTaskExtraDataDto) ((TreeTypeAdapter.a) z8yVar).a(b9yVar, VkRunFollowUrlTaskExtraDataDto.class);
                        }
                        break;
                    case -89315269:
                        if (f.equals("join_health_community")) {
                            return (VkRunTaskExtraDataDto) ((TreeTypeAdapter.a) z8yVar).a(b9yVar, VkRunJoinCommunityTaskExtraDataDto.class);
                        }
                        break;
                    case 96632902:
                        if (f.equals("emoji")) {
                            return (VkRunTaskExtraDataDto) ((TreeTypeAdapter.a) z8yVar).a(b9yVar, VkRunEmojiTaskExtraDataDto.class);
                        }
                        break;
                    case 192271765:
                        if (f.equals("join_workouts_community")) {
                            return (VkRunTaskExtraDataDto) ((TreeTypeAdapter.a) z8yVar).a(b9yVar, VkRunJoinCommunityTaskExtraDataDto.class);
                        }
                        break;
                    case 303542655:
                        if (f.equals("join_fest_community")) {
                            return (VkRunTaskExtraDataDto) ((TreeTypeAdapter.a) z8yVar).a(b9yVar, VkRunJoinCommunityTaskExtraDataDto.class);
                        }
                        break;
                    case 545146259:
                        if (f.equals("watch_ad")) {
                            return (VkRunTaskExtraDataDto) ((TreeTypeAdapter.a) z8yVar).a(b9yVar, VkRunWatchAdTaskExtraDataDto.class);
                        }
                        break;
                    case 632157522:
                        if (f.equals("invite_users")) {
                            return (VkRunTaskExtraDataDto) ((TreeTypeAdapter.a) z8yVar).a(b9yVar, VkRunInviteUsersTaskExtraDataDto.class);
                        }
                        break;
                }
            }
            throw new IllegalStateException(go9.b("no mapping for the type:", f));
        }
    }

    /* compiled from: VkRunTaskExtraDataDto.kt */
    public static final class VkRunEmojiTaskExtraDataDto extends VkRunTaskExtraDataDto implements Parcelable {
        public static final Parcelable.Creator<VkRunEmojiTaskExtraDataDto> CREATOR = new a();

        @pmi0("id")
        private final int id;

        @pmi0("is_set")
        private final boolean isSet;

        @pmi0("type")
        private final String type;

        /* compiled from: VkRunTaskExtraDataDto.kt */
        public static final class a implements Parcelable.Creator<VkRunEmojiTaskExtraDataDto> {
            @Override // android.os.Parcelable.Creator
            public final VkRunEmojiTaskExtraDataDto createFromParcel(Parcel parcel) {
                return new VkRunEmojiTaskExtraDataDto(parcel.readInt(), parcel.readInt() != 0, parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final VkRunEmojiTaskExtraDataDto[] newArray(int i) {
                return new VkRunEmojiTaskExtraDataDto[i];
            }
        }

        public VkRunEmojiTaskExtraDataDto(int i, boolean z, String str) {
            super(null);
            this.id = i;
            this.isSet = z;
            this.type = str;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof VkRunEmojiTaskExtraDataDto)) {
                return false;
            }
            VkRunEmojiTaskExtraDataDto vkRunEmojiTaskExtraDataDto = (VkRunEmojiTaskExtraDataDto) obj;
            return this.id == vkRunEmojiTaskExtraDataDto.id && this.isSet == vkRunEmojiTaskExtraDataDto.isSet && epx.f(this.type, vkRunEmojiTaskExtraDataDto.type);
        }

        public final int hashCode() {
            return this.type.hashCode() + qoy.b(Integer.hashCode(this.id) * 31, 31, this.isSet);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("VkRunEmojiTaskExtraDataDto(id=");
            sb.append(this.id);
            sb.append(", isSet=");
            sb.append(this.isSet);
            sb.append(", type=");
            return ho8.a(sb, this.type, ')');
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.writeInt(this.id);
            parcel.writeInt(this.isSet ? 1 : 0);
            parcel.writeString(this.type);
        }
    }

    /* compiled from: VkRunTaskExtraDataDto.kt */
    public static final class VkRunFollowUrlTaskExtraDataDto extends VkRunTaskExtraDataDto implements Parcelable {
        public static final Parcelable.Creator<VkRunFollowUrlTaskExtraDataDto> CREATOR = new a();

        @pmi0("type")
        private final String type;

        @pmi0("url")
        private final String url;

        /* compiled from: VkRunTaskExtraDataDto.kt */
        public static final class a implements Parcelable.Creator<VkRunFollowUrlTaskExtraDataDto> {
            @Override // android.os.Parcelable.Creator
            public final VkRunFollowUrlTaskExtraDataDto createFromParcel(Parcel parcel) {
                return new VkRunFollowUrlTaskExtraDataDto(parcel.readString(), parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final VkRunFollowUrlTaskExtraDataDto[] newArray(int i) {
                return new VkRunFollowUrlTaskExtraDataDto[i];
            }
        }

        public VkRunFollowUrlTaskExtraDataDto(String str, String str2) {
            super(null);
            this.url = str;
            this.type = str2;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof VkRunFollowUrlTaskExtraDataDto)) {
                return false;
            }
            VkRunFollowUrlTaskExtraDataDto vkRunFollowUrlTaskExtraDataDto = (VkRunFollowUrlTaskExtraDataDto) obj;
            return epx.f(this.url, vkRunFollowUrlTaskExtraDataDto.url) && epx.f(this.type, vkRunFollowUrlTaskExtraDataDto.type);
        }

        public final int hashCode() {
            return this.type.hashCode() + (this.url.hashCode() * 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("VkRunFollowUrlTaskExtraDataDto(url=");
            sb.append(this.url);
            sb.append(", type=");
            return ho8.a(sb, this.type, ')');
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.writeString(this.url);
            parcel.writeString(this.type);
        }
    }

    /* compiled from: VkRunTaskExtraDataDto.kt */
    public static final class VkRunInviteUsersTaskExtraDataDto extends VkRunTaskExtraDataDto implements Parcelable {
        public static final Parcelable.Creator<VkRunInviteUsersTaskExtraDataDto> CREATOR = new a();

        @pmi0("count")
        private final int count;

        @pmi0("invited_users")
        private final List<VkRunLeaderboardMemberUserDto> invitedUsers;

        @pmi0("max_count")
        private final int maxCount;

        @pmi0("type")
        private final String type;

        /* compiled from: VkRunTaskExtraDataDto.kt */
        public static final class a implements Parcelable.Creator<VkRunInviteUsersTaskExtraDataDto> {
            @Override // android.os.Parcelable.Creator
            public final VkRunInviteUsersTaskExtraDataDto createFromParcel(Parcel parcel) {
                int readInt = parcel.readInt();
                int readInt2 = parcel.readInt();
                int readInt3 = parcel.readInt();
                ArrayList arrayList = new ArrayList(readInt3);
                int i = 0;
                while (i != readInt3) {
                    i = bo.b(VkRunInviteUsersTaskExtraDataDto.class, parcel, arrayList, i, 1);
                }
                return new VkRunInviteUsersTaskExtraDataDto(readInt, readInt2, arrayList, parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final VkRunInviteUsersTaskExtraDataDto[] newArray(int i) {
                return new VkRunInviteUsersTaskExtraDataDto[i];
            }
        }

        public VkRunInviteUsersTaskExtraDataDto(int i, int i2, List<VkRunLeaderboardMemberUserDto> list, String str) {
            super(null);
            this.maxCount = i;
            this.count = i2;
            this.invitedUsers = list;
            this.type = str;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof VkRunInviteUsersTaskExtraDataDto)) {
                return false;
            }
            VkRunInviteUsersTaskExtraDataDto vkRunInviteUsersTaskExtraDataDto = (VkRunInviteUsersTaskExtraDataDto) obj;
            return this.maxCount == vkRunInviteUsersTaskExtraDataDto.maxCount && this.count == vkRunInviteUsersTaskExtraDataDto.count && epx.f(this.invitedUsers, vkRunInviteUsersTaskExtraDataDto.invitedUsers) && epx.f(this.type, vkRunInviteUsersTaskExtraDataDto.type);
        }

        public final int hashCode() {
            return this.type.hashCode() + fw3.a(shy.a(this.count, Integer.hashCode(this.maxCount) * 31, 31), 31, this.invitedUsers);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("VkRunInviteUsersTaskExtraDataDto(maxCount=");
            sb.append(this.maxCount);
            sb.append(", count=");
            sb.append(this.count);
            sb.append(", invitedUsers=");
            sb.append(this.invitedUsers);
            sb.append(", type=");
            return ho8.a(sb, this.type, ')');
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.writeInt(this.maxCount);
            parcel.writeInt(this.count);
            Iterator a2 = ao.a(parcel, this.invitedUsers);
            while (a2.hasNext()) {
                parcel.writeParcelable((Parcelable) a2.next(), i);
            }
            parcel.writeString(this.type);
        }
    }

    /* compiled from: VkRunTaskExtraDataDto.kt */
    public static final class VkRunJoinCommunityTaskExtraDataDto extends VkRunTaskExtraDataDto implements Parcelable {
        public static final Parcelable.Creator<VkRunJoinCommunityTaskExtraDataDto> CREATOR = new a();

        @pmi0("id")
        private final int id;

        @pmi0("type")
        private final String type;

        /* compiled from: VkRunTaskExtraDataDto.kt */
        public static final class a implements Parcelable.Creator<VkRunJoinCommunityTaskExtraDataDto> {
            @Override // android.os.Parcelable.Creator
            public final VkRunJoinCommunityTaskExtraDataDto createFromParcel(Parcel parcel) {
                return new VkRunJoinCommunityTaskExtraDataDto(parcel.readInt(), parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final VkRunJoinCommunityTaskExtraDataDto[] newArray(int i) {
                return new VkRunJoinCommunityTaskExtraDataDto[i];
            }
        }

        public VkRunJoinCommunityTaskExtraDataDto(int i, String str) {
            super(null);
            this.id = i;
            this.type = str;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof VkRunJoinCommunityTaskExtraDataDto)) {
                return false;
            }
            VkRunJoinCommunityTaskExtraDataDto vkRunJoinCommunityTaskExtraDataDto = (VkRunJoinCommunityTaskExtraDataDto) obj;
            return this.id == vkRunJoinCommunityTaskExtraDataDto.id && epx.f(this.type, vkRunJoinCommunityTaskExtraDataDto.type);
        }

        public final int hashCode() {
            return this.type.hashCode() + (Integer.hashCode(this.id) * 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("VkRunJoinCommunityTaskExtraDataDto(id=");
            sb.append(this.id);
            sb.append(", type=");
            return ho8.a(sb, this.type, ')');
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.writeInt(this.id);
            parcel.writeString(this.type);
        }
    }

    /* compiled from: VkRunTaskExtraDataDto.kt */
    public static final class VkRunWatchAdTaskExtraDataDto extends VkRunTaskExtraDataDto implements Parcelable {
        public static final Parcelable.Creator<VkRunWatchAdTaskExtraDataDto> CREATOR = new a();

        @pmi0("available_count")
        private final int availableCount;

        @pmi0("count")
        private final int count;

        @pmi0("max_count")
        private final int maxCount;

        @pmi0("type")
        private final String type;

        /* compiled from: VkRunTaskExtraDataDto.kt */
        public static final class a implements Parcelable.Creator<VkRunWatchAdTaskExtraDataDto> {
            @Override // android.os.Parcelable.Creator
            public final VkRunWatchAdTaskExtraDataDto createFromParcel(Parcel parcel) {
                return new VkRunWatchAdTaskExtraDataDto(parcel.readInt(), parcel.readInt(), parcel.readInt(), parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final VkRunWatchAdTaskExtraDataDto[] newArray(int i) {
                return new VkRunWatchAdTaskExtraDataDto[i];
            }
        }

        public VkRunWatchAdTaskExtraDataDto(int i, int i2, int i3, String str) {
            super(null);
            this.maxCount = i;
            this.count = i2;
            this.availableCount = i3;
            this.type = str;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof VkRunWatchAdTaskExtraDataDto)) {
                return false;
            }
            VkRunWatchAdTaskExtraDataDto vkRunWatchAdTaskExtraDataDto = (VkRunWatchAdTaskExtraDataDto) obj;
            return this.maxCount == vkRunWatchAdTaskExtraDataDto.maxCount && this.count == vkRunWatchAdTaskExtraDataDto.count && this.availableCount == vkRunWatchAdTaskExtraDataDto.availableCount && epx.f(this.type, vkRunWatchAdTaskExtraDataDto.type);
        }

        public final int hashCode() {
            return this.type.hashCode() + shy.a(this.availableCount, shy.a(this.count, Integer.hashCode(this.maxCount) * 31, 31), 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("VkRunWatchAdTaskExtraDataDto(maxCount=");
            sb.append(this.maxCount);
            sb.append(", count=");
            sb.append(this.count);
            sb.append(", availableCount=");
            sb.append(this.availableCount);
            sb.append(", type=");
            return ho8.a(sb, this.type, ')');
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.writeInt(this.maxCount);
            parcel.writeInt(this.count);
            parcel.writeInt(this.availableCount);
            parcel.writeString(this.type);
        }
    }

    public /* synthetic */ VkRunTaskExtraDataDto(zcl zclVar) {
        this();
    }

    private VkRunTaskExtraDataDto() {
    }
}
