package ru.ozon.android.messenger.framework.data.modules.atoms.timerbadge;

import android.view.View;
import kotlin.jvm.internal.Intrinsics;
import org.joda.time.MutableDateTime;

/* loaded from: classes10.dex */
public final class a implements View.OnAttachStateChangeListener {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ d f87631a;

    a(d dVar) {
        this.f87631a = dVar;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View v11) {
        MutableDateTime mutableDateTime;
        Intrinsics.checkNotNullParameter(v11, "v");
        d dVar = this.f87631a;
        mutableDateTime = dVar.f87641c;
        if (mutableDateTime != null) {
            d.d(dVar);
        }
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View v11) {
        Intrinsics.checkNotNullParameter(v11, "v");
        d.e(this.f87631a);
    }
}
