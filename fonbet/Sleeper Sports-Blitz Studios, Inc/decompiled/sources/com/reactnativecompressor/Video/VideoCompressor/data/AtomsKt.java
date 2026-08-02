package com.reactnativecompressor.Video.VideoCompressor.data;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.tensorflow.lite.schema.BuiltinOptions;

/* compiled from: Atoms.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0012\n\u0002\b\u001c\u001a\u000e\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003\"\u0011\u0010\u0004\u001a\u00020\u0001¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0011\u0010\u0007\u001a\u00020\u0001¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0006\"\u0011\u0010\t\u001a\u00020\u0001¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u0006\"\u0011\u0010\u000b\u001a\u00020\u0001¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u0006\"\u0011\u0010\r\u001a\u00020\u0001¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u0006\"\u0011\u0010\u000f\u001a\u00020\u0001¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0006\"\u0011\u0010\u0011\u001a\u00020\u0001¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0006\"\u0011\u0010\u0013\u001a\u00020\u0001¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0006\"\u0011\u0010\u0015\u001a\u00020\u0001¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0006\"\u0011\u0010\u0017\u001a\u00020\u0001¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0006\"\u0011\u0010\u0019\u001a\u00020\u0001¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0006\"\u0011\u0010\u001b\u001a\u00020\u0001¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u0006\"\u0011\u0010\u001d\u001a\u00020\u0001¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u0006¨\u0006\u001f"}, d2 = {"fourCcToInt", "", "byteArray", "", "FREE_ATOM", "getFREE_ATOM", "()I", "JUNK_ATOM", "getJUNK_ATOM", "MDAT_ATOM", "getMDAT_ATOM", "MOOV_ATOM", "getMOOV_ATOM", "PNOT_ATOM", "getPNOT_ATOM", "SKIP_ATOM", "getSKIP_ATOM", "WIDE_ATOM", "getWIDE_ATOM", "PICT_ATOM", "getPICT_ATOM", "FTYP_ATOM", "getFTYP_ATOM", "UUID_ATOM", "getUUID_ATOM", "CMOV_ATOM", "getCMOV_ATOM", "STCO_ATOM", "getSTCO_ATOM", "CO64_ATOM", "getCO64_ATOM", "react-native-compressor_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class AtomsKt {
    private static final int FREE_ATOM = fourCcToInt(new byte[]{BuiltinOptions.CumsumOptions, BuiltinOptions.RandomOptions, BuiltinOptions.BatchMatMulOptions, BuiltinOptions.BatchMatMulOptions});
    private static final int JUNK_ATOM = fourCcToInt(new byte[]{BuiltinOptions.Conv3DOptions, BuiltinOptions.DynamicUpdateSliceOptions, BuiltinOptions.HashtableSizeOptions, BuiltinOptions.HashtableOptions});
    private static final int MDAT_ATOM = fourCcToInt(new byte[]{BuiltinOptions.HashtableImportOptions, BuiltinOptions.SegmentSumOptions, BuiltinOptions.ScatterNdOptions, BuiltinOptions.GeluOptions});
    private static final int MOOV_ATOM = fourCcToInt(new byte[]{BuiltinOptions.HashtableImportOptions, BuiltinOptions.VarHandleOptions, BuiltinOptions.VarHandleOptions, BuiltinOptions.UnsortedSegmentProdOptions});
    private static final int PNOT_ATOM = fourCcToInt(new byte[]{BuiltinOptions.ReadVariableOptions, BuiltinOptions.HashtableSizeOptions, BuiltinOptions.VarHandleOptions, BuiltinOptions.GeluOptions});
    private static final int SKIP_ATOM = fourCcToInt(new byte[]{BuiltinOptions.BucketizeOptions, BuiltinOptions.HashtableOptions, BuiltinOptions.Rfft2dOptions, BuiltinOptions.ReadVariableOptions});
    private static final int WIDE_ATOM = fourCcToInt(new byte[]{BuiltinOptions.UnsortedSegmentMaxOptions, BuiltinOptions.Rfft2dOptions, BuiltinOptions.SegmentSumOptions, BuiltinOptions.BatchMatMulOptions});
    private static final int PICT_ATOM = fourCcToInt(new byte[]{BuiltinOptions.UniqueOptions, BuiltinOptions.RangeOptions, BuiltinOptions.ZerosLikeOptions, BuiltinOptions.CosOptions});
    private static final int FTYP_ATOM = fourCcToInt(new byte[]{BuiltinOptions.CumsumOptions, BuiltinOptions.GeluOptions, BuiltinOptions.UnsortedSegmentSumOptions, BuiltinOptions.ReadVariableOptions});
    private static final int UUID_ATOM = fourCcToInt(new byte[]{BuiltinOptions.DynamicUpdateSliceOptions, BuiltinOptions.DynamicUpdateSliceOptions, BuiltinOptions.Rfft2dOptions, BuiltinOptions.SegmentSumOptions});
    private static final int CMOV_ATOM = fourCcToInt(new byte[]{BuiltinOptions.DensifyOptions, BuiltinOptions.HashtableImportOptions, BuiltinOptions.VarHandleOptions, BuiltinOptions.UnsortedSegmentProdOptions});
    private static final int STCO_ATOM = fourCcToInt(new byte[]{BuiltinOptions.BucketizeOptions, BuiltinOptions.GeluOptions, BuiltinOptions.DensifyOptions, BuiltinOptions.VarHandleOptions});
    private static final int CO64_ATOM = fourCcToInt(new byte[]{BuiltinOptions.DensifyOptions, BuiltinOptions.VarHandleOptions, BuiltinOptions.NotEqualOptions, BuiltinOptions.ExpandDimsOptions});

    public static final int fourCcToInt(byte[] byteArray) {
        Intrinsics.checkNotNullParameter(byteArray, "byteArray");
        return ByteBuffer.wrap(byteArray).order(ByteOrder.BIG_ENDIAN).getInt();
    }

    public static final int getFREE_ATOM() {
        return FREE_ATOM;
    }

    public static final int getJUNK_ATOM() {
        return JUNK_ATOM;
    }

    public static final int getMDAT_ATOM() {
        return MDAT_ATOM;
    }

    public static final int getMOOV_ATOM() {
        return MOOV_ATOM;
    }

    public static final int getPNOT_ATOM() {
        return PNOT_ATOM;
    }

    public static final int getSKIP_ATOM() {
        return SKIP_ATOM;
    }

    public static final int getWIDE_ATOM() {
        return WIDE_ATOM;
    }

    public static final int getPICT_ATOM() {
        return PICT_ATOM;
    }

    public static final int getFTYP_ATOM() {
        return FTYP_ATOM;
    }

    public static final int getUUID_ATOM() {
        return UUID_ATOM;
    }

    public static final int getCMOV_ATOM() {
        return CMOV_ATOM;
    }

    public static final int getSTCO_ATOM() {
        return STCO_ATOM;
    }

    public static final int getCO64_ATOM() {
        return CO64_ATOM;
    }
}
