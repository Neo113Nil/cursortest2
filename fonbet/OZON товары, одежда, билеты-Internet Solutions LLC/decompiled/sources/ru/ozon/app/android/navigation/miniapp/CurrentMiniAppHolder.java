package ru.ozon.app.android.navigation.miniapp;

import Sc.InterfaceC3999a;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@InterfaceC3999a
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0003\b'\u0018\u00002\u00020\u0001B\t\b\u0000¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0007\u001a\u00020\u00048&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006R\u0016\u0010\t\u001a\u0004\u0018\u00010\u00048&X¦\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\u0006R\u0014\u0010\u000b\u001a\u00020\n8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lru/ozon/app/android/navigation/miniapp/CurrentMiniAppHolder;", "", "<init>", "()V", "", "getCurrentMiniApp", "()Ljava/lang/String;", "currentMiniApp", "getCurrentMiniAppExceptMain", "currentMiniAppExceptMain", "", "isMainMiniApp", "()Z", "navigation_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public abstract class CurrentMiniAppHolder {
    @NotNull
    public abstract String getCurrentMiniApp();

    public abstract String getCurrentMiniAppExceptMain();

    public abstract boolean isMainMiniApp();
}
