package ru.ozon.app.android.data.markdown;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.tools.MarkupType;
import ru.ozon.uni.atoms.html.OzonHtmlParser;

@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u0004\u0018\u00010\u00072\u0006\u0010\b\u001a\u00020\tR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\n"}, d2 = {"Lru/ozon/app/android/data/markdown/TextParserProvider;", "", "markDownParser", "Lru/ozon/app/android/data/markdown/MarkDownParser;", "<init>", "(Lru/ozon/app/android/data/markdown/MarkDownParser;)V", "provideParser", "Lru/ozon/app/android/data/markdown/TextParser;", "markupType", "Lru/ozon/app/android/tools/MarkupType;", "markdown_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class TextParserProvider {

    @NotNull
    private final MarkDownParser markDownParser;

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    /* loaded from: classes11.dex */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[MarkupType.values().length];
            try {
                iArr[MarkupType.MARKDOWN.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[MarkupType.HTML.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public TextParserProvider(@NotNull MarkDownParser markDownParser) {
        Intrinsics.checkNotNullParameter(markDownParser, "markDownParser");
        this.markDownParser = markDownParser;
    }

    public final TextParser provideParser(@NotNull MarkupType markupType) {
        Intrinsics.checkNotNullParameter(markupType, "markupType");
        int i11 = WhenMappings.$EnumSwitchMapping$0[markupType.ordinal()];
        if (i11 == 1) {
            return this.markDownParser;
        }
        if (i11 != 2) {
            return null;
        }
        return new TextParserProvider$sam$ru_ozon_app_android_data_markdown_TextParser$0(new TextParserProvider$provideParser$1(OzonHtmlParser.INSTANCE));
    }
}
