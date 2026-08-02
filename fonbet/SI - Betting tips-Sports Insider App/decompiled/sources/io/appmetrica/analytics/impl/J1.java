package io.appmetrica.analytics.impl;

import android.content.Intent;
import android.content.res.Configuration;
import android.net.Uri;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class J1 {

    /* renamed from: a, reason: collision with root package name */
    public final C0403pa f12405a = new C0403pa();

    /* renamed from: b, reason: collision with root package name */
    public final LinkedHashMap f12406b = new LinkedHashMap();

    /* renamed from: c, reason: collision with root package name */
    public final LinkedHashMap f12407c = new LinkedHashMap();

    public final void a() {
    }

    public final void b() {
    }

    public final void c(@Nullable Intent intent) {
        if (intent != null) {
            String action = intent.getAction();
            if (!TextUtils.isEmpty(action)) {
                this.f12405a.a(action, Integer.valueOf(a(intent)));
            }
            for (Map.Entry entry : this.f12406b.entrySet()) {
                I1 i12 = (I1) entry.getKey();
                if (((H1) entry.getValue()).a(intent)) {
                    i12.a(intent);
                }
            }
        }
    }

    public final void d(@Nullable Intent intent) {
        if (intent != null) {
            String action = intent.getAction();
            if (!TextUtils.isEmpty(action)) {
                C0403pa c0403pa = this.f12405a;
                Integer valueOf = Integer.valueOf(a(intent));
                Collection collection = (Collection) c0403pa.f14468a.get(action);
                if (collection != null && collection.remove(valueOf)) {
                    if (collection.isEmpty() && c0403pa.f14469b) {
                        c0403pa.f14468a.remove(action);
                    }
                    new ArrayList(collection);
                }
            }
            for (Map.Entry entry : this.f12407c.entrySet()) {
                I1 i12 = (I1) entry.getKey();
                if (((H1) entry.getValue()).a(intent)) {
                    i12.a(intent);
                }
            }
        }
    }

    public final void a(@NotNull Intent intent, int i5) {
    }

    public final void b(@Nullable Intent intent) {
        if (intent != null) {
            String action = intent.getAction();
            if (!TextUtils.isEmpty(action)) {
                this.f12405a.a(action, Integer.valueOf(a(intent)));
            }
            for (Map.Entry entry : this.f12406b.entrySet()) {
                I1 i12 = (I1) entry.getKey();
                if (((H1) entry.getValue()).a(intent)) {
                    i12.a(intent);
                }
            }
        }
    }

    public final void a(@NotNull Intent intent, int i5, int i10) {
    }

    public final void a(@NotNull Configuration configuration) {
    }

    public final void a(@NotNull I1 i12) {
        this.f12407c.put(i12, new bp(this, 1));
    }

    public static final boolean a(J1 j12, Intent intent) {
        j12.getClass();
        if (!Intrinsics.areEqual("io.appmetrica.analytics.IAppMetricaService", intent.getAction())) {
            return false;
        }
        Collection collection = (Collection) j12.f12405a.f14468a.get("io.appmetrica.analytics.IAppMetricaService");
        return collection == null || collection.size() == 0;
    }

    public final void c(@NotNull I1 i12) {
        this.f12406b.put(i12, new bp(this, 2));
    }

    public static final boolean c(J1 j12, Intent intent) {
        j12.getClass();
        return Intrinsics.areEqual("io.appmetrica.analytics.IAppMetricaService", intent.getAction());
    }

    public final void b(@NotNull I1 i12) {
        this.f12406b.put(i12, new bp(this, 0));
    }

    public static final boolean b(J1 j12, Intent intent) {
        Collection collection;
        j12.getClass();
        return Intrinsics.areEqual("io.appmetrica.analytics.IAppMetricaService", intent.getAction()) && (collection = (Collection) j12.f12405a.f14468a.get("io.appmetrica.analytics.IAppMetricaService")) != null && collection.size() == 1;
    }

    public static int a(Intent intent) {
        Uri data = intent.getData();
        if (data == null || !Intrinsics.areEqual(data.getPath(), "/client")) {
            return -1;
        }
        try {
            String queryParameter = data.getQueryParameter("pid");
            Intrinsics.checkNotNull(queryParameter);
            return Integer.parseInt(queryParameter);
        } catch (Throwable unused) {
            return -1;
        }
    }
}
