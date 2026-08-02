package ru.ozon.app.android.fresh.navigation.addressSearch.presentation;

import He0.a;
import Sc.r;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.C7714v;
import kotlin.collections.K;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import ru.ozon.app.android.fresh.navigation.addressSearch.domain.MapSdkSuggestionVOKt;
import ru.ozon.app.android.fresh.navigation.addressSearch.presentation.AddressSearchViewModel;

@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u00042\u0012\u0010\u0003\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"LSc/r;", "", "LHe0/a;", "result", "", "invoke", "(Ljava/lang/Object;)V", "<anonymous>"}, k = 3, mv = {2, 0, 0})
/* loaded from: classes12.dex */
final class AddressSearchViewModelImpl$searchListener$1 extends AbstractC7737t implements Function1<r<? extends List<? extends a>>, Unit> {
    final /* synthetic */ AddressSearchViewModelImpl this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    AddressSearchViewModelImpl$searchListener$1(AddressSearchViewModelImpl addressSearchViewModelImpl) {
        super(1);
        this.this$0 = addressSearchViewModelImpl;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(r<? extends List<? extends a>> rVar) {
        m759invoke(rVar.getF26106a());
        return Unit.f71690a;
    }

    /* renamed from: invoke, reason: collision with other method in class */
    public final void m759invoke(Object obj) {
        this.this$0.getLoader().postValue(Boolean.FALSE);
        r.Companion companion = r.INSTANCE;
        if (obj instanceof r.b) {
            obj = null;
        }
        List list = (List) obj;
        if (list == null) {
            this.this$0.getScreenUI().postValue(new AddressSearchViewModel.ScreenUI(K.f71697a));
            return;
        }
        List list2 = list;
        ArrayList arrayList = new ArrayList(C7714v.z(list2, 10));
        Iterator it = list2.iterator();
        while (it.hasNext()) {
            arrayList.add(MapSdkSuggestionVOKt.toVo((a) it.next()));
        }
        this.this$0.getScreenUI().postValue(new AddressSearchViewModel.ScreenUI(arrayList));
    }
}
