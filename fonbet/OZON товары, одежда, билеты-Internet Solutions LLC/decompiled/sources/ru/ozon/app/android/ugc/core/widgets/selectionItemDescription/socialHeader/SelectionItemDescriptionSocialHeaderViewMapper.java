package ru.ozon.app.android.ugc.core.widgets.selectionItemDescription.socialHeader;

import A00.a;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import gk0.q;
import java.util.List;
import k20.C7473e;
import k20.C7475g;
import kotlin.Metadata;
import kotlin.collections.C7714v;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.N;
import l20.d;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.common.actionHandlers.subscribeAuthorHandlers.updateKeys.SubscribeAuthorBaseKey;
import ru.ozon.app.android.common.actionHandlers.subscribeAuthorHandlers.updateKeys.SubscribeAuthorUpdateKey;
import ru.ozon.app.android.common.actionHandlers.subscribeAuthorHandlers.updateKeys.UnsubscribeAuthorUpdateKey;
import ru.ozon.app.android.composer.ComposerReferences;
import ru.ozon.app.android.composer.widgets.v2.WidgetViewMapper2;
import ru.ozon.app.android.pdp.utils.CellExtKt;
import ru.ozon.app.android.ugc.core.R$id;
import ru.ozon.app.android.ugc.core.widgets.selectionItemDescription.di.SelectionItemDescriptionComponent;
import ru.ozon.uni.android.cell.CellView;

@Metadata(d1 = {"\u0000v\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u0019\u0010\t\u001a\u00020\b2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0016¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\u000e\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u001f\u0010\u0013\u001a\u00020\u00032\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0012\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J+\u0010\u001a\u001a\u0012\u0012\u0004\u0012\u00020\u00020\u0018j\b\u0012\u0004\u0012\u00020\u0002`\u00192\n\u0010\u0017\u001a\u00060\u0015j\u0002`\u0016H\u0016¢\u0006\u0004\b\u001a\u0010\u001bR2\u0010\u001f\u001a\u001a\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u001d\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u001e0\u001c8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\"R(\u0010%\u001a\u0010\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020$0#0\u001e8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b%\u0010&\u001a\u0004\b'\u0010(R,\u0010+\u001a\u0014\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020)\u0012\u0004\u0012\u00020*0\u001c8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b+\u0010 \u001a\u0004\b,\u0010\"¨\u0006-"}, d2 = {"Lru/ozon/app/android/ugc/core/widgets/selectionItemDescription/socialHeader/SelectionItemDescriptionSocialHeaderViewMapper;", "Lru/ozon/app/android/composer/widgets/v2/WidgetViewMapper2;", "Lru/ozon/app/android/ugc/core/widgets/selectionItemDescription/di/SelectionItemDescriptionComponent;", "Lru/ozon/app/android/ugc/core/widgets/selectionItemDescription/socialHeader/SocialHeaderVO;", "<init>", "()V", "", "state", "", "canMap", "(Ljava/lang/Object;)Z", "Landroid/view/ViewGroup;", "parent", "Landroid/view/View;", "createView", "(Landroid/view/ViewGroup;)Landroid/view/View;", "LA00/a$J$a;", "update", "oldItem", "handleUpdate", "(LA00/a$J$a;Lru/ozon/app/android/ugc/core/widgets/selectionItemDescription/socialHeader/SocialHeaderVO;)Lru/ozon/app/android/ugc/core/widgets/selectionItemDescription/socialHeader/SocialHeaderVO;", "Lk20/g;", "Lru/ozon/app/android/composer/widgets/v2/di/ComposerWidgetComponentStorage;", "storage", "Lk20/e;", "Lru/ozon/app/android/composer/widgets/v2/di/WidgetComponent;", "widgetComponent", "(Lk20/g;)Lk20/e;", "Lkotlin/Function2;", "Ll20/d;", "", "mapper", "Lkotlin/jvm/functions/Function2;", "getMapper", "()Lkotlin/jvm/functions/Function2;", "Ljava/lang/Class;", "Lru/ozon/app/android/common/actionHandlers/subscribeAuthorHandlers/updateKeys/SubscribeAuthorBaseKey;", "supportedUpdates", "Ljava/util/List;", "getSupportedUpdates", "()Ljava/util/List;", "Lru/ozon/app/android/composer/ComposerReferences;", "Lru/ozon/app/android/ugc/core/widgets/selectionItemDescription/socialHeader/SelectionItemDescriptionSocialHeaderVH;", "holderProducer", "getHolderProducer", "core_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class SelectionItemDescriptionSocialHeaderViewMapper extends WidgetViewMapper2<SelectionItemDescriptionComponent, SocialHeaderVO, SocialHeaderVO> {

    @NotNull
    private final Function2<SocialHeaderVO, d, List<SocialHeaderVO>> mapper = SelectionItemDescriptionSocialHeaderViewMapper$mapper$1.INSTANCE;

    @NotNull
    private final List<Class<? extends SubscribeAuthorBaseKey>> supportedUpdates = C7714v.b0(SubscribeAuthorUpdateKey.class, UnsubscribeAuthorUpdateKey.class);

    @NotNull
    private final Function2<View, ComposerReferences, SelectionItemDescriptionSocialHeaderVH> holderProducer = new SelectionItemDescriptionSocialHeaderViewMapper$holderProducer$1(this);

    @Override // ru.ozon.composer.ui.widget.g, m20.InterfaceC8046a
    public boolean canMap(Object state) {
        return state instanceof SocialHeaderVO;
    }

    @Override // ru.ozon.composer.ui.widget.g
    @NotNull
    public View createView(@NotNull ViewGroup parent) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        CellView cellView = (CellView) q.f64554a.i(N.b(CellView.class), parent.getContext());
        if (cellView == null) {
            Context context = parent.getContext();
            Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
            cellView = new CellView(context, null, 0, 0, null, 30, null);
        }
        cellView.setId(R$id.selectionItemDescriptionSocialHeader);
        cellView.setLayoutParams(new FrameLayout.LayoutParams(-1, -2));
        return cellView;
    }

    @Override // ru.ozon.app.android.composer.widgets.base.WidgetViewMapper
    @NotNull
    /* renamed from: getHolderProducer */
    public Function2<View, ComposerReferences, SelectionItemDescriptionSocialHeaderVH> mo614getHolderProducer() {
        return this.holderProducer;
    }

    @Override // ru.ozon.app.android.composer.widgets.base.WidgetViewMapper
    @NotNull
    public Function2<SocialHeaderVO, d, List<SocialHeaderVO>> getMapper() {
        return this.mapper;
    }

    @Override // ru.ozon.composer.ui.widget.g, I00.d
    @NotNull
    public List<Class<? extends SubscribeAuthorBaseKey>> getSupportedUpdates() {
        return this.supportedUpdates;
    }

    @Override // ru.ozon.app.android.composer.widgets.v2.ViewMapper2
    @NotNull
    public C7473e<SelectionItemDescriptionComponent> widgetComponent(@NotNull C7475g storage) {
        Intrinsics.checkNotNullParameter(storage, "storage");
        return SelectionItemDescriptionComponent.INSTANCE.create(storage);
    }

    @Override // ru.ozon.app.android.composer.widgets.base.WidgetViewMapper, ru.ozon.composer.ui.widget.g, I00.d
    @NotNull
    public SocialHeaderVO handleUpdate(@NotNull a.J.InterfaceC0007a update, @NotNull SocialHeaderVO oldItem) {
        Intrinsics.checkNotNullParameter(update, "update");
        Intrinsics.checkNotNullParameter(oldItem, "oldItem");
        return ((update instanceof SubscribeAuthorUpdateKey) && Intrinsics.d(CellExtKt.getRightBlockParam(oldItem.getSubscribe(), "authorId"), ((SubscribeAuthorUpdateKey) update).getAuthorId())) ? SocialHeaderVO.copy$default(oldItem, 0L, null, null, true, 0, 0, 55, null) : ((update instanceof UnsubscribeAuthorUpdateKey) && Intrinsics.d(CellExtKt.getRightBlockParam(oldItem.getSubscribed(), "authorId"), ((UnsubscribeAuthorUpdateKey) update).getAuthorId())) ? SocialHeaderVO.copy$default(oldItem, 0L, null, null, false, 0, 0, 55, null) : oldItem;
    }
}
