package ru.ozon.app.android.pdp.utils;

import android.util.Base64;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;

@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "", "text", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
final class AtomActionExtKt$withBase64Parameter$1 extends AbstractC7737t implements Function1<String, String> {
    public static final AtomActionExtKt$withBase64Parameter$1 INSTANCE = new AtomActionExtKt$withBase64Parameter$1();

    AtomActionExtKt$withBase64Parameter$1() {
        super(1);
    }

    @Override // kotlin.jvm.functions.Function1
    public final String invoke(String text) {
        Intrinsics.checkNotNullParameter(text, "text");
        byte[] bytes = text.getBytes(Charsets.UTF_8);
        Intrinsics.checkNotNullExpressionValue(bytes, "getBytes(...)");
        String encodeToString = Base64.encodeToString(bytes, 0);
        Intrinsics.checkNotNullExpressionValue(encodeToString, "encodeToString(...)");
        return encodeToString;
    }
}
