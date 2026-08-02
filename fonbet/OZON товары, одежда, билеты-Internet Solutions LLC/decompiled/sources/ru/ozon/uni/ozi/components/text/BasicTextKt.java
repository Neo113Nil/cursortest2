package ru.ozon.uni.ozi.components.text;

import J0.u3;
import K1.C3422b;
import K1.K;
import K1.T;
import S0.InterfaceC3967k;
import V1.h;
import androidx.compose.foundation.layout.a0;
import androidx.compose.ui.e;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.uni.ozi.utils.OziTestTagsKt;
import u0.InterfaceC9914x;

@Metadata(d1 = {"\u0000N\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\u001ao\u0010\u0018\u001a\u00020\u00102\u0006\u0010\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\f2\u0012\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u00100\u000e2\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u0014H\u0001¢\u0006\u0004\b\u0016\u0010\u0017\u001ao\u0010\u0018\u001a\u00020\u00102\u0006\u0010\u0001\u001a\u00020\u00192\b\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\f2\u0012\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u00100\u000e2\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u0014H\u0001¢\u0006\u0004\b\u0016\u0010\u001a¨\u0006\u001b"}, d2 = {"", "text", "Landroidx/compose/ui/e;", "modifier", "Ll1/Z;", "color", "LV1/h;", "textAlign", "LV1/r;", "overflow", "", "softWrap", "", "maxLines", "Lkotlin/Function1;", "LK1/K;", "", "onTextLayout", "LK1/T;", "style", "Lu0/x;", "paddingValues", "BasicText-Rqaf3u4", "(Ljava/lang/String;Landroidx/compose/ui/e;JLV1/h;IZILkotlin/jvm/functions/Function1;LK1/T;Lu0/x;LS0/k;II)V", "BasicText", "LK1/b;", "(LK1/b;Landroidx/compose/ui/e;JLV1/h;IZILkotlin/jvm/functions/Function1;LK1/T;Lu0/x;LS0/k;II)V", "uni_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class BasicTextKt {
    /* renamed from: BasicText-Rqaf3u4, reason: not valid java name */
    public static final void m3125BasicTextRqaf3u4(@NotNull String text, e eVar, long j11, h hVar, int i11, boolean z11, int i12, @NotNull Function1<? super K, Unit> onTextLayout, @NotNull T style, @NotNull InterfaceC9914x paddingValues, InterfaceC3967k interfaceC3967k, int i13, int i14) {
        Intrinsics.checkNotNullParameter(text, "text");
        Intrinsics.checkNotNullParameter(onTextLayout, "onTextLayout");
        Intrinsics.checkNotNullParameter(style, "style");
        Intrinsics.checkNotNullParameter(paddingValues, "paddingValues");
        interfaceC3967k.o(-663836019);
        int i15 = i13 >> 6;
        u3.b(text, androidx.compose.foundation.layout.T.e(a0.e(OziTestTagsKt.oziTestTag((i14 & 2) != 0 ? e.f40358c0 : eVar, OziTextTestTags.Text, null, interfaceC3967k, ((i13 >> 3) & 14) | 48, 2), 1.0f), paddingValues), j11, 0L, null, 0L, hVar, 0L, i11, z11, i12, 0, onTextLayout, style, interfaceC3967k, (i13 & 910) | ((i13 << 18) & 1879048192), ((i13 >> 9) & 8176) | (458752 & i15) | (i15 & 3670016), 17912);
        interfaceC3967k.k();
    }

    /* renamed from: BasicText-Rqaf3u4, reason: not valid java name */
    public static final void m3124BasicTextRqaf3u4(@NotNull C3422b text, e eVar, long j11, h hVar, int i11, boolean z11, int i12, @NotNull Function1<? super K, Unit> onTextLayout, @NotNull T style, @NotNull InterfaceC9914x paddingValues, InterfaceC3967k interfaceC3967k, int i13, int i14) {
        Intrinsics.checkNotNullParameter(text, "text");
        Intrinsics.checkNotNullParameter(onTextLayout, "onTextLayout");
        Intrinsics.checkNotNullParameter(style, "style");
        Intrinsics.checkNotNullParameter(paddingValues, "paddingValues");
        interfaceC3967k.o(-40096405);
        int i15 = i13 >> 3;
        u3.c(text, androidx.compose.foundation.layout.T.e(a0.e(OziTestTagsKt.oziTestTag((i14 & 2) != 0 ? e.f40358c0 : eVar, OziTextTestTags.Text, null, interfaceC3967k, (i15 & 14) | 48, 2), 1.0f), paddingValues), j11, 0L, 0L, hVar, 0L, i11, z11, i12, 0, null, onTextLayout, style, interfaceC3967k, (i13 & 910) | ((i13 << 18) & 1879048192), ((i13 >> 9) & 8176) | (3670016 & i15) | (i15 & 29360128), 50680);
        interfaceC3967k.k();
    }
}
