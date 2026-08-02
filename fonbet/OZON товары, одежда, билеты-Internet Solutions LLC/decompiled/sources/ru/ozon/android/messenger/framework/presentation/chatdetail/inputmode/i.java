package ru.ozon.android.messenger.framework.presentation.chatdetail.inputmode;

import java.util.ArrayList;
import java.util.List;
import kotlin.collections.C7714v;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.android.messenger.framework.presentation.models.q;

/* loaded from: classes10.dex */
final class i extends AbstractC7737t implements Function1<List<? extends q>, List<? extends q>> {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ q f89859b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ k f89860c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    i(k kVar, q qVar) {
        super(1);
        this.f89859b = qVar;
        this.f89860c = kVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final List<? extends q> invoke(List<? extends q> list) {
        List<? extends q> current = list;
        Intrinsics.checkNotNullParameter(current, "current");
        ArrayList arrayList = new ArrayList();
        for (Object obj : current) {
            if (!k.g(this.f89860c, (q) obj)) {
                arrayList.add(obj);
            }
        }
        return C7714v.q0(this.f89859b, arrayList);
    }
}
