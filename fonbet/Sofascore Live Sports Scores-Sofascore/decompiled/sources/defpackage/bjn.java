package defpackage;

import android.app.Activity;
import android.os.Bundle;
import java.util.Map;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class bjn extends t01 {
    public final /* synthetic */ Activity c;
    public final /* synthetic */ String d;
    public final /* synthetic */ String e;
    public final /* synthetic */ Map f;
    public final /* synthetic */ pqg g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bjn(pqg pqgVar, eg9 eg9Var, Activity activity, String str, String str2, Map map) {
        super(eg9Var, 13);
        this.c = activity;
        this.d = str;
        this.e = str2;
        this.f = map;
        this.g = pqgVar;
    }

    @Override // defpackage.eg9
    public final void onAffordanceEnded() {
        throw new UnsupportedOperationException("HPOA service should not be called in service based HSDP.");
    }

    @Override // defpackage.eg9
    public final void onAffordanceStarted() {
        throw new UnsupportedOperationException("HPOA service should not be called in service based HSDP.");
    }

    @Override // defpackage.eg9
    public final void onDeepLinkStarted() {
        throw new UnsupportedOperationException("HSDP Activity should not be started in service based HSDP.");
    }

    @Override // defpackage.t01, defpackage.eg9
    public final void onDismissed(Bundle bundle) {
        this.c.runOnUiThread(new lin(this, 1));
        super.onDismissed(bundle);
    }

    @Override // defpackage.t01, defpackage.eg9
    public final void onError(Bundle bundle) {
        Activity activity = this.c;
        activity.runOnUiThread(new g3g(this, activity, this.d, this.e, this.f, 1, false));
        super.onError(bundle);
    }

    @Override // defpackage.t01, defpackage.eg9
    public final void onShown(Bundle bundle) {
        this.c.runOnUiThread(new lin(this, 0));
        super.onShown(bundle);
    }
}
