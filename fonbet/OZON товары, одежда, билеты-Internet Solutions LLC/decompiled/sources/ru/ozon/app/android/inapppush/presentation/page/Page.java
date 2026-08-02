package ru.ozon.app.android.inapppush.presentation.page;

import Kk.C3532b;
import Ve.C4636t5;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\t\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u000f\b\u0086\b\u0018\u00002\u00020\u0001B+\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\b\u0002\u0010\b\u001a\u00020\u0004¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0011\u001a\u00020\u00042\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0013\u001a\u0004\b\u0014\u0010\fR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0015\u001a\u0004\b\u0005\u0010\u0016R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\"\u0010\b\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\b\u0010\u0015\u001a\u0004\b\b\u0010\u0016\"\u0004\b\u001a\u0010\u001b¨\u0006\u001c"}, d2 = {"Lru/ozon/app/android/inapppush/presentation/page/Page;", "", "", "pageName", "", "isDialog", "", "delayMs", "isPaused", "<init>", "(Ljava/lang/String;ZLjava/lang/Long;Z)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getPageName", "Z", "()Z", "Ljava/lang/Long;", "getDelayMs", "()Ljava/lang/Long;", "setPaused", "(Z)V", "in-app-push-host_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final /* data */ class Page {
    private final Long delayMs;
    private final boolean isDialog;
    private boolean isPaused;

    @NotNull
    private final String pageName;

    public Page(@NotNull String pageName, boolean z11, Long l11, boolean z12) {
        Intrinsics.checkNotNullParameter(pageName, "pageName");
        this.pageName = pageName;
        this.isDialog = z11;
        this.delayMs = l11;
        this.isPaused = z12;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Page)) {
            return false;
        }
        Page page = (Page) other;
        return Intrinsics.d(this.pageName, page.pageName) && this.isDialog == page.isDialog && Intrinsics.d(this.delayMs, page.delayMs) && this.isPaused == page.isPaused;
    }

    public int hashCode() {
        int a11 = C3532b.a(this.pageName.hashCode() * 31, 31, this.isDialog);
        Long l11 = this.delayMs;
        return Boolean.hashCode(this.isPaused) + ((a11 + (l11 == null ? 0 : l11.hashCode())) * 31);
    }

    /* renamed from: isDialog, reason: from getter */
    public final boolean getIsDialog() {
        return this.isDialog;
    }

    /* renamed from: isPaused, reason: from getter */
    public final boolean getIsPaused() {
        return this.isPaused;
    }

    public final void setPaused(boolean z11) {
        this.isPaused = z11;
    }

    @NotNull
    public String toString() {
        String str = this.pageName;
        boolean z11 = this.isDialog;
        Long l11 = this.delayMs;
        boolean z12 = this.isPaused;
        StringBuilder b11 = C4636t5.b("Page(pageName=", str, ", isDialog=", ", delayMs=", z11);
        b11.append(l11);
        b11.append(", isPaused=");
        b11.append(z12);
        b11.append(")");
        return b11.toString();
    }

    public /* synthetic */ Page(String str, boolean z11, Long l11, boolean z12, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, z11, l11, (i11 & 8) != 0 ? false : z12);
    }
}
