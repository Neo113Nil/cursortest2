package com.plaid.internal;

import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import com.google.protobuf.Timestamp;
import com.plaid.internal.D6;
import com.plaid.internal.N2;
import com.plaid.internal.core.protos.link.api.Workflow$LinkWorkflowStartRequest;
import com.plaid.internal.core.protos.link.workflow.primitives.Configuration$ClientCapabilities;
import com.plaid.internal.core.protos.link.workflow.primitives.Configuration$DeviceMetadata;
import com.plaid.internal.core.protos.link.workflow.primitives.Configuration$EmbeddedLinkTokenConfiguration;
import com.plaid.internal.core.protos.link.workflow.primitives.Configuration$EmbeddedOpenLinkConfiguration;
import com.plaid.internal.core.protos.link.workflow.primitives.Configuration$LinkTokenConfiguration;
import com.plaid.internal.core.protos.link.workflow.primitives.Configuration$PlatformIdentifierConfiguration;
import com.plaid.internal.core.protos.link.workflow.primitives.Configuration$SDKMetadata;
import java.util.List;
import java.util.UUID;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import kotlin.time.DurationKt;
import okhttp3.HttpUrl;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes3.dex */
public final class n8 {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    public final String f40861a;

    /* renamed from: b, reason: collision with root package name */
    @Nullable
    public final String f40862b;

    /* renamed from: c, reason: collision with root package name */
    @Nullable
    public final String f40863c;

    /* renamed from: d, reason: collision with root package name */
    @Nullable
    public final String f40864d;

    /* renamed from: e, reason: collision with root package name */
    @NotNull
    public final String f40865e;

    /* renamed from: f, reason: collision with root package name */
    @NotNull
    public final PackageManager f40866f;

    /* renamed from: g, reason: collision with root package name */
    @Nullable
    public final String f40867g;

    /* renamed from: h, reason: collision with root package name */
    @NotNull
    public final C3563b3 f40868h;

    /* renamed from: i, reason: collision with root package name */
    @NotNull
    public final Lazy f40869i;

    /* renamed from: j, reason: collision with root package name */
    @NotNull
    public final Lazy f40870j;

    /* renamed from: k, reason: collision with root package name */
    @NotNull
    public final Lazy f40871k;

    /* renamed from: l, reason: collision with root package name */
    @NotNull
    public final Lazy f40872l;

    public n8(@Nullable String str, @NotNull String androidVersionName, @Nullable String str2, @Nullable String str3, @Nullable String str4, @NotNull String packageName, @NotNull String linkRedirectUrl, @NotNull PackageManager packageManager, @Nullable String str5, @NotNull C3563b3 workflowVersionOverride) {
        O4 deviceInfo = O4.f39477a;
        Intrinsics.checkNotNullParameter(deviceInfo, "deviceInfo");
        Intrinsics.checkNotNullParameter(androidVersionName, "androidVersionName");
        Intrinsics.checkNotNullParameter(packageName, "packageName");
        Intrinsics.checkNotNullParameter(linkRedirectUrl, "linkRedirectUrl");
        Intrinsics.checkNotNullParameter(packageManager, "packageManager");
        Intrinsics.checkNotNullParameter(workflowVersionOverride, "workflowVersionOverride");
        this.f40861a = androidVersionName;
        this.f40862b = str2;
        this.f40863c = str3;
        this.f40864d = str4;
        this.f40865e = packageName;
        this.f40866f = packageManager;
        this.f40867g = str5;
        this.f40868h = workflowVersionOverride;
        this.f40869i = LazyKt.lazy(j8.f40711a);
        this.f40870j = LazyKt.lazy(new l8(str));
        this.f40871k = LazyKt.lazy(new k8(this));
        this.f40872l = LazyKt.lazy(new m8(this));
    }

    @NotNull
    public final Workflow$LinkWorkflowStartRequest a(@NotNull N2.a linkState) {
        Intrinsics.checkNotNullParameter(linkState, "linkState");
        M0 m02 = linkState.f39389b;
        Intrinsics.checkNotNullParameter(m02, "<this>");
        Configuration$LinkTokenConfiguration.a a10 = Configuration$LinkTokenConfiguration.newBuilder().e(m02.f39358a).c(m02.f39359b).d(m02.f39360c).b(m02.f39361d).f(m02.f39362e).a(m02.f39363f).a(m02.f39364g);
        L0 l02 = m02.f39365h;
        if (l02 != null) {
            Intrinsics.checkNotNullParameter(l02, "<this>");
            Configuration$EmbeddedOpenLinkConfiguration.a a11 = Configuration$EmbeddedOpenLinkConfiguration.newBuilder().a(l02.f39330a).a(l02.f39334e);
            if (l02.f39331b != null) {
                a11.a(Configuration$EmbeddedOpenLinkConfiguration.EmbeddedOpenLinkActionDefault.newBuilder().build());
            } else if (l02.f39333d != null) {
                a11.a(Configuration$EmbeddedOpenLinkConfiguration.EmbeddedOpenLinkActionLinkWithAccountNumbers.newBuilder().build());
            } else if (l02.f39332c != null) {
                a11.a(Configuration$EmbeddedOpenLinkConfiguration.EmbeddedOpenLinkActionWithInstitutionId.newBuilder().a(l02.f39332c.f39321a).build());
            }
            Configuration$EmbeddedOpenLinkConfiguration build = a11.build();
            Intrinsics.checkNotNullExpressionValue(build, "build(...)");
            a10.a(build);
        }
        Intrinsics.checkNotNull(a10);
        Configuration$LinkTokenConfiguration build2 = a10.a((Configuration$PlatformIdentifierConfiguration) this.f40870j.getValue()).build();
        Intrinsics.checkNotNull(build2);
        long currentTimeMillis = System.currentTimeMillis();
        long j10 = 1000;
        Timestamp build3 = Timestamp.newBuilder().setSeconds(currentTimeMillis / j10).setNanos((int) ((currentTimeMillis % j10) * DurationKt.NANOS_IN_MILLIS)).build();
        Intrinsics.checkNotNullExpressionValue(build3, "build(...)");
        PackageManager packageManager = this.f40866f;
        Intrinsics.checkNotNullParameter(packageManager, "packageManager");
        List<ResolveInfo> queryIntentServices = packageManager.queryIntentServices(new Intent("android.support.customtabs.action.CustomTabsService"), 0);
        Intrinsics.checkNotNullExpressionValue(queryIntentServices, "queryIntentServices(...)");
        Workflow$LinkWorkflowStartRequest build4 = a().a(build3).a(build2).a(Configuration$ClientCapabilities.newBuilder().a(queryIntentServices.isEmpty()).build()).build();
        Intrinsics.checkNotNullExpressionValue(build4, "build(...)");
        return build4;
    }

    @NotNull
    public final Workflow$LinkWorkflowStartRequest a(@NotNull N2.b linkState, boolean z10) {
        Intrinsics.checkNotNullParameter(linkState, "linkState");
        Configuration$LinkTokenConfiguration.a e10 = Configuration$LinkTokenConfiguration.newBuilder().c(linkState.f39394b).e(linkState.f39395c.getToken());
        String str = this.f40864d;
        if (str == null) {
            str = "";
        }
        Configuration$LinkTokenConfiguration.a a10 = e10.d(str).a((Configuration$PlatformIdentifierConfiguration) this.f40870j.getValue());
        long currentTimeMillis = System.currentTimeMillis();
        long j10 = 1000;
        Timestamp build = Timestamp.newBuilder().setSeconds(currentTimeMillis / j10).setNanos((int) ((currentTimeMillis % j10) * DurationKt.NANOS_IN_MILLIS)).build();
        Intrinsics.checkNotNullExpressionValue(build, "build(...)");
        PackageManager packageManager = this.f40866f;
        Intrinsics.checkNotNullParameter(packageManager, "packageManager");
        List<ResolveInfo> queryIntentServices = packageManager.queryIntentServices(new Intent("android.support.customtabs.action.CustomTabsService"), 0);
        Intrinsics.checkNotNullExpressionValue(queryIntentServices, "queryIntentServices(...)");
        Workflow$LinkWorkflowStartRequest build2 = a().a(build).a(a10).a(Configuration$ClientCapabilities.newBuilder().a(queryIntentServices.isEmpty()).b(z10).build()).build();
        Intrinsics.checkNotNullExpressionValue(build2, "build(...)");
        return build2;
    }

    public final Workflow$LinkWorkflowStartRequest.a a() {
        Workflow$LinkWorkflowStartRequest.a a10 = Workflow$LinkWorkflowStartRequest.newBuilder().a((Configuration$SDKMetadata) this.f40872l.getValue()).a((Configuration$DeviceMetadata) this.f40871k.getValue());
        this.f40868h.invoke();
        return a10.a("");
    }

    @NotNull
    public final Workflow$LinkWorkflowStartRequest a(@NotNull String linkToken) {
        Intrinsics.checkNotNullParameter(linkToken, "linkToken");
        Configuration$EmbeddedLinkTokenConfiguration.a c10 = Configuration$EmbeddedLinkTokenConfiguration.newBuilder().a(UUID.randomUUID().toString()).c(linkToken);
        String str = this.f40864d;
        if (str == null) {
            str = "";
        }
        Configuration$EmbeddedLinkTokenConfiguration.a a10 = c10.b(str).a((Configuration$PlatformIdentifierConfiguration) this.f40870j.getValue());
        long currentTimeMillis = System.currentTimeMillis();
        long j10 = 1000;
        Timestamp build = Timestamp.newBuilder().setSeconds(currentTimeMillis / j10).setNanos((int) ((currentTimeMillis % j10) * DurationKt.NANOS_IN_MILLIS)).build();
        Intrinsics.checkNotNullExpressionValue(build, "build(...)");
        PackageManager packageManager = this.f40866f;
        Intrinsics.checkNotNullParameter(packageManager, "packageManager");
        List<ResolveInfo> queryIntentServices = packageManager.queryIntentServices(new Intent("android.support.customtabs.action.CustomTabsService"), 0);
        Intrinsics.checkNotNullExpressionValue(queryIntentServices, "queryIntentServices(...)");
        Workflow$LinkWorkflowStartRequest build2 = a().a(build).a(a10).a(Configuration$ClientCapabilities.newBuilder().a(queryIntentServices.isEmpty()).build()).build();
        Intrinsics.checkNotNullExpressionValue(build2, "build(...)");
        return build2;
    }

    @NotNull
    public final Workflow$LinkWorkflowStartRequest a(@NotNull N2.k linkState, @NotNull D6.a result) {
        Intrinsics.checkNotNullParameter(linkState, "linkState");
        Intrinsics.checkNotNullParameter(result, "result");
        HttpUrl.Companion companion = HttpUrl.INSTANCE;
        String queryParameter = companion.get(linkState.f39433f).queryParameter("token");
        String queryParameter2 = companion.get(linkState.f39433f).queryParameter("oauthNonce");
        String str = null;
        if (queryParameter == null || !StringsKt.startsWith$default(queryParameter, "link-", false, 2, (Object) null)) {
            queryParameter = "";
        }
        Workflow$LinkWorkflowStartRequest.a a10 = a();
        Workflow$LinkWorkflowStartRequest.OAuthContinuation.a a11 = Workflow$LinkWorkflowStartRequest.OAuthContinuation.newBuilder().b(result.f39206a).a(queryParameter);
        Workflow$LinkWorkflowStartRequest.OAuthContinuation.LegacyContinuation.a newBuilder = Workflow$LinkWorkflowStartRequest.OAuthContinuation.LegacyContinuation.newBuilder();
        try {
            Uri parse = Uri.parse(result.f39206a);
            if (parse != null) {
                str = parse.getQueryParameter("oauth_state_id");
            }
        } catch (Exception unused) {
        }
        if (str == null) {
            str = "";
        }
        Workflow$LinkWorkflowStartRequest.OAuthContinuation.LegacyContinuation.a b10 = newBuilder.b(str);
        if (queryParameter2 == null) {
            queryParameter2 = "";
        }
        Workflow$LinkWorkflowStartRequest build = a10.a(a11.a(b10.a(queryParameter2))).build();
        Intrinsics.checkNotNullExpressionValue(build, "build(...)");
        return build;
    }
}
