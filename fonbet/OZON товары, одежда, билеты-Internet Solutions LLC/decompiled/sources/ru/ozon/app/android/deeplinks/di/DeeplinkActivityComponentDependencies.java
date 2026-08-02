package ru.ozon.app.android.deeplinks.di;

import hi.InterfaceC6958a;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.ActivityInitializer;
import ru.ozon.app.android.deeplinks.KeepActivityHandler;

@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00060\u0001j\u0002`\u0002J\u000f\u0010\u0004\u001a\u00020\u0003H&¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H&¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lru/ozon/app/android/deeplinks/di/DeeplinkActivityComponentDependencies;", "Lhi/a;", "Lru/ozon/app/android/di/provider/component/DiComponent;", "Lru/ozon/app/android/ActivityInitializer;", "getActivityInitializer", "()Lru/ozon/app/android/ActivityInitializer;", "Lru/ozon/app/android/deeplinks/KeepActivityHandler;", "keepActivityHandler", "()Lru/ozon/app/android/deeplinks/KeepActivityHandler;", "main_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public interface DeeplinkActivityComponentDependencies extends InterfaceC6958a {
    @NotNull
    ActivityInitializer getActivityInitializer();

    @NotNull
    KeepActivityHandler keepActivityHandler();
}
