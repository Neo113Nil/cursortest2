package ru.ozon.app.android.network.dependency;

import He.b;
import Sc.InterfaceC4008j;
import Sc.k;
import Wc.a;
import android.content.Context;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.d;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.network.abtool.FeatureService;
import ru.ozon.app.android.network.flags.HarLoggerSessionCountFlag;
import ru.ozon.app.android.network.logrequests.LogRequestsService;
import ru.ozon.app.android.storage.user.UserStatusStorage;
import xe.C10720e0;
import xe.C10727i;

@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0001\u0018\u00002\u00020\u0001B\u0019\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u000b\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000b\u0010\nJ\u0018\u0010\r\u001a\u00020\f2\u0006\u0010\u0005\u001a\u00020\u0004H\u0096@¢\u0006\u0004\b\r\u0010\u000eR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u000fR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0010R\u001b\u0010\u0016\u001a\u00020\u00118BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u0017"}, d2 = {"Lru/ozon/app/android/network/dependency/LogRequestsServiceImpl;", "Lru/ozon/app/android/network/logrequests/LogRequestsService;", "Lru/ozon/app/android/storage/user/UserStatusStorage;", "userStatusStorage", "Landroid/content/Context;", "context", "<init>", "(Lru/ozon/app/android/storage/user/UserStatusStorage;Landroid/content/Context;)V", "", "canProcess", "()Z", "isOzonHarLoggerFlagEnabled", "", "share", "(Landroid/content/Context;Lkotlin/coroutines/d;)Ljava/lang/Object;", "Lru/ozon/app/android/storage/user/UserStatusStorage;", "Landroid/content/Context;", "Lru/ozon/app/android/network/abtool/FeatureService;", "featureService$delegate", "LSc/j;", "getFeatureService", "()Lru/ozon/app/android/network/abtool/FeatureService;", "featureService", "main_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class LogRequestsServiceImpl implements LogRequestsService {

    @NotNull
    private final Context context;

    /* renamed from: featureService$delegate, reason: from kotlin metadata */
    @NotNull
    private final InterfaceC4008j featureService;

    @NotNull
    private final UserStatusStorage userStatusStorage;

    public LogRequestsServiceImpl(@NotNull UserStatusStorage userStatusStorage, @NotNull Context context) {
        Intrinsics.checkNotNullParameter(userStatusStorage, "userStatusStorage");
        Intrinsics.checkNotNullParameter(context, "context");
        this.userStatusStorage = userStatusStorage;
        this.context = context;
        this.featureService = k.b(new LogRequestsServiceImpl$featureService$2(this));
    }

    private final FeatureService getFeatureService() {
        return (FeatureService) this.featureService.getValue();
    }

    @Override // ru.ozon.app.android.network.logrequests.LogRequestsService
    public boolean canProcess() {
        return this.userStatusStorage.isOzonQa();
    }

    @Override // ru.ozon.app.android.network.logrequests.LogRequestsService
    public boolean isOzonHarLoggerFlagEnabled() {
        return getFeatureService().getIntKey(HarLoggerSessionCountFlag.INSTANCE) > 0;
    }

    @Override // ru.ozon.app.android.network.logrequests.LogRequestsService
    public Object share(@NotNull Context context, @NotNull d<? super Unit> dVar) {
        C10720e0 c10720e0 = C10720e0.f105451a;
        Object f7 = C10727i.f(b.f10879b, new LogRequestsServiceImpl$share$2(this, context, null), dVar);
        return f7 == a.COROUTINE_SUSPENDED ? f7 : Unit.f71690a;
    }
}
