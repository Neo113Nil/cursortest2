package ru.ozon.app.android.ugc.core.widgets.common;

import androidx.compose.ui.draw.c;
import androidx.compose.ui.e;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u001a+\u0010\b\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\b\b\u0002\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0003¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\t"}, d2 = {"Landroidx/compose/ui/e;", "Ll1/Z;", "strokeColor", "LZ1/h;", "strokeWidth", "cornerRadius", "addStroke-y6ga9Xk", "(Landroidx/compose/ui/e;JFF)Landroidx/compose/ui/e;", "addStroke", "core_prodGoogleAllVendorsRelease"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class ExtKt {
    @NotNull
    /* renamed from: addStroke-y6ga9Xk, reason: not valid java name */
    public static final e m1481addStrokey6ga9Xk(@NotNull e addStroke, long j11, float f7, float f11) {
        Intrinsics.checkNotNullParameter(addStroke, "$this$addStroke");
        return c.c(addStroke, new ExtKt$addStroke$1(f7, f11, j11));
    }

    /* renamed from: addStroke-y6ga9Xk$default, reason: not valid java name */
    public static e m1482addStrokey6ga9Xk$default(e eVar, long j11, float f7, float f11, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            f7 = 1;
        }
        return m1481addStrokey6ga9Xk(eVar, j11, f7, f11);
    }
}
