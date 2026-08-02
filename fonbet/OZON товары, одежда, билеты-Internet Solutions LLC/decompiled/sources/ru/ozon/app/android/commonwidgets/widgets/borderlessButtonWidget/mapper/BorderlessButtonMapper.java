package ru.ozon.app.android.commonwidgets.widgets.borderlessButtonWidget.mapper;

import Sc.o;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C7714v;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import l20.d;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.commonwidgets.widgets.borderlessButtonWidget.data.BorderlessButtonDTO;
import ru.ozon.app.android.commonwidgets.widgets.borderlessButtonWidget.presentation.BorderlessButtonVO;

@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002*\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u0001j\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0005`\u0006B\t\b\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u001b\u0010\u000b\u001a\u00020\u0005*\u00020\u00022\u0006\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0013\u0010\u000f\u001a\u00020\u000e*\u00020\rH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J*\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0011\u001a\u00020\u00022\n\u0010\u0013\u001a\u00060\u0003j\u0002`\u0012H\u0096\u0002¢\u0006\u0004\b\u0014\u0010\u0015¨\u0006\u0016"}, d2 = {"Lru/ozon/app/android/commonwidgets/widgets/borderlessButtonWidget/mapper/BorderlessButtonMapper;", "Lkotlin/Function2;", "Lru/ozon/app/android/commonwidgets/widgets/borderlessButtonWidget/data/BorderlessButtonDTO;", "Ll20/d;", "", "Lru/ozon/app/android/commonwidgets/widgets/borderlessButtonWidget/presentation/BorderlessButtonVO;", "Lru/ozon/app/android/composer/widgets/base/WidgetMapper;", "<init>", "()V", "", "stateId", "toVo", "(Lru/ozon/app/android/commonwidgets/widgets/borderlessButtonWidget/data/BorderlessButtonDTO;Ljava/lang/String;)Lru/ozon/app/android/commonwidgets/widgets/borderlessButtonWidget/presentation/BorderlessButtonVO;", "Lru/ozon/app/android/commonwidgets/widgets/borderlessButtonWidget/data/BorderlessButtonDTO$Align;", "", "toGravity", "(Lru/ozon/app/android/commonwidgets/widgets/borderlessButtonWidget/data/BorderlessButtonDTO$Align;)I", "state", "Lru/ozon/app/android/composer/view/WidgetInfo;", "widgetInfo", "invoke", "(Lru/ozon/app/android/commonwidgets/widgets/borderlessButtonWidget/data/BorderlessButtonDTO;Ll20/d;)Ljava/util/List;", "commonwidgets_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class BorderlessButtonMapper implements Function2<BorderlessButtonDTO, d, List<? extends BorderlessButtonVO>> {

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[BorderlessButtonDTO.Align.values().length];
            try {
                iArr[BorderlessButtonDTO.Align.LEFT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[BorderlessButtonDTO.Align.CENTER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[BorderlessButtonDTO.Align.RIGHT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    private final int toGravity(BorderlessButtonDTO.Align align) {
        int i11 = WhenMappings.$EnumSwitchMapping$0[align.ordinal()];
        if (i11 == 1) {
            return 3;
        }
        if (i11 == 2) {
            return 17;
        }
        if (i11 == 3) {
            return 5;
        }
        throw new o();
    }

    private final BorderlessButtonVO toVo(BorderlessButtonDTO borderlessButtonDTO, String str) {
        return new BorderlessButtonVO(str.hashCode(), borderlessButtonDTO.getButton(), toGravity(borderlessButtonDTO.getAlign()));
    }

    @Override // kotlin.jvm.functions.Function2
    @NotNull
    public List<BorderlessButtonVO> invoke(@NotNull BorderlessButtonDTO state, @NotNull d widgetInfo) {
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(widgetInfo, "widgetInfo");
        return C7714v.a0(toVo(state, widgetInfo.d()));
    }
}
