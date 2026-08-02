package ru.ozon.app.android.storefront.widgets.cms.richtext;

import android.content.Context;
import android.text.SpannableStringBuilder;
import android.text.SpannedString;
import androidx.core.content.a;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C7714v;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import l20.d;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.data.markdown.TextParser;
import ru.ozon.app.android.data.markdown.TextParserProvider;
import ru.ozon.uni.R$color;
import ru.ozon.uni.android.uikit.common.StyleParser;
import ru.ozon.uni.atoms.html.spans.OzonClickableSpan;
import ru.ozon.uni.atoms.utils.OzonSpannableString;
import ru.ozon.uni.atoms.utils.OzonSpannableStringKt;

@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\b\u0001\u0018\u00002*\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u0001j\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0005`\u0006B\u0017\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ*\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\r\u001a\u00020\u00022\n\u0010\u000f\u001a\u00060\u0003j\u0002`\u000eH\u0096\u0002¢\u0006\u0004\b\u0010\u0010\u0011R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\u0012R\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u0013R\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016¨\u0006\u0017"}, d2 = {"Lru/ozon/app/android/storefront/widgets/cms/richtext/RichTextWidgetMapper;", "Lkotlin/Function2;", "Lru/ozon/app/android/storefront/widgets/cms/richtext/TextBlockDTO;", "Ll20/d;", "", "Lru/ozon/app/android/storefront/widgets/cms/richtext/RichTextWidgetVO;", "Lru/ozon/app/android/composer/widgets/base/WidgetMapper;", "Landroid/content/Context;", "context", "Lru/ozon/app/android/data/markdown/TextParserProvider;", "textParserProvider", "<init>", "(Landroid/content/Context;Lru/ozon/app/android/data/markdown/TextParserProvider;)V", "dto", "Lru/ozon/app/android/composer/view/WidgetInfo;", "widgetInfo", "invoke", "(Lru/ozon/app/android/storefront/widgets/cms/richtext/TextBlockDTO;Ll20/d;)Ljava/util/List;", "Landroid/content/Context;", "Lru/ozon/app/android/data/markdown/TextParserProvider;", "", "linkColor", "I", "cms_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class RichTextWidgetMapper implements Function2<TextBlockDTO, d, List<? extends RichTextWidgetVO>> {

    @NotNull
    private final Context context;
    private final int linkColor;

    @NotNull
    private final TextParserProvider textParserProvider;

    public RichTextWidgetMapper(@NotNull Context context, @NotNull TextParserProvider textParserProvider) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(textParserProvider, "textParserProvider");
        this.context = context;
        this.textParserProvider = textParserProvider;
        this.linkColor = a.getColor(context, R$color.oz_blue);
    }

    @Override // kotlin.jvm.functions.Function2
    @NotNull
    public List<RichTextWidgetVO> invoke(@NotNull TextBlockDTO dto, @NotNull d widgetInfo) {
        OzonSpannableString ozonSpannableString;
        CharSequence text;
        OzonSpannableString ozonSpannableString2;
        Intrinsics.checkNotNullParameter(dto, "dto");
        Intrinsics.checkNotNullParameter(widgetInfo, "widgetInfo");
        TextParser provideParser = this.textParserProvider.provideParser(dto.getTextType());
        StyleParser styleParser = StyleParser.INSTANCE;
        Integer parseColor = styleParser.parseColor(this.context, dto.getBackgroundColor());
        Integer parseColor2 = styleParser.parseColor(this.context, dto.getTextColor());
        String textFull = dto.getTextFull();
        if (textFull != null) {
            if (provideParser == null || (ozonSpannableString2 = provideParser.parse(textFull)) == null) {
                ozonSpannableString2 = OzonSpannableStringKt.toOzonSpannableString(textFull);
            }
            ozonSpannableString = ozonSpannableString2;
        } else {
            ozonSpannableString = null;
        }
        if (provideParser == null || (text = provideParser.parse(dto.getText())) == null) {
            text = dto.getText();
        }
        if (ozonSpannableString != null && dto.getMore() != null) {
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(text);
            spannableStringBuilder.append((CharSequence) dto.getMore());
            spannableStringBuilder.setSpan(new OzonClickableSpan(Integer.valueOf(this.linkColor), false, 2, null), spannableStringBuilder.length() - dto.getMore().length(), spannableStringBuilder.length(), 33);
            text = new SpannedString(spannableStringBuilder);
        }
        return C7714v.a0(new RichTextWidgetVO(dto.getText().hashCode(), dto.getTextType(), OzonSpannableStringKt.toOzonSpannableString(text), ozonSpannableString, parseColor2, parseColor));
    }
}
