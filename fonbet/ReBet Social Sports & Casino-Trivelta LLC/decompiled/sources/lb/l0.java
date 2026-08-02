package lb;

import com.google.android.gms.common.internal.AbstractC3191o;
import com.google.android.gms.internal.p002firebaseauthapi.zzajb;
import com.google.firebase.auth.AuthCredential;
import com.google.firebase.auth.FacebookAuthCredential;
import com.google.firebase.auth.GithubAuthCredential;
import com.google.firebase.auth.GoogleAuthCredential;
import com.google.firebase.auth.PlayGamesAuthCredential;
import com.google.firebase.auth.TwitterAuthCredential;
import com.google.firebase.auth.zze;

/* loaded from: classes3.dex */
public abstract class l0 {
    public static zzajb a(AuthCredential authCredential, String str) {
        AbstractC3191o.m(authCredential);
        if (authCredential instanceof GoogleAuthCredential) {
            return GoogleAuthCredential.j((GoogleAuthCredential) authCredential, str);
        }
        if (authCredential instanceof FacebookAuthCredential) {
            return FacebookAuthCredential.j((FacebookAuthCredential) authCredential, str);
        }
        if (authCredential instanceof TwitterAuthCredential) {
            return TwitterAuthCredential.j((TwitterAuthCredential) authCredential, str);
        }
        if (authCredential instanceof GithubAuthCredential) {
            return GithubAuthCredential.j((GithubAuthCredential) authCredential, str);
        }
        if (authCredential instanceof PlayGamesAuthCredential) {
            return PlayGamesAuthCredential.j((PlayGamesAuthCredential) authCredential, str);
        }
        if (authCredential instanceof zze) {
            return zze.l((zze) authCredential, str);
        }
        throw new IllegalArgumentException("Unsupported credential type.");
    }
}
