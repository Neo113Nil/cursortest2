package com.vk.push.core.analytics;

import android.database.sqlite.SQLiteException;
import com.ironsource.X3;
import com.vk.push.common.exception.SdkIsNotInitializedException;
import com.vk.push.core.base.exception.HostIsNotMasterException;
import com.vk.push.core.base.exception.TransferredIpcDataException;
import com.vk.push.core.ipc.BindingDiedException;
import com.vk.push.core.ipc.BindingFailedException;
import com.vk.push.core.ipc.ComponentCreationFailedException;
import com.vk.push.core.ipc.InvalidSignatureException;
import com.vk.push.core.ipc.NoHostsToBindException;
import com.vk.push.core.ipc.SecurityBindingException;
import com.vk.push.core.ipc.UnknownBindingException;
import com.vk.push.core.utils.MessageIdUtilsKt;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Result;
import kotlin.jvm.internal.Lambda;
import kotlinx.coroutines.TimeoutCancellationException;
import xsna.c5g;
import xsna.drm0;
import xsna.erm0;
import xsna.j5g;
import xsna.s3q0;
import xsna.wzs;

/* compiled from: Extensions.kt */
/* loaded from: classes.dex */
public final class ExtensionsKt {

    /* compiled from: Extensions.kt */
    /* loaded from: classes5.dex */
    public static final class a extends Lambda implements wzs {
        public static final a i = new a(2);

        @Override // xsna.wzs
        public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            return s3q0.a;
        }
    }

    /* compiled from: Extensions.kt */
    /* loaded from: classes5.dex */
    public static final class b extends Lambda implements wzs<Map<String, String>, Throwable, s3q0> {
        public static final b i = new b(2);

        @Override // xsna.wzs
        public final /* bridge */ /* synthetic */ s3q0 invoke(Map<String, String> map, Throwable th) {
            return s3q0.a;
        }
    }

    public static final String asString(boolean z) {
        return z ? "1" : "0";
    }

    public static final void set(Map<String, String> map, String str, boolean z) {
        map.put(str, asString(z));
    }

    public static final void setClientPackageName(Map<String, String> map, String str) {
        if (str == null || drm0.N(str)) {
            return;
        }
        map.put("client_package_name", str);
    }

    public static final void setErrorMessage(Map<String, String> map, String str, Throwable th) {
        String message = th.getMessage();
        if (message != null) {
            map.put(str, erm0.D0(20, message));
        }
    }

    public static final void setIntervalMs(Map<String, String> map, long j) {
        map.put("interval", String.valueOf(j));
    }

    public static final void setMasterPackageName(Map<String, String> map, String str) {
        if (str == null || drm0.N(str)) {
            return;
        }
        map.put("master_package_name", str);
    }

    public static final void setPushId(Map<String, String> map, String str, String str2) {
        map.put("push_id", MessageIdUtilsKt.formPushId(str, str2));
    }

    public static final void setPushIds(Map<String, String> map, String str, List<String> list) {
        List<String> list2 = list;
        ArrayList arrayList = new ArrayList(c5g.u(list2, 10));
        Iterator<T> it = list2.iterator();
        while (it.hasNext()) {
            arrayList.add(MessageIdUtilsKt.formPushId(str, (String) it.next()));
        }
        set(map, "push_ids", arrayList);
    }

    public static final void setPushToken(Map<String, String> map, String str) {
        if (str == null) {
            str = "";
        }
        map.put("push_token", str);
    }

    public static final void setReceivedBy(Map<String, String> map, String str) {
        if (str == null || drm0.N(str)) {
            return;
        }
        map.put("received_by", str);
    }

    public static final <T> void setResult(Map<String, String> map, Object obj, wzs<? super Map<String, String>, ? super T, s3q0> wzsVar, wzs<? super Map<String, String>, ? super Throwable, s3q0> wzsVar2) {
        String concat;
        boolean z = obj instanceof Result.Failure;
        map.put("result", !z ? "success" : "failure");
        if (!z) {
            wzsVar.invoke(map, obj);
        }
        Throwable a2 = Result.a(obj);
        if (a2 != null) {
            if (a2 instanceof TimeoutCancellationException) {
                concat = "timeout_error";
            } else if (a2 instanceof HostIsNotMasterException) {
                concat = "host_is_not_master";
            } else if (a2 instanceof SdkIsNotInitializedException) {
                concat = "sdk_is_not_initialized";
            } else if (a2 instanceof TransferredIpcDataException) {
                concat = "transferred_ipc_data";
            } else if (a2 instanceof NoHostsToBindException) {
                NoHostsToBindException noHostsToBindException = (NoHostsToBindException) a2;
                concat = noHostsToBindException instanceof BindingFailedException ? "binding_failed" : noHostsToBindException instanceof InvalidSignatureException ? "invalid_signature" : noHostsToBindException instanceof ComponentCreationFailedException ? "component_creation_failed" : noHostsToBindException instanceof SecurityBindingException ? "security_exception" : noHostsToBindException instanceof UnknownBindingException ? "unknown_binding_exception ".concat(erm0.D0(20, noHostsToBindException.getClass().getSimpleName())) : "no_hosts_to_bind";
            } else {
                concat = a2 instanceof BindingDiedException ? "binding_died" : a2 instanceof IllegalStateException ? "illegal_state" : a2 instanceof IllegalArgumentException ? "illegal_argument" : a2 instanceof SQLiteException ? "sqlite_error" : a2 instanceof IOException ? "io_error" : "unknown_exception ".concat(erm0.D0(20, a2.getClass().getSimpleName()));
            }
            map.put("reason", concat);
            setErrorMessage(map, "error_message", a2);
            wzsVar2.invoke(map, a2);
        }
    }

    public static /* synthetic */ void setResult$default(Map map, Object obj, wzs wzsVar, wzs wzsVar2, int i, Object obj2) {
        if ((i & 2) != 0) {
            wzsVar = a.i;
        }
        if ((i & 4) != 0) {
            wzsVar2 = b.i;
        }
        setResult(map, obj, wzsVar, wzsVar2);
    }

    public static final void set(Map<String, String> map, String str, long j) {
        map.put(str, String.valueOf(j));
    }

    public static final void setPushId(Map<String, String> map, String str) {
        if (str == null) {
            str = "";
        }
        map.put("push_id", str);
    }

    public static final void set(Map<String, String> map, String str, int i) {
        map.put(str, String.valueOf(i));
    }

    public static final void set(Map<String, String> map, String str, List<String> list) {
        map.put(str, j5g.g0(list, null, X3.j.d, X3.j.e, 0, null, 57));
    }
}
