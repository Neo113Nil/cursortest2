package c;

import android.app.Activity;
import android.content.Context;
import com.reactnativegooglesignin.RNGoogleSigninModule;
import com.surt.guardian.core.Configuration;
import java.util.ArrayList;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import l0.AbstractC5338c;

/* loaded from: classes.dex */
public final class U {

    /* renamed from: c, reason: collision with root package name */
    public static final Fc.a f26498c = new Fc.a(null);

    /* renamed from: a, reason: collision with root package name */
    public final Context f26499a;

    /* renamed from: b, reason: collision with root package name */
    public final Configuration f26500b;

    public U(Context context, Configuration config) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(config, "config");
        this.f26499a = context;
        this.f26500b = config;
    }

    public final void a(Activity activity, Function1 onResult) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(onResult, "onResult");
        ArrayList arrayList = new ArrayList();
        if (this.f26500b.getCollectLocation() && AbstractC5338c.checkSelfPermission(this.f26499a, "android.permission.ACCESS_FINE_LOCATION") != 0 && AbstractC5338c.checkSelfPermission(this.f26499a, "android.permission.ACCESS_COARSE_LOCATION") != 0) {
            arrayList.add("android.permission.ACCESS_FINE_LOCATION");
            arrayList.add("android.permission.ACCESS_COARSE_LOCATION");
        }
        if (this.f26500b.getCollectSimCardInfo() && AbstractC5338c.checkSelfPermission(this.f26499a, "android.permission.READ_PHONE_STATE") != 0) {
            arrayList.add("android.permission.READ_PHONE_STATE");
        }
        if (arrayList.isEmpty()) {
            onResult.invoke(Boolean.TRUE);
        } else {
            androidx.core.app.b.f(activity, (String[]) arrayList.toArray(new String[0]), RNGoogleSigninModule.RC_SIGN_IN);
            onResult.invoke(Boolean.TRUE);
        }
    }
}
