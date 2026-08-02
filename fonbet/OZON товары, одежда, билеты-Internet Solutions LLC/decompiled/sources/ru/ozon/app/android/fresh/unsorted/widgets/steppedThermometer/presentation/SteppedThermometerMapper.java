package ru.ozon.app.android.fresh.unsorted.widgets.steppedThermometer.presentation;

import Tc.b;
import WZ.t;
import WZ.x;
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
import ru.ozon.app.android.fresh.unsorted.utils.ExtentionsKt;
import ru.ozon.app.android.fresh.unsorted.widgets.steppedThermometer.data.Range;
import ru.ozon.app.android.fresh.unsorted.widgets.steppedThermometer.data.Spacers;
import ru.ozon.app.android.fresh.unsorted.widgets.steppedThermometer.data.SteppedThermometerDTO;
import ru.ozon.uni.android.uikitsdk.ext.UiExtKt;
import ru.ozon.uni.atoms.data.common.Paddings;
import ru.ozon.uni.atoms.data.dsCell.CellDTO;
import ru.ozon.uni.atoms.data.text.TextDTO;

@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0001\u0018\u00002*\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u0001j\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0005`\u0006B\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u001b\u0010\n\u001a\u00020\u0005*\u00020\u00022\u0006\u0010\t\u001a\u00020\u0003H\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u0013\u0010\u000e\u001a\u00020\r*\u00020\fH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u001f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\u0004*\b\u0012\u0004\u0012\u00020\u00100\u0004H\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u001f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00140\u0004*\b\u0012\u0004\u0012\u00020\u00100\u0004H\u0002¢\u0006\u0004\b\u0015\u0010\u0013J&\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0016\u001a\u00020\u00022\u0006\u0010\u0017\u001a\u00020\u0003H\u0096\u0002¢\u0006\u0004\b\u0018\u0010\u0019¨\u0006\u001a"}, d2 = {"Lru/ozon/app/android/fresh/unsorted/widgets/steppedThermometer/presentation/SteppedThermometerMapper;", "Lkotlin/Function2;", "Lru/ozon/app/android/fresh/unsorted/widgets/steppedThermometer/data/SteppedThermometerDTO;", "Ll20/d;", "", "Lru/ozon/app/android/fresh/unsorted/widgets/steppedThermometer/presentation/SteppedThermometerVO;", "Lru/ozon/app/android/composer/widgets/base/WidgetMapper;", "<init>", "()V", "info", "toVO", "(Lru/ozon/app/android/fresh/unsorted/widgets/steppedThermometer/data/SteppedThermometerDTO;Ll20/d;)Lru/ozon/app/android/fresh/unsorted/widgets/steppedThermometer/presentation/SteppedThermometerVO;", "Lru/ozon/app/android/fresh/unsorted/widgets/steppedThermometer/data/Spacers;", "Lru/ozon/app/android/fresh/unsorted/widgets/steppedThermometer/presentation/PaddingsVO;", "toVo", "(Lru/ozon/app/android/fresh/unsorted/widgets/steppedThermometer/data/Spacers;)Lru/ozon/app/android/fresh/unsorted/widgets/steppedThermometer/presentation/PaddingsVO;", "Lru/ozon/app/android/fresh/unsorted/widgets/steppedThermometer/data/Range;", "", "toProgresses", "(Ljava/util/List;)Ljava/util/List;", "Lru/ozon/uni/atoms/data/text/TextDTO;", "toMarks", "state", "widgetInfo", "invoke", "(Lru/ozon/app/android/fresh/unsorted/widgets/steppedThermometer/data/SteppedThermometerDTO;Ll20/d;)Ljava/util/List;", "widgets-unsorted_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class SteppedThermometerMapper implements Function2<SteppedThermometerDTO, d, List<? extends SteppedThermometerVO>> {
    private final List<TextDTO> toMarks(List<Range> list) {
        ArrayList arrayList = new ArrayList();
        for (Range range : list) {
            b builder = C7714v.B();
            builder.add(range.getLeftMark());
            TextDTO rightMark = range.getRightMark();
            if (rightMark != null) {
                builder.add(rightMark);
            }
            Intrinsics.checkNotNullParameter(builder, "builder");
            C7714v.p(builder.B(), arrayList);
        }
        return arrayList;
    }

    private final List<Integer> toProgresses(List<Range> list) {
        List<Range> list2 = list;
        ArrayList arrayList = new ArrayList(C7714v.z(list2, 10));
        Iterator<T> it = list2.iterator();
        while (it.hasNext()) {
            arrayList.add(Integer.valueOf(((Range) it.next()).getProgress()));
        }
        return arrayList;
    }

    private final SteppedThermometerVO toVO(SteppedThermometerDTO steppedThermometerDTO, d dVar) {
        PaddingsVO paddingsVO;
        long id2 = ExtentionsKt.getId(dVar);
        CellDTO cell = steppedThermometerDTO.getCell();
        Spacers spacers = steppedThermometerDTO.getSpacers();
        if (spacers == null || (paddingsVO = toVo(spacers)) == null) {
            paddingsVO = PaddingsVO.INSTANCE.getDefault();
        }
        PaddingsVO paddingsVO2 = paddingsVO;
        List<Integer> progresses = toProgresses(steppedThermometerDTO.getRanges());
        List<TextDTO> marks = toMarks(steppedThermometerDTO.getRanges());
        String progressLineColor = steppedThermometerDTO.getProgressLineColor();
        Map<String, TokenizedTrackingInfo> trackingInfo = steppedThermometerDTO.getTrackingInfo();
        t tVar = null;
        if (trackingInfo != null) {
            Long valueOf = Long.valueOf(id2);
            Intrinsics.checkNotNullParameter(trackingInfo, "<this>");
            tVar = x.b(trackingInfo, valueOf, null);
        }
        return new SteppedThermometerVO(id2, cell, paddingsVO2, progresses, progressLineColor, marks, tVar);
    }

    private final PaddingsVO toVo(Spacers spacers) {
        Paddings top = spacers.getTop();
        int px = top != null ? UiExtKt.toPx(top.getPx()) : PaddingsVO.INSTANCE.getDefault().getTop();
        Paddings bottom = spacers.getBottom();
        int px2 = bottom != null ? UiExtKt.toPx(bottom.getPx()) : PaddingsVO.INSTANCE.getDefault().getBottom();
        Paddings left = spacers.getLeft();
        int px3 = left != null ? UiExtKt.toPx(left.getPx()) : PaddingsVO.INSTANCE.getDefault().getLeft();
        Paddings right = spacers.getRight();
        int px4 = right != null ? UiExtKt.toPx(right.getPx()) : PaddingsVO.INSTANCE.getDefault().getRight();
        Paddings betweenProgressLines = spacers.getBetweenProgressLines();
        int px5 = betweenProgressLines != null ? UiExtKt.toPx(betweenProgressLines.getPx()) : PaddingsVO.INSTANCE.getDefault().getBetweenProgressLines();
        Paddings betweenCellAndProgress = spacers.getBetweenCellAndProgress();
        int px6 = betweenCellAndProgress != null ? UiExtKt.toPx(betweenCellAndProgress.getPx()) : PaddingsVO.INSTANCE.getDefault().getBetweenCellAndProgress();
        Paddings betweenProgressAndRanges = spacers.getBetweenProgressAndRanges();
        return new PaddingsVO(px, px2, px3, px4, px5, px6, betweenProgressAndRanges != null ? UiExtKt.toPx(betweenProgressAndRanges.getPx()) : PaddingsVO.INSTANCE.getDefault().getBetweenProgressAndRanges());
    }

    @Override // kotlin.jvm.functions.Function2
    @NotNull
    public List<SteppedThermometerVO> invoke(@NotNull SteppedThermometerDTO state, @NotNull d widgetInfo) {
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(widgetInfo, "widgetInfo");
        return C7714v.a0(toVO(state, widgetInfo));
    }
}
