package defpackage;

import com.blaze.blazesdk.ads.ima.BlazeImaHandler;
import com.blaze.blazesdk.ads.models.ui.BlazeContentExtraInfo;
import com.blaze.blazesdk.analytics.enums.ContentType;
import com.blaze.blazesdk.analytics.enums.WidgetType;
import com.blaze.blazesdk.players.models.c;
import com.blaze.blazesdk.shared.BlazeSDK;
import kotlin.Unit;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class x8m extends x5m {
    public final BlazeImaHandler c;
    public String d;
    public String e;
    public String f;
    public WidgetType g;
    public ContentType h;
    public String i;
    public BlazeContentExtraInfo j;
    public String k;
    public String l;
    public String m;
    public String n;
    public String o;
    public String p;
    public final a q;
    public final xdh r;
    public c s;
    public ale t;

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    public static final class a implements z88 {
        public final /* synthetic */ z88 a;

        public a(z88 z88Var) {
            this.a = z88Var;
        }

        @Override // defpackage.z88
        public final Object collect(b98 b98Var, rq3 rq3Var) {
            Object collect = this.a.collect(new m6m(b98Var), rq3Var);
            return collect == lu3.a ? collect : Unit.a;
        }
    }

    public x8m() {
        xdh imaAdEvent;
        BlazeImaHandler imaHandler$blazesdk_release = BlazeSDK.INSTANCE.getImaHandler$blazesdk_release();
        this.c = imaHandler$blazesdk_release;
        this.q = (imaHandler$blazesdk_release == null || (imaAdEvent = imaHandler$blazesdk_release.getImaAdEvent()) == null) ? null : new a(new v98(imaAdEvent, new ozl(this, null), 3));
        this.r = imaHandler$blazesdk_release != null ? imaHandler$blazesdk_release.getAdErrorEvent() : null;
    }

    @Override // defpackage.ltk
    public final void e() {
        ale aleVar = this.t;
        if (aleVar != null) {
            aleVar.release();
        }
        this.t = null;
        BlazeImaHandler blazeImaHandler = this.c;
        if (blazeImaHandler != null) {
            blazeImaHandler.release();
        }
    }
}
