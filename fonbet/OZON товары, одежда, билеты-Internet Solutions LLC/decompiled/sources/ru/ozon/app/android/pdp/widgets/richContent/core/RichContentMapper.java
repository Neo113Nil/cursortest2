package ru.ozon.app.android.pdp.widgets.richContent.core;

import Sc.InterfaceC4008j;
import Sc.o;
import android.content.Context;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.C7714v;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import l20.d;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;
import ru.ozon.app.android.composer.TrackingInfoMapperKt;
import ru.ozon.app.android.pdp.utils.DelegatesKt;
import ru.ozon.app.android.pdp.view.shared.ExpandableWidget$ExpandButton;
import ru.ozon.app.android.pdp.widgets.richContent.data.RichContentDTO;
import ru.ozon.app.android.pdp.widgets.richContent.presentation.RichContentVO;
import ru.ozon.app.android.pdp.widgets.textDescription.data.ShortHeightButton;
import ru.ozon.uni.android.uikit.extensions.ResourceExtKt;
import ru.ozon.uni.atoms.data.button.Icon;
import ru.ozon.uni.atoms.data.text.TextDTO;
import ru.ozon.uni.atoms.v3.mappers.TextMapperKt;

@Metadata(d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010!\n\u0002\b\b\b\u0001\u0018\u00002*\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u0001j\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0005`\u0006B-\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0014\u0010\u000e\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\f\u0012\u0004\u0012\u00020\r0\u000b¢\u0006\u0004\b\u000f\u0010\u0010J\u001b\u0010\u0015\u001a\u00020\u0014*\u00020\u00112\u0006\u0010\u0013\u001a\u00020\u0012H\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u001b\u0010\u0019\u001a\u00020\u0018*\u00020\u00172\u0006\u0010\u0013\u001a\u00020\u0012H\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ&\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u001b\u001a\u00020\u00022\u0006\u0010\u001c\u001a\u00020\u0003H\u0096\u0002¢\u0006\u0004\b\u001d\u0010\u001eR\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\u001fR\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010 R\"\u0010\u000e\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\f\u0012\u0004\u0012\u00020\r0\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010!R\u001a\u0010#\u001a\b\u0012\u0004\u0012\u00020\f0\"8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010$R\u001b\u0010)\u001a\u00020\f8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b%\u0010&\u001a\u0004\b'\u0010(¨\u0006*"}, d2 = {"Lru/ozon/app/android/pdp/widgets/richContent/core/RichContentMapper;", "Lkotlin/Function2;", "Lru/ozon/app/android/pdp/widgets/richContent/data/RichContentDTO;", "Ll20/d;", "", "Lru/ozon/app/android/pdp/widgets/richContent/presentation/RichContentVO;", "Lru/ozon/app/android/composer/widgets/base/WidgetMapper;", "Landroid/content/Context;", "context", "", "isSelect", "Lkotlin/Function1;", "", "", "billboardHeight", "<init>", "(Landroid/content/Context;ZLkotlin/jvm/functions/Function1;)V", "Lru/ozon/app/android/pdp/widgets/textDescription/data/ShortHeightButton;", "", "widgetId", "Lru/ozon/app/android/pdp/view/shared/ExpandableWidget$ExpandButton;", "toVoButton", "(Lru/ozon/app/android/pdp/widgets/textDescription/data/ShortHeightButton;J)Lru/ozon/app/android/pdp/view/shared/ExpandableWidget$ExpandButton;", "Lru/ozon/app/android/pdp/widgets/richContent/data/RichContentDTO$Content;", "Lru/ozon/app/android/pdp/widgets/richContent/presentation/RichContentVO$Item;", "toVoItem", "(Lru/ozon/app/android/pdp/widgets/richContent/data/RichContentDTO$Content;J)Lru/ozon/app/android/pdp/widgets/richContent/presentation/RichContentVO$Item;", "state", "widgetInfo", "invoke", "(Lru/ozon/app/android/pdp/widgets/richContent/data/RichContentDTO;Ll20/d;)Ljava/util/List;", "Landroid/content/Context;", "Z", "Lkotlin/jvm/functions/Function1;", "", "imagesSize", "Ljava/util/List;", "screenWidthWithMargins$delegate", "LSc/j;", "getScreenWidthWithMargins", "()I", "screenWidthWithMargins", "pdp_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class RichContentMapper implements Function2<RichContentDTO, d, List<? extends RichContentVO>> {

    @NotNull
    private final Function1<Integer, Unit> billboardHeight;

    @NotNull
    private final Context context;

    @NotNull
    private final List<Integer> imagesSize;
    private final boolean isSelect;

    /* renamed from: screenWidthWithMargins$delegate, reason: from kotlin metadata */
    @NotNull
    private final InterfaceC4008j screenWidthWithMargins;

    /* JADX WARN: Multi-variable type inference failed */
    public RichContentMapper(@NotNull Context context, boolean z11, @NotNull Function1<? super Integer, Unit> billboardHeight) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(billboardHeight, "billboardHeight");
        this.context = context;
        this.isSelect = z11;
        this.billboardHeight = billboardHeight;
        this.imagesSize = new ArrayList();
        this.screenWidthWithMargins = DelegatesKt.lazyUnsafe(new RichContentMapper$screenWidthWithMargins$2(this));
    }

    private final int getScreenWidthWithMargins() {
        return ((Number) this.screenWidthWithMargins.getValue()).intValue();
    }

    private final ExpandableWidget$ExpandButton toVoButton(ShortHeightButton shortHeightButton, long j11) {
        int px = ResourceExtKt.toPx(shortHeightButton.getShortHeightLimit());
        TextDTO dsTextAtom$default = TextMapperKt.dsTextAtom$default(shortHeightButton.getText(), null, null, null, null, null, null, null, null, null, 1, null, false, 3583, null);
        Icon icon = shortHeightButton.getIcon();
        Map<String, TokenizedTrackingInfo> trackingInfo = shortHeightButton.getTrackingInfo();
        return new ExpandableWidget$ExpandButton(px, null, dsTextAtom$default, icon, trackingInfo != null ? TrackingInfoMapperKt.toTokenizedEvent$default(trackingInfo, Long.valueOf(j11), null, 2, null) : null);
    }

    private final RichContentVO.Item toVoItem(RichContentDTO.Content content, long j11) {
        if (content instanceof RichContentDTO.Content.BillboardDTO) {
            RichContentVO.Item.Billboard voBillboard = RichContentMapperExtKt.toVoBillboard((RichContentDTO.Content.BillboardDTO) content, j11, getScreenWidthWithMargins(), this.isSelect);
            this.imagesSize.add(Integer.valueOf(voBillboard.getHeight()));
            return voBillboard;
        }
        if (content instanceof RichContentDTO.Content.DoubleTileDTO) {
            return RichContentMapperExtKt.toVoDoubleTile((RichContentDTO.Content.DoubleTileDTO) content, j11, this.isSelect);
        }
        if (content instanceof RichContentDTO.Content.ListItemDTO) {
            return RichContentMapperExtKt.toVoListItem((RichContentDTO.Content.ListItemDTO) content, this.context);
        }
        if (content instanceof RichContentDTO.Content.TextDTO) {
            return RichContentMapperExtKt.toVoText((RichContentDTO.Content.TextDTO) content);
        }
        if (content instanceof RichContentDTO.Content.SpacerDTO) {
            return RichContentMapperExtKt.toVoSpacer((RichContentDTO.Content.SpacerDTO) content);
        }
        throw new o();
    }

    @Override // kotlin.jvm.functions.Function2
    @NotNull
    public List<RichContentVO> invoke(@NotNull RichContentDTO state, @NotNull d widgetInfo) {
        Integer mostFrequent;
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(widgetInfo, "widgetInfo");
        long hashCode = widgetInfo.d().hashCode();
        String tabGroupId = state.getTabGroupId();
        ShortHeightButton shortHeightButton = state.getShortHeightButton();
        ExpandableWidget$ExpandButton voButton = shortHeightButton != null ? toVoButton(shortHeightButton, hashCode) : null;
        List<RichContentDTO.Content> content = state.getContent();
        ArrayList arrayList = new ArrayList(C7714v.z(content, 10));
        Iterator<T> it = content.iterator();
        while (it.hasNext()) {
            arrayList.add(toVoItem((RichContentDTO.Content) it.next(), hashCode));
        }
        Map<String, TokenizedTrackingInfo> trackingInfo = state.getTrackingInfo();
        RichContentVO richContentVO = new RichContentVO(hashCode, tabGroupId, voButton, false, arrayList, trackingInfo != null ? TrackingInfoMapperKt.toTokenizedEvent$default(trackingInfo, Long.valueOf(hashCode), null, 2, null) : null);
        Function1<Integer, Unit> function1 = this.billboardHeight;
        mostFrequent = RichContentMapperKt.mostFrequent(this.imagesSize);
        function1.invoke(mostFrequent);
        return C7714v.a0(richContentVO);
    }
}
