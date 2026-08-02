package io.intercom.android.sdk.utilities.commons;

import android.text.Html;
import android.text.Spanned;

/* loaded from: classes9.dex */
public class HtmlCompat {
    public static Spanned fromHtml(String str) {
        return Html.fromHtml(str, 0);
    }
}
