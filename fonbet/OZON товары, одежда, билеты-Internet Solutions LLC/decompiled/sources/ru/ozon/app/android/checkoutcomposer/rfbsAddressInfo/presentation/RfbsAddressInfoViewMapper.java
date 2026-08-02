package ru.ozon.app.android.checkoutcomposer.rfbsAddressInfo.presentation;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import l20.d;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.checkoutcomposer.common.splitDynamicElements.data.DynamicElementDTO;
import ru.ozon.app.android.checkoutcomposer.common.splitDynamicElements.data.SplitDynamicElementVO;
import ru.ozon.app.android.checkoutcomposer.common.splitDynamicElements.data.SplitDynamicElementsDTOKt;
import ru.ozon.app.android.checkoutcomposer.rfbsAddressInfo.data.RfbsAddressInfoDTO;
import ru.ozon.app.android.checkoutcomposer.rfbsAddressInfo.di.RfbsAddressInfoWidgetComponent;
import ru.ozon.app.android.composer.ComposerReferences;
import ru.ozon.app.android.composer.widgets.base.WidgetViewMapper;
import ru.ozon.composer.ui.widget.k;
import ru.ozon.uni.R$attr;
import ru.ozon.uni.android.uikit.extensions.ThemeExtKt;

@Metadata(d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\b\u0004\n\u0002\u0010\u0001\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u000f\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J'\u0010\r\u001a\u00020\u00032\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0014R2\u0010\u0018\u001a\u001a\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0016\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00170\u00158\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u001c\u0010\u001d\u001a\u0004\u0018\u00010\u001c8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 R2\u0010$\u001a\u001a\u0012\u0004\u0012\u00020!\u0012\u0004\u0012\u00020\"\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030#0\u00158\u0016X\u0096\u0004¢\u0006\f\n\u0004\b$\u0010\u0019\u001a\u0004\b%\u0010\u001b¨\u0006&"}, d2 = {"Lru/ozon/app/android/checkoutcomposer/rfbsAddressInfo/presentation/RfbsAddressInfoViewMapper;", "Lru/ozon/app/android/composer/widgets/base/WidgetViewMapper;", "Lru/ozon/app/android/checkoutcomposer/rfbsAddressInfo/data/RfbsAddressInfoDTO;", "Lru/ozon/app/android/checkoutcomposer/rfbsAddressInfo/presentation/RfbsAddressInfoVO;", "Lru/ozon/app/android/checkoutcomposer/rfbsAddressInfo/di/RfbsAddressInfoWidgetComponent;", "component", "<init>", "(Lru/ozon/app/android/checkoutcomposer/rfbsAddressInfo/di/RfbsAddressInfoWidgetComponent;)V", "Landroid/content/Context;", "context", "", "stateId", "dto", "toViewObject", "(Landroid/content/Context;Ljava/lang/String;Lru/ozon/app/android/checkoutcomposer/rfbsAddressInfo/data/RfbsAddressInfoDTO;)Lru/ozon/app/android/checkoutcomposer/rfbsAddressInfo/presentation/RfbsAddressInfoVO;", "Landroid/view/ViewGroup;", "parent", "Landroidx/recyclerview/widget/RecyclerView;", "createView", "(Landroid/view/ViewGroup;)Landroidx/recyclerview/widget/RecyclerView;", "Lru/ozon/app/android/checkoutcomposer/rfbsAddressInfo/di/RfbsAddressInfoWidgetComponent;", "Lkotlin/Function2;", "Ll20/d;", "", "mapper", "Lkotlin/jvm/functions/Function2;", "getMapper", "()Lkotlin/jvm/functions/Function2;", "", "layout", "Ljava/lang/Void;", "getLayout", "()Ljava/lang/Void;", "Landroid/view/View;", "Lru/ozon/app/android/composer/ComposerReferences;", "Lru/ozon/composer/ui/widget/k;", "holderProducer", "getHolderProducer", "checkout_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class RfbsAddressInfoViewMapper extends WidgetViewMapper<RfbsAddressInfoDTO, RfbsAddressInfoVO> {

    @NotNull
    private final RfbsAddressInfoWidgetComponent component;

    @NotNull
    private final Function2<View, ComposerReferences, k<RfbsAddressInfoVO>> holderProducer;
    private final Void layout;

    @NotNull
    private final Function2<RfbsAddressInfoDTO, d, List<RfbsAddressInfoVO>> mapper;

    public RfbsAddressInfoViewMapper(@NotNull RfbsAddressInfoWidgetComponent component) {
        Intrinsics.checkNotNullParameter(component, "component");
        this.component = component;
        this.mapper = new RfbsAddressInfoViewMapper$mapper$1(this);
        this.holderProducer = new RfbsAddressInfoViewMapper$holderProducer$1(this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final RfbsAddressInfoVO toViewObject(Context context, String stateId, RfbsAddressInfoDTO dto) {
        long hashCode = stateId.hashCode();
        List<DynamicElementDTO> dynamicElements = dto.getDynamicElements();
        ArrayList arrayList = null;
        if (!(dynamicElements instanceof List)) {
            dynamicElements = null;
        }
        if (dynamicElements != null) {
            ArrayList arrayList2 = new ArrayList();
            Iterator<T> it = dynamicElements.iterator();
            while (it.hasNext()) {
                SplitDynamicElementVO dynamicElementVO$default = SplitDynamicElementsDTOKt.toDynamicElementVO$default(it.next(), context, false, 2, null);
                if (dynamicElementVO$default != null) {
                    arrayList2.add(dynamicElementVO$default);
                }
            }
            arrayList = arrayList2;
        }
        return new RfbsAddressInfoVO(hashCode, arrayList);
    }

    @Override // ru.ozon.app.android.composer.widgets.base.WidgetViewMapper
    @NotNull
    /* renamed from: getHolderProducer */
    public Function2<View, ComposerReferences, k<RfbsAddressInfoVO>> mo614getHolderProducer() {
        return this.holderProducer;
    }

    @Override // ru.ozon.composer.ui.widget.g
    public /* bridge */ /* synthetic */ Integer getLayout() {
        return (Integer) getLayout();
    }

    @Override // ru.ozon.app.android.composer.widgets.base.WidgetViewMapper
    @NotNull
    public Function2<RfbsAddressInfoDTO, d, List<RfbsAddressInfoVO>> getMapper() {
        return this.mapper;
    }

    @Override // ru.ozon.composer.ui.widget.g
    @NotNull
    public RecyclerView createView(@NotNull ViewGroup parent) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        RecyclerView recyclerView = new RecyclerView(parent.getContext());
        recyclerView.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
        Context context = recyclerView.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        recyclerView.setBackgroundColor(ThemeExtKt.themeColor(context, R$attr.layerFloor1));
        recyclerView.setLayoutManager(new LinearLayoutManager(recyclerView.getContext(), 1, false));
        recyclerView.setNestedScrollingEnabled(false);
        return recyclerView;
    }

    public Void getLayout() {
        return this.layout;
    }
}
