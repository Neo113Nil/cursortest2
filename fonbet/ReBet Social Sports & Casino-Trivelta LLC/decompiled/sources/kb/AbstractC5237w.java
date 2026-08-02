package kb;

import com.google.firebase.auth.AuthCredential;
import com.google.firebase.auth.GoogleAuthCredential;

/* renamed from: kb.w, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC5237w {
    public static AuthCredential a(String str, String str2) {
        return new GoogleAuthCredential(str, str2);
    }
}
