package ru.ozon.app.android.abtool.di;

import Ld0.d;
import android.content.SharedPreferences;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u0001H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"<anonymous>", "Landroid/content/SharedPreferences;", "kotlin.jvm.PlatformType", "invoke", "()Landroid/content/SharedPreferences;"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
final class ServiceLocator$sharedPrefs$2 extends AbstractC7737t implements Function0<SharedPreferences> {
    public static final ServiceLocator$sharedPrefs$2 INSTANCE = new ServiceLocator$sharedPrefs$2();

    ServiceLocator$sharedPrefs$2() {
        super(0);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // kotlin.jvm.functions.Function0
    public final SharedPreferences invoke() {
        d dVar;
        dVar = ServiceLocator.globalConfig;
        if (dVar != null) {
            return dVar.a().getSharedPreferences("abtool_service_locator_prefs", 0);
        }
        Intrinsics.n("globalConfig");
        throw null;
    }
}
