package ru.ozon.app.android.navigation.newrouter.navigators.host;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0006\bf\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004R$\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00058&@&X¦\u000e¢\u0006\f\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\n¨\u0006\f"}, d2 = {"Lru/ozon/app/android/navigation/newrouter/navigators/host/AppHostUiReadyNotifier;", "", "", "isAppHostUiReady", "()Z", "Lkotlin/Function0;", "", "getOnAppHostUiReady", "()Lkotlin/jvm/functions/Function0;", "setOnAppHostUiReady", "(Lkotlin/jvm/functions/Function0;)V", "onAppHostUiReady", "navigation_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public interface AppHostUiReadyNotifier {
    boolean isAppHostUiReady();

    void setOnAppHostUiReady(Function0<Unit> function0);
}
