package defpackage;

import android.view.View;
import android.view.ViewStub;
import android.widget.LinearLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.sofascore.results.ads.iml.banner.AdBannerView;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class ye implements krk {
    public final LinearLayout a;
    public final AdBannerView b;
    public final ViewStub c;
    public final RecyclerView d;

    public ye(LinearLayout linearLayout, AdBannerView adBannerView, ViewStub viewStub, RecyclerView recyclerView) {
        this.a = linearLayout;
        this.b = adBannerView;
        this.c = viewStub;
        this.d = recyclerView;
    }

    @Override // defpackage.krk
    public final View getRoot() {
        return this.a;
    }
}
