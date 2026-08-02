package ru.ozon.app.android.composer.di;

import E10.c;
import hi.InterfaceC6958a;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.debug.WidgetsDebugToolsInteractor;

@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00060\u0001j\u0002`\u0002J\u000f\u0010\u0004\u001a\u00020\u0003H&¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H&¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lru/ozon/app/android/composer/di/ComposerPerformanceComponentApi;", "Lhi/a;", "Lru/ozon/app/android/di/provider/component/DiComponent;", "LE10/c;", "getPrefetchManager", "()LE10/c;", "Lru/ozon/app/android/debug/WidgetsDebugToolsInteractor;", "getWidgetsDebugToolsInteractor", "()Lru/ozon/app/android/debug/WidgetsDebugToolsInteractor;", "composer_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public interface ComposerPerformanceComponentApi extends InterfaceC6958a {
    @NotNull
    c getPrefetchManager();

    @NotNull
    WidgetsDebugToolsInteractor getWidgetsDebugToolsInteractor();
}
