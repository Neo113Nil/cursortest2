package com.vk.ecomm.catalog.impl.geo;

import android.text.TextPaint;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.vk.api.generated.market.dto.MarketGeoSuggestTypesDto;
import com.vk.dto.common.im.ImageList;
import com.vk.movika.sdk.base.model.o;
import com.vk.movika.sdk.base.model.p;
import io.reactivex.rxjava3.internal.operators.observable.m1;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.EmptyList;
import kotlin.text.Regex;
import xsna.c5g;
import xsna.drm0;
import xsna.epx;
import xsna.er;
import xsna.g5g;
import xsna.izs;
import xsna.j5g;
import xsna.leg;
import xsna.lk5;
import xsna.nou;
import xsna.pjw;
import xsna.q420;
import xsna.qtd0;
import xsna.rsg0;
import xsna.tfx;
import xsna.usi0;
import xsna.yd10;
import xsna.yfb;
import xsna.zgc;

/* compiled from: ClassifiedsGeoInteractor.kt */
/* loaded from: classes18.dex */
public final class a implements lk5, nou, pjw {
    public final Object b;

    public a(com.vk.movika.sdk.base.logic.a aVar, com.vk.movika.sdk.base.logic.b bVar) {
        this.b = aVar;
    }

    public o a(o oVar, izs izsVar) {
        com.vk.movika.sdk.base.model.history.c cVar = (com.vk.movika.sdk.base.model.history.c) j5g.k0(oVar.g);
        if (cVar == null) {
            return a(d(oVar, null), izsVar);
        }
        return o.a(oVar, null, j5g.v0(com.vk.movika.sdk.base.model.history.c.a((com.vk.movika.sdk.base.model.history.c) izsVar.invoke(cVar), com.vk.movika.sdk.utils.a.a(new Date()), null, null, null, 59), j5g.s0(oVar.g, cVar)), null, 191);
    }

    @Override // xsna.lk5
    public String b() {
        q420 q420Var = ((leg) this.b).l;
        if (q420Var == null) {
            q420Var = null;
        }
        String obj = drm0.p0(q420Var.b()).toString();
        Regex regex = leg.q;
        return regex.a(obj) ? drm0.p0(regex.g(obj, "")).toString() : obj;
    }

    @Override // xsna.nou
    public Iterator c() {
        return ((Iterable) this.b).iterator();
    }

    public o d(o oVar, String str) {
        Object obj;
        List<com.vk.movika.sdk.base.model.history.c> list = oVar.g;
        Iterator<T> it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (epx.f(((com.vk.movika.sdk.base.model.history.c) obj).a, str)) {
                break;
            }
        }
        com.vk.movika.sdk.base.model.history.c cVar = (com.vk.movika.sdk.base.model.history.c) obj;
        if (cVar == null) {
            if (str == null) {
                str = ((com.vk.movika.sdk.base.logic.a) this.b).a();
            }
            String a = com.vk.movika.sdk.utils.a.a(new Date());
            String a2 = com.vk.movika.sdk.utils.a.a(new Date());
            EmptyList emptyList = EmptyList.b;
            cVar = new com.vk.movika.sdk.base.model.history.c(str, emptyList, emptyList, emptyList, a, a2);
        }
        return o.a(oVar, null, j5g.v0(cVar, j5g.s0(list, cVar)), null, 191);
    }

    @Override // xsna.nou
    public Object e(Object obj) {
        return ((usi0.a) obj).c().a;
    }

    @Override // xsna.pjw
    public String f(int i) {
        return ImageList.Eb(i, i, ((qtd0) this.b).C8().b);
    }

    public m1 g(CharSequence charSequence, ClassifiedsGeoData classifiedsGeoData, zgc zgcVar) {
        String str;
        ArrayList arrayList;
        if ((charSequence == null || (str = charSequence.toString()) == null) && (str = classifiedsGeoData.b) == null) {
            str = "";
        }
        String str2 = str;
        List singletonList = Collections.singletonList(classifiedsGeoData.c + ',' + classifiedsGeoData.d);
        yd10 yd10Var = (yd10) this.b;
        List<MarketGeoSuggestTypesDto> list = zgcVar.b;
        yd10Var.getClass();
        tfx tfxVar = new tfx("market.geoSuggest", new com.vk.movika.sdk.android.defaultplayer.view.a(20), new er(22));
        tfxVar.i("location", singletonList);
        tfx.o(tfxVar, CampaignEx.JSON_KEY_AD_Q, str2, 0, 0, 12);
        if (list != null) {
            List<MarketGeoSuggestTypesDto> list2 = list;
            arrayList = new ArrayList(c5g.u(list2, 10));
            Iterator<T> it = list2.iterator();
            while (it.hasNext()) {
                arrayList.add(((MarketGeoSuggestTypesDto) it.next()).i());
            }
        } else {
            arrayList = null;
        }
        if (arrayList != null) {
            tfxVar.i("types", arrayList);
        }
        return rsg0.y0(yfb.x(tfxVar), null, null, 3);
    }

    public o h(o oVar, String str) {
        List<com.vk.movika.sdk.base.model.history.c> list = oVar.g;
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            g5g.y(((com.vk.movika.sdk.base.model.history.c) it.next()).d, arrayList);
        }
        if (!arrayList.isEmpty()) {
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                if (epx.f(((p) it2.next()).a, str)) {
                    return oVar;
                }
            }
        }
        return a(oVar, new com.vk.movika.sdk.base.logic.processor.c(str, 0));
    }

    public /* synthetic */ a(Object obj) {
        this.b = obj;
    }

    public a(TextPaint textPaint) {
        this.b = new TextPaint(textPaint);
    }
}
