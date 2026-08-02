package com.vk.api.stats;

import com.huawei.hms.framework.network.grs.GrsBaseInfo;
import com.mbridge.msdk.foundation.download.database.DownloadModel;
import ru.ok.android.externcalls.sdk.api.ApiProtocol;
import xsna.xsg0;

/* loaded from: classes15.dex */
public final class StatsTrackUploadServerStateAPIRequest extends xsg0 {

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class State {
        private static final /* synthetic */ State[] $VALUES;
        public static final State BAD_RESPONSE;
        public static final State BAD_SERVER;
        public static final State NO_NETWORK;
        public static final State SUCCESS;
        public static final State TIMEOUT;
        public static final State UNKNOWN;

        static {
            State state = new State("SUCCESS", 0);
            SUCCESS = state;
            State state2 = new State(GrsBaseInfo.CountryCodeSource.UNKNOWN, 1);
            UNKNOWN = state2;
            State state3 = new State("TIMEOUT", 2);
            TIMEOUT = state3;
            State state4 = new State("NO_NETWORK", 3);
            NO_NETWORK = state4;
            State state5 = new State("BAD_SERVER", 4);
            BAD_SERVER = state5;
            State state6 = new State("BAD_RESPONSE", 5);
            BAD_RESPONSE = state6;
            $VALUES = new State[]{state, state2, state3, state4, state5, state6};
        }

        public State() {
            throw null;
        }

        public static State valueOf(String str) {
            return (State) Enum.valueOf(State.class, str);
        }

        public static State[] values() {
            return (State[]) $VALUES.clone();
        }
    }

    public static /* synthetic */ class a {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[State.values().length];
            a = iArr;
            try {
                iArr[State.SUCCESS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                a[State.TIMEOUT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                a[State.NO_NETWORK.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                a[State.BAD_SERVER.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                a[State.BAD_RESPONSE.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                a[State.UNKNOWN.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
        }
    }

    public static class b {
        public String a;
        public String b;
        public State c;
        public int d;
        public String e;
        public long f;
        public String g;
    }

    public StatsTrackUploadServerStateAPIRequest(b bVar) {
        super("stats.trackUploadServerState");
        String str = bVar.a;
        if (str == null) {
            throw new IllegalArgumentException("methodName is null or empty");
        }
        if (bVar.b == null) {
            throw new IllegalArgumentException("uploadUrl is null or empty");
        }
        if (bVar.c == null) {
            throw new IllegalArgumentException("state is null");
        }
        if (bVar.g == null) {
            throw new IllegalArgumentException("fileName is null or empty");
        }
        K("method_name", str);
        K(ApiProtocol.KEY_UPLOAD_URL, bVar.b);
        int i = a.a[bVar.c.ordinal()];
        K("state", i != 1 ? i != 2 ? i != 3 ? i != 4 ? i != 5 ? "unknown" : "bad_response" : "bad_server" : "no_network" : "timeout" : "success");
        C(bVar.d, "http_status");
        String str2 = bVar.e;
        K("http_error", str2 == null ? "" : str2);
        long j = bVar.f;
        if (j >= 0) {
            D(j, "file_size");
        }
        String str3 = bVar.g;
        K(DownloadModel.FILE_NAME, str3 != null ? str3 : "");
    }
}
