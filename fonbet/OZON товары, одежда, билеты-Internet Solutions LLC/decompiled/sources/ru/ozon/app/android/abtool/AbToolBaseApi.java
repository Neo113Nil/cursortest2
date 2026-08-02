package ru.ozon.app.android.abtool;

import Ae.B0;
import Ld0.e;
import Sc.InterfaceC3999a;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0003\u0010\u0004J+\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00052\b\b\u0002\u0010\t\u001a\u00020\bH&¢\u0006\u0004\b\u000b\u0010\fJ+\u0010\r\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00052\b\b\u0002\u0010\t\u001a\u00020\bH&¢\u0006\u0004\b\r\u0010\u000eJ+\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00052\b\b\u0002\u0010\t\u001a\u00020\bH&¢\u0006\u0004\b\u0010\u0010\u0011J+\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00052\b\b\u0002\u0010\t\u001a\u00020\bH&¢\u0006\u0004\b\u0013\u0010\u0014J+\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00052\b\b\u0002\u0010\t\u001a\u00020\bH&¢\u0006\u0004\b\u0016\u0010\u0017J'\u0010\u001a\u001a\u00020\u00022\b\b\u0002\u0010\t\u001a\u00020\b2\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00020\u0018H'¢\u0006\u0004\b\u001a\u0010\u001bJ\u001f\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u001d0\u001c2\b\b\u0002\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\u001e\u0010\u001fJ'\u0010 \u001a\u00020\u00022\b\b\u0002\u0010\t\u001a\u00020\b2\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00020\u0018H&¢\u0006\u0004\b \u0010\u001b¨\u0006!"}, d2 = {"Lru/ozon/app/android/abtool/AbToolBaseApi;", "LLd0/e;", "", "fetch", "()V", "", "featureName", "serviceName", "Lru/ozon/app/android/abtool/AbToolNamespace;", "namespace", "", "getBoolean", "(Ljava/lang/String;Ljava/lang/String;Lru/ozon/app/android/abtool/AbToolNamespace;)Z", "getString", "(Ljava/lang/String;Ljava/lang/String;Lru/ozon/app/android/abtool/AbToolNamespace;)Ljava/lang/String;", "", "getInt", "(Ljava/lang/String;Ljava/lang/String;Lru/ozon/app/android/abtool/AbToolNamespace;)I", "", "getLong", "(Ljava/lang/String;Ljava/lang/String;Lru/ozon/app/android/abtool/AbToolNamespace;)J", "", "getFloat", "(Ljava/lang/String;Ljava/lang/String;Lru/ozon/app/android/abtool/AbToolNamespace;)F", "Lkotlin/Function0;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "addOnChangeFeaturesListener", "(Lru/ozon/app/android/abtool/AbToolNamespace;Lkotlin/jvm/functions/Function0;)V", "LAe/B0;", "Lru/ozon/app/android/abtool/FetchStatus;", "getRemoteFetchingStatus", "(Lru/ozon/app/android/abtool/AbToolNamespace;)LAe/B0;", "removeOnChangeFeaturesListener", "abzone-api_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public interface AbToolBaseApi extends e {

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final class DefaultImpls {
        public static /* synthetic */ void addOnChangeFeaturesListener$default(AbToolBaseApi abToolBaseApi, AbToolNamespace abToolNamespace, Function0 function0, int i11, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: addOnChangeFeaturesListener");
            }
            if ((i11 & 1) != 0) {
                abToolNamespace = AbToolNamespace.DEFAULT;
            }
            abToolBaseApi.addOnChangeFeaturesListener(abToolNamespace, function0);
        }

        public static /* synthetic */ boolean getBoolean$default(AbToolBaseApi abToolBaseApi, String str, String str2, AbToolNamespace abToolNamespace, int i11, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getBoolean");
            }
            if ((i11 & 2) != 0) {
                str2 = "";
            }
            if ((i11 & 4) != 0) {
                abToolNamespace = AbToolNamespace.DEFAULT;
            }
            return abToolBaseApi.getBoolean(str, str2, abToolNamespace);
        }

        public static /* synthetic */ float getFloat$default(AbToolBaseApi abToolBaseApi, String str, String str2, AbToolNamespace abToolNamespace, int i11, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getFloat");
            }
            if ((i11 & 2) != 0) {
                str2 = "";
            }
            if ((i11 & 4) != 0) {
                abToolNamespace = AbToolNamespace.DEFAULT;
            }
            return abToolBaseApi.getFloat(str, str2, abToolNamespace);
        }

        public static /* synthetic */ int getInt$default(AbToolBaseApi abToolBaseApi, String str, String str2, AbToolNamespace abToolNamespace, int i11, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getInt");
            }
            if ((i11 & 2) != 0) {
                str2 = "";
            }
            if ((i11 & 4) != 0) {
                abToolNamespace = AbToolNamespace.DEFAULT;
            }
            return abToolBaseApi.getInt(str, str2, abToolNamespace);
        }

        public static /* synthetic */ long getLong$default(AbToolBaseApi abToolBaseApi, String str, String str2, AbToolNamespace abToolNamespace, int i11, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getLong");
            }
            if ((i11 & 2) != 0) {
                str2 = "";
            }
            if ((i11 & 4) != 0) {
                abToolNamespace = AbToolNamespace.DEFAULT;
            }
            return abToolBaseApi.getLong(str, str2, abToolNamespace);
        }

        public static /* synthetic */ String getString$default(AbToolBaseApi abToolBaseApi, String str, String str2, AbToolNamespace abToolNamespace, int i11, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getString");
            }
            if ((i11 & 2) != 0) {
                str2 = "";
            }
            if ((i11 & 4) != 0) {
                abToolNamespace = AbToolNamespace.DEFAULT;
            }
            return abToolBaseApi.getString(str, str2, abToolNamespace);
        }

        public static /* synthetic */ void removeOnChangeFeaturesListener$default(AbToolBaseApi abToolBaseApi, AbToolNamespace abToolNamespace, Function0 function0, int i11, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: removeOnChangeFeaturesListener");
            }
            if ((i11 & 1) != 0) {
                abToolNamespace = AbToolNamespace.DEFAULT;
            }
            abToolBaseApi.removeOnChangeFeaturesListener(abToolNamespace, function0);
        }
    }

    @InterfaceC3999a
    void addOnChangeFeaturesListener(@NotNull AbToolNamespace namespace, @NotNull Function0<Unit> listener);

    void fetch();

    boolean getBoolean(@NotNull String featureName, @NotNull String serviceName, @NotNull AbToolNamespace namespace);

    float getFloat(@NotNull String featureName, @NotNull String serviceName, @NotNull AbToolNamespace namespace);

    int getInt(@NotNull String featureName, @NotNull String serviceName, @NotNull AbToolNamespace namespace);

    long getLong(@NotNull String featureName, @NotNull String serviceName, @NotNull AbToolNamespace namespace);

    @NotNull
    B0<FetchStatus> getRemoteFetchingStatus(@NotNull AbToolNamespace namespace);

    @NotNull
    String getString(@NotNull String featureName, @NotNull String serviceName, @NotNull AbToolNamespace namespace);

    void removeOnChangeFeaturesListener(@NotNull AbToolNamespace namespace, @NotNull Function0<Unit> listener);
}
