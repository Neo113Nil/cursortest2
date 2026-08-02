package ru.ozon.app.android.utils;

import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"<anonymous>", "", "index", "", "element", "", "invoke", "(ILjava/lang/Object;)Ljava/lang/Boolean;"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
final class CollectionExtKt$deepEquals$1 extends AbstractC7737t implements Function2<Integer, Object, Boolean> {
    final /* synthetic */ List<?> $other;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    CollectionExtKt$deepEquals$1(List<?> list) {
        super(2);
        this.$other = list;
    }

    public final Boolean invoke(int i11, Object obj) {
        return Boolean.valueOf(Intrinsics.d(obj, this.$other.get(i11)));
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Boolean invoke(Integer num, Object obj) {
        return invoke(num.intValue(), obj);
    }
}
