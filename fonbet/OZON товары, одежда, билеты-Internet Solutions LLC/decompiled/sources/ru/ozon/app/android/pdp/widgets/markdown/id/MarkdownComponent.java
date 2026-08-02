package ru.ozon.app.android.pdp.widgets.markdown.id;

import EV.a;
import GZ.g;
import Sc.InterfaceC4008j;
import Sc.k;
import hi.InterfaceC6958a;
import k20.C7473e;
import k20.C7475g;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.N;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.navigation.di.NavigationComponentApi;
import ru.ozon.app.android.pdp.widgets.markdown.core.MarkdownMapper;
import ru.ozon.app.android.pdp.widgets.markdown.presentation.characteristics.CharacteristicsAdapter;

@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\bf\u0018\u0000 \u000f2\u00060\u0001j\u0002`\u0002:\u0001\u000fR\u0014\u0010\u0006\u001a\u00020\u00038&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005R\u0014\u0010\n\u001a\u00020\u00078&X¦\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR\u0014\u0010\u000e\u001a\u00020\u000b8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\f\u0010\r¨\u0006\u0010"}, d2 = {"Lru/ozon/app/android/pdp/widgets/markdown/id/MarkdownComponent;", "Lhi/a;", "Lru/ozon/app/android/di/provider/component/DiComponent;", "LGZ/g;", "getRouter", "()LGZ/g;", "router", "Lru/ozon/app/android/pdp/widgets/markdown/core/MarkdownMapper;", "getDtoMapper", "()Lru/ozon/app/android/pdp/widgets/markdown/core/MarkdownMapper;", "dtoMapper", "Lru/ozon/app/android/pdp/widgets/markdown/presentation/characteristics/CharacteristicsAdapter;", "getCharacteristicsAdapter", "()Lru/ozon/app/android/pdp/widgets/markdown/presentation/characteristics/CharacteristicsAdapter;", "characteristicsAdapter", "Companion", "pdp_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public interface MarkdownComponent extends InterfaceC6958a {

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = Companion.$$INSTANCE;

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J)\u0010\n\u001a\u0012\u0012\u0004\u0012\u00020\b0\u0007j\b\u0012\u0004\u0012\u00020\b`\t2\n\u0010\u0006\u001a\u00060\u0004j\u0002`\u0005¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Lru/ozon/app/android/pdp/widgets/markdown/id/MarkdownComponent$Companion;", "", "<init>", "()V", "Lk20/g;", "Lru/ozon/app/android/composer/widgets/v2/di/ComposerWidgetComponentStorage;", "storage", "Lk20/e;", "Lru/ozon/app/android/pdp/widgets/markdown/id/MarkdownComponent;", "Lru/ozon/app/android/composer/widgets/v2/di/WidgetComponent;", "createComponent", "(Lk20/g;)Lk20/e;", "pdp_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();

        private Companion() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final MarkdownComponent createComponent$lambda$0(final C7475g c7475g) {
            return new MarkdownComponent() { // from class: ru.ozon.app.android.pdp.widgets.markdown.id.MarkdownComponent$Companion$createComponent$1$1

                /* renamed from: dtoMapper$delegate, reason: from kotlin metadata */
                private final InterfaceC4008j dtoMapper = k.b(MarkdownComponent$Companion$createComponent$1$1$dtoMapper$2.INSTANCE);

                /* renamed from: characteristicsAdapter$delegate, reason: from kotlin metadata */
                private final InterfaceC4008j characteristicsAdapter = k.b(MarkdownComponent$Companion$createComponent$1$1$characteristicsAdapter$2.INSTANCE);

                @Override // ru.ozon.app.android.pdp.widgets.markdown.id.MarkdownComponent
                public CharacteristicsAdapter getCharacteristicsAdapter() {
                    return (CharacteristicsAdapter) this.characteristicsAdapter.getValue();
                }

                @Override // ru.ozon.app.android.pdp.widgets.markdown.id.MarkdownComponent
                public MarkdownMapper getDtoMapper() {
                    return (MarkdownMapper) this.dtoMapper.getValue();
                }

                public final NavigationComponentApi getNavigationComponentApi() {
                    return (NavigationComponentApi) C7475g.this.getComponent(NavigationComponentApi.class);
                }

                @Override // ru.ozon.app.android.pdp.widgets.markdown.id.MarkdownComponent
                public g getRouter() {
                    return getNavigationComponentApi().getOzonRouter();
                }
            };
        }

        @NotNull
        public final C7473e<MarkdownComponent> createComponent(@NotNull C7475g storage) {
            Intrinsics.checkNotNullParameter(storage, "storage");
            return new C7473e<>(N.b(MarkdownComponent.class), new a(storage, 14));
        }
    }

    @NotNull
    CharacteristicsAdapter getCharacteristicsAdapter();

    @NotNull
    MarkdownMapper getDtoMapper();

    @NotNull
    g getRouter();
}
