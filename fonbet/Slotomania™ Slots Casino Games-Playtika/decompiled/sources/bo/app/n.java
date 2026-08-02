package bo.app;

import android.content.Context;
import com.braze.Constants;
import com.braze.configuration.BrazeConfigurationProvider;
import com.braze.enums.LocationProviderName;
import com.braze.location.IBrazeLocationApi;
import com.braze.models.IBrazeLocation;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.util.EnumSet;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {}, d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f\u0012\u0006\u0010\u0013\u001a\u00020\u0012¢\u0006\u0004\b\u0014\u0010\u0015J)\u0010\n\u001a\u00020\t2!\u0010\b\u001a\u001d\u0012\u0013\u0012\u00110\u0003¢\u0006\f\b\u0004\u0012\b\b\u0005\u0012\u0004\b\b(\u0006\u0012\u0004\u0012\u00020\u00070\u0002R\u0011\u0010\f\u001a\u00020\t8F¢\u0006\u0006\u001a\u0004\b\n\u0010\u000b¨\u0006\u0016"}, d2 = {"Lbo/app/n;", "", "Lkotlin/Function1;", "Lcom/braze/models/IBrazeLocation;", "Lkotlin/ParameterName;", "name", FirebaseAnalytics.Param.LOCATION, "", "manualLocationUpdateCallback", "", Constants.BRAZE_PUSH_CONTENT_KEY, "()Z", "isAvailable", "Landroid/content/Context;", "context", "Ljava/util/EnumSet;", "Lcom/braze/enums/LocationProviderName;", "allowedProviders", "Lcom/braze/configuration/BrazeConfigurationProvider;", "appConfigurationProvider", "<init>", "(Landroid/content/Context;Ljava/util/EnumSet;Lcom/braze/configuration/BrazeConfigurationProvider;)V", "android-sdk-base_release"}, k = 1, mv = {1, 6, 0})
/* loaded from: classes8.dex */
public final class n {
    private IBrazeLocationApi a;

    public n(Context context, EnumSet<LocationProviderName> allowedProviders, BrazeConfigurationProvider appConfigurationProvider) {
        IBrazeLocationApi iBrazeLocationApi;
        Object newInstance;
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(allowedProviders, "allowedProviders");
        Intrinsics.checkNotNullParameter(appConfigurationProvider, "appConfigurationProvider");
        try {
            newInstance = Class.forName("com.braze.location.BrazeInternalLocationApi").getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
        } catch (Exception unused) {
            iBrazeLocationApi = null;
        }
        if (newInstance == null) {
            throw new NullPointerException("null cannot be cast to non-null type com.braze.location.IBrazeLocationApi");
        }
        iBrazeLocationApi = (IBrazeLocationApi) newInstance;
        this.a = iBrazeLocationApi;
        if (iBrazeLocationApi == null) {
            return;
        }
        iBrazeLocationApi.initWithContext(context, allowedProviders, appConfigurationProvider);
    }

    public final boolean a() {
        return this.a != null;
    }

    public final boolean a(Function1<? super IBrazeLocation, Unit> manualLocationUpdateCallback) {
        Intrinsics.checkNotNullParameter(manualLocationUpdateCallback, "manualLocationUpdateCallback");
        IBrazeLocationApi iBrazeLocationApi = this.a;
        if (iBrazeLocationApi == null) {
            return false;
        }
        return iBrazeLocationApi.requestSingleLocationUpdate(manualLocationUpdateCallback);
    }
}
