package defpackage;

import com.google.protobuf.Internal;
import com.google.protobuf.MessageLite;
import com.google.protobuf.ProtoSyntax;
import com.google.protobuf.a1;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class mii implements wgc {
    public final ProtoSyntax a;
    public final boolean b;
    public final int[] c;
    public final a1[] d;
    public final MessageLite e;

    public mii(ProtoSyntax protoSyntax, boolean z, int[] iArr, a1[] a1VarArr, Object obj) {
        this.a = protoSyntax;
        this.b = z;
        this.c = iArr;
        this.d = a1VarArr;
        this.e = (MessageLite) Internal.checkNotNull(obj, "defaultInstance");
    }

    @Override // defpackage.wgc
    public final boolean a() {
        return this.b;
    }

    @Override // defpackage.wgc
    public final MessageLite b() {
        return this.e;
    }

    @Override // defpackage.wgc
    public final ProtoSyntax getSyntax() {
        return this.a;
    }
}
