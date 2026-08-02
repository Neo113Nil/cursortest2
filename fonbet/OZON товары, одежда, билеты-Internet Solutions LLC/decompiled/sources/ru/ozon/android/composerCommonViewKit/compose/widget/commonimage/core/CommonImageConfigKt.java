package ru.ozon.android.composerCommonViewKit.compose.widget.commonimage.core;

import d00.C6020f;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import n20.i;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.composerCommonViewKit.parsing.JsonParser;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0015\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lru/ozon/android/composerCommonViewKit/parsing/JsonParser;", "deserializer", "Ln20/i;", "commonImageWidget", "(Lru/ozon/android/composerCommonViewKit/parsing/JsonParser;)Ln20/i;", "common-view-kit_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class CommonImageConfigKt {
    @NotNull
    public static final i commonImageWidget(@NotNull JsonParser deserializer) {
        Intrinsics.checkNotNullParameter(deserializer, "deserializer");
        return C6020f.b("common", "image", null, new CommonImageConfigKt$commonImageWidget$1(deserializer), 4, null);
    }
}
