package com.sports.insider.util.common;

import android.webkit.JavascriptInterface;
import androidx.annotation.Keep;
import kotlin.Metadata;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
@Keep
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0010\bg\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0017J\b\u0010\u0004\u001a\u00020\u0003H\u0017J\b\u0010\u0005\u001a\u00020\u0003H\u0017J%\u0010\u0006\u001a\u00020\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\nH\u0017¢\u0006\u0002\u0010\u000bJ\u001c\u0010\f\u001a\u00020\u00032\b\u0010\r\u001a\u0004\u0018\u00010\b2\b\u0010\u000e\u001a\u0004\u0018\u00010\bH\u0017J\u001c\u0010\u000f\u001a\u00020\u00032\b\b\u0002\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u0010\u001a\u00020\nH\u0017J\u001c\u0010\u0011\u001a\u00020\u00032\b\b\u0002\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u0010\u001a\u00020\nH\u0017J\b\u0010\u0012\u001a\u00020\u0003H\u0017J\u0019\u0010\u0013\u001a\u00020\u00032\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\nH\u0017¢\u0006\u0002\u0010\u0015J\u0014\u0010\u0016\u001a\u00020\u00032\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\bH\u0017J\u0014\u0010\u0017\u001a\u00020\u00032\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\bH\u0017J\b\u0010\u0018\u001a\u00020\u0003H\u0017J\b\u0010\u0019\u001a\u00020\u0003H\u0017¨\u0006\u001aÀ\u0006\u0003"}, d2 = {"Lcom/sports/insider/util/common/JavaScriptInterfaceNavigate;", "", "openTariff", "", "openDiamond", "openLive", "openCloudPayment", "idSku", "", "idContent", "", "(Ljava/lang/String;Ljava/lang/Integer;)V", "openUrlByBrowser", "url", "headersJSONObject", "openPrediction", "typeContent", "openPayPrediction", "openBonusInfo", "openNews", "idArticle", "(Ljava/lang/Integer;)V", "openFaq", "openSIAcademyFaq", "openSetting", "openSupport", "Betting-123_googleProductionRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes.dex */
public interface JavaScriptInterfaceNavigate {
    @JavascriptInterface
    void openBonusInfo();

    @JavascriptInterface
    void openCloudPayment(@Nullable String idSku, @Nullable Integer idContent);

    @JavascriptInterface
    void openDiamond();

    @JavascriptInterface
    void openFaq(@Nullable String idArticle);

    @JavascriptInterface
    void openLive();

    @JavascriptInterface
    void openNews(@Nullable Integer idArticle);

    @JavascriptInterface
    void openPayPrediction(int idContent, int typeContent);

    @JavascriptInterface
    void openPrediction(int idContent, int typeContent);

    @JavascriptInterface
    void openSIAcademyFaq(@Nullable String idArticle);

    @JavascriptInterface
    void openSetting();

    @JavascriptInterface
    void openSupport();

    @JavascriptInterface
    void openTariff();

    @JavascriptInterface
    void openUrlByBrowser(@Nullable String url, @Nullable String headersJSONObject);
}
