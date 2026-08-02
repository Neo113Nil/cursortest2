package ru.ozon.app.android.ugc.widgets.profileHeader;

import A00.a;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\t\b\u0001\u0018\u00002\u00020\u0001B\u001b\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0007\u001a\u0004\b\u0003\u0010\bR\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\t\u001a\u0004\b\u0004\u0010\n¨\u0006\u000b"}, d2 = {"Lru/ozon/app/android/ugc/widgets/profileHeader/ProfileHeaderVisibilityKey;", "LA00/a$J$a;", "", "isVisible", "isSubscribed", "<init>", "(ZLjava/lang/Boolean;)V", "Z", "()Z", "Ljava/lang/Boolean;", "()Ljava/lang/Boolean;", "ugc_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class ProfileHeaderVisibilityKey implements a.J.InterfaceC0007a {
    private final Boolean isSubscribed;
    private final boolean isVisible;

    public ProfileHeaderVisibilityKey(boolean z11, Boolean bool) {
        this.isVisible = z11;
        this.isSubscribed = bool;
    }

    /* renamed from: isSubscribed, reason: from getter */
    public final Boolean getIsSubscribed() {
        return this.isSubscribed;
    }

    /* renamed from: isVisible, reason: from getter */
    public final boolean getIsVisible() {
        return this.isVisible;
    }
}
