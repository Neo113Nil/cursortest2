package com.zoho.livechat.android.modules.triggers.data.remote.entities;

import Gb.c;
import androidx.annotation.Keep;
import com.google.gson.h;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Keep
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b#\b\u0087\b\u0018\u00002\u00020\u0001BW\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\u000e\u0010\u000fJ\u0012\u0010\u0010\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0012\u0010\u0012\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u0012\u0010\u0013J\u0012\u0010\u0014\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u0014\u0010\u0013J\u0012\u0010\u0015\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0004\b\u0015\u0010\u0016J\u0012\u0010\u0017\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0016J\u0012\u0010\u0018\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0013J\u0012\u0010\u0019\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u0016J\u0012\u0010\u001a\u001a\u0004\u0018\u00010\fHÆ\u0003¢\u0006\u0004\b\u001a\u0010\u001bJp\u0010\u001c\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\fHÆ\u0001¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u001e\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u001e\u0010\u0013J\u0010\u0010\u001f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001f\u0010 J\u001a\u0010\"\u001a\u00020\f2\b\u0010!\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\"\u0010#R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010$\u001a\u0004\b%\u0010\u0011R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010&\u001a\u0004\b'\u0010\u0013R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010&\u001a\u0004\b(\u0010\u0013R\u001c\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010)\u001a\u0004\b*\u0010\u0016R\u001c\u0010\t\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010)\u001a\u0004\b+\u0010\u0016R\u001c\u0010\n\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010&\u001a\u0004\b,\u0010\u0013R\u001c\u0010\u000b\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010)\u001a\u0004\b-\u0010\u0016R\u001c\u0010\r\u001a\u0004\u0018\u00010\f8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\r\u0010.\u001a\u0004\b\r\u0010\u001b¨\u0006/"}, d2 = {"Lcom/zoho/livechat/android/modules/triggers/data/remote/entities/TriggerResponse;", "", "", "delay", "", "encryptedVisitorInfo", "matchedRuleId", "Lcom/google/gson/h;", "params", "action", "type", "visitorInfo", "", "isTriggered", "<init>", "(Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Lcom/google/gson/h;Lcom/google/gson/h;Ljava/lang/String;Lcom/google/gson/h;Ljava/lang/Boolean;)V", "component1", "()Ljava/lang/Integer;", "component2", "()Ljava/lang/String;", "component3", "component4", "()Lcom/google/gson/h;", "component5", "component6", "component7", "component8", "()Ljava/lang/Boolean;", "copy", "(Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Lcom/google/gson/h;Lcom/google/gson/h;Ljava/lang/String;Lcom/google/gson/h;Ljava/lang/Boolean;)Lcom/zoho/livechat/android/modules/triggers/data/remote/entities/TriggerResponse;", "toString", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/Integer;", "getDelay", "Ljava/lang/String;", "getEncryptedVisitorInfo", "getMatchedRuleId", "Lcom/google/gson/h;", "getParams", "getAction", "getType", "getVisitorInfo", "Ljava/lang/Boolean;", "mobilisten_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class TriggerResponse {

    @c("action")
    @Nullable
    private final h action;

    @c("delay")
    @Nullable
    private final Integer delay;

    @c("encrypted_visitor_info")
    @Nullable
    private final String encryptedVisitorInfo;

    @c("isTriggered")
    @Nullable
    private final Boolean isTriggered;

    @c("matched_rule_id")
    @Nullable
    private final String matchedRuleId;

    @c("params")
    @Nullable
    private final h params;

    @c("type")
    @Nullable
    private final String type;

    @c("visitorinfo")
    @Nullable
    private final h visitorInfo;

    public TriggerResponse(@Nullable Integer num, @Nullable String str, @Nullable String str2, @Nullable h hVar, @Nullable h hVar2, @Nullable String str3, @Nullable h hVar3, @Nullable Boolean bool) {
        this.delay = num;
        this.encryptedVisitorInfo = str;
        this.matchedRuleId = str2;
        this.params = hVar;
        this.action = hVar2;
        this.type = str3;
        this.visitorInfo = hVar3;
        this.isTriggered = bool;
    }

    public static /* synthetic */ TriggerResponse copy$default(TriggerResponse triggerResponse, Integer num, String str, String str2, h hVar, h hVar2, String str3, h hVar3, Boolean bool, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            num = triggerResponse.delay;
        }
        if ((i10 & 2) != 0) {
            str = triggerResponse.encryptedVisitorInfo;
        }
        if ((i10 & 4) != 0) {
            str2 = triggerResponse.matchedRuleId;
        }
        if ((i10 & 8) != 0) {
            hVar = triggerResponse.params;
        }
        if ((i10 & 16) != 0) {
            hVar2 = triggerResponse.action;
        }
        if ((i10 & 32) != 0) {
            str3 = triggerResponse.type;
        }
        if ((i10 & 64) != 0) {
            hVar3 = triggerResponse.visitorInfo;
        }
        if ((i10 & 128) != 0) {
            bool = triggerResponse.isTriggered;
        }
        h hVar4 = hVar3;
        Boolean bool2 = bool;
        h hVar5 = hVar2;
        String str4 = str3;
        return triggerResponse.copy(num, str, str2, hVar, hVar5, str4, hVar4, bool2);
    }

    @Nullable
    /* renamed from: component1, reason: from getter */
    public final Integer getDelay() {
        return this.delay;
    }

    @Nullable
    /* renamed from: component2, reason: from getter */
    public final String getEncryptedVisitorInfo() {
        return this.encryptedVisitorInfo;
    }

    @Nullable
    /* renamed from: component3, reason: from getter */
    public final String getMatchedRuleId() {
        return this.matchedRuleId;
    }

    @Nullable
    /* renamed from: component4, reason: from getter */
    public final h getParams() {
        return this.params;
    }

    @Nullable
    /* renamed from: component5, reason: from getter */
    public final h getAction() {
        return this.action;
    }

    @Nullable
    /* renamed from: component6, reason: from getter */
    public final String getType() {
        return this.type;
    }

    @Nullable
    /* renamed from: component7, reason: from getter */
    public final h getVisitorInfo() {
        return this.visitorInfo;
    }

    @Nullable
    /* renamed from: component8, reason: from getter */
    public final Boolean getIsTriggered() {
        return this.isTriggered;
    }

    @NotNull
    public final TriggerResponse copy(@Nullable Integer delay, @Nullable String encryptedVisitorInfo, @Nullable String matchedRuleId, @Nullable h params, @Nullable h action, @Nullable String type, @Nullable h visitorInfo, @Nullable Boolean isTriggered) {
        return new TriggerResponse(delay, encryptedVisitorInfo, matchedRuleId, params, action, type, visitorInfo, isTriggered);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TriggerResponse)) {
            return false;
        }
        TriggerResponse triggerResponse = (TriggerResponse) other;
        return Intrinsics.areEqual(this.delay, triggerResponse.delay) && Intrinsics.areEqual(this.encryptedVisitorInfo, triggerResponse.encryptedVisitorInfo) && Intrinsics.areEqual(this.matchedRuleId, triggerResponse.matchedRuleId) && Intrinsics.areEqual(this.params, triggerResponse.params) && Intrinsics.areEqual(this.action, triggerResponse.action) && Intrinsics.areEqual(this.type, triggerResponse.type) && Intrinsics.areEqual(this.visitorInfo, triggerResponse.visitorInfo) && Intrinsics.areEqual(this.isTriggered, triggerResponse.isTriggered);
    }

    @Nullable
    public final h getAction() {
        return this.action;
    }

    @Nullable
    public final Integer getDelay() {
        return this.delay;
    }

    @Nullable
    public final String getEncryptedVisitorInfo() {
        return this.encryptedVisitorInfo;
    }

    @Nullable
    public final String getMatchedRuleId() {
        return this.matchedRuleId;
    }

    @Nullable
    public final h getParams() {
        return this.params;
    }

    @Nullable
    public final String getType() {
        return this.type;
    }

    @Nullable
    public final h getVisitorInfo() {
        return this.visitorInfo;
    }

    public int hashCode() {
        Integer num = this.delay;
        int hashCode = (num == null ? 0 : num.hashCode()) * 31;
        String str = this.encryptedVisitorInfo;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.matchedRuleId;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        h hVar = this.params;
        int hashCode4 = (hashCode3 + (hVar == null ? 0 : hVar.hashCode())) * 31;
        h hVar2 = this.action;
        int hashCode5 = (hashCode4 + (hVar2 == null ? 0 : hVar2.hashCode())) * 31;
        String str3 = this.type;
        int hashCode6 = (hashCode5 + (str3 == null ? 0 : str3.hashCode())) * 31;
        h hVar3 = this.visitorInfo;
        int hashCode7 = (hashCode6 + (hVar3 == null ? 0 : hVar3.hashCode())) * 31;
        Boolean bool = this.isTriggered;
        return hashCode7 + (bool != null ? bool.hashCode() : 0);
    }

    @Nullable
    public final Boolean isTriggered() {
        return this.isTriggered;
    }

    @NotNull
    public String toString() {
        return "TriggerResponse(delay=" + this.delay + ", encryptedVisitorInfo=" + this.encryptedVisitorInfo + ", matchedRuleId=" + this.matchedRuleId + ", params=" + this.params + ", action=" + this.action + ", type=" + this.type + ", visitorInfo=" + this.visitorInfo + ", isTriggered=" + this.isTriggered + ')';
    }
}
