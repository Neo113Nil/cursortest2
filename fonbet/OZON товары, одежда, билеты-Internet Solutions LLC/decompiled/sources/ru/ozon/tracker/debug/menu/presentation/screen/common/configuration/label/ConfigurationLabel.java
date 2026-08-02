package ru.ozon.tracker.debug.menu.presentation.screen.common.configuration.label;

import Xc.a;
import Xc.b;
import fj0.d;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import vi0.AbstractC10323a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0016\b\u0080\u0081\u0002\u0018\u0000 \u000e2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u000fB\u001d\b\u0002\u0012\n\u0010\u0003\u001a\u0006\u0012\u0002\b\u00030\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007R\u001b\u0010\u0003\u001a\u0006\u0012\u0002\b\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\b\u001a\u0004\b\t\u0010\nR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u000b\u001a\u0004\b\f\u0010\rj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014j\u0002\b\u0015j\u0002\b\u0016j\u0002\b\u0017j\u0002\b\u0018j\u0002\b\u0019¨\u0006\u001a"}, d2 = {"Lru/ozon/tracker/debug/menu/presentation/screen/common/configuration/label/ConfigurationLabel;", "", "Lfj0/d;", "param", "", "label", "<init>", "(Ljava/lang/String;ILfj0/d;Ljava/lang/String;)V", "Lfj0/d;", "getParam", "()Lfj0/d;", "Ljava/lang/String;", "getLabel", "()Ljava/lang/String;", "Companion", "a", "BATCH_SIZE", "PRODUCT_SENDING_PERIOD", "TRACK_APP_LIFECYCLE", "TEST_MODE", "LOGS", "FORCE_SENDING_PRODUCT_ANALYTICS_ON_MINIMIZE", "DELAYED_SENDING_PRODUCT_ANALYTICS", "FORCE_SENDING_PERF_ANALYTICS_ON_MINIMIZE", "DELAYED_SENDING_PERF_ANALYTICS", "PERFORMANCE_LIFETIME_EVENT", "debug-menu_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class ConfigurationLabel {
    private static final /* synthetic */ a $ENTRIES;
    private static final /* synthetic */ ConfigurationLabel[] $VALUES;

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE;

    @NotNull
    private final String label;

    @NotNull
    private final d<?> param;
    public static final ConfigurationLabel BATCH_SIZE = new ConfigurationLabel("BATCH_SIZE", 0, AbstractC10323a.C2233a.f102983c, "Batch size");
    public static final ConfigurationLabel PRODUCT_SENDING_PERIOD = new ConfigurationLabel("PRODUCT_SENDING_PERIOD", 1, AbstractC10323a.i.f102991c, "Product sending period (millis)");
    public static final ConfigurationLabel TRACK_APP_LIFECYCLE = new ConfigurationLabel("TRACK_APP_LIFECYCLE", 2, AbstractC10323a.k.f102993c, "Track App Lifecycle");
    public static final ConfigurationLabel TEST_MODE = new ConfigurationLabel("TEST_MODE", 3, AbstractC10323a.j.f102992c, "Test Mode");
    public static final ConfigurationLabel LOGS = new ConfigurationLabel("LOGS", 4, AbstractC10323a.g.f102989c, "Logs");
    public static final ConfigurationLabel FORCE_SENDING_PRODUCT_ANALYTICS_ON_MINIMIZE = new ConfigurationLabel("FORCE_SENDING_PRODUCT_ANALYTICS_ON_MINIMIZE", 5, AbstractC10323a.e.f102987c, "Force sending events on minimize");
    public static final ConfigurationLabel DELAYED_SENDING_PRODUCT_ANALYTICS = new ConfigurationLabel("DELAYED_SENDING_PRODUCT_ANALYTICS", 6, AbstractC10323a.c.f102985c, "Delayed sending events");
    public static final ConfigurationLabel FORCE_SENDING_PERF_ANALYTICS_ON_MINIMIZE = new ConfigurationLabel("FORCE_SENDING_PERF_ANALYTICS_ON_MINIMIZE", 7, AbstractC10323a.f.f102988c, "Force sending traces on minimize");
    public static final ConfigurationLabel DELAYED_SENDING_PERF_ANALYTICS = new ConfigurationLabel("DELAYED_SENDING_PERF_ANALYTICS", 8, AbstractC10323a.d.f102986c, "Delayed sending traces");
    public static final ConfigurationLabel PERFORMANCE_LIFETIME_EVENT = new ConfigurationLabel("PERFORMANCE_LIFETIME_EVENT", 9, AbstractC10323a.h.f102990c, "Performance Lifetime Event");

    /* renamed from: ru.ozon.tracker.debug.menu.presentation.screen.common.configuration.label.ConfigurationLabel$a, reason: from kotlin metadata */
    public static final class Companion {
        public static String a(@NotNull String key) {
            Object obj;
            Intrinsics.checkNotNullParameter(key, "key");
            Iterator<E> it = ConfigurationLabel.getEntries().iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it.next();
                if (Intrinsics.d(((ConfigurationLabel) obj).getParam().getKey(), key)) {
                    break;
                }
            }
            ConfigurationLabel configurationLabel = (ConfigurationLabel) obj;
            if (configurationLabel != null) {
                return configurationLabel.getLabel();
            }
            return null;
        }
    }

    private static final /* synthetic */ ConfigurationLabel[] $values() {
        return new ConfigurationLabel[]{BATCH_SIZE, PRODUCT_SENDING_PERIOD, TRACK_APP_LIFECYCLE, TEST_MODE, LOGS, FORCE_SENDING_PRODUCT_ANALYTICS_ON_MINIMIZE, DELAYED_SENDING_PRODUCT_ANALYTICS, FORCE_SENDING_PERF_ANALYTICS_ON_MINIMIZE, DELAYED_SENDING_PERF_ANALYTICS, PERFORMANCE_LIFETIME_EVENT};
    }

    static {
        ConfigurationLabel[] $values = $values();
        $VALUES = $values;
        $ENTRIES = b.a($values);
        INSTANCE = new Companion();
    }

    private ConfigurationLabel(String str, int i11, d dVar, String str2) {
        this.param = dVar;
        this.label = str2;
    }

    public static final String findLabel(@NotNull String str) {
        INSTANCE.getClass();
        return Companion.a(str);
    }

    @NotNull
    public static a<ConfigurationLabel> getEntries() {
        return $ENTRIES;
    }

    public static ConfigurationLabel valueOf(String str) {
        return (ConfigurationLabel) Enum.valueOf(ConfigurationLabel.class, str);
    }

    public static ConfigurationLabel[] values() {
        return (ConfigurationLabel[]) $VALUES.clone();
    }

    @NotNull
    public final String getLabel() {
        return this.label;
    }

    @NotNull
    public final d<?> getParam() {
        return this.param;
    }
}
