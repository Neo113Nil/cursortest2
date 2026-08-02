package ru.ozon.app.android.bank.externals;

import Ae.C;
import Ae.C2399j;
import Ae.C2408n0;
import De.C2862e;
import He.b;
import g30.InterfaceC6618a;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.account.user.UserManager;
import ru.ozon.fintech.lib.FintechCoreLib;
import xe.C10720e0;
import xe.N;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\r\u0010\t\u001a\u00020\b¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u000bR\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lru/ozon/app/android/bank/externals/FintechAnalyticOzonId;", "", "Lru/ozon/app/android/account/user/UserManager;", "userManager", "Lru/ozon/fintech/lib/FintechCoreLib;", "fintechCoreLib", "<init>", "(Lru/ozon/app/android/account/user/UserManager;Lru/ozon/fintech/lib/FintechCoreLib;)V", "", "init", "()V", "Lru/ozon/app/android/account/user/UserManager;", "Lg30/a;", "fintechAnalyticInteractor", "Lg30/a;", "ozonbank_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class FintechAnalyticOzonId {

    @NotNull
    private final InterfaceC6618a fintechAnalyticInteractor;

    @NotNull
    private final UserManager userManager;

    public FintechAnalyticOzonId(@NotNull UserManager userManager, @NotNull FintechCoreLib fintechCoreLib) {
        Intrinsics.checkNotNullParameter(userManager, "userManager");
        Intrinsics.checkNotNullParameter(fintechCoreLib, "fintechCoreLib");
        this.userManager = userManager;
        this.fintechAnalyticInteractor = fintechCoreLib.getFintechAnalyticInteractor();
    }

    public final void init() {
        C10720e0 c10720e0 = C10720e0.f105451a;
        C2862e a11 = N.a(b.f10879b);
        this.fintechAnalyticInteractor.j1(null);
        C2399j.C(new C(new C2408n0(this.userManager.getUserIdFlow(), new FintechAnalyticOzonId$init$1(this, null)), new FintechAnalyticOzonId$init$2(null)), a11);
    }
}
