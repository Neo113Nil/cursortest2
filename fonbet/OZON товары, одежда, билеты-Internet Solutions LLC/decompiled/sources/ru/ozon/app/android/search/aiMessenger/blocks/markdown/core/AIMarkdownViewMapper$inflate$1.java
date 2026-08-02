package ru.ozon.app.android.search.aiMessenger.blocks.markdown.core;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import fd.InterfaceC6511n;
import kotlin.Metadata;
import kotlin.jvm.internal.C7735q;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.app.android.search.databinding.ItemMarkwonRecyclerBinding;

@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
/* synthetic */ class AIMarkdownViewMapper$inflate$1 extends C7735q implements InterfaceC6511n<LayoutInflater, ViewGroup, Boolean, ItemMarkwonRecyclerBinding> {
    public static final AIMarkdownViewMapper$inflate$1 INSTANCE = new AIMarkdownViewMapper$inflate$1();

    AIMarkdownViewMapper$inflate$1() {
        super(3, ItemMarkwonRecyclerBinding.class, "inflate", "inflate(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Z)Lru/ozon/app/android/search/databinding/ItemMarkwonRecyclerBinding;", 0);
    }

    @Override // fd.InterfaceC6511n
    public /* bridge */ /* synthetic */ ItemMarkwonRecyclerBinding invoke(LayoutInflater layoutInflater, ViewGroup viewGroup, Boolean bool) {
        return invoke(layoutInflater, viewGroup, bool.booleanValue());
    }

    public final ItemMarkwonRecyclerBinding invoke(LayoutInflater p02, ViewGroup viewGroup, boolean z11) {
        Intrinsics.checkNotNullParameter(p02, "p0");
        return ItemMarkwonRecyclerBinding.inflate(p02, viewGroup, z11);
    }
}
