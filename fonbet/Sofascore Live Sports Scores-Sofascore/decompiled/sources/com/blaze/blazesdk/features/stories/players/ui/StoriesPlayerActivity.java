package com.blaze.blazesdk.features.stories.players.ui;

import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import com.blaze.blazesdk.analytics.enums.WidgetType;
import com.blaze.blazesdk.features.stories.models.args.b;
import com.blaze.blazesdk.players.models.B;
import com.blaze.blazesdk.players.ui.k;
import com.blaze.blazesdk.prefetch.models.BlazeCachingLevel;
import com.blaze.blazesdk.shared.BlazeSDK;
import com.blaze.blazesdk.style.players.stories.BlazeStoryPlayerStyle;
import defpackage.arl;
import defpackage.evl;
import defpackage.g2i;
import defpackage.n0n;
import defpackage.obm;
import defpackage.pnm;
import defpackage.rsm;
import defpackage.sim;
import defpackage.sxm;
import defpackage.wvl;
import defpackage.wzl;
import defpackage.y0m;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0005B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Lcom/blaze/blazesdk/features/stories/players/ui/StoriesPlayerActivity;", "Lcom/blaze/blazesdk/players/ui/k;", "Lsim;", "<init>", "()V", "a", "blazesdk_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public final class StoriesPlayerActivity extends k {
    public static final a n = new a(null);
    public obm m;

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    public static final class a {
        public a(DefaultConstructorMarker defaultConstructorMarker) {
        }

        public static void a(Context context, com.blaze.blazesdk.features.stories.models.args.a aVar) {
            context.getClass();
            context.startActivity(new Intent(context, (Class<?>) StoriesPlayerActivity.class).putExtra("StoriesPlayerActivityArgs", aVar).addFlags(131072));
            rsm rsmVar = rsm.a;
            BlazeSDK blazeSDK = BlazeSDK.INSTANCE;
            evl.dispatchOnMain$default(blazeSDK, null, new pnm(null), 1, null);
            n0n n0nVar = n0n.a;
            evl.dispatchOnMain$default(blazeSDK, null, new sxm(null), 1, null);
        }
    }

    public StoriesPlayerActivity() {
        super(wvl.b);
    }

    @Override // com.blaze.blazesdk.players.ui.k, com.blaze.blazesdk.base_classes.a, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        arl.a(this);
        getOnBackPressedDispatcher().a(this, new wzl(this));
        this.k = new g2i(this, 11);
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
        return y0mVar == y0m.DISMISS_STORIES_PLAYER;
    }

    public final void r(Bundle bundle) {
        Parcelable parcelable;
        obm obmVar = this.m;
        if (obmVar != null) {
            obmVar.x();
        }
        Bundle extras = getIntent().getExtras();
        if (extras != null) {
            if (Build.VERSION.SDK_INT > 33) {
                parcelable = (Parcelable) extras.getParcelable("StoriesPlayerActivityArgs", com.blaze.blazesdk.features.stories.models.args.a.class);
            } else {
                Parcelable parcelable2 = extras.getParcelable("StoriesPlayerActivityArgs");
                if (!(parcelable2 instanceof com.blaze.blazesdk.features.stories.models.args.a)) {
                    parcelable2 = null;
                }
                parcelable = (com.blaze.blazesdk.features.stories.models.args.a) parcelable2;
            }
            com.blaze.blazesdk.features.stories.models.args.a aVar = (com.blaze.blazesdk.features.stories.models.args.a) parcelable;
            if (aVar != null) {
                B b = aVar.f;
                BlazeStoryPlayerStyle blazeStoryPlayerStyle = aVar.a;
                WidgetType widgetType = aVar.e;
                String str = aVar.b;
                String str2 = aVar.c;
                String str3 = aVar.d;
                BlazeCachingLevel blazeCachingLevel = aVar.k;
                boolean z = aVar.j;
                String str4 = aVar.i;
                obm obmVar2 = new obm(this, new b(blazeStoryPlayerStyle, str, str2, str3, widgetType, b, aVar.g, blazeCachingLevel, aVar.h, str4, z, aVar.l, aVar.m), bundle, this, this);
                this.m = obmVar2;
                ((sim) p()).b.addView(obmVar2);
            }
        }
    }
}
