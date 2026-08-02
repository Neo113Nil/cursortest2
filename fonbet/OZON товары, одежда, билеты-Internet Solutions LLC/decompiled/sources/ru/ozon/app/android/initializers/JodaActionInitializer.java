package ru.ozon.app.android.initializers;

import android.content.Context;
import androidx.startup.a;
import java.util.TimeZone;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import net.danlew.android.joda.JodaTimeInitializer;
import org.jetbrains.annotations.NotNull;
import org.joda.time.DateTimeZone;
import ru.ozon.app.android.startup.initializers.ActionInitializer;

@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\b\u0010\u0006\u001a\u00020\u0007H\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\b"}, d2 = {"Lru/ozon/app/android/initializers/JodaActionInitializer;", "Lru/ozon/app/android/startup/initializers/ActionInitializer;", "context", "Landroid/content/Context;", "<init>", "(Landroid/content/Context;)V", "init", "", "main_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class JodaActionInitializer implements ActionInitializer {

    @NotNull
    private final Context context;

    public JodaActionInitializer(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.context = context;
    }

    @Override // ru.ozon.app.android.startup.initializers.ActionInitializer
    public void init() {
        a.c(this.context).d(JodaTimeInitializer.class);
        DateTimeZone.D(DateTimeZone.f(TimeZone.getDefault()));
    }
}
