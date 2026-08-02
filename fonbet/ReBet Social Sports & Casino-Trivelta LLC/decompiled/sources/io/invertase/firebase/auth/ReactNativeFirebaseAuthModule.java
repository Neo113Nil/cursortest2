package io.invertase.firebase.auth;

import android.app.Activity;
import android.net.Uri;
import android.os.Parcel;
import android.util.Log;
import androidx.annotation.NonNull;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.ReadableMapKeySetIterator;
import com.facebook.react.bridge.WritableArray;
import com.facebook.react.bridge.WritableMap;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.ActionCodeSettings;
import com.google.firebase.auth.AuthCredential;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;
import com.google.firebase.auth.MultiFactorInfo;
import com.google.firebase.auth.MultiFactorResolver;
import com.google.firebase.auth.MultiFactorSession;
import com.google.firebase.auth.PhoneAuthCredential;
import com.google.firebase.auth.PhoneAuthProvider;
import com.google.firebase.auth.PhoneMultiFactorInfo;
import com.google.firebase.auth.UserProfileChangeRequest;
import com.twilio.voice.Constants;
import com.twilio.voice.EventKeys;
import eb.C4196f;
import io.invertase.firebase.app.ReactNativeFirebaseAppModule;
import io.invertase.firebase.auth.ReactNativeFirebaseAuthModule;
import io.invertase.firebase.common.ReactNativeFirebaseModule;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import kb.AbstractC5221f;
import kb.AbstractC5222g;
import kb.AbstractC5236v;
import kb.AbstractC5237w;
import kb.C5215A;
import kb.C5226k;
import kb.C5227l;
import kb.C5230o;
import kb.C5235u;
import kb.C5240z;
import kb.InterfaceC5219d;

/* loaded from: classes3.dex */
class ReactNativeFirebaseAuthModule extends ReactNativeFirebaseModule {
    private static final String TAG = "Auth";
    private HashMap<String, AuthCredential> credentials;
    private final HashMap<String, MultiFactorResolver> mCachedResolvers;
    private PhoneAuthCredential mCredential;
    private PhoneAuthProvider.ForceResendingToken mForceResendingToken;
    private String mLastPhoneNumber;
    private final HashMap<String, MultiFactorSession> mMultiFactorSessions;
    private final HashMap<String, kb.F> mTotpSecrets;
    private String mVerificationId;
    public static final SimpleDateFormat ISO_8601_FORMATTER = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ssZ");
    private static HashMap<String, FirebaseAuth.a> mAuthListeners = new HashMap<>();
    private static HashMap<String, FirebaseAuth.b> mIdTokenListeners = new HashMap<>();
    private static HashMap<String, String> emulatorConfigs = new HashMap<>();

    public class a extends PhoneAuthProvider.a {

        /* renamed from: a, reason: collision with root package name */
        public boolean f49227a = false;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ FirebaseAuth f49228b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ Promise f49229c;

        public a(FirebaseAuth firebaseAuth, Promise promise) {
            this.f49228b = firebaseAuth;
            this.f49229c = promise;
        }

        public final /* synthetic */ void b(PhoneAuthCredential phoneAuthCredential, Promise promise, Task task) {
            if (!task.isSuccessful()) {
                Exception exception = task.getException();
                Log.e(ReactNativeFirebaseAuthModule.TAG, "signInWithPhoneNumber:autoVerified:signInWithCredential:onComplete:failure", exception);
                if (this.f49227a) {
                    return;
                }
                ReactNativeFirebaseAuthModule.this.lambda$signInWithProvider$26(promise, exception);
                return;
            }
            if (this.f49227a) {
                return;
            }
            WritableMap createMap = Arguments.createMap();
            Parcel obtain = Parcel.obtain();
            phoneAuthCredential.writeToParcel(obtain, 0);
            obtain.setDataPosition(16);
            String readString = obtain.readString();
            ReactNativeFirebaseAuthModule.this.mVerificationId = readString;
            obtain.recycle();
            createMap.putString("verificationId", readString);
            promise.resolve(createMap);
        }

        @Override // com.google.firebase.auth.PhoneAuthProvider.a
        public void onCodeAutoRetrievalTimeOut(String str) {
            super.onCodeAutoRetrievalTimeOut(str);
        }

        @Override // com.google.firebase.auth.PhoneAuthProvider.a
        public void onCodeSent(String str, PhoneAuthProvider.ForceResendingToken forceResendingToken) {
            ReactNativeFirebaseAuthModule.this.mVerificationId = str;
            ReactNativeFirebaseAuthModule.this.mForceResendingToken = forceResendingToken;
            WritableMap createMap = Arguments.createMap();
            createMap.putString("verificationId", str);
            this.f49229c.resolve(createMap);
            this.f49227a = true;
        }

        @Override // com.google.firebase.auth.PhoneAuthProvider.a
        public void onVerificationCompleted(final PhoneAuthCredential phoneAuthCredential) {
            Task B10 = this.f49228b.B(phoneAuthCredential);
            ExecutorService executor = ReactNativeFirebaseAuthModule.this.getExecutor();
            final Promise promise = this.f49229c;
            B10.addOnCompleteListener(executor, new OnCompleteListener() { // from class: io.invertase.firebase.auth.c0
                @Override // com.google.android.gms.tasks.OnCompleteListener
                public final void onComplete(Task task) {
                    ReactNativeFirebaseAuthModule.a.this.b(phoneAuthCredential, promise, task);
                }
            });
        }

        @Override // com.google.firebase.auth.PhoneAuthProvider.a
        public void onVerificationFailed(eb.k kVar) {
            ReactNativeFirebaseAuthModule.this.lambda$signInWithProvider$26(this.f49229c, kVar);
        }
    }

    public class b extends PhoneAuthProvider.a {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Promise f49231a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ String f49232b;

        public b(Promise promise, String str) {
            this.f49231a = promise;
            this.f49232b = str;
        }

        @Override // com.google.firebase.auth.PhoneAuthProvider.a
        public void onCodeSent(String str, PhoneAuthProvider.ForceResendingToken forceResendingToken) {
            this.f49231a.resolve(str);
        }

        @Override // com.google.firebase.auth.PhoneAuthProvider.a
        public void onVerificationCompleted(PhoneAuthCredential phoneAuthCredential) {
            ReactNativeFirebaseAuthModule.this.resolveMultiFactorCredential(phoneAuthCredential, this.f49232b, this.f49231a);
        }

        @Override // com.google.firebase.auth.PhoneAuthProvider.a
        public void onVerificationFailed(eb.k kVar) {
            ReactNativeFirebaseAuthModule.this.lambda$signInWithProvider$26(this.f49231a, kVar);
        }
    }

    public class c extends PhoneAuthProvider.a {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Promise f49234a;

        public c(Promise promise) {
            this.f49234a = promise;
        }

        @Override // com.google.firebase.auth.PhoneAuthProvider.a
        public void onCodeSent(String str, PhoneAuthProvider.ForceResendingToken forceResendingToken) {
            this.f49234a.resolve(str);
        }

        @Override // com.google.firebase.auth.PhoneAuthProvider.a
        public void onVerificationCompleted(PhoneAuthCredential phoneAuthCredential) {
            ReactNativeFirebaseModule.rejectPromiseWithCodeAndMessage(this.f49234a, "not-implemented", "This is currently not supported.");
        }

        @Override // com.google.firebase.auth.PhoneAuthProvider.a
        public void onVerificationFailed(eb.k kVar) {
            ReactNativeFirebaseAuthModule.this.lambda$signInWithProvider$26(this.f49234a, kVar);
        }
    }

    public class d extends PhoneAuthProvider.a {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ String f49236a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ String f49237b;

        public d(String str, String str2) {
            this.f49236a = str;
            this.f49237b = str2;
        }

        @Override // com.google.firebase.auth.PhoneAuthProvider.a
        public void onCodeAutoRetrievalTimeOut(String str) {
            super.onCodeAutoRetrievalTimeOut(str);
            WritableMap createMap = Arguments.createMap();
            createMap.putString("verificationId", str);
            ReactNativeFirebaseAuthModule.this.sendPhoneStateEvent(this.f49236a, this.f49237b, "onCodeAutoRetrievalTimeout", createMap);
        }

        @Override // com.google.firebase.auth.PhoneAuthProvider.a
        public void onCodeSent(String str, PhoneAuthProvider.ForceResendingToken forceResendingToken) {
            ReactNativeFirebaseAuthModule.this.mForceResendingToken = forceResendingToken;
            WritableMap createMap = Arguments.createMap();
            createMap.putString("verificationId", str);
            createMap.putString("verificationId", str);
            ReactNativeFirebaseAuthModule.this.sendPhoneStateEvent(this.f49236a, this.f49237b, "onCodeSent", createMap);
        }

        @Override // com.google.firebase.auth.PhoneAuthProvider.a
        public void onVerificationCompleted(PhoneAuthCredential phoneAuthCredential) {
            ReactNativeFirebaseAuthModule.this.mCredential = phoneAuthCredential;
            WritableMap createMap = Arguments.createMap();
            Parcel obtain = Parcel.obtain();
            phoneAuthCredential.writeToParcel(obtain, 0);
            obtain.setDataPosition(16);
            String readString = obtain.readString();
            obtain.setDataPosition(obtain.dataPosition() + 8);
            createMap.putString(EventKeys.ERROR_CODE, obtain.readString());
            createMap.putString("verificationId", readString);
            obtain.recycle();
            ReactNativeFirebaseAuthModule.this.sendPhoneStateEvent(this.f49236a, this.f49237b, "onVerificationComplete", createMap);
        }

        @Override // com.google.firebase.auth.PhoneAuthProvider.a
        public void onVerificationFailed(eb.k kVar) {
            WritableMap createMap = Arguments.createMap();
            createMap.putMap("error", ReactNativeFirebaseAuthModule.this.getJSError(kVar));
            ReactNativeFirebaseAuthModule.this.sendPhoneStateEvent(this.f49236a, this.f49237b, "onVerificationFailed", createMap);
        }
    }

    public ReactNativeFirebaseAuthModule(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext, TAG);
        this.mCachedResolvers = new HashMap<>();
        this.mMultiFactorSessions = new HashMap<>();
        this.mTotpSecrets = new HashMap<>();
        this.credentials = new HashMap<>();
    }

    public static /* synthetic */ void T(Promise promise, Task task) {
        if (task.isSuccessful()) {
            promise.resolve(null);
        } else {
            ReactNativeFirebaseModule.rejectPromiseWithExceptionMap(promise, task.getException());
        }
    }

    public static /* synthetic */ void Y(Promise promise, Task task) {
        if (task.isSuccessful()) {
            promise.resolve(null);
        } else {
            ReactNativeFirebaseModule.rejectPromiseWithExceptionMap(promise, task.getException());
        }
    }

    private ActionCodeSettings buildActionCodeSettings(ReadableMap readableMap) {
        ActionCodeSettings.a N10 = ActionCodeSettings.N();
        String string = readableMap.getString(EventKeys.URL);
        Objects.requireNonNull(string);
        ActionCodeSettings.a f10 = N10.f(string);
        if (readableMap.hasKey("handleCodeInApp")) {
            f10 = f10.c(readableMap.getBoolean("handleCodeInApp"));
        }
        if (readableMap.hasKey("linkDomain")) {
            String string2 = readableMap.getString("linkDomain");
            Objects.requireNonNull(string2);
            f10 = f10.e(string2);
        }
        if (readableMap.hasKey(Constants.PLATFORM_ANDROID)) {
            ReadableMap map = readableMap.getMap(Constants.PLATFORM_ANDROID);
            Objects.requireNonNull(map);
            boolean z10 = map.hasKey("installApp") && map.getBoolean("installApp");
            String string3 = map.hasKey("minimumVersion") ? map.getString("minimumVersion") : null;
            String string4 = map.getString("packageName");
            Objects.requireNonNull(string4);
            f10 = f10.b(string4, z10, string3);
        }
        if (readableMap.hasKey("iOS")) {
            String string5 = readableMap.getMap("iOS").getString("bundleId");
            Objects.requireNonNull(string5);
            f10 = f10.d(string5);
        }
        return f10.a();
    }

    private WritableArray convertProviderData(List<? extends kb.H> list, FirebaseUser firebaseUser) {
        WritableArray createArray = Arguments.createArray();
        Iterator it = new ArrayList(list).iterator();
        while (it.hasNext()) {
            kb.H h10 = (kb.H) it.next();
            if (!"firebase".equals(h10.n())) {
                WritableMap createMap = Arguments.createMap();
                createMap.putString("providerId", h10.n());
                createMap.putString("uid", h10.a());
                createMap.putString("displayName", h10.getDisplayName());
                Uri photoUrl = h10.getPhotoUrl();
                if (photoUrl == null || "".equals(photoUrl.toString())) {
                    createMap.putNull("photoURL");
                } else {
                    createMap.putString("photoURL", photoUrl.toString());
                }
                String b10 = h10.b();
                if ("phone".equals(h10.n()) && (h10.b() == null || "".equals(h10.b()))) {
                    createMap.putString("phoneNumber", firebaseUser.b());
                } else if (b10 == null || "".equals(b10)) {
                    createMap.putNull("phoneNumber");
                } else {
                    createMap.putString("phoneNumber", b10);
                }
                if ("password".equals(h10.n()) && (h10.getEmail() == null || "".equals(h10.getEmail()))) {
                    createMap.putString("email", h10.a());
                } else if (h10.getEmail() == null || "".equals(h10.getEmail())) {
                    createMap.putNull("email");
                } else {
                    createMap.putString("email", h10.getEmail());
                }
                createArray.pushMap(createMap);
            }
        }
        return createArray;
    }

    @ReactMethod
    private void createUserWithEmailAndPassword(String str, String str2, String str3, final Promise promise) {
        FirebaseAuth.getInstance(C4196f.o(str)).f(str2, str3).addOnSuccessListener(new OnSuccessListener() { // from class: io.invertase.firebase.auth.C
            @Override // com.google.android.gms.tasks.OnSuccessListener
            public final void onSuccess(Object obj) {
                ReactNativeFirebaseAuthModule.this.lambda$createUserWithEmailAndPassword$4(promise, (AuthResult) obj);
            }
        }).addOnFailureListener(new OnFailureListener() { // from class: io.invertase.firebase.auth.D
            @Override // com.google.android.gms.tasks.OnFailureListener
            public final void onFailure(Exception exc) {
                ReactNativeFirebaseAuthModule.this.lambda$createUserWithEmailAndPassword$5(promise, exc);
            }
        });
    }

    private WritableMap firebaseUserToMap(FirebaseUser firebaseUser) {
        WritableMap createMap = Arguments.createMap();
        String a10 = firebaseUser.a();
        String email = firebaseUser.getEmail();
        Uri photoUrl = firebaseUser.getPhotoUrl();
        String displayName = firebaseUser.getDisplayName();
        String n10 = firebaseUser.n();
        boolean c10 = firebaseUser.c();
        String b10 = firebaseUser.b();
        String l10 = firebaseUser.l();
        createMap.putString("uid", a10);
        createMap.putString("providerId", n10);
        createMap.putBoolean("emailVerified", c10);
        createMap.putBoolean("isAnonymous", firebaseUser.m());
        if (email == null || "".equals(email)) {
            createMap.putNull("email");
        } else {
            createMap.putString("email", email);
        }
        if (displayName == null || "".equals(displayName)) {
            createMap.putNull("displayName");
        } else {
            createMap.putString("displayName", displayName);
        }
        if (photoUrl == null || "".equals(photoUrl.toString())) {
            createMap.putNull("photoURL");
        } else {
            createMap.putString("photoURL", photoUrl.toString());
        }
        if (b10 == null || "".equals(b10)) {
            createMap.putNull("phoneNumber");
        } else {
            createMap.putString("phoneNumber", b10);
        }
        if (l10 == null || "".equals(l10)) {
            createMap.putNull("tenantId");
        } else {
            createMap.putString("tenantId", l10);
        }
        createMap.putArray("providerData", convertProviderData(firebaseUser.k(), firebaseUser));
        WritableMap createMap2 = Arguments.createMap();
        if (firebaseUser.i() != null) {
            createMap2.putDouble("creationTime", r2.q());
            createMap2.putDouble("lastSignInTime", r2.s());
        }
        createMap.putMap("metadata", createMap2);
        WritableArray createArray = Arguments.createArray();
        Iterator it = firebaseUser.j().b().iterator();
        while (it.hasNext()) {
            createArray.pushMap(multiFactorInfoToMap((MultiFactorInfo) it.next()));
        }
        WritableMap createMap3 = Arguments.createMap();
        createMap3.putArray("enrolledFactors", createArray);
        createMap.putMap("multiFactor", createMap3);
        return createMap;
    }

    private AuthCredential getCredentialForProvider(String str, String str2, String str3) {
        if (str.startsWith("oidc.")) {
            return C5240z.f(str).b(str2).a();
        }
        if (this.credentials.containsKey(str2) && this.credentials.get(str2) != null) {
            return this.credentials.get(str2);
        }
        switch (str) {
            case "apple.com":
                return C5240z.f(str).c(str2, str3).a();
            case "twitter.com":
                return kb.G.a(str2, str3);
            case "google.com":
                return AbstractC5237w.a(str2, str3);
            case "facebook.com":
                return AbstractC5222g.a(str2);
            case "oauth":
                return C5240z.d(str, str2, str3);
            case "phone":
                return getPhoneAuthCredential(str2, str3);
            case "password":
                return AbstractC5221f.a(str2, str3);
            case "github.com":
                return AbstractC5236v.a(str2);
            case "emailLink":
                return AbstractC5221f.b(str2, str3);
            default:
                return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x019b, code lost:
    
        if (r0.equals("ERROR_UNVERIFIED_EMAIL") == false) goto L117;
     */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue
    java.lang.NullPointerException: Cannot invoke "java.util.List.iterator()" because the return value of "jadx.core.dex.visitors.regions.SwitchOverStringVisitor$SwitchData.getNewCases()" is null
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.restoreSwitchOverString(SwitchOverStringVisitor.java:109)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visitRegion(SwitchOverStringVisitor.java:66)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:77)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:82)
     */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue
    java.lang.NullPointerException: Cannot invoke "java.util.List.iterator()" because the return value of "jadx.core.dex.visitors.regions.SwitchOverStringVisitor$SwitchData.getNewCases()" is null
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.restoreSwitchOverString(SwitchOverStringVisitor.java:109)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visitRegion(SwitchOverStringVisitor.java:66)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:77)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:82)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterative(DepthRegionTraversal.java:31)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visit(SwitchOverStringVisitor.java:60)
     */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0176  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0193  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x01b7  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x01ba  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x01bd  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0195  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x019e  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x01a9  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0151  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public WritableMap getJSError(Exception exc) {
        String str;
        char c10;
        String str2 = "INVALID_EMAIL";
        WritableMap createMap = Arguments.createMap();
        String message = exc.getMessage();
        String str3 = "The email address is badly formatted.";
        char c11 = 2;
        try {
            C5226k c5226k = (C5226k) exc;
            str = c5226k.a();
            try {
                createMap.putString("nativeErrorCode", str);
                message = c5226k.getMessage();
            } catch (Exception unused) {
                Matcher matcher = Pattern.compile("([A-Z]*_[A-Z]*)").matcher(message);
                if (matcher.find()) {
                    str = matcher.group(1).trim();
                    str.getClass();
                    switch (str.hashCode()) {
                        case -2127468245:
                            if (str.equals("USER_TOKEN_EXPIRED")) {
                                c10 = 0;
                                break;
                            }
                            c10 = 65535;
                            break;
                        case -1971163201:
                            if (str.equals("INVALID_CREDENTIAL")) {
                                c10 = 1;
                                break;
                            }
                            c10 = 65535;
                            break;
                        case -1112393964:
                            if (str.equals("INVALID_EMAIL")) {
                                c10 = 2;
                                break;
                            }
                            c10 = 65535;
                            break;
                        case -1035666916:
                            if (str.equals("CREDENTIAL_ALREADY_IN_USE")) {
                                c10 = 3;
                                break;
                            }
                            c10 = 65535;
                            break;
                        case -333672188:
                            if (str.equals("OPERATION_NOT_ALLOWED")) {
                                c10 = 4;
                                break;
                            }
                            c10 = 65535;
                            break;
                        case -324930558:
                            if (str.equals("CUSTOM_TOKEN_MISMATCH")) {
                                c10 = 5;
                                break;
                            }
                            c10 = 65535;
                            break;
                        case -311841705:
                            if (str.equals("EMAIL_ALREADY_IN_USE")) {
                                c10 = 6;
                                break;
                            }
                            c10 = 65535;
                            break;
                        case -75433118:
                            if (str.equals("USER_NOT_FOUND")) {
                                c10 = 7;
                                break;
                            }
                            c10 = 65535;
                            break;
                        case -49749054:
                            if (str.equals("USER_MISMATCH")) {
                                c10 = '\b';
                                break;
                            }
                            c10 = 65535;
                            break;
                        case -40686718:
                            if (str.equals("WEAK_PASSWORD")) {
                                c10 = '\t';
                                break;
                            }
                            c10 = 65535;
                            break;
                        case 583750925:
                            if (str.equals("WRONG_PASSWORD")) {
                                c10 = '\n';
                                break;
                            }
                            c10 = 65535;
                            break;
                        case 748182870:
                            if (str.equals("REQUIRES_RECENT_LOGIN")) {
                                c10 = 11;
                                break;
                            }
                            c10 = 65535;
                            break;
                        case 864281573:
                            if (str.equals("ACCOUNT_EXISTS_WITH_DIFFERENT_CREDENTIAL")) {
                                c10 = '\f';
                                break;
                            }
                            c10 = 65535;
                            break;
                        case 1072360691:
                            if (str.equals("INVALID_CUSTOM_TOKEN")) {
                                c10 = '\r';
                                break;
                            }
                            c10 = 65535;
                            break;
                        case 1388786705:
                            if (str.equals("INVALID_IDENTIFIER")) {
                                c10 = 14;
                                break;
                            }
                            c10 = 65535;
                            break;
                        case 1433767024:
                            if (str.equals("USER_DISABLED")) {
                                c10 = 15;
                                break;
                            }
                            c10 = 65535;
                            break;
                        case 1563975629:
                            if (str.equals("INVALID_USER_TOKEN")) {
                                c10 = 16;
                                break;
                            }
                            c10 = 65535;
                            break;
                        default:
                            c10 = 65535;
                            break;
                    }
                    switch (c10) {
                        case 0:
                        case 16:
                            message = "The user's credential is no longer valid. The user must sign in again.";
                            break;
                        case 1:
                            message = "The supplied auth credential is malformed or has expired.";
                            break;
                        case 2:
                            message = "The email address is badly formatted.";
                            break;
                        case 3:
                            message = "This credential is already associated with a different user account.";
                            break;
                        case 4:
                            message = "This operation is not allowed. You must enable this service in the console.";
                            break;
                        case 5:
                            message = "The custom token corresponds to a different audience.";
                            break;
                        case 6:
                            message = "The email address is already in use by another account.";
                            break;
                        case 7:
                            message = "There is no user record corresponding to this identifier. The user may have been deleted.";
                            break;
                        case '\b':
                            message = "The supplied credentials do not correspond to the previously signed in user.";
                            break;
                        case '\t':
                            message = "The given password is invalid.";
                            break;
                        case '\n':
                            message = "The password is invalid or the user does not have a password.";
                            break;
                        case 11:
                            message = "This operation is sensitive and requires recent authentication. Log in again before retrying this request.";
                            break;
                        case '\f':
                            message = "An account already exists with the same email address but different sign-in credentials. Sign in using a provider associated with this email address.";
                            break;
                        case '\r':
                            message = "The custom token format is incorrect. Please check the documentation.";
                            break;
                        case 14:
                            str = "INVALID_EMAIL";
                            message = "The email address is badly formatted.";
                            break;
                        case 15:
                            message = "The user account has been disabled by an administrator.";
                            break;
                    }
                }
                if (exc instanceof C5230o) {
                }
                if (str.equals("UNKNOWN")) {
                }
                str3 = message;
                str2 = str;
                switch (str2.hashCode()) {
                    case -1904937287:
                        break;
                    case -282314177:
                        break;
                    case -51368043:
                        break;
                }
                switch (c11) {
                }
                createMap.putString(EventKeys.ERROR_CODE, str2.toLowerCase(Locale.ROOT).replace("error_", "").replace('_', '-'));
                createMap.putString("message", str3);
                createMap.putString("nativeErrorMessage", exc.getMessage());
                return createMap;
            }
        } catch (Exception unused2) {
            str = "UNKNOWN";
        }
        if (exc instanceof C5230o) {
            MultiFactorResolver b10 = ((C5230o) exc).b();
            String num = Integer.toString(b10.i().hashCode());
            this.mCachedResolvers.put(num, b10);
            createMap.putString("sessionId", num);
            str = "MULTI_FACTOR_AUTH_REQUIRED";
        }
        if (str.equals("UNKNOWN")) {
            if (!(exc instanceof C5227l)) {
                if (!(exc instanceof eb.l)) {
                    str2 = exc instanceof eb.n ? "TOO_MANY_REQUESTS" : "NETWORK_REQUEST_FAILED";
                }
                str3 = message;
            }
            switch (str2.hashCode()) {
                case -1904937287:
                    if (str2.equals("ERROR_INVALID_PHONE_NUMBER")) {
                        c11 = 0;
                        break;
                    }
                    c11 = 65535;
                    break;
                case -282314177:
                    if (str2.equals("ERROR_UNSUPPORTED_FIRST_FACTOR")) {
                        c11 = 1;
                        break;
                    }
                    c11 = 65535;
                    break;
                case -51368043:
                    break;
                default:
                    c11 = 65535;
                    break;
            }
            switch (c11) {
                case 0:
                    str3 = "The format of the phone number provided is incorrect. Please enter the phone number in a format that can be parsed into E.164 format. E.164 phone numbers are written in the format [+][country code][subscriber number including area code].";
                    break;
                case 1:
                    str3 = "Enrolling a second factor or signing in with a multi-factor account requires sign-in with a supported first factor.";
                    break;
                case 2:
                    str3 = "This operation requires a verified email.";
                    break;
            }
            createMap.putString(EventKeys.ERROR_CODE, str2.toLowerCase(Locale.ROOT).replace("error_", "").replace('_', '-'));
            createMap.putString("message", str3);
            createMap.putString("nativeErrorMessage", exc.getMessage());
            return createMap;
        }
        str3 = message;
        str2 = str;
        switch (str2.hashCode()) {
            case -1904937287:
                break;
            case -282314177:
                break;
            case -51368043:
                break;
        }
        switch (c11) {
        }
        createMap.putString(EventKeys.ERROR_CODE, str2.toLowerCase(Locale.ROOT).replace("error_", "").replace('_', '-'));
        createMap.putString("message", str3);
        createMap.putString("nativeErrorMessage", exc.getMessage());
        return createMap;
    }

    private PhoneAuthCredential getPhoneAuthCredential(String str, String str2) {
        PhoneAuthCredential phoneAuthCredential;
        if (str == null && (phoneAuthCredential = this.mCredential) != null) {
            this.mCredential = null;
            return phoneAuthCredential;
        }
        if (str != null) {
            return PhoneAuthProvider.a(str, str2);
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$addAuthStateListener$0(String str, FirebaseAuth firebaseAuth) {
        FirebaseUser j10 = firebaseAuth.j();
        WritableMap createMap = Arguments.createMap();
        Lg.g i10 = Lg.g.i();
        if (j10 != null) {
            createMap.putString("appName", str);
            createMap.putMap("user", firebaseUserToMap(j10));
        } else {
            createMap.putString("appName", str);
        }
        createMap.toString();
        i10.o(new Lg.b("auth_state_changed", createMap, str));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$addIdTokenListener$1(String str, FirebaseAuth firebaseAuth) {
        FirebaseUser j10 = firebaseAuth.j();
        Lg.g i10 = Lg.g.i();
        WritableMap createMap = Arguments.createMap();
        if (j10 != null) {
            createMap.putBoolean("authenticated", true);
            createMap.putString("appName", str);
            createMap.putMap("user", firebaseUserToMap(j10));
        } else {
            createMap.putString("appName", str);
            createMap.putBoolean("authenticated", false);
        }
        i10.o(new Lg.b("auth_id_token_changed", createMap, str));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$applyActionCode$36(FirebaseAuth firebaseAuth, Promise promise, Task task) {
        if (task.isSuccessful()) {
            promiseWithUser(firebaseAuth.j(), promise);
            return;
        }
        Exception exception = task.getException();
        Log.e(TAG, "applyActionCode:onComplete:failure", exception);
        lambda$signInWithProvider$26(promise, exception);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$checkActionCode$37(Promise promise, Task task) {
        if (!task.isSuccessful()) {
            Exception exception = task.getException();
            Log.e(TAG, "checkActionCode:onComplete:failure", exception);
            lambda$signInWithProvider$26(promise, exception);
            return;
        }
        InterfaceC5219d interfaceC5219d = (InterfaceC5219d) task.getResult();
        Objects.requireNonNull(interfaceC5219d);
        InterfaceC5219d interfaceC5219d2 = interfaceC5219d;
        WritableMap createMap = Arguments.createMap();
        WritableMap createMap2 = Arguments.createMap();
        createMap2.putString("email", interfaceC5219d2.a(0));
        createMap2.putString("fromEmail", interfaceC5219d2.a(1));
        createMap.putMap(EventKeys.DATA, createMap2);
        int b10 = interfaceC5219d2.b();
        createMap.putString("operation", b10 != 0 ? b10 != 1 ? b10 != 2 ? b10 != 3 ? b10 != 4 ? "UNKNOWN" : "EMAIL_SIGNIN" : "ERROR" : "RECOVER_EMAIL" : "VERIFY_EMAIL" : "PASSWORD_RESET");
        promise.resolve(createMap);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$confirmPasswordReset$35(Promise promise, Task task) {
        if (task.isSuccessful()) {
            promiseNoUser(promise, Boolean.FALSE);
            return;
        }
        Exception exception = task.getException();
        Log.e(TAG, "confirmPasswordReset:onComplete:failure", exception);
        lambda$signInWithProvider$26(promise, exception);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$confirmationResultConfirm$34(Promise promise, Task task) {
        if (task.isSuccessful()) {
            AuthResult authResult = (AuthResult) task.getResult();
            Objects.requireNonNull(authResult);
            lambda$signInWithProvider$25(authResult, promise);
        } else {
            Exception exception = task.getException();
            Log.e(TAG, "confirmationResultConfirm:signInWithCredential:onComplete:failure", exception);
            lambda$signInWithProvider$26(promise, exception);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$createUserWithEmailAndPassword$5(Promise promise, Exception exc) {
        Log.e(TAG, "createUserWithEmailAndPassword:onComplete:failure", exc);
        lambda$signInWithProvider$26(promise, exc);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$delete$14(Promise promise, Task task) {
        if (task.isSuccessful()) {
            promiseNoUser(promise, Boolean.FALSE);
            return;
        }
        Exception exception = task.getException();
        Log.e(TAG, "delete:onComplete:failure", exception);
        lambda$signInWithProvider$26(promise, exception);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$fetchSignInMethodsForEmail$51(Promise promise, Task task) {
        if (!task.isSuccessful()) {
            lambda$signInWithProvider$26(promise, task.getException());
            return;
        }
        kb.C c10 = (kb.C) task.getResult();
        Objects.requireNonNull(c10);
        List a10 = c10.a();
        WritableArray createArray = Arguments.createArray();
        if (a10 != null) {
            Iterator it = a10.iterator();
            while (it.hasNext()) {
                createArray.pushString((String) it.next());
            }
        }
        promise.resolve(createArray);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$finalizeMultiFactorEnrollment$29(Promise promise, Task task) {
        if (task.isSuccessful()) {
            promise.resolve(null);
            return;
        }
        Exception exception = task.getException();
        Log.e(TAG, "finalizeMultiFactorEnrollment:onComplete:failure", exception);
        lambda$signInWithProvider$26(promise, exception);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$generateTotpSecret$33(Promise promise, Task task) {
        if (!task.isSuccessful()) {
            lambda$signInWithProvider$26(promise, task.getException());
            return;
        }
        kb.F f10 = (kb.F) task.getResult();
        String b10 = f10.b();
        this.mTotpSecrets.put(b10, f10);
        WritableMap createMap = Arguments.createMap();
        createMap.putString("secretKey", b10);
        promise.resolve(createMap);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$getIdToken$49(Promise promise, Task task) {
        if (task.isSuccessful()) {
            C5235u c5235u = (C5235u) task.getResult();
            Objects.requireNonNull(c5235u);
            promise.resolve(c5235u.f());
        } else {
            Exception exception = task.getException();
            Log.e(TAG, "getIdToken:onComplete:failure", exception);
            lambda$signInWithProvider$26(promise, exception);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$getIdTokenResult$50(Promise promise, Task task) {
        if (!task.isSuccessful()) {
            Exception exception = task.getException();
            Log.e(TAG, "getIdTokenResult:onComplete:failure", exception);
            lambda$signInWithProvider$26(promise, exception);
            return;
        }
        C5235u c5235u = (C5235u) task.getResult();
        WritableMap createMap = Arguments.createMap();
        Objects.requireNonNull(c5235u);
        Lg.m.g("authTime", Lg.m.i(c5235u.a()), createMap);
        Lg.m.g("expirationTime", Lg.m.i(c5235u.c()), createMap);
        Lg.m.g("issuedAtTime", Lg.m.i(c5235u.d()), createMap);
        Lg.m.g("claims", c5235u.b(), createMap);
        Lg.m.g("signInProvider", c5235u.e(), createMap);
        Lg.m.g("token", c5235u.f(), createMap);
        promise.resolve(createMap);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$getSession$27(Promise promise, Task task) {
        if (!task.isSuccessful()) {
            ReactNativeFirebaseModule.rejectPromiseWithExceptionMap(promise, task.getException());
            return;
        }
        MultiFactorSession multiFactorSession = (MultiFactorSession) task.getResult();
        String num = Integer.toString(multiFactorSession.hashCode());
        this.mMultiFactorSessions.put(num, multiFactorSession);
        promise.resolve(num);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$linkWithCredential$38(Promise promise, Task task) {
        kb.r rVar;
        AuthCredential b10;
        if (task.isSuccessful()) {
            lambda$signInWithProvider$25((AuthResult) task.getResult(), promise);
            return;
        }
        Exception exception = task.getException();
        if ((exception instanceof kb.r) && (b10 = (rVar = (kb.r) exception).b()) != null) {
            promiseRejectLinkAuthException(promise, rVar, b10);
        } else {
            Log.e(TAG, "link:onComplete:failure", exception);
            lambda$signInWithProvider$26(promise, exception);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$reauthenticateWithCredential$44(Promise promise, Task task) {
        if (task.isSuccessful()) {
            lambda$signInWithProvider$25((AuthResult) task.getResult(), promise);
            return;
        }
        Exception exception = task.getException();
        Log.e(TAG, "reauthenticate:onComplete:failure", exception);
        lambda$signInWithProvider$26(promise, exception);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$reload$15(FirebaseAuth firebaseAuth, Promise promise, Task task) {
        if (task.isSuccessful()) {
            promiseWithUser(firebaseAuth.j(), promise);
            return;
        }
        Exception exception = task.getException();
        Log.e(TAG, "reload:onComplete:failure", exception);
        lambda$signInWithProvider$26(promise, exception);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$resolveMultiFactorCredential$31(Promise promise, Task task) {
        if (task.isSuccessful()) {
            lambda$signInWithProvider$25((AuthResult) task.getResult(), promise);
        } else {
            lambda$signInWithProvider$26(promise, task.getException());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$resolveTotpSignIn$32(Promise promise, Task task) {
        if (task.isSuccessful()) {
            lambda$signInWithProvider$25((AuthResult) task.getResult(), promise);
        } else {
            lambda$signInWithProvider$26(promise, task.getException());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$sendEmailVerification$16(FirebaseAuth firebaseAuth, Promise promise, Task task) {
        if (task.isSuccessful()) {
            promiseWithUser(firebaseAuth.j(), promise);
            return;
        }
        Exception exception = task.getException();
        Log.e(TAG, "sendEmailVerification:onComplete:failure", exception);
        lambda$signInWithProvider$26(promise, exception);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$sendPasswordResetEmail$12(Promise promise, Task task) {
        if (task.isSuccessful()) {
            promiseNoUser(promise, Boolean.FALSE);
            return;
        }
        Exception exception = task.getException();
        Log.e(TAG, "sendPasswordResetEmail:onComplete:failure", exception);
        lambda$signInWithProvider$26(promise, exception);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$sendSignInLinkToEmail$13(Promise promise, Task task) {
        if (task.isSuccessful()) {
            promiseNoUser(promise, Boolean.FALSE);
            return;
        }
        Exception exception = task.getException();
        Log.e(TAG, "sendSignInLinkToEmail:onComplete:failure", exception);
        lambda$signInWithProvider$26(promise, exception);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$signInAnonymously$3(Promise promise, Exception exc) {
        Log.e(TAG, "signInAnonymously:onComplete:failure", exc);
        lambda$signInWithProvider$26(promise, exc);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$signInWithCredential$22(Promise promise, Task task) {
        if (task.isSuccessful()) {
            lambda$signInWithProvider$25((AuthResult) task.getResult(), promise);
            return;
        }
        Exception exception = task.getException();
        Log.e(TAG, "signInWithCredential:onComplete:failure", exception);
        lambda$signInWithProvider$26(promise, exception);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$signInWithCustomToken$11(Promise promise, Exception exc) {
        Log.e(TAG, "signInWithCustomToken:onComplete:failure", exc);
        lambda$signInWithProvider$26(promise, exc);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$signInWithEmailAndPassword$7(Promise promise, Exception exc) {
        Log.e(TAG, "signInWithEmailAndPassword:onComplete:failure", exc);
        lambda$signInWithProvider$26(promise, exc);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$signInWithEmailLink$9(Promise promise, Exception exc) {
        Log.e(TAG, "signInWithEmailLink:onComplete:failure", exc);
        lambda$signInWithProvider$26(promise, exc);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$unlink$43(Promise promise, Task task) {
        if (task.isSuccessful()) {
            AuthResult authResult = (AuthResult) task.getResult();
            Objects.requireNonNull(authResult);
            promiseWithUser(authResult.getUser(), promise);
        } else {
            Exception exception = task.getException();
            Log.e(TAG, "unlink:onComplete:failure", exception);
            lambda$signInWithProvider$26(promise, exception);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$updateEmail$18(FirebaseAuth firebaseAuth, Promise promise, Task task) {
        if (task.isSuccessful()) {
            promiseWithUser(firebaseAuth.j(), promise);
            return;
        }
        Exception exception = task.getException();
        Log.e(TAG, "updateEmail:onComplete:failure", exception);
        lambda$signInWithProvider$26(promise, exception);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$updatePassword$19(FirebaseAuth firebaseAuth, Promise promise, Task task) {
        if (task.isSuccessful()) {
            promiseWithUser(firebaseAuth.j(), promise);
            return;
        }
        Exception exception = task.getException();
        Log.e(TAG, "updatePassword:onComplete:failure", exception);
        lambda$signInWithProvider$26(promise, exception);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$updatePhoneNumber$20(FirebaseAuth firebaseAuth, Promise promise, Task task) {
        if (task.isSuccessful()) {
            promiseWithUser(firebaseAuth.j(), promise);
            return;
        }
        Exception exception = task.getException();
        Log.e(TAG, "updatePhoneNumber:onComplete:failure", exception);
        lambda$signInWithProvider$26(promise, exception);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$updateProfile$21(FirebaseAuth firebaseAuth, Promise promise, Task task) {
        if (task.isSuccessful()) {
            promiseWithUser(firebaseAuth.j(), promise);
            return;
        }
        Exception exception = task.getException();
        Log.e(TAG, "updateProfile:onComplete:failure", exception);
        lambda$signInWithProvider$26(promise, exception);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$verifyBeforeUpdateEmail$17(FirebaseAuth firebaseAuth, Promise promise, Task task) {
        if (task.isSuccessful()) {
            promiseWithUser(firebaseAuth.j(), promise);
            return;
        }
        Exception exception = task.getException();
        Log.e(TAG, "verifyBeforeUpdateEmail:onComplete:failure", exception);
        lambda$signInWithProvider$26(promise, exception);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$verifyPasswordResetCode$52(Promise promise, Task task) {
        if (task.isSuccessful()) {
            promise.resolve(task.getResult());
            return;
        }
        Exception exception = task.getException();
        Log.e(TAG, "verifyPasswordResetCode:onComplete:failure", exception);
        lambda$signInWithProvider$26(promise, exception);
    }

    @ReactMethod
    private void linkWithCredential(String str, String str2, String str3, String str4, final Promise promise) {
        FirebaseAuth firebaseAuth = FirebaseAuth.getInstance(C4196f.o(str));
        AuthCredential credentialForProvider = getCredentialForProvider(str2, str3, str4);
        if (credentialForProvider == null) {
            ReactNativeFirebaseModule.rejectPromiseWithCodeAndMessage(promise, "invalid-credential", "The supplied auth credential is malformed, has expired or is not currently supported.");
            return;
        }
        FirebaseUser j10 = firebaseAuth.j();
        if (j10 != null) {
            j10.N(credentialForProvider).addOnCompleteListener(getExecutor(), new OnCompleteListener() { // from class: io.invertase.firebase.auth.i
                @Override // com.google.android.gms.tasks.OnCompleteListener
                public final void onComplete(Task task) {
                    ReactNativeFirebaseAuthModule.this.lambda$linkWithCredential$38(promise, task);
                }
            });
        } else {
            promiseNoUser(promise, Boolean.TRUE);
        }
    }

    @ReactMethod
    private void linkWithProvider(String str, ReadableMap readableMap, final Promise promise) {
        ReadableMap map;
        ReadableArray array;
        FirebaseAuth firebaseAuth = FirebaseAuth.getInstance(C4196f.o(str));
        if (readableMap.getString("providerId") == null) {
            ReactNativeFirebaseModule.rejectPromiseWithCodeAndMessage(promise, "invalid-credential", "The supplied auth credential is malformed, has expired or is not currently supported.");
            return;
        }
        FirebaseUser j10 = firebaseAuth.j();
        if (j10 == null) {
            promiseNoUser(promise, Boolean.TRUE);
            return;
        }
        C5240z.a e10 = C5240z.e(readableMap.getString("providerId"), firebaseAuth);
        if (readableMap.hasKey("scopes") && (array = readableMap.getArray("scopes")) != null) {
            ArrayList arrayList = new ArrayList();
            for (int i10 = 0; i10 < array.size(); i10++) {
                arrayList.add(array.getString(i10));
            }
            e10.c(arrayList);
        }
        if (readableMap.hasKey("customParameters") && (map = readableMap.getMap("customParameters")) != null) {
            ReadableMapKeySetIterator keySetIterator = map.keySetIterator();
            while (keySetIterator.hasNextKey()) {
                String nextKey = keySetIterator.nextKey();
                e10.a(nextKey, map.getString(nextKey));
            }
        }
        Task n10 = firebaseAuth.n();
        if (n10 != null) {
            n10.addOnSuccessListener(new OnSuccessListener() { // from class: io.invertase.firebase.auth.H
                @Override // com.google.android.gms.tasks.OnSuccessListener
                public final void onSuccess(Object obj) {
                    ReactNativeFirebaseAuthModule.this.lambda$linkWithProvider$39(promise, (AuthResult) obj);
                }
            }).addOnFailureListener(new OnFailureListener() { // from class: io.invertase.firebase.auth.T
                @Override // com.google.android.gms.tasks.OnFailureListener
                public final void onFailure(Exception exc) {
                    ReactNativeFirebaseAuthModule.this.lambda$linkWithProvider$40(promise, exc);
                }
            });
        } else {
            j10.d0(getCurrentActivity(), e10.b()).addOnSuccessListener(new OnSuccessListener() { // from class: io.invertase.firebase.auth.X
                @Override // com.google.android.gms.tasks.OnSuccessListener
                public final void onSuccess(Object obj) {
                    ReactNativeFirebaseAuthModule.this.lambda$linkWithProvider$41(promise, (AuthResult) obj);
                }
            }).addOnFailureListener(new OnFailureListener() { // from class: io.invertase.firebase.auth.Y
                @Override // com.google.android.gms.tasks.OnFailureListener
                public final void onFailure(Exception exc) {
                    ReactNativeFirebaseAuthModule.this.lambda$linkWithProvider$42(promise, exc);
                }
            });
        }
    }

    @NonNull
    private WritableMap multiFactorInfoToMap(MultiFactorInfo multiFactorInfo) {
        WritableMap createMap = Arguments.createMap();
        Date date = new Date(multiFactorInfo.g() * 1000);
        createMap.putString("displayName", multiFactorInfo.getDisplayName());
        createMap.putString("enrollmentTime", ISO_8601_FORMATTER.format(date));
        createMap.putString("factorId", multiFactorInfo.h());
        createMap.putString("uid", multiFactorInfo.a());
        if (multiFactorInfo.h().equals("phone")) {
            createMap.putString("phoneNumber", ((PhoneMultiFactorInfo) multiFactorInfo).b());
        }
        return createMap;
    }

    private void promiseNoUser(Promise promise, Boolean bool) {
        if (bool.booleanValue()) {
            ReactNativeFirebaseModule.rejectPromiseWithCodeAndMessage(promise, "no-current-user", "No user currently signed in.");
        } else {
            promise.resolve(null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: promiseRejectAuthException, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public void lambda$signInWithProvider$26(Promise promise, Exception exc) {
        WritableMap jSError = getJSError(exc);
        String string = jSError.hasKey("sessionId") ? jSError.getString("sessionId") : null;
        MultiFactorResolver multiFactorResolver = this.mCachedResolvers.get(string);
        WritableMap createMap = Arguments.createMap();
        if (multiFactorResolver != null) {
            createMap = resolverToMap(string, multiFactorResolver);
        }
        ReactNativeFirebaseModule.rejectPromiseWithCodeAndMessage(promise, jSError.getString(EventKeys.ERROR_CODE), jSError.getString("message"), createMap);
    }

    private void promiseRejectLinkAuthException(@NonNull Promise promise, @NonNull Exception exc, @NonNull AuthCredential authCredential) {
        WritableMap jSError = getJSError(exc);
        String valueOf = String.valueOf(authCredential.hashCode());
        WritableMap createMap = Arguments.createMap();
        createMap.putString("providerId", authCredential.g());
        createMap.putString("token", valueOf);
        createMap.putString("secret", null);
        this.credentials.put(valueOf, authCredential);
        WritableMap createMap2 = Arguments.createMap();
        createMap2.putString(EventKeys.ERROR_CODE, jSError.getString(EventKeys.ERROR_CODE));
        createMap2.putString("message", jSError.getString("message"));
        createMap2.putMap("authCredential", createMap);
        promise.reject(jSError.getString(EventKeys.ERROR_CODE), jSError.getString("message"), createMap2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: promiseWithAuthResult, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public void lambda$signInWithProvider$25(AuthResult authResult, Promise promise) {
        if (authResult == null || authResult.getUser() == null) {
            promiseNoUser(promise, Boolean.TRUE);
            return;
        }
        WritableMap createMap = Arguments.createMap();
        WritableMap firebaseUserToMap = firebaseUserToMap(authResult.getUser());
        if (authResult.Q() != null) {
            WritableMap createMap2 = Arguments.createMap();
            createMap2.putBoolean("isNewUser", authResult.Q().C());
            if (authResult.Q().getProfile() != null) {
                Lg.m.g("profile", authResult.Q().getProfile(), createMap2);
            }
            if (authResult.Q().n() != null) {
                createMap2.putString("providerId", authResult.Q().n());
            }
            if (authResult.Q().getUsername() != null) {
                createMap2.putString("username", authResult.Q().getUsername());
            }
            createMap.putMap("additionalUserInfo", createMap2);
        }
        createMap.putMap("user", firebaseUserToMap);
        promise.resolve(createMap);
    }

    private void promiseWithUser(FirebaseUser firebaseUser, Promise promise) {
        if (firebaseUser != null) {
            promise.resolve(firebaseUserToMap(firebaseUser));
        } else {
            promiseNoUser(promise, Boolean.TRUE);
        }
    }

    @ReactMethod
    private void reauthenticateWithCredential(String str, String str2, String str3, String str4, final Promise promise) {
        FirebaseAuth firebaseAuth = FirebaseAuth.getInstance(C4196f.o(str));
        AuthCredential credentialForProvider = getCredentialForProvider(str2, str3, str4);
        if (credentialForProvider == null) {
            ReactNativeFirebaseModule.rejectPromiseWithCodeAndMessage(promise, "invalid-credential", "The supplied auth credential is malformed, has expired or is not currently supported.");
            return;
        }
        FirebaseUser j10 = firebaseAuth.j();
        if (j10 != null) {
            j10.O(credentialForProvider).addOnCompleteListener(getExecutor(), new OnCompleteListener() { // from class: io.invertase.firebase.auth.I
                @Override // com.google.android.gms.tasks.OnCompleteListener
                public final void onComplete(Task task) {
                    ReactNativeFirebaseAuthModule.this.lambda$reauthenticateWithCredential$44(promise, task);
                }
            });
        } else {
            promiseNoUser(promise, Boolean.TRUE);
        }
    }

    @ReactMethod
    private void reauthenticateWithProvider(String str, ReadableMap readableMap, final Promise promise) {
        ReadableMap map;
        ReadableArray array;
        FirebaseAuth firebaseAuth = FirebaseAuth.getInstance(C4196f.o(str));
        if (readableMap.getString("providerId") == null) {
            ReactNativeFirebaseModule.rejectPromiseWithCodeAndMessage(promise, "invalid-credential", "The supplied auth credential is malformed, has expired or is not currently supported.");
            return;
        }
        FirebaseUser j10 = firebaseAuth.j();
        if (j10 == null) {
            promiseNoUser(promise, Boolean.TRUE);
            return;
        }
        C5240z.a e10 = C5240z.e(readableMap.getString("providerId"), firebaseAuth);
        if (readableMap.hasKey("scopes") && (array = readableMap.getArray("scopes")) != null) {
            ArrayList arrayList = new ArrayList();
            for (int i10 = 0; i10 < array.size(); i10++) {
                arrayList.add(array.getString(i10));
            }
            e10.c(arrayList);
        }
        if (readableMap.hasKey("customParameters") && (map = readableMap.getMap("customParameters")) != null) {
            ReadableMapKeySetIterator keySetIterator = map.keySetIterator();
            while (keySetIterator.hasNextKey()) {
                String nextKey = keySetIterator.nextKey();
                e10.a(nextKey, map.getString(nextKey));
            }
        }
        Task n10 = firebaseAuth.n();
        if (n10 != null) {
            n10.addOnSuccessListener(new OnSuccessListener() { // from class: io.invertase.firebase.auth.s
                @Override // com.google.android.gms.tasks.OnSuccessListener
                public final void onSuccess(Object obj) {
                    ReactNativeFirebaseAuthModule.this.lambda$reauthenticateWithProvider$45(promise, (AuthResult) obj);
                }
            }).addOnFailureListener(new OnFailureListener() { // from class: io.invertase.firebase.auth.t
                @Override // com.google.android.gms.tasks.OnFailureListener
                public final void onFailure(Exception exc) {
                    ReactNativeFirebaseAuthModule.this.lambda$reauthenticateWithProvider$46(promise, exc);
                }
            });
        } else {
            j10.e0(getCurrentActivity(), e10.b()).addOnSuccessListener(new OnSuccessListener() { // from class: io.invertase.firebase.auth.u
                @Override // com.google.android.gms.tasks.OnSuccessListener
                public final void onSuccess(Object obj) {
                    ReactNativeFirebaseAuthModule.this.lambda$reauthenticateWithProvider$47(promise, (AuthResult) obj);
                }
            }).addOnFailureListener(new OnFailureListener() { // from class: io.invertase.firebase.auth.v
                @Override // com.google.android.gms.tasks.OnFailureListener
                public final void onFailure(Exception exc) {
                    ReactNativeFirebaseAuthModule.this.lambda$reauthenticateWithProvider$48(promise, exc);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void resolveMultiFactorCredential(PhoneAuthCredential phoneAuthCredential, String str, final Promise promise) {
        C5215A a10 = kb.B.a(phoneAuthCredential);
        MultiFactorResolver multiFactorResolver = this.mCachedResolvers.get(str);
        if (multiFactorResolver == null) {
            ReactNativeFirebaseModule.rejectPromiseWithCodeAndMessage(promise, "invalid-multi-factor-session", "No resolver for session found. Is the session id correct?");
        } else {
            multiFactorResolver.j(a10).addOnCompleteListener(new OnCompleteListener() { // from class: io.invertase.firebase.auth.W
                @Override // com.google.android.gms.tasks.OnCompleteListener
                public final void onComplete(Task task) {
                    ReactNativeFirebaseAuthModule.this.lambda$resolveMultiFactorCredential$31(promise, task);
                }
            });
        }
    }

    @NonNull
    private WritableMap resolverToMap(String str, MultiFactorResolver multiFactorResolver) {
        WritableMap createMap = Arguments.createMap();
        WritableArray createArray = Arguments.createArray();
        Iterator it = multiFactorResolver.h().iterator();
        while (it.hasNext()) {
            createArray.pushMap(multiFactorInfoToMap((MultiFactorInfo) it.next()));
        }
        createMap.putArray("hints", createArray);
        createMap.putString("session", str);
        return createMap;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void sendPhoneStateEvent(String str, String str2, String str3, WritableMap writableMap) {
        WritableMap createMap = Arguments.createMap();
        Lg.g i10 = Lg.g.i();
        createMap.putString("appName", str);
        createMap.putString("requestKey", str2);
        createMap.putString("type", str3);
        createMap.putMap("state", writableMap);
        i10.o(new Lg.b("phone_auth_state_changed", createMap, str));
    }

    @ReactMethod
    private void signInAnonymously(String str, final Promise promise) {
        FirebaseAuth.getInstance(C4196f.o(str)).A().addOnSuccessListener(new OnSuccessListener() { // from class: io.invertase.firebase.auth.U
            @Override // com.google.android.gms.tasks.OnSuccessListener
            public final void onSuccess(Object obj) {
                ReactNativeFirebaseAuthModule.this.lambda$signInAnonymously$2(promise, (AuthResult) obj);
            }
        }).addOnFailureListener(new OnFailureListener() { // from class: io.invertase.firebase.auth.V
            @Override // com.google.android.gms.tasks.OnFailureListener
            public final void onFailure(Exception exc) {
                ReactNativeFirebaseAuthModule.this.lambda$signInAnonymously$3(promise, exc);
            }
        });
    }

    @ReactMethod
    private void signInWithCredential(String str, String str2, String str3, String str4, final Promise promise) {
        FirebaseAuth firebaseAuth = FirebaseAuth.getInstance(C4196f.o(str));
        AuthCredential credentialForProvider = getCredentialForProvider(str2, str3, str4);
        if (credentialForProvider == null) {
            ReactNativeFirebaseModule.rejectPromiseWithCodeAndMessage(promise, "invalid-credential", "The supplied auth credential is malformed, has expired or is not currently supported.");
        } else {
            firebaseAuth.B(credentialForProvider).addOnCompleteListener(getExecutor(), new OnCompleteListener() { // from class: io.invertase.firebase.auth.a0
                @Override // com.google.android.gms.tasks.OnCompleteListener
                public final void onComplete(Task task) {
                    ReactNativeFirebaseAuthModule.this.lambda$signInWithCredential$22(promise, task);
                }
            });
        }
    }

    @ReactMethod
    private void signInWithCustomToken(String str, String str2, final Promise promise) {
        FirebaseAuth.getInstance(C4196f.o(str)).C(str2).addOnSuccessListener(new OnSuccessListener() { // from class: io.invertase.firebase.auth.Q
            @Override // com.google.android.gms.tasks.OnSuccessListener
            public final void onSuccess(Object obj) {
                ReactNativeFirebaseAuthModule.this.lambda$signInWithCustomToken$10(promise, (AuthResult) obj);
            }
        }).addOnFailureListener(new OnFailureListener() { // from class: io.invertase.firebase.auth.S
            @Override // com.google.android.gms.tasks.OnFailureListener
            public final void onFailure(Exception exc) {
                ReactNativeFirebaseAuthModule.this.lambda$signInWithCustomToken$11(promise, exc);
            }
        });
    }

    @ReactMethod
    private void signInWithEmailAndPassword(String str, String str2, String str3, final Promise promise) {
        FirebaseAuth.getInstance(C4196f.o(str)).D(str2, str3).addOnSuccessListener(new OnSuccessListener() { // from class: io.invertase.firebase.auth.N
            @Override // com.google.android.gms.tasks.OnSuccessListener
            public final void onSuccess(Object obj) {
                ReactNativeFirebaseAuthModule.this.lambda$signInWithEmailAndPassword$6(promise, (AuthResult) obj);
            }
        }).addOnFailureListener(new OnFailureListener() { // from class: io.invertase.firebase.auth.O
            @Override // com.google.android.gms.tasks.OnFailureListener
            public final void onFailure(Exception exc) {
                ReactNativeFirebaseAuthModule.this.lambda$signInWithEmailAndPassword$7(promise, exc);
            }
        });
    }

    @ReactMethod
    private void signInWithEmailLink(String str, String str2, String str3, final Promise promise) {
        try {
            FirebaseAuth.getInstance(C4196f.o(str)).E(str2, str3).addOnSuccessListener(new OnSuccessListener() { // from class: io.invertase.firebase.auth.b
                @Override // com.google.android.gms.tasks.OnSuccessListener
                public final void onSuccess(Object obj) {
                    ReactNativeFirebaseAuthModule.this.lambda$signInWithEmailLink$8(promise, (AuthResult) obj);
                }
            }).addOnFailureListener(new OnFailureListener() { // from class: io.invertase.firebase.auth.c
                @Override // com.google.android.gms.tasks.OnFailureListener
                public final void onFailure(Exception exc) {
                    ReactNativeFirebaseAuthModule.this.lambda$signInWithEmailLink$9(promise, exc);
                }
            });
        } catch (Exception e10) {
            Log.e(TAG, "signInWithEmailLink:onComplete:totalfailure", e10);
            lambda$signInWithProvider$26(promise, e10);
        }
    }

    @ReactMethod
    private void signInWithProvider(String str, ReadableMap readableMap, final Promise promise) {
        ReadableMap map;
        ReadableArray array;
        FirebaseAuth firebaseAuth = FirebaseAuth.getInstance(C4196f.o(str));
        if (readableMap.getString("providerId") == null) {
            ReactNativeFirebaseModule.rejectPromiseWithCodeAndMessage(promise, "invalid-credential", "The supplied auth credential is malformed, has expired or is not currently supported.");
            return;
        }
        C5240z.a e10 = C5240z.e(readableMap.getString("providerId"), firebaseAuth);
        if (readableMap.hasKey("scopes") && (array = readableMap.getArray("scopes")) != null) {
            ArrayList arrayList = new ArrayList();
            for (int i10 = 0; i10 < array.size(); i10++) {
                arrayList.add(array.getString(i10));
            }
            e10.c(arrayList);
        }
        if (readableMap.hasKey("customParameters") && (map = readableMap.getMap("customParameters")) != null) {
            ReadableMapKeySetIterator keySetIterator = map.keySetIterator();
            while (keySetIterator.hasNextKey()) {
                String nextKey = keySetIterator.nextKey();
                e10.a(nextKey, map.getString(nextKey));
            }
        }
        Task n10 = firebaseAuth.n();
        if (n10 != null) {
            n10.addOnSuccessListener(new OnSuccessListener() { // from class: io.invertase.firebase.auth.j
                @Override // com.google.android.gms.tasks.OnSuccessListener
                public final void onSuccess(Object obj) {
                    ReactNativeFirebaseAuthModule.this.lambda$signInWithProvider$23(promise, (AuthResult) obj);
                }
            }).addOnFailureListener(new OnFailureListener() { // from class: io.invertase.firebase.auth.k
                @Override // com.google.android.gms.tasks.OnFailureListener
                public final void onFailure(Exception exc) {
                    ReactNativeFirebaseAuthModule.this.lambda$signInWithProvider$24(promise, exc);
                }
            });
        } else {
            firebaseAuth.G(getCurrentActivity(), e10.b()).addOnSuccessListener(new OnSuccessListener() { // from class: io.invertase.firebase.auth.m
                @Override // com.google.android.gms.tasks.OnSuccessListener
                public final void onSuccess(Object obj) {
                    ReactNativeFirebaseAuthModule.this.lambda$signInWithProvider$25(promise, (AuthResult) obj);
                }
            }).addOnFailureListener(new OnFailureListener() { // from class: io.invertase.firebase.auth.n
                @Override // com.google.android.gms.tasks.OnFailureListener
                public final void onFailure(Exception exc) {
                    ReactNativeFirebaseAuthModule.this.lambda$signInWithProvider$26(promise, exc);
                }
            });
        }
    }

    @ReactMethod
    private void updatePhoneNumber(String str, String str2, String str3, String str4, final Promise promise) {
        final FirebaseAuth firebaseAuth = FirebaseAuth.getInstance(C4196f.o(str));
        FirebaseUser j10 = firebaseAuth.j();
        if (!str2.equals("phone")) {
            ReactNativeFirebaseModule.rejectPromiseWithCodeAndMessage(promise, "invalid-credential", "The supplied auth credential does not have a phone provider.");
        }
        PhoneAuthCredential phoneAuthCredential = getPhoneAuthCredential(str3, str4);
        if (phoneAuthCredential == null) {
            ReactNativeFirebaseModule.rejectPromiseWithCodeAndMessage(promise, "invalid-credential", "The supplied auth credential is malformed, has expired or is not currently supported.");
        } else if (j10 != null) {
            j10.i0(phoneAuthCredential).addOnCompleteListener(getExecutor(), new OnCompleteListener() { // from class: io.invertase.firebase.auth.g
                @Override // com.google.android.gms.tasks.OnCompleteListener
                public final void onComplete(Task task) {
                    ReactNativeFirebaseAuthModule.this.lambda$updatePhoneNumber$20(firebaseAuth, promise, task);
                }
            });
        } else {
            promiseNoUser(promise, Boolean.FALSE);
            Log.e(TAG, "updatePhoneNumber:failure:noCurrentUser");
        }
    }

    @ReactMethod
    public void addAuthStateListener(final String str) {
        FirebaseAuth firebaseAuth = FirebaseAuth.getInstance(C4196f.o(str));
        if (mAuthListeners.get(str) == null) {
            FirebaseAuth.a aVar = new FirebaseAuth.a() { // from class: io.invertase.firebase.auth.o
                @Override // com.google.firebase.auth.FirebaseAuth.a
                public final void a(FirebaseAuth firebaseAuth2) {
                    ReactNativeFirebaseAuthModule.this.lambda$addAuthStateListener$0(str, firebaseAuth2);
                }
            };
            firebaseAuth.a(aVar);
            mAuthListeners.put(str, aVar);
        }
    }

    @ReactMethod
    public void addIdTokenListener(final String str) {
        FirebaseAuth firebaseAuth = FirebaseAuth.getInstance(C4196f.o(str));
        if (mIdTokenListeners.containsKey(str)) {
            return;
        }
        FirebaseAuth.b bVar = new FirebaseAuth.b() { // from class: io.invertase.firebase.auth.b0
            @Override // com.google.firebase.auth.FirebaseAuth.b
            public final void a(FirebaseAuth firebaseAuth2) {
                ReactNativeFirebaseAuthModule.this.lambda$addIdTokenListener$1(str, firebaseAuth2);
            }
        };
        firebaseAuth.b(bVar);
        mIdTokenListeners.put(str, bVar);
    }

    @ReactMethod
    public void applyActionCode(String str, String str2, final Promise promise) {
        final FirebaseAuth firebaseAuth = FirebaseAuth.getInstance(C4196f.o(str));
        firebaseAuth.c(str2).addOnCompleteListener(getExecutor(), new OnCompleteListener() { // from class: io.invertase.firebase.auth.a
            @Override // com.google.android.gms.tasks.OnCompleteListener
            public final void onComplete(Task task) {
                ReactNativeFirebaseAuthModule.this.lambda$applyActionCode$36(firebaseAuth, promise, task);
            }
        });
    }

    @ReactMethod
    public void checkActionCode(String str, String str2, final Promise promise) {
        FirebaseAuth.getInstance(C4196f.o(str)).d(str2).addOnCompleteListener(getExecutor(), new OnCompleteListener() { // from class: io.invertase.firebase.auth.r
            @Override // com.google.android.gms.tasks.OnCompleteListener
            public final void onComplete(Task task) {
                ReactNativeFirebaseAuthModule.this.lambda$checkActionCode$37(promise, task);
            }
        });
    }

    @ReactMethod
    public void configureAuthDomain(String str) {
        FirebaseAuth firebaseAuth = FirebaseAuth.getInstance(C4196f.o(str));
        String str2 = ReactNativeFirebaseAppModule.authDomains.get(str);
        if (str2 != null) {
            firebaseAuth.x(str2);
        }
    }

    @ReactMethod
    public void confirmPasswordReset(String str, String str2, String str3, final Promise promise) {
        FirebaseAuth.getInstance(C4196f.o(str)).e(str2, str3).addOnCompleteListener(getExecutor(), new OnCompleteListener() { // from class: io.invertase.firebase.auth.Z
            @Override // com.google.android.gms.tasks.OnCompleteListener
            public final void onComplete(Task task) {
                ReactNativeFirebaseAuthModule.this.lambda$confirmPasswordReset$35(promise, task);
            }
        });
    }

    @ReactMethod
    public void confirmationResultConfirm(String str, String str2, final Promise promise) {
        try {
            FirebaseAuth.getInstance(C4196f.o(str)).B(PhoneAuthProvider.a(this.mVerificationId, str2)).addOnCompleteListener(getExecutor(), new OnCompleteListener() { // from class: io.invertase.firebase.auth.d
                @Override // com.google.android.gms.tasks.OnCompleteListener
                public final void onComplete(Task task) {
                    ReactNativeFirebaseAuthModule.this.lambda$confirmationResultConfirm$34(promise, task);
                }
            });
        } catch (Exception e10) {
            lambda$signInWithProvider$26(promise, e10);
        }
    }

    @ReactMethod
    public void delete(String str, final Promise promise) {
        FirebaseUser j10 = FirebaseAuth.getInstance(C4196f.o(str)).j();
        if (j10 != null) {
            j10.g().addOnCompleteListener(getExecutor(), new OnCompleteListener() { // from class: io.invertase.firebase.auth.q
                @Override // com.google.android.gms.tasks.OnCompleteListener
                public final void onComplete(Task task) {
                    ReactNativeFirebaseAuthModule.this.lambda$delete$14(promise, task);
                }
            });
        } else {
            Log.e(TAG, "delete:failure:noCurrentUser");
            promiseNoUser(promise, Boolean.TRUE);
        }
    }

    @ReactMethod
    public void fetchSignInMethodsForEmail(String str, String str2, final Promise promise) {
        FirebaseAuth.getInstance(C4196f.o(str)).g(str2).addOnCompleteListener(getExecutor(), new OnCompleteListener() { // from class: io.invertase.firebase.auth.x
            @Override // com.google.android.gms.tasks.OnCompleteListener
            public final void onComplete(Task task) {
                ReactNativeFirebaseAuthModule.this.lambda$fetchSignInMethodsForEmail$51(promise, task);
            }
        });
    }

    @ReactMethod
    public void finalizeMultiFactorEnrollment(String str, String str2, String str3, String str4, final Promise promise) {
        FirebaseAuth firebaseAuth = FirebaseAuth.getInstance(C4196f.o(str));
        firebaseAuth.j().j().a(kb.B.a(PhoneAuthProvider.a(str2, str3)), str4).addOnCompleteListener(new OnCompleteListener() { // from class: io.invertase.firebase.auth.y
            @Override // com.google.android.gms.tasks.OnCompleteListener
            public final void onComplete(Task task) {
                ReactNativeFirebaseAuthModule.this.lambda$finalizeMultiFactorEnrollment$29(promise, task);
            }
        });
    }

    @ReactMethod
    public void finalizeTotpEnrollment(String str, String str2, String str3, String str4, final Promise promise) {
        kb.F f10 = this.mTotpSecrets.get(str2);
        if (f10 == null) {
            ReactNativeFirebaseModule.rejectPromiseWithCodeAndMessage(promise, "invalid-multi-factor-secret", "can't find secret for provided key");
        } else {
            FirebaseAuth.getInstance(C4196f.o(str)).j().j().a(kb.E.b(f10, str3), str4).addOnCompleteListener(new OnCompleteListener() { // from class: io.invertase.firebase.auth.w
                @Override // com.google.android.gms.tasks.OnCompleteListener
                public final void onComplete(Task task) {
                    ReactNativeFirebaseAuthModule.Y(Promise.this, task);
                }
            });
        }
    }

    @ReactMethod
    public void forceRecaptchaFlowForTesting(String str, boolean z10, Promise promise) {
        FirebaseAuth.getInstance(C4196f.o(str)).l().a(z10);
        promise.resolve(null);
    }

    @ReactMethod
    public void generateQrCodeUrl(String str, String str2, String str3, String str4, Promise promise) {
        kb.F f10 = this.mTotpSecrets.get(str2);
        if (f10 == null) {
            ReactNativeFirebaseModule.rejectPromiseWithCodeAndMessage(promise, "invalid-multi-factor-secret", "can't find secret for provided key");
        } else {
            promise.resolve(f10.c(str3, str4));
        }
    }

    @ReactMethod
    public void generateTotpSecret(String str, String str2, final Promise promise) {
        MultiFactorSession multiFactorSession = this.mMultiFactorSessions.get(str2);
        if (multiFactorSession == null) {
            ReactNativeFirebaseModule.rejectPromiseWithCodeAndMessage(promise, "invalid-multi-factor-session", "No resolver for session found. Is the session id correct?");
        } else {
            kb.E.a(multiFactorSession).addOnCompleteListener(new OnCompleteListener() { // from class: io.invertase.firebase.auth.f
                @Override // com.google.android.gms.tasks.OnCompleteListener
                public final void onComplete(Task task) {
                    ReactNativeFirebaseAuthModule.this.lambda$generateTotpSecret$33(promise, task);
                }
            });
        }
    }

    @Override // io.invertase.firebase.common.ReactNativeFirebaseModule, com.facebook.react.bridge.BaseJavaModule
    public Map<String, Object> getConstants() {
        HashMap hashMap = new HashMap();
        List m10 = C4196f.m(getReactApplicationContext());
        HashMap hashMap2 = new HashMap();
        HashMap hashMap3 = new HashMap();
        Iterator it = m10.iterator();
        while (it.hasNext()) {
            String p10 = ((C4196f) it.next()).p();
            FirebaseAuth firebaseAuth = FirebaseAuth.getInstance(C4196f.o(p10));
            FirebaseUser j10 = firebaseAuth.j();
            hashMap2.put(p10, firebaseAuth.m());
            if (j10 != null) {
                hashMap3.put(p10, firebaseUserToMap(j10));
            }
        }
        hashMap.put("APP_LANGUAGE", hashMap2);
        hashMap.put("APP_USER", hashMap3);
        return hashMap;
    }

    @ReactMethod
    public void getCustomAuthDomain(String str, Promise promise) {
        promise.resolve(FirebaseAuth.getInstance(C4196f.o(str)).k());
    }

    @ReactMethod
    public void getIdToken(String str, Boolean bool, final Promise promise) {
        FirebaseUser j10 = FirebaseAuth.getInstance(C4196f.o(str)).j();
        if (j10 == null) {
            promiseNoUser(promise, Boolean.TRUE);
        } else {
            j10.h(bool.booleanValue()).addOnCompleteListener(getExecutor(), new OnCompleteListener() { // from class: io.invertase.firebase.auth.l
                @Override // com.google.android.gms.tasks.OnCompleteListener
                public final void onComplete(Task task) {
                    ReactNativeFirebaseAuthModule.this.lambda$getIdToken$49(promise, task);
                }
            });
        }
    }

    @ReactMethod
    public void getIdTokenResult(String str, Boolean bool, final Promise promise) {
        FirebaseUser j10 = FirebaseAuth.getInstance(C4196f.o(str)).j();
        if (j10 == null) {
            promiseNoUser(promise, Boolean.TRUE);
        } else {
            j10.h(bool.booleanValue()).addOnCompleteListener(getExecutor(), new OnCompleteListener() { // from class: io.invertase.firebase.auth.A
                @Override // com.google.android.gms.tasks.OnCompleteListener
                public final void onComplete(Task task) {
                    ReactNativeFirebaseAuthModule.this.lambda$getIdTokenResult$50(promise, task);
                }
            });
        }
    }

    @ReactMethod
    public void getSession(String str, final Promise promise) {
        FirebaseAuth.getInstance(C4196f.o(str)).j().j().c().addOnCompleteListener(new OnCompleteListener() { // from class: io.invertase.firebase.auth.E
            @Override // com.google.android.gms.tasks.OnCompleteListener
            public final void onComplete(Task task) {
                ReactNativeFirebaseAuthModule.this.lambda$getSession$27(promise, task);
            }
        });
    }

    @Override // io.invertase.firebase.common.ReactNativeFirebaseModule, com.facebook.react.bridge.BaseJavaModule, com.facebook.react.bridge.NativeModule, com.facebook.react.turbomodule.core.interfaces.TurboModule
    public void initialize() {
        super.initialize();
    }

    @Override // io.invertase.firebase.common.ReactNativeFirebaseModule, com.facebook.react.bridge.BaseJavaModule, com.facebook.react.bridge.NativeModule
    public void invalidate() {
        super.invalidate();
        Iterator<Map.Entry<String, FirebaseAuth.a>> it = mAuthListeners.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry<String, FirebaseAuth.a> next = it.next();
            FirebaseAuth.getInstance(C4196f.o(next.getKey())).s(next.getValue());
            it.remove();
        }
        Iterator<Map.Entry<String, FirebaseAuth.b>> it2 = mIdTokenListeners.entrySet().iterator();
        while (it2.hasNext()) {
            Map.Entry<String, FirebaseAuth.b> next2 = it2.next();
            FirebaseAuth.getInstance(C4196f.o(next2.getKey())).t(next2.getValue());
            it2.remove();
        }
        this.mCachedResolvers.clear();
        this.mMultiFactorSessions.clear();
        this.mTotpSecrets.clear();
    }

    @ReactMethod
    public void isSignInWithEmailLink(String str, String str2, Promise promise) {
        promise.resolve(Boolean.valueOf(FirebaseAuth.getInstance(C4196f.o(str)).r(str2)));
    }

    @ReactMethod
    public void openInOtpApp(String str, String str2, String str3) {
        kb.F f10 = this.mTotpSecrets.get(str2);
        if (f10 != null) {
            f10.d(str3);
        }
    }

    @ReactMethod
    public void reload(String str, final Promise promise) {
        final FirebaseAuth firebaseAuth = FirebaseAuth.getInstance(C4196f.o(str));
        FirebaseUser j10 = firebaseAuth.j();
        if (j10 != null) {
            j10.Y().addOnCompleteListener(getExecutor(), new OnCompleteListener() { // from class: io.invertase.firebase.auth.z
                @Override // com.google.android.gms.tasks.OnCompleteListener
                public final void onComplete(Task task) {
                    ReactNativeFirebaseAuthModule.this.lambda$reload$15(firebaseAuth, promise, task);
                }
            });
        } else {
            promiseNoUser(promise, Boolean.FALSE);
            Log.e(TAG, "reload:failure:noCurrentUser");
        }
    }

    @ReactMethod
    public void removeAuthStateListener(String str) {
        FirebaseAuth firebaseAuth = FirebaseAuth.getInstance(C4196f.o(str));
        FirebaseAuth.a aVar = mAuthListeners.get(str);
        if (aVar != null) {
            firebaseAuth.s(aVar);
            mAuthListeners.remove(str);
        }
    }

    @ReactMethod
    public void removeIdTokenListener(String str) {
        FirebaseAuth firebaseAuth = FirebaseAuth.getInstance(C4196f.o(str));
        FirebaseAuth.b bVar = mIdTokenListeners.get(str);
        if (bVar != null) {
            firebaseAuth.t(bVar);
            mIdTokenListeners.remove(str);
        }
    }

    @ReactMethod
    public void resolveMultiFactorSignIn(String str, String str2, String str3, String str4, Promise promise) {
        resolveMultiFactorCredential(PhoneAuthProvider.a(str3, str4), str2, promise);
    }

    @ReactMethod
    public void resolveTotpSignIn(String str, String str2, String str3, String str4, final Promise promise) {
        kb.D c10 = kb.E.c(str3, str4);
        MultiFactorResolver multiFactorResolver = this.mCachedResolvers.get(str2);
        if (multiFactorResolver == null) {
            ReactNativeFirebaseModule.rejectPromiseWithCodeAndMessage(promise, "invalid-multi-factor-session", "No resolver for session found. Is the session id correct?");
        } else {
            multiFactorResolver.j(c10).addOnCompleteListener(new OnCompleteListener() { // from class: io.invertase.firebase.auth.J
                @Override // com.google.android.gms.tasks.OnCompleteListener
                public final void onComplete(Task task) {
                    ReactNativeFirebaseAuthModule.this.lambda$resolveTotpSignIn$32(promise, task);
                }
            });
        }
    }

    @ReactMethod
    public void revokeToken(String str, String str2, Promise promise) {
        Log.e(TAG, "revokeToken:failure:noCurrentUser");
        promiseNoUser(promise, Boolean.FALSE);
    }

    @ReactMethod
    public void sendEmailVerification(String str, ReadableMap readableMap, final Promise promise) {
        final FirebaseAuth firebaseAuth = FirebaseAuth.getInstance(C4196f.o(str));
        FirebaseUser j10 = firebaseAuth.j();
        if (j10 == null) {
            promiseNoUser(promise, Boolean.FALSE);
            Log.e(TAG, "sendEmailVerification:failure:noCurrentUser");
            return;
        }
        OnCompleteListener onCompleteListener = new OnCompleteListener() { // from class: io.invertase.firebase.auth.F
            @Override // com.google.android.gms.tasks.OnCompleteListener
            public final void onComplete(Task task) {
                ReactNativeFirebaseAuthModule.this.lambda$sendEmailVerification$16(firebaseAuth, promise, task);
            }
        };
        if (readableMap == null) {
            j10.Z().addOnCompleteListener(getExecutor(), onCompleteListener);
        } else {
            j10.a0(buildActionCodeSettings(readableMap)).addOnCompleteListener(getExecutor(), onCompleteListener);
        }
    }

    @ReactMethod
    public void sendPasswordResetEmail(String str, String str2, ReadableMap readableMap, final Promise promise) {
        FirebaseAuth firebaseAuth = FirebaseAuth.getInstance(C4196f.o(str));
        OnCompleteListener onCompleteListener = new OnCompleteListener() { // from class: io.invertase.firebase.auth.K
            @Override // com.google.android.gms.tasks.OnCompleteListener
            public final void onComplete(Task task) {
                ReactNativeFirebaseAuthModule.this.lambda$sendPasswordResetEmail$12(promise, task);
            }
        };
        if (readableMap == null) {
            firebaseAuth.u(str2).addOnCompleteListener(getExecutor(), onCompleteListener);
        } else {
            firebaseAuth.v(str2, buildActionCodeSettings(readableMap)).addOnCompleteListener(getExecutor(), onCompleteListener);
        }
    }

    @ReactMethod
    public void sendSignInLinkToEmail(String str, String str2, ReadableMap readableMap, final Promise promise) {
        FirebaseAuth firebaseAuth = FirebaseAuth.getInstance(C4196f.o(str));
        firebaseAuth.w(str2, buildActionCodeSettings(readableMap)).addOnCompleteListener(getExecutor(), new OnCompleteListener() { // from class: io.invertase.firebase.auth.B
            @Override // com.google.android.gms.tasks.OnCompleteListener
            public final void onComplete(Task task) {
                ReactNativeFirebaseAuthModule.this.lambda$sendSignInLinkToEmail$13(promise, task);
            }
        });
    }

    @ReactMethod
    public void setAppVerificationDisabledForTesting(String str, boolean z10, Promise promise) {
        FirebaseAuth.getInstance(C4196f.o(str)).l().b(z10);
        promise.resolve(null);
    }

    @ReactMethod
    public void setAutoRetrievedSmsCodeForPhoneNumber(String str, String str2, String str3, Promise promise) {
        FirebaseAuth.getInstance(C4196f.o(str)).l().c(str2, str3);
        promise.resolve(null);
    }

    @ReactMethod
    public void setLanguageCode(String str, String str2) {
        FirebaseAuth firebaseAuth = FirebaseAuth.getInstance(C4196f.o(str));
        if (str2 == null) {
            firebaseAuth.H();
        } else {
            firebaseAuth.y(str2);
        }
    }

    @ReactMethod
    public void setTenantId(String str, String str2) {
        FirebaseAuth.getInstance(C4196f.o(str)).z(str2);
    }

    @ReactMethod
    public void signInWithPhoneNumber(String str, String str2, boolean z10, Promise promise) {
        FirebaseAuth firebaseAuth = FirebaseAuth.getInstance(C4196f.o(str));
        Activity currentActivity = getCurrentActivity();
        if (!str2.equals(this.mLastPhoneNumber)) {
            this.mForceResendingToken = null;
            this.mLastPhoneNumber = str2;
        }
        this.mVerificationId = null;
        a aVar = new a(firebaseAuth, promise);
        if (currentActivity != null) {
            if (!z10 || this.mForceResendingToken == null) {
                PhoneAuthProvider.b(firebaseAuth).d(str2, 60L, TimeUnit.SECONDS, currentActivity, aVar);
            } else {
                PhoneAuthProvider.b(firebaseAuth).e(str2, 60L, TimeUnit.SECONDS, currentActivity, aVar, this.mForceResendingToken);
            }
        }
    }

    @ReactMethod
    public void signOut(String str, Promise promise) {
        FirebaseAuth firebaseAuth = FirebaseAuth.getInstance(C4196f.o(str));
        if (firebaseAuth == null || firebaseAuth.j() == null) {
            promiseNoUser(promise, Boolean.TRUE);
        } else {
            firebaseAuth.F();
            promiseNoUser(promise, Boolean.FALSE);
        }
    }

    @ReactMethod
    public void unenrollMultiFactor(String str, String str2, final Promise promise) {
        FirebaseAuth.getInstance(C4196f.o(str)).j().j().d(str2).addOnCompleteListener(new OnCompleteListener() { // from class: io.invertase.firebase.auth.h
            @Override // com.google.android.gms.tasks.OnCompleteListener
            public final void onComplete(Task task) {
                ReactNativeFirebaseAuthModule.T(Promise.this, task);
            }
        });
    }

    @ReactMethod
    public void unlink(String str, String str2, final Promise promise) {
        FirebaseUser j10 = FirebaseAuth.getInstance(C4196f.o(str)).j();
        if (j10 != null) {
            j10.f0(str2).addOnCompleteListener(getExecutor(), new OnCompleteListener() { // from class: io.invertase.firebase.auth.M
                @Override // com.google.android.gms.tasks.OnCompleteListener
                public final void onComplete(Task task) {
                    ReactNativeFirebaseAuthModule.this.lambda$unlink$43(promise, task);
                }
            });
        } else {
            promiseNoUser(promise, Boolean.TRUE);
        }
    }

    @ReactMethod
    public void updateEmail(String str, String str2, final Promise promise) {
        final FirebaseAuth firebaseAuth = FirebaseAuth.getInstance(C4196f.o(str));
        FirebaseUser j10 = firebaseAuth.j();
        if (j10 != null) {
            j10.g0(str2).addOnCompleteListener(getExecutor(), new OnCompleteListener() { // from class: io.invertase.firebase.auth.G
                @Override // com.google.android.gms.tasks.OnCompleteListener
                public final void onComplete(Task task) {
                    ReactNativeFirebaseAuthModule.this.lambda$updateEmail$18(firebaseAuth, promise, task);
                }
            });
        } else {
            promiseNoUser(promise, Boolean.FALSE);
            Log.e(TAG, "updateEmail:failure:noCurrentUser");
        }
    }

    @ReactMethod
    public void updatePassword(String str, String str2, final Promise promise) {
        final FirebaseAuth firebaseAuth = FirebaseAuth.getInstance(C4196f.o(str));
        FirebaseUser j10 = firebaseAuth.j();
        if (j10 != null) {
            j10.h0(str2).addOnCompleteListener(getExecutor(), new OnCompleteListener() { // from class: io.invertase.firebase.auth.p
                @Override // com.google.android.gms.tasks.OnCompleteListener
                public final void onComplete(Task task) {
                    ReactNativeFirebaseAuthModule.this.lambda$updatePassword$19(firebaseAuth, promise, task);
                }
            });
        } else {
            promiseNoUser(promise, Boolean.FALSE);
            Log.e(TAG, "updatePassword:failure:noCurrentUser");
        }
    }

    @ReactMethod
    public void updateProfile(String str, ReadableMap readableMap, final Promise promise) {
        final FirebaseAuth firebaseAuth = FirebaseAuth.getInstance(C4196f.o(str));
        FirebaseUser j10 = firebaseAuth.j();
        if (j10 == null) {
            promiseNoUser(promise, Boolean.FALSE);
            Log.e(TAG, "updateProfile:failure:noCurrentUser");
            return;
        }
        UserProfileChangeRequest.a aVar = new UserProfileChangeRequest.a();
        if (readableMap.hasKey("displayName")) {
            aVar.b(readableMap.getString("displayName"));
        }
        if (readableMap.hasKey("photoURL")) {
            String string = readableMap.getString("photoURL");
            aVar.c(string == null ? null : Uri.parse(string));
        }
        j10.j0(aVar.a()).addOnCompleteListener(getExecutor(), new OnCompleteListener() { // from class: io.invertase.firebase.auth.P
            @Override // com.google.android.gms.tasks.OnCompleteListener
            public final void onComplete(Task task) {
                ReactNativeFirebaseAuthModule.this.lambda$updateProfile$21(firebaseAuth, promise, task);
            }
        });
    }

    @ReactMethod
    public void useDeviceLanguage(String str) {
        FirebaseAuth.getInstance(C4196f.o(str)).H();
    }

    @ReactMethod
    public void useEmulator(String str, String str2, int i10) {
        if (emulatorConfigs.get(str) == null) {
            emulatorConfigs.put(str, "true");
            FirebaseAuth.getInstance(C4196f.o(str)).I(str2, i10);
        }
    }

    @ReactMethod
    public void verifyBeforeUpdateEmail(String str, String str2, ReadableMap readableMap, final Promise promise) {
        final FirebaseAuth firebaseAuth = FirebaseAuth.getInstance(C4196f.o(str));
        FirebaseUser j10 = firebaseAuth.j();
        if (j10 == null) {
            promiseNoUser(promise, Boolean.FALSE);
            Log.e(TAG, "verifyBeforeUpdateEmail:failure:noCurrentUser");
            return;
        }
        OnCompleteListener onCompleteListener = new OnCompleteListener() { // from class: io.invertase.firebase.auth.L
            @Override // com.google.android.gms.tasks.OnCompleteListener
            public final void onComplete(Task task) {
                ReactNativeFirebaseAuthModule.this.lambda$verifyBeforeUpdateEmail$17(firebaseAuth, promise, task);
            }
        };
        if (readableMap == null) {
            j10.k0(str2).addOnCompleteListener(getExecutor(), onCompleteListener);
        } else {
            j10.l0(str2, buildActionCodeSettings(readableMap)).addOnCompleteListener(getExecutor(), onCompleteListener);
        }
    }

    @ReactMethod
    public void verifyPasswordResetCode(String str, String str2, final Promise promise) {
        FirebaseAuth.getInstance(C4196f.o(str)).J(str2).addOnCompleteListener(getExecutor(), new OnCompleteListener() { // from class: io.invertase.firebase.auth.e
            @Override // com.google.android.gms.tasks.OnCompleteListener
            public final void onComplete(Task task) {
                ReactNativeFirebaseAuthModule.this.lambda$verifyPasswordResetCode$52(promise, task);
            }
        });
    }

    @ReactMethod
    public void verifyPhoneNumber(String str, String str2, String str3, int i10, boolean z10) {
        FirebaseAuth firebaseAuth = FirebaseAuth.getInstance(C4196f.o(str));
        Activity currentActivity = getCurrentActivity();
        if (!str2.equals(this.mLastPhoneNumber)) {
            this.mForceResendingToken = null;
            this.mLastPhoneNumber = str2;
        }
        this.mCredential = null;
        d dVar = new d(str, str3);
        if (currentActivity != null) {
            if (!z10 || this.mForceResendingToken == null) {
                PhoneAuthProvider.b(firebaseAuth).d(str2, i10, TimeUnit.SECONDS, currentActivity, dVar);
            } else {
                PhoneAuthProvider.b(firebaseAuth).e(str2, i10, TimeUnit.SECONDS, currentActivity, dVar, this.mForceResendingToken);
            }
        }
    }

    @ReactMethod
    public void verifyPhoneNumberForMultiFactor(String str, String str2, String str3, Promise promise) {
        MultiFactorSession multiFactorSession = this.mMultiFactorSessions.get(str3);
        if (multiFactorSession == null) {
            ReactNativeFirebaseModule.rejectPromiseWithCodeAndMessage(promise, "invalid-multi-factor-session", "can't find session for provided key");
        } else {
            PhoneAuthProvider.c(com.google.firebase.auth.a.a(FirebaseAuth.getInstance(C4196f.o(str))).h(str2).c(getCurrentActivity()).i(30L, TimeUnit.SECONDS).g(multiFactorSession).b(true).d(new c(promise)).a());
        }
    }

    @ReactMethod
    public void verifyPhoneNumberWithMultiFactorInfo(String str, String str2, String str3, Promise promise) {
        MultiFactorInfo multiFactorInfo;
        MultiFactorResolver multiFactorResolver = this.mCachedResolvers.get(str3);
        if (multiFactorResolver == null) {
            ReactNativeFirebaseModule.rejectPromiseWithCodeAndMessage(promise, "invalid-multi-factor-session", "No resolver for session found. Is the session id correct?");
            return;
        }
        Iterator it = multiFactorResolver.h().iterator();
        while (true) {
            if (!it.hasNext()) {
                multiFactorInfo = null;
                break;
            } else {
                multiFactorInfo = (MultiFactorInfo) it.next();
                if (str2.equals(multiFactorInfo.a())) {
                    break;
                }
            }
        }
        if (multiFactorInfo == null) {
            ReactNativeFirebaseModule.rejectPromiseWithCodeAndMessage(promise, "multi-factor-info-not-found", "The user does not have a second factor matching the identifier provided.");
        } else {
            if (!"phone".equals(multiFactorInfo.h())) {
                ReactNativeFirebaseModule.rejectPromiseWithCodeAndMessage(promise, "unknown", "Unsupported second factor. Only phone factors are supported.");
                return;
            }
            FirebaseAuth firebaseAuth = FirebaseAuth.getInstance(C4196f.o(str));
            PhoneAuthProvider.c(com.google.firebase.auth.a.a(firebaseAuth).c(getCurrentActivity()).f((PhoneMultiFactorInfo) multiFactorInfo).i(30L, TimeUnit.SECONDS).g(multiFactorResolver.i()).d(new b(promise, str3)).a());
        }
    }
}
