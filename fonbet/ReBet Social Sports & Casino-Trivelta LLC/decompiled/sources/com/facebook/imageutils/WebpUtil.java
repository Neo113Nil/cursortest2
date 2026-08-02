package com.facebook.imageutils;

import W9.d;
import com.bumptech.glide.gifdecoder.e;
import com.google.crypto.tink.integration.android.b;
import i3.C4527h;
import java.io.IOException;
import java.io.InputStream;
import java.util.Collection;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.UShort;
import kotlin.collections.ArraysKt;
import kotlin.collections.IntIterator;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u0012\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J%\u0010\b\u001a\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\n\u001a\u00020\u00072\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\n\u0010\u000bJ%\u0010\f\u001a\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\f\u0010\tJ%\u0010\r\u001a\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\r\u0010\tJ#\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u000e\u0010\tJ\u001f\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u0011H\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u0017\u0010\u0017\u001a\u00020\u00112\u0006\u0010\u0016\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\u0017\u0010\u0019\u001a\u00020\u00072\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0019\u0010\u000bJ\u0017\u0010\u001a\u001a\u00020\u00072\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u001a\u0010\u000bJ\u0013\u0010\u001b\u001a\u00020\u0007*\u00020\u0004H\u0002¢\u0006\u0004\b\u001b\u0010\u000b¨\u0006\u001c"}, d2 = {"Lcom/facebook/imageutils/WebpUtil;", "", "<init>", "()V", "Ljava/io/InputStream;", "stream", "Lkotlin/Pair;", "", "getSize", "(Ljava/io/InputStream;)Lkotlin/Pair;", "get2BytesAsInt", "(Ljava/io/InputStream;)I", e.f29601m, "f", "g", "", "what", "", "with", "", "a", "([BLjava/lang/String;)Z", "header", b.f37029b, "([B)Ljava/lang/String;", "c", C4527h.f48087o, d.f13160a, "imagepipeline-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nWebpUtil.kt\nKotlin\n*S Kotlin\n*F\n+ 1 WebpUtil.kt\ncom/facebook/imageutils/WebpUtil\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,182:1\n2632#2,3:183\n*S KotlinDebug\n*F\n+ 1 WebpUtil.kt\ncom/facebook/imageutils/WebpUtil\n*L\n144#1:183,3\n*E\n"})
/* loaded from: classes2.dex */
public final class WebpUtil {

    @NotNull
    public static final WebpUtil INSTANCE = new WebpUtil();

    @JvmStatic
    public static final int get2BytesAsInt(@NotNull InputStream stream) {
        Intrinsics.checkNotNullParameter(stream, "stream");
        WebpUtil webpUtil = INSTANCE;
        return (webpUtil.d(stream) << 8) | webpUtil.d(stream);
    }

    @JvmStatic
    @Nullable
    public static final Pair<Integer, Integer> getSize(@NotNull InputStream stream) {
        WebpUtil webpUtil;
        Pair<Integer, Integer> e10;
        Intrinsics.checkNotNullParameter(stream, "stream");
        byte[] bArr = new byte[4];
        try {
            try {
                stream.read(bArr);
                webpUtil = INSTANCE;
            } catch (IOException e11) {
                e11.printStackTrace();
            }
            if (webpUtil.a(bArr, "RIFF")) {
                webpUtil.c(stream);
                stream.read(bArr);
                if (webpUtil.a(bArr, "WEBP")) {
                    stream.read(bArr);
                    String b10 = webpUtil.b(bArr);
                    int hashCode = b10.hashCode();
                    if (hashCode == 2640674) {
                        if (b10.equals("VP8 ")) {
                            e10 = webpUtil.e(stream);
                        }
                        stream.close();
                        return null;
                    }
                    if (hashCode != 2640718) {
                        if (hashCode == 2640730 && b10.equals("VP8X")) {
                            e10 = webpUtil.g(stream);
                        }
                        try {
                            stream.close();
                        } catch (IOException e12) {
                            e12.printStackTrace();
                        }
                        return null;
                    }
                    if (!b10.equals("VP8L")) {
                        stream.close();
                        return null;
                    }
                    e10 = webpUtil.f(stream);
                    try {
                        stream.close();
                        return e10;
                    } catch (IOException e13) {
                        e13.printStackTrace();
                        return e10;
                    }
                }
            }
            try {
                return null;
            } catch (IOException e14) {
                return null;
            }
        } finally {
            try {
                stream.close();
            } catch (IOException e142) {
                e142.printStackTrace();
            }
        }
    }

    public final boolean a(byte[] what, String with) {
        if (what.length != with.length()) {
            return false;
        }
        Iterable indices = ArraysKt.getIndices(what);
        if ((indices instanceof Collection) && ((Collection) indices).isEmpty()) {
            return true;
        }
        Iterator it = indices.iterator();
        while (it.hasNext()) {
            int nextInt = ((IntIterator) it).nextInt();
            if (((byte) with.charAt(nextInt)) != what[nextInt]) {
                return false;
            }
        }
        return true;
    }

    public final String b(byte[] header) {
        StringBuilder sb2 = new StringBuilder();
        for (byte b10 : header) {
            sb2.append((char) (UShort.m428constructorimpl(b10) & UShort.MAX_VALUE));
        }
        String sb3 = sb2.toString();
        Intrinsics.checkNotNullExpressionValue(sb3, "toString(...)");
        return sb3;
    }

    public final int c(InputStream stream) {
        int d10 = d(stream);
        int d11 = d(stream);
        return (d(stream) << 24) | (d(stream) << 16) | (d11 << 8) | d10;
    }

    public final int d(InputStream inputStream) {
        return inputStream.read() & 255;
    }

    public final Pair e(InputStream stream) {
        stream.skip(7L);
        int d10 = d(stream);
        int d11 = d(stream);
        int d12 = d(stream);
        if (d10 == 157 && d11 == 1 && d12 == 42) {
            return new Pair(Integer.valueOf(get2BytesAsInt(stream)), Integer.valueOf(get2BytesAsInt(stream)));
        }
        return null;
    }

    public final Pair f(InputStream stream) {
        c(stream);
        if (d(stream) != 47) {
            return null;
        }
        int read = stream.read() & 255;
        int read2 = stream.read();
        return new Pair(Integer.valueOf((read | ((read2 & 63) << 8)) + 1), Integer.valueOf((((stream.read() & 15) << 10) | ((stream.read() & 255) << 2) | ((read2 & 192) >> 6)) + 1));
    }

    public final Pair g(InputStream stream) {
        stream.skip(8L);
        return new Pair(Integer.valueOf(h(stream) + 1), Integer.valueOf(h(stream) + 1));
    }

    public final int h(InputStream stream) {
        return (d(stream) << 16) | (d(stream) << 8) | d(stream);
    }
}
