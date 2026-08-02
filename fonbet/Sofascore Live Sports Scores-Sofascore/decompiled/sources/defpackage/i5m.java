package defpackage;

import android.content.Context;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.webkit.WebView;
import com.blaze.blazesdk.shared.BlazeSDK;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public final class i5m extends WebView {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i5m(@NotNull Context context) {
        super(context);
        context.getClass();
        try {
            setFocusable(true);
            setFocusableInTouchMode(true);
            getSettings().setJavaScriptEnabled(true);
            setScrollBarStyle(0);
            getSettings().setCacheMode(-1);
            getSettings().setMixedContentMode(0);
            getSettings().setDomStorageEnabled(true);
            getSettings().setSupportMultipleWindows(false);
            setWebViewClient(new zxl());
            setWebChromeClient(new x1m());
        } catch (Throwable th) {
            BlazeSDK.INSTANCE.getGlobalThrowableCatcher$blazesdk_release().invoke(th, null);
        }
    }

    @Override // android.webkit.WebView
    public final void destroy() {
        ViewParent parent = getParent();
        ViewGroup viewGroup = parent instanceof ViewGroup ? (ViewGroup) parent : null;
        if (viewGroup != null) {
            viewGroup.removeView(this);
        }
        stopLoading();
        clearCache(true);
        clearHistory();
        clearFocus();
        removeAllViews();
        super.destroy();
    }
}
