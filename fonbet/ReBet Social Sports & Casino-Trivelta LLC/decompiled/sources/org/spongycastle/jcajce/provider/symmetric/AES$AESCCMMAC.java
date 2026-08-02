package org.spongycastle.jcajce.provider.symmetric;

import Zi.c;
import org.spongycastle.crypto.engines.C5951a;
import org.spongycastle.crypto.j;
import org.spongycastle.crypto.r;
import org.spongycastle.crypto.v;
import org.spongycastle.jcajce.provider.symmetric.util.BaseMac;

/* loaded from: classes5.dex */
public class AES$AESCCMMAC extends BaseMac {

    public static class a implements v {

        /* renamed from: a, reason: collision with root package name */
        public final c f62700a;

        /* renamed from: b, reason: collision with root package name */
        public int f62701b;

        public a() {
            this.f62700a = new c(new C5951a());
            this.f62701b = 8;
        }

        @Override // org.spongycastle.crypto.v
        public void a(j jVar) {
            this.f62700a.a(true, jVar);
            this.f62701b = this.f62700a.getMac().length;
        }

        @Override // org.spongycastle.crypto.v
        public int doFinal(byte[] bArr, int i10) {
            try {
                return this.f62700a.doFinal(bArr, 0);
            } catch (r e10) {
                throw new IllegalStateException("exception on doFinal(): " + e10.toString());
            }
        }

        @Override // org.spongycastle.crypto.v
        public String getAlgorithmName() {
            return this.f62700a.c() + "Mac";
        }

        @Override // org.spongycastle.crypto.v
        public int getMacSize() {
            return this.f62701b;
        }

        @Override // org.spongycastle.crypto.v
        public void reset() {
            this.f62700a.h();
        }

        @Override // org.spongycastle.crypto.v
        public void update(byte b10) {
            this.f62700a.f(b10);
        }

        @Override // org.spongycastle.crypto.v
        public void update(byte[] bArr, int i10, int i11) {
            this.f62700a.processAADBytes(bArr, i10, i11);
        }
    }

    public AES$AESCCMMAC() {
        super(new a());
    }
}
