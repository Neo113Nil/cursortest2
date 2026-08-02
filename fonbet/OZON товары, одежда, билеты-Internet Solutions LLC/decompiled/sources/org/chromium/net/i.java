package org.chromium.net;

import org.chromium.net.AbstractC8761e;
import org.chromium.net.C;
import org.chromium.net.impl.b0;
import org.json.JSONException;
import org.json.JSONObject;

@Deprecated
/* loaded from: classes6.dex */
public abstract class i extends AbstractC8761e {

    public static class a extends AbstractC8761e.a {
        public final void d(int i11, int i12, String str) {
            this.f78695c.a(i11, i12, str);
        }

        public final void e(boolean z11) {
            this.f78695c.d(z11);
        }

        public final void f(int i11, long j11) {
            this.f78695c.e(i11, j11);
        }

        public final void g(boolean z11) {
            this.f78695c.f(z11);
        }

        public final void h(String str) {
            JSONObject jSONObject;
            if (str == null || str.isEmpty()) {
                jSONObject = null;
            } else {
                try {
                    jSONObject = new JSONObject(str);
                } catch (JSONException e11) {
                    throw new IllegalArgumentException("Experimental options parsing failed", e11);
                }
            }
            this.f78693a = jSONObject;
        }

        public final void i(String str) {
            this.f78695c.i(str);
        }

        public final void j(String str) {
            this.f78695c.j(str);
        }
    }

    @Override // 
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public abstract b0 a(String str, C.b bVar, Va.a aVar);
}
