package com.sofascore.results.mvvm.base;

import android.os.Bundle;
import android.view.View;
import androidx.compose.ui.platform.ComposeView;
import defpackage.a99;
import defpackage.krk;
import defpackage.tc3;
import defpackage.x2;
import defpackage.yrh;
import kotlin.Metadata;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b'\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/sofascore/results/mvvm/base/AbstractComposeFragment;", "Lcom/sofascore/results/mvvm/base/AbstractFragment;", "Lyrh;", "<init>", "()V", "mobile_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes6.dex */
public abstract class AbstractComposeFragment extends AbstractFragment<yrh> {
    /* renamed from: A */
    public abstract tc3 getS();

    @Override // com.sofascore.results.mvvm.base.AbstractFragment
    public final krk k() {
        return yrh.a(getLayoutInflater(), null);
    }

    @Override // com.sofascore.results.mvvm.base.AbstractFragment
    public void s(View view, Bundle bundle) {
        view.getClass();
        krk krkVar = this.l;
        krkVar.getClass();
        ComposeView composeView = ((yrh) krkVar).b;
        composeView.setViewCompositionStrategy(a99.i);
        composeView.setContent(new tc3(-1529726496, new x2(this, 0), true));
    }

    @Override // com.sofascore.results.mvvm.base.AbstractFragment
    public void u() {
    }
}
