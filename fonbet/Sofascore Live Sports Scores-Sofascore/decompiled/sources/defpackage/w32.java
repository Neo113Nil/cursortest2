package defpackage;

import android.app.Activity;
import android.content.Context;
import android.graphics.Bitmap;
import android.net.Uri;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.core.app.NotificationCompat;
import com.android.billingclient.api.BillingClient;
import com.android.billingclient.api.BillingFlowParams;
import com.android.billingclient.api.ProductDetails;
import com.appsflyer.f;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.VastActivity;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.d1;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.c0;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.s;
import java.lang.ref.WeakReference;
import java.time.Instant;
import java.time.ZoneId;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.UUID;
import kotlin.Unit;
import kotlin.collections.a;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.text.StringsKt;
import org.xmlpull.v1.XmlPullParser;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class w32 extends hoi implements Function2 {
    public final /* synthetic */ int r;
    public /* synthetic */ Object s;
    public final /* synthetic */ Object t;
    public final /* synthetic */ Object u;
    public final /* synthetic */ Object v;
    public final /* synthetic */ Object w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ w32(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, rq3 rq3Var, int i) {
        super(2, rq3Var);
        this.r = i;
        this.s = obj;
        this.t = obj2;
        this.u = obj3;
        this.v = obj4;
        this.w = obj5;
    }

    @Override // defpackage.h21
    public final rq3 create(Object obj, rq3 rq3Var) {
        int i = this.r;
        Object obj2 = this.w;
        Object obj3 = this.v;
        Object obj4 = this.u;
        Object obj5 = this.t;
        switch (i) {
            case 0:
                w32 w32Var = new w32((x32) obj5, (wdd) obj4, (y1) obj3, (mi) obj2, rq3Var, 0);
                w32Var.s = obj;
                return w32Var;
            case 1:
                return new w32((lcd) this.s, (Bitmap) obj5, (u53) obj4, (Map) obj3, (pkk) obj2, rq3Var, 1);
            case 2:
                return new w32((Long) this.s, (kg2) obj5, (qg4) obj4, (Locale) obj3, (e1d) obj2, rq3Var, 2);
            case 3:
                return new w32((WeakReference) this.s, (BillingClient) obj5, (bli) obj4, (ProductDetails) obj3, (String) obj2, rq3Var, 3);
            case 4:
                return new w32((Context) this.s, (String) obj5, (e1d) obj4, (e1d) obj3, (Function1) obj2, rq3Var, 4);
            case 5:
                w32 w32Var2 = new w32((f) obj5, (Context) obj4, (s) obj3, (String) obj2, rq3Var, 5);
                w32Var2.s = obj;
                return w32Var2;
            default:
                w32 w32Var3 = new w32((XmlPullParser) obj5, rq3Var, (fsf) obj4, (fsf) obj3, (fsf) obj2);
                w32Var3.s = obj;
                return w32Var3;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        ku3 ku3Var = (ku3) obj;
        rq3 rq3Var = (rq3) obj2;
        switch (this.r) {
        }
        return ((w32) create(ku3Var, rq3Var)).invokeSuspend(Unit.a);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue
    java.lang.NullPointerException
     */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0131  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0136  */
    @Override // defpackage.h21
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        ale aleVar;
        String text;
        c0 c0Var;
        int i = this.r;
        int i2 = 2;
        boolean z = true;
        Object obj2 = this.u;
        Object obj3 = this.w;
        Object obj4 = this.v;
        Object obj5 = this.t;
        switch (i) {
            case 0:
                lu3 lu3Var = lu3.a;
                y6a.M(obj);
                ku3 ku3Var = (ku3) this.s;
                x32 x32Var = (x32) obj5;
                rq3 rq3Var = null;
                xw3.L(ku3Var, null, null, new g2(x32Var, (wdd) obj2, (y1) obj4, rq3Var, 16), 3);
                return xw3.L(ku3Var, null, null, new hy1(x32Var, (mi) obj3, rq3Var, i2), 3);
            case 1:
                lu3 lu3Var2 = lu3.a;
                y6a.M(obj);
                lcd lcdVar = (lcd) this.s;
                ImageView imageView = new ImageView(lcdVar.getContext());
                u53 u53Var = (u53) obj2;
                Map map = (Map) obj4;
                pkk pkkVar = (pkk) obj3;
                imageView.setImageBitmap((Bitmap) obj5);
                imageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
                xkk xkkVar = (xkk) u53Var.i;
                imageView.setLayoutParams(new FrameLayout.LayoutParams(xkkVar != null ? xkkVar.h : -1, xkkVar != null ? xkkVar.i : -1, 17));
                lcdVar.addView(imageView);
                g7a.v((olk) u53Var.c, 14, map);
                imageView.setOnClickListener(new q53(u53Var, lcdVar, pkkVar, 1));
                return Unit.a;
            case 2:
                lu3 lu3Var3 = lu3.a;
                y6a.M(obj);
                Long l = (Long) this.s;
                if (l != null) {
                    e1d e1dVar = (e1d) obj3;
                    long longValue = l.longValue();
                    String str = ((qg4) obj2).c;
                    ZoneId zoneId = kg2.e;
                    String format = Instant.ofEpochMilli(longValue).atZone(kg2.e).toLocalDate().format(rfo.C(str, (Locale) obj4, ((kg2) obj5).b));
                    wcj wcjVar = new wcj(4, format.length() == 0 ? pej.b : t6a.g(format.length(), format.length()), format);
                    t3e t3eVar = vg4.a;
                    e1dVar.setValue(wcjVar);
                }
                return Unit.a;
            case 3:
                lu3 lu3Var4 = lu3.a;
                y6a.M(obj);
                Activity activity = (Activity) ((WeakReference) this.s).get();
                if (activity != null) {
                    LinkedHashMap linkedHashMap = bli.s;
                    BillingFlowParams build = BillingFlowParams.newBuilder().setProductDetailsParamsList(a.c(BillingFlowParams.ProductDetailsParams.newBuilder().setProductDetails((ProductDetails) obj4).setOfferToken((String) obj3).build())).build();
                    build.getClass();
                    ((BillingClient) obj5).launchBillingFlow(activity, build);
                }
                return Unit.a;
            case 4:
                e1d e1dVar2 = (e1d) obj4;
                lu3 lu3Var5 = lu3.a;
                y6a.M(obj);
                e1d e1dVar3 = (e1d) obj2;
                if (((qqk) e1dVar3.getValue()) == qqk.b) {
                    if (((ale) e1dVar2.getValue()) != null && (aleVar = (ale) e1dVar2.getValue()) != null) {
                        aleVar.release();
                    }
                    Context context = (Context) this.s;
                    mth mthVar = new mth((Function1) obj3, e1dVar3, e1dVar2);
                    tra traVar = new tra(27, e1dVar3);
                    tra traVar2 = new tra(28, e1dVar3);
                    tra traVar3 = new tra(29, e1dVar3);
                    vg6 a = new wf6(context).a();
                    b78 b78Var = new b78();
                    p5c p5cVar = new p5c(0);
                    List list = Collections.EMPTY_LIST;
                    av9 av9Var = hv9.b;
                    vvf vvfVar = vvf.e;
                    s5c s5cVar = new s5c();
                    z5c z5cVar = z5c.a;
                    Uri parse = Uri.parse((String) obj5);
                    parse.getClass();
                    if (((Uri) p5cVar.c) != null && ((UUID) p5cVar.b) == null) {
                        z = false;
                    }
                    z1a.E(z);
                    a.l(new h6c("", new m5c(b78Var), new v5c(parse, null, ((UUID) p5cVar.b) != null ? new q5c(p5cVar) : null, null, list, null, vvfVar, C.TIME_UNSET), new u5c(s5cVar), q6c.D, z5cVar));
                    a.m.a(new pqk(traVar, mthVar, traVar2, traVar3));
                    a.setRepeatMode(0);
                    a.a();
                    e1dVar2.setValue(a);
                }
                return Unit.a;
            case 5:
                lu3 lu3Var6 = lu3.a;
                y6a.M(obj);
                ku3 ku3Var2 = (ku3) this.s;
                aeh aehVar = VastActivity.e;
                rq3 rq3Var2 = null;
                VastActivity.j = xw3.L(ku3Var2, null, null, new luj((f) obj5, rq3Var2, 23), 3);
                return xw3.L(ku3Var2, null, null, new ccj((Context) obj2, (s) obj4, (String) obj3, rq3Var2, 7), 3);
            default:
                lu3 lu3Var7 = lu3.a;
                y6a.M(obj);
                s9a.t((ku3) this.s);
                XmlPullParser xmlPullParser = (XmlPullParser) obj5;
                if (d1.B(xmlPullParser)) {
                    xmlPullParser.nextTag();
                }
                if (xmlPullParser.getEventType() == 1) {
                    return Unit.a;
                }
                if (xmlPullParser.getEventType() != 2) {
                    pvd.r("iterateCurrentTagEvents call is allowed only for START_TAG event");
                    return null;
                }
                int depth = xmlPullParser.getDepth();
                while (xmlPullParser.getDepth() >= depth) {
                    int depth2 = xmlPullParser.getDepth() - depth;
                    if (depth2 != 0) {
                        if (depth2 == 1) {
                            d1.C(xmlPullParser);
                        }
                    } else if (xmlPullParser.getEventType() == 2) {
                        fsf fsfVar = (fsf) obj2;
                        String u = d1.u(xmlPullParser, "event");
                        if (u != null) {
                            switch (u.hashCode()) {
                                case -1638835128:
                                    if (u.equals(CampaignEx.JSON_NATIVE_VIDEO_MIDPOINT)) {
                                        c0Var = c0.d;
                                        break;
                                    }
                                    break;
                                case -1337830390:
                                    if (u.equals("thirdQuartile")) {
                                        c0Var = c0.e;
                                        break;
                                    }
                                    break;
                                case -1001078227:
                                    if (u.equals(NotificationCompat.CATEGORY_PROGRESS)) {
                                        c0Var = c0.n;
                                        break;
                                    }
                                    break;
                                case -934426579:
                                    if (u.equals(CampaignEx.JSON_NATIVE_VIDEO_RESUME)) {
                                        c0Var = c0.k;
                                        break;
                                    }
                                    break;
                                case -934318917:
                                    if (u.equals("rewind")) {
                                        c0Var = c0.j;
                                        break;
                                    }
                                    break;
                                case -840405966:
                                    if (u.equals(CampaignEx.JSON_NATIVE_VIDEO_UNMUTE)) {
                                        c0Var = c0.h;
                                        break;
                                    }
                                    break;
                                case -599445191:
                                    if (u.equals(CampaignEx.JSON_NATIVE_VIDEO_COMPLETE)) {
                                        c0Var = c0.f;
                                        break;
                                    }
                                    break;
                                case -37683395:
                                    if (u.equals("closeLinear")) {
                                        c0Var = c0.l;
                                        break;
                                    }
                                    break;
                                case 3363353:
                                    if (u.equals(CampaignEx.JSON_NATIVE_VIDEO_MUTE)) {
                                        c0Var = c0.g;
                                        break;
                                    }
                                    break;
                                case 3532159:
                                    if (u.equals("skip")) {
                                        c0Var = c0.m;
                                        break;
                                    }
                                    break;
                                case 106440182:
                                    if (u.equals(CampaignEx.JSON_NATIVE_VIDEO_PAUSE)) {
                                        c0Var = c0.i;
                                        break;
                                    }
                                    break;
                                case 109757538:
                                    if (u.equals("start")) {
                                        c0Var = c0.b;
                                        break;
                                    }
                                    break;
                                case 560220243:
                                    if (u.equals("firstQuartile")) {
                                        c0Var = c0.c;
                                        break;
                                    }
                                    break;
                                case 1778167540:
                                    if (u.equals("creativeView")) {
                                        c0Var = c0.a;
                                        break;
                                    }
                                    break;
                            }
                            fsfVar.a = c0Var;
                            fsf fsfVar2 = (fsf) obj4;
                            String u2 = d1.u(xmlPullParser, "offset");
                            fsfVar2.a = u2 == null ? d1.y(u2) : null;
                        }
                        c0Var = null;
                        fsfVar.a = c0Var;
                        fsf fsfVar22 = (fsf) obj4;
                        String u22 = d1.u(xmlPullParser, "offset");
                        fsfVar22.a = u22 == null ? d1.y(u22) : null;
                    } else if (xmlPullParser.getEventType() == 4 && (text = xmlPullParser.getText()) != null && !StringsKt.R(text)) {
                        String text2 = xmlPullParser.getText();
                        text2.getClass();
                        ((fsf) obj3).a = StringsKt.l0(text2).toString();
                    } else if (xmlPullParser.getEventType() == 3) {
                        return Unit.a;
                    }
                    xmlPullParser.next();
                }
                return Unit.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ w32(Object obj, Object obj2, Object obj3, Object obj4, rq3 rq3Var, int i) {
        super(2, rq3Var);
        this.r = i;
        this.t = obj;
        this.u = obj2;
        this.v = obj3;
        this.w = obj4;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w32(XmlPullParser xmlPullParser, rq3 rq3Var, fsf fsfVar, fsf fsfVar2, fsf fsfVar3) {
        super(2, rq3Var);
        this.r = 6;
        this.t = xmlPullParser;
        this.u = fsfVar;
        this.v = fsfVar2;
        this.w = fsfVar3;
    }
}
