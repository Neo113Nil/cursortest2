package com.ironsource.mediationsdk.demandOnly;

import com.ironsource.InterfaceC4435m5;
import com.ironsource.Jb;

/* loaded from: classes13.dex */
public interface o extends InterfaceC4435m5<String> {

    public static final class a implements o {
        private final String a;

        public a(String str) {
            this.a = str;
        }

        @Override // com.ironsource.InterfaceC4435m5
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public String a() {
            return this.a;
        }

        @Override // com.ironsource.mediationsdk.demandOnly.o
        public <T> T a(Jb<String, T> jb) {
            return jb.a(this.a);
        }
    }

    <T> T a(Jb<String, T> jb);
}
