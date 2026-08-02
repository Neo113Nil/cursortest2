package ru.ozon.app.android.favorites.accesscontrol.presentation.item;

import android.view.View;
import java.util.List;
import k20.C7473e;
import k20.C7475g;
import kotlin.Metadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import l20.d;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.composer.ComposerReferences;
import ru.ozon.app.android.composer.widgets.v2.WidgetViewMapper2;
import ru.ozon.app.android.favorites.accesscontrol.data.AccessControlDTO;
import ru.ozon.app.android.favorites.accesscontrol.di.AccessControlWidgetComponent;
import ru.ozon.app.android.favorites.feature.R$layout;
import ru.ozon.uni.atoms.utils.OzonSpannableStringKt;

@Metadata(d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001B\t\b\u0007¢\u0006\u0004\b\u0005\u0010\u0006J+\u0010\f\u001a\u0012\u0012\u0004\u0012\u00020\u00020\nj\b\u0012\u0004\u0012\u00020\u0002`\u000b2\n\u0010\t\u001a\u00060\u0007j\u0002`\bH\u0016¢\u0006\u0004\b\f\u0010\rJ\u0019\u0010\u0010\u001a\u00020\u0004*\u00020\u00032\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0010\u0010\u0011R6\u0010\u0016\u001a\u001e\u0012\u0004\u0012\u00020\u0003\u0012\b\u0012\u00060\u0013j\u0002`\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00150\u00128\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u001a\u0010\u001b\u001a\u00020\u001a8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR,\u0010\"\u001a\u0014\u0012\u0004\u0012\u00020\u001f\u0012\u0004\u0012\u00020 \u0012\u0004\u0012\u00020!0\u00128\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\"\u0010\u0017\u001a\u0004\b#\u0010\u0019¨\u0006$"}, d2 = {"Lru/ozon/app/android/favorites/accesscontrol/presentation/item/AccessControlViewMapper;", "Lru/ozon/app/android/composer/widgets/v2/WidgetViewMapper2;", "Lru/ozon/app/android/favorites/accesscontrol/di/AccessControlWidgetComponent;", "Lru/ozon/app/android/favorites/accesscontrol/data/AccessControlDTO;", "Lru/ozon/app/android/favorites/accesscontrol/presentation/item/AccessControlVO;", "<init>", "()V", "Lk20/g;", "Lru/ozon/app/android/composer/widgets/v2/di/ComposerWidgetComponentStorage;", "storage", "Lk20/e;", "Lru/ozon/app/android/composer/widgets/v2/di/WidgetComponent;", "widgetComponent", "(Lk20/g;)Lk20/e;", "", "stateId", "toVo", "(Lru/ozon/app/android/favorites/accesscontrol/data/AccessControlDTO;Ljava/lang/String;)Lru/ozon/app/android/favorites/accesscontrol/presentation/item/AccessControlVO;", "Lkotlin/Function2;", "Ll20/d;", "Lru/ozon/app/android/composer/view/WidgetInfo;", "", "mapper", "Lkotlin/jvm/functions/Function2;", "getMapper", "()Lkotlin/jvm/functions/Function2;", "", "layout", "I", "getLayout", "()Ljava/lang/Integer;", "Landroid/view/View;", "Lru/ozon/app/android/composer/ComposerReferences;", "Lru/ozon/app/android/favorites/accesscontrol/presentation/item/AccessControlWidgetViewHolder;", "holderProducer", "getHolderProducer", "favorites_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class AccessControlViewMapper extends WidgetViewMapper2<AccessControlWidgetComponent, AccessControlDTO, AccessControlVO> {

    @NotNull
    private final Function2<AccessControlDTO, d, List<AccessControlVO>> mapper = new AccessControlViewMapper$mapper$1(this);
    private final int layout = R$layout.widget_access_control;

    @NotNull
    private final Function2<View, ComposerReferences, AccessControlWidgetViewHolder> holderProducer = new AccessControlViewMapper$holderProducer$1(this);

    @Override // ru.ozon.app.android.composer.widgets.base.WidgetViewMapper
    @NotNull
    /* renamed from: getHolderProducer */
    public Function2<View, ComposerReferences, AccessControlWidgetViewHolder> mo614getHolderProducer() {
        return this.holderProducer;
    }

    @Override // ru.ozon.composer.ui.widget.g
    @NotNull
    public Integer getLayout() {
        return Integer.valueOf(this.layout);
    }

    @Override // ru.ozon.app.android.composer.widgets.base.WidgetViewMapper
    @NotNull
    public Function2<AccessControlDTO, d, List<AccessControlVO>> getMapper() {
        return this.mapper;
    }

    @NotNull
    public final AccessControlVO toVo(@NotNull AccessControlDTO accessControlDTO, @NotNull String stateId) {
        Intrinsics.checkNotNullParameter(accessControlDTO, "<this>");
        Intrinsics.checkNotNullParameter(stateId, "stateId");
        return new AccessControlVO(stateId.hashCode(), OzonSpannableStringKt.toOzonSpannableString(accessControlDTO.getTitle()), OzonSpannableStringKt.toOzonSpannableString(accessControlDTO.getSubtitle()), accessControlDTO.getIcon(), accessControlDTO.getListName(), accessControlDTO.getButton());
    }

    @Override // ru.ozon.app.android.composer.widgets.v2.ViewMapper2
    @NotNull
    public C7473e<AccessControlWidgetComponent> widgetComponent(@NotNull C7475g storage) {
        Intrinsics.checkNotNullParameter(storage, "storage");
        return AccessControlWidgetComponent.INSTANCE.create(storage);
    }
}
