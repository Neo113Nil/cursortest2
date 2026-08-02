package xf;

import android.util.Log;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Locale;
import java.util.Objects;
import java.util.Set;
import org.json.JSONException;
import org.json.JSONObject;
import org.json.JSONTokener;

/* loaded from: classes10.dex */
public final class c {

    /* renamed from: b, reason: collision with root package name */
    public static final Set<String> f105547b;

    /* renamed from: a, reason: collision with root package name */
    private JSONObject f105548a;

    static {
        String[] strArr = {"CHLO", "SHLO", "SCFG", "REJ", "CETV", "PRST", "SCUP", "ALPN", "P256", "C255", "AESG", "CC20", "QBIC", "AFCW", "IFW5", "IFW6", "IFW7", "IFW8", "IFW9", "IFWA", "TBBR", "1RTT", "2RTT", "LRTT", "BBS1", "BBS2", "BBS3", "BBS4", "BBS5", "BBRR", "BBR1", "BBR2", "BBR3", "BBR4", "BBR5", "BBR9", "BBRA", "BBRB", "BBRS", "BBQ1", "BBQ2", "BBQ3", "BBQ5", "BBQ6", "BBQ7", "BBQ8", "BBQ9", "BBQ0", "RENO", "TPCC", "BYTE", "IW03", "IW10", "IW20", "IW50", "B2ON", "B2NA", "B2NE", "B2RP", "B2LO", "B2HR", "B2SL", "B2H2", "B2RC", "BSAO", "B2DL", "B201", "B202", "B203", "B204", "B205", "B206", "B207", "NTLP", "1TLP", "1RTO", "NRTO", "TIME", "ATIM", "MIN1", "MIN4", "MAD0", "MAD2", "MAD3", "1ACK", "AKD3", "AKDU", "AFFE", "AFF1", "AFF2", "SSLR", "NPRR", "2RTO", "3RTO", "4RTO", "5RTO", "6RTO", "CBHD", "NBHD", "CONH", "LFAK", "STMP", "EACK", "ILD0", "ILD1", "ILD2", "ILD3", "ILD4", "RUNT", "NSTP", "NRTT", "1PTO", "2PTO", "6PTO", "7PTO", "8PTO", "PTOS", "PTOA", "PEB1", "PEB2", "PVS1", "PAG1", "PAG2", "PSDA", "PLE1", "PLE2", "APTO", "ELDT", "RVCM", "TCID", "MPTH", "NCMR", "DFER", "NPCO", "BWRE", "BWMX", "BWID", "BWI1", "BWRS", "BWS2", "BWS3", "BWS4", "BWS5", "BWS6", "BWP0", "BWP1", "BWP2", "BWP3", "BWP4", "BWG4", "BWG7", "BWG8", "BWS7", "BWM3", "BWM4", "ICW1", "DTOS", "FIDT", "3AFF", "10AF", "MTUH", "MTUL", "NSLC", "NCHP", "NBPE", "X509", "X59R", "CHID", "VER ", "NONC", "NONP", "KEXS", "AEAD", "COPT", "CLOP", "ICSL", "MIBS", "MIUS", "ADE ", "IRTT", "TRTT", "SNI ", "PUBS", "SCID", "ORBT", "PDMD", "PROF", "CCRT", "EXPY", "STTL", "SFCW", "CFCW", "UAID", "XLCT", "QLVE", "PDP1", "PDP2", "PDP3", "PDP5", "QNZ2", "MAD", "IGNP", "SRWP", "ROWF", "ROWR", "GSR0", "GSR1", "GSR2", "GSR3", "NRES", "INVC", "GWCH", "YTCH", "ACH0", "RREJ", "CADR", "ASAD", "SRST", "CIDK", "CIDS", "RNON", "RSEQ", "PAD ", "EPID", "SNO0", "STK0", "CRT255", "CSCT"};
        HashSet hashSet = new HashSet(228);
        for (int i11 = 0; i11 < 228; i11++) {
            String str = strArr[i11];
            Objects.requireNonNull(str);
            if (!hashSet.add(str)) {
                throw new IllegalArgumentException("duplicate element: " + ((Object) str));
            }
        }
        f105547b = Collections.unmodifiableSet(hashSet);
    }

    public c(String str) {
        this.f105548a = new JSONObject();
        if (str == null || str.isEmpty()) {
            return;
        }
        try {
            this.f105548a = (JSONObject) new JSONTokener(str).nextValue();
        } catch (ClassCastException | JSONException e11) {
            if (Log.isLoggable("c", 2)) {
                Log.v("c", "Experimental options could not be parsed, using default values. Error: " + e11.getMessage());
            }
        }
    }

    private Object p(String str, String str2, Integer num, Class cls) {
        JSONObject jSONObject;
        JSONObject jSONObject2 = this.f105548a;
        if (jSONObject2.length() == 0) {
            return num;
        }
        try {
            jSONObject = jSONObject2.getJSONObject(str);
        } catch (JSONException e11) {
            if (Log.isLoggable("c", 2)) {
                Log.v("c", "Failed to get " + str + " options: " + e11.getMessage());
            }
            jSONObject = null;
        }
        if (jSONObject == null || jSONObject.length() == 0) {
            return num;
        }
        try {
            return cls.cast(jSONObject.get(str2));
        } catch (ClassCastException | JSONException e12) {
            if (!Log.isLoggable("c", 2)) {
                return num;
            }
            Log.v("c", "Failed to get " + str2 + " options: " + e12.getMessage());
            return num;
        }
    }

    public final String A() {
        return (String) p("QUIC", "user_agent_id", null, String.class);
    }

    public final e a() {
        return e.a((Boolean) p("QUIC", "allow_port_migration", null, Boolean.class));
    }

    public final e b() {
        return e.a((Boolean) p("AsyncDNS", "enable", null, Boolean.class));
    }

    public final e c() {
        return e.a((Boolean) p("QUIC", "close_sessions_on_ip_change", null, Boolean.class));
    }

    public final String d() {
        String str = (String) p("QUIC", "connection_options", null, String.class);
        if (str == null || str.isEmpty()) {
            return str;
        }
        ArrayList arrayList = new ArrayList();
        for (String str2 : str.split(",", -1)) {
            if (f105547b.contains(str2.toUpperCase(Locale.ROOT).trim())) {
                arrayList.add(str2);
            }
        }
        return String.join(",", arrayList);
    }

    public final e e() {
        return e.a((Boolean) p("QUIC", "disable_bidirectional_streams", null, Boolean.class));
    }

    public final e f() {
        Object cast;
        JSONObject jSONObject = this.f105548a;
        if (jSONObject.length() != 0) {
            try {
                cast = Boolean.class.cast(jSONObject.get("disable_ipv6_on_wifi"));
            } catch (ClassCastException | JSONException e11) {
                if (Log.isLoggable("c", 2)) {
                    Log.v("c", "Failed to get disable_ipv6_on_wifi options: " + e11.getMessage());
                }
            }
            return e.a((Boolean) cast);
        }
        cast = null;
        return e.a((Boolean) cast);
    }

    public final e g() {
        return e.a((Boolean) p("QUIC", "enable_socket_recv_optimization", null, Boolean.class));
    }

    public final e h() {
        return e.a((Boolean) p("QUIC", "goaway_sessions_on_ip_change", null, Boolean.class));
    }

    public final String i() {
        return (String) p("QUIC", "host_whitelist", null, String.class);
    }

    public final int j() {
        return ((Integer) p("QUIC", "idle_connection_timeout_seconds", -1, Integer.class)).intValue();
    }

    public final int k() {
        return ((Integer) p("QUIC", "max_idle_time_before_crypto_handshake_seconds", -1, Integer.class)).intValue();
    }

    public final int l() {
        return ((Integer) p("QUIC", "max_server_configs_stored_in_properties", -1, Integer.class)).intValue();
    }

    public final int m() {
        return ((Integer) p("QUIC", "max_time_before_crypto_handshake_seconds", -1, Integer.class)).intValue();
    }

    public final e n() {
        return e.a((Boolean) p("QUIC", "migrate_sessions_early_v2", null, Boolean.class));
    }

    public final e o() {
        return e.a((Boolean) p("QUIC", "migrate_sessions_on_network_change_v2", null, Boolean.class));
    }

    public final e q() {
        return e.a((Boolean) p("QUIC", "race_stale_dns_on_connection", null, Boolean.class));
    }

    public final e r() {
        return e.a((Boolean) p("StaleDNS", "allow_other_network", null, Boolean.class));
    }

    public final int s() {
        return ((Integer) p("StaleDNS", "delay_ms", -1, Integer.class)).intValue();
    }

    public final e t() {
        return e.a((Boolean) p("StaleDNS", "enable", null, Boolean.class));
    }

    public final int u() {
        return ((Integer) p("StaleDNS", "max_expired_time_ms", -1, Integer.class)).intValue();
    }

    public final int v() {
        return ((Integer) p("StaleDNS", "max_stale_uses", -1, Integer.class)).intValue();
    }

    public final int w() {
        return ((Integer) p("StaleDNS", "persist_delay_ms", -1, Integer.class)).intValue();
    }

    public final e x() {
        return e.a((Boolean) p("StaleDNS", "persist_to_disk", null, Boolean.class));
    }

    public final e y() {
        return e.a((Boolean) p("StaleDNS", "use_stale_on_name_not_resolved", null, Boolean.class));
    }

    public final e z() {
        return e.a((Boolean) p("QUIC", "store_server_configs_in_properties", null, Boolean.class));
    }
}
