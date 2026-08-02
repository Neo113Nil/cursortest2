package ru.ozon.app.android.video.playerV2.utils;

import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;

@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"<anonymous>", "", "bufferForPlaybackMs", "", "invoke", "(I)Ljava/lang/Boolean;"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
final class PlayerConfigUtilsKt$createLoadControl$bufferForPlaybackMs$1 extends AbstractC7737t implements Function1<Integer, Boolean> {
    public static final PlayerConfigUtilsKt$createLoadControl$bufferForPlaybackMs$1 INSTANCE = new PlayerConfigUtilsKt$createLoadControl$bufferForPlaybackMs$1();

    PlayerConfigUtilsKt$createLoadControl$bufferForPlaybackMs$1() {
        super(1);
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Boolean invoke(Integer num) {
        return invoke(num.intValue());
    }

    public final Boolean invoke(int i11) {
        return Boolean.valueOf(i11 >= 0);
    }
}
