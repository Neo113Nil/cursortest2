package ru.ozon.uni.utils;

import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.collections.U;
import kotlin.jvm.internal.Intrinsics;
import l1.C7807Z;
import org.jetbrains.annotations.NotNull;
import q1.AbstractC8972b;
import ru.ozon.uni.core.compose.tokens.UniPainter;

@Metadata(d1 = {"\u0000(\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0003\u001a;\u0010\u0006\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0002\u0012\u0004\u0012\u00020\u00050\u0004\"\u0004\b\u0000\u0010\u0000*\u0004\u0018\u00010\u00012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0000¢\u0006\u0004\b\u0006\u0010\u0007\u001a\u001d\u0010\f\u001a\u00020\b*\u00020\b2\b\u0010\t\u001a\u0004\u0018\u00010\u0001H\u0000¢\u0006\u0004\b\n\u0010\u000b\"\u0018\u0010\u000e\u001a\u00020\r*\u00020\u00018@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"T", "Lq1/b;", "Lru/ozon/uni/utils/UniTestTagParameter;", "testTagParameter", "", "", "getIconNameTestTagParameter", "(Lq1/b;Lru/ozon/uni/utils/UniTestTagParameter;)Ljava/util/Map;", "Ll1/Z;", "icon", "takeIfNotMulticolorIcon-DxMtmZc", "(JLq1/b;)J", "takeIfNotMulticolorIcon", "", "isMulticolorUniPainter", "(Lq1/b;)Z", "uni_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class PainterUtilsKt {
    @NotNull
    public static final <T> Map<UniTestTagParameter<T>, String> getIconNameTestTagParameter(AbstractC8972b abstractC8972b, @NotNull UniTestTagParameter<T> testTagParameter) {
        String iconName;
        Map<UniTestTagParameter<T>, String> i11;
        Intrinsics.checkNotNullParameter(testTagParameter, "testTagParameter");
        UniPainter uniPainter = abstractC8972b instanceof UniPainter ? (UniPainter) abstractC8972b : null;
        return (uniPainter == null || (iconName = uniPainter.getIconName()) == null || (i11 = U.i(new Pair(testTagParameter, iconName))) == null) ? U.c() : i11;
    }

    public static final boolean isMulticolorUniPainter(@NotNull AbstractC8972b abstractC8972b) {
        Intrinsics.checkNotNullParameter(abstractC8972b, "<this>");
        UniPainter uniPainter = abstractC8972b instanceof UniPainter ? (UniPainter) abstractC8972b : null;
        return uniPainter != null && uniPainter.getIsMulticolor();
    }

    /* renamed from: takeIfNotMulticolorIcon-DxMtmZc, reason: not valid java name */
    public static final long m3266takeIfNotMulticolorIconDxMtmZc(long j11, AbstractC8972b abstractC8972b) {
        long j12;
        if (abstractC8972b == null || !isMulticolorUniPainter(abstractC8972b)) {
            return j11;
        }
        int i11 = C7807Z.f72260n;
        j12 = C7807Z.f72259m;
        return j12;
    }
}
