package com.moloco.sdk.internal.ortb.model;

import androidx.core.app.NotificationCompat;
import com.moloco.sdk.internal.ortb.model.n;
import defpackage.r5h;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@r5h
/* loaded from: classes4.dex */
public final class n0 {

    @NotNull
    public static final n.b Companion = new n.b();
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final z0 e;
    public final v0 f;
    public final p0 g;
    public final x0 h;
    public final r0 i;

    public /* synthetic */ n0(int i, String str, String str2, String str3, String str4, z0 z0Var, v0 v0Var, p0 p0Var, x0 x0Var, r0 r0Var) {
        if ((i & 1) == 0) {
            this.a = null;
        } else {
            this.a = str;
        }
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = str2;
        }
        if ((i & 4) == 0) {
            this.c = null;
        } else {
            this.c = str3;
        }
        if ((i & 8) == 0) {
            this.d = null;
        } else {
            this.d = str4;
        }
        if ((i & 16) == 0) {
            this.e = null;
        } else {
            this.e = z0Var;
        }
        if ((i & 32) == 0) {
            this.f = null;
        } else {
            this.f = v0Var;
        }
        if ((i & 64) == 0) {
            this.g = null;
        } else {
            this.g = p0Var;
        }
        if ((i & 128) == 0) {
            this.h = null;
        } else {
            this.h = x0Var;
        }
        if ((i & NotificationCompat.FLAG_LOCAL_ONLY) == 0) {
            this.i = null;
        } else {
            this.i = r0Var;
        }
    }
}
