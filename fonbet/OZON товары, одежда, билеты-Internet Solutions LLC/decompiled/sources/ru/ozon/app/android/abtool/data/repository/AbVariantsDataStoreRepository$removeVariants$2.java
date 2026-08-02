package ru.ozon.app.android.abtool.data.repository;

import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.C7705l;
import kotlin.collections.e0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\"\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u00012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "", "savedVariants", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
final class AbVariantsDataStoreRepository$removeVariants$2 extends AbstractC7737t implements Function1<Set<? extends String>, Set<? extends String>> {
    final /* synthetic */ String[] $variants;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    AbVariantsDataStoreRepository$removeVariants$2(String[] strArr) {
        super(1);
        this.$variants = strArr;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Set<? extends String> invoke(Set<? extends String> set) {
        return invoke2((Set<String>) set);
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Set<String> invoke2(Set<String> savedVariants) {
        Intrinsics.checkNotNullParameter(savedVariants, "savedVariants");
        return e0.d(savedVariants, C7705l.j0(this.$variants));
    }
}
