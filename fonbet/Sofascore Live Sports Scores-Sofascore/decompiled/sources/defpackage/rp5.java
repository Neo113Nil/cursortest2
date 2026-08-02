package defpackage;

import androidx.fragment.app.FragmentActivity;
import com.google.android.gms.ads.ResponseInfo;
import com.sofascore.model.firebase.AdType;
import kotlin.Unit;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class rp5 implements zrh {
    public final beg a;
    public final String b;
    public final String c;
    public final AdType.Interstitial d;

    public rp5(beg begVar, String str, String str2, AdType.Interstitial interstitial) {
        begVar.getClass();
        str.getClass();
        str2.getClass();
        interstitial.getClass();
        this.a = begVar;
        this.b = str;
        this.c = str2;
        this.d = interstitial;
        ru ruVar = ru.GOOGLE;
    }

    @Override // defpackage.zrh
    public final boolean a() {
        return this.a.a() == sbg.c;
    }

    @Override // defpackage.zrh
    public final String b() {
        return this.c;
    }

    @Override // defpackage.zrh
    public final boolean c(String str, String str2) {
        str.getClass();
        str2.getClass();
        return false;
    }

    @Override // defpackage.zrh
    public final wcd d() {
        return null;
    }

    @Override // defpackage.zrh
    public final ResponseInfo e() {
        return null;
    }

    @Override // defpackage.zrh
    public final void f(FragmentActivity fragmentActivity) {
        nv.g(fragmentActivity, this.c, this.d, ru.EQUATIV, this.b);
        beg begVar = this.a;
        if (ydg.a[begVar.a().ordinal()] != 3) {
            begVar.c(new hdg(gdg.h, "There is no interstitial ad available."));
            return;
        }
        try {
            wdg wdgVar = begVar.d;
            if (wdgVar != null) {
                wdgVar.show();
                Unit unit = Unit.a;
            }
        } catch (Exception e) {
            begVar.c(e);
            Unit unit2 = Unit.a;
        }
    }

    @Override // defpackage.zrh
    public final void g(f9a f9aVar) {
        this.a.i = new np5(f9aVar);
    }

    @Override // defpackage.zrh
    public final AdType.Interstitial getAdType() {
        return this.d;
    }

    @Override // defpackage.zrh
    public final String getPosition() {
        return this.b;
    }

    @Override // defpackage.zrh
    public final ru getProvider() {
        return ru.EQUATIV;
    }

    @Override // defpackage.zrh
    public final void release() {
        beg begVar = this.a;
        if (begVar.a() != sbg.d) {
            begVar.i = null;
            begVar.getClass();
        }
    }
}
