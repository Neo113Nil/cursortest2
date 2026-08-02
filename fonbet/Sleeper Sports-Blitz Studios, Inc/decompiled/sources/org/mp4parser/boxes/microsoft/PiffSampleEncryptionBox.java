package org.mp4parser.boxes.microsoft;

import org.aspectj.lang.JoinPoint;
import org.aspectj.runtime.internal.Conversions;
import org.aspectj.runtime.reflect.Factory;
import org.mp4parser.boxes.iso23001.part7.AbstractSampleEncryptionBox;
import org.mp4parser.support.DoNotParseDetail;
import org.mp4parser.support.RequiresParseDetailAspect;
import org.tensorflow.lite.schema.BuiltinOptions;

/* loaded from: classes10.dex */
public class PiffSampleEncryptionBox extends AbstractSampleEncryptionBox {
    private static /* synthetic */ JoinPoint.StaticPart ajc$tjp_0;
    private static /* synthetic */ JoinPoint.StaticPart ajc$tjp_1;
    private static /* synthetic */ JoinPoint.StaticPart ajc$tjp_2;
    private static /* synthetic */ JoinPoint.StaticPart ajc$tjp_3;
    private static /* synthetic */ JoinPoint.StaticPart ajc$tjp_4;
    private static /* synthetic */ JoinPoint.StaticPart ajc$tjp_5;

    static {
        ajc$preClinit();
    }

    private static /* synthetic */ void ajc$preClinit() {
        Factory factory = new Factory("PiffSampleEncryptionBox.java", PiffSampleEncryptionBox.class);
        ajc$tjp_0 = factory.makeSJP(JoinPoint.METHOD_EXECUTION, factory.makeMethodSig("1", "getAlgorithmId", "org.mp4parser.boxes.microsoft.PiffSampleEncryptionBox", "", "", "", "int"), 46);
        ajc$tjp_1 = factory.makeSJP(JoinPoint.METHOD_EXECUTION, factory.makeMethodSig("1", "setAlgorithmId", "org.mp4parser.boxes.microsoft.PiffSampleEncryptionBox", "int", "algorithmId", "", "void"), 50);
        ajc$tjp_2 = factory.makeSJP(JoinPoint.METHOD_EXECUTION, factory.makeMethodSig("1", "getIvSize", "org.mp4parser.boxes.microsoft.PiffSampleEncryptionBox", "", "", "", "int"), 54);
        ajc$tjp_3 = factory.makeSJP(JoinPoint.METHOD_EXECUTION, factory.makeMethodSig("1", "setIvSize", "org.mp4parser.boxes.microsoft.PiffSampleEncryptionBox", "int", "ivSize", "", "void"), 58);
        ajc$tjp_4 = factory.makeSJP(JoinPoint.METHOD_EXECUTION, factory.makeMethodSig("1", "getKid", "org.mp4parser.boxes.microsoft.PiffSampleEncryptionBox", "", "", "", "[B"), 62);
        ajc$tjp_5 = factory.makeSJP(JoinPoint.METHOD_EXECUTION, factory.makeMethodSig("1", "setKid", "org.mp4parser.boxes.microsoft.PiffSampleEncryptionBox", "[B", "kid", "", "void"), 66);
    }

    public PiffSampleEncryptionBox() {
        super("uuid");
    }

    @Override // org.mp4parser.support.AbstractBox
    public byte[] getUserType() {
        return new byte[]{-94, BuiltinOptions.ArgMinOptions, BuiltinOptions.SplitVOptions, BuiltinOptions.AddNOptions, BuiltinOptions.MatrixSetDiagOptions, -101, BuiltinOptions.SplitVOptions, 20, -94, BuiltinOptions.FillOptions, BuiltinOptions.HashtableFindOptions, BuiltinOptions.SquareOptions, BuiltinOptions.BitcastOptions, BuiltinOptions.SegmentSumOptions, -115, -12};
    }

    public int getAlgorithmId() {
        RequiresParseDetailAspect.aspectOf().before(Factory.makeJP(ajc$tjp_0, this, this));
        return this.algorithmId;
    }

    public void setAlgorithmId(int i) {
        RequiresParseDetailAspect.aspectOf().before(Factory.makeJP(ajc$tjp_1, this, this, Conversions.intObject(i)));
        this.algorithmId = i;
    }

    public int getIvSize() {
        RequiresParseDetailAspect.aspectOf().before(Factory.makeJP(ajc$tjp_2, this, this));
        return this.ivSize;
    }

    public void setIvSize(int i) {
        RequiresParseDetailAspect.aspectOf().before(Factory.makeJP(ajc$tjp_3, this, this, Conversions.intObject(i)));
        this.ivSize = i;
    }

    public byte[] getKid() {
        RequiresParseDetailAspect.aspectOf().before(Factory.makeJP(ajc$tjp_4, this, this));
        return this.kid;
    }

    public void setKid(byte[] bArr) {
        RequiresParseDetailAspect.aspectOf().before(Factory.makeJP(ajc$tjp_5, this, this, bArr));
        this.kid = bArr;
    }

    @Override // org.mp4parser.boxes.iso23001.part7.AbstractSampleEncryptionBox
    @DoNotParseDetail
    public boolean isOverrideTrackEncryptionBoxParameters() {
        return (getFlags() & 1) > 0;
    }

    @DoNotParseDetail
    public void setOverrideTrackEncryptionBoxParameters(boolean z) {
        if (z) {
            setFlags(getFlags() | 1);
        } else {
            setFlags(getFlags() & 16777214);
        }
    }
}
