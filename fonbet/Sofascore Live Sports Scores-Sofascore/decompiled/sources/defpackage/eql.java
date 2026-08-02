package defpackage;

import com.google.android.gms.ads.AdListener;
import com.google.android.gms.ads.LoadAdError;
import com.google.android.gms.internal.ads.zzeem;
import java.util.Objects;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class eql extends AdListener {
    public final /* synthetic */ int a = 1;
    public final /* synthetic */ Object b;

    public eql(zzeem zzeemVar) {
        Objects.requireNonNull(zzeemVar);
        this.b = zzeemVar;
    }

    @Override // com.google.android.gms.ads.AdListener
    public final void onAdFailedToLoad(LoadAdError loadAdError) {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                loadAdError.getClass();
                String loadAdError2 = loadAdError.toString();
                loadAdError2.getClass();
                ((Function1) obj).invoke(loadAdError2);
                break;
            default:
                ((zzeem) obj).F4(zzeem.I4(loadAdError));
                break;
        }
    }

    public eql(Function1 function1) {
        this.b = function1;
    }
}
