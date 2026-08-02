package com.ironsource;

import defpackage.p2g;
import defpackage.u2g;
import defpackage.w2g;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* renamed from: com.ironsource.x3, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C4389x3 implements InterfaceC4178l7 {

    @Nullable
    private final Boolean a;

    @Nullable
    private final Integer b;

    @Nullable
    private final E3 c;

    public C4389x3(@Nullable Boolean bool, @Nullable Integer num, @Nullable E3 e3) {
        this.a = bool;
        this.b = num;
        this.c = e3;
    }

    @Override // com.ironsource.InterfaceC4178l7
    @NotNull
    public Object a() {
        Boolean bool = this.a;
        if (bool == null) {
            p2g p2gVar = w2g.b;
            return new u2g(new Exception("enabled flag is not provided or invalid"));
        }
        if (!bool.booleanValue()) {
            p2g p2gVar2 = w2g.b;
            return Boolean.FALSE;
        }
        Integer num = this.b;
        if (num == null || num.intValue() <= 0) {
            p2g p2gVar3 = w2g.b;
            return new u2g(new Exception("limit flag is not provided or invalid"));
        }
        if (this.c == null) {
            p2g p2gVar4 = w2g.b;
            return new u2g(new Exception("unit flag is not provided or invalid"));
        }
        p2g p2gVar5 = w2g.b;
        return Boolean.TRUE;
    }
}
