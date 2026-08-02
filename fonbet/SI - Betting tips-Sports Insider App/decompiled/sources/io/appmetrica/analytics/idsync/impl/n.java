package io.appmetrica.analytics.idsync.impl;

import android.text.TextUtils;
import io.appmetrica.analytics.coreapi.internal.identifiers.SdkIdentifiers;
import io.appmetrica.analytics.coreutils.internal.time.SystemTimeProvider;
import io.appmetrica.analytics.idsync.internal.model.Preconditions;
import io.appmetrica.analytics.idsync.internal.model.RequestConfig;
import io.appmetrica.analytics.modulesapi.internal.service.ServiceContext;
import io.appmetrica.analytics.network.internal.NetworkClientBuilder;
import io.appmetrica.analytics.networkapi.NetworkClientSettings;
import io.appmetrica.analytics.networkapi.Request;
import io.appmetrica.analytics.networkapi.Response;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.collections.CollectionsKt;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class n {

    /* renamed from: a, reason: collision with root package name */
    public final ServiceContext f11895a;

    /* renamed from: b, reason: collision with root package name */
    public final G f11896b;

    /* renamed from: c, reason: collision with root package name */
    public SdkIdentifiers f11897c;

    /* renamed from: d, reason: collision with root package name */
    public final SystemTimeProvider f11898d = new SystemTimeProvider();

    /* renamed from: e, reason: collision with root package name */
    public final o f11899e;

    /* renamed from: f, reason: collision with root package name */
    public final x f11900f;

    /* renamed from: g, reason: collision with root package name */
    public final q f11901g;

    public n(@NotNull ServiceContext serviceContext, @NotNull G g10, @NotNull SdkIdentifiers sdkIdentifiers) {
        this.f11895a = serviceContext;
        this.f11896b = g10;
        this.f11897c = sdkIdentifiers;
        this.f11899e = new o(serviceContext.getNetworkContext().getSslSocketFactoryProvider(), this);
        this.f11900f = new x(serviceContext);
        this.f11901g = new q(serviceContext);
    }

    public static final void a(D d10, n nVar, RequestConfig requestConfig) {
        if (d10.f11829b) {
            G g10 = nVar.f11896b;
            String str = d10.f11828a;
            g10.f11845d.put(str, new E(str, nVar.f11898d.currentTimeMillis(), d10.f11831d ? 2 : 4));
            g10.f11842a.putString(g10.f11844c, g10.f11843b.fromModel(CollectionsKt.W(g10.f11845d.values())));
            q qVar = nVar.f11901g;
            SdkIdentifiers sdkIdentifiers = nVar.f11897c;
            qVar.f11906a.getClass();
            String a7 = v.a(d10);
            t tVar = qVar.f11907b;
            tVar.getClass();
            ArrayList arrayList = new ArrayList();
            if (requestConfig.getReportEventEnabled()) {
                arrayList.add(new p(tVar.f11919a));
            }
            String reportUrl = requestConfig.getReportUrl();
            if (reportUrl != null && !StringsKt.H(reportUrl)) {
                arrayList.add(new r(tVar.f11919a, requestConfig.getReportUrl()));
            }
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                ((s) it.next()).a(a7, sdkIdentifiers);
            }
        }
    }

    @NotNull
    public final SdkIdentifiers a() {
        return this.f11897c;
    }

    public final void a(@NotNull SdkIdentifiers sdkIdentifiers) {
        this.f11897c = sdkIdentifiers;
    }

    public static final void a(n nVar, RequestConfig requestConfig) {
        y c0002a;
        x xVar = nVar.f11900f;
        Preconditions preconditions = requestConfig.getPreconditions();
        xVar.getClass();
        if (w.f11921a[preconditions.getNetworkType().ordinal()] == 1) {
            c0002a = new C0003b(xVar.f11922a);
        } else {
            c0002a = new C0002a();
        }
        if (c0002a.a()) {
            o oVar = nVar.f11899e;
            oVar.getClass();
            Request.Builder builder = new Request.Builder(requestConfig.getUrl());
            for (Map.Entry<String, List<String>> entry : requestConfig.getHeaders().entrySet()) {
                builder.addHeader(entry.getKey(), CollectionsKt.J(entry.getValue(), ", ", null, null, null, 62));
            }
            Response execute = new NetworkClientBuilder().withSettings(new NetworkClientSettings.Builder().withSslSocketFactory(oVar.f11902a.getSslSocketFactory()).withUseCaches(false).withInstanceFollowRedirects(true).withMaxResponseSize(102400).build()).build().newCall(builder.build()).execute();
            oVar.f11903b.a(new D(requestConfig.getType(), execute.getIsCompleted(), execute.getUrl(), requestConfig.getValidResponseCodes().contains(Integer.valueOf(execute.getCode())), execute.getCode(), execute.getResponseData(), execute.getHeaders()), requestConfig);
        }
    }

    public final void a(@NotNull D d10, @NotNull RequestConfig requestConfig) {
        this.f11895a.getExecutorProvider().getModuleExecutor().execute(new androidx.fragment.app.d(d10, this, requestConfig, 3));
    }

    public final void a(@NotNull RequestConfig requestConfig) {
        long resendIntervalForValidResponse;
        if (TextUtils.isEmpty(requestConfig.getType()) || TextUtils.isEmpty(requestConfig.getUrl()) || requestConfig.getValidResponseCodes().isEmpty()) {
            return;
        }
        E e7 = (E) this.f11896b.f11845d.get(requestConfig.getType());
        if (e7 != null) {
            long currentTimeMillis = this.f11898d.currentTimeMillis();
            int a7 = A.a(e7.f11837c);
            if (a7 != 1) {
                resendIntervalForValidResponse = a7 != 3 ? 0L : requestConfig.getResendIntervalForInvalidResponse();
            } else {
                resendIntervalForValidResponse = requestConfig.getResendIntervalForValidResponse();
            }
            if (currentTimeMillis - e7.f11836b < resendIntervalForValidResponse) {
                return;
            }
        }
        this.f11895a.getExecutorProvider().getSupportIOExecutor().execute(new androidx.appcompat.app.t(2, this, requestConfig));
    }
}
