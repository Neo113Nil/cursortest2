package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors;

import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class h {

    public /* synthetic */ class a {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[g.values().length];
            try {
                iArr[g.a.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[g.b.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[g.c.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[g.d.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            a = iArr;
        }
    }

    public static final i a(g gVar) {
        Intrinsics.checkNotNullParameter(gVar, "<this>");
        int i = a.a[gVar.ordinal()];
        if (i == 1) {
            return i.a;
        }
        if (i == 2) {
            return i.b;
        }
        if (i == 3) {
            return i.c;
        }
        if (i == 4) {
            return i.d;
        }
        throw new NoWhenBranchMatchedException();
    }

    public static final j b(g gVar) {
        Intrinsics.checkNotNullParameter(gVar, "<this>");
        int i = a.a[gVar.ordinal()];
        if (i == 1) {
            return j.a;
        }
        if (i == 2) {
            return j.b;
        }
        if (i == 3) {
            return j.c;
        }
        if (i == 4) {
            return j.d;
        }
        throw new NoWhenBranchMatchedException();
    }
}
