package ru.ozon.app.android.checkoutcomposer.rfbsSplit.presentation;

import Sc.InterfaceC4008j;
import T00.m;
import WZ.t;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.C7714v;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import l20.d;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;
import ru.ozon.app.android.checkoutcomposer.common.splitDynamicElements.data.DynamicElementDTO;
import ru.ozon.app.android.checkoutcomposer.common.splitDynamicElements.data.SplitDynamicElementVO;
import ru.ozon.app.android.checkoutcomposer.common.splitDynamicElements.data.SplitDynamicElementsDTOKt;
import ru.ozon.app.android.checkoutcomposer.flags.CheckoutRoundedSplitsFlag;
import ru.ozon.app.android.checkoutcomposer.rfbsSplit.data.RealFbsSplitDTO;
import ru.ozon.app.android.checkoutcomposer.rfbsSplit.di.RealFbsSplitWidgetComponent;
import ru.ozon.app.android.checkoutcomposer.rfbsSplit.presentation.RealFbsSplitVO;
import ru.ozon.app.android.checkoutcomposer.rfbsSplit.presentation.decorator.RfbsCornerRoundedDecorator;
import ru.ozon.app.android.composer.ComposerReferences;
import ru.ozon.app.android.composer.TrackingInfoMapperKt;
import ru.ozon.app.android.composer.widgets.base.WidgetViewMapper;
import ru.ozon.composer.ui.widget.k;
import ru.ozon.uni.atoms.data.AtomActionDTO;
import ru.ozon.uni.atoms.data.button.ButtonV3Atom;
import ru.ozon.uni.atoms.data.button.Icon;
import ru.ozon.uni.atoms.data.texts.TextAtom;

@Metadata(d1 = {"\u0000\u0092\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u000f\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J'\u0010\r\u001a\u00020\u00032\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u0013\u0010\u0011\u001a\u00020\u0010*\u00020\u000fH\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u0013\u0010\u0011\u001a\u00020\u0014*\u00020\u0013H\u0002¢\u0006\u0004\b\u0011\u0010\u0015J\u0013\u0010\u0011\u001a\u00020\u0017*\u00020\u0016H\u0002¢\u0006\u0004\b\u0011\u0010\u0018J\u0013\u0010\u0011\u001a\u00020\u001a*\u00020\u0019H\u0002¢\u0006\u0004\b\u0011\u0010\u001bJ\u0017\u0010\u001f\u001a\u00020\u001e2\u0006\u0010\u001d\u001a\u00020\u001cH\u0016¢\u0006\u0004\b\u001f\u0010 J\u001d\u0010#\u001a\b\u0012\u0004\u0012\u00020\"0!2\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b#\u0010$R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010%R2\u0010(\u001a\u001a\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020'\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030!0&8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b(\u0010)\u001a\u0004\b*\u0010+R\u001c\u0010-\u001a\u0004\u0018\u00010,8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b-\u0010.\u001a\u0004\b/\u00100R2\u00103\u001a\u001a\u0012\u0004\u0012\u00020\u001e\u0012\u0004\u0012\u000201\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u0003020&8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b3\u0010)\u001a\u0004\b4\u0010+R\u0018\u00105\u001a\u0004\u0018\u00010'8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b5\u00106R\u001b\u0010<\u001a\u0002078BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b8\u00109\u001a\u0004\b:\u0010;¨\u0006="}, d2 = {"Lru/ozon/app/android/checkoutcomposer/rfbsSplit/presentation/RealFbsSplitViewMapper;", "Lru/ozon/app/android/composer/widgets/base/WidgetViewMapper;", "Lru/ozon/app/android/checkoutcomposer/rfbsSplit/data/RealFbsSplitDTO;", "Lru/ozon/app/android/checkoutcomposer/rfbsSplit/presentation/RealFbsSplitVO;", "Lru/ozon/app/android/checkoutcomposer/rfbsSplit/di/RealFbsSplitWidgetComponent;", "component", "<init>", "(Lru/ozon/app/android/checkoutcomposer/rfbsSplit/di/RealFbsSplitWidgetComponent;)V", "Landroid/content/Context;", "context", "", "stateId", "dto", "toViewObject", "(Landroid/content/Context;Ljava/lang/String;Lru/ozon/app/android/checkoutcomposer/rfbsSplit/data/RealFbsSplitDTO;)Lru/ozon/app/android/checkoutcomposer/rfbsSplit/presentation/RealFbsSplitVO;", "Lru/ozon/app/android/checkoutcomposer/rfbsSplit/data/RealFbsSplitDTO$Header;", "Lru/ozon/app/android/checkoutcomposer/rfbsSplit/presentation/RealFbsSplitVO$Header;", "toVO", "(Lru/ozon/app/android/checkoutcomposer/rfbsSplit/data/RealFbsSplitDTO$Header;)Lru/ozon/app/android/checkoutcomposer/rfbsSplit/presentation/RealFbsSplitVO$Header;", "Lru/ozon/app/android/checkoutcomposer/rfbsSplit/data/RealFbsSplitDTO$Footer;", "Lru/ozon/app/android/checkoutcomposer/rfbsSplit/presentation/RealFbsSplitVO$Footer;", "(Lru/ozon/app/android/checkoutcomposer/rfbsSplit/data/RealFbsSplitDTO$Footer;)Lru/ozon/app/android/checkoutcomposer/rfbsSplit/presentation/RealFbsSplitVO$Footer;", "Lru/ozon/app/android/checkoutcomposer/rfbsSplit/data/RealFbsSplitDTO$Products;", "Lru/ozon/app/android/checkoutcomposer/rfbsSplit/presentation/RealFbsSplitVO$Products;", "(Lru/ozon/app/android/checkoutcomposer/rfbsSplit/data/RealFbsSplitDTO$Products;)Lru/ozon/app/android/checkoutcomposer/rfbsSplit/presentation/RealFbsSplitVO$Products;", "Lru/ozon/app/android/checkoutcomposer/rfbsSplit/data/RealFbsSplitDTO$Product;", "Lru/ozon/app/android/checkoutcomposer/rfbsSplit/presentation/RealFbsSplitVO$Product;", "(Lru/ozon/app/android/checkoutcomposer/rfbsSplit/data/RealFbsSplitDTO$Product;)Lru/ozon/app/android/checkoutcomposer/rfbsSplit/presentation/RealFbsSplitVO$Product;", "Landroid/view/ViewGroup;", "parent", "Landroid/view/View;", "createView", "(Landroid/view/ViewGroup;)Landroid/view/View;", "", "Landroidx/recyclerview/widget/RecyclerView$n;", "getDecorators", "(Landroid/content/Context;)Ljava/util/List;", "Lru/ozon/app/android/checkoutcomposer/rfbsSplit/di/RealFbsSplitWidgetComponent;", "Lkotlin/Function2;", "Ll20/d;", "mapper", "Lkotlin/jvm/functions/Function2;", "getMapper", "()Lkotlin/jvm/functions/Function2;", "", "layout", "Ljava/lang/Integer;", "getLayout", "()Ljava/lang/Integer;", "Lru/ozon/app/android/composer/ComposerReferences;", "Lru/ozon/composer/ui/widget/k;", "holderProducer", "getHolderProducer", "widgetInfo", "Ll20/d;", "Lru/ozon/app/android/checkoutcomposer/rfbsSplit/presentation/decorator/RfbsCornerRoundedDecorator;", "decorator$delegate", "LSc/j;", "getDecorator", "()Lru/ozon/app/android/checkoutcomposer/rfbsSplit/presentation/decorator/RfbsCornerRoundedDecorator;", "decorator", "checkout_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class RealFbsSplitViewMapper extends WidgetViewMapper<RealFbsSplitDTO, RealFbsSplitVO> {

    @NotNull
    private final RealFbsSplitWidgetComponent component;

    /* renamed from: decorator$delegate, reason: from kotlin metadata */
    @NotNull
    private final InterfaceC4008j decorator;

    @NotNull
    private final Function2<View, ComposerReferences, k<RealFbsSplitVO>> holderProducer;
    private final Integer layout;

    @NotNull
    private final Function2<RealFbsSplitDTO, d, List<RealFbsSplitVO>> mapper;
    private d widgetInfo;

    public RealFbsSplitViewMapper(@NotNull RealFbsSplitWidgetComponent component) {
        Intrinsics.checkNotNullParameter(component, "component");
        this.component = component;
        this.mapper = new RealFbsSplitViewMapper$mapper$1(this);
        this.holderProducer = new RealFbsSplitViewMapper$holderProducer$1(this);
        this.decorator = Sc.k.b(RealFbsSplitViewMapper$decorator$2.INSTANCE);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final RfbsCornerRoundedDecorator getDecorator() {
        return (RfbsCornerRoundedDecorator) this.decorator.getValue();
    }

    private final RealFbsSplitVO.Header toVO(RealFbsSplitDTO.Header header) {
        TextAtom text = header.getText();
        Icon leftIcon = header.getLeftIcon();
        ButtonV3Atom.LargeIconButton rightIconButton = header.getRightIconButton();
        Boolean isRounded = header.isRounded();
        return new RealFbsSplitVO.Header(text, leftIcon, rightIconButton, isRounded != null ? isRounded.booleanValue() : true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final RealFbsSplitVO toViewObject(Context context, String stateId, RealFbsSplitDTO dto) {
        ArrayList arrayList;
        long hashCode = stateId.hashCode();
        String scrollWidgetKey = dto.getScrollWidgetKey();
        Integer valueOf = Integer.valueOf(scrollWidgetKey != null ? scrollWidgetKey.hashCode() : 0);
        AtomActionDTO action = dto.getAction();
        RealFbsSplitDTO.Header header = dto.getHeader();
        RealFbsSplitVO.Header vo = header != null ? toVO(header) : null;
        TextAtom subHeader = dto.getSubHeader();
        RealFbsSplitDTO.Products products = dto.getProducts();
        RealFbsSplitVO.Products vo2 = products != null ? toVO(products) : null;
        List<DynamicElementDTO> dynamicElements = dto.getDynamicElements();
        if (dynamicElements != null) {
            arrayList = new ArrayList();
            Iterator<T> it = dynamicElements.iterator();
            while (it.hasNext()) {
                SplitDynamicElementVO dynamicElementVO = SplitDynamicElementsDTOKt.toDynamicElementVO(it.next(), context, true);
                if (dynamicElementVO != null) {
                    arrayList.add(dynamicElementVO);
                }
            }
        } else {
            arrayList = null;
        }
        Map<String, TokenizedTrackingInfo> trackingInfo = dto.getTrackingInfo();
        t tokenizedEvent$default = trackingInfo != null ? TrackingInfoMapperKt.toTokenizedEvent$default(trackingInfo, Long.valueOf(hashCode), null, 2, null) : null;
        Boolean showSeparator = dto.getShowSeparator();
        boolean booleanValue = showSeparator != null ? showSeparator.booleanValue() : true;
        RealFbsSplitDTO.Footer footer = dto.getFooter();
        return new RealFbsSplitVO(hashCode, valueOf, action, vo, subHeader, vo2, arrayList, tokenizedEvent$default, booleanValue, footer != null ? toVO(footer) : null);
    }

    @Override // ru.ozon.composer.ui.widget.g
    @NotNull
    public View createView(@NotNull ViewGroup parent) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        Context context = parent.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        return new WidgetRfbsSplitView(context, null, 0, 0, 14, null);
    }

    @Override // ru.ozon.composer.ui.widget.g
    @NotNull
    public List<RecyclerView.n> getDecorators(@NotNull Context context) {
        m c11;
        Intrinsics.checkNotNullParameter(context, "context");
        RfbsCornerRoundedDecorator decorator = getDecorator();
        decorator.setRoundedSplitsFFEnabled(this.component.getFeatureChecker().isEnabled(CheckoutRoundedSplitsFlag.INSTANCE));
        d dVar = this.widgetInfo;
        decorator.setLayoutVersion((dVar == null || (c11 = dVar.c()) == null) ? null : Long.valueOf(c11.f()));
        return C7714v.a0(decorator);
    }

    @Override // ru.ozon.app.android.composer.widgets.base.WidgetViewMapper
    @NotNull
    /* renamed from: getHolderProducer */
    public Function2<View, ComposerReferences, k<RealFbsSplitVO>> mo614getHolderProducer() {
        return this.holderProducer;
    }

    @Override // ru.ozon.composer.ui.widget.g
    public Integer getLayout() {
        return this.layout;
    }

    @Override // ru.ozon.app.android.composer.widgets.base.WidgetViewMapper
    @NotNull
    public Function2<RealFbsSplitDTO, d, List<RealFbsSplitVO>> getMapper() {
        return this.mapper;
    }

    private final RealFbsSplitVO.Footer toVO(RealFbsSplitDTO.Footer footer) {
        Boolean isRounded = footer.isRounded();
        return new RealFbsSplitVO.Footer(isRounded != null ? isRounded.booleanValue() : true);
    }

    private final RealFbsSplitVO.Products toVO(RealFbsSplitDTO.Products products) {
        List<RealFbsSplitDTO.Product> elements = products.getElements();
        ArrayList arrayList = new ArrayList(C7714v.z(elements, 10));
        Iterator<T> it = elements.iterator();
        while (it.hasNext()) {
            arrayList.add(toVO((RealFbsSplitDTO.Product) it.next()));
        }
        return new RealFbsSplitVO.Products(arrayList, products.getAction());
    }

    private final RealFbsSplitVO.Product toVO(RealFbsSplitDTO.Product product) {
        return new RealFbsSplitVO.Product(product.getImage(), product.getText(), product.getBadge(), product.getBorderColor(), product.getPromoIcon(), product.getPromoIconPosition());
    }
}
