package ru.ozon.app.android.commonwidgets.widgets.pixel.presentation;

import WZ.t;
import android.content.Context;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.collections.C7714v;
import kotlin.collections.U;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.h;
import l20.d;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;
import ru.ozon.app.android.common.commonwidgets.R$layout;
import ru.ozon.app.android.commonwidgets.widgets.pixel.data.PixelDTO;
import ru.ozon.app.android.composer.ComposerReferences;
import ru.ozon.app.android.composer.TrackingInfoMapperKt;
import ru.ozon.app.android.composer.widgets.base.WidgetViewMapper;
import ru.ozon.composer.ui.widget.k;

@Metadata(d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u001b\u0010\b\u001a\u00020\u0003*\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\b\u0010\tJ\u001d\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\f2\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\u000e\u0010\u000fR6\u0010\u0013\u001a\u001e\u0012\u0004\u0012\u00020\u0002\u0012\b\u0012\u00060\u0011j\u0002`\u0012\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\f0\u00108\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0018\u001a\u00020\u00178\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR,\u0010 \u001a\u0014\u0012\u0004\u0012\u00020\u001d\u0012\u0004\u0012\u00020\u001e\u0012\u0004\u0012\u00020\u001f0\u001c8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\"\u0010#¨\u0006$"}, d2 = {"Lru/ozon/app/android/commonwidgets/widgets/pixel/presentation/PixelViewMapper;", "Lru/ozon/app/android/composer/widgets/base/WidgetViewMapper;", "Lru/ozon/app/android/commonwidgets/widgets/pixel/data/PixelDTO;", "Lru/ozon/app/android/commonwidgets/widgets/pixel/presentation/PixelVO;", "<init>", "()V", "", "stateId", "toVO", "(Lru/ozon/app/android/commonwidgets/widgets/pixel/data/PixelDTO;Ljava/lang/String;)Lru/ozon/app/android/commonwidgets/widgets/pixel/presentation/PixelVO;", "Landroid/content/Context;", "context", "", "Landroidx/recyclerview/widget/RecyclerView$n;", "getDecorators", "(Landroid/content/Context;)Ljava/util/List;", "Lkotlin/Function2;", "Ll20/d;", "Lru/ozon/app/android/composer/view/WidgetInfo;", "mapper", "Lkotlin/jvm/functions/Function2;", "getMapper", "()Lkotlin/jvm/functions/Function2;", "", "layout", "I", "getLayout", "()Ljava/lang/Integer;", "Lkotlin/reflect/KFunction2;", "Landroid/view/View;", "Lru/ozon/app/android/composer/ComposerReferences;", "Lru/ozon/app/android/commonwidgets/widgets/pixel/presentation/PixelWidgetViewHolder;", "holderProducer", "Lkotlin/reflect/h;", "getHolderProducer", "()Lkotlin/reflect/h;", "widgets_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class PixelViewMapper extends WidgetViewMapper<PixelDTO, PixelVO> {

    @NotNull
    private final Function2<PixelDTO, d, List<PixelVO>> mapper = new PixelViewMapper$mapper$1(this);
    private final int layout = R$layout.widget_pixel_layout;

    @NotNull
    private final h<PixelWidgetViewHolder> holderProducer = PixelViewMapper$holderProducer$1.INSTANCE;

    /* JADX INFO: Access modifiers changed from: private */
    public final PixelVO toVO(PixelDTO pixelDTO, String str) {
        long hashCode = str.hashCode();
        List<TokenizedTrackingInfo> viewEvents = pixelDTO.getViewEvents();
        t tVar = null;
        if (viewEvents != null) {
            List<TokenizedTrackingInfo> list = viewEvents;
            int h11 = U.h(C7714v.z(list, 10));
            if (h11 < 16) {
                h11 = 16;
            }
            LinkedHashMap linkedHashMap = new LinkedHashMap(h11);
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                Pair pair = new Pair("view", (TokenizedTrackingInfo) it.next());
                linkedHashMap.put(pair.e(), pair.f());
            }
            tVar = TrackingInfoMapperKt.toTokenizedEvent$default(linkedHashMap, Long.valueOf(str.hashCode()), null, 2, null);
        }
        return new PixelVO(hashCode, tVar);
    }

    @Override // ru.ozon.composer.ui.widget.g
    @NotNull
    public List<RecyclerView.n> getDecorators(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        return C7714v.a0(new PixelDecorator());
    }

    @Override // ru.ozon.app.android.composer.widgets.base.WidgetViewMapper
    /* renamed from: getHolderProducer */
    public /* bridge */ /* synthetic */ Function2<View, ComposerReferences, k<PixelVO>> mo614getHolderProducer() {
        return (Function2) getHolderProducer2();
    }

    @Override // ru.ozon.composer.ui.widget.g
    @NotNull
    public Integer getLayout() {
        return Integer.valueOf(this.layout);
    }

    @Override // ru.ozon.app.android.composer.widgets.base.WidgetViewMapper
    @NotNull
    public Function2<PixelDTO, d, List<PixelVO>> getMapper() {
        return this.mapper;
    }

    @NotNull
    /* renamed from: getHolderProducer, reason: avoid collision after fix types in other method */
    public h<PixelWidgetViewHolder> getHolderProducer2() {
        return this.holderProducer;
    }
}
