package com.oblador.keychain;

import Ph.AbstractC1459k;
import Ph.C1452g0;
import Ph.P;
import Ph.Q;
import Ph.X0;
import Wh.g;
import android.os.Build;
import android.text.TextUtils;
import android.util.Log;
import androidx.biometric.BiometricPrompt;
import cc.C2909a;
import cc.InterfaceC2910b;
import cc.j;
import cc.m;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.BaseJavaModule;
import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.module.annotations.ReactModule;
import com.oblador.keychain.d;
import dc.C4051a;
import dc.C4052b;
import dc.C4053c;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.SetsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.StringCompanionObject;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@ReactModule(name = KeychainModule.KEYCHAIN_MODULE)
@Metadata(d1 = {"\u0000\u009a\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u001e\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0010$\n\u0002\u0010\u0000\n\u0002\b\u0016\n\u0002\u0010%\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0007\u0018\u0000 i2\u00020\u0001:\u0001jB\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J9\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\u00062\b\u0010\u000b\u001a\u0004\u0018\u00010\n2\u0006\u0010\r\u001a\u00020\fH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u0019\u0010\u0012\u001a\u00020\u00112\b\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0002¢\u0006\u0004\b\u0012\u0010\u0013J)\u0010\u0014\u001a\u00020\u000e2\u0006\u0010\u0007\u001a\u00020\u00062\b\u0010\u000b\u001a\u0004\u0018\u00010\n2\u0006\u0010\r\u001a\u00020\fH\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u0015\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00060\u0016H\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\u001f\u0010\u0019\u001a\u00020\u000e2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\fH\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ\u0017\u0010\u001c\u001a\u00020\u000e2\u0006\u0010\u001b\u001a\u00020\u0011H\u0002¢\u0006\u0004\b\u001c\u0010\u001dJ0\u0010$\u001a\u00020#2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u001e\u001a\u00020\u00112\u0006\u0010 \u001a\u00020\u001f2\u0006\u0010\"\u001a\u00020!H\u0082@¢\u0006\u0004\b$\u0010%J0\u0010'\u001a\u00020#2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010&\u001a\u00020\u00112\u0006\u0010 \u001a\u00020\u001f2\u0006\u0010\"\u001a\u00020!H\u0082@¢\u0006\u0004\b'\u0010%J@\u0010+\u001a\u00020*2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010&\u001a\u00020\u00112\u0006\u0010\b\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\u00062\u0006\u0010)\u001a\u00020(2\u0006\u0010\"\u001a\u00020!H\u0082@¢\u0006\u0004\b+\u0010,J\u001f\u0010.\u001a\u00020-2\u0006\u0010\u001e\u001a\u00020\u00112\u0006\u0010\"\u001a\u00020!H\u0002¢\u0006\u0004\b.\u0010/J8\u00104\u001a\u00020\u000e2\u0006\u00100\u001a\u00020\u00062\u0006\u00101\u001a\u00020\u00112\u0006\u00102\u001a\u00020\u00112\u0006\u00103\u001a\u00020#2\u0006\u0010\"\u001a\u00020!H\u0082@¢\u0006\u0004\b4\u00105J\u001f\u00109\u001a\u00020(2\u0006\u00107\u001a\u0002062\u0006\u00108\u001a\u000206H\u0002¢\u0006\u0004\b9\u0010:J\u000f\u0010;\u001a\u00020\u0006H\u0016¢\u0006\u0004\b;\u0010<J\u000f\u0010=\u001a\u00020\u000eH\u0016¢\u0006\u0004\b=\u0010>J\u001b\u0010A\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020@0?H\u0016¢\u0006\u0004\bA\u0010BJ1\u0010C\u001a\u00020\u000e2\b\u0010\u000b\u001a\u0004\u0018\u00010\n2\u0006\u0010\b\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\fH\u0007¢\u0006\u0004\bC\u0010DJ!\u0010E\u001a\u00020\u000e2\b\u0010\u000b\u001a\u0004\u0018\u00010\n2\u0006\u0010\r\u001a\u00020\fH\u0007¢\u0006\u0004\bE\u0010FJ!\u0010G\u001a\u00020\u000e2\b\u0010\u000b\u001a\u0004\u0018\u00010\n2\u0006\u0010\r\u001a\u00020\fH\u0007¢\u0006\u0004\bG\u0010FJ!\u0010H\u001a\u00020\u000e2\b\u0010\u000b\u001a\u0004\u0018\u00010\n2\u0006\u0010\r\u001a\u00020\fH\u0007¢\u0006\u0004\bH\u0010FJ\u001f\u0010I\u001a\u00020\u000e2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\fH\u0007¢\u0006\u0004\bI\u0010FJ!\u0010J\u001a\u00020\u000e2\b\u0010\u000b\u001a\u0004\u0018\u00010\n2\u0006\u0010\r\u001a\u00020\fH\u0007¢\u0006\u0004\bJ\u0010FJ9\u0010L\u001a\u00020\u000e2\u0006\u0010K\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\u00062\b\u0010\u000b\u001a\u0004\u0018\u00010\n2\u0006\u0010\r\u001a\u00020\fH\u0007¢\u0006\u0004\bL\u0010\u0010J)\u0010M\u001a\u00020\u000e2\u0006\u0010K\u001a\u00020\u00062\b\u0010\u000b\u001a\u0004\u0018\u00010\n2\u0006\u0010\r\u001a\u00020\fH\u0007¢\u0006\u0004\bM\u0010\u0015J\u001f\u0010N\u001a\u00020\u000e2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\fH\u0007¢\u0006\u0004\bN\u0010FJ\u0017\u0010O\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\fH\u0007¢\u0006\u0004\bO\u0010PJ\u0017\u0010Q\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\fH\u0007¢\u0006\u0004\bQ\u0010PJ!\u00109\u001a\u00020\u000e2\b\u0010\u000b\u001a\u0004\u0018\u00010\n2\u0006\u0010\r\u001a\u00020\fH\u0007¢\u0006\u0004\b9\u0010FJ\u001d\u0010R\u001a\u00020\u00112\u0006\u00107\u001a\u0002062\u0006\u00108\u001a\u000206¢\u0006\u0004\bR\u0010SJ\u0019\u0010U\u001a\u0004\u0018\u00010\u00112\b\b\u0001\u0010T\u001a\u00020\u0006¢\u0006\u0004\bU\u0010VR \u0010X\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00110W8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bX\u0010YR\u0014\u0010[\u001a\u00020Z8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b[\u0010\\R\u0014\u0010^\u001a\u00020]8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b^\u0010_R\u0014\u0010a\u001a\u00020`8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\ba\u0010bR\u0011\u0010c\u001a\u0002068F¢\u0006\u0006\u001a\u0004\bc\u0010dR\u0011\u0010e\u001a\u0002068F¢\u0006\u0006\u001a\u0004\be\u0010dR\u0011\u0010f\u001a\u0002068F¢\u0006\u0006\u001a\u0004\bf\u0010dR\u0011\u0010g\u001a\u0002068F¢\u0006\u0006\u001a\u0004\bg\u0010dR\u0011\u0010h\u001a\u0002068F¢\u0006\u0006\u001a\u0004\bh\u0010d¨\u0006k"}, d2 = {"Lcom/oblador/keychain/KeychainModule;", "Lcom/facebook/react/bridge/ReactContextBaseJavaModule;", "Lcom/facebook/react/bridge/ReactApplicationContext;", "reactContext", "<init>", "(Lcom/facebook/react/bridge/ReactApplicationContext;)V", "", "alias", "username", "password", "Lcom/facebook/react/bridge/ReadableMap;", "options", "Lcom/facebook/react/bridge/Promise;", BaseJavaModule.METHOD_TYPE_PROMISE, "", "setGenericPassword", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/facebook/react/bridge/ReadableMap;Lcom/facebook/react/bridge/Promise;)V", "Lcc/b;", "getSelectedStorage", "(Lcom/facebook/react/bridge/ReadableMap;)Lcc/b;", "getGenericPassword", "(Ljava/lang/String;Lcom/facebook/react/bridge/ReadableMap;Lcom/facebook/react/bridge/Promise;)V", "", "doGetAllGenericPasswordServices", "()Ljava/util/Collection;", "resetGenericPassword", "(Ljava/lang/String;Lcom/facebook/react/bridge/Promise;)V", "cipherStorage", "addCipherStorageToMap", "(Lcc/b;)V", "current", "Lcom/oblador/keychain/d$b;", "resultSet", "Landroidx/biometric/BiometricPrompt$d;", "promptInfo", "Lcc/b$b;", "decryptCredentials", "(Ljava/lang/String;Lcc/b;Lcom/oblador/keychain/d$b;Landroidx/biometric/BiometricPrompt$d;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "storage", "decryptToResult", "Lcom/oblador/keychain/e;", "securityLevel", "Lcc/b$c;", "encryptToResult", "(Ljava/lang/String;Lcc/b;Ljava/lang/String;Ljava/lang/String;Lcom/oblador/keychain/e;Landroidx/biometric/BiometricPrompt$d;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lec/c;", "getInteractiveHandler", "(Lcc/b;Landroidx/biometric/BiometricPrompt$d;)Lec/c;", "service", "newCipherStorage", "oldCipherStorage", "decryptionResult", "migrateCipherStorage", "(Ljava/lang/String;Lcc/b;Lcc/b;Lcc/b$b;Landroidx/biometric/BiometricPrompt$d;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "useBiometry", "usePasscode", "getSecurityLevel", "(ZZ)Lcom/oblador/keychain/e;", "getName", "()Ljava/lang/String;", "invalidate", "()V", "", "", "getConstants", "()Ljava/util/Map;", "setGenericPasswordForOptions", "(Lcom/facebook/react/bridge/ReadableMap;Ljava/lang/String;Ljava/lang/String;Lcom/facebook/react/bridge/Promise;)V", "getAllGenericPasswordServices", "(Lcom/facebook/react/bridge/ReadableMap;Lcom/facebook/react/bridge/Promise;)V", "getGenericPasswordForOptions", "resetGenericPasswordForOptions", "hasInternetCredentialsForOptions", "hasGenericPasswordForOptions", "server", "setInternetCredentialsForServer", "getInternetCredentialsForServer", "resetInternetCredentialsForOptions", "isPasscodeAuthAvailable", "(Lcom/facebook/react/bridge/Promise;)V", "getSupportedBiometryType", "getCipherStorageForCurrentAPILevel", "(ZZ)Lcc/b;", "knownName", "getCipherStorageByName", "(Ljava/lang/String;)Lcc/b;", "", "cipherStorageMap", "Ljava/util/Map;", "Lcom/oblador/keychain/d;", "prefsStorage", "Lcom/oblador/keychain/d;", "LPh/P;", "coroutineScope", "LPh/P;", "LWh/a;", "mutex", "LWh/a;", "isFingerprintAuthAvailable", "()Z", "isFaceAuthAvailable", "isIrisAuthAvailable", "isSecureHardwareAvailable", "isPasscodeAvailable", "Companion", "a", "react-native-keychain_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nKeychainModule.kt\nKotlin\n*S Kotlin\n*F\n+ 1 KeychainModule.kt\ncom/oblador/keychain/KeychainModule\n+ 2 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n*L\n1#1,818:1\n37#2:819\n36#2,3:820\n*S KotlinDebug\n*F\n+ 1 KeychainModule.kt\ncom/oblador/keychain/KeychainModule\n*L\n288#1:819\n288#1:820,3\n*E\n"})
/* loaded from: classes3.dex */
public final class KeychainModule extends ReactContextBaseJavaModule {

    @NotNull
    public static final String EMPTY_STRING = "";

    @NotNull
    public static final String FACE_SUPPORTED_NAME = "Face";

    @NotNull
    public static final String FINGERPRINT_SUPPORTED_NAME = "Fingerprint";

    @NotNull
    public static final String IRIS_SUPPORTED_NAME = "Iris";

    @NotNull
    public static final String KEYCHAIN_MODULE = "RNKeychainManager";

    @NotNull
    private final Map<String, InterfaceC2910b> cipherStorageMap;

    @NotNull
    private final P coroutineScope;

    @NotNull
    private final Wh.a mutex;

    @NotNull
    private final com.oblador.keychain.d prefsStorage;

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);
    private static final String LOG_TAG = KeychainModule.class.getSimpleName();

    /* renamed from: com.oblador.keychain.KeychainModule$a, reason: from kotlin metadata */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final String g(ReadableMap readableMap) {
            return h(readableMap, "None");
        }

        public final String h(ReadableMap readableMap, String str) {
            String string = (readableMap == null || !readableMap.hasKey("accessControl")) ? null : readableMap.getString("accessControl");
            return string == null ? str : string;
        }

        public final String i(String str) {
            return str == null ? "" : str;
        }

        public final BiometricPrompt.d j(ReadableMap readableMap, boolean z10, boolean z11) {
            String string;
            String string2;
            String string3;
            String string4;
            Integer num = null;
            ReadableMap map = (readableMap == null || !readableMap.hasKey("authenticationPrompt")) ? null : readableMap.getMap("authenticationPrompt");
            BiometricPrompt.d.a aVar = new BiometricPrompt.d.a();
            if (map != null && (string4 = map.getString("title")) != null) {
                aVar.g(string4);
            }
            if (map != null && (string3 = map.getString("subtitle")) != null) {
                aVar.f(string3);
            }
            if (map != null && (string2 = map.getString("description")) != null) {
                aVar.d(string2);
            }
            if (z10 && z11) {
                num = 32783;
            } else if (z10) {
                num = 32768;
            }
            if (num != null) {
                aVar.b(num.intValue());
            }
            if (!z10 && map != null && (string = map.getString("cancel")) != null) {
                aVar.e(string);
            }
            aVar.c(false);
            BiometricPrompt.d a10 = aVar.a();
            Intrinsics.checkNotNullExpressionValue(a10, "build(...)");
            return a10;
        }

        public final com.oblador.keychain.e k(ReadableMap readableMap) {
            return l(readableMap, "ANY");
        }

        public final com.oblador.keychain.e l(ReadableMap readableMap, String str) {
            String string = (readableMap == null || !readableMap.hasKey("securityLevel")) ? null : readableMap.getString("securityLevel");
            if (string != null) {
                str = string;
            }
            return com.oblador.keychain.e.valueOf(str);
        }

        public final String m(ReadableMap readableMap) {
            return i((readableMap == null || !readableMap.hasKey("service")) ? null : readableMap.getString("service"));
        }

        public final String n(ReadableMap readableMap) {
            if (readableMap == null || !readableMap.hasKey("storage")) {
                return null;
            }
            return readableMap.getString("storage");
        }

        public final boolean o(String str) {
            return CollectionsKt.contains(SetsKt.setOf((Object[]) new String[]{"BiometryAny", "BiometryCurrentSet", "BiometryAnyOrDevicePasscode", "BiometryCurrentSetOrDevicePasscode"}), str);
        }

        public final boolean p(String str) {
            return CollectionsKt.contains(SetsKt.setOf((Object[]) new String[]{"DevicePasscode", "BiometryAnyOrDevicePasscode", "BiometryCurrentSetOrDevicePasscode"}), str);
        }

        public final void q(String str, String str2) {
            if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
                throw new C4052b("you passed empty or null username/password");
            }
        }

        public final void r(InterfaceC2910b storage, com.oblador.keychain.e level) {
            Intrinsics.checkNotNullParameter(storage, "storage");
            Intrinsics.checkNotNullParameter(level, "level");
            if (storage.g().c(level)) {
                return;
            }
            StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
            String format = String.format("Cipher Storage is too weak. Required security level is: %s, but only %s is provided", Arrays.copyOf(new Object[]{level.name(), storage.g().name()}, 2));
            Intrinsics.checkNotNullExpressionValue(format, "format(...)");
            throw new C4051a(format);
        }

        public Companion() {
        }
    }

    public static final class b extends ContinuationImpl {

        /* renamed from: n, reason: collision with root package name */
        public /* synthetic */ Object f39058n;

        /* renamed from: p, reason: collision with root package name */
        public int f39060p;

        public b(Continuation continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f39058n = obj;
            this.f39060p |= Integer.MIN_VALUE;
            return KeychainModule.this.decryptCredentials(null, null, null, null, this);
        }
    }

    public static final class c extends SuspendLambda implements Function2 {

        /* renamed from: n, reason: collision with root package name */
        public Object f39061n;

        /* renamed from: o, reason: collision with root package name */
        public Object f39062o;

        /* renamed from: p, reason: collision with root package name */
        public Object f39063p;

        /* renamed from: q, reason: collision with root package name */
        public Object f39064q;

        /* renamed from: r, reason: collision with root package name */
        public Object f39065r;

        /* renamed from: s, reason: collision with root package name */
        public int f39066s;

        /* renamed from: u, reason: collision with root package name */
        public final /* synthetic */ String f39068u;

        /* renamed from: v, reason: collision with root package name */
        public final /* synthetic */ Promise f39069v;

        /* renamed from: w, reason: collision with root package name */
        public final /* synthetic */ ReadableMap f39070w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(String str, Promise promise, ReadableMap readableMap, Continuation continuation) {
            super(2, continuation);
            this.f39068u = str;
            this.f39069v = promise;
            this.f39070w = readableMap;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return KeychainModule.this.new c(this.f39068u, this.f39069v, this.f39070w, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(P p10, Continuation continuation) {
            return ((c) create(p10, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Can't wrap try/catch for region: R(9:0|1|2|(1:(1:(12:6|7|8|9|10|11|(1:13)(1:26)|14|15|16|17|18)(2:45|46))(1:47))(3:80|(1:82)|71)|48|49|50|(3:52|53|54)(7:55|(1:73)(1:59)|60|(1:68)|69|(9:72|10|11|(0)(0)|14|15|16|17|18)|71)|(1:(0))) */
        /* JADX WARN: Code restructure failed: missing block: B:74:0x00b7, code lost:
        
            r0 = e;
         */
        /* JADX WARN: Code restructure failed: missing block: B:75:0x00b8, code lost:
        
            r1 = r9;
         */
        /* JADX WARN: Code restructure failed: missing block: B:76:0x00bc, code lost:
        
            r0 = e;
         */
        /* JADX WARN: Code restructure failed: missing block: B:77:0x00bd, code lost:
        
            r1 = r9;
         */
        /* JADX WARN: Code restructure failed: missing block: B:78:0x00b2, code lost:
        
            r0 = th;
         */
        /* JADX WARN: Code restructure failed: missing block: B:79:0x00b3, code lost:
        
            r1 = r9;
         */
        /* JADX WARN: Removed duplicated region for block: B:13:0x0139 A[Catch: all -> 0x013e, a -> 0x0141, c -> 0x0144, TryCatch #7 {a -> 0x0141, c -> 0x0144, all -> 0x013e, blocks: (B:11:0x0114, B:13:0x0139, B:14:0x0148), top: B:10:0x0114 }] */
        /* JADX WARN: Removed duplicated region for block: B:26:0x0147  */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            KeychainModule keychainModule;
            String str;
            Promise promise;
            Wh.a aVar;
            ReadableMap readableMap;
            Promise promise2;
            InterfaceC2910b cipherStorageByName;
            Object decryptCredentials;
            String str2;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i10 = this.f39066s;
            boolean z10 = true;
            try {
                if (i10 == 0) {
                    ResultKt.throwOnFailure(obj);
                    Wh.a aVar2 = KeychainModule.this.mutex;
                    keychainModule = KeychainModule.this;
                    str = this.f39068u;
                    promise = this.f39069v;
                    ReadableMap readableMap2 = this.f39070w;
                    this.f39061n = aVar2;
                    this.f39062o = keychainModule;
                    this.f39063p = str;
                    this.f39064q = promise;
                    this.f39065r = readableMap2;
                    this.f39066s = 1;
                    if (aVar2.f(null, this) != coroutine_suspended) {
                        aVar = aVar2;
                        readableMap = readableMap2;
                    }
                    return coroutine_suspended;
                }
                if (i10 != 1) {
                    if (i10 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    InterfaceC2910b interfaceC2910b = (InterfaceC2910b) this.f39064q;
                    promise2 = (Promise) this.f39063p;
                    String str3 = (String) this.f39062o;
                    Wh.a aVar3 = (Wh.a) this.f39061n;
                    try {
                        try {
                            ResultKt.throwOnFailure(obj);
                            aVar = aVar3;
                            str2 = str3;
                            cipherStorageByName = interfaceC2910b;
                            decryptCredentials = obj;
                            try {
                                InterfaceC2910b.C0446b c0446b = (InterfaceC2910b.C0446b) decryptCredentials;
                                WritableMap createMap = Arguments.createMap();
                                createMap.putString("service", str2);
                                createMap.putString("username", (String) c0446b.b());
                                createMap.putString("password", (String) c0446b.a());
                                createMap.putString("storage", cipherStorageByName == null ? cipherStorageByName.h() : null);
                                promise2.resolve(createMap);
                            } catch (C4051a e10) {
                                e = e10;
                                aVar3 = aVar;
                                String message = e.getMessage();
                                Intrinsics.checkNotNull(message);
                                Log.e(KeychainModule.KEYCHAIN_MODULE, message);
                                promise2.reject("E_CRYPTO_FAILED", e);
                                aVar = aVar3;
                                Unit unit = Unit.INSTANCE;
                                aVar.g(null);
                                return Unit.INSTANCE;
                            } catch (C4053c e11) {
                                e = e11;
                                aVar3 = aVar;
                                String message2 = e.getMessage();
                                Intrinsics.checkNotNull(message2);
                                Log.e(KeychainModule.KEYCHAIN_MODULE, message2);
                                promise2.reject("E_KEYSTORE_ACCESS_ERROR", e);
                                aVar = aVar3;
                                Unit unit2 = Unit.INSTANCE;
                                aVar.g(null);
                                return Unit.INSTANCE;
                            } catch (Throwable th2) {
                                th = th2;
                                aVar3 = aVar;
                                Log.e(KeychainModule.KEYCHAIN_MODULE, th.getMessage(), th);
                                promise2.reject("E_UNKNOWN_ERROR", th);
                                aVar = aVar3;
                                Unit unit22 = Unit.INSTANCE;
                                aVar.g(null);
                                return Unit.INSTANCE;
                            }
                        } catch (C4051a e12) {
                            e = e12;
                            String message3 = e.getMessage();
                            Intrinsics.checkNotNull(message3);
                            Log.e(KeychainModule.KEYCHAIN_MODULE, message3);
                            promise2.reject("E_CRYPTO_FAILED", e);
                            aVar = aVar3;
                            Unit unit222 = Unit.INSTANCE;
                            aVar.g(null);
                            return Unit.INSTANCE;
                        } catch (C4053c e13) {
                            e = e13;
                            String message22 = e.getMessage();
                            Intrinsics.checkNotNull(message22);
                            Log.e(KeychainModule.KEYCHAIN_MODULE, message22);
                            promise2.reject("E_KEYSTORE_ACCESS_ERROR", e);
                            aVar = aVar3;
                            Unit unit2222 = Unit.INSTANCE;
                            aVar.g(null);
                            return Unit.INSTANCE;
                        } catch (Throwable th3) {
                            th = th3;
                            Log.e(KeychainModule.KEYCHAIN_MODULE, th.getMessage(), th);
                            promise2.reject("E_UNKNOWN_ERROR", th);
                            aVar = aVar3;
                            Unit unit22222 = Unit.INSTANCE;
                            aVar.g(null);
                            return Unit.INSTANCE;
                        }
                        Unit unit222222 = Unit.INSTANCE;
                        aVar.g(null);
                        return Unit.INSTANCE;
                    } catch (Throwable th4) {
                        th = th4;
                        aVar3 = aVar;
                        aVar3.g(null);
                        throw th;
                    }
                }
                readableMap = (ReadableMap) this.f39065r;
                promise = (Promise) this.f39064q;
                str = (String) this.f39063p;
                keychainModule = (KeychainModule) this.f39062o;
                aVar = (Wh.a) this.f39061n;
                ResultKt.throwOnFailure(obj);
                KeychainModule keychainModule2 = keychainModule;
                Promise promise3 = promise;
                d.b a10 = keychainModule2.prefsStorage.a(str);
                boolean z11 = false;
                if (a10 == null) {
                    Log.e(KeychainModule.KEYCHAIN_MODULE, "No entry found for service: " + str);
                    promise3.resolve(Boxing.boxBoolean(false));
                    Unit unit3 = Unit.INSTANCE;
                    aVar.g(null);
                    return unit3;
                }
                String str4 = a10.f39122c;
                Companion companion = KeychainModule.INSTANCE;
                String g10 = companion.g(readableMap);
                if (!companion.p(g10) || !keychainModule2.isPasscodeAvailable()) {
                    z10 = false;
                }
                if (companion.o(g10) && (keychainModule2.isFingerprintAuthAvailable() || keychainModule2.isFaceAuthAvailable() || keychainModule2.isIrisAuthAvailable())) {
                    z11 = true;
                }
                BiometricPrompt.d j10 = companion.j(readableMap, z10, z11);
                cipherStorageByName = keychainModule2.getCipherStorageByName(str4);
                Intrinsics.checkNotNull(cipherStorageByName);
                this.f39061n = aVar;
                this.f39062o = str;
                this.f39063p = promise3;
                this.f39064q = cipherStorageByName;
                this.f39065r = null;
                this.f39066s = 2;
                String str5 = str;
                decryptCredentials = keychainModule2.decryptCredentials(str5, cipherStorageByName, a10, j10, this);
                if (decryptCredentials != coroutine_suspended) {
                    str2 = str5;
                    promise2 = promise3;
                    InterfaceC2910b.C0446b c0446b2 = (InterfaceC2910b.C0446b) decryptCredentials;
                    WritableMap createMap2 = Arguments.createMap();
                    createMap2.putString("service", str2);
                    createMap2.putString("username", (String) c0446b2.b());
                    createMap2.putString("password", (String) c0446b2.a());
                    createMap2.putString("storage", cipherStorageByName == null ? cipherStorageByName.h() : null);
                    promise2.resolve(createMap2);
                    Unit unit2222222 = Unit.INSTANCE;
                    aVar.g(null);
                    return Unit.INSTANCE;
                }
                return coroutine_suspended;
            } catch (Throwable th5) {
                th = th5;
            }
        }
    }

    public static final class d extends ContinuationImpl {

        /* renamed from: n, reason: collision with root package name */
        public Object f39071n;

        /* renamed from: o, reason: collision with root package name */
        public Object f39072o;

        /* renamed from: p, reason: collision with root package name */
        public /* synthetic */ Object f39073p;

        /* renamed from: r, reason: collision with root package name */
        public int f39075r;

        public d(Continuation continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f39073p = obj;
            this.f39075r |= Integer.MIN_VALUE;
            return KeychainModule.this.migrateCipherStorage(null, null, null, null, null, this);
        }
    }

    public static final class e extends SuspendLambda implements Function2 {

        /* renamed from: A, reason: collision with root package name */
        public final /* synthetic */ Promise f39076A;

        /* renamed from: n, reason: collision with root package name */
        public Object f39077n;

        /* renamed from: o, reason: collision with root package name */
        public Object f39078o;

        /* renamed from: p, reason: collision with root package name */
        public Object f39079p;

        /* renamed from: q, reason: collision with root package name */
        public Object f39080q;

        /* renamed from: r, reason: collision with root package name */
        public Object f39081r;

        /* renamed from: s, reason: collision with root package name */
        public Object f39082s;

        /* renamed from: t, reason: collision with root package name */
        public Object f39083t;

        /* renamed from: u, reason: collision with root package name */
        public int f39084u;

        /* renamed from: w, reason: collision with root package name */
        public final /* synthetic */ String f39086w;

        /* renamed from: x, reason: collision with root package name */
        public final /* synthetic */ String f39087x;

        /* renamed from: y, reason: collision with root package name */
        public final /* synthetic */ ReadableMap f39088y;

        /* renamed from: z, reason: collision with root package name */
        public final /* synthetic */ String f39089z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(String str, String str2, ReadableMap readableMap, String str3, Promise promise, Continuation continuation) {
            super(2, continuation);
            this.f39086w = str;
            this.f39087x = str2;
            this.f39088y = readableMap;
            this.f39089z = str3;
            this.f39076A = promise;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return KeychainModule.this.new e(this.f39086w, this.f39087x, this.f39088y, this.f39089z, this.f39076A, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(P p10, Continuation continuation) {
            return ((e) create(p10, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Can't wrap try/catch for region: R(13:0|1|2|(1:(1:(10:6|7|8|9|10|11|12|13|14|15)(2:38|39))(1:40))(3:69|(1:71)|58)|41|42|(1:62)(1:46)|47|(1:61)(1:55)|56|(7:59|10|11|12|13|14|15)|58|(1:(0))) */
        /* JADX WARN: Code restructure failed: missing block: B:63:0x00c7, code lost:
        
            r0 = e;
         */
        /* JADX WARN: Code restructure failed: missing block: B:64:0x00c8, code lost:
        
            r4 = r11;
            r1 = r12;
         */
        /* JADX WARN: Code restructure failed: missing block: B:65:0x00cc, code lost:
        
            r0 = e;
         */
        /* JADX WARN: Code restructure failed: missing block: B:66:0x00cd, code lost:
        
            r4 = r11;
            r1 = r12;
         */
        /* JADX WARN: Code restructure failed: missing block: B:67:0x00c2, code lost:
        
            r0 = th;
         */
        /* JADX WARN: Code restructure failed: missing block: B:68:0x00c3, code lost:
        
            r4 = r11;
            r1 = r12;
         */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            ReadableMap readableMap;
            String str;
            Promise promise;
            Wh.a aVar;
            KeychainModule keychainModule;
            String str2;
            String str3;
            Promise promise2;
            Object encryptToResult;
            KeychainModule keychainModule2;
            InterfaceC2910b interfaceC2910b;
            String str4;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i10 = this.f39084u;
            try {
                if (i10 == 0) {
                    ResultKt.throwOnFailure(obj);
                    Wh.a aVar2 = KeychainModule.this.mutex;
                    String str5 = this.f39086w;
                    String str6 = this.f39087x;
                    readableMap = this.f39088y;
                    KeychainModule keychainModule3 = KeychainModule.this;
                    str = this.f39089z;
                    promise = this.f39076A;
                    this.f39077n = aVar2;
                    this.f39078o = str5;
                    this.f39079p = str6;
                    this.f39080q = readableMap;
                    this.f39081r = keychainModule3;
                    this.f39082s = str;
                    this.f39083t = promise;
                    this.f39084u = 1;
                    if (aVar2.f(null, this) != coroutine_suspended) {
                        aVar = aVar2;
                        keychainModule = keychainModule3;
                        str2 = str6;
                        str3 = str5;
                    }
                    return coroutine_suspended;
                }
                if (i10 != 1) {
                    if (i10 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    interfaceC2910b = (InterfaceC2910b) this.f39081r;
                    promise2 = (Promise) this.f39080q;
                    str4 = (String) this.f39079p;
                    KeychainModule keychainModule4 = (KeychainModule) this.f39078o;
                    Wh.a aVar3 = (Wh.a) this.f39077n;
                    try {
                        try {
                            ResultKt.throwOnFailure(obj);
                            aVar = aVar3;
                            keychainModule2 = keychainModule4;
                            encryptToResult = obj;
                            try {
                                keychainModule2.prefsStorage.d(str4, (InterfaceC2910b.c) encryptToResult);
                                WritableMap createMap = Arguments.createMap();
                                createMap.putString("service", str4);
                                createMap.putString("storage", interfaceC2910b.h());
                                promise2.resolve(createMap);
                            } catch (C4051a e10) {
                                e = e10;
                                aVar3 = aVar;
                                Log.e(KeychainModule.KEYCHAIN_MODULE, e.getMessage(), e);
                                promise2.reject("E_CRYPTO_FAILED", e);
                                aVar = aVar3;
                                Unit unit = Unit.INSTANCE;
                                aVar.g(null);
                                return Unit.INSTANCE;
                            } catch (C4052b e11) {
                                e = e11;
                                aVar3 = aVar;
                                Log.e(KeychainModule.KEYCHAIN_MODULE, e.getMessage(), e);
                                promise2.reject("E_EMPTY_PARAMETERS", e);
                                aVar = aVar3;
                                Unit unit2 = Unit.INSTANCE;
                                aVar.g(null);
                                return Unit.INSTANCE;
                            } catch (Throwable th2) {
                                th = th2;
                                aVar3 = aVar;
                                Log.e(KeychainModule.KEYCHAIN_MODULE, th.getMessage(), th);
                                promise2.reject("E_UNKNOWN_ERROR", th);
                                aVar = aVar3;
                                Unit unit22 = Unit.INSTANCE;
                                aVar.g(null);
                                return Unit.INSTANCE;
                            }
                        } catch (C4051a e12) {
                            e = e12;
                            Log.e(KeychainModule.KEYCHAIN_MODULE, e.getMessage(), e);
                            promise2.reject("E_CRYPTO_FAILED", e);
                            aVar = aVar3;
                            Unit unit222 = Unit.INSTANCE;
                            aVar.g(null);
                            return Unit.INSTANCE;
                        } catch (C4052b e13) {
                            e = e13;
                            Log.e(KeychainModule.KEYCHAIN_MODULE, e.getMessage(), e);
                            promise2.reject("E_EMPTY_PARAMETERS", e);
                            aVar = aVar3;
                            Unit unit2222 = Unit.INSTANCE;
                            aVar.g(null);
                            return Unit.INSTANCE;
                        } catch (Throwable th3) {
                            th = th3;
                            Log.e(KeychainModule.KEYCHAIN_MODULE, th.getMessage(), th);
                            promise2.reject("E_UNKNOWN_ERROR", th);
                            aVar = aVar3;
                            Unit unit22222 = Unit.INSTANCE;
                            aVar.g(null);
                            return Unit.INSTANCE;
                        }
                        Unit unit222222 = Unit.INSTANCE;
                        aVar.g(null);
                        return Unit.INSTANCE;
                    } catch (Throwable th4) {
                        th = th4;
                        aVar3 = aVar;
                        aVar3.g(null);
                        throw th;
                    }
                }
                Promise promise3 = (Promise) this.f39083t;
                str = (String) this.f39082s;
                KeychainModule keychainModule5 = (KeychainModule) this.f39081r;
                readableMap = (ReadableMap) this.f39080q;
                String str7 = (String) this.f39079p;
                String str8 = (String) this.f39078o;
                Wh.a aVar4 = (Wh.a) this.f39077n;
                ResultKt.throwOnFailure(obj);
                promise = promise3;
                keychainModule = keychainModule5;
                str2 = str7;
                str3 = str8;
                aVar = aVar4;
                Companion companion = KeychainModule.INSTANCE;
                companion.q(str3, str2);
                com.oblador.keychain.e k10 = companion.k(readableMap);
                InterfaceC2910b selectedStorage = keychainModule.getSelectedStorage(readableMap);
                companion.r(selectedStorage, k10);
                String g10 = companion.g(readableMap);
                BiometricPrompt.d j10 = companion.j(readableMap, companion.p(g10) && keychainModule.isPasscodeAvailable(), companion.o(g10) && (keychainModule.isFingerprintAuthAvailable() || keychainModule.isFaceAuthAvailable() || keychainModule.isIrisAuthAvailable()));
                this.f39077n = aVar;
                this.f39078o = keychainModule;
                this.f39079p = str;
                this.f39080q = promise;
                this.f39081r = selectedStorage;
                this.f39082s = null;
                this.f39083t = null;
                this.f39084u = 2;
                String str9 = str;
                encryptToResult = keychainModule.encryptToResult(str9, selectedStorage, str3, str2, k10, j10, this);
                if (encryptToResult != coroutine_suspended) {
                    keychainModule2 = keychainModule;
                    interfaceC2910b = selectedStorage;
                    str4 = str9;
                    promise2 = promise;
                    keychainModule2.prefsStorage.d(str4, (InterfaceC2910b.c) encryptToResult);
                    WritableMap createMap2 = Arguments.createMap();
                    createMap2.putString("service", str4);
                    createMap2.putString("storage", interfaceC2910b.h());
                    promise2.resolve(createMap2);
                    Unit unit2222222 = Unit.INSTANCE;
                    aVar.g(null);
                    return Unit.INSTANCE;
                }
                return coroutine_suspended;
            } catch (Throwable th5) {
                th = th5;
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public KeychainModule(@NotNull ReactApplicationContext reactContext) {
        super(reactContext);
        Intrinsics.checkNotNullParameter(reactContext, "reactContext");
        this.cipherStorageMap = new HashMap();
        P a10 = Q.a(C1452g0.a().plus(X0.b(null, 1, null)));
        this.coroutineScope = a10;
        this.mutex = g.b(false, 1, null);
        this.prefsStorage = new a(reactContext, a10);
        addCipherStorageToMap(new cc.g(reactContext));
        addCipherStorageToMap(new j(reactContext, false));
        addCipherStorageToMap(new j(reactContext, true));
        addCipherStorageToMap(new m(reactContext));
    }

    private final void addCipherStorageToMap(InterfaceC2910b cipherStorage) {
        this.cipherStorageMap.put(cipherStorage.h(), cipherStorage);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x006a, code lost:
    
        if (r12 == r0) goto L28;
     */
    /* JADX WARN: Removed duplicated region for block: B:19:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0026  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object decryptCredentials(String str, InterfaceC2910b interfaceC2910b, d.b bVar, BiometricPrompt.d dVar, Continuation<? super InterfaceC2910b.C0446b> continuation) {
        b bVar2;
        int i10;
        if (continuation instanceof b) {
            bVar2 = (b) continuation;
            int i11 = bVar2.f39060p;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                bVar2.f39060p = i11 - Integer.MIN_VALUE;
                b bVar3 = bVar2;
                Object obj = bVar3.f39058n;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i10 = bVar3.f39060p;
                if (i10 != 0) {
                    ResultKt.throwOnFailure(obj);
                    String str2 = bVar.f39122c;
                    if (Intrinsics.areEqual(str2, interfaceC2910b.h())) {
                        bVar3.f39060p = 1;
                        Object decryptToResult = decryptToResult(str, interfaceC2910b, bVar, dVar, bVar3);
                        if (decryptToResult != coroutine_suspended) {
                            return decryptToResult;
                        }
                    } else {
                        InterfaceC2910b cipherStorageByName = getCipherStorageByName(str2);
                        if (cipherStorageByName == null) {
                            throw new C4053c("Wrong cipher storage name '" + str2 + "' or cipher not available");
                        }
                        bVar3.f39060p = 2;
                        obj = decryptToResult(str, cipherStorageByName, bVar, dVar, bVar3);
                    }
                    return coroutine_suspended;
                }
                if (i10 == 1) {
                    ResultKt.throwOnFailure(obj);
                    return obj;
                }
                if (i10 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                return (InterfaceC2910b.C0446b) obj;
            }
        }
        bVar2 = new b(continuation);
        b bVar32 = bVar2;
        Object obj2 = bVar32.f39058n;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i10 = bVar32.f39060p;
        if (i10 != 0) {
        }
        return (InterfaceC2910b.C0446b) obj2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object decryptToResult(String str, InterfaceC2910b interfaceC2910b, d.b bVar, BiometricPrompt.d dVar, Continuation<? super InterfaceC2910b.C0446b> continuation) {
        ec.c interactiveHandler = getInteractiveHandler(interfaceC2910b, dVar);
        Object b10 = bVar.b();
        Intrinsics.checkNotNull(b10);
        Object a10 = bVar.a();
        Intrinsics.checkNotNull(a10);
        interfaceC2910b.b(interactiveHandler, str, (byte[]) b10, (byte[]) a10, com.oblador.keychain.e.f39123a);
        C4051a.f45168a.a(interactiveHandler.getError());
        if (interactiveHandler.b() == null) {
            throw new C4051a("No decryption results and no error. Something deeply wrong!");
        }
        InterfaceC2910b.C0446b b11 = interactiveHandler.b();
        Intrinsics.checkNotNull(b11);
        return b11;
    }

    private final Collection<String> doGetAllGenericPasswordServices() {
        Set<String> b10 = this.prefsStorage.b();
        ArrayList<InterfaceC2910b> arrayList = new ArrayList(b10.size());
        for (String str : b10) {
            Intrinsics.checkNotNull(str);
            arrayList.add(getCipherStorageByName(str));
        }
        HashSet hashSet = new HashSet();
        for (InterfaceC2910b interfaceC2910b : arrayList) {
            Intrinsics.checkNotNull(interfaceC2910b);
            Iterator it = interfaceC2910b.a().iterator();
            while (it.hasNext()) {
                hashSet.add((String) it.next());
            }
        }
        return hashSet;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object encryptToResult(String str, InterfaceC2910b interfaceC2910b, String str2, String str3, com.oblador.keychain.e eVar, BiometricPrompt.d dVar, Continuation<? super InterfaceC2910b.c> continuation) {
        ec.c interactiveHandler = getInteractiveHandler(interfaceC2910b, dVar);
        interfaceC2910b.i(interactiveHandler, str, str2, str3, eVar);
        C4051a.f45168a.a(interactiveHandler.getError());
        if (interactiveHandler.d() == null) {
            throw new C4051a("No decryption results and no error. Something deeply wrong!");
        }
        InterfaceC2910b.c d10 = interactiveHandler.d();
        Intrinsics.checkNotNull(d10);
        return d10;
    }

    private final void getGenericPassword(String alias, ReadableMap options, Promise promise) {
        AbstractC1459k.d(this.coroutineScope, null, null, new c(alias, promise, options, null), 3, null);
    }

    private final ec.c getInteractiveHandler(InterfaceC2910b current, BiometricPrompt.d promptInfo) {
        ReactApplicationContext reactApplicationContext = getReactApplicationContext();
        Intrinsics.checkNotNullExpressionValue(reactApplicationContext, "getReactApplicationContext(...)");
        return ec.j.f45929a.a(reactApplicationContext, current, promptInfo);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final InterfaceC2910b getSelectedStorage(ReadableMap options) {
        Companion companion = INSTANCE;
        String g10 = companion.g(options);
        boolean o10 = companion.o(g10);
        boolean p10 = companion.p(g10);
        String n10 = companion.n(options);
        InterfaceC2910b cipherStorageByName = n10 != null ? getCipherStorageByName(n10) : null;
        return cipherStorageByName == null ? getCipherStorageForCurrentAPILevel(o10, p10) : cipherStorageByName;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:16:0x003d  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object migrateCipherStorage(String str, InterfaceC2910b interfaceC2910b, InterfaceC2910b interfaceC2910b2, InterfaceC2910b.C0446b c0446b, BiometricPrompt.d dVar, Continuation<? super Unit> continuation) {
        d dVar2;
        int i10;
        KeychainModule keychainModule;
        String str2;
        if (continuation instanceof d) {
            dVar2 = (d) continuation;
            int i11 = dVar2.f39075r;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                dVar2.f39075r = i11 - Integer.MIN_VALUE;
                d dVar3 = dVar2;
                Object obj = dVar3.f39073p;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i10 = dVar3.f39075r;
                if (i10 != 0) {
                    ResultKt.throwOnFailure(obj);
                    String str3 = (String) c0446b.b();
                    if (str3 == null) {
                        throw new IllegalArgumentException("Username cannot be null");
                    }
                    String str4 = (String) c0446b.a();
                    if (str4 == null) {
                        throw new IllegalArgumentException("Password cannot be null");
                    }
                    com.oblador.keychain.e c10 = c0446b.c();
                    dVar3.f39071n = str;
                    dVar3.f39072o = interfaceC2910b2;
                    dVar3.f39075r = 1;
                    keychainModule = this;
                    obj = keychainModule.encryptToResult(str, interfaceC2910b, str3, str4, c10, dVar, dVar3);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    str2 = str;
                } else {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    interfaceC2910b2 = (InterfaceC2910b) dVar3.f39072o;
                    str2 = (String) dVar3.f39071n;
                    ResultKt.throwOnFailure(obj);
                    keychainModule = this;
                }
                keychainModule.prefsStorage.d(str2, (InterfaceC2910b.c) obj);
                interfaceC2910b2.f(str2);
                return Unit.INSTANCE;
            }
        }
        dVar2 = new d(continuation);
        d dVar32 = dVar2;
        Object obj2 = dVar32.f39073p;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i10 = dVar32.f39075r;
        if (i10 != 0) {
        }
        keychainModule.prefsStorage.d(str2, (InterfaceC2910b.c) obj2);
        interfaceC2910b2.f(str2);
        return Unit.INSTANCE;
    }

    private final void resetGenericPassword(String alias, Promise promise) {
        InterfaceC2910b cipherStorageByName;
        try {
            d.b a10 = this.prefsStorage.a(alias);
            if (a10 != null && (cipherStorageByName = getCipherStorageByName(a10.f39122c)) != null) {
                cipherStorageByName.f(alias);
            }
            this.prefsStorage.c(alias);
            promise.resolve(Boolean.TRUE);
        } catch (C4053c e10) {
            String message = e10.getMessage();
            Intrinsics.checkNotNull(message);
            Log.e(KEYCHAIN_MODULE, message);
            promise.reject("E_KEYSTORE_ACCESS_ERROR", e10);
        } catch (Throwable th2) {
            Log.e(KEYCHAIN_MODULE, th2.getMessage(), th2);
            promise.reject("E_UNKNOWN_ERROR", th2);
        }
    }

    private final void setGenericPassword(String alias, String username, String password, ReadableMap options, Promise promise) {
        AbstractC1459k.d(this.coroutineScope, null, null, new e(username, password, options, alias, promise, null), 3, null);
    }

    @ReactMethod
    public final void getAllGenericPasswordServices(@Nullable ReadableMap options, @NotNull Promise promise) {
        Intrinsics.checkNotNullParameter(promise, "promise");
        try {
            promise.resolve(Arguments.makeNativeArray(doGetAllGenericPasswordServices().toArray(new String[0])));
        } catch (C4053c e10) {
            promise.reject("E_KEYSTORE_ACCESS_ERROR", e10);
        }
    }

    @Nullable
    public final InterfaceC2910b getCipherStorageByName(@NotNull String knownName) {
        Intrinsics.checkNotNullParameter(knownName, "knownName");
        return this.cipherStorageMap.get(knownName);
    }

    @NotNull
    public final InterfaceC2910b getCipherStorageForCurrentAPILevel(boolean useBiometry, boolean usePasscode) {
        int i10 = Build.VERSION.SDK_INT;
        boolean z10 = false;
        boolean z11 = useBiometry && (isFingerprintAuthAvailable() || isFaceAuthAvailable() || isIrisAuthAvailable());
        if (usePasscode && isPasscodeAvailable()) {
            z10 = true;
        }
        InterfaceC2910b interfaceC2910b = null;
        for (InterfaceC2910b interfaceC2910b2 : this.cipherStorageMap.values()) {
            interfaceC2910b2.h();
            int d10 = interfaceC2910b2.d();
            int c10 = interfaceC2910b2.c();
            if (d10 <= i10 && (interfaceC2910b == null || c10 >= interfaceC2910b.c())) {
                if (!interfaceC2910b2.e() || z11 || z10) {
                    interfaceC2910b = interfaceC2910b2;
                }
            }
        }
        if (interfaceC2910b != null) {
            interfaceC2910b.h();
            return interfaceC2910b;
        }
        throw new C4051a("Unsupported Android SDK " + Build.VERSION.SDK_INT);
    }

    @Override // com.facebook.react.bridge.BaseJavaModule
    @NotNull
    public Map<String, Object> getConstants() {
        HashMap hashMap = new HashMap();
        hashMap.put(com.oblador.keychain.e.f39123a.b(), "ANY");
        hashMap.put(com.oblador.keychain.e.f39124b.b(), "SECURE_SOFTWARE");
        hashMap.put(com.oblador.keychain.e.f39125c.b(), "SECURE_HARDWARE");
        return hashMap;
    }

    @ReactMethod
    public final void getGenericPasswordForOptions(@Nullable ReadableMap options, @NotNull Promise promise) {
        Intrinsics.checkNotNullParameter(promise, "promise");
        getGenericPassword(INSTANCE.m(options), options, promise);
    }

    @ReactMethod
    public final void getInternetCredentialsForServer(@NotNull String server, @Nullable ReadableMap options, @NotNull Promise promise) {
        Intrinsics.checkNotNullParameter(server, "server");
        Intrinsics.checkNotNullParameter(promise, "promise");
        getGenericPassword(server, options, promise);
    }

    @Override // com.facebook.react.bridge.NativeModule
    @NotNull
    public String getName() {
        return KEYCHAIN_MODULE;
    }

    @ReactMethod
    public final void getSecurityLevel(@Nullable ReadableMap options, @NotNull Promise promise) {
        Intrinsics.checkNotNullParameter(promise, "promise");
        Companion companion = INSTANCE;
        String g10 = companion.g(options);
        promise.resolve(getSecurityLevel(companion.o(g10), companion.p(g10)).name());
    }

    @ReactMethod
    public final void getSupportedBiometryType(@NotNull Promise promise) {
        Intrinsics.checkNotNullParameter(promise, "promise");
        try {
            com.oblador.keychain.b bVar = com.oblador.keychain.b.f39119a;
            ReactApplicationContext reactApplicationContext = getReactApplicationContext();
            Intrinsics.checkNotNullExpressionValue(reactApplicationContext, "getReactApplicationContext(...)");
            boolean f10 = bVar.f(reactApplicationContext);
            String str = null;
            if (f10) {
                if (isFingerprintAuthAvailable()) {
                    str = FINGERPRINT_SUPPORTED_NAME;
                } else if (isFaceAuthAvailable()) {
                    str = FACE_SUPPORTED_NAME;
                } else if (isIrisAuthAvailable()) {
                    str = IRIS_SUPPORTED_NAME;
                }
            }
            promise.resolve(str);
        } catch (Exception e10) {
            Log.e(KEYCHAIN_MODULE, e10.getMessage(), e10);
            promise.reject("E_SUPPORTED_BIOMETRY_ERROR", e10);
        } catch (Throwable th2) {
            Log.e(KEYCHAIN_MODULE, th2.getMessage(), th2);
            promise.reject("E_UNKNOWN_ERROR", th2);
        }
    }

    @ReactMethod
    public final void hasGenericPasswordForOptions(@Nullable ReadableMap options, @NotNull Promise promise) {
        Intrinsics.checkNotNullParameter(promise, "promise");
        String m10 = INSTANCE.m(options);
        if (this.prefsStorage.a(m10) != null) {
            promise.resolve(Boolean.TRUE);
            return;
        }
        Log.e(KEYCHAIN_MODULE, "No entry found for service: " + m10);
        promise.resolve(Boolean.FALSE);
    }

    @ReactMethod
    public final void hasInternetCredentialsForOptions(@NotNull ReadableMap options, @NotNull Promise promise) {
        Intrinsics.checkNotNullParameter(options, "options");
        Intrinsics.checkNotNullParameter(promise, "promise");
        String i10 = INSTANCE.i(options.getString("server"));
        if (this.prefsStorage.a(i10) != null) {
            promise.resolve(Boolean.TRUE);
            return;
        }
        Log.e(KEYCHAIN_MODULE, "No entry found for service: " + i10);
        promise.resolve(Boolean.FALSE);
    }

    @Override // com.facebook.react.bridge.BaseJavaModule, com.facebook.react.bridge.NativeModule
    public void invalidate() {
        super.invalidate();
        if (Q.i(this.coroutineScope)) {
            Q.e(this.coroutineScope, "RNKeychainManager has been destroyed.", null, 2, null);
        }
        C2909a.f27699a.a();
    }

    public final boolean isFaceAuthAvailable() {
        com.oblador.keychain.b bVar = com.oblador.keychain.b.f39119a;
        ReactApplicationContext reactApplicationContext = getReactApplicationContext();
        Intrinsics.checkNotNullExpressionValue(reactApplicationContext, "getReactApplicationContext(...)");
        if (!bVar.f(reactApplicationContext)) {
            return false;
        }
        ReactApplicationContext reactApplicationContext2 = getReactApplicationContext();
        Intrinsics.checkNotNullExpressionValue(reactApplicationContext2, "getReactApplicationContext(...)");
        return bVar.b(reactApplicationContext2);
    }

    public final boolean isFingerprintAuthAvailable() {
        com.oblador.keychain.b bVar = com.oblador.keychain.b.f39119a;
        ReactApplicationContext reactApplicationContext = getReactApplicationContext();
        Intrinsics.checkNotNullExpressionValue(reactApplicationContext, "getReactApplicationContext(...)");
        if (!bVar.f(reactApplicationContext)) {
            return false;
        }
        ReactApplicationContext reactApplicationContext2 = getReactApplicationContext();
        Intrinsics.checkNotNullExpressionValue(reactApplicationContext2, "getReactApplicationContext(...)");
        return bVar.c(reactApplicationContext2);
    }

    public final boolean isIrisAuthAvailable() {
        com.oblador.keychain.b bVar = com.oblador.keychain.b.f39119a;
        ReactApplicationContext reactApplicationContext = getReactApplicationContext();
        Intrinsics.checkNotNullExpressionValue(reactApplicationContext, "getReactApplicationContext(...)");
        if (!bVar.f(reactApplicationContext)) {
            return false;
        }
        ReactApplicationContext reactApplicationContext2 = getReactApplicationContext();
        Intrinsics.checkNotNullExpressionValue(reactApplicationContext2, "getReactApplicationContext(...)");
        return bVar.d(reactApplicationContext2);
    }

    @ReactMethod
    public final void isPasscodeAuthAvailable(@NotNull Promise promise) {
        Intrinsics.checkNotNullParameter(promise, "promise");
        try {
            com.oblador.keychain.b bVar = com.oblador.keychain.b.f39119a;
            ReactApplicationContext reactApplicationContext = getReactApplicationContext();
            Intrinsics.checkNotNullExpressionValue(reactApplicationContext, "getReactApplicationContext(...)");
            promise.resolve(Boolean.valueOf(bVar.a(reactApplicationContext)));
        } catch (Throwable th2) {
            Log.e(KEYCHAIN_MODULE, th2.getMessage(), th2);
            promise.reject("E_UNKNOWN_ERROR", th2);
        }
    }

    public final boolean isPasscodeAvailable() {
        com.oblador.keychain.b bVar = com.oblador.keychain.b.f39119a;
        ReactApplicationContext reactApplicationContext = getReactApplicationContext();
        Intrinsics.checkNotNullExpressionValue(reactApplicationContext, "getReactApplicationContext(...)");
        return bVar.a(reactApplicationContext);
    }

    public final boolean isSecureHardwareAvailable() {
        com.oblador.keychain.b bVar = com.oblador.keychain.b.f39119a;
        ReactApplicationContext reactApplicationContext = getReactApplicationContext();
        Intrinsics.checkNotNullExpressionValue(reactApplicationContext, "getReactApplicationContext(...)");
        return bVar.g(reactApplicationContext);
    }

    @ReactMethod
    public final void resetGenericPasswordForOptions(@Nullable ReadableMap options, @NotNull Promise promise) {
        Intrinsics.checkNotNullParameter(promise, "promise");
        resetGenericPassword(INSTANCE.m(options), promise);
    }

    @ReactMethod
    public final void resetInternetCredentialsForOptions(@NotNull ReadableMap options, @NotNull Promise promise) {
        Intrinsics.checkNotNullParameter(options, "options");
        Intrinsics.checkNotNullParameter(promise, "promise");
        resetGenericPassword(INSTANCE.i(options.getString("server")), promise);
    }

    @ReactMethod
    public final void setGenericPasswordForOptions(@Nullable ReadableMap options, @NotNull String username, @NotNull String password, @NotNull Promise promise) {
        Intrinsics.checkNotNullParameter(username, "username");
        Intrinsics.checkNotNullParameter(password, "password");
        Intrinsics.checkNotNullParameter(promise, "promise");
        setGenericPassword(INSTANCE.m(options), username, password, options, promise);
    }

    @ReactMethod
    public final void setInternetCredentialsForServer(@NotNull String server, @NotNull String username, @NotNull String password, @Nullable ReadableMap options, @NotNull Promise promise) {
        Intrinsics.checkNotNullParameter(server, "server");
        Intrinsics.checkNotNullParameter(username, "username");
        Intrinsics.checkNotNullParameter(password, "password");
        Intrinsics.checkNotNullParameter(promise, "promise");
        setGenericPassword(server, username, password, options, promise);
    }

    private final com.oblador.keychain.e getSecurityLevel(boolean useBiometry, boolean usePasscode) {
        try {
            com.oblador.keychain.e g10 = getCipherStorageForCurrentAPILevel(useBiometry, usePasscode).g();
            com.oblador.keychain.e eVar = com.oblador.keychain.e.f39124b;
            if (g10.c(eVar)) {
                return isSecureHardwareAvailable() ? com.oblador.keychain.e.f39125c : eVar;
            }
            return com.oblador.keychain.e.f39123a;
        } catch (C4051a e10) {
            Log.w(KEYCHAIN_MODULE, "Security Level Exception: " + e10.getMessage(), e10);
            return com.oblador.keychain.e.f39123a;
        }
    }
}
