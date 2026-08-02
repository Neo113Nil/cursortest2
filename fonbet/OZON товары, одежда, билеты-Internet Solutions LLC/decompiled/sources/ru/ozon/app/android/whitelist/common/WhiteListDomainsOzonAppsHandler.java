package ru.ozon.app.android.whitelist.common;

import com.google.android.gms.common.internal.ImagesContract;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.navigation.NativePageDomainsInteractor;
import ru.ozon.app.android.utils.AppType;

@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\t¨\u0006\u000e"}, d2 = {"Lru/ozon/app/android/whitelist/common/WhiteListDomainsOzonAppsHandler;", "", "nativePageDomainsInteractor", "Lru/ozon/app/android/navigation/NativePageDomainsInteractor;", "<init>", "(Lru/ozon/app/android/navigation/NativePageDomainsInteractor;)V", "supportApps", "", "Lru/ozon/app/android/utils/AppType;", "[Lru/ozon/app/android/utils/AppType;", "canHandleLink", "", ImagesContract.URL, "", "whitelist_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class WhiteListDomainsOzonAppsHandler {

    @NotNull
    private final NativePageDomainsInteractor nativePageDomainsInteractor;

    @NotNull
    private final AppType[] supportApps;

    public WhiteListDomainsOzonAppsHandler(@NotNull NativePageDomainsInteractor nativePageDomainsInteractor) {
        Intrinsics.checkNotNullParameter(nativePageDomainsInteractor, "nativePageDomainsInteractor");
        this.nativePageDomainsInteractor = nativePageDomainsInteractor;
        this.supportApps = new AppType[]{AppType.SELECT, AppType.f94580BX};
    }

    public final boolean canHandleLink(String url) {
        NativePageDomainsInteractor nativePageDomainsInteractor = this.nativePageDomainsInteractor;
        AppType[] appTypeArr = this.supportApps;
        return nativePageDomainsInteractor.isHostContainsInNativePageDomainsByApps(url, (AppType[]) Arrays.copyOf(appTypeArr, appTypeArr.length));
    }
}
