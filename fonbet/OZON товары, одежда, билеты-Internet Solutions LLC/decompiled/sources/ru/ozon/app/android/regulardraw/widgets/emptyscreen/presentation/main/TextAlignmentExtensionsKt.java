package ru.ozon.app.android.regulardraw.widgets.emptyscreen.presentation.main;

import Sc.o;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.regulardraw.widgets.emptyscreen.data.Text$Alignment;

@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0000\u001a\f\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u0000¨\u0006\u0003"}, d2 = {"resolveToGravity", "", "Lru/ozon/app/android/regulardraw/widgets/emptyscreen/data/Text$Alignment;", "regulardraw_prodGoogleAllVendorsRelease"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class TextAlignmentExtensionsKt {

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[Text$Alignment.values().length];
            try {
                iArr[Text$Alignment.LEFT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[Text$Alignment.CENTER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[Text$Alignment.RIGHT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public static final int resolveToGravity(@NotNull Text$Alignment text$Alignment) {
        Intrinsics.checkNotNullParameter(text$Alignment, "<this>");
        int i11 = WhenMappings.$EnumSwitchMapping$0[text$Alignment.ordinal()];
        if (i11 == 1) {
            return 3;
        }
        if (i11 == 2) {
            return 1;
        }
        if (i11 == 3) {
            return 5;
        }
        throw new o();
    }
}
