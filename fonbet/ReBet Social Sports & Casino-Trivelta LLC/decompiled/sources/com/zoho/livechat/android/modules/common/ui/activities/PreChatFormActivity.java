package com.zoho.livechat.android.modules.common.ui.activities;

import Yf.c;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.graphics.e;
import androidx.core.view.AbstractC2109r0;
import androidx.core.view.F0;
import androidx.core.view.h1;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.N;
import com.google.android.material.appbar.MaterialToolbar;
import com.zoho.livechat.android.modules.common.ui.activities.PreChatFormActivity;
import com.zoho.livechat.android.modules.conversations.ui.fragments.w;
import com.zoho.livechat.android.utils.LiveChatUtil;
import com.zoho.livechat.android.utils.P;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.RangesKt;
import kotlin.text.StringsKt;
import m.AbstractC5479a;
import od.AbstractC5886l;
import og.AbstractC5892d;
import og.q;
import ud.C6548b;

@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u0019\u0010\u000e\u001a\u00020\t2\b\u0010\r\u001a\u0004\u0018\u00010\fH\u0014¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0010\u001a\u00020\tH\u0016¢\u0006\u0004\b\u0010\u0010\u0003R\u0018\u0010\u0014\u001a\u0004\u0018\u00010\u00118\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0017\u001a\u00020\u00118BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u0016¨\u0006\u0018"}, d2 = {"Lcom/zoho/livechat/android/modules/common/ui/activities/PreChatFormActivity;", "LYf/c;", "<init>", "()V", "Landroid/view/ViewGroup;", "D", "()Landroid/view/ViewGroup;", "Landroidx/core/view/F0;", "insetsCompat", "", "E", "(Landroidx/core/view/F0;)V", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "(Landroid/os/Bundle;)V", "onBackPressed", "Lud/b;", "g", "Lud/b;", "_binding", "G", "()Lud/b;", "binding", "mobilisten_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nPreChatFormActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PreChatFormActivity.kt\ncom/zoho/livechat/android/modules/common/ui/activities/PreChatFormActivity\n+ 2 View.kt\nandroidx/core/view/ViewKt\n*L\n1#1,105:1\n326#2,4:106\n*S KotlinDebug\n*F\n+ 1 PreChatFormActivity.kt\ncom/zoho/livechat/android/modules/common/ui/activities/PreChatFormActivity\n*L\n41#1:106,4\n*E\n"})
/* loaded from: classes4.dex */
public final class PreChatFormActivity extends c {

    /* renamed from: g, reason: collision with root package name and from kotlin metadata */
    public C6548b _binding;

    public static final void H(PreChatFormActivity this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        if (this$0.getSupportFragmentManager().C0().isEmpty()) {
            this$0.finish();
        }
    }

    @Override // Yf.c
    public ViewGroup D() {
        ConstraintLayout b10 = G().b();
        Intrinsics.checkNotNullExpressionValue(b10, "getRoot(...)");
        return b10;
    }

    @Override // Yf.c
    public void E(F0 insetsCompat) {
        Intrinsics.checkNotNullParameter(insetsCompat, "insetsCompat");
        e c10 = q.c(insetsCompat);
        e b10 = q.b(insetsCompat);
        e a10 = q.a(insetsCompat);
        int i10 = c10.f19098a + a10.f19098a;
        int i11 = c10.f19100c + a10.f19100c;
        int i12 = c10.f19099b;
        G().b().setPadding(i10, 0, i11, RangesKt.coerceAtLeast(b10.f19101d, c10.f19101d));
        MaterialToolbar siqPreChatFormsToolbar = G().f66266e;
        Intrinsics.checkNotNullExpressionValue(siqPreChatFormsToolbar, "siqPreChatFormsToolbar");
        ViewGroup.LayoutParams layoutParams = siqPreChatFormsToolbar.getLayoutParams();
        if (layoutParams == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        marginLayoutParams.topMargin = i12;
        siqPreChatFormsToolbar.setLayoutParams(marginLayoutParams);
        Window window = getWindow();
        if (window != null) {
            int h10 = AbstractC5892d.h(this, Integer.valueOf(AbstractC5886l.f59832h), 0.0f, 2, null);
            boolean l10 = P.l(this);
            String j10 = P.j(this);
            h1 a11 = AbstractC2109r0.a(getWindow(), getWindow().getDecorView());
            Intrinsics.checkNotNullExpressionValue(a11, "getInsetsController(...)");
            a11.e(StringsKt.equals("LIGHT", j10, true));
            a11.d(!l10);
            if (getResources().getConfiguration().orientation == 2) {
                window.setNavigationBarColor(h10);
            } else {
                window.setNavigationBarColor(0);
            }
            if (Build.VERSION.SDK_INT >= 29) {
                window.setNavigationBarContrastEnforced(getResources().getConfiguration().orientation == 2);
                window.setStatusBarContrastEnforced(getResources().getConfiguration().orientation == 2);
            }
        }
    }

    public final C6548b G() {
        C6548b c6548b = this._binding;
        Intrinsics.checkNotNull(c6548b);
        return c6548b;
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        View decorView;
        Window window = getWindow();
        LiveChatUtil.hideKeyboard((window == null || (decorView = window.getDecorView()) == null) ? null : decorView.getRootView());
        finish();
    }

    @Override // Yf.c, androidx.fragment.app.AbstractActivityC2168s, androidx.activity.ComponentActivity, androidx.core.app.g, android.app.Activity
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        C6548b c10 = C6548b.c(getLayoutInflater());
        this._binding = c10;
        setContentView(c10.b());
        A();
        setSupportActionBar(G().f66266e);
        LiveChatUtil.applyFontForToolbarTitle(G().f66266e);
        AbstractC5479a supportActionBar = getSupportActionBar();
        if (supportActionBar != null) {
            supportActionBar.u(true);
            supportActionBar.y(true);
            supportActionBar.t(true);
        }
        getSupportFragmentManager().n(new FragmentManager.m() { // from class: oe.a
            @Override // androidx.fragment.app.FragmentManager.m
            public final void onBackStackChanged() {
                PreChatFormActivity.H(PreChatFormActivity.this);
            }
        });
        N s10 = getSupportFragmentManager().s();
        int id2 = G().f66263b.getId();
        w wVar = new w();
        wVar.setArguments(getIntent().getExtras());
        Unit unit = Unit.INSTANCE;
        s10.o(id2, wVar).g(null).i();
    }
}
