package ru.ozon.tracker.process.lifecycle;

import Sc.o;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0007\b\u0086\u0081\u0002\u0018\u0000 \u00042\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0005B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0006j\u0002\b\u0007¨\u0006\b"}, d2 = {"Lru/ozon/tracker/process/lifecycle/ApplicationLifecycleState;", "", "<init>", "(Ljava/lang/String;I)V", "Companion", "a", "FOREGROUND", "BACKGROUND", "tracker-sdk_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class ApplicationLifecycleState {
    private static final /* synthetic */ Xc.a $ENTRIES;
    private static final /* synthetic */ ApplicationLifecycleState[] $VALUES;

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE;
    public static final ApplicationLifecycleState FOREGROUND = new ApplicationLifecycleState("FOREGROUND", 0);
    public static final ApplicationLifecycleState BACKGROUND = new ApplicationLifecycleState("BACKGROUND", 1);

    /* renamed from: ru.ozon.tracker.process.lifecycle.ApplicationLifecycleState$a, reason: from kotlin metadata */
    public static final class Companion {

        /* renamed from: ru.ozon.tracker.process.lifecycle.ApplicationLifecycleState$a$a, reason: collision with other inner class name */
        public /* synthetic */ class C2148a {

            /* renamed from: a, reason: collision with root package name */
            public static final /* synthetic */ int[] f97834a;

            static {
                int[] iArr = new int[ApplicationLifecycleState.values().length];
                try {
                    iArr[ApplicationLifecycleState.FOREGROUND.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[ApplicationLifecycleState.BACKGROUND.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                f97834a = iArr;
            }
        }

        @NotNull
        public static ApplicationLifecycleState a(@NotNull ApplicationLifecycleState state) {
            Intrinsics.checkNotNullParameter(state, "state");
            int i11 = C2148a.f97834a[state.ordinal()];
            if (i11 == 1) {
                return ApplicationLifecycleState.BACKGROUND;
            }
            if (i11 == 2) {
                return ApplicationLifecycleState.FOREGROUND;
            }
            throw new o();
        }
    }

    private static final /* synthetic */ ApplicationLifecycleState[] $values() {
        return new ApplicationLifecycleState[]{FOREGROUND, BACKGROUND};
    }

    static {
        ApplicationLifecycleState[] $values = $values();
        $VALUES = $values;
        $ENTRIES = Xc.b.a($values);
        INSTANCE = new Companion();
    }

    private ApplicationLifecycleState(String str, int i11) {
    }

    @NotNull
    public static Xc.a<ApplicationLifecycleState> getEntries() {
        return $ENTRIES;
    }

    @NotNull
    public static final ApplicationLifecycleState invert(@NotNull ApplicationLifecycleState applicationLifecycleState) {
        INSTANCE.getClass();
        return Companion.a(applicationLifecycleState);
    }

    public static ApplicationLifecycleState valueOf(String str) {
        return (ApplicationLifecycleState) Enum.valueOf(ApplicationLifecycleState.class, str);
    }

    public static ApplicationLifecycleState[] values() {
        return (ApplicationLifecycleState[]) $VALUES.clone();
    }
}
