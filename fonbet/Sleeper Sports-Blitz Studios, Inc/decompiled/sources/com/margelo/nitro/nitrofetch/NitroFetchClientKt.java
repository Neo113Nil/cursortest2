package com.margelo.nitro.nitrofetch;

import com.margelo.nitro.core.ArrayBuffer;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.nio.charset.CharsetDecoder;
import java.nio.charset.CodingErrorAction;
import java.util.function.Supplier;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;

/* compiled from: NitroFetchClient.kt */
@Metadata(d1 = {"\u0000$\n\u0000\n\u0002\u0010\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a\n\u0010\u0000\u001a\u00020\u0001*\u00020\u0002\u001a\u0010\u0010\u0007\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\tH\u0002\u001a\f\u0010\n\u001a\u00020\u000b*\u00020\u0001H\u0002\"2\u0010\u0003\u001a&\u0012\f\u0012\n \u0006*\u0004\u0018\u00010\u00050\u0005 \u0006*\u0012\u0012\f\u0012\n \u0006*\u0004\u0018\u00010\u00050\u0005\u0018\u00010\u00040\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\f"}, d2 = {"toByteArray", "", "Ljava/nio/ByteBuffer;", "utf8StrictDecoder", "Ljava/lang/ThreadLocal;", "Ljava/nio/charset/CharsetDecoder;", "kotlin.jvm.PlatformType", "strictDecoderFor", "charset", "Ljava/nio/charset/Charset;", "toArrayBuffer", "Lcom/margelo/nitro/core/ArrayBuffer;", "react-native-nitro-fetch_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class NitroFetchClientKt {
    private static final ThreadLocal<CharsetDecoder> utf8StrictDecoder;

    public static final byte[] toByteArray(ByteBuffer byteBuffer) {
        Intrinsics.checkNotNullParameter(byteBuffer, "<this>");
        ByteBuffer duplicate = byteBuffer.duplicate();
        duplicate.clear();
        byte[] bArr = new byte[duplicate.remaining()];
        duplicate.get(bArr);
        return bArr;
    }

    static {
        final Supplier supplier = new Supplier() { // from class: com.margelo.nitro.nitrofetch.NitroFetchClientKt$$ExternalSyntheticLambda0
            @Override // java.util.function.Supplier
            public final Object get() {
                CharsetDecoder utf8StrictDecoder$lambda$0;
                utf8StrictDecoder$lambda$0 = NitroFetchClientKt.utf8StrictDecoder$lambda$0();
                return utf8StrictDecoder$lambda$0;
            }
        };
        utf8StrictDecoder = new ThreadLocal() { // from class: com.margelo.nitro.nitrofetch.NitroFetchClientKt$$ExternalSyntheticThreadLocal1
            @Override // java.lang.ThreadLocal
            protected /* synthetic */ Object initialValue() {
                return supplier.get();
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final CharsetDecoder utf8StrictDecoder$lambda$0() {
        return Charsets.UTF_8.newDecoder().onMalformedInput(CodingErrorAction.REPORT).onUnmappableCharacter(CodingErrorAction.REPORT);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final CharsetDecoder strictDecoderFor(Charset charset) {
        if (Intrinsics.areEqual(charset, Charsets.UTF_8)) {
            CharsetDecoder charsetDecoder = utf8StrictDecoder.get();
            Intrinsics.checkNotNull(charsetDecoder);
            return charsetDecoder;
        }
        CharsetDecoder onUnmappableCharacter = charset.newDecoder().onMalformedInput(CodingErrorAction.REPORT).onUnmappableCharacter(CodingErrorAction.REPORT);
        Intrinsics.checkNotNull(onUnmappableCharacter);
        return onUnmappableCharacter;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ArrayBuffer toArrayBuffer(byte[] bArr) {
        ArrayBuffer allocate = ArrayBuffer.INSTANCE.allocate(bArr.length);
        allocate.getBuffer(false).put(bArr);
        return allocate;
    }
}
