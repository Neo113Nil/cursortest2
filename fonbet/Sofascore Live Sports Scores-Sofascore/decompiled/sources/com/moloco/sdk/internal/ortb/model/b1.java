package com.moloco.sdk.internal.ortb.model;

import com.moloco.sdk.internal.ortb.model.u;
import defpackage.r5h;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@r5h
/* loaded from: classes4.dex */
public final class b1 {

    @NotNull
    public static final u.b Companion = new u.b();
    public final Boolean a;
    public final Boolean b;
    public final Boolean c;
    public final Float d;

    public /* synthetic */ b1(int i, Boolean bool, Boolean bool2, Boolean bool3, Float f) {
        if ((i & 1) == 0) {
            this.a = null;
        } else {
            this.a = bool;
        }
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = bool2;
        }
        if ((i & 4) == 0) {
            this.c = null;
        } else {
            this.c = bool3;
        }
        if ((i & 8) == 0) {
            this.d = null;
        } else {
            this.d = f;
        }
    }
}
