package ru.ozon.android.messenger.blocks.ai.input.presentation.view;

import S0.M;
import androidx.lifecycle.J;

/* loaded from: classes10.dex */
public final class k implements M {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ J f84278a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ j f84279b;

    public k(J j11, j jVar) {
        this.f84278a = j11;
        this.f84279b = jVar;
    }

    @Override // S0.M
    public final void dispose() {
        this.f84278a.getLifecycle().e(this.f84279b);
    }
}
