package defpackage;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import com.inmobi.ads.InMobiAdRequestStatus;
import com.inmobi.media.AbstractC3349cl;
import com.inmobi.media.AbstractC3458h1;
import com.inmobi.media.AbstractC3587m1;
import com.inmobi.media.AbstractC3633nl;
import com.inmobi.media.C3829va;
import com.inmobi.media.GestureDetectorOnGestureListenerC3889xi;
import com.inmobi.unifiedId.InMobiUnifiedIdInterface;
import com.ironsource.C4022cc;
import com.ironsource.C4037d9;
import com.ironsource.C4051e5;
import com.ironsource.C4066f2;
import com.ironsource.C4185le;
import com.ironsource.C4221ne;
import com.ironsource.C4289rb;
import com.ironsource.C4424z2;
import com.ironsource.C4432za;
import com.ironsource.C4436ze;
import com.ironsource.V8;
import com.ironsource.mediationsdk.ads.nativead.AdapterNativeAdData;
import com.ironsource.mediationsdk.adunit.adapter.internal.nativead.AdapterNativeAdViewBinder;
import com.ironsource.mediationsdk.impressionData.ImpressionDataListener;
import com.ironsource.sdk.controller.v;
import com.mbridge.msdk.config.dynamic.binddata.wrapper.d;
import com.mbridge.msdk.config.manager.a;
import com.unity3d.mediation.LevelPlayAdError;
import com.unity3d.mediation.LevelPlayAdInfo;
import com.unity3d.mediation.LevelPlayInitListener;
import com.unity3d.mediation.LevelPlayInitRequest;
import com.vungle.ads.internal.downloader.h;
import com.vungle.ads.internal.downloader.k;
import com.vungle.ads.internal.load.i;
import com.vungle.ads.internal.load.j;
import com.vungle.ads.internal.model.i3;
import com.vungle.ads.internal.network.o;
import java.util.concurrent.CountDownLatch;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import org.json.JSONObject;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes4.dex */
public final /* synthetic */ class zol implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ zol(Context context, LevelPlayInitRequest levelPlayInitRequest, LevelPlayInitListener levelPlayInitListener) {
        this.a = 10;
        this.d = context;
        this.c = levelPlayInitRequest;
        this.b = levelPlayInitListener;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.a;
        Object obj = this.b;
        Object obj2 = this.d;
        Object obj3 = this.c;
        switch (i) {
            case 0:
                ((a) obj3).a((Context) obj2, (String) obj);
                break;
            case 1:
                ((d) obj3).a((String) obj, obj2);
                break;
            case 2:
                C4022cc.a((C4022cc) obj3, (AdapterNativeAdData) obj2, (AdapterNativeAdViewBinder) obj);
                break;
            case 3:
                AbstractC3349cl.a((AbstractC3587m1) obj3, (AbstractC3349cl) obj2, (InMobiAdRequestStatus) obj);
                break;
            case 4:
                C4066f2.a((C4066f2) obj3, (ImpressionDataListener) obj2, (V8) obj);
                break;
            case 5:
                h.a((k) obj3, (h) obj2, (com.vungle.ads.internal.downloader.d) obj);
                break;
            case 6:
                i.a((j) obj3, (i3) obj2, (o) obj);
                break;
            case 7:
                AbstractC3587m1.a((AbstractC3587m1) obj3, (GestureDetectorOnGestureListenerC3889xi) obj2, (String) obj);
                break;
            case 8:
                AbstractC3587m1.a((AbstractC3587m1) obj3, (Function0) obj2, (Function1) obj);
                break;
            case 9:
                AbstractC3633nl.b((InMobiUnifiedIdInterface) obj3, (JSONObject) obj2, (Error) obj);
                break;
            case 10:
                C4289rb.b((Context) obj2, (LevelPlayInitRequest) obj3, (LevelPlayInitListener) obj);
                break;
            case 11:
                C4289rb.a((C4221ne) obj3, (LevelPlayInitListener) obj2, (C4221ne) obj);
                break;
            case 12:
                C4289rb.a.a((LevelPlayInitListener) obj3, (C4051e5) obj2, (C4221ne) obj);
                break;
            case 13:
                ((v) obj3).a((Context) obj2, (CountDownLatch) obj);
                break;
            case 14:
                C3829va.a((C3829va) obj3, (GestureDetectorOnGestureListenerC3889xi) obj, (Context) obj2);
                break;
            case 15:
                C3829va.a((C3829va) obj3, (AbstractC3458h1) obj, (Context) obj2);
                break;
            case 16:
                C4424z2.a((C4424z2) obj3, (View) obj2, (FrameLayout.LayoutParams) obj);
                break;
            case 17:
                C4432za.a((LevelPlayAdInfo) obj3, (LevelPlayAdError) obj2, (C4432za) obj);
                break;
            case 18:
                C4436ze.d.a((C4436ze) obj3, (Context) obj2, (C4185le) obj);
                break;
            default:
                C4436ze.d.a((C4436ze) obj3, (C4221ne) obj2, (C4037d9) obj);
                break;
        }
    }

    public /* synthetic */ zol(int i, Object obj, Object obj2, Object obj3) {
        this.a = i;
        this.c = obj;
        this.d = obj2;
        this.b = obj3;
    }

    public /* synthetic */ zol(Object obj, Object obj2, Object obj3, boolean z, int i) {
        this.a = i;
        this.c = obj;
        this.b = obj2;
        this.d = obj3;
    }
}
