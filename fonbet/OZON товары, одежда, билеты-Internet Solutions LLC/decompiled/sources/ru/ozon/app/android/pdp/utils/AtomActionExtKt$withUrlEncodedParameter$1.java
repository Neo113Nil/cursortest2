package ru.ozon.app.android.pdp.utils;

import android.net.Uri;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "", "text", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
final class AtomActionExtKt$withUrlEncodedParameter$1 extends AbstractC7737t implements Function1<String, String> {
    public static final AtomActionExtKt$withUrlEncodedParameter$1 INSTANCE = new AtomActionExtKt$withUrlEncodedParameter$1();

    AtomActionExtKt$withUrlEncodedParameter$1() {
        super(1);
    }

    @Override // kotlin.jvm.functions.Function1
    public final String invoke(String text) {
        Intrinsics.checkNotNullParameter(text, "text");
        String encode = Uri.encode(text);
        Intrinsics.checkNotNullExpressionValue(encode, "encode(...)");
        return encode;
    }
}
