package org.mp4parser.boxes.microsoft;

import org.aspectj.lang.JoinPoint;
import org.aspectj.runtime.reflect.Factory;
import org.mp4parser.boxes.iso23001.part7.AbstractTrackEncryptionBox;
import org.mp4parser.support.RequiresParseDetailAspect;
import org.msgpack.core.MessagePack;
import org.tensorflow.lite.schema.BuiltinOptions;

/* loaded from: classes10.dex */
public class PiffTrackEncryptionBox extends AbstractTrackEncryptionBox {
    private static /* synthetic */ JoinPoint.StaticPart ajc$tjp_0;

    static {
        ajc$preClinit();
    }

    private static /* synthetic */ void ajc$preClinit() {
        Factory factory = new Factory("PiffTrackEncryptionBox.java", PiffTrackEncryptionBox.class);
        ajc$tjp_0 = factory.makeSJP(JoinPoint.METHOD_EXECUTION, factory.makeMethodSig("1", "getFlags", "org.mp4parser.boxes.microsoft.PiffTrackEncryptionBox", "", "", "", "int"), 29);
    }

    public PiffTrackEncryptionBox() {
        super("uuid");
    }

    @Override // org.mp4parser.support.AbstractBox
    public byte[] getUserType() {
        return new byte[]{-119, BuiltinOptions.GeluOptions, MessagePack.Code.STR32, MessagePack.Code.UINT32, BuiltinOptions.SignOptions, -25, BuiltinOptions.SquaredDifferenceOptions, BuiltinOptions.ReverseV2Options, -124, -7, BuiltinOptions.AssignVariableOptions, BuiltinOptions.FloorModOptions, -7, -120, BuiltinOptions.CastOptions, BuiltinOptions.CosOptions};
    }

    @Override // org.mp4parser.support.AbstractFullBox, org.mp4parser.FullBox
    public int getFlags() {
        RequiresParseDetailAspect.aspectOf().before(Factory.makeJP(ajc$tjp_0, this, this));
        return 0;
    }
}
