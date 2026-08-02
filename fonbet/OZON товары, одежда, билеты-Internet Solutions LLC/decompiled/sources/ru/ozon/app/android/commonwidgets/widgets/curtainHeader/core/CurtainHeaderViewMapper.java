package ru.ozon.app.android.commonwidgets.widgets.curtainHeader.core;

import Ih.a;
import c20.r;
import java.util.List;
import java.util.Map;
import k20.C7471c;
import k20.C7475g;
import kotlin.Metadata;
import kotlin.collections.C7714v;
import kotlin.jvm.internal.Intrinsics;
import l10.i;
import l20.d;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;
import ru.ozon.app.android.commonwidgets.widgets.curtainHeader.data.CurtainHeaderDTO;
import ru.ozon.app.android.commonwidgets.widgets.curtainHeader.presentation.CurtainHeaderVO;
import ru.ozon.app.android.commonwidgets.widgets.curtainHeader.presentation.CurtainHeaderViewHolder;
import ru.ozon.app.android.composer.TrackingInfoMapperKt;
import ru.ozon.app.android.composer.widgets.v2.overlay.OverlayWidgetScreenViewItemMapper2;

@Metadata(d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001B\t\b\u0007¢\u0006\u0004\b\u0005\u0010\u0006J\u001b\u0010\t\u001a\u00020\u0004*\u00020\u00032\u0006\u0010\b\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\t\u0010\nJ)\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00040\u000f2\u0006\u0010\u000b\u001a\u00020\u00032\n\u0010\u000e\u001a\u00060\fj\u0002`\rH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u0019\u0010\u0014\u001a\u00020\u00132\b\u0010\u000b\u001a\u0004\u0018\u00010\u0012H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u001b\u0010\u001a\u001a\u00020\u00192\n\u0010\u0018\u001a\u00060\u0016j\u0002`\u0017H\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ\u0017\u0010\u001f\u001a\u00020\u001e2\u0006\u0010\u001d\u001a\u00020\u001cH\u0016¢\u0006\u0004\b\u001f\u0010 R\u001a\u0010\"\u001a\u00020!8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\"\u0010#\u001a\u0004\b$\u0010%¨\u0006&"}, d2 = {"Lru/ozon/app/android/commonwidgets/widgets/curtainHeader/core/CurtainHeaderViewMapper;", "Lru/ozon/app/android/composer/widgets/v2/overlay/OverlayWidgetScreenViewItemMapper2;", "", "Lru/ozon/app/android/commonwidgets/widgets/curtainHeader/data/CurtainHeaderDTO;", "Lru/ozon/app/android/commonwidgets/widgets/curtainHeader/presentation/CurtainHeaderVO;", "<init>", "()V", "", "stateId", "toVO", "(Lru/ozon/app/android/commonwidgets/widgets/curtainHeader/data/CurtainHeaderDTO;Ljava/lang/String;)Lru/ozon/app/android/commonwidgets/widgets/curtainHeader/presentation/CurtainHeaderVO;", "state", "Ll20/d;", "Lru/ozon/app/android/composer/view/WidgetInfo;", "info", "", "map", "(Lru/ozon/app/android/commonwidgets/widgets/curtainHeader/data/CurtainHeaderDTO;Ll20/d;)Ljava/util/List;", "", "", "canMap", "(Ljava/lang/Object;)Z", "Lk20/g;", "Lru/ozon/app/android/composer/widgets/v2/di/ComposerWidgetComponentStorage;", "storage", "Lk20/c;", "widgetComponent", "(Lk20/g;)Lk20/c;", "Ll10/i;", "container", "Lru/ozon/app/android/commonwidgets/widgets/curtainHeader/presentation/CurtainHeaderViewHolder;", "createHolder", "(Ll10/i;)Lru/ozon/app/android/commonwidgets/widgets/curtainHeader/presentation/CurtainHeaderViewHolder;", "Lc20/r$a;", "viewType", "Lc20/r$a;", "getViewType", "()Lc20/r$a;", "widgets_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class CurtainHeaderViewMapper extends OverlayWidgetScreenViewItemMapper2 {

    @NotNull
    private final r.a viewType = r.a.SINGLE;

    private final CurtainHeaderVO toVO(CurtainHeaderDTO curtainHeaderDTO, String str) {
        long a11 = a.a("CurtainHeader", str);
        String text = curtainHeaderDTO.getText();
        String textColor = curtainHeaderDTO.getTextColor();
        Map<String, TokenizedTrackingInfo> trackingInfo = curtainHeaderDTO.getTrackingInfo();
        return new CurtainHeaderVO(a11, text, textColor, trackingInfo != null ? TrackingInfoMapperKt.toTokenizedEvent$default(trackingInfo, Long.valueOf(str.hashCode()), null, 2, null) : null);
    }

    @Override // c20.r, m20.InterfaceC8046a
    public boolean canMap(Object state) {
        return state instanceof CurtainHeaderDTO;
    }

    @Override // c20.r
    @NotNull
    public r.a getViewType() {
        return this.viewType;
    }

    @Override // c20.r
    @NotNull
    public CurtainHeaderViewHolder createHolder(@NotNull i container) {
        Intrinsics.checkNotNullParameter(container, "container");
        return new CurtainHeaderViewHolder(container);
    }

    @Override // m20.InterfaceC8046a
    @NotNull
    public List<CurtainHeaderVO> map(@NotNull CurtainHeaderDTO state, @NotNull d info) {
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(info, "info");
        return C7714v.a0(toVO(state, info.d()));
    }

    @Override // ru.ozon.app.android.composer.widgets.v2.ViewMapper2
    @NotNull
    public C7471c widgetComponent(@NotNull C7475g storage) {
        Intrinsics.checkNotNullParameter(storage, "storage");
        return C7471c.f70357c;
    }
}
