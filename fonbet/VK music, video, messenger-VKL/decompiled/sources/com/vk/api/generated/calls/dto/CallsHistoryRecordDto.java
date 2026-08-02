package com.vk.api.generated.calls.dto;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.gson.internal.bind.TreeTypeAdapter;
import com.ironsource.Ad;
import com.vk.api.generated.messages.dto.MessagesConversationPeerDto;
import com.vk.api.generated.video.dto.VideoVideoDto;
import io.requery.android.database.sqlite.SQLiteDatabase;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import xsna.a9y;
import xsna.ao;
import xsna.asp;
import xsna.b9y;
import xsna.bh10;
import xsna.en;
import xsna.epx;
import xsna.fw3;
import xsna.go9;
import xsna.ms9;
import xsna.pmi0;
import xsna.qoy;
import xsna.shy;
import xsna.up;
import xsna.urd0;
import xsna.z8y;
import xsna.zcl;
import xsna.zrp;

/* compiled from: CallsHistoryRecordDto.kt */
/* loaded from: classes14.dex */
public abstract class CallsHistoryRecordDto implements Parcelable {

    /* compiled from: CallsHistoryRecordDto.kt */
    public static final class CallsHistoryRecordMergedDto extends CallsHistoryRecordDto implements Parcelable {
        public static final Parcelable.Creator<CallsHistoryRecordMergedDto> CREATOR = new a();

        @pmi0("records")
        private final List<com.vk.api.generated.calls.dto.CallsHistoryRecordSingleDto> records;

        @pmi0("type")
        private final TypeDto type;

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        /* compiled from: CallsHistoryRecordDto.kt */
        public static final class TypeDto implements Parcelable {
            private static final /* synthetic */ zrp $ENTRIES;
            private static final /* synthetic */ TypeDto[] $VALUES;
            public static final Parcelable.Creator<TypeDto> CREATOR;

            @pmi0("merged")
            public static final TypeDto MERGED;
            private final String value;

            /* compiled from: CallsHistoryRecordDto.kt */
            public static final class a implements Parcelable.Creator<TypeDto> {
                @Override // android.os.Parcelable.Creator
                public final TypeDto createFromParcel(Parcel parcel) {
                    return TypeDto.valueOf(parcel.readString());
                }

                @Override // android.os.Parcelable.Creator
                public final TypeDto[] newArray(int i) {
                    return new TypeDto[i];
                }
            }

            static {
                TypeDto typeDto = new TypeDto("MERGED", 0, "merged");
                MERGED = typeDto;
                TypeDto[] typeDtoArr = {typeDto};
                $VALUES = typeDtoArr;
                $ENTRIES = new asp(typeDtoArr);
                CREATOR = new a();
            }

            private TypeDto(String str, int i, String str2) {
                this.value = str2;
            }

            public static TypeDto valueOf(String str) {
                return (TypeDto) Enum.valueOf(TypeDto.class, str);
            }

            public static TypeDto[] values() {
                return (TypeDto[]) $VALUES.clone();
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel parcel, int i) {
                parcel.writeString(name());
            }
        }

        /* compiled from: CallsHistoryRecordDto.kt */
        public static final class a implements Parcelable.Creator<CallsHistoryRecordMergedDto> {
            @Override // android.os.Parcelable.Creator
            public final CallsHistoryRecordMergedDto createFromParcel(Parcel parcel) {
                TypeDto createFromParcel = TypeDto.CREATOR.createFromParcel(parcel);
                int readInt = parcel.readInt();
                ArrayList arrayList = new ArrayList(readInt);
                int i = 0;
                while (i != readInt) {
                    i = en.a(com.vk.api.generated.calls.dto.CallsHistoryRecordSingleDto.CREATOR, parcel, arrayList, i, 1);
                }
                return new CallsHistoryRecordMergedDto(createFromParcel, arrayList);
            }

            @Override // android.os.Parcelable.Creator
            public final CallsHistoryRecordMergedDto[] newArray(int i) {
                return new CallsHistoryRecordMergedDto[i];
            }
        }

        public CallsHistoryRecordMergedDto(TypeDto typeDto, List<com.vk.api.generated.calls.dto.CallsHistoryRecordSingleDto> list) {
            super(null);
            this.type = typeDto;
            this.records = list;
        }

        public final List<com.vk.api.generated.calls.dto.CallsHistoryRecordSingleDto> d() {
            return this.records;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof CallsHistoryRecordMergedDto)) {
                return false;
            }
            CallsHistoryRecordMergedDto callsHistoryRecordMergedDto = (CallsHistoryRecordMergedDto) obj;
            return this.type == callsHistoryRecordMergedDto.type && epx.f(this.records, callsHistoryRecordMergedDto.records);
        }

        public final int hashCode() {
            return this.records.hashCode() + (this.type.hashCode() * 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("CallsHistoryRecordMergedDto(type=");
            sb.append(this.type);
            sb.append(", records=");
            return ms9.a(')', sb, this.records);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            this.type.writeToParcel(parcel, i);
            Iterator a2 = ao.a(parcel, this.records);
            while (a2.hasNext()) {
                ((com.vk.api.generated.calls.dto.CallsHistoryRecordSingleDto) a2.next()).writeToParcel(parcel, i);
            }
        }
    }

    /* compiled from: CallsHistoryRecordDto.kt */
    public static final class CallsHistoryRecordSingleDto extends CallsHistoryRecordDto implements Parcelable {
        public static final Parcelable.Creator<CallsHistoryRecordSingleDto> CREATOR = new a();

        @pmi0("active_call")
        private final CallsActiveCallDto activeCall;

        @pmi0("broadcast_recording_ids")
        private final List<String> broadcastRecordingIds;

        @pmi0("call_id")
        private final String callId;

        @pmi0("can_view_join_history")
        private final boolean canViewJoinHistory;

        @pmi0("chat")
        private final CallsChatDto chat;

        @pmi0("finished_at")
        private final long finishedAt;

        @pmi0("has_broadcast_recordings")
        private final boolean hasBroadcastRecordings;

        @pmi0("is_inbound")
        private final boolean isInbound;

        @pmi0("is_missed")
        private final boolean isMissed;

        @pmi0("participant_count")
        private final int participantCount;

        @pmi0("participant_ids")
        private final List<String> participantIds;

        @pmi0("peer")
        private final MessagesConversationPeerDto peer;

        @pmi0("reach_status")
        private final ReachStatusDto reachStatus;

        @pmi0("record_id")
        private final long recordId;

        @pmi0("record_photo_base")
        private final String recordPhotoBase;

        @pmi0("record_title")
        private final String recordTitle;

        @pmi0("started_at")
        private final long startedAt;

        @pmi0("type")
        private final TypeDto type;

        @pmi0("video_recording")
        private final VideoVideoDto videoRecording;

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        /* compiled from: CallsHistoryRecordDto.kt */
        public static final class ReachStatusDto implements Parcelable {
            private static final /* synthetic */ zrp $ENTRIES;
            private static final /* synthetic */ ReachStatusDto[] $VALUES;

            @pmi0("CANCELLED_BY_INITIATOR")
            public static final ReachStatusDto CANCELLED_BY_INITIATOR;
            public static final Parcelable.Creator<ReachStatusDto> CREATOR;

            @pmi0("REACHED")
            public static final ReachStatusDto REACHED;

            @pmi0("REJECTED_BY_RECEIVER")
            public static final ReachStatusDto REJECTED_BY_RECEIVER;
            private final String value;

            /* compiled from: CallsHistoryRecordDto.kt */
            public static final class a implements Parcelable.Creator<ReachStatusDto> {
                @Override // android.os.Parcelable.Creator
                public final ReachStatusDto createFromParcel(Parcel parcel) {
                    return ReachStatusDto.valueOf(parcel.readString());
                }

                @Override // android.os.Parcelable.Creator
                public final ReachStatusDto[] newArray(int i) {
                    return new ReachStatusDto[i];
                }
            }

            static {
                ReachStatusDto reachStatusDto = new ReachStatusDto("CANCELLED_BY_INITIATOR", 0, "CANCELLED_BY_INITIATOR");
                CANCELLED_BY_INITIATOR = reachStatusDto;
                ReachStatusDto reachStatusDto2 = new ReachStatusDto("REACHED", 1, "REACHED");
                REACHED = reachStatusDto2;
                ReachStatusDto reachStatusDto3 = new ReachStatusDto("REJECTED_BY_RECEIVER", 2, "REJECTED_BY_RECEIVER");
                REJECTED_BY_RECEIVER = reachStatusDto3;
                ReachStatusDto[] reachStatusDtoArr = {reachStatusDto, reachStatusDto2, reachStatusDto3};
                $VALUES = reachStatusDtoArr;
                $ENTRIES = new asp(reachStatusDtoArr);
                CREATOR = new a();
            }

            private ReachStatusDto(String str, int i, String str2) {
                this.value = str2;
            }

            public static ReachStatusDto valueOf(String str) {
                return (ReachStatusDto) Enum.valueOf(ReachStatusDto.class, str);
            }

            public static ReachStatusDto[] values() {
                return (ReachStatusDto[]) $VALUES.clone();
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel parcel, int i) {
                parcel.writeString(name());
            }
        }

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        /* compiled from: CallsHistoryRecordDto.kt */
        public static final class TypeDto implements Parcelable {
            private static final /* synthetic */ zrp $ENTRIES;
            private static final /* synthetic */ TypeDto[] $VALUES;
            public static final Parcelable.Creator<TypeDto> CREATOR;

            @pmi0(Ad.d)
            public static final TypeDto SINGLE;
            private final String value;

            /* compiled from: CallsHistoryRecordDto.kt */
            public static final class a implements Parcelable.Creator<TypeDto> {
                @Override // android.os.Parcelable.Creator
                public final TypeDto createFromParcel(Parcel parcel) {
                    return TypeDto.valueOf(parcel.readString());
                }

                @Override // android.os.Parcelable.Creator
                public final TypeDto[] newArray(int i) {
                    return new TypeDto[i];
                }
            }

            static {
                TypeDto typeDto = new TypeDto("SINGLE", 0, Ad.d);
                SINGLE = typeDto;
                TypeDto[] typeDtoArr = {typeDto};
                $VALUES = typeDtoArr;
                $ENTRIES = new asp(typeDtoArr);
                CREATOR = new a();
            }

            private TypeDto(String str, int i, String str2) {
                this.value = str2;
            }

            public static TypeDto valueOf(String str) {
                return (TypeDto) Enum.valueOf(TypeDto.class, str);
            }

            public static TypeDto[] values() {
                return (TypeDto[]) $VALUES.clone();
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel parcel, int i) {
                parcel.writeString(name());
            }
        }

        /* compiled from: CallsHistoryRecordDto.kt */
        public static final class a implements Parcelable.Creator<CallsHistoryRecordSingleDto> {
            /*  JADX ERROR: NullPointerException in pass: ConstructorVisitor
                java.lang.NullPointerException
                */
            @Override // android.os.Parcelable.Creator
            public final com.vk.api.generated.calls.dto.CallsHistoryRecordDto.CallsHistoryRecordSingleDto createFromParcel(
            /*  JADX ERROR: Method generation error
                jadx.core.utils.exceptions.JadxRuntimeException: Code variable not set in r26v0 ??
                	at jadx.core.dex.instructions.args.SSAVar.getCodeVar(SSAVar.java:238)
                	at jadx.core.codegen.MethodGen.addMethodArguments(MethodGen.java:223)
                	at jadx.core.codegen.MethodGen.addDefinition(MethodGen.java:168)
                	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:401)
                	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:335)
                	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$3(ClassGen.java:301)
                	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:184)
                	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
                	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
                	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:261)
                */
            /*  JADX ERROR: NullPointerException in pass: ConstructorVisitor
                java.lang.NullPointerException
                */

            @Override // android.os.Parcelable.Creator
            public final CallsHistoryRecordSingleDto[] newArray(int i) {
                return new CallsHistoryRecordSingleDto[i];
            }
        }

        public /* synthetic */ CallsHistoryRecordSingleDto(long j, TypeDto typeDto, String str, List list, int i, long j2, long j3, boolean z, boolean z2, boolean z3, ReachStatusDto reachStatusDto, boolean z4, String str2, String str3, MessagesConversationPeerDto messagesConversationPeerDto, CallsChatDto callsChatDto, CallsActiveCallDto callsActiveCallDto, VideoVideoDto videoVideoDto, List list2, int i2, zcl zclVar) {
            this(j, typeDto, str, list, i, j2, j3, z, z2, z3, reachStatusDto, z4, (i2 & 4096) != 0 ? null : str2, (i2 & 8192) != 0 ? null : str3, (i2 & 16384) != 0 ? null : messagesConversationPeerDto, (32768 & i2) != 0 ? null : callsChatDto, (65536 & i2) != 0 ? null : callsActiveCallDto, (131072 & i2) != 0 ? null : videoVideoDto, (i2 & SQLiteDatabase.OPEN_PRIVATECACHE) != 0 ? null : list2);
        }

        public final CallsActiveCallDto d() {
            return this.activeCall;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final String e() {
            return this.callId;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof CallsHistoryRecordSingleDto)) {
                return false;
            }
            CallsHistoryRecordSingleDto callsHistoryRecordSingleDto = (CallsHistoryRecordSingleDto) obj;
            return this.recordId == callsHistoryRecordSingleDto.recordId && this.type == callsHistoryRecordSingleDto.type && epx.f(this.callId, callsHistoryRecordSingleDto.callId) && epx.f(this.participantIds, callsHistoryRecordSingleDto.participantIds) && this.participantCount == callsHistoryRecordSingleDto.participantCount && this.startedAt == callsHistoryRecordSingleDto.startedAt && this.finishedAt == callsHistoryRecordSingleDto.finishedAt && this.isMissed == callsHistoryRecordSingleDto.isMissed && this.isInbound == callsHistoryRecordSingleDto.isInbound && this.canViewJoinHistory == callsHistoryRecordSingleDto.canViewJoinHistory && this.reachStatus == callsHistoryRecordSingleDto.reachStatus && this.hasBroadcastRecordings == callsHistoryRecordSingleDto.hasBroadcastRecordings && epx.f(this.recordPhotoBase, callsHistoryRecordSingleDto.recordPhotoBase) && epx.f(this.recordTitle, callsHistoryRecordSingleDto.recordTitle) && epx.f(this.peer, callsHistoryRecordSingleDto.peer) && epx.f(this.chat, callsHistoryRecordSingleDto.chat) && epx.f(this.activeCall, callsHistoryRecordSingleDto.activeCall) && epx.f(this.videoRecording, callsHistoryRecordSingleDto.videoRecording) && epx.f(this.broadcastRecordingIds, callsHistoryRecordSingleDto.broadcastRecordingIds);
        }

        public final CallsChatDto f() {
            return this.chat;
        }

        public final long g() {
            return this.finishedAt;
        }

        public final int hashCode() {
            int b = qoy.b((this.reachStatus.hashCode() + qoy.b(qoy.b(qoy.b(bh10.a(bh10.a(shy.a(this.participantCount, fw3.a(urd0.a((this.type.hashCode() + (Long.hashCode(this.recordId) * 31)) * 31, 31, this.callId), 31, this.participantIds), 31), 31, this.startedAt), 31, this.finishedAt), 31, this.isMissed), 31, this.isInbound), 31, this.canViewJoinHistory)) * 31, 31, this.hasBroadcastRecordings);
            String str = this.recordPhotoBase;
            int hashCode = (b + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.recordTitle;
            int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
            MessagesConversationPeerDto messagesConversationPeerDto = this.peer;
            int hashCode3 = (hashCode2 + (messagesConversationPeerDto == null ? 0 : messagesConversationPeerDto.hashCode())) * 31;
            CallsChatDto callsChatDto = this.chat;
            int hashCode4 = (hashCode3 + (callsChatDto == null ? 0 : callsChatDto.hashCode())) * 31;
            CallsActiveCallDto callsActiveCallDto = this.activeCall;
            int hashCode5 = (hashCode4 + (callsActiveCallDto == null ? 0 : callsActiveCallDto.hashCode())) * 31;
            VideoVideoDto videoVideoDto = this.videoRecording;
            int hashCode6 = (hashCode5 + (videoVideoDto == null ? 0 : videoVideoDto.hashCode())) * 31;
            List<String> list = this.broadcastRecordingIds;
            return hashCode6 + (list != null ? list.hashCode() : 0);
        }

        public final List<String> i() {
            return this.participantIds;
        }

        public final MessagesConversationPeerDto j() {
            return this.peer;
        }

        public final ReachStatusDto k() {
            return this.reachStatus;
        }

        public final long l() {
            return this.recordId;
        }

        public final String n() {
            return this.recordPhotoBase;
        }

        public final String o() {
            return this.recordTitle;
        }

        public final long p() {
            return this.startedAt;
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("CallsHistoryRecordSingleDto(recordId=");
            sb.append(this.recordId);
            sb.append(", type=");
            sb.append(this.type);
            sb.append(", callId=");
            sb.append(this.callId);
            sb.append(", participantIds=");
            sb.append(this.participantIds);
            sb.append(", participantCount=");
            sb.append(this.participantCount);
            sb.append(", startedAt=");
            sb.append(this.startedAt);
            sb.append(", finishedAt=");
            sb.append(this.finishedAt);
            sb.append(", isMissed=");
            sb.append(this.isMissed);
            sb.append(", isInbound=");
            sb.append(this.isInbound);
            sb.append(", canViewJoinHistory=");
            sb.append(this.canViewJoinHistory);
            sb.append(", reachStatus=");
            sb.append(this.reachStatus);
            sb.append(", hasBroadcastRecordings=");
            sb.append(this.hasBroadcastRecordings);
            sb.append(", recordPhotoBase=");
            sb.append(this.recordPhotoBase);
            sb.append(", recordTitle=");
            sb.append(this.recordTitle);
            sb.append(", peer=");
            sb.append(this.peer);
            sb.append(", chat=");
            sb.append(this.chat);
            sb.append(", activeCall=");
            sb.append(this.activeCall);
            sb.append(", videoRecording=");
            sb.append(this.videoRecording);
            sb.append(", broadcastRecordingIds=");
            return ms9.a(')', sb, this.broadcastRecordingIds);
        }

        public final boolean u() {
            return this.isInbound;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.writeLong(this.recordId);
            this.type.writeToParcel(parcel, i);
            parcel.writeString(this.callId);
            parcel.writeStringList(this.participantIds);
            parcel.writeInt(this.participantCount);
            parcel.writeLong(this.startedAt);
            parcel.writeLong(this.finishedAt);
            parcel.writeInt(this.isMissed ? 1 : 0);
            parcel.writeInt(this.isInbound ? 1 : 0);
            parcel.writeInt(this.canViewJoinHistory ? 1 : 0);
            this.reachStatus.writeToParcel(parcel, i);
            parcel.writeInt(this.hasBroadcastRecordings ? 1 : 0);
            parcel.writeString(this.recordPhotoBase);
            parcel.writeString(this.recordTitle);
            MessagesConversationPeerDto messagesConversationPeerDto = this.peer;
            if (messagesConversationPeerDto == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                messagesConversationPeerDto.writeToParcel(parcel, i);
            }
            CallsChatDto callsChatDto = this.chat;
            if (callsChatDto == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                callsChatDto.writeToParcel(parcel, i);
            }
            CallsActiveCallDto callsActiveCallDto = this.activeCall;
            if (callsActiveCallDto == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                callsActiveCallDto.writeToParcel(parcel, i);
            }
            parcel.writeParcelable(this.videoRecording, i);
            parcel.writeStringList(this.broadcastRecordingIds);
        }

        public CallsHistoryRecordSingleDto(long j, TypeDto typeDto, String str, List<String> list, int i, long j2, long j3, boolean z, boolean z2, boolean z3, ReachStatusDto reachStatusDto, boolean z4, String str2, String str3, MessagesConversationPeerDto messagesConversationPeerDto, CallsChatDto callsChatDto, CallsActiveCallDto callsActiveCallDto, VideoVideoDto videoVideoDto, List<String> list2) {
            super(null);
            this.recordId = j;
            this.type = typeDto;
            this.callId = str;
            this.participantIds = list;
            this.participantCount = i;
            this.startedAt = j2;
            this.finishedAt = j3;
            this.isMissed = z;
            this.isInbound = z2;
            this.canViewJoinHistory = z3;
            this.reachStatus = reachStatusDto;
            this.hasBroadcastRecordings = z4;
            this.recordPhotoBase = str2;
            this.recordTitle = str3;
            this.peer = messagesConversationPeerDto;
            this.chat = callsChatDto;
            this.activeCall = callsActiveCallDto;
            this.videoRecording = videoVideoDto;
            this.broadcastRecordingIds = list2;
        }
    }

    /* compiled from: CallsHistoryRecordDto.kt */
    public static final class Deserializer implements a9y<CallsHistoryRecordDto> {
        @Override // xsna.a9y
        public final Object a(b9y b9yVar, z8y z8yVar) {
            String f = up.f(b9yVar, "type");
            if (epx.f(f, Ad.d)) {
                return (CallsHistoryRecordDto) ((TreeTypeAdapter.a) z8yVar).a(b9yVar, CallsHistoryRecordSingleDto.class);
            }
            if (epx.f(f, "merged")) {
                return (CallsHistoryRecordDto) ((TreeTypeAdapter.a) z8yVar).a(b9yVar, CallsHistoryRecordMergedDto.class);
            }
            throw new IllegalStateException(go9.b("no mapping for the type:", f));
        }
    }

    public /* synthetic */ CallsHistoryRecordDto(zcl zclVar) {
        this();
    }

    private CallsHistoryRecordDto() {
    }
}
