package ru.ozon.app.android.storefront.core.socialAtoms.text;

import android.content.Context;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.v3.AtomV3;

@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0019\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u0007\u0010\bB\u001b\b\u0016\u0012\u0006\u0010\t\u001a\u00020\n\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u0007\u0010\u000bJ\u0010\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u0002H\u0014J&\u0010\u000f\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u00062\u0014\u0010\u0011\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0013\u0018\u00010\u0012H\u0002¨\u0006\u0014"}, d2 = {"Lru/ozon/app/android/storefront/core/socialAtoms/text/SocialTextAtomHolder;", "Lru/ozon/uni/atoms/v3/AtomV3;", "Lru/ozon/app/android/storefront/core/socialAtoms/text/SocialTextAtomDTO;", "Lru/ozon/app/android/storefront/core/socialAtoms/text/SocialTextAtomView;", "view", "atomContext", "", "<init>", "(Lru/ozon/app/android/storefront/core/socialAtoms/text/SocialTextAtomView;Ljava/lang/String;)V", "context", "Landroid/content/Context;", "(Landroid/content/Context;Ljava/lang/String;)V", "onBind", "", "item", "onTagClick", "deeplink", "tagTrackingInfo", "", "Lru/ozon/android/tokenized/model/TokenizedTrackingInfo;", "atoms_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class SocialTextAtomHolder extends AtomV3<SocialTextAtomDTO, SocialTextAtomView> {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SocialTextAtomHolder(@NotNull SocialTextAtomView view, String str) {
        super(view, str);
        Intrinsics.checkNotNullParameter(view, "view");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void onTagClick(String deeplink, Map<String, TokenizedTrackingInfo> tagTrackingInfo) {
        handleAction(new AtomAction.Move(deeplink, null, tagTrackingInfo, null, 2, null));
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public SocialTextAtomHolder(@NotNull Context context, String str) {
        this(new SocialTextAtomView(context, null, 0, 6, null), str);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // ru.ozon.uni.atoms.v3.AtomV3, ru.ozon.uni.atoms.af.Atom
    public void onBind(@NotNull SocialTextAtomDTO item) {
        Intrinsics.checkNotNullParameter(item, "item");
        super.onBind((SocialTextAtomHolder) item);
        getContainerView().setup(item, new SocialTextAtomHolder$onBind$1(this));
    }
}
