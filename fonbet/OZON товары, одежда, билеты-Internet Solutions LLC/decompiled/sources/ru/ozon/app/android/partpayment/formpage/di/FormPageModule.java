package ru.ozon.app.android.partpayment.formpage.di;

import Ve.C4598rp;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import retrofit2.Retrofit;
import ru.ozon.app.android.composer.di.Widget;
import ru.ozon.app.android.partpayment.formpage.FormPageConfig;
import ru.ozon.app.android.partpayment.formpage.data.FormPageApiDataSource;
import ru.ozon.app.android.partpayment.formpage.view.FormPageViewMapper;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b'\u0018\u0000 \u00022\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lru/ozon/app/android/partpayment/formpage/di/FormPageModule;", "", "Companion", "homecredit_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public abstract class FormPageModule {

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0018\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH\u0007J\u0010\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\rH\u0007¨\u0006\u000e"}, d2 = {"Lru/ozon/app/android/partpayment/formpage/di/FormPageModule$Companion;", "", "<init>", "()V", "provideFormPageWidget", "Lru/ozon/app/android/composer/di/Widget;", "config", "Lru/ozon/app/android/partpayment/formpage/FormPageConfig;", "viewMapper", "Lru/ozon/app/android/partpayment/formpage/view/FormPageViewMapper;", "provideFormPageApiDataSource", "Lru/ozon/app/android/partpayment/formpage/data/FormPageApiDataSource;", "retrofit", "Lretrofit2/Retrofit;", "homecredit_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final FormPageApiDataSource provideFormPageApiDataSource(@NotNull Retrofit retrofit) {
            return (FormPageApiDataSource) C4598rp.b(retrofit, "retrofit", FormPageApiDataSource.class, "create(...)");
        }

        @NotNull
        public final Widget provideFormPageWidget(@NotNull FormPageConfig config, @NotNull FormPageViewMapper viewMapper) {
            Intrinsics.checkNotNullParameter(config, "config");
            Intrinsics.checkNotNullParameter(viewMapper, "viewMapper");
            return new Widget("shock", "mobileApplicationFormPage", config, new FormPageViewMapper[]{viewMapper});
        }

        private Companion() {
        }
    }
}
