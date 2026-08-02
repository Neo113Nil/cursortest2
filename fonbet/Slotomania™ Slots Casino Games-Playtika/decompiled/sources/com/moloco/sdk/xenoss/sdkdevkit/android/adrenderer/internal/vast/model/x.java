package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model;

import androidx.constraintlayout.core.motion.utils.TypedValues;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes6.dex */
public final class x {
    public static final x b = new x("XmlParsing", 0, 100);
    public static final x c = new x(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k.f, 1, 300);
    public static final x d = new x("WrapperTimeout", 2, 301);
    public static final x e = new x("WrapperLimit", 3, 302);
    public static final x f = new x("WrapperNoAds", 4, 303);
    public static final x g = new x(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k.q, 5, 400);
    public static final x h = new x("LinearFileNotFound", 6, 401);
    public static final x i = new x("LinearNotSupportedMedia", 7, 403);
    public static final x j = new x(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k.M, 8, 600);
    public static final x k = new x("Undefined", 9, TypedValues.Custom.TYPE_INT);
    public static final /* synthetic */ x[] l;
    public static final /* synthetic */ EnumEntries m;
    public final int a;

    static {
        x[] a = a();
        l = a;
        m = EnumEntriesKt.enumEntries(a);
    }

    public x(String str, int i2, int i3) {
        this.a = i3;
    }

    public static final /* synthetic */ x[] a() {
        return new x[]{b, c, d, e, f, g, h, i, j, k};
    }

    public static EnumEntries<x> b() {
        return m;
    }

    public static x valueOf(String str) {
        return (x) Enum.valueOf(x.class, str);
    }

    public static x[] values() {
        return (x[]) l.clone();
    }

    public final int c() {
        return this.a;
    }
}
