package ru.ozon.app.android.seller.presentation;

import M4.c;
import androidx.lifecycle.P;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b`\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0005\u0010\u0006J!\u0010\n\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u00072\b\u0010\t\u001a\u0004\u0018\u00010\u0007H&¢\u0006\u0004\b\n\u0010\u000bR\u001a\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\r0\f8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u0011"}, d2 = {"Lru/ozon/app/android/seller/presentation/SellerViewModel;", "", "LM4/c;", "savedStateRegistry", "", "init", "(LM4/c;)V", "", "miniAppName", "referrerMiniAppName", "getTabConfig", "(Ljava/lang/String;Ljava/lang/String;)V", "Landroidx/lifecycle/P;", "Lru/ozon/app/android/seller/presentation/SellerState;", "getState", "()Landroidx/lifecycle/P;", "state", "miniapp_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public interface SellerViewModel {
    @NotNull
    P<SellerState> getState();

    void getTabConfig(@NotNull String miniAppName, String referrerMiniAppName);

    void init(@NotNull c savedStateRegistry);
}
