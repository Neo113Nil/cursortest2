package org.socure.core;

import kotlin.Metadata;
import kotlin.UShort;
import kotlin.UShortArray;
import kotlin.jvm.internal.Intrinsics;
import org.socure.core.Mat;

/* compiled from: MatAt.kt */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0015\n\u0002\b\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u001f\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0002\u0010\bB\u0015\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\t\u001a\u00020\n¢\u0006\u0002\u0010\u000bJ\u0018\u0010\u0010\u001a\u00020\u0002H\u0016ø\u0001\u0000ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u0011\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00020\u0014H\u0016ø\u0001\u0002J\u0011\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u0016H\u0016ø\u0001\u0002J\u0011\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00020\u0018H\u0016ø\u0001\u0002J\u001d\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u0002H\u0016ø\u0001\u0001ø\u0001\u0002¢\u0006\u0004\b\u001c\u0010\u001dJ\u0019\u0010\u001e\u001a\u00020\u001a2\f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00020\u0014H\u0016ø\u0001\u0002J\u0019\u0010\u001f\u001a\u00020\u001a2\f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00020\u0016H\u0016ø\u0001\u0002J\u0019\u0010 \u001a\u00020\u001a2\f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00020\u0018H\u0016ø\u0001\u0002R\u0011\u0010\t\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fø\u0001\u0002\u0082\u0002\u000f\n\u0002\b!\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019¨\u0006!"}, d2 = {"Lorg/socure/core/AtableUShort;", "Lorg/socure/core/Mat$Atable;", "Lkotlin/UShort;", "mat", "Lorg/socure/core/Mat;", "row", "", "col", "(Lorg/socure/core/Mat;II)V", "indices", "", "(Lorg/socure/core/Mat;[I)V", "getIndices", "()[I", "getMat", "()Lorg/socure/core/Mat;", "getV", "getV-Mh2AYeg", "()S", "getV2c", "Lorg/socure/core/Mat$Tuple2;", "getV3c", "Lorg/socure/core/Mat$Tuple3;", "getV4c", "Lorg/socure/core/Mat$Tuple4;", "setV", "", "v", "setV-xj2QHRw", "(S)V", "setV2c", "setV3c", "setV4c", "capturesdk_productionRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class AtableUShort implements Mat.Atable<UShort> {
    public static final int $stable = 8;
    private final int[] indices;
    private final Mat mat;

    public AtableUShort(Mat mat, int[] indices) {
        Intrinsics.checkNotNullParameter(mat, "mat");
        Intrinsics.checkNotNullParameter(indices, "indices");
        this.mat = mat;
        this.indices = indices;
    }

    public final int[] getIndices() {
        return this.indices;
    }

    public final Mat getMat() {
        return this.mat;
    }

    @Override // org.socure.core.Mat.Atable
    public /* bridge */ /* synthetic */ UShort getV() {
        return UShort.m13751boximpl(m15603getVMh2AYeg());
    }

    @Override // org.socure.core.Mat.Atable
    public /* bridge */ /* synthetic */ void setV(UShort uShort) {
        m15604setVxj2QHRw(uShort.getData());
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public AtableUShort(Mat mat, int i, int i2) {
        this(mat, new int[]{i, i2});
        Intrinsics.checkNotNullParameter(mat, "mat");
    }

    /* renamed from: getV-Mh2AYeg, reason: not valid java name */
    public short m15603getVMh2AYeg() {
        short[] m13809constructorimpl = UShortArray.m13809constructorimpl(1);
        MatAtKt.m15617getN38XRpM(this.mat, this.indices, m13809constructorimpl);
        return UShortArray.m13815getMh2AYeg(m13809constructorimpl, 0);
    }

    /* renamed from: setV-xj2QHRw, reason: not valid java name */
    public void m15604setVxj2QHRw(short v) {
        MatAtKt.m15621putN38XRpM(this.mat, this.indices, new short[]{v});
    }

    @Override // org.socure.core.Mat.Atable
    public Mat.Tuple2<UShort> getV2c() {
        short[] m13809constructorimpl = UShortArray.m13809constructorimpl(2);
        MatAtKt.m15617getN38XRpM(this.mat, this.indices, m13809constructorimpl);
        return new Mat.Tuple2<>(UShort.m13751boximpl(UShortArray.m13815getMh2AYeg(m13809constructorimpl, 0)), UShort.m13751boximpl(UShortArray.m13815getMh2AYeg(m13809constructorimpl, 1)));
    }

    @Override // org.socure.core.Mat.Atable
    public void setV2c(Mat.Tuple2<UShort> v) {
        Intrinsics.checkNotNullParameter(v, "v");
        UShort _0 = v.get_0();
        short data = _0 == null ? (short) 0 : _0.getData();
        UShort _1 = v.get_1();
        MatAtKt.m15621putN38XRpM(this.mat, this.indices, new short[]{data, _1 == null ? (short) 0 : _1.getData()});
    }

    @Override // org.socure.core.Mat.Atable
    public Mat.Tuple3<UShort> getV3c() {
        short[] m13809constructorimpl = UShortArray.m13809constructorimpl(3);
        MatAtKt.m15617getN38XRpM(this.mat, this.indices, m13809constructorimpl);
        return new Mat.Tuple3<>(UShort.m13751boximpl(UShortArray.m13815getMh2AYeg(m13809constructorimpl, 0)), UShort.m13751boximpl(UShortArray.m13815getMh2AYeg(m13809constructorimpl, 1)), UShort.m13751boximpl(UShortArray.m13815getMh2AYeg(m13809constructorimpl, 2)));
    }

    @Override // org.socure.core.Mat.Atable
    public void setV3c(Mat.Tuple3<UShort> v) {
        Intrinsics.checkNotNullParameter(v, "v");
        UShort _0 = v.get_0();
        short data = _0 == null ? (short) 0 : _0.getData();
        UShort _1 = v.get_1();
        short data2 = _1 == null ? (short) 0 : _1.getData();
        UShort _2 = v.get_2();
        MatAtKt.m15621putN38XRpM(this.mat, this.indices, new short[]{data, data2, _2 == null ? (short) 0 : _2.getData()});
    }

    @Override // org.socure.core.Mat.Atable
    public Mat.Tuple4<UShort> getV4c() {
        short[] m13809constructorimpl = UShortArray.m13809constructorimpl(4);
        MatAtKt.m15617getN38XRpM(this.mat, this.indices, m13809constructorimpl);
        return new Mat.Tuple4<>(UShort.m13751boximpl(UShortArray.m13815getMh2AYeg(m13809constructorimpl, 0)), UShort.m13751boximpl(UShortArray.m13815getMh2AYeg(m13809constructorimpl, 1)), UShort.m13751boximpl(UShortArray.m13815getMh2AYeg(m13809constructorimpl, 2)), UShort.m13751boximpl(UShortArray.m13815getMh2AYeg(m13809constructorimpl, 3)));
    }

    @Override // org.socure.core.Mat.Atable
    public void setV4c(Mat.Tuple4<UShort> v) {
        Intrinsics.checkNotNullParameter(v, "v");
        UShort _0 = v.get_0();
        short data = _0 == null ? (short) 0 : _0.getData();
        UShort _1 = v.get_1();
        short data2 = _1 == null ? (short) 0 : _1.getData();
        UShort _2 = v.get_2();
        short data3 = _2 == null ? (short) 0 : _2.getData();
        UShort _3 = v.get_3();
        MatAtKt.m15621putN38XRpM(this.mat, this.indices, new short[]{data, data2, data3, _3 == null ? (short) 0 : _3.getData()});
    }
}
