package ru.ozon.app.android.pdp.widgets.aspectsCompactV2.di;

import JI.a;
import hi.InterfaceC6958a;
import k20.C7473e;
import k20.C7475g;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.N;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.di.provider.component.ContextComponentDependencies;
import ru.ozon.app.android.pdp.widgets.aspectsCompactV2.core.color.AspectsCompactV2ColorMapper;
import ru.ozon.app.android.pdp.widgets.aspectsCompactV2.core.footer.AspectV2FooterMapper;
import ru.ozon.app.android.pdp.widgets.aspectsCompactV2.core.header.AspectV2HeaderMapper;
import ru.ozon.app.android.pdp.widgets.aspectsCompactV2.core.image.AspectsCompactV2ImageMapper;
import ru.ozon.app.android.pdp.widgets.aspectsCompactV2.core.media.AspectsCompactV2MediaMapper;
import ru.ozon.app.android.pdp.widgets.aspectsCompactV2.core.pack.AspectsCompactV2PackMapper;
import ru.ozon.app.android.pdp.widgets.aspectsCompactV2.core.text.AspectsCompactV2TextMapper;
import ru.ozon.app.android.pdp.widgets.aspectsCompactV2.core.textIcon.AspectsCompactV2TextIconMapper;
import ru.ozon.app.android.pdp.widgets.aspectsCompactV2.core.tiles.AspectsCompactV2TilesMapper;
import ru.ozon.app.android.pdp.widgets.aspectsV2.core.imagetitle.AspectsV2ImageTitleMapper;

@Metadata(d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\ba\u0018\u0000 +2\u00060\u0001j\u0002`\u0002:\u0002+,R\u0014\u0010\u0006\u001a\u00020\u00038&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005R\u0014\u0010\n\u001a\u00020\u00078&X¦\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR\u0014\u0010\u000e\u001a\u00020\u000b8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\f\u0010\rR\u0014\u0010\u0012\u001a\u00020\u000f8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0016\u001a\u00020\u00138&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015R\u0014\u0010\u001a\u001a\u00020\u00178&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0018\u0010\u0019R\u0014\u0010\u001e\u001a\u00020\u001b8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u001c\u0010\u001dR\u0014\u0010\"\u001a\u00020\u001f8&X¦\u0004¢\u0006\u0006\u001a\u0004\b \u0010!R\u0014\u0010&\u001a\u00020#8&X¦\u0004¢\u0006\u0006\u001a\u0004\b$\u0010%R\u0014\u0010*\u001a\u00020'8&X¦\u0004¢\u0006\u0006\u001a\u0004\b(\u0010)¨\u0006-"}, d2 = {"Lru/ozon/app/android/pdp/widgets/aspectsCompactV2/di/AspectsCompactV2WidgetComponent;", "Lhi/a;", "Lru/ozon/app/android/di/provider/component/DiComponent;", "Lru/ozon/app/android/pdp/widgets/aspectsCompactV2/core/pack/AspectsCompactV2PackMapper;", "getPackManager", "()Lru/ozon/app/android/pdp/widgets/aspectsCompactV2/core/pack/AspectsCompactV2PackMapper;", "packManager", "Lru/ozon/app/android/pdp/widgets/aspectsCompactV2/core/media/AspectsCompactV2MediaMapper;", "getMediaMapper", "()Lru/ozon/app/android/pdp/widgets/aspectsCompactV2/core/media/AspectsCompactV2MediaMapper;", "mediaMapper", "Lru/ozon/app/android/pdp/widgets/aspectsCompactV2/core/tiles/AspectsCompactV2TilesMapper;", "getTilesMapper", "()Lru/ozon/app/android/pdp/widgets/aspectsCompactV2/core/tiles/AspectsCompactV2TilesMapper;", "tilesMapper", "Lru/ozon/app/android/pdp/widgets/aspectsCompactV2/core/textIcon/AspectsCompactV2TextIconMapper;", "getTextIconMapper", "()Lru/ozon/app/android/pdp/widgets/aspectsCompactV2/core/textIcon/AspectsCompactV2TextIconMapper;", "textIconMapper", "Lru/ozon/app/android/pdp/widgets/aspectsCompactV2/core/text/AspectsCompactV2TextMapper;", "getTextMapper", "()Lru/ozon/app/android/pdp/widgets/aspectsCompactV2/core/text/AspectsCompactV2TextMapper;", "textMapper", "Lru/ozon/app/android/pdp/widgets/aspectsCompactV2/core/image/AspectsCompactV2ImageMapper;", "getImageMapper", "()Lru/ozon/app/android/pdp/widgets/aspectsCompactV2/core/image/AspectsCompactV2ImageMapper;", "imageMapper", "Lru/ozon/app/android/pdp/widgets/aspectsCompactV2/core/color/AspectsCompactV2ColorMapper;", "getColorMapper", "()Lru/ozon/app/android/pdp/widgets/aspectsCompactV2/core/color/AspectsCompactV2ColorMapper;", "colorMapper", "Lru/ozon/app/android/pdp/widgets/aspectsV2/core/imagetitle/AspectsV2ImageTitleMapper;", "getImageTitleMapper", "()Lru/ozon/app/android/pdp/widgets/aspectsV2/core/imagetitle/AspectsV2ImageTitleMapper;", "imageTitleMapper", "Lru/ozon/app/android/pdp/widgets/aspectsCompactV2/core/header/AspectV2HeaderMapper;", "getHeaderMapper", "()Lru/ozon/app/android/pdp/widgets/aspectsCompactV2/core/header/AspectV2HeaderMapper;", "headerMapper", "Lru/ozon/app/android/pdp/widgets/aspectsCompactV2/core/footer/AspectV2FooterMapper;", "getFooterMapper", "()Lru/ozon/app/android/pdp/widgets/aspectsCompactV2/core/footer/AspectV2FooterMapper;", "footerMapper", "Companion", "Factory", "pdp_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public interface AspectsCompactV2WidgetComponent extends InterfaceC6958a {

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = Companion.$$INSTANCE;

    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\n\u0010\u0006\u001a\u00060\u0004j\u0002`\u0005¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lru/ozon/app/android/pdp/widgets/aspectsCompactV2/di/AspectsCompactV2WidgetComponent$Companion;", "", "<init>", "()V", "Lk20/g;", "Lru/ozon/app/android/composer/widgets/v2/di/ComposerWidgetComponentStorage;", "storage", "Lk20/e;", "Lru/ozon/app/android/pdp/widgets/aspectsCompactV2/di/AspectsCompactV2WidgetComponent;", "create", "(Lk20/g;)Lk20/e;", "pdp_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();

        private Companion() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final AspectsCompactV2WidgetComponent create$lambda$0(C7475g c7475g) {
            return DaggerAspectsCompactV2WidgetComponent.factory().create((ContextComponentDependencies) c7475g.getComponent(ContextComponentDependencies.class));
        }

        @NotNull
        public final C7473e<AspectsCompactV2WidgetComponent> create(@NotNull C7475g storage) {
            Intrinsics.checkNotNullParameter(storage, "storage");
            return new C7473e<>(N.b(AspectsCompactV2WidgetComponent.class), new a(storage, 1));
        }
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bg\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&¨\u0006\u0006"}, d2 = {"Lru/ozon/app/android/pdp/widgets/aspectsCompactV2/di/AspectsCompactV2WidgetComponent$Factory;", "", "create", "Lru/ozon/app/android/pdp/widgets/aspectsCompactV2/di/AspectsCompactV2WidgetComponent;", "contextComponentDependencies", "Lru/ozon/app/android/di/provider/component/ContextComponentDependencies;", "pdp_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    /* loaded from: classes13.dex */
    public interface Factory {
        @NotNull
        AspectsCompactV2WidgetComponent create(@NotNull ContextComponentDependencies contextComponentDependencies);
    }

    @NotNull
    AspectsCompactV2ColorMapper getColorMapper();

    @NotNull
    AspectV2FooterMapper getFooterMapper();

    @NotNull
    AspectV2HeaderMapper getHeaderMapper();

    @NotNull
    AspectsCompactV2ImageMapper getImageMapper();

    @NotNull
    AspectsV2ImageTitleMapper getImageTitleMapper();

    @NotNull
    AspectsCompactV2MediaMapper getMediaMapper();

    @NotNull
    AspectsCompactV2PackMapper getPackManager();

    @NotNull
    AspectsCompactV2TextIconMapper getTextIconMapper();

    @NotNull
    AspectsCompactV2TextMapper getTextMapper();

    @NotNull
    AspectsCompactV2TilesMapper getTilesMapper();
}
