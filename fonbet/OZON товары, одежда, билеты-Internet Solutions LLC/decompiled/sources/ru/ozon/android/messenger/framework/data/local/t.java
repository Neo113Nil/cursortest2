package ru.ozon.android.messenger.framework.data.local;

import android.content.Context;
import android.content.res.Resources;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes10.dex */
public final class t implements Jb.e {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f87626a;

    /* renamed from: b, reason: collision with root package name */
    private final Jb.e f87627b;

    public /* synthetic */ t(Jb.e eVar, int i11) {
        this.f87626a = i11;
        this.f87627b = eVar;
    }

    @Override // Pc.a
    public final Object get() {
        switch (this.f87626a) {
            case 0:
                return new s((ru.ozon.android.messenger.framework.data.remote.mapper.a) ((Jb.c) this.f87627b).get());
            default:
                Context appContext = (Context) ((Jb.f) this.f87627b).get();
                Intrinsics.checkNotNullParameter(appContext, "appContext");
                Resources resources = appContext.getResources();
                Intrinsics.checkNotNullExpressionValue(resources, "getResources(...)");
                Jb.j.d(resources);
                return resources;
        }
    }
}
