package ru.ozon.app.android.debugmenu.ozondebugmenu;

import android.content.Context;
import android.content.Intent;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\u0012\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0006\u001a\u00020\u0007H&J\n\u0010\b\u001a\u0004\u0018\u00010\u0001H&¨\u0006\t"}, d2 = {"Lru/ozon/app/android/debugmenu/ozondebugmenu/OzonDebugMenuHelper;", "", "safeInit", "", "getIntent", "Landroid/content/Intent;", "context", "Landroid/content/Context;", "getOPLibraryApi", "debugmenu_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public interface OzonDebugMenuHelper {
    Intent getIntent(@NotNull Context context);

    Object getOPLibraryApi();

    void safeInit();
}
