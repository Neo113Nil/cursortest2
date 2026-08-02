package com.facebook.imagepipeline.bitmaps;

import com.facebook.common.memory.PooledByteBuffer;
import com.facebook.common.memory.PooledByteBufferFactory;
import com.facebook.common.memory.PooledByteBufferOutputStream;
import com.facebook.common.references.CloseableReference;
import java.io.IOException;
import org.msgpack.core.MessagePack;
import org.tensorflow.lite.schema.BuiltinOptions;

/* loaded from: classes6.dex */
public class EmptyJpegGenerator {
    private static final byte[] EMPTY_JPEG_PREFIX = {-1, MessagePack.Code.FIXEXT16, -1, MessagePack.Code.STR32, 0, BuiltinOptions.ZerosLikeOptions, 0, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, MessagePack.Code.NIL, 0, 17, 8};
    private static final byte[] EMPTY_JPEG_SUFFIX = {3, 1, BuiltinOptions.TopKV2Options, 0, 2, 17, 0, 3, 17, 0, -1, MessagePack.Code.BIN8, 0, 31, 0, 0, 1, 5, 1, 1, 1, 1, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, -1, MessagePack.Code.BIN8, 0, -75, 16, 0, 2, 1, 3, 3, 2, 4, 3, 5, 5, 4, 4, 0, 0, 1, BuiltinOptions.BitwiseXorOptions, 1, 2, 3, 0, 4, 17, 5, 18, BuiltinOptions.ExpOptions, BuiltinOptions.TransposeConvOptions, BuiltinOptions.FloorDivOptions, 6, 19, BuiltinOptions.ReverseV2Options, BuiltinOptions.ScatterNdOptions, 7, BuiltinOptions.TopKV2Options, BuiltinOptions.AssignVariableOptions, 20, BuiltinOptions.SparseToDenseOptions, -127, -111, -95, 8, BuiltinOptions.SplitOptions, BuiltinOptions.SquareOptions, -79, MessagePack.Code.NEVER_USED, 21, BuiltinOptions.AddNOptions, MessagePack.Code.INT16, -16, BuiltinOptions.LogSoftmaxOptions, BuiltinOptions.TileOptions, BuiltinOptions.SelectV2Options, BuiltinOptions.RandomOptions, -126, 9, 10, 22, 23, 24, 25, 26, BuiltinOptions.CastOptions, BuiltinOptions.DequantizeOptions, BuiltinOptions.MaximumMinimumOptions, BuiltinOptions.ArgMaxOptions, BuiltinOptions.LessOptions, BuiltinOptions.NegOptions, BuiltinOptions.ExpandDimsOptions, BuiltinOptions.EqualOptions, BuiltinOptions.NotEqualOptions, BuiltinOptions.ShapeOptions, BuiltinOptions.PowOptions, BuiltinOptions.ArgMinOptions, BuiltinOptions.FakeQuantOptions, BuiltinOptions.ZerosLikeOptions, BuiltinOptions.FillOptions, BuiltinOptions.BidirectionalSequenceLSTMOptions, BuiltinOptions.BidirectionalSequenceRNNOptions, BuiltinOptions.UnidirectionalSequenceLSTMOptions, BuiltinOptions.FloorModOptions, BuiltinOptions.RangeOptions, BuiltinOptions.ResizeNearestNeighborOptions, BuiltinOptions.GatherNdOptions, BuiltinOptions.CosOptions, BuiltinOptions.WhereOptions, BuiltinOptions.RankOptions, BuiltinOptions.ReverseSequenceOptions, BuiltinOptions.MatrixDiagOptions, BuiltinOptions.QuantizeOptions, BuiltinOptions.MatrixSetDiagOptions, BuiltinOptions.DensifyOptions, BuiltinOptions.SegmentSumOptions, BuiltinOptions.BatchMatMulOptions, BuiltinOptions.CumsumOptions, BuiltinOptions.CallOnceOptions, BuiltinOptions.BroadcastToOptions, BuiltinOptions.Rfft2dOptions, BuiltinOptions.Conv3DOptions, BuiltinOptions.BucketizeOptions, BuiltinOptions.GeluOptions, BuiltinOptions.DynamicUpdateSliceOptions, BuiltinOptions.UnsortedSegmentProdOptions, BuiltinOptions.UnsortedSegmentMaxOptions, BuiltinOptions.UnsortedSegmentMinOptions, BuiltinOptions.UnsortedSegmentSumOptions, BuiltinOptions.ATan2Options, -125, -124, -123, -122, -121, -120, -119, -118, -110, -109, -108, -107, -106, -105, -104, -103, -102, -94, -93, -92, -91, -90, -89, -88, -87, -86, -78, -77, -76, -75, -74, -73, -72, -71, -70, MessagePack.Code.FALSE, MessagePack.Code.TRUE, MessagePack.Code.BIN8, MessagePack.Code.BIN16, MessagePack.Code.BIN32, MessagePack.Code.EXT8, MessagePack.Code.EXT16, MessagePack.Code.EXT32, MessagePack.Code.FLOAT32, MessagePack.Code.INT32, MessagePack.Code.INT64, MessagePack.Code.FIXEXT1, MessagePack.Code.FIXEXT2, MessagePack.Code.FIXEXT4, MessagePack.Code.FIXEXT8, MessagePack.Code.FIXEXT16, MessagePack.Code.STR8, MessagePack.Code.STR16, -31, -30, -29, -28, -27, -26, -25, -24, -23, -22, -15, -14, -13, -12, -11, -10, -9, -8, -7, -6, -1, MessagePack.Code.BIN8, 0, 31, 1, 0, 3, 1, 1, 1, 1, 1, 1, 1, 1, 1, 0, 0, 0, 0, 0, 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, -1, MessagePack.Code.BIN8, 0, -75, 17, 0, 2, 1, 2, 4, 4, 3, 4, 7, 5, 4, 4, 0, 1, 2, BuiltinOptions.UnsortedSegmentMaxOptions, 0, 1, 2, 3, 17, 4, 5, BuiltinOptions.ExpOptions, BuiltinOptions.TransposeConvOptions, 6, 18, BuiltinOptions.FloorDivOptions, BuiltinOptions.ReverseV2Options, 7, BuiltinOptions.ScatterNdOptions, BuiltinOptions.AssignVariableOptions, 19, BuiltinOptions.TopKV2Options, BuiltinOptions.SparseToDenseOptions, -127, 8, 20, BuiltinOptions.SquareOptions, -111, -95, -79, MessagePack.Code.NEVER_USED, 9, BuiltinOptions.SplitOptions, BuiltinOptions.TileOptions, BuiltinOptions.AddNOptions, -16, 21, BuiltinOptions.SelectV2Options, BuiltinOptions.RandomOptions, MessagePack.Code.INT16, 10, 22, BuiltinOptions.LogSoftmaxOptions, BuiltinOptions.ExpandDimsOptions, -31, BuiltinOptions.CastOptions, -15, 23, 24, 25, 26, BuiltinOptions.DequantizeOptions, BuiltinOptions.MaximumMinimumOptions, BuiltinOptions.ArgMaxOptions, BuiltinOptions.LessOptions, BuiltinOptions.NegOptions, BuiltinOptions.EqualOptions, BuiltinOptions.NotEqualOptions, BuiltinOptions.ShapeOptions, BuiltinOptions.PowOptions, BuiltinOptions.ArgMinOptions, BuiltinOptions.FakeQuantOptions, BuiltinOptions.ZerosLikeOptions, BuiltinOptions.FillOptions, BuiltinOptions.BidirectionalSequenceLSTMOptions, BuiltinOptions.BidirectionalSequenceRNNOptions, BuiltinOptions.UnidirectionalSequenceLSTMOptions, BuiltinOptions.FloorModOptions, BuiltinOptions.RangeOptions, BuiltinOptions.ResizeNearestNeighborOptions, BuiltinOptions.GatherNdOptions, BuiltinOptions.CosOptions, BuiltinOptions.WhereOptions, BuiltinOptions.RankOptions, BuiltinOptions.ReverseSequenceOptions, BuiltinOptions.MatrixDiagOptions, BuiltinOptions.QuantizeOptions, BuiltinOptions.MatrixSetDiagOptions, BuiltinOptions.DensifyOptions, BuiltinOptions.SegmentSumOptions, BuiltinOptions.BatchMatMulOptions, BuiltinOptions.CumsumOptions, BuiltinOptions.CallOnceOptions, BuiltinOptions.BroadcastToOptions, BuiltinOptions.Rfft2dOptions, BuiltinOptions.Conv3DOptions, BuiltinOptions.BucketizeOptions, BuiltinOptions.GeluOptions, BuiltinOptions.DynamicUpdateSliceOptions, BuiltinOptions.UnsortedSegmentProdOptions, BuiltinOptions.UnsortedSegmentMaxOptions, BuiltinOptions.UnsortedSegmentMinOptions, BuiltinOptions.UnsortedSegmentSumOptions, BuiltinOptions.ATan2Options, -126, -125, -124, -123, -122, -121, -120, -119, -118, -110, -109, -108, -107, -106, -105, -104, -103, -102, -94, -93, -92, -91, -90, -89, -88, -87, -86, -78, -77, -76, -75, -74, -73, -72, -71, -70, MessagePack.Code.FALSE, MessagePack.Code.TRUE, MessagePack.Code.BIN8, MessagePack.Code.BIN16, MessagePack.Code.BIN32, MessagePack.Code.EXT8, MessagePack.Code.EXT16, MessagePack.Code.EXT32, MessagePack.Code.FLOAT32, MessagePack.Code.INT32, MessagePack.Code.INT64, MessagePack.Code.FIXEXT1, MessagePack.Code.FIXEXT2, MessagePack.Code.FIXEXT4, MessagePack.Code.FIXEXT8, MessagePack.Code.FIXEXT16, MessagePack.Code.STR8, MessagePack.Code.STR16, -30, -29, -28, -27, -26, -25, -24, -23, -22, -14, -13, -12, -11, -10, -9, -8, -7, -6, -1, MessagePack.Code.STR16, 0, 12, 3, 1, 0, 2, 17, 3, 17, 0, 63, 0, -114, -118, BuiltinOptions.ArgMaxOptions, MessagePack.Code.FIXSTR_PREFIX, 15, -1, MessagePack.Code.STR8};
    private final PooledByteBufferFactory mPooledByteBufferFactory;

    public EmptyJpegGenerator(PooledByteBufferFactory pooledByteBufferFactory) {
        this.mPooledByteBufferFactory = pooledByteBufferFactory;
    }

    public CloseableReference<PooledByteBuffer> generate(short s, short s2) {
        PooledByteBufferOutputStream pooledByteBufferOutputStream = null;
        try {
            try {
                PooledByteBufferFactory pooledByteBufferFactory = this.mPooledByteBufferFactory;
                byte[] bArr = EMPTY_JPEG_PREFIX;
                int length = bArr.length;
                byte[] bArr2 = EMPTY_JPEG_SUFFIX;
                pooledByteBufferOutputStream = pooledByteBufferFactory.newOutputStream(length + bArr2.length + 4);
                pooledByteBufferOutputStream.write(bArr);
                pooledByteBufferOutputStream.write((byte) (s2 >> 8));
                pooledByteBufferOutputStream.write((byte) (s2 & 255));
                pooledByteBufferOutputStream.write((byte) (s >> 8));
                pooledByteBufferOutputStream.write((byte) (s & 255));
                pooledByteBufferOutputStream.write(bArr2);
                return CloseableReference.of(pooledByteBufferOutputStream.toByteBuffer());
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        } finally {
            if (pooledByteBufferOutputStream != null) {
                pooledByteBufferOutputStream.close();
            }
        }
    }
}
