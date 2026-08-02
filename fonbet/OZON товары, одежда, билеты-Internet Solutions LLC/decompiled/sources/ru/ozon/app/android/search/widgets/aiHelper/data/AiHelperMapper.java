package ru.ozon.app.android.search.widgets.aiHelper.data;

import Sc.o;
import WZ.x;
import android.content.Context;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.C7714v;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import l20.d;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;
import ru.ozon.app.android.data.markdown.MarkDownParser;
import ru.ozon.app.android.search.widgets.aiHelper.data.AiHelperDTO;
import ru.ozon.app.android.search.widgets.aiHelper.presentation.AiHelperVO;
import ru.ozon.uni.android.uikit.common.StyleParser;
import ru.ozon.uni.atoms.data.AtomActionDTO;
import ru.ozon.uni.atoms.html.OzonHtmlParser;
import ru.ozon.uni.atoms.html.spans.OzonUrlSpan;
import ru.ozon.uni.atoms.utils.OzonSpannableString;
import ru.ozon.uni.atoms.utils.OzonSpannableStringKt;
import ru.ozon.uni.core.UniColors;

@Metadata(d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\r\n\u0002\b\t\b\u0001\u0018\u00002*\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u0001j\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0005`\u0006B\u0017\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ\u0013\u0010\r\u001a\u00020\u0005*\u00020\u0002H\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u0013\u0010\u0011\u001a\u00020\u0010*\u00020\u000fH\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u0013\u0010\u0011\u001a\u00020\u0014*\u00020\u0013H\u0002¢\u0006\u0004\b\u0011\u0010\u0015J%\u0010\u001b\u001a\u0004\u0018\u00010\u001a2\b\u0010\u0017\u001a\u0004\u0018\u00010\u00162\b\u0010\u0019\u001a\u0004\u0018\u00010\u0018H\u0002¢\u0006\u0004\b\u001b\u0010\u001cJ%\u0010\u001e\u001a\u0004\u0018\u00010\u001d2\b\u0010\u0017\u001a\u0004\u0018\u00010\u00162\b\u0010\u0019\u001a\u0004\u0018\u00010\u0018H\u0002¢\u0006\u0004\b\u001e\u0010\u001fJ&\u0010\"\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010 \u001a\u00020\u00022\u0006\u0010!\u001a\u00020\u0003H\u0096\u0002¢\u0006\u0004\b\"\u0010#R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010$R\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010%¨\u0006&"}, d2 = {"Lru/ozon/app/android/search/widgets/aiHelper/data/AiHelperMapper;", "Lkotlin/Function2;", "Lru/ozon/app/android/search/widgets/aiHelper/data/AiHelperDTO;", "Ll20/d;", "", "Lru/ozon/app/android/search/widgets/aiHelper/presentation/AiHelperVO;", "Lru/ozon/app/android/composer/widgets/base/WidgetMapper;", "Landroid/content/Context;", "context", "Lru/ozon/app/android/data/markdown/MarkDownParser;", "markDownParser", "<init>", "(Landroid/content/Context;Lru/ozon/app/android/data/markdown/MarkDownParser;)V", "toVO", "(Lru/ozon/app/android/search/widgets/aiHelper/data/AiHelperDTO;)Lru/ozon/app/android/search/widgets/aiHelper/presentation/AiHelperVO;", "Lru/ozon/app/android/search/widgets/aiHelper/data/AiHelperDTO$AiTextBlock;", "Lru/ozon/app/android/search/widgets/aiHelper/presentation/AiHelperVO$AiTextBlockVO;", "toVo", "(Lru/ozon/app/android/search/widgets/aiHelper/data/AiHelperDTO$AiTextBlock;)Lru/ozon/app/android/search/widgets/aiHelper/presentation/AiHelperVO$AiTextBlockVO;", "Lru/ozon/app/android/search/widgets/aiHelper/data/AiHelperDTO$Footer;", "Lru/ozon/app/android/search/widgets/aiHelper/presentation/AiHelperVO$FooterVO;", "(Lru/ozon/app/android/search/widgets/aiHelper/data/AiHelperDTO$Footer;)Lru/ozon/app/android/search/widgets/aiHelper/presentation/AiHelperVO$FooterVO;", "", "text", "Lru/ozon/app/android/search/widgets/aiHelper/data/MarkupType;", "markupType", "Lru/ozon/uni/atoms/utils/OzonSpannableString;", "mapText", "(Ljava/lang/String;Lru/ozon/app/android/search/widgets/aiHelper/data/MarkupType;)Lru/ozon/uni/atoms/utils/OzonSpannableString;", "", "parseByMarkupType", "(Ljava/lang/String;Lru/ozon/app/android/search/widgets/aiHelper/data/MarkupType;)Ljava/lang/CharSequence;", "state", "widgetInfo", "invoke", "(Lru/ozon/app/android/search/widgets/aiHelper/data/AiHelperDTO;Ll20/d;)Ljava/util/List;", "Landroid/content/Context;", "Lru/ozon/app/android/data/markdown/MarkDownParser;", "search_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class AiHelperMapper implements Function2<AiHelperDTO, d, List<? extends AiHelperVO>> {

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
                iArr[MarkupType.INVALID.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[MarkupType.MARKDOWN.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[MarkupType.HTML.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public AiHelperMapper(@NotNull Context context, @NotNull MarkDownParser markDownParser) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(markDownParser, "markDownParser");
        this.context = context;
        this.markDownParser = markDownParser;
    }

    private final OzonSpannableString mapText(String text, MarkupType markupType) {
        OzonSpannableString ozonSpannableString;
        CharSequence parseByMarkupType = parseByMarkupType(text, markupType);
        if (parseByMarkupType == null || (ozonSpannableString = OzonSpannableStringKt.toOzonSpannableString(parseByMarkupType)) == null) {
            return null;
        }
        return OzonUrlSpan.Companion.configUrlSpans$default(OzonUrlSpan.INSTANCE, ozonSpannableString, null, Integer.valueOf(StyleParser.INSTANCE.parseColor(this.context, UniColors.TEXT_ACTION.getToken(), UniColors.TEXT_ACTION_ON_LIGHT.getResId())), null, null, 13, null);
    }

    private final CharSequence parseByMarkupType(String text, MarkupType markupType) {
        int i11 = markupType == null ? -1 : WhenMappings.$EnumSwitchMapping$0[markupType.ordinal()];
        if (i11 == -1 || i11 == 1 || i11 == 2) {
            return text;
        }
        if (i11 == 3) {
            MarkDownParser markDownParser = this.markDownParser;
            if (text == null) {
                text = "";
            }
            return markDownParser.parse(text);
        }
        if (i11 != 4) {
            throw new o();
        }
        OzonHtmlParser.Companion companion = OzonHtmlParser.INSTANCE;
        if (text == null) {
            text = "";
        }
        return companion.parseHtml(text, 63);
    }

    private final AiHelperVO toVO(AiHelperDTO aiHelperDTO) {
        long hashCode = aiHelperDTO.hashCode();
        AiHelperVO.HeaderVO headerVO = new AiHelperVO.HeaderVO(aiHelperDTO.getHeader().getIcon(), aiHelperDTO.getHeader().getTitle(), aiHelperDTO.getHeader().getThinkingSubtitle(), aiHelperDTO.getHeader().getStoppedSubtitle(), aiHelperDTO.getHeader().getReadySubtitle(), aiHelperDTO.getHeader().getStopButton(), aiHelperDTO.getHeader().getRestartButton());
        AiHelperDTO.AiTextBlock aiTextBlock = aiHelperDTO.getAiTextBlock();
        AiHelperVO.AiTextBlockVO vo = aiTextBlock != null ? toVo(aiTextBlock) : null;
        AiHelperDTO.Footer footer = aiHelperDTO.getFooter();
        AiHelperVO.FooterVO vo2 = footer != null ? toVo(footer) : null;
        AtomActionDTO pollingAction = aiHelperDTO.getPollingAction();
        AtomActionDTO stopAction = aiHelperDTO.getStopAction();
        Map<String, TokenizedTrackingInfo> trackingInfo = aiHelperDTO.getTrackingInfo();
        return new AiHelperVO(hashCode, headerVO, vo, vo2, pollingAction, stopAction, trackingInfo != null ? x.b(trackingInfo, Long.valueOf(hashCode), null) : null, aiHelperDTO.getPollingIntervalMs(), aiHelperDTO.getMaxRetries(), aiHelperDTO.getRedirectUrl(), aiHelperDTO.getTestInfo());
    }

    private final AiHelperVO.AiTextBlockVO toVo(AiHelperDTO.AiTextBlock aiTextBlock) {
        return new AiHelperVO.AiTextBlockVO(mapText(aiTextBlock.getAiText(), aiTextBlock.getMarkupType()), aiTextBlock.getExpandControl(), aiTextBlock.getTestInfo());
    }

    @Override // kotlin.jvm.functions.Function2
    @NotNull
    public List<AiHelperVO> invoke(@NotNull AiHelperDTO state, @NotNull d widgetInfo) {
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(widgetInfo, "widgetInfo");
        return C7714v.a0(toVO(state));
    }

    private final AiHelperVO.FooterVO toVo(AiHelperDTO.Footer footer) {
        return new AiHelperVO.FooterVO(footer.getLikeButton(), footer.getDislikeButton(), footer.getRestartButton(), footer.getInfoButton());
    }
}
