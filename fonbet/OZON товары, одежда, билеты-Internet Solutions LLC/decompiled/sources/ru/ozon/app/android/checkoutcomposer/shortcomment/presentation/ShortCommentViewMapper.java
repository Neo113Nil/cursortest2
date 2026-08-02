package ru.ozon.app.android.checkoutcomposer.shortcomment.presentation;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import l20.d;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.atoms.data.deprecated.CommonText;
import ru.ozon.app.android.checkoutcomposer.shortcomment.data.ShortCommentDTO;
import ru.ozon.app.android.checkoutcomposer.shortcomment.di.ShortCommentWidgetComponent;
import ru.ozon.app.android.composer.ComposerReferences;
import ru.ozon.app.android.composer.widgets.base.WidgetViewMapper;
import ru.ozon.composer.ui.widget.k;
import ru.ozon.uni.R$attr;
import ru.ozon.uni.android.uikit.extensions.ThemeExtKt;
import ru.ozon.uni.atoms.af.layout.VerticalAtomsLayout;

@Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\b\u0004\n\u0002\u0010\u0001\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u000f\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u0019\u0010\u000f\u001a\u00020\u0003*\u00020\u00022\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0011R2\u0010\u0015\u001a\u001a\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0013\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00140\u00128\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u001c\u0010\u001a\u001a\u0004\u0018\u00010\u00198\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR2\u0010!\u001a\u001a\u0012\u0004\u0012\u00020\u001e\u0012\u0004\u0012\u00020\u001f\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030 0\u00128\u0016X\u0096\u0004¢\u0006\f\n\u0004\b!\u0010\u0016\u001a\u0004\b\"\u0010\u0018¨\u0006#"}, d2 = {"Lru/ozon/app/android/checkoutcomposer/shortcomment/presentation/ShortCommentViewMapper;", "Lru/ozon/app/android/composer/widgets/base/WidgetViewMapper;", "Lru/ozon/app/android/checkoutcomposer/shortcomment/data/ShortCommentDTO;", "Lru/ozon/app/android/checkoutcomposer/shortcomment/presentation/ShortCommentVO;", "Lru/ozon/app/android/checkoutcomposer/shortcomment/di/ShortCommentWidgetComponent;", "component", "<init>", "(Lru/ozon/app/android/checkoutcomposer/shortcomment/di/ShortCommentWidgetComponent;)V", "Landroid/view/ViewGroup;", "parent", "Lru/ozon/uni/atoms/af/layout/VerticalAtomsLayout;", "createView", "(Landroid/view/ViewGroup;)Lru/ozon/uni/atoms/af/layout/VerticalAtomsLayout;", "", "stateId", "toVO", "(Lru/ozon/app/android/checkoutcomposer/shortcomment/data/ShortCommentDTO;Ljava/lang/String;)Lru/ozon/app/android/checkoutcomposer/shortcomment/presentation/ShortCommentVO;", "Lru/ozon/app/android/checkoutcomposer/shortcomment/di/ShortCommentWidgetComponent;", "Lkotlin/Function2;", "Ll20/d;", "", "mapper", "Lkotlin/jvm/functions/Function2;", "getMapper", "()Lkotlin/jvm/functions/Function2;", "", "layout", "Ljava/lang/Void;", "getLayout", "()Ljava/lang/Void;", "Landroid/view/View;", "Lru/ozon/app/android/composer/ComposerReferences;", "Lru/ozon/composer/ui/widget/k;", "holderProducer", "getHolderProducer", "checkout_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class ShortCommentViewMapper extends WidgetViewMapper<ShortCommentDTO, ShortCommentVO> {

    @NotNull
    private final ShortCommentWidgetComponent component;

    @NotNull
    private final Function2<View, ComposerReferences, k<ShortCommentVO>> holderProducer;
    private final Void layout;

    @NotNull
    private final Function2<ShortCommentDTO, d, List<ShortCommentVO>> mapper;

    public ShortCommentViewMapper(@NotNull ShortCommentWidgetComponent component) {
        Intrinsics.checkNotNullParameter(component, "component");
        this.component = component;
        this.mapper = new ShortCommentViewMapper$mapper$1(this);
        this.holderProducer = new ShortCommentViewMapper$holderProducer$1(this);
    }

    @Override // ru.ozon.app.android.composer.widgets.base.WidgetViewMapper
    @NotNull
    /* renamed from: getHolderProducer */
    public Function2<View, ComposerReferences, k<ShortCommentVO>> mo614getHolderProducer() {
        return this.holderProducer;
    }

    @Override // ru.ozon.composer.ui.widget.g
    public /* bridge */ /* synthetic */ Integer getLayout() {
        return (Integer) getLayout();
    }

    @Override // ru.ozon.app.android.composer.widgets.base.WidgetViewMapper
    @NotNull
    public Function2<ShortCommentDTO, d, List<ShortCommentVO>> getMapper() {
        return this.mapper;
    }

    @NotNull
    public final ShortCommentVO toVO(@NotNull ShortCommentDTO shortCommentDTO, @NotNull String stateId) {
        Intrinsics.checkNotNullParameter(shortCommentDTO, "<this>");
        Intrinsics.checkNotNullParameter(stateId, "stateId");
        return new ShortCommentVO(stateId.hashCode(), new CommonText.TextMedium(shortCommentDTO.getImage(), shortCommentDTO.getImageRight(), shortCommentDTO.getText(), null, null, shortCommentDTO.getAction(), null, null, null, null, 984, null));
    }

    @Override // ru.ozon.composer.ui.widget.g
    @NotNull
    public VerticalAtomsLayout createView(@NotNull ViewGroup parent) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        Context context = parent.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        VerticalAtomsLayout verticalAtomsLayout = new VerticalAtomsLayout(context, null, 0, 6, null);
        verticalAtomsLayout.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
        Context context2 = verticalAtomsLayout.getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
        verticalAtomsLayout.setBackgroundColor(ThemeExtKt.themeColor(context2, R$attr.layerFloor1));
        return verticalAtomsLayout;
    }

    public Void getLayout() {
        return this.layout;
    }
}
