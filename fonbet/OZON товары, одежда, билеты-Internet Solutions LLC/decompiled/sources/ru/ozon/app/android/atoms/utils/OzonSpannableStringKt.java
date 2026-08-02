package ru.ozon.app.android.atoms.utils;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\f\n\u0002\u0010\r\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0011\u0010\u0002\u001a\u00020\u0001*\u00020\u0000¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"", "Lru/ozon/app/android/atoms/utils/OzonSpannableString;", "toOzonSpannableString", "(Ljava/lang/CharSequence;)Lru/ozon/app/android/atoms/utils/OzonSpannableString;", "design-system_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class OzonSpannableStringKt {
    @NotNull
    public static final OzonSpannableString toOzonSpannableString(@NotNull CharSequence charSequence) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        OzonSpannableString ozonSpannableString = charSequence instanceof OzonSpannableString ? (OzonSpannableString) charSequence : null;
        return ozonSpannableString == null ? new OzonSpannableString(charSequence) : ozonSpannableString;
    }
}
