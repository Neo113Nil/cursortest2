package ru.ozon.app.android.common.filterWidgets.common;

import G.g;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.uni.atoms.af.AtomAction;

@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\r\b\u0086\b\u0018\u00002\u00020\u0001B)\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\b\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0016\u001a\u0004\b\u0017\u0010\fR\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u0017\u0010\b\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\b\u0010\u001b\u001a\u0004\b\u001c\u0010\u000e¨\u0006\u001d"}, d2 = {"Lru/ozon/app/android/common/filterWidgets/common/DelayedKeyboardVisibilityAction;", "", "Lru/ozon/uni/atoms/af/AtomAction$Click;", "action", "", "originalUrl", "", "scrollWidgetKey", "scrollY", "<init>", "(Lru/ozon/uni/atoms/af/AtomAction$Click;Ljava/lang/String;Ljava/lang/Integer;I)V", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lru/ozon/uni/atoms/af/AtomAction$Click;", "getAction", "()Lru/ozon/uni/atoms/af/AtomAction$Click;", "Ljava/lang/String;", "getOriginalUrl", "Ljava/lang/Integer;", "getScrollWidgetKey", "()Ljava/lang/Integer;", "I", "getScrollY", "filter-widgets_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class DelayedKeyboardVisibilityAction {

    @NotNull
    private final AtomAction.Click action;

    @NotNull
    private final String originalUrl;
    private final Integer scrollWidgetKey;
    private final int scrollY;

    public DelayedKeyboardVisibilityAction(@NotNull AtomAction.Click action, @NotNull String originalUrl, Integer num, int i11) {
        Intrinsics.checkNotNullParameter(action, "action");
        Intrinsics.checkNotNullParameter(originalUrl, "originalUrl");
        this.action = action;
        this.originalUrl = originalUrl;
        this.scrollWidgetKey = num;
        this.scrollY = i11;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof DelayedKeyboardVisibilityAction)) {
            return false;
        }
        DelayedKeyboardVisibilityAction delayedKeyboardVisibilityAction = (DelayedKeyboardVisibilityAction) other;
        return Intrinsics.d(this.action, delayedKeyboardVisibilityAction.action) && Intrinsics.d(this.originalUrl, delayedKeyboardVisibilityAction.originalUrl) && Intrinsics.d(this.scrollWidgetKey, delayedKeyboardVisibilityAction.scrollWidgetKey) && this.scrollY == delayedKeyboardVisibilityAction.scrollY;
    }

    @NotNull
    public final AtomAction.Click getAction() {
        return this.action;
    }

    @NotNull
    public final String getOriginalUrl() {
        return this.originalUrl;
    }

    public final Integer getScrollWidgetKey() {
        return this.scrollWidgetKey;
    }

    public final int getScrollY() {
        return this.scrollY;
    }

    public int hashCode() {
        int a11 = g.a(this.action.hashCode() * 31, 31, this.originalUrl);
        Integer num = this.scrollWidgetKey;
        return Integer.hashCode(this.scrollY) + ((a11 + (num == null ? 0 : num.hashCode())) * 31);
    }

    @NotNull
    public String toString() {
        return "DelayedKeyboardVisibilityAction(action=" + this.action + ", originalUrl=" + this.originalUrl + ", scrollWidgetKey=" + this.scrollWidgetKey + ", scrollY=" + this.scrollY + ")";
    }
}
