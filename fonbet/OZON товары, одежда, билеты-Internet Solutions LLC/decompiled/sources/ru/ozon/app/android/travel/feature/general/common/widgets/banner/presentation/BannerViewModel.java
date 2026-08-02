package ru.ozon.app.android.travel.feature.general.common.widgets.banner.presentation;

import He.b;
import androidx.lifecycle.w0;
import androidx.lifecycle.x0;
import h3.C6788a;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.travel.commonapi.api.TravelCommonCompletableApi;
import ru.ozon.uni.atoms.af.AtomAction;
import xe.B0;
import xe.C10720e0;
import xe.C10727i;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0015\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u000bR\u0018\u0010\r\u001a\u0004\u0018\u00010\f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lru/ozon/app/android/travel/feature/general/common/widgets/banner/presentation/BannerViewModel;", "Landroidx/lifecycle/w0;", "Lru/ozon/app/android/travel/commonapi/api/TravelCommonCompletableApi;", "api", "<init>", "(Lru/ozon/app/android/travel/commonapi/api/TravelCommonCompletableApi;)V", "Lru/ozon/uni/atoms/af/AtomAction$ComposerAction;", "action", "", "performComposerAction", "(Lru/ozon/uni/atoms/af/AtomAction$ComposerAction;)V", "Lru/ozon/app/android/travel/commonapi/api/TravelCommonCompletableApi;", "Lxe/B0;", "job", "Lxe/B0;", "common_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class BannerViewModel extends w0 {

    @NotNull
    private final TravelCommonCompletableApi api;
    private B0 job;

    public BannerViewModel(@NotNull TravelCommonCompletableApi api) {
        Intrinsics.checkNotNullParameter(api, "api");
        this.api = api;
    }

    public final void performComposerAction(@NotNull AtomAction.ComposerAction action) {
        Intrinsics.checkNotNullParameter(action, "action");
        B0 b02 = this.job;
        if (b02 != null) {
            b02.j(null);
        }
        C6788a a11 = x0.a(this);
        C10720e0 c10720e0 = C10720e0.f105451a;
        this.job = C10727i.c(a11, b.f10879b, null, new BannerViewModel$performComposerAction$1(this, action, null), 2);
    }
}
