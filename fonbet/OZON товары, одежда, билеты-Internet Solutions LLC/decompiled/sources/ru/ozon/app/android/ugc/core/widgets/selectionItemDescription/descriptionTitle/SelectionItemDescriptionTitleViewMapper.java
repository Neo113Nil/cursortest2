package ru.ozon.app.android.ugc.core.widgets.selectionItemDescription.descriptionTitle;

import A00.a;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import java.util.List;
import k20.C7473e;
import k20.C7475g;
import kotlin.Metadata;
import kotlin.collections.C7714v;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import l20.d;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.composer.ComposerReferences;
import ru.ozon.app.android.composer.widgets.v2.WidgetViewMapper2;
import ru.ozon.app.android.ugc.core.widgets.selectionItemDescription.di.SelectionItemDescriptionComponent;
import ru.ozon.uni.R$attr;
import ru.ozon.uni.android.uikit.extensions.ThemeExtKt;
import ru.ozon.uni.atoms.data.text.expandable.ExpandableTextDTO;

@Metadata(d1 = {"\u0000v\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0001\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u001f\u0010\t\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\u000e\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u0019\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J+\u0010\u001a\u001a\u0012\u0012\u0004\u0012\u00020\u00020\u0018j\b\u0012\u0004\u0012\u00020\u0002`\u00192\n\u0010\u0017\u001a\u00060\u0015j\u0002`\u0016H\u0016¢\u0006\u0004\b\u001a\u0010\u001bR2\u0010\u001f\u001a\u001a\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u001d\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u001e0\u001c8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\"R,\u0010&\u001a\u0014\u0012\u0004\u0012\u00020#\u0012\u0004\u0012\u00020$\u0012\u0004\u0012\u00020%0\u001c8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b&\u0010 \u001a\u0004\b'\u0010\"R(\u0010)\u001a\u0010\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\u00060(0\u001e8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b)\u0010*\u001a\u0004\b+\u0010,¨\u0006-"}, d2 = {"Lru/ozon/app/android/ugc/core/widgets/selectionItemDescription/descriptionTitle/SelectionItemDescriptionTitleViewMapper;", "Lru/ozon/app/android/composer/widgets/v2/WidgetViewMapper2;", "Lru/ozon/app/android/ugc/core/widgets/selectionItemDescription/di/SelectionItemDescriptionComponent;", "Lru/ozon/app/android/ugc/core/widgets/selectionItemDescription/descriptionTitle/DescriptionTitleVO;", "<init>", "()V", "LA00/a$J$a;", "update", "oldItem", "handleUpdate", "(LA00/a$J$a;Lru/ozon/app/android/ugc/core/widgets/selectionItemDescription/descriptionTitle/DescriptionTitleVO;)Lru/ozon/app/android/ugc/core/widgets/selectionItemDescription/descriptionTitle/DescriptionTitleVO;", "Landroid/view/ViewGroup;", "parent", "Lru/ozon/app/android/ugc/core/widgets/selectionItemDescription/descriptionTitle/SelectionItemDescriptionTitleView;", "createView", "(Landroid/view/ViewGroup;)Lru/ozon/app/android/ugc/core/widgets/selectionItemDescription/descriptionTitle/SelectionItemDescriptionTitleView;", "", "state", "", "canMap", "(Ljava/lang/Object;)Z", "Lk20/g;", "Lru/ozon/app/android/composer/widgets/v2/di/ComposerWidgetComponentStorage;", "storage", "Lk20/e;", "Lru/ozon/app/android/composer/widgets/v2/di/WidgetComponent;", "widgetComponent", "(Lk20/g;)Lk20/e;", "Lkotlin/Function2;", "Ll20/d;", "", "mapper", "Lkotlin/jvm/functions/Function2;", "getMapper", "()Lkotlin/jvm/functions/Function2;", "Landroid/view/View;", "Lru/ozon/app/android/composer/ComposerReferences;", "Lru/ozon/app/android/ugc/core/widgets/selectionItemDescription/descriptionTitle/SelectionItemDescriptionTitleVH;", "holderProducer", "getHolderProducer", "Ljava/lang/Class;", "supportedUpdates", "Ljava/util/List;", "getSupportedUpdates", "()Ljava/util/List;", "core_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class SelectionItemDescriptionTitleViewMapper extends WidgetViewMapper2<SelectionItemDescriptionComponent, DescriptionTitleVO, DescriptionTitleVO> {

    @NotNull
    private final Function2<DescriptionTitleVO, d, List<DescriptionTitleVO>> mapper = SelectionItemDescriptionTitleViewMapper$mapper$1.INSTANCE;

    @NotNull
    private final Function2<View, ComposerReferences, SelectionItemDescriptionTitleVH> holderProducer = new SelectionItemDescriptionTitleViewMapper$holderProducer$1(this);

    @NotNull
    private final List<Class<? extends a.J.InterfaceC0007a>> supportedUpdates = C7714v.a0(DescriptionTitleUpdate.class);

    @Override // ru.ozon.composer.ui.widget.g, m20.InterfaceC8046a
    public boolean canMap(Object state) {
        return state instanceof DescriptionTitleVO;
    }

    @Override // ru.ozon.app.android.composer.widgets.base.WidgetViewMapper
    @NotNull
    /* renamed from: getHolderProducer */
    public Function2<View, ComposerReferences, SelectionItemDescriptionTitleVH> mo614getHolderProducer() {
        return this.holderProducer;
    }

    @Override // ru.ozon.app.android.composer.widgets.base.WidgetViewMapper
    @NotNull
    public Function2<DescriptionTitleVO, d, List<DescriptionTitleVO>> getMapper() {
        return this.mapper;
    }

    @Override // ru.ozon.composer.ui.widget.g, I00.d
    @NotNull
    public List<Class<? extends a.J.InterfaceC0007a>> getSupportedUpdates() {
        return this.supportedUpdates;
    }

    @Override // ru.ozon.app.android.composer.widgets.v2.ViewMapper2
    @NotNull
    public C7473e<SelectionItemDescriptionComponent> widgetComponent(@NotNull C7475g storage) {
        Intrinsics.checkNotNullParameter(storage, "storage");
        return SelectionItemDescriptionComponent.INSTANCE.create(storage);
    }

    @Override // ru.ozon.composer.ui.widget.g
    @NotNull
    public SelectionItemDescriptionTitleView createView(@NotNull ViewGroup parent) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        Context context = parent.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        SelectionItemDescriptionTitleView selectionItemDescriptionTitleView = new SelectionItemDescriptionTitleView(context);
        Context context2 = selectionItemDescriptionTitleView.getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
        selectionItemDescriptionTitleView.setBackgroundColor(ThemeExtKt.themeColor(context2, R$attr.layerFloor1));
        return selectionItemDescriptionTitleView;
    }

    @Override // ru.ozon.app.android.composer.widgets.base.WidgetViewMapper, ru.ozon.composer.ui.widget.g, I00.d
    @NotNull
    public DescriptionTitleVO handleUpdate(@NotNull a.J.InterfaceC0007a update, @NotNull DescriptionTitleVO oldItem) {
        Intrinsics.checkNotNullParameter(update, "update");
        Intrinsics.checkNotNullParameter(oldItem, "oldItem");
        if (update instanceof DescriptionTitleUpdate) {
            DescriptionTitleUpdate descriptionTitleUpdate = (DescriptionTitleUpdate) update;
            if (oldItem.getText().isExpanded() != descriptionTitleUpdate.getIsExpanded()) {
                return DescriptionTitleVO.copy$default(oldItem, 0L, ExpandableTextDTO.copy$default(oldItem.getText(), null, null, null, null, null, descriptionTitleUpdate.getIsExpanded(), null, null, null, null, null, null, null, false, null, null, null, null, 262111, null), null, 0, 0, 29, null);
            }
        }
        return oldItem;
    }
}
