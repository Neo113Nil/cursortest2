package com.ironsource;

import com.ironsource.F8;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* renamed from: com.ironsource.me, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C4203me implements F8, F8.a {

    @Nullable
    private C4185le a;
    private boolean b;

    @Override // com.ironsource.F8
    @Nullable
    public Sa a() {
        C4185le c4185le = this.a;
        if (c4185le != null) {
            return new Sa(c4185le);
        }
        return null;
    }

    @Override // com.ironsource.F8
    @Nullable
    public L9 b() {
        C4185le c4185le = this.a;
        if (c4185le != null) {
            return new L9(c4185le);
        }
        return null;
    }

    @Override // com.ironsource.F8
    public boolean c() {
        return this.b;
    }

    @Override // com.ironsource.F8.a
    public void d() {
        this.b = true;
    }

    @Override // com.ironsource.F8.a
    public void a(@NotNull C4185le c4185le) {
        c4185le.getClass();
        this.a = c4185le;
    }
}
