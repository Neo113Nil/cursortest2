package ru.ozon.app.android.scanit.di;

import Sg.a;
import Sg.c;
import Ve.C4598rp;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import retrofit2.Retrofit;
import ru.ozon.app.android.scanit.scanit.ScanItApi;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b'\u0018\u0000 \u00022\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lru/ozon/app/android/scanit/di/ScanItModule;", "", "Companion", "scanit_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public abstract class ScanItModule {

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\t\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0013\u0010\u000e\u001a\u00060\nj\u0002`\u000bH\u0001¢\u0006\u0004\b\f\u0010\r¨\u0006\u000f"}, d2 = {"Lru/ozon/app/android/scanit/di/ScanItModule$Companion;", "", "<init>", "()V", "Lretrofit2/Retrofit;", "retrofit", "Lru/ozon/app/android/scanit/scanit/ScanItApi;", "provideApi$scanit_prodGoogleAllVendorsRelease", "(Lretrofit2/Retrofit;)Lru/ozon/app/android/scanit/scanit/ScanItApi;", "provideApi", "LSg/a;", "Lru/ozon/app/android/analytics/AnalyticsScreenStorage;", "provideAnalyticsScreenStorage$scanit_prodGoogleAllVendorsRelease", "()LSg/a;", "provideAnalyticsScreenStorage", "scanit_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final a provideAnalyticsScreenStorage$scanit_prodGoogleAllVendorsRelease() {
            int i11 = a.f26232a;
            return new c();
        }

        @NotNull
        public final ScanItApi provideApi$scanit_prodGoogleAllVendorsRelease(@NotNull Retrofit retrofit) {
            return (ScanItApi) C4598rp.b(retrofit, "retrofit", ScanItApi.class, "create(...)");
        }

        private Companion() {
        }
    }
}
