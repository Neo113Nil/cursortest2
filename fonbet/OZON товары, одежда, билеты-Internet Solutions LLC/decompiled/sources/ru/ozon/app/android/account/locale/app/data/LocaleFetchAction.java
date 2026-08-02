package ru.ozon.app.android.account.locale.app.data;

import Fr.e;
import Ib.a;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.network.abtool.FeatureService;
import ru.ozon.app.android.utils.CoroutineUtilsKt;
import xe.C10727i;
import xe.M;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B%\b\u0007\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\n\u0010\u000bR\u001a\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\fR\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\f¨\u0006\r"}, d2 = {"Lru/ozon/app/android/account/locale/app/data/LocaleFetchAction;", "", "LIb/a;", "Lru/ozon/app/android/network/abtool/FeatureService;", "featureServiceProvider", "Lru/ozon/app/android/account/locale/app/data/AppLocaleRepository;", "appLocaleRepository", "<init>", "(LIb/a;LIb/a;)V", "", "fetch", "()V", "LIb/a;", "account_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class LocaleFetchAction {

    @NotNull
    private final a<AppLocaleRepository> appLocaleRepository;

    @NotNull
    private final a<FeatureService> featureServiceProvider;

    public LocaleFetchAction(@NotNull a<FeatureService> featureServiceProvider, @NotNull a<AppLocaleRepository> appLocaleRepository) {
        Intrinsics.checkNotNullParameter(featureServiceProvider, "featureServiceProvider");
        Intrinsics.checkNotNullParameter(appLocaleRepository, "appLocaleRepository");
        this.featureServiceProvider = featureServiceProvider;
        this.appLocaleRepository = appLocaleRepository;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void fetch$lambda$0(M m11, LocaleFetchAction localeFetchAction) {
        C10727i.c(m11, null, null, new LocaleFetchAction$fetch$1$1(localeFetchAction, null), 3);
    }

    public void fetch() {
        this.featureServiceProvider.get().addOnChangeFeatureListener(new e(1, CoroutineUtilsKt.getSafeScope(), this));
    }
}
