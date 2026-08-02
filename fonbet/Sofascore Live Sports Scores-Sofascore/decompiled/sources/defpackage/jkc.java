package defpackage;

import android.view.View;
import com.google.android.gms.ads.nativead.MediaView;
import com.mbridge.msdk.nativex.view.MBMediaView;
import com.mbridge.msdk.out.MBBidNativeHandler;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public final class jkc extends ekc {
    public MBBidNativeHandler w;

    @Override // com.google.android.gms.ads.mediation.UnifiedNativeAdMapper
    public final void trackViews(View view, Map map, Map map2) {
        HashMap hashMap = new HashMap(map);
        hashMap.remove("3011");
        hashMap.remove("3012");
        ArrayList arrayList = new ArrayList(hashMap.values());
        int i = 0;
        int i2 = 0;
        while (true) {
            if (i2 >= arrayList.size()) {
                break;
            }
            View view2 = (View) arrayList.get(i2);
            if (view2 instanceof MediaView) {
                MediaView mediaView = (MediaView) view2;
                while (true) {
                    if (i >= mediaView.getChildCount()) {
                        break;
                    }
                    View childAt = mediaView.getChildAt(i);
                    if (childAt instanceof MBMediaView) {
                        ((MBMediaView) childAt).setOnMediaViewListener(this);
                        break;
                    }
                    i++;
                }
            } else {
                i2++;
            }
        }
        MBBidNativeHandler mBBidNativeHandler = this.w;
        if (mBBidNativeHandler != null) {
            mBBidNativeHandler.registerView(view, arrayList, this.s);
        }
    }

    @Override // com.google.android.gms.ads.mediation.UnifiedNativeAdMapper
    public final void untrackView(View view) {
        MBBidNativeHandler mBBidNativeHandler = this.w;
        if (mBBidNativeHandler != null) {
            mBBidNativeHandler.unregisterView(view, ekc.a(view), this.s);
        }
    }
}
