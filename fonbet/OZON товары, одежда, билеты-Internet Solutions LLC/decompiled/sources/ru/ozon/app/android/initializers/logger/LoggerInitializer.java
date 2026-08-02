package ru.ozon.app.android.initializers.logger;

import Lm0.a;
import kotlin.Metadata;
import ru.ozon.app.android.logger.tree.LoggerTreeKt;
import ru.ozon.app.android.startup.initializers.ActionInitializer;

@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\b\u0001\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0016¨\u0006\u0006"}, d2 = {"Lru/ozon/app/android/initializers/logger/LoggerInitializer;", "Lru/ozon/app/android/startup/initializers/ActionInitializer;", "<init>", "()V", "init", "", "main_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class LoggerInitializer implements ActionInitializer {
    @Override // ru.ozon.app.android.startup.initializers.ActionInitializer
    public void init() {
        a.f17149a.a(LoggerTreeKt.logTree(false));
    }
}
