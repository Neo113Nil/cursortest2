package ru.ozon.app.android.pdp.widgets.aspectsV4.di;

import Sc.InterfaceC4008j;
import Sc.k;
import WZ.l;
import k20.C7475g;
import kotlin.Metadata;
import ru.ozon.app.android.composer.di.composer.RetainComposerComponentApi;
import ru.ozon.app.android.pdp.widgets.aspectsV4.info.infoSimpleText.core.AspectsV4SimpleTextInfoMapper;
import ru.ozon.app.android.pdp.widgets.aspectsV4.markdownReason.core.AspectsV4MarkdownReasonMapper;
import ru.ozon.app.android.pdp.widgets.aspectsV4.size.core.AspectsV4SizeMapper;
import ru.ozon.app.android.platform.di.AndroidPlatformComponentDependencies;
import ru.ozon.app.android.utils.AppType;

@Metadata(d1 = {"\u0000E\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u001b\u0010\n\u001a\u00020\u00058VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tR\u001b\u0010\u000f\u001a\u00020\u000b8VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\u0007\u001a\u0004\b\r\u0010\u000eR\u001b\u0010\u0014\u001a\u00020\u00108VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\u0011\u0010\u0007\u001a\u0004\b\u0012\u0010\u0013R\u001b\u0010\u0019\u001a\u00020\u00158VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\u0016\u0010\u0007\u001a\u0004\b\u0017\u0010\u0018R\u0014\u0010\u001d\u001a\u00020\u001a8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u001b\u0010\u001cR\u0018\u0010\"\u001a\u00060\u001ej\u0002`\u001f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b \u0010!¨\u0006#"}, d2 = {"ru/ozon/app/android/pdp/widgets/aspectsV4/di/AspectsV4WidgetComponent$Companion$getInstance$1$1", "Lru/ozon/app/android/pdp/widgets/aspectsV4/di/AspectsV4WidgetComponent;", "Lru/ozon/app/android/platform/di/AndroidPlatformComponentDependencies;", "androidPlatformComponentDependencies", "Lru/ozon/app/android/platform/di/AndroidPlatformComponentDependencies;", "Lru/ozon/app/android/utils/AppType;", "appType$delegate", "LSc/j;", "getAppType", "()Lru/ozon/app/android/utils/AppType;", "appType", "Lru/ozon/app/android/pdp/widgets/aspectsV4/markdownReason/core/AspectsV4MarkdownReasonMapper;", "markdownReasonMapper$delegate", "getMarkdownReasonMapper", "()Lru/ozon/app/android/pdp/widgets/aspectsV4/markdownReason/core/AspectsV4MarkdownReasonMapper;", "markdownReasonMapper", "Lru/ozon/app/android/pdp/widgets/aspectsV4/size/core/AspectsV4SizeMapper;", "sizeMapper$delegate", "getSizeMapper", "()Lru/ozon/app/android/pdp/widgets/aspectsV4/size/core/AspectsV4SizeMapper;", "sizeMapper", "Lru/ozon/app/android/pdp/widgets/aspectsV4/info/infoSimpleText/core/AspectsV4SimpleTextInfoMapper;", "infoSimpleTextMapper$delegate", "getInfoSimpleTextMapper", "()Lru/ozon/app/android/pdp/widgets/aspectsV4/info/infoSimpleText/core/AspectsV4SimpleTextInfoMapper;", "infoSimpleTextMapper", "Lru/ozon/app/android/composer/di/composer/RetainComposerComponentApi;", "getRetainComposerComponentApi", "()Lru/ozon/app/android/composer/di/composer/RetainComposerComponentApi;", "retainComposerComponentApi", "LWZ/l;", "Lru/ozon/app/android/analytics/modules/tokenized/TokenizedAnalytics;", "getTokenizedAnalytics", "()LWZ/l;", "tokenizedAnalytics", "pdp_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class AspectsV4WidgetComponent$Companion$getInstance$1$1 implements AspectsV4WidgetComponent {
    final /* synthetic */ C7475g $storage;
    private final AndroidPlatformComponentDependencies androidPlatformComponentDependencies;

    /* renamed from: appType$delegate, reason: from kotlin metadata */
    private final InterfaceC4008j appType = k.b(new AspectsV4WidgetComponent$Companion$getInstance$1$1$appType$2(this));

    /* renamed from: markdownReasonMapper$delegate, reason: from kotlin metadata */
    private final InterfaceC4008j markdownReasonMapper = k.b(AspectsV4WidgetComponent$Companion$getInstance$1$1$markdownReasonMapper$2.INSTANCE);

    /* renamed from: sizeMapper$delegate, reason: from kotlin metadata */
    private final InterfaceC4008j sizeMapper = k.b(new AspectsV4WidgetComponent$Companion$getInstance$1$1$sizeMapper$2(this));

    /* renamed from: infoSimpleTextMapper$delegate, reason: from kotlin metadata */
    private final InterfaceC4008j infoSimpleTextMapper = k.b(AspectsV4WidgetComponent$Companion$getInstance$1$1$infoSimpleTextMapper$2.INSTANCE);

    AspectsV4WidgetComponent$Companion$getInstance$1$1(C7475g c7475g) {
        this.$storage = c7475g;
        this.androidPlatformComponentDependencies = (AndroidPlatformComponentDependencies) c7475g.getComponent(AndroidPlatformComponentDependencies.class);
    }

    private final RetainComposerComponentApi getRetainComposerComponentApi() {
        return (RetainComposerComponentApi) this.$storage.getComponent(RetainComposerComponentApi.class);
    }

    @Override // ru.ozon.app.android.pdp.widgets.aspectsV4.di.AspectsV4WidgetComponent
    public AppType getAppType() {
        return (AppType) this.appType.getValue();
    }

    @Override // ru.ozon.app.android.pdp.widgets.aspectsV4.di.AspectsV4WidgetComponent
    public AspectsV4SimpleTextInfoMapper getInfoSimpleTextMapper() {
        return (AspectsV4SimpleTextInfoMapper) this.infoSimpleTextMapper.getValue();
    }

    @Override // ru.ozon.app.android.pdp.widgets.aspectsV4.di.AspectsV4WidgetComponent
    public AspectsV4MarkdownReasonMapper getMarkdownReasonMapper() {
        return (AspectsV4MarkdownReasonMapper) this.markdownReasonMapper.getValue();
    }

    @Override // ru.ozon.app.android.pdp.widgets.aspectsV4.di.AspectsV4WidgetComponent
    public AspectsV4SizeMapper getSizeMapper() {
        return (AspectsV4SizeMapper) this.sizeMapper.getValue();
    }

    @Override // ru.ozon.app.android.pdp.widgets.aspectsV4.di.AspectsV4WidgetComponent
    public l getTokenizedAnalytics() {
        return getRetainComposerComponentApi().getTokenizedAnalytics();
    }
}
