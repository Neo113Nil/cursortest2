package ru.ozon.app.android.cabinet.sectionheader;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.composer.di.Widget;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b'\u0018\u0000 \u00022\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lru/ozon/app/android/cabinet/sectionheader/SectionHeaderModule;", "", "Companion", "cabinet_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public abstract class SectionHeaderModule {

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0018\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH\u0007¨\u0006\n"}, d2 = {"Lru/ozon/app/android/cabinet/sectionheader/SectionHeaderModule$Companion;", "", "<init>", "()V", "provideWidget", "Lru/ozon/app/android/composer/di/Widget;", "sectionHeaderConfig", "Lru/ozon/app/android/cabinet/sectionheader/SectionHeaderConfig;", "sectionHeaderViewMapper", "Lru/ozon/app/android/cabinet/sectionheader/SectionHeaderViewMapper;", "cabinet_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final Widget provideWidget(@NotNull SectionHeaderConfig sectionHeaderConfig, @NotNull SectionHeaderViewMapper sectionHeaderViewMapper) {
            Intrinsics.checkNotNullParameter(sectionHeaderConfig, "sectionHeaderConfig");
            Intrinsics.checkNotNullParameter(sectionHeaderViewMapper, "sectionHeaderViewMapper");
            return new Widget("csma", "sectionHeader", sectionHeaderConfig, new SectionHeaderViewMapper[]{sectionHeaderViewMapper});
        }

        private Companion() {
        }
    }
}
