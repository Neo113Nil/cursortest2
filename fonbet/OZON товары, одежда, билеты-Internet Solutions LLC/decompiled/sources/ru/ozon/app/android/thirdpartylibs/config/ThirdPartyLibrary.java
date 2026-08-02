package ru.ozon.app.android.thirdpartylibs.config;

import Xc.a;
import Xc.b;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.U;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u0000 \u00052\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0005B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004¨\u0006\u0006"}, d2 = {"Lru/ozon/app/android/thirdpartylibs/config/ThirdPartyLibrary;", "", "<init>", "(Ljava/lang/String;I)V", "GOOGLE", "Companion", "third-party-libs-config_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class ThirdPartyLibrary {
    private static final /* synthetic */ a $ENTRIES;
    private static final /* synthetic */ ThirdPartyLibrary[] $VALUES;

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE;
    public static final ThirdPartyLibrary GOOGLE = new ThirdPartyLibrary("GOOGLE", 0);

    @NotNull
    private static final Map<String, ThirdPartyLibrary> values;

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\b\u001a\u0004\u0018\u00010\u00072\u0006\u0010\t\u001a\u00020\u0006R\u001a\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\n"}, d2 = {"Lru/ozon/app/android/thirdpartylibs/config/ThirdPartyLibrary$Companion;", "", "<init>", "()V", "values", "", "", "Lru/ozon/app/android/thirdpartylibs/config/ThirdPartyLibrary;", "fromString", AppMeasurementSdk.ConditionalUserProperty.VALUE, "third-party-libs-config_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final ThirdPartyLibrary fromString(@NotNull String value) {
            Intrinsics.checkNotNullParameter(value, "value");
            Map map = ThirdPartyLibrary.values;
            String lowerCase = value.toLowerCase(Locale.ROOT);
            Intrinsics.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
            return (ThirdPartyLibrary) map.get(lowerCase);
        }

        private Companion() {
        }
    }

    private static final /* synthetic */ ThirdPartyLibrary[] $values() {
        return new ThirdPartyLibrary[]{GOOGLE};
    }

    static {
        ThirdPartyLibrary[] $values = $values();
        $VALUES = $values;
        $ENTRIES = b.a($values);
        INSTANCE = new Companion(null);
        ThirdPartyLibrary[] values2 = values();
        int h11 = U.h(values2.length);
        LinkedHashMap linkedHashMap = new LinkedHashMap(h11 < 16 ? 16 : h11);
        for (ThirdPartyLibrary thirdPartyLibrary : values2) {
            String lowerCase = thirdPartyLibrary.name().toLowerCase(Locale.ROOT);
            Intrinsics.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
            linkedHashMap.put(lowerCase, thirdPartyLibrary);
        }
        values = linkedHashMap;
    }

    private ThirdPartyLibrary(String str, int i11) {
    }

    public static ThirdPartyLibrary valueOf(String str) {
        return (ThirdPartyLibrary) Enum.valueOf(ThirdPartyLibrary.class, str);
    }

    public static ThirdPartyLibrary[] values() {
        return (ThirdPartyLibrary[]) $VALUES.clone();
    }
}
