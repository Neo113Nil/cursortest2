package com.apm.insight.runtime;

import androidx.annotation.Nullable;
import com.apm.insight.entity.Header;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public class e {
    private static final e b = new e() { // from class: com.apm.insight.runtime.e.1
        private Header a = null;

        @Override // com.apm.insight.runtime.e
        @Nullable
        public final Object b(String str) {
            Header header = this.a;
            if (header == null) {
                header = Header.b(com.apm.insight.e.g());
                this.a = header;
            }
            return header.f().opt(str);
        }
    };
    private e a;

    public e() {
        this(b);
    }

    @Nullable
    public Object a(String str) {
        e eVar = this.a;
        if (eVar != null) {
            return eVar.a(str);
        }
        return null;
    }

    @Nullable
    public Object b(String str) {
        e eVar = this.a;
        if (eVar != null) {
            return eVar.b(str);
        }
        return null;
    }

    private e(e eVar) {
        this.a = eVar;
    }
}
