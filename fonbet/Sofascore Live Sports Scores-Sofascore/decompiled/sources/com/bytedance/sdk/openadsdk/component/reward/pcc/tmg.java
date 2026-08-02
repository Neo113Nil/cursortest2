package com.bytedance.sdk.openadsdk.component.reward.pcc;

import android.R;
import android.app.Activity;
import android.os.Build;
import android.view.View;
import android.view.Window;
import com.bytedance.sdk.component.utils.lo;
import com.bytedance.sdk.component.utils.tsz;
import com.bytedance.sdk.openadsdk.core.model.of;
import com.bytedance.sdk.openadsdk.utils.rj;
import com.unity3d.services.UnityAdsConstants;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public class tmg {
    private Activity gm;
    private of oo;
    protected int pcc;
    private boolean sf;
    private int vj;
    private boolean wh;

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    public static abstract class pcc implements View.OnLayoutChangeListener {
        private int pcc;
        private int sf;

        private pcc() {
        }

        @Override // android.view.View.OnLayoutChangeListener
        public void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
            int i9 = i3 - i;
            int i10 = i4 - i2;
            if (i9 == this.pcc && i10 == this.sf) {
                return;
            }
            this.pcc = i9;
            this.sf = i10;
            pcc(i9, i10);
        }

        public abstract void pcc(int i, int i2);
    }

    public tmg(Activity activity, of ofVar, int i, boolean z, boolean z2, com.bytedance.sdk.openadsdk.component.reward.pcc.sf sfVar) {
        this.pcc = 0;
        this.gm = activity;
        this.oo = ofVar;
        this.sf = z;
        this.wh = z2;
        if (sfVar != null) {
            pcc(sfVar);
            i = sfVar.zsj;
        }
        this.vj = i;
        try {
            this.pcc = rj.gm(activity, rj.pcc());
            if (!activity.getWindow().hasFeature(1)) {
                activity.requestWindowFeature(1);
            }
            activity.getWindow().addFlags(16777344);
            if (this.vj != 2 && rj.gm(activity)) {
                return;
            }
            activity.getWindow().addFlags(1024);
        } catch (Throwable unused) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int gm(Activity activity, int i) {
        int i2 = activity.getResources().getConfiguration().orientation;
        View decorView = activity.getWindow().getDecorView();
        if (pcc(i, i2)) {
            return Math.abs(rj.hc(activity) - decorView.getWidth());
        }
        return Math.abs(rj.tmg(activity) - decorView.getHeight());
    }

    private float oo() {
        return rj.gm(this.gm, rj.tmg(this.gm));
    }

    public static float[] pcc(int i, Activity activity, of ofVar, boolean z) {
        float[] fArr = new float[2];
        View decorView = activity.getWindow().getDecorView();
        int paddingLeft = decorView.getPaddingLeft();
        int paddingTop = decorView.getPaddingTop();
        if (z && paddingLeft == 0 && paddingTop == 0) {
            boolean z2 = com.bytedance.sdk.openadsdk.core.lu.oo().iv() == 1;
            boolean gm = rj.gm(activity);
            if ((gm || z2) && gm(activity, i) == 0) {
                int[] sf2 = sf(activity, decorView, i, gm, z2);
                paddingLeft = sf2[0];
                paddingTop = sf2[1];
            }
        }
        int i2 = Build.VERSION.SDK_INT;
        if (i2 < 35 || ofVar.zx() != 100.0f) {
            fArr[0] = decorView.getWidth() - (paddingLeft * 2);
            fArr[1] = decorView.getHeight() - (paddingTop * 2);
        } else {
            fArr[0] = decorView.getWidth() - paddingLeft;
            fArr[1] = decorView.getHeight() - paddingTop;
        }
        fArr[0] = rj.gm(activity, fArr[0]);
        float gm2 = rj.gm(activity, fArr[1]);
        fArr[1] = gm2;
        if (fArr[0] < 10.0f || gm2 < 10.0f) {
            fArr = pcc(activity, i, rj.gm(activity, rj.pcc()));
        }
        if (i2 != 26 && i2 != 27) {
            if (activity.getResources() != null && activity.getResources().getConfiguration() != null) {
                if ((activity.getResources().getConfiguration().orientation == 2 ? 2 : 1) != i) {
                    if (i == 2) {
                        float f = fArr[0];
                        float f2 = fArr[1];
                        if (f < f2) {
                            fArr[1] = f;
                            fArr[0] = f2;
                        }
                    } else {
                        float f3 = fArr[0];
                        float f4 = fArr[1];
                        if (f3 > f4) {
                            fArr[1] = f3;
                            fArr[0] = f4;
                        }
                    }
                }
            }
            float f5 = fArr[0];
            float f6 = fArr[1];
        }
        return fArr;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int[] sf(Activity activity, View view, int i, boolean z, boolean z2) {
        int i2;
        int i3;
        int i4;
        int i5;
        float pcc2;
        int i6 = 0;
        if (activity == null || view == null) {
            if (view != null) {
                i2 = view.getPaddingLeft();
                i4 = view.getPaddingTop();
                i5 = view.getPaddingRight();
                i3 = view.getPaddingBottom();
            } else {
                i2 = 0;
                i3 = 0;
                i4 = 0;
                i5 = 0;
            }
            return new int[]{i2, i4, i5, i3, 0};
        }
        int i7 = activity.getResources().getConfiguration().orientation;
        int paddingLeft = view.getPaddingLeft();
        int paddingTop = view.getPaddingTop();
        int paddingRight = view.getPaddingRight();
        int paddingBottom = view.getPaddingBottom();
        if (i == 1) {
            if (i7 != 1) {
                paddingLeft += (int) rj.pcc();
                return new int[]{paddingLeft, paddingTop, paddingRight, paddingBottom, i6};
            }
            pcc2 = rj.pcc();
            paddingTop += (int) pcc2;
            i6 = 1;
            return new int[]{paddingLeft, paddingTop, paddingRight, paddingBottom, i6};
        }
        if (i == 2) {
            if (i7 == 2) {
                if (z) {
                    paddingLeft += (int) rj.pcc();
                    i6 = 1;
                }
                if (z2) {
                    pcc2 = rj.pcc();
                    paddingTop += (int) pcc2;
                    i6 = 1;
                }
            } else {
                paddingTop += (int) rj.pcc();
            }
        }
        return new int[]{paddingLeft, paddingTop, paddingRight, paddingBottom, i6};
    }

    private float gm() {
        return rj.gm(this.gm, rj.hc(this.gm));
    }

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    public static class sf {
        private pcc pcc;

        public void pcc(final Activity activity, final int i, final float f, final boolean z) {
            if (this.pcc != null) {
                return;
            }
            try {
                final boolean z2 = com.bytedance.sdk.openadsdk.core.lu.oo().iv() == 1;
                final boolean gm = rj.gm(activity);
                if (gm || z2) {
                    this.pcc = new pcc() { // from class: com.bytedance.sdk.openadsdk.component.reward.pcc.tmg.sf.1
                        boolean pcc;

                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super();
                        }

                        /* JADX WARN: Removed duplicated region for block: B:17:0x00a7 A[Catch: all -> 0x00c4, TryCatch #0 {all -> 0x00c4, blocks: (B:2:0x0000, B:4:0x0005, B:6:0x0013, B:7:0x0046, B:9:0x005e, B:11:0x0067, B:13:0x0075, B:14:0x0079, B:15:0x00a1, B:17:0x00a7, B:18:0x00ac, B:20:0x00b4, B:24:0x007c, B:26:0x0080, B:28:0x008e, B:30:0x0092, B:31:0x0098, B:33:0x009c, B:34:0x00ba, B:36:0x00be, B:39:0x002d), top: B:1:0x0000 }] */
                        /* JADX WARN: Removed duplicated region for block: B:20:0x00b4 A[Catch: all -> 0x00c4, TryCatch #0 {all -> 0x00c4, blocks: (B:2:0x0000, B:4:0x0005, B:6:0x0013, B:7:0x0046, B:9:0x005e, B:11:0x0067, B:13:0x0075, B:14:0x0079, B:15:0x00a1, B:17:0x00a7, B:18:0x00ac, B:20:0x00b4, B:24:0x007c, B:26:0x0080, B:28:0x008e, B:30:0x0092, B:31:0x0098, B:33:0x009c, B:34:0x00ba, B:36:0x00be, B:39:0x002d), top: B:1:0x0000 }] */
                        /* JADX WARN: Removed duplicated region for block: B:23:? A[RETURN, SYNTHETIC] */
                        /*
                            Code decompiled incorrectly, please refer to instructions dump.
                        */
                        private void pcc() {
                            int abs;
                            float pcc;
                            try {
                                if (i == 2 && activity.getResources().getConfiguration().orientation == 2) {
                                    abs = Math.abs(rj.hc(activity) - activity.getWindow().getDecorView().getWidth());
                                } else {
                                    abs = Math.abs(rj.tmg(activity) - activity.getWindow().getDecorView().getHeight());
                                }
                                View decorView = activity.getWindow().getDecorView();
                                int paddingLeft = decorView.getPaddingLeft();
                                int paddingRight = decorView.getPaddingRight();
                                int paddingBottom = decorView.getPaddingBottom();
                                if (abs != 0) {
                                    if (this.pcc) {
                                        decorView.setPadding(paddingLeft, 0, paddingRight, paddingBottom);
                                        this.pcc = false;
                                        return;
                                    }
                                    return;
                                }
                                int paddingTop = decorView.getPaddingTop();
                                if (i != 1 || activity.getResources().getConfiguration().orientation != 1) {
                                    if (i == 2 && activity.getResources().getConfiguration().orientation == 2) {
                                        if (gm) {
                                            paddingLeft += (int) rj.pcc();
                                        }
                                        if (z2) {
                                            pcc = rj.pcc();
                                        }
                                    }
                                    if (decorView.isAttachedToWindow()) {
                                        decorView.setPadding(paddingLeft, paddingTop, paddingRight, paddingBottom);
                                        this.pcc = true;
                                    }
                                    if (f != 100.0f) {
                                        decorView.setBackgroundColor(-16777216);
                                        return;
                                    }
                                    return;
                                }
                                pcc = rj.pcc();
                                paddingTop += (int) pcc;
                                if (decorView.isAttachedToWindow()) {
                                }
                                if (f != 100.0f) {
                                }
                            } catch (Throwable unused) {
                            }
                        }

                        private void sf() {
                            try {
                                int gm2 = tmg.gm(activity, i);
                                View decorView = activity.getWindow().getDecorView();
                                if (gm2 == 0) {
                                    int[] sf = tmg.sf(activity, decorView, i, gm, z2);
                                    if (sf[4] == 1) {
                                        this.pcc = tmg.sf(decorView, sf[0], sf[1], sf[2], sf[3], f);
                                    }
                                } else if (this.pcc) {
                                    decorView.setPadding(decorView.getPaddingLeft(), 0, decorView.getPaddingRight(), decorView.getPaddingBottom());
                                    this.pcc = false;
                                }
                            } catch (Throwable unused) {
                            }
                        }

                        @Override // com.bytedance.sdk.openadsdk.component.reward.pcc.tmg.pcc
                        public void pcc(int i2, int i3) {
                            if (z) {
                                sf();
                            } else {
                                pcc();
                            }
                        }
                    };
                    activity.getWindow().getDecorView().addOnLayoutChangeListener(this.pcc);
                }
            } catch (Exception unused) {
            }
        }

        public void pcc(Activity activity) {
            Window window;
            if (this.pcc == null || activity == null || (window = activity.getWindow()) == null) {
                return;
            }
            window.getDecorView().removeOnLayoutChangeListener(this.pcc);
            this.pcc = null;
        }
    }

    public tmg(com.bytedance.sdk.openadsdk.component.reward.pcc.sf sfVar) {
        this(sfVar.rnn, sfVar.sf, sfVar.zsj, sfVar.pv, sfVar.ptr, sfVar);
    }

    private void sf() {
        if (this.vj == 2) {
            boolean z = this.wh;
            Activity activity = this.gm;
            if (z) {
                sf(activity, 8);
                return;
            } else {
                sf(activity, 0);
                return;
            }
        }
        sf(this.gm, 1);
    }

    private static void sf(Activity activity, int i) {
        if (activity.getRequestedOrientation() == i) {
            return;
        }
        int i2 = activity.getResources().getConfiguration().orientation;
        activity.setRequestedOrientation(i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean sf(View view, int i, int i2, int i3, int i4, float f) {
        if (!view.isAttachedToWindow()) {
            return false;
        }
        view.setPadding(i, i2, i3, i4);
        if (f != 100.0f) {
            return true;
        }
        view.setBackgroundColor(-16777216);
        return true;
    }

    private float[] sf(int i) {
        float oo = oo();
        float gm = gm();
        int i2 = this.vj;
        if ((i2 == 1) != (oo > gm)) {
            float f = oo + gm;
            gm = f - gm;
            oo = f - gm;
        }
        if (i2 == 1) {
            oo -= i;
        } else {
            gm -= i;
        }
        return new float[]{gm, oo};
    }

    public void pcc(tsz tszVar) {
        if (tszVar == null) {
            return;
        }
        tszVar.postDelayed(new Runnable() { // from class: com.bytedance.sdk.openadsdk.component.reward.pcc.tmg.1
            @Override // java.lang.Runnable
            public void run() {
                View findViewById;
                try {
                    View decorView = tmg.this.gm.getWindow().getDecorView();
                    if (decorView == null || (findViewById = decorView.findViewById(R.id.statusBarBackground)) == null) {
                        return;
                    }
                    findViewById.setVisibility(8);
                } catch (Exception unused) {
                }
            }
        }, 300L);
    }

    private void pcc(com.bytedance.sdk.openadsdk.component.reward.pcc.sf sfVar) {
        sfVar.gd = sfVar.sf.zx();
        sfVar.zsj = pcc(sfVar.rnn, sfVar.sf);
    }

    public static int pcc(Activity activity, of ofVar) {
        if (26 == Build.VERSION.SDK_INT) {
            return activity.getResources().getConfiguration().orientation == 1 ? 1 : 2;
        }
        return ofVar.ial();
    }

    public void pcc(com.bytedance.sdk.openadsdk.component.reward.pcc.sf sfVar, boolean z) {
        float min;
        float max;
        int max2;
        int i;
        int i2;
        int i3 = Build.VERSION.SDK_INT;
        if (i3 != 26) {
            if (i3 == 27) {
                try {
                    sf();
                } catch (Throwable unused) {
                }
            } else {
                sf();
            }
        }
        float gm = gm();
        float oo = oo();
        if (this.vj == 2) {
            min = Math.max(gm, oo);
            max = Math.min(gm, oo);
        } else {
            min = Math.min(gm, oo);
            max = Math.max(gm, oo);
        }
        int gm2 = rj.gm(this.gm, rj.pcc());
        int i4 = this.vj;
        Activity activity = this.gm;
        if (i4 != 2) {
            if (rj.gm(activity)) {
                max -= gm2;
            }
        } else if (rj.gm(activity)) {
            min -= gm2;
        }
        if (z) {
            sfVar.erj = (int) min;
            sfVar.se = (int) max;
            return;
        }
        int i5 = 20;
        if (this.vj != 2) {
            float f = sfVar.gd;
            if (f != UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT && f != 100.0f) {
                i = (int) Math.max((max - (((min - 20.0f) - 20.0f) / f)) / 2.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
                i2 = i;
                max2 = 20;
            }
            i5 = 0;
            max2 = 0;
            i = 0;
            i2 = 0;
        } else {
            float f2 = sfVar.gd;
            if (f2 != UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT && f2 != 100.0f) {
                max2 = (int) Math.max((min - (((max - 20.0f) - 20.0f) * f2)) / 2.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
                i = 20;
                i2 = 20;
                i5 = max2;
            }
            i5 = 0;
            max2 = 0;
            i = 0;
            i2 = 0;
        }
        float f3 = i5;
        float f4 = max2;
        sfVar.erj = (int) ((min - f3) - f4);
        float f5 = i;
        float f6 = i2;
        sfVar.se = (int) ((max - f5) - f6);
        com.bytedance.sdk.openadsdk.activity.single.kj kjVar = sfVar.ywp;
        if (kjVar == null || kjVar.ork == 0) {
            this.gm.getWindow().getDecorView().setPadding(rj.sf(this.gm, f3), rj.sf(this.gm, f5), rj.sf(this.gm, f4), rj.sf(this.gm, f6));
        }
    }

    public void pcc(boolean z) {
        int i = Build.VERSION.SDK_INT;
        if (i != 26) {
            if (i == 27) {
                try {
                    sf();
                } catch (Throwable unused) {
                }
            } else {
                sf();
            }
        }
    }

    public float[] pcc(int i) {
        return pcc(i, this.gm, this.oo);
    }

    public float[] pcc(int i, Activity activity, of ofVar) {
        float[] fArr = new float[2];
        View decorView = activity.getWindow().getDecorView();
        int paddingLeft = decorView.getPaddingLeft();
        int paddingTop = decorView.getPaddingTop();
        if (this.sf && paddingLeft == 0 && paddingTop == 0) {
            boolean z = com.bytedance.sdk.openadsdk.core.lu.oo().iv() == 1;
            boolean gm = rj.gm(activity);
            if ((gm || z) && gm(activity, i) == 0) {
                int[] sf2 = sf(activity, decorView, i, gm, z);
                int i2 = sf2[0];
                paddingTop = sf2[1];
                paddingLeft = i2;
            }
        }
        int i3 = Build.VERSION.SDK_INT;
        if (i3 >= 35 && ofVar.zx() == 100.0f) {
            fArr[0] = decorView.getWidth() - paddingLeft;
            fArr[1] = decorView.getHeight() - paddingTop;
        } else {
            fArr[0] = decorView.getWidth() - (paddingLeft * 2);
            fArr[1] = decorView.getHeight() - (paddingTop * 2);
        }
        fArr[0] = rj.gm(activity, fArr[0]);
        float gm2 = rj.gm(activity, fArr[1]);
        fArr[1] = gm2;
        if (fArr[0] < 10.0f || gm2 < 10.0f) {
            fArr = sf(this.pcc);
        }
        if (i3 != 26 && i3 != 27) {
            if (activity.getResources() != null && activity.getResources().getConfiguration() != null) {
                if ((activity.getResources().getConfiguration().orientation == 2 ? 2 : 1) != i) {
                    if (i == 2) {
                        float f = fArr[0];
                        float f2 = fArr[1];
                        if (f < f2) {
                            fArr[1] = f;
                            fArr[0] = f2;
                        }
                    } else {
                        float f3 = fArr[0];
                        float f4 = fArr[1];
                        if (f3 > f4) {
                            fArr[1] = f3;
                            fArr[0] = f4;
                        }
                    }
                }
            }
            float f5 = fArr[0];
            float f6 = fArr[1];
        }
        return fArr;
    }

    private static boolean pcc(int i, int i2) {
        return i == 2 && i2 == 2;
    }

    public void pcc() {
        rj.pcc(this.gm);
        this.gm.getWindow().getDecorView().setOnSystemUiVisibilityChangeListener(new View.OnSystemUiVisibilityChangeListener() { // from class: com.bytedance.sdk.openadsdk.component.reward.pcc.tmg.2
            @Override // android.view.View.OnSystemUiVisibilityChangeListener
            public void onSystemUiVisibilityChange(int i) {
                if (i == 0) {
                    try {
                        if (tmg.this.gm.isFinishing()) {
                            return;
                        }
                        tmg.this.gm.getWindow().getDecorView().postDelayed(new Runnable() { // from class: com.bytedance.sdk.openadsdk.component.reward.pcc.tmg.2.1
                            @Override // java.lang.Runnable
                            public void run() {
                                rj.pcc(tmg.this.gm);
                            }
                        }, 2500L);
                    } catch (Exception e) {
                        lo.gm("TTAD.RFSM", e.getMessage());
                    }
                }
            }
        });
    }

    private static float[] pcc(Activity activity, int i, int i2) {
        float gm = rj.gm(activity, rj.tmg(activity));
        float gm2 = rj.gm(activity, rj.hc(activity));
        if ((i == 1) != (gm > gm2)) {
            float f = gm + gm2;
            gm2 = f - gm2;
            gm = f - gm2;
        }
        if (i == 1) {
            gm -= i2;
        } else {
            gm2 -= i2;
        }
        return new float[]{gm2, gm};
    }
}
