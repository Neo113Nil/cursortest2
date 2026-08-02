package ru.ozon.app.android.pdpoldwidgets.widgets.caption.di;

import Sc.InterfaceC4008j;
import Sc.k;
import k20.C7475g;
import kotlin.Metadata;
import ru.ozon.app.android.di.provider.component.ContextComponentDependencies;
import ru.ozon.app.android.pdpoldwidgets.widgets.caption.core.CaptionMapper;

@Metadata(d1 = {"\u0000\u0019\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006*\u0001\u0000\b\n\u0018\u00002\u00020\u0001R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u001b\u0010\f\u001a\u00020\u00078VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000b¨\u0006\r"}, d2 = {"ru/ozon/app/android/pdpoldwidgets/widgets/caption/di/CaptionWidgetComponent$Companion$create$1$1", "Lru/ozon/app/android/pdpoldwidgets/widgets/caption/di/CaptionWidgetComponent;", "Lru/ozon/app/android/di/provider/component/ContextComponentDependencies;", "contextComponentDependencies", "Lru/ozon/app/android/di/provider/component/ContextComponentDependencies;", "getContextComponentDependencies", "()Lru/ozon/app/android/di/provider/component/ContextComponentDependencies;", "Lru/ozon/app/android/pdpoldwidgets/widgets/caption/core/CaptionMapper;", "mapper$delegate", "LSc/j;", "getMapper", "()Lru/ozon/app/android/pdpoldwidgets/widgets/caption/core/CaptionMapper;", "mapper", "pdp-old-widgets_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class CaptionWidgetComponent$Companion$create$1$1 implements CaptionWidgetComponent {
    private final ContextComponentDependencies contextComponentDependencies;

    /* renamed from: mapper$delegate, reason: from kotlin metadata */
    private final InterfaceC4008j mapper = k.b(new CaptionWidgetComponent$Companion$create$1$1$mapper$2(this));

    CaptionWidgetComponent$Companion$create$1$1(C7475g c7475g) {
        this.contextComponentDependencies = (ContextComponentDependencies) c7475g.getComponent(ContextComponentDependencies.class);
    }

    public final ContextComponentDependencies getContextComponentDependencies() {
        return this.contextComponentDependencies;
    }

    @Override // ru.ozon.app.android.pdpoldwidgets.widgets.caption.di.CaptionWidgetComponent
    public CaptionMapper getMapper() {
        return (CaptionMapper) this.mapper.getValue();
    }
}
