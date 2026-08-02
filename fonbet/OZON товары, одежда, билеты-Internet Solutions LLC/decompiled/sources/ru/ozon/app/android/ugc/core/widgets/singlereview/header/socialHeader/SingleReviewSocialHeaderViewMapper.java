package ru.ozon.app.android.ugc.core.widgets.singlereview.header.socialHeader;

import A00.a;
import Sc.o;
import Xc.a;
import Xc.b;
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
import ru.ozon.uni.android.cell.CellView;

@Metadata(d1 = {"\u0000\u0098\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001:\u0001;B\t\b\u0007¢\u0006\u0004\b\u0005\u0010\u0006J\u0019\u0010\n\u001a\u00020\t2\b\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u001d\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00140\u00132\u0006\u0010\u0012\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u001f\u0010\u001a\u001a\u00020\u00042\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0019\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ\u001f\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u0019\u001a\u00020\u00042\u0006\u0010\u001c\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u001e\u0010\u001fJ+\u0010%\u001a\u0012\u0012\u0004\u0012\u00020\u00020#j\b\u0012\u0004\u0012\u00020\u0002`$2\n\u0010\"\u001a\u00060 j\u0002`!H\u0016¢\u0006\u0004\b%\u0010&R(\u0010)\u001a\u0010\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020(0'0\u00138\u0016X\u0096\u0004¢\u0006\f\n\u0004\b)\u0010*\u001a\u0004\b+\u0010,R,\u00100\u001a\u0014\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020.\u0012\u0004\u0012\u00020/0-8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b0\u00101\u001a\u0004\b2\u00103R\u0016\u00107\u001a\u0004\u0018\u0001048VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b5\u00106R,\u0010:\u001a\u001a\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u000208\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00130-8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b9\u00103¨\u0006<"}, d2 = {"Lru/ozon/app/android/ugc/core/widgets/singlereview/header/socialHeader/SingleReviewSocialHeaderViewMapper;", "Lru/ozon/app/android/composer/widgets/v2/WidgetViewMapper2;", "Lru/ozon/app/android/ugc/core/widgets/singlereview/header/socialHeader/SingleReviewSocialHeaderComponent;", "Lru/ozon/app/android/ugc/core/widgets/singlereview/header/socialHeader/SingleReviewSocialHeaderDO;", "Lru/ozon/app/android/ugc/core/widgets/singlereview/header/socialHeader/SingleReviewSocialHeaderVO;", "<init>", "()V", "", "state", "", "canMap", "(Ljava/lang/Object;)Z", "Landroid/view/ViewGroup;", "parent", "Landroid/view/View;", "createView", "(Landroid/view/ViewGroup;)Landroid/view/View;", "Landroid/content/Context;", "context", "", "Lru/ozon/app/android/ugc/core/widgets/singlereview/header/socialHeader/SingleReviewSocialHeaderDecorator;", "getDecorators", "(Landroid/content/Context;)Ljava/util/List;", "LA00/a$J$a;", "update", "oldItem", "handleUpdate", "(LA00/a$J$a;Lru/ozon/app/android/ugc/core/widgets/singlereview/header/socialHeader/SingleReviewSocialHeaderVO;)Lru/ozon/app/android/ugc/core/widgets/singlereview/header/socialHeader/SingleReviewSocialHeaderVO;", "newItem", "Lru/ozon/app/android/ugc/core/widgets/singlereview/header/socialHeader/SingleReviewSocialHeaderViewMapper$SingleReviewSocialHeaderPayload;", "getPayload", "(Lru/ozon/app/android/ugc/core/widgets/singlereview/header/socialHeader/SingleReviewSocialHeaderVO;Lru/ozon/app/android/ugc/core/widgets/singlereview/header/socialHeader/SingleReviewSocialHeaderVO;)Lru/ozon/app/android/ugc/core/widgets/singlereview/header/socialHeader/SingleReviewSocialHeaderViewMapper$SingleReviewSocialHeaderPayload;", "Lk20/g;", "Lru/ozon/app/android/composer/widgets/v2/di/ComposerWidgetComponentStorage;", "storage", "Lk20/e;", "Lru/ozon/app/android/composer/widgets/v2/di/WidgetComponent;", "widgetComponent", "(Lk20/g;)Lk20/e;", "Ljava/lang/Class;", "Lru/ozon/app/android/common/actionHandlers/subscribeAuthorHandlers/updateKeys/SubscribeAuthorBaseKey;", "supportedUpdates", "Ljava/util/List;", "getSupportedUpdates", "()Ljava/util/List;", "Lkotlin/Function2;", "Lru/ozon/app/android/composer/ComposerReferences;", "Lru/ozon/app/android/ugc/core/widgets/singlereview/header/socialHeader/SingleReviewSocialHeaderViewHolder;", "holderProducer", "Lkotlin/jvm/functions/Function2;", "getHolderProducer", "()Lkotlin/jvm/functions/Function2;", "", "getLayout", "()Ljava/lang/Integer;", "layout", "Ll20/d;", "getMapper", "mapper", "SingleReviewSocialHeaderPayload", "core_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class SingleReviewSocialHeaderViewMapper extends WidgetViewMapper2<SingleReviewSocialHeaderComponent, SingleReviewSocialHeaderDO, SingleReviewSocialHeaderVO> {

    @NotNull
    private final List<Class<? extends SubscribeAuthorBaseKey>> supportedUpdates = C7714v.b0(SubscribeAuthorUpdateKey.class, UnsubscribeAuthorUpdateKey.class);

    @NotNull
    private final Function2<View, ComposerReferences, SingleReviewSocialHeaderViewHolder> holderProducer = new SingleReviewSocialHeaderViewMapper$holderProducer$1(this);

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0080\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lru/ozon/app/android/ugc/core/widgets/singlereview/header/socialHeader/SingleReviewSocialHeaderViewMapper$SingleReviewSocialHeaderPayload;", "", "<init>", "(Ljava/lang/String;I)V", "UPDATED", "NO_UPDATES", "core_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    /* loaded from: classes2.dex */
    public static final class SingleReviewSocialHeaderPayload {
        private static final /* synthetic */ a $ENTRIES;
        private static final /* synthetic */ SingleReviewSocialHeaderPayload[] $VALUES;
        public static final SingleReviewSocialHeaderPayload UPDATED = new SingleReviewSocialHeaderPayload("UPDATED", 0);
        public static final SingleReviewSocialHeaderPayload NO_UPDATES = new SingleReviewSocialHeaderPayload("NO_UPDATES", 1);

        private static final /* synthetic */ SingleReviewSocialHeaderPayload[] $values() {
            return new SingleReviewSocialHeaderPayload[]{UPDATED, NO_UPDATES};
        }

        static {
            SingleReviewSocialHeaderPayload[] $values = $values();
            $VALUES = $values;
            $ENTRIES = b.a($values);
        }

        private SingleReviewSocialHeaderPayload(String str, int i11) {
        }

        public static SingleReviewSocialHeaderPayload valueOf(String str) {
            return (SingleReviewSocialHeaderPayload) Enum.valueOf(SingleReviewSocialHeaderPayload.class, str);
        }

        public static SingleReviewSocialHeaderPayload[] values() {
            return (SingleReviewSocialHeaderPayload[]) $VALUES.clone();
        }
    }

    @Override // ru.ozon.composer.ui.widget.g, m20.InterfaceC8046a
    public boolean canMap(Object state) {
        return (state instanceof SingleReviewSocialHeaderDO) && ((SingleReviewSocialHeaderDO) state).getSocialHeader() != null;
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
        cellView.setId(R$id.socialHeader);
        cellView.setLayoutParams(new FrameLayout.LayoutParams(-1, -2));
        return cellView;
    }

    @Override // ru.ozon.composer.ui.widget.g
    @NotNull
    public List<SingleReviewSocialHeaderDecorator> getDecorators(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        return C7714v.a0(new SingleReviewSocialHeaderDecorator(context));
    }

    @Override // ru.ozon.app.android.composer.widgets.base.WidgetViewMapper
    @NotNull
    /* renamed from: getHolderProducer */
    public Function2<View, ComposerReferences, SingleReviewSocialHeaderViewHolder> mo614getHolderProducer() {
        return this.holderProducer;
    }

    @Override // ru.ozon.composer.ui.widget.g
    public Integer getLayout() {
        return null;
    }

    @Override // ru.ozon.app.android.composer.widgets.base.WidgetViewMapper
    @NotNull
    public Function2<SingleReviewSocialHeaderDO, d, List<SingleReviewSocialHeaderVO>> getMapper() {
        return component().getMapper();
    }

    @Override // ru.ozon.composer.ui.widget.g, I00.d
    @NotNull
    public List<Class<? extends SubscribeAuthorBaseKey>> getSupportedUpdates() {
        return this.supportedUpdates;
    }

    @Override // ru.ozon.app.android.composer.widgets.v2.ViewMapper2
    @NotNull
    public C7473e<SingleReviewSocialHeaderComponent> widgetComponent(@NotNull C7475g storage) {
        Intrinsics.checkNotNullParameter(storage, "storage");
        return SingleReviewSocialHeaderComponent.INSTANCE.create(storage);
    }

    @Override // ru.ozon.composer.ui.widget.g
    @NotNull
    public SingleReviewSocialHeaderPayload getPayload(@NotNull SingleReviewSocialHeaderVO oldItem, @NotNull SingleReviewSocialHeaderVO newItem) {
        Intrinsics.checkNotNullParameter(oldItem, "oldItem");
        Intrinsics.checkNotNullParameter(newItem, "newItem");
        boolean z11 = oldItem.getIsSubscribed() != newItem.getIsSubscribed() || (oldItem.getIsSubscribed() && !Intrinsics.d(oldItem.getSubscribed(), newItem.getSubscribed())) || !(oldItem.getIsSubscribed() || Intrinsics.d(oldItem.getSubscribe(), newItem.getSubscribe()));
        if (z11) {
            return SingleReviewSocialHeaderPayload.NO_UPDATES;
        }
        if (z11) {
            throw new o();
        }
        return SingleReviewSocialHeaderPayload.UPDATED;
    }

    @Override // ru.ozon.app.android.composer.widgets.base.WidgetViewMapper, ru.ozon.composer.ui.widget.g, I00.d
    @NotNull
    public SingleReviewSocialHeaderVO handleUpdate(@NotNull a.J.InterfaceC0007a update, @NotNull SingleReviewSocialHeaderVO oldItem) {
        Intrinsics.checkNotNullParameter(update, "update");
        Intrinsics.checkNotNullParameter(oldItem, "oldItem");
        return ((update instanceof SubscribeAuthorUpdateKey) && Intrinsics.d(CellExtKt.getRightBlockParam(oldItem.getSubscribe(), "authorId"), ((SubscribeAuthorUpdateKey) update).getAuthorId())) ? SingleReviewSocialHeaderVO.copy$default(oldItem, 0L, null, null, true, null, null, false, 119, null) : ((update instanceof UnsubscribeAuthorUpdateKey) && Intrinsics.d(CellExtKt.getRightBlockParam(oldItem.getSubscribed(), "authorId"), ((UnsubscribeAuthorUpdateKey) update).getAuthorId())) ? SingleReviewSocialHeaderVO.copy$default(oldItem, 0L, null, null, false, null, null, false, 119, null) : oldItem;
    }
}
