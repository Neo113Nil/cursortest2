package com.blaze.blazesdk.features.search.ui;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import androidx.activity.ComponentActivity;
import com.blaze.blazesdk.data_source.BlazeDataSourceType;
import defpackage.arl;
import defpackage.duf;
import defpackage.fc6;
import defpackage.k3m;
import defpackage.ly3;
import defpackage.og5;
import defpackage.otk;
import defpackage.prl;
import defpackage.q6m;
import defpackage.qqi;
import defpackage.rfi;
import defpackage.tc3;
import defpackage.xka;
import defpackage.zb3;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0001\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\t²\u0006\f\u0010\u0006\u001a\u00020\u00058\nX\u008a\u0084\u0002²\u0006\u000e\u0010\b\u001a\u00020\u00078\n@\nX\u008a\u008e\u0002"}, d2 = {"Lcom/blaze/blazesdk/features/search/ui/SearchActivity;", "Landroidx/activity/ComponentActivity;", "<init>", "()V", "a", "Llrl;", "uiState", "", "textFieldValue", "blazesdk_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public final class SearchActivity extends ComponentActivity {
    public static final a c = new a(null);
    public final otk b = new otk(duf.a.getOrCreateKotlinClass(prl.class), new c(this), new b(this), new d(null, this));

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    public static final class a {
        public a(DefaultConstructorMarker defaultConstructorMarker) {
        }

        public static void a(Context context, BlazeDataSourceType blazeDataSourceType) {
            context.getClass();
            Intent intent = new Intent(context, (Class<?>) SearchActivity.class);
            if (blazeDataSourceType != null) {
                ConcurrentHashMap concurrentHashMap = q6m.a;
                String C = fc6.C();
                q6m.a.put(C, blazeDataSourceType);
                intent.putExtra("search_data_key", C);
            }
            if (!(context instanceof Activity)) {
                intent.addFlags(268435456);
            }
            context.startActivity(intent);
        }

        public static /* synthetic */ void start$default(a aVar, Context context, BlazeDataSourceType blazeDataSourceType, int i, Object obj) {
            if ((i & 2) != 0) {
                blazeDataSourceType = null;
            }
            aVar.getClass();
            a(context, blazeDataSourceType);
        }
    }

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    public static final class b extends xka implements Function0 {
        public final /* synthetic */ ComponentActivity i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(ComponentActivity componentActivity) {
            super(0);
            this.i = componentActivity;
        }

        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return this.i.getDefaultViewModelProviderFactory();
        }
    }

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    public static final class c extends xka implements Function0 {
        public final /* synthetic */ ComponentActivity i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(ComponentActivity componentActivity) {
            super(0);
            this.i = componentActivity;
        }

        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return this.i.getViewModelStore();
        }
    }

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    public static final class d extends xka implements Function0 {
        public final /* synthetic */ Function0 i;
        public final /* synthetic */ ComponentActivity j;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(Function0 function0, ComponentActivity componentActivity) {
            super(0);
            this.i = function0;
            this.j = componentActivity;
        }

        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            ly3 ly3Var;
            Function0 function0 = this.i;
            return (function0 == null || (ly3Var = (ly3) function0.invoke()) == null) ? this.j.getDefaultViewModelCreationExtras() : ly3Var;
        }
    }

    @Override // androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(Bundle bundle) {
        int i = 9;
        og5.a(this, new qqi(0, 0, 1, new rfi(i)), new qqi(0, 0, 1, new rfi(i)));
        super.onCreate(bundle);
        arl.a(this);
        otk otkVar = this.b;
        if (((prl) otkVar.getValue()).h == null) {
            String stringExtra = getIntent().getStringExtra("search_data_key");
            BlazeDataSourceType blazeDataSourceType = stringExtra != null ? (BlazeDataSourceType) q6m.a.remove(stringExtra) : null;
            if (blazeDataSourceType != null) {
                prl prlVar = (prl) otkVar.getValue();
                prlVar.h = blazeDataSourceType;
                prlVar.f();
            } else if (bundle != null) {
                finish();
                return;
            }
        }
        zb3.a(this, new tc3(1731848628, new k3m(this), true));
    }
}
