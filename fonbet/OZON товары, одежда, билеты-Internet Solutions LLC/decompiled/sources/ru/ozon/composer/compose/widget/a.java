package ru.ozon.composer.compose.widget;

import B1.B;
import B1.C;
import android.graphics.Rect;
import jk0.l;
import k1.C7460f;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0003\u001a!\u0010\u0006\u001a\u00020\u0005*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Ljk0/l;", "LB1/B;", "componentCoordinates", "", "excludeSticky", "", "a", "(Ljk0/l;LB1/B;Z)F", "composer-compose-ui_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class a {
    public static final float a(@NotNull l lVar, @NotNull B componentCoordinates, boolean z11) {
        int i11;
        Intrinsics.checkNotNullParameter(lVar, "<this>");
        Intrinsics.checkNotNullParameter(componentCoordinates, "componentCoordinates");
        if (lVar.e().isEmpty()) {
            return 0.0f;
        }
        long a11 = componentCoordinates.a();
        int i12 = (int) (a11 >> 32);
        if (i12 == 0 || (i11 = (int) (a11 & 4294967295L)) == 0) {
            return 0.0f;
        }
        int i13 = i11 * i12;
        C7460f b11 = C.b(componentCoordinates);
        Rect g10 = lVar.g();
        if (z11 || g10.isEmpty()) {
            g10 = null;
        }
        return (i12 * Math.max(Math.min(b11.h(), lVar.e().bottom) - Math.max(b11.q(), g10 != null ? g10.bottom : lVar.e().top), 0.0f)) / i13;
    }
}
