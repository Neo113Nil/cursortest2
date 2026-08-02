package ru.ozon.app.android.pdp.widgets.aspectsCompactV2.core.footer;

import android.text.style.URLSpan;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.C7705l;
import kotlin.collections.C7714v;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import l20.d;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.pdp.widgets.aspectsCompactV2.data.AspectCompactV2Footer;
import ru.ozon.app.android.pdp.widgets.aspectsCompactV2.presentation.AspectCompactV2FooterVO;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.data.text.TextDTO;
import ru.ozon.uni.atoms.utils.OzonSpannableString;
import ru.ozon.uni.core.UniColors;

@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0001\u0018\u00002*\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u0001j\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0005`\u0006B\t\b\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u001b\u0010\r\u001a\u00020\f*\u00020\t2\u0006\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\r\u0010\u000eJ&\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u000f\u001a\u00020\u00022\u0006\u0010\u0010\u001a\u00020\u0003H\u0096\u0002¢\u0006\u0004\b\u0011\u0010\u0012¨\u0006\u0013"}, d2 = {"Lru/ozon/app/android/pdp/widgets/aspectsCompactV2/core/footer/AspectV2FooterMapper;", "Lkotlin/Function2;", "Lru/ozon/app/android/pdp/widgets/aspectsCompactV2/data/AspectCompactV2Footer;", "Ll20/d;", "", "Lru/ozon/app/android/pdp/widgets/aspectsCompactV2/presentation/AspectCompactV2FooterVO;", "Lru/ozon/app/android/composer/widgets/base/WidgetMapper;", "<init>", "()V", "Lru/ozon/uni/atoms/data/text/TextDTO;", "", "isNestedPage", "Lru/ozon/app/android/pdp/widgets/aspectsCompactV2/presentation/AspectCompactV2FooterVO$TextButton;", "toVO", "(Lru/ozon/uni/atoms/data/text/TextDTO;Z)Lru/ozon/app/android/pdp/widgets/aspectsCompactV2/presentation/AspectCompactV2FooterVO$TextButton;", "state", "widgetInfo", "invoke", "(Lru/ozon/app/android/pdp/widgets/aspectsCompactV2/data/AspectCompactV2Footer;Ll20/d;)Ljava/util/List;", "pdp_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class AspectV2FooterMapper implements Function2<AspectCompactV2Footer, d, List<? extends AspectCompactV2FooterVO>> {
    private final AspectCompactV2FooterVO.TextButton toVO(TextDTO textDTO, boolean z11) {
        TextDTO textDTO2;
        String url;
        OzonSpannableString text = textDTO.getText();
        Object[] spans = text.getSpans(0, text.length(), URLSpan.class);
        Intrinsics.checkNotNullExpressionValue(spans, "getSpans(...)");
        URLSpan uRLSpan = (URLSpan) C7705l.F(spans);
        AtomAction openComposerNestedPage = (uRLSpan == null || (url = uRLSpan.getURL()) == null) ? null : z11 ? new AtomAction.OpenComposerNestedPage((String) null, url, (AtomAction.CurtainShowConfig) null, false, (Map) null, 13, (DefaultConstructorMarker) null) : new AtomAction.Move(url, null, null, null, 10, null);
        if (openComposerNestedPage != null) {
            String obj = textDTO.getText().toString();
            Intrinsics.checkNotNullExpressionValue(obj, "toString(...)");
            textDTO2 = TextDTO.copy$default(textDTO, new OzonSpannableString(obj), null, null, null, null, null, null, null, UniColors.TEXT_ACTION.getToken(), null, null, null, null, false, null, null, null, null, null, 524030, null);
        } else {
            textDTO2 = textDTO;
        }
        return new AspectCompactV2FooterVO.TextButton(textDTO2, openComposerNestedPage);
    }

    @Override // kotlin.jvm.functions.Function2
    @NotNull
    public List<AspectCompactV2FooterVO> invoke(@NotNull AspectCompactV2Footer state, @NotNull d widgetInfo) {
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(widgetInfo, "widgetInfo");
        long hashCode = widgetInfo.d().hashCode();
        TextDTO leftButton = state.getLeftButton();
        AspectCompactV2FooterVO.TextButton vo = leftButton != null ? toVO(leftButton, false) : null;
        TextDTO rightButton = state.getRightButton();
        return C7714v.a0(new AspectCompactV2FooterVO(hashCode, vo, rightButton != null ? toVO(rightButton, true) : null));
    }
}
