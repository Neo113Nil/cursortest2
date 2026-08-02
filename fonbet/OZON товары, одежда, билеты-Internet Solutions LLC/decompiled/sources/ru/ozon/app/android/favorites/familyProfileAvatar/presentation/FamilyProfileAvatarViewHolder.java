package ru.ozon.app.android.favorites.familyProfileAvatar.presentation;

import W10.c;
import WZ.l;
import WZ.m;
import WZ.t;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import l20.d;
import org.jetbrains.annotations.NotNull;
import ru.ozon.composer.ui.widget.f;
import ru.ozon.composer.ui.widget.k;
import ru.ozon.uni.android.atom.text.TextAtomV2View;
import ru.ozon.uni.atoms.data.TestInfo;
import ru.ozon.uni.atoms.data.text.TextDTO;
import ru.ozon.uni.atoms.v3.holders.icon.IconHolderKt;
import ru.ozon.uni.atoms.v3.holders.text.TextHolderKt;

@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u00002\u0012\u0012\u0004\u0012\u00020\u00020\u0001j\b\u0012\u0004\u0012\u00020\u0002`\u0003B\u0017\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u001f\u0010\u000e\u001a\u00020\r2\u0006\u0010\n\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000bH\u0014¢\u0006\u0004\b\u000e\u0010\u000fJ)\u0010\u0014\u001a\u00020\r2\u0006\u0010\n\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u00102\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012H\u0016¢\u0006\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0016R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u0017¨\u0006\u0018"}, d2 = {"Lru/ozon/app/android/favorites/familyProfileAvatar/presentation/FamilyProfileAvatarViewHolder;", "Lru/ozon/composer/ui/widget/k;", "Lru/ozon/app/android/favorites/familyProfileAvatar/presentation/FamilyProfileAvatarVO;", "Lru/ozon/app/android/composer/widgets/base/WidgetViewHolder;", "Lru/ozon/app/android/favorites/familyProfileAvatar/presentation/FamilyProfileAvatarView;", "view", "LWZ/l;", "tokenizedAnalytics", "<init>", "(Lru/ozon/app/android/favorites/familyProfileAvatar/presentation/FamilyProfileAvatarView;LWZ/l;)V", "item", "Ll20/d;", "info", "", "bind", "(Lru/ozon/app/android/favorites/familyProfileAvatar/presentation/FamilyProfileAvatarVO;Ll20/d;)V", "LW10/c;", "trackingData", "Lru/ozon/composer/ui/widget/f;", "viewedPond", "trackView", "(Lru/ozon/app/android/favorites/familyProfileAvatar/presentation/FamilyProfileAvatarVO;LW10/c;Lru/ozon/composer/ui/widget/f;)V", "Lru/ozon/app/android/favorites/familyProfileAvatar/presentation/FamilyProfileAvatarView;", "LWZ/l;", "favorites_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class FamilyProfileAvatarViewHolder extends k<FamilyProfileAvatarVO> {

    @NotNull
    private final l tokenizedAnalytics;

    @NotNull
    private final FamilyProfileAvatarView view;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FamilyProfileAvatarViewHolder(@NotNull FamilyProfileAvatarView view, @NotNull l tokenizedAnalytics) {
        super(view);
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(tokenizedAnalytics, "tokenizedAnalytics");
        this.view = view;
        this.tokenizedAnalytics = tokenizedAnalytics;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // ru.ozon.composer.ui.widget.k
    public void bind(@NotNull FamilyProfileAvatarVO item, @NotNull d info) {
        String automatizationId;
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(info, "info");
        FamilyProfileAvatarView familyProfileAvatarView = this.view;
        IconHolderKt.bind$default(familyProfileAvatarView.getAvatar(), item.getAvatar(), null, 2, null);
        TextHolderKt.bind$default(familyProfileAvatarView.getTitle(), item.getTitle(), null, 2, null);
        TextDTO subtitle = item.getSubtitle();
        if (subtitle != null) {
            TextHolderKt.bind$default(familyProfileAvatarView.createAndGetSubtitle(), subtitle, null, 2, null);
        } else {
            TextAtomV2View subtitle2 = familyProfileAvatarView.getSubtitle();
            if (subtitle2 != null) {
                subtitle2.setVisibility(8);
            }
        }
        TestInfo testInfo = item.getTestInfo();
        if (testInfo == null || (automatizationId = testInfo.getAutomatizationId()) == null) {
            return;
        }
        familyProfileAvatarView.setContentDescription(automatizationId);
    }

    @Override // ru.ozon.composer.ui.widget.k
    public void trackView(@NotNull FamilyProfileAvatarVO item, @NotNull c trackingData, f viewedPond) {
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(trackingData, "trackingData");
        t tokenizedEvent = item.getTokenizedEvent();
        if (tokenizedEvent != null) {
            m.c(this.tokenizedAnalytics, tokenizedEvent, null);
        }
    }
}
