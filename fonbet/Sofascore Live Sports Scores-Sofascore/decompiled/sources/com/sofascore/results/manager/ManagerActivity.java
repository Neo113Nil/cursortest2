package com.sofascore.results.manager;

import android.app.assist.AssistContent;
import android.net.Uri;
import android.os.Bundle;
import com.sofascore.model.mvvm.model.Manager;
import com.sofascore.model.mvvm.model.ManagerData;
import com.sofascore.model.mvvm.model.ManagerHeadFlags;
import com.sofascore.results.R;
import defpackage.bsb;
import defpackage.csb;
import defpackage.ctb;
import defpackage.duf;
import defpackage.eqb;
import defpackage.esb;
import defpackage.kr9;
import defpackage.mj5;
import defpackage.mqi;
import defpackage.mz1;
import defpackage.otk;
import defpackage.rq3;
import defpackage.u8f;
import defpackage.un0;
import defpackage.v2g;
import defpackage.v9b;
import defpackage.x2g;
import defpackage.xw3;
import defpackage.yaa;
import defpackage.ypa;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/sofascore/results/manager/ManagerActivity;", "Lcom/sofascore/results/mvvm/base/CollapsibleToolbarActivity;", "<init>", "()V", "bea", "mobile_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class ManagerActivity extends Hilt_ManagerActivity {
    public static final /* synthetic */ int R = 0;
    public final mqi M;
    public final otk N;
    public final mqi O;
    public Function0 P;
    public boolean Q;

    public ManagerActivity() {
        int i = 0;
        this.M = ypa.b(new bsb(this, i));
        int i2 = 1;
        int i3 = 2;
        this.N = new otk(duf.a.getOrCreateKotlinClass(esb.class), new csb(this, i2), new csb(this, i), new csb(this, i3));
        this.O = ypa.b(new bsb(this, i2));
        this.P = new bsb(this, i3);
    }

    @Override // com.sofascore.results.mvvm.base.AbstractActivity
    public final void N() {
        esb esbVar = (esb) this.N.getValue();
        xw3.L(un0.z(esbVar), null, null, new mj5(esbVar, X(), (rq3) null, 6), 3);
    }

    public final int X() {
        return ((Number) this.M.getValue()).intValue();
    }

    @Override // com.sofascore.results.mvvm.base.CollapsibleToolbarActivity, com.sofascore.results.mvvm.base.AbstractActivity, com.sofascore.results.base.BaseActivity, com.sofascore.results.base.Hilt_BaseActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Q().k.setAdapter((ctb) this.O.getValue());
        this.x.a = Integer.valueOf(X());
        Q().h.setSelectedTabIndicatorColor(getColor(R.color.on_color_primary));
        this.o = Q().g;
        Q().l.setOnChildScrollUpCallback(new u8f(3));
        Q().l.setOnRefreshListener(new kr9(this, 6));
        int i = 1;
        ((esb) this.N.getValue()).g.e(this, new eqb(i, new v9b(i, this, ManagerActivity.class, "onHeadersResponseReceived", "onHeadersResponseReceived(Lcom/sofascore/network/Result;)V", 0, 10)));
    }

    @Override // android.app.Activity
    public final void onProvideAssistContent(AssistContent assistContent) {
        ManagerHeadFlags managerHeadFlags;
        ManagerData manager;
        Manager manager2;
        assistContent.getClass();
        super.onProvideAssistContent(assistContent);
        x2g x2gVar = (x2g) ((esb) this.N.getValue()).g.d();
        if (x2gVar != null) {
            if (!(x2gVar instanceof v2g)) {
                x2gVar = null;
            }
            if (x2gVar == null || (managerHeadFlags = (ManagerHeadFlags) yaa.x(x2gVar)) == null || (manager = managerHeadFlags.getManager()) == null || (manager2 = manager.getManager()) == null) {
                return;
            }
            assistContent.setWebUri(Uri.parse(String.format("%s%s%s", Arrays.copyOf(new Object[]{getString(R.string.share_link), manager2.getWebUrl(), ""}, 3))));
        }
    }

    @Override // com.sofascore.results.base.BaseActivity
    public final String u() {
        return "ManagerScreen";
    }

    @Override // com.sofascore.results.base.BaseActivity
    public final String y() {
        return mz1.j(X(), super.y(), " id:");
    }
}
