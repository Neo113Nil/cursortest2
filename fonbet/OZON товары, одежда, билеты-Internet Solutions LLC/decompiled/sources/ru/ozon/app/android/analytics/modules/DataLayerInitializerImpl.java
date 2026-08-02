package ru.ozon.app.android.analytics.modules;

import G.g;
import Sg.a;
import android.content.Context;
import android.os.Build;
import android.telephony.TelephonyManager;
import android.util.DisplayMetrics;
import android.view.WindowManager;
import com.google.android.gms.ads.identifier.AdvertisingIdClient;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Locale;
import java.util.TimeZone;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.h;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.analytics.datalayer.AnalyticsDataLayer;
import ru.ozon.app.android.analytics.datalayer.AnalyticsDevice;
import ru.ozon.app.android.analytics.datalayer.AnalyticsUser;
import ru.ozon.app.android.analytics.plugins.PluginsManager;

@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\b\b\u0001\u0018\u0000 \u001c2\u00020\u00012\u00020\u0002:\u0001\u001cB-\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\n\u0010\u000b\u001a\u00060\tj\u0002`\n¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000f\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0012\u001a\u00020\u0011H\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0014\u001a\u00020\u0011H\u0002¢\u0006\u0004\b\u0014\u0010\u0013J\u0017\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0006\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\u0019\u0010\u0019\u001a\u00020\u00152\b\u0010\u0018\u001a\u0004\u0018\u00010\u0011H\u0016¢\u0006\u0004\b\u0019\u0010\u001aR\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u001b¨\u0006\u001d"}, d2 = {"Lru/ozon/app/android/analytics/modules/DataLayerInitializerImpl;", "Lru/ozon/app/android/analytics/modules/BaseAnalyticsModule;", "Lru/ozon/app/android/analytics/modules/DataLayerInitializer;", "Landroid/content/Context;", "context", "Lru/ozon/app/android/analytics/datalayer/AnalyticsDataLayer;", "dataLayer", "Lru/ozon/app/android/analytics/plugins/PluginsManager;", "pluginsManager", "LSg/a;", "Lru/ozon/app/android/analytics/AnalyticsScreenStorage;", "analyticsScreenStorage", "<init>", "(Landroid/content/Context;Lru/ozon/app/android/analytics/datalayer/AnalyticsDataLayer;Lru/ozon/app/android/analytics/plugins/PluginsManager;LSg/a;)V", "Lru/ozon/app/android/analytics/datalayer/AnalyticsDevice;", "getDevice", "()Lru/ozon/app/android/analytics/datalayer/AnalyticsDevice;", "", "getDeviceName", "()Ljava/lang/String;", "getTimeZone", "", "updateDeviceAdId", "(Lru/ozon/app/android/analytics/datalayer/AnalyticsDataLayer;)V", "afUid", "setAfUid", "(Ljava/lang/String;)V", "Landroid/content/Context;", "Companion", "main_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class DataLayerInitializerImpl extends BaseAnalyticsModule implements DataLayerInitializer {

    @NotNull
    private final Context context;

    @NotNull
    private static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    @Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "", "Lru/ozon/app/android/analytics/datalayer/AnalyticsDataLayer;", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
    /* renamed from: ru.ozon.app.android.analytics.modules.DataLayerInitializerImpl$1, reason: invalid class name */
    static final class AnonymousClass1 extends AbstractC7737t implements Function1<AnalyticsDataLayer, Unit> {
        AnonymousClass1() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(AnalyticsDataLayer analyticsDataLayer) {
            invoke2(analyticsDataLayer);
            return Unit.f71690a;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(AnalyticsDataLayer modifyDataLayer) {
            Intrinsics.checkNotNullParameter(modifyDataLayer, "$this$modifyDataLayer");
            modifyDataLayer.setDevice(DataLayerInitializerImpl.this.getDevice());
            modifyDataLayer.setUser(new AnalyticsUser(null, null, 0, 0, false, null, null, 0, false, 511, null));
            DataLayerInitializerImpl.this.updateDeviceAdId(modifyDataLayer);
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Lru/ozon/app/android/analytics/modules/DataLayerInitializerImpl$Companion;", "", "<init>", "()V", "ISO_8601_TIME_ZONE_FORMAT", "", "main_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    private static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DataLayerInitializerImpl(@NotNull Context context, @NotNull AnalyticsDataLayer dataLayer, @NotNull PluginsManager pluginsManager, @NotNull a analyticsScreenStorage) {
        super(dataLayer, pluginsManager, analyticsScreenStorage);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(dataLayer, "dataLayer");
        Intrinsics.checkNotNullParameter(pluginsManager, "pluginsManager");
        Intrinsics.checkNotNullParameter(analyticsScreenStorage, "analyticsScreenStorage");
        this.context = context;
        modifyDataLayer(new AnonymousClass1());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final AnalyticsDevice getDevice() {
        String str;
        DisplayMetrics displayMetrics = new DisplayMetrics();
        WindowManager windowManager = (WindowManager) androidx.core.content.a.getSystemService(this.context, WindowManager.class);
        if (windowManager != null) {
            windowManager.getDefaultDisplay().getMetrics(displayMetrics);
        }
        int i11 = displayMetrics.widthPixels;
        int i12 = displayMetrics.heightPixels;
        TelephonyManager telephonyManager = (TelephonyManager) androidx.core.content.a.getSystemService(this.context, TelephonyManager.class);
        if (telephonyManager == null || (str = telephonyManager.getNetworkOperatorName()) == null) {
            str = "";
        }
        String str2 = str;
        String RELEASE = Build.VERSION.RELEASE;
        Intrinsics.checkNotNullExpressionValue(RELEASE, "RELEASE");
        return new AnalyticsDevice(RELEASE, getDeviceName(), i11 + "x" + i12, str2, Locale.getDefault().toString(), getTimeZone(), "");
    }

    private final String getDeviceName() {
        String str = Build.MANUFACTURER;
        String str2 = Build.MODEL;
        Intrinsics.f(str2);
        Intrinsics.f(str);
        return h.e0(str2, str, false) ? h.q(str2) : g.c(h.q(str), " ", str2);
    }

    private final String getTimeZone() {
        Locale locale = Locale.getDefault();
        String format = new SimpleDateFormat("Z", locale).format(Calendar.getInstance(TimeZone.getDefault(), locale).getTime());
        Intrinsics.checkNotNullExpressionValue(format, "format(...)");
        return format;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void updateDeviceAdId(AnalyticsDataLayer dataLayer) {
        AnalyticsDevice device;
        String id2 = AdvertisingIdClient.getAdvertisingIdInfo(this.context).getId();
        if (id2 == null || (device = dataLayer.getDevice()) == null) {
            return;
        }
        device.setAdId(id2);
    }

    @Override // ru.ozon.app.android.analytics.modules.DataLayerInitializer
    public void setAfUid(String afUid) {
        modifyDataLayer(new DataLayerInitializerImpl$setAfUid$1(afUid));
    }
}
