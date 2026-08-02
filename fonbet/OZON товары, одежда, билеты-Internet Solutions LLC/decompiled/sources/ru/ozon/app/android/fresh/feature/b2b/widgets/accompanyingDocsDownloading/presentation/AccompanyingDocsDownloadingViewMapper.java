package ru.ozon.app.android.fresh.feature.b2b.widgets.accompanyingDocsDownloading.presentation;

import Du.C2881a;
import android.view.View;
import java.util.List;
import k20.C7473e;
import k20.C7475g;
import kotlin.Metadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.N;
import l20.d;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.composer.ComposerReferences;
import ru.ozon.app.android.composer.widgets.v2.WidgetViewMapper2;
import ru.ozon.app.android.fresh.feature.b2b.R$layout;
import ru.ozon.app.android.fresh.feature.b2b.di.AccompanyingDocsDownloadingComponent;
import ru.ozon.app.android.fresh.feature.b2b.di.DaggerAccompanyingDocsDownloadingComponent;
import ru.ozon.app.android.fresh.feature.b2b.widgets.accompanyingDocsDownloading.data.AccompanyingDocsDownloadingDTO;
import ru.ozon.app.android.fresh.feature.b2b.widgets.accompanyingDocsDownloading.presentation.AccompanyingDocsDownloadingVO;
import ru.ozon.app.android.pdfviewer.di.PdfFileComponentApi;
import ru.ozon.composer.ui.widget.k;
import ru.ozon.uni.atoms.v3.mappers.TextMapperKt;

@Metadata(d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001B\t\b\u0007¢\u0006\u0004\b\u0005\u0010\u0006J\u0013\u0010\t\u001a\u00020\b*\u00020\u0007H\u0002¢\u0006\u0004\b\t\u0010\nJ%\u0010\u0010\u001a\f\u0012\u0004\u0012\u00020\u00020\u000ej\u0002`\u000f2\n\u0010\r\u001a\u00060\u000bj\u0002`\fH\u0016¢\u0006\u0004\b\u0010\u0010\u0011R2\u0010\u0015\u001a\u001a\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0013\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00140\u00128\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u001a\u0010\u001a\u001a\u00020\u00198\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR2\u0010!\u001a\u001a\u0012\u0004\u0012\u00020\u001e\u0012\u0004\u0012\u00020\u001f\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040 0\u00128\u0016X\u0096\u0004¢\u0006\f\n\u0004\b!\u0010\u0016\u001a\u0004\b\"\u0010\u0018¨\u0006#"}, d2 = {"Lru/ozon/app/android/fresh/feature/b2b/widgets/accompanyingDocsDownloading/presentation/AccompanyingDocsDownloadingViewMapper;", "Lru/ozon/app/android/composer/widgets/v2/WidgetViewMapper2;", "Lru/ozon/app/android/fresh/feature/b2b/di/AccompanyingDocsDownloadingComponent;", "Lru/ozon/app/android/fresh/feature/b2b/widgets/accompanyingDocsDownloading/data/AccompanyingDocsDownloadingDTO;", "Lru/ozon/app/android/fresh/feature/b2b/widgets/accompanyingDocsDownloading/presentation/AccompanyingDocsDownloadingVO;", "<init>", "()V", "Lru/ozon/app/android/fresh/feature/b2b/widgets/accompanyingDocsDownloading/data/AccompanyingDocsDownloadingDTO$NotificationDTO;", "Lru/ozon/app/android/fresh/feature/b2b/widgets/accompanyingDocsDownloading/presentation/AccompanyingDocsDownloadingVO$NotificationVO;", "toVo", "(Lru/ozon/app/android/fresh/feature/b2b/widgets/accompanyingDocsDownloading/data/AccompanyingDocsDownloadingDTO$NotificationDTO;)Lru/ozon/app/android/fresh/feature/b2b/widgets/accompanyingDocsDownloading/presentation/AccompanyingDocsDownloadingVO$NotificationVO;", "Lk20/g;", "Lru/ozon/app/android/composer/widgets/v2/di/ComposerWidgetComponentStorage;", "storage", "Lk20/e;", "Lru/ozon/app/android/composer/widgets/v2/di/WidgetComponent;", "widgetComponent", "(Lk20/g;)Lk20/e;", "Lkotlin/Function2;", "Ll20/d;", "", "mapper", "Lkotlin/jvm/functions/Function2;", "getMapper", "()Lkotlin/jvm/functions/Function2;", "", "layout", "I", "getLayout", "()Ljava/lang/Integer;", "Landroid/view/View;", "Lru/ozon/app/android/composer/ComposerReferences;", "Lru/ozon/composer/ui/widget/k;", "holderProducer", "getHolderProducer", "b2b_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class AccompanyingDocsDownloadingViewMapper extends WidgetViewMapper2<AccompanyingDocsDownloadingComponent, AccompanyingDocsDownloadingDTO, AccompanyingDocsDownloadingVO> {

    @NotNull
    private final Function2<AccompanyingDocsDownloadingDTO, d, List<AccompanyingDocsDownloadingVO>> mapper = new AccompanyingDocsDownloadingViewMapper$mapper$1(this);
    private final int layout = R$layout.widget_accompanying_docs_downloading;

    @NotNull
    private final Function2<View, ComposerReferences, k<AccompanyingDocsDownloadingVO>> holderProducer = new AccompanyingDocsDownloadingViewMapper$holderProducer$1(this);

    /* JADX INFO: Access modifiers changed from: private */
    public final AccompanyingDocsDownloadingVO.NotificationVO toVo(AccompanyingDocsDownloadingDTO.NotificationDTO notificationDTO) {
        return new AccompanyingDocsDownloadingVO.NotificationVO(TextMapperKt.getDsTextAtom(notificationDTO.getBody()), notificationDTO.getIcon(), notificationDTO.getButton());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final AccompanyingDocsDownloadingComponent widgetComponent$lambda$0(C7475g c7475g) {
        return DaggerAccompanyingDocsDownloadingComponent.factory().create((PdfFileComponentApi) c7475g.getComponent(PdfFileComponentApi.class));
    }

    @Override // ru.ozon.app.android.composer.widgets.base.WidgetViewMapper
    @NotNull
    /* renamed from: getHolderProducer */
    public Function2<View, ComposerReferences, k<AccompanyingDocsDownloadingVO>> mo614getHolderProducer() {
        return this.holderProducer;
    }

    @Override // ru.ozon.composer.ui.widget.g
    @NotNull
    public Integer getLayout() {
        return Integer.valueOf(this.layout);
    }

    @Override // ru.ozon.app.android.composer.widgets.base.WidgetViewMapper
    @NotNull
    public Function2<AccompanyingDocsDownloadingDTO, d, List<AccompanyingDocsDownloadingVO>> getMapper() {
        return this.mapper;
    }

    @Override // ru.ozon.app.android.composer.widgets.v2.ViewMapper2
    @NotNull
    public C7473e<AccompanyingDocsDownloadingComponent> widgetComponent(@NotNull C7475g storage) {
        Intrinsics.checkNotNullParameter(storage, "storage");
        return new C7473e<>(N.b(AccompanyingDocsDownloadingComponent.class), new C2881a(storage, 0));
    }
}
