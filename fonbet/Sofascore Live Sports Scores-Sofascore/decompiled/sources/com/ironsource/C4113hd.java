package com.ironsource;

import com.ironsource.H7;
import com.unity3d.mediation.LevelPlay;
import defpackage.ndd;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* renamed from: com.ironsource.hd, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C4113hd implements H7, H7.a {

    @NotNull
    private final B3 a;

    @NotNull
    private final K4 b;

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    /* renamed from: com.ironsource.hd$a */
    public /* synthetic */ class a {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[F3.values().length];
            try {
                iArr[F3.Delivery.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[F3.Pacing.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[F3.ShowCount.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            a = iArr;
        }
    }

    public /* synthetic */ C4113hd(B3 b3, K4 k4, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? new B3(null, null, null, 7, null) : b3, (i & 2) != 0 ? new K4() : k4);
    }

    @Override // com.ironsource.H7.a
    @NotNull
    public synchronized Object a(@NotNull String str, @NotNull LevelPlay.AdFormat adFormat, @NotNull F3 f3, @NotNull InterfaceC4160k7 interfaceC4160k7) {
        Object a2;
        try {
            str.getClass();
            adFormat.getClass();
            f3.getClass();
            interfaceC4160k7.getClass();
            String a3 = new C4220nd(str, adFormat).a();
            int i = a.a[f3.ordinal()];
            if (i != 1) {
                if (i != 2 && i != 3) {
                    throw new ndd();
                }
                a2 = this.a.a(a3, f3, interfaceC4160k7);
            } else {
                a2 = this.b.a(a3, f3, interfaceC4160k7);
            }
        } catch (Throwable th) {
            throw th;
        }
        return a2;
    }

    @Override // com.ironsource.H7.a
    public synchronized void b(@NotNull String str, @NotNull LevelPlay.AdFormat adFormat) {
        str.getClass();
        adFormat.getClass();
        String a2 = new C4220nd(str, adFormat).a();
        if (!this.b.a(a2).d()) {
            this.a.b(a2);
        }
    }

    public C4113hd(@NotNull B3 b3, @NotNull K4 k4) {
        b3.getClass();
        k4.getClass();
        this.a = b3;
        this.b = k4;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C4113hd() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    @Override // com.ironsource.H7
    @NotNull
    public synchronized D3 a(@NotNull String str, @NotNull LevelPlay.AdFormat adFormat) {
        str.getClass();
        adFormat.getClass();
        String a2 = new C4220nd(str, adFormat).a();
        D3 a3 = this.b.a(a2);
        if (a3.d()) {
            return a3;
        }
        return this.a.a(a2);
    }
}
