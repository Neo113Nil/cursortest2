package com.facebook.ads.redexgen.core;

import com.google.common.collect.ElementTypesAreNonnullByDefault;
import com.google.common.collect.ParametricNullness;
import java.util.Comparator;

@ElementTypesAreNonnullByDefault
/* renamed from: com.facebook.ads.redexgen.X.ns, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public abstract class AbstractC3064ns {
    public static final AbstractC3064ns A00 = new C1608Be();
    public static final AbstractC3064ns A02 = new C1606Bc(-1);
    public static final AbstractC3064ns A01 = new C1606Bc(1);

    public abstract int A05();

    public abstract AbstractC3064ns A06(int left, int right);

    public abstract AbstractC3064ns A07(long left, long right);

    public abstract <T> AbstractC3064ns A08(@ParametricNullness T left, @ParametricNullness T right, Comparator<T> comparator);

    public abstract AbstractC3064ns A09(boolean left, boolean right);

    public abstract AbstractC3064ns A0A(boolean left, boolean right);

    public AbstractC3064ns() {
    }

    public /* synthetic */ AbstractC3064ns(C1608Be c1608Be) {
        this();
    }

    public static AbstractC3064ns A01() {
        return A00;
    }
}
