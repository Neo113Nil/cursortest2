package ru.ozon.app.android.mediaupload.video;

import Ye.b;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.CharsKt;

@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\r\n\u0000\n\u0002\u0010\b\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
final class VideoNetworkDataStore$getFileChecksum$2 extends AbstractC7737t implements Function1<Integer, CharSequence> {
    final /* synthetic */ byte[] $bytes;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    VideoNetworkDataStore$getFileChecksum$2(byte[] bArr) {
        super(1);
        this.$bytes = bArr;
    }

    public final CharSequence invoke(int i11) {
        byte b11 = this.$bytes[i11];
        byte[] bArr = b.f34900a;
        String num = Integer.toString((b11 & 255) + 256, CharsKt.checkRadix(16));
        Intrinsics.checkNotNullExpressionValue(num, "toString(...)");
        String substring = num.substring(1);
        Intrinsics.checkNotNullExpressionValue(substring, "substring(...)");
        return substring;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ CharSequence invoke(Integer num) {
        return invoke(num.intValue());
    }
}
