package xe;

import android.graphics.Bitmap;
import android.view.View;
import android.webkit.ConsoleMessage;
import android.webkit.ValueCallback;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import androidx.fragment.app.Fragment;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class e extends WebChromeClient {

    /* renamed from: a, reason: collision with root package name */
    public kh.g f25457a;

    @Override // android.webkit.WebChromeClient
    public final Bitmap getDefaultVideoPoster() {
        return null;
    }

    @Override // android.webkit.WebChromeClient
    public final boolean onConsoleMessage(ConsoleMessage consoleMessage) {
        Intrinsics.checkNotNullParameter(consoleMessage, "consoleMessage");
        if (this.f25457a == null) {
            return true;
        }
        Intrinsics.checkNotNullParameter(consoleMessage, "consoleMessage");
        return true;
    }

    /* JADX WARN: Type inference failed for: r1v3, types: [androidx.fragment.app.Fragment, ue.e] */
    @Override // android.webkit.WebChromeClient
    public final void onProgressChanged(WebView webView, int i5) {
        ?? r12;
        super.onProgressChanged(webView, i5);
        kh.g gVar = this.f25457a;
        if (gVar == null || (r12 = (Fragment) gVar.f19115b) == 0) {
            return;
        }
        r12.o(i5);
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [androidx.fragment.app.Fragment, ue.e] */
    @Override // android.webkit.WebChromeClient
    public final void onShowCustomView(View paramView, WebChromeClient.CustomViewCallback paramCustomViewCallback) {
        Intrinsics.checkNotNullParameter(paramView, "paramView");
        Intrinsics.checkNotNullParameter(paramCustomViewCallback, "paramCustomViewCallback");
        kh.g gVar = this.f25457a;
        if (gVar != null) {
            Intrinsics.checkNotNullParameter(paramView, "paramView");
            Intrinsics.checkNotNullParameter(paramCustomViewCallback, "paramCustomViewCallback");
            ?? r02 = (Fragment) gVar.f19115b;
            if (r02 != 0) {
                r02.e(paramView, paramCustomViewCallback);
            }
        }
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [androidx.fragment.app.Fragment, ue.e] */
    @Override // android.webkit.WebChromeClient
    public final boolean onShowFileChooser(WebView webView, ValueCallback filePathCallback, WebChromeClient.FileChooserParams fileChooserParams) {
        Intrinsics.checkNotNullParameter(filePathCallback, "filePathCallback");
        kh.g gVar = this.f25457a;
        if (gVar != null) {
            Intrinsics.checkNotNullParameter(filePathCallback, "filePathCallback");
            ?? r02 = (Fragment) gVar.f19115b;
            if (r02 != 0) {
                r02.z(webView, filePathCallback, fileChooserParams);
            }
        }
        return false;
    }

    @Override // android.webkit.WebChromeClient
    public final void onHideCustomView() {
    }
}
