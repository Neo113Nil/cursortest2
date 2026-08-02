package ru.ozon.app.android.fresh.feature.b2b.widgets.addEdoV2.data;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.fresh.feature.b2b.ui.configurators.statusEdo.StatusEdoState;

@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0006\u0010\u0006\u001a\u00020\u0007R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\b"}, d2 = {"Lru/ozon/app/android/fresh/feature/b2b/widgets/addEdoV2/data/AddEdoStatusStorage;", "", "statusEdoState", "Lru/ozon/app/android/fresh/feature/b2b/ui/configurators/statusEdo/StatusEdoState;", "<init>", "(Lru/ozon/app/android/fresh/feature/b2b/ui/configurators/statusEdo/StatusEdoState;)V", "updateStatusEdo", "", "b2b_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class AddEdoStatusStorage {

    @NotNull
    private final StatusEdoState statusEdoState;

    public AddEdoStatusStorage(@NotNull StatusEdoState statusEdoState) {
        Intrinsics.checkNotNullParameter(statusEdoState, "statusEdoState");
        this.statusEdoState = statusEdoState;
    }

    public final void updateStatusEdo() {
        this.statusEdoState.updateStatusEdoState();
    }
}
