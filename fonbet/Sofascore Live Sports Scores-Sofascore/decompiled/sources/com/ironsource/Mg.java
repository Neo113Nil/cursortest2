package com.ironsource;

import com.blaze.blazesdk.data_source.BlazeDataSourcePersonalizedType;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes4.dex */
public final class Mg {

    @NotNull
    private final List<B> a;

    /* JADX WARN: Multi-variable type inference failed */
    public Mg(@NotNull List<? extends B> list) {
        list.getClass();
        this.a = list;
    }

    private final String a(C4227o2 c4227o2, int i) {
        return String.format("%s%s", Arrays.copyOf(new Object[]{Integer.valueOf(i), c4227o2.c()}, 2));
    }

    @NotNull
    public final List<B> b() {
        return this.a;
    }

    public final int c() {
        return this.a.size();
    }

    @NotNull
    public final String d() {
        ArrayList arrayList = new ArrayList();
        for (B b : this.a) {
            arrayList.add(a(b.h(), b.r()));
        }
        return CollectionsKt.f0(arrayList, BlazeDataSourcePersonalizedType.STRING_SEPARATOR, null, null, null, 62);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof Mg) && Intrinsics.c(this.a, ((Mg) obj).a);
    }

    public int hashCode() {
        return this.a.hashCode();
    }

    @NotNull
    public String toString() {
        return com.appsflyer.internal.i.i("WaterfallInstances(instances=", ")", this.a);
    }

    @NotNull
    public final Mg a(@NotNull List<? extends B> list) {
        list.getClass();
        return new Mg(list);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ Mg a(Mg mg, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            list = mg.a;
        }
        return mg.a(list);
    }

    @NotNull
    public final List<B> a() {
        return this.a;
    }
}
