package com.ironsource.mediationsdk.demandOnly;

import com.ironsource.Ib;
import com.ironsource.InterfaceC2539m5;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public interface o extends InterfaceC2539m5<String> {

    public static final class a implements o {
        private final String a;

        public a(String rowAdm) {
            Intrinsics.checkNotNullParameter(rowAdm, "rowAdm");
            this.a = rowAdm;
        }

        @Override // com.ironsource.InterfaceC2539m5
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public String a() {
            return this.a;
        }

        @Override // com.ironsource.mediationsdk.demandOnly.o
        public <T> T a(Ib<String, T> mapper) {
            Intrinsics.checkNotNullParameter(mapper, "mapper");
            return mapper.a(this.a);
        }
    }

    <T> T a(Ib<String, T> ib);
}
