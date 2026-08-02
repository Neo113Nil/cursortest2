package ru.ozon.app.android.common.taglist.taglistv3.presentation.scrolling.rv;

import android.view.View;
import jk0.j;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.data.AtomDTO;
import ru.ozon.uni.atoms.v3.containers.SingleAtom;

@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0007\u0018\u00002\u00060\u0001j\u0002`\u0002B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J)\u0010\r\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u00072\u0012\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b0\t¢\u0006\u0004\b\r\u0010\u000eR\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, d2 = {"Lru/ozon/app/android/common/taglist/taglistv3/presentation/scrolling/rv/TagV3RvItemViewHolder;", "Ljk0/j;", "Lru/ozon/app/android/uikit/view/recycler/adapter/lifecycle/LifecycleViewHolder;", "Landroid/view/View;", "containerView", "<init>", "(Landroid/view/View;)V", "Lru/ozon/uni/atoms/data/AtomDTO;", "atom", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "", "onAction", "bind", "(Lru/ozon/uni/atoms/data/AtomDTO;Lkotlin/jvm/functions/Function1;)V", "Landroid/view/View;", "getContainerView", "()Landroid/view/View;", "taglist_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class TagV3RvItemViewHolder extends j {

    @NotNull
    private final View containerView;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TagV3RvItemViewHolder(@NotNull View containerView) {
        super(containerView);
        Intrinsics.checkNotNullParameter(containerView, "containerView");
        this.containerView = containerView;
    }

    public final void bind(@NotNull AtomDTO atom, @NotNull Function1<? super AtomAction, Unit> onAction) {
        Intrinsics.checkNotNullParameter(atom, "atom");
        Intrinsics.checkNotNullParameter(onAction, "onAction");
        View view = this.containerView;
        SingleAtom singleAtom = view instanceof SingleAtom ? (SingleAtom) view : null;
        if (singleAtom != null) {
            SingleAtom.bind$default(singleAtom, atom, false, 2, null);
            singleAtom.setOnAction(onAction);
        }
    }
}
