package ru.ozon.app.android.search.catalog.components.fullTextSearchHeaderV4.core;

import Sc.o;
import WZ.t;
import WZ.x;
import android.content.Context;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.C7714v;
import kotlin.collections.K;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.h;
import l20.d;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;
import ru.ozon.app.android.data.markdown.MarkDownParser;
import ru.ozon.app.android.search.catalog.components.fullTextSearchHeaderV4.data.FullTextSearchHeaderV4DTO;
import ru.ozon.app.android.search.catalog.components.fullTextSearchHeaderV4.data.MarkupType;
import ru.ozon.app.android.search.catalog.components.fullTextSearchHeaderV4.data.Style;
import ru.ozon.app.android.search.catalog.components.fullTextSearchHeaderV4.presentation.FullTextSearchHeaderV4VO;
import ru.ozon.uni.R$style;
import ru.ozon.uni.android.uikit.common.StyleParser;
import ru.ozon.uni.atoms.html.OzonHtmlParser;
import ru.ozon.uni.atoms.html.spans.OzonUrlSpan;
import ru.ozon.uni.atoms.utils.OzonSpannableString;
import ru.ozon.uni.atoms.utils.OzonSpannableStringKt;
import ru.ozon.uni.core.UniColors;

@Metadata(d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\r\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0001\u0018\u00002*\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u0001j\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0005`\u0006B\u0017\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ\u0013\u0010\r\u001a\u00020\u0005*\u00020\u0002H\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u001b\u0010\r\u001a\u00020\u0012*\u00020\u000f2\u0006\u0010\u0011\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\r\u0010\u0013J\u001b\u0010\r\u001a\u00020\u0015*\u00020\u00142\u0006\u0010\u0011\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\r\u0010\u0016J\u001f\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u001a\u001a\u00020\u0019H\u0002¢\u0006\u0004\b\u001c\u0010\u001dJ\u001f\u0010\u001f\u001a\u00020\u001e2\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u001a\u001a\u00020\u0019H\u0002¢\u0006\u0004\b\u001f\u0010 J*\u0010$\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010!\u001a\u00020\u00022\n\u0010#\u001a\u00060\u0003j\u0002`\"H\u0096\u0002¢\u0006\u0004\b$\u0010%R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010&R\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010'¨\u0006("}, d2 = {"Lru/ozon/app/android/search/catalog/components/fullTextSearchHeaderV4/core/FullTextSearchHeaderV4WidgetMapper;", "Lkotlin/Function2;", "Lru/ozon/app/android/search/catalog/components/fullTextSearchHeaderV4/data/FullTextSearchHeaderV4DTO;", "Ll20/d;", "", "Lru/ozon/app/android/search/catalog/components/fullTextSearchHeaderV4/presentation/FullTextSearchHeaderV4VO;", "Lru/ozon/app/android/composer/widgets/base/WidgetMapper;", "Landroid/content/Context;", "context", "Lru/ozon/app/android/data/markdown/MarkDownParser;", "markDownParser", "<init>", "(Landroid/content/Context;Lru/ozon/app/android/data/markdown/MarkDownParser;)V", "toVO", "(Lru/ozon/app/android/search/catalog/components/fullTextSearchHeaderV4/data/FullTextSearchHeaderV4DTO;)Lru/ozon/app/android/search/catalog/components/fullTextSearchHeaderV4/presentation/FullTextSearchHeaderV4VO;", "Lru/ozon/app/android/search/catalog/components/fullTextSearchHeaderV4/data/FullTextSearchHeaderV4DTO$HeaderDTO;", "", "id", "Lru/ozon/app/android/search/catalog/components/fullTextSearchHeaderV4/presentation/FullTextSearchHeaderV4VO$Header;", "(Lru/ozon/app/android/search/catalog/components/fullTextSearchHeaderV4/data/FullTextSearchHeaderV4DTO$HeaderDTO;J)Lru/ozon/app/android/search/catalog/components/fullTextSearchHeaderV4/presentation/FullTextSearchHeaderV4VO$Header;", "Lru/ozon/app/android/search/catalog/components/fullTextSearchHeaderV4/data/FullTextSearchHeaderV4DTO$CrosslinkDTO;", "Lru/ozon/app/android/search/catalog/components/fullTextSearchHeaderV4/presentation/FullTextSearchHeaderV4VO$CrosslinksVO;", "(Lru/ozon/app/android/search/catalog/components/fullTextSearchHeaderV4/data/FullTextSearchHeaderV4DTO$CrosslinkDTO;J)Lru/ozon/app/android/search/catalog/components/fullTextSearchHeaderV4/presentation/FullTextSearchHeaderV4VO$CrosslinksVO;", "", "text", "Lru/ozon/app/android/search/catalog/components/fullTextSearchHeaderV4/data/MarkupType;", "markupType", "Lru/ozon/uni/atoms/utils/OzonSpannableString;", "mapText", "(Ljava/lang/String;Lru/ozon/app/android/search/catalog/components/fullTextSearchHeaderV4/data/MarkupType;)Lru/ozon/uni/atoms/utils/OzonSpannableString;", "", "parseByMarkupType", "(Ljava/lang/String;Lru/ozon/app/android/search/catalog/components/fullTextSearchHeaderV4/data/MarkupType;)Ljava/lang/CharSequence;", "state", "Lru/ozon/app/android/composer/view/WidgetInfo;", "widgetInfo", "invoke", "(Lru/ozon/app/android/search/catalog/components/fullTextSearchHeaderV4/data/FullTextSearchHeaderV4DTO;Ll20/d;)Ljava/util/List;", "Landroid/content/Context;", "Lru/ozon/app/android/data/markdown/MarkDownParser;", "search_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class FullTextSearchHeaderV4WidgetMapper implements Function2<FullTextSearchHeaderV4DTO, d, List<? extends FullTextSearchHeaderV4VO>> {

    @NotNull
    private final Context context;

    @NotNull
    private final MarkDownParser markDownParser;

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[MarkupType.values().length];
            try {
                iArr[MarkupType.PLAIN.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[MarkupType.MARKDOWN.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[MarkupType.HTML.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public FullTextSearchHeaderV4WidgetMapper(@NotNull Context context, @NotNull MarkDownParser markDownParser) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(markDownParser, "markDownParser");
        this.context = context;
        this.markDownParser = markDownParser;
    }

    private final OzonSpannableString mapText(String text, MarkupType markupType) {
        return OzonUrlSpan.Companion.configUrlSpans$default(OzonUrlSpan.INSTANCE, OzonSpannableStringKt.toOzonSpannableString(parseByMarkupType(text, markupType)), null, Integer.valueOf(StyleParser.INSTANCE.parseColor(this.context, UniColors.TEXT_ACTION.getToken(), UniColors.TEXT_ACTION_ON_LIGHT.getResId())), null, null, 13, null);
    }

    private final CharSequence parseByMarkupType(String text, MarkupType markupType) {
        int i11 = WhenMappings.$EnumSwitchMapping$0[markupType.ordinal()];
        if (i11 == 1) {
            return text;
        }
        if (i11 == 2) {
            return this.markDownParser.parse(text);
        }
        if (i11 == 3) {
            return OzonHtmlParser.INSTANCE.parseHtml(text, 63);
        }
        throw new o();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v0, types: [kotlin.collections.K] */
    /* JADX WARN: Type inference failed for: r5v1, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r5v2, types: [java.util.ArrayList] */
    private final FullTextSearchHeaderV4VO toVO(FullTextSearchHeaderV4DTO fullTextSearchHeaderV4DTO) {
        ?? r52;
        long hashCode = fullTextSearchHeaderV4DTO.hashCode();
        FullTextSearchHeaderV4DTO.HeaderDTO header = fullTextSearchHeaderV4DTO.getHeader();
        FullTextSearchHeaderV4VO.Header vo = header != null ? toVO(header, hashCode) : null;
        List<FullTextSearchHeaderV4DTO.CrosslinkDTO> crosslinks = fullTextSearchHeaderV4DTO.getCrosslinks();
        if (crosslinks != null) {
            List<FullTextSearchHeaderV4DTO.CrosslinkDTO> list = crosslinks;
            r52 = new ArrayList(C7714v.z(list, 10));
            Iterator it = list.iterator();
            while (it.hasNext()) {
                r52.add(toVO((FullTextSearchHeaderV4DTO.CrosslinkDTO) it.next(), hashCode));
            }
        } else {
            r52 = K.f71697a;
        }
        Map<String, TokenizedTrackingInfo> trackingInfo = fullTextSearchHeaderV4DTO.getTrackingInfo();
        return new FullTextSearchHeaderV4VO(hashCode, vo, r52, trackingInfo != null ? x.b(trackingInfo, Long.valueOf(hashCode), null) : null);
    }

    @Override // kotlin.jvm.functions.Function2
    @NotNull
    public List<FullTextSearchHeaderV4VO> invoke(@NotNull FullTextSearchHeaderV4DTO state, @NotNull d widgetInfo) {
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(widgetInfo, "widgetInfo");
        return C7714v.a0(toVO(state));
    }

    private final FullTextSearchHeaderV4VO.Header toVO(FullTextSearchHeaderV4DTO.HeaderDTO headerDTO, long j11) {
        int i11;
        String text = headerDTO.getText();
        OzonSpannableString mapText = (text == null || h.K(text)) ? null : mapText(headerDTO.getText(), headerDTO.getMarkupType());
        Map<String, TokenizedTrackingInfo> trackingInfo = headerDTO.getTrackingInfo();
        t b11 = trackingInfo != null ? x.b(trackingInfo, Long.valueOf(j11), null) : null;
        if (headerDTO.getStyle() == Style.BODY_M) {
            i11 = R$style.TextStyle_Body_M;
        } else {
            i11 = R$style.TextStyle_Body_L;
        }
        return new FullTextSearchHeaderV4VO.Header(mapText, b11, i11);
    }

    private final FullTextSearchHeaderV4VO.CrosslinksVO toVO(FullTextSearchHeaderV4DTO.CrosslinkDTO crosslinkDTO, long j11) {
        boolean searchIconShown = crosslinkDTO.getSearchIconShown();
        OzonSpannableString mapText = mapText(crosslinkDTO.getText(), crosslinkDTO.getMarkupType());
        String deeplink = crosslinkDTO.getDeeplink();
        Map<String, TokenizedTrackingInfo> trackingInfo = crosslinkDTO.getTrackingInfo();
        return new FullTextSearchHeaderV4VO.CrosslinksVO(searchIconShown, mapText, deeplink, trackingInfo != null ? x.b(trackingInfo, Long.valueOf(j11), null) : null);
    }
}
