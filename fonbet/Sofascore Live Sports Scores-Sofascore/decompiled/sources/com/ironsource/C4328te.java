package com.ironsource;

import com.ironsource.mediationsdk.IronSource;
import defpackage.mz1;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* renamed from: com.ironsource.te, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C4328te {

    @NotNull
    private final String a;

    @Nullable
    private final String b;

    @NotNull
    private final List<IronSource.a> c;

    public C4328te(@NotNull String str, @Nullable String str2, @NotNull List<IronSource.a> list) {
        str.getClass();
        list.getClass();
        this.a = str;
        this.b = str2;
        this.c = list;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ C4328te a(C4328te c4328te, String str, String str2, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            str = c4328te.a;
        }
        if ((i & 2) != 0) {
            str2 = c4328te.b;
        }
        if ((i & 4) != 0) {
            list = c4328te.c;
        }
        return c4328te.a(str, str2, list);
    }

    @Nullable
    public final String b() {
        return this.b;
    }

    @NotNull
    public final List<IronSource.a> c() {
        return this.c;
    }

    @NotNull
    public final String d() {
        return this.a;
    }

    @NotNull
    public final List<IronSource.a> e() {
        return this.c;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C4328te)) {
            return false;
        }
        C4328te c4328te = (C4328te) obj;
        return Intrinsics.c(this.a, c4328te.a) && Intrinsics.c(this.b, c4328te.b) && Intrinsics.c(this.c, c4328te.c);
    }

    @Nullable
    public final String f() {
        return this.b;
    }

    public int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        String str = this.b;
        return this.c.hashCode() + ((hashCode + (str == null ? 0 : str.hashCode())) * 31);
    }

    @NotNull
    public String toString() {
        String str = this.a;
        String str2 = this.b;
        return mz1.p(mz1.s("SdkInitRequest(appKey=", str, ", userId=", str2, ", legacyAdFormats="), this.c, ")");
    }

    public /* synthetic */ C4328te(String str, String str2, List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i & 2) != 0 ? null : str2, list);
    }

    @NotNull
    public final C4328te a(@NotNull String str, @Nullable String str2, @NotNull List<IronSource.a> list) {
        str.getClass();
        list.getClass();
        return new C4328te(str, str2, list);
    }

    @NotNull
    public final String a() {
        return this.a;
    }

    public final void a(@NotNull List<? extends IronSource.a> list) {
        list.getClass();
        this.c.clear();
        this.c.addAll(list);
    }
}
