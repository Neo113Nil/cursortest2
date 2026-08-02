package ru.ozon.app.android.initializers.shortcuts;

import android.content.Context;
import android.content.Intent;
import android.content.pm.ShortcutInfo;
import android.content.pm.ShortcutManager;
import android.graphics.drawable.Icon;
import android.net.Uri;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C7714v;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.main.R$drawable;
import ru.ozon.app.android.main.R$string;
import ru.ozon.app.android.startup.initializers.ActionInitializer;
import ru.ozon.app.android.uikit.text.StringProvider;
import ru.ozon.app.android.utils.ContextUtilsKt;
import xe.C10727i;
import xe.J;
import xe.M;
import xe.N;

@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u0000 \u00152\u00020\u0001:\u0001\u0015B\u0011\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0015\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\tH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\r\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\r\u0010\bR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u000eR\u0014\u0010\u0010\u001a\u00020\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0013\u001a\u00020\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014¨\u0006\u0016"}, d2 = {"Lru/ozon/app/android/initializers/shortcuts/DynamicShortcutsInitializer;", "Lru/ozon/app/android/startup/initializers/ActionInitializer;", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "", "pushDynamicShortcuts", "()V", "", "Landroid/content/pm/ShortcutInfo;", "generateDynamicShortcuts", "()Ljava/util/List;", "init", "Landroid/content/Context;", "Lxe/J;", "coroutineExceptionHandler", "Lxe/J;", "Lxe/M;", "mainScope", "Lxe/M;", "Companion", "main_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class DynamicShortcutsInitializer implements ActionInitializer {

    @NotNull
    private final Context context;

    @NotNull
    private final J coroutineExceptionHandler;

    @NotNull
    private final M mainScope;
    public static final int $stable = 8;

    public DynamicShortcutsInitializer(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.context = context;
        this.coroutineExceptionHandler = new DynamicShortcutsInitializer$special$$inlined$CoroutineExceptionHandler$1(J.f105405n0);
        this.mainScope = N.b();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final List<ShortcutInfo> generateDynamicShortcuts() {
        return C7714v.c0((ContextUtilsKt.isOzonFreshApplication(this.context) || ContextUtilsKt.isOzonSelectApplication(this.context) || ContextUtilsKt.isOzonTravelApplication(this.context)) ? null : new ShortcutInfo.Builder(this.context, "hotels").setShortLabel(StringProvider.getString(R$string.hotels_and_apartments_shortcut_label_android)).setLongLabel(StringProvider.getString(R$string.hotels_and_apartments_shortcut_long_label_android)).setIcon(Icon.createWithResource(this.context, R$drawable.ic_hotels_shortcut)).setIntent(new Intent().setAction("android.intent.action.VIEW").setClassName(this.context.getPackageName(), "ru.ozon.app.android.deeplinks.DeeplinkActivity").setData(Uri.parse("ozon://travel/mainHotel?miniapp=travel&mwc_campaign=oztravel_shortcut_hotel"))).build());
    }

    private final void pushDynamicShortcuts() {
        C10727i.c(this.mainScope, this.coroutineExceptionHandler, null, new DynamicShortcutsInitializer$pushDynamicShortcuts$1((ShortcutManager) this.context.getSystemService(ShortcutManager.class), this, null), 2);
    }

    @Override // ru.ozon.app.android.startup.initializers.ActionInitializer
    public void init() {
        pushDynamicShortcuts();
    }
}
