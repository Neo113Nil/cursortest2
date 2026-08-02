package ru.ozon.android.messenger.framework.presentation.common.popupmenu;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.android.messenger.framework.data.remote.models.items.ContextMenuDTO;

/* loaded from: classes10.dex */
public final class e extends RecyclerView.t {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ f f90891a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ View f90892b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ ArrayList f90893c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ ContextMenuDTO f90894d;

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ Function0<Unit> f90895e;

    /* renamed from: f, reason: collision with root package name */
    final /* synthetic */ Function0<Unit> f90896f;

    /* renamed from: g, reason: collision with root package name */
    final /* synthetic */ RecyclerView f90897g;

    e(f fVar, View view, ArrayList arrayList, ContextMenuDTO contextMenuDTO, Function0 function0, Function0 function02, RecyclerView recyclerView) {
        this.f90891a = fVar;
        this.f90892b = view;
        this.f90893c = arrayList;
        this.f90894d = contextMenuDTO;
        this.f90895e = function0;
        this.f90896f = function02;
        this.f90897g = recyclerView;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.t
    public final void onScrollStateChanged(RecyclerView recyclerView, int i11) {
        Intrinsics.checkNotNullParameter(recyclerView, "recyclerView");
        if (i11 == 0) {
            Function0<Unit> function0 = this.f90895e;
            Function0<Unit> function02 = this.f90896f;
            this.f90891a.f(this.f90892b, this.f90893c, this.f90894d, function0, function02);
            this.f90897g.removeOnScrollListener(this);
        }
    }
}
