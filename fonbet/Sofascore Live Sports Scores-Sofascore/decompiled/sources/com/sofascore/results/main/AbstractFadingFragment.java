package com.sofascore.results.main;

import android.view.View;
import com.sofascore.results.mvvm.base.AbstractFragment;
import defpackage.duf;
import defpackage.fuf;
import defpackage.in6;
import defpackage.j3;
import defpackage.krk;
import defpackage.otk;
import defpackage.tgj;
import defpackage.zqb;
import kotlin.Metadata;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b'\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\b\u0012\u0004\u0012\u00028\u00000\u0003B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/sofascore/results/main/AbstractFadingFragment;", "Lkrk;", "VB", "Lcom/sofascore/results/mvvm/base/AbstractFragment;", "<init>", "()V", "mobile_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes6.dex */
public abstract class AbstractFadingFragment<VB extends krk> extends AbstractFragment<VB> {
    public final otk m;
    public final otk n;

    public AbstractFadingFragment() {
        fuf fufVar = duf.a;
        this.m = new otk(fufVar.getOrCreateKotlinClass(in6.class), new j3(this, 0), new j3(this, 2), new j3(this, 1));
        this.n = new otk(fufVar.getOrCreateKotlinClass(zqb.class), new j3(this, 3), new j3(this, 5), new j3(this, 4));
    }

    public final zqb A() {
        return (zqb) this.n.getValue();
    }

    @Override // com.sofascore.results.mvvm.base.AbstractFragment, androidx.fragment.app.Fragment
    public void onPause() {
        super.onPause();
        View view = getView();
        if (view != null) {
            view.clearAnimation();
        }
    }

    @Override // com.sofascore.results.mvvm.base.AbstractFragment, androidx.fragment.app.Fragment
    public void onResume() {
        View view;
        super.onResume();
        otk otkVar = this.m;
        if (((in6) otkVar.getValue()).c && (view = getView()) != null) {
            tgj.p(view, 200L, 2);
        }
        ((in6) otkVar.getValue()).c = true;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onStop() {
        super.onStop();
        ((in6) this.m.getValue()).c = false;
    }
}
