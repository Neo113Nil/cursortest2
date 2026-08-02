package androidx.credentials;

/* compiled from: CredentialManagerCallback.kt */
/* loaded from: classes.dex */
public interface CredentialManagerCallback<R, E> {
    void onError(E e);

    void onResult(R r);
}
