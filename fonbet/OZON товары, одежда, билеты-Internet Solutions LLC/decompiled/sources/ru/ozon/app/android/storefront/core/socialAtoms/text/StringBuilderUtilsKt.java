package ru.ozon.app.android.storefront.core.socialAtoms.text;

import Sc.o;
import android.text.SpannableStringBuilder;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.collections.C7705l;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.CharsKt;
import kotlin.text.h;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.storefront.core.socialAtoms.text.SocialTextAtomDTO;

@Metadata(d1 = {"\u0000(\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\u001a\n\u0010\u0000\u001a\u00020\u0001*\u00020\u0001\u001a\u001c\u0010\u0002\u001a\u00020\u0001*\u00020\u00012\b\u0010\u0003\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0005\u001a\u00020\u0006\u001a\n\u0010\u0007\u001a\u00020\u0001*\u00020\u0001\u001a$\u0010\u0003\u001a\u00060\bj\u0002`\t*\u00060\bj\u0002`\t2\b\u0010\u0003\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0005\u001a\u00020\u0006\u001a\u001a\u0010\n\u001a\u00060\bj\u0002`\t*\u00060\bj\u0002`\t2\u0006\u0010\u000b\u001a\u00020\f¨\u0006\r"}, d2 = {"ellipsis", "Landroid/text/SpannableStringBuilder;", "addSpaceForIconAtEnd", "icon", "", "iconPosition", "Lru/ozon/app/android/storefront/core/socialAtoms/text/SocialTextAtomDTO$IconPosition;", "addNonBreakSpaceAtEndForItalic", "Ljava/lang/StringBuilder;", "Lkotlin/text/StringBuilder;", "italic", "isItalic", "", "atoms_prodGoogleAllVendorsRelease"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class StringBuilderUtilsKt {

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[SocialTextAtomDTO.IconPosition.values().length];
            try {
                iArr[SocialTextAtomDTO.IconPosition.ICON_POSITION_START.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[SocialTextAtomDTO.IconPosition.ICON_POSITION_END.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    @NotNull
    public static final SpannableStringBuilder addNonBreakSpaceAtEndForItalic(@NotNull SpannableStringBuilder spannableStringBuilder) {
        Intrinsics.checkNotNullParameter(spannableStringBuilder, "<this>");
        SpannableStringBuilder append = spannableStringBuilder.append((char) 160);
        Intrinsics.checkNotNullExpressionValue(append, "append(...)");
        return append;
    }

    @NotNull
    public static final SpannableStringBuilder addSpaceForIconAtEnd(@NotNull SpannableStringBuilder spannableStringBuilder, String str, @NotNull SocialTextAtomDTO.IconPosition iconPosition) {
        Intrinsics.checkNotNullParameter(spannableStringBuilder, "<this>");
        Intrinsics.checkNotNullParameter(iconPosition, "iconPosition");
        if (str != null && iconPosition == SocialTextAtomDTO.IconPosition.ICON_POSITION_END) {
            spannableStringBuilder.append(' ');
        }
        return spannableStringBuilder;
    }

    @NotNull
    public static final SpannableStringBuilder ellipsis(@NotNull SpannableStringBuilder spannableStringBuilder) {
        Intrinsics.checkNotNullParameter(spannableStringBuilder, "<this>");
        String spannableStringBuilder2 = spannableStringBuilder.toString();
        Intrinsics.checkNotNullExpressionValue(spannableStringBuilder2, "toString(...)");
        if (CharsKt.c(h.M(spannableStringBuilder2))) {
            int G11 = h.G(spannableStringBuilder2) - 1;
            while (true) {
                if (-1 >= G11) {
                    break;
                }
                if (!CharsKt.c(spannableStringBuilder2.charAt(G11))) {
                    spannableStringBuilder.delete(G11 + 1, spannableStringBuilder.length());
                    break;
                }
                G11--;
            }
        }
        String j02 = h.j0(' ', spannableStringBuilder2, spannableStringBuilder2);
        Iterator<T> it = SocialTextAtomView.INSTANCE.getTagsDelimiters().iterator();
        boolean z11 = false;
        while (it.hasNext()) {
            if (h.f0(j02, ((Character) it.next()).charValue()) && j02.length() > 1) {
                z11 = true;
            }
        }
        if (!z11) {
            SpannableStringBuilder append = spannableStringBuilder.append((char) 8230);
            Intrinsics.f(append);
            return append;
        }
        spannableStringBuilder.delete(h.G(spannableStringBuilder), spannableStringBuilder.length());
        ClickableTagSpan[] clickableTagSpanArr = (ClickableTagSpan[]) spannableStringBuilder.getSpans(h.G(spannableStringBuilder), spannableStringBuilder.length(), ClickableTagSpan.class);
        spannableStringBuilder.append((char) 8230);
        if (clickableTagSpanArr.length == 0) {
            return spannableStringBuilder;
        }
        spannableStringBuilder.setSpan(((ClickableTagSpan) C7705l.C(clickableTagSpanArr)).copy(), h.G(spannableStringBuilder), spannableStringBuilder.length(), 33);
        return spannableStringBuilder;
    }

    @NotNull
    public static final StringBuilder icon(@NotNull StringBuilder sb2, String str, @NotNull SocialTextAtomDTO.IconPosition iconPosition) {
        Intrinsics.checkNotNullParameter(sb2, "<this>");
        Intrinsics.checkNotNullParameter(iconPosition, "iconPosition");
        if (str != null) {
            int i11 = WhenMappings.$EnumSwitchMapping$0[iconPosition.ordinal()];
            if (i11 == 1) {
                sb2 = sb2.insert(0, ' ');
            } else {
                if (i11 != 2) {
                    throw new o();
                }
                sb2.append(' ');
            }
            Intrinsics.f(sb2);
        }
        return sb2;
    }

    @NotNull
    public static final StringBuilder italic(@NotNull StringBuilder sb2, boolean z11) {
        Intrinsics.checkNotNullParameter(sb2, "<this>");
        if (z11) {
            sb2.append((char) 160);
        }
        return sb2;
    }
}
