package androidx.credentials.exceptions;

import xsna.zcl;

/* compiled from: ClearCredentialCustomException.kt */
/* loaded from: classes12.dex */
public final class ClearCredentialCustomException extends ClearCredentialException {
    private final String type;

    /* JADX WARN: Multi-variable type inference failed */
    public ClearCredentialCustomException(String str) {
        this(str, null, 2, 0 == true ? 1 : 0);
    }

    @Override // androidx.credentials.exceptions.ClearCredentialException
    public String getType() {
        return this.type;
    }

    public /* synthetic */ ClearCredentialCustomException(String str, CharSequence charSequence, int i, zcl zclVar) {
        this(str, (i & 2) != 0 ? null : charSequence);
    }

    public ClearCredentialCustomException(String str, CharSequence charSequence) {
        super(str, charSequence);
        this.type = str;
        if (getType().length() <= 0) {
            throw new IllegalArgumentException("type must not be empty");
        }
    }
}
