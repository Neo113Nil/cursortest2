package com.zoho.livechat.android.ui.activities;

import Yf.c;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.appcompat.widget.Toolbar;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.graphics.e;
import androidx.core.view.AbstractC2109r0;
import androidx.core.view.F0;
import androidx.core.view.h1;
import com.zoho.livechat.android.utils.LiveChatUtil;
import com.zoho.livechat.android.utils.P;
import m.AbstractC5479a;
import od.AbstractC5886l;
import od.o;
import od.r;
import og.i;
import og.k;
import og.q;
import se.C6363a;

/* loaded from: classes4.dex */
public class ArticlesActivity extends c {

    /* renamed from: g, reason: collision with root package name */
    public AbstractC5479a f44274g;

    /* renamed from: h, reason: collision with root package name */
    public Toolbar f44275h;

    /* renamed from: i, reason: collision with root package name */
    public View f44276i;

    /* renamed from: j, reason: collision with root package name */
    public String f44277j;

    /* renamed from: k, reason: collision with root package name */
    public String f44278k = null;

    /* renamed from: l, reason: collision with root package name */
    public ConstraintLayout f44279l;

    /* renamed from: m, reason: collision with root package name */
    public FrameLayout f44280m;

    @Override // Yf.c
    public ViewGroup D() {
        return this.f44279l;
    }

    @Override // Yf.c
    public void E(F0 f02) {
        super.E(f02);
        boolean l10 = P.l(this);
        e c10 = q.c(f02);
        String j10 = P.j(this);
        this.f44279l.setPadding(c10.f19098a, 0, c10.f19100c, c10.f19101d);
        ViewGroup.LayoutParams layoutParams = this.f44275h.getLayoutParams();
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
            marginLayoutParams.topMargin = c10.f19099b;
            marginLayoutParams.setMarginStart(c10.f19098a);
        }
        this.f44275h.setLayoutParams(layoutParams);
        ViewGroup.LayoutParams layoutParams2 = this.f44276i.getLayoutParams();
        if (layoutParams2 instanceof ViewGroup.MarginLayoutParams) {
            ((ViewGroup.MarginLayoutParams) layoutParams2).topMargin = c10.f19099b + ((int) getResources().getDimension(o.f59942i)) + k.b(1);
        }
        this.f44276i.setLayoutParams(layoutParams2);
        ViewGroup.LayoutParams layoutParams3 = this.f44280m.getLayoutParams();
        if (layoutParams3 instanceof ViewGroup.MarginLayoutParams) {
            ((ViewGroup.MarginLayoutParams) layoutParams3).topMargin = c10.f19099b + ((int) getResources().getDimension(o.f59942i)) + k.b(1);
        }
        this.f44280m.setLayoutParams(layoutParams3);
        if (getWindow() != null) {
            h1 a10 = AbstractC2109r0.a(getWindow(), getWindow().getDecorView());
            a10.e("LIGHT".equalsIgnoreCase(j10));
            a10.d(!l10);
        }
    }

    public Toolbar getToolbar() {
        return this.f44275h;
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        super.onBackPressed();
        String str = this.f44278k;
        if (str == null || !str.equalsIgnoreCase("SINGLETASK")) {
            return;
        }
        LiveChatUtil.triggerSalesIQListener("SUPPORT_CLOSE", null, null);
    }

    @Override // Yf.c, androidx.fragment.app.AbstractActivityC2168s, androidx.activity.ComponentActivity, androidx.core.app.g, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(r.f60786h);
        this.f44279l = (ConstraintLayout) findViewById(od.q.f60259G);
        this.f44280m = (FrameLayout) findViewById(od.q.f60627q0);
        this.f44275h = (Toolbar) findViewById(od.q.f60687w0);
        this.f44276i = findViewById(od.q.f60248E8);
        A();
        setSupportActionBar(this.f44275h);
        this.f44275h.setContentInsetStartWithNavigation(0);
        AbstractC5479a supportActionBar = getSupportActionBar();
        this.f44274g = supportActionBar;
        if (supportActionBar != null) {
            supportActionBar.u(true);
            this.f44274g.y(true);
            this.f44274g.t(true);
            this.f44274g.D(null);
            this.f44274g.B(null);
            LiveChatUtil.applyFontForToolbarTitle(this.f44275h);
        }
        getWindow().setStatusBarColor(P.e(this, AbstractC5886l.f59801a3));
        Bundle extras = getIntent().getExtras();
        if (extras != null) {
            this.f44277j = extras.getString("article_url");
            this.f44278k = extras.getString("mode", null);
        }
        String str = this.f44278k;
        if (str != null && str.equalsIgnoreCase("SINGLETASK")) {
            LiveChatUtil.triggerSalesIQListener("SUPPORT_OPEN", null, null);
        }
        if (i.f(this.f44277j)) {
            C6363a.b(this, this.f44277j);
            finish();
        } else {
            bg.c cVar = new bg.c();
            cVar.setArguments(extras);
            getSupportFragmentManager().s().p(od.q.f60627q0, cVar, bg.c.class.getName()).i();
        }
    }

    @Override // android.app.Activity
    public boolean onOptionsItemSelected(MenuItem menuItem) {
        if (menuItem.getItemId() == 16908332) {
            onBackPressed();
        }
        return super.onOptionsItemSelected(menuItem);
    }
}
