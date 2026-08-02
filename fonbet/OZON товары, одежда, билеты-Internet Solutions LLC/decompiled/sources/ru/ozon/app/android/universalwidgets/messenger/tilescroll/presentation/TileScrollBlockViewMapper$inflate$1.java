package ru.ozon.app.android.universalwidgets.messenger.tilescroll.presentation;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import fd.InterfaceC6511n;
import kotlin.Metadata;
import kotlin.jvm.internal.C7735q;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.app.android.universalwidgets.messenger.tilescroll.presentation.TileScrollBlockViewBinding;

@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
/* synthetic */ class TileScrollBlockViewMapper$inflate$1 extends C7735q implements InterfaceC6511n<LayoutInflater, ViewGroup, Boolean, TileScrollBlockViewBinding> {
    TileScrollBlockViewMapper$inflate$1(Object obj) {
        super(3, obj, TileScrollBlockViewBinding.Companion.class, "create", "create(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Z)Lru/ozon/app/android/universalwidgets/messenger/tilescroll/presentation/TileScrollBlockViewBinding;", 0);
    }

    @Override // fd.InterfaceC6511n
    public /* bridge */ /* synthetic */ TileScrollBlockViewBinding invoke(LayoutInflater layoutInflater, ViewGroup viewGroup, Boolean bool) {
        return invoke(layoutInflater, viewGroup, bool.booleanValue());
    }

    public final TileScrollBlockViewBinding invoke(LayoutInflater p02, ViewGroup viewGroup, boolean z11) {
        Intrinsics.checkNotNullParameter(p02, "p0");
        return ((TileScrollBlockViewBinding.Companion) this.receiver).create(p02, viewGroup, z11);
    }
}
