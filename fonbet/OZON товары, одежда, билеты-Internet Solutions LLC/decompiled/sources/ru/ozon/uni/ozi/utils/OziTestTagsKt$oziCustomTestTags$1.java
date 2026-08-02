package ru.ozon.uni.ozi.utils;

import java.util.Arrays;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.collections.U;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0010$\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "", "", "invoke", "()Ljava/util/Map;", "<anonymous>"}, k = 3, mv = {2, 0, 0})
/* loaded from: classes4.dex */
final class OziTestTagsKt$oziCustomTestTags$1 extends AbstractC7737t implements Function0<Map<Object, ? extends String>> {
    final /* synthetic */ Pair<T, String>[] $pairs;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    OziTestTagsKt$oziCustomTestTags$1(Pair<? extends T, String>[] pairArr) {
        super(0);
        this.$pairs = pairArr;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Map<Object, ? extends String> invoke() {
        Pair<T, String>[] pairArr = this.$pairs;
        return U.j((Pair[]) Arrays.copyOf(pairArr, pairArr.length));
    }
}
