package bo.app;

import android.content.Context;
import com.braze.configuration.BrazeConfigurationProvider;
import com.braze.location.BrazeInternalLocationApi;
import com.braze.location.IBrazeLocationApi;
import java.util.EnumSet;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class a2 {

    /* renamed from: a, reason: collision with root package name */
    public final IBrazeLocationApi f25242a;

    public a2(Context context, EnumSet allowedProviders, BrazeConfigurationProvider appConfigurationProvider) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(allowedProviders, "allowedProviders");
        Intrinsics.checkNotNullParameter(appConfigurationProvider, "appConfigurationProvider");
        IBrazeLocationApi iBrazeLocationApi = null;
        try {
            BrazeInternalLocationApi.Companion companion = BrazeInternalLocationApi.INSTANCE;
            Object newInstance = BrazeInternalLocationApi.class.getDeclaredConstructor(null).newInstance(null);
            Intrinsics.checkNotNull(newInstance, "null cannot be cast to non-null type com.braze.location.IBrazeLocationApi");
            iBrazeLocationApi = (IBrazeLocationApi) newInstance;
        } catch (Exception unused) {
        }
        this.f25242a = iBrazeLocationApi;
        if (iBrazeLocationApi != null) {
            iBrazeLocationApi.initWithContext(context, allowedProviders, appConfigurationProvider);
        }
    }
}
