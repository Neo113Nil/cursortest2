package ru.ozon.uni.android.ds.compose.util;

import S0.InterfaceC3967k;
import V.e;
import android.content.Context;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.collections.C7714v;
import kotlin.jvm.internal.Intrinsics;
import l1.AbstractC7799Q;
import org.jetbrains.annotations.NotNull;
import ru.ozon.uni.android.uikitsdk.Color;
import ru.ozon.uni.android.uikitsdk.ext.TokensExtKt;
import ru.ozon.uni.core.UniGradient;
import ru.ozon.uni.core.compose.tokens.TokenParserKt;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0013\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0001¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lru/ozon/uni/core/UniGradient;", "Ll1/Q;", "toBrush", "(Lru/ozon/uni/core/UniGradient;LS0/k;I)Ll1/Q;", "uni_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class GradientExtKt {
    @NotNull
    public static final AbstractC7799Q toBrush(@NotNull UniGradient uniGradient, InterfaceC3967k interfaceC3967k, int i11) {
        Intrinsics.checkNotNullParameter(uniGradient, "<this>");
        Color.Gradient gradient = TokensExtKt.toGradient(uniGradient, (Context) interfaceC3967k.m(AndroidCompositionLocals_androidKt.d()));
        int[] colors = gradient.getColors();
        ArrayList arrayList = new ArrayList(colors.length);
        for (int i12 : colors) {
            String lowerCase = e.b(new Object[]{Integer.valueOf(i12)}, 1, "#%08X", "format(...)").toLowerCase(Locale.ROOT);
            Intrinsics.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
            arrayList.add(TokenParserKt.hexToColor(lowerCase));
        }
        ArrayList other = C7714v.I(arrayList);
        AbstractC7799Q.a aVar = AbstractC7799Q.Companion;
        float[] positions = gradient.getPositions();
        Intrinsics.checkNotNullParameter(positions, "<this>");
        Intrinsics.checkNotNullParameter(other, "other");
        int length = positions.length;
        ArrayList arrayList2 = new ArrayList(Math.min(C7714v.z(other, 10), length));
        Iterator it = other.iterator();
        int i13 = 0;
        while (it.hasNext()) {
            Object next = it.next();
            if (i13 >= length) {
                break;
            }
            arrayList2.add(new Pair(Float.valueOf(positions[i13]), next));
            i13++;
        }
        Pair[] pairArr = (Pair[]) arrayList2.toArray(new Pair[0]);
        return AbstractC7799Q.a.e(aVar, (Pair[]) Arrays.copyOf(pairArr, pairArr.length), 0L, 0L, 14);
    }
}
