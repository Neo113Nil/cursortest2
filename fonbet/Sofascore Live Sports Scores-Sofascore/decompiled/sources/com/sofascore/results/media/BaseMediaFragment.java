package com.sofascore.results.media;

import android.os.Bundle;
import android.view.View;
import com.sofascore.model.mvvm.IRecent;
import com.sofascore.results.mvvm.base.AbstractComposeFragment;
import defpackage.t21;
import defpackage.tc3;
import defpackage.tee;
import defpackage.w41;
import kotlin.Metadata;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b'\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\u00020\u0003B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/sofascore/results/media/BaseMediaFragment;", "Lcom/sofascore/model/mvvm/IRecent;", "T", "Lcom/sofascore/results/mvvm/base/AbstractComposeFragment;", "<init>", "()V", "mobile_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes6.dex */
public abstract class BaseMediaFragment<T extends IRecent> extends AbstractComposeFragment {
    @Override // com.sofascore.results.mvvm.base.AbstractComposeFragment
    /* renamed from: A */
    public final tc3 getS() {
        return new tc3(1732668357, new t21(this, 12), true);
    }

    public abstract tee B();

    /* renamed from: C */
    public abstract String getT();

    public abstract int D();

    public abstract w41 E();

    @Override // com.sofascore.results.mvvm.base.AbstractFragment
    public String p() {
        return "MediaTab";
    }

    @Override // com.sofascore.results.mvvm.base.AbstractComposeFragment, com.sofascore.results.mvvm.base.AbstractFragment
    public final void s(View view, Bundle bundle) {
        super.s(view, bundle);
        l();
    }
}
