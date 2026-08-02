package kb;

import com.google.firebase.auth.AuthCredential;
import com.google.firebase.auth.FacebookAuthCredential;

/* renamed from: kb.g, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC5222g {
    public static AuthCredential a(String str) {
        return new FacebookAuthCredential(str);
    }
}
