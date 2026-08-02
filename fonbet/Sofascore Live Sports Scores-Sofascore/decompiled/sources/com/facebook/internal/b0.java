package com.facebook.internal;

import com.facebook.ads.internal.util.common.FbValidationUtils;
import defpackage.cw3;
import java.util.TreeSet;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public final class b0 {
    public TreeSet a;
    public final /* synthetic */ int b;

    public /* synthetic */ b0(int i) {
        this.b = i;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0038 A[DONT_GENERATE] */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0039 A[Catch: all -> 0x000e, TryCatch #1 {all -> 0x000e, blocks: (B:31:0x0003, B:33:0x0007, B:7:0x0029, B:9:0x002d, B:14:0x0033, B:15:0x0035, B:17:0x0039, B:19:0x0047, B:3:0x0010, B:6:0x0027, B:29:0x0024, B:26:0x001e), top: B:30:0x0003, inners: #0 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final synchronized void a(boolean z) {
        TreeSet treeSet;
        TreeSet treeSet2;
        if (!z) {
            try {
                treeSet = this.a;
            } finally {
            }
            if (treeSet != null && !treeSet.isEmpty()) {
                treeSet2 = this.a;
                if (treeSet2 != null || treeSet2.isEmpty()) {
                    switch (this.b) {
                        case 2:
                            if (com.facebook.w.a().getApplicationInfo().targetSdkVersion >= 30) {
                                cw3.a.contains(d0.class);
                                break;
                            }
                            break;
                    }
                }
            }
        }
        d0 d0Var = d0.a;
        TreeSet treeSet3 = null;
        if (!cw3.a.contains(d0.class)) {
            try {
                treeSet3 = d0Var.g(this);
            } catch (Throwable th) {
                cw3.a(d0.class, th);
            }
        }
        this.a = treeSet3;
        treeSet2 = this.a;
        if (treeSet2 != null) {
        }
        switch (this.b) {
        }
    }

    public final String b() {
        switch (this.b) {
            case 0:
                return "com.facebook.arstudio.player";
            case 1:
                return "com.instagram.android";
            case 2:
                return FbValidationUtils.FB_PACKAGE;
            case 3:
                return "com.facebook.orca";
            default:
                return FbValidationUtils.DEBUG_FB_PACKAGE;
        }
    }

    public final void c() {
    }
}
