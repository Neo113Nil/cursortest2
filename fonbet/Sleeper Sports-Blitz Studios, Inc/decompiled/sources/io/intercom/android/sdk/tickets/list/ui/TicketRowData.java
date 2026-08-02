package io.intercom.android.sdk.tickets.list.ui;

import com.facebook.appevents.iap.InAppPurchaseConstants;
import io.intercom.android.sdk.tickets.TicketStatus;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: TicketsScreenViewModel.kt */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0012\n\u0002\u0010\b\n\u0002\b\u0002\b\u0081\b\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0004\b\n\u0010\u000bJ\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0007HÆ\u0003J\t\u0010\u0017\u001a\u00020\tHÆ\u0003J;\u0010\u0018\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\tHÇ\u0001J\u0013\u0010\u0019\u001a\u00020\t2\b\u0010\u001a\u001a\u0004\u0018\u00010\u0001H×\u0003J\t\u0010\u001b\u001a\u00020\u001cH×\u0001J\t\u0010\u001d\u001a\u00020\u0003H×\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\rR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\rR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0012¨\u0006\u001e"}, d2 = {"Lio/intercom/android/sdk/tickets/list/ui/TicketRowData;", "", "id", "", "title", "subTitle", "status", "Lio/intercom/android/sdk/tickets/TicketStatus;", "isRead", "", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lio/intercom/android/sdk/tickets/TicketStatus;Z)V", "getId", "()Ljava/lang/String;", "getTitle", "getSubTitle", "getStatus", "()Lio/intercom/android/sdk/tickets/TicketStatus;", "()Z", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "other", "hashCode", "", InAppPurchaseConstants.METHOD_TO_STRING, "intercom-sdk-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes9.dex */
public final /* data */ class TicketRowData {
    public static final int $stable = 0;
    private final String id;
    private final boolean isRead;
    private final TicketStatus status;
    private final String subTitle;
    private final String title;

    public static /* synthetic */ TicketRowData copy$default(TicketRowData ticketRowData, String str, String str2, String str3, TicketStatus ticketStatus, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            str = ticketRowData.id;
        }
        if ((i & 2) != 0) {
            str2 = ticketRowData.title;
        }
        if ((i & 4) != 0) {
            str3 = ticketRowData.subTitle;
        }
        if ((i & 8) != 0) {
            ticketStatus = ticketRowData.status;
        }
        if ((i & 16) != 0) {
            z = ticketRowData.isRead;
        }
        boolean z2 = z;
        String str4 = str3;
        return ticketRowData.copy(str, str2, str4, ticketStatus, z2);
    }

    /* renamed from: component1, reason: from getter */
    public final String getId() {
        return this.id;
    }

    /* renamed from: component2, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    /* renamed from: component3, reason: from getter */
    public final String getSubTitle() {
        return this.subTitle;
    }

    /* renamed from: component4, reason: from getter */
    public final TicketStatus getStatus() {
        return this.status;
    }

    /* renamed from: component5, reason: from getter */
    public final boolean getIsRead() {
        return this.isRead;
    }

    public final TicketRowData copy(String id, String title, String subTitle, TicketStatus status, boolean isRead) {
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(subTitle, "subTitle");
        Intrinsics.checkNotNullParameter(status, "status");
        return new TicketRowData(id, title, subTitle, status, isRead);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TicketRowData)) {
            return false;
        }
        TicketRowData ticketRowData = (TicketRowData) other;
        return Intrinsics.areEqual(this.id, ticketRowData.id) && Intrinsics.areEqual(this.title, ticketRowData.title) && Intrinsics.areEqual(this.subTitle, ticketRowData.subTitle) && this.status == ticketRowData.status && this.isRead == ticketRowData.isRead;
    }

    public int hashCode() {
        return (((((((this.id.hashCode() * 31) + this.title.hashCode()) * 31) + this.subTitle.hashCode()) * 31) + this.status.hashCode()) * 31) + Boolean.hashCode(this.isRead);
    }

    public String toString() {
        return "TicketRowData(id=" + this.id + ", title=" + this.title + ", subTitle=" + this.subTitle + ", status=" + this.status + ", isRead=" + this.isRead + ')';
    }

    public TicketRowData(String id, String title, String subTitle, TicketStatus status, boolean z) {
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(subTitle, "subTitle");
        Intrinsics.checkNotNullParameter(status, "status");
        this.id = id;
        this.title = title;
        this.subTitle = subTitle;
        this.status = status;
        this.isRead = z;
    }

    public final String getId() {
        return this.id;
    }

    public final String getTitle() {
        return this.title;
    }

    public final String getSubTitle() {
        return this.subTitle;
    }

    public final TicketStatus getStatus() {
        return this.status;
    }

    public final boolean isRead() {
        return this.isRead;
    }
}
