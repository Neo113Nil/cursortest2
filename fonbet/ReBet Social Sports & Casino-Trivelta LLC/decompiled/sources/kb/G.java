package kb;

import com.google.firebase.auth.AuthCredential;
import com.google.firebase.auth.TwitterAuthCredential;

/* loaded from: classes3.dex */
public abstract class G {
    public static AuthCredential a(String str, String str2) {
        return new TwitterAuthCredential(str, str2);
    }
}
