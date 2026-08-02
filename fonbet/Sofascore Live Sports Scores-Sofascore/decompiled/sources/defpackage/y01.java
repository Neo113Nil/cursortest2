package defpackage;

import android.webkit.WebView;
import androidx.fragment.app.FragmentActivity;
import com.mbridge.msdk.playercommon.exoplayer2.extractor.ts.PsExtractor;
import com.sofascore.model.firebase.AdType;
import com.sofascore.results.R;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final /* synthetic */ class y01 implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ u11 b;
    public final /* synthetic */ AdType.Banner c;
    public final /* synthetic */ int d;

    public /* synthetic */ y01(u11 u11Var, AdType.Banner banner, int i, int i2) {
        this.a = i2;
        this.b = u11Var;
        this.c = banner;
        this.d = i;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.a;
        int i2 = this.d;
        u11 u11Var = this.b;
        switch (i) {
            case 0:
                u11Var.D = u11Var.C;
                u11Var.q = new y01(u11Var, this.c, i2, 3);
                WebView webView = u11Var.n;
                if (webView != null) {
                    u11Var.o(webView);
                }
                break;
            case 1:
                u11Var.E = 0;
                FragmentActivity fragmentActivity = u11Var.b;
                String str = u11Var.B;
                ru ruVar = ru.SOFASCORE;
                String q = u11.q(i2);
                qu quVar = qu.SHOW;
                WebView webView2 = u11Var.n;
                Object tag = webView2 != null ? webView2.getTag(R.id.affiliate_name_tag) : null;
                nv.j(fragmentActivity, str, this.c, ruVar, q, 1, "No fill", quVar, tag instanceof String ? (String) tag : null, null, 512);
                break;
            case 2:
                FragmentActivity fragmentActivity2 = u11Var.b;
                String str2 = u11Var.C;
                ru ruVar2 = ru.SOFASCORE;
                String q2 = u11.q(i2);
                WebView webView3 = u11Var.n;
                Object tag2 = webView3 != null ? webView3.getTag(R.id.affiliate_name_tag) : null;
                nv.i(fragmentActivity2, str2, this.c, ruVar2, q2, tag2 instanceof String ? (String) tag2 : null, null, 64);
                break;
            default:
                FragmentActivity fragmentActivity3 = u11Var.b;
                String str3 = u11Var.C;
                ru ruVar3 = ru.SOFASCORE;
                String q3 = u11.q(i2);
                WebView webView4 = u11Var.n;
                Object tag3 = webView4 != null ? webView4.getTag(R.id.affiliate_name_tag) : null;
                nv.l(fragmentActivity3, str3, this.c, ruVar3, q3, tag3 instanceof String ? (String) tag3 : null, null, PsExtractor.AUDIO_STREAM);
                break;
        }
        return Unit.a;
    }
}
