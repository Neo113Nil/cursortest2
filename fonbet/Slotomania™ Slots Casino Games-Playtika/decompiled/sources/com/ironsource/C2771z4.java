package com.ironsource;

import android.content.Context;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.ironsource.z4, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C2771z4 implements InterfaceC2720w7 {

    /* renamed from: com.ironsource.z4$a */
    public /* synthetic */ class a {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[EnumC2699v4.values().length];
            try {
                iArr[EnumC2699v4.IADS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[EnumC2699v4.UADS.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[EnumC2699v4.SHARED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[EnumC2699v4.NONE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            a = iArr;
        }
    }

    @Override // com.ironsource.InterfaceC2720w7
    public B4 a(Context context, EnumC2699v4 source) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(source, "source");
        int i = a.a[source.ordinal()];
        if (i == 1) {
            return new C2753y4(context, "supersonic_shared_preferen");
        }
        if (i == 2) {
            return new C2753y4(context, "unityads-installinfo");
        }
        if (i == 3) {
            return new C2753y4(context, A4.c);
        }
        if (i == 4) {
            return null;
        }
        throw new NoWhenBranchMatchedException();
    }
}
