package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreapi.internal.data.ProtobufConverter;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.util.Arrays;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* renamed from: io.appmetrica.analytics.impl.b7, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0043b7 implements ProtobufConverter {

    /* renamed from: a, reason: collision with root package name */
    public final C0307le f13401a;

    /* renamed from: b, reason: collision with root package name */
    public final C0249j7 f13402b;

    /* JADX WARN: Multi-variable type inference failed */
    public C0043b7() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    @NotNull
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C0325m7 fromModel(@NotNull C0095d7 c0095d7) {
        C0325m7 c0325m7 = new C0325m7();
        Integer num = c0095d7.f13565a;
        if (num != null) {
            c0325m7.f14234a = num.intValue();
        }
        String str = c0095d7.f13566b;
        if (str != null) {
            c0325m7.f14235b = StringUtils.correctIllFormedString(str);
        }
        String str2 = c0095d7.f13567c;
        if (str2 != null) {
            c0325m7.f14236c = StringUtils.correctIllFormedString(str2);
        }
        Long l6 = c0095d7.f13568d;
        if (l6 != null) {
            c0325m7.f14237d = l6.longValue();
        }
        C0224i7 c0224i7 = c0095d7.f13569e;
        if (c0224i7 != null) {
            c0325m7.f14238e = this.f13402b.fromModel(c0224i7);
        }
        String str3 = c0095d7.f13570f;
        if (str3 != null) {
            c0325m7.f14239f = str3;
        }
        String str4 = c0095d7.f13571g;
        if (str4 != null) {
            c0325m7.f14240g = str4;
        }
        Long l10 = c0095d7.f13572h;
        if (l10 != null) {
            c0325m7.f14241h = l10.longValue();
        }
        Integer num2 = c0095d7.f13573i;
        if (num2 != null) {
            c0325m7.f14242i = num2.intValue();
        }
        Integer num3 = c0095d7.j;
        if (num3 != null) {
            c0325m7.j = num3.intValue();
        }
        String str5 = c0095d7.f13574k;
        if (str5 != null) {
            c0325m7.f14243k = str5;
        }
        I8 i82 = c0095d7.f13575l;
        if (i82 != null) {
            c0325m7.f14244l = i82.f12379a;
        }
        String str6 = c0095d7.f13576m;
        if (str6 != null) {
            c0325m7.f14245m = str6;
        }
        EnumC0098da enumC0098da = c0095d7.f13577n;
        if (enumC0098da != null) {
            c0325m7.f14246n = enumC0098da.f13590a;
        }
        EnumC0327m9 enumC0327m9 = c0095d7.f13578o;
        if (enumC0327m9 != null) {
            c0325m7.f14247o = enumC0327m9.f14257a;
        }
        Boolean bool = c0095d7.f13579p;
        if (bool != null) {
            c0325m7.f14248p = this.f13401a.fromModel(bool).intValue();
        }
        Integer num4 = c0095d7.q;
        if (num4 != null) {
            c0325m7.q = num4.intValue();
        }
        byte[] bArr = c0095d7.f13580r;
        if (bArr != null) {
            c0325m7.f14249r = bArr;
        }
        return c0325m7;
    }

    public C0043b7(@NotNull C0307le c0307le, @NotNull C0249j7 c0249j7) {
        this.f13401a = c0307le;
        this.f13402b = c0249j7;
    }

    public /* synthetic */ C0043b7(C0307le c0307le, C0249j7 c0249j7, int i5, DefaultConstructorMarker defaultConstructorMarker) {
        this((i5 & 1) != 0 ? new C0307le() : c0307le, (i5 & 2) != 0 ? new C0249j7(null, 1, null) : c0249j7);
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    @NotNull
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C0095d7 toModel(@NotNull C0325m7 c0325m7) {
        EnumC0327m9 enumC0327m9;
        C0325m7 c0325m72 = new C0325m7();
        int i5 = c0325m7.f14234a;
        Integer valueOf = i5 != c0325m72.f14234a ? Integer.valueOf(i5) : null;
        String str = c0325m7.f14235b;
        String str2 = !Intrinsics.areEqual(str, c0325m72.f14235b) ? str : null;
        String str3 = c0325m7.f14236c;
        String str4 = !Intrinsics.areEqual(str3, c0325m72.f14236c) ? str3 : null;
        long j = c0325m7.f14237d;
        Long valueOf2 = j != c0325m72.f14237d ? Long.valueOf(j) : null;
        C0224i7 model = this.f13402b.toModel(c0325m7.f14238e);
        String str5 = c0325m7.f14239f;
        String str6 = !Intrinsics.areEqual(str5, c0325m72.f14239f) ? str5 : null;
        String str7 = c0325m7.f14240g;
        String str8 = !Intrinsics.areEqual(str7, c0325m72.f14240g) ? str7 : null;
        long j6 = c0325m7.f14241h;
        Long valueOf3 = Long.valueOf(j6);
        if (j6 == c0325m72.f14241h) {
            valueOf3 = null;
        }
        int i10 = c0325m7.f14242i;
        Integer valueOf4 = i10 != c0325m72.f14242i ? Integer.valueOf(i10) : null;
        int i11 = c0325m7.j;
        Integer valueOf5 = i11 != c0325m72.j ? Integer.valueOf(i11) : null;
        String str9 = c0325m7.f14243k;
        String str10 = !Intrinsics.areEqual(str9, c0325m72.f14243k) ? str9 : null;
        int i12 = c0325m7.f14244l;
        Integer valueOf6 = Integer.valueOf(i12);
        if (i12 == c0325m72.f14244l) {
            valueOf6 = null;
        }
        I8 a7 = valueOf6 != null ? I8.a(Integer.valueOf(valueOf6.intValue())) : null;
        String str11 = c0325m7.f14245m;
        String str12 = !Intrinsics.areEqual(str11, c0325m72.f14245m) ? str11 : null;
        int i13 = c0325m7.f14246n;
        Integer valueOf7 = Integer.valueOf(i13);
        if (i13 == c0325m72.f14246n) {
            valueOf7 = null;
        }
        EnumC0098da a10 = valueOf7 != null ? EnumC0098da.a(Integer.valueOf(valueOf7.intValue())) : null;
        int i14 = c0325m7.f14247o;
        Integer valueOf8 = Integer.valueOf(i14);
        if (i14 == c0325m72.f14247o) {
            valueOf8 = null;
        }
        if (valueOf8 != null) {
            int intValue = valueOf8.intValue();
            EnumC0327m9[] values = EnumC0327m9.values();
            int length = values.length;
            int i15 = 0;
            while (true) {
                if (i15 < length) {
                    enumC0327m9 = values[i15];
                    EnumC0327m9[] enumC0327m9Arr = values;
                    if (enumC0327m9.f14257a == intValue) {
                        break;
                    }
                    i15++;
                    values = enumC0327m9Arr;
                } else {
                    enumC0327m9 = EnumC0327m9.NATIVE;
                    break;
                }
            }
        } else {
            enumC0327m9 = null;
        }
        Boolean a11 = this.f13401a.a(c0325m7.f14248p);
        int i16 = c0325m7.q;
        Integer valueOf9 = i16 != c0325m72.q ? Integer.valueOf(i16) : null;
        byte[] bArr = c0325m7.f14249r;
        return new C0095d7(valueOf, str2, str4, valueOf2, model, str6, str8, valueOf3, valueOf4, valueOf5, str10, a7, str12, a10, enumC0327m9, a11, valueOf9, !Arrays.equals(bArr, c0325m72.f14249r) ? bArr : null);
    }
}
