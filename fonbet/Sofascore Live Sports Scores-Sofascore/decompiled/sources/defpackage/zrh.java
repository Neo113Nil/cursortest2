package defpackage;

import androidx.fragment.app.FragmentActivity;
import com.google.android.gms.ads.ResponseInfo;
import com.sofascore.model.firebase.AdType;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public interface zrh {
    boolean a();

    String b();

    boolean c(String str, String str2);

    wcd d();

    ResponseInfo e();

    void f(FragmentActivity fragmentActivity);

    void g(f9a f9aVar);

    AdType.Interstitial getAdType();

    String getPosition();

    ru getProvider();

    void release();
}
