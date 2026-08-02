package io.intercom.android.sdk.tickets.create.data;

import com.facebook.appevents.iap.InAppPurchaseConstants;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: TicketAttributeRequest.kt */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0081\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\t\u0010\f\u001a\u00020\u0001HÆ\u0003J\u001d\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0001HÇ\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001H×\u0003J\t\u0010\u0011\u001a\u00020\u0012H×\u0001J\t\u0010\u0013\u001a\u00020\u0003H×\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0016\u0010\u0004\u001a\u00020\u00018\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0014"}, d2 = {"Lio/intercom/android/sdk/tickets/create/data/TicketAttributeRequest;", "", "descriptorId", "", "value", "<init>", "(Ljava/lang/String;Ljava/lang/Object;)V", "getDescriptorId", "()Ljava/lang/String;", "getValue", "()Ljava/lang/Object;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", InAppPurchaseConstants.METHOD_TO_STRING, "intercom-sdk-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes9.dex */
public final /* data */ class TicketAttributeRequest {
    public static final int $stable = 8;

    @SerializedName("descriptor_id")
    private final String descriptorId;

    @SerializedName("value")
    private final Object value;

    public static /* synthetic */ TicketAttributeRequest copy$default(TicketAttributeRequest ticketAttributeRequest, String str, Object obj, int i, Object obj2) {
        if ((i & 1) != 0) {
            str = ticketAttributeRequest.descriptorId;
        }
        if ((i & 2) != 0) {
            obj = ticketAttributeRequest.value;
        }
        return ticketAttributeRequest.copy(str, obj);
    }

    /* renamed from: component1, reason: from getter */
    public final String getDescriptorId() {
        return this.descriptorId;
    }

    /* renamed from: component2, reason: from getter */
    public final Object getValue() {
        return this.value;
    }

    public final TicketAttributeRequest copy(String descriptorId, Object value) {
        Intrinsics.checkNotNullParameter(descriptorId, "descriptorId");
        Intrinsics.checkNotNullParameter(value, "value");
        return new TicketAttributeRequest(descriptorId, value);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TicketAttributeRequest)) {
            return false;
        }
        TicketAttributeRequest ticketAttributeRequest = (TicketAttributeRequest) other;
        return Intrinsics.areEqual(this.descriptorId, ticketAttributeRequest.descriptorId) && Intrinsics.areEqual(this.value, ticketAttributeRequest.value);
    }

    public int hashCode() {
        return (this.descriptorId.hashCode() * 31) + this.value.hashCode();
    }

    public String toString() {
        return "TicketAttributeRequest(descriptorId=" + this.descriptorId + ", value=" + this.value + ')';
    }

    public TicketAttributeRequest(String descriptorId, Object value) {
        Intrinsics.checkNotNullParameter(descriptorId, "descriptorId");
        Intrinsics.checkNotNullParameter(value, "value");
        this.descriptorId = descriptorId;
        this.value = value;
    }

    public final String getDescriptorId() {
        return this.descriptorId;
    }

    public final Object getValue() {
        return this.value;
    }
}
