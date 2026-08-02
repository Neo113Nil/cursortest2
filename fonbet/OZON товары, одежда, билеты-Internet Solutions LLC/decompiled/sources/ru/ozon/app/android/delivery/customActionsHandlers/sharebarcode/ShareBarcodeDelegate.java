package ru.ozon.app.android.delivery.customActionsHandlers.sharebarcode;

import De.s;
import He.b;
import android.content.Context;
import android.net.Uri;
import androidx.lifecycle.AbstractC5434v;
import androidx.lifecycle.DefaultLifecycleObserver;
import java.lang.ref.WeakReference;
import kotlin.Metadata;
import kotlin.coroutines.d;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import xe.C10720e0;
import xe.C10727i;
import xe.J;
import xe.M;
import xe.N;
import xe.X0;

@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\u0018\u0000  2\u00020\u0001:\u0001 B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J0\u0010\u000b\u001a\n \n*\u0004\u0018\u00010\t0\t2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0006H\u0082@¢\u0006\u0004\b\u000b\u0010\fJ\u001d\u0010\u0011\u001a\u00020\u00102\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\rH\u0002¢\u0006\u0004\b\u0011\u0010\u0012J;\u0010\u0014\u001a\u00020\u00102\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u00062\u0006\u0010\u0013\u001a\u00020\u00062\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r¢\u0006\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0017\u001a\u00020\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u0014\u0010\u001a\u001a\u00020\u00198\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u0016\u0010\u001d\u001a\u00020\u001c8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\u0016\u0010\u001f\u001a\u00020\u001c8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001f\u0010\u001e¨\u0006!"}, d2 = {"Lru/ozon/app/android/delivery/customActionsHandlers/sharebarcode/ShareBarcodeDelegate;", "", "<init>", "()V", "Landroid/content/Context;", "context", "", "code", "visibleCode", "Landroid/net/Uri;", "kotlin.jvm.PlatformType", "generateBarcodeUri", "(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/d;)Ljava/lang/Object;", "Ljava/lang/ref/WeakReference;", "Landroidx/lifecycle/v;", "lifecycle", "", "onSharing", "(Ljava/lang/ref/WeakReference;)V", "text", "share", "(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/ref/WeakReference;)V", "Lxe/M;", "scope", "Lxe/M;", "Lru/ozon/app/android/delivery/customActionsHandlers/sharebarcode/ShareBarcodeBitmapGenerator;", "shareBarcodeBitmapGenerator", "Lru/ozon/app/android/delivery/customActionsHandlers/sharebarcode/ShareBarcodeBitmapGenerator;", "", "isFirstOnResume", "Z", "isSharing", "Companion", "custom-action-handlers_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class ShareBarcodeDelegate {

    @NotNull
    private static final Companion Companion = new Companion(null);
    private boolean isFirstOnResume;
    private boolean isSharing;

    @NotNull
    private final M scope;

    @NotNull
    private final ShareBarcodeBitmapGenerator shareBarcodeBitmapGenerator;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\b"}, d2 = {"Lru/ozon/app/android/delivery/customActionsHandlers/sharebarcode/ShareBarcodeDelegate$Companion;", "", "<init>", "()V", "DOCS_DIR", "", "FILE_EXTENSION", "FILE_NAME", "custom-action-handlers_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    private static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    public ShareBarcodeDelegate() {
        C10720e0 c10720e0 = C10720e0.f105451a;
        this.scope = N.a(s.f6650a.x().plus(X0.b()).plus(new ShareBarcodeDelegate$special$$inlined$CoroutineExceptionHandler$1(J.f105405n0)));
        this.shareBarcodeBitmapGenerator = new ShareBarcodeBitmapGenerator();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object generateBarcodeUri(Context context, String str, String str2, d<? super Uri> dVar) {
        C10720e0 c10720e0 = C10720e0.f105451a;
        return C10727i.f(b.f10879b, new ShareBarcodeDelegate$generateBarcodeUri$2(this, context, str, str2, null), dVar);
    }

    private final void onSharing(final WeakReference<AbstractC5434v> lifecycle) {
        this.isSharing = true;
        DefaultLifecycleObserver defaultLifecycleObserver = new DefaultLifecycleObserver() { // from class: ru.ozon.app.android.delivery.customActionsHandlers.sharebarcode.ShareBarcodeDelegate$onSharing$observer$1
            @Override // androidx.lifecycle.DefaultLifecycleObserver
            public void onDestroy(androidx.lifecycle.J owner) {
                Intrinsics.checkNotNullParameter(owner, "owner");
                AbstractC5434v abstractC5434v = lifecycle.get();
                if (abstractC5434v != null) {
                    abstractC5434v.e(this);
                }
            }

            @Override // androidx.lifecycle.DefaultLifecycleObserver
            public void onResume(androidx.lifecycle.J owner) {
                boolean z11;
                Intrinsics.checkNotNullParameter(owner, "owner");
                z11 = ShareBarcodeDelegate.this.isFirstOnResume;
                if (!z11) {
                    ShareBarcodeDelegate.this.isFirstOnResume = true;
                    return;
                }
                ShareBarcodeDelegate.this.isSharing = false;
                ShareBarcodeDelegate.this.isFirstOnResume = false;
                AbstractC5434v abstractC5434v = lifecycle.get();
                if (abstractC5434v != null) {
                    abstractC5434v.e(this);
                }
            }
        };
        AbstractC5434v abstractC5434v = lifecycle.get();
        if (abstractC5434v != null) {
            abstractC5434v.a(defaultLifecycleObserver);
        }
    }

    public final void share(@NotNull Context context, @NotNull String code, @NotNull String visibleCode, @NotNull String text, @NotNull WeakReference<AbstractC5434v> lifecycle) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(code, "code");
        Intrinsics.checkNotNullParameter(visibleCode, "visibleCode");
        Intrinsics.checkNotNullParameter(text, "text");
        Intrinsics.checkNotNullParameter(lifecycle, "lifecycle");
        if (this.isSharing) {
            return;
        }
        onSharing(lifecycle);
        C10727i.c(this.scope, null, null, new ShareBarcodeDelegate$share$1(this, context, code, visibleCode, text, null), 3);
    }
}
