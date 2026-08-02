package com.moloco.sdk.internal.ortb.model;

import defpackage.oea;
import defpackage.r5h;
import defpackage.xg0;
import java.util.ArrayList;
import java.util.List;
import kotlinx.serialization.KSerializer;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@r5h
/* loaded from: classes4.dex */
public final class j {

    @NotNull
    public static final E$b Companion = new E$b();
    public static final KSerializer[] b = {new xg0(x.a, 0)};
    public final List a;

    public j(int i, List list) {
        if (1 == (i & 1)) {
            this.a = list;
        } else {
            oea.z(i, 1, i.b);
            throw null;
        }
    }

    public j(ArrayList arrayList) {
        this.a = arrayList;
    }
}
