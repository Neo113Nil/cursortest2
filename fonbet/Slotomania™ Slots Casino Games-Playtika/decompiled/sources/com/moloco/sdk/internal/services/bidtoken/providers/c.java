package com.moloco.sdk.internal.services.bidtoken.providers;

import com.moloco.sdk.internal.MolocoLogger;
import com.moloco.sdk.internal.services.AbstractC2808c;
import com.moloco.sdk.internal.services.InterfaceC2809d;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes8.dex */
public final class c implements j<AbstractC2808c> {
    public static final a d = new a(null);
    public static final int e = 8;
    public static final String f = "AdvertisingSignalProvider";
    public final InterfaceC2809d b;
    public AbstractC2808c c;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public a() {
        }
    }

    public c(InterfaceC2809d advertisingService) {
        Intrinsics.checkNotNullParameter(advertisingService, "advertisingService");
        this.b = advertisingService;
        this.c = e();
    }

    @Override // com.moloco.sdk.internal.services.bidtoken.providers.j
    public void a() {
        this.c = e();
    }

    @Override // com.moloco.sdk.internal.services.bidtoken.providers.j
    public boolean b() {
        boolean z = !Intrinsics.areEqual(this.c, e());
        MolocoLogger.debugBuildLog$default(MolocoLogger.INSTANCE, f, "[CBT][ASP]: needsRefresh: " + z, false, 4, null);
        return z;
    }

    @Override // com.moloco.sdk.internal.services.bidtoken.providers.j
    public String c() {
        return f;
    }

    public final AbstractC2808c e() {
        AbstractC2808c a2 = this.b.a();
        MolocoLogger.debugBuildLog$default(MolocoLogger.INSTANCE, f, "[CBT][ASP]: adData: " + a2, false, 4, null);
        return a2;
    }

    @Override // com.moloco.sdk.internal.services.bidtoken.providers.j
    /* renamed from: f, reason: merged with bridge method [inline-methods] */
    public AbstractC2808c d() {
        return e();
    }
}
