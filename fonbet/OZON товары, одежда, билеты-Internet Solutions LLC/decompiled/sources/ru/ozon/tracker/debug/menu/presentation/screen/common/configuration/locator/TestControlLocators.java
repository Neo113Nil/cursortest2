package ru.ozon.tracker.debug.menu.presentation.screen.common.configuration.locator;

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
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0017\b\u0080\u0081\u0002\u0018\u0000 \u00102\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0011B%\b\u0002\u0012\n\u0010\u0003\u001a\u0006\u0012\u0002\b\u00030\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bR\u001b\u0010\u0003\u001a\u0006\u0012\u0002\b\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\t\u001a\u0004\b\n\u0010\u000bR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\f\u001a\u0004\b\r\u0010\u000eR\u0017\u0010\u0006\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0006\u0010\f\u001a\u0004\b\u000f\u0010\u000ej\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014j\u0002\b\u0015j\u0002\b\u0016j\u0002\b\u0017j\u0002\b\u0018j\u0002\b\u0019j\u0002\b\u001a¨\u0006\u001b"}, d2 = {"Lru/ozon/tracker/debug/menu/presentation/screen/common/configuration/locator/TestControlLocators;", "", "Lfj0/d;", "param", "", "controlLocator", "resetLocator", "<init>", "(Ljava/lang/String;ILfj0/d;Ljava/lang/String;Ljava/lang/String;)V", "Lfj0/d;", "getParam", "()Lfj0/d;", "Ljava/lang/String;", "getControlLocator", "()Ljava/lang/String;", "getResetLocator", "Companion", "a", "BATCH_SIZE", "TRACK_APP_LIFECYCLE", "TEST_MODE", "LOGS", "FORCE_SENDING_PRODUCT_ANALYTICS_ON_MINIMIZE", "DELAYED_SENDING_PRODUCT_ANALYTICS", "FORCE_SENDING_PERF_ANALYTICS_ON_MINIMIZE", "DELAYED_SENDING_PERF_ANALYTICS", "PERFORMANCE_LIFETIME_EVENT", "debug-menu_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class TestControlLocators {
    private static final /* synthetic */ a $ENTRIES;
    private static final /* synthetic */ TestControlLocators[] $VALUES;

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE;

    @NotNull
    private final String controlLocator;

    @NotNull
    private final d<?> param;

    @NotNull
    private final String resetLocator;
    public static final TestControlLocators BATCH_SIZE = new TestControlLocators("BATCH_SIZE", 0, AbstractC10323a.C2233a.f102983c, "BatchSize.TextField", "BatchSize.ResetButton");
    public static final TestControlLocators TRACK_APP_LIFECYCLE = new TestControlLocators("TRACK_APP_LIFECYCLE", 1, AbstractC10323a.k.f102993c, "TrackAppLifecycle.Toggle", "TrackAppLifecycle.ResetButton");
    public static final TestControlLocators TEST_MODE = new TestControlLocators("TEST_MODE", 2, AbstractC10323a.j.f102992c, "TestMode.Toggle", "TestMode.ResetButton");
    public static final TestControlLocators LOGS = new TestControlLocators("LOGS", 3, AbstractC10323a.g.f102989c, "Logs.Toggle", "Logs.ResetButton");
    public static final TestControlLocators FORCE_SENDING_PRODUCT_ANALYTICS_ON_MINIMIZE = new TestControlLocators("FORCE_SENDING_PRODUCT_ANALYTICS_ON_MINIMIZE", 4, AbstractC10323a.e.f102987c, "ForceSendingEventsOnMinimize.Toggle", "ForceSendingEventsOnMinimize.ResetButton");
    public static final TestControlLocators DELAYED_SENDING_PRODUCT_ANALYTICS = new TestControlLocators("DELAYED_SENDING_PRODUCT_ANALYTICS", 5, AbstractC10323a.c.f102985c, "DelayedSendingEvents.Toggle", "DelayedSendingEvents.ResetButton");
    public static final TestControlLocators FORCE_SENDING_PERF_ANALYTICS_ON_MINIMIZE = new TestControlLocators("FORCE_SENDING_PERF_ANALYTICS_ON_MINIMIZE", 6, AbstractC10323a.f.f102988c, "ForceSendingTracesOnMinimize.Toggle", "ForceSendingTracesOnMinimize.ResetButton");
    public static final TestControlLocators DELAYED_SENDING_PERF_ANALYTICS = new TestControlLocators("DELAYED_SENDING_PERF_ANALYTICS", 7, AbstractC10323a.d.f102986c, "DelayedTracesEvents.Toggle", "DelayedTracesEvents.ResetButton");
    public static final TestControlLocators PERFORMANCE_LIFETIME_EVENT = new TestControlLocators("PERFORMANCE_LIFETIME_EVENT", 8, AbstractC10323a.h.f102990c, "PerformanceLifetimeEvent.Toggle", "PerformanceLifetimeEvent.ResetButton");

    /* renamed from: ru.ozon.tracker.debug.menu.presentation.screen.common.configuration.locator.TestControlLocators$a, reason: from kotlin metadata */
    public static final class Companion {
        public static TestControlLocators a(@NotNull String key) {
            Object obj;
            Intrinsics.checkNotNullParameter(key, "key");
            Iterator<E> it = TestControlLocators.getEntries().iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it.next();
                if (Intrinsics.d(((TestControlLocators) obj).getParam().getKey(), key)) {
                    break;
                }
            }
            return (TestControlLocators) obj;
        }
    }

    private static final /* synthetic */ TestControlLocators[] $values() {
        return new TestControlLocators[]{BATCH_SIZE, TRACK_APP_LIFECYCLE, TEST_MODE, LOGS, FORCE_SENDING_PRODUCT_ANALYTICS_ON_MINIMIZE, DELAYED_SENDING_PRODUCT_ANALYTICS, FORCE_SENDING_PERF_ANALYTICS_ON_MINIMIZE, DELAYED_SENDING_PERF_ANALYTICS, PERFORMANCE_LIFETIME_EVENT};
    }

    static {
        TestControlLocators[] $values = $values();
        $VALUES = $values;
        $ENTRIES = b.a($values);
        INSTANCE = new Companion();
    }

    private TestControlLocators(String str, int i11, d dVar, String str2, String str3) {
        this.param = dVar;
        this.controlLocator = str2;
        this.resetLocator = str3;
    }

    @NotNull
    public static a<TestControlLocators> getEntries() {
        return $ENTRIES;
    }

    public static final TestControlLocators valueFrom(@NotNull String str) {
        INSTANCE.getClass();
        return Companion.a(str);
    }

    public static TestControlLocators valueOf(String str) {
        return (TestControlLocators) Enum.valueOf(TestControlLocators.class, str);
    }

    public static TestControlLocators[] values() {
        return (TestControlLocators[]) $VALUES.clone();
    }

    @NotNull
    public final String getControlLocator() {
        return this.controlLocator;
    }

    @NotNull
    public final d<?> getParam() {
        return this.param;
    }

    @NotNull
    public final String getResetLocator() {
        return this.resetLocator;
    }
}
