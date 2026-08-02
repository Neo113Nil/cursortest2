package com.moloco.sdk.internal.ortb.model;

import com.moloco.sdk.internal.ortb.model.z;
import defpackage.r5h;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@r5h
/* loaded from: classes4.dex */
public final class k1 {

    @NotNull
    public static final z.b Companion = new z.b();
    public final Boolean a;
    public final b1 b;

    public /* synthetic */ k1(int i, Boolean bool, b1 b1Var) {
        if ((i & 1) == 0) {
            this.a = null;
        } else {
            this.a = bool;
        }
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = b1Var;
        }
    }
}
