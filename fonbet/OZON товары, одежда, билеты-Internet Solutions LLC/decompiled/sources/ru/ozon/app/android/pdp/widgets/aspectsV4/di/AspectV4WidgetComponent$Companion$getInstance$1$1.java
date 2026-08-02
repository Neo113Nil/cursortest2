package ru.ozon.app.android.pdp.widgets.aspectsV4.di;

import Sc.InterfaceC4008j;
import Sc.k;
import WZ.l;
import k20.C7475g;
import kotlin.Metadata;
import ru.ozon.app.android.composer.di.composer.RetainComposerComponentApi;
import ru.ozon.app.android.pdp.widgets.aspectsV4.core.AspectV4ImageMapper;
import ru.ozon.app.android.pdp.widgets.aspectsV4.presentation.rv.AspectsV4ImageConst;
import ru.ozon.app.android.platform.di.AndroidPlatformComponentDependencies;
import ru.ozon.app.android.utils.AppType;

@Metadata(d1 = {"\u00005\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007R\u001b\u0010\r\u001a\u00020\b8VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\fR\u001b\u0010\u0012\u001a\u00020\u000e8VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\u000f\u0010\n\u001a\u0004\b\u0010\u0010\u0011R\u0018\u0010\u0017\u001a\u00060\u0013j\u0002`\u00148VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u0016¨\u0006\u0018"}, d2 = {"ru/ozon/app/android/pdp/widgets/aspectsV4/di/AspectV4WidgetComponent$Companion$getInstance$1$1", "Lru/ozon/app/android/pdp/widgets/aspectsV4/di/AspectV4WidgetComponent;", "Lru/ozon/app/android/composer/di/composer/RetainComposerComponentApi;", "retainComposerComponentApi", "Lru/ozon/app/android/composer/di/composer/RetainComposerComponentApi;", "Lru/ozon/app/android/utils/AppType;", "appType", "Lru/ozon/app/android/utils/AppType;", "Lru/ozon/app/android/pdp/widgets/aspectsV4/core/AspectV4ImageMapper;", "imageMapper$delegate", "LSc/j;", "getImageMapper", "()Lru/ozon/app/android/pdp/widgets/aspectsV4/core/AspectV4ImageMapper;", "imageMapper", "Lru/ozon/app/android/pdp/widgets/aspectsV4/presentation/rv/AspectsV4ImageConst;", "imageSizes$delegate", "getImageSizes", "()Lru/ozon/app/android/pdp/widgets/aspectsV4/presentation/rv/AspectsV4ImageConst;", "imageSizes", "LWZ/l;", "Lru/ozon/app/android/analytics/modules/tokenized/TokenizedAnalytics;", "getTokenizedAnalytics", "()LWZ/l;", "tokenizedAnalytics", "pdp_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class AspectV4WidgetComponent$Companion$getInstance$1$1 implements AspectV4WidgetComponent {
    private final AppType appType;

    /* renamed from: imageMapper$delegate, reason: from kotlin metadata */
    private final InterfaceC4008j imageMapper = k.b(new AspectV4WidgetComponent$Companion$getInstance$1$1$imageMapper$2(this));

    /* renamed from: imageSizes$delegate, reason: from kotlin metadata */
    private final InterfaceC4008j imageSizes = k.b(new AspectV4WidgetComponent$Companion$getInstance$1$1$imageSizes$2(this));
    private final RetainComposerComponentApi retainComposerComponentApi;

    AspectV4WidgetComponent$Companion$getInstance$1$1(C7475g c7475g) {
        this.retainComposerComponentApi = (RetainComposerComponentApi) c7475g.getComponent(RetainComposerComponentApi.class);
        this.appType = ((AndroidPlatformComponentDependencies) c7475g.getComponent(AndroidPlatformComponentDependencies.class)).getAppType();
    }

    @Override // ru.ozon.app.android.pdp.widgets.aspectsV4.di.AspectV4WidgetComponent
    public AspectV4ImageMapper getImageMapper() {
        return (AspectV4ImageMapper) this.imageMapper.getValue();
    }

    @Override // ru.ozon.app.android.pdp.widgets.aspectsV4.di.AspectV4WidgetComponent
    public AspectsV4ImageConst getImageSizes() {
        return (AspectsV4ImageConst) this.imageSizes.getValue();
    }

    @Override // ru.ozon.app.android.pdp.widgets.aspectsV4.di.AspectV4WidgetComponent
    public l getTokenizedAnalytics() {
        return this.retainComposerComponentApi.getTokenizedAnalytics();
    }
}
