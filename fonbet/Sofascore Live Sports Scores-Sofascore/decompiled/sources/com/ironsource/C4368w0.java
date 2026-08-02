package com.ironsource;

import com.ironsource.mediationsdk.model.NetworkSettings;
import defpackage.dmi;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* renamed from: com.ironsource.w0, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C4368w0 {

    @Nullable
    private final String a;

    @NotNull
    private final List<NetworkSettings> b;

    @NotNull
    private final C4181la c;

    /* JADX WARN: Multi-variable type inference failed */
    public C4368w0(@Nullable String str, @NotNull List<? extends NetworkSettings> list, @NotNull C4181la c4181la) {
        list.getClass();
        c4181la.getClass();
        this.a = str;
        this.b = list;
        this.c = c4181la;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ C4368w0 a(C4368w0 c4368w0, String str, List list, C4181la c4181la, int i, Object obj) {
        if ((i & 1) != 0) {
            str = c4368w0.a;
        }
        if ((i & 2) != 0) {
            list = c4368w0.b;
        }
        if ((i & 4) != 0) {
            c4181la = c4368w0.c;
        }
        return c4368w0.a(str, list, c4181la);
    }

    @NotNull
    public final List<NetworkSettings> b() {
        return this.b;
    }

    @NotNull
    public final C4181la c() {
        return this.c;
    }

    @NotNull
    public final List<NetworkSettings> d() {
        return this.b;
    }

    @NotNull
    public final C4181la e() {
        return this.c;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C4368w0)) {
            return false;
        }
        C4368w0 c4368w0 = (C4368w0) obj;
        return Intrinsics.c(this.a, c4368w0.a) && Intrinsics.c(this.b, c4368w0.b) && Intrinsics.c(this.c, c4368w0.c);
    }

    @Nullable
    public final String f() {
        return this.a;
    }

    public int hashCode() {
        String str = this.a;
        return this.c.hashCode() + dmi.d((str == null ? 0 : str.hashCode()) * 31, 31, this.b);
    }

    @NotNull
    public String toString() {
        return "AdUnitCommonData(userId=" + this.a + ", providerList=" + this.b + ", publisherDataHolder=" + this.c + ")";
    }

    @NotNull
    public final C4368w0 a(@Nullable String str, @NotNull List<? extends NetworkSettings> list, @NotNull C4181la c4181la) {
        list.getClass();
        c4181la.getClass();
        return new C4368w0(str, list, c4181la);
    }

    @Nullable
    public final String a() {
        return this.a;
    }
}
