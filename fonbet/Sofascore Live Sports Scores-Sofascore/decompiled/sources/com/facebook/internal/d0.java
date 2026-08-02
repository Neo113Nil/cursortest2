package com.facebook.internal;

import android.content.ContentResolver;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ProviderInfo;
import android.content.pm.ResolveInfo;
import android.database.Cursor;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import com.blaze.blazesdk.data_source.BlazeDataSourcePersonalizedType;
import defpackage.cw3;
import defpackage.ph0;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public final class d0 {
    public static final d0 a;
    public static final ArrayList b;
    public static final AtomicBoolean c;
    public static final Integer[] d;

    static {
        d0 d0Var = new d0();
        a = d0Var;
        b = d0Var.a();
        int i = 0;
        ArrayList arrayList = null;
        if (!cw3.a.contains(d0Var)) {
            try {
                ArrayList e = kotlin.collections.b.e(new b0(i));
                e.addAll(d0Var.a());
                arrayList = e;
            } catch (Throwable th) {
                cw3.a(d0Var, th);
            }
        }
        d0 d0Var2 = a;
        if (!cw3.a.contains(d0Var2)) {
            try {
                HashMap hashMap = new HashMap();
                ArrayList arrayList2 = new ArrayList();
                arrayList2.add(new b0(3));
                ArrayList arrayList3 = b;
                hashMap.put("com.facebook.platform.action.request.OGACTIONPUBLISH_DIALOG", arrayList3);
                hashMap.put("com.facebook.platform.action.request.FEED_DIALOG", arrayList3);
                hashMap.put("com.facebook.platform.action.request.LIKE_DIALOG", arrayList3);
                hashMap.put("com.facebook.platform.action.request.APPINVITES_DIALOG", arrayList3);
                hashMap.put("com.facebook.platform.action.request.MESSAGE_DIALOG", arrayList2);
                hashMap.put("com.facebook.platform.action.request.OGMESSAGEPUBLISH_DIALOG", arrayList2);
                hashMap.put("com.facebook.platform.action.request.CAMERA_EFFECT", arrayList);
                hashMap.put("com.facebook.platform.action.request.SHARE_STORY", arrayList3);
            } catch (Throwable th2) {
                cw3.a(d0Var2, th2);
            }
        }
        c = new AtomicBoolean(false);
        d = new Integer[]{20210906, 20171115, 20170417, 20170411, 20170213, 20161017, 20160327, 20150702, 20150401, 20141218, 20141107, 20141028, 20141001, 20140701, 20140324, 20140313, 20140204, 20131107, 20131024, 20130618, 20130502, 20121101};
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x004b, code lost:
    
        if ((r3 % 2) != 0) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0051, code lost:
    
        return java.lang.Math.min(r4, r9);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final int b(TreeSet treeSet, int i, int[] iArr) {
        if (cw3.a.contains(d0.class)) {
            return 0;
        }
        if (treeSet != null) {
            try {
                int length = iArr.length - 1;
                Iterator descendingIterator = treeSet.descendingIterator();
                int i2 = -1;
                while (true) {
                    if (!descendingIterator.hasNext()) {
                        break;
                    }
                    Integer num = (Integer) descendingIterator.next();
                    num.getClass();
                    i2 = Math.max(i2, num.intValue());
                    while (length >= 0 && iArr[length] > num.intValue()) {
                        length--;
                    }
                    if (length < 0) {
                        break;
                    }
                    if (iArr[length] == num.intValue()) {
                        break;
                    }
                }
            } catch (Throwable th) {
                cw3.a(d0.class, th);
                return 0;
            }
        }
        return -1;
    }

    public static Intent d(b0 b0Var, String str, Collection collection, String str2, boolean z, int i, String str3, String str4, boolean z2, String str5, boolean z3, int i2, boolean z4, boolean z5, String str6, String str7, String str8, boolean z6, String str9, int i3) {
        d0 d0Var = a;
        if (cw3.a.contains(d0.class)) {
            return null;
        }
        try {
            return d0Var.c(b0Var, str, collection, str2, z, i, str3, str4, z2, str5, z3, i2, z4, z5, str6, str7, str8, (i3 & 524288) != 0 ? false : z6, (i3 & 2097152) != 0 ? null : str9);
        } catch (Throwable th) {
            cw3.a(d0.class, th);
            return null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0064 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:16:? A[LOOP:0: B:7:0x0015->B:16:?, LOOP_END, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Intent e(Context context) {
        ResolveInfo resolveService;
        if (!cw3.a.contains(d0.class)) {
            try {
                context.getClass();
                Iterator it = b.iterator();
                while (it.hasNext()) {
                    Intent addCategory = new Intent("com.facebook.platform.PLATFORM_SERVICE").setPackage(((b0) it.next()).b()).addCategory("android.intent.category.DEFAULT");
                    if (!cw3.a.contains(d0.class) && addCategory != null) {
                        try {
                            resolveService = context.getPackageManager().resolveService(addCategory, 0);
                        } catch (Throwable th) {
                            cw3.a(d0.class, th);
                        }
                        if (resolveService != null) {
                            String str = resolveService.serviceInfo.packageName;
                            str.getClass();
                            if (l.a(context, str)) {
                                if (addCategory == null) {
                                    return addCategory;
                                }
                            }
                        }
                    }
                    addCategory = null;
                    if (addCategory == null) {
                    }
                }
            } catch (Throwable th2) {
                cw3.a(d0.class, th2);
                return null;
            }
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x004b A[Catch: all -> 0x0096, TryCatch #1 {all -> 0x0096, blocks: (B:6:0x000c, B:11:0x004b, B:13:0x0067, B:16:0x0092, B:23:0x008e, B:24:0x0098, B:26:0x009d, B:44:0x0044, B:30:0x001b, B:32:0x0025, B:34:0x002b, B:37:0x003c, B:39:0x0041, B:41:0x0034, B:18:0x0073, B:20:0x0085), top: B:5:0x000c, inners: #0, #3 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Intent f(Intent intent, Bundle bundle, com.facebook.q qVar) {
        String stringExtra;
        UUID fromString;
        Bundle bundle2;
        Set set = cw3.a;
        if (!set.contains(d0.class)) {
            try {
                intent.getClass();
                if (!set.contains(d0.class)) {
                    try {
                        if (l(k(intent))) {
                            Bundle bundleExtra = intent.getBundleExtra("com.facebook.platform.protocol.BRIDGE_ARGS");
                            stringExtra = bundleExtra != null ? bundleExtra.getString("action_id") : null;
                        } else {
                            stringExtra = intent.getStringExtra("com.facebook.platform.protocol.CALL_ID");
                        }
                    } catch (Throwable th) {
                        cw3.a(d0.class, th);
                    }
                    if (stringExtra != null) {
                        try {
                            fromString = UUID.fromString(stringExtra);
                        } catch (IllegalArgumentException unused) {
                            com.facebook.w wVar = com.facebook.w.a;
                        }
                        if (fromString != null) {
                            Intent intent2 = new Intent();
                            intent2.putExtra("com.facebook.platform.protocol.PROTOCOL_VERSION", k(intent));
                            Bundle bundle3 = new Bundle();
                            bundle3.putString("action_id", fromString.toString());
                            if (qVar != null) {
                                if (!cw3.a.contains(d0.class)) {
                                    try {
                                        bundle2 = new Bundle();
                                        bundle2.putString("error_description", qVar.toString());
                                        if (qVar instanceof com.facebook.s) {
                                            bundle2.putString("error_type", "UserCanceled");
                                        }
                                    } catch (Throwable th2) {
                                        cw3.a(d0.class, th2);
                                    }
                                    bundle3.putBundle("error", bundle2);
                                }
                                bundle2 = null;
                                bundle3.putBundle("error", bundle2);
                            }
                            intent2.putExtra("com.facebook.platform.protocol.BRIDGE_ARGS", bundle3);
                            if (bundle != null) {
                                intent2.putExtra("com.facebook.platform.protocol.RESULT_ARGS", bundle);
                            }
                            return intent2;
                        }
                    }
                }
                fromString = null;
                if (fromString != null) {
                }
            } catch (Throwable th3) {
                cw3.a(d0.class, th3);
                return null;
            }
        }
        return null;
    }

    public static final int i() {
        if (cw3.a.contains(d0.class)) {
            return 0;
        }
        try {
            return d[0].intValue();
        } catch (Throwable th) {
            cw3.a(d0.class, th);
            return 0;
        }
    }

    public static final Bundle j(Intent intent) {
        if (cw3.a.contains(d0.class)) {
            return null;
        }
        try {
            intent.getClass();
            return !l(k(intent)) ? intent.getExtras() : intent.getBundleExtra("com.facebook.platform.protocol.METHOD_ARGS");
        } catch (Throwable th) {
            cw3.a(d0.class, th);
            return null;
        }
    }

    public static final int k(Intent intent) {
        if (cw3.a.contains(d0.class)) {
            return 0;
        }
        try {
            intent.getClass();
            return intent.getIntExtra("com.facebook.platform.protocol.PROTOCOL_VERSION", 0);
        } catch (Throwable th) {
            cw3.a(d0.class, th);
            return 0;
        }
    }

    public static final boolean l(int i) {
        if (cw3.a.contains(d0.class)) {
            return false;
        }
        try {
            return ph0.v(d, Integer.valueOf(i)) && i >= 20140701;
        } catch (Throwable th) {
            cw3.a(d0.class, th);
            return false;
        }
    }

    public static final void m() {
        if (cw3.a.contains(d0.class)) {
            return;
        }
        try {
            if (c.compareAndSet(false, true)) {
                com.facebook.w.c().execute(new com.appsflyer.internal.w(6));
            }
        } catch (Throwable th) {
            cw3.a(d0.class, th);
        }
    }

    public final ArrayList a() {
        if (cw3.a.contains(this)) {
            return null;
        }
        try {
            return kotlin.collections.b.e(new b0(2), new b0(4));
        } catch (Throwable th) {
            cw3.a(this, th);
            return null;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:53:0x00ed, code lost:
    
        if (r26.length() != 0) goto L53;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x00f4, code lost:
    
        if (r4.contains(r9) == false) goto L72;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x00f6, code lost:
    
        r10 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x0103, code lost:
    
        r11.putExtra("intent_uri_package_target", r10);
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x00f8, code lost:
    
        r10 = "intent://".concat(r26);
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x00fd, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x00ff, code lost:
    
        defpackage.cw3.a(r9, r0);
     */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0053 A[Catch: all -> 0x004c, TryCatch #0 {all -> 0x004c, blocks: (B:6:0x0012, B:12:0x0021, B:14:0x0043, B:19:0x0053, B:20:0x0060, B:22:0x0066, B:23:0x006b, B:24:0x0076, B:26:0x007e, B:28:0x0091, B:29:0x009a, B:31:0x00ac, B:32:0x00b1, B:34:0x00c1, B:36:0x00cc, B:38:0x00d3, B:40:0x00da, B:43:0x00e1, B:45:0x010a, B:48:0x0111, B:52:0x00e9, B:55:0x00f0, B:58:0x0103, B:64:0x00ff, B:60:0x00f8), top: B:5:0x0012, inners: #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0066 A[Catch: all -> 0x004c, TryCatch #0 {all -> 0x004c, blocks: (B:6:0x0012, B:12:0x0021, B:14:0x0043, B:19:0x0053, B:20:0x0060, B:22:0x0066, B:23:0x006b, B:24:0x0076, B:26:0x007e, B:28:0x0091, B:29:0x009a, B:31:0x00ac, B:32:0x00b1, B:34:0x00c1, B:36:0x00cc, B:38:0x00d3, B:40:0x00da, B:43:0x00e1, B:45:0x010a, B:48:0x0111, B:52:0x00e9, B:55:0x00f0, B:58:0x0103, B:64:0x00ff, B:60:0x00f8), top: B:5:0x0012, inners: #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0091 A[Catch: all -> 0x004c, TryCatch #0 {all -> 0x004c, blocks: (B:6:0x0012, B:12:0x0021, B:14:0x0043, B:19:0x0053, B:20:0x0060, B:22:0x0066, B:23:0x006b, B:24:0x0076, B:26:0x007e, B:28:0x0091, B:29:0x009a, B:31:0x00ac, B:32:0x00b1, B:34:0x00c1, B:36:0x00cc, B:38:0x00d3, B:40:0x00da, B:43:0x00e1, B:45:0x010a, B:48:0x0111, B:52:0x00e9, B:55:0x00f0, B:58:0x0103, B:64:0x00ff, B:60:0x00f8), top: B:5:0x0012, inners: #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00ac A[Catch: all -> 0x004c, TryCatch #0 {all -> 0x004c, blocks: (B:6:0x0012, B:12:0x0021, B:14:0x0043, B:19:0x0053, B:20:0x0060, B:22:0x0066, B:23:0x006b, B:24:0x0076, B:26:0x007e, B:28:0x0091, B:29:0x009a, B:31:0x00ac, B:32:0x00b1, B:34:0x00c1, B:36:0x00cc, B:38:0x00d3, B:40:0x00da, B:43:0x00e1, B:45:0x010a, B:48:0x0111, B:52:0x00e9, B:55:0x00f0, B:58:0x0103, B:64:0x00ff, B:60:0x00f8), top: B:5:0x0012, inners: #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00c1 A[Catch: all -> 0x004c, TryCatch #0 {all -> 0x004c, blocks: (B:6:0x0012, B:12:0x0021, B:14:0x0043, B:19:0x0053, B:20:0x0060, B:22:0x0066, B:23:0x006b, B:24:0x0076, B:26:0x007e, B:28:0x0091, B:29:0x009a, B:31:0x00ac, B:32:0x00b1, B:34:0x00c1, B:36:0x00cc, B:38:0x00d3, B:40:0x00da, B:43:0x00e1, B:45:0x010a, B:48:0x0111, B:52:0x00e9, B:55:0x00f0, B:58:0x0103, B:64:0x00ff, B:60:0x00f8), top: B:5:0x0012, inners: #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00cc A[Catch: all -> 0x004c, TryCatch #0 {all -> 0x004c, blocks: (B:6:0x0012, B:12:0x0021, B:14:0x0043, B:19:0x0053, B:20:0x0060, B:22:0x0066, B:23:0x006b, B:24:0x0076, B:26:0x007e, B:28:0x0091, B:29:0x009a, B:31:0x00ac, B:32:0x00b1, B:34:0x00c1, B:36:0x00cc, B:38:0x00d3, B:40:0x00da, B:43:0x00e1, B:45:0x010a, B:48:0x0111, B:52:0x00e9, B:55:0x00f0, B:58:0x0103, B:64:0x00ff, B:60:0x00f8), top: B:5:0x0012, inners: #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00d3 A[Catch: all -> 0x004c, TryCatch #0 {all -> 0x004c, blocks: (B:6:0x0012, B:12:0x0021, B:14:0x0043, B:19:0x0053, B:20:0x0060, B:22:0x0066, B:23:0x006b, B:24:0x0076, B:26:0x007e, B:28:0x0091, B:29:0x009a, B:31:0x00ac, B:32:0x00b1, B:34:0x00c1, B:36:0x00cc, B:38:0x00d3, B:40:0x00da, B:43:0x00e1, B:45:0x010a, B:48:0x0111, B:52:0x00e9, B:55:0x00f0, B:58:0x0103, B:64:0x00ff, B:60:0x00f8), top: B:5:0x0012, inners: #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:45:0x010a A[Catch: all -> 0x004c, TryCatch #0 {all -> 0x004c, blocks: (B:6:0x0012, B:12:0x0021, B:14:0x0043, B:19:0x0053, B:20:0x0060, B:22:0x0066, B:23:0x006b, B:24:0x0076, B:26:0x007e, B:28:0x0091, B:29:0x009a, B:31:0x00ac, B:32:0x00b1, B:34:0x00c1, B:36:0x00cc, B:38:0x00d3, B:40:0x00da, B:43:0x00e1, B:45:0x010a, B:48:0x0111, B:52:0x00e9, B:55:0x00f0, B:58:0x0103, B:64:0x00ff, B:60:0x00f8), top: B:5:0x0012, inners: #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:65:0x007c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Intent c(b0 b0Var, String str, Collection collection, String str2, boolean z, int i, String str3, String str4, boolean z2, String str5, boolean z3, int i2, boolean z4, boolean z5, String str6, String str7, String str8, boolean z6, String str9) {
        boolean z7;
        String str10;
        Set set = cw3.a;
        if (!set.contains(this)) {
            try {
                String str11 = "com.facebook.katana.ProxyAuth";
                switch (b0Var.b) {
                    case 0:
                    case 3:
                        str11 = null;
                        break;
                    case 1:
                        str11 = "com.instagram.platform.AppAuthorizeActivity";
                        break;
                }
                if (str11 != null) {
                    Intent putExtra = new Intent().setClassName(b0Var.b(), str11).putExtra("client_id", str);
                    putExtra.getClass();
                    com.facebook.w wVar = com.facebook.w.a;
                    putExtra.putExtra("facebook_sdk_version", "18.3.0");
                    if (collection != null && !collection.isEmpty()) {
                        z7 = false;
                        if (!z7) {
                            putExtra.putExtra("scope", TextUtils.join(BlazeDataSourcePersonalizedType.STRING_SEPARATOR, collection));
                        }
                        if (!k0.A(str2)) {
                            putExtra.putExtra("e2e", str2);
                        }
                        putExtra.putExtra("state", str3);
                        switch (b0Var.b) {
                            case 1:
                                str10 = "token,signed_request,graph_domain,granted_scopes";
                                break;
                            default:
                                str10 = "id_token,token,signed_request,graph_domain";
                                break;
                        }
                        putExtra.putExtra("response_type", str10);
                        putExtra.putExtra("nonce", str6);
                        putExtra.putExtra("return_scopes", "true");
                        if (z) {
                            putExtra.putExtra("default_audience", com.appsflyer.internal.i.d(i));
                        }
                        putExtra.putExtra("legacy_override", com.facebook.w.d());
                        putExtra.putExtra("auth_type", str4);
                        if (z2) {
                            putExtra.putExtra("fail_on_logged_out", true);
                        }
                        putExtra.putExtra("messenger_page_id", str5);
                        putExtra.putExtra("reset_messenger_state", z3);
                        if (z4) {
                            putExtra.putExtra("fx_app", com.appsflyer.internal.i.e(i2));
                        }
                        if (z5) {
                            putExtra.putExtra("skip_dedupe", true);
                        }
                        if (z6) {
                            putExtra.putExtra("force_confirmation", true);
                        }
                        if (str7 != null && str7.length() != 0) {
                            putExtra.putExtra("https_redirect_uri", str7);
                            if (str9 != null && str9.length() != 0) {
                                putExtra.putExtra("android_sso_context", str9);
                            }
                            return putExtra;
                        }
                        if (str9 != null) {
                            putExtra.putExtra("android_sso_context", str9);
                        }
                        return putExtra;
                    }
                    z7 = true;
                    if (!z7) {
                    }
                    if (!k0.A(str2)) {
                    }
                    putExtra.putExtra("state", str3);
                    switch (b0Var.b) {
                    }
                    putExtra.putExtra("response_type", str10);
                    putExtra.putExtra("nonce", str6);
                    putExtra.putExtra("return_scopes", "true");
                    if (z) {
                    }
                    putExtra.putExtra("legacy_override", com.facebook.w.d());
                    putExtra.putExtra("auth_type", str4);
                    if (z2) {
                    }
                    putExtra.putExtra("messenger_page_id", str5);
                    putExtra.putExtra("reset_messenger_state", z3);
                    if (z4) {
                    }
                    if (z5) {
                    }
                    if (z6) {
                    }
                    if (str7 != null) {
                        putExtra.putExtra("https_redirect_uri", str7);
                        if (str9 != null) {
                        }
                        return putExtra;
                    }
                    if (str9 != null) {
                    }
                    return putExtra;
                }
            } catch (Throwable th) {
                cw3.a(this, th);
                return null;
            }
        }
        return null;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(9:(11:41|42|43|9|10|11|12|13|(4:15|16|17|(2:(3:25|22|23)|26))(1:36)|(1:20)|21)|9|10|11|12|13|(0)(0)|(0)|21) */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x0066, code lost:
    
        r14 = null;
     */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0092 A[Catch: all -> 0x0096, TRY_ENTER, TryCatch #2 {all -> 0x0096, blocks: (B:6:0x000e, B:31:0x009c, B:32:0x009f, B:20:0x0092, B:46:0x0048, B:42:0x0029), top: B:5:0x000e, inners: #3 }] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x008f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final TreeSet g(b0 b0Var) {
        Uri uri;
        Throwable th;
        Cursor cursor;
        ProviderInfo providerInfo;
        Cursor cursor2;
        Set set = cw3.a;
        if (set.contains(this)) {
            return null;
        }
        try {
            TreeSet treeSet = new TreeSet();
            ContentResolver contentResolver = com.facebook.w.a().getContentResolver();
            String[] strArr = {"version"};
            try {
                if (!set.contains(this)) {
                    try {
                        Uri parse = Uri.parse("content://" + b0Var.b() + ".provider.PlatformProvider/versions");
                        parse.getClass();
                        uri = parse;
                    } catch (Throwable th2) {
                        cw3.a(this, th2);
                    }
                    providerInfo = com.facebook.w.a().getPackageManager().resolveContentProvider(b0Var.b().concat(".provider.PlatformProvider"), 0);
                    if (providerInfo == null) {
                        try {
                            cursor2 = contentResolver.query(uri, strArr, null, null, null);
                        } catch (IllegalArgumentException | NullPointerException | SecurityException unused) {
                            cursor2 = null;
                        }
                        if (cursor2 != null) {
                            while (cursor2.moveToNext()) {
                                try {
                                    treeSet.add(Integer.valueOf(cursor2.getInt(cursor2.getColumnIndex("version"))));
                                } catch (Throwable th3) {
                                    cursor = cursor2;
                                    th = th3;
                                    if (cursor == null) {
                                        throw th;
                                    }
                                    cursor.close();
                                    throw th;
                                }
                            }
                        }
                    } else {
                        cursor2 = null;
                    }
                    if (cursor2 != null) {
                        cursor2.close();
                    }
                    return treeSet;
                }
                providerInfo = com.facebook.w.a().getPackageManager().resolveContentProvider(b0Var.b().concat(".provider.PlatformProvider"), 0);
                if (providerInfo == null) {
                }
                if (cursor2 != null) {
                }
                return treeSet;
            } catch (Throwable th4) {
                th = th4;
                cursor = null;
            }
            uri = null;
        } catch (Throwable th5) {
            cw3.a(this, th5);
            return null;
        }
    }

    public final c0 h(List list, int[] iArr) {
        if (cw3.a.contains(this)) {
            return null;
        }
        try {
            m();
            if (list == null) {
                c0 c0Var = new c0();
                c0Var.a = -1;
                return c0Var;
            }
            Iterator it = list.iterator();
            while (it.hasNext()) {
                b0 b0Var = (b0) it.next();
                TreeSet treeSet = b0Var.a;
                if (treeSet == null || treeSet.isEmpty()) {
                    b0Var.a(false);
                }
                int b2 = b(b0Var.a, i(), iArr);
                if (b2 != -1) {
                    c0 c0Var2 = new c0();
                    c0Var2.a = b2;
                    return c0Var2;
                }
            }
            c0 c0Var3 = new c0();
            c0Var3.a = -1;
            return c0Var3;
        } catch (Throwable th) {
            cw3.a(this, th);
            return null;
        }
    }
}
