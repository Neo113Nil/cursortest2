package defpackage;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import com.mbridge.msdk.playercommon.exoplayer2.util.MimeTypes;
import java.util.List;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public final class rej extends m51 implements Handler.Callback {
    public long A;
    public long B;
    public long C;
    public final Handler m;
    public final lg6 n;
    public final ccd o;
    public final fp4 p;
    public boolean q;
    public boolean r;
    public boolean s;
    public int t;
    public sm8 u;
    public mli v;
    public tli w;
    public sm2 x;
    public sm2 y;
    public int z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rej(lg6 lg6Var, Looper looper) {
        super(3);
        Handler handler;
        ccd ccdVar = ccd.g;
        this.n = lg6Var;
        if (looper == null) {
            handler = null;
        } else {
            int i = lik.a;
            handler = new Handler(looper, this);
        }
        this.m = handler;
        this.o = ccdVar;
        this.p = new fp4(22, false);
        this.A = C.TIME_UNSET;
        this.B = C.TIME_UNSET;
        this.C = C.TIME_UNSET;
    }

    public final void A() {
        this.w = null;
        this.z = -1;
        sm2 sm2Var = this.x;
        if (sm2Var != null) {
            sm2Var.A();
            this.x = null;
        }
        sm2 sm2Var2 = this.y;
        if (sm2Var2 != null) {
            sm2Var2.A();
            this.y = null;
        }
    }

    @Override // defpackage.m51
    public final String e() {
        return "TextRenderer";
    }

    @Override // defpackage.m51
    public final boolean g() {
        return this.r;
    }

    @Override // defpackage.m51
    public final boolean h() {
        return true;
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        if (message.what == 0) {
            z((n74) message.obj);
            return true;
        }
        zzl.s();
        return false;
    }

    @Override // defpackage.m51
    public final void i() {
        this.u = null;
        this.A = C.TIME_UNSET;
        w();
        this.B = C.TIME_UNSET;
        this.C = C.TIME_UNSET;
        A();
        mli mliVar = this.v;
        mliVar.getClass();
        mliVar.release();
        this.v = null;
        this.t = 0;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x00cd, code lost:
    
        if (r0.equals(com.mbridge.msdk.playercommon.exoplayer2.util.MimeTypes.APPLICATION_DVBSUBS) == false) goto L8;
     */
    @Override // defpackage.m51
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void k(long j, boolean z) {
        mli ee5Var;
        this.C = j;
        w();
        char c = 0;
        this.q = false;
        this.r = false;
        this.A = C.TIME_UNSET;
        if (this.t == 0) {
            A();
            mli mliVar = this.v;
            mliVar.getClass();
            mliVar.flush();
            return;
        }
        A();
        mli mliVar2 = this.v;
        mliVar2.getClass();
        mliVar2.release();
        this.v = null;
        this.t = 0;
        this.s = true;
        sm8 sm8Var = this.u;
        sm8Var.getClass();
        this.o.getClass();
        String str = sm8Var.l;
        int i = sm8Var.D;
        List list = sm8Var.n;
        if (str != null) {
            switch (str.hashCode()) {
                case -1351681404:
                    break;
                case -1248334819:
                    if (str.equals(MimeTypes.APPLICATION_PGS)) {
                        c = 1;
                        break;
                    }
                    c = 65535;
                    break;
                case -1026075066:
                    if (str.equals(MimeTypes.APPLICATION_MP4VTT)) {
                        c = 2;
                        break;
                    }
                    c = 65535;
                    break;
                case -1004728940:
                    if (str.equals(MimeTypes.TEXT_VTT)) {
                        c = 3;
                        break;
                    }
                    c = 65535;
                    break;
                case 691401887:
                    if (str.equals(MimeTypes.APPLICATION_TX3G)) {
                        c = 4;
                        break;
                    }
                    c = 65535;
                    break;
                case 822864842:
                    if (str.equals(MimeTypes.TEXT_SSA)) {
                        c = 5;
                        break;
                    }
                    c = 65535;
                    break;
                case 930165504:
                    if (str.equals(MimeTypes.APPLICATION_MP4CEA608)) {
                        c = 6;
                        break;
                    }
                    c = 65535;
                    break;
                case 1201784583:
                    if (str.equals("text/x-exoplayer-cues")) {
                        c = 7;
                        break;
                    }
                    c = 65535;
                    break;
                case 1566015601:
                    if (str.equals(MimeTypes.APPLICATION_CEA608)) {
                        c = '\b';
                        break;
                    }
                    c = 65535;
                    break;
                case 1566016562:
                    if (str.equals(MimeTypes.APPLICATION_CEA708)) {
                        c = '\t';
                        break;
                    }
                    c = 65535;
                    break;
                case 1668750253:
                    if (str.equals(MimeTypes.APPLICATION_SUBRIP)) {
                        c = '\n';
                        break;
                    }
                    c = 65535;
                    break;
                case 1693976202:
                    if (str.equals(MimeTypes.APPLICATION_TTML)) {
                        c = 11;
                        break;
                    }
                    c = 65535;
                    break;
                default:
                    c = 65535;
                    break;
            }
            switch (c) {
                case 0:
                    ee5Var = new ee5(list);
                    break;
                case 1:
                    ee5Var = new tfe();
                    break;
                case 2:
                    ee5Var = new ee5();
                    break;
                case 3:
                    ee5Var = new g2l();
                    break;
                case 4:
                    ee5Var = new r4k(list);
                    break;
                case 5:
                    ee5Var = new o0i(list);
                    break;
                case 6:
                case '\b':
                    ee5Var = new hm2(str, i);
                    break;
                case 7:
                    ee5Var = new a02();
                    break;
                case '\t':
                    ee5Var = new om2(i, list);
                    break;
                case '\n':
                    ee5Var = new bki();
                    break;
                case 11:
                    ee5Var = new f2k();
                    break;
            }
            this.v = ee5Var;
            return;
        }
        a70.p(dmi.q("Attempted to create decoder for unsupported MIME type: ", str));
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x00b4, code lost:
    
        if (r5.equals(com.mbridge.msdk.playercommon.exoplayer2.util.MimeTypes.APPLICATION_DVBSUBS) == false) goto L10;
     */
    @Override // defpackage.m51
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void o(sm8[] sm8VarArr, long j, long j2) {
        mli ee5Var;
        mli tfeVar;
        this.B = j2;
        char c = 0;
        sm8 sm8Var = sm8VarArr[0];
        this.u = sm8Var;
        if (this.v != null) {
            this.t = 1;
            return;
        }
        this.s = true;
        sm8Var.getClass();
        this.o.getClass();
        String str = sm8Var.l;
        int i = sm8Var.D;
        List list = sm8Var.n;
        if (str != null) {
            switch (str.hashCode()) {
                case -1351681404:
                    break;
                case -1248334819:
                    if (str.equals(MimeTypes.APPLICATION_PGS)) {
                        c = 1;
                        break;
                    }
                    c = 65535;
                    break;
                case -1026075066:
                    if (str.equals(MimeTypes.APPLICATION_MP4VTT)) {
                        c = 2;
                        break;
                    }
                    c = 65535;
                    break;
                case -1004728940:
                    if (str.equals(MimeTypes.TEXT_VTT)) {
                        c = 3;
                        break;
                    }
                    c = 65535;
                    break;
                case 691401887:
                    if (str.equals(MimeTypes.APPLICATION_TX3G)) {
                        c = 4;
                        break;
                    }
                    c = 65535;
                    break;
                case 822864842:
                    if (str.equals(MimeTypes.TEXT_SSA)) {
                        c = 5;
                        break;
                    }
                    c = 65535;
                    break;
                case 930165504:
                    if (str.equals(MimeTypes.APPLICATION_MP4CEA608)) {
                        c = 6;
                        break;
                    }
                    c = 65535;
                    break;
                case 1201784583:
                    if (str.equals("text/x-exoplayer-cues")) {
                        c = 7;
                        break;
                    }
                    c = 65535;
                    break;
                case 1566015601:
                    if (str.equals(MimeTypes.APPLICATION_CEA608)) {
                        c = '\b';
                        break;
                    }
                    c = 65535;
                    break;
                case 1566016562:
                    if (str.equals(MimeTypes.APPLICATION_CEA708)) {
                        c = '\t';
                        break;
                    }
                    c = 65535;
                    break;
                case 1668750253:
                    if (str.equals(MimeTypes.APPLICATION_SUBRIP)) {
                        c = '\n';
                        break;
                    }
                    c = 65535;
                    break;
                case 1693976202:
                    if (str.equals(MimeTypes.APPLICATION_TTML)) {
                        c = 11;
                        break;
                    }
                    c = 65535;
                    break;
                default:
                    c = 65535;
                    break;
            }
            switch (c) {
                case 0:
                    ee5Var = new ee5(list);
                    tfeVar = ee5Var;
                    this.v = tfeVar;
                    break;
                case 1:
                    tfeVar = new tfe();
                    this.v = tfeVar;
                    break;
                case 2:
                    tfeVar = new ee5();
                    this.v = tfeVar;
                    break;
                case 3:
                    tfeVar = new g2l();
                    this.v = tfeVar;
                    break;
                case 4:
                    ee5Var = new r4k(list);
                    tfeVar = ee5Var;
                    this.v = tfeVar;
                    break;
                case 5:
                    ee5Var = new o0i(list);
                    tfeVar = ee5Var;
                    this.v = tfeVar;
                    break;
                case 6:
                case '\b':
                    tfeVar = new hm2(str, i);
                    this.v = tfeVar;
                    break;
                case 7:
                    tfeVar = new a02();
                    this.v = tfeVar;
                    break;
                case '\t':
                    ee5Var = new om2(i, list);
                    tfeVar = ee5Var;
                    this.v = tfeVar;
                    break;
                case '\n':
                    tfeVar = new bki();
                    this.v = tfeVar;
                    break;
                case 11:
                    tfeVar = new f2k();
                    this.v = tfeVar;
                    break;
            }
            return;
        }
        a70.p(dmi.q("Attempted to create decoder for unsupported MIME type: ", str));
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:108:0x030b  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x036b A[EXC_TOP_SPLITTER, LOOP:1: B:116:0x036b->B:139:0x036b, LOOP_START, PHI: r20
      0x036b: PHI (r20v2 fp4) = (r20v1 fp4), (r20v6 fp4) binds: [B:115:0x0367, B:139:0x036b] A[DONT_GENERATE, DONT_INLINE], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:162:0x0429  */
    /* JADX WARN: Removed duplicated region for block: B:234:? A[ADDED_TO_REGION, REMOVE, RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:241:0x0360  */
    @Override // defpackage.m51
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void q(long j, long j2) {
        boolean z;
        boolean z2;
        String str;
        long j3;
        Object obj;
        Object obj2;
        char c;
        String str2;
        char c2;
        mli ee5Var;
        mli tfeVar;
        boolean z3;
        long eventTime;
        char c3;
        mli ee5Var2;
        char c4;
        mli ee5Var3;
        mli tfeVar2;
        fp4 fp4Var = this.p;
        this.C = j;
        if (this.k) {
            long j4 = this.A;
            if (j4 != C.TIME_UNSET && j >= j4) {
                A();
                this.r = true;
            }
        }
        if (this.r) {
            return;
        }
        sm2 sm2Var = this.y;
        ccd ccdVar = this.o;
        if (sm2Var == null) {
            mli mliVar = this.v;
            mliVar.getClass();
            mliVar.setPositionUs(j);
            try {
                mli mliVar2 = this.v;
                mliVar2.getClass();
                this.y = (sm2) mliVar2.dequeueOutputBuffer();
            } catch (oli e) {
                m6k.C("Subtitle decoding failed. streamFormat=" + this.u, e);
                w();
                A();
                mli mliVar3 = this.v;
                mliVar3.getClass();
                mliVar3.release();
                this.v = null;
                this.t = 0;
                this.s = true;
                sm8 sm8Var = this.u;
                sm8Var.getClass();
                ccdVar.getClass();
                String str3 = sm8Var.l;
                int i = sm8Var.D;
                List list = sm8Var.n;
                if (str3 != null) {
                    switch (str3.hashCode()) {
                        case -1351681404:
                            if (str3.equals(MimeTypes.APPLICATION_DVBSUBS)) {
                                c4 = 0;
                                break;
                            }
                            c4 = 65535;
                            break;
                        case -1248334819:
                            if (str3.equals(MimeTypes.APPLICATION_PGS)) {
                                c4 = 1;
                                break;
                            }
                            c4 = 65535;
                            break;
                        case -1026075066:
                            if (str3.equals(MimeTypes.APPLICATION_MP4VTT)) {
                                c4 = 2;
                                break;
                            }
                            c4 = 65535;
                            break;
                        case -1004728940:
                            if (str3.equals(MimeTypes.TEXT_VTT)) {
                                c4 = 3;
                                break;
                            }
                            c4 = 65535;
                            break;
                        case 691401887:
                            if (str3.equals(MimeTypes.APPLICATION_TX3G)) {
                                c4 = 4;
                                break;
                            }
                            c4 = 65535;
                            break;
                        case 822864842:
                            if (str3.equals(MimeTypes.TEXT_SSA)) {
                                c4 = 5;
                                break;
                            }
                            c4 = 65535;
                            break;
                        case 930165504:
                            if (str3.equals(MimeTypes.APPLICATION_MP4CEA608)) {
                                c4 = 6;
                                break;
                            }
                            c4 = 65535;
                            break;
                        case 1201784583:
                            if (str3.equals("text/x-exoplayer-cues")) {
                                c4 = 7;
                                break;
                            }
                            c4 = 65535;
                            break;
                        case 1566015601:
                            if (str3.equals(MimeTypes.APPLICATION_CEA608)) {
                                c4 = '\b';
                                break;
                            }
                            c4 = 65535;
                            break;
                        case 1566016562:
                            if (str3.equals(MimeTypes.APPLICATION_CEA708)) {
                                c4 = '\t';
                                break;
                            }
                            c4 = 65535;
                            break;
                        case 1668750253:
                            if (str3.equals(MimeTypes.APPLICATION_SUBRIP)) {
                                c4 = '\n';
                                break;
                            }
                            c4 = 65535;
                            break;
                        case 1693976202:
                            if (str3.equals(MimeTypes.APPLICATION_TTML)) {
                                c4 = 11;
                                break;
                            }
                            c4 = 65535;
                            break;
                        default:
                            c4 = 65535;
                            break;
                    }
                    switch (c4) {
                        case 0:
                            ee5Var3 = new ee5(list);
                            break;
                        case 1:
                            tfeVar2 = new tfe();
                            this.v = tfeVar2;
                            return;
                        case 2:
                            tfeVar2 = new ee5();
                            this.v = tfeVar2;
                            return;
                        case 3:
                            tfeVar2 = new g2l();
                            this.v = tfeVar2;
                            return;
                        case 4:
                            ee5Var3 = new r4k(list);
                            break;
                        case 5:
                            ee5Var3 = new o0i(list);
                            break;
                        case 6:
                        case '\b':
                            tfeVar2 = new hm2(str3, i);
                            this.v = tfeVar2;
                            return;
                        case 7:
                            tfeVar2 = new a02();
                            this.v = tfeVar2;
                            return;
                        case '\t':
                            ee5Var3 = new om2(i, list);
                            break;
                        case '\n':
                            tfeVar2 = new bki();
                            this.v = tfeVar2;
                            return;
                        case 11:
                            tfeVar2 = new f2k();
                            this.v = tfeVar2;
                            return;
                    }
                    tfeVar2 = ee5Var3;
                    this.v = tfeVar2;
                    return;
                }
                a70.p(dmi.q("Attempted to create decoder for unsupported MIME type: ", str3));
                return;
            }
        }
        String str4 = "Attempted to create decoder for unsupported MIME type: ";
        fp4 fp4Var2 = fp4Var;
        if (this.f != 2) {
            return;
        }
        if (this.x != null) {
            long x = x();
            z = false;
            while (x <= j) {
                this.z++;
                x = x();
                z = true;
            }
        } else {
            z = false;
        }
        sm2 sm2Var2 = this.y;
        if (sm2Var2 != null) {
            if (!sm2Var2.i(4)) {
                z2 = z;
                str = str4;
                if (sm2Var2.g <= j) {
                    sm2 sm2Var3 = this.x;
                    if (sm2Var3 != null) {
                        sm2Var3.A();
                    }
                    j3 = j;
                    this.z = sm2Var2.getNextEventTimeIndex(j3);
                    this.x = sm2Var2;
                    this.y = null;
                    z2 = true;
                    if (z2) {
                        this.x.getClass();
                        int nextEventTimeIndex = this.x.getNextEventTimeIndex(j3);
                        sm2 sm2Var4 = this.x;
                        if (nextEventTimeIndex == 0) {
                            obj = MimeTypes.APPLICATION_MP4VTT;
                            obj2 = MimeTypes.APPLICATION_MP4CEA608;
                            eventTime = sm2Var4.g;
                        } else {
                            obj = MimeTypes.APPLICATION_MP4VTT;
                            obj2 = MimeTypes.APPLICATION_MP4CEA608;
                            eventTime = nextEventTimeIndex == -1 ? sm2Var4.getEventTime(sm2Var4.getEventTimeCount() - 1) : sm2Var4.getEventTime(nextEventTimeIndex - 1);
                        }
                        n74 n74Var = new n74(this.x.getCues(j3), y(eventTime));
                        Handler handler = this.m;
                        if (handler != null) {
                            handler.obtainMessage(0, n74Var).sendToTarget();
                        } else {
                            z(n74Var);
                        }
                    } else {
                        obj = MimeTypes.APPLICATION_MP4VTT;
                        obj2 = MimeTypes.APPLICATION_MP4CEA608;
                    }
                    if (this.t == 2) {
                        return;
                    }
                    while (!this.q) {
                        try {
                            tli tliVar = this.w;
                            if (tliVar == null) {
                                mli mliVar4 = this.v;
                                mliVar4.getClass();
                                tliVar = (tli) mliVar4.dequeueInputBuffer();
                                if (tliVar == null) {
                                    return;
                                } else {
                                    this.w = tliVar;
                                }
                            }
                            if (this.t == 1) {
                                try {
                                    tliVar.b = 4;
                                    mli mliVar5 = this.v;
                                    mliVar5.getClass();
                                    mliVar5.a(tliVar);
                                    this.w = null;
                                    this.t = 2;
                                    return;
                                } catch (oli e2) {
                                    e = e2;
                                    c = 4;
                                    m6k.C("Subtitle decoding failed. streamFormat=" + this.u, e);
                                    w();
                                    A();
                                    mli mliVar6 = this.v;
                                    mliVar6.getClass();
                                    mliVar6.release();
                                    this.v = null;
                                    this.t = 0;
                                    this.s = true;
                                    sm8 sm8Var2 = this.u;
                                    sm8Var2.getClass();
                                    ccdVar.getClass();
                                    str2 = sm8Var2.l;
                                    int i2 = sm8Var2.D;
                                    List list2 = sm8Var2.n;
                                    if (str2 != null) {
                                        switch (str2.hashCode()) {
                                            case -1351681404:
                                                if (str2.equals(MimeTypes.APPLICATION_DVBSUBS)) {
                                                    c2 = 0;
                                                    break;
                                                }
                                                c2 = 65535;
                                                break;
                                            case -1248334819:
                                                if (str2.equals(MimeTypes.APPLICATION_PGS)) {
                                                    c2 = 1;
                                                    break;
                                                }
                                                c2 = 65535;
                                                break;
                                            case -1026075066:
                                                if (str2.equals(obj)) {
                                                    c2 = 2;
                                                    break;
                                                }
                                                c2 = 65535;
                                                break;
                                            case -1004728940:
                                                if (str2.equals(MimeTypes.TEXT_VTT)) {
                                                    c2 = 3;
                                                    break;
                                                }
                                                c2 = 65535;
                                                break;
                                            case 691401887:
                                                if (str2.equals(MimeTypes.APPLICATION_TX3G)) {
                                                    c2 = c;
                                                    break;
                                                }
                                                c2 = 65535;
                                                break;
                                            case 822864842:
                                                if (str2.equals(MimeTypes.TEXT_SSA)) {
                                                    c2 = 5;
                                                    break;
                                                }
                                                c2 = 65535;
                                                break;
                                            case 930165504:
                                                if (str2.equals(obj2)) {
                                                    c2 = 6;
                                                    break;
                                                }
                                                c2 = 65535;
                                                break;
                                            case 1201784583:
                                                if (str2.equals("text/x-exoplayer-cues")) {
                                                    c2 = 7;
                                                    break;
                                                }
                                                c2 = 65535;
                                                break;
                                            case 1566015601:
                                                if (str2.equals(MimeTypes.APPLICATION_CEA608)) {
                                                    c2 = '\b';
                                                    break;
                                                }
                                                c2 = 65535;
                                                break;
                                            case 1566016562:
                                                if (str2.equals(MimeTypes.APPLICATION_CEA708)) {
                                                    c2 = '\t';
                                                    break;
                                                }
                                                c2 = 65535;
                                                break;
                                            case 1668750253:
                                                if (str2.equals(MimeTypes.APPLICATION_SUBRIP)) {
                                                    c2 = '\n';
                                                    break;
                                                }
                                                c2 = 65535;
                                                break;
                                            case 1693976202:
                                                if (str2.equals(MimeTypes.APPLICATION_TTML)) {
                                                    c2 = 11;
                                                    break;
                                                }
                                                c2 = 65535;
                                                break;
                                            default:
                                                c2 = 65535;
                                                break;
                                        }
                                        switch (c2) {
                                            case 0:
                                                ee5Var = new ee5(list2);
                                                tfeVar = ee5Var;
                                                this.v = tfeVar;
                                                break;
                                            case 1:
                                                tfeVar = new tfe();
                                                this.v = tfeVar;
                                                break;
                                            case 2:
                                                tfeVar = new ee5();
                                                this.v = tfeVar;
                                                break;
                                            case 3:
                                                tfeVar = new g2l();
                                                this.v = tfeVar;
                                                break;
                                            case 4:
                                                ee5Var = new r4k(list2);
                                                tfeVar = ee5Var;
                                                this.v = tfeVar;
                                                break;
                                            case 5:
                                                ee5Var = new o0i(list2);
                                                tfeVar = ee5Var;
                                                this.v = tfeVar;
                                                break;
                                            case 6:
                                            case '\b':
                                                tfeVar = new hm2(str2, i2);
                                                this.v = tfeVar;
                                                break;
                                            case 7:
                                                tfeVar = new a02();
                                                this.v = tfeVar;
                                                break;
                                            case '\t':
                                                ee5Var = new om2(i2, list2);
                                                tfeVar = ee5Var;
                                                this.v = tfeVar;
                                                break;
                                            case '\n':
                                                tfeVar = new bki();
                                                this.v = tfeVar;
                                                break;
                                            case 11:
                                                tfeVar = new f2k();
                                                this.v = tfeVar;
                                                break;
                                        }
                                        return;
                                    }
                                    a70.p(dmi.q(str, str2));
                                    return;
                                }
                            }
                            fp4 fp4Var3 = fp4Var2;
                            int p = p(fp4Var3, tliVar, 0);
                            if (p == -4) {
                                c = 4;
                                try {
                                    if (tliVar.i(4)) {
                                        this.q = true;
                                        this.s = false;
                                        fp4Var2 = fp4Var3;
                                        z3 = false;
                                    } else {
                                        sm8 sm8Var3 = (sm8) fp4Var3.c;
                                        if (sm8Var3 == null) {
                                            return;
                                        }
                                        fp4Var2 = fp4Var3;
                                        tliVar.m = sm8Var3.p;
                                        tliVar.D();
                                        z3 = this.s & (!tliVar.i(1));
                                        this.s = z3;
                                    }
                                    if (!z3) {
                                        mli mliVar7 = this.v;
                                        mliVar7.getClass();
                                        mliVar7.a(tliVar);
                                        this.w = null;
                                    }
                                } catch (oli e3) {
                                    e = e3;
                                    m6k.C("Subtitle decoding failed. streamFormat=" + this.u, e);
                                    w();
                                    A();
                                    mli mliVar62 = this.v;
                                    mliVar62.getClass();
                                    mliVar62.release();
                                    this.v = null;
                                    this.t = 0;
                                    this.s = true;
                                    sm8 sm8Var22 = this.u;
                                    sm8Var22.getClass();
                                    ccdVar.getClass();
                                    str2 = sm8Var22.l;
                                    int i22 = sm8Var22.D;
                                    List list22 = sm8Var22.n;
                                    if (str2 != null) {
                                    }
                                    a70.p(dmi.q(str, str2));
                                    return;
                                }
                            } else {
                                fp4Var2 = fp4Var3;
                                if (p == -3) {
                                    return;
                                }
                            }
                        } catch (oli e4) {
                            e = e4;
                        }
                    }
                    return;
                }
            } else if (!z && x() == Long.MAX_VALUE) {
                if (this.t == 2) {
                    A();
                    mli mliVar8 = this.v;
                    mliVar8.getClass();
                    mliVar8.release();
                    this.v = null;
                    this.t = 0;
                    this.s = true;
                    sm8 sm8Var4 = this.u;
                    sm8Var4.getClass();
                    ccdVar.getClass();
                    String str5 = sm8Var4.l;
                    z2 = z;
                    int i3 = sm8Var4.D;
                    List list3 = sm8Var4.n;
                    if (str5 != null) {
                        switch (str5.hashCode()) {
                            case -1351681404:
                                str = str4;
                                if (str5.equals(MimeTypes.APPLICATION_DVBSUBS)) {
                                    c3 = 0;
                                    break;
                                }
                                c3 = 65535;
                                break;
                            case -1248334819:
                                str = str4;
                                if (str5.equals(MimeTypes.APPLICATION_PGS)) {
                                    c3 = 1;
                                    break;
                                }
                                c3 = 65535;
                                break;
                            case -1026075066:
                                str = str4;
                                if (str5.equals(MimeTypes.APPLICATION_MP4VTT)) {
                                    c3 = 2;
                                    break;
                                }
                                c3 = 65535;
                                break;
                            case -1004728940:
                                str = str4;
                                if (str5.equals(MimeTypes.TEXT_VTT)) {
                                    c3 = 3;
                                    break;
                                }
                                c3 = 65535;
                                break;
                            case 691401887:
                                str = str4;
                                if (str5.equals(MimeTypes.APPLICATION_TX3G)) {
                                    c3 = 4;
                                    break;
                                }
                                c3 = 65535;
                                break;
                            case 822864842:
                                str = str4;
                                if (str5.equals(MimeTypes.TEXT_SSA)) {
                                    c3 = 5;
                                    break;
                                }
                                c3 = 65535;
                                break;
                            case 930165504:
                                str = str4;
                                if (str5.equals(MimeTypes.APPLICATION_MP4CEA608)) {
                                    c3 = 6;
                                    break;
                                }
                                c3 = 65535;
                                break;
                            case 1201784583:
                                str = str4;
                                if (str5.equals("text/x-exoplayer-cues")) {
                                    c3 = 7;
                                    break;
                                }
                                c3 = 65535;
                                break;
                            case 1566015601:
                                str = str4;
                                if (str5.equals(MimeTypes.APPLICATION_CEA608)) {
                                    c3 = '\b';
                                    break;
                                }
                                c3 = 65535;
                                break;
                            case 1566016562:
                                str = str4;
                                if (str5.equals(MimeTypes.APPLICATION_CEA708)) {
                                    c3 = '\t';
                                    break;
                                }
                                c3 = 65535;
                                break;
                            case 1668750253:
                                str = str4;
                                if (str5.equals(MimeTypes.APPLICATION_SUBRIP)) {
                                    c3 = '\n';
                                    break;
                                }
                                c3 = 65535;
                                break;
                            case 1693976202:
                                str = str4;
                                if (str5.equals(MimeTypes.APPLICATION_TTML)) {
                                    c3 = 11;
                                    break;
                                }
                                c3 = 65535;
                                break;
                            default:
                                str = str4;
                                c3 = 65535;
                                break;
                        }
                        switch (c3) {
                            case 0:
                                ee5Var2 = new ee5(list3);
                                this.v = ee5Var2;
                                break;
                            case 1:
                                ee5Var2 = new tfe();
                                this.v = ee5Var2;
                                break;
                            case 2:
                                ee5Var2 = new ee5();
                                this.v = ee5Var2;
                                break;
                            case 3:
                                ee5Var2 = new g2l();
                                this.v = ee5Var2;
                                break;
                            case 4:
                                ee5Var2 = new r4k(list3);
                                this.v = ee5Var2;
                                break;
                            case 5:
                                ee5Var2 = new o0i(list3);
                                this.v = ee5Var2;
                                break;
                            case 6:
                            case '\b':
                                ee5Var2 = new hm2(str5, i3);
                                this.v = ee5Var2;
                                break;
                            case 7:
                                ee5Var2 = new a02();
                                this.v = ee5Var2;
                                break;
                            case '\t':
                                ee5Var2 = new om2(i3, list3);
                                this.v = ee5Var2;
                                break;
                            case '\n':
                                ee5Var2 = new bki();
                                this.v = ee5Var2;
                                break;
                            case 11:
                                ee5Var2 = new f2k();
                                this.v = ee5Var2;
                                break;
                            default:
                                str4 = str;
                                break;
                        }
                        return;
                    }
                    a70.p(dmi.q(str4, str5));
                    return;
                }
                z2 = z;
                A();
                this.r = true;
                str = str4;
            }
            j3 = j;
            if (z2) {
            }
            if (this.t == 2) {
            }
        }
        z2 = z;
        str = str4;
        j3 = j;
        if (z2) {
        }
        if (this.t == 2) {
        }
    }

    @Override // defpackage.m51
    public final int u(sm8 sm8Var) {
        this.o.getClass();
        String str = sm8Var.l;
        if (MimeTypes.TEXT_VTT.equals(str) || MimeTypes.TEXT_SSA.equals(str) || MimeTypes.APPLICATION_TTML.equals(str) || MimeTypes.APPLICATION_MP4VTT.equals(str) || MimeTypes.APPLICATION_SUBRIP.equals(str) || MimeTypes.APPLICATION_TX3G.equals(str) || MimeTypes.APPLICATION_CEA608.equals(str) || MimeTypes.APPLICATION_MP4CEA608.equals(str) || MimeTypes.APPLICATION_CEA708.equals(str) || MimeTypes.APPLICATION_DVBSUBS.equals(str) || MimeTypes.APPLICATION_PGS.equals(str) || "text/x-exoplayer-cues".equals(str)) {
            return m51.b(sm8Var.E == 0 ? 4 : 2, 0, 0);
        }
        return rjc.h(sm8Var.l) ? m51.b(1, 0, 0) : m51.b(0, 0, 0);
    }

    public final void w() {
        av9 av9Var = hv9.b;
        n74 n74Var = new n74(vvf.e, y(this.C));
        Handler handler = this.m;
        if (handler != null) {
            handler.obtainMessage(0, n74Var).sendToTarget();
        } else {
            z(n74Var);
        }
    }

    public final long x() {
        if (this.z == -1) {
            return Long.MAX_VALUE;
        }
        this.x.getClass();
        if (this.z >= this.x.getEventTimeCount()) {
            return Long.MAX_VALUE;
        }
        return this.x.getEventTime(this.z);
    }

    public final long y(long j) {
        qx9.t(j != C.TIME_UNSET);
        qx9.t(this.B != C.TIME_UNSET);
        return j - this.B;
    }

    public final void z(n74 n74Var) {
        hv9 hv9Var = n74Var.a;
        lg6 lg6Var = this.n;
        lg6Var.a.l.k(27, new xm4(hv9Var, 2));
        ug6 ug6Var = lg6Var.a;
        ug6Var.c0 = n74Var;
        ug6Var.l.k(27, new kt4(n74Var, 8));
    }
}
