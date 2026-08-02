package defpackage;

import android.content.Context;
import androidx.compose.runtime.snapshots.SnapshotStateList;
import com.blaze.blazesdk.data_source.BlazeDataSourceType;
import com.blaze.blazesdk.data_source.a;
import com.blaze.blazesdk.shared.results.c0;
import com.blaze.blazesdk.style.widgets.BlazeWidgetItemCustomMapping;
import com.blaze.blazesdk.style.widgets.BlazeWidgetItemStyleOverrides;
import com.blaze.blazesdk.widgets.ui.BlazeBaseWidget;
import com.inmobi.ads.InMobiBanner;
import com.inmobi.ads.controllers.PublisherCallbacks;
import com.inmobi.media.C3401em;
import com.sofascore.results.base.BaseActivity;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.xmlpull.v1.XmlPullParser;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public final /* synthetic */ class jx1 implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ Object d;

    public /* synthetic */ jx1(Map map, BlazeBaseWidget blazeBaseWidget, boolean z) {
        this.a = 1;
        this.d = map;
        this.b = blazeBaseWidget;
        this.c = z;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i;
        int i2 = this.a;
        Object obj = this.d;
        boolean z = this.c;
        Object obj2 = this.b;
        switch (i2) {
            case 0:
                BlazeDataSourceType blazeDataSourceType = (BlazeDataSourceType) obj;
                int i3 = BlazeBaseWidget.q;
                cql viewModel = ((BlazeBaseWidget) obj2).getViewModel();
                viewModel.getClass();
                blazeDataSourceType.getClass();
                try {
                    a.validate$default(blazeDataSourceType, ogm.WIDGET, false, 2, null);
                    viewModel.e = blazeDataSourceType;
                    viewModel.f = viewModel.v();
                    viewModel.j(z);
                } catch (Throwable th) {
                    c0 c0Var = new c0();
                    c0Var.f = th;
                    c0Var.g = tub.h(new Pair("widgetId", viewModel.w()), new Pair("dataSourceType", blazeDataSourceType.getStringRepresentation$blazesdk_release()));
                    j1m.a(c0Var);
                }
                return Unit.a;
            case 1:
                Map map = (Map) obj;
                BlazeBaseWidget blazeBaseWidget = (BlazeBaseWidget) obj2;
                int i4 = BlazeBaseWidget.q;
                LinkedHashMap c = map != null ? BlazeBaseWidget.c(map) : null;
                cql viewModel2 = blazeBaseWidget.getViewModel();
                if (c != null) {
                    viewModel2.getClass();
                    for (Map.Entry entry : c.entrySet()) {
                        BlazeWidgetItemCustomMapping blazeWidgetItemCustomMapping = (BlazeWidgetItemCustomMapping) entry.getKey();
                        BlazeWidgetItemStyleOverrides blazeWidgetItemStyleOverrides = (BlazeWidgetItemStyleOverrides) entry.getValue();
                        LinkedHashMap linkedHashMap = viewModel2.j;
                        if (linkedHashMap == null) {
                            Intrinsics.i("perItemStyleOverrides");
                            throw null;
                        }
                        linkedHashMap.put(blazeWidgetItemCustomMapping, blazeWidgetItemStyleOverrides);
                    }
                } else {
                    LinkedHashMap linkedHashMap2 = viewModel2.j;
                    if (linkedHashMap2 == null) {
                        Intrinsics.i("perItemStyleOverrides");
                        throw null;
                    }
                    linkedHashMap2.clear();
                }
                jul adapter$blazesdk_release = blazeBaseWidget.getAdapter$blazesdk_release();
                Map<BlazeWidgetItemCustomMapping, BlazeWidgetItemStyleOverrides> perItemStyleOverrides = blazeBaseWidget.getPerItemStyleOverrides();
                adapter$blazesdk_release.getClass();
                perItemStyleOverrides.getClass();
                adapter$blazesdk_release.d = perItemStyleOverrides;
                if (z) {
                    blazeBaseWidget.i();
                }
                return Unit.a;
            case 2:
                ((koh) obj2).put(Integer.valueOf(((wn1) obj).a), Boolean.valueOf(!z));
                return Unit.a;
            case 3:
                return InMobiBanner.a((InMobiBanner) obj2, (PublisherCallbacks) obj, z);
            case 4:
                BaseActivity baseActivity = (BaseActivity) obj2;
                baseActivity.w.a("android.permission.POST_NOTIFICATIONS", null);
                Context applicationContext = baseActivity.getApplicationContext();
                applicationContext.getClass();
                nv.l0(applicationContext, dv.OTHER, bv.SYSTEM_NOTIFICATIONS, null);
                baseActivity.v = new gk(baseActivity, z, (Function1) obj, 7);
                return Unit.a;
            case 5:
                Function1 function1 = (Function1) obj2;
                SnapshotStateList snapshotStateList = (SnapshotStateList) obj;
                if (z) {
                    snapshotStateList.getClass();
                    function1.invoke(new l2h(j72.B(snapshotStateList).c));
                } else {
                    function1.invoke(k2h.a);
                }
                return Unit.a;
            case 6:
                g6i g6iVar = (g6i) obj2;
                znh znhVar = (znh) obj;
                if (z) {
                    i = g6iVar.e.size() / 2;
                    if (i < 5) {
                        i = 5;
                    }
                } else {
                    i = Integer.MAX_VALUE;
                }
                znhVar.i(i);
                return Unit.a;
            default:
                return C3401em.a((XmlPullParser) obj2, z, (C3401em) obj);
        }
    }

    public /* synthetic */ jx1(Object obj, boolean z, Object obj2, int i) {
        this.a = i;
        this.b = obj;
        this.c = z;
        this.d = obj2;
    }

    public /* synthetic */ jx1(Object obj, Object obj2, boolean z, int i) {
        this.a = i;
        this.b = obj;
        this.d = obj2;
        this.c = z;
    }

    public /* synthetic */ jx1(boolean z, Object obj, qdi qdiVar, int i) {
        this.a = i;
        this.c = z;
        this.b = obj;
        this.d = qdiVar;
    }
}
