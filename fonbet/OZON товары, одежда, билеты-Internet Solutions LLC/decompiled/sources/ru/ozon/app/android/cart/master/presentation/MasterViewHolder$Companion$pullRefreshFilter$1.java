package ru.ozon.app.android.cart.master.presentation;

import YZ.a;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.h;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"LYZ/a;", "it", "", "invoke-kwQ5Lys", "(Ljava/lang/String;)Ljava/lang/Boolean;", "<anonymous>"}, k = 3, mv = {2, 0, 0})
/* loaded from: classes11.dex */
final class MasterViewHolder$Companion$pullRefreshFilter$1 extends AbstractC7737t implements Function1<a, Boolean> {
    public static final MasterViewHolder$Companion$pullRefreshFilter$1 INSTANCE = new MasterViewHolder$Companion$pullRefreshFilter$1();

    MasterViewHolder$Companion$pullRefreshFilter$1() {
        super(1);
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Boolean invoke(a aVar) {
        return m552invokekwQ5Lys(aVar.b());
    }

    /* renamed from: invoke-kwQ5Lys, reason: not valid java name */
    public final Boolean m552invokekwQ5Lys(String it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return Boolean.valueOf(h.e0(it, "pull_refresh", true));
    }
}
