package ru.ozon.android.messenger.framework.core.viewmapper;

import KD.i;
import android.view.ViewGroup;
import androidx.lifecycle.AbstractC5434v;
import androidx.lifecycle.G;
import androidx.lifecycle.J;
import androidx.lifecycle.L;
import java.util.HashMap;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes10.dex */
public final class c implements G {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ L f87367a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ AbstractC5434v f87368b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ i f87369c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ b f87370d;

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ ViewGroup f87371e;

    /* renamed from: f, reason: collision with root package name */
    final /* synthetic */ X4.a f87372f;

    /* renamed from: g, reason: collision with root package name */
    final /* synthetic */ ru.ozon.android.messenger.framework.core.d f87373g;

    public c(L l11, AbstractC5434v abstractC5434v, i iVar, b bVar, ViewGroup viewGroup, X4.a aVar, ru.ozon.android.messenger.framework.core.d dVar) {
        this.f87367a = l11;
        this.f87368b = abstractC5434v;
        this.f87369c = iVar;
        this.f87370d = bVar;
        this.f87371e = viewGroup;
        this.f87372f = aVar;
        this.f87373g = dVar;
    }

    @Override // androidx.lifecycle.G
    public final void onStateChanged(J source, AbstractC5434v.a event) {
        HashMap hashMap;
        Intrinsics.checkNotNullParameter(source, "source");
        Intrinsics.checkNotNullParameter(event, "event");
        if (event == AbstractC5434v.a.ON_DESTROY) {
            this.f87368b.e(this.f87369c);
            b bVar = this.f87370d;
            hashMap = bVar.f87362a;
            ViewGroup viewGroup = this.f87371e;
            hashMap.remove(viewGroup);
            bVar.l(viewGroup, this.f87372f, this.f87373g);
            this.f87367a.e(this);
        }
    }
}
