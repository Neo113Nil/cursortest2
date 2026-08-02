package defpackage;

import android.view.View;
import android.view.autofill.AutofillManager;
import android.webkit.SafeBrowsingResponse;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public abstract class u90 {
    public static void a(View view, AutofillManager autofillManager, int i, boolean z) {
        autofillManager.notifyViewVisibilityChanged(view, i, z);
    }

    public static void b(SafeBrowsingResponse safeBrowsingResponse) {
        safeBrowsingResponse.showInterstitial(true);
    }
}
