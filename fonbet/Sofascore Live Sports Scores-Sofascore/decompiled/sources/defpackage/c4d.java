package defpackage;

import android.content.Context;
import com.google.android.gms.ads.AdValue;
import com.google.android.gms.ads.OnPaidEventListener;
import com.sofascore.model.firebase.AdType;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class c4d implements OnPaidEventListener {
    public final /* synthetic */ Context a;
    public final /* synthetic */ String b;
    public final /* synthetic */ AdType.Native c;
    public final /* synthetic */ String d;
    public final /* synthetic */ int e;

    public c4d(Context context, String str, AdType.Native r3, String str2, int i) {
        this.a = context;
        this.b = str;
        this.c = r3;
        this.d = str2;
        this.e = i;
    }

    @Override // com.google.android.gms.ads.OnPaidEventListener
    public final void onPaidEvent(AdValue adValue) {
        adValue.getClass();
        nv.m(this.a, this.b, this.c, ru.GOOGLE, this.d, adValue, Integer.valueOf(this.e));
    }
}
