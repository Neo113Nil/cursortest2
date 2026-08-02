package defpackage;

import android.content.Context;
import android.text.TextUtils;
import com.google.android.gms.ads.AdError;
import com.google.android.gms.ads.VideoOptions;
import com.vungle.ads.NativeAd;
import com.vungle.ads.internal.ui.view.MediaView;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public final class vyk implements nyk {
    public final /* synthetic */ Context a;
    public final /* synthetic */ String b;
    public final /* synthetic */ int c;
    public final /* synthetic */ VideoOptions d;
    public final /* synthetic */ String e;
    public final /* synthetic */ xyk f;

    public vyk(xyk xykVar, Context context, String str, int i, VideoOptions videoOptions, String str2) {
        this.f = xykVar;
        this.a = context;
        this.b = str;
        this.c = i;
        this.d = videoOptions;
        this.e = str2;
    }

    @Override // defpackage.nyk
    public final void a(AdError adError) {
        adError.toString();
        this.f.s.onFailure(adError);
    }

    @Override // defpackage.nyk
    public final void b() {
        xyk xykVar = this.f;
        xykVar.x.getClass();
        Context context = this.a;
        context.getClass();
        String str = this.b;
        str.getClass();
        NativeAd nativeAd = new NativeAd(context, str);
        xykVar.u = nativeAd;
        nativeAd.setAdOptionsPosition(this.c);
        xykVar.u.setAdListener(xykVar);
        xykVar.u.setAdapterAdFormat("VungleRtbNativeAd");
        VideoOptions videoOptions = this.d;
        if (videoOptions != null) {
            xykVar.u.getVideoOptions().setStartMuted(Boolean.valueOf(videoOptions.getStartMuted()));
        }
        xykVar.v = new MediaView(context);
        String str2 = this.e;
        if (!TextUtils.isEmpty(str2)) {
            xykVar.u.getAdConfig().setWatermark(str2);
        }
        xykVar.u.load(xykVar.w);
    }
}
