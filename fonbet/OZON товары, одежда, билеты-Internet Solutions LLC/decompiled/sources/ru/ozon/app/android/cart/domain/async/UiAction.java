package ru.ozon.app.android.cart.domain.async;

import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010$\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\b\u0000\u0018\u00002\u00020\u0001B+\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00010\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\n\u001a\u0004\b\u000b\u0010\fR#\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\r\u001a\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u0013"}, d2 = {"Lru/ozon/app/android/cart/domain/async/UiAction;", "", "", "pageUrl", "", "payloads", "Lkotlin/time/b;", "debounce", "<init>", "(Ljava/lang/String;Ljava/util/Map;JLkotlin/jvm/internal/DefaultConstructorMarker;)V", "Ljava/lang/String;", "getPageUrl", "()Ljava/lang/String;", "Ljava/util/Map;", "getPayloads", "()Ljava/util/Map;", "J", "getDebounce-UwyO8pc", "()J", "cart_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class UiAction {
    private final long debounce;

    @NotNull
    private final String pageUrl;

    @NotNull
    private final Map<String, Object> payloads;

    public /* synthetic */ UiAction(String str, Map map, long j11, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, map, j11);
    }

    /* renamed from: getDebounce-UwyO8pc, reason: not valid java name and from getter */
    public final long getDebounce() {
        return this.debounce;
    }

    @NotNull
    public final String getPageUrl() {
        return this.pageUrl;
    }

    @NotNull
    public final Map<String, Object> getPayloads() {
        return this.payloads;
    }

    private UiAction(String pageUrl, Map<String, ? extends Object> payloads, long j11) {
        Intrinsics.checkNotNullParameter(pageUrl, "pageUrl");
        Intrinsics.checkNotNullParameter(payloads, "payloads");
        this.pageUrl = pageUrl;
        this.payloads = payloads;
        this.debounce = j11;
    }
}
