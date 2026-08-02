package org.chromium.base;

import internal.org.jni_zero.GEN_JNI;
import internal.org.jni_zero.JniTestInstanceHolder;
import org.chromium.base.Token;

/* loaded from: classes10.dex */
public class TokenJni implements Token.Natives {
    private static JniTestInstanceHolder sOverride;

    public static Token.Natives get() {
        JniTestInstanceHolder jniTestInstanceHolder = sOverride;
        if (jniTestInstanceHolder != null && jniTestInstanceHolder.value != null) {
            return (Token.Natives) jniTestInstanceHolder.value;
        }
        return new TokenJni();
    }

    public static void setInstanceForTesting(Token.Natives impl) {
        if (sOverride == null) {
            sOverride = JniTestInstanceHolder.create();
        }
        sOverride.value = impl;
    }

    @Override // org.chromium.base.Token.Natives
    public Token createRandom() {
        return (Token) GEN_JNI.org_chromium_base_Token_createRandom();
    }
}
