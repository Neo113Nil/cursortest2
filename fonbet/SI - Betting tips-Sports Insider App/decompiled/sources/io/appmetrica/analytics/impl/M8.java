package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreapi.internal.data.IBinaryDataHelper;
import io.appmetrica.analytics.coreutils.internal.collection.CollectionUtils;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class M8 {

    /* renamed from: a, reason: collision with root package name */
    public final int f12573a;

    /* renamed from: b, reason: collision with root package name */
    public final R8 f12574b;

    /* renamed from: c, reason: collision with root package name */
    public O8 f12575c;

    public M8(R8 r82, int i5) {
        this.f12573a = i5;
        this.f12574b = r82;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:15:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a() {
        O8 o82;
        int i5;
        int i10;
        byte[] bArr;
        R8 r82 = this.f12574b;
        r82.getClass();
        try {
            bArr = r82.f12810c.get("event_hashes");
        } catch (Throwable unused) {
            P8 p82 = r82.f12808a;
            r82.f12809b.getClass();
            C0526u9 c0526u9 = new C0526u9();
            p82.getClass();
            o82 = new O8(c0526u9.f14722a, c0526u9.f14723b, c0526u9.f14724c, CollectionUtils.hashSetFromIntArray(c0526u9.f14725d));
        }
        if (bArr != null && bArr.length != 0) {
            P8 p83 = r82.f12808a;
            C0526u9 state = r82.f12809b.toState(bArr);
            p83.getClass();
            o82 = new O8(state.f14722a, state.f14723b, state.f14724c, CollectionUtils.hashSetFromIntArray(state.f14725d));
            this.f12575c = o82;
            i5 = o82.f12684c;
            i10 = this.f12573a;
            if (i5 == i10) {
                o82.f12684c = i10;
                o82.f12685d = 0;
                R8 r83 = this.f12574b;
                IBinaryDataHelper iBinaryDataHelper = r83.f12810c;
                Q8 q82 = r83.f12809b;
                r83.f12808a.getClass();
                iBinaryDataHelper.insert("event_hashes", q82.toByteArray((Q8) P8.a(o82)));
                return;
            }
            return;
        }
        P8 p84 = r82.f12808a;
        r82.f12809b.getClass();
        C0526u9 c0526u92 = new C0526u9();
        p84.getClass();
        o82 = new O8(c0526u92.f14722a, c0526u92.f14723b, c0526u92.f14724c, CollectionUtils.hashSetFromIntArray(c0526u92.f14725d));
        this.f12575c = o82;
        i5 = o82.f12684c;
        i10 = this.f12573a;
        if (i5 == i10) {
        }
    }
}
