package ru.ozon.android.messenger.framework.presentation.chatlist;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.C7714v;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.messenger.framework.presentation.chatlist.w;

/* loaded from: classes10.dex */
public final class d extends ru.ozon.android.messenger.framework.presentation.common.viewmodel.d<f> {

    static final class a extends AbstractC7737t implements Function1<f, f> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ Function1<f, f> f90467b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        a(Function1<? super f, f> function1) {
            super(1);
            this.f90467b = function1;
        }

        @Override // kotlin.jvm.functions.Function1
        public final f invoke(f fVar) {
            f oldState = fVar;
            Intrinsics.checkNotNullParameter(oldState, "oldState");
            f invoke = this.f90467b.invoke(oldState);
            List<ru.ozon.android.messenger.framework.presentation.models.q> f7 = oldState.f();
            ArrayList arrayList = new ArrayList();
            for (Object obj : f7) {
                ru.ozon.android.messenger.framework.presentation.models.q qVar = (ru.ozon.android.messenger.framework.presentation.models.q) obj;
                List<ru.ozon.android.messenger.framework.presentation.models.q> f11 = invoke.f();
                ArrayList arrayList2 = new ArrayList(C7714v.z(f11, 10));
                Iterator<T> it = f11.iterator();
                while (it.hasNext()) {
                    arrayList2.add(ru.ozon.android.messenger.framework.presentation.models.r.d((ru.ozon.android.messenger.framework.presentation.models.q) it.next()));
                }
                if (!arrayList2.contains(ru.ozon.android.messenger.framework.presentation.models.r.d(qVar))) {
                    arrayList.add(obj);
                }
            }
            return f.a(invoke, null, null, null, null, null, arrayList, null, null, null, 1983);
        }
    }

    public d() {
        super(new f(new w.a(true), 2039));
    }

    @Override // ru.ozon.android.messenger.framework.presentation.common.viewmodel.d, ru.ozon.android.messenger.framework.presentation.common.viewmodel.c
    public final void a(@NotNull Function1<? super f, f> block) {
        Intrinsics.checkNotNullParameter(block, "block");
        super.a(new a(block));
    }
}
