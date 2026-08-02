package defpackage;

import com.google.protobuf.MessageLite;
import com.google.protobuf.ProtoSyntax;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class knf implements wgc {
    public final MessageLite a;
    public final String b;
    public final Object[] c;
    public final int d;

    public knf(MessageLite messageLite, String str, Object[] objArr) {
        this.a = messageLite;
        this.b = str;
        this.c = objArr;
        char charAt = str.charAt(0);
        if (charAt < 55296) {
            this.d = charAt;
            return;
        }
        int i = charAt & 8191;
        int i2 = 13;
        int i3 = 1;
        while (true) {
            int i4 = i3 + 1;
            char charAt2 = str.charAt(i3);
            if (charAt2 < 55296) {
                this.d = i | (charAt2 << i2);
                return;
            } else {
                i |= (charAt2 & 8191) << i2;
                i2 += 13;
                i3 = i4;
            }
        }
    }

    @Override // defpackage.wgc
    public final boolean a() {
        return (this.d & 2) == 2;
    }

    @Override // defpackage.wgc
    public final MessageLite b() {
        return this.a;
    }

    @Override // defpackage.wgc
    public final ProtoSyntax getSyntax() {
        int i = this.d;
        return (i & 1) != 0 ? ProtoSyntax.PROTO2 : (i & 4) == 4 ? ProtoSyntax.EDITIONS : ProtoSyntax.PROTO3;
    }
}
