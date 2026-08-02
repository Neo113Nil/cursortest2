package com.vk.clips.attachments.impl.publish.geolocation.presentation;

import android.content.Context;
import com.vk.clips.attachments.api.publish.geolocation.ClipsGeolocationAttachEntryParams;
import com.vk.clips.attachments.impl.publish.geolocation.model.ClipsGeoPickerExtendedParams;
import com.vk.clips.attachments.impl.publish.geolocation.presentation.ClipsGeoPickerState;
import com.vk.clips.attachments.impl.publish.geolocation.presentation.a;
import com.vk.clips.attachments.impl.publish.geolocation.presentation.f;
import com.vk.dto.clips.ClipsVideoItemLocation;
import com.vk.dto.geo.GeoLocation;
import io.reactivex.rxjava3.core.x;
import io.reactivex.rxjava3.internal.operators.single.o;
import io.reactivex.rxjava3.internal.operators.single.r;
import java.util.Iterator;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.EmptyList;
import xsna.a7f0;
import xsna.b8;
import xsna.c8;
import xsna.cae;
import xsna.e43;
import xsna.f4z;
import xsna.gr3;
import xsna.i4e;
import xsna.n7;
import xsna.np3;
import xsna.qm0;
import xsna.sa;
import xsna.sf1;
import xsna.v9e;
import xsna.wk50;
import xsna.yiz;
import xsna.ype;
import xsna.yy;

/* compiled from: ClipsGeoPickerFeature.kt */
/* loaded from: classes16.dex */
public final class e extends wk50<j, ClipsGeoPickerState, a, f> {
    public final f4z f;
    public final yiz g;

    public e(ClipsGeoPickerExtendedParams clipsGeoPickerExtendedParams) {
        super(new a.b(clipsGeoPickerExtendedParams), new g());
        this.f = new f4z();
        this.g = new yiz();
    }

    @Override // xsna.wk50
    public final void N(ClipsGeoPickerState clipsGeoPickerState, a aVar) {
        ClipsGeoPickerState clipsGeoPickerState2 = clipsGeoPickerState;
        a aVar2 = aVar;
        if (aVar2 instanceof a.b) {
            ClipsGeoPickerExtendedParams clipsGeoPickerExtendedParams = ((a.b) aVar2).b;
            ClipsGeolocationAttachEntryParams clipsGeolocationAttachEntryParams = clipsGeoPickerExtendedParams.b;
            List<ClipsVideoItemLocation> list = clipsGeolocationAttachEntryParams.b;
            T(new f.d(clipsGeolocationAttachEntryParams.d, clipsGeolocationAttachEntryParams.c));
            if (!list.isEmpty() || clipsGeoPickerExtendedParams.c) {
                U(list);
                return;
            } else {
                T(f.a.b);
                return;
            }
        }
        Object obj = null;
        if (aVar2 instanceof a.c) {
            List<ClipsVideoItemLocation> list2 = clipsGeoPickerState2.f;
            String str = ((a.c) aVar2).b;
            this.g.getClass();
            a7f0.a.f(this, yiz.i(str, list2), new sf1(this, 28), null, 5);
            return;
        }
        boolean z = aVar2 instanceof a.e;
        f4z f4zVar = this.f;
        if (z) {
            f4zVar.b(v9e.c.a);
            return;
        }
        if (aVar2 instanceof a.f) {
            f4zVar.b(v9e.a.a);
            return;
        }
        if (aVar2 instanceof a.C0546a) {
            if (clipsGeoPickerState2.d == ClipsGeoPickerState.FullscreenState.Unavailable) {
                U(EmptyList.b);
            }
        } else {
            if (!(aVar2 instanceof a.d)) {
                throw new NoWhenBranchMatchedException();
            }
            a.d dVar = (a.d) aVar2;
            Iterator<T> it = clipsGeoPickerState2.c.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                Object next = it.next();
                if (((GeoLocation) next).b == dVar.b) {
                    obj = next;
                    break;
                }
            }
            GeoLocation geoLocation = (GeoLocation) obj;
            if (geoLocation != null) {
                f4zVar.b(new v9e.b(clipsGeoPickerState2.e, new ype(geoLocation)));
            }
        }
    }

    public final void U(List<ClipsVideoItemLocation> list) {
        T(f.c.b);
        Context context = e43.a;
        if (context == null) {
            context = null;
        }
        this.g.getClass();
        a7f0.a.f(this, new r(new o(new r(x.k(list), new b8(new cae(context, 0), 12)).l(new c8(new yy(12), 6)), new np3(new sa(this, 27), 8)), new n7(new i4e(this, 1), 12)), new gr3(this, 16), new qm0(10), 1);
    }
}
