package defpackage;

import android.content.Context;
import com.sofascore.model.firebase.AdType;
import com.sofascore.model.newNetwork.EventMediaNews;
import com.sofascore.model.newNetwork.NewsProvider;
import com.sofascore.model.newNetwork.WSCStory;
import com.unity3d.services.UnityAdsConstants;
import com.vungle.ads.internal.protos.Sdk;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class xbc implements et8 {
    public final /* synthetic */ List a;
    public final /* synthetic */ Function1 b;
    public final /* synthetic */ wla c;
    public final /* synthetic */ List d;
    public final /* synthetic */ Context e;
    public final /* synthetic */ h4d f;
    public final /* synthetic */ cdi g;

    public xbc(List list, Function1 function1, wla wlaVar, List list2, Context context, h4d h4dVar, cdi cdiVar) {
        this.a = list;
        this.b = function1;
        this.c = wlaVar;
        this.d = list2;
        this.e = context;
        this.f = h4dVar;
        this.g = cdiVar;
    }

    @Override // defpackage.et8
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        int i;
        xpa xpaVar = (xpa) obj;
        int intValue = ((Number) obj2).intValue();
        of3 of3Var = (of3) obj3;
        int intValue2 = ((Number) obj4).intValue();
        if ((intValue2 & 6) == 0) {
            i = (((av8) of3Var).g(xpaVar) ? 4 : 2) | intValue2;
        } else {
            i = intValue2;
        }
        if ((intValue2 & 48) == 0) {
            i |= ((av8) of3Var).e(intValue) ? 32 : 16;
        }
        av8 av8Var = (av8) of3Var;
        if (av8Var.T(i & 1, (i & 147) != 146)) {
            Object obj5 = this.a.get(intValue);
            int i2 = i & Sdk.SDKError.Reason.ASSET_FAILED_INSUFFICIENT_SPACE_VALUE;
            g6c g6cVar = (g6c) obj5;
            av8Var.d0(1629182940);
            if (g6cVar instanceof r5c) {
                av8Var.d0(-1332919813);
                aba.e((r5c) g6cVar, this.b, null, av8Var, 0, 4);
                av8Var = av8Var;
                av8Var.s(false);
            } else {
                boolean z = g6cVar instanceof o5c;
                utc utcVar = utc.a;
                a99 a99Var = nf3.a;
                Context context = this.e;
                if (z) {
                    av8Var.d0(-1332915818);
                    o5c o5cVar = (o5c) g6cVar;
                    String q = dmi.q("wsc-", o5cVar.a.getId());
                    boolean g = av8Var.g(g6cVar) | av8Var.i(context);
                    Object O = av8Var.O();
                    if (g || O == a99Var) {
                        O = new pi(20, context, o5cVar);
                        av8Var.n0(O);
                    }
                    qea.j(o5cVar, this.b, tgj.S(utcVar, this.c, q, this.d, (Function0) O, av8Var, 6), false, null, av8Var, 0, 24);
                    av8Var.s(false);
                } else if (g6cVar instanceof n5c) {
                    av8Var.d0(1630139847);
                    n5c n5cVar = (n5c) g6cVar;
                    WSCStory wSCStory = n5cVar.a;
                    String q2 = dmi.q("wsc-", wSCStory.getId());
                    boolean g2 = av8Var.g(g6cVar) | av8Var.i(context);
                    Object O2 = av8Var.O();
                    if (g2 || O2 == a99Var) {
                        O2 = new pi(21, context, n5cVar);
                        av8Var.n0(O2);
                    }
                    oml.a(n5cVar, tgj.S(utcVar, this.c, q2, this.d, (Function0) O2, av8Var, 6), dmi.q("event_media_clips_widget_", wSCStory.getId()), ia9.MEDIA, false, null, null, av8Var, 3072, 112);
                    av8Var.s(false);
                } else if (g6cVar instanceof e6c) {
                    av8Var.d0(-1332859071);
                    x2a.p(((e6c) g6cVar).a, this.b, null, this.c, av8Var, 0);
                    av8Var = av8Var;
                    av8Var.s(false);
                } else {
                    boolean z2 = g6cVar instanceof w5c;
                    Function1 function1 = this.b;
                    if (z2) {
                        av8Var.d0(1631224041);
                        w5c w5cVar = (w5c) g6cVar;
                        EventMediaNews eventMediaNews = w5cVar.a;
                        int id = eventMediaNews.getId();
                        String thumbnailUrl = eventMediaNews.getThumbnailUrl();
                        String header = eventMediaNews.getHeader();
                        String description = eventMediaNews.getDescription();
                        Long publishedAtTimestamp = eventMediaNews.getPublishedAtTimestamp();
                        NewsProvider newsProvider = eventMediaNews.getNewsProvider();
                        boolean g3 = av8Var.g(function1) | av8Var.g(g6cVar);
                        Object O3 = av8Var.O();
                        if (g3 || O3 == a99Var) {
                            O3 = new kp1(8, function1, w5cVar);
                            av8Var.n0(O3);
                        }
                        wba.d(id, thumbnailUrl, header, publishedAtTimestamp, newsProvider, (Function2) O3, null, description, av8Var, 0, 64);
                        av8Var.s(false);
                    } else if (g6cVar instanceof a6c) {
                        av8Var.d0(-1332831148);
                        tba.d((a6c) g6cVar, function1, null, av8Var, 0);
                        av8Var.s(false);
                    } else if (g6cVar instanceof f5c) {
                        av8Var.d0(-1332827764);
                        b4d.a(intValue, AdType.Native.Media, (wg) ((tee) this.g.getValue()).get(Integer.valueOf(intValue)), this.f, l98.f0(utcVar, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 2.0f, 7), false, null, av8Var, ((i2 >> 3) & 14) | 24624, 96);
                        av8Var = av8Var;
                        av8Var.s(false);
                    } else {
                        if (!(g6cVar instanceof d6c)) {
                            throw dmi.h(av8Var, -1332919033, false);
                        }
                        av8Var.d0(1632429228);
                        av8Var.s(false);
                    }
                }
            }
            av8Var.s(false);
        } else {
            av8Var.W();
        }
        return Unit.a;
    }
}
