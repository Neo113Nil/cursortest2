package ru.ozon.app.android.travel.molecules.extensions;

import android.content.Context;
import android.text.SpannableStringBuilder;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.uni.atoms.data.texts.TextAtom;
import ru.ozon.uni.atoms.utils.OzonSpannableStringKt;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\r\n\u0002\b\u0004\u001a-\u0010\u0006\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\b\u0010\u0003\u001a\u0004\u0018\u00010\u00002\b\b\u0002\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007\u001a9\u0010\u000b\u001a\u00020\u0000*\u00020\u00002\b\u0010\u0003\u001a\u0004\u0018\u00010\u00002\b\b\u0002\u0010\u0005\u001a\u00020\u00042\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\t0\b¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lru/ozon/uni/atoms/data/texts/TextAtom;", "Landroid/content/Context;", "context", "that", "", "separator", "compoundByTextAppearance", "(Lru/ozon/uni/atoms/data/texts/TextAtom;Landroid/content/Context;Lru/ozon/uni/atoms/data/texts/TextAtom;Ljava/lang/String;)Lru/ozon/uni/atoms/data/texts/TextAtom;", "Lkotlin/Function1;", "", "transformer", "compound", "(Lru/ozon/uni/atoms/data/texts/TextAtom;Lru/ozon/uni/atoms/data/texts/TextAtom;Ljava/lang/String;Lkotlin/jvm/functions/Function1;)Lru/ozon/uni/atoms/data/texts/TextAtom;", "molecules_prodGoogleAllVendorsRelease"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class TextAtomExtensionsKt {
    @NotNull
    public static final TextAtom compound(@NotNull TextAtom textAtom, TextAtom textAtom2, @NotNull String separator, @NotNull Function1<? super TextAtom, ? extends CharSequence> transformer) {
        Intrinsics.checkNotNullParameter(textAtom, "<this>");
        Intrinsics.checkNotNullParameter(separator, "separator");
        Intrinsics.checkNotNullParameter(transformer, "transformer");
        if (textAtom2 == null) {
            return textAtom;
        }
        SpannableStringBuilder append = new SpannableStringBuilder(textAtom.getText()).append((CharSequence) separator).append(transformer.invoke(textAtom2));
        Intrinsics.checkNotNullExpressionValue(append, "append(...)");
        return TextAtom.copy$default(textAtom, OzonSpannableStringKt.toOzonSpannableString(append), null, null, null, null, null, null, 126, null);
    }

    @NotNull
    public static final TextAtom compoundByTextAppearance(@NotNull TextAtom textAtom, @NotNull Context context, TextAtom textAtom2, @NotNull String separator) {
        Intrinsics.checkNotNullParameter(textAtom, "<this>");
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(separator, "separator");
        return compound(textAtom, textAtom2, separator, new TextAtomExtensionsKt$compoundByTextAppearance$1(context));
    }

    public static /* synthetic */ TextAtom compoundByTextAppearance$default(TextAtom textAtom, Context context, TextAtom textAtom2, String str, int i11, Object obj) {
        if ((i11 & 4) != 0) {
            str = " ";
        }
        return compoundByTextAppearance(textAtom, context, textAtom2, str);
    }
}
