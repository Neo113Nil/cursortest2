package com.moloco.sdk.internal.ortb.model;

import com.moloco.sdk.internal.ortb.model.f;
import defpackage.r5h;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@r5h
/* loaded from: classes4.dex */
public final class a0 {

    @NotNull
    public static final f.b Companion = new f.b();
    public final d a;
    public final String b;
    public final k1 c;
    public final h d;
    public final i1 e;

    public /* synthetic */ a0(int i, d dVar, String str, k1 k1Var, h hVar, i1 i1Var) {
        if ((i & 1) == 0) {
            this.a = null;
        } else {
            this.a = dVar;
        }
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = str;
        }
        if ((i & 4) == 0) {
            this.c = null;
        } else {
            this.c = k1Var;
        }
        if ((i & 8) == 0) {
            this.d = null;
        } else {
            this.d = hVar;
        }
        if ((i & 16) == 0) {
            this.e = null;
        } else {
            this.e = i1Var;
        }
    }
}
