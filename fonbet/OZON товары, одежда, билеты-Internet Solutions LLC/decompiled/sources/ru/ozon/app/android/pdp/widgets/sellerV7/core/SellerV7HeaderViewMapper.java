package ru.ozon.app.android.pdp.widgets.sellerV7.core;

import A00.a;
import Kk.c;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import k20.C7473e;
import k20.C7475g;
import kotlin.Metadata;
import kotlin.collections.C7714v;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.actionHandlers.pdp.sellerSubscribe.SellerSubscribeUpdateKey;
import ru.ozon.app.android.composer.ComposerReferences;
import ru.ozon.app.android.composer.widgets.v2.WidgetViewMapper2;
import ru.ozon.app.android.pdp.ui.configurators.pdp.seller.SellerV7VO;
import ru.ozon.app.android.pdp.ui.configurators.pdp.widgetPlaceholder.data.SellerV7DTO;
import ru.ozon.app.android.pdp.utils.PDPBackgroundColorDecorator;
import ru.ozon.app.android.pdp.widgets.sellerV7.di.SellerV7WidgetComponent;
import ru.ozon.app.android.pdp.widgets.sellerV7.presentation.SellerV7HeaderVH;
import ru.ozon.uni.atoms.data.AtomActionDTO;
import ru.ozon.uni.atoms.data.controls.CommonControlSettings;
import ru.ozon.uni.atoms.data.dsBadge.BadgeDTO;
import ru.ozon.uni.atoms.data.text.TextDTO;

@Metadata(d1 = {"\u0000\u009c\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0001\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001:\u0001=B\t\b\u0007¢\u0006\u0004\b\u0005\u0010\u0006J\u0019\u0010\n\u001a\u00020\t2\b\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u001f\u0010\u0014\u001a\u00020\u00042\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0013\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u001f\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0013\u001a\u00020\u00042\u0006\u0010\u0016\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0018\u0010\u0019J+\u0010\u001f\u001a\u0012\u0012\u0004\u0012\u00020\u00020\u001dj\b\u0012\u0004\u0012\u00020\u0002`\u001e2\n\u0010\u001c\u001a\u00060\u001aj\u0002`\u001bH\u0016¢\u0006\u0004\b\u001f\u0010 J\u0019\u0010#\u001a\u00020\"2\b\u0010!\u001a\u0004\u0018\u00010\u0017H\u0016¢\u0006\u0004\b#\u0010$J\u001d\u0010)\u001a\b\u0012\u0004\u0012\u00020(0'2\u0006\u0010&\u001a\u00020%H\u0016¢\u0006\u0004\b)\u0010*R,\u0010/\u001a\u0014\u0012\u0004\u0012\u00020,\u0012\u0004\u0012\u00020-\u0012\u0004\u0012\u00020.0+8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b/\u00100\u001a\u0004\b1\u00102R&\u00105\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u000204030'8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b5\u00106\u001a\u0004\b7\u00108R\u0014\u0010<\u001a\u0002098VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b:\u0010;¨\u0006>"}, d2 = {"Lru/ozon/app/android/pdp/widgets/sellerV7/core/SellerV7HeaderViewMapper;", "Lru/ozon/app/android/composer/widgets/v2/WidgetViewMapper2;", "Lru/ozon/app/android/pdp/widgets/sellerV7/di/SellerV7WidgetComponent;", "Lru/ozon/app/android/pdp/ui/configurators/pdp/widgetPlaceholder/data/SellerV7DTO;", "Lru/ozon/app/android/pdp/ui/configurators/pdp/seller/SellerV7VO;", "<init>", "()V", "Lru/ozon/uni/atoms/data/dsBadge/BadgeDTO;", "badge", "", "getSellerIdFromCell", "(Lru/ozon/uni/atoms/data/dsBadge/BadgeDTO;)Ljava/lang/String;", "Landroid/view/ViewGroup;", "parent", "Landroid/widget/LinearLayout;", "createView", "(Landroid/view/ViewGroup;)Landroid/widget/LinearLayout;", "LA00/a$J$a;", "update", "oldItem", "handleUpdate", "(LA00/a$J$a;Lru/ozon/app/android/pdp/ui/configurators/pdp/seller/SellerV7VO;)Lru/ozon/app/android/pdp/ui/configurators/pdp/seller/SellerV7VO;", "newItem", "", "getPayload", "(Lru/ozon/app/android/pdp/ui/configurators/pdp/seller/SellerV7VO;Lru/ozon/app/android/pdp/ui/configurators/pdp/seller/SellerV7VO;)Ljava/lang/Object;", "Lk20/g;", "Lru/ozon/app/android/composer/widgets/v2/di/ComposerWidgetComponentStorage;", "storage", "Lk20/e;", "Lru/ozon/app/android/composer/widgets/v2/di/WidgetComponent;", "widgetComponent", "(Lk20/g;)Lk20/e;", "state", "", "canMap", "(Ljava/lang/Object;)Z", "Landroid/content/Context;", "context", "", "Lru/ozon/app/android/pdp/utils/PDPBackgroundColorDecorator;", "getDecorators", "(Landroid/content/Context;)Ljava/util/List;", "Lkotlin/Function2;", "Landroid/view/View;", "Lru/ozon/app/android/composer/ComposerReferences;", "Lru/ozon/app/android/pdp/widgets/sellerV7/presentation/SellerV7HeaderVH;", "holderProducer", "Lkotlin/jvm/functions/Function2;", "getHolderProducer", "()Lkotlin/jvm/functions/Function2;", "Ljava/lang/Class;", "Lru/ozon/app/android/actionHandlers/pdp/sellerSubscribe/SellerSubscribeUpdateKey;", "supportedUpdates", "Ljava/util/List;", "getSupportedUpdates", "()Ljava/util/List;", "Lru/ozon/app/android/pdp/widgets/sellerV7/core/SellerV7Mapper;", "getMapper", "()Lru/ozon/app/android/pdp/widgets/sellerV7/core/SellerV7Mapper;", "mapper", "SellerV7HeaderPayload", "pdp_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class SellerV7HeaderViewMapper extends WidgetViewMapper2<SellerV7WidgetComponent, SellerV7DTO, SellerV7VO> {

    @NotNull
    private final Function2<View, ComposerReferences, SellerV7HeaderVH> holderProducer = new SellerV7HeaderViewMapper$holderProducer$1(this);

    @NotNull
    private final List<Class<SellerSubscribeUpdateKey>> supportedUpdates = C7714v.a0(SellerSubscribeUpdateKey.class);

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0002\u0006\u0007¨\u0006\b"}, d2 = {"Lru/ozon/app/android/pdp/widgets/sellerV7/core/SellerV7HeaderViewMapper$SellerV7HeaderPayload;", "", "<init>", "()V", "BadgePayload", "TitlePayload", "Lru/ozon/app/android/pdp/widgets/sellerV7/core/SellerV7HeaderViewMapper$SellerV7HeaderPayload$BadgePayload;", "Lru/ozon/app/android/pdp/widgets/sellerV7/core/SellerV7HeaderViewMapper$SellerV7HeaderPayload$TitlePayload;", "pdp_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    /* loaded from: classes13.dex */
    public static abstract class SellerV7HeaderPayload {

        @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, d2 = {"Lru/ozon/app/android/pdp/widgets/sellerV7/core/SellerV7HeaderViewMapper$SellerV7HeaderPayload$BadgePayload;", "Lru/ozon/app/android/pdp/widgets/sellerV7/core/SellerV7HeaderViewMapper$SellerV7HeaderPayload;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "pdp_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class BadgePayload extends SellerV7HeaderPayload {

            @NotNull
            public static final BadgePayload INSTANCE = new BadgePayload();

            private BadgePayload() {
                super(null);
            }

            public boolean equals(Object other) {
                return this == other || (other instanceof BadgePayload);
            }

            public int hashCode() {
                return 1796645660;
            }

            @NotNull
            public String toString() {
                return "BadgePayload";
            }
        }

        @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, d2 = {"Lru/ozon/app/android/pdp/widgets/sellerV7/core/SellerV7HeaderViewMapper$SellerV7HeaderPayload$TitlePayload;", "Lru/ozon/app/android/pdp/widgets/sellerV7/core/SellerV7HeaderViewMapper$SellerV7HeaderPayload;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "pdp_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class TitlePayload extends SellerV7HeaderPayload {

            @NotNull
            public static final TitlePayload INSTANCE = new TitlePayload();

            private TitlePayload() {
                super(null);
            }

            public boolean equals(Object other) {
                return this == other || (other instanceof TitlePayload);
            }

            public int hashCode() {
                return -962128185;
            }

            @NotNull
            public String toString() {
                return "TitlePayload";
            }
        }

        public /* synthetic */ SellerV7HeaderPayload(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private SellerV7HeaderPayload() {
        }
    }

    private final String getSellerIdFromCell(BadgeDTO badge) {
        CommonControlSettings common;
        AtomActionDTO action;
        Map<String, String> params;
        String str;
        return (badge == null || (common = badge.getCommon()) == null || (action = common.getAction()) == null || (params = action.getParams()) == null || (str = params.get("sellerId")) == null) ? "" : str;
    }

    @Override // ru.ozon.composer.ui.widget.g, m20.InterfaceC8046a
    public boolean canMap(Object state) {
        if (!(state instanceof SellerV7DTO)) {
            return false;
        }
        SellerV7DTO sellerV7DTO = (SellerV7DTO) state;
        if (sellerV7DTO.getHeader() == null) {
            return false;
        }
        SellerV7DTO.Header header = sellerV7DTO.getHeader();
        return ((header != null ? header.getBadge() : null) == null || component().getWidgetImagePlaceholderAdapter().canMapPlaceholderWidget("SellerV7HeaderCellWidget", state, true)) ? false : true;
    }

    @Override // ru.ozon.composer.ui.widget.g
    @NotNull
    public List<PDPBackgroundColorDecorator> getDecorators(@NotNull Context context) {
        return c.g(context, context, "context");
    }

    @Override // ru.ozon.app.android.composer.widgets.base.WidgetViewMapper
    @NotNull
    /* renamed from: getHolderProducer */
    public Function2<View, ComposerReferences, SellerV7HeaderVH> mo614getHolderProducer() {
        return this.holderProducer;
    }

    @Override // ru.ozon.composer.ui.widget.g, I00.d
    @NotNull
    public List<Class<SellerSubscribeUpdateKey>> getSupportedUpdates() {
        return this.supportedUpdates;
    }

    @Override // ru.ozon.app.android.composer.widgets.v2.ViewMapper2
    @NotNull
    public C7473e<SellerV7WidgetComponent> widgetComponent(@NotNull C7475g storage) {
        Intrinsics.checkNotNullParameter(storage, "storage");
        return SellerV7WidgetComponent.INSTANCE.create(storage);
    }

    @Override // ru.ozon.composer.ui.widget.g
    @NotNull
    public LinearLayout createView(@NotNull ViewGroup parent) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        SellerV7HeaderVH.Companion companion = SellerV7HeaderVH.INSTANCE;
        Context context = parent.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        return companion.createView(context);
    }

    @Override // ru.ozon.app.android.composer.widgets.base.WidgetViewMapper
    @NotNull
    public SellerV7Mapper getMapper() {
        return component().getMapper();
    }

    @Override // ru.ozon.composer.ui.widget.g
    @NotNull
    public Object getPayload(@NotNull SellerV7VO oldItem, @NotNull SellerV7VO newItem) {
        Intrinsics.checkNotNullParameter(oldItem, "oldItem");
        Intrinsics.checkNotNullParameter(newItem, "newItem");
        ArrayList arrayList = new ArrayList();
        SellerV7VO.SellerHeader header = oldItem.getHeader();
        SellerV7VO.SellerBadge badge = header != null ? header.getBadge() : null;
        SellerV7VO.SellerHeader header2 = newItem.getHeader();
        if (!Intrinsics.d(badge, header2 != null ? header2.getBadge() : null)) {
            arrayList.add(SellerV7HeaderPayload.BadgePayload.INSTANCE);
        }
        SellerV7VO.SellerHeader header3 = oldItem.getHeader();
        TextDTO title = header3 != null ? header3.getTitle() : null;
        SellerV7VO.SellerHeader header4 = newItem.getHeader();
        if (!Intrinsics.d(title, header4 != null ? header4.getTitle() : null)) {
            arrayList.add(SellerV7HeaderPayload.TitlePayload.INSTANCE);
        }
        return arrayList;
    }

    @Override // ru.ozon.app.android.composer.widgets.base.WidgetViewMapper, ru.ozon.composer.ui.widget.g, I00.d
    @NotNull
    public SellerV7VO handleUpdate(@NotNull a.J.InterfaceC0007a update, @NotNull SellerV7VO oldItem) {
        SellerV7VO.SellerBadge badge;
        Intrinsics.checkNotNullParameter(update, "update");
        Intrinsics.checkNotNullParameter(oldItem, "oldItem");
        SellerV7VO.SellerHeader header = oldItem.getHeader();
        if (update instanceof SellerSubscribeUpdateKey) {
            SellerV7VO.SellerHeader sellerHeader = null;
            SellerSubscribeUpdateKey sellerSubscribeUpdateKey = (SellerSubscribeUpdateKey) update;
            if (Intrinsics.d(getSellerIdFromCell((header == null || (badge = header.getBadge()) == null) ? null : badge.getSubscribed()), sellerSubscribeUpdateKey.getSellerId())) {
                if (header != null) {
                    SellerV7VO.SellerBadge badge2 = header.getBadge();
                    sellerHeader = SellerV7VO.SellerHeader.copy$default(header, null, badge2 != null ? SellerV7VO.SellerBadge.copy$default(badge2, sellerSubscribeUpdateKey.getIsSubscribed(), null, null, 6, null) : null, 1, null);
                }
                return SellerV7VO.copy$default(oldItem, 0L, sellerHeader, null, null, null, null, null, null, null, null, null, 2045, null);
            }
        }
        return oldItem;
    }
}
