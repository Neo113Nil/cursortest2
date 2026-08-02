package ru.ozon.app.android.storefront.widgets.naviBlocks.data.mappers;

import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C7714v;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import l20.d;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.storefront.widgets.naviBlocks.data.NaviBlockModel;
import ru.ozon.app.android.storefront.widgets.naviBlocks.presentation.couple.CoupleNaviBlockVO;

@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002*\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u0001j\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0005`\u0006B\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u001b\u0010\r\u001a\u00020\f*\u00020\t2\u0006\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\r\u0010\u000eJ*\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u000f\u001a\u00020\u00022\n\u0010\u0011\u001a\u00060\u0003j\u0002`\u0010H\u0096\u0002¢\u0006\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, d2 = {"Lru/ozon/app/android/storefront/widgets/naviBlocks/data/mappers/CoupleBlockTypeMapper;", "Lkotlin/Function2;", "Lru/ozon/app/android/storefront/widgets/naviBlocks/data/NaviBlockModel$CoupleNaviBlockModel;", "Ll20/d;", "", "Lru/ozon/app/android/storefront/widgets/naviBlocks/presentation/couple/CoupleNaviBlockVO;", "Lru/ozon/app/android/composer/widgets/base/WidgetMapper;", "<init>", "()V", "Lru/ozon/app/android/storefront/widgets/naviBlocks/data/NaviBlocksDTO$NaviBlockDTO$SquareCoupleDTO$NaviBlockItemDTO;", "", "id", "Lru/ozon/app/android/storefront/widgets/naviBlocks/presentation/couple/CoupleNaviBlockVO$NaviBlockItemVO;", "mapToVo", "(Lru/ozon/app/android/storefront/widgets/naviBlocks/data/NaviBlocksDTO$NaviBlockDTO$SquareCoupleDTO$NaviBlockItemDTO;J)Lru/ozon/app/android/storefront/widgets/naviBlocks/presentation/couple/CoupleNaviBlockVO$NaviBlockItemVO;", "state", "Lru/ozon/app/android/composer/view/WidgetInfo;", "widgetInfo", "invoke", "(Lru/ozon/app/android/storefront/widgets/naviBlocks/data/NaviBlockModel$CoupleNaviBlockModel;Ll20/d;)Ljava/util/List;", "storefront_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class CoupleBlockTypeMapper implements Function2<NaviBlockModel.CoupleNaviBlockModel, d, List<? extends CoupleNaviBlockVO>> {
    /*  JADX ERROR: JadxRuntimeException in pass: ModVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v0 ru.ozon.app.android.storefront.widgets.naviBlocks.presentation.couple.CoupleNaviBlockVO$NaviBlockItemVO, still in use, count: 2, list:
          (r0v0 ru.ozon.app.android.storefront.widgets.naviBlocks.presentation.couple.CoupleNaviBlockVO$NaviBlockItemVO) from 0x0057: MOVE (r21v0 ru.ozon.app.android.storefront.widgets.naviBlocks.presentation.couple.CoupleNaviBlockVO$NaviBlockItemVO) = (r0v0 ru.ozon.app.android.storefront.widgets.naviBlocks.presentation.couple.CoupleNaviBlockVO$NaviBlockItemVO)
          (r0v0 ru.ozon.app.android.storefront.widgets.naviBlocks.presentation.couple.CoupleNaviBlockVO$NaviBlockItemVO) from 0x004d: MOVE (r21v2 ru.ozon.app.android.storefront.widgets.naviBlocks.presentation.couple.CoupleNaviBlockVO$NaviBlockItemVO) = (r0v0 ru.ozon.app.android.storefront.widgets.naviBlocks.presentation.couple.CoupleNaviBlockVO$NaviBlockItemVO)
        	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:162)
        	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:127)
        	at jadx.core.utils.InsnRemover.unbindInsn(InsnRemover.java:91)
        	at jadx.core.utils.InsnRemover.addAndUnbind(InsnRemover.java:57)
        	at jadx.core.dex.visitors.ModVisitor.removeStep(ModVisitor.java:447)
        	at jadx.core.dex.visitors.ModVisitor.visit(ModVisitor.java:96)
        */
    /* JADX WARN: Multi-variable type inference failed */
    private final ru.ozon.app.android.storefront.widgets.naviBlocks.presentation.couple.CoupleNaviBlockVO.NaviBlockItemVO mapToVo(ru.ozon.app.android.storefront.widgets.naviBlocks.data.NaviBlocksDTO.NaviBlockDTO.SquareCoupleDTO.NaviBlockItemDTO r23, long r24) {
        /*
            r22 = this;
            ru.ozon.app.android.storefront.widgets.naviBlocks.presentation.couple.CoupleNaviBlockVO$NaviBlockItemVO r0 = new ru.ozon.app.android.storefront.widgets.naviBlocks.presentation.couple.CoupleNaviBlockVO$NaviBlockItemVO
            java.lang.String r1 = r23.getBackgroundColor()
            java.lang.String r2 = r23.getImage()
            ru.ozon.uni.atoms.data.texts.TextAtom r3 = r23.getTitle()
            r14 = 0
            r15 = 0
            r4 = 0
            r5 = 0
            r6 = 0
            r7 = 0
            r8 = 0
            r9 = 0
            r10 = 0
            r11 = 0
            r12 = 0
            r13 = 0
            r16 = 4095(0xfff, float:5.738E-42)
            r17 = 0
            ru.ozon.uni.atoms.data.text.TextDTO r3 = ru.ozon.uni.atoms.v3.mappers.TextMapperKt.dsTextAtom$default(r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17)
            ru.ozon.uni.atoms.data.icon.IconDTO r4 = r23.getTitleDisclosure()
            ru.ozon.uni.atoms.data.texts.TextAtom r5 = r23.getSubtitle()
            if (r5 == 0) goto L57
            r16 = 0
            r17 = 0
            r7 = r6
            r6 = 0
            r8 = r7
            r7 = 0
            r9 = r8
            r8 = 0
            r10 = r9
            r9 = 0
            r11 = r10
            r10 = 0
            r12 = r11
            r11 = 0
            r13 = r12
            r12 = 0
            r14 = r13
            r13 = 0
            r15 = r14
            r14 = 0
            r18 = r15
            r15 = 0
            r19 = r18
            r18 = 4095(0xfff, float:5.738E-42)
            r20 = r19
            r19 = 0
            r21 = r0
            r0 = r20
            ru.ozon.uni.atoms.data.text.TextDTO r6 = ru.ozon.uni.atoms.v3.mappers.TextMapperKt.dsTextAtom$default(r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19)
            r5 = r6
            goto L5b
        L57:
            r21 = r0
            r0 = r6
            r5 = r0
        L5b:
            ru.ozon.uni.atoms.data.AtomActionDTO r6 = r23.getAction()
            if (r6 == 0) goto L6a
            java.util.Map r7 = r23.getTrackingInfo()
            ru.ozon.uni.atoms.af.AtomAction r6 = ru.ozon.uni.atoms.data.AtomActionMapperKt.toAtomAction(r6, r7)
            goto L6b
        L6a:
            r6 = r0
        L6b:
            java.util.Map r7 = r23.getTrackingInfo()
            if (r7 == 0) goto L7a
            java.lang.Long r8 = java.lang.Long.valueOf(r24)
            r9 = 2
            WZ.t r0 = ru.ozon.app.android.composer.TrackingInfoMapperKt.toTokenizedEvent$default(r7, r8, r0, r9, r0)
        L7a:
            r7 = r0
            r0 = r21
            r0.<init>(r1, r2, r3, r4, r5, r6, r7)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: ru.ozon.app.android.storefront.widgets.naviBlocks.data.mappers.CoupleBlockTypeMapper.mapToVo(ru.ozon.app.android.storefront.widgets.naviBlocks.data.NaviBlocksDTO$NaviBlockDTO$SquareCoupleDTO$NaviBlockItemDTO, long):ru.ozon.app.android.storefront.widgets.naviBlocks.presentation.couple.CoupleNaviBlockVO$NaviBlockItemVO");
    }

    @Override // kotlin.jvm.functions.Function2
    @NotNull
    public List<CoupleNaviBlockVO> invoke(@NotNull NaviBlockModel.CoupleNaviBlockModel state, @NotNull d widgetInfo) {
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(widgetInfo, "widgetInfo");
        long hashCode = (widgetInfo.d().hashCode() + "_coupleBlock_" + state.getPosition()).hashCode();
        return C7714v.a0(new CoupleNaviBlockVO(hashCode, NaviBlocksCornerMapperKt.getRoundedCorners(state), state.getPosition(), mapToVo(state.getCoupleBlock().getTopItem(), hashCode), mapToVo(state.getCoupleBlock().getBottomItem(), hashCode)));
    }
}
