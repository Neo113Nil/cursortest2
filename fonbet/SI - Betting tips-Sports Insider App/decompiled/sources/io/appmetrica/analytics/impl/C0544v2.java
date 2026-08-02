package io.appmetrica.analytics.impl;

import androidx.annotation.NonNull;
import io.appmetrica.analytics.coreapi.internal.data.ProtobufConverter;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* renamed from: io.appmetrica.analytics.impl.v2, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0544v2 implements ProtobufConverter {
    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    @NonNull
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final V1 fromModel(@NonNull C0594x2 c0594x2) {
        V1 v12 = new V1();
        EnumC0569w2 enumC0569w2 = c0594x2.f14885a;
        if (enumC0569w2 != null) {
            int ordinal = enumC0569w2.ordinal();
            if (ordinal == 0) {
                v12.f13009a = 6;
            } else if (ordinal == 1) {
                v12.f13009a = 1;
            } else if (ordinal == 2) {
                v12.f13009a = 2;
            } else if (ordinal == 3) {
                v12.f13009a = 3;
            } else if (ordinal == 4) {
                v12.f13009a = 4;
            } else if (ordinal != 5) {
                v12.f13009a = 0;
            } else {
                v12.f13009a = 5;
            }
        }
        Boolean bool = c0594x2.f14886b;
        if (bool != null) {
            if (bool.booleanValue()) {
                v12.f13010b = 1;
                return v12;
            }
            v12.f13010b = 0;
        }
        return v12;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    @NonNull
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C0594x2 toModel(@NonNull V1 v12) {
        EnumC0569w2 enumC0569w2;
        Boolean bool = null;
        switch (v12.f13009a) {
            case 1:
                enumC0569w2 = EnumC0569w2.ACTIVE;
                break;
            case 2:
                enumC0569w2 = EnumC0569w2.WORKING_SET;
                break;
            case 3:
                enumC0569w2 = EnumC0569w2.FREQUENT;
                break;
            case 4:
                enumC0569w2 = EnumC0569w2.RARE;
                break;
            case 5:
                enumC0569w2 = EnumC0569w2.RESTRICTED;
                break;
            case 6:
                enumC0569w2 = EnumC0569w2.EXEMPTED;
                break;
            default:
                enumC0569w2 = null;
                break;
        }
        int i5 = v12.f13010b;
        if (i5 == 0) {
            bool = Boolean.FALSE;
        } else if (i5 == 1) {
            bool = Boolean.TRUE;
        }
        return new C0594x2(enumC0569w2, bool);
    }
}
