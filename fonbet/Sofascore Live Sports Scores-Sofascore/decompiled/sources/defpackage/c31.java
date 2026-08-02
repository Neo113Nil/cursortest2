package defpackage;

import android.content.SharedPreferences;
import com.unity3d.services.UnityAdsConstants;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.text.MatchResult;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final /* synthetic */ class c31 implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ boolean b;

    public /* synthetic */ c31(boolean z, int i) {
        this.a = i;
        this.b = z;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i;
        int i2 = this.a;
        int i3 = 6;
        float f = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        boolean z = this.b;
        switch (i2) {
            case 0:
                ((r60) obj).getClass();
                if (!z) {
                    break;
                } else {
                    break;
                }
            case 1:
                f4g f4gVar = (f4g) obj;
                f4gVar.getClass();
                f4gVar.b(z ? 1.0f : 0.0f);
                break;
            case 2:
                f4g f4gVar2 = (f4g) obj;
                f4gVar2.getClass();
                f4gVar2.b(z ? 1.0f : 0.0f);
                break;
            case 3:
                ww5 ww5Var = (ww5) obj;
                ww5Var.getClass();
                break;
            case 4:
                f06 f06Var = (f06) obj;
                f06Var.getClass();
                break;
            case 5:
                m46 m46Var = (m46) obj;
                m46Var.getClass();
                break;
            case 6:
                f4g f4gVar3 = (f4g) obj;
                f4gVar3.getClass();
                f4gVar3.s(uaa.h(z ? 0.0f : 1.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT));
                f4gVar3.i(z ? -45.0f : 45.0f);
                break;
            case 7:
                break;
            case 8:
                ((r60) obj).getClass();
                i = z ? -1 : 1;
                break;
            case 9:
                ((r60) obj).getClass();
                i = z ? -1 : 1;
                break;
            case 10:
                ytf ytfVar = (ytf) obj;
                ytfVar.getClass();
                break;
            case 11:
                ytf ytfVar2 = (ytf) obj;
                ytfVar2.getClass();
                break;
            case 12:
                MatchResult matchResult = (MatchResult) obj;
                matchResult.getClass();
                break;
            case 13:
                SharedPreferences.Editor editor = (SharedPreferences.Editor) obj;
                editor.getClass();
                editor.putLong(z ? "survey" : "PREF_SURVEY_START_TIME", (System.currentTimeMillis() / 1000) + 86400);
                break;
            case 14:
                te2 te2Var = (te2) obj;
                te2Var.getClass();
                boolean z2 = z == (te2Var.a.getLayoutDirection() == ema.a);
                b20 a = e20.a();
                a.g(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
                a.f(Float.intBitsToFloat((int) (te2Var.a.n() >> 32)), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
                if (!z2) {
                    f = Float.intBitsToFloat((int) (te2Var.a.n() >> 32));
                }
                a.f(f, Float.intBitsToFloat((int) (te2Var.a.n() & 4294967295L)));
                a.d();
                break;
            case 15:
                efm efmVar = (efm) obj;
                efmVar.getClass();
                efmVar.o(z);
                break;
            case 16:
                efm efmVar2 = (efm) obj;
                efmVar2.getClass();
                efmVar2.o(z);
                break;
            case 17:
                e0n e0nVar = (e0n) obj;
                e0nVar.getClass();
                e0nVar.k(z);
                break;
            default:
                e0n e0nVar2 = (e0n) obj;
                e0nVar2.getClass();
                e0nVar2.k(z);
                break;
        }
        return Unit.a;
    }
}
