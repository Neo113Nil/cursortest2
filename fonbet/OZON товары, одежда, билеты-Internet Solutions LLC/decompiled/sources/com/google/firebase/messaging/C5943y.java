package com.google.firebase.messaging;

import F8.a;
import F8.b;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import com.google.android.gms.tasks.Tasks;
import java.util.concurrent.ExecutionException;
import l8.InterfaceC7893a;
import ru.ozon.app.android.sellerproducts.sellerProducts.data.model.ProductContainerDTO;
import z8.InterfaceC10999b;

/* renamed from: com.google.firebase.messaging.y, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C5943y {
    static boolean a() {
        ApplicationInfo applicationInfo;
        Bundle bundle;
        try {
            k8.e.j();
            Context i11 = k8.e.j().i();
            SharedPreferences sharedPreferences = i11.getSharedPreferences("com.google.firebase.messaging", 0);
            if (sharedPreferences.contains("export_to_big_query")) {
                return sharedPreferences.getBoolean("export_to_big_query", false);
            }
            try {
                PackageManager packageManager = i11.getPackageManager();
                if (packageManager != null && (applicationInfo = packageManager.getApplicationInfo(i11.getPackageName(), UserVerificationMethods.USER_VERIFY_PATTERN)) != null && (bundle = applicationInfo.metaData) != null && bundle.containsKey("delivery_metrics_exported_to_big_query_enabled")) {
                    return applicationInfo.metaData.getBoolean("delivery_metrics_exported_to_big_query_enabled", false);
                }
            } catch (PackageManager.NameNotFoundException unused) {
            }
            return false;
        } catch (IllegalStateException unused2) {
            Log.i("FirebaseMessaging", "FirebaseApp has not being initialized. Device might be in direct boot mode. Skip exporting delivery metrics to Big Query");
            return false;
        }
    }

    public static void b(Intent intent) {
        d(intent.getExtras(), "_nd");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0106  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0117  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x011f  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0135  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0140  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x014b  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0156  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x01a7  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x01c9  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x019d A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0180 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0163 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0108  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void c(Intent intent) {
        int parseInt;
        Object[] objArr;
        String string;
        String string2;
        String string3;
        String string4;
        String string5;
        long parseLong;
        String d11;
        String c11;
        if (e(intent)) {
            d(intent.getExtras(), "_nr");
        }
        int i11 = 0;
        if ((intent == null || FirebaseMessagingService.ACTION_DIRECT_BOOT_REMOTE_INTENT.equals(intent.getAction())) ? false : a()) {
            a.b bVar = a.b.MESSAGE_DELIVERED;
            Q6.i iVar = FirebaseMessaging.f59596n.get();
            if (iVar == null) {
                Log.e("FirebaseMessaging", "TransportFactory is null. Skip exporting message delivery metrics to Big Query");
                return;
            }
            F8.a aVar = null;
            r4 = null;
            String str = null;
            if (intent != null) {
                Bundle extras = intent.getExtras();
                if (extras == null) {
                    extras = Bundle.EMPTY;
                }
                a.C0192a n11 = F8.a.n();
                Object obj = extras.get("google.ttl");
                if (obj instanceof Integer) {
                    parseInt = ((Integer) obj).intValue();
                } else {
                    if (obj instanceof String) {
                        try {
                            parseInt = Integer.parseInt((String) obj);
                        } catch (NumberFormatException unused) {
                            Log.w("FirebaseMessaging", "Invalid TTL: " + obj);
                        }
                    }
                    parseInt = 0;
                }
                n11.n(parseInt);
                n11.e(bVar);
                String string6 = extras.getString("google.to");
                if (TextUtils.isEmpty(string6)) {
                    try {
                        k8.e j11 = k8.e.j();
                        try {
                            int i12 = com.google.firebase.installations.c.f59559n;
                            Preconditions.checkArgument(true, "Null is not a valid value of FirebaseApp.");
                            string6 = (String) Tasks.await(((com.google.firebase.installations.c) j11.h(InterfaceC10999b.class)).getId());
                        } catch (InterruptedException e11) {
                            e = e11;
                            throw new RuntimeException(e);
                        }
                    } catch (InterruptedException | ExecutionException e12) {
                        e = e12;
                    }
                }
                n11.f(string6);
                n11.i(k8.e.j().i().getPackageName());
                n11.l(a.d.ANDROID);
                n11.h(A.g(extras) ? a.c.DISPLAY_NOTIFICATION : a.c.DATA_MESSAGE);
                String string7 = extras.getString("google.delivered_priority");
                if (string7 == null) {
                    if (!"1".equals(extras.getString("google.priority_reduced"))) {
                        string7 = extras.getString("google.priority");
                    }
                    objArr = 2;
                    if (objArr != 2) {
                        i11 = 5;
                    } else if (objArr == 1) {
                        i11 = 10;
                    }
                    n11.j(i11);
                    string = extras.getString("google.message_id");
                    if (string == null) {
                        string = extras.getString("message_id");
                    }
                    if (string != null) {
                        n11.g(string);
                    }
                    string2 = extras.getString("from");
                    if (string2 != null && string2.startsWith("/topics/")) {
                        str = string2;
                    }
                    if (str != null) {
                        n11.m(str);
                    }
                    string3 = extras.getString("collapse_key");
                    if (string3 != null) {
                        n11.c(string3);
                    }
                    string4 = extras.getString("google.c.a.m_l");
                    if (string4 != null) {
                        n11.b(string4);
                    }
                    string5 = extras.getString("google.c.a.c_l");
                    if (string5 != null) {
                        n11.d(string5);
                    }
                    if (extras.containsKey("google.c.sender.id")) {
                        try {
                            parseLong = Long.parseLong(extras.getString("google.c.sender.id"));
                        } catch (NumberFormatException e13) {
                            Log.w("FirebaseMessaging", "error parsing project number", e13);
                        }
                        if (parseLong > 0) {
                            n11.k(parseLong);
                        }
                        aVar = n11.a();
                    }
                    k8.e j12 = k8.e.j();
                    d11 = j12.l().d();
                    if (d11 != null) {
                        try {
                            parseLong = Long.parseLong(d11);
                        } catch (NumberFormatException e14) {
                            Log.w("FirebaseMessaging", "error parsing sender ID", e14);
                        }
                        if (parseLong > 0) {
                        }
                        aVar = n11.a();
                    }
                    c11 = j12.l().c();
                    if (c11.startsWith("1:")) {
                        try {
                            parseLong = Long.parseLong(c11);
                        } catch (NumberFormatException e15) {
                            Log.w("FirebaseMessaging", "error parsing app ID", e15);
                        }
                    } else {
                        String[] split = c11.split(ProductContainerDTO.RATIO_DELIMITER);
                        if (split.length >= 2) {
                            String str2 = split[1];
                            if (!str2.isEmpty()) {
                                try {
                                    parseLong = Long.parseLong(str2);
                                } catch (NumberFormatException e16) {
                                    Log.w("FirebaseMessaging", "error parsing app ID", e16);
                                }
                            }
                        }
                        parseLong = 0;
                    }
                    if (parseLong > 0) {
                    }
                    aVar = n11.a();
                }
                if ("high".equals(string7)) {
                    objArr = 1;
                } else {
                    if (!"normal".equals(string7)) {
                        objArr = 0;
                    }
                    objArr = 2;
                }
                if (objArr != 2) {
                }
                n11.j(i11);
                string = extras.getString("google.message_id");
                if (string == null) {
                }
                if (string != null) {
                }
                string2 = extras.getString("from");
                if (string2 != null) {
                    str = string2;
                }
                if (str != null) {
                }
                string3 = extras.getString("collapse_key");
                if (string3 != null) {
                }
                string4 = extras.getString("google.c.a.m_l");
                if (string4 != null) {
                }
                string5 = extras.getString("google.c.a.c_l");
                if (string5 != null) {
                }
                if (extras.containsKey("google.c.sender.id")) {
                }
                k8.e j122 = k8.e.j();
                d11 = j122.l().d();
                if (d11 != null) {
                }
                c11 = j122.l().c();
                if (c11.startsWith("1:")) {
                }
                if (parseLong > 0) {
                }
                aVar = n11.a();
            }
            if (aVar == null) {
                return;
            }
            try {
                Q6.f b11 = Q6.f.b(Integer.valueOf(intent.getIntExtra("google.product_id", 111881503)));
                Q6.h a11 = iVar.a("FCM_CLIENT_EVENT_LOGGING", Q6.c.b("proto"), new GZ.e());
                b.a b12 = F8.b.b();
                b12.b(aVar);
                a11.a(Q6.d.e(b12.a(), b11));
            } catch (RuntimeException e17) {
                Log.w("FirebaseMessaging", "Failed to send big query analytics payload.", e17);
            }
        }
    }

    static void d(Bundle bundle, String str) {
        try {
            k8.e.j();
            if (bundle == null) {
                bundle = new Bundle();
            }
            Bundle bundle2 = new Bundle();
            String string = bundle.getString("google.c.a.c_id");
            if (string != null) {
                bundle2.putString("_nmid", string);
            }
            String string2 = bundle.getString("google.c.a.c_l");
            if (string2 != null) {
                bundle2.putString("_nmn", string2);
            }
            String string3 = bundle.getString("google.c.a.m_l");
            if (!TextUtils.isEmpty(string3)) {
                bundle2.putString("label", string3);
            }
            String string4 = bundle.getString("google.c.a.m_c");
            if (!TextUtils.isEmpty(string4)) {
                bundle2.putString("message_channel", string4);
            }
            String string5 = bundle.getString("from");
            if (string5 == null || !string5.startsWith("/topics/")) {
                string5 = null;
            }
            if (string5 != null) {
                bundle2.putString("_nt", string5);
            }
            String string6 = bundle.getString("google.c.a.ts");
            if (string6 != null) {
                try {
                    bundle2.putInt("_nmt", Integer.parseInt(string6));
                } catch (NumberFormatException e11) {
                    Log.w("FirebaseMessaging", "Error while parsing timestamp in GCM event", e11);
                }
            }
            String string7 = bundle.containsKey("google.c.a.udt") ? bundle.getString("google.c.a.udt") : null;
            if (string7 != null) {
                try {
                    bundle2.putInt("_ndt", Integer.parseInt(string7));
                } catch (NumberFormatException e12) {
                    Log.w("FirebaseMessaging", "Error while parsing use_device_time in GCM event", e12);
                }
            }
            String str2 = A.g(bundle) ? "display" : "data";
            if ("_nr".equals(str) || "_nf".equals(str)) {
                bundle2.putString("_nmc", str2);
            }
            if (Log.isLoggable("FirebaseMessaging", 3)) {
                Log.d("FirebaseMessaging", "Logging to scion event=" + str + " scionPayload=" + bundle2);
            }
            InterfaceC7893a interfaceC7893a = (InterfaceC7893a) k8.e.j().h(InterfaceC7893a.class);
            if (interfaceC7893a != null) {
                interfaceC7893a.a(bundle2, str);
            } else {
                Log.w("FirebaseMessaging", "Unable to log event: analytics library is missing");
            }
        } catch (IllegalStateException unused) {
            Log.e("FirebaseMessaging", "Default FirebaseApp has not been initialized. Skip logging event to GA.");
        }
    }

    public static boolean e(Intent intent) {
        Bundle extras;
        if (intent == null || FirebaseMessagingService.ACTION_DIRECT_BOOT_REMOTE_INTENT.equals(intent.getAction()) || (extras = intent.getExtras()) == null) {
            return false;
        }
        return "1".equals(extras.getString("google.c.a.e"));
    }
}
