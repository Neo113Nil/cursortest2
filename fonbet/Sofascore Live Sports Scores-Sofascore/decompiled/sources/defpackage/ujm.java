package defpackage;

import android.webkit.JavascriptInterface;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public interface ujm {
    @JavascriptInterface
    void goToNextItem();

    @JavascriptInterface
    void goToNextPage();

    @JavascriptInterface
    void goToPreviousItem();

    @JavascriptInterface
    void goToPreviousPage();

    @JavascriptInterface
    void hapticFeedback(@NotNull String str);

    @JavascriptInterface
    void pause();

    @JavascriptInterface
    void play();

    @JavascriptInterface
    void postMessage(@NotNull String str);

    @JavascriptInterface
    void postResponse(@NotNull String str);

    @JavascriptInterface
    void readyToDisplay();

    @JavascriptInterface
    void setAppContext(@NotNull String str);
}
