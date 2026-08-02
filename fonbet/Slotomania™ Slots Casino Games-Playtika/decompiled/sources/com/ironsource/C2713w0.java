package com.ironsource;

import com.ironsource.mediationsdk.model.NetworkSettings;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.ironsource.w0, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C2713w0 {
    private final String a;
    private final List<NetworkSettings> b;
    private final C2526la c;

    /* JADX WARN: Multi-variable type inference failed */
    public C2713w0(String str, List<? extends NetworkSettings> providerList, C2526la publisherDataHolder) {
        Intrinsics.checkNotNullParameter(providerList, "providerList");
        Intrinsics.checkNotNullParameter(publisherDataHolder, "publisherDataHolder");
        this.a = str;
        this.b = providerList;
        this.c = publisherDataHolder;
    }

    public final String a() {
        return this.a;
    }

    public final List<NetworkSettings> b() {
        return this.b;
    }

    public final C2526la c() {
        return this.c;
    }

    public final List<NetworkSettings> d() {
        return this.b;
    }

    public final C2526la e() {
        return this.c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2713w0)) {
            return false;
        }
        C2713w0 c2713w0 = (C2713w0) obj;
        return Intrinsics.areEqual(this.a, c2713w0.a) && Intrinsics.areEqual(this.b, c2713w0.b) && Intrinsics.areEqual(this.c, c2713w0.c);
    }

    public final String f() {
        return this.a;
    }

    public int hashCode() {
        String str = this.a;
        return ((((str == null ? 0 : str.hashCode()) * 31) + this.b.hashCode()) * 31) + this.c.hashCode();
    }

    public String toString() {
        return "AdUnitCommonData(userId=" + this.a + ", providerList=" + this.b + ", publisherDataHolder=" + this.c + ")";
    }

    public final C2713w0 a(String str, List<? extends NetworkSettings> providerList, C2526la publisherDataHolder) {
        Intrinsics.checkNotNullParameter(providerList, "providerList");
        Intrinsics.checkNotNullParameter(publisherDataHolder, "publisherDataHolder");
        return new C2713w0(str, providerList, publisherDataHolder);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ C2713w0 a(C2713w0 c2713w0, String str, List list, C2526la c2526la, int i, Object obj) {
        if ((i & 1) != 0) {
            str = c2713w0.a;
        }
        if ((i & 2) != 0) {
            list = c2713w0.b;
        }
        if ((i & 4) != 0) {
            c2526la = c2713w0.c;
        }
        return c2713w0.a(str, list, c2526la);
    }
}
