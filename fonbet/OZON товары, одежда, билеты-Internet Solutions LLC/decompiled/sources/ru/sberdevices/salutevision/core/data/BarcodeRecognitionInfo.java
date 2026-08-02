package ru.sberdevices.salutevision.core.data;

import B0.C2454a;
import B4.V;
import Pk0.b;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.sberdevices.salutevision.core.data.SaluteVisionRecognition;

@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0012\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b(\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001B\u008b\u0001\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\n\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u000f\u001a\u00020\u0010\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\u0006\u0010\u0012\u001a\u00020\u0010\u0012\u0006\u0010\u0013\u001a\u00020\u0014\u0012\u0006\u0010\u0015\u001a\u00020\b\u0012\u0006\u0010\u0016\u001a\u00020\b¢\u0006\u0002\u0010\u0017J\u000b\u0010+\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010,\u001a\u00020\u0010HÆ\u0003J\t\u0010-\u001a\u00020\u0010HÆ\u0003J\t\u0010.\u001a\u00020\u0010HÆ\u0003J\t\u0010/\u001a\u00020\u0014HÆ\u0003J\t\u00100\u001a\u00020\bHÆ\u0003J\t\u00101\u001a\u00020\bHÆ\u0003J\u000b\u00102\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u00103\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u00104\u001a\u00020\bHÆ\u0003J\t\u00105\u001a\u00020\nHÆ\u0003J\u000b\u00106\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u00107\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u00108\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u00109\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u00ad\u0001\u0010:\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\n2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u000f\u001a\u00020\u00102\b\b\u0002\u0010\u0011\u001a\u00020\u00102\b\b\u0002\u0010\u0012\u001a\u00020\u00102\b\b\u0002\u0010\u0013\u001a\u00020\u00142\b\b\u0002\u0010\u0015\u001a\u00020\b2\b\b\u0002\u0010\u0016\u001a\u00020\bHÆ\u0001J\u0013\u0010;\u001a\u00020\b2\b\u0010<\u001a\u0004\u0018\u00010=HÖ\u0003J\t\u0010>\u001a\u00020\u0010HÖ\u0001J\t\u0010?\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0013\u001a\u00020\u0014¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0013\u0010\u000b\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001dR\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001fR\u0011\u0010\u0016\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u001fR\u0011\u0010\u0015\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u001fR\u0011\u0010\u0012\u001a\u00020\u0010¢\u0006\b\n\u0000\u001a\u0004\b \u0010!R\u0011\u0010\t\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010#R\u0011\u0010\u000f\u001a\u00020\u0010¢\u0006\b\n\u0000\u001a\u0004\b$\u0010!R\u0013\u0010\u000e\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b%\u0010\u001bR\u0011\u0010\u0011\u001a\u00020\u0010¢\u0006\b\n\u0000\u001a\u0004\b&\u0010!R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b'\u0010\u001bR\u0013\u0010\r\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b(\u0010\u001bR\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b)\u0010\u001bR\u0013\u0010\f\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b*\u0010\u001b¨\u0006@"}, d2 = {"Lru/sberdevices/salutevision/core/data/BarcodeRecognitionInfo;", "Lru/sberdevices/salutevision/core/data/SaluteVisionRecognition$Info;", "text", "", "format", "Lru/sberdevices/salutevision/core/data/BarcodeFormat;", "sourceEncoding", "hasEci", "", "rawBytes", "", "ecLevel", "version", "symbologyIdentifier", "saiId", "saiCount", "", "saiIndex", "lineCount", "aspectRatio", "", "isMirrored", "isInverted", "(Ljava/lang/String;Lru/sberdevices/salutevision/core/data/BarcodeFormat;Ljava/lang/String;Z[BLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;IIIFZZ)V", "getAspectRatio", "()F", "getEcLevel", "()Ljava/lang/String;", "getFormat", "()Lru/sberdevices/salutevision/core/data/BarcodeFormat;", "getHasEci", "()Z", "getLineCount", "()I", "getRawBytes", "()[B", "getSaiCount", "getSaiId", "getSaiIndex", "getSourceEncoding", "getSymbologyIdentifier", "getText", "getVersion", "component1", "component10", "component11", "component12", "component13", "component14", "component15", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "other", "", "hashCode", "toString", "salutevision-core_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class BarcodeRecognitionInfo implements SaluteVisionRecognition.Info {
    private final float aspectRatio;
    private final String ecLevel;
    private final BarcodeFormat format;
    private final boolean hasEci;
    private final boolean isInverted;
    private final boolean isMirrored;
    private final int lineCount;

    @NotNull
    private final byte[] rawBytes;
    private final int saiCount;
    private final String saiId;
    private final int saiIndex;
    private final String sourceEncoding;
    private final String symbologyIdentifier;
    private final String text;
    private final String version;

    public BarcodeRecognitionInfo(String str, BarcodeFormat barcodeFormat, String str2, boolean z11, @NotNull byte[] rawBytes, String str3, String str4, String str5, String str6, int i11, int i12, int i13, float f7, boolean z12, boolean z13) {
        Intrinsics.checkNotNullParameter(rawBytes, "rawBytes");
        this.text = str;
        this.format = barcodeFormat;
        this.sourceEncoding = str2;
        this.hasEci = z11;
        this.rawBytes = rawBytes;
        this.ecLevel = str3;
        this.version = str4;
        this.symbologyIdentifier = str5;
        this.saiId = str6;
        this.saiCount = i11;
        this.saiIndex = i12;
        this.lineCount = i13;
        this.aspectRatio = f7;
        this.isMirrored = z12;
        this.isInverted = z13;
    }

    /* renamed from: component1, reason: from getter */
    public final String getText() {
        return this.text;
    }

    /* renamed from: component10, reason: from getter */
    public final int getSaiCount() {
        return this.saiCount;
    }

    /* renamed from: component11, reason: from getter */
    public final int getSaiIndex() {
        return this.saiIndex;
    }

    /* renamed from: component12, reason: from getter */
    public final int getLineCount() {
        return this.lineCount;
    }

    /* renamed from: component13, reason: from getter */
    public final float getAspectRatio() {
        return this.aspectRatio;
    }

    /* renamed from: component14, reason: from getter */
    public final boolean getIsMirrored() {
        return this.isMirrored;
    }

    /* renamed from: component15, reason: from getter */
    public final boolean getIsInverted() {
        return this.isInverted;
    }

    /* renamed from: component2, reason: from getter */
    public final BarcodeFormat getFormat() {
        return this.format;
    }

    /* renamed from: component3, reason: from getter */
    public final String getSourceEncoding() {
        return this.sourceEncoding;
    }

    /* renamed from: component4, reason: from getter */
    public final boolean getHasEci() {
        return this.hasEci;
    }

    @NotNull
    /* renamed from: component5, reason: from getter */
    public final byte[] getRawBytes() {
        return this.rawBytes;
    }

    /* renamed from: component6, reason: from getter */
    public final String getEcLevel() {
        return this.ecLevel;
    }

    /* renamed from: component7, reason: from getter */
    public final String getVersion() {
        return this.version;
    }

    /* renamed from: component8, reason: from getter */
    public final String getSymbologyIdentifier() {
        return this.symbologyIdentifier;
    }

    /* renamed from: component9, reason: from getter */
    public final String getSaiId() {
        return this.saiId;
    }

    @NotNull
    public final BarcodeRecognitionInfo copy(String text, BarcodeFormat format, String sourceEncoding, boolean hasEci, @NotNull byte[] rawBytes, String ecLevel, String version, String symbologyIdentifier, String saiId, int saiCount, int saiIndex, int lineCount, float aspectRatio, boolean isMirrored, boolean isInverted) {
        Intrinsics.checkNotNullParameter(rawBytes, "rawBytes");
        return new BarcodeRecognitionInfo(text, format, sourceEncoding, hasEci, rawBytes, ecLevel, version, symbologyIdentifier, saiId, saiCount, saiIndex, lineCount, aspectRatio, isMirrored, isInverted);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof BarcodeRecognitionInfo)) {
            return false;
        }
        BarcodeRecognitionInfo barcodeRecognitionInfo = (BarcodeRecognitionInfo) other;
        return Intrinsics.d(this.text, barcodeRecognitionInfo.text) && this.format == barcodeRecognitionInfo.format && Intrinsics.d(this.sourceEncoding, barcodeRecognitionInfo.sourceEncoding) && this.hasEci == barcodeRecognitionInfo.hasEci && Intrinsics.d(this.rawBytes, barcodeRecognitionInfo.rawBytes) && Intrinsics.d(this.ecLevel, barcodeRecognitionInfo.ecLevel) && Intrinsics.d(this.version, barcodeRecognitionInfo.version) && Intrinsics.d(this.symbologyIdentifier, barcodeRecognitionInfo.symbologyIdentifier) && Intrinsics.d(this.saiId, barcodeRecognitionInfo.saiId) && this.saiCount == barcodeRecognitionInfo.saiCount && this.saiIndex == barcodeRecognitionInfo.saiIndex && this.lineCount == barcodeRecognitionInfo.lineCount && Float.compare(this.aspectRatio, barcodeRecognitionInfo.aspectRatio) == 0 && this.isMirrored == barcodeRecognitionInfo.isMirrored && this.isInverted == barcodeRecognitionInfo.isInverted;
    }

    public final float getAspectRatio() {
        return this.aspectRatio;
    }

    public final String getEcLevel() {
        return this.ecLevel;
    }

    public final BarcodeFormat getFormat() {
        return this.format;
    }

    public final boolean getHasEci() {
        return this.hasEci;
    }

    public final int getLineCount() {
        return this.lineCount;
    }

    @NotNull
    public final byte[] getRawBytes() {
        return this.rawBytes;
    }

    public final int getSaiCount() {
        return this.saiCount;
    }

    public final String getSaiId() {
        return this.saiId;
    }

    public final int getSaiIndex() {
        return this.saiIndex;
    }

    public final String getSourceEncoding() {
        return this.sourceEncoding;
    }

    public final String getSymbologyIdentifier() {
        return this.symbologyIdentifier;
    }

    public final String getText() {
        return this.text;
    }

    public final String getVersion() {
        return this.version;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        String str = this.text;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        BarcodeFormat barcodeFormat = this.format;
        int hashCode2 = (hashCode + (barcodeFormat == null ? 0 : barcodeFormat.hashCode())) * 31;
        String str2 = this.sourceEncoding;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        boolean z11 = this.hasEci;
        int i11 = z11;
        if (z11 != 0) {
            i11 = 1;
        }
        int hashCode4 = (Arrays.hashCode(this.rawBytes) + ((hashCode3 + i11) * 31)) * 31;
        String str3 = this.ecLevel;
        int hashCode5 = (hashCode4 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.version;
        int hashCode6 = (hashCode5 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.symbologyIdentifier;
        int hashCode7 = (hashCode6 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.saiId;
        int a11 = b.a(this.aspectRatio, C2454a.a(this.lineCount, C2454a.a(this.saiIndex, C2454a.a(this.saiCount, (hashCode7 + (str6 != null ? str6.hashCode() : 0)) * 31, 31), 31), 31), 31);
        boolean z12 = this.isMirrored;
        int i12 = z12;
        if (z12 != 0) {
            i12 = 1;
        }
        int i13 = (a11 + i12) * 31;
        boolean z13 = this.isInverted;
        return i13 + (z13 ? 1 : z13 ? 1 : 0);
    }

    public final boolean isInverted() {
        return this.isInverted;
    }

    public final boolean isMirrored() {
        return this.isMirrored;
    }

    @NotNull
    public String toString() {
        StringBuilder sb2 = new StringBuilder("BarcodeRecognitionInfo(text=");
        sb2.append(this.text);
        sb2.append(", format=");
        sb2.append(this.format);
        sb2.append(", sourceEncoding=");
        sb2.append(this.sourceEncoding);
        sb2.append(", hasEci=");
        sb2.append(this.hasEci);
        sb2.append(", rawBytes=");
        sb2.append(Arrays.toString(this.rawBytes));
        sb2.append(", ecLevel=");
        sb2.append(this.ecLevel);
        sb2.append(", version=");
        sb2.append(this.version);
        sb2.append(", symbologyIdentifier=");
        sb2.append(this.symbologyIdentifier);
        sb2.append(", saiId=");
        sb2.append(this.saiId);
        sb2.append(", saiCount=");
        sb2.append(this.saiCount);
        sb2.append(", saiIndex=");
        sb2.append(this.saiIndex);
        sb2.append(", lineCount=");
        sb2.append(this.lineCount);
        sb2.append(", aspectRatio=");
        sb2.append(this.aspectRatio);
        sb2.append(", isMirrored=");
        sb2.append(this.isMirrored);
        sb2.append(", isInverted=");
        return V.d(sb2, this.isInverted, ')');
    }
}
