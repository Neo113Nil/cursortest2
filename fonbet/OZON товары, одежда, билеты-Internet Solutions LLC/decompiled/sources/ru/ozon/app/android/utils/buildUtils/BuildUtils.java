package ru.ozon.app.android.utils.buildUtils;

import kotlin.Metadata;
import kotlin.text.h;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0006\u0010\u0004\u001a\u00020\u0005J\u0006\u0010\u0006\u001a\u00020\u0005J\b\u0010\u0007\u001a\u00020\bH\u0002J\b\u0010\t\u001a\u00020\u0005H\u0002J\b\u0010\n\u001a\u00020\u0005H\u0002¨\u0006\u000b"}, d2 = {"Lru/ozon/app/android/utils/buildUtils/BuildUtils;", "", "<init>", "()V", "isQaFlavor", "", "isDebug", "ensureChecks", "", "startsWithQa", "startsWithRc", "utils_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class BuildUtils {

    @NotNull
    public static final BuildUtils INSTANCE = new BuildUtils();

    private BuildUtils() {
    }

    private final void ensureChecks() {
        if (!startsWithQa() && !startsWithRc()) {
            throw new Exception("Check your flavors setup. One of the checks should be correct!");
        }
    }

    private final boolean startsWithQa() {
        return h.e0("prodGoogleAllVendors", "qa", true);
    }

    private final boolean startsWithRc() {
        return h.e0("prodGoogleAllVendors", "prod", true);
    }

    public final boolean isDebug() {
        return false;
    }

    public final boolean isQaFlavor() {
        ensureChecks();
        return startsWithQa();
    }
}
