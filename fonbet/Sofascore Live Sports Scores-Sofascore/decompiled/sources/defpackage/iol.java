package defpackage;

import android.os.Bundle;
import androidx.fragment.app.s;
import com.blaze.blazesdk.analytics.enums.EventActionName;
import com.blaze.blazesdk.closed_captions.models.ui.e;
import com.blaze.blazesdk.custom_views.BlazeRecyclerView;
import com.blaze.blazesdk.delegates.models.BlazePlayerType;
import com.blaze.blazesdk.features.shared.models.ui_shared.BlazeLiveStreamEdgeState;
import com.blaze.blazesdk.follow.models.BlazeFollowEntityType;
import com.blaze.blazesdk.players.ui.n;
import com.blaze.blazesdk.shared.BlazeSDK;
import com.blaze.blazesdk.style.shared.models.BlazePlayerCustomActionButtonParams;
import com.inmobi.media.AbstractC3830vb;
import com.inmobi.media.C3334c6;
import com.inmobi.media.C3360d6;
import com.inmobi.media.C3381e2;
import com.inmobi.media.C3704qe;
import com.inmobi.media.C3782tf;
import com.inmobi.media.C3804ub;
import com.inmobi.media.C3829va;
import com.inmobi.media.C3928z5;
import com.inmobi.media.C3930z7;
import com.inmobi.media.EnumC3489i6;
import com.inmobi.media.GestureDetectorOnGestureListenerC3889xi;
import com.inmobi.media.He;
import com.inmobi.media.Tf;
import com.inmobi.media.W;
import com.inmobi.media.Z;
import com.ironsource.C4376w8;
import com.ironsource.sdk.controller.v;
import com.unity3d.services.UnityAdsConstants;
import defpackage.aim;
import defpackage.gim;
import defpackage.hzl;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Unit;
import kotlin.collections.a;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public final /* synthetic */ class iol implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ iol(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        List list;
        glm a;
        bvm bvmVar;
        String str;
        String sourceIdForTabsDelegate;
        gim gimVar;
        Object d;
        int i = this.a;
        ArrayList arrayList = null;
        r4 = null;
        Map<String, ? extends Object> map = null;
        arrayList = null;
        Object obj2 = this.b;
        switch (i) {
            case 0:
                return Z.a((Z) obj2, (W) obj);
            case 1:
                BlazeRecyclerView blazeRecyclerView = (BlazeRecyclerView) obj2;
                float floatValue = ((Float) obj).floatValue();
                int i2 = -((int) floatValue);
                if (blazeRecyclerView.canScrollHorizontally(i2)) {
                    blazeRecyclerView.scrollBy(i2, 0);
                } else {
                    floatValue = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
                }
                return Float.valueOf(floatValue);
            case 2:
                hzl.b bVar = (hzl.b) obj2;
                hzl.b bVar2 = (hzl.b) obj;
                fvl fvlVar = hzl.l;
                bVar2.getClass();
                return Boolean.valueOf(bVar2 == bVar);
            case 3:
                return C3334c6.a((C3334c6) obj2, (String) obj);
            case 4:
                return C3360d6.a((C3360d6) obj2, (JSONObject) obj);
            case 5:
                n4m n4mVar = (n4m) obj;
                n4mVar.getClass();
                if (((AtomicBoolean) obj2).getAndSet(false) && (list = n4mVar.t) != null) {
                    arrayList = new ArrayList(k13.r(list, 10));
                    Iterator it = list.iterator();
                    while (it.hasNext()) {
                        arrayList.add(((glm) it.next()).a.a);
                    }
                }
                return arrayList;
            case 6:
                n4m n4mVar2 = (n4m) obj;
                n4mVar2.getClass();
                BlazeFollowEntityType blazeFollowEntityType = ((aim.a) ((aim) obj2)).a;
                if (BlazeSDK.INSTANCE.getFollowEntitiesInternal$blazesdk_release() == null || (a = jsl.a(n4mVar2.t, blazeFollowEntityType)) == null || (bvmVar = a.a) == null || (str = bvmVar.a) == null) {
                    return null;
                }
                return a.c(str);
            case 7:
                return C3381e2.a((C3381e2) obj2, (EnumC3489i6) obj);
            case 8:
                s1m s1mVar = (s1m) obj2;
                if (((Throwable) obj) == null) {
                    pgm pgmVar = pgm.a;
                    String str2 = s1mVar.a;
                    pgmVar.getClass();
                    xw3.L(pgm.c, null, null, new c5m(s1mVar, null), 3);
                } else {
                    pgm pgmVar2 = pgm.a;
                }
                return Unit.a;
            case 9:
                String str3 = (String) obj;
                crl crlVar = ((zgm) obj2).k;
                if (crlVar == null) {
                    return null;
                }
                sourceIdForTabsDelegate = ((brl) crlVar).a.getSourceIdForTabsDelegate(str3);
                return sourceIdForTabsDelegate;
            case 10:
                BlazePlayerCustomActionButtonParams blazePlayerCustomActionButtonParams = (BlazePlayerCustomActionButtonParams) obj;
                boolean z = efm.j;
                blazePlayerCustomActionButtonParams.getClass();
                obm obmVar = (obm) ((efm) obj2).c;
                obmVar.getClass();
                ilm ilmVar = (ilm) obmVar.getViewModel();
                String name = blazePlayerCustomActionButtonParams.getName();
                ilmVar.getClass();
                name.getClass();
                try {
                    n4m D = ilmVar.D();
                    gim gimVar2 = D != null ? D.b : null;
                    if (gimVar2 instanceof gim.d) {
                        jom.e(ilmVar, EventActionName.CUSTOM_ACTION_BUTTON_CLICK, jom.createStoryPlayerProps$default(ilmVar, (gim.d) gimVar2, null, null, null, null, null, false, null, name, null, 766, null));
                    }
                } catch (Throwable th) {
                    BlazeSDK.INSTANCE.getGlobalThrowableCatcher$blazesdk_release().invoke(th, null);
                }
                n4m D2 = ((ilm) obmVar.getViewModel()).D();
                if (D2 != null && (gimVar = D2.b) != null) {
                    map = yjm.mergedExtraInfo$default(gimVar, null, 1, null);
                }
                if (map != null) {
                    blazePlayerCustomActionButtonParams.enrichSDKMetadata$blazesdk_release(map);
                }
                obmVar.k(blazePlayerCustomActionButtonParams, BlazePlayerType.STORIES);
                return Unit.a;
            case 11:
                acm acmVar = (acm) obj;
                acmVar.getClass();
                return Boolean.valueOf(Intrinsics.c(acmVar.a(), (e) obj2));
            case 12:
                n nVar = (n) obj2;
                e eVar = (e) obj;
                ((tkm) nVar.q.getValue()).b.getClass();
                pc2.b = eVar;
                BlazeSDK blazeSDK = BlazeSDK.INSTANCE;
                evl.dispatchOnIO$default(blazeSDK, null, new dum("blaze_data_store_selected_language_model_key", eVar, null), 1, null);
                if (eVar != null) {
                    evl.dispatchOnIO$default(blazeSDK, null, new dum("blaze_data_store_recently_selected_language_model_key", eVar, null), 1, null);
                }
                s parentFragmentManager = nVar.getParentFragmentManager();
                Bundle bundle = new Bundle();
                bundle.putBoolean("selectedLanguageEvent", true);
                Unit unit = Unit.a;
                parentFragmentManager.h0(bundle, "ClosedCaptionBottomSheetRequestKey");
                nVar.k(false, false);
                return unit;
            case 13:
                return C3704qe.a((He) obj2, ((Short) obj).shortValue());
            case 14:
                return C3782tf.a((C3782tf) obj2, (Throwable) obj);
            case 15:
                return C3804ub.a((AbstractC3830vb) obj2, (W) obj);
            case 16:
                d = ((v) obj2).d((C4376w8) obj);
                return d;
            case 17:
                return C3829va.a((C3829va) obj2, (EnumC3489i6) obj);
            case 18:
                uxm uxmVar = (uxm) obj;
                boolean z2 = e0n.n;
                uxmVar.getClass();
                uxmVar.g.updateState((BlazeLiveStreamEdgeState) obj2);
                return Unit.a;
            case 19:
                return GestureDetectorOnGestureListenerC3889xi.a((GestureDetectorOnGestureListenerC3889xi) obj2, ((Boolean) obj).booleanValue());
            case 20:
                return C3928z5.a((C3928z5) obj2, (Throwable) obj);
            default:
                return C3930z7.a((Tf) obj2, (GestureDetectorOnGestureListenerC3889xi) obj);
        }
    }
}
