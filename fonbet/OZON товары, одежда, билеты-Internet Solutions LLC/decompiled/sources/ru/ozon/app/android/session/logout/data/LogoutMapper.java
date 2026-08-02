package ru.ozon.app.android.session.logout.data;

import Ih.a;
import Sc.o;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C7714v;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import l20.d;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.session.logout.data.LogoutDTO;
import ru.ozon.app.android.session.logout.presentation.LogoutVO;
import ru.ozon.uni.android.uikit.common.StyleParser;

@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002*\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u0001j\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0005`\u0006B\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u001b\u0010\u000b\u001a\u00020\u0005*\u00020\u00022\u0006\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0013\u0010\u000f\u001a\u00020\u000e*\u00020\rH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J*\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0011\u001a\u00020\u00022\n\u0010\u0013\u001a\u00060\u0003j\u0002`\u0012H\u0096\u0002¢\u0006\u0004\b\u0014\u0010\u0015¨\u0006\u0016"}, d2 = {"Lru/ozon/app/android/session/logout/data/LogoutMapper;", "Lkotlin/Function2;", "Lru/ozon/app/android/session/logout/data/LogoutDTO;", "Ll20/d;", "", "Lru/ozon/app/android/session/logout/presentation/LogoutVO;", "Lru/ozon/app/android/composer/widgets/base/WidgetMapper;", "<init>", "()V", "", "widgetId", "toVO", "(Lru/ozon/app/android/session/logout/data/LogoutDTO;J)Lru/ozon/app/android/session/logout/presentation/LogoutVO;", "Lru/ozon/app/android/session/logout/data/LogoutDTO$Alignment;", "", "toGravity", "(Lru/ozon/app/android/session/logout/data/LogoutDTO$Alignment;)I", "dto", "Lru/ozon/app/android/composer/view/WidgetInfo;", "widgetInfo", "invoke", "(Lru/ozon/app/android/session/logout/data/LogoutDTO;Ll20/d;)Ljava/util/List;", "session_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class LogoutMapper implements Function2<LogoutDTO, d, List<? extends LogoutVO>> {

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    /* loaded from: classes2.dex */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[LogoutDTO.Alignment.values().length];
            try {
                iArr[LogoutDTO.Alignment.CENTER.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[LogoutDTO.Alignment.LEFT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    private final int toGravity(LogoutDTO.Alignment alignment) {
        int i11 = WhenMappings.$EnumSwitchMapping$0[alignment.ordinal()];
        if (i11 == 1) {
            return 17;
        }
        if (i11 == 2) {
            return 8388627;
        }
        throw new o();
    }

    private final LogoutVO toVO(LogoutDTO logoutDTO, long j11) {
        String title = logoutDTO.getTitle();
        boolean showSeparator = logoutDTO.getShowSeparator();
        int gravity = toGravity(logoutDTO.getAlignment());
        String textColor = logoutDTO.getTextColor();
        if (textColor == null) {
            textColor = StyleParser.OzColor.OZ_SEMANTIC_COLOR_ACCENT_ALERT.getValue();
        }
        return new LogoutVO(j11, title, gravity, textColor, showSeparator);
    }

    @Override // kotlin.jvm.functions.Function2
    @NotNull
    public List<LogoutVO> invoke(@NotNull LogoutDTO dto, @NotNull d widgetInfo) {
        Intrinsics.checkNotNullParameter(dto, "dto");
        Intrinsics.checkNotNullParameter(widgetInfo, "widgetInfo");
        return C7714v.a0(toVO(dto, a.a("logoutWidget", dto.getTitle())));
    }
}
