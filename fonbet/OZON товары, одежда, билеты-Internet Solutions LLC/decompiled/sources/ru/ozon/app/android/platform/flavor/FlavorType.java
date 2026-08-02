package ru.ozon.app.android.platform.flavor;

import Xc.a;
import Xc.b;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.utils.buildUtils.BuildUtils;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u0000 \u00062\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0006B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0007"}, d2 = {"Lru/ozon/app/android/platform/flavor/FlavorType;", "", "<init>", "(Ljava/lang/String;I)V", "QA", "PROD", "Companion", "android-platform_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class FlavorType {
    private static final /* synthetic */ a $ENTRIES;
    private static final /* synthetic */ FlavorType[] $VALUES;

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE;

    /* renamed from: QA, reason: collision with root package name */
    public static final FlavorType f93213QA = new FlavorType("QA", 0);
    public static final FlavorType PROD = new FlavorType("PROD", 1);

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0006\u0010\u0004\u001a\u00020\u0005¨\u0006\u0006"}, d2 = {"Lru/ozon/app/android/platform/flavor/FlavorType$Companion;", "", "<init>", "()V", "getCurrentType", "Lru/ozon/app/android/platform/flavor/FlavorType;", "android-platform_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final FlavorType getCurrentType() {
            return BuildUtils.INSTANCE.isQaFlavor() ? FlavorType.f93213QA : FlavorType.PROD;
        }

        private Companion() {
        }
    }

    private static final /* synthetic */ FlavorType[] $values() {
        return new FlavorType[]{f93213QA, PROD};
    }

    static {
        FlavorType[] $values = $values();
        $VALUES = $values;
        $ENTRIES = b.a($values);
        INSTANCE = new Companion(null);
    }

    private FlavorType(String str, int i11) {
    }

    public static FlavorType valueOf(String str) {
        return (FlavorType) Enum.valueOf(FlavorType.class, str);
    }

    public static FlavorType[] values() {
        return (FlavorType[]) $VALUES.clone();
    }
}
