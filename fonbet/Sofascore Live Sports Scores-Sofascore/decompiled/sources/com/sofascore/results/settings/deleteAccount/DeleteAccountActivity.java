package com.sofascore.results.settings.deleteAccount;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.RadioGroup;
import android.widget.ScrollView;
import com.google.android.material.button.MaterialButton;
import com.sofascore.results.R;
import com.sofascore.results.base.BaseActivity;
import com.sofascore.results.mvvm.base.AbstractActivity;
import com.sofascore.results.service.RegistrationWorker;
import com.sofascore.results.settings.deleteAccount.DeleteAccountActivity;
import com.sofascore.results.view.InformationView;
import defpackage.bd;
import defpackage.bfk;
import defpackage.cn;
import defpackage.e92;
import defpackage.h63;
import defpackage.joa;
import defpackage.sr2;
import defpackage.ww4;
import defpackage.ypa;
import defpackage.ysa;
import java.util.LinkedHashMap;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.reflect.KClass;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/sofascore/results/settings/deleteAccount/DeleteAccountActivity;", "Lcom/sofascore/results/mvvm/base/AbstractActivity;", "<init>", "()V", "mobile_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class DeleteAccountActivity extends Hilt_DeleteAccountActivity {
    public static final /* synthetic */ int N = 0;
    public bfk K;
    public final joa L = ypa.a(ysa.c, new h63(this, 16));
    public ww4 M;

    public final bd Q() {
        return (bd) this.L.getValue();
    }

    @Override // com.sofascore.results.mvvm.base.AbstractActivity, com.sofascore.results.base.BaseActivity, com.sofascore.results.base.Hilt_BaseActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        AbstractActivity.M(this, Q().d, getString(R.string.delete_account), null, null, 60);
        ScrollView scrollView = Q().a;
        scrollView.getClass();
        BaseActivity.r(this, scrollView);
        e92 e92Var = Q().c;
        InformationView informationView = (InformationView) e92Var.f;
        final int i = 0;
        informationView.setVisibility(0);
        InformationView.o(informationView, getString(R.string.info_delete_account_email_warning));
        informationView.j();
        final int i2 = 1;
        ((RadioGroup) e92Var.c).setOnCheckedChangeListener(new sr2(i2, e92Var, this));
        ((MaterialButton) e92Var.d).setOnClickListener(new View.OnClickListener(this) { // from class: rw4
            public final /* synthetic */ DeleteAccountActivity b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i3 = i;
                DeleteAccountActivity deleteAccountActivity = this.b;
                switch (i3) {
                    case 0:
                        int i4 = DeleteAccountActivity.N;
                        deleteAccountActivity.setResult(0);
                        deleteAccountActivity.finish();
                        break;
                    case 1:
                        int i5 = DeleteAccountActivity.N;
                        DeleteAccountActivity deleteAccountActivity2 = this.b;
                        kz3 kz3Var = new kz3(deleteAccountActivity2, 8);
                        e6b e6bVar = e6b.a;
                        LinkedHashMap linkedHashMap = qv5.b;
                        fuf fufVar = duf.a;
                        KClass orCreateKotlinClass = fufVar.getOrCreateKotlinClass(f42.class);
                        Object obj = linkedHashMap.get(orCreateKotlinClass);
                        if (obj == null) {
                            obj = beh.b(0, 0, null, 7);
                            linkedHashMap.put(orCreateKotlinClass, obj);
                        }
                        xw3.L(wca.x(deleteAccountActivity2.getLifecycle()), null, null, new uw4(deleteAccountActivity2, (b1d) obj, null, kz3Var, 0), 3);
                        KClass orCreateKotlinClass2 = fufVar.getOrCreateKotlinClass(e42.class);
                        Object obj2 = linkedHashMap.get(orCreateKotlinClass2);
                        if (obj2 == null) {
                            obj2 = beh.b(0, 0, null, 7);
                            linkedHashMap.put(orCreateKotlinClass2, obj2);
                        }
                        xw3.L(wca.x(deleteAccountActivity2.getLifecycle()), null, null, new uw4(deleteAccountActivity2, (b1d) obj2, null, kz3Var, 1), 3);
                        Pair[] pairArr = {new Pair("ACTION", "DELETE_ACCOUNT")};
                        hpo hpoVar = new hpo(18);
                        Pair pair = pairArr[0];
                        hpoVar.B(pair.b, (String) pair.a);
                        md4 l = hpoVar.l();
                        ktd g = vxd.g(RegistrationWorker.class, l);
                        Context applicationContext = deleteAccountActivity2.getApplicationContext();
                        applicationContext.getClass();
                        xbl d = xbl.d(applicationContext);
                        d.getClass();
                        d.b("RegistrationWorker-".concat(mha.o(l)), nf6.a, (ltd) g.a());
                        break;
                    default:
                        int i6 = DeleteAccountActivity.N;
                        deleteAccountActivity.setResult(0);
                        deleteAccountActivity.finish();
                        break;
                }
            }
        });
        ((MaterialButton) e92Var.b).setOnClickListener(new cn(25, e92Var, this));
        ((MaterialButton) Q().b.d).setOnClickListener(new View.OnClickListener(this) { // from class: rw4
            public final /* synthetic */ DeleteAccountActivity b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i3 = i2;
                DeleteAccountActivity deleteAccountActivity = this.b;
                switch (i3) {
                    case 0:
                        int i4 = DeleteAccountActivity.N;
                        deleteAccountActivity.setResult(0);
                        deleteAccountActivity.finish();
                        break;
                    case 1:
                        int i5 = DeleteAccountActivity.N;
                        DeleteAccountActivity deleteAccountActivity2 = this.b;
                        kz3 kz3Var = new kz3(deleteAccountActivity2, 8);
                        e6b e6bVar = e6b.a;
                        LinkedHashMap linkedHashMap = qv5.b;
                        fuf fufVar = duf.a;
                        KClass orCreateKotlinClass = fufVar.getOrCreateKotlinClass(f42.class);
                        Object obj = linkedHashMap.get(orCreateKotlinClass);
                        if (obj == null) {
                            obj = beh.b(0, 0, null, 7);
                            linkedHashMap.put(orCreateKotlinClass, obj);
                        }
                        xw3.L(wca.x(deleteAccountActivity2.getLifecycle()), null, null, new uw4(deleteAccountActivity2, (b1d) obj, null, kz3Var, 0), 3);
                        KClass orCreateKotlinClass2 = fufVar.getOrCreateKotlinClass(e42.class);
                        Object obj2 = linkedHashMap.get(orCreateKotlinClass2);
                        if (obj2 == null) {
                            obj2 = beh.b(0, 0, null, 7);
                            linkedHashMap.put(orCreateKotlinClass2, obj2);
                        }
                        xw3.L(wca.x(deleteAccountActivity2.getLifecycle()), null, null, new uw4(deleteAccountActivity2, (b1d) obj2, null, kz3Var, 1), 3);
                        Pair[] pairArr = {new Pair("ACTION", "DELETE_ACCOUNT")};
                        hpo hpoVar = new hpo(18);
                        Pair pair = pairArr[0];
                        hpoVar.B(pair.b, (String) pair.a);
                        md4 l = hpoVar.l();
                        ktd g = vxd.g(RegistrationWorker.class, l);
                        Context applicationContext = deleteAccountActivity2.getApplicationContext();
                        applicationContext.getClass();
                        xbl d = xbl.d(applicationContext);
                        d.getClass();
                        d.b("RegistrationWorker-".concat(mha.o(l)), nf6.a, (ltd) g.a());
                        break;
                    default:
                        int i6 = DeleteAccountActivity.N;
                        deleteAccountActivity.setResult(0);
                        deleteAccountActivity.finish();
                        break;
                }
            }
        });
        final int i3 = 2;
        ((MaterialButton) Q().b.c).setOnClickListener(new View.OnClickListener(this) { // from class: rw4
            public final /* synthetic */ DeleteAccountActivity b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i32 = i3;
                DeleteAccountActivity deleteAccountActivity = this.b;
                switch (i32) {
                    case 0:
                        int i4 = DeleteAccountActivity.N;
                        deleteAccountActivity.setResult(0);
                        deleteAccountActivity.finish();
                        break;
                    case 1:
                        int i5 = DeleteAccountActivity.N;
                        DeleteAccountActivity deleteAccountActivity2 = this.b;
                        kz3 kz3Var = new kz3(deleteAccountActivity2, 8);
                        e6b e6bVar = e6b.a;
                        LinkedHashMap linkedHashMap = qv5.b;
                        fuf fufVar = duf.a;
                        KClass orCreateKotlinClass = fufVar.getOrCreateKotlinClass(f42.class);
                        Object obj = linkedHashMap.get(orCreateKotlinClass);
                        if (obj == null) {
                            obj = beh.b(0, 0, null, 7);
                            linkedHashMap.put(orCreateKotlinClass, obj);
                        }
                        xw3.L(wca.x(deleteAccountActivity2.getLifecycle()), null, null, new uw4(deleteAccountActivity2, (b1d) obj, null, kz3Var, 0), 3);
                        KClass orCreateKotlinClass2 = fufVar.getOrCreateKotlinClass(e42.class);
                        Object obj2 = linkedHashMap.get(orCreateKotlinClass2);
                        if (obj2 == null) {
                            obj2 = beh.b(0, 0, null, 7);
                            linkedHashMap.put(orCreateKotlinClass2, obj2);
                        }
                        xw3.L(wca.x(deleteAccountActivity2.getLifecycle()), null, null, new uw4(deleteAccountActivity2, (b1d) obj2, null, kz3Var, 1), 3);
                        Pair[] pairArr = {new Pair("ACTION", "DELETE_ACCOUNT")};
                        hpo hpoVar = new hpo(18);
                        Pair pair = pairArr[0];
                        hpoVar.B(pair.b, (String) pair.a);
                        md4 l = hpoVar.l();
                        ktd g = vxd.g(RegistrationWorker.class, l);
                        Context applicationContext = deleteAccountActivity2.getApplicationContext();
                        applicationContext.getClass();
                        xbl d = xbl.d(applicationContext);
                        d.getClass();
                        d.b("RegistrationWorker-".concat(mha.o(l)), nf6.a, (ltd) g.a());
                        break;
                    default:
                        int i6 = DeleteAccountActivity.N;
                        deleteAccountActivity.setResult(0);
                        deleteAccountActivity.finish();
                        break;
                }
            }
        });
        setContentView(Q().a);
    }

    @Override // com.sofascore.results.base.BaseActivity
    public final String u() {
        return "DeleteAccountScreen";
    }

    @Override // com.sofascore.results.mvvm.base.AbstractActivity
    public final void N() {
    }
}
