package com.ironsource;

import com.ironsource.environment.ContextProvider;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import java.util.ArrayList;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* renamed from: com.ironsource.cd, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C4023cd extends AbstractC4121i3 {

    @NotNull
    public static final C4023cd P;

    static {
        C4023cd c4023cd = new C4023cd();
        P = c4023cd;
        c4023cd.H = "outcome";
        c4023cd.G = 0;
        c4023cd.I = IronSourceConstants.PIXEL_EVENT_TYPE;
        c4023cd.e();
    }

    private C4023cd() {
    }

    @Override // com.ironsource.AbstractC4121i3
    public int c(@Nullable C4355v5 c4355v5) {
        return 1;
    }

    @Override // com.ironsource.AbstractC4121i3
    public boolean d(@Nullable C4355v5 c4355v5) {
        return true;
    }

    @Override // com.ironsource.AbstractC4121i3
    @NotNull
    public String e(int i) {
        return "";
    }

    @Override // com.ironsource.AbstractC4121i3
    public boolean g(@Nullable C4355v5 c4355v5) {
        return false;
    }

    @Override // com.ironsource.AbstractC4121i3
    public boolean h(@Nullable C4355v5 c4355v5) {
        return false;
    }

    public final void i() {
        new T9().b(ContextProvider.getInstance().getApplicationContext());
        a(new C4355v5(EnumC4373w5.INIT_DEFERRED_DATA, new C3958a9().a()));
    }

    @Override // com.ironsource.AbstractC4121i3
    public boolean j(@Nullable C4355v5 c4355v5) {
        return false;
    }

    @Override // com.ironsource.AbstractC4121i3
    public void d() {
    }

    @Override // com.ironsource.AbstractC4121i3
    public void a(@Nullable ArrayList<C4355v5> arrayList) {
    }

    @Override // com.ironsource.AbstractC4121i3
    public void f(@Nullable C4355v5 c4355v5) {
    }
}
