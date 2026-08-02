package com.facebook.react.modules.network;

import com.facebook.react.common.ReactConstants;
import com.twilio.voice.EventKeys;
import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.nio.charset.CharacterCodingException;
import java.nio.charset.Charset;
import java.nio.charset.CharsetDecoder;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0012\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0000\u0018\u0000 \u000f2\u00020\u0001:\u0001\u000fB\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0016\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\u000eR\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\b\u001a\u0004\u0018\u00010\tX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0010"}, d2 = {"Lcom/facebook/react/modules/network/ProgressiveStringDecoder;", "", "charset", "Ljava/nio/charset/Charset;", "<init>", "(Ljava/nio/charset/Charset;)V", "decoder", "Ljava/nio/charset/CharsetDecoder;", "remainder", "", "decodeNext", "", EventKeys.DATA, "initialLength", "", "Companion", "ReactAndroid_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nProgressiveStringDecoder.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ProgressiveStringDecoder.kt\ncom/facebook/react/modules/network/ProgressiveStringDecoder\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,86:1\n1#2:87\n*E\n"})
/* loaded from: classes2.dex */
public final class ProgressiveStringDecoder {

    @NotNull
    private static final String EMPTY_STRING = "";

    @NotNull
    private final CharsetDecoder decoder;

    @Nullable
    private byte[] remainder;

    public ProgressiveStringDecoder(@NotNull Charset charset) {
        Intrinsics.checkNotNullParameter(charset, "charset");
        CharsetDecoder newDecoder = charset.newDecoder();
        Intrinsics.checkNotNullExpressionValue(newDecoder, "newDecoder(...)");
        this.decoder = newDecoder;
    }

    @NotNull
    public final String decodeNext(@NotNull byte[] data, int initialLength) {
        Intrinsics.checkNotNullParameter(data, "data");
        byte[] bArr = this.remainder;
        if (bArr != null) {
            byte[] bArr2 = new byte[bArr.length + initialLength];
            System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
            System.arraycopy(data, 0, bArr2, bArr.length, initialLength);
            initialLength += bArr.length;
            data = bArr2;
        }
        ByteBuffer wrap = ByteBuffer.wrap(data, 0, initialLength);
        byte[] bArr3 = null;
        boolean z10 = false;
        int i10 = 0;
        CharBuffer charBuffer = null;
        while (!z10 && i10 < 4) {
            try {
                charBuffer = this.decoder.decode(wrap);
                z10 = true;
            } catch (CharacterCodingException unused) {
                i10++;
                wrap = ByteBuffer.wrap(data, 0, initialLength - i10);
            }
        }
        if (z10 && i10 > 0) {
            bArr3 = new byte[i10];
            System.arraycopy(data, initialLength - i10, bArr3, 0, i10);
        }
        this.remainder = bArr3;
        if (!z10) {
            E6.a.K(ReactConstants.TAG, "failed to decode string from byte array");
            return "";
        }
        if (charBuffer == null) {
            return "";
        }
        char[] array = charBuffer.array();
        Intrinsics.checkNotNullExpressionValue(array, "array(...)");
        return new String(array, 0, charBuffer.length());
    }
}
