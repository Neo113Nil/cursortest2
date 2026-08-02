package ru.ozon.app.android.storefront.widgets.cms.richtext;

import GZ.g;
import Sc.InterfaceC4008j;
import Sc.k;
import android.content.Context;
import k20.C7475g;
import kotlin.Metadata;
import ru.ozon.app.android.data.markdown.MarkDownApi;
import ru.ozon.app.android.data.markdown.MarkDownParser;
import ru.ozon.app.android.data.markdown.TextParserProvider;
import ru.ozon.app.android.di.provider.component.ContextComponentDependencies;
import ru.ozon.app.android.navigation.di.NavigationComponentApi;

@Metadata(d1 = {"\u0000I\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\nR\u001b\u0010\u0010\u001a\u00020\u000b8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000fR\u001b\u0010\u0015\u001a\u00020\u00118VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\u0012\u0010\r\u001a\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0019\u001a\u00020\u00168BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u0018R\u0014\u0010\u001d\u001a\u00020\u001a8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u001b\u0010\u001cR\u0014\u0010!\u001a\u00020\u001e8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001f\u0010 ¨\u0006\""}, d2 = {"ru/ozon/app/android/storefront/widgets/cms/richtext/RichTextWidgetComponent$Companion$create$1$1", "Lru/ozon/app/android/storefront/widgets/cms/richtext/RichTextWidgetComponent;", "Lru/ozon/app/android/navigation/di/NavigationComponentApi;", "navigationComponentApi", "Lru/ozon/app/android/navigation/di/NavigationComponentApi;", "Lru/ozon/app/android/di/provider/component/ContextComponentDependencies;", "contextComponentDependencies", "Lru/ozon/app/android/di/provider/component/ContextComponentDependencies;", "Lru/ozon/app/android/data/markdown/MarkDownApi;", "markDownApi", "Lru/ozon/app/android/data/markdown/MarkDownApi;", "Lru/ozon/app/android/data/markdown/TextParserProvider;", "textParserProvider$delegate", "LSc/j;", "getTextParserProvider", "()Lru/ozon/app/android/data/markdown/TextParserProvider;", "textParserProvider", "Lru/ozon/app/android/storefront/widgets/cms/richtext/RichTextWidgetMapper;", "mapper$delegate", "getMapper", "()Lru/ozon/app/android/storefront/widgets/cms/richtext/RichTextWidgetMapper;", "mapper", "Landroid/content/Context;", "getContext", "()Landroid/content/Context;", "context", "Lru/ozon/app/android/data/markdown/MarkDownParser;", "getMarkDownParser", "()Lru/ozon/app/android/data/markdown/MarkDownParser;", "markDownParser", "LGZ/g;", "getRouter", "()LGZ/g;", "router", "cms_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class RichTextWidgetComponent$Companion$create$1$1 implements RichTextWidgetComponent {
    private final ContextComponentDependencies contextComponentDependencies;
    private final MarkDownApi markDownApi;
    private final NavigationComponentApi navigationComponentApi;

    /* renamed from: textParserProvider$delegate, reason: from kotlin metadata */
    private final InterfaceC4008j textParserProvider = k.b(new RichTextWidgetComponent$Companion$create$1$1$textParserProvider$2(this));

    /* renamed from: mapper$delegate, reason: from kotlin metadata */
    private final InterfaceC4008j mapper = k.b(new RichTextWidgetComponent$Companion$create$1$1$mapper$2(this));

    RichTextWidgetComponent$Companion$create$1$1(C7475g c7475g) {
        this.navigationComponentApi = (NavigationComponentApi) c7475g.getComponent(NavigationComponentApi.class);
        this.contextComponentDependencies = (ContextComponentDependencies) c7475g.getComponent(ContextComponentDependencies.class);
        this.markDownApi = (MarkDownApi) c7475g.getComponent(MarkDownApi.class);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Context getContext() {
        return this.contextComponentDependencies.getContext();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final MarkDownParser getMarkDownParser() {
        return this.markDownApi.getMarkDownParser();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final TextParserProvider getTextParserProvider() {
        return (TextParserProvider) this.textParserProvider.getValue();
    }

    @Override // ru.ozon.app.android.storefront.widgets.cms.richtext.RichTextWidgetComponent
    public RichTextWidgetMapper getMapper() {
        return (RichTextWidgetMapper) this.mapper.getValue();
    }

    @Override // ru.ozon.app.android.storefront.widgets.cms.richtext.RichTextWidgetComponent
    public g getRouter() {
        return this.navigationComponentApi.getOzonRouter();
    }
}
