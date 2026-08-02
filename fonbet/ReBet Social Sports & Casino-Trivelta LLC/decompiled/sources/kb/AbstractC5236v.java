package kb;

import com.google.firebase.auth.AuthCredential;
import com.google.firebase.auth.GithubAuthCredential;

/* renamed from: kb.v, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC5236v {
    public static AuthCredential a(String str) {
        return new GithubAuthCredential(str);
    }
}
