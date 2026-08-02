package ru.ozon.app.android.search.widgets.dialogSearchBar.data.api;

import com.squareup.moshi.j;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.tracker.model.TrinityEventEntityKt;

@j(generateAdapter = true)
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0015"}, d2 = {"Lru/ozon/app/android/search/widgets/dialogSearchBar/data/api/DialogSearchInteractionsRequest;", "", TrinityEventEntityKt.ACTION_TYPE_JSON_NAME, "Lru/ozon/app/android/search/widgets/dialogSearchBar/data/api/ActionType;", "pageUrl", "", "<init>", "(Lru/ozon/app/android/search/widgets/dialogSearchBar/data/api/ActionType;Ljava/lang/String;)V", "getActionType", "()Lru/ozon/app/android/search/widgets/dialogSearchBar/data/api/ActionType;", "getPageUrl", "()Ljava/lang/String;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "search_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final /* data */ class DialogSearchInteractionsRequest {
    public static final int $stable = 0;

    @NotNull
    private final ActionType actionType;

    @NotNull
    private final String pageUrl;

    public DialogSearchInteractionsRequest(@NotNull ActionType actionType, @NotNull String pageUrl) {
        Intrinsics.checkNotNullParameter(actionType, "actionType");
        Intrinsics.checkNotNullParameter(pageUrl, "pageUrl");
        this.actionType = actionType;
        this.pageUrl = pageUrl;
    }

    public static /* synthetic */ DialogSearchInteractionsRequest copy$default(DialogSearchInteractionsRequest dialogSearchInteractionsRequest, ActionType actionType, String str, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            actionType = dialogSearchInteractionsRequest.actionType;
        }
        if ((i11 & 2) != 0) {
            str = dialogSearchInteractionsRequest.pageUrl;
        }
        return dialogSearchInteractionsRequest.copy(actionType, str);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final ActionType getActionType() {
        return this.actionType;
    }

    @NotNull
    /* renamed from: component2, reason: from getter */
    public final String getPageUrl() {
        return this.pageUrl;
    }

    @NotNull
    public final DialogSearchInteractionsRequest copy(@NotNull ActionType actionType, @NotNull String pageUrl) {
        Intrinsics.checkNotNullParameter(actionType, "actionType");
        Intrinsics.checkNotNullParameter(pageUrl, "pageUrl");
        return new DialogSearchInteractionsRequest(actionType, pageUrl);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof DialogSearchInteractionsRequest)) {
            return false;
        }
        DialogSearchInteractionsRequest dialogSearchInteractionsRequest = (DialogSearchInteractionsRequest) other;
        return this.actionType == dialogSearchInteractionsRequest.actionType && Intrinsics.d(this.pageUrl, dialogSearchInteractionsRequest.pageUrl);
    }

    @NotNull
    public final ActionType getActionType() {
        return this.actionType;
    }

    @NotNull
    public final String getPageUrl() {
        return this.pageUrl;
    }

    public int hashCode() {
        return this.pageUrl.hashCode() + (this.actionType.hashCode() * 31);
    }

    @NotNull
    public String toString() {
        return "DialogSearchInteractionsRequest(actionType=" + this.actionType + ", pageUrl=" + this.pageUrl + ")";
    }
}
