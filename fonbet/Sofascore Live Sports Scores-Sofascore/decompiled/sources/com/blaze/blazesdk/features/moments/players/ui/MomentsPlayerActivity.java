package com.blaze.blazesdk.features.moments.players.ui;

import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import com.blaze.blazesdk.analytics.enums.WidgetType;
import com.blaze.blazesdk.features.moments.models.args.b;
import com.blaze.blazesdk.players.models.B;
import com.blaze.blazesdk.players.ui.k;
import com.blaze.blazesdk.prefetch.models.BlazeCachingLevel;
import com.blaze.blazesdk.shared.BlazeSDK;
import com.blaze.blazesdk.style.players.moments.BlazeMomentsPlayerStyle;
import defpackage.arl;
import defpackage.bum;
import defpackage.bxm;
import defpackage.evl;
import defpackage.ivl;
import defpackage.kzl;
import defpackage.mnc;
import defpackage.n0n;
import defpackage.sim;
import defpackage.sxm;
import defpackage.syl;
import defpackage.y0m;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0005B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Lcom/blaze/blazesdk/features/moments/players/ui/MomentsPlayerActivity;", "Lcom/blaze/blazesdk/players/ui/k;", "Lsim;", "<init>", "()V", "a", "blazesdk_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public final class MomentsPlayerActivity extends k {
    public static final a n = new a(null);
    public syl m;

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    public static final class a {
        public a(DefaultConstructorMarker defaultConstructorMarker) {
        }

        public static void a(Context context, com.blaze.blazesdk.features.moments.models.args.a aVar) {
            context.getClass();
            context.startActivity(new Intent(context, (Class<?>) MomentsPlayerActivity.class).putExtra("momentsPlayerActivityArgs", aVar).addFlags(131072));
            bxm bxmVar = bxm.a;
            BlazeSDK blazeSDK = BlazeSDK.INSTANCE;
            evl.dispatchOnMain$default(blazeSDK, null, new bum(null), 1, null);
            n0n n0nVar = n0n.a;
            evl.dispatchOnMain$default(blazeSDK, null, new sxm(null), 1, null);
        }
    }

    public MomentsPlayerActivity() {
        super(ivl.b);
    }

    @Override // com.blaze.blazesdk.players.ui.k, com.blaze.blazesdk.base_classes.a, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        arl.a(this);
        getOnBackPressedDispatcher().a(this, new kzl(this));
        this.k = new mnc(this, 8);
        r(bundle);
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public final void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        setIntent(intent);
        r(null);
    }

    @Override // com.blaze.blazesdk.players.ui.k
    public final boolean q(y0m y0mVar) {
        y0mVar.getClass();
        return y0mVar == y0m.DISMISS_MOMENTS_PLAYER;
    }

    public final void r(Bundle bundle) {
        Parcelable parcelable;
        syl sylVar = this.m;
        if (sylVar != null) {
            sylVar.x();
        }
        Bundle extras = getIntent().getExtras();
        if (extras != null) {
            if (Build.VERSION.SDK_INT > 33) {
                parcelable = (Parcelable) extras.getParcelable("momentsPlayerActivityArgs", com.blaze.blazesdk.features.moments.models.args.a.class);
            } else {
                Parcelable parcelable2 = extras.getParcelable("momentsPlayerActivityArgs");
                if (!(parcelable2 instanceof com.blaze.blazesdk.features.moments.models.args.a)) {
                    parcelable2 = null;
                }
                parcelable = (com.blaze.blazesdk.features.moments.models.args.a) parcelable2;
            }
            com.blaze.blazesdk.features.moments.models.args.a aVar = (com.blaze.blazesdk.features.moments.models.args.a) parcelable;
            if (aVar != null) {
                BlazeMomentsPlayerStyle blazeMomentsPlayerStyle = aVar.a;
                String str = aVar.b;
                String str2 = aVar.c;
                WidgetType widgetType = aVar.e;
                B b = aVar.f;
                String str3 = aVar.h;
                boolean z = aVar.i;
                BlazeCachingLevel blazeCachingLevel = aVar.j;
                boolean z2 = aVar.k;
                syl sylVar2 = new syl(this, new b(blazeMomentsPlayerStyle, str, str2, aVar.d, widgetType, b, aVar.g, str3, z, blazeCachingLevel, z2, aVar.l, aVar.m, aVar.n), bundle, this, this);
                this.m = sylVar2;
                ((sim) p()).b.addView(sylVar2);
            }
        }
    }
}
