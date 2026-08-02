package com.google.android.gms.internal.mlkit_vision_text_bundled_common;

import B0.A0;
import com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbsi;
import com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbsj;
import java.io.IOException;

/* loaded from: classes9.dex */
public abstract class zbsj<MessageType extends zbsj<MessageType, BuilderType>, BuilderType extends zbsi<MessageType, BuilderType>> implements zbvm {
    protected int zba = 0;

    int zbj(zbvx zbvxVar) {
        throw null;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbvm
    public final zbtc zbk() {
        try {
            int zbo = zbo();
            zbtc zbtcVar = zbtc.zbb;
            byte[] bArr = new byte[zbo];
            zbth zbthVar = new zbth(bArr, 0, zbo);
            zbL(zbthVar);
            return zbsy.zba(zbthVar, bArr);
        } catch (IOException e11) {
            throw new RuntimeException(A0.b("Serializing ", getClass().getName(), " to a ByteString threw an IOException (should never happen)."), e11);
        }
    }

    public final byte[] zbl() {
        try {
            int zbo = zbo();
            byte[] bArr = new byte[zbo];
            zbth zbthVar = new zbth(bArr, 0, zbo);
            zbL(zbthVar);
            zbthVar.zbF();
            return bArr;
        } catch (IOException e11) {
            throw new RuntimeException(A0.b("Serializing ", getClass().getName(), " to a byte array threw an IOException (should never happen)."), e11);
        }
    }
}
