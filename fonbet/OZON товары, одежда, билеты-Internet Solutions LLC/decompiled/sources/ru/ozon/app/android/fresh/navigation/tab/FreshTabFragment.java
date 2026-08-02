package ru.ozon.app.android.fresh.navigation.tab;

import NZ.d;
import NZ.f;
import NZ.j;
import android.os.Bundle;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u0000 \r2\u00020\u00012\u00020\u0002:\u0001\rB\u0007¢\u0006\u0004\b\u0003\u0010\u0004J)\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u00052\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0016¢\u0006\u0004\b\u000b\u0010\f¨\u0006\u000e"}, d2 = {"Lru/ozon/app/android/fresh/navigation/tab/FreshTabFragment;", "LNZ/d;", "", "<init>", "()V", "", "containerId", "hostId", "LNZ/j;", "pathConfigOwner", "LNZ/f;", "onCreateNavigator", "(IILNZ/j;)LNZ/f;", "Companion", "navigation_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class FreshTabFragment extends d {

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0007¨\u0006\b"}, d2 = {"Lru/ozon/app/android/fresh/navigation/tab/FreshTabFragment$Companion;", "", "<init>", "()V", "newInstance", "Lru/ozon/app/android/fresh/navigation/tab/FreshTabFragment;", "deeplink", "", "navigation_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final FreshTabFragment newInstance(@NotNull String deeplink) {
            Intrinsics.checkNotNullParameter(deeplink, "deeplink");
            FreshTabFragment freshTabFragment = new FreshTabFragment();
            Bundle bundle = new Bundle();
            bundle.putString("ru.ozon.compass.TabFragment.EXTRA_DEEPLINK", deeplink);
            freshTabFragment.setArguments(bundle);
            return freshTabFragment;
        }

        private Companion() {
        }
    }

    @Override // NZ.d
    @NotNull
    public f onCreateNavigator(int containerId, int hostId, j pathConfigOwner) {
        return new FreshTabFragmentNavigator(this, containerId, hostId, pathConfigOwner);
    }
}
