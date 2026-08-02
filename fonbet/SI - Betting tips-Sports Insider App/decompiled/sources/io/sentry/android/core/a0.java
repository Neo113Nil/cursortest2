package io.sentry.android.core;

import android.app.ApplicationExitInfo;
import io.sentry.b5;
import io.sentry.t4;
import j$.time.Instant;
import j$.time.format.DateTimeFormatter;
import java.io.BufferedReader;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import okio.Segment;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class a0 implements k0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f15536a;

    /* renamed from: b, reason: collision with root package name */
    public final SentryAndroidOptions f15537b;

    public /* synthetic */ a0(SentryAndroidOptions sentryAndroidOptions, int i5) {
        this.f15536a = i5;
        this.f15537b = sentryAndroidOptions;
    }

    @Override // io.sentry.android.core.k0
    public final int a() {
        switch (this.f15536a) {
            case 0:
                return 6;
            default:
                return 5;
        }
    }

    @Override // io.sentry.android.core.k0
    public final Long b() {
        switch (this.f15536a) {
            case 0:
                return io.sentry.android.core.cache.b.h(this.f15537b, "last_anr_report", "ANR");
            default:
                return io.sentry.android.core.cache.b.h(this.f15537b, "last_tombstone_report", "Tombstone");
        }
    }

    @Override // io.sentry.android.core.k0
    public final String c() {
        switch (this.f15536a) {
            case 0:
                return "ANR";
            default:
                return "Tombstone";
        }
    }

    @Override // io.sentry.android.core.k0
    public final boolean d() {
        switch (this.f15536a) {
            case 0:
                return this.f15537b.isReportHistoricalAnrs();
            default:
                return this.f15537b.isReportHistoricalTombstones();
        }
    }

    @Override // io.sentry.android.core.k0
    public final androidx.appcompat.app.v0 e(ApplicationExitInfo applicationExitInfo, boolean z5) {
        com.google.firebase.messaging.x xVar;
        byte[] bArr;
        int i5 = this.f15536a;
        SentryAndroidOptions sentryAndroidOptions = this.f15537b;
        switch (i5) {
            case 0:
                long timestamp = applicationExitInfo.getTimestamp();
                boolean z7 = applicationExitInfo.getImportance() != 100;
                try {
                    InputStream traceInputStream = applicationExitInfo.getTraceInputStream();
                    try {
                        if (traceInputStream == null) {
                            xVar = new com.google.firebase.messaging.x(b0.NO_DUMP);
                            if (traceInputStream != null) {
                                traceInputStream.close();
                            }
                        } else {
                            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                            try {
                                byte[] bArr2 = new byte[Segment.SHARE_MINIMUM];
                                while (true) {
                                    int read = traceInputStream.read(bArr2, 0, Segment.SHARE_MINIMUM);
                                    if (read != -1) {
                                        byteArrayOutputStream.write(bArr2, 0, read);
                                    } else {
                                        byte[] byteArray = byteArrayOutputStream.toByteArray();
                                        byteArrayOutputStream.close();
                                        traceInputStream.close();
                                        try {
                                            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(new ByteArrayInputStream(byteArray)));
                                            try {
                                                ArrayList arrayList = new ArrayList();
                                                while (true) {
                                                    String readLine = bufferedReader.readLine();
                                                    if (readLine != null) {
                                                        io.sentry.android.core.internal.threaddump.a aVar = new io.sentry.android.core.internal.threaddump.a();
                                                        aVar.f15661a = readLine;
                                                        arrayList.add(aVar);
                                                    } else {
                                                        b6.q qVar = new b6.q(arrayList);
                                                        io.sentry.android.core.internal.threaddump.b bVar = new io.sentry.android.core.internal.threaddump.b(sentryAndroidOptions, z7);
                                                        bVar.d(qVar);
                                                        ArrayList arrayList2 = bVar.f15676e;
                                                        xVar = arrayList2.isEmpty() ? new com.google.firebase.messaging.x(b0.NO_DUMP) : new com.google.firebase.messaging.x(b0.DUMP, byteArray, arrayList2, new ArrayList(bVar.f15675d.values()));
                                                        bufferedReader.close();
                                                    }
                                                }
                                            } finally {
                                            }
                                        } catch (Throwable th2) {
                                            sentryAndroidOptions.getLogger().e(b5.WARNING, "Failed to parse ANR thread dump", th2);
                                            b0 b0Var = b0.ERROR;
                                            xVar = new com.google.firebase.messaging.x();
                                            xVar.f6182a = b0Var;
                                            xVar.f6183b = byteArray;
                                            xVar.f6184c = null;
                                            xVar.f6185d = null;
                                        }
                                    }
                                }
                            } finally {
                            }
                        }
                    } finally {
                    }
                } catch (Throwable th3) {
                    sentryAndroidOptions.getLogger().e(b5.WARNING, "Failed to read ANR thread dump", th3);
                    xVar = new com.google.firebase.messaging.x(b0.NO_DUMP);
                }
                b0 b0Var2 = (b0) xVar.f6182a;
                if (b0Var2 == b0.NO_DUMP) {
                    sentryAndroidOptions.getLogger().h(b5.WARNING, "Not reporting ANR event as there was no thread dump for the ANR %s", applicationExitInfo.toString());
                    return null;
                }
                z zVar = new z(sentryAndroidOptions.getFlushTimeoutMillis(), sentryAndroidOptions.getLogger(), timestamp, z5, z7);
                io.sentry.h0 k6 = k2.x.k(zVar);
                t4 t4Var = new t4();
                if (b0Var2 == b0.ERROR) {
                    io.sentry.protocol.n nVar = new io.sentry.protocol.n();
                    nVar.f16865a = "Sentry Android SDK failed to parse system thread dump for this ANR. We recommend enabling [SentryOptions.isAttachAnrThreadDump] option to attach the thread dump as plain text and report this issue on GitHub.";
                    t4Var.q = nVar;
                } else if (b0Var2 == b0.DUMP) {
                    t4Var.f17094s = new com.android.billingclient.api.m((List) xVar.f6184c);
                    ArrayList arrayList3 = (ArrayList) xVar.f6185d;
                    if (arrayList3 != null) {
                        io.sentry.protocol.d dVar = new io.sentry.protocol.d();
                        dVar.f16758b = new ArrayList(arrayList3);
                        t4Var.f16467n = dVar;
                    }
                }
                t4Var.f17096u = b5.FATAL;
                t4Var.f17092p = com.google.android.play.core.appupdate.b.o(timestamp);
                if (sentryAndroidOptions.isAttachAnrThreadDump() && (bArr = (byte[]) xVar.f6183b) != null) {
                    k6.f16450f = new io.sentry.a(bArr);
                }
                return new androidx.appcompat.app.v0(t4Var, k6, zVar, 19);
            default:
                try {
                    InputStream traceInputStream2 = applicationExitInfo.getTraceInputStream();
                    if (traceInputStream2 == null) {
                        sentryAndroidOptions.getLogger().h(b5.WARNING, "No tombstone InputStream available for ApplicationExitInfo from %s", DateTimeFormatter.ISO_INSTANT.format(Instant.ofEpochMilli(applicationExitInfo.getTimestamp())));
                        return null;
                    }
                    io.sentry.android.core.internal.tombstone.a aVar2 = new io.sentry.android.core.internal.tombstone.a(traceInputStream2);
                    try {
                        t4 c2 = aVar2.c();
                        aVar2.close();
                        long timestamp2 = applicationExitInfo.getTimestamp();
                        c2.f17092p = com.google.android.play.core.appupdate.b.o(timestamp2);
                        j1 j1Var = new j1(sentryAndroidOptions.getFlushTimeoutMillis(), sentryAndroidOptions.getLogger(), timestamp2, z5);
                        return new androidx.appcompat.app.v0(c2, k2.x.k(j1Var), j1Var, 19);
                    } finally {
                    }
                } catch (Throwable th4) {
                    sentryAndroidOptions.getLogger().h(b5.WARNING, "Failed to parse tombstone from %s: %s", DateTimeFormatter.ISO_INSTANT.format(Instant.ofEpochMilli(applicationExitInfo.getTimestamp())), th4.getMessage());
                    return null;
                }
        }
    }
}
