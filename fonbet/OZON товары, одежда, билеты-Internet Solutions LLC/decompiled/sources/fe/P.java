package fe;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import td.AbstractC9850p;
import td.AbstractC9853s;
import td.C9852r;
import td.InterfaceC9836b;

/* loaded from: classes.dex */
public final class P {

    public /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f63181a;

        /* renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ int[] f63182b;

        static {
            int[] iArr = new int[Nd.i.values().length];
            try {
                iArr[Nd.i.DECLARATION.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[Nd.i.FAKE_OVERRIDE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[Nd.i.DELEGATION.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[Nd.i.SYNTHESIZED.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            f63181a = iArr;
            int[] iArr2 = new int[InterfaceC9836b.a.values().length];
            try {
                iArr2[InterfaceC9836b.a.DECLARATION.ordinal()] = 1;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr2[InterfaceC9836b.a.FAKE_OVERRIDE.ordinal()] = 2;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr2[InterfaceC9836b.a.DELEGATION.ordinal()] = 3;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr2[InterfaceC9836b.a.SYNTHESIZED.ordinal()] = 4;
            } catch (NoSuchFieldError unused8) {
            }
            int[] iArr3 = new int[Nd.w.values().length];
            try {
                iArr3[Nd.w.INTERNAL.ordinal()] = 1;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr3[Nd.w.PRIVATE.ordinal()] = 2;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr3[Nd.w.PRIVATE_TO_THIS.ordinal()] = 3;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                iArr3[Nd.w.PROTECTED.ordinal()] = 4;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                iArr3[Nd.w.PUBLIC.ordinal()] = 5;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                iArr3[Nd.w.LOCAL.ordinal()] = 6;
            } catch (NoSuchFieldError unused14) {
            }
            f63182b = iArr3;
        }
    }

    @NotNull
    public static final AbstractC9850p a(Nd.w wVar) {
        AbstractC9853s INTERNAL;
        Intrinsics.checkNotNullParameter(O.f63176a, "<this>");
        switch (wVar == null ? -1 : a.f63182b[wVar.ordinal()]) {
            case 1:
                INTERNAL = C9852r.f99402d;
                Intrinsics.checkNotNullExpressionValue(INTERNAL, "INTERNAL");
                break;
            case 2:
                INTERNAL = C9852r.f99399a;
                Intrinsics.checkNotNullExpressionValue(INTERNAL, "PRIVATE");
                break;
            case 3:
                INTERNAL = C9852r.f99400b;
                Intrinsics.checkNotNullExpressionValue(INTERNAL, "PRIVATE_TO_THIS");
                break;
            case 4:
                INTERNAL = C9852r.f99401c;
                Intrinsics.checkNotNullExpressionValue(INTERNAL, "PROTECTED");
                break;
            case 5:
                INTERNAL = C9852r.f99403e;
                Intrinsics.checkNotNullExpressionValue(INTERNAL, "PUBLIC");
                break;
            case 6:
                INTERNAL = C9852r.f99404f;
                Intrinsics.checkNotNullExpressionValue(INTERNAL, "LOCAL");
                break;
            default:
                INTERNAL = C9852r.f99399a;
                Intrinsics.checkNotNullExpressionValue(INTERNAL, "PRIVATE");
                break;
        }
        return (AbstractC9850p) INTERNAL;
    }

    @NotNull
    public static final InterfaceC9836b.a b(Nd.i iVar) {
        Intrinsics.checkNotNullParameter(O.f63176a, "<this>");
        int i11 = iVar == null ? -1 : a.f63181a[iVar.ordinal()];
        return i11 != 1 ? i11 != 2 ? i11 != 3 ? i11 != 4 ? InterfaceC9836b.a.DECLARATION : InterfaceC9836b.a.SYNTHESIZED : InterfaceC9836b.a.DELEGATION : InterfaceC9836b.a.FAKE_OVERRIDE : InterfaceC9836b.a.DECLARATION;
    }
}
