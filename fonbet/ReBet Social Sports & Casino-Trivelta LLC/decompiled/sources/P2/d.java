package P2;

import android.content.pm.PackageInfo;
import android.webkit.WebView;

/* loaded from: classes.dex */
public abstract class d {
    public static PackageInfo a() {
        PackageInfo currentWebViewPackage;
        currentWebViewPackage = WebView.getCurrentWebViewPackage();
        return currentWebViewPackage;
    }
}
