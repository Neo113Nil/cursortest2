package com.vk.superapp.base.js.bridge;

import com.vk.superapp.base.js.bridge.Responses$ClientError;
import com.vk.superapp.base.js.bridge.a;
import io.appmetrica.analytics.networktasks.internal.CommonUrlParts;
import xsna.ad6;
import xsna.epx;
import xsna.fr;
import xsna.p2y;
import xsna.par0;
import xsna.pmi0;
import xsna.t33;
import xsna.xqm0;
import xsna.zcl;

/* compiled from: ReportableStubDelegate.kt */
/* loaded from: classes6.dex */
public abstract class ReportableStubDelegate {
    public final String A1(String str) {
        StringBuilder a = t33.a("\n            You called stub method ", str, " from the ");
        a.append(B1());
        a.append(" api module, but the ");
        a.append(B1());
        a.append(" impl module is not connected.\n            If you need an implementation of this method, add to your build.gradle file dependency:\n                a) inside vk project: sdk:sak:js-bridges:");
        a.append(B1());
        a.append("-js-bridge:impl;\n                b) outside vk project (from Maven): com.vk:");
        a.append(B1());
        a.append("-js-bridge-impl:<vksdk_version>.\n            Or override bridge realization by yourself.\n        ");
        return xqm0.g(a.toString());
    }

    public abstract String B1();

    public final void C1(String str) {
        par0 par0Var = par0.a;
        String A1 = A1(str);
        par0Var.getClass();
        par0.f(A1);
    }

    public final <T extends ad6> void D1(JsMethod jsMethod, p2y<T> p2yVar) {
        String b = p2yVar.b();
        String str = jsMethod.a;
        String A1 = A1(str);
        b.o(z1(), jsMethod, new StubError(str, new StubError.StubData(null, b, new Responses$ClientError(null, new Responses$ClientError.ErrorData(Responses$ClientError.ErrorData.Type.REASON_UNSUPPORTED_PLATFORM, A1, null, null, null, null, null, new Responses$ReasonUnsupportedPlatform(0, null, 3, null), null, null, null, null, null, null, null, null, null, 130940, null), b, 1, null), 1, null)), null, null, 12);
        par0.a.getClass();
        par0.f(A1);
    }

    public abstract b z1();

    /* compiled from: ReportableStubDelegate.kt */
    public static final class StubError implements a {

        @pmi0("data")
        private final StubData data;

        @pmi0("type")
        private final String type;

        public StubError(String str, StubData stubData) {
            this.type = str;
            this.data = stubData;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof StubError)) {
                return false;
            }
            StubError stubError = (StubError) obj;
            return epx.f(this.type, stubError.type) && epx.f(this.data, stubError.data);
        }

        public final int hashCode() {
            return this.data.hashCode() + (this.type.hashCode() * 31);
        }

        public final String toString() {
            return "StubError(type=" + this.type + ", data=" + this.data + ')';
        }

        /* compiled from: ReportableStubDelegate.kt */
        public static final class StubData implements a.InterfaceC1867a {

            @pmi0("client_error")
            private final Responses$ClientError clientError;

            @pmi0(CommonUrlParts.REQUEST_ID)
            private final String requestId;

            @pmi0("type")
            private final String type;

            public StubData(String str, String str2, Responses$ClientError responses$ClientError) {
                this.type = str;
                this.requestId = str2;
                this.clientError = responses$ClientError;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof StubData)) {
                    return false;
                }
                StubData stubData = (StubData) obj;
                return epx.f(this.type, stubData.type) && epx.f(this.requestId, stubData.requestId) && epx.f(this.clientError, stubData.clientError);
            }

            public final int hashCode() {
                int hashCode = this.type.hashCode() * 31;
                String str = this.requestId;
                int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
                Responses$ClientError responses$ClientError = this.clientError;
                return hashCode2 + (responses$ClientError != null ? responses$ClientError.hashCode() : 0);
            }

            public final String toString() {
                StringBuilder sb = new StringBuilder("StubData(type=");
                sb.append(this.type);
                sb.append(", requestId=");
                sb.append(this.requestId);
                sb.append(", clientError=");
                return fr.a(sb, this.clientError, ')');
            }

            public /* synthetic */ StubData(String str, String str2, Responses$ClientError responses$ClientError, int i, zcl zclVar) {
                this((i & 1) != 0 ? "client_error" : str, str2, (i & 4) != 0 ? null : responses$ClientError);
            }
        }
    }
}
