package k5;

import androidx.annotation.NonNull;
import spay.sdk.api.ErrorCode;

/* renamed from: k5.c2, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C7502c2 extends D1 {
    C7502c2(@NonNull EnumC7578w enumC7578w) {
        super("Permission not granted: " + enumC7578w.a(), ErrorCode.PHONE_NUMBER_NOT_TRANSFERRED_ERROR_CODE, -1);
    }
}
