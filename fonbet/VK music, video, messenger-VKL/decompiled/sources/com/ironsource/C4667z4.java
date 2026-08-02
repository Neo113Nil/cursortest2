package com.ironsource;

import android.content.Context;
import kotlin.NoWhenBranchMatchedException;

/* renamed from: com.ironsource.z4, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C4667z4 implements InterfaceC4634x7 {

    /* renamed from: com.ironsource.z4$a */
    public /* synthetic */ class a {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[EnumC4595v4.values().length];
            try {
                iArr[EnumC4595v4.IADS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[EnumC4595v4.UADS.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[EnumC4595v4.SHARED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[EnumC4595v4.NONE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            a = iArr;
        }
    }

    @Override // com.ironsource.InterfaceC4634x7
    public B4 a(Context context, EnumC4595v4 enumC4595v4) {
        int i = a.a[enumC4595v4.ordinal()];
        if (i == 1) {
            return new C4649y4(context, "supersonic_shared_preferen");
        }
        if (i == 2) {
            return new C4649y4(context, "unityads-installinfo");
        }
        if (i == 3) {
            return new C4649y4(context, A4.c);
        }
        if (i == 4) {
            return null;
        }
        throw new NoWhenBranchMatchedException();
    }
}
