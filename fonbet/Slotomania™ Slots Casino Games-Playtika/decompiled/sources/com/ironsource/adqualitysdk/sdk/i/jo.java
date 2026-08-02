package com.ironsource.adqualitysdk.sdk.i;

import android.app.Activity;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.view.Choreographer;
import android.view.View;
import java.util.HashMap;
import java.util.Iterator;

/* loaded from: classes.dex */
public final class jo {

    /* renamed from: ﾇ, reason: contains not printable characters */
    private static jo f2844;

    /* renamed from: ﱡ, reason: contains not printable characters */
    private js f2845;

    /* renamed from: ﻛ, reason: contains not printable characters */
    private boolean f2847;

    /* renamed from: ｋ, reason: contains not printable characters */
    private Choreographer.FrameCallback f2848;

    /* renamed from: ﻐ, reason: contains not printable characters */
    private HashMap<iw, je> f2846 = new HashMap<>();

    /* renamed from: ﾒ, reason: contains not printable characters */
    private Handler f2849 = new Handler(Looper.getMainLooper());

    /* renamed from: ﮐ, reason: contains not printable characters */
    static /* synthetic */ boolean m8243(jo joVar) {
        joVar.f2847 = false;
        return false;
    }

    /* renamed from: ﻛ, reason: contains not printable characters */
    public static synchronized jo m8248() {
        jo joVar;
        synchronized (jo.class) {
            if (f2844 == null) {
                f2844 = new jo();
            }
            joVar = f2844;
        }
        return joVar;
    }

    private jo() {
    }

    /* renamed from: com.ironsource.adqualitysdk.sdk.i.jo$4, reason: invalid class name */
    final class AnonymousClass4 extends je {
        AnonymousClass4() {
        }

        @Override // com.ironsource.adqualitysdk.sdk.i.je
        /* renamed from: ｋ */
        public final void mo5828() {
            if (jo.this.f2845 == null) {
                jo.this.f2845 = new js() { // from class: com.ironsource.adqualitysdk.sdk.i.jo.4.2
                    @Override // com.ironsource.adqualitysdk.sdk.i.js, com.ironsource.adqualitysdk.sdk.i.jr
                    /* renamed from: ﾇ */
                    public final void mo5970(Activity activity) {
                        p.m8557(new je() { // from class: com.ironsource.adqualitysdk.sdk.i.jo.4.2.4
                            @Override // com.ironsource.adqualitysdk.sdk.i.je
                            /* renamed from: ｋ */
                            public final void mo5828() {
                                final jo joVar = jo.this;
                                p.m8557(new je() { // from class: com.ironsource.adqualitysdk.sdk.i.jo.5
                                    @Override // com.ironsource.adqualitysdk.sdk.i.je
                                    /* renamed from: ｋ */
                                    public final void mo5828() {
                                        jo.m8243(jo.this);
                                    }
                                });
                            }
                        });
                    }

                    @Override // com.ironsource.adqualitysdk.sdk.i.js, com.ironsource.adqualitysdk.sdk.i.jr
                    /* renamed from: ﾒ */
                    public final void mo5971(Activity activity) {
                        p.m8557(new je() { // from class: com.ironsource.adqualitysdk.sdk.i.jo.4.2.1
                            @Override // com.ironsource.adqualitysdk.sdk.i.je
                            /* renamed from: ｋ */
                            public final void mo5828() {
                                jo.m8253(jo.this);
                            }
                        });
                    }
                };
                jo.this.f2849.post(new je() { // from class: com.ironsource.adqualitysdk.sdk.i.jo.4.1
                    @Override // com.ironsource.adqualitysdk.sdk.i.je
                    /* renamed from: ｋ */
                    public final void mo5828() {
                        jt.m8290().m8295(jo.this.f2845);
                        p.m8557(new je() { // from class: com.ironsource.adqualitysdk.sdk.i.jo.4.1.1
                            @Override // com.ironsource.adqualitysdk.sdk.i.je
                            /* renamed from: ｋ */
                            public final void mo5828() {
                                jo.m8253(jo.this);
                            }
                        });
                    }
                });
            }
        }
    }

    /* renamed from: ｋ, reason: contains not printable characters */
    public final synchronized void m8254() {
        p.m8557(new AnonymousClass4());
    }

    /* renamed from: com.ironsource.adqualitysdk.sdk.i.jo$1, reason: invalid class name */
    final class AnonymousClass1 extends je {

        /* renamed from: ｋ, reason: contains not printable characters */
        final /* synthetic */ iw f2851;

        AnonymousClass1(iw iwVar) {
            this.f2851 = iwVar;
        }

        @Override // com.ironsource.adqualitysdk.sdk.i.je
        /* renamed from: ｋ */
        public final void mo5828() {
            jo.this.f2846.put(this.f2851, new je() { // from class: com.ironsource.adqualitysdk.sdk.i.jo.1.5
                @Override // com.ironsource.adqualitysdk.sdk.i.je
                /* renamed from: ｋ */
                public final void mo5828() {
                    AnonymousClass1.this.f2851.mo7412();
                }
            });
            jo.m8253(jo.this);
        }
    }

    /* renamed from: ｋ, reason: contains not printable characters */
    public final void m8255(iw iwVar) {
        p.m8557(new AnonymousClass1(iwVar));
    }

    /* renamed from: com.ironsource.adqualitysdk.sdk.i.jo$2, reason: invalid class name */
    final class AnonymousClass2 extends je {

        /* renamed from: ｋ, reason: contains not printable characters */
        private /* synthetic */ iw f2854;

        AnonymousClass2(iw iwVar) {
            this.f2854 = iwVar;
        }

        @Override // com.ironsource.adqualitysdk.sdk.i.je
        /* renamed from: ｋ */
        public final void mo5828() {
            jo.this.f2846.remove(this.f2854);
        }
    }

    /* renamed from: ﾇ, reason: contains not printable characters */
    public final void m8256(iw iwVar) {
        p.m8557(new AnonymousClass2(iwVar));
    }

    /* renamed from: ﾒ, reason: contains not printable characters */
    static /* synthetic */ void m8253(jo joVar) {
        if (joVar.f2847 || new HashMap(joVar.f2846).isEmpty()) {
            return;
        }
        joVar.f2847 = true;
        p.m8557(new je() { // from class: com.ironsource.adqualitysdk.sdk.i.jo.3
            @Override // com.ironsource.adqualitysdk.sdk.i.je
            /* renamed from: ｋ */
            public final void mo5828() {
                if (!jo.this.f2847) {
                    jo.this.f2848 = null;
                    return;
                }
                HashMap m8245 = jo.m8245(jo.this);
                Iterator it = m8245.keySet().iterator();
                while (it.hasNext()) {
                    jo.this.f2849.post((Runnable) m8245.get((iw) it.next()));
                }
                if (jo.this.f2848 == null) {
                    jo.this.f2848 = new Choreographer.FrameCallback() { // from class: com.ironsource.adqualitysdk.sdk.i.jo.3.2

                        /* renamed from: ｋ, reason: contains not printable characters */
                        private static int[] f2856 = {-1565241423, 1409866962, 69890831, -1638393562, 1521212856, 1092074966, -1242711693, -1085770036, -1814922786, 2027094965, -1944592496, -1792759570, 580083616, 323535689, -1008012711, 1994750649, -2024301807, -1458727179};

                        /* renamed from: ﾇ, reason: contains not printable characters */
                        private static int f2857 = 0;

                        /* renamed from: ﾒ, reason: contains not printable characters */
                        private static int f2858 = 1;

                        @Override // android.view.Choreographer.FrameCallback
                        public final void doFrame(long j) {
                            int i = 2 % 2;
                            int i2 = f2858 + 115;
                            f2857 = i2 % 128;
                            int i3 = i2 % 2;
                            try {
                                p.m8552(je.this);
                                int i4 = f2858 + 5;
                                f2857 = i4 % 128;
                                int i5 = i4 % 2;
                            } catch (Throwable th) {
                                m.m8526(m8257(new int[]{1057666961, 1092710459, 601714879, 1792987600, -201657226, 2020152173}, 12 - View.combineMeasuredStates(0, 0)).intern(), m8257(new int[]{-37546726, -656574888, -153447298, 1440608534, -349228691, 2009733402, -882229853, 702967395}, 14 - TextUtils.getOffsetBefore("", 0)).intern(), th, false);
                            }
                        }

                        /* renamed from: ｋ, reason: contains not printable characters */
                        private static String m8257(int[] iArr, int i) {
                            String str;
                            synchronized (a.f86) {
                                char[] cArr = new char[4];
                                char[] cArr2 = new char[iArr.length << 1];
                                int[] iArr2 = (int[]) f2856.clone();
                                a.f83 = 0;
                                while (a.f83 < iArr.length) {
                                    cArr[0] = (char) (iArr[a.f83] >> 16);
                                    cArr[1] = (char) iArr[a.f83];
                                    cArr[2] = (char) (iArr[a.f83 + 1] >> 16);
                                    cArr[3] = (char) iArr[a.f83 + 1];
                                    a.f84 = (cArr[0] << 16) + cArr[1];
                                    a.f85 = (cArr[2] << 16) + cArr[3];
                                    a.m5773(iArr2);
                                    for (int i2 = 0; i2 < 16; i2++) {
                                        int i3 = a.f84 ^ iArr2[i2];
                                        a.f84 = i3;
                                        a.f85 = a.m5774(i3) ^ a.f85;
                                        int i4 = a.f84;
                                        a.f84 = a.f85;
                                        a.f85 = i4;
                                    }
                                    int i5 = a.f84;
                                    a.f84 = a.f85;
                                    a.f85 = i5;
                                    a.f85 = i5 ^ iArr2[16];
                                    a.f84 ^= iArr2[17];
                                    int i6 = a.f84;
                                    int i7 = a.f85;
                                    cArr[0] = (char) (a.f84 >>> 16);
                                    cArr[1] = (char) a.f84;
                                    cArr[2] = (char) (a.f85 >>> 16);
                                    cArr[3] = (char) a.f85;
                                    a.m5773(iArr2);
                                    cArr2[a.f83 << 1] = cArr[0];
                                    cArr2[(a.f83 << 1) + 1] = cArr[1];
                                    cArr2[(a.f83 << 1) + 2] = cArr[2];
                                    cArr2[(a.f83 << 1) + 3] = cArr[3];
                                    a.f83 += 2;
                                }
                                str = new String(cArr2, 0, i);
                            }
                            return str;
                        }
                    };
                }
                Choreographer.getInstance().postFrameCallback(jo.this.f2848);
            }
        });
    }

    /* renamed from: ﱡ, reason: contains not printable characters */
    static /* synthetic */ HashMap m8245(jo joVar) {
        return new HashMap(joVar.f2846);
    }
}
