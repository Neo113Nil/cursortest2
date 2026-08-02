package ru.ozon.app.android.web;

import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\r\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
final class WebFragment$showFileChooser$1 extends AbstractC7737t implements Function1<String, CharSequence> {
    public static final WebFragment$showFileChooser$1 INSTANCE = new WebFragment$showFileChooser$1();

    WebFragment$showFileChooser$1() {
        super(1);
    }

    @Override // kotlin.jvm.functions.Function1
    public final CharSequence invoke(String it) {
        Map map;
        Intrinsics.checkNotNullParameter(it, "it");
        map = WebFragment.IMAGES;
        String str = (String) map.get(it);
        return str != null ? str : it;
    }
}
