package ru.ozon.android.messenger.framework.presentation.ai;

import androidx.compose.foundation.layout.C5179b;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes10.dex */
final class S0 implements C5179b.l {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    public static final S0 f89345a = new S0();

    /* renamed from: b, reason: collision with root package name */
    private static final float f89346b = 0;

    private S0() {
    }

    @Override // androidx.compose.foundation.layout.C5179b.l
    public final float a() {
        return f89346b;
    }

    @Override // androidx.compose.foundation.layout.C5179b.l
    public final void b(int i11, @NotNull B1.Y y11, @NotNull int[] sizes, @NotNull int[] outPositions) {
        Intrinsics.checkNotNullParameter(y11, "<this>");
        Intrinsics.checkNotNullParameter(sizes, "sizes");
        Intrinsics.checkNotNullParameter(outPositions, "outPositions");
        if (sizes.length == 0) {
            return;
        }
        Intrinsics.checkNotNullParameter(sizes, "<this>");
        int i12 = 0;
        int i13 = 0;
        for (int i14 : sizes) {
            i13 += i14;
        }
        if (i13 < i11) {
            Intrinsics.checkNotNullParameter(sizes, "<this>");
            int length = sizes.length - 1;
            int i15 = 0;
            while (i12 < length) {
                outPositions[i12] = i15;
                i15 += sizes[i12];
                i12++;
            }
            outPositions[length] = i11 - sizes[length];
            return;
        }
        int length2 = sizes.length;
        int i16 = 0;
        int i17 = 0;
        while (i12 < length2) {
            int i18 = sizes[i12];
            outPositions[i16] = i17;
            i17 += i18;
            i12++;
            i16++;
        }
    }
}
