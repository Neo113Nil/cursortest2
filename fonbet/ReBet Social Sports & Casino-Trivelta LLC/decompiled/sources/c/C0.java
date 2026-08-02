package c;

import android.content.Context;
import android.os.Build;
import java.io.File;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;
import kotlin.text.StringsKt;

/* loaded from: classes.dex */
public final class C0 {
    public C0(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x0082, code lost:
    
        r3 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0083, code lost:
    
        r5 = kotlin.TuplesKt.to("is_rooted", java.lang.Boolean.valueOf(r3));
        r6 = kotlin.TuplesKt.to("bootloader", android.os.Build.BOOTLOADER);
        r7 = kotlin.TuplesKt.to("build_tags", android.os.Build.TAGS);
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x009d, code lost:
    
        if (r3 != false) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x009f, code lost:
    
        if (r0 != false) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x00a1, code lost:
    
        r2 = 1.0d;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x00bd, code lost:
    
        r8 = kotlin.TuplesKt.to("confidence", java.lang.Double.valueOf(r2));
        r2 = new java.util.LinkedHashMap();
        r3 = r1.entrySet().iterator();
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x00d8, code lost:
    
        if (r3.hasNext() == false) goto L53;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x00da, code lost:
    
        r4 = (java.util.Map.Entry) r3.next();
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x00ea, code lost:
    
        if (((java.lang.Boolean) r4.getValue()).booleanValue() == false) goto L56;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x00ec, code lost:
    
        r2.put(r4.getKey(), r4.getValue());
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x0146, code lost:
    
        return kotlin.collections.MapsKt.mapOf(r5, r6, r7, r8, kotlin.TuplesKt.to("su_binary_paths", kotlin.collections.CollectionsKt.toList(r2.keySet())), kotlin.TuplesKt.to("su_paths_checked", kotlin.collections.CollectionsKt.toList(r1.keySet())), kotlin.TuplesKt.to("test_keys_present", java.lang.Boolean.valueOf(r0)), kotlin.TuplesKt.to("build_type", android.os.Build.TYPE), kotlin.TuplesKt.to("build_user", android.os.Build.USER), kotlin.TuplesKt.to("build_host", android.os.Build.HOST), kotlin.TuplesKt.to("build_fingerprint", android.os.Build.FINGERPRINT));
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x00a4, code lost:
    
        if (r3 == false) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x00a6, code lost:
    
        if (r0 != false) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x00a8, code lost:
    
        r2 = 0.6d;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x00ae, code lost:
    
        if (r3 != false) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x00b0, code lost:
    
        if (r0 == false) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x00b2, code lost:
    
        r2 = 0.7d;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x00b8, code lost:
    
        r2 = 0.3d;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x0080, code lost:
    
        if (r0 != false) goto L25;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static Map a() {
        boolean z10;
        String[] strArr = {"/system/app/Superuser.apk", "/sbin/su", "/system/bin/su", "/system/xbin/su", "/system/bin/.ext/.su", "/system/usr/we-need-root/su-backup", "/system/xbin/mu", "/data/local/xbin/su", "/data/local/bin/su", "/data/local/su", "/su/bin/su"};
        LinkedHashMap linkedHashMap = new LinkedHashMap(RangesKt.coerceAtLeast(MapsKt.mapCapacity(11), 16));
        boolean z11 = false;
        for (int i10 = 0; i10 < 11; i10++) {
            String str = strArr[i10];
            try {
                z10 = new File(str).exists();
            } catch (Exception unused) {
                z10 = false;
            }
            linkedHashMap.put(str, Boolean.valueOf(z10));
        }
        String str2 = Build.TAGS;
        boolean z12 = str2 != null && StringsKt.contains$default((CharSequence) str2, (CharSequence) "test-keys", false, 2, (Object) null);
        if (!linkedHashMap.isEmpty()) {
            Iterator it = linkedHashMap.entrySet().iterator();
            while (it.hasNext()) {
                if (((Boolean) ((Map.Entry) it.next()).getValue()).booleanValue()) {
                    break;
                }
            }
        }
    }
}
