package ru.ozon.app.android.common.events;

import A00.a;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0006\u001a\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lru/ozon/app/android/common/events/AnchorVisibleEvent;", "LA00/a$J$a;", "", "anchorKey", "<init>", "(Ljava/lang/String;)V", "Ljava/lang/String;", "getAnchorKey", "()Ljava/lang/String;", "events_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class AnchorVisibleEvent implements a.J.InterfaceC0007a {
    private final String anchorKey;

    public AnchorVisibleEvent(String str) {
        this.anchorKey = str;
    }

    public final String getAnchorKey() {
        return this.anchorKey;
    }
}
