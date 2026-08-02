package ru.ozon.app.android.widgets.debug.transparenttopwidget;

import Sc.o;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C7714v;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import l20.d;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.widgets.debug.transparenttopwidget.TransparentPlaceholderDTO;
import ru.ozon.app.android.widgets.debug.transparenttopwidget.TransparentPlaceholderVO;

@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002*\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u0001j\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0005`\u0006B\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u0013\u0010\u000b\u001a\u00020\n*\u00020\tH\u0002¢\u0006\u0004\b\u000b\u0010\fJ*\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\r\u001a\u00020\u00022\n\u0010\u000f\u001a\u00060\u0003j\u0002`\u000eH\u0096\u0002¢\u0006\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, d2 = {"Lru/ozon/app/android/widgets/debug/transparenttopwidget/TransparentPlaceholderMapper;", "Lkotlin/Function2;", "Lru/ozon/app/android/widgets/debug/transparenttopwidget/TransparentPlaceholderDTO;", "Ll20/d;", "", "Lru/ozon/app/android/widgets/debug/transparenttopwidget/TransparentPlaceholderVO;", "Lru/ozon/app/android/composer/widgets/base/WidgetMapper;", "<init>", "()V", "Lru/ozon/app/android/widgets/debug/transparenttopwidget/TransparentPlaceholderDTO$Position;", "Lru/ozon/app/android/widgets/debug/transparenttopwidget/TransparentPlaceholderVO$Position;", "toPosition", "(Lru/ozon/app/android/widgets/debug/transparenttopwidget/TransparentPlaceholderDTO$Position;)Lru/ozon/app/android/widgets/debug/transparenttopwidget/TransparentPlaceholderVO$Position;", "dto", "Lru/ozon/app/android/composer/view/WidgetInfo;", "widgetInfo", "invoke", "(Lru/ozon/app/android/widgets/debug/transparenttopwidget/TransparentPlaceholderDTO;Ll20/d;)Ljava/util/List;", "widgets_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class TransparentPlaceholderMapper implements Function2<TransparentPlaceholderDTO, d, List<? extends TransparentPlaceholderVO>> {

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[TransparentPlaceholderDTO.Position.values().length];
            try {
                iArr[TransparentPlaceholderDTO.Position.TOP.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[TransparentPlaceholderDTO.Position.BOTTOM.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    private final TransparentPlaceholderVO.Position toPosition(TransparentPlaceholderDTO.Position position) {
        int i11 = WhenMappings.$EnumSwitchMapping$0[position.ordinal()];
        if (i11 == 1) {
            return TransparentPlaceholderVO.Position.TOP;
        }
        if (i11 == 2) {
            return TransparentPlaceholderVO.Position.BOTTOM;
        }
        throw new o();
    }

    @Override // kotlin.jvm.functions.Function2
    @NotNull
    public List<TransparentPlaceholderVO> invoke(@NotNull TransparentPlaceholderDTO dto, @NotNull d widgetInfo) {
        Intrinsics.checkNotNullParameter(dto, "dto");
        Intrinsics.checkNotNullParameter(widgetInfo, "widgetInfo");
        return C7714v.a0(new TransparentPlaceholderVO(widgetInfo.d().hashCode(), dto.getHeight(), toPosition(dto.getPosition())));
    }
}
