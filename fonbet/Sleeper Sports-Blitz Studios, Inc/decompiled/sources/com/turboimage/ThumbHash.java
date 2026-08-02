package com.turboimage;

import androidx.media3.exoplayer.upstream.CmcdData;
import com.appsflyer.AppsFlyerProperties;
import com.braze.Constants;
import com.facebook.appevents.iap.InAppPurchaseConstants;
import com.microsoft.codepush.react.CodePushConstants;
import com.nimbusds.jose.jwk.JWKParameterNames;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: ThumbHashDecoder.kt */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0012\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\u00020\u0001:\u0003\u0011\u0012\u0013B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001e\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0005J\u000e\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u0005J\u000e\u0010\r\u001a\u00020\u000e2\u0006\u0010\f\u001a\u00020\u0005J\u000e\u0010\u000f\u001a\u00020\u00102\u0006\u0010\f\u001a\u00020\u0005¨\u0006\u0014"}, d2 = {"Lcom/turboimage/ThumbHash;", "", "<init>", "()V", "rgbaToThumbHash", "", "w", "", CmcdData.STREAMING_FORMAT_HLS, "rgba", "thumbHashToRGBA", "Lcom/turboimage/ThumbHash$Image;", CodePushConstants.PENDING_UPDATE_HASH_KEY, "thumbHashToAverageRGBA", "Lcom/turboimage/ThumbHash$RGBA;", "thumbHashToApproximateAspectRatio", "", "Image", "RGBA", "Channel", "react-native-turbo-image_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class ThumbHash {
    public static final ThumbHash INSTANCE = new ThumbHash();

    private ThumbHash() {
    }

    public final byte[] rgbaToThumbHash(int w, int h, byte[] rgba) {
        int i;
        int i2;
        byte[] rgba2 = rgba;
        Intrinsics.checkNotNullParameter(rgba2, "rgba");
        if (w > 100 || h > 100) {
            throw new IllegalArgumentException((w + "x" + h + " doesn't fit in 100x100").toString());
        }
        float f = 0.0f;
        float f2 = 0.0f;
        float f3 = 0.0f;
        float f4 = 0.0f;
        int i3 = 0;
        int i4 = 0;
        while (true) {
            i = w * h;
            if (i3 >= i) {
                break;
            }
            float f5 = (rgba2[i4 + 3] & 255) / 255.0f;
            float f6 = f5 / 255.0f;
            f2 += (rgba2[i4] & 255) * f6;
            f3 += (rgba2[i4 + 1] & 255) * f6;
            f4 += f6 * (rgba2[i4 + 2] & 255);
            f += f5;
            i3++;
            i4 += 4;
        }
        if (f > 0.0f) {
            f2 /= f;
            f3 /= f;
            f4 /= f;
        }
        boolean z = f < ((float) i);
        int i5 = z ? 5 : 7;
        int max = Math.max(1, Math.round((i5 * w) / Math.max(w, h)));
        int max2 = Math.max(1, Math.round((i5 * h) / Math.max(w, h)));
        float[] fArr = new float[i];
        float[] fArr2 = new float[i];
        float[] fArr3 = new float[i];
        float[] fArr4 = new float[i];
        int i6 = 0;
        int i7 = 0;
        while (i6 < i) {
            float f7 = (rgba2[i7 + 3] & 255) / 255.0f;
            float f8 = 1.0f - f7;
            float f9 = f7 / 255.0f;
            float f10 = (f2 * f8) + ((rgba[i7] & 255) * f9);
            float f11 = (f3 * f8) + ((rgba[i7 + 1] & 255) * f9);
            float f12 = (f8 * f4) + (f9 * (rgba[i7 + 2] & 255));
            float f13 = f10 + f11;
            fArr[i6] = (f13 + f12) / 3.0f;
            fArr2[i6] = (f13 / 2.0f) - f12;
            fArr3[i6] = f10 - f11;
            fArr4[i6] = f7;
            i6++;
            i7 += 4;
            rgba2 = rgba;
        }
        Channel encode = new Channel(Math.max(3, max), Math.max(3, max2)).encode(w, h, fArr);
        Channel encode2 = new Channel(3, 3).encode(w, h, fArr2);
        Channel encode3 = new Channel(3, 3).encode(w, h, fArr3);
        Channel encode4 = z ? new Channel(5, 5).encode(w, h, fArr4) : null;
        boolean z2 = w > h;
        int round = Math.round(encode.getDc() * 63.0f) | (Math.round((encode2.getDc() * 31.5f) + 31.5f) << 6) | (Math.round((encode3.getDc() * 31.5f) + 31.5f) << 12) | (Math.round(encode.getScale() * 31.0f) << 18) | (z ? 8388608 : 0);
        if (z2) {
            max = max2;
        }
        int round2 = (z2 ? 32768 : 0) | (Math.round(encode2.getScale() * 63.0f) << 3) | max | (Math.round(encode3.getScale() * 63.0f) << 9);
        int i8 = z ? 6 : 5;
        int length = encode.getAc().length + encode2.getAc().length + encode3.getAc().length;
        if (z) {
            Intrinsics.checkNotNull(encode4);
            i2 = encode4.getAc().length;
        } else {
            i2 = 0;
        }
        byte[] bArr = new byte[(((length + i2) + 1) / 2) + i8];
        bArr[0] = (byte) round;
        bArr[1] = (byte) (round >> 8);
        bArr[2] = (byte) (round >> 16);
        bArr[3] = (byte) round2;
        bArr[4] = (byte) (round2 >> 8);
        if (z) {
            Intrinsics.checkNotNull(encode4);
            bArr[5] = (byte) (Math.round(encode4.getDc() * 15.0f) | (Math.round(encode4.getScale() * 15.0f) << 4));
        }
        int writeTo = encode3.writeTo(bArr, i8, encode2.writeTo(bArr, i8, encode.writeTo(bArr, i8, 0)));
        if (z) {
            Intrinsics.checkNotNull(encode4);
            encode4.writeTo(bArr, i8, writeTo);
        }
        return bArr;
    }

    public final Image thumbHashToRGBA(byte[] hash) {
        float f;
        int i;
        Channel channel;
        int i2;
        int i3;
        int i4;
        Intrinsics.checkNotNullParameter(hash, "hash");
        int i5 = (hash[0] & 255) | ((hash[1] & 255) << 8) | ((hash[2] & 255) << 16);
        int i6 = (hash[3] & 255) | ((hash[4] & 255) << 8);
        float f2 = (i5 & 63) / 63.0f;
        float f3 = (((i5 >> 6) & 63) / 31.5f) - 1.0f;
        float f4 = (((i5 >> 12) & 63) / 31.5f) - 1.0f;
        float f5 = ((i5 >> 18) & 31) / 31.0f;
        boolean z = (i5 >> 23) != 0;
        float f6 = ((i6 >> 3) & 63) / 63.0f;
        float f7 = ((i6 >> 9) & 63) / 63.0f;
        boolean z2 = (i6 >> 15) != 0;
        int i7 = 7;
        int max = Math.max(3, z2 ? z ? 5 : 7 : i6 & 7);
        if (z2) {
            i7 = 7 & i6;
        } else if (z) {
            i7 = 5;
        }
        int max2 = Math.max(3, i7);
        float f8 = z ? (hash[5] & 15) / 15.0f : 1.0f;
        float f9 = ((hash[5] >> 4) & 15) / 15.0f;
        if (z) {
            f = 1.0f;
            i = 6;
        } else {
            f = 1.0f;
            i = 5;
        }
        Channel channel2 = new Channel(max, max2);
        Channel channel3 = new Channel(3, 3);
        boolean z3 = z;
        Channel channel4 = new Channel(3, 3);
        int decode = channel4.decode(hash, i, channel3.decode(hash, i, channel2.decode(hash, i, 0, f5), f6 * 1.25f), f7 * 1.25f);
        float[] fArr = null;
        if (z3) {
            channel = new Channel(5, 5);
            channel.decode(hash, i, decode, f9);
        } else {
            channel = null;
        }
        float[] ac = channel2.getAc();
        float[] ac2 = channel3.getAc();
        float[] ac3 = channel4.getAc();
        if (z3) {
            Intrinsics.checkNotNull(channel);
            fArr = channel.getAc();
        }
        float thumbHashToApproximateAspectRatio = thumbHashToApproximateAspectRatio(hash);
        int round = Math.round(thumbHashToApproximateAspectRatio > f ? 32.0f : thumbHashToApproximateAspectRatio * 32.0f);
        int round2 = Math.round(thumbHashToApproximateAspectRatio > f ? 32.0f / thumbHashToApproximateAspectRatio : 32.0f);
        byte[] bArr = new byte[round * round2 * 4];
        int max3 = Math.max(max, z3 ? 5 : 3);
        int max4 = Math.max(max2, z3 ? 5 : 3);
        float[] fArr2 = new float[max3];
        float[] fArr3 = new float[max4];
        int i8 = 0;
        int i9 = 0;
        while (i8 < round2) {
            float[] fArr4 = ac3;
            int i10 = 0;
            while (i10 < round) {
                float[] fArr5 = ac;
                int i11 = 0;
                while (i11 < max3) {
                    fArr2[i11] = (float) Math.cos((3.141592653589793d / round) * (i10 + 0.5f) * i11);
                    i11++;
                    f2 = f2;
                    max = max;
                }
                int i12 = max;
                float f10 = f2;
                int i13 = 0;
                while (i13 < max4) {
                    fArr3[i13] = (float) Math.cos((3.141592653589793d / round2) * (i8 + 0.5f) * i13);
                    i13++;
                    i10 = i10;
                    i8 = i8;
                }
                int i14 = i8;
                int i15 = i10;
                float f11 = f10;
                int i16 = 0;
                int i17 = 0;
                while (i16 < max2) {
                    float f12 = fArr3[i16] * 2.0f;
                    int i18 = i16 > 0 ? 0 : 1;
                    int i19 = i16;
                    while (true) {
                        i4 = i17;
                        if (i18 * max2 < i12 * (max2 - i19)) {
                            f11 += fArr5[i4] * fArr2[i18] * f12;
                            i18++;
                            i17 = i4 + 1;
                        }
                    }
                    i16 = i19 + 1;
                    i17 = i4;
                }
                float f13 = f3;
                float f14 = f4;
                int i20 = 0;
                int i21 = 0;
                while (i20 < 3) {
                    float f15 = fArr3[i20] * 2.0f;
                    int i22 = i20 > 0 ? 0 : 1;
                    while (true) {
                        i3 = i20;
                        if (i22 < 3 - i3) {
                            float f16 = fArr2[i22] * f15;
                            f13 += ac2[i21] * f16;
                            f14 += fArr4[i21] * f16;
                            i22++;
                            i21++;
                            i20 = i3;
                        }
                    }
                    i20 = i3 + 1;
                }
                float f17 = f8;
                if (z3) {
                    int i23 = 0;
                    int i24 = 0;
                    while (i23 < 5) {
                        float f18 = fArr3[i23] * 2.0f;
                        int i25 = i23 > 0 ? 0 : 1;
                        while (true) {
                            i2 = i23;
                            if (i25 < 5 - i2) {
                                Intrinsics.checkNotNull(fArr);
                                f17 += fArr[i24] * fArr2[i25] * f18;
                                i25++;
                                i24++;
                                i23 = i2;
                            }
                        }
                        i23 = i2 + 1;
                    }
                }
                float f19 = f11 - (f13 * 0.6666667f);
                float f20 = (((f11 * 3.0f) - f19) + f14) / 2.0f;
                bArr[i9] = (byte) Math.max(0, Math.round(Math.min(f, f20) * 255.0f));
                bArr[i9 + 1] = (byte) Math.max(0, Math.round(Math.min(1.0f, f20 - f14) * 255.0f));
                bArr[i9 + 2] = (byte) Math.max(0, Math.round(Math.min(1.0f, f19) * 255.0f));
                bArr[i9 + 3] = (byte) Math.max(0, Math.round(Math.min(1.0f, f17) * 255.0f));
                i10 = i15 + 1;
                i9 += 4;
                f = 1.0f;
                ac = fArr5;
                f2 = f10;
                max = i12;
                i8 = i14;
            }
            i8++;
            ac3 = fArr4;
            ac = ac;
            f2 = f2;
        }
        return new Image(round, round2, bArr);
    }

    public final RGBA thumbHashToAverageRGBA(byte[] hash) {
        Intrinsics.checkNotNullParameter(hash, "hash");
        float f = (r0 & 63) / 63.0f;
        float f2 = (((r0 >> 6) & 63) / 31.5f) - 1.0f;
        float f3 = (((r0 >> 12) & 63) / 31.5f) - 1.0f;
        float f4 = f - (f2 * 0.6666667f);
        float f5 = (((f * 3.0f) - f4) + f3) / 2.0f;
        return new RGBA(Math.max(0.0f, Math.min(1.0f, f5)), Math.max(0.0f, Math.min(1.0f, f5 - f3)), Math.max(0.0f, Math.min(1.0f, f4)), ((((hash[0] & 255) | ((hash[1] & 255) << 8)) | ((hash[2] & 255) << 16)) >> 23) != 0 ? (hash[5] & 15) / 15.0f : 1.0f);
    }

    public final float thumbHashToApproximateAspectRatio(byte[] hash) {
        Intrinsics.checkNotNullParameter(hash, "hash");
        byte b = hash[3];
        boolean z = (hash[2] & 128) != 0;
        boolean z2 = (hash[4] & 128) != 0;
        int i = 5;
        int i2 = z2 ? z ? 5 : 7 : b & 7;
        if (z2) {
            i = b & 7;
        } else if (!z) {
            i = 7;
        }
        return i2 / i;
    }

    /* compiled from: ThumbHashDecoder.kt */
    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0002\b\u0011\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0006HÆ\u0003J'\u0010\u0016\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0006HÆ\u0001J\u0013\u0010\u0017\u001a\u00020\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001a\u001a\u00020\u0003HÖ\u0001J\t\u0010\u001b\u001a\u00020\u001cHÖ\u0001R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR\u001a\u0010\u0004\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\n\"\u0004\b\u000e\u0010\fR\u001a\u0010\u0005\u001a\u00020\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012¨\u0006\u001d"}, d2 = {"Lcom/turboimage/ThumbHash$Image;", "", "width", "", "height", "rgba", "", "<init>", "(II[B)V", "getWidth", "()I", "setWidth", "(I)V", "getHeight", "setHeight", "getRgba", "()[B", "setRgba", "([B)V", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", InAppPurchaseConstants.METHOD_TO_STRING, "", "react-native-turbo-image_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class Image {
        private int height;
        private byte[] rgba;
        private int width;

        public static /* synthetic */ Image copy$default(Image image, int i, int i2, byte[] bArr, int i3, Object obj) {
            if ((i3 & 1) != 0) {
                i = image.width;
            }
            if ((i3 & 2) != 0) {
                i2 = image.height;
            }
            if ((i3 & 4) != 0) {
                bArr = image.rgba;
            }
            return image.copy(i, i2, bArr);
        }

        /* renamed from: component1, reason: from getter */
        public final int getWidth() {
            return this.width;
        }

        /* renamed from: component2, reason: from getter */
        public final int getHeight() {
            return this.height;
        }

        /* renamed from: component3, reason: from getter */
        public final byte[] getRgba() {
            return this.rgba;
        }

        public final Image copy(int width, int height, byte[] rgba) {
            Intrinsics.checkNotNullParameter(rgba, "rgba");
            return new Image(width, height, rgba);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Image)) {
                return false;
            }
            Image image = (Image) other;
            return this.width == image.width && this.height == image.height && Intrinsics.areEqual(this.rgba, image.rgba);
        }

        public int hashCode() {
            return (((Integer.hashCode(this.width) * 31) + Integer.hashCode(this.height)) * 31) + Arrays.hashCode(this.rgba);
        }

        public String toString() {
            return "Image(width=" + this.width + ", height=" + this.height + ", rgba=" + Arrays.toString(this.rgba) + ")";
        }

        public Image(int i, int i2, byte[] rgba) {
            Intrinsics.checkNotNullParameter(rgba, "rgba");
            this.width = i;
            this.height = i2;
            this.rgba = rgba;
        }

        public final int getHeight() {
            return this.height;
        }

        public final byte[] getRgba() {
            return this.rgba;
        }

        public final int getWidth() {
            return this.width;
        }

        public final void setHeight(int i) {
            this.height = i;
        }

        public final void setRgba(byte[] bArr) {
            Intrinsics.checkNotNullParameter(bArr, "<set-?>");
            this.rgba = bArr;
        }

        public final void setWidth(int i) {
            this.width = i;
        }
    }

    /* compiled from: ThumbHashDecoder.kt */
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0015\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0003HÆ\u0003J1\u0010\u0017\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0018\u001a\u00020\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001b\u001a\u00020\u001cHÖ\u0001J\t\u0010\u001d\u001a\u00020\u001eHÖ\u0001R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR\u001a\u0010\u0004\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\n\"\u0004\b\u000e\u0010\fR\u001a\u0010\u0005\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\n\"\u0004\b\u0010\u0010\fR\u001a\u0010\u0006\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\n\"\u0004\b\u0012\u0010\f¨\u0006\u001f"}, d2 = {"Lcom/turboimage/ThumbHash$RGBA;", "", JWKParameterNames.RSA_OTHER_PRIMES__PRIME_FACTOR, "", "g", "b", "a", "<init>", "(FFFF)V", "getR", "()F", "setR", "(F)V", "getG", "setG", "getB", "setB", "getA", "setA", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", InAppPurchaseConstants.METHOD_TO_STRING, "", "react-native-turbo-image_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class RGBA {
        private float a;
        private float b;
        private float g;
        private float r;

        public static /* synthetic */ RGBA copy$default(RGBA rgba, float f, float f2, float f3, float f4, int i, Object obj) {
            if ((i & 1) != 0) {
                f = rgba.r;
            }
            if ((i & 2) != 0) {
                f2 = rgba.g;
            }
            if ((i & 4) != 0) {
                f3 = rgba.b;
            }
            if ((i & 8) != 0) {
                f4 = rgba.a;
            }
            return rgba.copy(f, f2, f3, f4);
        }

        /* renamed from: component1, reason: from getter */
        public final float getR() {
            return this.r;
        }

        /* renamed from: component2, reason: from getter */
        public final float getG() {
            return this.g;
        }

        /* renamed from: component3, reason: from getter */
        public final float getB() {
            return this.b;
        }

        /* renamed from: component4, reason: from getter */
        public final float getA() {
            return this.a;
        }

        public final RGBA copy(float r, float g, float b, float a2) {
            return new RGBA(r, g, b, a2);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof RGBA)) {
                return false;
            }
            RGBA rgba = (RGBA) other;
            return Float.compare(this.r, rgba.r) == 0 && Float.compare(this.g, rgba.g) == 0 && Float.compare(this.b, rgba.b) == 0 && Float.compare(this.a, rgba.a) == 0;
        }

        public int hashCode() {
            return (((((Float.hashCode(this.r) * 31) + Float.hashCode(this.g)) * 31) + Float.hashCode(this.b)) * 31) + Float.hashCode(this.a);
        }

        public String toString() {
            return "RGBA(r=" + this.r + ", g=" + this.g + ", b=" + this.b + ", a=" + this.a + ")";
        }

        public RGBA(float f, float f2, float f3, float f4) {
            this.r = f;
            this.g = f2;
            this.b = f3;
            this.a = f4;
        }

        public final float getA() {
            return this.a;
        }

        public final float getB() {
            return this.b;
        }

        public final float getG() {
            return this.g;
        }

        public final float getR() {
            return this.r;
        }

        public final void setA(float f) {
            this.a = f;
        }

        public final void setB(float f) {
            this.b = f;
        }

        public final void setG(float f) {
            this.g = f;
        }

        public final void setR(float f) {
            this.r = f;
        }
    }

    /* compiled from: ThumbHashDecoder.kt */
    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\n\n\u0002\u0010\u0007\n\u0002\b\u0005\n\u0002\u0010\u0014\n\u0002\b\r\n\u0002\u0010\u0012\n\u0002\b\u0004\b\u0002\u0018\u00002\u00020\u0001B\u0019\b\u0000\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u001e\u0010\u001c\u001a\u00020\u00002\u0006\u0010\u001d\u001a\u00020\u00032\u0006\u0010\u001e\u001a\u00020\u00032\u0006\u0010\u001f\u001a\u00020\u0014J&\u0010 \u001a\u00020\u00032\u0006\u0010!\u001a\u00020\"2\u0006\u0010#\u001a\u00020\u00032\u0006\u0010$\u001a\u00020\u00032\u0006\u0010\u0019\u001a\u00020\u000eJ\u001e\u0010%\u001a\u00020\u00032\u0006\u0010!\u001a\u00020\"2\u0006\u0010#\u001a\u00020\u00032\u0006\u0010$\u001a\u00020\u0003R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u001a\u0010\u0004\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\b\"\u0004\b\f\u0010\nR\u001a\u0010\r\u001a\u00020\u000eX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0013\u001a\u00020\u0014X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018R\u001a\u0010\u0019\u001a\u00020\u000eX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001a\u0010\u0010\"\u0004\b\u001b\u0010\u0012¨\u0006&"}, d2 = {"Lcom/turboimage/ThumbHash$Channel;", "", "nx", "", "ny", "<init>", "(II)V", "getNx", "()I", "setNx", "(I)V", "getNy", "setNy", "dc", "", "getDc", "()F", "setDc", "(F)V", Constants.BRAZE_PUSH_ACCENT_KEY, "", "getAc", "()[F", "setAc", "([F)V", "scale", "getScale", "setScale", "encode", "w", CmcdData.STREAMING_FORMAT_HLS, AppsFlyerProperties.CHANNEL, "decode", CodePushConstants.PENDING_UPDATE_HASH_KEY, "", "start", "index", "writeTo", "react-native-turbo-image_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    private static final class Channel {
        private float[] ac;
        private float dc;
        private int nx;
        private int ny;
        private float scale;

        public Channel(int i, int i2) {
            this.nx = i;
            this.ny = i2;
            int i3 = 0;
            int i4 = 0;
            while (i3 < i2) {
                int i5 = i3 > 0 ? 0 : 1;
                while (true) {
                    int i6 = this.ny;
                    if (i5 * i6 < this.nx * (i6 - i3)) {
                        i4++;
                        i5++;
                    }
                }
                i3++;
            }
            this.ac = new float[i4];
        }

        public final int getNx() {
            return this.nx;
        }

        public final int getNy() {
            return this.ny;
        }

        public final void setNx(int i) {
            this.nx = i;
        }

        public final void setNy(int i) {
            this.ny = i;
        }

        public final float getDc() {
            return this.dc;
        }

        public final void setDc(float f) {
            this.dc = f;
        }

        public final float[] getAc() {
            return this.ac;
        }

        public final void setAc(float[] fArr) {
            Intrinsics.checkNotNullParameter(fArr, "<set-?>");
            this.ac = fArr;
        }

        public final float getScale() {
            return this.scale;
        }

        public final void setScale(float f) {
            this.scale = f;
        }

        public final Channel encode(int w, int h, float[] channel) {
            double d;
            int i = h;
            Intrinsics.checkNotNullParameter(channel, "channel");
            float[] fArr = new float[w];
            int i2 = this.ny;
            int i3 = 0;
            int i4 = 0;
            while (i3 < i2) {
                int i5 = 0;
                while (true) {
                    int i6 = this.ny;
                    if (i5 * i6 < this.nx * (i6 - i3)) {
                        int i7 = 0;
                        while (true) {
                            d = 3.141592653589793d;
                            if (i7 >= w) {
                                break;
                            }
                            fArr[i7] = (float) Math.cos((3.141592653589793d / w) * i5 * (i7 + 0.5f));
                            i7++;
                        }
                        int i8 = 0;
                        float f = 0.0f;
                        while (i8 < i) {
                            double d2 = d;
                            float cos = (float) Math.cos((d2 / i) * i3 * (i8 + 0.5f));
                            for (int i9 = 0; i9 < w; i9++) {
                                f += channel[(i8 * w) + i9] * fArr[i9] * cos;
                            }
                            i8++;
                            i = h;
                            d = d2;
                        }
                        float f2 = f / (w * h);
                        if (i5 > 0 || i3 > 0) {
                            this.ac[i4] = f2;
                            this.scale = Math.max(this.scale, Math.abs(f2));
                            i4++;
                        } else {
                            this.dc = f2;
                        }
                        i5++;
                        i = h;
                    }
                }
                i3++;
                i = h;
            }
            if (this.scale > 0.0f) {
                int length = this.ac.length;
                for (int i10 = 0; i10 < length; i10++) {
                    float[] fArr2 = this.ac;
                    fArr2[i10] = ((0.5f / this.scale) * fArr2[i10]) + 0.5f;
                }
            }
            return this;
        }

        public final int decode(byte[] hash, int start, int index, float scale) {
            Intrinsics.checkNotNullParameter(hash, "hash");
            int length = this.ac.length;
            for (int i = 0; i < length; i++) {
                this.ac[i] = ((((hash[(index >> 1) + start] >> ((index & 1) << 2)) & 15) / 7.5f) - 1.0f) * scale;
                index++;
            }
            return index;
        }

        public final int writeTo(byte[] hash, int start, int index) {
            Intrinsics.checkNotNullParameter(hash, "hash");
            for (float f : this.ac) {
                int i = (index >> 1) + start;
                hash[i] = (byte) ((Math.round(f * 15.0f) << ((index & 1) << 2)) | hash[i]);
                index++;
            }
            return index;
        }
    }
}
