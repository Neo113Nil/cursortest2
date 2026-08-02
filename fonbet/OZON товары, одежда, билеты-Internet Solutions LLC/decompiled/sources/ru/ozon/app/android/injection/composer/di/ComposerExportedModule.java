package ru.ozon.app.android.injection.composer.di;

import BZ.d;
import BZ.e;
import S0.A1;
import S0.InterfaceC3967k;
import S0.n1;
import java.util.Set;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.e0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.composer.di.Widget;
import ru.ozon.app.android.composer.universalscreen.view.ComposerComposeThemeWrapper;
import ru.ozon.app.android.search.catalog.components.meta.MetaWidgetConfig;
import ru.ozon.app.android.search.catalog.components.meta.MetaWidgetViewMapper;
import ru.ozon.app.android.ui.theme.BxThemeKt;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b'\u0018\u0000 \u00022\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lru/ozon/app/android/injection/composer/di/ComposerExportedModule;", "", "Companion", "main_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public abstract class ComposerExportedModule {

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J%\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\fH\u0007¢\u0006\u0004\b\u000f\u0010\u0010¨\u0006\u0013²\u0006\f\u0010\u0012\u001a\u00020\u00118\nX\u008a\u0084\u0002"}, d2 = {"Lru/ozon/app/android/injection/composer/di/ComposerExportedModule$Companion;", "", "<init>", "()V", "Lru/ozon/app/android/search/catalog/components/meta/MetaWidgetConfig;", "metaWidgetConfig", "Lru/ozon/app/android/search/catalog/components/meta/MetaWidgetViewMapper;", "metaWidgetViewMapper", "", "Lru/ozon/app/android/composer/di/Widget;", "provideWidget", "(Lru/ozon/app/android/search/catalog/components/meta/MetaWidgetConfig;Lru/ozon/app/android/search/catalog/components/meta/MetaWidgetViewMapper;)Ljava/util/Set;", "LBZ/e;", "miniAppConfigHolder", "Lru/ozon/app/android/composer/universalscreen/view/ComposerComposeThemeWrapper;", "provideComposerComposeThemeWrapper", "(LBZ/e;)Lru/ozon/app/android/composer/universalscreen/view/ComposerComposeThemeWrapper;", "LBZ/d;", "miniAppConfigState", "main_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final ComposerComposeThemeWrapper provideComposerComposeThemeWrapper(@NotNull final e miniAppConfigHolder) {
            Intrinsics.checkNotNullParameter(miniAppConfigHolder, "miniAppConfigHolder");
            return new ComposerComposeThemeWrapper() { // from class: ru.ozon.app.android.injection.composer.di.ComposerExportedModule$Companion$provideComposerComposeThemeWrapper$1
                private static final d Wrap$lambda$0(A1<d> a12) {
                    return a12.getValue();
                }

                @Override // ru.ozon.app.android.composer.universalscreen.view.ComposerComposeThemeWrapper
                public final void Wrap(Function2<? super InterfaceC3967k, ? super Integer, Unit> content, InterfaceC3967k interfaceC3967k, int i11) {
                    Intrinsics.checkNotNullParameter(content, "content");
                    interfaceC3967k.o(-766568266);
                    BxThemeKt.BxTheme(false, Wrap$lambda$0(n1.b(e.this.h(), interfaceC3967k)).c(), content, interfaceC3967k, (i11 << 6) & 896, 1);
                    interfaceC3967k.k();
                }
            };
        }

        @NotNull
        public final Set<Widget> provideWidget(@NotNull MetaWidgetConfig metaWidgetConfig, @NotNull MetaWidgetViewMapper metaWidgetViewMapper) {
            Intrinsics.checkNotNullParameter(metaWidgetConfig, "metaWidgetConfig");
            Intrinsics.checkNotNullParameter(metaWidgetViewMapper, "metaWidgetViewMapper");
            return e0.a(new Widget("catalog", "meta", metaWidgetConfig, new MetaWidgetViewMapper[]{metaWidgetViewMapper}));
        }

        private Companion() {
        }
    }
}
