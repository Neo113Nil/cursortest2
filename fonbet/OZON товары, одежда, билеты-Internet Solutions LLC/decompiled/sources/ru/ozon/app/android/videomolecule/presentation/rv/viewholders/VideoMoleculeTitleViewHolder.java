package ru.ozon.app.android.videomolecule.presentation.rv.viewholders;

import Au.e;
import android.view.View;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.storefront.core.socialAtoms.text.SocialTextAtomHolderKt;
import ru.ozon.app.android.storefront.core.socialAtoms.text.SocialTextAtomView;
import ru.ozon.app.android.storefront.ui.videomolecule.R$layout;
import ru.ozon.app.android.videomolecule.presentation.rv.models.VideoMoleculeTitle;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.data.AtomActionDTO;
import ru.ozon.uni.atoms.data.AtomActionMapperKt;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000 \u000e2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u000eB'\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0016\u0010\u0005\u001a\u0012\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u0006j\u0002`\t¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\b2\u0006\u0010\r\u001a\u00020\u0002H\u0014¨\u0006\u000f"}, d2 = {"Lru/ozon/app/android/videomolecule/presentation/rv/viewholders/VideoMoleculeTitleViewHolder;", "Lru/ozon/app/android/videomolecule/presentation/rv/viewholders/VideoMoleculeViewHolder;", "Lru/ozon/app/android/videomolecule/presentation/rv/models/VideoMoleculeTitle;", "containerView", "Landroid/view/View;", "actionHandler", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "", "Lru/ozon/app/android/action/BuildedActionHandler;", "<init>", "(Landroid/view/View;Lkotlin/jvm/functions/Function1;)V", "bindContent", "model", "Companion", "videomolecule_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class VideoMoleculeTitleViewHolder extends VideoMoleculeViewHolder<VideoMoleculeTitle> {

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);
    private static final int viewType = R$layout.video_molecule_social_label_view;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lru/ozon/app/android/videomolecule/presentation/rv/viewholders/VideoMoleculeTitleViewHolder$Companion;", "", "<init>", "()V", "viewType", "", "getViewType", "()I", "videomolecule_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final int getViewType() {
            return VideoMoleculeTitleViewHolder.viewType;
        }

        private Companion() {
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public VideoMoleculeTitleViewHolder(@NotNull View containerView, @NotNull Function1<? super AtomAction, Unit> actionHandler) {
        super(containerView, actionHandler);
        Intrinsics.checkNotNullParameter(containerView, "containerView");
        Intrinsics.checkNotNullParameter(actionHandler, "actionHandler");
        containerView.setOnClickListener(new e(1, (Function1) actionHandler, (Object) this));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void _init_$lambda$1(VideoMoleculeTitleViewHolder videoMoleculeTitleViewHolder, Function1 function1, View view) {
        AtomActionDTO action;
        VideoMoleculeTitle currentModel = videoMoleculeTitleViewHolder.getCurrentModel();
        if (currentModel == null || (action = currentModel.getAction()) == null) {
            return;
        }
        VideoMoleculeTitle currentModel2 = videoMoleculeTitleViewHolder.getCurrentModel();
        AtomAction atomAction = AtomActionMapperKt.toAtomAction(action, currentModel2 != null ? currentModel2.getTrackingInfo() : null);
        if (atomAction != null) {
            function1.invoke(atomAction);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // ru.ozon.app.android.videomolecule.presentation.rv.viewholders.VideoMoleculeViewHolder
    public void bindContent(@NotNull VideoMoleculeTitle model) {
        Intrinsics.checkNotNullParameter(model, "model");
        View view = this.itemView;
        SocialTextAtomView socialTextAtomView = view instanceof SocialTextAtomView ? (SocialTextAtomView) view : null;
        if (socialTextAtomView != null) {
            SocialTextAtomHolderKt.bind(socialTextAtomView, model.getText(), getActionHandler());
        }
    }
}
