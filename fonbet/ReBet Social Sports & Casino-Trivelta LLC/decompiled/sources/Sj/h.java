package Sj;

import android.os.Build;
import java.util.Arrays;
import java.util.Locale;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.Interceptor;
import okhttp3.Response;
import zendesk.core.Constants;

/* loaded from: classes5.dex */
public final class h implements Interceptor {

    /* renamed from: d, reason: collision with root package name */
    public static final a f10845d = new a(null);

    /* renamed from: a, reason: collision with root package name */
    public final String f10846a;

    /* renamed from: b, reason: collision with root package name */
    public final String f10847b;

    /* renamed from: c, reason: collision with root package name */
    public final String f10848c;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public a() {
        }
    }

    public h(String version, String variant) {
        Intrinsics.checkNotNullParameter(version, "version");
        Intrinsics.checkNotNullParameter(variant, "variant");
        this.f10846a = version;
        Locale locale = Locale.US;
        String format = String.format(locale, Constants.USER_AGENT_HEADER_TEMPLATE, Arrays.copyOf(new Object[]{version, Integer.valueOf(Build.VERSION.SDK_INT), variant}, 3));
        Intrinsics.checkNotNullExpressionValue(format, "format(...)");
        this.f10847b = format;
        Locale locale2 = Locale.getDefault();
        Intrinsics.checkNotNullExpressionValue(locale2, "getDefault(...)");
        String lowerCase = variant.toLowerCase(locale2);
        Intrinsics.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
        String format2 = String.format(locale, Constants.X_ZENDESK_CLIENT_HEADER_VALUE_FORMAT, Arrays.copyOf(new Object[]{lowerCase}, 1));
        Intrinsics.checkNotNullExpressionValue(format2, "format(...)");
        this.f10848c = format2;
    }

    @Override // okhttp3.Interceptor
    public Response intercept(Interceptor.Chain chain) {
        Intrinsics.checkNotNullParameter(chain, "chain");
        return chain.proceed(chain.request().newBuilder().header(Constants.USER_AGENT_HEADER_KEY, this.f10847b).header(Constants.X_ZENDESK_CLIENT_HEADER_NAME, this.f10848c).header(Constants.X_ZENDESK_CLIENT_VERSION_HEADER_NAME, this.f10846a).build());
    }
}
