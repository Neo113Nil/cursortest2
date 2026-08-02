package ru.ozon.app.android.composer.network.referrer;

import android.net.Uri;
import kotlin.Metadata;
import kotlin.text.h;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\b\u0007\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\b\u001a\u00020\t2\b\u0010\n\u001a\u0004\u0018\u00010\u0005J\u0006\u0010\u000b\u001a\u00020\tJ\b\u0010\f\u001a\u0004\u0018\u00010\u0005J\u0010\u0010\r\u001a\u00020\t2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0005J\u000e\u0010\u000f\u001a\u00020\u0007*\u0004\u0018\u00010\u0005H\u0002R\u0010\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0010"}, d2 = {"Lru/ozon/app/android/composer/network/referrer/ReferrerValueController;", "", "<init>", "()V", "referrerValue", "", "shouldClearCurrentPageURL", "", "setCurrentPageReferrer", "", "referrer", "setClearCurrentReferrerTrue", "getCurrentPageReferrer", "clearCurrentPageURLIfNeeded", "currentPage", "isThisCartPage", "composer_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class ReferrerValueController {
    public static final int $stable = 8;
    private volatile String referrerValue;
    private volatile boolean shouldClearCurrentPageURL;

    private final boolean isThisCartPage(String str) {
        Uri parse;
        String path;
        String S11;
        return (str == null || (parse = Uri.parse(str)) == null || (path = parse.getPath()) == null || (S11 = h.S(path, "/")) == null || !h.e0(S11, "cart", false)) ? false : true;
    }

    public final void clearCurrentPageURLIfNeeded(String currentPage) {
        if (isThisCartPage(currentPage) && this.shouldClearCurrentPageURL && this.referrerValue != null) {
            this.referrerValue = null;
        }
    }

    /* renamed from: getCurrentPageReferrer, reason: from getter */
    public final String getReferrerValue() {
        return this.referrerValue;
    }

    public final void setClearCurrentReferrerTrue() {
        this.shouldClearCurrentPageURL = true;
    }

    public final void setCurrentPageReferrer(String referrer) {
        this.referrerValue = referrer;
        this.shouldClearCurrentPageURL = false;
    }
}
