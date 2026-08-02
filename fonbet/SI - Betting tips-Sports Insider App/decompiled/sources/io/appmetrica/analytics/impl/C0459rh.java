package io.appmetrica.analytics.impl;

import android.text.TextUtils;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import java.util.Collection;
import java.util.List;
import java.util.Map;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* renamed from: io.appmetrica.analytics.impl.rh, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0459rh implements InterfaceC0416pn {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C0251j9 f14557a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C0534uh f14558b;

    public C0459rh(C0534uh c0534uh, C0251j9 c0251j9) {
        this.f14558b = c0534uh;
        this.f14557a = c0251j9;
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC0416pn
    public final void a(Object obj) {
        List list = (List) obj;
        C0251j9 c0251j9 = this.f14557a;
        if (lo.a((Collection) list)) {
            return;
        }
        c0251j9.f14018d = new C0200h9[list.size()];
        for (int i5 = 0; i5 < list.size(); i5++) {
            C0237il c0237il = (C0237il) list.get(i5);
            C0200h9[] c0200h9Arr = c0251j9.f14018d;
            Map map = Pf.f12751a;
            C0200h9 c0200h9 = new C0200h9();
            Integer num = c0237il.f13952a;
            if (num != null) {
                c0200h9.f13889a = num.intValue();
            }
            Integer num2 = c0237il.f13953b;
            if (num2 != null) {
                c0200h9.f13890b = num2.intValue();
            }
            if (!TextUtils.isEmpty(c0237il.f13955d)) {
                c0200h9.f13891c = c0237il.f13955d;
            }
            c0200h9.f13892d = c0237il.f13954c;
            c0200h9Arr[i5] = c0200h9;
            this.f14558b.f14735g += CodedOutputByteBufferNano.computeMessageSizeNoTag(c0251j9.f14018d[i5]);
            this.f14558b.f14735g += CodedOutputByteBufferNano.computeTagSize(10);
        }
    }
}
