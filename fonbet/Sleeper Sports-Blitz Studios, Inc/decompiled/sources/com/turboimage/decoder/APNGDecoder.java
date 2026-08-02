package com.turboimage.decoder;

import coil.decode.DecodeResult;
import coil.decode.Decoder;
import coil.decode.ImageSource;
import com.linecorp.apng.ApngDrawable;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.InterruptibleKt;

/* compiled from: APNGDecoder.kt */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u0004\u0018\u00010\u0007H\u0096@¢\u0006\u0002\u0010\bR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\t"}, d2 = {"Lcom/turboimage/decoder/APNGDecoder;", "Lcoil/decode/Decoder;", "source", "Lcoil/decode/ImageSource;", "<init>", "(Lcoil/decode/ImageSource;)V", "decode", "Lcoil/decode/DecodeResult;", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "react-native-turbo-image_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class APNGDecoder implements Decoder {
    private final ImageSource source;

    public APNGDecoder(ImageSource source) {
        Intrinsics.checkNotNullParameter(source, "source");
        this.source = source;
    }

    @Override // coil.decode.Decoder
    public Object decode(Continuation<? super DecodeResult> continuation) {
        return InterruptibleKt.runInterruptible$default(null, new Function0() { // from class: com.turboimage.decoder.APNGDecoder$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                DecodeResult decode$lambda$0;
                decode$lambda$0 = APNGDecoder.decode$lambda$0(APNGDecoder.this);
                return decode$lambda$0;
            }
        }, continuation, 1, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final DecodeResult decode$lambda$0(APNGDecoder aPNGDecoder) {
        if (ApngDrawable.INSTANCE.isApng(aPNGDecoder.source.file().toString())) {
            return new DecodeResult(ApngDrawable.Companion.decode$default(ApngDrawable.INSTANCE, aPNGDecoder.source.file().toString(), (Integer) null, (Integer) null, 6, (Object) null), false);
        }
        return null;
    }
}
