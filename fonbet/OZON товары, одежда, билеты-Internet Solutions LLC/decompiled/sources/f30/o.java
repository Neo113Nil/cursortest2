package f30;

import android.content.Context;
import android.content.SharedPreferences;
import c30.C5742a;
import com.squareup.moshi.Moshi;
import f30.q;
import i30.C7005b;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class o implements Jb.e<q30.c> {

    /* renamed from: a, reason: collision with root package name */
    private final Pc.a<Context> f62539a;

    /* renamed from: b, reason: collision with root package name */
    private final Pc.a<d30.l> f62540b;

    /* renamed from: c, reason: collision with root package name */
    private final Jb.f f62541c;

    /* renamed from: d, reason: collision with root package name */
    private final Pc.a<O30.b> f62542d;

    /* renamed from: e, reason: collision with root package name */
    private final Pc.a<S30.a> f62543e;

    /* renamed from: f, reason: collision with root package name */
    private final Pc.a<Moshi> f62544f;

    /* renamed from: g, reason: collision with root package name */
    private final Pc.a<c30.i> f62545g;

    /* renamed from: h, reason: collision with root package name */
    private final Pc.a<c30.j> f62546h;

    /* renamed from: i, reason: collision with root package name */
    private final Pc.a<SharedPreferences> f62547i;

    /* renamed from: j, reason: collision with root package name */
    private final Pc.a<C5742a> f62548j;

    /* renamed from: k, reason: collision with root package name */
    private final Pc.a<c30.b> f62549k;

    public o(Jb.f fVar, Pc.a aVar, Pc.a aVar2, Pc.a aVar3, Pc.a aVar4, Pc.a aVar5, Pc.a aVar6, Pc.a aVar7, Pc.a aVar8, Pc.a aVar9, Pc.a aVar10) {
        this.f62539a = aVar;
        this.f62540b = aVar2;
        this.f62541c = fVar;
        this.f62542d = aVar3;
        this.f62543e = aVar4;
        this.f62544f = aVar5;
        this.f62545g = aVar6;
        this.f62546h = aVar7;
        this.f62547i = aVar8;
        this.f62548j = aVar9;
        this.f62549k = aVar10;
    }

    @Override // Pc.a
    public final Object get() {
        Context context = (Context) ((q.f) this.f62539a).get();
        d30.l dao = this.f62540b.get();
        C7005b mobileHealthConfig = (C7005b) this.f62541c.get();
        O30.b fintechLibType = (O30.b) ((q.h) this.f62542d).get();
        S30.a applicationInfoDataSource = (S30.a) ((q.a) this.f62543e).get();
        Moshi moshi = this.f62544f.get();
        c30.i locationProvider = (c30.i) ((q.i) this.f62545g).get();
        c30.j networkInfoProvider = (c30.j) ((q.j) this.f62546h).get();
        SharedPreferences sharedPreferences = (SharedPreferences) ((q.c) this.f62547i).get();
        C5742a batteryInfoProvider = (C5742a) ((q.e) this.f62548j).get();
        c30.b deviceIdsProvider = (c30.b) ((q.g) this.f62549k).get();
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(dao, "dao");
        Intrinsics.checkNotNullParameter(mobileHealthConfig, "mobileHealthConfig");
        Intrinsics.checkNotNullParameter(fintechLibType, "fintechLibType");
        Intrinsics.checkNotNullParameter(applicationInfoDataSource, "applicationInfoDataSource");
        Intrinsics.checkNotNullParameter(moshi, "moshi");
        Intrinsics.checkNotNullParameter(locationProvider, "locationProvider");
        Intrinsics.checkNotNullParameter(networkInfoProvider, "networkInfoProvider");
        Intrinsics.checkNotNullParameter(sharedPreferences, "sharedPreferences");
        Intrinsics.checkNotNullParameter(batteryInfoProvider, "batteryInfoProvider");
        Intrinsics.checkNotNullParameter(deviceIdsProvider, "deviceIdsProvider");
        return new q30.c(context, dao, mobileHealthConfig, fintechLibType, applicationInfoDataSource, locationProvider, networkInfoProvider, sharedPreferences, batteryInfoProvider, deviceIdsProvider, moshi);
    }
}
