package Lc;

import com.swmansion.rnscreens.C;
import com.swmansion.rnscreens.C3834z;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class o {

    /* renamed from: b, reason: collision with root package name */
    public static final a f7163b = new a(null);

    /* renamed from: a, reason: collision with root package name */
    public final List f7164a;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public a() {
        }
    }

    public o(List rawDetents) {
        Intrinsics.checkNotNullParameter(rawDetents, "rawDetents");
        this.f7164a = CollectionsKt.toList(rawDetents);
        if (rawDetents.isEmpty()) {
            throw new IllegalArgumentException("[RNScreens] At least one detent must be provided.");
        }
        if (rawDetents.size() > 3) {
            throw new IllegalArgumentException("[RNScreens] Maximum of 3 detents supported.");
        }
        if (rawDetents.size() == 1) {
            double doubleValue = ((Number) rawDetents.get(0)).doubleValue();
            if ((0.0d > doubleValue || doubleValue > 1.0d) && doubleValue != -1.0d) {
                throw new IllegalArgumentException(("[RNScreens] Detent value must be within 0.0 and 1.0, or SHEET_FIT_TO_CONTENTS should be defined, got " + doubleValue + ".").toString());
            }
            return;
        }
        List list = rawDetents;
        Iterator it = list.iterator();
        while (it.hasNext()) {
            double doubleValue2 = ((Number) it.next()).doubleValue();
            if (0.0d > doubleValue2 || doubleValue2 > 1.0d) {
                throw new IllegalArgumentException(("[RNScreens] Detent values must be within 0.0 and 1.0, got " + doubleValue2 + ".").toString());
            }
        }
        if (!Intrinsics.areEqual(rawDetents, CollectionsKt.sorted(list))) {
            throw new IllegalArgumentException("[RNScreens] Detents must be sorted in ascending order.");
        }
    }

    public final double a(int i10) {
        return ((Number) this.f7164a.get(i10)).doubleValue();
    }

    public final int b(int i10, int i11, boolean z10) {
        if (d() < 3) {
            throw new IllegalStateException("[RNScreens] At least 3 detents required for expandedOffsetFromTop.");
        }
        int a10 = (int) ((1 - a(2)) * i10);
        if (z10) {
            i11 = 0;
        }
        return a10 + i11;
    }

    public final int c(int i10) {
        return f(0, i10);
    }

    public final int d() {
        return this.f7164a.size();
    }

    public final float e() {
        if (d() >= 3) {
            return (float) (a(1) / a(2));
        }
        throw new IllegalStateException("[RNScreens] At least 3 detents required for halfExpandedRatio.");
    }

    public final int f(int i10, int i11) {
        double a10 = a(i10);
        if (a10 == -1.0d) {
            throw new IllegalArgumentException("[RNScreens] FIT_TO_CONTENTS is not supported by heightAt.");
        }
        return (int) (a10 * i11);
    }

    public final double g() {
        return ((Number) CollectionsKt.last(this.f7164a)).doubleValue();
    }

    public final int h(int i10) {
        return p.f7165a.a(i10, d());
    }

    public final int i(int i10) {
        return f(d() - 1, i10);
    }

    public final int j(C3834z screen) {
        Intrinsics.checkNotNullParameter(screen, "screen");
        C contentWrapper = screen.getContentWrapper();
        if (contentWrapper == null) {
            return 0;
        }
        Integer valueOf = Integer.valueOf(contentWrapper.getHeight());
        if (!q.a(contentWrapper)) {
            valueOf = null;
        }
        if (valueOf != null) {
            return valueOf.intValue();
        }
        return 0;
    }

    public final int k(int i10) {
        return p.f7165a.c(i10, d());
    }

    public final double l() {
        return ((Number) CollectionsKt.first(this.f7164a)).doubleValue();
    }
}
