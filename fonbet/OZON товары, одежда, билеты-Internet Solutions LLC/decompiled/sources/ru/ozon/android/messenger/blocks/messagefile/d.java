package ru.ozon.android.messenger.blocks.messagefile;

import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.android.messenger.framework.presentation.models.p;
import ru.ozon.android.messenger.framework.presentation.models.s;
import ru.ozon.android.messenger.framework.presentation.models.z;
import ru.ozon.app.android.messenger.databinding.MBlockFileBinding;

/* loaded from: classes10.dex */
final class d extends AbstractC7737t implements Function1<View, Unit> {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ p f85702b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ MBlockFileBinding f85703c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ e f85704d;

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ c f85705e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    d(p pVar, MBlockFileBinding mBlockFileBinding, e eVar, c cVar) {
        super(1);
        this.f85702b = pVar;
        this.f85703c = mBlockFileBinding;
        this.f85704d = eVar;
        this.f85705e = cVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(View view) {
        View it = view;
        Intrinsics.checkNotNullParameter(it, "it");
        if (Intrinsics.d(((s) this.f85702b).k(), z.b.f91564a)) {
            ViewParent parent = this.f85703c.fileMessageRootCl.getParent();
            ViewGroup viewGroup = parent instanceof ViewGroup ? (ViewGroup) parent : null;
            if (viewGroup != null) {
                viewGroup.callOnClick();
            }
        } else {
            e.c(this.f85704d, this.f85705e);
        }
        return Unit.f71690a;
    }
}
