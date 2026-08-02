package ru.ozon.uni.ozi.utils;

import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.collections.U;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import q1.AbstractC8972b;
import ru.ozon.uni.core.compose.tokens.UniPainter;

@Metadata(d1 = {"\u0000\u0018\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\u0003\u001a;\u0010\u0006\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0002\u0012\u0004\u0012\u00020\u00050\u0004\"\u0004\b\u0000\u0010\u0000*\u0004\u0018\u00010\u00012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0000¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"T", "Lq1/b;", "Lru/ozon/uni/ozi/utils/OziTestTagParameter;", "testTagParameter", "", "", "getIconNameTestTagParameter", "(Lq1/b;Lru/ozon/uni/ozi/utils/OziTestTagParameter;)Ljava/util/Map;", "uni_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class PainterUtilsKt {
    @NotNull
    public static final <T> Map<OziTestTagParameter<T>, String> getIconNameTestTagParameter(AbstractC8972b abstractC8972b, @NotNull OziTestTagParameter<T> testTagParameter) {
        String iconName;
        Map<OziTestTagParameter<T>, String> i11;
        Intrinsics.checkNotNullParameter(testTagParameter, "testTagParameter");
        UniPainter uniPainter = abstractC8972b instanceof UniPainter ? (UniPainter) abstractC8972b : null;
        return (uniPainter == null || (iconName = uniPainter.getIconName()) == null || (i11 = U.i(new Pair(testTagParameter, iconName))) == null) ? U.c() : i11;
    }
}
