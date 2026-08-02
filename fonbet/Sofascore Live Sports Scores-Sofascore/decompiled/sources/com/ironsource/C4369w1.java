package com.ironsource;

import com.ironsource.mediationsdk.utils.IronSourceConstants;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* renamed from: com.ironsource.w1, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C4369w1 extends AbstractC4121i3 {
    public C4369w1() {
        this.H = "outcome";
        this.G = 4;
        this.I = IronSourceConstants.APP_EVENT_TYPE;
        e();
    }

    @Override // com.ironsource.AbstractC4121i3
    public int c(@Nullable C4355v5 c4355v5) {
        return 1;
    }

    @Override // com.ironsource.AbstractC4121i3
    public boolean d(@NotNull C4355v5 c4355v5) {
        c4355v5.getClass();
        int c = c4355v5.c();
        return c == EnumC4373w5.FIRST_INSTANCE.b() || c == EnumC4373w5.INIT_COMPLETE.b() || c == EnumC4373w5.SDK_INIT_FAILED.b() || c == EnumC4373w5.SDK_INIT_SUCCESS.b();
    }

    @Override // com.ironsource.AbstractC4121i3
    @NotNull
    public String e(int i) {
        return "";
    }

    @Override // com.ironsource.AbstractC4121i3
    public boolean h(@Nullable C4355v5 c4355v5) {
        return false;
    }

    @Override // com.ironsource.AbstractC4121i3
    public boolean j(@Nullable C4355v5 c4355v5) {
        return false;
    }

    @Override // com.ironsource.AbstractC4121i3
    public void f(@Nullable C4355v5 c4355v5) {
    }

    @Override // com.ironsource.AbstractC4121i3
    public void d() {
    }
}
