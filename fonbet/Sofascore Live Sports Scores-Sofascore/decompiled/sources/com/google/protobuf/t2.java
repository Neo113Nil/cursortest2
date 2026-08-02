package com.google.protobuf;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public abstract class t2 {
    public abstract UnknownFieldSetLite a(Object obj);

    public final boolean b(int i, s sVar, Object obj) {
        CodedInputStream codedInputStream = sVar.a;
        int i2 = sVar.b;
        int tagFieldNumber = WireFormat.getTagFieldNumber(i2);
        int tagWireType = WireFormat.getTagWireType(i2);
        if (tagWireType == 0) {
            sVar.x(0);
            ((UnknownFieldSetLite) obj).storeField(WireFormat.makeTag(tagFieldNumber, 0), Long.valueOf(codedInputStream.readInt64()));
            return true;
        }
        if (tagWireType == 1) {
            sVar.x(1);
            ((UnknownFieldSetLite) obj).storeField(WireFormat.makeTag(tagFieldNumber, 1), Long.valueOf(codedInputStream.readFixed64()));
            return true;
        }
        if (tagWireType == 2) {
            ((UnknownFieldSetLite) obj).storeField(WireFormat.makeTag(tagFieldNumber, 2), sVar.e());
            return true;
        }
        if (tagWireType != 3) {
            if (tagWireType == 4) {
                return false;
            }
            if (tagWireType != 5) {
                throw InvalidProtocolBufferException.invalidWireType();
            }
            sVar.x(5);
            ((UnknownFieldSetLite) obj).storeField(WireFormat.makeTag(tagFieldNumber, 5), Integer.valueOf(codedInputStream.readFixed32()));
            return true;
        }
        UnknownFieldSetLite newInstance = UnknownFieldSetLite.newInstance();
        int makeTag = WireFormat.makeTag(tagFieldNumber, 4);
        int i3 = i + 1;
        if (i3 >= 100) {
            throw InvalidProtocolBufferException.recursionLimitExceeded();
        }
        while (sVar.a() != Integer.MAX_VALUE && b(i3, sVar, newInstance)) {
        }
        if (makeTag != sVar.b) {
            throw InvalidProtocolBufferException.invalidEndTag();
        }
        newInstance.makeImmutable();
        ((UnknownFieldSetLite) obj).storeField(WireFormat.makeTag(tagFieldNumber, 3), newInstance);
        return true;
    }

    public abstract void c(Object obj, Object obj2);
}
