package ru.ozon.fintech.features.finwebview.domain.nativebridge;

import java.lang.ref.WeakReference;
import kotlin.jvm.functions.Function0;
import ru.ozon.fintech.features.finwebview.ui.FintechWebView;

/* loaded from: classes3.dex */
public final class n implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ NativeBridgeConfigurator f95644a;

    n(NativeBridgeConfigurator nativeBridgeConfigurator) {
        this.f95644a = nativeBridgeConfigurator;
    }

    @Override // java.lang.Runnable
    public final void run() {
        WeakReference weakReference;
        FintechWebView fintechWebView;
        Function0 function0;
        NativeBridgeConfigurator nativeBridgeConfigurator = this.f95644a;
        weakReference = nativeBridgeConfigurator.f95570p0;
        if (weakReference == null || (fintechWebView = (FintechWebView) weakReference.get()) == null) {
            return;
        }
        function0 = nativeBridgeConfigurator.f95582v0;
        fintechWebView.onPause("onStop " + (function0 != null ? (String) function0.invoke() : null));
    }
}
