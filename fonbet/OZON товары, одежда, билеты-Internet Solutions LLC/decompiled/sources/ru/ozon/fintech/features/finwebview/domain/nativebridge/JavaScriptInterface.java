package ru.ozon.fintech.features.finwebview.domain.nativebridge;

import android.webkit.JavascriptInterface;
import androidx.annotation.Keep;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@Keep
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\ba\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H'J\u0012\u0010\u0006\u001a\u00020\u00052\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0017J\u0012\u0010\u0007\u001a\u00020\u00052\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H'J\u0012\u0010\b\u001a\u00020\u00052\b\u0010\t\u001a\u0004\u0018\u00010\u0005H'¨\u0006\n"}, d2 = {"Lru/ozon/fintech/features/finwebview/domain/nativebridge/JavaScriptInterface;", "", "call", "", "parametersJson", "", "callSync", "checkMethod", "getFile", "fileName", "finwebview_prodRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public interface JavaScriptInterface {
    @JavascriptInterface
    void call(String parametersJson);

    @JavascriptInterface
    @NotNull
    String callSync(String parametersJson);

    @JavascriptInterface
    @NotNull
    String checkMethod(String parametersJson);

    @JavascriptInterface
    @NotNull
    String getFile(String fileName);
}
