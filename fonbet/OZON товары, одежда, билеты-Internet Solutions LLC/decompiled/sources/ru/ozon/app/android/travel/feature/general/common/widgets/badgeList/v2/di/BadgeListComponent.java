package ru.ozon.app.android.travel.feature.general.common.widgets.badgeList.v2.di;

import WZ.l;
import hi.InterfaceC6958a;
import k20.C7473e;
import k20.C7475g;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.N;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.travel.feature.general.common.widgets.badgeList.v2.data.BadgeListMapper;
import ru.ozon.app.android.travel.feature.general.common.widgets.badgeList.v2.presentation.BadgeListWidgetViewModel;

@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b`\u0018\u0000 \u00112\u00060\u0001j\u0002`\u0002:\u0001\u0011R\u0018\u0010\u0007\u001a\u00060\u0003j\u0002`\u00048&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006R\u0014\u0010\u000b\u001a\u00020\b8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\t\u0010\nR\u001a\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\r0\f8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u0012"}, d2 = {"Lru/ozon/app/android/travel/feature/general/common/widgets/badgeList/v2/di/BadgeListComponent;", "Lhi/a;", "Lru/ozon/app/android/di/provider/component/DiComponent;", "LWZ/l;", "Lru/ozon/app/android/analytics/modules/tokenized/TokenizedAnalytics;", "getTokenizedAnalytics", "()LWZ/l;", "tokenizedAnalytics", "Lru/ozon/app/android/travel/feature/general/common/widgets/badgeList/v2/data/BadgeListMapper;", "getMapper", "()Lru/ozon/app/android/travel/feature/general/common/widgets/badgeList/v2/data/BadgeListMapper;", "mapper", "LPc/a;", "Lru/ozon/app/android/travel/feature/general/common/widgets/badgeList/v2/presentation/BadgeListWidgetViewModel;", "getViewModelProvider", "()LPc/a;", "viewModelProvider", "Companion", "common_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public interface BadgeListComponent extends InterfaceC6958a {

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = Companion.$$INSTANCE;

    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\n\u0010\u0006\u001a\u00060\u0004j\u0002`\u0005¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lru/ozon/app/android/travel/feature/general/common/widgets/badgeList/v2/di/BadgeListComponent$Companion;", "", "<init>", "()V", "Lk20/g;", "Lru/ozon/app/android/composer/widgets/v2/di/ComposerWidgetComponentStorage;", "storage", "Lk20/e;", "Lru/ozon/app/android/travel/feature/general/common/widgets/badgeList/v2/di/BadgeListComponent;", "create", "(Lk20/g;)Lk20/e;", "common_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();

        private Companion() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final BadgeListComponent create$lambda$0(C7475g c7475g) {
            return new BadgeListComponent$Companion$create$1$1(c7475g);
        }

        @NotNull
        public final C7473e<BadgeListComponent> create(@NotNull C7475g storage) {
            Intrinsics.checkNotNullParameter(storage, "storage");
            return new C7473e<>(N.b(BadgeListComponent.class), new DR.a(storage, 13));
        }
    }

    @NotNull
    BadgeListMapper getMapper();

    @NotNull
    l getTokenizedAnalytics();

    @NotNull
    Pc.a<BadgeListWidgetViewModel> getViewModelProvider();
}
