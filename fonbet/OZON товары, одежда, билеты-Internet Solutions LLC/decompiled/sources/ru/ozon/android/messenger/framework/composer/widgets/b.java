package ru.ozon.android.messenger.framework.composer.widgets;

import Jb.e;
import Jb.f;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.android.messenger.framework.data.repository.Y;
import ru.ozon.android.messenger.framework.di.m;

/* loaded from: classes10.dex */
public final class b implements e {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f86823a = 0;

    /* renamed from: b, reason: collision with root package name */
    private final e f86824b;

    public b(f fVar) {
        this.f86824b = fVar;
    }

    @Override // Pc.a
    public final Object get() {
        switch (this.f86823a) {
            case 0:
                Set widgets = (Set) ((f) this.f86824b).get();
                Intrinsics.checkNotNullParameter(widgets, "widgets");
                return new a(widgets);
            default:
                Y impl = (Y) ((ru.ozon.android.messenger.blocks.alert.b) this.f86824b).get();
                Intrinsics.checkNotNullParameter(impl, "impl");
                return impl;
        }
    }

    public b(m mVar, ru.ozon.android.messenger.blocks.alert.b bVar) {
        this.f86824b = bVar;
    }
}
