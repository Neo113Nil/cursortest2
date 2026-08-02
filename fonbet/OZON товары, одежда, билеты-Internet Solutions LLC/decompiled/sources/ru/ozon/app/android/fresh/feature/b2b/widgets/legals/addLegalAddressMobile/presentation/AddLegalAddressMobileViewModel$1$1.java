package ru.ozon.app.android.fresh.feature.b2b.widgets.legals.addLegalAddressMobile.presentation;

import He0.a;
import Nc.C3667a;
import Sc.r;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.K;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import ru.ozon.app.android.fresh.feature.b2b.widgets.legals.addLegalAddressMobile.presentation.AddressSearchResult;

@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u00042\u0012\u0010\u0003\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"LSc/r;", "", "LHe0/a;", "it", "", "invoke", "(Ljava/lang/Object;)V", "<anonymous>"}, k = 3, mv = {2, 0, 0})
/* loaded from: classes12.dex */
final class AddLegalAddressMobileViewModel$1$1 extends AbstractC7737t implements Function1<r<? extends List<? extends a>>, Unit> {
    final /* synthetic */ AddLegalAddressMobileViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    AddLegalAddressMobileViewModel$1$1(AddLegalAddressMobileViewModel addLegalAddressMobileViewModel) {
        super(1);
        this.this$0 = addLegalAddressMobileViewModel;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(r<? extends List<? extends a>> rVar) {
        m745invoke(rVar.getF26106a());
        return Unit.f71690a;
    }

    /* renamed from: invoke, reason: collision with other method in class */
    public final void m745invoke(Object obj) {
        C3667a c3667a;
        List mapAddresses;
        Object success;
        c3667a = this.this$0.searchCompleteListener;
        r.Companion companion = r.INSTANCE;
        boolean z11 = obj instanceof r.b;
        if (z11) {
            Lm0.a.f17149a.e(r.b(obj));
            success = AddressSearchResult.Fail.INSTANCE;
        } else {
            AddLegalAddressMobileViewModel addLegalAddressMobileViewModel = this.this$0;
            if (z11) {
                obj = null;
            }
            List list = (List) obj;
            if (list == null) {
                list = K.f71697a;
            }
            mapAddresses = addLegalAddressMobileViewModel.mapAddresses(list);
            success = new AddressSearchResult.Success(mapAddresses);
        }
        c3667a.onNext(success);
    }
}
