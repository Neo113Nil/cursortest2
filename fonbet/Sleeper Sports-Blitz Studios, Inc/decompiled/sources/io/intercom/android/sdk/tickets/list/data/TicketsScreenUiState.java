package io.intercom.android.sdk.tickets.list.data;

import androidx.paging.compose.LazyPagingItems;
import com.facebook.appevents.iap.InAppPurchaseConstants;
import io.intercom.android.sdk.m5.components.ErrorState;
import io.intercom.android.sdk.models.EmptyState;
import io.intercom.android.sdk.tickets.list.ui.TicketRowData;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: TicketsScreenUiState.kt */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b1\u0018\u00002\u00020\u0001:\u0005\b\t\n\u000b\fB\t\b\u0005¢\u0006\u0004\b\u0002\u0010\u0003R\u0012\u0010\u0004\u001a\u00020\u0005X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007\u0082\u0001\u0005\r\u000e\u000f\u0010\u0011¨\u0006\u0012"}, d2 = {"Lio/intercom/android/sdk/tickets/list/data/TicketsScreenUiState;", "", "<init>", "()V", "screenLabel", "", "getScreenLabel", "()Ljava/lang/String;", "Initial", "Loading", "Content", "Empty", "Error", "Lio/intercom/android/sdk/tickets/list/data/TicketsScreenUiState$Content;", "Lio/intercom/android/sdk/tickets/list/data/TicketsScreenUiState$Empty;", "Lio/intercom/android/sdk/tickets/list/data/TicketsScreenUiState$Error;", "Lio/intercom/android/sdk/tickets/list/data/TicketsScreenUiState$Initial;", "Lio/intercom/android/sdk/tickets/list/data/TicketsScreenUiState$Loading;", "intercom-sdk-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes9.dex */
public abstract class TicketsScreenUiState {
    public static final int $stable = 0;

    public /* synthetic */ TicketsScreenUiState(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    public abstract String getScreenLabel();

    private TicketsScreenUiState() {
    }

    /* compiled from: TicketsScreenUiState.kt */
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÇ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rH×\u0003J\t\u0010\u000e\u001a\u00020\u000fH×\u0001J\t\u0010\u0010\u001a\u00020\u0003H×\u0001R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0011"}, d2 = {"Lio/intercom/android/sdk/tickets/list/data/TicketsScreenUiState$Initial;", "Lio/intercom/android/sdk/tickets/list/data/TicketsScreenUiState;", "screenLabel", "", "<init>", "(Ljava/lang/String;)V", "getScreenLabel", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "", "hashCode", "", InAppPurchaseConstants.METHOD_TO_STRING, "intercom-sdk-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class Initial extends TicketsScreenUiState {
        public static final int $stable = 0;
        private final String screenLabel;

        public static /* synthetic */ Initial copy$default(Initial initial, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                str = initial.screenLabel;
            }
            return initial.copy(str);
        }

        /* renamed from: component1, reason: from getter */
        public final String getScreenLabel() {
            return this.screenLabel;
        }

        public final Initial copy(String screenLabel) {
            Intrinsics.checkNotNullParameter(screenLabel, "screenLabel");
            return new Initial(screenLabel);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Initial) && Intrinsics.areEqual(this.screenLabel, ((Initial) other).screenLabel);
        }

        public int hashCode() {
            return this.screenLabel.hashCode();
        }

        public String toString() {
            return "Initial(screenLabel=" + this.screenLabel + ')';
        }

        @Override // io.intercom.android.sdk.tickets.list.data.TicketsScreenUiState
        public String getScreenLabel() {
            return this.screenLabel;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Initial(String screenLabel) {
            super(null);
            Intrinsics.checkNotNullParameter(screenLabel, "screenLabel");
            this.screenLabel = screenLabel;
        }
    }

    /* compiled from: TicketsScreenUiState.kt */
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÇ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rH×\u0003J\t\u0010\u000e\u001a\u00020\u000fH×\u0001J\t\u0010\u0010\u001a\u00020\u0003H×\u0001R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0011"}, d2 = {"Lio/intercom/android/sdk/tickets/list/data/TicketsScreenUiState$Loading;", "Lio/intercom/android/sdk/tickets/list/data/TicketsScreenUiState;", "screenLabel", "", "<init>", "(Ljava/lang/String;)V", "getScreenLabel", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "", "hashCode", "", InAppPurchaseConstants.METHOD_TO_STRING, "intercom-sdk-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class Loading extends TicketsScreenUiState {
        public static final int $stable = 0;
        private final String screenLabel;

        public static /* synthetic */ Loading copy$default(Loading loading, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                str = loading.screenLabel;
            }
            return loading.copy(str);
        }

        /* renamed from: component1, reason: from getter */
        public final String getScreenLabel() {
            return this.screenLabel;
        }

        public final Loading copy(String screenLabel) {
            Intrinsics.checkNotNullParameter(screenLabel, "screenLabel");
            return new Loading(screenLabel);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Loading) && Intrinsics.areEqual(this.screenLabel, ((Loading) other).screenLabel);
        }

        public int hashCode() {
            return this.screenLabel.hashCode();
        }

        public String toString() {
            return "Loading(screenLabel=" + this.screenLabel + ')';
        }

        @Override // io.intercom.android.sdk.tickets.list.data.TicketsScreenUiState
        public String getScreenLabel() {
            return this.screenLabel;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Loading(String screenLabel) {
            super(null);
            Intrinsics.checkNotNullParameter(screenLabel, "screenLabel");
            this.screenLabel = screenLabel;
        }
    }

    /* compiled from: TicketsScreenUiState.kt */
    @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0010\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B3\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\u0006\u0010\t\u001a\u00020\n¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0006HÆ\u0003J\u000b\u0010\u0016\u001a\u0004\u0018\u00010\bHÆ\u0003J\t\u0010\u0017\u001a\u00020\nHÆ\u0003J9\u0010\u0018\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\b\b\u0002\u0010\t\u001a\u00020\nHÇ\u0001J\u0013\u0010\u0019\u001a\u00020\u00062\b\u0010\u001a\u001a\u0004\u0018\u00010\u001bH×\u0003J\t\u0010\u001c\u001a\u00020\u001dH×\u0001J\t\u0010\u001e\u001a\u00020\nH×\u0001R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u000fR\u0013\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\t\u001a\u00020\nX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u001f"}, d2 = {"Lio/intercom/android/sdk/tickets/list/data/TicketsScreenUiState$Content;", "Lio/intercom/android/sdk/tickets/list/data/TicketsScreenUiState;", "lazyPagingTickets", "Landroidx/paging/compose/LazyPagingItems;", "Lio/intercom/android/sdk/tickets/list/ui/TicketRowData;", "isLoadingMore", "", "errorState", "Lio/intercom/android/sdk/m5/components/ErrorState;", "screenLabel", "", "<init>", "(Landroidx/paging/compose/LazyPagingItems;ZLio/intercom/android/sdk/m5/components/ErrorState;Ljava/lang/String;)V", "getLazyPagingTickets", "()Landroidx/paging/compose/LazyPagingItems;", "()Z", "getErrorState", "()Lio/intercom/android/sdk/m5/components/ErrorState;", "getScreenLabel", "()Ljava/lang/String;", "component1", "component2", "component3", "component4", "copy", "equals", "other", "", "hashCode", "", InAppPurchaseConstants.METHOD_TO_STRING, "intercom-sdk-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class Content extends TicketsScreenUiState {
        public static final int $stable = LazyPagingItems.$stable;
        private final ErrorState errorState;
        private final boolean isLoadingMore;
        private final LazyPagingItems<TicketRowData> lazyPagingTickets;
        private final String screenLabel;

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ Content copy$default(Content content, LazyPagingItems lazyPagingItems, boolean z, ErrorState errorState, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                lazyPagingItems = content.lazyPagingTickets;
            }
            if ((i & 2) != 0) {
                z = content.isLoadingMore;
            }
            if ((i & 4) != 0) {
                errorState = content.errorState;
            }
            if ((i & 8) != 0) {
                str = content.screenLabel;
            }
            return content.copy(lazyPagingItems, z, errorState, str);
        }

        public final LazyPagingItems<TicketRowData> component1() {
            return this.lazyPagingTickets;
        }

        /* renamed from: component2, reason: from getter */
        public final boolean getIsLoadingMore() {
            return this.isLoadingMore;
        }

        /* renamed from: component3, reason: from getter */
        public final ErrorState getErrorState() {
            return this.errorState;
        }

        /* renamed from: component4, reason: from getter */
        public final String getScreenLabel() {
            return this.screenLabel;
        }

        public final Content copy(LazyPagingItems<TicketRowData> lazyPagingTickets, boolean isLoadingMore, ErrorState errorState, String screenLabel) {
            Intrinsics.checkNotNullParameter(lazyPagingTickets, "lazyPagingTickets");
            Intrinsics.checkNotNullParameter(screenLabel, "screenLabel");
            return new Content(lazyPagingTickets, isLoadingMore, errorState, screenLabel);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Content)) {
                return false;
            }
            Content content = (Content) other;
            return Intrinsics.areEqual(this.lazyPagingTickets, content.lazyPagingTickets) && this.isLoadingMore == content.isLoadingMore && Intrinsics.areEqual(this.errorState, content.errorState) && Intrinsics.areEqual(this.screenLabel, content.screenLabel);
        }

        public int hashCode() {
            int hashCode = ((this.lazyPagingTickets.hashCode() * 31) + Boolean.hashCode(this.isLoadingMore)) * 31;
            ErrorState errorState = this.errorState;
            return ((hashCode + (errorState == null ? 0 : errorState.hashCode())) * 31) + this.screenLabel.hashCode();
        }

        public String toString() {
            return "Content(lazyPagingTickets=" + this.lazyPagingTickets + ", isLoadingMore=" + this.isLoadingMore + ", errorState=" + this.errorState + ", screenLabel=" + this.screenLabel + ')';
        }

        public /* synthetic */ Content(LazyPagingItems lazyPagingItems, boolean z, ErrorState errorState, String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(lazyPagingItems, (i & 2) != 0 ? false : z, (i & 4) != 0 ? null : errorState, str);
        }

        public final LazyPagingItems<TicketRowData> getLazyPagingTickets() {
            return this.lazyPagingTickets;
        }

        public final boolean isLoadingMore() {
            return this.isLoadingMore;
        }

        public final ErrorState getErrorState() {
            return this.errorState;
        }

        @Override // io.intercom.android.sdk.tickets.list.data.TicketsScreenUiState
        public String getScreenLabel() {
            return this.screenLabel;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Content(LazyPagingItems<TicketRowData> lazyPagingTickets, boolean z, ErrorState errorState, String screenLabel) {
            super(null);
            Intrinsics.checkNotNullParameter(lazyPagingTickets, "lazyPagingTickets");
            Intrinsics.checkNotNullParameter(screenLabel, "screenLabel");
            this.lazyPagingTickets = lazyPagingTickets;
            this.isLoadingMore = z;
            this.errorState = errorState;
            this.screenLabel = screenLabel;
        }
    }

    /* compiled from: TicketsScreenUiState.kt */
    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÇ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012H×\u0003J\t\u0010\u0013\u001a\u00020\u0014H×\u0001J\t\u0010\u0015\u001a\u00020\u0005H×\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0014\u0010\u0004\u001a\u00020\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0016"}, d2 = {"Lio/intercom/android/sdk/tickets/list/data/TicketsScreenUiState$Empty;", "Lio/intercom/android/sdk/tickets/list/data/TicketsScreenUiState;", "emptyState", "Lio/intercom/android/sdk/models/EmptyState;", "screenLabel", "", "<init>", "(Lio/intercom/android/sdk/models/EmptyState;Ljava/lang/String;)V", "getEmptyState", "()Lio/intercom/android/sdk/models/EmptyState;", "getScreenLabel", "()Ljava/lang/String;", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "", InAppPurchaseConstants.METHOD_TO_STRING, "intercom-sdk-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class Empty extends TicketsScreenUiState {
        public static final int $stable = 0;
        private final EmptyState emptyState;
        private final String screenLabel;

        public static /* synthetic */ Empty copy$default(Empty empty, EmptyState emptyState, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                emptyState = empty.emptyState;
            }
            if ((i & 2) != 0) {
                str = empty.screenLabel;
            }
            return empty.copy(emptyState, str);
        }

        /* renamed from: component1, reason: from getter */
        public final EmptyState getEmptyState() {
            return this.emptyState;
        }

        /* renamed from: component2, reason: from getter */
        public final String getScreenLabel() {
            return this.screenLabel;
        }

        public final Empty copy(EmptyState emptyState, String screenLabel) {
            Intrinsics.checkNotNullParameter(emptyState, "emptyState");
            Intrinsics.checkNotNullParameter(screenLabel, "screenLabel");
            return new Empty(emptyState, screenLabel);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Empty)) {
                return false;
            }
            Empty empty = (Empty) other;
            return Intrinsics.areEqual(this.emptyState, empty.emptyState) && Intrinsics.areEqual(this.screenLabel, empty.screenLabel);
        }

        public int hashCode() {
            return (this.emptyState.hashCode() * 31) + this.screenLabel.hashCode();
        }

        public String toString() {
            return "Empty(emptyState=" + this.emptyState + ", screenLabel=" + this.screenLabel + ')';
        }

        public final EmptyState getEmptyState() {
            return this.emptyState;
        }

        @Override // io.intercom.android.sdk.tickets.list.data.TicketsScreenUiState
        public String getScreenLabel() {
            return this.screenLabel;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Empty(EmptyState emptyState, String screenLabel) {
            super(null);
            Intrinsics.checkNotNullParameter(emptyState, "emptyState");
            Intrinsics.checkNotNullParameter(screenLabel, "screenLabel");
            this.emptyState = emptyState;
            this.screenLabel = screenLabel;
        }
    }

    /* compiled from: TicketsScreenUiState.kt */
    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÇ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012H×\u0003J\t\u0010\u0013\u001a\u00020\u0014H×\u0001J\t\u0010\u0015\u001a\u00020\u0005H×\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0014\u0010\u0004\u001a\u00020\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0016"}, d2 = {"Lio/intercom/android/sdk/tickets/list/data/TicketsScreenUiState$Error;", "Lio/intercom/android/sdk/tickets/list/data/TicketsScreenUiState;", "errorState", "Lio/intercom/android/sdk/m5/components/ErrorState;", "screenLabel", "", "<init>", "(Lio/intercom/android/sdk/m5/components/ErrorState;Ljava/lang/String;)V", "getErrorState", "()Lio/intercom/android/sdk/m5/components/ErrorState;", "getScreenLabel", "()Ljava/lang/String;", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "", InAppPurchaseConstants.METHOD_TO_STRING, "intercom-sdk-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class Error extends TicketsScreenUiState {
        public static final int $stable = 0;
        private final ErrorState errorState;
        private final String screenLabel;

        public static /* synthetic */ Error copy$default(Error error, ErrorState errorState, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                errorState = error.errorState;
            }
            if ((i & 2) != 0) {
                str = error.screenLabel;
            }
            return error.copy(errorState, str);
        }

        /* renamed from: component1, reason: from getter */
        public final ErrorState getErrorState() {
            return this.errorState;
        }

        /* renamed from: component2, reason: from getter */
        public final String getScreenLabel() {
            return this.screenLabel;
        }

        public final Error copy(ErrorState errorState, String screenLabel) {
            Intrinsics.checkNotNullParameter(errorState, "errorState");
            Intrinsics.checkNotNullParameter(screenLabel, "screenLabel");
            return new Error(errorState, screenLabel);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Error)) {
                return false;
            }
            Error error = (Error) other;
            return Intrinsics.areEqual(this.errorState, error.errorState) && Intrinsics.areEqual(this.screenLabel, error.screenLabel);
        }

        public int hashCode() {
            return (this.errorState.hashCode() * 31) + this.screenLabel.hashCode();
        }

        public String toString() {
            return "Error(errorState=" + this.errorState + ", screenLabel=" + this.screenLabel + ')';
        }

        public final ErrorState getErrorState() {
            return this.errorState;
        }

        @Override // io.intercom.android.sdk.tickets.list.data.TicketsScreenUiState
        public String getScreenLabel() {
            return this.screenLabel;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Error(ErrorState errorState, String screenLabel) {
            super(null);
            Intrinsics.checkNotNullParameter(errorState, "errorState");
            Intrinsics.checkNotNullParameter(screenLabel, "screenLabel");
            this.errorState = errorState;
            this.screenLabel = screenLabel;
        }
    }
}
