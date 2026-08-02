package ru.ozon.app.android.pdp.widgets.richContent.core;

import A00.a;
import Sc.o;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.pdp.widgets.richContent.data.RichContentDTO;
import ru.ozon.app.android.pdp.widgets.richContent.presentation.ImagePositionVO;
import ru.ozon.app.android.pdp.widgets.richContent.presentation.RichContentVoWrapper;
import ru.ozon.uni.atoms.data.text.TextDTO;
import ru.ozon.uni.atoms.v3.mappers.TextMapperKt;

@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\u001a\u0013\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0000¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u0015\u0010\u0006\u001a\u00020\u0005*\u0004\u0018\u00010\u0004H\u0000¢\u0006\u0004\b\u0006\u0010\u0007\u001a\u0013\u0010\n\u001a\u00020\t*\u00020\bH\u0000¢\u0006\u0004\b\n\u0010\u000b\u001a\u0015\u0010\u000e\u001a\u00020\r*\u0004\u0018\u00010\fH\u0000¢\u0006\u0004\b\u000e\u0010\u000f\u001a\u001d\u0010\u0014\u001a\u0004\u0018\u00010\u0013*\u00020\u00102\u0006\u0010\u0012\u001a\u00020\u0011H\u0000¢\u0006\u0004\b\u0014\u0010\u0015¨\u0006\u0016"}, d2 = {"Lru/ozon/app/android/pdp/widgets/richContent/data/RichContentDTO$AlignedText;", "Lru/ozon/uni/atoms/data/text/TextDTO;", "getAlignedVO", "(Lru/ozon/app/android/pdp/widgets/richContent/data/RichContentDTO$AlignedText;)Lru/ozon/uni/atoms/data/text/TextDTO;", "Lru/ozon/app/android/pdp/widgets/richContent/data/RichContentDTO$AlignedText$Alignment;", "Lru/ozon/uni/atoms/data/text/TextDTO$TextAlignment;", "getAlignment", "(Lru/ozon/app/android/pdp/widgets/richContent/data/RichContentDTO$AlignedText$Alignment;)Lru/ozon/uni/atoms/data/text/TextDTO$TextAlignment;", "Lru/ozon/app/android/pdp/widgets/richContent/data/RichContentDTO$Content;", "", "widgetPosition", "(Lru/ozon/app/android/pdp/widgets/richContent/data/RichContentDTO$Content;)I", "Lru/ozon/app/android/pdp/widgets/richContent/data/RichContentDTO$ImagePosition;", "Lru/ozon/app/android/pdp/widgets/richContent/presentation/ImagePositionVO;", "toVo", "(Lru/ozon/app/android/pdp/widgets/richContent/data/RichContentDTO$ImagePosition;)Lru/ozon/app/android/pdp/widgets/richContent/presentation/ImagePositionVO;", "Lru/ozon/app/android/pdp/widgets/richContent/presentation/RichContentVoWrapper;", "LA00/a$J$a;", "update", "", "isExpanded", "(Lru/ozon/app/android/pdp/widgets/richContent/presentation/RichContentVoWrapper;LA00/a$J$a;)Ljava/lang/Boolean;", "pdp_prodGoogleAllVendorsRelease"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class RichContentUtilsKt {

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;

        static {
            int[] iArr = new int[RichContentDTO.AlignedText.Alignment.values().length];
            try {
                iArr[RichContentDTO.AlignedText.Alignment.LEFT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[RichContentDTO.AlignedText.Alignment.RIGHT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[RichContentDTO.AlignedText.Alignment.CENTER.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[RichContentDTO.ImagePosition.values().length];
            try {
                iArr2[RichContentDTO.ImagePosition.FILL.ordinal()] = 1;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr2[RichContentDTO.ImagePosition.FIT.ordinal()] = 2;
            } catch (NoSuchFieldError unused5) {
            }
            $EnumSwitchMapping$1 = iArr2;
        }
    }

    @NotNull
    public static final TextDTO getAlignedVO(@NotNull RichContentDTO.AlignedText alignedText) {
        Intrinsics.checkNotNullParameter(alignedText, "<this>");
        return TextDTO.copy$default(TextMapperKt.getDsTextAtom(alignedText.getText()), null, getAlignment(alignedText.getAlign()), null, null, null, null, null, null, null, null, null, null, null, true, null, null, null, null, null, 516093, null);
    }

    @NotNull
    public static final TextDTO.TextAlignment getAlignment(RichContentDTO.AlignedText.Alignment alignment) {
        int i11 = alignment == null ? -1 : WhenMappings.$EnumSwitchMapping$0[alignment.ordinal()];
        return i11 != 1 ? i11 != 2 ? i11 != 3 ? TextDTO.TextAlignment.LEADING : TextDTO.TextAlignment.CENTER : TextDTO.TextAlignment.TRAILING : TextDTO.TextAlignment.LEADING;
    }

    public static final Boolean isExpanded(@NotNull RichContentVoWrapper richContentVoWrapper, @NotNull a.J.InterfaceC0007a update) {
        Intrinsics.checkNotNullParameter(richContentVoWrapper, "<this>");
        Intrinsics.checkNotNullParameter(update, "update");
        RichContentExpandStateChangedUpdateKey richContentExpandStateChangedUpdateKey = update instanceof RichContentExpandStateChangedUpdateKey ? (RichContentExpandStateChangedUpdateKey) update : null;
        if (richContentExpandStateChangedUpdateKey != null) {
            return Boolean.valueOf(richContentExpandStateChangedUpdateKey.getVisibleItemsCount() < richContentVoWrapper.getPosition() && !richContentVoWrapper.getIsExpanded());
        }
        return null;
    }

    @NotNull
    public static final ImagePositionVO toVo(RichContentDTO.ImagePosition imagePosition) {
        int i11 = imagePosition == null ? -1 : WhenMappings.$EnumSwitchMapping$1[imagePosition.ordinal()];
        if (i11 == -1 || i11 == 1) {
            return ImagePositionVO.FILL;
        }
        if (i11 == 2) {
            return ImagePositionVO.FIT;
        }
        throw new o();
    }

    public static final int widgetPosition(@NotNull RichContentDTO.Content content) {
        Intrinsics.checkNotNullParameter(content, "<this>");
        Integer position = content.getPosition();
        if (position != null) {
            return position.intValue();
        }
        return 0;
    }
}
