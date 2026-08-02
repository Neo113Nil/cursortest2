package ru.ozon.app.android.storefront.widgets.profileIconButton.presentation;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import l20.d;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.composer.ComposerReferences;
import ru.ozon.app.android.composer.widgets.base.WidgetViewMapper;
import ru.ozon.app.android.domain.flags.ProfileIconButtonComposeWidgetEnabled;
import ru.ozon.app.android.storefront.widgets.profileIconButton.data.ProfileIconButtonDTO;
import ru.ozon.app.android.storefront.widgets.profileIconButton.di.ProfileIconButtonComponent;
import ru.ozon.app.android.storefront.widgets.profileIconButton.presentation.view.ProfileIconButtonView;
import ru.ozon.composer.ui.widget.k;

@Metadata(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u000f\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000b\u0010\fJ%\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00030\u00102\u0006\u0010\r\u001a\u00020\u00022\u0006\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u0019\u0010\u0015\u001a\u00020\u00142\b\u0010\r\u001a\u0004\u0018\u00010\u0013H\u0016¢\u0006\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0017R,\u0010\u001b\u001a\u0014\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u0019\u0012\u0004\u0012\u00020\u001a0\u00188\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u0014\u0010\"\u001a\u00020\u001f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b \u0010!¨\u0006#"}, d2 = {"Lru/ozon/app/android/storefront/widgets/profileIconButton/presentation/ProfileIconButtonViewMapper;", "Lru/ozon/app/android/composer/widgets/base/WidgetViewMapper;", "Lru/ozon/app/android/storefront/widgets/profileIconButton/data/ProfileIconButtonDTO;", "Lru/ozon/app/android/storefront/widgets/profileIconButton/presentation/ProfileIconButtonVO;", "Lru/ozon/app/android/storefront/widgets/profileIconButton/di/ProfileIconButtonComponent;", "component", "<init>", "(Lru/ozon/app/android/storefront/widgets/profileIconButton/di/ProfileIconButtonComponent;)V", "Landroid/view/ViewGroup;", "parent", "Landroid/view/View;", "createView", "(Landroid/view/ViewGroup;)Landroid/view/View;", "state", "Ll20/d;", "info", "", "map", "(Lru/ozon/app/android/storefront/widgets/profileIconButton/data/ProfileIconButtonDTO;Ll20/d;)Ljava/util/List;", "", "", "canMap", "(Ljava/lang/Object;)Z", "Lru/ozon/app/android/storefront/widgets/profileIconButton/di/ProfileIconButtonComponent;", "Lkotlin/Function2;", "Lru/ozon/app/android/composer/ComposerReferences;", "Lru/ozon/app/android/storefront/widgets/profileIconButton/presentation/ProfileIconButtonViewHolder;", "holderProducer", "Lkotlin/jvm/functions/Function2;", "getHolderProducer", "()Lkotlin/jvm/functions/Function2;", "Lru/ozon/app/android/storefront/widgets/profileIconButton/presentation/ProfileIconButtonMapper;", "getMapper", "()Lru/ozon/app/android/storefront/widgets/profileIconButton/presentation/ProfileIconButtonMapper;", "mapper", "storefront_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class ProfileIconButtonViewMapper extends WidgetViewMapper<ProfileIconButtonDTO, ProfileIconButtonVO> {

    @NotNull
    private final ProfileIconButtonComponent component;

    @NotNull
    private final Function2<View, ComposerReferences, ProfileIconButtonViewHolder> holderProducer;

    public ProfileIconButtonViewMapper(@NotNull ProfileIconButtonComponent component) {
        Intrinsics.checkNotNullParameter(component, "component");
        this.component = component;
        this.holderProducer = new ProfileIconButtonViewMapper$holderProducer$1(this);
    }

    @Override // ru.ozon.composer.ui.widget.g, m20.InterfaceC8046a
    public boolean canMap(Object state) {
        return (state instanceof ProfileIconButtonDTO) && !this.component.getFeatureChecker().isEnabled(ProfileIconButtonComposeWidgetEnabled.INSTANCE);
    }

    @Override // ru.ozon.composer.ui.widget.g
    @NotNull
    public View createView(@NotNull ViewGroup parent) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        Context context = parent.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        return new ProfileIconButtonView(context, null, 0, 6, null);
    }

    @Override // ru.ozon.app.android.composer.widgets.base.WidgetViewMapper
    @NotNull
    /* renamed from: getHolderProducer */
    public Function2<View, ComposerReferences, k<ProfileIconButtonVO>> mo614getHolderProducer() {
        return this.holderProducer;
    }

    @Override // ru.ozon.app.android.composer.widgets.base.WidgetViewMapper
    @NotNull
    public Function2<ProfileIconButtonDTO, d, List<ProfileIconButtonVO>> getMapper() {
        return this.component.getMapper();
    }

    @Override // ru.ozon.app.android.composer.widgets.base.WidgetViewMapper, m20.InterfaceC8046a
    @NotNull
    public List<ProfileIconButtonVO> map(@NotNull ProfileIconButtonDTO state, @NotNull d info) {
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(info, "info");
        return this.component.getMapper().invoke(state, info);
    }
}
