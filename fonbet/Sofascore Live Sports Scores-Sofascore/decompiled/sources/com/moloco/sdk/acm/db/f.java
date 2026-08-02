package com.moloco.sdk.acm.db;

import com.blaze.blazesdk.data_source.BlazeDataSourcePersonalizedType;
import defpackage.ap5;
import defpackage.mni;
import java.util.List;
import kotlin.collections.CollectionsKt;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes4.dex */
public final class f extends ap5 {
    public final /* synthetic */ int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ f(j jVar, MetricsDb_Impl metricsDb_Impl, int i) {
        super(metricsDb_Impl);
        this.d = i;
    }

    @Override // defpackage.y0
    public final String c() {
        switch (this.d) {
            case 0:
                return "INSERT OR REPLACE INTO `events` (`id`,`name`,`timestamp`,`eventType`,`data`,`tags`) VALUES (nullif(?, 0),?,?,?,?,?)";
            default:
                return "INSERT OR ABORT INTO `events` (`id`,`name`,`timestamp`,`eventType`,`data`,`tags`) VALUES (nullif(?, 0),?,?,?,?,?)";
        }
    }

    @Override // defpackage.ap5
    public final void v(mni mniVar, Object obj) {
        switch (this.d) {
            case 0:
                b bVar = (b) obj;
                mniVar.q(1, bVar.a);
                String str = bVar.b;
                if (str == null) {
                    mniVar.s(2);
                } else {
                    mniVar.m0(2, str);
                }
                mniVar.q(3, bVar.c);
                c cVar = bVar.d;
                cVar.getClass();
                String name = cVar.name();
                if (name == null) {
                    mniVar.s(4);
                } else {
                    mniVar.m0(4, name);
                }
                Long l = bVar.e;
                if (l == null) {
                    mniVar.s(5);
                } else {
                    mniVar.q(5, l.longValue());
                }
                List list = bVar.f;
                list.getClass();
                mniVar.m0(6, CollectionsKt.f0(list, BlazeDataSourcePersonalizedType.STRING_SEPARATOR, null, null, null, 62));
                break;
            default:
                b bVar2 = (b) obj;
                mniVar.q(1, bVar2.a);
                String str2 = bVar2.b;
                if (str2 == null) {
                    mniVar.s(2);
                } else {
                    mniVar.m0(2, str2);
                }
                mniVar.q(3, bVar2.c);
                c cVar2 = bVar2.d;
                cVar2.getClass();
                String name2 = cVar2.name();
                if (name2 == null) {
                    mniVar.s(4);
                } else {
                    mniVar.m0(4, name2);
                }
                Long l2 = bVar2.e;
                if (l2 == null) {
                    mniVar.s(5);
                } else {
                    mniVar.q(5, l2.longValue());
                }
                List list2 = bVar2.f;
                list2.getClass();
                mniVar.m0(6, CollectionsKt.f0(list2, BlazeDataSourcePersonalizedType.STRING_SEPARATOR, null, null, null, 62));
                break;
        }
    }
}
