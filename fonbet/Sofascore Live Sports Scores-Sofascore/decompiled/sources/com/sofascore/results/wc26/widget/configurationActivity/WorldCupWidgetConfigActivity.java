package com.sofascore.results.wc26.widget.configurationActivity;

import android.content.Intent;
import android.os.Bundle;
import com.sofascore.results.wc26.widget.configurationActivity.WorldCupWidgetConfigActivity;
import defpackage.all;
import defpackage.duf;
import defpackage.ill;
import defpackage.luj;
import defpackage.mqi;
import defpackage.og5;
import defpackage.otk;
import defpackage.rq3;
import defpackage.wca;
import defpackage.xw3;
import defpackage.ypa;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/sofascore/results/wc26/widget/configurationActivity/WorldCupWidgetConfigActivity;", "Lcom/sofascore/results/mvvm/base/AbstractActivity;", "<init>", "()V", "mobile_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class WorldCupWidgetConfigActivity extends Hilt_WorldCupWidgetConfigActivity {
    public static final /* synthetic */ int N = 0;
    public final mqi K;
    public final mqi L;
    public final otk M;

    public WorldCupWidgetConfigActivity() {
        final int i = 0;
        this.K = ypa.b(new Function0(this) { // from class: xkl
            public final /* synthetic */ WorldCupWidgetConfigActivity b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                Bundle extras;
                int i2 = i;
                int i3 = 0;
                r1 = false;
                boolean z = false;
                i3 = 0;
                WorldCupWidgetConfigActivity worldCupWidgetConfigActivity = this.b;
                switch (i2) {
                    case 0:
                        int i4 = WorldCupWidgetConfigActivity.N;
                        Intent intent = worldCupWidgetConfigActivity.getIntent();
                        if (intent != null && (extras = intent.getExtras()) != null) {
                            i3 = extras.getInt("appWidgetId", 0);
                        }
                        return Integer.valueOf(i3);
                    default:
                        int i5 = WorldCupWidgetConfigActivity.N;
                        Intent intent2 = worldCupWidgetConfigActivity.getIntent();
                        if (intent2 != null && intent2.getBooleanExtra("FORCE_PICKER", false)) {
                            z = true;
                        }
                        return Boolean.valueOf(z);
                }
            }
        });
        final int i2 = 1;
        this.L = ypa.b(new Function0(this) { // from class: xkl
            public final /* synthetic */ WorldCupWidgetConfigActivity b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                Bundle extras;
                int i22 = i2;
                int i3 = 0;
                z = false;
                boolean z = false;
                i3 = 0;
                WorldCupWidgetConfigActivity worldCupWidgetConfigActivity = this.b;
                switch (i22) {
                    case 0:
                        int i4 = WorldCupWidgetConfigActivity.N;
                        Intent intent = worldCupWidgetConfigActivity.getIntent();
                        if (intent != null && (extras = intent.getExtras()) != null) {
                            i3 = extras.getInt("appWidgetId", 0);
                        }
                        return Integer.valueOf(i3);
                    default:
                        int i5 = WorldCupWidgetConfigActivity.N;
                        Intent intent2 = worldCupWidgetConfigActivity.getIntent();
                        if (intent2 != null && intent2.getBooleanExtra("FORCE_PICKER", false)) {
                            z = true;
                        }
                        return Boolean.valueOf(z);
                }
            }
        });
        this.M = new otk(duf.a.getOrCreateKotlinClass(ill.class), new all(this, i2), new all(this, i), new all(this, 2));
    }

    @Override // com.sofascore.results.mvvm.base.AbstractActivity, com.sofascore.results.base.BaseActivity, com.sofascore.results.base.Hilt_BaseActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(Bundle bundle) {
        rq3 rq3Var = null;
        og5.b(this, null, null, 3);
        super.onCreate(bundle);
        setResult(0);
        if (((Number) this.K.getValue()).intValue() == 0) {
            finish();
        } else {
            xw3.L(wca.x(getLifecycle()), null, null, new luj(this, rq3Var, 11), 3);
        }
    }

    @Override // com.sofascore.results.base.BaseActivity
    public final String u() {
        return "WidgetTeamSelect";
    }

    @Override // com.sofascore.results.mvvm.base.AbstractActivity
    public final void N() {
    }
}
