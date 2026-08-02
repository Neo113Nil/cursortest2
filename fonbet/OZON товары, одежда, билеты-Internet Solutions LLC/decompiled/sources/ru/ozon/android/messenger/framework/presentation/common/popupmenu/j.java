package ru.ozon.android.messenger.framework.presentation.common.popupmenu;

import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.android.messenger.framework.presentation.common.view.recycler.MessengerMetricsRecyclerView;
import ru.ozon.android.messenger.framework.presentation.models.s;

/* loaded from: classes10.dex */
public final class j extends RecyclerView.t {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ k f90907a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ int f90908b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ View f90909c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ ViewGroup f90910d;

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ s f90911e;

    /* renamed from: f, reason: collision with root package name */
    final /* synthetic */ List<ru.ozon.android.messenger.framework.presentation.common.popupmenu.action.c> f90912f;

    /* renamed from: g, reason: collision with root package name */
    final /* synthetic */ Function0<Unit> f90913g;

    /* renamed from: h, reason: collision with root package name */
    final /* synthetic */ Function0<Unit> f90914h;

    /* renamed from: i, reason: collision with root package name */
    final /* synthetic */ MessengerMetricsRecyclerView f90915i;

    j(k kVar, int i11, View view, ViewGroup viewGroup, s sVar, List list, Function0 function0, Function0 function02, MessengerMetricsRecyclerView messengerMetricsRecyclerView) {
        this.f90907a = kVar;
        this.f90908b = i11;
        this.f90909c = view;
        this.f90910d = viewGroup;
        this.f90911e = sVar;
        this.f90912f = list;
        this.f90913g = function0;
        this.f90914h = function02;
        this.f90915i = messengerMetricsRecyclerView;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.t
    public final void onScrollStateChanged(RecyclerView recyclerView, int i11) {
        Intrinsics.checkNotNullParameter(recyclerView, "recyclerView");
        if (i11 == 0) {
            Function0<Unit> function0 = this.f90913g;
            Function0<Unit> function02 = this.f90914h;
            this.f90907a.f(this.f90908b, this.f90909c, this.f90910d, this.f90911e, this.f90912f, function0, function02);
            this.f90915i.removeOnScrollListener(this);
        }
    }
}
