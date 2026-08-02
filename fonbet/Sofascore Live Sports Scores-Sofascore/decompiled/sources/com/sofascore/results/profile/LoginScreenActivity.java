package com.sofascore.results.profile;

import android.app.AlertDialog;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.net.Uri;
import android.os.Bundle;
import android.text.method.LinkMovementMethod;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.google.android.gms.common.GoogleApiAvailability;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.google.android.material.button.MaterialButton;
import com.ironsource.U3;
import com.mbridge.msdk.MBridgeConstans;
import com.sofascore.results.R;
import defpackage.ad2;
import defpackage.b1d;
import defpackage.beh;
import defpackage.c38;
import defpackage.duf;
import defpackage.e6b;
import defpackage.ed;
import defpackage.eq3;
import defpackage.fjb;
import defpackage.fuf;
import defpackage.g52;
import defpackage.gjb;
import defpackage.h52;
import defpackage.hkg;
import defpackage.i5h;
import defpackage.ida;
import defpackage.jjb;
import defpackage.k13;
import defpackage.k42;
import defpackage.kjb;
import defpackage.l42;
import defpackage.m42;
import defpackage.mqi;
import defpackage.nd;
import defpackage.njb;
import defpackage.on;
import defpackage.otk;
import defpackage.pn;
import defpackage.qhi;
import defpackage.qv5;
import defpackage.rg2;
import defpackage.rgh;
import defpackage.rq3;
import defpackage.tsk;
import defpackage.vjk;
import defpackage.waa;
import defpackage.wca;
import defpackage.xw3;
import defpackage.yp8;
import defpackage.ypa;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.collections.b;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KClass;
import kotlin.text.StringsKt;
import kotlin.text.StringsKt__StringsKt;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001:\u0001\nB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\t\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\t\u0010\b¨\u0006\u000b"}, d2 = {"Lcom/sofascore/results/profile/LoginScreenActivity;", "Lcom/sofascore/results/base/BaseActivity;", "<init>", "()V", "Landroid/view/View;", MBridgeConstans.DYNAMIC_VIEW_KEY_VIEW, "", "facebookClick", "(Landroid/view/View;)V", "googleClick", "wxf", "mobile_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class LoginScreenActivity extends Hilt_LoginScreenActivity {
    public static final /* synthetic */ int M = 0;
    public final otk J;
    public final mqi K;
    public final rgh L = new rgh(this);

    public LoginScreenActivity() {
        int i = 0;
        this.J = new otk(duf.a.getOrCreateKotlinClass(njb.class), new kjb(this, 1), new kjb(this, i), new kjb(this, 2));
        this.K = ypa.b(new fjb(this, i));
    }

    public final nd M() {
        return (nd) this.K.getValue();
    }

    public final njb N() {
        return (njb) this.J.getValue();
    }

    public final void facebookClick(@Nullable View view) {
        if (waa.D(this)) {
            this.L.b();
        } else {
            ad2 ad2Var = qv5.a;
            qv5.a(k42.a);
        }
    }

    public final void googleClick(@Nullable View view) {
        if (waa.D(this)) {
            rgh.c(this.L, new ida(this, 17), 2);
        } else {
            ad2 ad2Var = qv5.a;
            qv5.a(k42.a);
        }
    }

    @Override // com.sofascore.results.base.BaseActivity, com.sofascore.results.base.Hilt_BaseActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(M().a);
        String string = getResources().getString(R.string.user_sign_in);
        string.getClass();
        setTitle(string);
        vjk[] vjkVarArr = vjk.a;
        Uri parse = Uri.parse("https://www.sofascore.com/terms-and-conditions");
        parse.getClass();
        Uri parse2 = Uri.parse("https://www.sofascore.com/privacy-policy");
        parse2.getClass();
        String string2 = getString(R.string.privacy_terms, parse, parse2);
        string2.getClass();
        TextView textView = M().e;
        mqi mqiVar = qhi.a;
        textView.setText(qhi.a(string2));
        textView.setMovementMethod(LinkMovementMethod.getInstance());
        textView.setLinkTextColor(getColor(R.color.primary_default));
        if (hkg.b0(this)) {
            ColorStateList q = eq3.q(R.color.n_lv_1, this);
            M().b.setIconTint(q);
            c38 c38Var = new c38(i5h.g(new tsk((LinearLayout) M().c.b), rg2.o));
            while (c38Var.hasNext()) {
                MaterialButton materialButton = (MaterialButton) c38Var.next();
                if (materialButton.getId() != R.id.button_login_google) {
                    materialButton.setIconTint(q);
                }
            }
        }
        e6b e6bVar = e6b.a;
        LinkedHashMap linkedHashMap = qv5.b;
        fuf fufVar = duf.a;
        KClass orCreateKotlinClass = fufVar.getOrCreateKotlinClass(m42.class);
        Object obj = linkedHashMap.get(orCreateKotlinClass);
        if (obj == null) {
            obj = beh.b(0, 0, null, 7);
            linkedHashMap.put(orCreateKotlinClass, obj);
        }
        xw3.L(wca.x(getLifecycle()), null, null, new jjb(this, (b1d) obj, null, this, 0), 3);
        KClass orCreateKotlinClass2 = fufVar.getOrCreateKotlinClass(k42.class);
        Object obj2 = linkedHashMap.get(orCreateKotlinClass2);
        if (obj2 == null) {
            obj2 = beh.b(0, 0, null, 7);
            linkedHashMap.put(orCreateKotlinClass2, obj2);
        }
        xw3.L(wca.x(getLifecycle()), null, null, new jjb(this, (b1d) obj2, null, this, 1), 3);
        KClass orCreateKotlinClass3 = fufVar.getOrCreateKotlinClass(l42.class);
        Object obj3 = linkedHashMap.get(orCreateKotlinClass3);
        if (obj3 == null) {
            obj3 = beh.b(0, 0, null, 7);
            linkedHashMap.put(orCreateKotlinClass3, obj3);
        }
        xw3.L(wca.x(getLifecycle()), null, null, new jjb(this, (b1d) obj3, null, this, 2), 3);
        KClass orCreateKotlinClass4 = fufVar.getOrCreateKotlinClass(h52.class);
        Object obj4 = linkedHashMap.get(orCreateKotlinClass4);
        if (obj4 == null) {
            obj4 = beh.b(0, 0, null, 7);
            linkedHashMap.put(orCreateKotlinClass4, obj4);
        }
        xw3.L(wca.x(getLifecycle()), null, null, new jjb(this, (b1d) obj4, null, this, 3), 3);
        KClass orCreateKotlinClass5 = fufVar.getOrCreateKotlinClass(g52.class);
        Object obj5 = linkedHashMap.get(orCreateKotlinClass5);
        if (obj5 == null) {
            obj5 = beh.b(0, 0, null, 7);
            linkedHashMap.put(orCreateKotlinClass5, obj5);
        }
        xw3.L(wca.x(getLifecycle()), null, null, new jjb(this, (b1d) obj5, null, this, 4), 3);
        ed edVar = M().c;
        rgh rghVar = this.L;
        rghVar.getClass();
        ((MaterialButton) edVar.c).setVisibility(b.j(0, 2, 18).contains(Integer.valueOf(GoogleApiAvailability.e.b(rghVar.a, GoogleApiAvailabilityLight.a))) ? 0 : 8);
        if (getResources().getConfiguration().orientation == 2) {
            M().d.post(new yp8(this, 9));
        }
    }

    @Override // android.app.Activity
    public final boolean onCreateOptionsMenu(Menu menu) {
        menu.getClass();
        getMenuInflater().inflate(R.menu.activity_login_menu, menu);
        return true;
    }

    @Override // com.sofascore.results.base.BaseActivity, com.sofascore.results.base.Hilt_BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public final void onDestroy() {
        this.L.a();
        super.onDestroy();
    }

    /* JADX WARN: Code restructure failed: missing block: B:7:0x0023, code lost:
    
        r7 = kotlin.text.StringsKt__StringsKt.split$default(r7, new java.lang.String[]{com.ironsource.U3.j.c}, false, 0, 6, null);
     */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:27:? A[RETURN, SYNTHETIC] */
    @Override // androidx.activity.ComponentActivity, android.app.Activity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onNewIntent(Intent intent) {
        String str;
        List split$default;
        Object obj;
        List split$default2;
        intent.getClass();
        super.onNewIntent(intent);
        Uri data = intent.getData();
        if (data == null) {
            return;
        }
        String uri = data.toString();
        uri.getClass();
        int i = 0;
        if (!StringsKt.J(uri, "/android-auth", false)) {
            return;
        }
        String fragment = data.getFragment();
        rq3 rq3Var = null;
        if (fragment != null && split$default != null) {
            ArrayList arrayList = new ArrayList(k13.r(split$default, 10));
            Iterator it = split$default.iterator();
            while (it.hasNext()) {
                split$default2 = StringsKt__StringsKt.split$default((String) it.next(), new String[]{U3.j.b}, false, 0, 6, null);
                arrayList.add(split$default2);
            }
            Iterator it2 = arrayList.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    obj = null;
                    break;
                } else {
                    obj = it2.next();
                    if (Intrinsics.c(CollectionsKt.a0(0, (List) obj), "id_token")) {
                        break;
                    }
                }
            }
            List list = (List) obj;
            if (list != null) {
                str = (String) CollectionsKt.a0(1, list);
                if (str == null) {
                    xw3.L(wca.x(getLifecycle()), null, null, new gjb(this, str, rq3Var, i), 3);
                    return;
                }
                return;
            }
        }
        str = null;
        if (str == null) {
        }
    }

    @Override // com.sofascore.results.base.BaseActivity, android.app.Activity
    public final boolean onOptionsItemSelected(MenuItem menuItem) {
        menuItem.getClass();
        if (menuItem.getItemId() != R.id.menu_item_login_help) {
            return super.onOptionsItemSelected(menuItem);
        }
        AlertDialog create = new AlertDialog.Builder(this, R.style.RedesignDialog).create();
        create.setTitle(getString(R.string.login_google_issue_title));
        create.setMessage(getString(R.string.login_google_issue_message));
        create.setButton(-1, getString(R.string.open_browser), new pn(this, 5));
        create.setButton(-2, getString(R.string.close), new on(9));
        create.show();
        return true;
    }

    @Override // com.sofascore.results.base.BaseActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public final void onResume() {
        super.onResume();
        System.currentTimeMillis();
    }

    @Override // com.sofascore.results.base.BaseActivity
    public final String u() {
        return "LoginScreen";
    }
}
