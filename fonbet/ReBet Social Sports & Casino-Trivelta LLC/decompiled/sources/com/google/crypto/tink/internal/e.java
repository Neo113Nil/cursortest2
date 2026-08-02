package com.google.crypto.tink.internal;

import com.google.crypto.tink.proto.I;
import com.google.crypto.tink.proto.y;

/* loaded from: classes3.dex */
public final class e extends com.google.crypto.tink.g {

    /* renamed from: a, reason: collision with root package name */
    public final o f37053a;

    public static /* synthetic */ class a {
        static final /* synthetic */ int[] $SwitchMap$com$google$crypto$tink$proto$KeyData$KeyMaterialType;
        static final /* synthetic */ int[] $SwitchMap$com$google$crypto$tink$proto$OutputPrefixType;

        static {
            int[] iArr = new int[y.c.values().length];
            $SwitchMap$com$google$crypto$tink$proto$KeyData$KeyMaterialType = iArr;
            try {
                iArr[y.c.SYMMETRIC.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$google$crypto$tink$proto$KeyData$KeyMaterialType[y.c.ASYMMETRIC_PRIVATE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            int[] iArr2 = new int[I.values().length];
            $SwitchMap$com$google$crypto$tink$proto$OutputPrefixType = iArr2;
            try {
                iArr2[I.TINK.ordinal()] = 1;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$com$google$crypto$tink$proto$OutputPrefixType[I.LEGACY.ordinal()] = 2;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                $SwitchMap$com$google$crypto$tink$proto$OutputPrefixType[I.RAW.ordinal()] = 3;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                $SwitchMap$com$google$crypto$tink$proto$OutputPrefixType[I.CRUNCHY.ordinal()] = 4;
            } catch (NoSuchFieldError unused6) {
            }
        }
    }

    public e(o oVar, com.google.crypto.tink.y yVar) {
        a(oVar, yVar);
        this.f37053a = oVar;
    }

    public static void a(o oVar, com.google.crypto.tink.y yVar) {
        int i10 = a.$SwitchMap$com$google$crypto$tink$proto$KeyData$KeyMaterialType[oVar.d().ordinal()];
        if (i10 == 1 || i10 == 2) {
            com.google.crypto.tink.y.b(yVar);
        }
    }
}
