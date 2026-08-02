package ru.ozon.app.android.storefront.core.socialAtoms.iconButton;

import AU.a;
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

@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u0004B\u0019\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\b\u0010\tB\u001b\b\u0016\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\b\u0010\fJ\u0010\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0002H\u0014¨\u0006\u0010"}, d2 = {"Lru/ozon/app/android/storefront/core/socialAtoms/iconButton/SocialIconButtonHolder;", "Lru/ozon/uni/atoms/v3/AtomV3;", "Lru/ozon/app/android/storefront/core/socialAtoms/iconButton/SocialIconButtonDTO;", "Lru/ozon/app/android/storefront/core/socialAtoms/iconButton/SocialIconButtonView;", "Lru/ozon/uni/atoms/v3/holders/WrappedAtomHolder;", "view", "atomContext", "", "<init>", "(Lru/ozon/app/android/storefront/core/socialAtoms/iconButton/SocialIconButtonView;Ljava/lang/String;)V", "context", "Landroid/content/Context;", "(Landroid/content/Context;Ljava/lang/String;)V", "onBind", "", "item", "atoms_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class SocialIconButtonHolder extends AtomV3<SocialIconButtonDTO, SocialIconButtonView> implements WrappedAtomHolder {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SocialIconButtonHolder(@NotNull SocialIconButtonView view, String str) {
        super(view, str);
        Intrinsics.checkNotNullParameter(view, "view");
        getContainerView().setOnClickListener(new a(this, 4));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final void _init_$lambda$1(SocialIconButtonHolder socialIconButtonHolder, View view) {
        AtomAction atomAction;
        AtomActionDTO action = ((SocialIconButtonDTO) socialIconButtonHolder.getData()).getAction();
        if (action == null || (atomAction = AtomActionMapperKt.toAtomAction(action, ((SocialIconButtonDTO) socialIconButtonHolder.getData()).getTrackingInfo())) == null) {
            return;
        }
        socialIconButtonHolder.handleAction(atomAction);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // ru.ozon.uni.atoms.v3.AtomV3, ru.ozon.uni.atoms.af.Atom
    public void onBind(@NotNull SocialIconButtonDTO item) {
        Intrinsics.checkNotNullParameter(item, "item");
        super.onBind((SocialIconButtonHolder) item);
        getContainerView().setup(item);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public SocialIconButtonHolder(@NotNull Context context, String str) {
        this(new SocialIconButtonView(context, null, 0, 6, null), str);
        Intrinsics.checkNotNullParameter(context, "context");
    }
}
