package io.seon.androidsdk.service;

import android.content.Context;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.content.pm.ServiceInfo;
import android.os.Build;
import android.text.TextUtils;
import android.util.Base64;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.InputStreamReader;
import java.lang.reflect.Method;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: io.seon.androidsdk.service.y1, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C5071y1 extends AbstractC4950j {

    /* renamed from: A, reason: collision with root package name */
    public static final String[] f53533A;

    /* renamed from: B, reason: collision with root package name */
    public static final String f53534B;

    /* renamed from: C, reason: collision with root package name */
    public static final String f53535C;

    /* renamed from: D, reason: collision with root package name */
    public static final String f53536D;

    /* renamed from: E, reason: collision with root package name */
    public static final String f53537E;

    /* renamed from: F, reason: collision with root package name */
    public static final String f53538F;

    /* renamed from: G, reason: collision with root package name */
    public static final String f53539G;

    /* renamed from: H, reason: collision with root package name */
    public static final String f53540H;

    /* renamed from: I, reason: collision with root package name */
    public static final String f53541I;

    /* renamed from: J, reason: collision with root package name */
    public static final String f53542J;

    /* renamed from: K, reason: collision with root package name */
    public static final String f53543K;

    /* renamed from: L, reason: collision with root package name */
    public static final String f53544L;

    /* renamed from: M, reason: collision with root package name */
    public static final String f53545M;

    /* renamed from: N, reason: collision with root package name */
    public static final String f53546N;

    /* renamed from: O, reason: collision with root package name */
    public static final String f53547O;

    /* renamed from: P, reason: collision with root package name */
    public static final String f53548P;

    /* renamed from: Q, reason: collision with root package name */
    public static final String f53549Q;

    /* renamed from: R, reason: collision with root package name */
    public static final String f53550R;

    /* renamed from: S, reason: collision with root package name */
    public static final String f53551S;

    /* renamed from: T, reason: collision with root package name */
    public static final String f53552T;

    /* renamed from: U, reason: collision with root package name */
    public static final String f53553U;

    /* renamed from: V, reason: collision with root package name */
    public static final String f53554V;

    /* renamed from: W, reason: collision with root package name */
    public static final String f53555W;

    /* renamed from: X, reason: collision with root package name */
    public static final String f53556X;

    /* renamed from: Y, reason: collision with root package name */
    public static final String f53557Y;

    /* renamed from: Z, reason: collision with root package name */
    public static final String f53558Z;

    /* renamed from: a0, reason: collision with root package name */
    public static final String f53559a0;

    /* renamed from: j, reason: collision with root package name */
    public static String[] f53561j;

    /* renamed from: r, reason: collision with root package name */
    public static final String f53564r;

    /* renamed from: s, reason: collision with root package name */
    public static final String[] f53565s;

    /* renamed from: t, reason: collision with root package name */
    public static final String[] f53566t;

    /* renamed from: u, reason: collision with root package name */
    public static final String[] f53567u;

    /* renamed from: v, reason: collision with root package name */
    public static final String[] f53568v;

    /* renamed from: w, reason: collision with root package name */
    public static final String[] f53569w;

    /* renamed from: x, reason: collision with root package name */
    public static final String[] f53570x;

    /* renamed from: y, reason: collision with root package name */
    public static final String[] f53571y;

    /* renamed from: z, reason: collision with root package name */
    public static final String[] f53572z;

    /* renamed from: e, reason: collision with root package name */
    public Context f53573e;

    /* renamed from: g, reason: collision with root package name */
    public Integer f53574g = null;

    /* renamed from: n, reason: collision with root package name */
    public LinkedHashMap f53575n = null;

    /* renamed from: o, reason: collision with root package name */
    public Method f53576o;

    /* renamed from: i, reason: collision with root package name */
    public static final String[] f53560i = {"dm1vc19wYWNrYWdlc19pbnN0YWxsZWQ=", "dm1vc19yZXNvbHZhYmxlX2FpZGxfYWN0aW9ucw==", "dm1vc19wcm9wc19oaXRz", "dm1vc19wcm9wc19zb3VyY2U=", "dm1vc19wYXRoc19oaXRz", "dm1vc19ydW5uaW5nX3NlcnZpY2Vz", "dm1vc19jb250ZW50X3Byb3ZpZGVycw==", "dm1vc19ob3N0X2FpZGxfaW50ZWdyYXRpb24=", "dm1vc19hcG1fcGF0Y2hfY29uZmlnX3BheWxvYWQ=", "dm1vc192Y2xvdWRfYnVpbGRfZGV0ZWN0ZWQ=", "dm1vc19idWlsZF9wcm9wX2xlYWthZ2U=", "dm1vc19mcmFtZXdvcmtfY2xhc3Nlc19kZXRlY3RlZA==", "dm1vc19ydGNnZXN0dXJlX3N5c3RlbV9hcHA=", "cmVkcm9pZF9wcm9wX2hpdHM="};

    /* renamed from: p, reason: collision with root package name */
    public static final Integer f53562p = 0;

    /* renamed from: q, reason: collision with root package name */
    public static final Integer f53563q = 1;

    static {
        String f10 = f("Y29tLmNsb3VkLnJ0Y2dlc3R1cmU=");
        f53564r = f10;
        String f11 = f("Y29tLmNsb3VkLnBob25l");
        String f12 = f("Y29tLnZtb3MucHJv");
        String f13 = f("Y29tLnZtb3MubGl0ZQ==");
        String f14 = f("Y29tLnZtb3MuYXBw");
        f53534B = f("YWlkbC5jbG91ZC5hcGkuQ29udHJvbFNlcnZlcg==");
        f53535C = f("YWlkbC5jbG91ZC5hcGkuUm9vdFNlcnZlcg==");
        f53536D = f("YWlkbC5jbG91ZC5hcGkuQXBrRG93bmxvYWRlclNlcnZlcg==");
        f53537E = f("YWlkbC5jbG91ZC5hcGkuU2ltdWxhdG9yU2VydmVy");
        f53538F = f("YWlkbC5jbG91ZC5hcGkuU3RhcnREb3dubG9hZEZpbGVTZXJ2ZXI=");
        String f15 = f("Y29tLmNsb3VkLmNvbnRyb2w=");
        String f16 = f("Y29tLmFuZHJvaWQubXhMYXVuY2hlcjM=");
        String f17 = f("Y29tLmFuZHJvaWQuZXhwYW5zaW9udG9vbHM=");
        String f18 = f("Y29tLm93bHByb3h5Lm92ZXJzZWFz");
        String f19 = f("Y29tLmFuZHJvaWQueXpicm93c2Vy");
        String f20 = f("Y29tLmFuZHJvaWQucGlmaXg=");
        f53565s = h(new String[]{"cm8uc3lzLmNsb3VkLmFuZHJvaWRfaWQ=", "cm8uc3lzLmNsb3VkLmRldmljZS50eXBl", "cm8uc3lzLmNsb3VkLnZlcnNpb24=", "aW5pdC5zdmMuY2xvdWRzZXJ2aWNl", "aW5pdC5zdmMuZGVidWdfcGlkLmNsb3Vkc2VydmljZQ==", "cGVyc2lzdC5zeXMuY2xvdWQuc2NyZWVuLndpZHRo", "cGVyc2lzdC5zeXMuY2xvdWQuc2NyZWVuLmhlaWdodA==", "cGVyc2lzdC5zeXMuY2xvdWQuc2NyZWVuLmRlbnNpdHk=", "cGVyc2lzdC5zeXMuY2xvdWQuYmx1ZXRvb3RoLm1hYw==", "cGVyc2lzdC5zeXMuY2xvdWQuYnVpbGQuZmluZ2VycHJpbnQ=", "cGVyc2lzdC5zeXMuY2xvdWQuY29udGFjdHM=", "cGVyc2lzdC5zeXMuY2xvdWQuZHJtLmlk", "cGVyc2lzdC5zeXMuY2xvdWQuZHJtLnB1aWQ=", "cGVyc2lzdC5zeXMuY2xvdWQuZ3B1LmdsX3ZlbmRvcg==", "cGVyc2lzdC5zeXMuY2xvdWQuZ3B1LmdsX3JlbmRlcmVy", "cGVyc2lzdC5zeXMuY2xvdWQuZ3B1LmdsX3ZlcnNpb24=", "cGVyc2lzdC5zeXMuY2xvdWQubW9iaWxlaW5mbw==", "cGVyc2lzdC5zeXMuY2xvdWQuY2VsbGluZm8=", "cGVyc2lzdC5zeXMuY2xvdWQuYmF0dGVyeS5jYXBhY2l0eQ==", "cGVyc2lzdC5zeXMuY2xvdWQuYmF0dGVyeS5sZXZlbA==", "cGVyc2lzdC5zeXMuY2xvdWQud2lmaS5zc2lk", "cGVyc2lzdC5zeXMuY2xvdWQud2lmaS5tYWM=", "cGVyc2lzdC5zeXMuY2xvdWQud2lmaS5pcA==", "cGVyc2lzdC5zeXMuY2xvdWQud2lmaS5nYXRld2F5", "cGVyc2lzdC5zeXMuY2xvdWQud2lmaS5kbnMx", "cGVyc2lzdC5zeXMuY2xvdWQucG0uaW5zdGFsbF9zb3VyY2U=", "cGVyc2lzdC5zeXMuY2xvdWQuc2Vuc29yLnRwbF9kcA==", "cGVyc2lzdC5zeXMuY2xvdWQuYm9vdHRpbWUub2Zmc2V0", "cm8uYm9vdC5yZWRyb2lkX25ldF9uZG5z", "cm8uYm9vdC5yZWRyb2lkX25ldF9kbnMx", "cm8uYm9vdC5yZWRyb2lkX25ldF9kbnMy", "cm8uc3lzLmNsb3VkLmJvb3RfaWQ=", "cm8uc3lzLmNsb3VkLmN1c3RvbV9mZWF0dXJl", "cm8uYm9vdC5jbG91ZC5hcHBfY2hhbm5lbA==", "cm8uYnVpbGQuY2xvdWQudW5pcXVlX2lk", "cm8uYnVpbGQuY2xvdWQuaW1naW5mbw==", "cGVyc2lzdC5zeXMuY2xvdWQubWFkYl9lbmFibGU=", "cGVyc2lzdC5zeXMuY2xvdWQuZ3Nmc3U=", "cGVyc2lzdC5zeXMuY2xvdWQuZ21zc3U=", "cGVyc2lzdC5zeXMuY2xvdWQuZ3BzdQ==", "cGVyc2lzdC5zeXMuY2xvdWQucGdzdQ==", "cGVyc2lzdHMuc3lzLmNsb3VkLndoaXRlX2xpc3RfZW5hYmxl", "cm8uYm9vdC5hcm1jbG91ZF9zZXJ2ZXJfYWRkcg==", "cGVyc2lzdC5zeXMuY2xvdWQuZ3BzLmxhdA==", "cGVyc2lzdC5zeXMuY2xvdWQuZ3BzLmxvbg==", "cGVyc2lzdC5zeXMuY2xvdWQuZ3BzLnNwZWVk", "cGVyc2lzdC5zeXMuY2xvdWQuZ3BzLmFsdGl0dWRl", "cGVyc2lzdC5zeXMuY2xvdWQuZ3BzLmJlYXJpbmc=", "aW5pdC5zdmMueHVfZGFlbW9u", "aW5pdC5zdmMubWFkYmQ="});
        f53566t = h(new String[]{"L3N5c3RlbS9iaW4vYXBtdA==", "L3N5c3RlbS94YmluL2FwbXQ=", "L3ZlbmRvci9iaW4vYXBtdA==", "L3Byb2R1Y3QvYmluL2FwbXQ=", "L3Byb2R1Y3QvZnJhbWV3b3JrL2FwbS5qYXI=", "L2RhdGEvZGF0YS9jb20uY2xvdWQucnRjZ2VzdHVyZQ==", "L3N5c3RlbS9saWIvbGliY2xvdWQuc28=", "L3N5c3RlbS9saWI2NC9saWJjbG91ZC5zbw==", "L3N5c3RlbS9mcmFtZXdvcmsvY2xvdWQtc2VydmljZXMuamFy", "L3N5c3RlbS9hcHAvQ2xvdWRTZXJ2aWNl", "L3N5c3RlbS9wcml2LWFwcC9Ub29sc19jdXN0b20=", "L3N5c3RlbS9wcml2LWFwcC9EZXZpY2VBZG1pbg==", "L2RhdGEvbG9jYWwvdG1wLy52bW9z", "L3N5c3RlbS9iaW4vY2xvdWRzZXJ2aWNl", "L3N5c3RlbS9iaW4vY2xlYW5fZXh0ZXJuYWxfZGF0YS5zaA==", "L2RhdGEvZXRjL3BsZ2NvbmZpZy5qc29u", "L3N5c3RlbS9iaW4vdnU=", "L3N5c3RlbS9ldGMvaW5pdC9pbml0LmNsb3Vkc2VydmljZS5yYw==", "L2RhdGEvZXRjL2FwcGNoYW5uZWw=", "L2RhdGEvZXRjL2FwcGNoYW5uZWwvcHJlX2luc3RhbGwuYXBwc2ZseWVy", "L2RhdGEvZXRjL2FwcGNoYW5uZWwvYXJpc2VDaGFubmVsLnR4dA==", "L2RhdGEvZXRjL2FwcGNoYW5uZWwvbGF6YWRhQ2hhbm5lbC50eHQ=", "Ly5kb2NrZXJlbnY=", "L3J1bi8uY29udGFpbmVyZW52", "L3N5c3RlbS9iaW4vZ2VuZXJhbGFwcF9pbnN0YWxs", "L2Rldi9wb3dlcl9zdXBwbHk=", "L2Rldi9wb3dlcl9zdXBwbHkvYmF0dGVyeQ==", "L2Rldi9wb3dlcl9zdXBwbHkvYmF0dGVyeS9jYXBhY2l0eQ==", "L2Rldi9wb3dlcl9zdXBwbHkvY3B1aW5mb19tYXhfZnJlcQ==", "L2Rldi9wb3dlcl9zdXBwbHkvY3B1aW5mb19taW5fZnJlcQ=="});
        h(new String[]{"Y2xvdWQuYXBp", "cnRjZ2VzdHVyZQ==", "Y29tLmNsb3Vk", "dm1vcw==", "eHVfZGFlbW9u", "bWFkYmQ=", "YXJtY2xvdWQ=", "Y2xvdWRzZXJ2aWNl", "UnRjU2VydmVy", "R2FtZVNlcnZlcnM=", "QXBrRG93bmxvYWRlclNlcnZlcg==", "U2ltdWxhdG9yU2VydmVy", "U3RhcnREb3dubG9hZEZpbGVTZXJ2ZXI=", "VFByb3h5U2VydmljZQ==", "c2FnZXJuZXQ=", "bmVrb2hhc2VrYWk=", "UHVibGljUHVzaFJ0Y1NlcnZlcg==", "Q29udGFjdFNlcnZpY2U=", "TXVsdGlSdGNVdGlscw==", "TXVsdGlQdWJsaWNQdXNoUnRjVXRpbHM=", "bW9lLm1hdHN1cmk=", "bmI0YQ=="});
        f53567u = h(new String[]{"cm8ucHJvZHVjdC5zeXN0ZW0uZGV2aWNl", "cm8ucHJvZHVjdC5zeXN0ZW0ubW9kZWw=", "cm8ucHJvZHVjdC5zeXN0ZW0ubmFtZQ==", "cm8ucHJvZHVjdC52ZW5kb3IuZGV2aWNl", "cm8ucHJvZHVjdC52ZW5kb3IubW9kZWw=", "cm8ucHJvZHVjdC5ib2FyZA==", "cm8uYnVpbGQuZmxhdm9y", "cm8uYnVpbGQucHJvZHVjdA=="});
        f53568v = h(new String[]{"Y29tLmNsb3VkLnJ0Y2dlc3R1cmUucHJvdmlkZXI=", "Y29tLnZtb3MucHJvdmlkZXI="});
        f53569w = h(new String[]{"YWlkbC5jbG91ZC5hcGkuc2VydmVyLkNvbnRyb2xTZXJ2ZXI=", "YWlkbC5jbG91ZC5hcGkuc2VydmVyLlJvb3RTZXJ2ZXI=", "YWlkbC5jbG91ZC5hcGkuQ29udHJvbFNlcnZlcg==", "YWlkbC5jbG91ZC5hcGkuUm9vdFNlcnZlcg==", "Y29tLmNsb3VkLnJ0Y2dlc3R1cmUuc2VydmljZQ==", "YWlkbC5jbG91ZC5hcGkuc2VydmVyLmRvd25sb2FkZXIuQXBrRG93bmxvYWRlclNlcnZlcg==", "LnNlcnZlci5SdGNTZXJ2ZXI=", "LnNlcnZlci5HYW1lU2VydmVycw==", "YWlkbC5jbG91ZC5hcGkuc2VydmVyLlNpbXVsYXRvclNlcnZlcg==", "YWlkbC5jbG91ZC5hcGkuc2VydmVyLlN0YXJ0RG93bmxvYWRGaWxlU2VydmVy", "Y29tLmNsb3VkLnJ0Y2dlc3R1cmUuc2VydmVyLkdhbWVTZXJ2ZXI=", "aW8ubmVrb2hhc2VrYWkuc2FnZXJuZXQuYmcuVnBuU2VydmljZQ==", "aGV2LnNvY2tzdHVuLlRQcm94eVNlcnZpY2U=", "Y29tLmNsb3VkLnJ0Y2dlc3R1cmUuc2VydmVyLlB1YmxpY1B1c2hSdGNTZXJ2ZXI=", "Y29tLmNsb3VkLnJ0Y2dlc3R1cmUuc2VydmVyLkNvbnRhY3RTZXJ2aWNl", "aW8ubmVrb2hhc2VrYWkuc2FnZXJuZXQucDAzNWJnLlByb3h5U2VydmljZQ==", "aW8ubmVrb2hhc2VrYWkuc2FnZXJuZXQucDAzNWJnLlZwblNlcnZpY2U=", "bW9lLm1hdHN1cmkubmI0YS5wcm94eQ=="});
        f53570x = new String[]{f10, f11, f12, f13, f14, f16, f17, f18, f19, f20, f15};
        f53571y = h(new String[]{"Y29tLmFuZHJvaWQuY29tbWFuZHMuYXBtLkFwbQ==", "Y29tLmNsb3VkLnNlcnZlci5DbG91ZFNlcnZpY2U=", "Y29tLmNsb3VkLnNlcnZlci5DbG91ZE1hbmFnZXI=", "YWlkbC5jbG91ZC5hcGkuc2VydmVyLkNvbnRyb2xJbnRlcmZhY2U=", "YWlkbC5jbG91ZC5hcGkuc2VydmVyLlJvb3RJbnRlcmZhY2U=", "YWlkbC5jbG91ZC5hcGkuc2VydmVyLkNvbnRyb2xJbnRlcmZhY2UkU3R1Yg==", "YWlkbC5jbG91ZC5hcGkuc2VydmVyLlJvb3RJbnRlcmZhY2UkU3R1Yg=="});
        f53572z = h(new String[]{"L3N5c3RlbS9idWlsZC5wcm9w", "L3ZlbmRvci9idWlsZC5wcm9w", "L3Byb2R1Y3QvYnVpbGQucHJvcA=="});
        f53533A = h(new String[]{"dmNsb3Vk", "YXJtY2xvdWQ=", "Y2xvdWRzZXJ2aWNl", "Z2l0bGFiLXJ1bm5lcg==", "bWluaWNhbC92Y2xvdWQ=", "Y2xvdWQucGhvbmU=", "cnRjZ2VzdHVyZQ==", "bW9lLm1hdHN1cmk=", "cmVkcm9pZA==", "bGlibmRrX3RyYW5zbGF0aW9u", "bmF0aXZlLmJyaWRnZQ=="});
        f53539G = f("dmNsb3Vk");
        f53540H = f("cmVkcm9pZA==");
        f53541I = f("YWlkbA==");
        f53542J = f("Y2xvdWQ=");
        f53543K = f("Y29udHJvbA==");
        f53544L = f("cm9vdA==");
        f53545M = f("cm8uYm9vdC5yZWRyb2lkXw==");
        f53546N = f("cm8uYnVpbGQuY2xvdWQu");
        f53547O = f("YW5kcm9pZC5vcy5TeXN0ZW1Qcm9wZXJ0aWVz");
        f53548P = f("aXNfc3lzdGVt");
        f53549Q = f("dWlk");
        f53550R = f("aGFyZHdhcmVfbWF0Y2g=");
        f53551S = f("Ym9hcmRfbWF0Y2g=");
        f53552T = f("cm8uYm9vdC5yZWRyb2lkX2NvdW50");
        f53553U = f("cm8uYm9vdC5yZWRyb2lkX2tleXM=");
        f53554V = f("cm8uYnVpbGQuY2xvdWRfY291bnQ=");
        f53555W = f("cm8uYnVpbGQuY2xvdWRfa2V5cw==");
        f53556X = f("L2RhdGEvZXRjL3BsZ2NvbmZpZy5qc29u");
        f53557Y = f("L3N5c3RlbS9iaW4vZ2V0cHJvcA==");
        f53558Z = f("Z2V0");
        f53559a0 = f("YXBtX2NvbmZfcmVhZF9lcnI=");
    }

    public static /* synthetic */ String A(String[] strArr) {
        return strArr[6];
    }

    public static /* synthetic */ String C(String[] strArr) {
        return strArr[7];
    }

    public static /* synthetic */ String E(String[] strArr) {
        return strArr[8];
    }

    public static List I() {
        String[] strArr = f53566t;
        try {
            ArrayList arrayList = new ArrayList();
            for (String str : strArr) {
                if (new File(str).exists()) {
                    arrayList.add(str);
                }
            }
            return arrayList;
        } catch (Throwable unused) {
            return null;
        }
    }

    public static String f(String str) {
        try {
            byte[] decode = Base64.decode(str, 2);
            return decode == null ? str : new String(decode, StandardCharsets.UTF_8);
        } catch (Throwable unused) {
            V.j("d_err", null);
            return str;
        }
    }

    public static /* synthetic */ Map g(Map map) {
        return map;
    }

    public static String[] h(String[] strArr) {
        try {
            String[] strArr2 = new String[strArr.length];
            for (int i10 = 0; i10 < strArr.length; i10++) {
                strArr2[i10] = f(strArr[i10]);
            }
            return strArr2;
        } catch (Throwable unused) {
            V.j("da_err", null);
            return new String[0];
        }
    }

    public static /* synthetic */ String j(String[] strArr) {
        return strArr[0];
    }

    public static /* synthetic */ String k(String[] strArr) {
        return strArr[1];
    }

    public static /* synthetic */ String l(String[] strArr) {
        return strArr[9];
    }

    public static /* synthetic */ String n(String[] strArr) {
        return strArr[10];
    }

    public static /* synthetic */ String o(String[] strArr) {
        return strArr[11];
    }

    public static /* synthetic */ String q(String[] strArr) {
        return strArr[12];
    }

    public static /* synthetic */ String s(String[] strArr) {
        return strArr[13];
    }

    public static /* synthetic */ String u(String[] strArr) {
        return strArr[2];
    }

    public static /* synthetic */ String w(String[] strArr) {
        return strArr[3];
    }

    public static /* synthetic */ String y(String[] strArr) {
        return strArr[4];
    }

    public final Map B() {
        String str;
        LinkedHashMap linkedHashMap;
        try {
            LinkedHashMap linkedHashMap2 = new LinkedHashMap();
            String str2 = Build.HARDWARE;
            if (str2 != null && str2.toLowerCase().contains(f53540H)) {
                linkedHashMap2.put(f53550R, str2);
            }
            String str3 = Build.BOARD;
            if (str3 != null && str3.toLowerCase().contains(f53540H)) {
                linkedHashMap2.put(f53551S, str3);
            }
            Map r10 = r();
            if (r10 != null) {
                LinkedHashMap linkedHashMap3 = new LinkedHashMap();
                LinkedHashMap linkedHashMap4 = new LinkedHashMap();
                for (Map.Entry entry : r10.entrySet()) {
                    String str4 = (String) entry.getKey();
                    if (str4.startsWith(f53545M)) {
                        str = (String) entry.getValue();
                        linkedHashMap = linkedHashMap3;
                    } else if (str4.startsWith(f53546N)) {
                        str = (String) entry.getValue();
                        linkedHashMap = linkedHashMap4;
                    }
                    linkedHashMap.put(str4, str);
                }
                if (!linkedHashMap3.isEmpty()) {
                    linkedHashMap2.put(f53552T, Integer.valueOf(linkedHashMap3.size()));
                    linkedHashMap2.put(f53553U, linkedHashMap3);
                }
                if (!linkedHashMap4.isEmpty()) {
                    linkedHashMap2.put(f53554V, Integer.valueOf(linkedHashMap4.size()));
                    linkedHashMap2.put(f53555W, linkedHashMap4);
                }
            }
            if (linkedHashMap2.isEmpty()) {
                return null;
            }
            return linkedHashMap2;
        } catch (Throwable unused) {
            return null;
        }
    }

    public final List D() {
        Boolean bool;
        try {
            ArrayList arrayList = new ArrayList();
            String[] strArr = {f53534B, f53535C, f53536D, f53537E, f53538F};
            for (int i10 = 0; i10 < 5; i10++) {
                String str = strArr[i10];
                Boolean bool2 = Boolean.TRUE;
                String str2 = f53564r;
                try {
                    Intent intent = new Intent(str);
                    intent.setPackage(str2);
                    Context context = this.f53573e;
                    AtomicInteger atomicInteger = V.f53166a;
                    bool = Boolean.valueOf(context.getPackageManager().resolveService(intent, 0) != null);
                } catch (Throwable unused) {
                    bool = null;
                }
                if (bool2.equals(bool)) {
                    arrayList.add(str);
                }
            }
            if (arrayList.isEmpty()) {
                return null;
            }
            return arrayList;
        } catch (Throwable unused2) {
            return null;
        }
    }

    public final Map F() {
        try {
            Context context = this.f53573e;
            AtomicInteger atomicInteger = V.f53166a;
            ApplicationInfo applicationInfo = context.getPackageManager().getApplicationInfo(f53564r, 0);
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            int i10 = applicationInfo.flags;
            linkedHashMap.put(f53548P, Boolean.valueOf(((i10 & 1) == 0 && (i10 & 128) == 0) ? false : true));
            linkedHashMap.put(f53549Q, Integer.valueOf(applicationInfo.uid));
            return linkedHashMap;
        } catch (Throwable unused) {
            return null;
        }
    }

    public final Map G() {
        Map r10;
        try {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            for (String str : f53567u) {
                String i10 = i(str);
                if (i10 != null && i10.toLowerCase().contains(f53539G)) {
                    linkedHashMap.put(str, i10);
                }
            }
            if (linkedHashMap.isEmpty() && (r10 = r()) != null) {
                for (String str2 : f53567u) {
                    String str3 = (String) r10.get(str2);
                    if (str3 != null && str3.toLowerCase().contains(f53539G)) {
                        linkedHashMap.put(str2, str3);
                    }
                }
            }
            if (linkedHashMap.isEmpty()) {
                return null;
            }
            return linkedHashMap;
        } catch (Throwable unused) {
            return null;
        }
    }

    public final List H() {
        try {
            Context context = this.f53573e;
            AtomicInteger atomicInteger = V.f53166a;
            PackageManager packageManager = context.getPackageManager();
            ArrayList arrayList = new ArrayList();
            for (String str : f53568v) {
                if (packageManager.resolveContentProvider(str, 0) != null) {
                    arrayList.add(str);
                }
            }
            if (arrayList.isEmpty()) {
                return null;
            }
            return arrayList;
        } catch (Throwable unused) {
            return null;
        }
    }

    @Override // io.seon.androidsdk.service.InterfaceC4966l
    public final void a(C4878a c4878a) {
        this.f53573e = c4878a.a();
    }

    @Override // io.seon.androidsdk.service.InterfaceC4966l
    public final Map b() {
        return null;
    }

    public final String i(String str) {
        try {
            Method method = this.f53576o;
            if (method == null) {
                method = Class.forName(f53547O).getMethod(f53558Z, String.class);
                this.f53576o = method;
            }
            String str2 = (String) method.invoke(null, str);
            if (str2 == null) {
                return null;
            }
            String trim = str2.trim();
            if (trim.isEmpty()) {
                return null;
            }
            return trim;
        } catch (Throwable unused) {
            return null;
        }
    }

    public final String m() {
        try {
            File file = new File(f53556X);
            if (file.exists() && file.canRead()) {
                StringBuilder sb2 = new StringBuilder();
                BufferedReader bufferedReader = new BufferedReader(new FileReader(file));
                while (true) {
                    try {
                        String readLine = bufferedReader.readLine();
                        if (readLine == null) {
                            break;
                        }
                        sb2.append(readLine);
                    } finally {
                    }
                }
                bufferedReader.close();
                String trim = sb2.toString().trim();
                if (trim.isEmpty()) {
                    return null;
                }
                return trim;
            }
            V.j(f53559a0, null);
        } catch (Throwable unused) {
        }
        return null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:42:0x006f, code lost:
    
        if (r5.isEmpty() != false) goto L52;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x0071, code lost:
    
        r0.put(r6, r5);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Map p() {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        String[] strArr = f53572z;
        int length = strArr.length;
        int i10 = 0;
        while (true) {
            ArrayList arrayList = null;
            if (i10 >= length) {
                if (linkedHashMap.isEmpty()) {
                    return null;
                }
                return linkedHashMap;
            }
            String str = strArr[i10];
            try {
                File file = new File(str);
                if (file.exists() && file.canRead()) {
                    ArrayList arrayList2 = new ArrayList();
                    BufferedReader bufferedReader = new BufferedReader(new FileReader(file));
                    while (true) {
                        try {
                            String readLine = bufferedReader.readLine();
                            if (readLine == null) {
                                break;
                            }
                            String lowerCase = readLine.toLowerCase();
                            for (String str2 : f53533A) {
                                if (lowerCase.contains(str2.toLowerCase()) && !arrayList2.contains(str2)) {
                                    arrayList2.add(str2);
                                }
                            }
                        } catch (Throwable th2) {
                            try {
                                bufferedReader.close();
                            } catch (Throwable th3) {
                                th2.addSuppressed(th3);
                            }
                            throw th2;
                        }
                    }
                    bufferedReader.close();
                    arrayList = arrayList2;
                }
            } catch (Throwable unused) {
                i10++;
            }
            i10++;
        }
    }

    public final Map r() {
        if (this.f53575n == null) {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            try {
                Process start = new ProcessBuilder(f53557Y).redirectErrorStream(true).start();
                try {
                    BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(start.getInputStream()));
                    while (true) {
                        try {
                            String readLine = bufferedReader.readLine();
                            if (readLine == null) {
                                break;
                            }
                            int indexOf = readLine.indexOf(91);
                            int indexOf2 = readLine.indexOf("]:");
                            int lastIndexOf = readLine.lastIndexOf(91);
                            int lastIndexOf2 = readLine.lastIndexOf(93);
                            if (indexOf >= 0 && indexOf2 > indexOf && lastIndexOf > indexOf2 && lastIndexOf2 >= lastIndexOf) {
                                linkedHashMap.put(readLine.substring(indexOf + 1, indexOf2), readLine.substring(lastIndexOf + 1, lastIndexOf2));
                            }
                        } finally {
                        }
                    }
                    bufferedReader.close();
                } finally {
                    start.destroy();
                }
            } catch (Throwable unused) {
                linkedHashMap = null;
            }
            this.f53575n = linkedHashMap;
        }
        return this.f53575n;
    }

    public final List t() {
        try {
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            try {
                Context context = this.f53573e;
                AtomicInteger atomicInteger = V.f53166a;
                PackageManager packageManager = context.getPackageManager();
                String[] strArr = f53570x;
                int length = strArr.length;
                int i10 = 0;
                int i11 = 0;
                while (i11 < length) {
                    String str = strArr[i11];
                    try {
                        ServiceInfo[] serviceInfoArr = packageManager.getPackageInfo(str, 14).services;
                        if (serviceInfoArr != null) {
                            int length2 = serviceInfoArr.length;
                            int i12 = i10;
                            while (i12 < length2) {
                                String str2 = serviceInfoArr[i12].name;
                                if (str2 != null) {
                                    int indexOf = str2.indexOf(36);
                                    String substring = indexOf > 0 ? str2.substring(i10, indexOf) : str2;
                                    String[] strArr2 = f53569w;
                                    int length3 = strArr2.length;
                                    int i13 = i10;
                                    while (i13 < length3) {
                                        int i14 = i13;
                                        try {
                                            if (str2.contains(strArr2[i14])) {
                                                linkedHashSet.add(str + "/" + substring);
                                            }
                                            i13 = i14 + 1;
                                        } catch (Throwable unused) {
                                        }
                                    }
                                    String lowerCase = str2.toLowerCase();
                                    if (lowerCase.contains(f53541I) || lowerCase.contains(f53542J) || lowerCase.contains(f53543K) || lowerCase.contains(f53544L)) {
                                        linkedHashSet.add(str + "/" + substring);
                                    }
                                }
                                i12++;
                                i10 = 0;
                            }
                        }
                    } catch (Throwable unused2) {
                    }
                    i11++;
                    i10 = 0;
                }
                try {
                    if (linkedHashSet.isEmpty()) {
                        return null;
                    }
                    return new ArrayList(linkedHashSet);
                } catch (Throwable unused3) {
                    return null;
                }
            } catch (Throwable unused4) {
                return null;
            }
        } catch (Throwable unused5) {
        }
    }

    public final List v() {
        try {
            ArrayList arrayList = new ArrayList();
            for (String str : f53571y) {
                try {
                    Class.forName(str);
                    arrayList.add(str);
                } catch (Throwable unused) {
                }
            }
            if (arrayList.isEmpty()) {
                return null;
            }
            return arrayList;
        } catch (Throwable unused2) {
            return null;
        }
    }

    public final List x() {
        ArrayList arrayList = new ArrayList();
        String[] strArr = f53570x;
        int length = strArr.length;
        int i10 = 0;
        while (true) {
            Boolean bool = null;
            if (i10 >= length) {
                break;
            }
            String str = strArr[i10];
            try {
                Context context = this.f53573e;
                AtomicInteger atomicInteger = V.f53166a;
                bool = Boolean.valueOf(context.getPackageManager().getPackageInfo(str, 0) != null);
            } catch (PackageManager.NameNotFoundException unused) {
                bool = Boolean.FALSE;
            } catch (Throwable unused2) {
            }
            if (Boolean.TRUE.equals(bool)) {
                arrayList.add(str);
            }
            i10++;
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        return arrayList;
    }

    public final Map z() {
        Map r10;
        this.f53574g = null;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (String str : f53565s) {
            String i10 = i(str);
            if (!TextUtils.isEmpty(i10)) {
                linkedHashMap.put(str, i10);
                if (this.f53574g == null) {
                    this.f53574g = f53562p;
                }
            }
        }
        if (linkedHashMap.isEmpty() && (r10 = r()) != null) {
            for (String str2 : f53565s) {
                if (r10.containsKey(str2)) {
                    linkedHashMap.put(str2, (String) r10.get(str2));
                    if (this.f53574g == null) {
                        this.f53574g = f53563q;
                    }
                }
            }
        }
        return linkedHashMap;
    }

    @Override // io.seon.androidsdk.service.InterfaceC4966l
    public final Map a() {
        this.f53575n = null;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        if (f53561j == null) {
            f53561j = h(f53560i);
        }
        final String[] strArr = f53561j;
        linkedHashMap.put((String) V.b(new InterfaceC4990o() { // from class: io.seon.androidsdk.service.Y0
            @Override // io.seon.androidsdk.service.InterfaceC4990o
            public final Object a() {
                return C5071y1.j(strArr);
            }
        }), AbstractC4950j.b(new N4() { // from class: io.seon.androidsdk.service.a1
            @Override // io.seon.androidsdk.service.N4
            public final Object a() {
                return C5071y1.this.x();
            }
        }));
        linkedHashMap.put((String) V.b(new InterfaceC4990o() { // from class: io.seon.androidsdk.service.h1
            @Override // io.seon.androidsdk.service.InterfaceC4990o
            public final Object a() {
                return C5071y1.k(strArr);
            }
        }), AbstractC4950j.b(new N4() { // from class: io.seon.androidsdk.service.i1
            @Override // io.seon.androidsdk.service.N4
            public final Object a() {
                return C5071y1.this.D();
            }
        }));
        final Map map = (Map) AbstractC4950j.b(new N4() { // from class: io.seon.androidsdk.service.k1
            @Override // io.seon.androidsdk.service.N4
            public final Object a() {
                return C5071y1.this.z();
            }
        });
        linkedHashMap.put((String) V.b(new InterfaceC4990o() { // from class: io.seon.androidsdk.service.l1
            @Override // io.seon.androidsdk.service.InterfaceC4990o
            public final Object a() {
                return C5071y1.u(strArr);
            }
        }), AbstractC4950j.b(new N4() { // from class: io.seon.androidsdk.service.m1
            @Override // io.seon.androidsdk.service.N4
            public final Object a() {
                return C5071y1.g(map);
            }
        }));
        linkedHashMap.put((String) V.b(new InterfaceC4990o() { // from class: io.seon.androidsdk.service.n1
            @Override // io.seon.androidsdk.service.InterfaceC4990o
            public final Object a() {
                return C5071y1.w(strArr);
            }
        }), this.f53574g);
        linkedHashMap.put((String) V.b(new InterfaceC4990o() { // from class: io.seon.androidsdk.service.o1
            @Override // io.seon.androidsdk.service.InterfaceC4990o
            public final Object a() {
                return C5071y1.y(strArr);
            }
        }), AbstractC4950j.b(new N4() { // from class: io.seon.androidsdk.service.p1
            @Override // io.seon.androidsdk.service.N4
            public final Object a() {
                return C5071y1.I();
            }
        }));
        linkedHashMap.put((String) V.b(new InterfaceC4990o() { // from class: io.seon.androidsdk.service.j1
            @Override // io.seon.androidsdk.service.InterfaceC4990o
            public final Object a() {
                return C5071y1.A(strArr);
            }
        }), AbstractC4950j.b(new N4() { // from class: io.seon.androidsdk.service.q1
            @Override // io.seon.androidsdk.service.N4
            public final Object a() {
                return C5071y1.this.H();
            }
        }));
        linkedHashMap.put((String) V.b(new InterfaceC4990o() { // from class: io.seon.androidsdk.service.r1
            @Override // io.seon.androidsdk.service.InterfaceC4990o
            public final Object a() {
                return C5071y1.C(strArr);
            }
        }), AbstractC4950j.b(new N4() { // from class: io.seon.androidsdk.service.s1
            @Override // io.seon.androidsdk.service.N4
            public final Object a() {
                return C5071y1.this.t();
            }
        }));
        linkedHashMap.put((String) V.b(new InterfaceC4990o() { // from class: io.seon.androidsdk.service.t1
            @Override // io.seon.androidsdk.service.InterfaceC4990o
            public final Object a() {
                return C5071y1.E(strArr);
            }
        }), AbstractC4950j.b(new N4() { // from class: io.seon.androidsdk.service.u1
            @Override // io.seon.androidsdk.service.N4
            public final Object a() {
                return C5071y1.this.m();
            }
        }));
        linkedHashMap.put((String) V.b(new InterfaceC4990o() { // from class: io.seon.androidsdk.service.v1
            @Override // io.seon.androidsdk.service.InterfaceC4990o
            public final Object a() {
                return C5071y1.l(strArr);
            }
        }), AbstractC4950j.b(new N4() { // from class: io.seon.androidsdk.service.w1
            @Override // io.seon.androidsdk.service.N4
            public final Object a() {
                return C5071y1.this.G();
            }
        }));
        linkedHashMap.put((String) V.b(new InterfaceC4990o() { // from class: io.seon.androidsdk.service.x1
            @Override // io.seon.androidsdk.service.InterfaceC4990o
            public final Object a() {
                return C5071y1.n(strArr);
            }
        }), AbstractC4950j.b(new N4() { // from class: io.seon.androidsdk.service.Z0
            @Override // io.seon.androidsdk.service.N4
            public final Object a() {
                return C5071y1.this.p();
            }
        }));
        linkedHashMap.put((String) V.b(new InterfaceC4990o() { // from class: io.seon.androidsdk.service.b1
            @Override // io.seon.androidsdk.service.InterfaceC4990o
            public final Object a() {
                return C5071y1.o(strArr);
            }
        }), AbstractC4950j.b(new N4() { // from class: io.seon.androidsdk.service.c1
            @Override // io.seon.androidsdk.service.N4
            public final Object a() {
                return C5071y1.this.v();
            }
        }));
        linkedHashMap.put((String) V.b(new InterfaceC4990o() { // from class: io.seon.androidsdk.service.d1
            @Override // io.seon.androidsdk.service.InterfaceC4990o
            public final Object a() {
                return C5071y1.q(strArr);
            }
        }), AbstractC4950j.b(new N4() { // from class: io.seon.androidsdk.service.e1
            @Override // io.seon.androidsdk.service.N4
            public final Object a() {
                return C5071y1.this.F();
            }
        }));
        linkedHashMap.put((String) V.b(new InterfaceC4990o() { // from class: io.seon.androidsdk.service.f1
            @Override // io.seon.androidsdk.service.InterfaceC4990o
            public final Object a() {
                return C5071y1.s(strArr);
            }
        }), AbstractC4950j.b(new N4() { // from class: io.seon.androidsdk.service.g1
            @Override // io.seon.androidsdk.service.N4
            public final Object a() {
                return C5071y1.this.B();
            }
        }));
        return linkedHashMap;
    }
}
