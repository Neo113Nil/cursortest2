package com.vk.superapp.browser.internal.bridges;

import ru.ok.android.webrtc.Privacy;
import xsna.asp;
import xsna.zrp;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: JsApiMethodType.kt */
/* loaded from: classes6.dex */
public final class MethodScope {
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
