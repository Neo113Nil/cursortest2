package com.ironsource;

import android.content.Context;
import com.ironsource.InterfaceC4193m4;
import com.ironsource.InterfaceC4196m7;
import com.ironsource.environment.ContextProvider;
import defpackage.ndd;
import defpackage.p2g;
import defpackage.w2g;
import kotlin.Unit;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes4.dex */
public final class B3 implements InterfaceC4196m7, InterfaceC4196m7.a {

    @NotNull
    private final Wc a;

    @NotNull
    private final C4347uf b;

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    public /* synthetic */ class a {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[F3.values().length];
            try {
                iArr[F3.Pacing.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[F3.ShowCount.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[F3.Delivery.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            a = iArr;
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public /* synthetic */ B3(InterfaceC4193m4 interfaceC4193m4, G7 g7, N8 n8, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(interfaceC4193m4, g7, n8);
        interfaceC4193m4 = (i & 1) != 0 ? new InterfaceC4193m4.a() : interfaceC4193m4;
        if ((i & 2) != 0) {
            Context applicationContext = ContextProvider.getInstance().getApplicationContext();
            applicationContext.getClass();
            g7 = new Yc(new C4258pf(applicationContext, "pacing_service", null, 4, null));
        }
        if ((i & 4) != 0) {
            Context applicationContext2 = ContextProvider.getInstance().getApplicationContext();
            applicationContext2.getClass();
            n8 = new C4311sf(new C4258pf(applicationContext2, "capping_service", null, 4, null));
        }
    }

    @Override // com.ironsource.InterfaceC4196m7.a
    @NotNull
    public synchronized Object a(@NotNull String str, @NotNull F3 f3, @NotNull InterfaceC4160k7 interfaceC4160k7) {
        Object a2;
        try {
            str.getClass();
            f3.getClass();
            interfaceC4160k7.getClass();
            int i = a.a[f3.ordinal()];
            if (i == 1) {
                a2 = this.a.a(str, f3, interfaceC4160k7);
            } else if (i == 2) {
                a2 = this.b.a(str, f3, interfaceC4160k7);
            } else {
                if (i != 3) {
                    throw new ndd();
                }
                p2g p2gVar = w2g.b;
                a2 = Unit.a;
            }
        } catch (Throwable th) {
            throw th;
        }
        return a2;
    }

    @Override // com.ironsource.InterfaceC4196m7.a
    public synchronized void b(@NotNull String str) {
        str.getClass();
        this.a.b(str);
        this.b.b(str);
    }

    @Override // com.ironsource.InterfaceC4196m7
    @NotNull
    public synchronized D3 a(@NotNull String str) {
        str.getClass();
        D3 a2 = this.a.a(str);
        if (a2.d()) {
            return a2;
        }
        return this.b.a(str);
    }

    public B3(@NotNull InterfaceC4193m4 interfaceC4193m4, @NotNull G7 g7, @NotNull N8 n8) {
        interfaceC4193m4.getClass();
        g7.getClass();
        n8.getClass();
        this.a = new Wc(interfaceC4193m4, g7);
        this.b = new C4347uf(interfaceC4193m4, n8);
    }

    public B3() {
        this(null, null, null, 7, null);
    }
}
