package ru.ozon.android.messenger.blocks.messagetext;

import android.view.View;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.app.android.messenger.databinding.MBlockTextBinding;

/* loaded from: classes10.dex */
public final class k extends n {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ MBlockTextBinding f85881a;

    k(MBlockTextBinding mBlockTextBinding) {
        this.f85881a = mBlockTextBinding;
    }

    @Override // ru.ozon.android.messenger.blocks.messagetext.n
    public final void a() {
        Object parent = this.f85881a.getConstraintLayout().getParent();
        Intrinsics.g(parent, "null cannot be cast to non-null type android.view.View");
        ((View) parent).performClick();
    }
}
