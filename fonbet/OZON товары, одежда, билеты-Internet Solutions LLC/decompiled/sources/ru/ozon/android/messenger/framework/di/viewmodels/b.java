package ru.ozon.android.messenger.framework.di.viewmodels;

import Jb.e;
import Jb.f;
import Jb.i;
import android.content.Context;
import java.util.Map;

/* loaded from: classes10.dex */
public final class b implements e {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f88777a;

    /* renamed from: b, reason: collision with root package name */
    private final Object f88778b;

    public /* synthetic */ b(Object obj, int i11) {
        this.f88777a = i11;
        this.f88778b = obj;
    }

    @Override // Pc.a
    public final Object get() {
        switch (this.f88777a) {
            case 0:
                return new a((Map) ((i) this.f88778b).get());
            default:
                return new ru.ozon.android.messenger.utils.image.b((Context) ((f) this.f88778b).get());
        }
    }
}
