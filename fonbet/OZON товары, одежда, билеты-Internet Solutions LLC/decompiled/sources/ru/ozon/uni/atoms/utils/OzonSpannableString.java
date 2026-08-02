package ru.ozon.uni.atoms.utils;

import android.text.SpannableString;
import android.text.Spanned;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\r\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\t\b\u0016¢\u0006\u0004\b\u0002\u0010\u0003B\u0011\b\u0016\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0002\u0010\u0006J\u0013\u0010\u0007\u001a\u00020\b2\b\u0010\t\u001a\u0004\u0018\u00010\nH\u0096\u0002J\b\u0010\u000b\u001a\u00020\fH\u0016¨\u0006\r"}, d2 = {"Lru/ozon/uni/atoms/utils/OzonSpannableString;", "Landroid/text/SpannableString;", "<init>", "()V", "text", "", "(Ljava/lang/CharSequence;)V", "equals", "", "other", "", "hashCode", "", "uni_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class OzonSpannableString extends SpannableString {
    public static final int $stable = 0;

    public OzonSpannableString() {
        super("");
    }

    @Override // android.text.SpannableString
    public boolean equals(Object other) {
        if ((other instanceof Spanned) && Intrinsics.d(toString(), other.toString())) {
            Spanned spanned = (Spanned) other;
            Object[] spans = spanned.getSpans(0, spanned.length(), Object.class);
            Object[] spans2 = getSpans(0, length(), Object.class);
            if (spans2.length == spans.length) {
                int length = spans2.length;
                for (int i11 = 0; i11 < length; i11++) {
                    Object obj = spans2[i11];
                    Object obj2 = spans[i11];
                    if (obj == this) {
                        if (other != obj2 || getSpanStart(obj) != spanned.getSpanStart(obj2) || getSpanEnd(obj) != spanned.getSpanEnd(obj2) || getSpanFlags(obj) != spanned.getSpanFlags(obj2)) {
                            return false;
                        }
                    } else if (obj.getClass() != obj2.getClass() || getSpanStart(obj) != spanned.getSpanStart(obj2) || getSpanEnd(obj) != spanned.getSpanEnd(obj2) || getSpanFlags(obj) != spanned.getSpanFlags(obj2)) {
                        return false;
                    }
                }
                return true;
            }
        }
        return false;
    }

    @Override // android.text.SpannableString
    public int hashCode() {
        return super.hashCode();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OzonSpannableString(@NotNull CharSequence text) {
        super(text);
        Intrinsics.checkNotNullParameter(text, "text");
    }
}
