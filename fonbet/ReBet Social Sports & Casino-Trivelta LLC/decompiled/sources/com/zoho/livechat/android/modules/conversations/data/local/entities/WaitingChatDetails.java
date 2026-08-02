package com.zoho.livechat.android.modules.conversations.data.local.entities;

import androidx.annotation.Keep;
import kotlin.Metadata;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Keep
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0012\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001BA\b\u0007\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\tJ\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0006HÆ\u0003J\u000b\u0010\u0013\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0014\u001a\u0004\u0018\u00010\u0003HÆ\u0003JC\u0010\u0015\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u0016\u001a\u00020\u00062\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0018\u001a\u00020\u0019HÖ\u0001J\t\u0010\u001a\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000bR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000bR\u0013\u0010\b\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000bR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u000f¨\u0006\u001b"}, d2 = {"Lcom/zoho/livechat/android/modules/conversations/data/local/entities/WaitingChatDetails;", "", "attenderId", "", "attenderName", "isIntelligentTrigger", "", "acknowledgementKey", "departmentName", "(Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;Ljava/lang/String;)V", "getAcknowledgementKey", "()Ljava/lang/String;", "getAttenderId", "getAttenderName", "getDepartmentName", "()Z", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "other", "hashCode", "", "toString", "mobilisten_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class WaitingChatDetails {

    @Nullable
    private final String acknowledgementKey;

    @Nullable
    private final String attenderId;

    @Nullable
    private final String attenderName;

    @Nullable
    private final String departmentName;
    private final boolean isIntelligentTrigger;

    @JvmOverloads
    public WaitingChatDetails() {
        this(null, null, false, null, null, 31, null);
    }

    public static /* synthetic */ WaitingChatDetails copy$default(WaitingChatDetails waitingChatDetails, String str, String str2, boolean z10, String str3, String str4, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = waitingChatDetails.attenderId;
        }
        if ((i10 & 2) != 0) {
            str2 = waitingChatDetails.attenderName;
        }
        if ((i10 & 4) != 0) {
            z10 = waitingChatDetails.isIntelligentTrigger;
        }
        if ((i10 & 8) != 0) {
            str3 = waitingChatDetails.acknowledgementKey;
        }
        if ((i10 & 16) != 0) {
            str4 = waitingChatDetails.departmentName;
        }
        String str5 = str4;
        boolean z11 = z10;
        return waitingChatDetails.copy(str, str2, z11, str3, str5);
    }

    @Nullable
    /* renamed from: component1, reason: from getter */
    public final String getAttenderId() {
        return this.attenderId;
    }

    @Nullable
    /* renamed from: component2, reason: from getter */
    public final String getAttenderName() {
        return this.attenderName;
    }

    /* renamed from: component3, reason: from getter */
    public final boolean getIsIntelligentTrigger() {
        return this.isIntelligentTrigger;
    }

    @Nullable
    /* renamed from: component4, reason: from getter */
    public final String getAcknowledgementKey() {
        return this.acknowledgementKey;
    }

    @Nullable
    /* renamed from: component5, reason: from getter */
    public final String getDepartmentName() {
        return this.departmentName;
    }

    @NotNull
    public final WaitingChatDetails copy(@Nullable String attenderId, @Nullable String attenderName, boolean isIntelligentTrigger, @Nullable String acknowledgementKey, @Nullable String departmentName) {
        return new WaitingChatDetails(attenderId, attenderName, isIntelligentTrigger, acknowledgementKey, departmentName);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof WaitingChatDetails)) {
            return false;
        }
        WaitingChatDetails waitingChatDetails = (WaitingChatDetails) other;
        return Intrinsics.areEqual(this.attenderId, waitingChatDetails.attenderId) && Intrinsics.areEqual(this.attenderName, waitingChatDetails.attenderName) && this.isIntelligentTrigger == waitingChatDetails.isIntelligentTrigger && Intrinsics.areEqual(this.acknowledgementKey, waitingChatDetails.acknowledgementKey) && Intrinsics.areEqual(this.departmentName, waitingChatDetails.departmentName);
    }

    @Nullable
    public final String getAcknowledgementKey() {
        return this.acknowledgementKey;
    }

    @Nullable
    public final String getAttenderId() {
        return this.attenderId;
    }

    @Nullable
    public final String getAttenderName() {
        return this.attenderName;
    }

    @Nullable
    public final String getDepartmentName() {
        return this.departmentName;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        String str = this.attenderId;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.attenderName;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        boolean z10 = this.isIntelligentTrigger;
        int i10 = z10;
        if (z10 != 0) {
            i10 = 1;
        }
        int i11 = (hashCode2 + i10) * 31;
        String str3 = this.acknowledgementKey;
        int hashCode3 = (i11 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.departmentName;
        return hashCode3 + (str4 != null ? str4.hashCode() : 0);
    }

    public final boolean isIntelligentTrigger() {
        return this.isIntelligentTrigger;
    }

    @NotNull
    public String toString() {
        return "WaitingChatDetails(attenderId=" + this.attenderId + ", attenderName=" + this.attenderName + ", isIntelligentTrigger=" + this.isIntelligentTrigger + ", acknowledgementKey=" + this.acknowledgementKey + ", departmentName=" + this.departmentName + ')';
    }

    @JvmOverloads
    public WaitingChatDetails(@Nullable String str) {
        this(str, null, false, null, null, 30, null);
    }

    @JvmOverloads
    public WaitingChatDetails(@Nullable String str, @Nullable String str2) {
        this(str, str2, false, null, null, 28, null);
    }

    @JvmOverloads
    public WaitingChatDetails(@Nullable String str, @Nullable String str2, boolean z10) {
        this(str, str2, z10, null, null, 24, null);
    }

    @JvmOverloads
    public WaitingChatDetails(@Nullable String str, @Nullable String str2, boolean z10, @Nullable String str3) {
        this(str, str2, z10, str3, null, 16, null);
    }

    @JvmOverloads
    public WaitingChatDetails(@Nullable String str, @Nullable String str2, boolean z10, @Nullable String str3, @Nullable String str4) {
        this.attenderId = str;
        this.attenderName = str2;
        this.isIntelligentTrigger = z10;
        this.acknowledgementKey = str3;
        this.departmentName = str4;
    }

    public /* synthetic */ WaitingChatDetails(String str, String str2, boolean z10, String str3, String str4, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? null : str, (i10 & 2) != 0 ? null : str2, (i10 & 4) != 0 ? false : z10, (i10 & 8) != 0 ? null : str3, (i10 & 16) != 0 ? null : str4);
    }
}
