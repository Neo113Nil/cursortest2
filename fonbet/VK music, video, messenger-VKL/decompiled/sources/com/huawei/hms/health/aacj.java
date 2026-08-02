package com.huawei.hms.health;

import com.huawei.hmf.tasks.Task;
import com.huawei.hms.common.internal.Preconditions;
import com.huawei.hms.hihealth.data.AppLangItem;
import com.huawei.hms.hihealth.data.ScopeLangItem;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Callable;

/* loaded from: classes13.dex */
public class aacj implements com.huawei.hms.hihealth.aabk {
    private static volatile aacj aab;

    public static class aab implements Callable<Void> {
        boolean aab;

        public aab(boolean z) {
            this.aab = z;
        }

        @Override // java.util.concurrent.Callable
        public Void call() throws Exception {
            aack.aabe().aabc().aab(this.aab);
            return null;
        }
    }

    public static class aaba implements Callable<ScopeLangItem> {
        String aab;
        String aaba;

        public aaba(String str, String str2) {
            this.aab = str;
            this.aaba = str2;
        }

        @Override // java.util.concurrent.Callable
        public ScopeLangItem call() throws Exception {
            return aack.aabe().aabc().aab(this.aaba, this.aab);
        }
    }

    public static class aabb implements Callable<List<AppLangItem>> {
        int aab;
        String aaba;

        public aabb(int i, String str) {
            this.aab = i;
            this.aaba = str;
        }

        @Override // java.util.concurrent.Callable
        public List<AppLangItem> call() throws Exception {
            return aack.aabe().aabc().aab(this.aaba, this.aab);
        }
    }

    public static class aabc implements Callable<Map<String, String>> {
        List<String> aab;

        public aabc(List<String> list) {
            this.aab = list;
        }

        @Override // java.util.concurrent.Callable
        public Map<String, String> call() throws Exception {
            return aack.aabe().aabc().aaba(this.aab);
        }
    }

    public static class aabd implements Callable<Map<String, String>> {
        List<String> aab;

        public aabd(List<String> list) {
            this.aab = list;
        }

        @Override // java.util.concurrent.Callable
        public Map<String, String> call() throws Exception {
            return aack.aabe().aabc().aab(this.aab);
        }
    }

    public static class aabe implements Callable<Void> {
        String aab;
        List<String> aaba;

        public aabe(String str, List<String> list) {
            this.aab = str;
            this.aaba = list;
        }

        @Override // java.util.concurrent.Callable
        public Void call() throws Exception {
            aack.aabe().aabc().aab(this.aab, this.aaba);
            return null;
        }
    }

    private aacj() {
    }

    public Task<Void> aab(String str) {
        Preconditions.checkNotNull(str, "Must set the appId");
        return aacq.aab(8, new aabe(str, null));
    }

    public Task<Map<String, String>> aaba(List<String> list) {
        Preconditions.checkArgument(aabz.aaba(list).booleanValue(), "Must set the pkgNames");
        return aacq.aaba(8, new aabd(list));
    }

    public Task<List<AppLangItem>> aab(String str, int i) {
        Preconditions.checkNotNull(str, "Must set the lang");
        return aacq.aaba(8, new aabb(i, str));
    }

    public Task<ScopeLangItem> aab(String str, String str2) {
        Preconditions.checkNotNull(str, "Must set the lang");
        Preconditions.checkNotNull(str2, "Must set the appId");
        return aacq.aab(8, new aaba(str2, str));
    }

    public Task<Void> aab(String str, List<String> list) {
        Preconditions.checkNotNull(str, "Must set the appId");
        Preconditions.checkNotNull(list, "Must set the scopes");
        Preconditions.checkArgument(!list.isEmpty(), "Must set the scopes");
        return aacq.aab(8, new aabe(str, list));
    }

    public Task<Map<String, String>> aab(List<String> list) {
        Preconditions.checkArgument(aabz.aaba(list).booleanValue(), "Must set the appIds");
        return aacq.aaba(8, new aabc(list));
    }

    public Task<Void> aab(boolean z) {
        return aacq.aab(8, new aab(z));
    }

    public static com.huawei.hms.hihealth.aabk aab() {
        if (aab == null) {
            synchronized (aacj.class) {
                try {
                    if (aab == null) {
                        aab = new aacj();
                    }
                } finally {
                }
            }
        }
        return aab;
    }
}
