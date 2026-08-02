package com.vk.pushes;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.SystemClock;
import androidx.appcompat.app.AppCompatActivity;
import com.vk.common.links.LaunchContext;
import com.vk.dto.common.id.UserId;
import com.vk.pushes.PushOpenActivity;
import com.vkontakte.android.R;
import io.reactivex.rxjava3.internal.functions.a;
import io.reactivex.rxjava3.internal.operators.completable.w;
import java.util.concurrent.atomic.AtomicLong;
import xsna.c2c0;
import xsna.ca70;
import xsna.cvk;
import xsna.d260;
import xsna.epx;
import xsna.fkq0;
import xsna.gz80;
import xsna.hg1;
import xsna.imj0;
import xsna.j03;
import xsna.maz;
import xsna.o25;
import xsna.o260;
import xsna.ra20;
import xsna.rg60;
import xsna.rk8;
import xsna.ver0;
import xsna.wo8;
import xsna.x2q0;
import xsna.xwk;
import xsna.yp80;
import xsna.z320;
import xsna.z4g;

/* compiled from: PushOpenActivity.kt */
/* loaded from: classes.dex */
public final class PushOpenActivity extends AppCompatActivity implements yp80 {
    public static final /* synthetic */ int f = 0;

    /* compiled from: PushOpenActivity.kt */
    /* loaded from: classes5.dex */
    public static final class a {
        public static Intent a(String str, Context context, String str2, String str3, String str4, String str5) {
            Intent addFlags = new Intent(context, (Class<?>) PushOpenActivity.class).putExtra("notification_tag_id_key", str).putExtra("push_action", str2).putExtra("push_type_key", str3).addFlags(268435456);
            if (str4 != null) {
                addFlags.putExtra("stat_key", str4);
            }
            if (str5 != null) {
                addFlags.putExtra("track_interaction_key", str5);
            }
            return addFlags;
        }
    }

    public final void O1() {
        Bundle bundle;
        String str;
        String stringExtra = getIntent().getStringExtra("push_type_key");
        if (epx.f(stringExtra, "unifyfriend_found")) {
            str = "new_user_from_contacts_push";
            bundle = null;
        } else {
            bundle = null;
            str = null;
        }
        LaunchContext launchContext = new LaunchContext(true, false, false, null, "push_notifications", null, null, null, null, str, null, false, false, false, null, null, null, null, null, false, false, null, null, stringExtra, 33553896);
        String stringExtra2 = getIntent().getStringExtra("url");
        if (stringExtra2 == null) {
            return;
        }
        if (!getIntent().getBooleanExtra("force_browser", false)) {
            maz.c(xwk.d().e(), this, stringExtra2, launchContext, null, new b(stringExtra2, launchContext), 8);
        } else {
            xwk.d().getBrowser().f(this, bundle, launchContext, stringExtra2);
            R1();
        }
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue
    java.lang.NullPointerException: Cannot invoke "java.util.List.iterator()" because the return value of "jadx.core.dex.visitors.regions.SwitchOverStringVisitor$SwitchData.getNewCases()" is null
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.restoreSwitchOverString(SwitchOverStringVisitor.java:109)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visitRegion(SwitchOverStringVisitor.java:66)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:77)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:82)
     */
    public final void Q1() {
        String string;
        String string2;
        String string3;
        String string4;
        String stringExtra = getIntent().getStringExtra("push_action");
        if (stringExtra != null) {
            switch (stringExtra.hashCode()) {
                case -797977408:
                    if (stringExtra.equals("open_notification")) {
                        Bundle extras = getIntent().getExtras();
                        z4g.d().O(this, (extras == null || (string4 = extras.getString("title", "")) == null) ? "" : string4, (extras == null || (string3 = extras.getString("text", "")) == null) ? "" : string3, (extras == null || (string2 = extras.getString("button", "")) == null) ? "" : string2, (extras == null || (string = extras.getString("url", "")) == null) ? "" : string);
                        R1();
                        break;
                    }
                    break;
                case -504306182:
                    if (stringExtra.equals("open_url")) {
                        O1();
                        break;
                    }
                    break;
                case -105333760:
                    if (stringExtra.equals("validate_action_confirm")) {
                        z4g.d().R(this, getIntent().getStringExtra("hash"), getIntent().getStringExtra("confirm_text"));
                        R1();
                        break;
                    }
                    break;
                case -47333985:
                    if (stringExtra.equals("validate_device")) {
                        z4g.d().x(this, getIntent().getStringExtra("url"), getIntent().getStringExtra("device_token"));
                        R1();
                        break;
                    }
                    break;
                case 6144768:
                    if (stringExtra.equals("validate_login")) {
                        z4g.d().G(this, getIntent().getIntExtra("code", 0));
                        R1();
                        break;
                    }
                    break;
            }
        }
    }

    public final void R1() {
        ca70 ca70Var = ca70.a;
        String stringExtra = getIntent().getStringExtra("notification_tag_id_key");
        if (stringExtra == null) {
            stringExtra = "";
        }
        ca70.a(this, stringExtra, 1);
        final String stringExtra2 = getIntent().getStringExtra("notification_group_tag_id_key");
        if (stringExtra2 == null) {
            stringExtra2 = "";
        }
        final int intExtra = getIntent().getIntExtra("notification_group_id_key", 0);
        String stringExtra3 = getIntent().getStringExtra("notification_group_key");
        final String str = stringExtra3 != null ? stringExtra3 : "";
        ca70.e.postDelayed(new Runnable() { // from class: xsna.ba70
            @Override // java.lang.Runnable
            public final void run() {
                ca70 ca70Var2 = ca70.a;
                PushOpenActivity pushOpenActivity = PushOpenActivity.this;
                if (ca70.d(pushOpenActivity, str) < 1) {
                    ca70.a(pushOpenActivity, stringExtra2, Integer.valueOf(intExtra));
                }
            }
        }, 100L);
        z320.a(getIntent());
        if (gz80.a(24)) {
            UserId userId = (UserId) getIntent().getParcelableExtra("target_user_id");
            if (userId == null) {
                userId = UserId.d;
            }
            ra20 ra20Var = ra20.a;
            Long valueOf = Long.valueOf(userId.b);
            ra20Var.getClass();
            ra20.b(this, valueOf);
            wo8.a(this);
        }
        finish();
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        o260 o260Var = d260.a;
        o260 o260Var2 = d260.a;
        if (o260Var2 == null) {
            o260Var2 = null;
        }
        o260Var2.getClass();
        AtomicLong atomicLong = x2q0.d;
        long elapsedRealtime = SystemClock.elapsedRealtime();
        long j = x2q0.c;
        long j2 = elapsedRealtime + j;
        long j3 = atomicLong.get();
        if (j2 < j3) {
            j2 = j3;
        }
        atomicLong.set(j2);
        AtomicLong atomicLong2 = x2q0.e;
        long elapsedRealtime2 = SystemClock.elapsedRealtime() + j;
        long j4 = atomicLong2.get();
        if (elapsedRealtime2 < j4) {
            elapsedRealtime2 = j4;
        }
        atomicLong2.set(elapsedRealtime2);
        imj0.h(getIntent(), this);
        if (!o25.a().b()) {
            String stringExtra = getIntent().getStringExtra("push_action");
            if (stringExtra != null && stringExtra.hashCode() == -504306182 && stringExtra.equals("open_url")) {
                O1();
                return;
            } else {
                finish();
                return;
            }
        }
        UserId userId = (UserId) getIntent().getParcelableExtra("target_user_id");
        if (userId == null) {
            userId = UserId.d;
        }
        if (o25.a().a(userId) || !fkq0.c(userId)) {
            Q1();
            return;
        }
        io.reactivex.rxjava3.core.a f2 = o25.a().f(userId);
        rg60 rg60Var = new rg60(this, 2);
        a.l lVar = io.reactivex.rxjava3.internal.functions.a.d;
        a.k kVar = io.reactivex.rxjava3.internal.functions.a.c;
        ver0.b(this, hg1.g(new w(f2, lVar, lVar, kVar, kVar, rg60Var, kVar), new c2c0(5)));
    }

    /* compiled from: PushOpenActivity.kt */
    /* loaded from: classes5.dex */
    public static final class b implements yp80 {
        public final /* synthetic */ String c;
        public final /* synthetic */ LaunchContext d;

        public b(String str, LaunchContext launchContext) {
            this.c = str;
            this.d = launchContext;
        }

        @Override // xsna.yp80
        public final void U() {
            rk8 browser = xwk.d().getBrowser();
            LaunchContext launchContext = this.d;
            PushOpenActivity pushOpenActivity = PushOpenActivity.this;
            browser.f(pushOpenActivity, null, launchContext, this.c);
            int i = PushOpenActivity.f;
            pushOpenActivity.R1();
        }

        @Override // xsna.yp80
        public final void onError(Throwable th) {
            PushOpenActivity pushOpenActivity = PushOpenActivity.this;
            cvk.w(j03.g(pushOpenActivity, th, R.string.error), false);
            pushOpenActivity.overridePendingTransition(0, 0);
            pushOpenActivity.finish();
        }

        @Override // xsna.yp80
        public final void onSuccess() {
            int i = PushOpenActivity.f;
            PushOpenActivity.this.R1();
        }

        @Override // xsna.yp80
        public final void I() {
        }

        @Override // xsna.yp80
        public final void B0(boolean z) {
        }
    }

    @Override // xsna.yp80
    public final void I() {
    }

    @Override // xsna.yp80
    public final void U() {
    }

    @Override // xsna.yp80
    public final void onSuccess() {
    }

    @Override // xsna.yp80
    public final void B0(boolean z) {
    }

    @Override // xsna.yp80
    public final void onError(Throwable th) {
    }
}
