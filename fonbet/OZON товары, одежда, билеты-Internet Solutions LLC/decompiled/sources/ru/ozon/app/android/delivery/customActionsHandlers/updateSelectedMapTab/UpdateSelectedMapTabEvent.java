package ru.ozon.app.android.delivery.customActionsHandlers.updateSelectedMapTab;

import A00.a;
import V.e;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\u0007\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0011\u001a\u0004\b\u0012\u0010\bR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0011\u001a\u0004\b\u0013\u0010\b¨\u0006\u0014"}, d2 = {"Lru/ozon/app/android/delivery/customActionsHandlers/updateSelectedMapTab/UpdateSelectedMapTabEvent;", "LA00/a$J$a;", "", "link", "selectedTab", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getLink", "getSelectedTab", "custom-action-handlers_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class UpdateSelectedMapTabEvent implements a.J.InterfaceC0007a {

    @NotNull
    private final String link;

    @NotNull
    private final String selectedTab;

    public UpdateSelectedMapTabEvent(@NotNull String link, @NotNull String selectedTab) {
        Intrinsics.checkNotNullParameter(link, "link");
        Intrinsics.checkNotNullParameter(selectedTab, "selectedTab");
        this.link = link;
        this.selectedTab = selectedTab;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof UpdateSelectedMapTabEvent)) {
            return false;
        }
        UpdateSelectedMapTabEvent updateSelectedMapTabEvent = (UpdateSelectedMapTabEvent) other;
        return Intrinsics.d(this.link, updateSelectedMapTabEvent.link) && Intrinsics.d(this.selectedTab, updateSelectedMapTabEvent.selectedTab);
    }

    @NotNull
    public final String getLink() {
        return this.link;
    }

    @NotNull
    public final String getSelectedTab() {
        return this.selectedTab;
    }

    public int hashCode() {
        return this.selectedTab.hashCode() + (this.link.hashCode() * 31);
    }

    @NotNull
    public String toString() {
        return e.a("UpdateSelectedMapTabEvent(link=", this.link, ", selectedTab=", this.selectedTab, ")");
    }
}
