package ru.ozon.fintech.features.finwebview.domain.nativebridge.groups.banks;

import B0.A0;
import B90.C2618u;
import H30.q;
import U50.a;
import U50.d;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import androidx.annotation.Keep;
import com.google.android.gms.common.internal.ImagesContract;
import com.squareup.moshi.Moshi;
import com.squareup.moshi.j;
import g30.InterfaceC6618a;
import java.lang.ref.WeakReference;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.fintech.features.finwebview.domain.nativebridge.NativeResult;
import ru.ozon.fintech.features.finwebview.ui.FintechWebView;

@Keep
@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0011\b\u0001\u0018\u0000 \"2\u00020\u00012\u00020\u0002:\u0003#$%B1\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0010\u0010\u000b\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\n\u0018\u00010\t¢\u0006\u0004\b\f\u0010\rJ?\u0010\u0017\u001a\u00020\u00142\u000e\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u000e2\u0006\u0010\u0011\u001a\u00020\n2\u0016\u0010\u0016\u001a\u0012\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u00140\u0012j\u0002`\u0015H\u0016¢\u0006\u0004\b\u0017\u0010\u0018J'\u0010\u0019\u001a\u00020\u00132\u000e\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u000e2\u0006\u0010\u0011\u001a\u00020\nH\u0016¢\u0006\u0004\b\u0019\u0010\u001aR\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u001bR\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u001cR\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\u001dR\u001e\u0010\u000b\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\n\u0018\u00010\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\u001eR\u0014\u0010!\u001a\u00020\n8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001f\u0010 ¨\u0006&"}, d2 = {"Lru/ozon/fintech/features/finwebview/domain/nativebridge/groups/banks/CanOpenInterface;", "LU50/a;", "LU50/d;", "Landroid/content/Context;", "context", "Lcom/squareup/moshi/Moshi;", "moshi", "Lg30/a;", "fintechAnalyticInteractor", "Lkotlin/Function0;", "", "provideTabId", "<init>", "(Landroid/content/Context;Lcom/squareup/moshi/Moshi;Lg30/a;Lkotlin/jvm/functions/Function0;)V", "Ljava/lang/ref/WeakReference;", "Lru/ozon/fintech/features/finwebview/ui/FintechWebView;", "weakWebViewRef", "parameterJson", "Lkotlin/Function1;", "Lru/ozon/fintech/features/finwebview/domain/nativebridge/NativeResult;", "", "Lru/ozon/fintech/features/finwebview/domain/nativebridge/InterfaceCallback;", "callback", "handle", "(Ljava/lang/ref/WeakReference;Ljava/lang/String;Lkotlin/jvm/functions/Function1;)V", "handleSync", "(Ljava/lang/ref/WeakReference;Ljava/lang/String;)Lru/ozon/fintech/features/finwebview/domain/nativebridge/NativeResult;", "Landroid/content/Context;", "Lcom/squareup/moshi/Moshi;", "Lg30/a;", "Lkotlin/jvm/functions/Function0;", "getInterfaceName", "()Ljava/lang/String;", "interfaceName", "Companion", "a", "Request", "Response", "finwebview_prodRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class CanOpenInterface implements a, d {

    @NotNull
    private static final String INTERFACE_NAME = "can_open_url";

    @NotNull
    private final Context context;

    @NotNull
    private final InterfaceC6618a fintechAnalyticInteractor;

    @NotNull
    private final Moshi moshi;
    private final Function0<String> provideTabId;

    @Keep
    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0081\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\r\u001a\u00020\u000eHÖ\u0001J\t\u0010\u000f\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0010"}, d2 = {"Lru/ozon/fintech/features/finwebview/domain/nativebridge/groups/banks/CanOpenInterface$Request;", "", ImagesContract.URL, "", "<init>", "(Ljava/lang/String;)V", "getUrl", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "finwebview_prodRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    @j(generateAdapter = true)
    public static final /* data */ class Request {

        @NotNull
        private final String url;

        public Request(@NotNull String url) {
            Intrinsics.checkNotNullParameter(url, "url");
            this.url = url;
        }

        public static /* synthetic */ Request copy$default(Request request, String str, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                str = request.url;
            }
            return request.copy(str);
        }

        @NotNull
        /* renamed from: component1, reason: from getter */
        public final String getUrl() {
            return this.url;
        }

        @NotNull
        public final Request copy(@NotNull String url) {
            Intrinsics.checkNotNullParameter(url, "url");
            return new Request(url);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Request) && Intrinsics.d(this.url, ((Request) other).url);
        }

        @NotNull
        public final String getUrl() {
            return this.url;
        }

        public int hashCode() {
            return this.url.hashCode();
        }

        @NotNull
        public String toString() {
            return A0.b("Request(url=", this.url, ")");
        }
    }

    @Keep
    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0081\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u00032\b\u0010\u000b\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\f\u001a\u00020\rHÖ\u0001J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0010"}, d2 = {"Lru/ozon/fintech/features/finwebview/domain/nativebridge/groups/banks/CanOpenInterface$Response;", "", "availability", "", "<init>", "(Z)V", "getAvailability", "()Z", "component1", "copy", "equals", "other", "hashCode", "", "toString", "", "finwebview_prodRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    @j(generateAdapter = true)
    public static final /* data */ class Response {
        private final boolean availability;

        public Response(boolean z11) {
            this.availability = z11;
        }

        public static /* synthetic */ Response copy$default(Response response, boolean z11, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                z11 = response.availability;
            }
            return response.copy(z11);
        }

        /* renamed from: component1, reason: from getter */
        public final boolean getAvailability() {
            return this.availability;
        }

        @NotNull
        public final Response copy(boolean availability) {
            return new Response(availability);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Response) && this.availability == ((Response) other).availability;
        }

        public final boolean getAvailability() {
            return this.availability;
        }

        public int hashCode() {
            return Boolean.hashCode(this.availability);
        }

        @NotNull
        public String toString() {
            return C2618u.g("Response(availability=", ")", this.availability);
        }
    }

    public CanOpenInterface(@NotNull Context context, @NotNull Moshi moshi, @NotNull InterfaceC6618a fintechAnalyticInteractor, Function0<String> function0) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(moshi, "moshi");
        Intrinsics.checkNotNullParameter(fintechAnalyticInteractor, "fintechAnalyticInteractor");
        this.context = context;
        this.moshi = moshi;
        this.fintechAnalyticInteractor = fintechAnalyticInteractor;
        this.provideTabId = function0;
    }

    @Override // U50.c
    @NotNull
    public String getInterfaceName() {
        return INTERFACE_NAME;
    }

    @Override // U50.a
    public void handle(WeakReference<FintechWebView> weakWebViewRef, @NotNull String parameterJson, @NotNull Function1<? super NativeResult, Unit> callback) {
        Intrinsics.checkNotNullParameter(parameterJson, "parameterJson");
        Intrinsics.checkNotNullParameter(callback, "callback");
        callback.invoke(handleSync(weakWebViewRef, parameterJson));
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x009a  */
    @Override // U50.d
    @NotNull
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public NativeResult handleSync(WeakReference<FintechWebView> weakWebViewRef, @NotNull String parameterJson) {
        String str;
        NativeResult.Success success;
        Request request;
        Intent intent;
        String str2;
        String str3;
        String str4 = "";
        Intrinsics.checkNotNullParameter(parameterJson, "parameterJson");
        boolean z11 = false;
        try {
            request = (Request) q.a(this.moshi, parameterJson, Request.class);
            str = request != null ? request.getUrl() : null;
        } catch (Exception unused) {
            str = null;
        }
        try {
            intent = new Intent("android.intent.action.VIEW", Uri.parse(request != null ? request.getUrl() : null));
            intent.setFlags(268435456);
        } catch (Exception unused2) {
            try {
                str4 = this.moshi.c(Response.class).toJson(new Response(false));
            } catch (Throwable th2) {
                th2.printStackTrace();
            }
            success = new NativeResult.Success(str4);
            InterfaceC6618a interfaceC6618a = this.fintechAnalyticInteractor;
            Function0<String> function0 = this.provideTabId;
            interfaceC6618a.J(function0 != null ? function0.invoke() : null, str, z11);
            return success;
        }
        if (this.context.getPackageManager().resolveActivity(intent, 0) == null) {
            try {
                str2 = this.moshi.c(Response.class).toJson(new Response(false));
            } catch (Throwable th3) {
                th3.printStackTrace();
                str2 = "";
            }
            success = new NativeResult.Success(str2);
            InterfaceC6618a interfaceC6618a2 = this.fintechAnalyticInteractor;
            Function0<String> function02 = this.provideTabId;
            interfaceC6618a2.J(function02 != null ? function02.invoke() : null, str, z11);
            return success;
        }
        try {
            str3 = this.moshi.c(Response.class).toJson(new Response(true));
        } catch (Throwable th4) {
            th4.printStackTrace();
            str3 = "";
        }
        success = new NativeResult.Success(str3);
        z11 = true;
        InterfaceC6618a interfaceC6618a22 = this.fintechAnalyticInteractor;
        Function0<String> function022 = this.provideTabId;
        interfaceC6618a22.J(function022 != null ? function022.invoke() : null, str, z11);
        return success;
    }
}
