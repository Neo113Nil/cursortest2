package ru.ozon.app.android.fresh.feature.b2b.widgets.faq.presentation;

import android.content.Context;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.C7705l;
import kotlin.collections.C7714v;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import l20.d;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;
import ru.ozon.app.android.composer.TrackingInfoMapperKt;
import ru.ozon.app.android.fresh.feature.b2b.widgets.faq.data.FaqDTO;
import ru.ozon.app.android.fresh.feature.b2b.widgets.faq.presentation.FaqVO;
import ru.ozon.app.android.pdp.utils.ComposerExtKt;
import ru.ozon.app.android.pdp.utils.Dimens;
import ru.ozon.uni.atoms.data.controls.chip.ChipDTO;
import ru.ozon.uni.atoms.data.text.TextDTO;
import ru.ozon.uni.atoms.v3.mappers.TextMapperKt;

@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0015\n\u0002\u0010\b\n\u0002\b\t\b\u0001\u0018\u00002*\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u0001j\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0005`\u0006B\u0011\b\u0007\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u001b\u0010\u000f\u001a\u00020\u000e*\u00020\u000b2\u0006\u0010\r\u001a\u00020\fH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J'\u0010\u0015\u001a\u00020\u0013*\u00020\u00112\u0006\u0010\b\u001a\u00020\u00072\n\u0010\u0014\u001a\u00020\u0012\"\u00020\u0013H\u0002¢\u0006\u0004\b\u0015\u0010\u0016J&\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0003H\u0096\u0002¢\u0006\u0004\b\u0019\u0010\u001aR\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\u001b¨\u0006\u001c"}, d2 = {"Lru/ozon/app/android/fresh/feature/b2b/widgets/faq/presentation/FaqMapper;", "Lkotlin/Function2;", "Lru/ozon/app/android/fresh/feature/b2b/widgets/faq/data/FaqDTO;", "Ll20/d;", "", "Lru/ozon/app/android/fresh/feature/b2b/widgets/faq/presentation/FaqVO;", "Lru/ozon/app/android/composer/widgets/base/WidgetMapper;", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "Lru/ozon/app/android/fresh/feature/b2b/widgets/faq/data/FaqDTO$FaqItemDTO;", "", "id", "Lru/ozon/app/android/fresh/feature/b2b/widgets/faq/presentation/FaqVO$FaqItemVO;", "toVO", "(Lru/ozon/app/android/fresh/feature/b2b/widgets/faq/data/FaqDTO$FaqItemDTO;J)Lru/ozon/app/android/fresh/feature/b2b/widgets/faq/presentation/FaqVO$FaqItemVO;", "Lru/ozon/uni/atoms/data/text/TextDTO;", "", "", "margins", "getMeasuredHeight", "(Lru/ozon/uni/atoms/data/text/TextDTO;Landroid/content/Context;[I)I", "state", "widgetInfo", "invoke", "(Lru/ozon/app/android/fresh/feature/b2b/widgets/faq/data/FaqDTO;Ll20/d;)Ljava/util/List;", "Landroid/content/Context;", "b2b_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class FaqMapper implements Function2<FaqDTO, d, List<? extends FaqVO>> {

    @NotNull
    private final Context context;

    public FaqMapper(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.context = context;
    }

    private final int getMeasuredHeight(TextDTO textDTO, Context context, int... iArr) {
        return ComposerExtKt.getStubMeasureSize(textDTO, context, C7705l.d0(iArr)).getHeight();
    }

    private final FaqVO.FaqItemVO toVO(FaqDTO.FaqItemDTO faqItemDTO, long j11) {
        TextDTO copy$default = TextDTO.copy$default(TextMapperKt.getDsTextAtom(faqItemDTO.getQuestion()), null, null, null, null, null, null, null, null, null, null, null, null, null, true, null, null, null, null, null, 516095, null);
        TextDTO copy$default2 = TextDTO.copy$default(TextMapperKt.getDsTextAtom(faqItemDTO.getAnswer()), null, null, null, null, null, null, null, null, null, null, null, null, null, true, null, null, null, null, null, 516095, null);
        TextDTO dsTextAtom = TextMapperKt.getDsTextAtom(faqItemDTO.getQuestion());
        Context context = this.context;
        Dimens dimens = Dimens.INSTANCE;
        int measuredHeight = getMeasuredHeight(dsTextAtom, context, dimens.getDP_28(), dimens.getDP_56());
        int measuredHeight2 = getMeasuredHeight(TextMapperKt.getDsTextAtom(faqItemDTO.getAnswer()), this.context, dimens.getDP_28(), dimens.getDP_32());
        Map<String, TokenizedTrackingInfo> trackingInfo = faqItemDTO.getTrackingInfo();
        return new FaqVO.FaqItemVO(copy$default, copy$default2, measuredHeight, measuredHeight2, trackingInfo != null ? TrackingInfoMapperKt.toTokenizedEvent$default(trackingInfo, Long.valueOf(j11), null, 2, null) : null);
    }

    @Override // kotlin.jvm.functions.Function2
    @NotNull
    public List<FaqVO> invoke(@NotNull FaqDTO state, @NotNull d widgetInfo) {
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(widgetInfo, "widgetInfo");
        long hashCode = widgetInfo.d().hashCode();
        List<ChipDTO> tabs = state.getTabs();
        List<FaqDTO.FaqItemDTO> items = state.getItems();
        ArrayList arrayList = new ArrayList(C7714v.z(items, 10));
        Iterator<T> it = items.iterator();
        while (it.hasNext()) {
            arrayList.add(toVO((FaqDTO.FaqItemDTO) it.next(), hashCode));
        }
        return C7714v.a0(new FaqVO(hashCode, tabs, arrayList));
    }
}
