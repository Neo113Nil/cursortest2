package io.appmetrica.analytics.networktasks.internal;

import androidx.annotation.NonNull;
import io.appmetrica.analytics.coreapi.internal.io.IExecutionPolicy;
import io.appmetrica.analytics.networktasks.impl.e;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Executor;
import javax.net.ssl.SSLSocketFactory;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public class NetworkTask {

    /* renamed from: a, reason: collision with root package name */
    private int f15216a = 1;

    /* renamed from: b, reason: collision with root package name */
    private final Executor f15217b;

    /* renamed from: c, reason: collision with root package name */
    private final IExecutionPolicy f15218c;

    /* renamed from: d, reason: collision with root package name */
    private final ExponentialBackoffPolicy f15219d;

    /* renamed from: e, reason: collision with root package name */
    private final UnderlyingNetworkTask f15220e;

    /* renamed from: f, reason: collision with root package name */
    private final List f15221f;

    /* renamed from: g, reason: collision with root package name */
    private final String f15222g;

    /* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
    public enum Method {
        GET,
        POST
    }

    /* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
    public interface ShouldTryNextHostCondition {
        boolean shouldTryNextHost(int i5);
    }

    public NetworkTask(@NonNull Executor executor, @NonNull IExecutionPolicy iExecutionPolicy, @NonNull ExponentialBackoffPolicy exponentialBackoffPolicy, @NonNull UnderlyingNetworkTask underlyingNetworkTask, @NonNull List<ShouldTryNextHostCondition> list, @NonNull String str) {
        this.f15217b = executor;
        this.f15218c = iExecutionPolicy;
        this.f15219d = exponentialBackoffPolicy;
        this.f15220e = underlyingNetworkTask;
        this.f15221f = list;
        this.f15222g = str;
    }

    private synchronized boolean a(int i5) {
        if (!a(i5)) {
            return false;
        }
        this.f15216a = i5;
        return true;
    }

    @NonNull
    public String description() {
        return this.f15220e.description();
    }

    @NonNull
    public IExecutionPolicy getConnectionExecutionPolicy() {
        return this.f15218c;
    }

    @NonNull
    public Executor getExecutor() {
        return this.f15217b;
    }

    @NonNull
    public ExponentialBackoffPolicy getExponentialBackoffPolicy() {
        return this.f15219d;
    }

    @NonNull
    public RequestDataHolder getRequestDataHolder() {
        return this.f15220e.getRequestDataHolder();
    }

    @NonNull
    public ResponseDataHolder getResponseDataHolder() {
        return this.f15220e.getResponseDataHolder();
    }

    public RetryPolicyConfig getRetryPolicyConfig() {
        return this.f15220e.getRetryPolicyConfig();
    }

    public SSLSocketFactory getSslSocketFactory() {
        return this.f15220e.getSslSocketFactory();
    }

    @NonNull
    public UnderlyingNetworkTask getUnderlyingTask() {
        return this.f15220e;
    }

    public String getUrl() {
        return this.f15220e.getFullUrlFormer().getUrl();
    }

    @NonNull
    public String getUserAgent() {
        return this.f15222g;
    }

    public boolean isRemoved() {
        return this.f15216a == 9;
    }

    public boolean onCreateNetworkTask() {
        if (a(3)) {
            return this.f15220e.onCreateTask();
        }
        return false;
    }

    public boolean onPerformRequest() {
        boolean a7 = a(4);
        if (a7) {
            this.f15220e.getFullUrlFormer().incrementAttemptNumber();
            this.f15220e.getFullUrlFormer().buildAndSetFullHostUrl();
            this.f15220e.onPerformRequest();
        }
        return a7;
    }

    public boolean onRequestComplete() {
        boolean z5;
        boolean z7;
        synchronized (this) {
            try {
                if (a(5, 6)) {
                    z5 = this.f15220e.onRequestComplete();
                    if (z5) {
                        this.f15216a = 5;
                    } else {
                        this.f15216a = 6;
                    }
                    z7 = true;
                } else {
                    z5 = false;
                    z7 = false;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        if (z7) {
            this.f15220e.onPostRequestComplete(z5);
        }
        return z5;
    }

    public void onRequestError(Throwable th2) {
        if (a(6)) {
            this.f15220e.onRequestError(th2);
        }
    }

    public void onShouldNotExecute() {
        if (a(7)) {
            this.f15220e.onShouldNotExecute();
        }
    }

    public boolean onTaskAdded() {
        boolean a7 = a(2);
        if (a7) {
            this.f15220e.onTaskAdded();
        }
        return a7;
    }

    public void onTaskFinished() {
        int i5;
        boolean a7;
        synchronized (this) {
            i5 = this.f15216a;
            a7 = a(8);
        }
        if (a7) {
            this.f15220e.onTaskFinished();
            if (i5 == 5) {
                this.f15220e.onSuccessfulTaskFinished();
            } else if (i5 == 6 || i5 == 7) {
                this.f15220e.onUnsuccessfulTaskFinished();
            }
        }
    }

    public void onTaskRemoved() {
        if (a(9)) {
            this.f15220e.onTaskRemoved();
        }
    }

    public synchronized boolean shouldTryNextHost() {
        boolean hasMoreHosts;
        boolean z5;
        int i5;
        try {
            hasMoreHosts = this.f15220e.getFullUrlFormer().hasMoreHosts();
            int responseCode = this.f15220e.getResponseDataHolder().getResponseCode();
            Iterator it = this.f15221f.iterator();
            while (true) {
                if (!it.hasNext()) {
                    z5 = true;
                    break;
                }
                if (!((ShouldTryNextHostCondition) it.next()).shouldTryNextHost(responseCode)) {
                    z5 = false;
                    break;
                }
            }
            i5 = this.f15216a;
        } catch (Throwable th2) {
            throw th2;
        }
        return i5 != 9 && i5 != 8 && hasMoreHosts && z5;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0065 A[Catch: all -> 0x001f, TryCatch #0 {all -> 0x001f, blocks: (B:3:0x0001, B:5:0x000a, B:6:0x0018, B:7:0x001b, B:8:0x0077, B:10:0x0081, B:22:0x002a, B:33:0x003f, B:34:0x0042, B:36:0x0047, B:38:0x004c, B:40:0x0051, B:46:0x005d, B:47:0x0060, B:49:0x0065, B:51:0x006a, B:54:0x0071, B:13:0x0084), top: B:2:0x0001 }] */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0068  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private synchronized boolean a(int... iArr) {
        Boolean bool;
        Boolean bool2;
        Boolean bool3;
        try {
            bool = Boolean.TRUE;
            int i5 = this.f15216a;
            int length = iArr.length;
            int i10 = 0;
            while (true) {
                if (i10 < length) {
                    boolean z5 = true;
                    switch (e.a(iArr[i10])) {
                        case 0:
                            bool3 = null;
                            break;
                        case 1:
                            if (i5 != 1) {
                                z5 = false;
                            }
                            bool3 = Boolean.valueOf(z5);
                            break;
                        case 2:
                            if (i5 == 2) {
                                if (i5 == 9) {
                                    bool3 = Boolean.FALSE;
                                    break;
                                }
                                bool3 = null;
                                break;
                            } else {
                                bool3 = Boolean.TRUE;
                                break;
                            }
                        case 3:
                            if (i5 != 3 && i5 != 5 && i5 != 6) {
                                if (i5 == 9) {
                                    bool3 = Boolean.FALSE;
                                    break;
                                }
                                bool3 = null;
                                break;
                            }
                            bool3 = Boolean.TRUE;
                        case 4:
                        case 5:
                            if (i5 != 4) {
                                if (i5 == 9) {
                                    bool3 = Boolean.FALSE;
                                    break;
                                }
                                bool3 = null;
                                break;
                            } else {
                                bool3 = Boolean.TRUE;
                                break;
                            }
                        case 6:
                            if (i5 == 3) {
                                bool3 = Boolean.TRUE;
                                break;
                            }
                            if (i5 == 2) {
                            }
                            break;
                        case 7:
                            if (i5 != 5 && i5 != 6 && i5 != 7 && i5 != 2 && i5 != 3 && i5 != 4) {
                                if (i5 == 9) {
                                    bool3 = Boolean.FALSE;
                                    break;
                                }
                                bool3 = null;
                                break;
                            }
                            bool3 = Boolean.TRUE;
                        case 8:
                            if (i5 != 1) {
                                if (i5 == 9) {
                                    z5 = false;
                                }
                                bool3 = Boolean.valueOf(z5);
                                break;
                            } else {
                                bool3 = null;
                                break;
                            }
                        default:
                            bool3 = Boolean.FALSE;
                            break;
                    }
                    if (Boolean.TRUE.equals(bool3)) {
                        i10++;
                    } else {
                        bool = bool3;
                    }
                }
            }
            bool2 = Boolean.TRUE;
            bool2.equals(bool);
        } catch (Throwable th2) {
            throw th2;
        }
        return bool2.equals(bool);
    }
}
