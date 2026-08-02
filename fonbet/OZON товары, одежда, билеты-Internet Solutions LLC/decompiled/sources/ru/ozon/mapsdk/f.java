package ru.ozon.mapsdk;

import Le0.z;
import Ne0.e;

/* loaded from: classes3.dex */
public final class f extends z {

    /* renamed from: a, reason: collision with root package name */
    private final Ne0.e f97564a;

    f(boolean z11) {
        this.f97564a = z11 ? new e.c() : new e.a();
    }

    @Override // Le0.z
    public final Ne0.e getLibrePlacemarkImplementation() {
        return this.f97564a;
    }
}
