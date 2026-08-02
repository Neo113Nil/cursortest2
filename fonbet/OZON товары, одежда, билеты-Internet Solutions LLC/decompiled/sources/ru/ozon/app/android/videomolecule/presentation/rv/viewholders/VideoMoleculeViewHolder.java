package ru.ozon.app.android.videomolecule.presentation.rv.viewholders;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.videomolecule.presentation.rv.models.VideoMoleculeBottomContentModel;
import ru.ozon.uni.atoms.af.AtomAction;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0012\b&\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\u00020\u0003B-\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u001c\b\u0002\u0010\n\u001a\u0016\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b\u0018\u00010\u0006j\u0004\u0018\u0001`\t¢\u0006\u0004\b\u000b\u0010\fJ\u0015\u0010\u000e\u001a\u00020\b2\u0006\u0010\r\u001a\u00020\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0010\u001a\u00020\b2\u0006\u0010\r\u001a\u00028\u0000H$¢\u0006\u0004\b\u0010\u0010\u000fR6\u0010\n\u001a\u0016\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b\u0018\u00010\u0006j\u0004\u0018\u0001`\t8\u0004@\u0004X\u0084\u000e¢\u0006\u0012\n\u0004\b\n\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R$\u0010\u0016\u001a\u0004\u0018\u00018\u00008\u0004@\u0004X\u0084\u000e¢\u0006\u0012\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u000f¨\u0006\u001b"}, d2 = {"Lru/ozon/app/android/videomolecule/presentation/rv/viewholders/VideoMoleculeViewHolder;", "Lru/ozon/app/android/videomolecule/presentation/rv/models/VideoMoleculeBottomContentModel;", "T", "Landroidx/recyclerview/widget/RecyclerView$C;", "Landroid/view/View;", "containerView", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "", "Lru/ozon/app/android/action/BuildedActionHandler;", "actionHandler", "<init>", "(Landroid/view/View;Lkotlin/jvm/functions/Function1;)V", "model", "bind", "(Lru/ozon/app/android/videomolecule/presentation/rv/models/VideoMoleculeBottomContentModel;)V", "bindContent", "Lkotlin/jvm/functions/Function1;", "getActionHandler", "()Lkotlin/jvm/functions/Function1;", "setActionHandler", "(Lkotlin/jvm/functions/Function1;)V", "currentModel", "Lru/ozon/app/android/videomolecule/presentation/rv/models/VideoMoleculeBottomContentModel;", "getCurrentModel", "()Lru/ozon/app/android/videomolecule/presentation/rv/models/VideoMoleculeBottomContentModel;", "setCurrentModel", "videomolecule_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public abstract class VideoMoleculeViewHolder<T extends VideoMoleculeBottomContentModel> extends RecyclerView.C {
    private Function1<? super AtomAction, Unit> actionHandler;
    private T currentModel;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public VideoMoleculeViewHolder(@NotNull View containerView, Function1<? super AtomAction, Unit> function1) {
        super(containerView);
        Intrinsics.checkNotNullParameter(containerView, "containerView");
        this.actionHandler = function1;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void bind(@NotNull VideoMoleculeBottomContentModel model) {
        Intrinsics.checkNotNullParameter(model, "model");
        if (model != 0) {
            this.currentModel = model;
            bindContent(model);
        }
    }

    protected abstract void bindContent(@NotNull T model);

    protected final Function1<AtomAction, Unit> getActionHandler() {
        return this.actionHandler;
    }

    protected final T getCurrentModel() {
        return this.currentModel;
    }
}
