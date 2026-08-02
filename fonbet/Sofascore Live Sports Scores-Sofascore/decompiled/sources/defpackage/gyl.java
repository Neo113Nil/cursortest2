package defpackage;

import android.content.DialogInterface;
import android.webkit.JsResult;
import com.inmobi.media.C3320bi;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes4.dex */
public final /* synthetic */ class gyl implements DialogInterface.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ JsResult b;

    public /* synthetic */ gyl(JsResult jsResult, int i) {
        this.a = i;
        this.b = jsResult;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        int i2 = this.a;
        JsResult jsResult = this.b;
        switch (i2) {
            case 0:
                C3320bi.a(jsResult, dialogInterface, i);
                break;
            case 1:
                C3320bi.b(jsResult, dialogInterface, i);
                break;
            default:
                C3320bi.c(jsResult, dialogInterface, i);
                break;
        }
    }
}
