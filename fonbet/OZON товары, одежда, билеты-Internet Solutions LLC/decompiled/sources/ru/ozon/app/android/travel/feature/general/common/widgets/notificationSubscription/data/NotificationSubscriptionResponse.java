package ru.ozon.app.android.travel.feature.general.common.widgets.notificationSubscription.data;

import B90.C2618u;
import com.squareup.moshi.j;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@j(generateAdapter = true)
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0081\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\u0007\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\t\u001a\u00020\u00032\b\u0010\n\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u000b\u001a\u00020\fHÖ\u0001J\t\u0010\r\u001a\u00020\u000eHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0002\u0010\u0006¨\u0006\u000f"}, d2 = {"Lru/ozon/app/android/travel/feature/general/common/widgets/notificationSubscription/data/NotificationSubscriptionResponse;", "", "isChecked", "", "<init>", "(Z)V", "()Z", "component1", "copy", "equals", "other", "hashCode", "", "toString", "", "common_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class NotificationSubscriptionResponse {
    public static final int $stable = 0;
    private final boolean isChecked;

    public NotificationSubscriptionResponse(boolean z11) {
        this.isChecked = z11;
    }

    public static /* synthetic */ NotificationSubscriptionResponse copy$default(NotificationSubscriptionResponse notificationSubscriptionResponse, boolean z11, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            z11 = notificationSubscriptionResponse.isChecked;
        }
        return notificationSubscriptionResponse.copy(z11);
    }

    /* renamed from: component1, reason: from getter */
    public final boolean getIsChecked() {
        return this.isChecked;
    }

    @NotNull
    public final NotificationSubscriptionResponse copy(boolean isChecked) {
        return new NotificationSubscriptionResponse(isChecked);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof NotificationSubscriptionResponse) && this.isChecked == ((NotificationSubscriptionResponse) other).isChecked;
    }

    public int hashCode() {
        return Boolean.hashCode(this.isChecked);
    }

    public final boolean isChecked() {
        return this.isChecked;
    }

    @NotNull
    public String toString() {
        return C2618u.g("NotificationSubscriptionResponse(isChecked=", ")", this.isChecked);
    }
}
