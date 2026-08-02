package ru.ozon.app.android.videomolecule.presentation.rv.viewholders;

import WZ.l;
import android.view.ViewGroup;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.videomolecule.presentation.rv.viewholders.socialporduct.SocialProductViewHolder;
import ru.ozon.uni.android.uikit.extensions.view.ViewGroupExtKt;
import ru.ozon.uni.atoms.af.AtomAction;

@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J9\u0010\u0010\u001a\u0006\u0012\u0002\b\u00030\u000f2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0016\u0010\u000e\u001a\u0012\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f0\nj\u0002`\r¢\u0006\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0012¨\u0006\u0013"}, d2 = {"Lru/ozon/app/android/videomolecule/presentation/rv/viewholders/VideoMoleculeViewHolderFactory;", "", "LWZ/l;", "tokenizedAnalytics", "<init>", "(LWZ/l;)V", "", "viewType", "Landroid/view/ViewGroup;", "parent", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "", "Lru/ozon/app/android/action/BuildedActionHandler;", "actionHandler", "Lru/ozon/app/android/videomolecule/presentation/rv/viewholders/VideoMoleculeViewHolder;", "create", "(ILandroid/view/ViewGroup;Lkotlin/jvm/functions/Function1;)Lru/ozon/app/android/videomolecule/presentation/rv/viewholders/VideoMoleculeViewHolder;", "LWZ/l;", "videomolecule_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class VideoMoleculeViewHolderFactory {

    @NotNull
    private final l tokenizedAnalytics;

    public VideoMoleculeViewHolderFactory(@NotNull l tokenizedAnalytics) {
        Intrinsics.checkNotNullParameter(tokenizedAnalytics, "tokenizedAnalytics");
        this.tokenizedAnalytics = tokenizedAnalytics;
    }

    @NotNull
    public final VideoMoleculeViewHolder<?> create(int viewType, @NotNull ViewGroup parent, @NotNull Function1<? super AtomAction, Unit> actionHandler) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        Intrinsics.checkNotNullParameter(actionHandler, "actionHandler");
        if (viewType == SocialProductViewHolder.INSTANCE.getViewType()) {
            return new SocialProductViewHolder(ViewGroupExtKt.inflate(parent, viewType), this.tokenizedAnalytics, actionHandler);
        }
        if (viewType == VideoMoleculeTitleViewHolder.INSTANCE.getViewType()) {
            return new VideoMoleculeTitleViewHolder(ViewGroupExtKt.inflate(parent, viewType), actionHandler);
        }
        throw new Exception("incorrect viewHolder type");
    }
}
