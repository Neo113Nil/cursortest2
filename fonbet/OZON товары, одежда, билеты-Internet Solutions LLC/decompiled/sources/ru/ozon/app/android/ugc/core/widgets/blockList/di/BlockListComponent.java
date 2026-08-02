package ru.ozon.app.android.ugc.core.widgets.blockList.di;

import DA.a;
import Sc.InterfaceC4008j;
import Sc.k;
import hi.InterfaceC6958a;
import k20.C7473e;
import k20.C7475g;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.N;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.composerCommonViewKit.parsing.JsonParser;
import ru.ozon.app.android.ugc.core.widgets.blockList.core.BlockListMapper;
import ru.ozon.app.android.ugc.core.widgets.blockList.core.BlockListParser;

@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b`\u0018\u0000 \u000b2\u00060\u0001j\u0002`\u0002:\u0001\u000bR\u0014\u0010\u0006\u001a\u00020\u00038&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005R\u0014\u0010\n\u001a\u00020\u00078&X¦\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\t¨\u0006\f"}, d2 = {"Lru/ozon/app/android/ugc/core/widgets/blockList/di/BlockListComponent;", "Lhi/a;", "Lru/ozon/app/android/di/provider/component/DiComponent;", "Lru/ozon/app/android/ugc/core/widgets/blockList/core/BlockListParser;", "getParser", "()Lru/ozon/app/android/ugc/core/widgets/blockList/core/BlockListParser;", "parser", "Lru/ozon/app/android/ugc/core/widgets/blockList/core/BlockListMapper;", "getMapper", "()Lru/ozon/app/android/ugc/core/widgets/blockList/core/BlockListMapper;", "mapper", "Companion", "core_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public interface BlockListComponent extends InterfaceC6958a {

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = Companion.$$INSTANCE;

    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J+\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\n\u0010\u0006\u001a\u00060\u0004j\u0002`\u00052\n\u0010\t\u001a\u00060\u0007j\u0002`\b¢\u0006\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"Lru/ozon/app/android/ugc/core/widgets/blockList/di/BlockListComponent$Companion;", "", "<init>", "()V", "Lk20/g;", "Lru/ozon/app/android/composer/widgets/v2/di/ComposerWidgetComponentStorage;", "storage", "Lru/ozon/android/composerCommonViewKit/parsing/JsonParser;", "Lru/ozon/app/android/network/serialize/JsonDeserializer;", "jsonDeserializer", "Lk20/e;", "Lru/ozon/app/android/ugc/core/widgets/blockList/di/BlockListComponent;", "create", "(Lk20/g;Lru/ozon/android/composerCommonViewKit/parsing/JsonParser;)Lk20/e;", "core_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();

        private Companion() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final BlockListComponent create$lambda$0(final JsonParser jsonParser) {
            return new BlockListComponent(jsonParser) { // from class: ru.ozon.app.android.ugc.core.widgets.blockList.di.BlockListComponent$Companion$create$1$1

                /* renamed from: mapper$delegate, reason: from kotlin metadata */
                private final InterfaceC4008j mapper = k.b(BlockListComponent$Companion$create$1$1$mapper$2.INSTANCE);

                /* renamed from: parser$delegate, reason: from kotlin metadata */
                private final InterfaceC4008j parser;

                {
                    this.parser = k.b(new BlockListComponent$Companion$create$1$1$parser$2(jsonParser));
                }

                @Override // ru.ozon.app.android.ugc.core.widgets.blockList.di.BlockListComponent
                public BlockListMapper getMapper() {
                    return (BlockListMapper) this.mapper.getValue();
                }

                @Override // ru.ozon.app.android.ugc.core.widgets.blockList.di.BlockListComponent
                public BlockListParser getParser() {
                    return (BlockListParser) this.parser.getValue();
                }
            };
        }

        @NotNull
        public final C7473e<BlockListComponent> create(@NotNull C7475g storage, @NotNull JsonParser jsonDeserializer) {
            Intrinsics.checkNotNullParameter(storage, "storage");
            Intrinsics.checkNotNullParameter(jsonDeserializer, "jsonDeserializer");
            return new C7473e<>(N.b(BlockListComponent.class), new a(jsonDeserializer, 20));
        }
    }

    @NotNull
    BlockListMapper getMapper();

    @NotNull
    BlockListParser getParser();
}
