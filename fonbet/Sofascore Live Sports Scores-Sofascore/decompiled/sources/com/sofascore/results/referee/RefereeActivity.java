package com.sofascore.results.referee;

import android.app.assist.AssistContent;
import android.net.Uri;
import android.os.Bundle;
import com.sofascore.model.mvvm.model.Referee;
import com.sofascore.model.mvvm.model.RefereeDetailsHeadFlags;
import com.sofascore.results.R;
import defpackage.anc;
import defpackage.chf;
import defpackage.duf;
import defpackage.eqb;
import defpackage.ftf;
import defpackage.hsf;
import defpackage.imf;
import defpackage.isf;
import defpackage.jsf;
import defpackage.mqi;
import defpackage.otk;
import defpackage.u8f;
import defpackage.un0;
import defpackage.v2g;
import defpackage.x2g;
import defpackage.xw3;
import defpackage.yaa;
import defpackage.ypa;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/sofascore/results/referee/RefereeActivity;", "Lcom/sofascore/results/mvvm/base/CollapsibleToolbarActivity;", "<init>", "()V", "mobile_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class RefereeActivity extends Hilt_RefereeActivity {
    public static final /* synthetic */ int R = 0;
    public boolean P;
    public final mqi M = ypa.b(new hsf(this, 0));
    public final otk N = new otk(duf.a.getOrCreateKotlinClass(jsf.class), new isf(this, 1), new isf(this, 0), new isf(this, 2));
    public final mqi O = ypa.b(new hsf(this, 1));
    public Function0 Q = new hsf(this, 2);

    @Override // com.sofascore.results.mvvm.base.AbstractActivity
    public final void N() {
        jsf jsfVar = (jsf) this.N.getValue();
        xw3.L(un0.z(jsfVar), null, null, new anc(jsfVar, ((Number) this.M.getValue()).intValue(), null, 8), 3);
    }

    @Override // com.sofascore.results.mvvm.base.CollapsibleToolbarActivity, com.sofascore.results.mvvm.base.AbstractActivity, com.sofascore.results.base.BaseActivity, com.sofascore.results.base.Hilt_BaseActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Q().k.setAdapter((ftf) this.O.getValue());
        this.x.a = Integer.valueOf(((Number) this.M.getValue()).intValue());
        Q().h.setSelectedTabIndicatorColor(getColor(R.color.on_color_primary));
        this.o = Q().g;
        Q().l.setOnChildScrollUpCallback(new u8f(3));
        Q().l.setOnRefreshListener(new imf(this, 1));
        ((jsf) this.N.getValue()).i.e(this, new eqb(19, new chf(1, this, RefereeActivity.class, "onHeadersResponseReceived", "onHeadersResponseReceived(Lcom/sofascore/network/Result;)V", 0, 2)));
    }

    @Override // android.app.Activity
    public final void onProvideAssistContent(AssistContent assistContent) {
        RefereeDetailsHeadFlags refereeDetailsHeadFlags;
        Referee referee;
        assistContent.getClass();
        super.onProvideAssistContent(assistContent);
        x2g x2gVar = (x2g) ((jsf) this.N.getValue()).i.d();
        if (x2gVar != null) {
            if (!(x2gVar instanceof v2g)) {
                x2gVar = null;
            }
            if (x2gVar == null || (refereeDetailsHeadFlags = (RefereeDetailsHeadFlags) yaa.x(x2gVar)) == null || (referee = refereeDetailsHeadFlags.getReferee()) == null) {
                return;
            }
            assistContent.setWebUri(Uri.parse(String.format("%s%s%s", Arrays.copyOf(new Object[]{getString(R.string.share_link), referee.getWebUrl(), ""}, 3))));
        }
    }

    @Override // com.sofascore.results.base.BaseActivity
    public final String u() {
        return "RefereeScreen";
    }
}
