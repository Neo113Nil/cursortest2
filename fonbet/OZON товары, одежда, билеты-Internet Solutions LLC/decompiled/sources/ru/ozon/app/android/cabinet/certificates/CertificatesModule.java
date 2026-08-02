package ru.ozon.app.android.cabinet.certificates;

import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.C7705l;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.cabinet.tabSelector.TabSelectorConfig;
import ru.ozon.app.android.cabinet.tabSelector.presentation.TabSelectorViewMapper;
import ru.ozon.app.android.composer.di.Widget;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b'\u0018\u0000 \u00022\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lru/ozon/app/android/cabinet/certificates/CertificatesModule;", "", "Companion", "cabinet_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public abstract class CertificatesModule {

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J.\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eH\u0007¨\u0006\u000f"}, d2 = {"Lru/ozon/app/android/cabinet/certificates/CertificatesModule$Companion;", "", "<init>", "()V", "provideWidget", "", "Lru/ozon/app/android/composer/di/Widget;", "certificatesConfig", "Lru/ozon/app/android/cabinet/certificates/CertificatesConfig;", "certificatesViewMapper", "Lru/ozon/app/android/cabinet/certificates/CertificatesViewMapper;", "tabSelectorConfig", "Lru/ozon/app/android/cabinet/tabSelector/TabSelectorConfig;", "tabSelectorViewMapper", "Lru/ozon/app/android/cabinet/tabSelector/presentation/TabSelectorViewMapper;", "cabinet_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final Set<Widget> provideWidget(@NotNull CertificatesConfig certificatesConfig, @NotNull CertificatesViewMapper certificatesViewMapper, @NotNull TabSelectorConfig tabSelectorConfig, @NotNull TabSelectorViewMapper tabSelectorViewMapper) {
            Intrinsics.checkNotNullParameter(certificatesConfig, "certificatesConfig");
            Intrinsics.checkNotNullParameter(certificatesViewMapper, "certificatesViewMapper");
            Intrinsics.checkNotNullParameter(tabSelectorConfig, "tabSelectorConfig");
            Intrinsics.checkNotNullParameter(tabSelectorViewMapper, "tabSelectorViewMapper");
            Widget[] elements = {new Widget("csma", "certificates", certificatesConfig, new CertificatesViewMapper[]{certificatesViewMapper}), new Widget("csma", "tabSelector", tabSelectorConfig, new TabSelectorViewMapper[]{tabSelectorViewMapper})};
            Intrinsics.checkNotNullParameter(elements, "elements");
            return C7705l.j0(elements);
        }

        private Companion() {
        }
    }
}
