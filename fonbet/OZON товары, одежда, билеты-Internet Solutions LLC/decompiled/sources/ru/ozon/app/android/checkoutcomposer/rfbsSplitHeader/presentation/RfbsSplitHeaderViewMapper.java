package ru.ozon.app.android.checkoutcomposer.rfbsSplitHeader.presentation;

import N10.h;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import l20.d;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.checkoutcomposer.rfbsSplitHeader.data.RfbsSplitHeaderDTO;
import ru.ozon.app.android.composer.ComposerReferences;
import ru.ozon.app.android.composer.widgets.base.WidgetViewMapper;
import ru.ozon.composer.ui.widget.k;
import ru.ozon.uni.R$attr;
import ru.ozon.uni.android.uikit.extensions.ResourceExtKt;
import ru.ozon.uni.android.uikit.extensions.ThemeExtKt;
import ru.ozon.uni.android.uikit.extensions.view.ViewExtKt;
import ru.ozon.uni.atoms.data.texts.TextAtom;
import ru.ozon.uni.atoms.v3.containers.SingleAtom;

@Metadata(d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\b\u0004\n\u0002\u0010\u0001\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u001b\u0010\b\u001a\u00020\u0003*\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000f\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0014\u001a\u00020\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0016\u001a\u00020\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0015R\u001a\u0010\u0017\u001a\u00020\u00108\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0011\u0010\u0019R2\u0010\u001d\u001a\u001a\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u001b\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u001c0\u001a8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 R\u001c\u0010\"\u001a\u0004\u0018\u00010!8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\"\u0010#\u001a\u0004\b$\u0010%R,\u0010)\u001a\u0014\u0012\u0004\u0012\u00020&\u0012\u0004\u0012\u00020'\u0012\u0004\u0012\u00020(0\u001a8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b)\u0010\u001e\u001a\u0004\b*\u0010 ¨\u0006+"}, d2 = {"Lru/ozon/app/android/checkoutcomposer/rfbsSplitHeader/presentation/RfbsSplitHeaderViewMapper;", "Lru/ozon/app/android/composer/widgets/base/WidgetViewMapper;", "Lru/ozon/app/android/checkoutcomposer/rfbsSplitHeader/data/RfbsSplitHeaderDTO;", "Lru/ozon/app/android/checkoutcomposer/rfbsSplitHeader/presentation/RfbsSplitHeaderVO;", "<init>", "()V", "", "stateId", "toVO", "(Lru/ozon/app/android/checkoutcomposer/rfbsSplitHeader/data/RfbsSplitHeaderDTO;Ljava/lang/String;)Lru/ozon/app/android/checkoutcomposer/rfbsSplitHeader/presentation/RfbsSplitHeaderVO;", "Landroid/view/ViewGroup;", "parent", "Lru/ozon/uni/atoms/v3/containers/SingleAtom;", "createView", "(Landroid/view/ViewGroup;)Lru/ozon/uni/atoms/v3/containers/SingleAtom;", "item", "LN10/h;", "getStickyWidgetConfig", "(Lru/ozon/app/android/checkoutcomposer/rfbsSplitHeader/presentation/RfbsSplitHeaderVO;)LN10/h;", "", "horizontalPadding", "I", "verticalPadding", "stickyWidgetConfig", "LN10/h;", "()LN10/h;", "Lkotlin/Function2;", "Ll20/d;", "", "mapper", "Lkotlin/jvm/functions/Function2;", "getMapper", "()Lkotlin/jvm/functions/Function2;", "", "layout", "Ljava/lang/Void;", "getLayout", "()Ljava/lang/Void;", "Landroid/view/View;", "Lru/ozon/app/android/composer/ComposerReferences;", "Lru/ozon/app/android/checkoutcomposer/rfbsSplitHeader/presentation/RfbsSplitHeaderWidgetViewHolder;", "holderProducer", "getHolderProducer", "checkout_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class RfbsSplitHeaderViewMapper extends WidgetViewMapper<RfbsSplitHeaderDTO, RfbsSplitHeaderVO> {

    @NotNull
    private final Function2<View, ComposerReferences, RfbsSplitHeaderWidgetViewHolder> holderProducer;
    private final Void layout;

    @NotNull
    private final Function2<RfbsSplitHeaderDTO, d, List<RfbsSplitHeaderVO>> mapper;

    @NotNull
    private final h stickyWidgetConfig;
    private final int horizontalPadding = ResourceExtKt.toPx(16);
    private final int verticalPadding = ResourceExtKt.toPx(12);

    public RfbsSplitHeaderViewMapper() {
        Intrinsics.checkNotNullParameter("STICKY_TAG", "tag");
        this.stickyWidgetConfig = new h("STICKY_TAG", 6);
        this.mapper = new RfbsSplitHeaderViewMapper$mapper$1(this);
        this.holderProducer = RfbsSplitHeaderViewMapper$holderProducer$1.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final RfbsSplitHeaderVO toVO(RfbsSplitHeaderDTO rfbsSplitHeaderDTO, String str) {
        long hashCode = str.hashCode();
        TextAtom header = rfbsSplitHeaderDTO.getHeader();
        String tag = rfbsSplitHeaderDTO.getStickyGroupTag();
        if (tag != null) {
            Intrinsics.checkNotNullParameter(tag, "tag");
        } else {
            tag = null;
        }
        return new RfbsSplitHeaderVO(hashCode, header, tag, null);
    }

    @Override // ru.ozon.app.android.composer.widgets.base.WidgetViewMapper
    @NotNull
    /* renamed from: getHolderProducer */
    public Function2<View, ComposerReferences, k<RfbsSplitHeaderVO>> mo614getHolderProducer() {
        return this.holderProducer;
    }

    @Override // ru.ozon.composer.ui.widget.g
    public /* bridge */ /* synthetic */ Integer getLayout() {
        return (Integer) getLayout();
    }

    @Override // ru.ozon.app.android.composer.widgets.base.WidgetViewMapper
    @NotNull
    public Function2<RfbsSplitHeaderDTO, d, List<RfbsSplitHeaderVO>> getMapper() {
        return this.mapper;
    }

    @Override // ru.ozon.composer.ui.widget.g
    @NotNull
    public SingleAtom createView(@NotNull ViewGroup parent) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        Context context = parent.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        SingleAtom singleAtom = new SingleAtom(context, null, 0, 0, 14, null);
        singleAtom.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
        Context context2 = singleAtom.getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
        singleAtom.setBackgroundColor(ThemeExtKt.themeColor(context2, R$attr.layerFloor0));
        int i11 = this.horizontalPadding;
        int i12 = this.verticalPadding;
        ViewExtKt.updatePadding(singleAtom, i11, i12, i11, i12);
        return singleAtom;
    }

    public Void getLayout() {
        return this.layout;
    }

    @Override // ru.ozon.composer.ui.widget.g
    @NotNull
    public h getStickyWidgetConfig() {
        return this.stickyWidgetConfig;
    }

    @Override // ru.ozon.composer.ui.widget.g
    @NotNull
    public h getStickyWidgetConfig(@NotNull RfbsSplitHeaderVO item) {
        Intrinsics.checkNotNullParameter(item, "item");
        String stickyGroupTag = item.getStickyGroupTag();
        return stickyGroupTag != null ? h.a(getStickyWidgetConfig(), stickyGroupTag) : getStickyWidgetConfig();
    }
}
