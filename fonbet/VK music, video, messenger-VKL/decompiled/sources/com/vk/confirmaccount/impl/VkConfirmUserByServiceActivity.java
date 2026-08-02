package com.vk.confirmaccount.impl;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import androidx.appcompat.app.AppCompatActivity;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.LazyThreadSafetyMode;
import xsna.a3j;
import xsna.afl0;
import xsna.bnc0;
import xsna.drm0;
import xsna.izs;
import xsna.msy;
import xsna.rmu0;
import xsna.s3q0;
import xsna.sd;
import xsna.y2j;
import xsna.z2j;

/* compiled from: VkConfirmUserByServiceActivity.kt */
/* loaded from: classes17.dex */
public final class VkConfirmUserByServiceActivity extends AppCompatActivity {
    public static final /* synthetic */ int m = 0;
    public final Object f;
    public final Object g;
    public boolean h;
    public boolean i;
    public String j;
    public String k;
    public List<String> l;

    public VkConfirmUserByServiceActivity() {
        afl0 afl0Var = new afl0(this, 26);
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.NONE;
        this.f = msy.a(lazyThreadSafetyMode, afl0Var);
        this.g = msy.a(lazyThreadSafetyMode, new rmu0(this, 0));
        this.j = "";
    }

    public final void O1() {
        this.i = true;
        setResult(0);
        finish();
    }

    @Override // android.app.Activity
    public final void finish() {
        super.finish();
        overridePendingTransition(0, 0);
    }

    /* JADX WARN: Type inference failed for: r1v2, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r1v9, types: [java.lang.Object, kotlin.Lazy] */
    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        overridePendingTransition(0, 0);
        if (bundle != null) {
            String string = bundle.getString("key_session_id");
            if (string == null) {
                O1();
                return;
            }
            this.j = string;
            String string2 = bundle.getString("key_url");
            if (string2 == null) {
                O1();
                return;
            }
            this.k = string2;
            ArrayList<String> stringArrayList = bundle.getStringArrayList("key_app2app_urls");
            if (stringArrayList == null) {
                O1();
                return;
            }
            this.l = stringArrayList;
        } else {
            String stringExtra = getIntent().getStringExtra("arg_session_id");
            if (stringExtra == null) {
                O1();
                return;
            }
            this.j = stringExtra;
            a3j a3jVar = (a3j) this.g.getValue();
            z2j remove = a3jVar.a.remove(this.j);
            if (remove == null) {
                O1();
                return;
            } else {
                this.k = remove.a;
                this.l = remove.b;
            }
        }
        y2j y2jVar = (y2j) this.f.getValue();
        bnc0 bnc0Var = new bnc0(this, 26);
        String str = y2jVar.b;
        CopyOnWriteArrayList<izs<String, s3q0>> copyOnWriteArrayList = y2jVar.a;
        if (!drm0.N(str)) {
            String str2 = y2jVar.b;
            Iterator<izs<String, s3q0>> it = copyOnWriteArrayList.iterator();
            while (it.hasNext()) {
                it.next().invoke(str2);
            }
        }
        copyOnWriteArrayList.add(bnc0Var);
        if (bundle == null) {
            new Handler(Looper.getMainLooper()).post(new sd(this, 16));
        } else {
            this.h = bundle.getBoolean("key_url_opened", false);
            this.i = bundle.getBoolean("key_result_handled", false);
        }
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, kotlin.Lazy] */
    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public final void onDestroy() {
        if (isFinishing()) {
            y2j y2jVar = (y2j) this.f.getValue();
            y2jVar.b = "";
            y2jVar.a.clear();
        }
        super.onDestroy();
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public final void onNewIntent(Intent intent) {
        Uri data;
        String uri;
        super.onNewIntent(intent);
        if (intent != null && (data = intent.getData()) != null && (uri = data.toString()) != null) {
            if (drm0.N(uri)) {
                uri = null;
            }
            if (uri != null) {
                this.i = true;
                setResult(-1, new Intent().putExtra("callbackURL", uri));
                finish();
                return;
            }
        }
        O1();
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    public final void onResume() {
        super.onResume();
        if (!this.h || this.i) {
            return;
        }
        O1();
    }

    @Override // androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        if (!drm0.N(this.j)) {
            bundle.putString("key_session_id", this.j);
            String str = this.k;
            if (str == null) {
                str = null;
            }
            bundle.putString("key_url", str);
            List<String> list = this.l;
            bundle.putStringArrayList("key_app2app_urls", new ArrayList<>(list != null ? list : null));
        }
        bundle.putBoolean("key_url_opened", this.h);
        bundle.putBoolean("key_result_handled", this.i);
    }
}
