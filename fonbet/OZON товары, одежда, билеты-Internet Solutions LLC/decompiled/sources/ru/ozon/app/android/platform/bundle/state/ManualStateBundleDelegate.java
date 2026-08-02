package ru.ozon.app.android.platform.bundle.state;

import android.os.Bundle;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u001c\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u00032\u0006\u0010\u0005\u001a\u00020\u0006H&J\u0018\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\u000bH&J\u0012\u0010\f\u001a\u0004\u0018\u00010\u00032\u0006\u0010\t\u001a\u00020\u0003H\u0016¨\u0006\r"}, d2 = {"Lru/ozon/app/android/platform/bundle/state/ManualStateBundleDelegate;", "", "restoreState", "Landroid/os/Bundle;", "savedBundle", "classLoader", "Ljava/lang/ClassLoader;", "saveState", "", "outState", "screenGuid", "", "cloneAndFlush", "android-platform_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public interface ManualStateBundleDelegate {

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    /* loaded from: classes13.dex */
    public static final class DefaultImpls {
        public static Bundle cloneAndFlush(@NotNull ManualStateBundleDelegate manualStateBundleDelegate, @NotNull Bundle outState) {
            Intrinsics.checkNotNullParameter(outState, "outState");
            String uuid = UUID.randomUUID().toString();
            Intrinsics.checkNotNullExpressionValue(uuid, "toString(...)");
            Object clone = outState.clone();
            Intrinsics.g(clone, "null cannot be cast to non-null type android.os.Bundle");
            Bundle bundle = (Bundle) clone;
            outState.clear();
            outState.putString("persisted_state_item_key", uuid);
            bundle.putString("persisted_state_item_key", uuid);
            return bundle;
        }
    }

    Bundle cloneAndFlush(@NotNull Bundle outState);

    Bundle restoreState(Bundle savedBundle, @NotNull ClassLoader classLoader);

    boolean saveState(@NotNull Bundle outState, @NotNull String screenGuid);
}
