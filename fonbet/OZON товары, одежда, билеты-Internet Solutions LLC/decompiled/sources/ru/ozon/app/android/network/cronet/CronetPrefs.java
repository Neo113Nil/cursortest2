package ru.ozon.app.android.network.cronet;

import Lm0.a;
import Sc.InterfaceC4008j;
import Sc.k;
import android.content.Context;
import android.content.SharedPreferences;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.joda.time.Days;
import org.joda.time.LocalDate;
import ru.ozon.android.networkinfo.models.ConnectionType;
import ru.ozon.app.android.network.abtool.FeatureService;
import ru.ozon.app.android.network.auth.flags.H3CheckForceH2Days;
import ru.ozon.app.android.network.auth.flags.H3CheckForceH2Option;

@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\b\u0001\u0018\u0000 \u001a2\u00020\u0001:\u0001\u001aB\u0019\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\r\u0010\t\u001a\u00020\b¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\u000e\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\u000e\u0010\u000fJ\r\u0010\u0010\u001a\u00020\b¢\u0006\u0004\b\u0010\u0010\nR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0011R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0012R#\u0010\u0019\u001a\n \u0014*\u0004\u0018\u00010\u00130\u00138BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018¨\u0006\u001b"}, d2 = {"Lru/ozon/app/android/network/cronet/CronetPrefs;", "", "Landroid/content/Context;", "context", "Lru/ozon/app/android/network/abtool/FeatureService;", "featureService", "<init>", "(Landroid/content/Context;Lru/ozon/app/android/network/abtool/FeatureService;)V", "", "isQuicBroken", "()Z", "Lru/ozon/android/networkinfo/models/ConnectionType;", "connectionType", "", "setQuicBroken", "(Lru/ozon/android/networkinfo/models/ConnectionType;)V", "shouldFallbackToH2", "Landroid/content/Context;", "Lru/ozon/app/android/network/abtool/FeatureService;", "Landroid/content/SharedPreferences;", "kotlin.jvm.PlatformType", "prefs$delegate", "LSc/j;", "getPrefs", "()Landroid/content/SharedPreferences;", "prefs", "Companion", "network_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class CronetPrefs {

    @NotNull
    private static final Companion Companion = new Companion(null);

    @NotNull
    private final Context context;

    @NotNull
    private final FeatureService featureService;

    /* renamed from: prefs$delegate, reason: from kotlin metadata */
    @NotNull
    private final InterfaceC4008j prefs;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\b"}, d2 = {"Lru/ozon/app/android/network/cronet/CronetPrefs$Companion;", "", "<init>", "()V", "CRONET_PREFS_NAME", "", "QUIC_BROKEN_DATE_PREFS_KEY", "QUIC_BROKEN_CONNECTION_TYPE", "network_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    private static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    public CronetPrefs(@NotNull Context context, @NotNull FeatureService featureService) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(featureService, "featureService");
        this.context = context;
        this.featureService = featureService;
        this.prefs = k.b(new CronetPrefs$prefs$2(this));
    }

    private final SharedPreferences getPrefs() {
        return (SharedPreferences) this.prefs.getValue();
    }

    public final boolean isQuicBroken() {
        if (!getPrefs().contains("quic_broken_date_prefs_key")) {
            return false;
        }
        int n11 = Days.B(new LocalDate(getPrefs().getLong("quic_broken_date_prefs_key", 0L)), LocalDate.A()).n();
        a.b bVar = a.f17149a;
        bVar.b("QuicCheck");
        bVar.i("Quic check days since quick broken: " + n11, new Object[0]);
        if (n11 <= this.featureService.getIntKey(H3CheckForceH2Days.INSTANCE)) {
            return true;
        }
        SharedPreferences prefs = getPrefs();
        Intrinsics.checkNotNullExpressionValue(prefs, "<get-prefs>(...)");
        SharedPreferences.Editor edit = prefs.edit();
        edit.remove("quic_broken_date_prefs_key");
        edit.remove("quic_broken_connection_type");
        edit.apply();
        return false;
    }

    public final void setQuicBroken(@NotNull ConnectionType connectionType) {
        Intrinsics.checkNotNullParameter(connectionType, "connectionType");
        a.b bVar = a.f17149a;
        bVar.b("QuicCheck");
        bVar.i(Nk.a.b("Quic check set broken on: ", connectionType.name()), new Object[0]);
        SharedPreferences prefs = getPrefs();
        Intrinsics.checkNotNullExpressionValue(prefs, "<get-prefs>(...)");
        SharedPreferences.Editor edit = prefs.edit();
        edit.putLong("quic_broken_date_prefs_key", LocalDate.A().D().getTime());
        edit.putString("quic_broken_connection_type", connectionType.name());
        edit.apply();
    }

    public final boolean shouldFallbackToH2() {
        if (!isQuicBroken()) {
            return false;
        }
        int intKey = this.featureService.getIntKey(H3CheckForceH2Option.INSTANCE);
        return intKey != 1 ? intKey == 2 : Intrinsics.d(getPrefs().getString("quic_broken_connection_type", null), "WIFI");
    }
}
