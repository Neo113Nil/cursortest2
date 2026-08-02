package ru.ozon.android.messenger.blocks.messagetext;

import android.view.View;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes10.dex */
public final class c extends n {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ b f85820a;

    c(b bVar) {
        this.f85820a = bVar;
    }

    @Override // ru.ozon.android.messenger.blocks.messagetext.n
    public final void a() {
        Object parent = b.t(this.f85820a).root.getParent();
        Intrinsics.g(parent, "null cannot be cast to non-null type android.view.View");
        ((View) parent).performClick();
    }
}
