package ru.ozon.app.android.fresh.common.widgets.molecules.freshTile.presentation;

import androidx.recyclerview.widget.RecyclerView;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;

@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lru/ozon/app/android/fresh/common/widgets/molecules/freshTile/presentation/AtomListAdapter;", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
final class FreshTileViewV2$atomListAdapter$2 extends AbstractC7737t implements Function0<AtomListAdapter> {
    final /* synthetic */ FreshTileViewV2 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    FreshTileViewV2$atomListAdapter$2(FreshTileViewV2 freshTileViewV2) {
        super(0);
        this.this$0 = freshTileViewV2;
    }

    @Override // kotlin.jvm.functions.Function0
    public final AtomListAdapter invoke() {
        RecyclerView recyclerView;
        AtomListAdapter atomListAdapter = new AtomListAdapter();
        recyclerView = this.this$0.atomListContainer;
        recyclerView.setAdapter(atomListAdapter);
        return atomListAdapter;
    }
}
