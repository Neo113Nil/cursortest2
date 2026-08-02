package com.ironsource;

import android.content.Context;
import com.ironsource.mediationsdk.logger.IronLog;
import kotlin.Unit;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* renamed from: com.ironsource.t4, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C4318t4 implements M8, L8 {

    @NotNull
    private final InterfaceC4321t7 a;

    public /* synthetic */ C4318t4(InterfaceC4321t7 interfaceC4321t7, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? new C4372w4() : interfaceC4321t7);
    }

    @Override // com.ironsource.L8
    public void a(@NotNull Context context, @NotNull EnumC4300s4 enumC4300s4, @NotNull String str, @NotNull String str2) {
        Unit unit;
        context.getClass();
        enumC4300s4.getClass();
        str.getClass();
        str2.getClass();
        InterfaceC4408y4 a = this.a.a(context, enumC4300s4);
        if (a != null) {
            a.b(str, str2);
            unit = Unit.a;
        } else {
            unit = null;
        }
        if (unit == null) {
            IronLog.INTERNAL.error("Shared storage does not exist for source: " + enumC4300s4);
        }
    }

    public C4318t4(@NotNull InterfaceC4321t7 interfaceC4321t7) {
        interfaceC4321t7.getClass();
        this.a = interfaceC4321t7;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C4318t4() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    @Override // com.ironsource.M8
    @Nullable
    public String a(@NotNull Context context, @NotNull EnumC4300s4 enumC4300s4, @NotNull String str) {
        context.getClass();
        enumC4300s4.getClass();
        str.getClass();
        InterfaceC4408y4 a = this.a.a(context, enumC4300s4);
        if (a != null) {
            return InterfaceC4408y4.a(a, str, null, 2, null);
        }
        IronLog.INTERNAL.error("Shared storage does not exist for source: " + enumC4300s4);
        return null;
    }
}
