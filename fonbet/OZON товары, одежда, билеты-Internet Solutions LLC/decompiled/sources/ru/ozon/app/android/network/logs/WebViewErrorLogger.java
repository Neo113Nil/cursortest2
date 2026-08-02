package ru.ozon.app.android.network.logs;

import Sc.InterfaceC4008j;
import Sc.k;
import android.webkit.ConsoleMessage;
import com.google.android.gms.common.internal.ImagesContract;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.collections.U;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.h;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.ozonLogger.core.a;
import ru.ozon.app.android.network.abtool.FeatureChecker;
import ru.ozon.app.android.network.abtool.FeatureService;
import ru.ozon.app.android.network.auth.flags.WebViewErrorLogEnabled;
import sj.d;
import sj.f;

@Metadata(d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\"\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000 (2\u00020\u0001:\u0001(B!\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ1\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000b\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\nH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J#\u0010\u0015\u001a\u00020\u0014*\u0004\u0018\u00010\n2\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\n0\u0012H\u0002¢\u0006\u0004\b\u0015\u0010\u0016J+\u0010\u0018\u001a\u00020\u00172\b\u0010\u000b\u001a\u0004\u0018\u00010\n2\b\u0010\r\u001a\u0004\u0018\u00010\f2\b\u0010\u000e\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u0018\u0010\u0019J\u0017\u0010\u001a\u001a\u00020\u00172\b\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u001a\u0010\u001bJ\u0017\u0010\u0018\u001a\u00020\u00172\b\u0010\u001d\u001a\u0004\u0018\u00010\u001c¢\u0006\u0004\b\u0018\u0010\u001eR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u001fR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010 R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010!R+\u0010\u0013\u001a\u0012\u0012\u0004\u0012\u00020\n0\"j\b\u0012\u0004\u0012\u00020\n`#8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b$\u0010%\u001a\u0004\b&\u0010'¨\u0006)"}, d2 = {"Lru/ozon/app/android/network/logs/WebViewErrorLogger;", "", "Lru/ozon/app/android/network/abtool/FeatureService;", "featureService", "Lru/ozon/app/android/network/abtool/FeatureChecker;", "featureChecker", "Lsj/d;", "logger", "<init>", "(Lru/ozon/app/android/network/abtool/FeatureService;Lru/ozon/app/android/network/abtool/FeatureChecker;Lsj/d;)V", "", ImagesContract.URL, "", "errorCode", "message", "Lru/ozon/android/ozonLogger/core/a;", "generateFields", "(Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;)Lru/ozon/android/ozonLogger/core/a;", "", "keys", "", "containsKeys", "(Ljava/lang/String;Ljava/util/Set;)Z", "", "logErrorInWebView", "(Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;)V", "logSslErrorInWebView", "(Ljava/lang/String;)V", "Landroid/webkit/ConsoleMessage;", "consoleMessage", "(Landroid/webkit/ConsoleMessage;)V", "Lru/ozon/app/android/network/abtool/FeatureService;", "Lru/ozon/app/android/network/abtool/FeatureChecker;", "Lsj/d;", "Ljava/util/HashSet;", "Lkotlin/collections/HashSet;", "keys$delegate", "LSc/j;", "getKeys", "()Ljava/util/HashSet;", "Companion", "network_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class WebViewErrorLogger {

    @NotNull
    private final FeatureChecker featureChecker;

    @NotNull
    private final FeatureService featureService;

    /* renamed from: keys$delegate, reason: from kotlin metadata */
    @NotNull
    private final InterfaceC4008j keys;

    @NotNull
    private final d logger;

    public WebViewErrorLogger(@NotNull FeatureService featureService, @NotNull FeatureChecker featureChecker, @NotNull d logger) {
        Intrinsics.checkNotNullParameter(featureService, "featureService");
        Intrinsics.checkNotNullParameter(featureChecker, "featureChecker");
        Intrinsics.checkNotNullParameter(logger, "logger");
        this.featureService = featureService;
        this.featureChecker = featureChecker;
        this.logger = logger;
        this.keys = k.b(new WebViewErrorLogger$keys$2(this));
    }

    private final boolean containsKeys(String str, Set<String> set) {
        if (!set.isEmpty() && str != null && str.length() != 0) {
            Set<String> set2 = set;
            if ((set2 instanceof Collection) && set2.isEmpty()) {
                return false;
            }
            Iterator<T> it = set2.iterator();
            while (it.hasNext()) {
                if (h.t(str, (String) it.next(), true)) {
                    return true;
                }
            }
        }
        return false;
    }

    private final a generateFields(String url, Integer errorCode, String message) {
        return f.a(U.j(new Pair(ImagesContract.URL, url), new Pair("error_code", errorCode), new Pair("data", message)));
    }

    static /* synthetic */ a generateFields$default(WebViewErrorLogger webViewErrorLogger, String str, Integer num, String str2, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            num = null;
        }
        if ((i11 & 4) != 0) {
            str2 = null;
        }
        return webViewErrorLogger.generateFields(str, num, str2);
    }

    private final HashSet<String> getKeys() {
        return (HashSet) this.keys.getValue();
    }

    public final void logErrorInWebView(String url, Integer errorCode, String message) {
        if (this.featureChecker.isEnabled(WebViewErrorLogEnabled.INSTANCE) && !containsKeys(message, getKeys())) {
            this.logger.c("webview_error", generateFields(url, errorCode, message), Boolean.FALSE);
        }
    }

    public final void logSslErrorInWebView(String url) {
        if (this.featureChecker.isEnabled(WebViewErrorLogEnabled.INSTANCE)) {
            this.logger.c("webview_error", generateFields(url, 459, "SSL_error"), Boolean.FALSE);
        }
    }

    public final void logErrorInWebView(ConsoleMessage consoleMessage) {
        if (this.featureChecker.isEnabled(WebViewErrorLogEnabled.INSTANCE)) {
            String message = consoleMessage != null ? consoleMessage.message() : null;
            if ((consoleMessage != null ? consoleMessage.messageLevel() : null) != ConsoleMessage.MessageLevel.ERROR || containsKeys(message, getKeys())) {
                return;
            }
            this.logger.c("webview_error", generateFields$default(this, consoleMessage.sourceId(), null, message, 2, null), Boolean.FALSE);
        }
    }
}
