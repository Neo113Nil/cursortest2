package ru.ozon.android.messenger.blocks.recommendations.presentation;

import android.view.View;
import kotlin.jvm.internal.Intrinsics;
import org.joda.time.MutableDateTime;

/* loaded from: classes10.dex */
public final class a implements View.OnAttachStateChangeListener {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ d f86307a;

    a(d dVar) {
        this.f86307a = dVar;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View v11) {
        MutableDateTime mutableDateTime;
        Intrinsics.checkNotNullParameter(v11, "v");
        d dVar = this.f86307a;
        mutableDateTime = dVar.f86324c;
        if (mutableDateTime != null) {
            d.d(dVar);
        }
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View v11) {
        Intrinsics.checkNotNullParameter(v11, "v");
        d.e(this.f86307a);
    }
}
