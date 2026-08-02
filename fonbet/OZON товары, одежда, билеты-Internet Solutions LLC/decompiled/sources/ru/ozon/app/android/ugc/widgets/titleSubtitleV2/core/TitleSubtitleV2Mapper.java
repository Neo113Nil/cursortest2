package ru.ozon.app.android.ugc.widgets.titleSubtitleV2.core;

import Sc.o;
import e1.InterfaceC6250b;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C7714v;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import l20.d;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.ugc.widgets.titleSubtitleV2.data.TitleSubtitleV2DTO;
import ru.ozon.app.android.ugc.widgets.titleSubtitleV2.presentation.TitleSubtitleVO;

@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0001\u0018\u00002*\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u0001j\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0005`\u0006B\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J&\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0011\u001a\u00020\u00022\u0006\u0010\u0012\u001a\u00020\u0003H\u0096\u0002¢\u0006\u0004\b\u0013\u0010\u0014¨\u0006\u0015"}, d2 = {"Lru/ozon/app/android/ugc/widgets/titleSubtitleV2/core/TitleSubtitleV2Mapper;", "Lkotlin/Function2;", "Lru/ozon/app/android/ugc/widgets/titleSubtitleV2/data/TitleSubtitleV2DTO;", "Ll20/d;", "", "Lru/ozon/app/android/ugc/widgets/titleSubtitleV2/presentation/TitleSubtitleVO;", "Lru/ozon/app/android/composer/widgets/base/WidgetMapper;", "<init>", "()V", "Lru/ozon/app/android/ugc/widgets/titleSubtitleV2/data/TitleSubtitleV2DTO$Alignment;", "alignment", "", "getAlignment", "(Lru/ozon/app/android/ugc/widgets/titleSubtitleV2/data/TitleSubtitleV2DTO$Alignment;)I", "Le1/b$b;", "getComposeAlignment", "(Lru/ozon/app/android/ugc/widgets/titleSubtitleV2/data/TitleSubtitleV2DTO$Alignment;)Le1/b$b;", "state", "widgetInfo", "invoke", "(Lru/ozon/app/android/ugc/widgets/titleSubtitleV2/data/TitleSubtitleV2DTO;Ll20/d;)Ljava/util/List;", "ugc_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class TitleSubtitleV2Mapper implements Function2<TitleSubtitleV2DTO, d, List<? extends TitleSubtitleVO>> {

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[TitleSubtitleV2DTO.Alignment.values().length];
            try {
                iArr[TitleSubtitleV2DTO.Alignment.START.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[TitleSubtitleV2DTO.Alignment.INVALID.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[TitleSubtitleV2DTO.Alignment.CENTER.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    private final int getAlignment(TitleSubtitleV2DTO.Alignment alignment) {
        int i11 = WhenMappings.$EnumSwitchMapping$0[alignment.ordinal()];
        if (i11 == 1 || i11 == 2) {
            return 8388611;
        }
        if (i11 == 3) {
            return 17;
        }
        throw new o();
    }

    private final InterfaceC6250b.InterfaceC0966b getComposeAlignment(TitleSubtitleV2DTO.Alignment alignment) {
        int i11 = WhenMappings.$EnumSwitchMapping$0[alignment.ordinal()];
        if (i11 == 1 || i11 == 2) {
            return InterfaceC6250b.a.k();
        }
        if (i11 == 3) {
            return InterfaceC6250b.a.g();
        }
        throw new o();
    }

    @Override // kotlin.jvm.functions.Function2
    @NotNull
    public List<TitleSubtitleVO> invoke(@NotNull TitleSubtitleV2DTO state, @NotNull d widgetInfo) {
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(widgetInfo, "widgetInfo");
        return C7714v.a0(new TitleSubtitleVO(widgetInfo.d().hashCode(), state.getTitle(), state.getSubtitle(), getAlignment(state.getAlignment()), getComposeAlignment(state.getAlignment())));
    }
}
