package com.inmobi.media;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.util.SparseArray;
import com.inmobi.ads.rendering.InMobiAdActivity;
import java.util.Map;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* renamed from: com.inmobi.media.mi, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C3604mi implements Ya {
    public final /* synthetic */ GestureDetectorOnGestureListenerC3889xi a;
    public final /* synthetic */ Context b;

    public C3604mi(GestureDetectorOnGestureListenerC3889xi gestureDetectorOnGestureListenerC3889xi, Context context) {
        this.a = gestureDetectorOnGestureListenerC3889xi;
        this.b = context;
    }

    @Override // com.inmobi.media.Ya
    public final void a(Intent intent) {
        intent.getClass();
        intent.putExtra("creativeId", this.a.getCreativeId());
        intent.putExtra("impressionId", this.a.getImpressionId());
        intent.putExtra("placementId", this.a.getPlacementId());
        intent.putExtra("isImmersive", this.a.X0);
        SparseArray sparseArray = InMobiAdActivity.t;
        GestureDetectorOnGestureListenerC3889xi gestureDetectorOnGestureListenerC3889xi = this.a;
        InMobiAdActivity.u = gestureDetectorOnGestureListenerC3889xi;
        if (gestureDetectorOnGestureListenerC3889xi.getPlacementType() != 0) {
            intent.putExtra("supportBrowserLoader", true);
            Context context = AbstractC3424fj.a;
            Context containerContext = this.a.getContainerContext();
            containerContext.getClass();
            if (!(containerContext instanceof Activity)) {
                intent.setFlags(268435456);
            }
            containerContext.startActivity(intent);
            return;
        }
        Context context2 = AbstractC3424fj.a;
        Activity activity = this.a.getBannerHolderActivity().get();
        if (activity == null) {
            activity = this.b;
        }
        activity.getClass();
        if (!(activity instanceof Activity)) {
            intent.setFlags(268435456);
        }
        activity.startActivity(intent);
    }

    @Override // com.inmobi.media.Ya
    public final void b(String str, String str2, String str3) {
        this.a.b(str, str2, str3);
    }

    @Override // com.inmobi.media.Ya
    public final void a(String str, String str2, String str3) {
        str2.getClass();
        this.a.a(str, str2, str3);
    }

    @Override // com.inmobi.media.Ya
    public final void a() {
        this.a.getListener().a();
    }

    @Override // com.inmobi.media.Ya
    public final void a(String str, Map map) {
        str.getClass();
        map.getClass();
        GestureDetectorOnGestureListenerC3889xi gestureDetectorOnGestureListenerC3889xi = this.a;
        if (gestureDetectorOnGestureListenerC3889xi.e) {
            return;
        }
        gestureDetectorOnGestureListenerC3889xi.b(str, map);
    }
}
