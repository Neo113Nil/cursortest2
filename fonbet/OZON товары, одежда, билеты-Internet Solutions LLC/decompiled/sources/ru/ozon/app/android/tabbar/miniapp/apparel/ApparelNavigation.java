package ru.ozon.app.android.tabbar.miniapp.apparel;

import T7.C4029k;
import android.net.Uri;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\r\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lru/ozon/app/android/tabbar/miniapp/apparel/ApparelNavigation;", "", "<init>", "()V", "Landroid/net/Uri;", "apparelFashion", "()Landroid/net/Uri;", "tabbar_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class ApparelNavigation {

    @NotNull
    public static final ApparelNavigation INSTANCE = new ApparelNavigation();

    private ApparelNavigation() {
    }

    @NotNull
    public final Uri apparelFashion() {
        return C4029k.a("ozon", "highlight", "fashion-selection", "build(...)");
    }
}
