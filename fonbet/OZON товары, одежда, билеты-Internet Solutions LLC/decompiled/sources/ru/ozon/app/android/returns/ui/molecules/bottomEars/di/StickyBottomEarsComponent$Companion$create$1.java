package ru.ozon.app.android.returns.ui.molecules.bottomEars.di;

import Sc.InterfaceC4008j;
import Sc.k;
import k20.C7475g;
import kotlin.Metadata;
import ru.ozon.app.android.di.provider.component.ContextComponentDependencies;
import ru.ozon.app.android.returns.ui.molecules.bottomEars.presentation.viewMapper.StickyBottomEarsMapper;

@Metadata(d1 = {"\u0000\u0019\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006*\u0001\u0000\b\n\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u001b\u0010\n\u001a\u00020\u00058VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t¨\u0006\u000b"}, d2 = {"ru/ozon/app/android/returns/ui/molecules/bottomEars/di/StickyBottomEarsComponent$Companion$create$1", "Lru/ozon/app/android/returns/ui/molecules/bottomEars/di/StickyBottomEarsComponent;", "Lru/ozon/app/android/di/provider/component/ContextComponentDependencies;", "contextComponent", "Lru/ozon/app/android/di/provider/component/ContextComponentDependencies;", "Lru/ozon/app/android/returns/ui/molecules/bottomEars/presentation/viewMapper/StickyBottomEarsMapper;", "mapper$delegate", "LSc/j;", "getMapper", "()Lru/ozon/app/android/returns/ui/molecules/bottomEars/presentation/viewMapper/StickyBottomEarsMapper;", "mapper", "returns_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class StickyBottomEarsComponent$Companion$create$1 implements StickyBottomEarsComponent {
    private final ContextComponentDependencies contextComponent;

    /* renamed from: mapper$delegate, reason: from kotlin metadata */
    private final InterfaceC4008j mapper = k.b(new StickyBottomEarsComponent$Companion$create$1$mapper$2(this));

    StickyBottomEarsComponent$Companion$create$1(C7475g c7475g) {
        this.contextComponent = (ContextComponentDependencies) c7475g.getComponent(ContextComponentDependencies.class);
    }

    @Override // ru.ozon.app.android.returns.ui.molecules.bottomEars.di.StickyBottomEarsComponent
    public StickyBottomEarsMapper getMapper() {
        return (StickyBottomEarsMapper) this.mapper.getValue();
    }
}
