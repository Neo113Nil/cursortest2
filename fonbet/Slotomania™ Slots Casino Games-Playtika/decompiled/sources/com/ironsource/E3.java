package com.ironsource;

import android.content.Context;
import com.ironsource.InterfaceC2592p4;
import com.ironsource.InterfaceC2595p7;
import com.ironsource.environment.ContextProvider;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Result;
import kotlin.Unit;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class E3 implements InterfaceC2595p7, InterfaceC2595p7.a {
    private final Wc a;
    private final C2728wf b;

    public /* synthetic */ class a {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[I3.values().length];
            try {
                iArr[I3.Pacing.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[I3.ShowCount.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[I3.Delivery.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            a = iArr;
        }
    }

    public E3() {
        this(null, null, null, 7, null);
    }

    @Override // com.ironsource.InterfaceC2595p7
    public synchronized G3 a(String identifier) {
        Intrinsics.checkNotNullParameter(identifier, "identifier");
        G3 a2 = this.a.a(identifier);
        if (a2.d()) {
            return a2;
        }
        return this.b.a(identifier);
    }

    @Override // com.ironsource.InterfaceC2595p7.a
    public synchronized void b(String identifier) {
        Intrinsics.checkNotNullParameter(identifier, "identifier");
        this.a.b(identifier);
        this.b.b(identifier);
    }

    public E3(InterfaceC2592p4 currentTimeProvider, I7 pacingDataRepository, P8 showCountDataRepository) {
        Intrinsics.checkNotNullParameter(currentTimeProvider, "currentTimeProvider");
        Intrinsics.checkNotNullParameter(pacingDataRepository, "pacingDataRepository");
        Intrinsics.checkNotNullParameter(showCountDataRepository, "showCountDataRepository");
        this.a = new Wc(currentTimeProvider, pacingDataRepository);
        this.b = new C2728wf(currentTimeProvider, showCountDataRepository);
    }

    @Override // com.ironsource.InterfaceC2595p7.a
    public synchronized Object a(String identifier, I3 cappingType, InterfaceC2559n7 cappingConfig) {
        Object a2;
        Intrinsics.checkNotNullParameter(identifier, "identifier");
        Intrinsics.checkNotNullParameter(cappingType, "cappingType");
        Intrinsics.checkNotNullParameter(cappingConfig, "cappingConfig");
        int i = a.a[cappingType.ordinal()];
        if (i == 1) {
            a2 = this.a.a(identifier, cappingType, cappingConfig);
        } else if (i == 2) {
            a2 = this.b.a(identifier, cappingType, cappingConfig);
        } else {
            if (i != 3) {
                throw new NoWhenBranchMatchedException();
            }
            Result.Companion companion = Result.INSTANCE;
            a2 = Result.m11180constructorimpl(Unit.INSTANCE);
        }
        return a2;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public /* synthetic */ E3(InterfaceC2592p4 interfaceC2592p4, I7 i7, P8 p8, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(interfaceC2592p4, i7, p8);
        interfaceC2592p4 = (i & 1) != 0 ? new InterfaceC2592p4.a() : interfaceC2592p4;
        if ((i & 2) != 0) {
            Context applicationContext = ContextProvider.getInstance().getApplicationContext();
            Intrinsics.checkNotNullExpressionValue(applicationContext, "getInstance().applicationContext");
            i7 = new Yc(new C2638rf(applicationContext, "pacing_service", null, 4, null));
        }
        if ((i & 4) != 0) {
            Context applicationContext2 = ContextProvider.getInstance().getApplicationContext();
            Intrinsics.checkNotNullExpressionValue(applicationContext2, "getInstance().applicationContext");
            p8 = new C2692uf(new C2638rf(applicationContext2, "capping_service", null, 4, null));
        }
    }
}
