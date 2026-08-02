package com.vk.ecomm.catalog.impl.geo;

import android.content.Context;
import android.location.Location;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.vk.api.generated.market.dto.MarketGeoSuggestResponseDto;
import com.vk.api.generated.market.dto.MarketSuggestionDto;
import com.vk.core.view.components.placeholder.VkPlaceholder;
import com.vk.ecomm.catalog.impl.geo.e;
import com.vk.location.common.LocationCommon;
import com.vk.log.L;
import com.vk.permission.PermissionHelper;
import io.reactivex.rxjava3.internal.operators.observable.m1;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.FunctionReferenceImpl;
import xsna.brm0;
import xsna.c5g;
import xsna.da;
import xsna.drm0;
import xsna.e43;
import xsna.ea;
import xsna.el6;
import xsna.epx;
import xsna.f4m;
import xsna.ga;
import xsna.gf0;
import xsna.h03;
import xsna.h6;
import xsna.hg1;
import xsna.hq;
import xsna.izs;
import xsna.j22;
import xsna.mj1;
import xsna.oxz;
import xsna.pba;
import xsna.qgc;
import xsna.rgc;
import xsna.rsg0;
import xsna.s3q0;
import xsna.sgc;
import xsna.t00;
import xsna.td5;
import xsna.tfx;
import xsna.uf3;
import xsna.ugc;
import xsna.vgc;
import xsna.vl0;
import xsna.w00;
import xsna.wgc;
import xsna.y00;
import xsna.yd10;
import xsna.yfb;
import xsna.ygc;
import xsna.ysg0;
import xsna.zgc;

/* compiled from: ClassifiedsGeoPresenter.kt */
/* loaded from: classes18.dex */
public final class b implements rgc {
    public final sgc b;
    public final ClassifiedsGeoData c;
    public final com.vk.ecomm.catalog.impl.geo.a d;
    public final zgc e;
    public io.reactivex.rxjava3.disposables.c f;
    public io.reactivex.rxjava3.disposables.c g;
    public io.reactivex.rxjava3.disposables.c h;
    public io.reactivex.rxjava3.disposables.c i;
    public String j;
    public final ArrayList k = new ArrayList();

    /* compiled from: ClassifiedsGeoPresenter.kt */
    public static final /* synthetic */ class a extends FunctionReferenceImpl implements izs<Location, s3q0> {
        @Override // xsna.izs
        public final s3q0 invoke(Location location) {
            Location location2 = location;
            b bVar = (b) this.receiver;
            com.vk.ecomm.catalog.impl.geo.a aVar = bVar.d;
            StringBuilder sb = new StringBuilder();
            sb.append(location2.getLatitude());
            sb.append(',');
            sb.append(location2.getLongitude());
            bVar.i = rsg0.y0(yfb.x(((yd10) aVar.b).u(Collections.singletonList(sb.toString()))), null, null, 3).U(new vgc(com.vk.ecomm.catalog.impl.geo.c.b)).subscribe(new el6(new com.vk.ecomm.catalog.impl.geo.d(1, bVar, b.class, "publishUpdatedGeo", "publishUpdatedGeo(Lcom/vk/ecomm/catalog/impl/geo/ClassifiedsGeoRxEvents$ClassifiedsGeoEvent;)V", 0), 8), new ga(new td5(bVar, 5), 14));
            return s3q0.a;
        }
    }

    /* compiled from: ClassifiedsGeoPresenter.kt */
    /* renamed from: com.vk.ecomm.catalog.impl.geo.b$b, reason: collision with other inner class name */
    public static final /* synthetic */ class C0930b extends FunctionReferenceImpl implements izs<Throwable, s3q0> {
        @Override // xsna.izs
        public final s3q0 invoke(Throwable th) {
            Throwable th2 = th;
            ((b) this.receiver).getClass();
            h03.b(th2);
            L.i(th2);
            return s3q0.a;
        }
    }

    /* compiled from: ClassifiedsGeoPresenter.kt */
    public static final /* synthetic */ class c extends FunctionReferenceImpl implements izs<MarketGeoSuggestResponseDto, s3q0> {
        @Override // xsna.izs
        public final s3q0 invoke(MarketGeoSuggestResponseDto marketGeoSuggestResponseDto) {
            b bVar = (b) this.receiver;
            sgc sgcVar = bVar.b;
            List<MarketSuggestionDto> d = marketGeoSuggestResponseDto.d();
            List<MarketSuggestionDto> list = d;
            if (list == null || list.isEmpty()) {
                String str = bVar.j;
                if (str == null || drm0.N(str)) {
                    bVar.x();
                } else {
                    RecyclerView recyclerView = sgcVar.h1;
                    if (recyclerView == null) {
                        recyclerView = null;
                    }
                    View view = sgcVar.i1;
                    if (view == null) {
                        view = null;
                    }
                    VkPlaceholder vkPlaceholder = sgcVar.j1;
                    if (vkPlaceholder == null) {
                        vkPlaceholder = null;
                    }
                    sgcVar.Zn(recyclerView, view, vkPlaceholder);
                    RecyclerView recyclerView2 = sgcVar.h1;
                    if (recyclerView2 == null) {
                        recyclerView2 = null;
                    }
                    recyclerView2.setVisibility(4);
                    View view2 = sgcVar.i1;
                    if (view2 == null) {
                        view2 = null;
                    }
                    view2.setVisibility(0);
                    VkPlaceholder vkPlaceholder2 = sgcVar.j1;
                    if (vkPlaceholder2 == null) {
                        vkPlaceholder2 = null;
                    }
                    f4m.j(vkPlaceholder2);
                    qgc qgcVar = sgcVar.k1;
                    (qgcVar != null ? qgcVar : null).setItems(EmptyList.b);
                }
            } else {
                String str2 = bVar.j;
                if (str2 == null || drm0.N(str2)) {
                    bVar.x();
                } else {
                    List<MarketSuggestionDto> list2 = d;
                    ArrayList arrayList = new ArrayList(c5g.u(list2, 10));
                    for (MarketSuggestionDto marketSuggestionDto : list2) {
                        String str3 = bVar.j;
                        arrayList.add(new ygc(marketSuggestionDto, false, str3 != null ? str3.toString() : null, 2));
                    }
                    sgcVar.ao(arrayList);
                }
            }
            return s3q0.a;
        }
    }

    /* compiled from: ClassifiedsGeoPresenter.kt */
    public static final /* synthetic */ class d extends FunctionReferenceImpl implements izs<Throwable, s3q0> {
        @Override // xsna.izs
        public final s3q0 invoke(Throwable th) {
            Throwable th2 = th;
            sgc sgcVar = ((b) this.receiver).b;
            RecyclerView recyclerView = sgcVar.h1;
            if (recyclerView == null) {
                recyclerView = null;
            }
            View view = sgcVar.i1;
            if (view == null) {
                view = null;
            }
            VkPlaceholder vkPlaceholder = sgcVar.j1;
            if (vkPlaceholder == null) {
                vkPlaceholder = null;
            }
            sgcVar.Zn(recyclerView, view, vkPlaceholder);
            RecyclerView recyclerView2 = sgcVar.h1;
            if (recyclerView2 == null) {
                recyclerView2 = null;
            }
            recyclerView2.setVisibility(4);
            View view2 = sgcVar.i1;
            if (view2 == null) {
                view2 = null;
            }
            f4m.j(view2);
            VkPlaceholder vkPlaceholder2 = sgcVar.j1;
            if (vkPlaceholder2 == null) {
                vkPlaceholder2 = null;
            }
            vkPlaceholder2.setVisibility(0);
            qgc qgcVar = sgcVar.k1;
            (qgcVar != null ? qgcVar : null).setItems(EmptyList.b);
            h03.b(th2);
            L.i(th2);
            return s3q0.a;
        }
    }

    /* compiled from: ClassifiedsGeoPresenter.kt */
    public static final /* synthetic */ class e extends FunctionReferenceImpl implements izs<e.a, s3q0> {
        @Override // xsna.izs
        public final s3q0 invoke(e.a aVar) {
            ((b) this.receiver).getClass();
            ((ysg0) com.vk.ecomm.catalog.impl.geo.e.a.getValue()).a(aVar);
            return s3q0.a;
        }
    }

    /* compiled from: ClassifiedsGeoPresenter.kt */
    public static final /* synthetic */ class f extends FunctionReferenceImpl implements izs<Throwable, s3q0> {
        @Override // xsna.izs
        public final s3q0 invoke(Throwable th) {
            Throwable th2 = th;
            ((b) this.receiver).getClass();
            h03.b(th2);
            L.i(th2);
            return s3q0.a;
        }
    }

    public b(sgc sgcVar, ClassifiedsGeoData classifiedsGeoData, com.vk.ecomm.catalog.impl.geo.a aVar, zgc zgcVar) {
        this.b = sgcVar;
        this.c = classifiedsGeoData;
        this.d = aVar;
        this.e = zgcVar;
    }

    @Override // xsna.rgc
    public final void A() {
        g(this.j, true);
    }

    @Override // xsna.rgc
    public final void D4(String str, String str2, boolean z) {
        io.reactivex.rxjava3.disposables.c cVar = this.f;
        if (cVar != null) {
            cVar.dispose();
        }
        ((yd10) this.d.b).getClass();
        tfx tfxVar = new tfx("market.geocodingReference", new uf3(15), new hq(20));
        tfx.o(tfxVar, "reference", str, 0, 0, 12);
        this.f = rsg0.y0(yfb.x(tfxVar), null, null, 3).U(new mj1(new wgc(z, str2), 7)).subscribe(new j22(new e(1, this, b.class, "publishUpdatedGeo", "publishUpdatedGeo(Lcom/vk/ecomm/catalog/impl/geo/ClassifiedsGeoRxEvents$ClassifiedsGeoEvent;)V", 0), 13), new w00(new f(1, this, b.class, "showError", "showError(Ljava/lang/Throwable;)V", 0), 9));
    }

    @Override // xsna.rgc
    public final void X0() {
        AtomicReference<Location> atomicReference = oxz.a;
        Context context = e43.a;
        if (context == null) {
            context = null;
        }
        LocationCommon.a.getClass();
        if (LocationCommon.a(context)) {
            b();
            return;
        }
        PermissionHelper permissionHelper = PermissionHelper.a;
        sgc sgcVar = this.b;
        Context requireContext = sgcVar.requireContext();
        permissionHelper.getClass();
        PermissionHelper.g(permissionHelper, requireContext, PermissionHelper.h, PermissionHelper.i, 0, -1, new h6(sgcVar, 16), null, null, 200);
    }

    @Override // xsna.gm6
    public final boolean a0() {
        return false;
    }

    public final void b() {
        AtomicReference<Location> atomicReference = oxz.a;
        Context context = e43.a;
        if (context == null) {
            context = null;
        }
        LocationCommon.a.getClass();
        if (!LocationCommon.b(context)) {
            sgc sgcVar = this.b;
            sgcVar.m1 = true;
            oxz.i(sgcVar.requireContext());
        } else {
            io.reactivex.rxjava3.disposables.c cVar = this.h;
            if (cVar != null) {
                cVar.dispose();
            }
            Context context2 = e43.a;
            this.h = oxz.c(5000L, context2 != null ? context2 : null).subscribe(new y00(new a(1, this, b.class, "onUserLocationUpdated", "onUserLocationUpdated(Landroid/location/Location;)V", 0), 10), new da(new C0930b(1, this, b.class, "showError", "showError(Ljava/lang/Throwable;)V", 0), 12));
        }
    }

    @Override // xsna.gm6
    public final void d() {
        zgc zgcVar = this.e;
        if (zgcVar.c) {
            m1 g = this.d.g("", this.c, zgcVar);
            Context context = e43.a;
            if (context == null) {
                context = null;
            }
            int i = 0;
            this.g = hg1.m(g, context, 0L, false, 62).subscribe(new vl0(new com.vk.channels.impl.channel_screen.send_msg.e(1, this, b.class, "onDefaultGeoSuggestionResponse", "onDefaultGeoSuggestionResponse(Lcom/vk/api/generated/market/dto/MarketGeoSuggestResponseDto;)V", i, 7), 8), new ea(new pba(1, this, b.class, "onGeoSuggestionsResponseError", "onGeoSuggestionsResponseError(Ljava/lang/Throwable;)V", i, 2), 17));
        }
        g(this.j, false);
    }

    public final void g(CharSequence charSequence, boolean z) {
        String str;
        if (z || (!((((str = this.j) == null || str.length() == 0) && (charSequence == null || charSequence.length() == 0)) || brm0.r(str, charSequence)) || this.g == null)) {
            String obj = charSequence != null ? charSequence.toString() : null;
            this.j = obj;
            if (obj == null || drm0.N(obj)) {
                x();
                return;
            }
            io.reactivex.rxjava3.disposables.c cVar = this.g;
            if (cVar != null) {
                cVar.dispose();
            }
            m1 g = this.d.g(charSequence, this.c, this.e);
            Context context = e43.a;
            this.g = hg1.m(g, context != null ? context : null, 0L, false, 62).subscribe(new t00(new c(1, this, b.class, "onGeoSuggestionsResponse", "onGeoSuggestionsResponse(Lcom/vk/api/generated/market/dto/MarketGeoSuggestResponseDto;)V", 0), 13), new gf0(new d(1, this, b.class, "onGeoSuggestionsResponseError", "onGeoSuggestionsResponseError(Ljava/lang/Throwable;)V", 0), 10));
        }
    }

    @Override // xsna.rgc
    public final void k0(CharSequence charSequence) {
        g(charSequence, false);
    }

    @Override // xsna.gm6
    public final void onDestroyView() {
        io.reactivex.rxjava3.disposables.c cVar = this.f;
        if (cVar != null) {
            cVar.dispose();
        }
        this.f = null;
        io.reactivex.rxjava3.disposables.c cVar2 = this.g;
        if (cVar2 != null) {
            cVar2.dispose();
        }
        this.g = null;
        io.reactivex.rxjava3.disposables.c cVar3 = this.h;
        if (cVar3 != null) {
            cVar3.dispose();
        }
        this.h = null;
        io.reactivex.rxjava3.disposables.c cVar4 = this.i;
        if (cVar4 != null) {
            cVar4.dispose();
        }
        this.i = null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:44:0x00dc, code lost:
    
        if ((r2 & com.vk.location.common.LocationCommon.b(r3)) == false) goto L61;
     */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00bf  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void x() {
        int i;
        String string;
        int i2;
        boolean z;
        ClassifiedsGeoData classifiedsGeoData = this.c;
        String str = classifiedsGeoData.b;
        boolean z2 = classifiedsGeoData.e;
        ArrayList arrayList = new ArrayList();
        String str2 = this.j;
        String str3 = "";
        zgc zgcVar = this.e;
        if ((str2 == null || drm0.N(str2)) && (i = zgcVar.e) != 0) {
            Context context = e43.a;
            if (context == null) {
                context = null;
            }
            string = context.getString(i);
        } else {
            string = "";
        }
        String str4 = this.j;
        if ((str4 == null || drm0.N(str4)) && (i2 = zgcVar.d) != 0) {
            Context context2 = e43.a;
            if (context2 == null) {
                context2 = null;
            }
            str3 = context2.getString(i2);
        }
        MarketSuggestionDto marketSuggestionDto = new MarketSuggestionDto(string, str3, "", true, null, 16, null);
        AtomicReference<Location> atomicReference = oxz.a;
        Context context3 = e43.a;
        if (context3 == null) {
            context3 = null;
        }
        LocationCommon locationCommon = LocationCommon.a;
        locationCommon.getClass();
        if (LocationCommon.a(context3)) {
            Context context4 = e43.a;
            if (context4 == null) {
                context4 = null;
            }
            locationCommon.getClass();
            if (LocationCommon.b(context4) && !z2) {
                z = true;
                arrayList.add(new ygc(marketSuggestionDto, z, null, 4));
                if (zgcVar.c) {
                    ArrayList arrayList2 = this.k;
                    if (!arrayList2.isEmpty()) {
                        ArrayList arrayList3 = new ArrayList(c5g.u(arrayList2, 10));
                        Iterator it = arrayList2.iterator();
                        while (it.hasNext()) {
                            MarketSuggestionDto marketSuggestionDto2 = (MarketSuggestionDto) it.next();
                            arrayList3.add(new ygc(marketSuggestionDto2, epx.f(marketSuggestionDto2.d(), str), null, 4));
                        }
                        arrayList.addAll(arrayList3);
                        this.b.ao(arrayList);
                    }
                }
                if (str != null) {
                    if (!z2) {
                        Context context5 = e43.a;
                        if (context5 == null) {
                            context5 = null;
                        }
                        locationCommon.getClass();
                        boolean a2 = LocationCommon.a(context5);
                        Context context6 = e43.a;
                        if (context6 == null) {
                            context6 = null;
                        }
                        locationCommon.getClass();
                    }
                    arrayList.add(new ygc(new MarketSuggestionDto("", classifiedsGeoData.b, "", true, null, 16, null), true, null, 4));
                }
                arrayList.add(new ugc());
                this.b.ao(arrayList);
            }
        }
        z = false;
        arrayList.add(new ygc(marketSuggestionDto, z, null, 4));
        if (zgcVar.c) {
        }
        if (str != null) {
        }
        arrayList.add(new ugc());
        this.b.ao(arrayList);
    }

    @Override // xsna.rgc
    public final void z6() {
        b();
    }

    @Override // xsna.cc6
    public final void onDestroy() {
    }

    @Override // xsna.cc6
    public final void onPause() {
    }

    @Override // xsna.cc6
    public final void onResume() {
    }

    @Override // xsna.gm6
    public final void onStart() {
    }

    @Override // xsna.gm6
    public final void onStop() {
    }
}
