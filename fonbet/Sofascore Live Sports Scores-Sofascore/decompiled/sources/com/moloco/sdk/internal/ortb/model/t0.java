package com.moloco.sdk.internal.ortb.model;

import com.moloco.sdk.internal.ortb.model.q;
import defpackage.fc6;
import defpackage.r5h;
import defpackage.xg0;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@r5h
/* loaded from: classes4.dex */
public final class t0 {

    @NotNull
    public static final q.b Companion = new q.b();
    public static final KSerializer[] c = {null, new xg0(c1.a, 0)};
    public final Integer a;
    public final List b;

    public /* synthetic */ t0(int i, Integer num, List list) {
        if ((i & 1) == 0) {
            this.a = null;
        } else {
            this.a = num;
        }
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = list;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof t0)) {
            return false;
        }
        t0 t0Var = (t0) obj;
        return Intrinsics.c(this.a, t0Var.a) && Intrinsics.c(this.b, t0Var.b);
    }

    public final int hashCode() {
        Integer num = this.a;
        int hashCode = (num == null ? 0 : num.hashCode()) * 31;
        List list = this.b;
        return hashCode + (list != null ? list.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("DECBorderSerializable(borderWidth=");
        sb.append(this.a);
        sb.append(", gradient=");
        return fc6.p(sb, this.b, ')');
    }
}
