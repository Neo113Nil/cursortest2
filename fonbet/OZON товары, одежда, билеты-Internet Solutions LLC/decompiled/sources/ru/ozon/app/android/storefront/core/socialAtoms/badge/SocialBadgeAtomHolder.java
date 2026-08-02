package ru.ozon.app.android.storefront.core.socialAtoms.badge;

import CG.a;
import android.content.Context;
import android.view.View;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.data.AtomActionDTO;
import ru.ozon.uni.atoms.data.AtomActionMapperKt;
import ru.ozon.uni.atoms.v3.AtomV3;
import ru.ozon.uni.atoms.v3.holders.WrappedAtomHolder;

@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u0004B\u0019\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\b\u0010\tB\u001b\b\u0016\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\r\u001a\u00020\u0002H\u0014R\u0010\u0010\r\u001a\u0004\u0018\u00010\u0002X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0010"}, d2 = {"Lru/ozon/app/android/storefront/core/socialAtoms/badge/SocialBadgeAtomHolder;", "Lru/ozon/uni/atoms/v3/AtomV3;", "Lru/ozon/app/android/storefront/core/socialAtoms/badge/SocialBadgeAtomDTO;", "Lru/ozon/app/android/storefront/core/socialAtoms/badge/SocialBadgeAtomView;", "Lru/ozon/uni/atoms/v3/holders/WrappedAtomHolder;", "view", "atomContext", "", "<init>", "(Lru/ozon/app/android/storefront/core/socialAtoms/badge/SocialBadgeAtomView;Ljava/lang/String;)V", "context", "Landroid/content/Context;", "(Landroid/content/Context;Ljava/lang/String;)V", "item", "onBind", "", "atoms_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class SocialBadgeAtomHolder extends AtomV3<SocialBadgeAtomDTO, SocialBadgeAtomView> implements WrappedAtomHolder {
    private SocialBadgeAtomDTO item;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SocialBadgeAtomHolder(@NotNull SocialBadgeAtomView view, String str) {
        super(view, str);
        Intrinsics.checkNotNullParameter(view, "view");
        getContainerView().setOnClickListener(new a(this, 7));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void _init_$lambda$1(SocialBadgeAtomHolder socialBadgeAtomHolder, View view) {
        AtomActionDTO action;
        SocialBadgeAtomDTO socialBadgeAtomDTO = socialBadgeAtomHolder.item;
        if (socialBadgeAtomDTO == null || (action = socialBadgeAtomDTO.getAction()) == null) {
            return;
        }
        SocialBadgeAtomDTO socialBadgeAtomDTO2 = socialBadgeAtomHolder.item;
        AtomAction atomAction = AtomActionMapperKt.toAtomAction(action, socialBadgeAtomDTO2 != null ? socialBadgeAtomDTO2.getTrackingInfo() : null);
        if (atomAction != null) {
            socialBadgeAtomHolder.handleAction(atomAction);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // ru.ozon.uni.atoms.v3.AtomV3, ru.ozon.uni.atoms.af.Atom
    public void onBind(@NotNull SocialBadgeAtomDTO item) {
        Intrinsics.checkNotNullParameter(item, "item");
        super.onBind((SocialBadgeAtomHolder) item);
        this.item = item;
        SocialBadgeAtomView containerView = getContainerView();
        containerView.setStyle(item.getStyle());
        containerView.setText(item.getText());
        containerView.setTextColor(item.getTextColor());
        containerView.setBackground(item.getBackgroundColors(), item.getGradientStyle());
        if (item.getIcon() != null) {
            containerView.showIcon(item.getIcon(), item.getIconTintColor());
        } else {
            containerView.hideIcon();
        }
        if (item.getShowArrow()) {
            containerView.showArrow(item.getArrowColor());
        } else {
            containerView.hideArrow();
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public SocialBadgeAtomHolder(@NotNull Context context, String str) {
        this(new SocialBadgeAtomView(context, null, 0, 6, null), str);
        Intrinsics.checkNotNullParameter(context, "context");
    }
}
