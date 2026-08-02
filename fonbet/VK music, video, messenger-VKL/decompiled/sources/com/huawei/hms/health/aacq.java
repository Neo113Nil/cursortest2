package com.huawei.hms.health;

import android.os.IInterface;
import com.huawei.hmf.tasks.Task;
import com.huawei.hms.common.ApiException;
import com.huawei.hms.hihealth.HiHealthKitClient;
import com.huawei.hms.hihealth.HiHealthStatusCodes;
import com.huawei.hms.support.api.client.Status;
import java.util.concurrent.Callable;
import xsna.a020;

/* loaded from: classes13.dex */
public class aacq {

    public static class aab<T> implements Callable<T> {
        private Callable<T> aab;

        public aab(Callable<T> callable) {
            this.aab = callable;
        }

        @Override // java.util.concurrent.Callable
        public T call() throws Exception {
            try {
                return this.aab.call();
            } finally {
                aacq.aab();
            }
        }
    }

    public static class aaba<T> implements Callable<T> {
        private int aab;
        private Callable<T> aaba;

        public aaba(int i, Callable<T> callable) {
            this.aab = i;
            this.aaba = callable;
        }

        @Override // java.util.concurrent.Callable
        public T call() throws Exception {
            try {
                aacq.aab(this.aab);
                return this.aaba.call();
            } finally {
                aacq.aab();
            }
        }
    }

    public static class aabb<T> implements Callable<T> {
        private int aab;
        private Callable<T> aaba;

        public aabb(int i, Callable<T> callable) {
            this.aab = i;
            this.aaba = callable;
        }

        @Override // java.util.concurrent.Callable
        public T call() throws Exception {
            try {
                if (HiHealthKitClient.getInstance().bindServiceWithOutCheckEmui(this.aab) != null) {
                    return this.aaba.call();
                }
                throw new ApiException(new Status(HiHealthStatusCodes.API_EXCEPTION_ERROR, "the client is not connected"));
            } finally {
                aacq.aab();
            }
        }
    }

    public static class aabc<T> implements Callable<T> {
        private int aab;
        private Callable<T> aaba;

        public aabc(int i, Callable<T> callable) {
            this.aab = i;
            this.aaba = callable;
        }

        @Override // java.util.concurrent.Callable
        public T call() throws Exception {
            aacq.aab(this.aab);
            return this.aaba.call();
        }
    }

    public static <T> Task<T> aab(int i, Callable<T> callable) {
        return a020.l(new aaba(i, callable));
    }

    public static <T> Task<T> aaba(int i, Callable<T> callable) {
        return a020.l(new aabb(i, callable));
    }

    public static <T> Task<T> aabb(int i, Callable<T> callable) {
        return a020.l(new aabc(i, callable));
    }

    public static <T> Task<T> aab(Callable<T> callable) {
        return a020.l(new aab(callable));
    }

    public static /* synthetic */ IInterface aab(int i) throws ApiException {
        IInterface bindService = HiHealthKitClient.getInstance().bindService(i);
        if (bindService != null) {
            return bindService;
        }
        throw new ApiException(new Status(HiHealthStatusCodes.API_EXCEPTION_ERROR, "the client is not connected"));
    }

    public static /* synthetic */ void aab() {
        HiHealthKitClient.getInstance().delayedDisconnect();
    }
}
