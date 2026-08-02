package com.ironsource;

import android.content.Context;
import android.content.pm.PackageManager;
import android.text.TextUtils;
import android.util.Log;
import com.applovin.sdk.AppLovinMediationProvider;
import com.facebook.AccessToken;
import com.ironsource.environment.StringUtils;
import com.unity3d.mediation.adapters.levelplay.LevelPlayBaseAdapter;
import com.vungle.ads.BuildConfig;

/* renamed from: com.ironsource.q9, reason: case insensitive filesystem */
/* loaded from: classes.dex */
class C2615q9 {
    private static final String a = "IntegrationHelper";
    private static final String b = "getNetworkSDKVersion";
    private static final String c = "getAdapterSDKVersion";
    private static final String d = "getAdapterVersion";
    private static final String e = "getVersion";

    /* renamed from: com.ironsource.q9$a */
    class a extends Thread {
        final /* synthetic */ Context a;

        a(Context context) {
            this.a = context;
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public void run() {
            try {
                Log.w(C2615q9.a, "--------------- Google Play Services --------------");
                if (!this.a.getPackageManager().getApplicationInfo(this.a.getPackageName(), 128).metaData.containsKey("com.google.android.gms.version")) {
                    Log.e(C2615q9.a, "Google Play Services - MISSING");
                    return;
                }
                Log.i(C2615q9.a, "Google Play Services - VERIFIED");
                String b = com.ironsource.mediationsdk.p.h().b(this.a);
                if (TextUtils.isEmpty(b)) {
                    return;
                }
                Log.i(C2615q9.a, "GAID is: " + b + " (use this for test devices)");
            } catch (Exception e) {
                C2556n4.d().a(e);
                Log.e(C2615q9.a, "Google Play Services - MISSING");
            }
        }
    }

    C2615q9() {
    }

    /* JADX WARN: Can't wrap try/catch for region: R(7:(9:38|(1:(1:(1:14)(1:33))(1:34))(1:35)|15|16|17|18|19|20|21)|16|17|18|19|20|21) */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x00a8, code lost:
    
        r0 = r0.getConstructor(null).newInstance(null);
     */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0043  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x006a A[Catch: Exception -> 0x00d3, TryCatch #2 {Exception -> 0x00d3, blocks: (B:3:0x0007, B:14:0x0047, B:15:0x006f, B:20:0x00b0, B:31:0x00b8, B:28:0x00c6, B:33:0x005e, B:34:0x0064, B:35:0x006a, B:36:0x0021, B:39:0x002b, B:42:0x0035, B:17:0x0090, B:19:0x0094, B:25:0x00a8), top: B:2:0x0007, inners: #4 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static boolean a(Context context, String str) {
        char c2;
        try {
            String lowerCase = StringUtils.toLowerCase(str);
            int hashCode = lowerCase.hashCode();
            if (hashCode == -805296079) {
                if (lowerCase.equals("vungle")) {
                    c2 = 2;
                    if (c2 != 0) {
                    }
                    Class<?> cls = Class.forName("com.ironsource.adapters." + StringUtils.toLowerCase(str) + "." + str + "Adapter");
                    Object newInstance = cls.getDeclaredConstructor(String.class).newInstance(str);
                    b(newInstance);
                    a(newInstance);
                    return true;
                }
                c2 = 65535;
                if (c2 != 0) {
                }
                Class<?> cls2 = Class.forName("com.ironsource.adapters." + StringUtils.toLowerCase(str) + "." + str + "Adapter");
                Object newInstance2 = cls2.getDeclaredConstructor(String.class).newInstance(str);
                b(newInstance2);
                a(newInstance2);
                return true;
            }
            if (hashCode == 92668925) {
                if (lowerCase.equals(AppLovinMediationProvider.ADMOB)) {
                    c2 = 1;
                    if (c2 != 0) {
                    }
                    Class<?> cls22 = Class.forName("com.ironsource.adapters." + StringUtils.toLowerCase(str) + "." + str + "Adapter");
                    Object newInstance22 = cls22.getDeclaredConstructor(String.class).newInstance(str);
                    b(newInstance22);
                    a(newInstance22);
                    return true;
                }
                c2 = 65535;
                if (c2 != 0) {
                }
                Class<?> cls222 = Class.forName("com.ironsource.adapters." + StringUtils.toLowerCase(str) + "." + str + "Adapter");
                Object newInstance222 = cls222.getDeclaredConstructor(String.class).newInstance(str);
                b(newInstance222);
                a(newInstance222);
                return true;
            }
            try {
                if (hashCode == 497130182 && lowerCase.equals(AccessToken.DEFAULT_GRAPH_DOMAIN)) {
                    c2 = 0;
                    if (c2 != 0) {
                        Log.i(a, "--------------- Meta --------------");
                    } else if (c2 == 1) {
                        Log.i(a, "--------------- Google (AdMob and Ad Manager) --------------");
                    } else if (c2 != 2) {
                        Log.i(a, "--------------- " + str + " --------------");
                    } else {
                        Log.i(a, "--------------- Liftoff Monetization --------------");
                    }
                    Class<?> cls2222 = Class.forName("com.ironsource.adapters." + StringUtils.toLowerCase(str) + "." + str + "Adapter");
                    Object newInstance2222 = cls2222.getDeclaredConstructor(String.class).newInstance(str);
                    b(newInstance2222);
                    a(newInstance2222);
                    return true;
                }
                Class<?> cls22222 = Class.forName("com.ironsource.adapters." + StringUtils.toLowerCase(str) + "." + str + "Adapter");
                Object newInstance22222 = cls22222.getDeclaredConstructor(String.class).newInstance(str);
                b(newInstance22222);
                a(newInstance22222);
                return true;
            } catch (ClassNotFoundException e2) {
                C2556n4.d().a(e2);
                Log.e(a, "Adapter - MISSING");
                return false;
            } catch (Exception e3) {
                C2556n4.d().a(e3);
                Log.e(a, "Failed to instantiate adapter");
                return false;
            }
            c2 = 65535;
            if (c2 != 0) {
            }
        } catch (Exception e4) {
            C2556n4.d().a(e4);
            Log.e(a, "isAdapterValid " + str, e4);
            return false;
        }
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue
    java.lang.NullPointerException: Cannot invoke "java.util.List.iterator()" because the return value of "jadx.core.dex.visitors.regions.SwitchOverStringVisitor$SwitchData.getNewCases()" is null
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.restoreSwitchOverString(SwitchOverStringVisitor.java:109)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visitRegion(SwitchOverStringVisitor.java:66)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:77)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:82)
     */
    static void b(Context context) {
        Log.i(a, "Verifying Integration:");
        c(context);
        String[] strArr = {"AppLovin", "APS", "BidMachine", "Bigo", "Chartboost", "Fyber", "AdMob", "HyprMX", "InMobi", "IronSource", BuildConfig.OMSDK_PARTNER_NAME, "Line", "Facebook", "Mintegral", "MobileFuse", "Moloco", "MyTarget", "Ogury", "Pangle", "PubMatic", "Smaato", "SuperAwesome", M6.J1, "Verve", "Yandex", "YSO"};
        for (int i = 0; i < 26; i++) {
            String str = strArr[i];
            if (a(context, str)) {
                String lowerCase = StringUtils.toLowerCase(str);
                lowerCase.hashCode();
                lowerCase.hashCode();
                switch (lowerCase.hashCode()) {
                    case -805296079:
                        if (lowerCase.equals("vungle")) {
                            break;
                        }
                        break;
                    case 92668925:
                        if (lowerCase.equals(AppLovinMediationProvider.ADMOB)) {
                            break;
                        }
                        break;
                    case 497130182:
                        if (lowerCase.equals(AccessToken.DEFAULT_GRAPH_DOMAIN)) {
                            break;
                        }
                        break;
                }
                /*  JADX ERROR: Method code generation error
                    java.lang.NullPointerException: Switch insn not found in header
                    	at java.base/java.util.Objects.requireNonNull(Objects.java:259)
                    	at jadx.core.codegen.RegionGen.makeSwitch(RegionGen.java:246)
                    	at jadx.core.dex.regions.SwitchRegion.generate(SwitchRegion.java:84)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                    	at jadx.core.dex.regions.Region.generate(Region.java:35)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                    	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:83)
                    	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:126)
                    	at jadx.core.dex.regions.conditions.IfRegion.generate(IfRegion.java:90)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                    	at jadx.core.dex.regions.Region.generate(Region.java:35)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                    	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:83)
                    	at jadx.core.codegen.RegionGen.makeLoop(RegionGen.java:195)
                    	at jadx.core.dex.regions.loops.LoopRegion.generate(LoopRegion.java:171)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                    	at jadx.core.dex.regions.Region.generate(Region.java:35)
                    	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                    	at jadx.core.codegen.MethodGen.addRegionInsns(MethodGen.java:297)
                    	at jadx.core.codegen.MethodGen.addInstructions(MethodGen.java:276)
                    	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:406)
                    	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:335)
                    	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$3(ClassGen.java:301)
                    	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:184)
                    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
                    	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
                    	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:261)
                    */
                /*
                    Method dump skipped, instructions count: 416
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: com.ironsource.C2615q9.b(android.content.Context):void");
            }

            private static void c(Context context) {
                Log.i(a, "*** Permissions ***");
                PackageManager packageManager = context.getPackageManager();
                if (packageManager.checkPermission("android.permission.INTERNET", context.getPackageName()) == 0) {
                    Log.i(a, "android.permission.INTERNET - VERIFIED");
                } else {
                    Log.e(a, "android.permission.INTERNET - MISSING");
                }
                if (packageManager.checkPermission("android.permission.ACCESS_NETWORK_STATE", context.getPackageName()) == 0) {
                    Log.i(a, "android.permission.ACCESS_NETWORK_STATE - VERIFIED");
                } else {
                    Log.e(a, "android.permission.ACCESS_NETWORK_STATE - MISSING");
                }
            }

            private static void a(Context context) {
                new a(context).start();
            }

            private static void b(Object obj) {
                String str;
                try {
                    Class<?> cls = obj.getClass();
                    if (obj instanceof LevelPlayBaseAdapter) {
                        str = b;
                    } else {
                        str = c;
                    }
                    Log.i(a, "SDK Version - " + ((String) cls.getMethod(str, null).invoke(obj, null)));
                } catch (Exception e2) {
                    C2556n4.d().a(e2);
                    Log.w(a, "Unable to get SDK version");
                }
            }

            private static void a(Object obj) {
                try {
                    Log.i(a, "Adapter Version - " + ((String) obj.getClass().getMethod(obj instanceof LevelPlayBaseAdapter ? d : "getVersion", null).invoke(obj, null)));
                } catch (Exception e2) {
                    C2556n4.d().a(e2);
                    Log.w(a, "Unable to get adapter version");
                }
            }
        }
