package com.sofascore.results.team.trophy;

import android.os.Bundle;
import defpackage.duf;
import defpackage.l4j;
import defpackage.otk;
import defpackage.tc3;
import defpackage.x3j;
import defpackage.y3j;
import defpackage.zb3;
import kotlin.Metadata;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/sofascore/results/team/trophy/TeamTrophyCompareActivity;", "Lcom/sofascore/results/mvvm/base/AbstractActivity;", "<init>", "()V", "mobile_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class TeamTrophyCompareActivity extends Hilt_TeamTrophyCompareActivity {
    public static final /* synthetic */ int M = 0;
    public final otk K = new otk(duf.a.getOrCreateKotlinClass(l4j.class), new y3j(this, 1), new y3j(this, 0), new y3j(this, 2));
    public final String L = "CompareTrophiesTab";

    @Override // com.sofascore.results.base.BaseActivity
    /* renamed from: C, reason: from getter */
    public final String getG() {
        return this.L;
    }

    @Override // com.sofascore.results.mvvm.base.AbstractActivity, com.sofascore.results.base.BaseActivity, com.sofascore.results.base.Hilt_BaseActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.x.b = "team";
        zb3.a(this, new tc3(-406918443, new x3j(this, 0), true));
    }

    @Override // com.sofascore.results.base.BaseActivity
    public final String u() {
        return "CompareTrophiesScreen";
    }

    @Override // com.sofascore.results.base.BaseActivity
    /* renamed from: v */
    public final boolean getL() {
        return false;
    }

    @Override // com.sofascore.results.mvvm.base.AbstractActivity
    public final void N() {
    }
}
