package ru.ozon.app.android.partpayment.smssign.di;

import I00.d;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.composer.di.Widget;
import ru.ozon.app.android.partpayment.smssign.SmsSignConfig;
import ru.ozon.app.android.partpayment.smssign.view.SmsSignNoUiViewMapper;
import ru.ozon.app.android.partpayment.smssign.view.SmsSignViewMapper;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b'\u0018\u0000 \u00022\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lru/ozon/app/android/partpayment/smssign/di/SmsSignModule;", "", "Companion", "homecredit_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public abstract class SmsSignModule {

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J \u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0007¨\u0006\f"}, d2 = {"Lru/ozon/app/android/partpayment/smssign/di/SmsSignModule$Companion;", "", "<init>", "()V", "provideSmsSignWidget", "Lru/ozon/app/android/composer/di/Widget;", "config", "Lru/ozon/app/android/partpayment/smssign/SmsSignConfig;", "ui", "Lru/ozon/app/android/partpayment/smssign/view/SmsSignViewMapper;", "noUi", "Lru/ozon/app/android/partpayment/smssign/view/SmsSignNoUiViewMapper;", "homecredit_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final Widget provideSmsSignWidget(@NotNull SmsSignConfig config, @NotNull SmsSignViewMapper ui2, @NotNull SmsSignNoUiViewMapper noUi) {
            Intrinsics.checkNotNullParameter(config, "config");
            Intrinsics.checkNotNullParameter(ui2, "ui");
            Intrinsics.checkNotNullParameter(noUi, "noUi");
            return new Widget("shock", "mobileApplicationFormSign", config, new d[]{ui2, noUi});
        }

        private Companion() {
        }
    }
}
