package com.davidehrmann.vcdiff.util;

import java.nio.ByteBuffer;
import java.util.zip.Adler32;
import org.msgpack.core.MessagePack;
import org.tensorflow.lite.schema.BuiltinOptions;

/* loaded from: classes6.dex */
public class ZeroInitializedAdler32 extends Adler32 {
    static final byte[] ADLER_ZERO = {-26, 11, -99, -30, 23, -120, -6, -15, 8, BuiltinOptions.SliceOptions, MessagePack.Code.TRUE, BuiltinOptions.ReadVariableOptions, BuiltinOptions.DepthToSpaceOptions, BuiltinOptions.GeluOptions, -23, BuiltinOptions.RankOptions, -30, MessagePack.Code.FIXARRAY_PREFIX, -118, -90, -85, MessagePack.Code.ARRAY16, -69, -29, BuiltinOptions.BitcastOptions, BuiltinOptions.SelectV2Options, -120, MessagePack.Code.FALSE, BuiltinOptions.Conv3DOptions, -80, BuiltinOptions.PowOptions, BuiltinOptions.ExpOptions, MessagePack.Code.FALSE, -18, MessagePack.Code.FIXEXT1, BuiltinOptions.PowOptions, BuiltinOptions.ArgMaxOptions, BuiltinOptions.SparseToDenseOptions, -22, 13, 3, 18, -114, BuiltinOptions.GreaterEqualOptions, 24, BuiltinOptions.ATan2Options, -95, -104, BuiltinOptions.DynamicUpdateSliceOptions, MessagePack.Code.NIL, BuiltinOptions.WhereOptions, -4, MessagePack.Code.FIXARRAY_PREFIX, -11, -16, BuiltinOptions.DequantizeOptions, -82, BuiltinOptions.BitwiseXorOptions, MessagePack.Code.UINT64, -75, -119, -30, -83, 16, BuiltinOptions.GreaterOptions, -28, BuiltinOptions.CastOptions, -103, BuiltinOptions.TopKV2Options, MessagePack.Code.FIXEXT1, BuiltinOptions.GeluOptions, BuiltinOptions.TopKV2Options, MessagePack.Code.UINT64, BuiltinOptions.ExpOptions, -124, -97, 28, BuiltinOptions.TileOptions, BuiltinOptions.CastOptions, 29, BuiltinOptions.MatrixSetDiagOptions, BuiltinOptions.UnsortedSegmentMaxOptions, -99, -13, BuiltinOptions.NonMaxSuppressionV4Options, -70, BuiltinOptions.SelectV2Options, BuiltinOptions.NotEqualOptions, -11, -69, BuiltinOptions.CastOptions, BuiltinOptions.AssignVariableOptions, BuiltinOptions.DynamicUpdateSliceOptions, -6, 18, -107, -82, MessagePack.Code.FIXEXT4, BuiltinOptions.RankOptions, BuiltinOptions.LessEqualOptions, 10, MessagePack.Code.FIXEXT4, -31, MessagePack.Code.FIXEXT8, -13, BuiltinOptions.BidirectionalSequenceRNNOptions, BuiltinOptions.HashtableFindOptions, -16, BuiltinOptions.RandomOptions, 5, -67, -115, 25, -99, BuiltinOptions.LessOptions, -79, BuiltinOptions.SplitOptions, -108, BuiltinOptions.MatrixSetDiagOptions, -69, MessagePack.Code.STR8, 1, BuiltinOptions.AddNOptions, 32, BuiltinOptions.NotEqualOptions, BuiltinOptions.ScatterNdOptions, -81, BuiltinOptions.MatrixSetDiagOptions, MessagePack.Code.UINT16, -85, BuiltinOptions.SliceOptions, 31, -22, -95, BuiltinOptions.UnsortedSegmentMaxOptions, MessagePack.Code.FIXEXT4, -9, BuiltinOptions.BroadcastToOptions, 16, BuiltinOptions.BidirectionalSequenceRNNOptions, BuiltinOptions.ExpOptions, BuiltinOptions.MatrixSetDiagOptions, -78, MessagePack.Code.FIXARRAY_PREFIX, BuiltinOptions.PackOptions, 27, MessagePack.Code.TRUE, BuiltinOptions.NonMaxSuppressionV4Options, -30, -22, BuiltinOptions.ExpOptions, BuiltinOptions.WhileOptions, MessagePack.Code.NEGFIXINT_PREFIX, BuiltinOptions.ArgMinOptions, 31, -24, MessagePack.Code.FIXEXT2, BuiltinOptions.RightShiftOptions, MessagePack.Code.UINT16, 5, 20, BuiltinOptions.LeakyReluOptions, BuiltinOptions.BitcastOptions, -108, MessagePack.Code.FLOAT32, -100, Byte.MIN_VALUE, MessagePack.Code.BIN16, BuiltinOptions.BatchMatMulOptions, BuiltinOptions.VarHandleOptions, BuiltinOptions.ShapeOptions, MessagePack.Code.FLOAT32, BuiltinOptions.SparseToDenseOptions, -102, BuiltinOptions.ResizeNearestNeighborOptions, MessagePack.Code.UINT16, BuiltinOptions.FloorModOptions, MessagePack.Code.FIXEXT16, BuiltinOptions.SparseToDenseOptions, BuiltinOptions.LogSoftmaxOptions, -92, BuiltinOptions.LogSoftmaxOptions, -2, MessagePack.Code.TRUE, -107, BuiltinOptions.ResizeNearestNeighborOptions, BuiltinOptions.AddNOptions, -14, BuiltinOptions.MatrixSetDiagOptions, -70, -78, 63, 9, -97, 0, -75, -79, BuiltinOptions.SelectOptions, BuiltinOptions.ZerosLikeOptions, BuiltinOptions.MirrorPadOptions, MessagePack.Code.FALSE, BuiltinOptions.FillOptions, -87, -92, -83, BuiltinOptions.PadV2Options, MessagePack.Code.UINT32, -18, MessagePack.Code.EXT8, -68, BuiltinOptions.LogicalAndOptions, BuiltinOptions.NegOptions, BuiltinOptions.RandomOptions, -86, BuiltinOptions.PowOptions, -106, BuiltinOptions.RightShiftOptions, 28, -75, BuiltinOptions.BatchMatMulOptions, MessagePack.Code.UINT8, BuiltinOptions.BitcastOptions, -88, -81, BuiltinOptions.ExpandDimsOptions, -115, -122, -87, -88, MessagePack.Code.TRUE, 7, 21, -103, MessagePack.Code.UINT32, BuiltinOptions.LessEqualOptions, -5, -103, BuiltinOptions.UnsortedSegmentMaxOptions, -121, -103, BuiltinOptions.FloorDivOptions, -80, -81, -105, BuiltinOptions.CosOptions, -27, 25, Byte.MAX_VALUE, BuiltinOptions.LogSoftmaxOptions, -104, 14, BuiltinOptions.HashtableOptions, BuiltinOptions.ExpandDimsOptions, BuiltinOptions.GreaterOptions, -11, -1, 30, 0, MessagePack.Code.FIXEXT1, -103, -73, -65, 22, MessagePack.Code.EXT8, BuiltinOptions.ReadVariableOptions, -11, -114, -7, -2, -26, -69, BuiltinOptions.UnsortedSegmentMaxOptions, 61, -102, BuiltinOptions.MirrorPadOptions, -108, BuiltinOptions.ReverseV2Options, BuiltinOptions.LogicalOrOptions, -24, BuiltinOptions.SplitOptions, 14, -91, BuiltinOptions.MaximumMinimumOptions, BuiltinOptions.NegOptions, -103, BuiltinOptions.SparseToDenseOptions, -29, MessagePack.Code.FIXEXT2, BuiltinOptions.SplitVOptions, MessagePack.Code.ARRAY32, -76, -83, -27, -117, -73, 9, MessagePack.Code.UINT64, -94, -111, MessagePack.Code.BIN8, -27, MessagePack.Code.MAP16, -76, BuiltinOptions.SliceOptions, BuiltinOptions.FillOptions, BuiltinOptions.BatchMatMulOptions, -31, BuiltinOptions.RangeOptions, BuiltinOptions.RandomOptions, 24, -19, BuiltinOptions.GreaterEqualOptions, MessagePack.Code.BIN16, BuiltinOptions.PadV2Options, MessagePack.Code.EXT8, MessagePack.Code.FLOAT64, 4, -9, -72, MessagePack.Code.STR32, BuiltinOptions.AbsOptions, 14, -19, 13, BuiltinOptions.FakeQuantOptions, -113, BuiltinOptions.SparseToDenseOptions, -124, 63, -68, 0, -123, BuiltinOptions.RankOptions, MessagePack.Code.EXT32, -71, BuiltinOptions.HashtableOptions, MessagePack.Code.ARRAY32, -10, BuiltinOptions.TransposeConvOptions, MessagePack.Code.MAP16, -66, MessagePack.Code.MAP32, BuiltinOptions.ReadVariableOptions, BuiltinOptions.FillOptions, MessagePack.Code.INT8, 18, -75, BuiltinOptions.UnsortedSegmentProdOptions, BuiltinOptions.BitwiseXorOptions, -30, -66, -73, -92, BuiltinOptions.ATan2Options, BuiltinOptions.BidirectionalSequenceRNNOptions, -31, -65, BuiltinOptions.ExpandDimsOptions, MessagePack.Code.UINT64, MessagePack.Code.NEGFIXINT_PREFIX, BuiltinOptions.FloorModOptions, BuiltinOptions.PadV2Options, -95, BuiltinOptions.SegmentSumOptions, BuiltinOptions.MatrixDiagOptions, 14, 17, MessagePack.Code.INT32, -111, BuiltinOptions.ShapeOptions, 6, BuiltinOptions.SignOptions, BuiltinOptions.LogicalAndOptions, -5, -71, 15, -72, BuiltinOptions.ZerosLikeOptions, -69, BuiltinOptions.GatherNdOptions, 11, BuiltinOptions.HardSwishOptions, BuiltinOptions.LogicalOrOptions, 17, MessagePack.Code.FIXEXT16, 10, -119, BuiltinOptions.UniqueOptions, BuiltinOptions.BitcastOptions, -30, MessagePack.Code.FIXEXT4, MessagePack.Code.BIN16, BuiltinOptions.AssignVariableOptions, MessagePack.Code.FIXEXT16, 61, -119, -12, 22, 6, 11, -24, 15, BuiltinOptions.ArgMaxOptions, BuiltinOptions.UnidirectionalSequenceLSTMOptions, -6, MessagePack.Code.FIXEXT1, 16, BuiltinOptions.ShapeOptions, 4, -91, MessagePack.Code.FIXSTR_PREFIX, -118, -74, MessagePack.Code.FLOAT64, BuiltinOptions.ATan2Options, -109, BuiltinOptions.BucketizeOptions, -92, BuiltinOptions.BitwiseXorOptions, -124, BuiltinOptions.UnsortedSegmentMinOptions, -1, -113, MessagePack.Code.STR32, BuiltinOptions.ZerosLikeOptions, -86, -99, 27, BuiltinOptions.TransposeConvOptions, BuiltinOptions.FloorModOptions, MessagePack.Code.MAP32, -65, BuiltinOptions.Rfft2dOptions, BuiltinOptions.CallOnceOptions, BuiltinOptions.NonMaxSuppressionV5Options, BuiltinOptions.HashtableOptions, -7, MessagePack.Code.INT8, -67, BuiltinOptions.SegmentSumOptions, 61, BuiltinOptions.ExpOptions, BuiltinOptions.GreaterOptions, BuiltinOptions.SquareOptions, -121, -103, MessagePack.Code.NIL, -28, -4, BuiltinOptions.SparseToDenseOptions, -22, -93, -68, -11, BuiltinOptions.SquareOptions, MessagePack.Code.EXT32, BuiltinOptions.BidirectionalSequenceLSTMOptions, -119, -121, BuiltinOptions.FillOptions, 24, 12, -28, -106, -99, BuiltinOptions.CastOptions, BuiltinOptions.GeluOptions, 15, BuiltinOptions.ZerosLikeOptions, BuiltinOptions.QuantizeOptions, 8, BuiltinOptions.LogicalAndOptions, -21, -98, BuiltinOptions.MaximumMinimumOptions, -92, -122, BuiltinOptions.GreaterEqualOptions, BuiltinOptions.WhereOptions, -85, -4, -100, -104, MessagePack.Code.FIXEXT4, BuiltinOptions.SplitVOptions, BuiltinOptions.PadV2Options, BuiltinOptions.ShapeOptions, BuiltinOptions.PowOptions, 0, BuiltinOptions.WhileOptions, MessagePack.Code.BIN16, BuiltinOptions.NegOptions, -79, MessagePack.Code.FLOAT32, BuiltinOptions.WhileOptions, BuiltinOptions.ShapeOptions, 11, BuiltinOptions.TileOptions, BuiltinOptions.LessEqualOptions, BuiltinOptions.HardSwishOptions, -31, MessagePack.Code.FIXEXT8, BuiltinOptions.ArgMinOptions, BuiltinOptions.HashtableImportOptions, -107, 4, BuiltinOptions.QuantizeOptions, MessagePack.Code.FIXEXT16, -70, -16, -125, -111};
    private static final int MOD_ADLER = 65521;
    private volatile int bytesUpdatedModAdler = 0;

    @Override // java.util.zip.Adler32, java.util.zip.Checksum
    public void update(int i) {
        super.update(i);
        addAndModBytesUpdated(1);
    }

    @Override // java.util.zip.Adler32, java.util.zip.Checksum
    public void update(byte[] bArr, int i, int i2) {
        super.update(bArr, i, i2);
        addAndModBytesUpdated(i2);
    }

    @Override // java.util.zip.Adler32, java.util.zip.Checksum
    public void update(byte[] bArr) {
        super.update(bArr);
        addAndModBytesUpdated(bArr.length);
    }

    @Override // java.util.zip.Adler32, java.util.zip.Checksum
    public void update(ByteBuffer byteBuffer) {
        byte[] bArr = new byte[2048];
        while (true) {
            int min = Math.min(2048, byteBuffer.remaining());
            if (min <= 0) {
                return;
            }
            byteBuffer.get(bArr, 0, min);
            update(bArr, 0, min);
        }
    }

    @Override // java.util.zip.Adler32, java.util.zip.Checksum
    public void reset() {
        super.reset();
        this.bytesUpdatedModAdler = 0;
    }

    @Override // java.util.zip.Adler32, java.util.zip.Checksum
    public long getValue() {
        int value = (int) super.getValue();
        int i = ((65535 & value) - 1) % MOD_ADLER;
        int i2 = ((value >>> 16) - this.bytesUpdatedModAdler) % MOD_ADLER;
        if (i2 < 0) {
            i2 += MOD_ADLER;
        }
        if (i < 0) {
            i += MOD_ADLER;
        }
        return ((i2 << 16) | i) & 4294967295L;
    }

    private void addAndModBytesUpdated(int i) {
        this.bytesUpdatedModAdler = (int) ((this.bytesUpdatedModAdler + i) % 65521);
    }
}
