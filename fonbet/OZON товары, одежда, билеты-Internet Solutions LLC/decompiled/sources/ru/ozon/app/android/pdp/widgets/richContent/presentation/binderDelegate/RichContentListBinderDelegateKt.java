package ru.ozon.app.android.pdp.widgets.richContent.presentation.binderDelegate;

import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.d;
import kotlin.Metadata;
import ru.ozon.uni.android.atom.text.TextAtomV2View;
import ru.ozon.uni.android.uikit.extensions.view.ViewExtKt;
import ru.ozon.uni.atoms.data.text.TextDTO;
import ru.ozon.uni.atoms.v3.holders.text.TextHolderKt;

@Metadata(d1 = {"\u0000\u0018\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a\u001e\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006H\u0002¨\u0006\u0007"}, d2 = {"bindText", "", "Landroidx/constraintlayout/widget/ConstraintLayout;", "tv", "Lru/ozon/uni/android/atom/text/TextAtomV2View;", "item", "Lru/ozon/uni/atoms/data/text/TextDTO;", "pdp_prodGoogleAllVendorsRelease"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class RichContentListBinderDelegateKt {

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[TextDTO.TextAlignment.values().length];
            try {
                iArr[TextDTO.TextAlignment.CENTER.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[TextDTO.TextAlignment.LEADING.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[TextDTO.TextAlignment.TRAILING.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void bindText(ConstraintLayout constraintLayout, TextAtomV2View textAtomV2View, TextDTO textDTO) {
        float f7;
        if (textDTO == null) {
            ViewExtKt.gone(textAtomV2View);
            return;
        }
        ViewExtKt.show(textAtomV2View);
        TextHolderKt.bind$default(textAtomV2View, textDTO, null, 2, null);
        d dVar = new d();
        dVar.p(constraintLayout);
        TextDTO.TextAlignment textAlignment = textDTO.getTextAlignment();
        int i11 = textAlignment == null ? -1 : WhenMappings.$EnumSwitchMapping$0[textAlignment.ordinal()];
        if (i11 != 1) {
            f7 = 0.0f;
            if (i11 != 2 && i11 == 3) {
                f7 = 1.0f;
            }
        } else {
            f7 = 0.5f;
        }
        dVar.c0(f7, textAtomV2View.getId());
        dVar.f(constraintLayout);
    }
}
