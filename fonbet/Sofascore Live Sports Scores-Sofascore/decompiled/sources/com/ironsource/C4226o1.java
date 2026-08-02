package com.ironsource;

import com.ironsource.mediationsdk.IronSource;
import defpackage.zzl;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* renamed from: com.ironsource.o1, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C4226o1 implements InterfaceC4244p1 {

    @NotNull
    private final IronSource.a a;

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    /* renamed from: com.ironsource.o1$a */
    public /* synthetic */ class a {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[IronSource.a.values().length];
            try {
                iArr[IronSource.a.INTERSTITIAL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[IronSource.a.REWARDED_VIDEO.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[IronSource.a.BANNER.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            a = iArr;
        }
    }

    public C4226o1(@NotNull IronSource.a aVar) {
        aVar.getClass();
        this.a = aVar;
    }

    @Override // com.ironsource.InterfaceC4244p1
    @NotNull
    public InterfaceC4262q1 a(@NotNull InterfaceC4172l1 interfaceC4172l1) {
        interfaceC4172l1.getClass();
        int i = a.a[this.a.ordinal()];
        if (i == 1) {
            return new C9(interfaceC4172l1);
        }
        if (i == 2) {
            return new C4024ce(interfaceC4172l1);
        }
        if (i == 3) {
            return new P2(interfaceC4172l1);
        }
        zzl.i(this.a, "Unsupported ad format: ");
        return null;
    }
}
