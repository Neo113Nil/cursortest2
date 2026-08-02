package com.sofascore.results.notifications;

import android.content.Intent;
import android.os.Bundle;
import com.sofascore.results.notifications.NotificationSettingsActivity;
import defpackage.b1d;
import defpackage.beh;
import defpackage.ce;
import defpackage.de;
import defpackage.duf;
import defpackage.e6b;
import defpackage.fuf;
import defpackage.joa;
import defpackage.khd;
import defpackage.kr9;
import defpackage.ngd;
import defpackage.otk;
import defpackage.qv5;
import defpackage.r42;
import defpackage.s42;
import defpackage.sgd;
import defpackage.tc3;
import defpackage.wca;
import defpackage.xgd;
import defpackage.xw3;
import defpackage.ygd;
import defpackage.ypa;
import defpackage.ysa;
import defpackage.zb3;
import java.util.LinkedHashMap;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.reflect.KClass;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\b²\u0006\u0012\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\nX\u008a\u0084\u0002"}, d2 = {"Lcom/sofascore/results/notifications/NotificationSettingsActivity;", "Lcom/sofascore/results/mvvm/base/AbstractActivity;", "<init>", "()V", "mx9", "Lvnb;", "Lhhd;", "state", "mobile_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class NotificationSettingsActivity extends Hilt_NotificationSettingsActivity {
    public static final /* synthetic */ int O = 0;
    public final otk K;
    public final joa L;
    public final joa M;
    public final de N;

    public NotificationSettingsActivity() {
        final int i = 0;
        final int i2 = 1;
        this.K = new otk(duf.a.getOrCreateKotlinClass(khd.class), new ygd(this, i2), new ygd(this, i), new ygd(this, 2));
        Function0 function0 = new Function0(this) { // from class: tgd
            public final /* synthetic */ NotificationSettingsActivity b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i3 = i;
                NotificationSettingsActivity notificationSettingsActivity = this.b;
                switch (i3) {
                    case 0:
                        int i4 = NotificationSettingsActivity.O;
                        Intent intent = notificationSettingsActivity.getIntent();
                        if (intent != null) {
                            return intent.getStringExtra("PRESELECTED_GROUP_NAME");
                        }
                        return null;
                    default:
                        int i5 = NotificationSettingsActivity.O;
                        Intent intent2 = notificationSettingsActivity.getIntent();
                        if (intent2 != null) {
                            return intent2.getStringExtra("PRESELECTED_SETTING_NAME");
                        }
                        return null;
                }
            }
        };
        ysa ysaVar = ysa.c;
        this.L = ypa.a(ysaVar, function0);
        this.M = ypa.a(ysaVar, new Function0(this) { // from class: tgd
            public final /* synthetic */ NotificationSettingsActivity b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i3 = i2;
                NotificationSettingsActivity notificationSettingsActivity = this.b;
                switch (i3) {
                    case 0:
                        int i4 = NotificationSettingsActivity.O;
                        Intent intent = notificationSettingsActivity.getIntent();
                        if (intent != null) {
                            return intent.getStringExtra("PRESELECTED_GROUP_NAME");
                        }
                        return null;
                    default:
                        int i5 = NotificationSettingsActivity.O;
                        Intent intent2 = notificationSettingsActivity.getIntent();
                        if (intent2 != null) {
                            return intent2.getStringExtra("PRESELECTED_SETTING_NAME");
                        }
                        return null;
                }
            }
        });
        this.N = registerForActivityResult(new ce(i2), new kr9(this, 17));
    }

    public final khd Q() {
        return (khd) this.K.getValue();
    }

    @Override // com.sofascore.results.mvvm.base.AbstractActivity, com.sofascore.results.base.BaseActivity, com.sofascore.results.base.Hilt_BaseActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        e6b e6bVar = e6b.a;
        LinkedHashMap linkedHashMap = qv5.b;
        fuf fufVar = duf.a;
        KClass orCreateKotlinClass = fufVar.getOrCreateKotlinClass(s42.class);
        Object obj = linkedHashMap.get(orCreateKotlinClass);
        int i = 0;
        if (obj == null) {
            obj = beh.b(0, 0, null, 7);
            linkedHashMap.put(orCreateKotlinClass, obj);
        }
        xw3.L(wca.x(getLifecycle()), null, null, new xgd(this, (b1d) obj, null, this, 0), 3);
        KClass orCreateKotlinClass2 = fufVar.getOrCreateKotlinClass(r42.class);
        Object obj2 = linkedHashMap.get(orCreateKotlinClass2);
        if (obj2 == null) {
            obj2 = beh.b(0, 0, null, 7);
            linkedHashMap.put(orCreateKotlinClass2, obj2);
        }
        xw3.L(wca.x(getLifecycle()), null, null, new xgd(this, (b1d) obj2, null, this, 1), 3);
        zb3.a(this, new tc3(889004862, new sgd(this, i), true));
    }

    @Override // com.sofascore.results.base.BaseActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public final void onResume() {
        super.onResume();
        Q().t(ngd.a);
    }

    @Override // com.sofascore.results.base.BaseActivity
    public final String u() {
        return "NotificationSettingsScreen";
    }

    @Override // com.sofascore.results.mvvm.base.AbstractActivity
    public final void N() {
    }
}
