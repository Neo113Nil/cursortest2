package ru.ozon.tracker.sendEvent;

import bk0.g;
import fi0.c;
import fi0.x;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0001\u0018\u00002\u00020\u0001B\u0019\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0011\u0010\t\u001a\u0004\u0018\u00010\bH\u0016¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u000bR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\f¨\u0006\r"}, d2 = {"Lru/ozon/tracker/sendEvent/CurrentPageInternalProvider;", "Lfi0/c;", "Lfi0/x;", "trackerSettings", "Lbk0/g;", "pageContainer", "<init>", "(Lfi0/x;Lbk0/g;)V", "Lru/ozon/tracker/sendEvent/Page;", "getCurrentPage", "()Lru/ozon/tracker/sendEvent/Page;", "Lfi0/x;", "Lbk0/g;", "tracker-sdk_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class CurrentPageInternalProvider implements c {

    @NotNull
    private final g pageContainer;

    @NotNull
    private final x trackerSettings;

    public CurrentPageInternalProvider(@NotNull x trackerSettings, @NotNull g pageContainer) {
        Intrinsics.checkNotNullParameter(trackerSettings, "trackerSettings");
        Intrinsics.checkNotNullParameter(pageContainer, "pageContainer");
        this.trackerSettings = trackerSettings;
        this.pageContainer = pageContainer;
    }

    @Override // fi0.c
    public Page getCurrentPage() {
        Page currentPage;
        c t2 = this.trackerSettings.t();
        return (t2 == null || (currentPage = t2.getCurrentPage()) == null) ? this.pageContainer.a() : currentPage;
    }
}
