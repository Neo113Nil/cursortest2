package ru.ozon.app.android.storefront.widgets.profile.core;

import a00.j;
import android.view.View;
import androidx.lifecycle.w0;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.N;
import ru.ozon.app.android.composer.ComposerReferences;
import ru.ozon.app.android.composer.widgets.v2.onboarding.presentation.BaseOnBoardingViewModel;
import ru.ozon.app.android.storefront.widgets.profile.presentation.ProfileCellViewHolder;
import ru.ozon.uni.android.cell.CellView;

@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\n¢\u0006\u0002\b\u0006"}, d2 = {"<anonymous>", "Lru/ozon/app/android/storefront/widgets/profile/presentation/ProfileCellViewHolder;", "itemView", "Landroid/view/View;", "refs", "Lru/ozon/app/android/composer/ComposerReferences;", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
final class ProfileCellViewMapper$holderProducer$1 extends AbstractC7737t implements Function2<View, ComposerReferences, ProfileCellViewHolder> {
    final /* synthetic */ ProfileCellViewMapper this$0;

    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lru/ozon/app/android/composer/widgets/v2/onboarding/presentation/BaseOnBoardingViewModel$Default;", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
    /* renamed from: ru.ozon.app.android.storefront.widgets.profile.core.ProfileCellViewMapper$holderProducer$1$1, reason: invalid class name */
    /* loaded from: classes2.dex */
    static final class AnonymousClass1 extends AbstractC7737t implements Function0<BaseOnBoardingViewModel.Default> {
        final /* synthetic */ ProfileCellViewMapper this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(ProfileCellViewMapper profileCellViewMapper) {
            super(0);
            this.this$0 = profileCellViewMapper;
        }

        @Override // kotlin.jvm.functions.Function0
        public final BaseOnBoardingViewModel.Default invoke() {
            return this.this$0.component().getOnBoardingViewModel();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ProfileCellViewMapper$holderProducer$1(ProfileCellViewMapper profileCellViewMapper) {
        super(2);
        this.this$0 = profileCellViewMapper;
    }

    @Override // kotlin.jvm.functions.Function2
    public final ProfileCellViewHolder invoke(View itemView, ComposerReferences refs) {
        Intrinsics.checkNotNullParameter(itemView, "itemView");
        Intrinsics.checkNotNullParameter(refs, "refs");
        return new ProfileCellViewHolder(refs, (CellView) itemView, (BaseOnBoardingViewModel) ((w0) j.a(refs.getViewModelOwnerProvider().a(), N.b(BaseOnBoardingViewModel.Default.class), new AnonymousClass1(this.this$0)).getValue()), this.this$0.component().getOnBoardingRepository(), this.this$0.component().getTokenizedAnalytics());
    }
}
