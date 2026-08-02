package androidx.credentials.exceptions;

import xsna.zcl;

/* compiled from: GetCredentialCustomException.kt */
/* loaded from: classes12.dex */
public final class GetCredentialCustomException extends GetCredentialException {
    private final String type;

    /* JADX WARN: Multi-variable type inference failed */
    public GetCredentialCustomException(String str) {
        this(str, null, 2, 0 == true ? 1 : 0);
    }

    @Override // androidx.credentials.exceptions.GetCredentialException
    public String getType() {
        return this.type;
    }

    public /* synthetic */ GetCredentialCustomException(String str, CharSequence charSequence, int i, zcl zclVar) {
        this(str, (i & 2) != 0 ? null : charSequence);
    }

    public GetCredentialCustomException(String str, CharSequence charSequence) {
        super(str, charSequence);
        this.type = str;
        if (getType().length() <= 0) {
            throw new IllegalArgumentException("type must not be empty");
        }
    }
}
