package ru.ozon.app.android.ugc.core.widgets.iconWidget.core;

import Sc.o;
import WZ.t;
import WZ.x;
import e1.InterfaceC6250b;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.C7714v;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import l20.d;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;
import ru.ozon.app.android.ugc.core.widgets.iconWidget.data.IconWidgetDTO;
import ru.ozon.app.android.ugc.core.widgets.iconWidget.presentation.IconWidgetVO;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.data.AtomActionDTO;
import ru.ozon.uni.atoms.data.AtomActionMapperKt;
import ru.ozon.uni.atoms.data.common.Paddings;
import ru.ozon.uni.atoms.data.icon.IconDTO;

@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0001\u0018\u00002*\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u0001j\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0005`\u0006B\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u0019\u0010\f\u001a\u00020\u000b2\b\u0010\n\u001a\u0004\u0018\u00010\tH\u0002¢\u0006\u0004\b\f\u0010\rJ\u0019\u0010\u000f\u001a\u00020\u000e2\b\u0010\n\u001a\u0004\u0018\u00010\tH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J&\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0011\u001a\u00020\u00022\u0006\u0010\u0012\u001a\u00020\u0003H\u0096\u0002¢\u0006\u0004\b\u0013\u0010\u0014¨\u0006\u0015"}, d2 = {"Lru/ozon/app/android/ugc/core/widgets/iconWidget/core/IconWidgetMapper;", "Lkotlin/Function2;", "Lru/ozon/app/android/ugc/core/widgets/iconWidget/data/IconWidgetDTO;", "Ll20/d;", "", "Lru/ozon/app/android/ugc/core/widgets/iconWidget/presentation/IconWidgetVO;", "Lru/ozon/app/android/composer/widgets/base/WidgetMapper;", "<init>", "()V", "Lru/ozon/app/android/ugc/core/widgets/iconWidget/data/IconWidgetDTO$Alignment;", "alignment", "", "getAlignment", "(Lru/ozon/app/android/ugc/core/widgets/iconWidget/data/IconWidgetDTO$Alignment;)I", "Le1/b;", "getComposeAlignment", "(Lru/ozon/app/android/ugc/core/widgets/iconWidget/data/IconWidgetDTO$Alignment;)Le1/b;", "state", "widgetInfo", "invoke", "(Lru/ozon/app/android/ugc/core/widgets/iconWidget/data/IconWidgetDTO;Ll20/d;)Ljava/util/List;", "core_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class IconWidgetMapper implements Function2<IconWidgetDTO, d, List<? extends IconWidgetVO>> {

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[IconWidgetDTO.Alignment.values().length];
            try {
                iArr[IconWidgetDTO.Alignment.LEFT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[IconWidgetDTO.Alignment.RIGHT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[IconWidgetDTO.Alignment.CENTER.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    private final int getAlignment(IconWidgetDTO.Alignment alignment) {
        int i11 = alignment == null ? -1 : WhenMappings.$EnumSwitchMapping$0[alignment.ordinal()];
        if (i11 == -1) {
            return 17;
        }
        if (i11 == 1) {
            return 8388627;
        }
        if (i11 == 2) {
            return 8388629;
        }
        if (i11 == 3) {
            return 17;
        }
        throw new o();
    }

    private final InterfaceC6250b getComposeAlignment(IconWidgetDTO.Alignment alignment) {
        int i11 = alignment == null ? -1 : WhenMappings.$EnumSwitchMapping$0[alignment.ordinal()];
        if (i11 != -1) {
            if (i11 == 1) {
                return InterfaceC6250b.a.h();
            }
            if (i11 == 2) {
                return InterfaceC6250b.a.f();
            }
            if (i11 != 3) {
                throw new o();
            }
        }
        return InterfaceC6250b.a.e();
    }

    @Override // kotlin.jvm.functions.Function2
    @NotNull
    public List<IconWidgetVO> invoke(@NotNull IconWidgetDTO state, @NotNull d widgetInfo) {
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(widgetInfo, "widgetInfo");
        long hashCode = widgetInfo.d().hashCode();
        IconDTO icon = state.getIcon();
        AtomActionDTO action = state.getAction();
        t tVar = null;
        AtomAction atomAction = action != null ? AtomActionMapperKt.toAtomAction(action, state.getTrackingInfo()) : null;
        Paddings topPadding = state.getTopPadding();
        if (topPadding == null) {
            topPadding = Paddings.NONE;
        }
        Paddings bottomPadding = state.getBottomPadding();
        if (bottomPadding == null) {
            bottomPadding = Paddings.NONE;
        }
        Paddings leftPadding = state.getLeftPadding();
        if (leftPadding == null) {
            leftPadding = Paddings.NONE;
        }
        Paddings rightPadding = state.getRightPadding();
        if (rightPadding == null) {
            rightPadding = Paddings.NONE;
        }
        int alignment = getAlignment(state.getAlignment());
        InterfaceC6250b composeAlignment = getComposeAlignment(state.getAlignment());
        String backgroundColor = state.getBackgroundColor();
        Map<String, TokenizedTrackingInfo> trackingInfo = state.getTrackingInfo();
        if (trackingInfo != null) {
            Long valueOf = Long.valueOf(hashCode);
            Intrinsics.checkNotNullParameter(trackingInfo, "<this>");
            tVar = x.b(trackingInfo, valueOf, null);
        }
        return C7714v.a0(new IconWidgetVO(hashCode, icon, atomAction, topPadding, bottomPadding, leftPadding, rightPadding, alignment, backgroundColor, composeAlignment, tVar, state.isSticky(), state.getScrollColor()));
    }
}
