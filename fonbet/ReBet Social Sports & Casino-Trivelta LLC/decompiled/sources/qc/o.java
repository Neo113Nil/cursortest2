package qc;

import android.net.Uri;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.WritableArray;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.devsupport.StackTraceHelper;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.tasks.Task;
import java.util.Iterator;

/* loaded from: classes4.dex */
public abstract class o {
    public static Scope[] a(ReadableArray readableArray) {
        int size = readableArray.size();
        Scope[] scopeArr = new Scope[size];
        for (int i10 = 0; i10 < size; i10++) {
            scopeArr[i10] = new Scope(readableArray.getString(i10));
        }
        return scopeArr;
    }

    public static int b(Task task) {
        Exception exception = task.getException();
        if (exception instanceof com.google.android.gms.common.api.b) {
            return ((com.google.android.gms.common.api.b) exception).getStatusCode();
        }
        return 8;
    }

    public static GoogleSignInOptions c(Scope[] scopeArr, String str, boolean z10, boolean z11, String str2, String str3) {
        GoogleSignInOptions.Builder requestScopes = new GoogleSignInOptions.Builder(GoogleSignInOptions.DEFAULT_SIGN_IN).requestScopes(new Scope("email"), scopeArr);
        if (str != null && !str.isEmpty()) {
            requestScopes.requestIdToken(str);
            if (z10) {
                requestScopes.requestServerAuthCode(str, z11);
            }
        }
        if (str2 != null && !str2.isEmpty()) {
            requestScopes.setAccountName(str2);
        }
        if (str3 != null && !str3.isEmpty()) {
            requestScopes.setHostedDomain(str3);
        }
        return requestScopes.build();
    }

    public static WritableMap d(GoogleSignInAccount googleSignInAccount) {
        Uri photoUrl = googleSignInAccount.getPhotoUrl();
        WritableMap createMap = Arguments.createMap();
        createMap.putString(StackTraceHelper.ID_KEY, googleSignInAccount.getId());
        createMap.putString("name", googleSignInAccount.getDisplayName());
        createMap.putString("givenName", googleSignInAccount.getGivenName());
        createMap.putString("familyName", googleSignInAccount.getFamilyName());
        createMap.putString("email", googleSignInAccount.getEmail());
        createMap.putString("photo", photoUrl != null ? photoUrl.toString() : null);
        WritableMap createMap2 = Arguments.createMap();
        createMap2.putMap("user", createMap);
        createMap2.putString("idToken", googleSignInAccount.getIdToken());
        createMap2.putString("serverAuthCode", googleSignInAccount.getServerAuthCode());
        WritableArray createArray = Arguments.createArray();
        Iterator<Scope> it = googleSignInAccount.getGrantedScopes().iterator();
        while (it.hasNext()) {
            createArray.pushString(it.next().toString());
        }
        createMap2.putArray("scopes", createArray);
        return createMap2;
    }

    public static String e(ReadableArray readableArray) {
        StringBuilder sb2 = new StringBuilder("oauth2:");
        for (int i10 = 0; i10 < readableArray.size(); i10++) {
            sb2.append(readableArray.getString(i10));
            sb2.append(" ");
        }
        return sb2.toString().trim();
    }
}
