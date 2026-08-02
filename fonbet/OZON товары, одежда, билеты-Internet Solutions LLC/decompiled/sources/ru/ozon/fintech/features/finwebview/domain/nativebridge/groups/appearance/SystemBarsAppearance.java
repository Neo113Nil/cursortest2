package ru.ozon.fintech.features.finwebview.domain.nativebridge.groups.appearance;

import Ef0.c;
import H30.q;
import U50.a;
import U50.d;
import android.app.Activity;
import android.content.Context;
import android.os.Build;
import android.view.Window;
import android.view.WindowInsetsController;
import androidx.annotation.Keep;
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
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u000f\b\u0001\u0018\u0000 \u001f2\u00020\u00012\u00020\u0002:\u0002 !B)\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0010\u0010\t\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\b\u0018\u00010\u0007¢\u0006\u0004\b\n\u0010\u000bJ?\u0010\u0015\u001a\u00020\u00122\u000e\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\f2\u0006\u0010\u000f\u001a\u00020\b2\u0016\u0010\u0014\u001a\u0012\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u00120\u0010j\u0002`\u0013H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J'\u0010\u0017\u001a\u00020\u00112\u000e\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\f2\u0006\u0010\u000f\u001a\u00020\bH\u0016¢\u0006\u0004\b\u0017\u0010\u0018R\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0019R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u001aR\u001e\u0010\t\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\b\u0018\u00010\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u001bR\u0014\u0010\u001e\u001a\u00020\b8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001c\u0010\u001d¨\u0006\""}, d2 = {"Lru/ozon/fintech/features/finwebview/domain/nativebridge/groups/appearance/SystemBarsAppearance;", "LU50/a;", "LU50/d;", "Lcom/squareup/moshi/Moshi;", "moshi", "Lg30/a;", "fintechAnalyticInteractor", "Lkotlin/Function0;", "", "provideTabId", "<init>", "(Lcom/squareup/moshi/Moshi;Lg30/a;Lkotlin/jvm/functions/Function0;)V", "Ljava/lang/ref/WeakReference;", "Lru/ozon/fintech/features/finwebview/ui/FintechWebView;", "weakWebViewRef", "parameterJson", "Lkotlin/Function1;", "Lru/ozon/fintech/features/finwebview/domain/nativebridge/NativeResult;", "", "Lru/ozon/fintech/features/finwebview/domain/nativebridge/InterfaceCallback;", "callback", "handle", "(Ljava/lang/ref/WeakReference;Ljava/lang/String;Lkotlin/jvm/functions/Function1;)V", "handleSync", "(Ljava/lang/ref/WeakReference;Ljava/lang/String;)Lru/ozon/fintech/features/finwebview/domain/nativebridge/NativeResult;", "Lcom/squareup/moshi/Moshi;", "Lg30/a;", "Lkotlin/jvm/functions/Function0;", "getInterfaceName", "()Ljava/lang/String;", "interfaceName", "Companion", "a", "Request", "finwebview_prodRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class SystemBarsAppearance implements a, d {

    @NotNull
    private static final String INTERFACE_NAME = "system_bars_appearance";

    @NotNull
    private final InterfaceC6618a fintechAnalyticInteractor;

    @NotNull
    private final Moshi moshi;
    private final Function0<String> provideTabId;

    @Keep
    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\f\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0081\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\r\u001a\u00020\u00032\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b¨\u0006\u0013"}, d2 = {"Lru/ozon/fintech/features/finwebview/domain/nativebridge/groups/appearance/SystemBarsAppearance$Request;", "", "lightStatus", "", "lightNavigation", "<init>", "(ZZ)V", "getLightStatus", "()Z", "getLightNavigation", "component1", "component2", "copy", "equals", "other", "hashCode", "", "toString", "", "finwebview_prodRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    @j(generateAdapter = true)
    public static final /* data */ class Request {
        private final boolean lightNavigation;
        private final boolean lightStatus;

        public Request(boolean z11, boolean z12) {
            this.lightStatus = z11;
            this.lightNavigation = z12;
        }

        public static /* synthetic */ Request copy$default(Request request, boolean z11, boolean z12, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                z11 = request.lightStatus;
            }
            if ((i11 & 2) != 0) {
                z12 = request.lightNavigation;
            }
            return request.copy(z11, z12);
        }

        /* renamed from: component1, reason: from getter */
        public final boolean getLightStatus() {
            return this.lightStatus;
        }

        /* renamed from: component2, reason: from getter */
        public final boolean getLightNavigation() {
            return this.lightNavigation;
        }

        @NotNull
        public final Request copy(boolean lightStatus, boolean lightNavigation) {
            return new Request(lightStatus, lightNavigation);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Request)) {
                return false;
            }
            Request request = (Request) other;
            return this.lightStatus == request.lightStatus && this.lightNavigation == request.lightNavigation;
        }

        public final boolean getLightNavigation() {
            return this.lightNavigation;
        }

        public final boolean getLightStatus() {
            return this.lightStatus;
        }

        public int hashCode() {
            return Boolean.hashCode(this.lightNavigation) + (Boolean.hashCode(this.lightStatus) * 31);
        }

        @NotNull
        public String toString() {
            return c.c("Request(lightStatus=", ", lightNavigation=", ")", this.lightStatus, this.lightNavigation);
        }
    }

    public SystemBarsAppearance(@NotNull Moshi moshi, @NotNull InterfaceC6618a fintechAnalyticInteractor, Function0<String> function0) {
        Intrinsics.checkNotNullParameter(moshi, "moshi");
        Intrinsics.checkNotNullParameter(fintechAnalyticInteractor, "fintechAnalyticInteractor");
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

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0047, code lost:
    
        r3 = r6.getInsetsController();
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x005c, code lost:
    
        r6 = r6.getInsetsController();
     */
    @Override // U50.d
    @NotNull
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public NativeResult handleSync(WeakReference<FintechWebView> weakWebViewRef, @NotNull String parameterJson) {
        NativeResult.Success success;
        WindowInsetsController insetsController;
        WindowInsetsController insetsController2;
        FintechWebView fintechWebView;
        Intrinsics.checkNotNullParameter(parameterJson, "parameterJson");
        try {
            Request request = (Request) q.a(this.moshi, parameterJson, Request.class);
            Context context = (weakWebViewRef == null || (fintechWebView = weakWebViewRef.get()) == null) ? null : fintechWebView.getContext();
            Activity activity = context instanceof Activity ? (Activity) context : null;
            Window window = activity != null ? activity.getWindow() : null;
            if (request == null) {
                return new NativeResult.Error("function parameters error", null, 2, null);
            }
            if (Build.VERSION.SDK_INT < 31) {
                return new NativeResult.Error("Android < 11, disabled", null, 2, null);
            }
            if (window != null && insetsController2 != null) {
                insetsController2.setSystemBarsAppearance(request.getLightStatus() ? 8 : 0, 8);
            }
            if (window != null && insetsController != null) {
                insetsController.setSystemBarsAppearance(request.getLightNavigation() ? 16 : 0, 16);
            }
            InterfaceC6618a interfaceC6618a = this.fintechAnalyticInteractor;
            boolean lightNavigation = request.getLightNavigation();
            boolean lightStatus = request.getLightStatus();
            Function0<String> function0 = this.provideTabId;
            interfaceC6618a.z1(function0 != null ? function0.invoke() : null, lightStatus, lightNavigation);
            NativeResult.Success.INSTANCE.getClass();
            success = NativeResult.Success.DEFAULT_WITH_SUCCESS;
            return success;
        } catch (Exception e11) {
            String message = e11.getMessage();
            if (message == null) {
                message = e11.toString();
            }
            return new NativeResult.Error(message, null, 2, null);
        }
    }
}
