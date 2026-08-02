package com.zoho.livechat.android.modules.triggers.data.remote.entities;

import Gb.c;
import androidx.annotation.Keep;
import com.twilio.voice.EventKeys;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Keep
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0010B\u000f\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0004J\u000b\u0010\u0007\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0015\u0010\b\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\f\u001a\u00020\rHÖ\u0001J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001R\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0011"}, d2 = {"Lcom/zoho/livechat/android/modules/triggers/data/remote/entities/VTSTriggerResponse;", "", "triggers", "Lcom/zoho/livechat/android/modules/triggers/data/remote/entities/VTSTriggerResponse$Triggers;", "(Lcom/zoho/livechat/android/modules/triggers/data/remote/entities/VTSTriggerResponse$Triggers;)V", "getTriggers", "()Lcom/zoho/livechat/android/modules/triggers/data/remote/entities/VTSTriggerResponse$Triggers;", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "", "Triggers", "mobilisten_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class VTSTriggerResponse {

    @c("triggers")
    @Nullable
    private final Triggers triggers;

    @Keep
    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0014\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B7\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\tJ\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010\u0013\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\rJ\u000b\u0010\u0014\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0015\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0016\u001a\u0004\u0018\u00010\u0003HÆ\u0003JJ\u0010\u0017\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0003HÆ\u0001¢\u0006\u0002\u0010\u0018J\u0013\u0010\u0019\u001a\u00020\u001a2\b\u0010\u001b\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001c\u001a\u00020\u0005HÖ\u0001J\t\u0010\u001d\u001a\u00020\u0003HÖ\u0001R\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u001a\u0010\u0004\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\u000e\u001a\u0004\b\f\u0010\rR\u0018\u0010\u0006\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000bR\u0018\u0010\u0007\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000bR\u0018\u0010\b\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u000b¨\u0006\u001e"}, d2 = {"Lcom/zoho/livechat/android/modules/triggers/data/remote/entities/VTSTriggerResponse$Triggers;", "", "botId", "", "time", "", "triggerId", "type", EventKeys.VALUE_KEY, "(Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getBotId", "()Ljava/lang/String;", "getTime", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getTriggerId", "getType", "getValue", "component1", "component2", "component3", "component4", "component5", "copy", "(Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/zoho/livechat/android/modules/triggers/data/remote/entities/VTSTriggerResponse$Triggers;", "equals", "", "other", "hashCode", "toString", "mobilisten_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class Triggers {

        @c("botid")
        @Nullable
        private final String botId;

        @c("time")
        @Nullable
        private final Integer time;

        @c("triggerid")
        @Nullable
        private final String triggerId;

        @c("type")
        @Nullable
        private final String type;

        @c(EventKeys.VALUE_KEY)
        @Nullable
        private final String value;

        public Triggers(@Nullable String str, @Nullable Integer num, @Nullable String str2, @Nullable String str3, @Nullable String str4) {
            this.botId = str;
            this.time = num;
            this.triggerId = str2;
            this.type = str3;
            this.value = str4;
        }

        public static /* synthetic */ Triggers copy$default(Triggers triggers, String str, Integer num, String str2, String str3, String str4, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                str = triggers.botId;
            }
            if ((i10 & 2) != 0) {
                num = triggers.time;
            }
            if ((i10 & 4) != 0) {
                str2 = triggers.triggerId;
            }
            if ((i10 & 8) != 0) {
                str3 = triggers.type;
            }
            if ((i10 & 16) != 0) {
                str4 = triggers.value;
            }
            String str5 = str4;
            String str6 = str2;
            return triggers.copy(str, num, str6, str3, str5);
        }

        @Nullable
        /* renamed from: component1, reason: from getter */
        public final String getBotId() {
            return this.botId;
        }

        @Nullable
        /* renamed from: component2, reason: from getter */
        public final Integer getTime() {
            return this.time;
        }

        @Nullable
        /* renamed from: component3, reason: from getter */
        public final String getTriggerId() {
            return this.triggerId;
        }

        @Nullable
        /* renamed from: component4, reason: from getter */
        public final String getType() {
            return this.type;
        }

        @Nullable
        /* renamed from: component5, reason: from getter */
        public final String getValue() {
            return this.value;
        }

        @NotNull
        public final Triggers copy(@Nullable String botId, @Nullable Integer time, @Nullable String triggerId, @Nullable String type, @Nullable String value) {
            return new Triggers(botId, time, triggerId, type, value);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Triggers)) {
                return false;
            }
            Triggers triggers = (Triggers) other;
            return Intrinsics.areEqual(this.botId, triggers.botId) && Intrinsics.areEqual(this.time, triggers.time) && Intrinsics.areEqual(this.triggerId, triggers.triggerId) && Intrinsics.areEqual(this.type, triggers.type) && Intrinsics.areEqual(this.value, triggers.value);
        }

        @Nullable
        public final String getBotId() {
            return this.botId;
        }

        @Nullable
        public final Integer getTime() {
            return this.time;
        }

        @Nullable
        public final String getTriggerId() {
            return this.triggerId;
        }

        @Nullable
        public final String getType() {
            return this.type;
        }

        @Nullable
        public final String getValue() {
            return this.value;
        }

        public int hashCode() {
            String str = this.botId;
            int hashCode = (str == null ? 0 : str.hashCode()) * 31;
            Integer num = this.time;
            int hashCode2 = (hashCode + (num == null ? 0 : num.hashCode())) * 31;
            String str2 = this.triggerId;
            int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.type;
            int hashCode4 = (hashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
            String str4 = this.value;
            return hashCode4 + (str4 != null ? str4.hashCode() : 0);
        }

        @NotNull
        public String toString() {
            return "Triggers(botId=" + this.botId + ", time=" + this.time + ", triggerId=" + this.triggerId + ", type=" + this.type + ", value=" + this.value + ')';
        }
    }

    public VTSTriggerResponse(@Nullable Triggers triggers) {
        this.triggers = triggers;
    }

    public static /* synthetic */ VTSTriggerResponse copy$default(VTSTriggerResponse vTSTriggerResponse, Triggers triggers, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            triggers = vTSTriggerResponse.triggers;
        }
        return vTSTriggerResponse.copy(triggers);
    }

    @Nullable
    /* renamed from: component1, reason: from getter */
    public final Triggers getTriggers() {
        return this.triggers;
    }

    @NotNull
    public final VTSTriggerResponse copy(@Nullable Triggers triggers) {
        return new VTSTriggerResponse(triggers);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof VTSTriggerResponse) && Intrinsics.areEqual(this.triggers, ((VTSTriggerResponse) other).triggers);
    }

    @Nullable
    public final Triggers getTriggers() {
        return this.triggers;
    }

    public int hashCode() {
        Triggers triggers = this.triggers;
        if (triggers == null) {
            return 0;
        }
        return triggers.hashCode();
    }

    @NotNull
    public String toString() {
        return "VTSTriggerResponse(triggers=" + this.triggers + ')';
    }
}
