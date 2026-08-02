package com.sofascore.results.player.statistics.compare;

import android.content.Intent;
import android.os.Bundle;
import defpackage.duf;
import defpackage.e73;
import defpackage.g7a;
import defpackage.og5;
import defpackage.otk;
import defpackage.oxg;
import defpackage.pyg;
import defpackage.qqi;
import defpackage.qxg;
import defpackage.rfi;
import defpackage.tc3;
import defpackage.zb3;
import defpackage.zzl;
import kotlin.Metadata;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/sofascore/results/player/statistics/compare/SeasonComparisonActivity;", "Lcom/sofascore/results/mvvm/base/AbstractActivity;", "<init>", "()V", "pxg", "mobile_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class SeasonComparisonActivity extends Hilt_SeasonComparisonActivity {
    public static final /* synthetic */ int L = 0;
    public final otk K = new otk(duf.a.getOrCreateKotlinClass(pyg.class), new qxg(this, 1), new qxg(this, 0), new qxg(this, 2));

    @Override // com.sofascore.results.base.BaseActivity
    /* renamed from: C */
    public final String getG() {
        Intent intent = getIntent();
        intent.getClass();
        e73 e73Var = (e73) g7a.y(intent, "ENTITY_TYPE", e73.class);
        if (e73Var == null) {
            e73Var = e73.a;
        }
        int ordinal = e73Var.ordinal();
        if (ordinal == 0) {
            return "ComparePlayersTab";
        }
        if (ordinal == 1) {
            return "CompareTeamsTab";
        }
        zzl.b();
        return null;
    }

    @Override // com.sofascore.results.mvvm.base.AbstractActivity, com.sofascore.results.base.BaseActivity, com.sofascore.results.base.Hilt_BaseActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        og5.b(this, new qqi(0, 0, 2, new rfi(11)), null, 2);
        this.x.b = getIntent().getStringExtra("ANALYTICS_TYPE");
        zb3.a(this, new tc3(527949571, new oxg(this, 0), true));
    }

    @Override // com.sofascore.results.base.BaseActivity
    public final String u() {
        Intent intent = getIntent();
        intent.getClass();
        e73 e73Var = (e73) g7a.y(intent, "ENTITY_TYPE", e73.class);
        if (e73Var == null) {
            e73Var = e73.a;
        }
        int ordinal = e73Var.ordinal();
        if (ordinal == 0) {
            return "ComparePlayersScreen";
        }
        if (ordinal == 1) {
            return "CompareTeamsScreen";
        }
        zzl.b();
        return null;
    }

    @Override // com.sofascore.results.mvvm.base.AbstractActivity
    public final void N() {
    }
}
