package ru.ozon.app.android.tabbar.miniapp.travel;

import T7.C4029k;
import android.net.Uri;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0006\u0010\u0004\u001a\u00020\u0005¨\u0006\u0006"}, d2 = {"Lru/ozon/app/android/tabbar/miniapp/travel/TravelLinkGenerator;", "", "<init>", "()V", "travelSupport", "Landroid/net/Uri;", "tabbar_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class TravelLinkGenerator {

    @NotNull
    public static final TravelLinkGenerator INSTANCE = new TravelLinkGenerator();

    private TravelLinkGenerator() {
    }

    @NotNull
    public final Uri travelSupport() {
        return C4029k.a("ozon", "travel", "support", "build(...)");
    }
}
