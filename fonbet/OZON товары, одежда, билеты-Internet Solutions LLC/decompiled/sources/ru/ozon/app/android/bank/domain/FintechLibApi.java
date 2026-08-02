package ru.ozon.app.android.bank.domain;

import hi.InterfaceC6958a;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import ru.ozon.fintech.lib.FintechCoreLib;
import ru.ozon.fintech.settings.domain.ExternalFintechSettings;

@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00060\u0001j\u0002`\u0002J\u000f\u0010\u0004\u001a\u00020\u0003H'¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0006\u001a\u00020\u0003H'¢\u0006\u0004\b\u0006\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0003H'¢\u0006\u0004\b\u0007\u0010\u0005J\u000f\u0010\t\u001a\u00020\bH'¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u000b\u001a\u00020\bH'¢\u0006\u0004\b\u000b\u0010\nJ\u000f\u0010\f\u001a\u00020\bH'¢\u0006\u0004\b\f\u0010\nJ\u000f\u0010\u000e\u001a\u00020\rH&¢\u0006\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"Lru/ozon/app/android/bank/domain/FintechLibApi;", "Lhi/a;", "Lru/ozon/app/android/di/provider/component/DiComponent;", "Lru/ozon/fintech/lib/FintechCoreLib;", "getFintechCoreLibRko", "()Lru/ozon/fintech/lib/FintechCoreLib;", "getFintechCoreLibPay", "getFintechCoreLibBank", "Lru/ozon/fintech/settings/domain/ExternalFintechSettings;", "getExternalFintechSettings", "()Lru/ozon/fintech/settings/domain/ExternalFintechSettings;", "getPayExternalFintechSettings", "getRkoExternalFintechSettings", "Lru/ozon/app/android/bank/domain/BankTabBadgeManager;", "getBankTabBadgeManager", "()Lru/ozon/app/android/bank/domain/BankTabBadgeManager;", "ozonbank_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public interface FintechLibApi extends InterfaceC6958a {
    @NotNull
    BankTabBadgeManager getBankTabBadgeManager();

    @NotNull
    ExternalFintechSettings getExternalFintechSettings();

    @NotNull
    FintechCoreLib getFintechCoreLibBank();

    @NotNull
    FintechCoreLib getFintechCoreLibPay();

    @NotNull
    FintechCoreLib getFintechCoreLibRko();

    @NotNull
    ExternalFintechSettings getPayExternalFintechSettings();

    @NotNull
    ExternalFintechSettings getRkoExternalFintechSettings();
}
