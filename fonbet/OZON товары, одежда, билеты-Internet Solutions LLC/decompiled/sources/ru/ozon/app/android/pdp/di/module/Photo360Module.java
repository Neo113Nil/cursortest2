package ru.ozon.app.android.pdp.di.module;

import Ve.C4598rp;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import retrofit2.Retrofit;
import ru.ozon.app.android.pdp.view.photo360.api.Photo360Api;
import ru.ozon.app.android.pdp.view.photo360.presentation.Photo360Activity;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b'\u0018\u0000 \u00022\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lru/ozon/app/android/pdp/di/module/Photo360Module;", "", "Companion", "pdp_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public abstract class Photo360Module {

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0007J\u0010\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0007¨\u0006\f"}, d2 = {"Lru/ozon/app/android/pdp/di/module/Photo360Module$Companion;", "", "<init>", "()V", "provideApi", "Lru/ozon/app/android/pdp/view/photo360/api/Photo360Api;", "retrofit", "Lretrofit2/Retrofit;", "provideInitInfo", "", "activity", "Lru/ozon/app/android/pdp/view/photo360/presentation/Photo360Activity;", "pdp_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final Photo360Api provideApi(@NotNull Retrofit retrofit) {
            return (Photo360Api) C4598rp.b(retrofit, "retrofit", Photo360Api.class, "create(...)");
        }

        @NotNull
        public final String provideInitInfo(@NotNull Photo360Activity activity) {
            Intrinsics.checkNotNullParameter(activity, "activity");
            String stringExtra = activity.getIntent().getStringExtra("PARAM_QUERY");
            if (stringExtra != null) {
                return stringExtra;
            }
            throw new IllegalArgumentException("Required value was null.");
        }

        private Companion() {
        }
    }
}
