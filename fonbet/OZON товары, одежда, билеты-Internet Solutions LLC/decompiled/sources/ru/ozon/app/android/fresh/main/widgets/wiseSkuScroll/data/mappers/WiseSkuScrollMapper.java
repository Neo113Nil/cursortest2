package ru.ozon.app.android.fresh.main.widgets.wiseSkuScroll.data.mappers;

import Tc.b;
import WZ.t;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.collections.C7714v;
import kotlin.collections.M;
import kotlin.collections.U;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import l20.d;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;
import ru.ozon.app.android.atoms.data.labelList.LabelListAtom;
import ru.ozon.app.android.composer.TrackingInfoMapperKt;
import ru.ozon.app.android.fresh.common.widgets.molecules.freshTextPair.data.FreshTextPairDTO;
import ru.ozon.app.android.fresh.common.widgets.molecules.freshTile.data.FreshTileDTO;
import ru.ozon.app.android.fresh.main.utils.ExtentionsKt;
import ru.ozon.app.android.fresh.main.widgets.wiseSkuScroll.data.WiseBannerDTO;
import ru.ozon.app.android.fresh.main.widgets.wiseSkuScroll.data.WiseOldTileDTO;
import ru.ozon.app.android.fresh.main.widgets.wiseSkuScroll.data.WiseSkuScrollDTO;
import ru.ozon.app.android.fresh.main.widgets.wiseSkuScroll.presentation.vo.WiseBannerVO;
import ru.ozon.app.android.fresh.main.widgets.wiseSkuScroll.presentation.vo.WiseFreshTileVO;
import ru.ozon.app.android.fresh.main.widgets.wiseSkuScroll.presentation.vo.WiseSkuScrollVO;
import ru.ozon.uni.android.uikitsdk.ext.UiExtKt;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.data.AtomActionMapperKt;
import ru.ozon.uni.atoms.data.AtomDTO;
import ru.ozon.uni.atoms.data.common.Paddings;
import ru.ozon.uni.atoms.data.price.PriceDTO;
import ru.ozon.uni.atoms.data.text.TextDTO;

@Metadata(d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\"\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002*\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u0001j\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0005`\u0006B\u0007¢\u0006\u0004\b\u0007\u0010\bJI\u0010\u0012\u001a\u001a\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00100\u0004\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00100\u00110\u000f*\b\u0012\u0004\u0012\u00020\t0\u00042\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\fH\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u001b\u0010\u0017\u001a\u00020\u0016*\u00020\u00142\u0006\u0010\u0015\u001a\u00020\fH\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\u001b\u0010\u0017\u001a\u00020\u001a*\u00020\u00192\u0006\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\u0017\u0010\u001bJ*\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u001c\u001a\u00020\u00022\n\u0010\u001e\u001a\u00060\u0003j\u0002`\u001dH\u0096\u0002¢\u0006\u0004\b\u001f\u0010 ¨\u0006!"}, d2 = {"Lru/ozon/app/android/fresh/main/widgets/wiseSkuScroll/data/mappers/WiseSkuScrollMapper;", "Lkotlin/Function2;", "Lru/ozon/app/android/fresh/main/widgets/wiseSkuScroll/data/WiseSkuScrollDTO;", "Ll20/d;", "", "Lru/ozon/app/android/fresh/main/widgets/wiseSkuScroll/presentation/vo/WiseSkuScrollVO;", "Lru/ozon/app/android/composer/widgets/base/WidgetMapper;", "<init>", "()V", "Lru/ozon/app/android/fresh/common/widgets/molecules/freshTile/data/FreshTileDTO;", "", "widgetId", "", "isCombo", "hasBanner", "Lkotlin/Pair;", "Lru/ozon/app/android/fresh/main/widgets/wiseSkuScroll/presentation/vo/WiseFreshTileVO;", "", "mapAndFindCandidatesToMeasure", "(Ljava/util/List;JZZ)Lkotlin/Pair;", "Lru/ozon/app/android/fresh/main/widgets/wiseSkuScroll/data/WiseSkuScrollDTO$PaddingsDTO;", "hasBeak", "Lru/ozon/app/android/fresh/main/widgets/wiseSkuScroll/presentation/vo/WiseSkuScrollVO$PaddingsVO;", "toVO", "(Lru/ozon/app/android/fresh/main/widgets/wiseSkuScroll/data/WiseSkuScrollDTO$PaddingsDTO;Z)Lru/ozon/app/android/fresh/main/widgets/wiseSkuScroll/presentation/vo/WiseSkuScrollVO$PaddingsVO;", "Lru/ozon/app/android/fresh/main/widgets/wiseSkuScroll/data/WiseSkuScrollDTO$BeakDTO;", "Lru/ozon/app/android/fresh/main/widgets/wiseSkuScroll/presentation/vo/WiseSkuScrollVO$BeakVO;", "(Lru/ozon/app/android/fresh/main/widgets/wiseSkuScroll/data/WiseSkuScrollDTO$BeakDTO;J)Lru/ozon/app/android/fresh/main/widgets/wiseSkuScroll/presentation/vo/WiseSkuScrollVO$BeakVO;", "state", "Lru/ozon/app/android/composer/view/WidgetInfo;", "widgetInfo", "invoke", "(Lru/ozon/app/android/fresh/main/widgets/wiseSkuScroll/data/WiseSkuScrollDTO;Ll20/d;)Ljava/util/List;", "widgets-main_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class WiseSkuScrollMapper implements Function2<WiseSkuScrollDTO, d, List<? extends WiseSkuScrollVO>> {
    private final Pair<List<WiseFreshTileVO>, Set<WiseFreshTileVO>> mapAndFindCandidatesToMeasure(List<FreshTileDTO> list, long j11, boolean z11, boolean z12) {
        int i11;
        int i12;
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        List<FreshTileDTO> list2 = list;
        ArrayList arrayList = new ArrayList(C7714v.z(list2, 10));
        Iterator<T> it = list2.iterator();
        WiseFreshTileVO wiseFreshTileVO = null;
        WiseFreshTileVO wiseFreshTileVO2 = null;
        int i13 = 0;
        int i14 = 0;
        while (it.hasNext()) {
            WiseFreshTileVO vo = WiseFreshTileMapperKt.toVO((FreshTileDTO) it.next(), j11, z11, z12);
            if (i13 < vo.getAtomList().size()) {
                i13 = vo.getAtomList().size();
                wiseFreshTileVO = vo;
            }
            int i15 = 0;
            for (AtomDTO atomDTO : vo.getAtomList()) {
                if (atomDTO instanceof TextDTO) {
                    i11 = ((TextDTO) atomDTO).getText().length();
                } else {
                    if (atomDTO instanceof LabelListAtom) {
                        Iterator<T> it2 = ((LabelListAtom) atomDTO).getItems().iterator();
                        i12 = 0;
                        while (it2.hasNext()) {
                            i12 = ((LabelListAtom.Label) it2.next()).getTitle().length() + i12;
                        }
                    } else if (atomDTO instanceof PriceDTO) {
                        Iterator<T> it3 = ((PriceDTO) atomDTO).getPrice().iterator();
                        i12 = 0;
                        while (it3.hasNext()) {
                            String text = ((PriceDTO.Component) it3.next()).getText();
                            i12 += text != null ? text.length() : 0;
                        }
                    } else if (atomDTO instanceof FreshTextPairDTO) {
                        FreshTextPairDTO freshTextPairDTO = (FreshTextPairDTO) atomDTO;
                        i11 = freshTextPairDTO.getEllipsizableText().getText().length() + freshTextPairDTO.getTrailingText().getText().length();
                    } else {
                        i11 = 0;
                    }
                    i11 = i12;
                }
                i15 += i11;
            }
            if (i14 < i15) {
                wiseFreshTileVO2 = vo;
                i14 = i15;
            }
            arrayList.add(vo);
        }
        if (wiseFreshTileVO != null) {
            linkedHashSet.add(wiseFreshTileVO);
        }
        if (wiseFreshTileVO2 != null) {
            linkedHashSet.add(wiseFreshTileVO2);
        }
        return new Pair<>(arrayList, linkedHashSet);
    }

    private final WiseSkuScrollVO.PaddingsVO toVO(WiseSkuScrollDTO.PaddingsDTO paddingsDTO, boolean z11) {
        int px = z11 ? 0 : UiExtKt.toPx(Paddings.PADDING_400.getPx());
        int px2 = UiExtKt.toPx(paddingsDTO.getTop().getPx());
        int px3 = UiExtKt.toPx(paddingsDTO.getBottom().getPx());
        int px4 = UiExtKt.toPx(paddingsDTO.getLeft().getPx());
        Paddings right = paddingsDTO.getRight();
        if (right != null) {
            px = UiExtKt.toPx(right.getPx());
        }
        return new WiseSkuScrollVO.PaddingsVO(px2, px3, px4, px);
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x00aa  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00b6  */
    @Override // kotlin.jvm.functions.Function2
    @NotNull
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public List<WiseSkuScrollVO> invoke(@NotNull WiseSkuScrollDTO state, @NotNull d widgetInfo) {
        long j11;
        WiseSkuScrollDTO.BeakDTO beak;
        WiseSkuScrollVO.BeakVO vo;
        WiseBannerVO vo2;
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(widgetInfo, "widgetInfo");
        long id2 = ExtentionsKt.getId(widgetInfo);
        Set<WiseFreshTileVO> set = M.f71699a;
        b builder = C7714v.B();
        WiseBannerDTO banner = state.getBanner();
        if (banner != null && (vo2 = WiseBannerMapperKt.toVO(banner, id2)) != null) {
            builder.add(vo2);
        }
        if (state.getProducts() != null) {
            Iterator<T> it = state.getProducts().iterator();
            while (it.hasNext()) {
                builder.add(WiseOldTileMapperKt.toVO((WiseOldTileDTO) it.next(), id2));
            }
        } else if (state.getTiles() != null) {
            j11 = id2;
            Pair<List<WiseFreshTileVO>, Set<WiseFreshTileVO>> mapAndFindCandidatesToMeasure = mapAndFindCandidatesToMeasure(state.getTiles(), j11, state.getSizeConfiguration() == WiseSkuScrollDTO.SizeConfigurationDTO.COMBO_SET, state.getBanner() != null);
            List<WiseFreshTileVO> a11 = mapAndFindCandidatesToMeasure.a();
            set = mapAndFindCandidatesToMeasure.b();
            builder.addAll(a11);
            Set<WiseFreshTileVO> set2 = set;
            beak = state.getBeak();
            if (beak != null && (vo = toVO(beak, j11)) != null) {
                builder.add(vo);
            }
            Intrinsics.checkNotNullParameter(builder, "builder");
            b B11 = builder.B();
            String backgroundColor = state.getBackgroundColor();
            WiseSkuScrollVO.PaddingsVO vo3 = toVO(state.getPaddings(), state.getBeak() != null);
            Map<String, TokenizedTrackingInfo> trackingInfo = state.getTrackingInfo();
            return C7714v.a0(new WiseSkuScrollVO(j11, B11, set2, backgroundColor, vo3, trackingInfo != null ? TrackingInfoMapperKt.mapToTokenizedEvent$default(trackingInfo, Long.valueOf(j11), null, 2, null) : null, 0L, 64, null));
        }
        j11 = id2;
        Set<WiseFreshTileVO> set22 = set;
        beak = state.getBeak();
        if (beak != null) {
            builder.add(vo);
        }
        Intrinsics.checkNotNullParameter(builder, "builder");
        b B112 = builder.B();
        String backgroundColor2 = state.getBackgroundColor();
        WiseSkuScrollVO.PaddingsVO vo32 = toVO(state.getPaddings(), state.getBeak() != null);
        Map<String, TokenizedTrackingInfo> trackingInfo2 = state.getTrackingInfo();
        return C7714v.a0(new WiseSkuScrollVO(j11, B112, set22, backgroundColor2, vo32, trackingInfo2 != null ? TrackingInfoMapperKt.mapToTokenizedEvent$default(trackingInfo2, Long.valueOf(j11), null, 2, null) : null, 0L, 64, null));
    }

    private final WiseSkuScrollVO.BeakVO toVO(WiseSkuScrollDTO.BeakDTO beakDTO, long j11) {
        Map<String, TokenizedTrackingInfo> trackingInfo = beakDTO.getTrackingInfo();
        TokenizedTrackingInfo tokenizedTrackingInfo = trackingInfo != null ? trackingInfo.get("beak_pull") : null;
        t mapToTokenizedEvent$default = tokenizedTrackingInfo != null ? TrackingInfoMapperKt.mapToTokenizedEvent$default(U.i(new Pair("beak_pull", tokenizedTrackingInfo)), Long.valueOf(j11), null, 2, null) : null;
        AtomAction atomAction = AtomActionMapperKt.toAtomAction(beakDTO.getAction(), null);
        Map<String, TokenizedTrackingInfo> trackingInfo2 = beakDTO.getTrackingInfo();
        return new WiseSkuScrollVO.BeakVO(mapToTokenizedEvent$default, atomAction, trackingInfo2 != null ? TrackingInfoMapperKt.mapToTokenizedEvent$default(trackingInfo2, Long.valueOf(j11), null, 2, null) : null);
    }
}
