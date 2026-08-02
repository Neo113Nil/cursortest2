package ru.ozon.app.android.web.webview.ai;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.h;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001:\u0001\u0007J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\b"}, d2 = {"Lru/ozon/app/android/web/webview/ai/CheckAiConversation;", "", "", "link", "", "check", "(Ljava/lang/String;)Z", "Default", "web_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public interface CheckAiConversation {

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0016¨\u0006\b"}, d2 = {"Lru/ozon/app/android/web/webview/ai/CheckAiConversation$Default;", "Lru/ozon/app/android/web/webview/ai/CheckAiConversation;", "<init>", "()V", "check", "", "link", "", "web_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Default implements CheckAiConversation {
        @Override // ru.ozon.app.android.web.webview.ai.CheckAiConversation
        public boolean check(@NotNull String link) {
            Intrinsics.checkNotNullParameter(link, "link");
            return h.t(link, "aiConversation", false);
        }
    }

    boolean check(@NotNull String link);
}
