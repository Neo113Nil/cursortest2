package com.sofascore.results.tv;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import com.sofascore.results.R;
import com.sofascore.results.mvvm.base.AbstractActivity;
import defpackage.aaf;
import defpackage.b1d;
import defpackage.beh;
import defpackage.bf;
import defpackage.d52;
import defpackage.duf;
import defpackage.e6b;
import defpackage.g2i;
import defpackage.g4k;
import defpackage.h4i;
import defpackage.h4k;
import defpackage.hkg;
import defpackage.ioe;
import defpackage.mqi;
import defpackage.otk;
import defpackage.qv5;
import defpackage.rq3;
import defpackage.w1i;
import defpackage.wca;
import defpackage.wri;
import defpackage.xw3;
import defpackage.ypa;
import java.util.Calendar;
import java.util.LinkedHashMap;
import kotlin.Metadata;
import kotlin.reflect.KClass;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/sofascore/results/tv/TVScheduleActivity;", "Lcom/sofascore/results/mvvm/base/AbstractActivity;", "<init>", "()V", "mobile_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class TVScheduleActivity extends Hilt_TVScheduleActivity {
    public static final /* synthetic */ int O = 0;
    public final otk K = new otk(duf.a.getOrCreateKotlinClass(g4k.class), new wri(this, 1), new wri(this, 0), new wri(this, 2));
    public final mqi L = ypa.b(new w1i(this, 6));
    public Calendar M;
    public View N;

    public final bf Q() {
        return (bf) this.L.getValue();
    }

    public final void R() {
        View view = this.N;
        if (view == null) {
            view = Q().d.inflate();
            this.N = view;
        }
        if (view != null) {
            view.setVisibility(0);
        }
    }

    @Override // com.sofascore.results.mvvm.base.AbstractActivity, com.sofascore.results.base.BaseActivity, com.sofascore.results.base.Hilt_BaseActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(Q().a);
        this.o = Q().e;
        AbstractActivity.M(this, Q().g, getString(R.string.tv_schedule), null, null, 60);
        AbstractActivity.O(Q().f, Integer.valueOf(hkg.X(this)), getColor(R.color.on_color_primary));
        I(Q().b, null);
        e6b e6bVar = e6b.a;
        LinkedHashMap linkedHashMap = qv5.b;
        KClass orCreateKotlinClass = duf.a.getOrCreateKotlinClass(d52.class);
        Object obj = linkedHashMap.get(orCreateKotlinClass);
        if (obj == null) {
            obj = beh.b(0, 0, null, 7);
            linkedHashMap.put(orCreateKotlinClass, obj);
        }
        xw3.L(wca.x(getLifecycle()), null, null, new h4i(this, (b1d) obj, (rq3) null, this), 3);
        h4k h4kVar = new h4k(this, Q().i, Q().f);
        Q().i.setAdapter(h4kVar);
        R();
        otk otkVar = this.K;
        ((g4k) otkVar.getValue()).k.e(this, new ioe(19, new aaf(28, this, h4kVar)));
        ((g4k) otkVar.getValue()).j.e(this, new ioe(19, new g2i(this, 15)));
    }

    @Override // android.app.Activity
    public final boolean onCreateOptionsMenu(Menu menu) {
        menu.getClass();
        getMenuInflater().inflate(R.menu.tv_schedule_menu, menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override // com.sofascore.results.base.BaseActivity, android.app.Activity
    public final boolean onOptionsItemSelected(MenuItem menuItem) {
        menuItem.getClass();
        if (menuItem.getItemId() != R.id.edit_tv_channels) {
            return super.onOptionsItemSelected(menuItem);
        }
        startActivity(new Intent(this, (Class<?>) TVChannelEditorActivity.class));
        return true;
    }

    @Override // com.sofascore.results.base.BaseActivity
    public final String u() {
        return "TvScheduleScreen";
    }

    @Override // com.sofascore.results.mvvm.base.AbstractActivity
    public final void N() {
    }
}
