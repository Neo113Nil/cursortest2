package com.zoho.livechat.android.modules.calls.data.model;

import Gb.c;
import androidx.annotation.Keep;
import com.facebook.react.devsupport.StackTraceHelper;
import com.facebook.react.uimanager.ViewProps;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import zendesk.core.Constants;

@Keep
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b/\n\u0002\u0010\b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001:\u0004GHIJB\u009b\u0001\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u000e\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015\u0012\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015\u0012\b\u0010\u0017\u001a\u0004\u0018\u00010\u0015¢\u0006\u0002\u0010\u0018J\u000b\u00101\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u00102\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\u001fJ\u000b\u00103\u001a\u0004\u0018\u00010\u0011HÆ\u0003J\u000b\u00104\u001a\u0004\u0018\u00010\u0013HÆ\u0003J\u0010\u00105\u001a\u0004\u0018\u00010\u0015HÆ\u0003¢\u0006\u0002\u0010\u001aJ\u0010\u00106\u001a\u0004\u0018\u00010\u0015HÆ\u0003¢\u0006\u0002\u0010\u001aJ\u0010\u00107\u001a\u0004\u0018\u00010\u0015HÆ\u0003¢\u0006\u0002\u0010\u001aJ\u0010\u00108\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\u001fJ\u000b\u00109\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u000b\u0010:\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010;\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010<\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010=\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010>\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010?\u001a\u0004\u0018\u00010\u000eHÆ\u0003JÂ\u0001\u0010@\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000e2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00112\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00132\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u00152\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u00152\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u0015HÆ\u0001¢\u0006\u0002\u0010AJ\u0013\u0010B\u001a\u00020\u00052\b\u0010C\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010D\u001a\u00020EHÖ\u0001J\t\u0010F\u001a\u00020\u0003HÖ\u0001R\u001a\u0010\u0016\u001a\u0004\u0018\u00010\u00158\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\u001b\u001a\u0004\b\u0019\u0010\u001aR\u0018\u0010\f\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001dR\u0015\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\n\n\u0002\u0010 \u001a\u0004\b\u001e\u0010\u001fR\u0018\u0010\u000b\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\u001dR\u0013\u0010\t\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010\u001dR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b#\u0010$R\u0018\u0010\u0012\u001a\u0004\u0018\u00010\u00138\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b%\u0010&R\u0018\u0010\u0010\u001a\u0004\u0018\u00010\u00118\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b'\u0010(R\u001a\u0010\u000f\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010 \u001a\u0004\b)\u0010\u001fR\u0018\u0010\n\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b*\u0010\u001dR\u0018\u0010\r\u001a\u0004\u0018\u00010\u000e8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b+\u0010,R\u001a\u0010\u0017\u001a\u0004\u0018\u00010\u00158\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\u001b\u001a\u0004\b-\u0010\u001aR\u001a\u0010\u0014\u001a\u0004\u0018\u00010\u00158\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\u001b\u001a\u0004\b.\u0010\u001aR\u0013\u0010\b\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b/\u0010\u001dR\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b0\u0010\u001d¨\u0006K"}, d2 = {"Lcom/zoho/livechat/android/modules/calls/data/model/MediaResponse;", "", "wmsChatId", "", "hold", "", "operation", "Lcom/zoho/livechat/android/modules/calls/data/model/MediaResponse$Operation;", "type", "mode", "recordingType", "mediaId", "conversationId", "rtcpCredential", "Lcom/zoho/livechat/android/modules/calls/data/model/MediaResponse$RTCPCredential;", "performedByVisitor", "operatorOnTransfer", "Lcom/zoho/livechat/android/modules/calls/data/model/MediaResponse$OperatorOnTransfer;", "operationUser", "Lcom/zoho/livechat/android/modules/calls/data/model/MediaResponse$OperationalUser;", "time", "", "connectedTime", "startTime", "(Ljava/lang/String;Ljava/lang/Boolean;Lcom/zoho/livechat/android/modules/calls/data/model/MediaResponse$Operation;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/zoho/livechat/android/modules/calls/data/model/MediaResponse$RTCPCredential;Ljava/lang/Boolean;Lcom/zoho/livechat/android/modules/calls/data/model/MediaResponse$OperatorOnTransfer;Lcom/zoho/livechat/android/modules/calls/data/model/MediaResponse$OperationalUser;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Long;)V", "getConnectedTime", "()Ljava/lang/Long;", "Ljava/lang/Long;", "getConversationId", "()Ljava/lang/String;", "getHold", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getMediaId", "getMode", "getOperation", "()Lcom/zoho/livechat/android/modules/calls/data/model/MediaResponse$Operation;", "getOperationUser", "()Lcom/zoho/livechat/android/modules/calls/data/model/MediaResponse$OperationalUser;", "getOperatorOnTransfer", "()Lcom/zoho/livechat/android/modules/calls/data/model/MediaResponse$OperatorOnTransfer;", "getPerformedByVisitor", "getRecordingType", "getRtcpCredential", "()Lcom/zoho/livechat/android/modules/calls/data/model/MediaResponse$RTCPCredential;", "getStartTime", "getTime", "getType", "getWmsChatId", "component1", "component10", "component11", "component12", "component13", "component14", "component15", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "(Ljava/lang/String;Ljava/lang/Boolean;Lcom/zoho/livechat/android/modules/calls/data/model/MediaResponse$Operation;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/zoho/livechat/android/modules/calls/data/model/MediaResponse$RTCPCredential;Ljava/lang/Boolean;Lcom/zoho/livechat/android/modules/calls/data/model/MediaResponse$OperatorOnTransfer;Lcom/zoho/livechat/android/modules/calls/data/model/MediaResponse$OperationalUser;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Long;)Lcom/zoho/livechat/android/modules/calls/data/model/MediaResponse;", "equals", "other", "hashCode", "", "toString", "Operation", "OperationalUser", "OperatorOnTransfer", "RTCPCredential", "mobilisten_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class MediaResponse {

    @c("connected_time")
    @Nullable
    private final Long connectedTime;

    @c("conversation_id")
    @Nullable
    private final String conversationId;

    @Nullable
    private final Boolean hold;

    @c("media_id")
    @Nullable
    private final String mediaId;

    @Nullable
    private final String mode;

    @Nullable
    private final Operation operation;

    @c("opruser")
    @Nullable
    private final OperationalUser operationUser;

    @c("operator_on_transfer")
    @Nullable
    private final OperatorOnTransfer operatorOnTransfer;

    @c("visitoraccess")
    @Nullable
    private final Boolean performedByVisitor;

    @c("recording_type")
    @Nullable
    private final String recordingType;

    @c("rtcp_credential")
    @Nullable
    private final RTCPCredential rtcpCredential;

    @c("start_time")
    @Nullable
    private final Long startTime;

    @c("time")
    @Nullable
    private final Long time;

    @Nullable
    private final String type;

    @c("chid")
    @Nullable
    private final String wmsChatId;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Keep
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0011\b\u0087\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011¨\u0006\u0012"}, d2 = {"Lcom/zoho/livechat/android/modules/calls/data/model/MediaResponse$Operation;", "", "(Ljava/lang/String;I)V", Constants.ACCEPT_HEADER, "Reject", "Hold", "End", "Connected", "Initiate", "Invite", "Cancel", "CallCancel", "Miss", "Chat", "Queue", "Dequeue", "MonitorEnd", "MonitorJoin", "mobilisten_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Operation {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ Operation[] $VALUES;

        @c("accept")
        public static final Operation Accept = new Operation(Constants.ACCEPT_HEADER, 0);

        @c("reject")
        public static final Operation Reject = new Operation("Reject", 1);

        @c("hold")
        public static final Operation Hold = new Operation("Hold", 2);

        @c(ViewProps.END)
        public static final Operation End = new Operation("End", 3);

        @c("connected")
        public static final Operation Connected = new Operation("Connected", 4);

        @c("initiate")
        public static final Operation Initiate = new Operation("Initiate", 5);

        @c("invite")
        public static final Operation Invite = new Operation("Invite", 6);

        @c("cancel")
        public static final Operation Cancel = new Operation("Cancel", 7);

        @c("call_cancel")
        public static final Operation CallCancel = new Operation("CallCancel", 8);

        @c("miss")
        public static final Operation Miss = new Operation("Miss", 9);

        @c("chat")
        public static final Operation Chat = new Operation("Chat", 10);

        @c("queue")
        public static final Operation Queue = new Operation("Queue", 11);

        @c("dequeue")
        public static final Operation Dequeue = new Operation("Dequeue", 12);

        @c("monitor_end")
        public static final Operation MonitorEnd = new Operation("MonitorEnd", 13);

        @c("monitor_join")
        public static final Operation MonitorJoin = new Operation("MonitorJoin", 14);

        private static final /* synthetic */ Operation[] $values() {
            return new Operation[]{Accept, Reject, Hold, End, Connected, Initiate, Invite, Cancel, CallCancel, Miss, Chat, Queue, Dequeue, MonitorEnd, MonitorJoin};
        }

        static {
            Operation[] $values = $values();
            $VALUES = $values;
            $ENTRIES = EnumEntriesKt.enumEntries($values);
        }

        private Operation(String str, int i10) {
        }

        @NotNull
        public static EnumEntries<Operation> getEntries() {
            return $ENTRIES;
        }

        public static Operation valueOf(String str) {
            return (Operation) Enum.valueOf(Operation.class, str);
        }

        public static Operation[] values() {
            return (Operation[]) $VALUES.clone();
        }
    }

    @Keep
    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0019\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0005J\u000b\u0010\t\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\n\u001a\u0004\u0018\u00010\u0003HÆ\u0003J!\u0010\u000b\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001J\t\u0010\u0011\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0007¨\u0006\u0012"}, d2 = {"Lcom/zoho/livechat/android/modules/calls/data/model/MediaResponse$OperationalUser;", "", "name", "", StackTraceHelper.ID_KEY, "(Ljava/lang/String;Ljava/lang/String;)V", "getId", "()Ljava/lang/String;", "getName", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "mobilisten_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class OperationalUser {

        @Nullable
        private final String id;

        @c("dname")
        @Nullable
        private final String name;

        public OperationalUser(@Nullable String str, @Nullable String str2) {
            this.name = str;
            this.id = str2;
        }

        public static /* synthetic */ OperationalUser copy$default(OperationalUser operationalUser, String str, String str2, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                str = operationalUser.name;
            }
            if ((i10 & 2) != 0) {
                str2 = operationalUser.id;
            }
            return operationalUser.copy(str, str2);
        }

        @Nullable
        /* renamed from: component1, reason: from getter */
        public final String getName() {
            return this.name;
        }

        @Nullable
        /* renamed from: component2, reason: from getter */
        public final String getId() {
            return this.id;
        }

        @NotNull
        public final OperationalUser copy(@Nullable String name, @Nullable String id2) {
            return new OperationalUser(name, id2);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof OperationalUser)) {
                return false;
            }
            OperationalUser operationalUser = (OperationalUser) other;
            return Intrinsics.areEqual(this.name, operationalUser.name) && Intrinsics.areEqual(this.id, operationalUser.id);
        }

        @Nullable
        public final String getId() {
            return this.id;
        }

        @Nullable
        public final String getName() {
            return this.name;
        }

        public int hashCode() {
            String str = this.name;
            int hashCode = (str == null ? 0 : str.hashCode()) * 31;
            String str2 = this.id;
            return hashCode + (str2 != null ? str2.hashCode() : 0);
        }

        @NotNull
        public String toString() {
            return "OperationalUser(name=" + this.name + ", id=" + this.id + ')';
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Keep
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0003\b\u0087\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003¨\u0006\u0004"}, d2 = {"Lcom/zoho/livechat/android/modules/calls/data/model/MediaResponse$OperatorOnTransfer;", "", "(Ljava/lang/String;I)V", "Retain", "mobilisten_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class OperatorOnTransfer {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ OperatorOnTransfer[] $VALUES;

        @c("retain")
        public static final OperatorOnTransfer Retain = new OperatorOnTransfer("Retain", 0);

        private static final /* synthetic */ OperatorOnTransfer[] $values() {
            return new OperatorOnTransfer[]{Retain};
        }

        static {
            OperatorOnTransfer[] $values = $values();
            $VALUES = $values;
            $ENTRIES = EnumEntriesKt.enumEntries($values);
        }

        private OperatorOnTransfer(String str, int i10) {
        }

        @NotNull
        public static EnumEntries<OperatorOnTransfer> getEntries() {
            return $ENTRIES;
        }

        public static OperatorOnTransfer valueOf(String str) {
            return (OperatorOnTransfer) Enum.valueOf(OperatorOnTransfer.class, str);
        }

        public static OperatorOnTransfer[] values() {
            return (OperatorOnTransfer[]) $VALUES.clone();
        }
    }

    @Keep
    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B#\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0006J\u000b\u0010\u000b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\r\u001a\u0004\u0018\u00010\u0003HÆ\u0003J-\u0010\u000e\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0003HÖ\u0001R\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\bR\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\b¨\u0006\u0015"}, d2 = {"Lcom/zoho/livechat/android/modules/calls/data/model/MediaResponse$RTCPCredential;", "", "clientOtp", "", "userId", "conferenceKey", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getClientOtp", "()Ljava/lang/String;", "getConferenceKey", "getUserId", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "mobilisten_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class RTCPCredential {

        @c("client_otp")
        @Nullable
        private final String clientOtp;

        @c("conferencekey")
        @Nullable
        private final String conferenceKey;

        @c("userid")
        @Nullable
        private final String userId;

        public RTCPCredential(@Nullable String str, @Nullable String str2, @Nullable String str3) {
            this.clientOtp = str;
            this.userId = str2;
            this.conferenceKey = str3;
        }

        public static /* synthetic */ RTCPCredential copy$default(RTCPCredential rTCPCredential, String str, String str2, String str3, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                str = rTCPCredential.clientOtp;
            }
            if ((i10 & 2) != 0) {
                str2 = rTCPCredential.userId;
            }
            if ((i10 & 4) != 0) {
                str3 = rTCPCredential.conferenceKey;
            }
            return rTCPCredential.copy(str, str2, str3);
        }

        @Nullable
        /* renamed from: component1, reason: from getter */
        public final String getClientOtp() {
            return this.clientOtp;
        }

        @Nullable
        /* renamed from: component2, reason: from getter */
        public final String getUserId() {
            return this.userId;
        }

        @Nullable
        /* renamed from: component3, reason: from getter */
        public final String getConferenceKey() {
            return this.conferenceKey;
        }

        @NotNull
        public final RTCPCredential copy(@Nullable String clientOtp, @Nullable String userId, @Nullable String conferenceKey) {
            return new RTCPCredential(clientOtp, userId, conferenceKey);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof RTCPCredential)) {
                return false;
            }
            RTCPCredential rTCPCredential = (RTCPCredential) other;
            return Intrinsics.areEqual(this.clientOtp, rTCPCredential.clientOtp) && Intrinsics.areEqual(this.userId, rTCPCredential.userId) && Intrinsics.areEqual(this.conferenceKey, rTCPCredential.conferenceKey);
        }

        @Nullable
        public final String getClientOtp() {
            return this.clientOtp;
        }

        @Nullable
        public final String getConferenceKey() {
            return this.conferenceKey;
        }

        @Nullable
        public final String getUserId() {
            return this.userId;
        }

        public int hashCode() {
            String str = this.clientOtp;
            int hashCode = (str == null ? 0 : str.hashCode()) * 31;
            String str2 = this.userId;
            int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.conferenceKey;
            return hashCode2 + (str3 != null ? str3.hashCode() : 0);
        }

        @NotNull
        public String toString() {
            return "RTCPCredential(clientOtp=" + this.clientOtp + ", userId=" + this.userId + ", conferenceKey=" + this.conferenceKey + ')';
        }
    }

    public MediaResponse(@Nullable String str, @Nullable Boolean bool, @Nullable Operation operation, @Nullable String str2, @Nullable String str3, @Nullable String str4, @Nullable String str5, @Nullable String str6, @Nullable RTCPCredential rTCPCredential, @Nullable Boolean bool2, @Nullable OperatorOnTransfer operatorOnTransfer, @Nullable OperationalUser operationalUser, @Nullable Long l10, @Nullable Long l11, @Nullable Long l12) {
        this.wmsChatId = str;
        this.hold = bool;
        this.operation = operation;
        this.type = str2;
        this.mode = str3;
        this.recordingType = str4;
        this.mediaId = str5;
        this.conversationId = str6;
        this.rtcpCredential = rTCPCredential;
        this.performedByVisitor = bool2;
        this.operatorOnTransfer = operatorOnTransfer;
        this.operationUser = operationalUser;
        this.time = l10;
        this.connectedTime = l11;
        this.startTime = l12;
    }

    @Nullable
    /* renamed from: component1, reason: from getter */
    public final String getWmsChatId() {
        return this.wmsChatId;
    }

    @Nullable
    /* renamed from: component10, reason: from getter */
    public final Boolean getPerformedByVisitor() {
        return this.performedByVisitor;
    }

    @Nullable
    /* renamed from: component11, reason: from getter */
    public final OperatorOnTransfer getOperatorOnTransfer() {
        return this.operatorOnTransfer;
    }

    @Nullable
    /* renamed from: component12, reason: from getter */
    public final OperationalUser getOperationUser() {
        return this.operationUser;
    }

    @Nullable
    /* renamed from: component13, reason: from getter */
    public final Long getTime() {
        return this.time;
    }

    @Nullable
    /* renamed from: component14, reason: from getter */
    public final Long getConnectedTime() {
        return this.connectedTime;
    }

    @Nullable
    /* renamed from: component15, reason: from getter */
    public final Long getStartTime() {
        return this.startTime;
    }

    @Nullable
    /* renamed from: component2, reason: from getter */
    public final Boolean getHold() {
        return this.hold;
    }

    @Nullable
    /* renamed from: component3, reason: from getter */
    public final Operation getOperation() {
        return this.operation;
    }

    @Nullable
    /* renamed from: component4, reason: from getter */
    public final String getType() {
        return this.type;
    }

    @Nullable
    /* renamed from: component5, reason: from getter */
    public final String getMode() {
        return this.mode;
    }

    @Nullable
    /* renamed from: component6, reason: from getter */
    public final String getRecordingType() {
        return this.recordingType;
    }

    @Nullable
    /* renamed from: component7, reason: from getter */
    public final String getMediaId() {
        return this.mediaId;
    }

    @Nullable
    /* renamed from: component8, reason: from getter */
    public final String getConversationId() {
        return this.conversationId;
    }

    @Nullable
    /* renamed from: component9, reason: from getter */
    public final RTCPCredential getRtcpCredential() {
        return this.rtcpCredential;
    }

    @NotNull
    public final MediaResponse copy(@Nullable String wmsChatId, @Nullable Boolean hold, @Nullable Operation operation, @Nullable String type, @Nullable String mode, @Nullable String recordingType, @Nullable String mediaId, @Nullable String conversationId, @Nullable RTCPCredential rtcpCredential, @Nullable Boolean performedByVisitor, @Nullable OperatorOnTransfer operatorOnTransfer, @Nullable OperationalUser operationUser, @Nullable Long time, @Nullable Long connectedTime, @Nullable Long startTime) {
        return new MediaResponse(wmsChatId, hold, operation, type, mode, recordingType, mediaId, conversationId, rtcpCredential, performedByVisitor, operatorOnTransfer, operationUser, time, connectedTime, startTime);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof MediaResponse)) {
            return false;
        }
        MediaResponse mediaResponse = (MediaResponse) other;
        return Intrinsics.areEqual(this.wmsChatId, mediaResponse.wmsChatId) && Intrinsics.areEqual(this.hold, mediaResponse.hold) && this.operation == mediaResponse.operation && Intrinsics.areEqual(this.type, mediaResponse.type) && Intrinsics.areEqual(this.mode, mediaResponse.mode) && Intrinsics.areEqual(this.recordingType, mediaResponse.recordingType) && Intrinsics.areEqual(this.mediaId, mediaResponse.mediaId) && Intrinsics.areEqual(this.conversationId, mediaResponse.conversationId) && Intrinsics.areEqual(this.rtcpCredential, mediaResponse.rtcpCredential) && Intrinsics.areEqual(this.performedByVisitor, mediaResponse.performedByVisitor) && this.operatorOnTransfer == mediaResponse.operatorOnTransfer && Intrinsics.areEqual(this.operationUser, mediaResponse.operationUser) && Intrinsics.areEqual(this.time, mediaResponse.time) && Intrinsics.areEqual(this.connectedTime, mediaResponse.connectedTime) && Intrinsics.areEqual(this.startTime, mediaResponse.startTime);
    }

    @Nullable
    public final Long getConnectedTime() {
        return this.connectedTime;
    }

    @Nullable
    public final String getConversationId() {
        return this.conversationId;
    }

    @Nullable
    public final Boolean getHold() {
        return this.hold;
    }

    @Nullable
    public final String getMediaId() {
        return this.mediaId;
    }

    @Nullable
    public final String getMode() {
        return this.mode;
    }

    @Nullable
    public final Operation getOperation() {
        return this.operation;
    }

    @Nullable
    public final OperationalUser getOperationUser() {
        return this.operationUser;
    }

    @Nullable
    public final OperatorOnTransfer getOperatorOnTransfer() {
        return this.operatorOnTransfer;
    }

    @Nullable
    public final Boolean getPerformedByVisitor() {
        return this.performedByVisitor;
    }

    @Nullable
    public final String getRecordingType() {
        return this.recordingType;
    }

    @Nullable
    public final RTCPCredential getRtcpCredential() {
        return this.rtcpCredential;
    }

    @Nullable
    public final Long getStartTime() {
        return this.startTime;
    }

    @Nullable
    public final Long getTime() {
        return this.time;
    }

    @Nullable
    public final String getType() {
        return this.type;
    }

    @Nullable
    public final String getWmsChatId() {
        return this.wmsChatId;
    }

    public int hashCode() {
        String str = this.wmsChatId;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        Boolean bool = this.hold;
        int hashCode2 = (hashCode + (bool == null ? 0 : bool.hashCode())) * 31;
        Operation operation = this.operation;
        int hashCode3 = (hashCode2 + (operation == null ? 0 : operation.hashCode())) * 31;
        String str2 = this.type;
        int hashCode4 = (hashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.mode;
        int hashCode5 = (hashCode4 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.recordingType;
        int hashCode6 = (hashCode5 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.mediaId;
        int hashCode7 = (hashCode6 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.conversationId;
        int hashCode8 = (hashCode7 + (str6 == null ? 0 : str6.hashCode())) * 31;
        RTCPCredential rTCPCredential = this.rtcpCredential;
        int hashCode9 = (hashCode8 + (rTCPCredential == null ? 0 : rTCPCredential.hashCode())) * 31;
        Boolean bool2 = this.performedByVisitor;
        int hashCode10 = (hashCode9 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        OperatorOnTransfer operatorOnTransfer = this.operatorOnTransfer;
        int hashCode11 = (hashCode10 + (operatorOnTransfer == null ? 0 : operatorOnTransfer.hashCode())) * 31;
        OperationalUser operationalUser = this.operationUser;
        int hashCode12 = (hashCode11 + (operationalUser == null ? 0 : operationalUser.hashCode())) * 31;
        Long l10 = this.time;
        int hashCode13 = (hashCode12 + (l10 == null ? 0 : l10.hashCode())) * 31;
        Long l11 = this.connectedTime;
        int hashCode14 = (hashCode13 + (l11 == null ? 0 : l11.hashCode())) * 31;
        Long l12 = this.startTime;
        return hashCode14 + (l12 != null ? l12.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "MediaResponse(wmsChatId=" + this.wmsChatId + ", hold=" + this.hold + ", operation=" + this.operation + ", type=" + this.type + ", mode=" + this.mode + ", recordingType=" + this.recordingType + ", mediaId=" + this.mediaId + ", conversationId=" + this.conversationId + ", rtcpCredential=" + this.rtcpCredential + ", performedByVisitor=" + this.performedByVisitor + ", operatorOnTransfer=" + this.operatorOnTransfer + ", operationUser=" + this.operationUser + ", time=" + this.time + ", connectedTime=" + this.connectedTime + ", startTime=" + this.startTime + ')';
    }
}
