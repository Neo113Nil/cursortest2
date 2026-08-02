package ru.ozon.app.android.storefront.widgets.naviBlocks.data.mappers;

import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C7714v;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import l20.d;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.storefront.widgets.naviBlocks.data.NaviBlockModel;
import ru.ozon.app.android.storefront.widgets.naviBlocks.presentation.single.oneframe.OneFrameNaviBlockVO;

@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002*\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u0001j\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0005`\u0006B\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u001b\u0010\r\u001a\u00020\f*\u00020\t2\u0006\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\r\u0010\u000eJ*\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u000f\u001a\u00020\u00022\n\u0010\u0011\u001a\u00060\u0003j\u0002`\u0010H\u0096\u0002¢\u0006\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, d2 = {"Lru/ozon/app/android/storefront/widgets/naviBlocks/data/mappers/OneFrameBlockTypeMapper;", "Lkotlin/Function2;", "Lru/ozon/app/android/storefront/widgets/naviBlocks/data/NaviBlockModel$OneFrameNaviBlockModel;", "Ll20/d;", "", "Lru/ozon/app/android/storefront/widgets/naviBlocks/presentation/single/oneframe/OneFrameNaviBlockVO;", "Lru/ozon/app/android/composer/widgets/base/WidgetMapper;", "<init>", "()V", "Lru/ozon/app/android/storefront/widgets/naviBlocks/data/NaviBlocksDTO$NaviBlockDTO$SquareSingleDTO$FrameDTO;", "", "id", "Lru/ozon/app/android/storefront/widgets/naviBlocks/presentation/single/FrameVO;", "mapToVo", "(Lru/ozon/app/android/storefront/widgets/naviBlocks/data/NaviBlocksDTO$NaviBlockDTO$SquareSingleDTO$FrameDTO;J)Lru/ozon/app/android/storefront/widgets/naviBlocks/presentation/single/FrameVO;", "state", "Lru/ozon/app/android/composer/view/WidgetInfo;", "widgetInfo", "invoke", "(Lru/ozon/app/android/storefront/widgets/naviBlocks/data/NaviBlockModel$OneFrameNaviBlockModel;Ll20/d;)Ljava/util/List;", "storefront_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class OneFrameBlockTypeMapper implements Function2<NaviBlockModel.OneFrameNaviBlockModel, d, List<? extends OneFrameNaviBlockVO>> {
    /*  JADX ERROR: JadxRuntimeException in pass: ModVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v0 ru.ozon.app.android.storefront.widgets.naviBlocks.presentation.single.FrameVO, still in use, count: 2, list:
          (r0v0 ru.ozon.app.android.storefront.widgets.naviBlocks.presentation.single.FrameVO) from 0x0051: MOVE (r20v0 ru.ozon.app.android.storefront.widgets.naviBlocks.presentation.single.FrameVO) = (r0v0 ru.ozon.app.android.storefront.widgets.naviBlocks.presentation.single.FrameVO)
          (r0v0 ru.ozon.app.android.storefront.widgets.naviBlocks.presentation.single.FrameVO) from 0x0047: MOVE (r20v2 ru.ozon.app.android.storefront.widgets.naviBlocks.presentation.single.FrameVO) = (r0v0 ru.ozon.app.android.storefront.widgets.naviBlocks.presentation.single.FrameVO)
        	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:162)
        	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:127)
        	at jadx.core.utils.InsnRemover.unbindInsn(InsnRemover.java:91)
        	at jadx.core.utils.InsnRemover.addAndUnbind(InsnRemover.java:57)
        	at jadx.core.dex.visitors.ModVisitor.removeStep(ModVisitor.java:447)
        	at jadx.core.dex.visitors.ModVisitor.visit(ModVisitor.java:96)
        */
    /* JADX WARN: Multi-variable type inference failed */
    private final ru.ozon.app.android.storefront.widgets.naviBlocks.presentation.single.FrameVO mapToVo(ru.ozon.app.android.storefront.widgets.naviBlocks.data.NaviBlocksDTO.NaviBlockDTO.SquareSingleDTO.FrameDTO r22, long r23) {
        /*
            r21 = this;
            ru.ozon.app.android.storefront.widgets.naviBlocks.presentation.single.FrameVO r0 = new ru.ozon.app.android.storefront.widgets.naviBlocks.presentation.single.FrameVO
            java.lang.String r1 = r22.getBackgroundColor()
            java.lang.String r2 = r22.getImage()
            ru.ozon.uni.atoms.data.texts.TextAtom r3 = r22.getTitle()
            r16 = 4095(0xfff, float:5.738E-42)
            r17 = 0
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
            r14 = 0
            r15 = 0
            ru.ozon.uni.atoms.data.text.TextDTO r3 = ru.ozon.uni.atoms.v3.mappers.TextMapperKt.dsTextAtom$default(r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17)
            ru.ozon.uni.atoms.data.texts.TextAtom r4 = r22.getSubtitle()
            if (r4 == 0) goto L51
            r17 = 4095(0xfff, float:5.738E-42)
            r18 = 0
            r6 = r5
            r5 = 0
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
            r16 = r15
            r15 = 0
            r19 = r16
            r16 = 0
            r20 = r0
            r0 = r19
            ru.ozon.uni.atoms.data.text.TextDTO r5 = ru.ozon.uni.atoms.v3.mappers.TextMapperKt.dsTextAtom$default(r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18)
            r4 = r5
            goto L55
        L51:
            r20 = r0
            r0 = r5
            r4 = r0
        L55:
            ru.ozon.uni.atoms.data.badge.Badge r5 = r22.getBadge()
            ru.ozon.uni.atoms.data.AtomActionDTO r6 = r22.getAction()
            if (r6 == 0) goto L68
            java.util.Map r7 = r22.getTrackingInfo()
            ru.ozon.uni.atoms.af.AtomAction r6 = ru.ozon.uni.atoms.data.AtomActionMapperKt.toAtomAction(r6, r7)
            goto L69
        L68:
            r6 = r0
        L69:
            java.util.Map r7 = r22.getTrackingInfo()
            if (r7 == 0) goto L78
            java.lang.Long r8 = java.lang.Long.valueOf(r23)
            r9 = 2
            WZ.t r0 = ru.ozon.app.android.composer.TrackingInfoMapperKt.toTokenizedEvent$default(r7, r8, r0, r9, r0)
        L78:
            r7 = r0
            r0 = r20
            r0.<init>(r1, r2, r3, r4, r5, r6, r7)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: ru.ozon.app.android.storefront.widgets.naviBlocks.data.mappers.OneFrameBlockTypeMapper.mapToVo(ru.ozon.app.android.storefront.widgets.naviBlocks.data.NaviBlocksDTO$NaviBlockDTO$SquareSingleDTO$FrameDTO, long):ru.ozon.app.android.storefront.widgets.naviBlocks.presentation.single.FrameVO");
    }

    @Override // kotlin.jvm.functions.Function2
    @NotNull
    public List<OneFrameNaviBlockVO> invoke(@NotNull NaviBlockModel.OneFrameNaviBlockModel state, @NotNull d widgetInfo) {
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(widgetInfo, "widgetInfo");
        long hashCode = (widgetInfo.d().hashCode() + "_singleBlock_" + state.getPosition()).hashCode();
        return C7714v.a0(new OneFrameNaviBlockVO(hashCode, NaviBlocksCornerMapperKt.getRoundedCorners(state), state.getPosition(), mapToVo(state.getOneFrameBlock(), hashCode)));
    }
}
