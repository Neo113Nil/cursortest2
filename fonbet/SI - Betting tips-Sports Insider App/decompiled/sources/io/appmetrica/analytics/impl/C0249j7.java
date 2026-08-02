package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreapi.internal.data.Converter;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* renamed from: io.appmetrica.analytics.impl.j7, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0249j7 implements Converter {

    /* renamed from: a, reason: collision with root package name */
    public final C0307le f14009a;

    /* JADX WARN: Multi-variable type inference failed */
    public C0249j7() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    @NotNull
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C0350n7 fromModel(@NotNull C0224i7 c0224i7) {
        C0350n7 c0350n7 = new C0350n7();
        Boolean bool = c0224i7.f13922a;
        if (bool != null) {
            c0350n7.f14302a = this.f14009a.fromModel(bool).intValue();
        }
        Double d10 = c0224i7.f13924c;
        if (d10 != null) {
            c0350n7.f14304c = d10.doubleValue();
        }
        Double d11 = c0224i7.f13923b;
        if (d11 != null) {
            c0350n7.f14303b = d11.doubleValue();
        }
        Long l6 = c0224i7.f13929h;
        if (l6 != null) {
            c0350n7.f14309h = l6.longValue();
        }
        Integer num = c0224i7.f13927f;
        if (num != null) {
            c0350n7.f14307f = num.intValue();
        }
        Integer num2 = c0224i7.f13926e;
        if (num2 != null) {
            c0350n7.f14306e = num2.intValue();
        }
        Integer num3 = c0224i7.f13928g;
        if (num3 != null) {
            c0350n7.f14308g = num3.intValue();
        }
        Integer num4 = c0224i7.f13925d;
        if (num4 != null) {
            c0350n7.f14305d = num4.intValue();
        }
        String str = c0224i7.f13930i;
        if (str != null) {
            c0350n7.f14310i = str;
        }
        String str2 = c0224i7.j;
        if (str2 != null) {
            c0350n7.j = str2;
        }
        return c0350n7;
    }

    public C0249j7(@NotNull C0307le c0307le) {
        this.f14009a = c0307le;
    }

    public /* synthetic */ C0249j7(C0307le c0307le, int i5, DefaultConstructorMarker defaultConstructorMarker) {
        this((i5 & 1) != 0 ? new C0307le() : c0307le);
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    @NotNull
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C0224i7 toModel(@Nullable C0350n7 c0350n7) {
        if (c0350n7 == null) {
            return new C0224i7(null, null, null, null, null, null, null, null, null, null);
        }
        C0350n7 c0350n72 = new C0350n7();
        Boolean a7 = this.f14009a.a(c0350n7.f14302a);
        double d10 = c0350n7.f14304c;
        Double valueOf = Double.valueOf(d10);
        if (d10 == c0350n72.f14304c) {
            valueOf = null;
        }
        double d11 = c0350n7.f14303b;
        Double valueOf2 = !(d11 == c0350n72.f14303b) ? Double.valueOf(d11) : null;
        long j = c0350n7.f14309h;
        Long valueOf3 = j != c0350n72.f14309h ? Long.valueOf(j) : null;
        int i5 = c0350n7.f14307f;
        Integer valueOf4 = i5 != c0350n72.f14307f ? Integer.valueOf(i5) : null;
        int i10 = c0350n7.f14306e;
        Integer valueOf5 = i10 != c0350n72.f14306e ? Integer.valueOf(i10) : null;
        int i11 = c0350n7.f14308g;
        Integer valueOf6 = i11 != c0350n72.f14308g ? Integer.valueOf(i11) : null;
        int i12 = c0350n7.f14305d;
        Integer valueOf7 = i12 != c0350n72.f14305d ? Integer.valueOf(i12) : null;
        String str = c0350n7.f14310i;
        String str2 = !Intrinsics.areEqual(str, c0350n72.f14310i) ? str : null;
        String str3 = c0350n7.j;
        return new C0224i7(a7, valueOf2, valueOf, valueOf7, valueOf5, valueOf4, valueOf6, valueOf3, str2, !Intrinsics.areEqual(str3, c0350n72.j) ? str3 : null);
    }
}
