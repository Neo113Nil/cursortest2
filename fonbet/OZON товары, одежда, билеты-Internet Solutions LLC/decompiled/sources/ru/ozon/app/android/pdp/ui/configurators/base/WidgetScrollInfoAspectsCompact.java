package ru.ozon.app.android.pdp.ui.configurators.base;

import A00.a;
import Am.C2438a;
import B0.C2454a;
import C.o0;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\u0006\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u0006\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\u000b\u0010\fJ.\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u0005HÆ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u000f\u0010\tJ\u0010\u0010\u0010\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0015\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0017R\u0014\u0010\u0004\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0017R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0018¨\u0006\u0019"}, d2 = {"Lru/ozon/app/android/pdp/ui/configurators/base/WidgetScrollInfoAspectsCompact;", "Lru/ozon/app/android/pdp/ui/configurators/base/WidgetScrollInfo;", "", "scrollWidgetKey", "offset", "", "refreshDeeplink", "<init>", "(IILjava/lang/String;)V", "()Ljava/lang/String;", "LA00/a$C;", "busEventScroll", "()LA00/a$C;", "copy", "(IILjava/lang/String;)Lru/ozon/app/android/pdp/ui/configurators/base/WidgetScrollInfoAspectsCompact;", "toString", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "I", "Ljava/lang/String;", "configurators_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final /* data */ class WidgetScrollInfoAspectsCompact implements WidgetScrollInfo {
    private final int offset;

    @NotNull
    private final String refreshDeeplink;
    private final int scrollWidgetKey;

    public WidgetScrollInfoAspectsCompact(int i11, int i12, @NotNull String refreshDeeplink) {
        Intrinsics.checkNotNullParameter(refreshDeeplink, "refreshDeeplink");
        this.scrollWidgetKey = i11;
        this.offset = i12;
        this.refreshDeeplink = refreshDeeplink;
    }

    public static /* synthetic */ WidgetScrollInfoAspectsCompact copy$default(WidgetScrollInfoAspectsCompact widgetScrollInfoAspectsCompact, int i11, int i12, String str, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            i11 = widgetScrollInfoAspectsCompact.scrollWidgetKey;
        }
        if ((i13 & 2) != 0) {
            i12 = widgetScrollInfoAspectsCompact.offset;
        }
        if ((i13 & 4) != 0) {
            str = widgetScrollInfoAspectsCompact.refreshDeeplink;
        }
        return widgetScrollInfoAspectsCompact.copy(i11, i12, str);
    }

    @NotNull
    public a.C busEventScroll() {
        return new a.C.d(this.scrollWidgetKey, this.offset, 28, false);
    }

    @NotNull
    public final WidgetScrollInfoAspectsCompact copy(int scrollWidgetKey, int offset, @NotNull String refreshDeeplink) {
        Intrinsics.checkNotNullParameter(refreshDeeplink, "refreshDeeplink");
        return new WidgetScrollInfoAspectsCompact(scrollWidgetKey, offset, refreshDeeplink);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof WidgetScrollInfoAspectsCompact)) {
            return false;
        }
        WidgetScrollInfoAspectsCompact widgetScrollInfoAspectsCompact = (WidgetScrollInfoAspectsCompact) other;
        return this.scrollWidgetKey == widgetScrollInfoAspectsCompact.scrollWidgetKey && this.offset == widgetScrollInfoAspectsCompact.offset && Intrinsics.d(this.refreshDeeplink, widgetScrollInfoAspectsCompact.refreshDeeplink);
    }

    public int hashCode() {
        return this.refreshDeeplink.hashCode() + C2454a.a(this.offset, Integer.hashCode(this.scrollWidgetKey) * 31, 31);
    }

    @NotNull
    /* renamed from: refreshDeeplink, reason: from getter */
    public String getRefreshDeeplink() {
        return this.refreshDeeplink;
    }

    @NotNull
    public String toString() {
        int i11 = this.scrollWidgetKey;
        int i12 = this.offset;
        return o0.c(C2438a.a("WidgetScrollInfoAspectsCompact(scrollWidgetKey=", i11, ", offset=", ", refreshDeeplink=", i12), this.refreshDeeplink, ")");
    }

    public /* synthetic */ WidgetScrollInfoAspectsCompact(int i11, int i12, String str, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(i11, (i13 & 2) != 0 ? 0 : i12, (i13 & 4) != 0 ? "" : str);
    }
}
