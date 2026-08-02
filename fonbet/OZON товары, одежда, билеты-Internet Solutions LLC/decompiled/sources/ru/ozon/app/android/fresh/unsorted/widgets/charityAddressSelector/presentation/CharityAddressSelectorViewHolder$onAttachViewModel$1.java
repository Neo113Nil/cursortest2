package ru.ozon.app.android.fresh.unsorted.widgets.charityAddressSelector.presentation;

import Sc.r;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C7735q;

@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
/* synthetic */ class CharityAddressSelectorViewHolder$onAttachViewModel$1 extends C7735q implements Function1<r<? extends Unit>, Unit> {
    CharityAddressSelectorViewHolder$onAttachViewModel$1(Object obj) {
        super(1, obj, CharityAddressSelectorViewHolder.class, "collect", "collect(Ljava/lang/Object;)V", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(r<? extends Unit> rVar) {
        m767invoke(rVar.getF26106a());
        return Unit.f71690a;
    }

    /* renamed from: invoke, reason: collision with other method in class */
    public final void m767invoke(Object obj) {
        ((CharityAddressSelectorViewHolder) this.receiver).collect(obj);
    }
}
