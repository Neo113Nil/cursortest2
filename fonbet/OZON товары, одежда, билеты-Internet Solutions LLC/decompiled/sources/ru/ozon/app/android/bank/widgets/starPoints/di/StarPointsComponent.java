package ru.ozon.app.android.bank.widgets.starPoints.di;

import hi.InterfaceC6958a;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.network.di.NetworkComponentApi;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\ba\u0018\u00002\u00060\u0001j\u0002`\u0002:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lru/ozon/app/android/bank/widgets/starPoints/di/StarPointsComponent;", "Lhi/a;", "Lru/ozon/app/android/di/provider/component/DiComponent;", "Factory", "ozonbank_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public interface StarPointsComponent extends InterfaceC6958a {

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bg\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&¨\u0006\u0006"}, d2 = {"Lru/ozon/app/android/bank/widgets/starPoints/di/StarPointsComponent$Factory;", "", "create", "Lru/ozon/app/android/bank/widgets/starPoints/di/StarPointsComponent;", "networkComponentApi", "Lru/ozon/app/android/network/di/NetworkComponentApi;", "ozonbank_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    /* loaded from: classes11.dex */
    public interface Factory {
        @NotNull
        StarPointsComponent create(@NotNull NetworkComponentApi networkComponentApi);
    }
}
