package ru.ozon.app.android.videomolecule.presentation.rv;

import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.videomolecule.presentation.rv.models.VideoMoleculeBottomContentModel;
import ru.ozon.app.android.videomolecule.presentation.rv.viewholders.VideoMoleculeViewHolder;
import ru.ozon.app.android.videomolecule.presentation.rv.viewholders.VideoMoleculeViewHolderFactory;
import ru.ozon.uni.atoms.af.AtomAction;

@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010 \n\u0002\b\u0005\n\u0002\u0010!\n\u0002\b\u0003\u0018\u00002\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00020\u0001B'\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0016\u0010\t\u001a\u0012\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005j\u0002`\b¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\fH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J#\u0010\u0014\u001a\u0006\u0012\u0002\b\u00030\u00022\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0013\u001a\u00020\fH\u0016¢\u0006\u0004\b\u0014\u0010\u0015J#\u0010\u0017\u001a\u00020\u00072\n\u0010\u0016\u001a\u0006\u0012\u0002\b\u00030\u00022\u0006\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u0017\u0010\u0019\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ\u000f\u0010\u001b\u001a\u00020\fH\u0016¢\u0006\u0004\b\u001b\u0010\u001cJ\u001b\u0010\u001f\u001a\u00020\u00072\f\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u000e0\u001d¢\u0006\u0004\b\u001f\u0010 R\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010!R$\u0010\t\u001a\u0012\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005j\u0002`\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\"R\u001c\u0010$\u001a\b\u0012\u0004\u0012\u00020\u000e0#8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b$\u0010%¨\u0006&"}, d2 = {"Lru/ozon/app/android/videomolecule/presentation/rv/VideoMoleculeBottomContainerAdapter;", "Landroidx/recyclerview/widget/RecyclerView$g;", "Lru/ozon/app/android/videomolecule/presentation/rv/viewholders/VideoMoleculeViewHolder;", "Lru/ozon/app/android/videomolecule/presentation/rv/viewholders/VideoMoleculeViewHolderFactory;", "factory", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "", "Lru/ozon/app/android/action/BuildedActionHandler;", "actionHandler", "<init>", "(Lru/ozon/app/android/videomolecule/presentation/rv/viewholders/VideoMoleculeViewHolderFactory;Lkotlin/jvm/functions/Function1;)V", "", "position", "Lru/ozon/app/android/videomolecule/presentation/rv/models/VideoMoleculeBottomContentModel;", "getItem", "(I)Lru/ozon/app/android/videomolecule/presentation/rv/models/VideoMoleculeBottomContentModel;", "Landroid/view/ViewGroup;", "parent", "viewType", "onCreateViewHolder", "(Landroid/view/ViewGroup;I)Lru/ozon/app/android/videomolecule/presentation/rv/viewholders/VideoMoleculeViewHolder;", "holder", "onBindViewHolder", "(Lru/ozon/app/android/videomolecule/presentation/rv/viewholders/VideoMoleculeViewHolder;I)V", "getItemViewType", "(I)I", "getItemCount", "()I", "", "newList", "submitList", "(Ljava/util/List;)V", "Lru/ozon/app/android/videomolecule/presentation/rv/viewholders/VideoMoleculeViewHolderFactory;", "Lkotlin/jvm/functions/Function1;", "", "list", "Ljava/util/List;", "videomolecule_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class VideoMoleculeBottomContainerAdapter extends RecyclerView.g<VideoMoleculeViewHolder<?>> {

    @NotNull
    private final Function1<AtomAction, Unit> actionHandler;

    @NotNull
    private final VideoMoleculeViewHolderFactory factory;

    @NotNull
    private List<VideoMoleculeBottomContentModel> list;

    /* JADX WARN: Multi-variable type inference failed */
    public VideoMoleculeBottomContainerAdapter(@NotNull VideoMoleculeViewHolderFactory factory, @NotNull Function1<? super AtomAction, Unit> actionHandler) {
        Intrinsics.checkNotNullParameter(factory, "factory");
        Intrinsics.checkNotNullParameter(actionHandler, "actionHandler");
        this.factory = factory;
        this.actionHandler = actionHandler;
        this.list = new ArrayList();
    }

    private final VideoMoleculeBottomContentModel getItem(int position) {
        return this.list.get(position);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.g
    /* renamed from: getItemCount */
    public int getCardsCount() {
        return this.list.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.g
    public int getItemViewType(int position) {
        return getItem(position).getViewType();
    }

    public final void submitList(@NotNull List<? extends VideoMoleculeBottomContentModel> newList) {
        Intrinsics.checkNotNullParameter(newList, "newList");
        this.list.clear();
        this.list.addAll(newList);
        notifyDataSetChanged();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.g
    public void onBindViewHolder(@NotNull VideoMoleculeViewHolder<?> holder, int position) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        holder.bind(getItem(position));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.g
    @NotNull
    public VideoMoleculeViewHolder<?> onCreateViewHolder(@NotNull ViewGroup parent, int viewType) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        return this.factory.create(viewType, parent, this.actionHandler);
    }
}
