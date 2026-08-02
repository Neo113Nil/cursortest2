package c;

import Ph.C1469p;
import Ph.InterfaceC1465n;
import ai.verisoul.sdk.helpers.webview.VerisoulSessionCallback;
import com.surt.guardian.utils.Logger;
import kotlin.Result;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class S implements VerisoulSessionCallback {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ InterfaceC1465n f26494a;

    public S(C1469p c1469p) {
        this.f26494a = c1469p;
    }

    @Override // ai.verisoul.sdk.helpers.webview.VerisoulSessionCallback
    public final void onFailure(Throwable error) {
        Intrinsics.checkNotNullParameter(error, "error");
        if (this.f26494a.isActive()) {
            Logger.f41582a.f("VerisoulModule", "Verisoul getSessionId failed: " + error.getMessage());
            this.f26494a.resumeWith(Result.m147constructorimpl(null));
        }
    }

    @Override // ai.verisoul.sdk.helpers.webview.VerisoulSessionCallback
    public final void onSuccess(String sessionId) {
        Intrinsics.checkNotNullParameter(sessionId, "sessionId");
        if (this.f26494a.isActive()) {
            Logger.f41582a.d("VerisoulModule", "Verisoul session ID obtained: " + sessionId);
            this.f26494a.resumeWith(Result.m147constructorimpl(sessionId));
        }
    }
}
