package com.ironsource;

import android.content.Context;
import com.ironsource.mediationsdk.logger.IronLog;
import kotlin.Unit;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.ironsource.w4, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C2717w4 implements O8, N8 {
    private final InterfaceC2720w7 a;

    /* JADX WARN: Multi-variable type inference failed */
    public C2717w4() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    @Override // com.ironsource.N8
    public void a(Context context, EnumC2699v4 source, String key, String value) {
        Unit unit;
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(source, "source");
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(value, "value");
        B4 a = this.a.a(context, source);
        if (a != null) {
            a.b(key, value);
            unit = Unit.INSTANCE;
        } else {
            unit = null;
        }
        if (unit == null) {
            IronLog.INTERNAL.error("Shared storage does not exist for source: " + source);
        }
    }

    public C2717w4(InterfaceC2720w7 sharedSignalsStorageFactory) {
        Intrinsics.checkNotNullParameter(sharedSignalsStorageFactory, "sharedSignalsStorageFactory");
        this.a = sharedSignalsStorageFactory;
    }

    @Override // com.ironsource.O8
    public String a(Context context, EnumC2699v4 source, String key) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(source, "source");
        Intrinsics.checkNotNullParameter(key, "key");
        B4 a = this.a.a(context, source);
        if (a != null) {
            return B4.a(a, key, null, 2, null);
        }
        IronLog.INTERNAL.error("Shared storage does not exist for source: " + source);
        return null;
    }

    public /* synthetic */ C2717w4(InterfaceC2720w7 interfaceC2720w7, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? new C2771z4() : interfaceC2720w7);
    }
}
