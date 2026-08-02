package com.ironsource.adqualitysdk.sdk.i;

import android.graphics.Color;
import android.media.AudioTrack;
import android.os.SystemClock;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.ironsource.adqualitysdk.sdk.i.hy;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes5.dex */
public class ie extends hy {

    /* renamed from: ﮐ, reason: contains not printable characters */
    private List<Class> f2479 = new ArrayList();

    /* renamed from: ﱟ, reason: contains not printable characters */
    private Class f2480;

    /* renamed from: ﱡ, reason: contains not printable characters */
    private boolean f2481;

    /* renamed from: ﺙ, reason: contains not printable characters */
    private int f2482;

    /* renamed from: ﻏ, reason: contains not printable characters */
    private List<Class> f2483;

    /* renamed from: ﻐ, reason: contains not printable characters */
    private int f2484;

    public ie() {
        mo7879();
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.hy
    /* renamed from: ﾇ */
    protected final void mo7879() {
        super.mo7879();
        this.f2480 = null;
        this.f2484 = 0;
        this.f2481 = true;
        this.f2479.clear();
        this.f2483 = null;
        this.f2482 = -1;
    }

    /* renamed from: ﺙ, reason: contains not printable characters */
    public final Class m7951() {
        return this.f2480;
    }

    /* renamed from: ﻏ, reason: contains not printable characters */
    public final int m7952() {
        return this.f2484;
    }

    /* renamed from: ﮐ, reason: contains not printable characters */
    public final boolean m7948() {
        return this.f2481;
    }

    /* renamed from: ﱟ, reason: contains not printable characters */
    public final List<Class> m7949() {
        return this.f2479;
    }

    /* renamed from: ﱡ, reason: contains not printable characters */
    public final List<Class> m7950() {
        return this.f2483;
    }

    /* renamed from: ﭸ, reason: contains not printable characters */
    public final int m7947() {
        return this.f2482;
    }

    public static class b extends hy.e implements ch {

        /* renamed from: ﺙ, reason: contains not printable characters */
        private static int f2485 = 0;

        /* renamed from: ﻏ, reason: contains not printable characters */
        private static int f2486 = 1;

        /* renamed from: ﻐ, reason: contains not printable characters */
        private static int f2487 = 0;

        /* renamed from: ﻛ, reason: contains not printable characters */
        private static char f2488 = 31972;

        /* renamed from: ｋ, reason: contains not printable characters */
        private static int[] f2489 = {-804386029, 1395521123, -113807917, 530288319, 1331555030, -1175084853, 348934239, 1547870385, -136348415, -1286304690, -1066894042, 1329612290, -2146018291, -2058700273, 1841405790, -1254454187, -1147107767, 2122337971};

        /* renamed from: ﾇ, reason: contains not printable characters */
        private static long f2490;

        /* renamed from: ﾒ, reason: contains not printable characters */
        private ie f2491 = new ie();

        /* renamed from: ﾇ, reason: contains not printable characters */
        private b m7962(Class cls) {
            int i = 2 % 2;
            int i2 = f2486 + 27;
            f2485 = i2 % 128;
            int i3 = i2 % 2;
            this.f2491.f2480 = cls;
            int i4 = f2485 + 5;
            f2486 = i4 % 128;
            int i5 = i4 % 2;
            return this;
        }

        /* renamed from: ﻐ, reason: contains not printable characters */
        private b m7953(int i) {
            int i2 = 2 % 2;
            int i3 = f2486 + 35;
            f2485 = i3 % 128;
            if (i3 % 2 == 0) {
                this.f2491.f2484 = i;
                int i4 = f2485 + 45;
                f2486 = i4 % 128;
                int i5 = i4 % 2;
                return this;
            }
            this.f2491.f2484 = i;
            throw null;
        }

        /* renamed from: ﾇ, reason: contains not printable characters */
        private b m7963(boolean z) {
            int i = 2 % 2;
            int i2 = f2485 + 25;
            f2486 = i2 % 128;
            if (i2 % 2 == 0) {
                this.f2491.f2481 = z;
                int i3 = 1 / 0;
            } else {
                this.f2491.f2481 = z;
            }
            int i4 = f2485 + 13;
            f2486 = i4 % 128;
            if (i4 % 2 != 0) {
                return this;
            }
            throw null;
        }

        /* renamed from: ｋ, reason: contains not printable characters */
        private b m7958(int i) {
            ie ieVar;
            int i2;
            int i3 = 2 % 2;
            int i4 = f2486 + 1;
            f2485 = i4 % 128;
            if (i4 % 2 != 0) {
                ieVar = this.f2491;
                i2 = i ^ ieVar.f2443;
            } else {
                ieVar = this.f2491;
                i2 = i | ieVar.f2443;
            }
            ieVar.f2443 = i2;
            int i5 = f2485 + 77;
            f2486 = i5 % 128;
            int i6 = i5 % 2;
            return this;
        }

        /* renamed from: ﾇ, reason: contains not printable characters */
        private b m7961(int i) {
            ie ieVar;
            int i2;
            int i3 = 2 % 2;
            int i4 = f2486 + 73;
            f2485 = i4 % 128;
            if (i4 % 2 != 0) {
                ieVar = this.f2491;
                i2 = i & ieVar.f2442;
            } else {
                ieVar = this.f2491;
                i2 = i | ieVar.f2442;
            }
            ieVar.f2442 = i2;
            int i5 = f2485 + 15;
            f2486 = i5 % 128;
            int i6 = i5 % 2;
            return this;
        }

        /* renamed from: ﻐ, reason: contains not printable characters */
        private b m7954(boolean z, int i) {
            int i2 = 2 % 2;
            int i3 = f2486 + 69;
            f2485 = i3 % 128;
            if (i3 % 2 == 0) {
                this.f2491.f2441 = z;
                this.f2491.f2440 = i;
                int i4 = f2485 + 111;
                f2486 = i4 % 128;
                int i5 = i4 % 2;
                return this;
            }
            this.f2491.f2441 = z;
            this.f2491.f2440 = i;
            Object obj = null;
            super.hashCode();
            throw null;
        }

        /* renamed from: ｋ, reason: contains not printable characters */
        private b m7959(Class cls) {
            int i = 2 % 2;
            int i2 = f2485 + 61;
            f2486 = i2 % 128;
            int i3 = i2 % 2;
            this.f2491.f2479.add(cls);
            int i4 = f2486 + 37;
            f2485 = i4 % 128;
            if (i4 % 2 == 0) {
                return this;
            }
            throw null;
        }

        /* renamed from: ｋ, reason: contains not printable characters */
        private b m7960(List<Class> list) {
            int i = 2 % 2;
            int i2 = f2486 + 57;
            f2485 = i2 % 128;
            int i3 = i2 % 2;
            this.f2491.f2483 = list;
            int i4 = f2486 + 57;
            f2485 = i4 % 128;
            int i5 = i4 % 2;
            return this;
        }

        /* renamed from: ﻛ, reason: contains not printable characters */
        private b m7955(int i) {
            int i2 = 2 % 2;
            int i3 = f2485 + 109;
            f2486 = i3 % 128;
            int i4 = i3 % 2;
            this.f2491.f2482 = i;
            int i5 = f2485 + 11;
            f2486 = i5 % 128;
            if (i5 % 2 != 0) {
                return this;
            }
            throw null;
        }

        /* renamed from: ｋ, reason: contains not printable characters */
        private b m7957() {
            int i = 2 % 2;
            int i2 = f2485 + 67;
            f2486 = i2 % 128;
            if (i2 % 2 != 0) {
                this.f2491.mo7879();
                return this;
            }
            this.f2491.mo7879();
            Object obj = null;
            super.hashCode();
            throw null;
        }

        /* renamed from: ﾇ, reason: contains not printable characters */
        private ie m7964() {
            int i = 2 % 2;
            int i2 = f2485 + 67;
            int i3 = i2 % 128;
            f2486 = i3;
            int i4 = i2 % 2;
            ie ieVar = this.f2491;
            int i5 = i3 + 35;
            f2485 = i5 % 128;
            if (i5 % 2 == 0) {
                return ieVar;
            }
            Object obj = null;
            super.hashCode();
            throw null;
        }

        /* JADX WARN: Removed duplicated region for block: B:11:0x01f9 A[Catch: Exception -> 0x01f2, TryCatch #3 {Exception -> 0x01f2, blocks: (B:10:0x01f6, B:11:0x01f9, B:12:0x02bc, B:22:0x01fd, B:24:0x0202, B:26:0x0207, B:28:0x0214, B:32:0x0232, B:33:0x023a, B:34:0x023f, B:35:0x0248, B:37:0x024d, B:39:0x025e, B:41:0x026f, B:43:0x0280, B:45:0x0291, B:47:0x02a2, B:49:0x02af, B:77:0x018a, B:81:0x01a4, B:84:0x01cb), top: B:5:0x002b }] */
        /* JADX WARN: Removed duplicated region for block: B:22:0x01fd A[Catch: Exception -> 0x01f2, TryCatch #3 {Exception -> 0x01f2, blocks: (B:10:0x01f6, B:11:0x01f9, B:12:0x02bc, B:22:0x01fd, B:24:0x0202, B:26:0x0207, B:28:0x0214, B:32:0x0232, B:33:0x023a, B:34:0x023f, B:35:0x0248, B:37:0x024d, B:39:0x025e, B:41:0x026f, B:43:0x0280, B:45:0x0291, B:47:0x02a2, B:49:0x02af, B:77:0x018a, B:81:0x01a4, B:84:0x01cb), top: B:5:0x002b }] */
        /* JADX WARN: Removed duplicated region for block: B:24:0x0202 A[Catch: Exception -> 0x01f2, TryCatch #3 {Exception -> 0x01f2, blocks: (B:10:0x01f6, B:11:0x01f9, B:12:0x02bc, B:22:0x01fd, B:24:0x0202, B:26:0x0207, B:28:0x0214, B:32:0x0232, B:33:0x023a, B:34:0x023f, B:35:0x0248, B:37:0x024d, B:39:0x025e, B:41:0x026f, B:43:0x0280, B:45:0x0291, B:47:0x02a2, B:49:0x02af, B:77:0x018a, B:81:0x01a4, B:84:0x01cb), top: B:5:0x002b }] */
        /* JADX WARN: Removed duplicated region for block: B:26:0x0207 A[Catch: Exception -> 0x01f2, TryCatch #3 {Exception -> 0x01f2, blocks: (B:10:0x01f6, B:11:0x01f9, B:12:0x02bc, B:22:0x01fd, B:24:0x0202, B:26:0x0207, B:28:0x0214, B:32:0x0232, B:33:0x023a, B:34:0x023f, B:35:0x0248, B:37:0x024d, B:39:0x025e, B:41:0x026f, B:43:0x0280, B:45:0x0291, B:47:0x02a2, B:49:0x02af, B:77:0x018a, B:81:0x01a4, B:84:0x01cb), top: B:5:0x002b }] */
        /* JADX WARN: Removed duplicated region for block: B:28:0x0214 A[Catch: Exception -> 0x01f2, TRY_LEAVE, TryCatch #3 {Exception -> 0x01f2, blocks: (B:10:0x01f6, B:11:0x01f9, B:12:0x02bc, B:22:0x01fd, B:24:0x0202, B:26:0x0207, B:28:0x0214, B:32:0x0232, B:33:0x023a, B:34:0x023f, B:35:0x0248, B:37:0x024d, B:39:0x025e, B:41:0x026f, B:43:0x0280, B:45:0x0291, B:47:0x02a2, B:49:0x02af, B:77:0x018a, B:81:0x01a4, B:84:0x01cb), top: B:5:0x002b }] */
        /* JADX WARN: Removed duplicated region for block: B:37:0x024d A[Catch: Exception -> 0x01f2, TryCatch #3 {Exception -> 0x01f2, blocks: (B:10:0x01f6, B:11:0x01f9, B:12:0x02bc, B:22:0x01fd, B:24:0x0202, B:26:0x0207, B:28:0x0214, B:32:0x0232, B:33:0x023a, B:34:0x023f, B:35:0x0248, B:37:0x024d, B:39:0x025e, B:41:0x026f, B:43:0x0280, B:45:0x0291, B:47:0x02a2, B:49:0x02af, B:77:0x018a, B:81:0x01a4, B:84:0x01cb), top: B:5:0x002b }] */
        /* JADX WARN: Removed duplicated region for block: B:39:0x025e A[Catch: Exception -> 0x01f2, TryCatch #3 {Exception -> 0x01f2, blocks: (B:10:0x01f6, B:11:0x01f9, B:12:0x02bc, B:22:0x01fd, B:24:0x0202, B:26:0x0207, B:28:0x0214, B:32:0x0232, B:33:0x023a, B:34:0x023f, B:35:0x0248, B:37:0x024d, B:39:0x025e, B:41:0x026f, B:43:0x0280, B:45:0x0291, B:47:0x02a2, B:49:0x02af, B:77:0x018a, B:81:0x01a4, B:84:0x01cb), top: B:5:0x002b }] */
        /* JADX WARN: Removed duplicated region for block: B:41:0x026f A[Catch: Exception -> 0x01f2, TryCatch #3 {Exception -> 0x01f2, blocks: (B:10:0x01f6, B:11:0x01f9, B:12:0x02bc, B:22:0x01fd, B:24:0x0202, B:26:0x0207, B:28:0x0214, B:32:0x0232, B:33:0x023a, B:34:0x023f, B:35:0x0248, B:37:0x024d, B:39:0x025e, B:41:0x026f, B:43:0x0280, B:45:0x0291, B:47:0x02a2, B:49:0x02af, B:77:0x018a, B:81:0x01a4, B:84:0x01cb), top: B:5:0x002b }] */
        /* JADX WARN: Removed duplicated region for block: B:43:0x0280 A[Catch: Exception -> 0x01f2, TryCatch #3 {Exception -> 0x01f2, blocks: (B:10:0x01f6, B:11:0x01f9, B:12:0x02bc, B:22:0x01fd, B:24:0x0202, B:26:0x0207, B:28:0x0214, B:32:0x0232, B:33:0x023a, B:34:0x023f, B:35:0x0248, B:37:0x024d, B:39:0x025e, B:41:0x026f, B:43:0x0280, B:45:0x0291, B:47:0x02a2, B:49:0x02af, B:77:0x018a, B:81:0x01a4, B:84:0x01cb), top: B:5:0x002b }] */
        /* JADX WARN: Removed duplicated region for block: B:45:0x0291 A[Catch: Exception -> 0x01f2, TryCatch #3 {Exception -> 0x01f2, blocks: (B:10:0x01f6, B:11:0x01f9, B:12:0x02bc, B:22:0x01fd, B:24:0x0202, B:26:0x0207, B:28:0x0214, B:32:0x0232, B:33:0x023a, B:34:0x023f, B:35:0x0248, B:37:0x024d, B:39:0x025e, B:41:0x026f, B:43:0x0280, B:45:0x0291, B:47:0x02a2, B:49:0x02af, B:77:0x018a, B:81:0x01a4, B:84:0x01cb), top: B:5:0x002b }] */
        /* JADX WARN: Removed duplicated region for block: B:47:0x02a2 A[Catch: Exception -> 0x01f2, TryCatch #3 {Exception -> 0x01f2, blocks: (B:10:0x01f6, B:11:0x01f9, B:12:0x02bc, B:22:0x01fd, B:24:0x0202, B:26:0x0207, B:28:0x0214, B:32:0x0232, B:33:0x023a, B:34:0x023f, B:35:0x0248, B:37:0x024d, B:39:0x025e, B:41:0x026f, B:43:0x0280, B:45:0x0291, B:47:0x02a2, B:49:0x02af, B:77:0x018a, B:81:0x01a4, B:84:0x01cb), top: B:5:0x002b }] */
        /* JADX WARN: Removed duplicated region for block: B:49:0x02af A[Catch: Exception -> 0x01f2, TryCatch #3 {Exception -> 0x01f2, blocks: (B:10:0x01f6, B:11:0x01f9, B:12:0x02bc, B:22:0x01fd, B:24:0x0202, B:26:0x0207, B:28:0x0214, B:32:0x0232, B:33:0x023a, B:34:0x023f, B:35:0x0248, B:37:0x024d, B:39:0x025e, B:41:0x026f, B:43:0x0280, B:45:0x0291, B:47:0x02a2, B:49:0x02af, B:77:0x018a, B:81:0x01a4, B:84:0x01cb), top: B:5:0x002b }] */
        @Override // com.ironsource.adqualitysdk.sdk.i.ch
        /* renamed from: ﻛ */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object mo6381(cl clVar, String str, List<Object> list, ck ckVar, ee eeVar) {
            char c;
            cl clVar2;
            char c2;
            int i;
            int i2 = 2 % 2;
            int i3 = f2486 + 105;
            f2485 = i3 % 128;
            int i4 = i3 % 2;
            try {
                c2 = 5;
                i = -1;
            } catch (Exception e) {
                e = e;
                c = '0';
            }
            try {
                try {
                } catch (Exception e2) {
                    e = e2;
                    c = '0';
                    clVar2 = clVar;
                    cn.m7268(clVar2.m7203(), new StringBuilder().append(m7965(new int[]{236951227, 2107217041, -1338325202, 1339392390, 56564810, -1623815579, 1045885554, 1518782422, 1964697136, 203981995, -194676, 1681196046, 315477441, 1092687620, -1633074551, -558155158, -1046595256, 973150194, 1787575648, 1379705223, -1146701021, 2108943384, -2001980152, -1027750699, 315477441, 1092687620, -1903331422, 1220111101}, AndroidCharacter.getMirror(c) + 6).intern()).append(str).append(m7956((char) (TextUtils.getOffsetAfter("", 0) + 32126), "\u0000\u0000\u0000\u0000", "ᜄ㊭繑\uf37d", "檯", (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)) + 1362275607).intern()).toString(), e);
                    return null;
                }
            } catch (Exception e3) {
                e = e3;
                clVar2 = clVar;
                cn.m7268(clVar2.m7203(), new StringBuilder().append(m7965(new int[]{236951227, 2107217041, -1338325202, 1339392390, 56564810, -1623815579, 1045885554, 1518782422, 1964697136, 203981995, -194676, 1681196046, 315477441, 1092687620, -1633074551, -558155158, -1046595256, 973150194, 1787575648, 1379705223, -1146701021, 2108943384, -2001980152, -1027750699, 315477441, 1092687620, -1903331422, 1220111101}, AndroidCharacter.getMirror(c) + 6).intern()).append(str).append(m7956((char) (TextUtils.getOffsetAfter("", 0) + 32126), "\u0000\u0000\u0000\u0000", "ᜄ㊭繑\uf37d", "檯", (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)) + 1362275607).intern()).toString(), e);
                return null;
            }
            switch (str.hashCode()) {
                case -2020212392:
                    c = '0';
                    if (str.equals(m7956((char) (ViewConfiguration.getDoubleTapTimeout() >> 16), "\u0000\u0000\u0000\u0000", "\ufaff謯꾌\udf38", "対祀\uf71b徛䞂\ue9b2줲\u2004䟕˾ᢺ⍐뺈㲶옞冰눚끡驚雾詬", (-1937035270) - ExpandableListView.getPackedPositionGroup(0L)).intern())) {
                        c2 = '\b';
                        switch (c2) {
                            case 0:
                                return m7962((Class) m7365(list, 0, Class.class));
                            case 1:
                                return m7960((List<Class>) m7365(list, 0, List.class));
                            case 2:
                                return m7955(((Integer) m7365(list, 0, Integer.class)).intValue());
                            case 3:
                                return m7953(((Integer) m7365(list, 0, Integer.class)).intValue());
                            case 4:
                                return m7963(((Boolean) m7365(list, 0, Boolean.class)).booleanValue());
                            case 5:
                                return m7958(((Integer) m7365(list, 0, Integer.class)).intValue());
                            case 6:
                                return m7961(((Integer) m7365(list, 0, Integer.class)).intValue());
                            case 7:
                                boolean booleanValue = ((Boolean) m7365(list, 0, Boolean.class)).booleanValue();
                                if (list.size() > 1) {
                                    int i5 = f2486 + 79;
                                    f2485 = i5 % 128;
                                    i = (i5 % 2 != 0 ? (Integer) m7365(list, 0, Integer.class) : (Integer) m7365(list, 1, Integer.class)).intValue();
                                }
                                return m7954(booleanValue, i);
                            case '\b':
                                return m7959((Class) m7365(list, 0, Class.class));
                            case '\t':
                                return m7957();
                            case '\n':
                                return m7964();
                            default:
                                clVar2 = clVar;
                                try {
                                    new ds(clVar2, eeVar, m7965(new int[]{387113942, -655410236, -991139694, -967212369, 69629680, -392714505, -1815637381, -1138176378}, TextUtils.getOffsetAfter("", 0) + 16).intern(), str).m7593(clVar2.m7203());
                                    return null;
                                } catch (Exception e4) {
                                    e = e4;
                                    break;
                                }
                        }
                        cn.m7268(clVar2.m7203(), new StringBuilder().append(m7965(new int[]{236951227, 2107217041, -1338325202, 1339392390, 56564810, -1623815579, 1045885554, 1518782422, 1964697136, 203981995, -194676, 1681196046, 315477441, 1092687620, -1633074551, -558155158, -1046595256, 973150194, 1787575648, 1379705223, -1146701021, 2108943384, -2001980152, -1027750699, 315477441, 1092687620, -1903331422, 1220111101}, AndroidCharacter.getMirror(c) + 6).intern()).append(str).append(m7956((char) (TextUtils.getOffsetAfter("", 0) + 32126), "\u0000\u0000\u0000\u0000", "ᜄ㊭繑\uf37d", "檯", (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)) + 1362275607).intern()).toString(), e);
                        return null;
                    }
                    c2 = 65535;
                    switch (c2) {
                    }
                    cn.m7268(clVar2.m7203(), new StringBuilder().append(m7965(new int[]{236951227, 2107217041, -1338325202, 1339392390, 56564810, -1623815579, 1045885554, 1518782422, 1964697136, 203981995, -194676, 1681196046, 315477441, 1092687620, -1633074551, -558155158, -1046595256, 973150194, 1787575648, 1379705223, -1146701021, 2108943384, -2001980152, -1027750699, 315477441, 1092687620, -1903331422, 1220111101}, AndroidCharacter.getMirror(c) + 6).intern()).append(str).append(m7956((char) (TextUtils.getOffsetAfter("", 0) + 32126), "\u0000\u0000\u0000\u0000", "ᜄ㊭繑\uf37d", "檯", (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)) + 1362275607).intern()).toString(), e);
                    return null;
                case -600792781:
                    c = '0';
                    if (str.equals(m7956((char) (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)), "\u0000\u0000\u0000\u0000", "ꍎᡇ붠眖", "콹町\uda7f㷣芀浨ꃘ튵嚕驌ꑞ", (-1625798749) - Color.rgb(0, 0, 0)).intern())) {
                        c2 = 3;
                        switch (c2) {
                        }
                        cn.m7268(clVar2.m7203(), new StringBuilder().append(m7965(new int[]{236951227, 2107217041, -1338325202, 1339392390, 56564810, -1623815579, 1045885554, 1518782422, 1964697136, 203981995, -194676, 1681196046, 315477441, 1092687620, -1633074551, -558155158, -1046595256, 973150194, 1787575648, 1379705223, -1146701021, 2108943384, -2001980152, -1027750699, 315477441, 1092687620, -1903331422, 1220111101}, AndroidCharacter.getMirror(c) + 6).intern()).append(str).append(m7956((char) (TextUtils.getOffsetAfter("", 0) + 32126), "\u0000\u0000\u0000\u0000", "ᜄ㊭繑\uf37d", "檯", (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)) + 1362275607).intern()).toString(), e);
                        return null;
                    }
                    c2 = 65535;
                    switch (c2) {
                    }
                    cn.m7268(clVar2.m7203(), new StringBuilder().append(m7965(new int[]{236951227, 2107217041, -1338325202, 1339392390, 56564810, -1623815579, 1045885554, 1518782422, 1964697136, 203981995, -194676, 1681196046, 315477441, 1092687620, -1633074551, -558155158, -1046595256, 973150194, 1787575648, 1379705223, -1146701021, 2108943384, -2001980152, -1027750699, 315477441, 1092687620, -1903331422, 1220111101}, AndroidCharacter.getMirror(c) + 6).intern()).append(str).append(m7956((char) (TextUtils.getOffsetAfter("", 0) + 32126), "\u0000\u0000\u0000\u0000", "ᜄ㊭繑\uf37d", "檯", (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)) + 1362275607).intern()).toString(), e);
                    return null;
                case 94094958:
                    c = '0';
                    if (str.equals(m7965(new int[]{1698060310, -1107420556, 627199767, -401745003}, 5 - (ViewConfiguration.getScrollBarSize() >> 8)).intern())) {
                        c2 = '\n';
                        switch (c2) {
                        }
                        cn.m7268(clVar2.m7203(), new StringBuilder().append(m7965(new int[]{236951227, 2107217041, -1338325202, 1339392390, 56564810, -1623815579, 1045885554, 1518782422, 1964697136, 203981995, -194676, 1681196046, 315477441, 1092687620, -1633074551, -558155158, -1046595256, 973150194, 1787575648, 1379705223, -1146701021, 2108943384, -2001980152, -1027750699, 315477441, 1092687620, -1903331422, 1220111101}, AndroidCharacter.getMirror(c) + 6).intern()).append(str).append(m7956((char) (TextUtils.getOffsetAfter("", 0) + 32126), "\u0000\u0000\u0000\u0000", "ᜄ㊭繑\uf37d", "檯", (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)) + 1362275607).intern()).toString(), e);
                        return null;
                    }
                    c2 = 65535;
                    switch (c2) {
                    }
                    cn.m7268(clVar2.m7203(), new StringBuilder().append(m7965(new int[]{236951227, 2107217041, -1338325202, 1339392390, 56564810, -1623815579, 1045885554, 1518782422, 1964697136, 203981995, -194676, 1681196046, 315477441, 1092687620, -1633074551, -558155158, -1046595256, 973150194, 1787575648, 1379705223, -1146701021, 2108943384, -2001980152, -1027750699, 315477441, 1092687620, -1903331422, 1220111101}, AndroidCharacter.getMirror(c) + 6).intern()).append(str).append(m7956((char) (TextUtils.getOffsetAfter("", 0) + 32126), "\u0000\u0000\u0000\u0000", "ᜄ㊭繑\uf37d", "檯", (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)) + 1362275607).intern()).toString(), e);
                    return null;
                case 108404047:
                    if (str.equals(m7956((char) ((ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)) + 42164), "\u0000\u0000\u0000\u0000", "\uf77c㏑뗐㺤", "戜\ue6d3絮亨｛", KeyEvent.keyCodeFromString("") - 801910281).intern())) {
                        c2 = '\t';
                        c = '0';
                        switch (c2) {
                        }
                        cn.m7268(clVar2.m7203(), new StringBuilder().append(m7965(new int[]{236951227, 2107217041, -1338325202, 1339392390, 56564810, -1623815579, 1045885554, 1518782422, 1964697136, 203981995, -194676, 1681196046, 315477441, 1092687620, -1633074551, -558155158, -1046595256, 973150194, 1787575648, 1379705223, -1146701021, 2108943384, -2001980152, -1027750699, 315477441, 1092687620, -1903331422, 1220111101}, AndroidCharacter.getMirror(c) + 6).intern()).append(str).append(m7956((char) (TextUtils.getOffsetAfter("", 0) + 32126), "\u0000\u0000\u0000\u0000", "ᜄ㊭繑\uf37d", "檯", (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)) + 1362275607).intern()).toString(), e);
                        return null;
                    }
                    c = '0';
                    c2 = 65535;
                    switch (c2) {
                    }
                    cn.m7268(clVar2.m7203(), new StringBuilder().append(m7965(new int[]{236951227, 2107217041, -1338325202, 1339392390, 56564810, -1623815579, 1045885554, 1518782422, 1964697136, 203981995, -194676, 1681196046, 315477441, 1092687620, -1633074551, -558155158, -1046595256, 973150194, 1787575648, 1379705223, -1146701021, 2108943384, -2001980152, -1027750699, 315477441, 1092687620, -1903331422, 1220111101}, AndroidCharacter.getMirror(c) + 6).intern()).append(str).append(m7956((char) (TextUtils.getOffsetAfter("", 0) + 32126), "\u0000\u0000\u0000\u0000", "ᜄ㊭繑\uf37d", "檯", (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)) + 1362275607).intern()).toString(), e);
                    return null;
                case 132643084:
                    if (str.equals(m7965(new int[]{2016190710, -1500845879, -588640293, 591504156, 1044049423, 97128604, -492667199, 1557947392, -1007401941, 1894406062, 1938435386, -990688711}, 21 - (ViewConfiguration.getEdgeSlop() >> 16)).intern())) {
                        c2 = 2;
                        c = '0';
                        switch (c2) {
                        }
                        cn.m7268(clVar2.m7203(), new StringBuilder().append(m7965(new int[]{236951227, 2107217041, -1338325202, 1339392390, 56564810, -1623815579, 1045885554, 1518782422, 1964697136, 203981995, -194676, 1681196046, 315477441, 1092687620, -1633074551, -558155158, -1046595256, 973150194, 1787575648, 1379705223, -1146701021, 2108943384, -2001980152, -1027750699, 315477441, 1092687620, -1903331422, 1220111101}, AndroidCharacter.getMirror(c) + 6).intern()).append(str).append(m7956((char) (TextUtils.getOffsetAfter("", 0) + 32126), "\u0000\u0000\u0000\u0000", "ᜄ㊭繑\uf37d", "檯", (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)) + 1362275607).intern()).toString(), e);
                        return null;
                    }
                    c = '0';
                    c2 = 65535;
                    switch (c2) {
                    }
                    cn.m7268(clVar2.m7203(), new StringBuilder().append(m7965(new int[]{236951227, 2107217041, -1338325202, 1339392390, 56564810, -1623815579, 1045885554, 1518782422, 1964697136, 203981995, -194676, 1681196046, 315477441, 1092687620, -1633074551, -558155158, -1046595256, 973150194, 1787575648, 1379705223, -1146701021, 2108943384, -2001980152, -1027750699, 315477441, 1092687620, -1903331422, 1220111101}, AndroidCharacter.getMirror(c) + 6).intern()).append(str).append(m7956((char) (TextUtils.getOffsetAfter("", 0) + 32126), "\u0000\u0000\u0000\u0000", "ᜄ㊭繑\uf37d", "檯", (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)) + 1362275607).intern()).toString(), e);
                    return null;
                case 200590504:
                    if (str.equals(m7956((char) View.MeasureSpec.getMode(0), "\u0000\u0000\u0000\u0000", "轄\uf7e6\uf258旪", "ォ㼹៖섡ᱛ駢蹥ټ結숐圬巩ꊂ\uf2c1鑼\udb2d睺ᜊꞼ嫽禙\ud9b4㤺酺", TextUtils.indexOf("", "")).intern())) {
                        int i6 = f2486;
                        int i7 = i6 + 29;
                        f2485 = i7 % 128;
                        int i8 = i7 % 2;
                        int i9 = i6 + 15;
                        f2485 = i9 % 128;
                        int i10 = i9 % 2;
                        c2 = 4;
                        c = '0';
                        switch (c2) {
                        }
                        cn.m7268(clVar2.m7203(), new StringBuilder().append(m7965(new int[]{236951227, 2107217041, -1338325202, 1339392390, 56564810, -1623815579, 1045885554, 1518782422, 1964697136, 203981995, -194676, 1681196046, 315477441, 1092687620, -1633074551, -558155158, -1046595256, 973150194, 1787575648, 1379705223, -1146701021, 2108943384, -2001980152, -1027750699, 315477441, 1092687620, -1903331422, 1220111101}, AndroidCharacter.getMirror(c) + 6).intern()).append(str).append(m7956((char) (TextUtils.getOffsetAfter("", 0) + 32126), "\u0000\u0000\u0000\u0000", "ᜄ㊭繑\uf37d", "檯", (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)) + 1362275607).intern()).toString(), e);
                        return null;
                    }
                    c = '0';
                    c2 = 65535;
                    switch (c2) {
                    }
                    cn.m7268(clVar2.m7203(), new StringBuilder().append(m7965(new int[]{236951227, 2107217041, -1338325202, 1339392390, 56564810, -1623815579, 1045885554, 1518782422, 1964697136, 203981995, -194676, 1681196046, 315477441, 1092687620, -1633074551, -558155158, -1046595256, 973150194, 1787575648, 1379705223, -1146701021, 2108943384, -2001980152, -1027750699, 315477441, 1092687620, -1903331422, 1220111101}, AndroidCharacter.getMirror(c) + 6).intern()).append(str).append(m7956((char) (TextUtils.getOffsetAfter("", 0) + 32126), "\u0000\u0000\u0000\u0000", "ᜄ㊭繑\uf37d", "檯", (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)) + 1362275607).intern()).toString(), e);
                    return null;
                case 387034026:
                    if (str.equals(m7965(new int[]{-325171548, -1975468907, 1038657470, -1552810585, 1274588665, 1475533276, 857726935, 314014164, 816293645, -2064368730}, 18 - Color.red(0)).intern())) {
                        c2 = 7;
                        c = '0';
                        switch (c2) {
                        }
                        cn.m7268(clVar2.m7203(), new StringBuilder().append(m7965(new int[]{236951227, 2107217041, -1338325202, 1339392390, 56564810, -1623815579, 1045885554, 1518782422, 1964697136, 203981995, -194676, 1681196046, 315477441, 1092687620, -1633074551, -558155158, -1046595256, 973150194, 1787575648, 1379705223, -1146701021, 2108943384, -2001980152, -1027750699, 315477441, 1092687620, -1903331422, 1220111101}, AndroidCharacter.getMirror(c) + 6).intern()).append(str).append(m7956((char) (TextUtils.getOffsetAfter("", 0) + 32126), "\u0000\u0000\u0000\u0000", "ᜄ㊭繑\uf37d", "檯", (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)) + 1362275607).intern()).toString(), e);
                        return null;
                    }
                    c = '0';
                    c2 = 65535;
                    switch (c2) {
                    }
                    cn.m7268(clVar2.m7203(), new StringBuilder().append(m7965(new int[]{236951227, 2107217041, -1338325202, 1339392390, 56564810, -1623815579, 1045885554, 1518782422, 1964697136, 203981995, -194676, 1681196046, 315477441, 1092687620, -1633074551, -558155158, -1046595256, 973150194, 1787575648, 1379705223, -1146701021, 2108943384, -2001980152, -1027750699, 315477441, 1092687620, -1903331422, 1220111101}, AndroidCharacter.getMirror(c) + 6).intern()).append(str).append(m7956((char) (TextUtils.getOffsetAfter("", 0) + 32126), "\u0000\u0000\u0000\u0000", "ᜄ㊭繑\uf37d", "檯", (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)) + 1362275607).intern()).toString(), e);
                    return null;
                case 391966482:
                    if (str.equals(m7956((char) (ViewConfiguration.getScrollDefaultDelay() >> 16), "\u0000\u0000\u0000\u0000", "꼙⒚䴌缨", "䎽圮ഉꑌ죂ퟻ\ud9d1ꃯ뽓ᰙ䫈\u0e6c밥ꈚ࠷⊥첵꣏쑥哩\udfa0", 203725487 - Color.green(0)).intern())) {
                        int i11 = f2485 + 59;
                        f2486 = i11 % 128;
                        int i12 = i11 % 2;
                        c = '0';
                        switch (c2) {
                        }
                        cn.m7268(clVar2.m7203(), new StringBuilder().append(m7965(new int[]{236951227, 2107217041, -1338325202, 1339392390, 56564810, -1623815579, 1045885554, 1518782422, 1964697136, 203981995, -194676, 1681196046, 315477441, 1092687620, -1633074551, -558155158, -1046595256, 973150194, 1787575648, 1379705223, -1146701021, 2108943384, -2001980152, -1027750699, 315477441, 1092687620, -1903331422, 1220111101}, AndroidCharacter.getMirror(c) + 6).intern()).append(str).append(m7956((char) (TextUtils.getOffsetAfter("", 0) + 32126), "\u0000\u0000\u0000\u0000", "ᜄ㊭繑\uf37d", "檯", (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)) + 1362275607).intern()).toString(), e);
                        return null;
                    }
                    c = '0';
                    c2 = 65535;
                    switch (c2) {
                    }
                    cn.m7268(clVar2.m7203(), new StringBuilder().append(m7965(new int[]{236951227, 2107217041, -1338325202, 1339392390, 56564810, -1623815579, 1045885554, 1518782422, 1964697136, 203981995, -194676, 1681196046, 315477441, 1092687620, -1633074551, -558155158, -1046595256, 973150194, 1787575648, 1379705223, -1146701021, 2108943384, -2001980152, -1027750699, 315477441, 1092687620, -1903331422, 1220111101}, AndroidCharacter.getMirror(c) + 6).intern()).append(str).append(m7956((char) (TextUtils.getOffsetAfter("", 0) + 32126), "\u0000\u0000\u0000\u0000", "ᜄ㊭繑\uf37d", "檯", (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)) + 1362275607).intern()).toString(), e);
                    return null;
                case 393987200:
                    if (str.equals(m7956((char) ((ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 49481), "\u0000\u0000\u0000\u0000", "슓\ued52䪿\ue2c1", "棛\uf12a煿\uf573㰤ꓸ徙算ဋ⚃\uedca\ueae2渐\ue70c榑䴠劫蠳잒", (-1074965822) - (ViewConfiguration.getScrollDefaultDelay() >> 16)).intern())) {
                        c = '0';
                        c2 = 0;
                        switch (c2) {
                        }
                        cn.m7268(clVar2.m7203(), new StringBuilder().append(m7965(new int[]{236951227, 2107217041, -1338325202, 1339392390, 56564810, -1623815579, 1045885554, 1518782422, 1964697136, 203981995, -194676, 1681196046, 315477441, 1092687620, -1633074551, -558155158, -1046595256, 973150194, 1787575648, 1379705223, -1146701021, 2108943384, -2001980152, -1027750699, 315477441, 1092687620, -1903331422, 1220111101}, AndroidCharacter.getMirror(c) + 6).intern()).append(str).append(m7956((char) (TextUtils.getOffsetAfter("", 0) + 32126), "\u0000\u0000\u0000\u0000", "ᜄ㊭繑\uf37d", "檯", (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)) + 1362275607).intern()).toString(), e);
                        return null;
                    }
                    c = '0';
                    c2 = 65535;
                    switch (c2) {
                    }
                    cn.m7268(clVar2.m7203(), new StringBuilder().append(m7965(new int[]{236951227, 2107217041, -1338325202, 1339392390, 56564810, -1623815579, 1045885554, 1518782422, 1964697136, 203981995, -194676, 1681196046, 315477441, 1092687620, -1633074551, -558155158, -1046595256, 973150194, 1787575648, 1379705223, -1146701021, 2108943384, -2001980152, -1027750699, 315477441, 1092687620, -1903331422, 1220111101}, AndroidCharacter.getMirror(c) + 6).intern()).append(str).append(m7956((char) (TextUtils.getOffsetAfter("", 0) + 32126), "\u0000\u0000\u0000\u0000", "ᜄ㊭繑\uf37d", "檯", (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)) + 1362275607).intern()).toString(), e);
                    return null;
                case 1423210564:
                    if (str.equals(m7965(new int[]{870565108, -1171000963, 1134865703, 1598758055, -125707741, 1751005341, -157327555, -350639816, -762239235, 1326096761, 874527873, -972046858}, 22 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1))).intern())) {
                        int i13 = f2485 + 79;
                        f2486 = i13 % 128;
                        int i14 = i13 % 2;
                        c = '0';
                        c2 = 6;
                        switch (c2) {
                        }
                        cn.m7268(clVar2.m7203(), new StringBuilder().append(m7965(new int[]{236951227, 2107217041, -1338325202, 1339392390, 56564810, -1623815579, 1045885554, 1518782422, 1964697136, 203981995, -194676, 1681196046, 315477441, 1092687620, -1633074551, -558155158, -1046595256, 973150194, 1787575648, 1379705223, -1146701021, 2108943384, -2001980152, -1027750699, 315477441, 1092687620, -1903331422, 1220111101}, AndroidCharacter.getMirror(c) + 6).intern()).append(str).append(m7956((char) (TextUtils.getOffsetAfter("", 0) + 32126), "\u0000\u0000\u0000\u0000", "ᜄ㊭繑\uf37d", "檯", (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)) + 1362275607).intern()).toString(), e);
                        return null;
                    }
                    c = '0';
                    c2 = 65535;
                    switch (c2) {
                    }
                    cn.m7268(clVar2.m7203(), new StringBuilder().append(m7965(new int[]{236951227, 2107217041, -1338325202, 1339392390, 56564810, -1623815579, 1045885554, 1518782422, 1964697136, 203981995, -194676, 1681196046, 315477441, 1092687620, -1633074551, -558155158, -1046595256, 973150194, 1787575648, 1379705223, -1146701021, 2108943384, -2001980152, -1027750699, 315477441, 1092687620, -1903331422, 1220111101}, AndroidCharacter.getMirror(c) + 6).intern()).append(str).append(m7956((char) (TextUtils.getOffsetAfter("", 0) + 32126), "\u0000\u0000\u0000\u0000", "ᜄ㊭繑\uf37d", "檯", (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)) + 1362275607).intern()).toString(), e);
                    return null;
                case 1773646829:
                    if (str.equals(m7965(new int[]{-649392917, -158170977, -492667199, 1557947392, -1007401941, 1894406062, 21075181, -1277950299, -798296600, 294448129}, TextUtils.lastIndexOf("", '0', 0, 0) + 19).intern())) {
                        c = '0';
                        c2 = 1;
                        switch (c2) {
                        }
                        cn.m7268(clVar2.m7203(), new StringBuilder().append(m7965(new int[]{236951227, 2107217041, -1338325202, 1339392390, 56564810, -1623815579, 1045885554, 1518782422, 1964697136, 203981995, -194676, 1681196046, 315477441, 1092687620, -1633074551, -558155158, -1046595256, 973150194, 1787575648, 1379705223, -1146701021, 2108943384, -2001980152, -1027750699, 315477441, 1092687620, -1903331422, 1220111101}, AndroidCharacter.getMirror(c) + 6).intern()).append(str).append(m7956((char) (TextUtils.getOffsetAfter("", 0) + 32126), "\u0000\u0000\u0000\u0000", "ᜄ㊭繑\uf37d", "檯", (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)) + 1362275607).intern()).toString(), e);
                        return null;
                    }
                    c = '0';
                    c2 = 65535;
                    switch (c2) {
                    }
                    cn.m7268(clVar2.m7203(), new StringBuilder().append(m7965(new int[]{236951227, 2107217041, -1338325202, 1339392390, 56564810, -1623815579, 1045885554, 1518782422, 1964697136, 203981995, -194676, 1681196046, 315477441, 1092687620, -1633074551, -558155158, -1046595256, 973150194, 1787575648, 1379705223, -1146701021, 2108943384, -2001980152, -1027750699, 315477441, 1092687620, -1903331422, 1220111101}, AndroidCharacter.getMirror(c) + 6).intern()).append(str).append(m7956((char) (TextUtils.getOffsetAfter("", 0) + 32126), "\u0000\u0000\u0000\u0000", "ᜄ㊭繑\uf37d", "檯", (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)) + 1362275607).intern()).toString(), e);
                    return null;
                default:
                    c = '0';
                    c2 = 65535;
                    switch (c2) {
                    }
                    cn.m7268(clVar2.m7203(), new StringBuilder().append(m7965(new int[]{236951227, 2107217041, -1338325202, 1339392390, 56564810, -1623815579, 1045885554, 1518782422, 1964697136, 203981995, -194676, 1681196046, 315477441, 1092687620, -1633074551, -558155158, -1046595256, 973150194, 1787575648, 1379705223, -1146701021, 2108943384, -2001980152, -1027750699, 315477441, 1092687620, -1903331422, 1220111101}, AndroidCharacter.getMirror(c) + 6).intern()).append(str).append(m7956((char) (TextUtils.getOffsetAfter("", 0) + 32126), "\u0000\u0000\u0000\u0000", "ᜄ㊭繑\uf37d", "檯", (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)) + 1362275607).intern()).toString(), e);
                    return null;
            }
        }

        /* renamed from: ﻛ, reason: contains not printable characters */
        private static String m7956(char c, String str, String str2, String str3, int i) {
            String str4;
            char[] cArr = str3;
            if (str3 != null) {
                cArr = str3.toCharArray();
            }
            char[] cArr2 = cArr;
            char[] cArr3 = str2;
            if (str2 != null) {
                cArr3 = str2.toCharArray();
            }
            char[] cArr4 = cArr3;
            char[] cArr5 = str;
            if (str != null) {
                cArr5 = str.toCharArray();
            }
            char[] cArr6 = cArr5;
            synchronized (f.f2042) {
                char[] cArr7 = (char[]) cArr4.clone();
                char[] cArr8 = (char[]) cArr6.clone();
                cArr7[0] = (char) (c ^ cArr7[0]);
                cArr8[2] = (char) (cArr8[2] + ((char) i));
                int length = cArr2.length;
                char[] cArr9 = new char[length];
                f.f2041 = 0;
                while (f.f2041 < length) {
                    int i2 = (f.f2041 + 2) % 4;
                    int i3 = (f.f2041 + 3) % 4;
                    f.f2043 = (char) (((cArr7[f.f2041 % 4] * 32718) + cArr8[i2]) % 65535);
                    cArr8[i3] = (char) (((cArr7[i3] * 32718) + cArr8[i2]) / 65535);
                    cArr7[i3] = f.f2043;
                    cArr9[f.f2041] = (char) ((((cArr7[i3] ^ cArr2[f.f2041]) ^ f2490) ^ f2487) ^ f2488);
                    f.f2041++;
                }
                str4 = new String(cArr9);
            }
            return str4;
        }

        /* renamed from: ﾒ, reason: contains not printable characters */
        private static String m7965(int[] iArr, int i) {
            String str;
            synchronized (a.f86) {
                char[] cArr = new char[4];
                char[] cArr2 = new char[iArr.length << 1];
                int[] iArr2 = (int[]) f2489.clone();
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
    }
}
