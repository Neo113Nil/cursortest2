package com.vk.superapp.base.js.bridge;

import ru.ok.android.webrtc.Privacy;
import xsna.asp;
import xsna.epx;
import xsna.zrp;

/* compiled from: JsMethod.kt */
/* loaded from: classes6.dex */
public final class JsMethod {
    public final String a;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: JsMethod.kt */
    public static final class MethodScope {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ MethodScope[] $VALUES;
        public static final MethodScope INTERNAL;
        public static final MethodScope PUBLIC;

        static {
            MethodScope methodScope = new MethodScope("INTERNAL", 0);
            INTERNAL = methodScope;
            MethodScope methodScope2 = new MethodScope(Privacy.PUBLIC, 1);
            PUBLIC = methodScope2;
            MethodScope[] methodScopeArr = {methodScope, methodScope2};
            $VALUES = methodScopeArr;
            $ENTRIES = new asp(methodScopeArr);
        }

        public MethodScope() {
            throw null;
        }

        public static MethodScope valueOf(String str) {
            return (MethodScope) Enum.valueOf(MethodScope.class, str);
        }

        public static MethodScope[] values() {
            return (MethodScope[]) $VALUES.clone();
        }
    }

    public JsMethod(String str) {
        MethodScope methodScope = MethodScope.INTERNAL;
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof JsMethod)) {
            return false;
        }
        return epx.f(this.a, ((JsMethod) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
