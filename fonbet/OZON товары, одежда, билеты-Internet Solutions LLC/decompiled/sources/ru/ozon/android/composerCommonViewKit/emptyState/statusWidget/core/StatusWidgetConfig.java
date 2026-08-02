package ru.ozon.android.composerCommonViewKit.emptyState.statusWidget.core;

import j20.C7244b;
import j20.InterfaceC7243a;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.M;
import kotlin.jvm.internal.Intrinsics;
import n20.j;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u0000 \f2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\fB\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\t\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u000b¨\u0006\r"}, d2 = {"Lru/ozon/android/composerCommonViewKit/emptyState/statusWidget/core/StatusWidgetConfig;", "Lj20/a;", "", "Lru/ozon/android/composerCommonViewKit/emptyState/statusWidget/core/StatusWidgetParser;", "statusWidgetParser", "<init>", "(Lru/ozon/android/composerCommonViewKit/emptyState/statusWidget/core/StatusWidgetParser;)V", "Lj20/b;", "state", "parse", "(Lj20/b;)Ljava/lang/Object;", "Lru/ozon/android/composerCommonViewKit/emptyState/statusWidget/core/StatusWidgetParser;", "Companion", "common-view-kit_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class StatusWidgetConfig implements InterfaceC7243a<Object> {

    @NotNull
    private final StatusWidgetParser statusWidgetParser;
    public static final int $stable = 8;

    public StatusWidgetConfig(@NotNull StatusWidgetParser statusWidgetParser) {
        Intrinsics.checkNotNullParameter(statusWidgetParser, "statusWidgetParser");
        this.statusWidgetParser = statusWidgetParser;
    }

    @Override // j20.InterfaceC7243a
    public boolean canParse(@NotNull C7244b c7244b) {
        InterfaceC7243a.C1128a.a(c7244b);
        return true;
    }

    @Override // j20.InterfaceC7243a
    @NotNull
    public Set<String> getSupportedPlaceholders() {
        return M.f71699a;
    }

    @Override // j20.InterfaceC7243a
    @NotNull
    public long[] getSupportedVersions() {
        return j.b();
    }

    @Override // j20.InterfaceC7243a
    @NotNull
    public Object parse(@NotNull C7244b state) {
        Intrinsics.checkNotNullParameter(state, "state");
        return this.statusWidgetParser.invoke(state);
    }
}
