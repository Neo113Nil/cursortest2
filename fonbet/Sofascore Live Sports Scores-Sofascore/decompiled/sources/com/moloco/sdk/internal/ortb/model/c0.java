package com.moloco.sdk.internal.ortb.model;

import com.moloco.sdk.internal.ortb.model.g;
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
public final class c0 {

    @NotNull
    public static final g.b Companion = new g.b();
    public static final KSerializer[] b = {new xg0(i.a, 0)};
    public final List a;

    public c0(int i, List list) {
        if (1 == (i & 1)) {
            this.a = list;
        } else {
            oea.z(i, 1, b0.b);
            throw null;
        }
    }

    public c0(ArrayList arrayList) {
        this.a = arrayList;
    }
}
