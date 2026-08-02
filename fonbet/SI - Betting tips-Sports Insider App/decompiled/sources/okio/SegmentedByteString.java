package okio;

import io.appmetrica.analytics.networktasks.internal.CommonUrlParts;
import kotlin.KotlinVersion;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.z;
import okio.Buffer;
import org.jetbrains.annotations.NotNull;
import r4.k;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
@Metadata(d1 = {"\u0000F\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\n\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u0005\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\u0010\u0012\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a \u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0003H\u0000\u001a\f\u0010\u0006\u001a\u00020\u0007*\u00020\u0007H\u0000\u001a\f\u0010\u0006\u001a\u00020\b*\u00020\bH\u0000\u001a\f\u0010\u0006\u001a\u00020\u0003*\u00020\u0003H\u0000\u001a\u0015\u0010\t\u001a\u00020\b*\u00020\b2\u0006\u0010\n\u001a\u00020\bH\u0080\f\u001a\u0015\u0010\u000b\u001a\u00020\u0003*\u00020\u00032\u0006\u0010\n\u001a\u00020\bH\u0080\f\u001a\u0015\u0010\f\u001a\u00020\b*\u00020\r2\u0006\u0010\u000e\u001a\u00020\bH\u0080\f\u001a\u0015\u0010\u000f\u001a\u00020\b*\u00020\r2\u0006\u0010\u000e\u001a\u00020\bH\u0080\f\u001a\u0015\u0010\u0010\u001a\u00020\b*\u00020\r2\u0006\u0010\u000e\u001a\u00020\bH\u0080\f\u001a\u0015\u0010\u0010\u001a\u00020\u0003*\u00020\r2\u0006\u0010\u000e\u001a\u00020\u0003H\u0080\f\u001a\u0015\u0010\u0011\u001a\u00020\r*\u00020\r2\u0006\u0010\u000e\u001a\u00020\rH\u0080\f\u001a\u0015\u0010\u0010\u001a\u00020\u0003*\u00020\b2\u0006\u0010\u000e\u001a\u00020\u0003H\u0080\f\u001a\u0019\u0010\u0012\u001a\u00020\u00032\u0006\u0010\u0013\u001a\u00020\u00032\u0006\u0010\u0014\u001a\u00020\bH\u0080\b\u001a\u0019\u0010\u0012\u001a\u00020\u00032\u0006\u0010\u0013\u001a\u00020\b2\u0006\u0010\u0014\u001a\u00020\u0003H\u0080\b\u001a0\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0013\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\b2\u0006\u0010\u0014\u001a\u00020\u00172\u0006\u0010\u0019\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\bH\u0000\u001a\f\u0010\u001a\u001a\u00020\u001b*\u00020\rH\u0000\u001a\f\u0010\u001a\u001a\u00020\u001b*\u00020\bH\u0000\u001a\f\u0010\u001a\u001a\u00020\u001b*\u00020\u0003H\u0000\u001a\u0010\u0010 \u001a\u00020\u001d2\u0006\u0010!\u001a\u00020\u001dH\u0000\u001a\u0014\u0010 \u001a\u00020\b*\u00020%2\u0006\u0010&\u001a\u00020\bH\u0000\u001a\u0014\u0010 \u001a\u00020\b*\u00020\u00172\u0006\u0010'\u001a\u00020\bH\u0000\"\u0014\u0010\u001c\u001a\u00020\u001dX\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001f\"\u0014\u0010\"\u001a\u00020\bX\u0080D¢\u0006\b\n\u0000\u001a\u0004\b#\u0010$¨\u0006("}, d2 = {"checkOffsetAndCount", "", "size", "", "offset", "byteCount", "reverseBytes", "", "", "leftRotate", "bitCount", "rightRotate", "shr", "", "other", "shl", "and", "xor", "minOf", "a", "b", "arrayRangeEquals", "", "", "aOffset", "bOffset", "toHexString", "", "DEFAULT__new_UnsafeCursor", "Lokio/Buffer$UnsafeCursor;", "getDEFAULT__new_UnsafeCursor", "()Lokio/Buffer$UnsafeCursor;", "resolveDefaultParameter", "unsafeCursor", "DEFAULT__ByteString_size", "getDEFAULT__ByteString_size", "()I", "Lokio/ByteString;", "position", "sizeParam", "okio"}, k = 2, mv = {2, 2, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nUtil.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Util.kt\nokio/-SegmentedByteString\n*L\n1#1,185:1\n67#1:186\n73#1:187\n*S KotlinDebug\n*F\n+ 1 Util.kt\nokio/-SegmentedByteString\n*L\n105#1:186\n106#1:187\n*E\n"})
/* renamed from: okio.-SegmentedByteString, reason: invalid class name */
/* loaded from: classes3.dex */
public final class SegmentedByteString {

    @NotNull
    private static final Buffer.UnsafeCursor DEFAULT__new_UnsafeCursor = new Buffer.UnsafeCursor();
    private static final int DEFAULT__ByteString_size = -1234567890;

    public static final int and(byte b10, int i5) {
        return b10 & i5;
    }

    public static final boolean arrayRangeEquals(@NotNull byte[] a7, int i5, @NotNull byte[] b10, int i10, int i11) {
        Intrinsics.checkNotNullParameter(a7, "a");
        Intrinsics.checkNotNullParameter(b10, "b");
        for (int i12 = 0; i12 < i11; i12++) {
            if (a7[i12 + i5] != b10[i12 + i10]) {
                return false;
            }
        }
        return true;
    }

    public static final void checkOffsetAndCount(long j, long j6, long j10) {
        if ((j6 | j10) < 0 || j6 > j || j - j6 < j10) {
            StringBuilder p10 = k.p(j, "size=", " offset=");
            p10.append(j6);
            p10.append(" byteCount=");
            p10.append(j10);
            throw new ArrayIndexOutOfBoundsException(p10.toString());
        }
    }

    public static final int getDEFAULT__ByteString_size() {
        return DEFAULT__ByteString_size;
    }

    @NotNull
    public static final Buffer.UnsafeCursor getDEFAULT__new_UnsafeCursor() {
        return DEFAULT__new_UnsafeCursor;
    }

    public static final int leftRotate(int i5, int i10) {
        return (i5 >>> (32 - i10)) | (i5 << i10);
    }

    public static final long minOf(long j, int i5) {
        return Math.min(j, i5);
    }

    @NotNull
    public static final Buffer.UnsafeCursor resolveDefaultParameter(@NotNull Buffer.UnsafeCursor unsafeCursor) {
        Intrinsics.checkNotNullParameter(unsafeCursor, "unsafeCursor");
        return unsafeCursor == DEFAULT__new_UnsafeCursor ? new Buffer.UnsafeCursor() : unsafeCursor;
    }

    public static final int reverseBytes(int i5) {
        return ((i5 & KotlinVersion.MAX_COMPONENT_VALUE) << 24) | (((-16777216) & i5) >>> 24) | ((16711680 & i5) >>> 8) | ((65280 & i5) << 8);
    }

    public static final long rightRotate(long j, int i5) {
        return (j << (64 - i5)) | (j >>> i5);
    }

    public static final int shl(byte b10, int i5) {
        return b10 << i5;
    }

    public static final int shr(byte b10, int i5) {
        return b10 >> i5;
    }

    @NotNull
    public static final String toHexString(byte b10) {
        return z.g(new char[]{okio.internal.ByteString.getHEX_DIGIT_CHARS()[(b10 >> 4) & 15], okio.internal.ByteString.getHEX_DIGIT_CHARS()[b10 & 15]});
    }

    public static final byte xor(byte b10, byte b11) {
        return (byte) (b10 ^ b11);
    }

    public static final long and(byte b10, long j) {
        return j & b10;
    }

    public static final long minOf(int i5, long j) {
        return Math.min(i5, j);
    }

    public static final int resolveDefaultParameter(@NotNull ByteString byteString, int i5) {
        Intrinsics.checkNotNullParameter(byteString, "<this>");
        return i5 == DEFAULT__ByteString_size ? byteString.size() : i5;
    }

    public static final long reverseBytes(long j) {
        return ((j & 255) << 56) | (((-72057594037927936L) & j) >>> 56) | ((71776119061217280L & j) >>> 40) | ((280375465082880L & j) >>> 24) | ((1095216660480L & j) >>> 8) | ((4278190080L & j) << 8) | ((16711680 & j) << 24) | ((65280 & j) << 40);
    }

    public static final long and(int i5, long j) {
        return j & i5;
    }

    public static final int resolveDefaultParameter(@NotNull byte[] bArr, int i5) {
        Intrinsics.checkNotNullParameter(bArr, "<this>");
        return i5 == DEFAULT__ByteString_size ? bArr.length : i5;
    }

    public static final short reverseBytes(short s8) {
        return (short) (((s8 & 255) << 8) | ((65280 & s8) >>> 8));
    }

    @NotNull
    public static final String toHexString(int i5) {
        if (i5 == 0) {
            return CommonUrlParts.Values.FALSE_INTEGER;
        }
        int i10 = 0;
        char[] cArr = {okio.internal.ByteString.getHEX_DIGIT_CHARS()[(i5 >> 28) & 15], okio.internal.ByteString.getHEX_DIGIT_CHARS()[(i5 >> 24) & 15], okio.internal.ByteString.getHEX_DIGIT_CHARS()[(i5 >> 20) & 15], okio.internal.ByteString.getHEX_DIGIT_CHARS()[(i5 >> 16) & 15], okio.internal.ByteString.getHEX_DIGIT_CHARS()[(i5 >> 12) & 15], okio.internal.ByteString.getHEX_DIGIT_CHARS()[(i5 >> 8) & 15], okio.internal.ByteString.getHEX_DIGIT_CHARS()[(i5 >> 4) & 15], okio.internal.ByteString.getHEX_DIGIT_CHARS()[i5 & 15]};
        while (i10 < 8 && cArr[i10] == '0') {
            i10++;
        }
        return z.h(cArr, i10, 8);
    }

    @NotNull
    public static final String toHexString(long j) {
        if (j == 0) {
            return CommonUrlParts.Values.FALSE_INTEGER;
        }
        int i5 = 0;
        char[] cArr = {okio.internal.ByteString.getHEX_DIGIT_CHARS()[(int) ((j >> 60) & 15)], okio.internal.ByteString.getHEX_DIGIT_CHARS()[(int) ((j >> 56) & 15)], okio.internal.ByteString.getHEX_DIGIT_CHARS()[(int) ((j >> 52) & 15)], okio.internal.ByteString.getHEX_DIGIT_CHARS()[(int) ((j >> 48) & 15)], okio.internal.ByteString.getHEX_DIGIT_CHARS()[(int) ((j >> 44) & 15)], okio.internal.ByteString.getHEX_DIGIT_CHARS()[(int) ((j >> 40) & 15)], okio.internal.ByteString.getHEX_DIGIT_CHARS()[(int) ((j >> 36) & 15)], okio.internal.ByteString.getHEX_DIGIT_CHARS()[(int) ((j >> 32) & 15)], okio.internal.ByteString.getHEX_DIGIT_CHARS()[(int) ((j >> 28) & 15)], okio.internal.ByteString.getHEX_DIGIT_CHARS()[(int) ((j >> 24) & 15)], okio.internal.ByteString.getHEX_DIGIT_CHARS()[(int) ((j >> 20) & 15)], okio.internal.ByteString.getHEX_DIGIT_CHARS()[(int) ((j >> 16) & 15)], okio.internal.ByteString.getHEX_DIGIT_CHARS()[(int) ((j >> 12) & 15)], okio.internal.ByteString.getHEX_DIGIT_CHARS()[(int) ((j >> 8) & 15)], okio.internal.ByteString.getHEX_DIGIT_CHARS()[(int) ((j >> 4) & 15)], okio.internal.ByteString.getHEX_DIGIT_CHARS()[(int) (j & 15)]};
        while (i5 < 16 && cArr[i5] == '0') {
            i5++;
        }
        return z.h(cArr, i5, 16);
    }
}
