package ru.ozon.app.android.storefront.widgets.navbarv2.presentation.vo;

import Ef0.c;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\b\b\u0081\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u000e\u001a\u00020\u00022\b\u0010\r\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0010\u001a\u0004\b\u0003\u0010\u0011R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0010\u001a\u0004\b\u0004\u0010\u0011¨\u0006\u0012"}, d2 = {"Lru/ozon/app/android/storefront/widgets/navbarv2/presentation/vo/RichPromoSettings;", "", "", "isRichPromoEnabled", "isPromoScrolled", "<init>", "(ZZ)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Z", "()Z", "storefront_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final /* data */ class RichPromoSettings {
    private final boolean isPromoScrolled;
    private final boolean isRichPromoEnabled;

    public RichPromoSettings(boolean z11, boolean z12) {
        this.isRichPromoEnabled = z11;
        this.isPromoScrolled = z12;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof RichPromoSettings)) {
            return false;
        }
        RichPromoSettings richPromoSettings = (RichPromoSettings) other;
        return this.isRichPromoEnabled == richPromoSettings.isRichPromoEnabled && this.isPromoScrolled == richPromoSettings.isPromoScrolled;
    }

    public int hashCode() {
        return Boolean.hashCode(this.isPromoScrolled) + (Boolean.hashCode(this.isRichPromoEnabled) * 31);
    }

    /* renamed from: isPromoScrolled, reason: from getter */
    public final boolean getIsPromoScrolled() {
        return this.isPromoScrolled;
    }

    /* renamed from: isRichPromoEnabled, reason: from getter */
    public final boolean getIsRichPromoEnabled() {
        return this.isRichPromoEnabled;
    }

    @NotNull
    public String toString() {
        return c.c("RichPromoSettings(isRichPromoEnabled=", ", isPromoScrolled=", ")", this.isRichPromoEnabled, this.isPromoScrolled);
    }
}
