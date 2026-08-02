package ru.ozon.android.hardwareinfo.powermanager;

import android.content.Context;
import android.content.IntentFilter;
import android.provider.Settings;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\b\u0000\u0018\u0000 \n2\u00020\u0001:\u0001\nB\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\b\u0010\u0006\u001a\u00020\u0007H\u0016J\b\u0010\b\u001a\u00020\tH\u0014R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000b"}, d2 = {"Lru/ozon/android/hardwareinfo/powermanager/XiaomiPowerManagerRepository;", "Lru/ozon/android/hardwareinfo/powermanager/DefaultPowerManagerRepository;", "context", "Landroid/content/Context;", "<init>", "(Landroid/content/Context;)V", "getIntentFiler", "Landroid/content/IntentFilter;", "readPowerSaveMode", "", "Companion", "hardware-info_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class XiaomiPowerManagerRepository extends DefaultPowerManagerRepository {

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private static final String MANUFACTURER = "XIAOMI";

    @NotNull
    private static final String POWER_SAVE_MODE_CHANGE_ACTION_NAME = "miui.intent.action.POWER_SAVE_MODE_CHANGED";
    private static final int POWER_SAVE_MODE_ENABLED_VALUE = 1;

    @NotNull
    private static final String POWER_SAVE_MODE_SETTINGS_NAME = "POWER_SAVE_MODE_OPEN";
    private static final int UNDEFINED_POWER_SAVE_MODE = -1;

    @NotNull
    private final Context context;

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u0005R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\tX\u0082T¢\u0006\u0002\n\u0000¨\u0006\u000e"}, d2 = {"Lru/ozon/android/hardwareinfo/powermanager/XiaomiPowerManagerRepository$Companion;", "", "<init>", "()V", "MANUFACTURER", "", "POWER_SAVE_MODE_SETTINGS_NAME", "POWER_SAVE_MODE_CHANGE_ACTION_NAME", "POWER_SAVE_MODE_ENABLED_VALUE", "", "UNDEFINED_POWER_SAVE_MODE", "isAvailableOnCurrentDevice", "", "manufacturer", "hardware-info_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final boolean isAvailableOnCurrentDevice(@NotNull String manufacturer) {
            Intrinsics.checkNotNullParameter(manufacturer, "manufacturer");
            Locale ENGLISH = Locale.ENGLISH;
            Intrinsics.checkNotNullExpressionValue(ENGLISH, "ENGLISH");
            String upperCase = manufacturer.toUpperCase(ENGLISH);
            Intrinsics.checkNotNullExpressionValue(upperCase, "toUpperCase(...)");
            return Intrinsics.d(upperCase, XiaomiPowerManagerRepository.MANUFACTURER);
        }

        private Companion() {
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public XiaomiPowerManagerRepository(@NotNull Context context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        this.context = context;
    }

    @Override // ru.ozon.android.hardwareinfo.powermanager.DefaultPowerManagerRepository
    @NotNull
    public IntentFilter getIntentFiler() {
        IntentFilter intentFiler = super.getIntentFiler();
        intentFiler.addAction(POWER_SAVE_MODE_CHANGE_ACTION_NAME);
        return intentFiler;
    }

    @Override // ru.ozon.android.hardwareinfo.powermanager.DefaultPowerManagerRepository
    protected boolean readPowerSaveMode() {
        int i11 = Settings.System.getInt(this.context.getContentResolver(), POWER_SAVE_MODE_SETTINGS_NAME, -1);
        return i11 != -1 ? i11 == 1 : super.readPowerSaveMode();
    }
}
