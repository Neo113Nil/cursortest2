package ru.ozon.app.android.platform.theme;

import Xc.a;
import Xc.b;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001:\u0001\bJ\b\u0010\u0002\u001a\u00020\u0003H&J\u0010\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0003H&J\b\u0010\u0007\u001a\u00020\u0005H&¨\u0006\t"}, d2 = {"Lru/ozon/app/android/platform/theme/DarkThemeManager;", "", "getStatus", "Lru/ozon/app/android/platform/theme/DarkThemeManager$Status;", "setStatus", "", "status", "update", "Status", "android-platform_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public interface DarkThemeManager {

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\b\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0014\u0010\u0002\u001a\u00020\u0003X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\n¨\u0006\u000b"}, d2 = {"Lru/ozon/app/android/platform/theme/DarkThemeManager$Status;", "", AppMeasurementSdk.ConditionalUserProperty.VALUE, "", "<init>", "(Ljava/lang/String;II)V", "getValue$android_platform_prodGoogleAllVendorsRelease", "()I", "NIGHT_THEME", "DAY_THEME", "BY_SYSTEM", "android-platform_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Status {
        private static final /* synthetic */ a $ENTRIES;
        private static final /* synthetic */ Status[] $VALUES;
        private final int value;
        public static final Status NIGHT_THEME = new Status("NIGHT_THEME", 0, 2);
        public static final Status DAY_THEME = new Status("DAY_THEME", 1, 1);
        public static final Status BY_SYSTEM = new Status("BY_SYSTEM", 2, -1);

        private static final /* synthetic */ Status[] $values() {
            return new Status[]{NIGHT_THEME, DAY_THEME, BY_SYSTEM};
        }

        static {
            Status[] $values = $values();
            $VALUES = $values;
            $ENTRIES = b.a($values);
        }

        private Status(String str, int i11, int i12) {
            this.value = i12;
        }

        public static Status valueOf(String str) {
            return (Status) Enum.valueOf(Status.class, str);
        }

        public static Status[] values() {
            return (Status[]) $VALUES.clone();
        }

        /* renamed from: getValue$android_platform_prodGoogleAllVendorsRelease, reason: from getter */
        public final int getValue() {
            return this.value;
        }
    }

    @NotNull
    Status getStatus();

    void setStatus(@NotNull Status status);

    void update();
}
