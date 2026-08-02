package com.sports.insider.util.common;

import android.webkit.JavascriptInterface;
import androidx.annotation.Keep;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
@Keep
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u000b\n\u0000\bg\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0017J\u001c\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\bH\u0017J\b\u0010\t\u001a\u00020\u0005H\u0017J\u001c\u0010\n\u001a\u00020\u00052\b\u0010\u000b\u001a\u0004\u0018\u00010\b2\b\u0010\f\u001a\u0004\u0018\u00010\bH\u0017J\u0012\u0010\r\u001a\u00020\u00052\b\u0010\u000e\u001a\u0004\u0018\u00010\bH\u0017J\b\u0010\u000f\u001a\u00020\u0005H\u0017J\u0010\u0010\u0010\u001a\u00020\u00052\u0006\u0010\u0011\u001a\u00020\u0012H\u0017¨\u0006\u0013À\u0006\u0003"}, d2 = {"Lcom/sports/insider/util/common/JavaScriptActionInterface;", "", "versionCode", "", "loadPreview", "", "idPrediction", "language", "", "triggerIdentity", "triggerEvent", "name", "value", "showToast", "toast", "closeThis", "changeNotification", "state", "", "Betting-123_googleProductionRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes.dex */
public interface JavaScriptActionInterface {
    @JavascriptInterface
    void changeNotification(boolean state);

    @JavascriptInterface
    void closeThis();

    @JavascriptInterface
    void loadPreview(int idPrediction, @NotNull String language);

    @JavascriptInterface
    void showToast(@Nullable String toast);

    @JavascriptInterface
    void triggerEvent(@Nullable String name, @Nullable String value);

    @JavascriptInterface
    void triggerIdentity();

    @JavascriptInterface
    int versionCode();
}
