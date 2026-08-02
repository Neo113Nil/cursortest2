package com.google.protobuf;

import com.google.protobuf.Internal;
import defpackage.a70;
import defpackage.ljg;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class a1 implements Comparable {
    public final java.lang.reflect.Field a;
    public final FieldType b;
    public final int c;
    public final java.lang.reflect.Field d;
    public final int e;
    public final boolean f;
    public final boolean g;
    public final java.lang.reflect.Field h;
    public final Object i;
    public final Internal.EnumVerifier j;

    public a1(java.lang.reflect.Field field, int i, FieldType fieldType, java.lang.reflect.Field field2, int i2, boolean z, boolean z2, Object obj, Internal.EnumVerifier enumVerifier, java.lang.reflect.Field field3) {
        this.a = field;
        this.b = fieldType;
        this.c = i;
        this.d = field2;
        this.e = i2;
        this.f = z;
        this.g = z2;
        this.i = obj;
        this.j = enumVerifier;
        this.h = field3;
    }

    public static void a(int i) {
        if (i > 0) {
            return;
        }
        a70.p(ljg.j(i, "fieldNumber must be positive: "));
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return this.c - ((a1) obj).c;
    }
}
