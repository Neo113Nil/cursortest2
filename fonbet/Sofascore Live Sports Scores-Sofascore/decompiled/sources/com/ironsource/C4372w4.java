package com.ironsource;

import android.content.Context;
import defpackage.zzl;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* renamed from: com.ironsource.w4, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C4372w4 implements InterfaceC4321t7 {

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    /* renamed from: com.ironsource.w4$a */
    public /* synthetic */ class a {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[EnumC4300s4.values().length];
            try {
                iArr[EnumC4300s4.IADS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[EnumC4300s4.UADS.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[EnumC4300s4.SHARED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[EnumC4300s4.NONE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            a = iArr;
        }
    }

    @Override // com.ironsource.InterfaceC4321t7
    @Nullable
    public InterfaceC4408y4 a(@NotNull Context context, @NotNull EnumC4300s4 enumC4300s4) {
        context.getClass();
        enumC4300s4.getClass();
        int i = a.a[enumC4300s4.ordinal()];
        if (i == 1) {
            return new C4354v4(context, "supersonic_shared_preferen");
        }
        if (i == 2) {
            return new C4354v4(context, "unityads-installinfo");
        }
        if (i == 3) {
            return new C4354v4(context, C4390x4.c);
        }
        if (i == 4) {
            return null;
        }
        zzl.b();
        return null;
    }
}
