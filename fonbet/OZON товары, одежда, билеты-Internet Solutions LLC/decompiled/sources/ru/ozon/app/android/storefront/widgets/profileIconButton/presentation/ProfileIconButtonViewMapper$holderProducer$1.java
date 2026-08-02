package ru.ozon.app.android.storefront.widgets.profileIconButton.presentation;

import Vg.d;
import android.content.SharedPreferences;
import android.view.View;
import kotlin.Metadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.app.android.composer.ComposerReferences;
import ru.ozon.app.android.composer.throttle.HandlersInhibitor;
import ru.ozon.app.android.network.abtool.FeatureChecker;
import ru.ozon.app.android.storefront.widgets.profileIconButton.di.ProfileIconButtonComponent;
import ru.ozon.app.android.storefront.widgets.profileIconButton.presentation.view.ProfileIconButtonView;

@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\n¢\u0006\u0002\b\u0006"}, d2 = {"<anonymous>", "Lru/ozon/app/android/storefront/widgets/profileIconButton/presentation/ProfileIconButtonViewHolder;", "view", "Landroid/view/View;", "references", "Lru/ozon/app/android/composer/ComposerReferences;", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
final class ProfileIconButtonViewMapper$holderProducer$1 extends AbstractC7737t implements Function2<View, ComposerReferences, ProfileIconButtonViewHolder> {
    final /* synthetic */ ProfileIconButtonViewMapper this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ProfileIconButtonViewMapper$holderProducer$1(ProfileIconButtonViewMapper profileIconButtonViewMapper) {
        super(2);
        this.this$0 = profileIconButtonViewMapper;
    }

    @Override // kotlin.jvm.functions.Function2
    public final ProfileIconButtonViewHolder invoke(View view, ComposerReferences references) {
        ProfileIconButtonComponent profileIconButtonComponent;
        ProfileIconButtonComponent profileIconButtonComponent2;
        ProfileIconButtonComponent profileIconButtonComponent3;
        ProfileIconButtonComponent profileIconButtonComponent4;
        ProfileIconButtonComponent profileIconButtonComponent5;
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(references, "references");
        ProfileIconButtonView profileIconButtonView = (ProfileIconButtonView) view;
        profileIconButtonComponent = this.this$0.component;
        d customActionHandlersStoreFactory = profileIconButtonComponent.getCustomActionHandlersStoreFactory();
        profileIconButtonComponent2 = this.this$0.component;
        HandlersInhibitor inhibitor = profileIconButtonComponent2.getInhibitor();
        profileIconButtonComponent3 = this.this$0.component;
        SharedPreferences sharedPreferences = profileIconButtonComponent3.getSharedPreferences();
        profileIconButtonComponent4 = this.this$0.component;
        FeatureChecker featureChecker = profileIconButtonComponent4.getFeatureChecker();
        profileIconButtonComponent5 = this.this$0.component;
        return new ProfileIconButtonViewHolder(profileIconButtonView, references, customActionHandlersStoreFactory, inhibitor, sharedPreferences, featureChecker, profileIconButtonComponent5.getTokenizedAnalytics());
    }
}
