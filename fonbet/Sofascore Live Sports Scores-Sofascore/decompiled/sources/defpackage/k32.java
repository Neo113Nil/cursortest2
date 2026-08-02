package defpackage;

import android.view.View;
import com.sofascore.model.branding.BrandLocation;
import com.sofascore.model.branding.BrandType;
import com.sofascore.results.view.branding.BrandingHeaderView;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class k32 implements View.OnAttachStateChangeListener {
    public final /* synthetic */ BrandingHeaderView a;
    public final /* synthetic */ BrandingHeaderView b;
    public final /* synthetic */ Integer c;
    public final /* synthetic */ BrandLocation d;
    public final /* synthetic */ String e;
    public final /* synthetic */ BrandType f;

    public k32(BrandingHeaderView brandingHeaderView, BrandingHeaderView brandingHeaderView2, Integer num, BrandLocation brandLocation, String str, BrandType brandType) {
        this.a = brandingHeaderView;
        this.b = brandingHeaderView2;
        this.c = num;
        this.d = brandLocation;
        this.e = str;
        this.f = brandType;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        view.getClass();
        this.a.removeOnAttachStateChangeListener(this);
        BrandingHeaderView brandingHeaderView = this.b;
        g6b t = qea.t(brandingHeaderView);
        if (t != null) {
            zsk zskVar = new zsk(t, 30);
            zskVar.b(brandingHeaderView, new b32(brandingHeaderView, this.c, this.d, this.e, this.f, 2), null);
            brandingHeaderView.a = zskVar;
        }
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        view.getClass();
    }
}
