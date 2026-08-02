package ru.ozon.app.android.advertising;

import Lm0.a;
import Sc.InterfaceC4008j;
import Sc.k;
import android.content.Context;
import com.google.android.gms.ads.identifier.AdvertisingIdClient;
import com.google.firebase.analytics.FirebaseAnalytics;
import fi0.InterfaceC6571a;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\n\b\u0001\u0018\u0000 \u00112\u00020\u0001:\u0001\u0011B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0011\u0010\t\u001a\u0004\u0018\u00010\bH\u0016¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u000b\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000b\u0010\nR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\fR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\rR\u001b\u0010\u000b\u001a\u00020\b8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\n¨\u0006\u0012"}, d2 = {"Lru/ozon/app/android/advertising/FirebaseAdvertisingService;", "Lfi0/a;", "Landroid/content/Context;", "context", "Lcom/google/firebase/analytics/FirebaseAnalytics;", "firebaseAnalytics", "<init>", "(Landroid/content/Context;Lcom/google/firebase/analytics/FirebaseAnalytics;)V", "", "advertisingId", "()Ljava/lang/String;", "firebaseAppInstanceId", "Landroid/content/Context;", "Lcom/google/firebase/analytics/FirebaseAnalytics;", "firebaseAppInstanceId$delegate", "LSc/j;", "getFirebaseAppInstanceId", "Companion", "main_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class FirebaseAdvertisingService implements InterfaceC6571a {

    @NotNull
    private final Context context;

    @NotNull
    private final FirebaseAnalytics firebaseAnalytics;

    /* renamed from: firebaseAppInstanceId$delegate, reason: from kotlin metadata */
    @NotNull
    private final InterfaceC4008j firebaseAppInstanceId;

    @NotNull
    private static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\t\n\u0000\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Lru/ozon/app/android/advertising/FirebaseAdvertisingService$Companion;", "", "<init>", "()V", "FIREBASE_APP_INSTANCE_ID_TIMEOUT", "", "main_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    private static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    public FirebaseAdvertisingService(@NotNull Context context, @NotNull FirebaseAnalytics firebaseAnalytics) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(firebaseAnalytics, "firebaseAnalytics");
        this.context = context;
        this.firebaseAnalytics = firebaseAnalytics;
        this.firebaseAppInstanceId = k.b(new FirebaseAdvertisingService$firebaseAppInstanceId$2(this));
    }

    private final String getFirebaseAppInstanceId() {
        Object value = this.firebaseAppInstanceId.getValue();
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (String) value;
    }

    @Override // fi0.InterfaceC6571a
    public String advertisingId() {
        try {
            return AdvertisingIdClient.getAdvertisingIdInfo(this.context).getId();
        } catch (Throwable th2) {
            a.f17149a.e(th2);
            return null;
        }
    }

    @Override // fi0.InterfaceC6571a
    @NotNull
    public String firebaseAppInstanceId() {
        return getFirebaseAppInstanceId();
    }
}
