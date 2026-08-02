package ru.ozon.uni.ozi.utils.internal;

import K1.C3422b;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.h;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\b\u0003\u001a!\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00000\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0000¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"LK1/b;", "", "delimiter", "", "split", "(LK1/b;Ljava/lang/String;)Ljava/util/List;", "uni_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class TextUtilsKt {
    @NotNull
    public static final List<C3422b> split(@NotNull C3422b c3422b, @NotNull String delimiter) {
        Intrinsics.checkNotNullParameter(c3422b, "<this>");
        Intrinsics.checkNotNullParameter(delimiter, "delimiter");
        ArrayList arrayList = new ArrayList();
        List m11 = h.m(c3422b.toString(), new String[]{delimiter}, 0, 6);
        int size = m11.size();
        int i11 = 0;
        for (int i12 = 0; i12 < size; i12++) {
            int length = ((String) m11.get(i12)).length() + i11;
            arrayList.add(c3422b.subSequence(i11, length));
            i11 = delimiter.length() + length;
        }
        return arrayList;
    }
}
