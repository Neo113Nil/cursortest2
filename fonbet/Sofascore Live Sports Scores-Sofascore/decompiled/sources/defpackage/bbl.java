package defpackage;

import com.google.protobuf.CodedInputStream;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public enum bbl extends dbl {
    public bbl() {
        super("STRICT", 1);
    }

    @Override // defpackage.dbl
    public final Object a(CodedInputStream codedInputStream) {
        return codedInputStream.readStringRequireUtf8();
    }
}
