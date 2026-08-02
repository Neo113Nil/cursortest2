package ru.ozon.app.android.monetization.widgets.achievementsList.presentation;

import k1.C7460f;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import l20.c;
import org.jetbrains.annotations.NotNull;
import ru.ozon.composer.compose.widget.g;
import ru.ozon.composer.compose.widget.i;
import ru.ozon.composer.compose.widget.scrollable.e;
import ru.ozon.uni.android.uikit.extensions.ResourceExtKt;

@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0001\u0018\u0000 \r2\u00020\u0001:\u0001\rB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J/\u0010\u000b\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00042\u000e\u0010\b\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00070\u00062\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\u000b\u0010\f¨\u0006\u000e"}, d2 = {"Lru/ozon/app/android/monetization/widgets/achievementsList/presentation/AchievementsOffsetModifier;", "Lru/ozon/composer/compose/widget/scrollable/e;", "<init>", "()V", "Lk1/f;", "outRect", "Lru/ozon/composer/compose/widget/i;", "Ll20/c;", "state", "Lru/ozon/composer/compose/widget/g$a;", "metadata", "modify", "(Lk1/f;Lru/ozon/composer/compose/widget/i;Lru/ozon/composer/compose/widget/g$a;)Lk1/f;", "Companion", "monetization_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class AchievementsOffsetModifier implements e {

    @NotNull
    private static final Companion Companion = new Companion(null);
    private static final float DP_12 = ResourceExtKt.toPxF(12);
    private static final float DP_8 = ResourceExtKt.toPxF(8);
    private static final float DP_4 = ResourceExtKt.toPxF(4);

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lru/ozon/app/android/monetization/widgets/achievementsList/presentation/AchievementsOffsetModifier$Companion;", "", "<init>", "()V", "", "ITEMS_IN_ROW", "I", "monetization_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    private static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    @Override // ru.ozon.composer.compose.widget.scrollable.e
    @NotNull
    public C7460f modify(@NotNull C7460f outRect, @NotNull i<? extends c> state, @NotNull g.a metadata) {
        Intrinsics.checkNotNullParameter(outRect, "outRect");
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(metadata, "metadata");
        c b11 = state.b();
        AchievementVO achievementVO = b11 instanceof AchievementVO ? (AchievementVO) b11 : null;
        if (achievementVO == null) {
            return outRect;
        }
        int index = achievementVO.getIndex() % 3;
        if (index == 0) {
            return C7460f.g(outRect, DP_12, DP_4, 0.0f, 10);
        }
        if (index == 2) {
            return C7460f.g(outRect, DP_4, DP_12, 0.0f, 10);
        }
        float f7 = DP_8;
        return C7460f.g(outRect, f7, f7, 0.0f, 10);
    }
}
