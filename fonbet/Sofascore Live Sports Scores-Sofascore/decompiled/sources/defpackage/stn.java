package defpackage;

import android.content.DialogInterface;
import android.webkit.JsResult;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class stn implements DialogInterface.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ JsResult b;

    public /* synthetic */ stn(JsResult jsResult, int i) {
        this.a = i;
        this.b = jsResult;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        switch (this.a) {
            case 0:
                this.b.cancel();
                break;
            default:
                this.b.confirm();
                break;
        }
    }
}
