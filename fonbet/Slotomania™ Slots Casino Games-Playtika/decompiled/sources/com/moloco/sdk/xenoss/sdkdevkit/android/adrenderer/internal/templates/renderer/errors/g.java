package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.renderer.errors;

import com.google.common.annotations.VisibleForTesting;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.renderer.errors.a;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.renderer.errors.b;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.renderer.errors.c;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.renderer.errors.d;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.renderer.errors.e;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.renderer.errors.f;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.renderer.errors.i;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.renderer.errors.j;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.renderer.errors.k;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;

/* loaded from: classes4.dex */
public abstract class g {
    public static final int f = 0;
    public final int a;
    public final String b;
    public final boolean c;
    public final boolean d;
    public static final a e = new a(null);
    public static final Lazy<Map<String, g>> g = LazyKt.lazy(new Function0() { // from class: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.renderer.errors.g$$ExternalSyntheticLambda0
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return g.b();
        }
    });

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @VisibleForTesting
        public static /* synthetic */ void b() {
        }

        public final Map<String, g> a() {
            return (Map) g.g.getValue();
        }

        public a() {
        }

        public final g a(String description) {
            Intrinsics.checkNotNullParameter(description, "description");
            g gVar = a().get(description);
            return gVar == null ? b.h : gVar;
        }
    }

    public static final class b extends g {
        public static final b h = new b();
        public static final int i = 0;

        public b() {
            super(Integer.MIN_VALUE, "UNKNOWN", false, true, null);
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof b);
        }

        public int hashCode() {
            return -2068672870;
        }

        public String toString() {
            return "UndocumentedTemplateError";
        }
    }

    public /* synthetic */ g(int i, String str, boolean z, boolean z2, DefaultConstructorMarker defaultConstructorMarker) {
        this(i, str, z, z2);
    }

    public static final Map b() {
        List listOf = CollectionsKt.listOf((Object[]) new g[]{a.C0319a.j, k.c.j, k.a.j, k.b.j, k.d.j, k.e.j, k.f.j, k.g.j, c.C0321c.j, c.b.j, c.a.j, d.a.j, b.a.j, b.c.j, b.d.j, b.C0320b.j, b.e.j, i.a.j, i.b.j, e.a.j, j.a.j, f.a.j, f.b.j, f.c.j});
        LinkedHashMap linkedHashMap = new LinkedHashMap(RangesKt.coerceAtLeast(MapsKt.mapCapacity(CollectionsKt.collectionSizeOrDefault(listOf, 10)), 16));
        for (Object obj : listOf) {
            linkedHashMap.put(((g) obj).c(), obj);
        }
        return linkedHashMap;
    }

    public String c() {
        return this.b;
    }

    public final int d() {
        return this.a;
    }

    public boolean e() {
        return this.c;
    }

    public boolean f() {
        return this.d;
    }

    public g(int i, String str, boolean z, boolean z2) {
        this.a = i;
        this.b = str;
        this.c = z;
        this.d = z2;
    }
}
