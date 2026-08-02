package ru.ozon.app.android.cabinet.di;

import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.e0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.cabinet.scanItIntro.ScanItIntroConfig;
import ru.ozon.app.android.cabinet.scanItIntro.presentation.ScanItIntroViewMapper;
import ru.ozon.app.android.composer.di.Widget;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b'\u0018\u0000 \u00022\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lru/ozon/app/android/cabinet/di/ScanItModule;", "", "Companion", "cabinet_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public abstract class ScanItModule {

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001e\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0007¨\u0006\u000b"}, d2 = {"Lru/ozon/app/android/cabinet/di/ScanItModule$Companion;", "", "<init>", "()V", "provideWidget", "", "Lru/ozon/app/android/composer/di/Widget;", "scanItIntroConfig", "Lru/ozon/app/android/cabinet/scanItIntro/ScanItIntroConfig;", "scanItIntroViewMapper", "Lru/ozon/app/android/cabinet/scanItIntro/presentation/ScanItIntroViewMapper;", "cabinet_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final Set<Widget> provideWidget(@NotNull ScanItIntroConfig scanItIntroConfig, @NotNull ScanItIntroViewMapper scanItIntroViewMapper) {
            Intrinsics.checkNotNullParameter(scanItIntroConfig, "scanItIntroConfig");
            Intrinsics.checkNotNullParameter(scanItIntroViewMapper, "scanItIntroViewMapper");
            return e0.h(new Widget("csma", "scanItIntro", scanItIntroConfig, new ScanItIntroViewMapper[]{scanItIntroViewMapper}));
        }

        private Companion() {
        }
    }
}
