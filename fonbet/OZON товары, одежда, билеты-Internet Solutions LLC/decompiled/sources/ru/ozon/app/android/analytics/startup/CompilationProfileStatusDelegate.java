package ru.ozon.app.android.analytics.startup;

import Sc.s;
import Wc.a;
import androidx.recyclerview.widget.LinearLayoutManager;
import kotlin.Metadata;
import kotlin.coroutines.d;
import org.jetbrains.annotations.NotNull;
import xe.f1;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0000\u0018\u0000 \u00072\u00020\u0001:\u0001\u0007B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0086@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\b"}, d2 = {"Lru/ozon/app/android/analytics/startup/CompilationProfileStatusDelegate;", "", "<init>", "()V", "", "getStatus", "(Lkotlin/coroutines/d;)Ljava/lang/Object;", "Companion", "analytics_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class CompilationProfileStatusDelegate {
    /* JADX WARN: Removed duplicated region for block: B:28:0x00b2 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00af A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0093 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0077 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:51:0x005d A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object getStatus(@NotNull d<? super String> dVar) {
        CompilationProfileStatusDelegate$getStatus$1 compilationProfileStatusDelegate$getStatus$1;
        int i11;
        Integer num;
        try {
            if (dVar instanceof CompilationProfileStatusDelegate$getStatus$1) {
                compilationProfileStatusDelegate$getStatus$1 = (CompilationProfileStatusDelegate$getStatus$1) dVar;
                int i12 = compilationProfileStatusDelegate$getStatus$1.label;
                if ((i12 & LinearLayoutManager.INVALID_OFFSET) != 0) {
                    compilationProfileStatusDelegate$getStatus$1.label = i12 - LinearLayoutManager.INVALID_OFFSET;
                    Object obj = compilationProfileStatusDelegate$getStatus$1.result;
                    a aVar = a.COROUTINE_SUSPENDED;
                    i11 = compilationProfileStatusDelegate$getStatus$1.label;
                    if (i11 != 0) {
                        s.b(obj);
                        CompilationProfileStatusDelegate$getStatus$status$1 compilationProfileStatusDelegate$getStatus$status$1 = new CompilationProfileStatusDelegate$getStatus$status$1(null);
                        compilationProfileStatusDelegate$getStatus$1.label = 1;
                        obj = f1.c(3000L, compilationProfileStatusDelegate$getStatus$status$1, compilationProfileStatusDelegate$getStatus$1);
                        if (obj == aVar) {
                            return aVar;
                        }
                    } else {
                        if (i11 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        s.b(obj);
                    }
                    num = (Integer) obj;
                    if (num != null && num.intValue() == 0) {
                        return "RESULT_CODE_NO_PROFILE";
                    }
                    if (num.intValue() == 1) {
                        return "RESULT_CODE_COMPILED_WITH_PROFILE";
                    }
                    if (num != null && num.intValue() == 2) {
                        return "RESULT_CODE_PROFILE_ENQUEUED_FOR_COMPILATION";
                    }
                    if (num.intValue() == 3) {
                        return "RESULT_CODE_COMPILED_WITH_PROFILE_NON_MATCHING";
                    }
                    if (num != null && num.intValue() == 65536) {
                        return "RESULT_CODE_ERROR_PACKAGE_NAME_DOES_NOT_EXIST";
                    }
                    if (num.intValue() == 131072) {
                        return "RESULT_CODE_ERROR_CACHE_FILE_EXISTS_BUT_CANNOT_BE_READ";
                    }
                    if (num != null && num.intValue() == 196608) {
                        return "RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE";
                    }
                    if (num.intValue() != 262144) {
                        return "RESULT_CODE_ERROR_UNSUPPORTED_API_VERSION";
                    }
                    return null;
                }
            }
            if (i11 != 0) {
            }
            num = (Integer) obj;
            if (num != null) {
                return "RESULT_CODE_NO_PROFILE";
            }
            if (num.intValue() == 1) {
            }
            if (num != null) {
                return "RESULT_CODE_PROFILE_ENQUEUED_FOR_COMPILATION";
            }
            if (num.intValue() == 3) {
            }
            if (num != null) {
                return "RESULT_CODE_ERROR_PACKAGE_NAME_DOES_NOT_EXIST";
            }
            if (num.intValue() == 131072) {
            }
            if (num != null) {
                return "RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE";
            }
            if (num.intValue() != 262144) {
            }
        } catch (Exception e11) {
            Lm0.a.f17149a.e(e11);
            return null;
        }
        compilationProfileStatusDelegate$getStatus$1 = new CompilationProfileStatusDelegate$getStatus$1(this, dVar);
        Object obj2 = compilationProfileStatusDelegate$getStatus$1.result;
        a aVar2 = a.COROUTINE_SUSPENDED;
        i11 = compilationProfileStatusDelegate$getStatus$1.label;
    }
}
