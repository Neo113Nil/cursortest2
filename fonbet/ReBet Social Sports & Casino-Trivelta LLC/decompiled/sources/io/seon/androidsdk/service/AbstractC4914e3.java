package io.seon.androidsdk.service;

import android.net.TrafficStats;
import io.agora.rtc2.internal.RtcEngineEvent;
import java.net.DatagramSocket;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.net.SocketException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/* renamed from: io.seon.androidsdk.service.e3, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC4914e3 {

    /* renamed from: a, reason: collision with root package name */
    public static List f53289a = Collections.synchronizedList(new ArrayList());

    public static List a() {
        List list = f53289a;
        return list != null ? list : new ArrayList();
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0070 A[Catch: all -> 0x0076, Exception -> 0x007b, TRY_ENTER, TRY_LEAVE, TryCatch #2 {Exception -> 0x007b, blocks: (B:3:0x0002, B:5:0x000d, B:7:0x0014, B:9:0x001c, B:14:0x0028, B:20:0x0070, B:25:0x002d, B:27:0x0035, B:29:0x003b, B:31:0x0042), top: B:2:0x0002 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void b(PortScanHelper$PortScanTarget portScanHelper$PortScanTarget) {
        boolean z10;
        boolean z11;
        try {
            try {
                TrafficStats.setThreadStatsTag(RtcEngineEvent.EvtType.EVT_UNPUBLISH_URL);
                z10 = false;
            } catch (Exception unused) {
            }
            if (portScanHelper$PortScanTarget.proto != PortScanHelper$Protocol.TCP) {
                if (portScanHelper$PortScanTarget.address.isEmpty() && portScanHelper$PortScanTarget.proto == PortScanHelper$Protocol.UDP) {
                    z11 = false;
                    for (Integer num : portScanHelper$PortScanTarget.ports) {
                        int intValue = num.intValue();
                        if (!z11) {
                            if (intValue > 0 && intValue <= 65535) {
                                try {
                                    DatagramSocket datagramSocket = new DatagramSocket(intValue);
                                    try {
                                        datagramSocket.close();
                                        datagramSocket.close();
                                    } catch (Throwable th2) {
                                        try {
                                            datagramSocket.close();
                                        } catch (Throwable th3) {
                                            th2.addSuppressed(th3);
                                        }
                                        throw th2;
                                    }
                                } catch (SocketException unused2) {
                                } catch (Exception unused3) {
                                }
                            }
                            z11 = false;
                        }
                        z11 = true;
                    }
                }
                if (z10) {
                    f53289a.add(portScanHelper$PortScanTarget);
                }
            }
            z11 = false;
            for (Integer num2 : portScanHelper$PortScanTarget.ports) {
                int intValue2 = num2.intValue();
                if (!z11 && !c(portScanHelper$PortScanTarget.address, intValue2)) {
                    z11 = false;
                }
                z11 = true;
            }
            z10 = z11;
            if (z10) {
            }
        } finally {
            TrafficStats.clearThreadStatsTag();
        }
    }

    public static boolean c(String str, int i10) {
        if (i10 > 0 && i10 <= 65535) {
            try {
                Socket socket = new Socket();
                try {
                    socket.connect(new InetSocketAddress(str, i10), 2000);
                    socket.close();
                    return true;
                } finally {
                }
            } catch (Exception unused) {
            }
        }
        return false;
    }

    public static void d() {
        ExecutorService executorService = null;
        try {
            f53289a = Collections.synchronizedList(new ArrayList());
            executorService = Executors.newFixedThreadPool(PortScanHelper$PortScanTarget.values().length);
            for (final PortScanHelper$PortScanTarget portScanHelper$PortScanTarget : PortScanHelper$PortScanTarget.values()) {
                executorService.submit(new Runnable() { // from class: io.seon.androidsdk.service.d3
                    @Override // java.lang.Runnable
                    public final void run() {
                        AbstractC4914e3.b(PortScanHelper$PortScanTarget.this);
                    }
                });
            }
            if (executorService == null) {
                return;
            }
        } catch (Exception unused) {
            if (executorService == null) {
                return;
            }
        } catch (Throwable th2) {
            if (executorService != null) {
                try {
                    executorService.shutdown();
                } catch (Exception unused2) {
                }
            }
            throw th2;
        }
        try {
            executorService.shutdown();
        } catch (Exception unused3) {
        }
    }
}
