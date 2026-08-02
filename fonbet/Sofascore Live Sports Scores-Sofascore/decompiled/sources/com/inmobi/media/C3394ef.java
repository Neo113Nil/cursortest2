package com.inmobi.media;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* renamed from: com.inmobi.media.ef, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C3394ef {
    public a others;
    public a wifi;

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    /* renamed from: com.inmobi.media.ef$a */
    public static final class a {
        private int maxBatchSize;
        private int minBatchSize;
        private long retryInterval;

        public final boolean a(int i) {
            int i2;
            int i3 = this.maxBatchSize;
            return i3 <= i && this.retryInterval > 0 && i3 > 0 && (i2 = this.minBatchSize) > 0 && i2 <= i3;
        }

        public final int b() {
            return this.minBatchSize;
        }

        public final long c() {
            return this.retryInterval;
        }

        public final void b(int i) {
            this.maxBatchSize = i;
        }

        public final void c(int i) {
            this.minBatchSize = i;
        }

        public final int a() {
            return this.maxBatchSize;
        }

        public final void a(long j) {
            this.retryInterval = j;
        }
    }
}
