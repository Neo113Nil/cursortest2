package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreutils.internal.time.SystemTimeProvider;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.TimeUnit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntRange;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONArray;
import org.json.JSONObject;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* renamed from: io.appmetrica.analytics.impl.ed, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0126ed implements Tj {

    /* renamed from: a, reason: collision with root package name */
    public final InterfaceC0538ul f13683a;

    /* renamed from: b, reason: collision with root package name */
    public final String f13684b;

    /* renamed from: c, reason: collision with root package name */
    public final SystemTimeProvider f13685c;

    /* renamed from: d, reason: collision with root package name */
    public final List f13686d;

    /* renamed from: e, reason: collision with root package name */
    public final String f13687e;

    /* renamed from: f, reason: collision with root package name */
    public final long f13688f;

    public C0126ed(@NotNull InterfaceC0538ul interfaceC0538ul, @NotNull String str, @NotNull SystemTimeProvider systemTimeProvider, @NotNull List<C0049bd> list) {
        this.f13683a = interfaceC0538ul;
        this.f13684b = str;
        this.f13685c = systemTimeProvider;
        this.f13686d = list;
        this.f13687e = str.toUpperCase(Locale.ROOT) + "_STATUS";
        this.f13688f = TimeUnit.DAYS.toMillis(1L);
    }

    @Nullable
    public final Sj a() {
        C0505td c0505td;
        C0049bd c0049bd;
        if (this.f13686d.isEmpty()) {
            return null;
        }
        List R = CollectionsKt.R(this.f13686d, new C0101dd());
        String c2 = ((AbstractC0630yd) this.f13683a).c(this.f13687e, (String) null);
        if (c2 != null) {
            try {
                JSONObject jSONObject = new JSONObject(c2);
                JSONArray jSONArray = jSONObject.getJSONArray("modulesStatus");
                IntRange d10 = zf.j.d(0, jSONArray.length());
                ArrayList arrayList = new ArrayList(kotlin.collections.v.k(d10, 10));
                Iterator it = d10.iterator();
                while (((zf.b) it).f25972c) {
                    JSONObject jSONObject2 = jSONArray.getJSONObject(((kotlin.collections.i0) it).nextInt());
                    try {
                        c0049bd = new C0049bd(jSONObject2.getString("moduleName"), jSONObject2.getBoolean("loaded"));
                    } catch (Throwable unused) {
                        c0049bd = new C0049bd("", false);
                    }
                    arrayList.add(c0049bd);
                }
                c0505td = new C0505td(arrayList, jSONObject.getLong("lastSendTime"));
            } catch (Throwable unused2) {
                c0505td = new C0505td(kotlin.collections.e0.f19204a, 0L);
            }
        } else {
            c0505td = null;
        }
        long currentTimeMillis = this.f13685c.currentTimeMillis();
        if (c0505td != null && currentTimeMillis - c0505td.f14678b <= this.f13688f && Intrinsics.areEqual(R, c0505td.f14677a)) {
            return null;
        }
        C0505td c0505td2 = new C0505td(R, currentTimeMillis);
        InterfaceC0538ul interfaceC0538ul = this.f13683a;
        AbstractC0630yd abstractC0630yd = (AbstractC0630yd) interfaceC0538ul;
        return new Sj(d9.e.l(new StringBuilder(), this.f13684b, "_status"), c0505td2.a());
    }

    public /* synthetic */ C0126ed(InterfaceC0538ul interfaceC0538ul, String str, SystemTimeProvider systemTimeProvider, List list, int i5, DefaultConstructorMarker defaultConstructorMarker) {
        this(interfaceC0538ul, str, (i5 & 4) != 0 ? new SystemTimeProvider() : systemTimeProvider, list);
    }
}
