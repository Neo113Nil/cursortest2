package com.blaze.blazesdk.ads.ima.exo_player;

import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import androidx.activity.ComponentActivity;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.blaze.blazesdk.ads.models.ui.BlazeContentExtraInfo;
import com.blaze.blazesdk.analytics.enums.ContentType;
import com.blaze.blazesdk.analytics.enums.WidgetType;
import com.blaze.blazesdk.players.ui.k;
import com.sofascore.results.R;
import defpackage.a70;
import defpackage.ale;
import defpackage.arl;
import defpackage.axl;
import defpackage.bom;
import defpackage.duf;
import defpackage.hq4;
import defpackage.hs4;
import defpackage.kr9;
import defpackage.kxl;
import defpackage.lu3;
import defpackage.ly3;
import defpackage.lz;
import defpackage.mqi;
import defpackage.orl;
import defpackage.otk;
import defpackage.q3m;
import defpackage.sq3;
import defpackage.sr8;
import defpackage.wca;
import defpackage.wql;
import defpackage.x6m;
import defpackage.x8m;
import defpackage.xka;
import defpackage.xw3;
import defpackage.y0m;
import defpackage.y6a;
import defpackage.ypa;
import defpackage.yx7;
import defpackage.yzl;
import defpackage.z45;
import defpackage.zzl;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0005B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Lcom/blaze/blazesdk/ads/ima/exo_player/ImaPresenterActivity;", "Lcom/blaze/blazesdk/players/ui/k;", "Lwql;", "<init>", "()V", "a", "blazesdk_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public final class ImaPresenterActivity extends k {
    public static final /* synthetic */ int o = 0;
    public final otk m;
    public final mqi n;

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    public static final class a {
        public a(DefaultConstructorMarker defaultConstructorMarker) {
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

    static {
        new a(null);
    }

    public ImaPresenterActivity() {
        super(orl.b);
        this.m = new otk(duf.a.getOrCreateKotlinClass(x8m.class), new c(this), new b(this), new d(null, this));
        this.n = ypa.b(new sr8(this, 8));
    }

    public static final com.blaze.blazesdk.ads.ima.models.args.a r(ImaPresenterActivity imaPresenterActivity) {
        Parcelable parcelable;
        Intent intent = imaPresenterActivity.getIntent();
        intent.getClass();
        if (Build.VERSION.SDK_INT > 33) {
            parcelable = (Parcelable) intent.getParcelableExtra("ima_presenter_activity_args", com.blaze.blazesdk.ads.ima.models.args.a.class);
        } else {
            Parcelable parcelableExtra = intent.getParcelableExtra("ima_presenter_activity_args");
            if (!(parcelableExtra instanceof com.blaze.blazesdk.ads.ima.models.args.a)) {
                parcelableExtra = null;
            }
            parcelable = (com.blaze.blazesdk.ads.ima.models.args.a) parcelableExtra;
        }
        return (com.blaze.blazesdk.ads.ima.models.args.a) parcelable;
    }

    @Override // android.app.Activity
    public final void finish() {
        super.finish();
        overridePendingTransition(R.anim.blaze_anim_ima_fade_in, R.anim.blaze_anim_ima_fade_out);
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0066  */
    @Override // com.blaze.blazesdk.players.ui.k, com.blaze.blazesdk.base_classes.a, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onCreate(Bundle bundle) {
        com.blaze.blazesdk.ads.ima.models.args.a aVar;
        super.onCreate(bundle);
        if (bundle != null) {
            super.finish();
            overridePendingTransition(R.anim.blaze_anim_ima_fade_in, R.anim.blaze_anim_ima_fade_out);
        }
        mqi mqiVar = this.n;
        com.blaze.blazesdk.ads.ima.models.args.a aVar2 = (com.blaze.blazesdk.ads.ima.models.args.a) mqiVar.getValue();
        ContentType contentType = aVar2 != null ? aVar2.k : null;
        int i = contentType == null ? -1 : kxl.a[contentType.ordinal()];
        if (i != -1) {
            if (i != 1) {
                if (i != 2 && i != 3) {
                    zzl.b();
                    return;
                }
            }
            ConstraintLayout constraintLayout = ((wql) p()).a;
            constraintLayout.getClass();
            lz.s(constraintLayout);
            arl.c(this, true);
            getOnBackPressedDispatcher().a(this, new yzl());
            aVar = (com.blaze.blazesdk.ads.ima.models.args.a) mqiVar.getValue();
            if (aVar != null) {
                x8m x8mVar = (x8m) this.m.getValue();
                com.blaze.blazesdk.players.models.c cVar = aVar.a;
                String str = aVar.c;
                String str2 = aVar.d;
                String str3 = aVar.l;
                WidgetType widgetType = aVar.b;
                String str4 = aVar.f;
                String str5 = aVar.e;
                String str6 = aVar.h;
                String str7 = aVar.g;
                String str8 = aVar.j;
                String str9 = aVar.i;
                ContentType contentType2 = aVar.k;
                BlazeContentExtraInfo blazeContentExtraInfo = aVar.m;
                String str10 = aVar.n;
                str.getClass();
                str3.getClass();
                x8mVar.s = cVar;
                x8mVar.d = str;
                x8mVar.e = str2;
                x8mVar.f = str3;
                x8mVar.g = widgetType;
                x8mVar.k = str4;
                x8mVar.l = str5;
                x8mVar.m = str6;
                x8mVar.n = str7;
                x8mVar.o = str8;
                x8mVar.p = str9;
                x8mVar.h = contentType2;
                x8mVar.j = blazeContentExtraInfo;
                x8mVar.i = str10;
            }
            xw3.L(wca.x(getLifecycle()), null, null, new q3m(this, null), 3);
        }
        arl.a(this);
        ConstraintLayout constraintLayout2 = ((wql) p()).a;
        constraintLayout2.getClass();
        lz.s(constraintLayout2);
        arl.c(this, true);
        getOnBackPressedDispatcher().a(this, new yzl());
        aVar = (com.blaze.blazesdk.ads.ima.models.args.a) mqiVar.getValue();
        if (aVar != null) {
        }
        xw3.L(wca.x(getLifecycle()), null, null, new q3m(this, null), 3);
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    public final void onPause() {
        super.onPause();
        ale aleVar = ((x8m) this.m.getValue()).t;
        if (aleVar != null) {
            aleVar.pause();
        }
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    public final void onResume() {
        super.onResume();
        ale aleVar = ((x8m) this.m.getValue()).t;
        if (aleVar != null) {
            aleVar.play();
        }
    }

    @Override // com.blaze.blazesdk.players.ui.k
    public final boolean q(y0m y0mVar) {
        y0mVar.getClass();
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object s(sq3 sq3Var) {
        x6m x6mVar;
        int i;
        ale aleVar;
        if (sq3Var instanceof x6m) {
            x6mVar = (x6m) sq3Var;
            int i2 = x6mVar.u;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                x6mVar.u = i2 - Integer.MIN_VALUE;
                Object obj = x6mVar.s;
                lu3 lu3Var = lu3.a;
                i = x6mVar.u;
                if (i != 0) {
                    y6a.M(obj);
                    kr9 kr9Var = new kr9(this, 0);
                    x8m x8mVar = (x8m) this.m.getValue();
                    x6mVar.r = this;
                    x6mVar.u = 1;
                    hs4 hs4Var = z45.a;
                    obj = xw3.R(hq4.c, new axl(x8mVar, this, kr9Var, null), x6mVar);
                    if (obj == lu3Var) {
                        return lu3Var;
                    }
                } else {
                    if (i != 1) {
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    this = x6mVar.r;
                    y6a.M(obj);
                }
                aleVar = (ale) obj;
                if (aleVar != null) {
                    super.finish();
                    this.overridePendingTransition(R.anim.blaze_anim_ima_fade_in, R.anim.blaze_anim_ima_fade_out);
                    return Unit.a;
                }
                ((wql) this.p()).b.setPlayer(aleVar);
                this.k = new yx7(this, 27);
                xw3.L(wca.x(this.getLifecycle()), null, null, new bom(this, null), 3);
                return Unit.a;
            }
        }
        x6mVar = new x6m(this, sq3Var);
        Object obj2 = x6mVar.s;
        lu3 lu3Var2 = lu3.a;
        i = x6mVar.u;
        if (i != 0) {
        }
        aleVar = (ale) obj2;
        if (aleVar != null) {
        }
    }
}
