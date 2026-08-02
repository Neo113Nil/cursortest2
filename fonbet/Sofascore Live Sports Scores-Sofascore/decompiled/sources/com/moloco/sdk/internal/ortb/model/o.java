package com.moloco.sdk.internal.ortb.model;

import defpackage.joa;
import defpackage.r5h;
import defpackage.ypa;
import defpackage.ysa;
import kotlinx.serialization.KSerializer;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@r5h
/* loaded from: classes4.dex */
public final class o {

    @NotNull
    public static final H$a Companion;
    public static final joa a;
    public static final o b;
    public static final o c;
    public static final o d;
    public static final /* synthetic */ o[] e;

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    public final class b {
        @NotNull
        public final KSerializer serializer() {
            return o0.a;
        }
    }

    static {
        o oVar = new o("Top", 0);
        b = oVar;
        o oVar2 = new o("Center", 1);
        c = oVar2;
        o oVar3 = new o("Bottom", 2);
        d = oVar3;
        e = new o[]{oVar, oVar2, oVar3};
        Companion = new H$a();
        a = ypa.a(ysa.b, new com.appsflyer.c(13));
    }

    public static o valueOf(String str) {
        return (o) Enum.valueOf(o.class, str);
    }

    public static o[] values() {
        return (o[]) e.clone();
    }
}
