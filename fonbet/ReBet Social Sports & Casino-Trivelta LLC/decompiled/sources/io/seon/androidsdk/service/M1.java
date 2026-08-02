package io.seon.androidsdk.service;

import java.io.UnsupportedEncodingException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.Iterator;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public abstract class M1 {

    /* renamed from: a, reason: collision with root package name */
    public static final Lh.a f53046a = Lh.a.d(M1.class);

    /* renamed from: b, reason: collision with root package name */
    public static final String[] f53047b = {"build_manufacturer", "build_id", "build_device", "build_number", "kernel_version", "kernel_arch", "cpu_count", "cpu_speed", "total_storage", "sensor_hash", "build_device", "build_model", "device_id", "region_language", "physical_memory"};

    /* renamed from: c, reason: collision with root package name */
    public static final ArrayList f53048c = new ArrayList();

    /* JADX WARN: Can't wrap try/catch for region: R(11:44|45|46|(7:48|49|50|51|(2:53|(9:(1:56)|9|(4:12|(3:14|15|(2:17|18)(1:20))(1:25)|19|10)|26|27|(2:31|(2:34|32))|35|36|37))|58|(0))|62|49|50|51|(0)|58|(0)) */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x0044, code lost:
    
        r4 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x0045, code lost:
    
        io.seon.androidsdk.service.V.j("PField", r4);
     */
    /* JADX WARN: Removed duplicated region for block: B:12:0x005b A[Catch: Exception -> 0x001e, TRY_LEAVE, TryCatch #2 {Exception -> 0x001e, blocks: (B:3:0x0003, B:5:0x0015, B:8:0x004b, B:9:0x0054, B:12:0x005b, B:15:0x0063, B:17:0x0069, B:19:0x0077, B:23:0x0072, B:27:0x007a, B:29:0x007e, B:31:0x0084, B:32:0x0088, B:34:0x008e, B:36:0x009a, B:41:0x00bc, B:56:0x0051, B:60:0x0045, B:64:0x0031, B:46:0x0023, B:48:0x0029, B:51:0x0037, B:53:0x003d), top: B:2:0x0003, inners: #0, #1, #5 }] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x008e A[Catch: Exception -> 0x001e, LOOP:1: B:32:0x0088->B:34:0x008e, LOOP_END, TRY_LEAVE, TryCatch #2 {Exception -> 0x001e, blocks: (B:3:0x0003, B:5:0x0015, B:8:0x004b, B:9:0x0054, B:12:0x005b, B:15:0x0063, B:17:0x0069, B:19:0x0077, B:23:0x0072, B:27:0x007a, B:29:0x007e, B:31:0x0084, B:32:0x0088, B:34:0x008e, B:36:0x009a, B:41:0x00bc, B:56:0x0051, B:60:0x0045, B:64:0x0031, B:46:0x0023, B:48:0x0029, B:51:0x0037, B:53:0x003d), top: B:2:0x0003, inners: #0, #1, #5 }] */
    /* JADX WARN: Removed duplicated region for block: B:53:0x003d A[Catch: Exception -> 0x0044, TRY_LEAVE, TryCatch #5 {Exception -> 0x0044, blocks: (B:51:0x0037, B:53:0x003d), top: B:50:0x0037, outer: #2 }] */
    /* JADX WARN: Removed duplicated region for block: B:55:0x004f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static String a(final JSONObject jSONObject) {
        StringBuilder sb2;
        String str;
        String str2;
        ArrayList arrayList;
        Iterator it;
        try {
            sb2 = new StringBuilder();
            str = (String) V.b(new InterfaceC4990o() { // from class: io.seon.androidsdk.service.A1
                @Override // io.seon.androidsdk.service.InterfaceC4990o
                public final Object a() {
                    String string;
                    string = jSONObject.getString("media_drm_id");
                    return string;
                }
            });
        } catch (Exception e10) {
            V.j("DHash", e10);
            return null;
        }
        try {
            if (str == null || str.equals("null")) {
                try {
                } catch (Exception e11) {
                    V.j("PField", e11);
                }
                if (jSONObject.has("gsf_id")) {
                    str = (String) jSONObject.get("gsf_id");
                    if (jSONObject.has("android_id")) {
                        str2 = (String) jSONObject.get("android_id");
                        if (str == null) {
                            if (str2 != null) {
                                sb2.append(str2);
                            }
                            for (String str3 : f53047b) {
                                if (jSONObject.has(str3)) {
                                    try {
                                        if (jSONObject.get(str3) != null) {
                                            sb2.append(jSONObject.get(str3));
                                        }
                                    } catch (JSONException e12) {
                                        f53046a.c(e12, 6);
                                    }
                                }
                            }
                            arrayList = f53048c;
                            if (arrayList != null && arrayList.size() > 0) {
                                it = arrayList.iterator();
                                while (it.hasNext()) {
                                    sb2.append(it.next().toString());
                                }
                            }
                            byte[] bytes = sb2.toString().getBytes("UTF-8");
                            MessageDigest messageDigest = MessageDigest.getInstance("SHA-256");
                            messageDigest.reset();
                            messageDigest.update(bytes);
                            return V.d(messageDigest.digest());
                        }
                    }
                    str2 = null;
                    if (str == null) {
                    }
                }
                str = null;
                if (jSONObject.has("android_id")) {
                }
                str2 = null;
                if (str == null) {
                }
            }
            byte[] bytes2 = sb2.toString().getBytes("UTF-8");
            MessageDigest messageDigest2 = MessageDigest.getInstance("SHA-256");
            messageDigest2.reset();
            messageDigest2.update(bytes2);
            return V.d(messageDigest2.digest());
        } catch (UnsupportedEncodingException | NoSuchAlgorithmException e13) {
            f53046a.c(e13, 6);
            return null;
        }
        sb2.append(str);
        while (r4 < r3) {
        }
        arrayList = f53048c;
        if (arrayList != null) {
            it = arrayList.iterator();
            while (it.hasNext()) {
            }
        }
    }
}
