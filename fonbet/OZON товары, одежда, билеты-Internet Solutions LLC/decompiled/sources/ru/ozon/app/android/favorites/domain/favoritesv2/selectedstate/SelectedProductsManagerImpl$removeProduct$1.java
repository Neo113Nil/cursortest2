package ru.ozon.app.android.favorites.domain.favoritesv2.selectedstate;

import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0010\t\n\u0002\b\u0002\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u00012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "", "it", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
final class SelectedProductsManagerImpl$removeProduct$1 extends AbstractC7737t implements Function1<List<? extends Long>, List<? extends Long>> {
    final /* synthetic */ long $id;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    SelectedProductsManagerImpl$removeProduct$1(long j11) {
        super(1);
        this.$id = j11;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ List<? extends Long> invoke(List<? extends Long> list) {
        return invoke2((List<Long>) list);
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final List<Long> invoke2(List<Long> it) {
        Intrinsics.checkNotNullParameter(it, "it");
        long j11 = this.$id;
        ArrayList arrayList = new ArrayList();
        for (Object obj : it) {
            if (((Number) obj).longValue() != j11) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }
}
