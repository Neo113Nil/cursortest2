package com.vk.im.ui.components.viewcontrollers.msg_list.adapter.model;

import androidx.annotation.CheckResult;
import com.huawei.hms.support.api.entity.common.CommonConstant;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import com.mbridge.msdk.playercommon.exoplayer2.source.ExtractorMediaSource;
import com.vk.dto.attaches.Attach;
import com.vk.dto.common.Peer;
import com.vk.dto.common.VideoFile;
import com.vk.im.engine.models.ProfilesInfo;
import com.vk.im.engine.models.attaches.AttachChannelMessage;
import com.vk.im.engine.models.attaches.AttachVideo;
import com.vk.im.engine.models.dialogs.BubbleColors;
import com.vk.im.engine.models.dialogs.ChatSettings;
import com.vk.im.engine.models.groups.AdminLevel;
import com.vk.im.engine.models.groups.Group;
import com.vk.im.engine.models.messages.Msg;
import com.vk.im.engine.models.messages.MsgFromChannel;
import com.vk.im.engine.models.messages.MsgFromUser;
import com.vk.im.engine.models.messages.MsgReaction;
import com.vk.im.engine.models.messages.NestedMsg;
import com.vk.im.engine.models.messages.a;
import com.vk.im.engine.models.users.UserNameCase;
import com.vk.im.ui.components.viewcontrollers.msg_list.adapter.model.c;
import com.vk.im.ui.components.viewcontrollers.msg_list.entry.AdapterEntryType;
import com.vk.im.ui.formatters.DisplayNameFormatter;
import com.vk.onboarding.api.di.VkOnboardingComponent;
import com.vk.onboarding.api.dto.VkOnboardingCampaign;
import com.vkontakte.android.R;
import io.requery.android.database.sqlite.SQLiteDatabase;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import xsna.abi0;
import xsna.bh10;
import xsna.dhr0;
import xsna.epx;
import xsna.ev9;
import xsna.f5v;
import xsna.fmm;
import xsna.g5g;
import xsna.gl8;
import xsna.h7j0;
import xsna.j5g;
import xsna.myc0;
import xsna.oh30;
import xsna.q7v0;
import xsna.qoy;
import xsna.qtd0;
import xsna.sz30;
import xsna.u11;
import xsna.uk30;
import xsna.utr0;
import xsna.vk30;
import xsna.y060;

/* compiled from: ChatListModels.kt */
/* loaded from: classes2.dex */
public final class f implements g {
    public final boolean A;
    public final boolean B;
    public final boolean C;
    public final qtd0 D;
    public final ev9 E;
    public final boolean F;
    public final boolean G;
    public final boolean H;
    public final h7j0 I;
    public final sz30 J;
    public final CharSequence K;
    public final CharSequence L;
    public final CharSequence M;
    public final boolean N;
    public final f5v O;
    public final fmm P;
    public final abi0 Q;
    public Msg R;
    public NestedMsg S;
    public final AdapterEntryType b;
    public final CharSequence c;
    public final int d;
    public final y060 e;
    public final oh30 f;
    public final boolean g;
    public final boolean h;
    public final long i;
    public final boolean j;
    public final c k;
    public final com.vk.im.ui.components.viewcontrollers.msg_list.adapter.model.a l;
    public final BubbleColors m;
    public final BubbleColors n;
    public final utr0 o;
    public final utr0 p;
    public final boolean q;
    public final boolean r;
    public final int s;
    public final boolean t;
    public final gl8 u;
    public final gl8 v;
    public final boolean w;
    public final boolean x;
    public final boolean y;
    public final boolean z;

    /* compiled from: ChatListModels.kt */
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[AdminLevel.values().length];
            try {
                iArr[AdminLevel.ADMIN.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[AdminLevel.EDITOR.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public f() {
        this(null, null, 0, null, false, false, 0L, null, null, null, null, false, null, null, false, false, false, false, false, false, false, null, null, null, null, null, null, null, null, -1, 2047);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v30, types: [java.lang.CharSequence] */
    public static f a(f fVar, AdapterEntryType adapterEntryType, oh30 oh30Var, boolean z, boolean z2, BubbleColors bubbleColors, BubbleColors bubbleColors2, utr0 utr0Var, utr0 utr0Var2, boolean z3, int i, boolean z4, gl8 gl8Var, gl8 gl8Var2, boolean z5, boolean z6, boolean z7, boolean z8, boolean z9, boolean z10, qtd0 qtd0Var, boolean z11, boolean z12, boolean z13, h7j0 h7j0Var, String str, boolean z14, int i2, int i3) {
        AdapterEntryType adapterEntryType2 = (i2 & 1) != 0 ? fVar.b : adapterEntryType;
        CharSequence charSequence = fVar.c;
        int i4 = (i2 & 4) != 0 ? fVar.d : 0;
        y060 y060Var = fVar.e;
        oh30 oh30Var2 = (i2 & 16) != 0 ? fVar.f : oh30Var;
        boolean z15 = (i2 & 32) != 0 ? fVar.g : z;
        boolean z16 = fVar.h;
        long j = fVar.i;
        boolean z17 = (i2 & 256) != 0 ? fVar.j : z2;
        c cVar = fVar.k;
        com.vk.im.ui.components.viewcontrollers.msg_list.adapter.model.a aVar = fVar.l;
        BubbleColors bubbleColors3 = (i2 & 2048) != 0 ? fVar.m : bubbleColors;
        BubbleColors bubbleColors4 = (i2 & 4096) != 0 ? fVar.n : bubbleColors2;
        utr0 utr0Var3 = (i2 & 8192) != 0 ? fVar.o : utr0Var;
        utr0 utr0Var4 = (i2 & 16384) != 0 ? fVar.p : utr0Var2;
        boolean z18 = (32768 & i2) != 0 ? fVar.q : z3;
        boolean z19 = fVar.r;
        int i5 = (i2 & 131072) != 0 ? fVar.s : i;
        boolean z20 = (i2 & SQLiteDatabase.OPEN_PRIVATECACHE) != 0 ? fVar.t : z4;
        gl8 gl8Var3 = (i2 & 524288) != 0 ? fVar.u : gl8Var;
        gl8 gl8Var4 = (i2 & ExtractorMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES) != 0 ? fVar.v : gl8Var2;
        boolean z21 = (i2 & 2097152) != 0 ? fVar.w : z5;
        boolean z22 = fVar.x;
        boolean z23 = (i2 & 8388608) != 0 ? fVar.y : z6;
        boolean z24 = (i2 & C.DEFAULT_MUXED_BUFFER_SIZE) != 0 ? fVar.z : z7;
        boolean z25 = (i2 & 33554432) != 0 ? fVar.A : z8;
        boolean z26 = (i2 & 67108864) != 0 ? fVar.B : z9;
        boolean z27 = (i2 & 134217728) != 0 ? fVar.C : z10;
        qtd0 qtd0Var2 = (i2 & 268435456) != 0 ? fVar.D : qtd0Var;
        ev9 ev9Var = fVar.E;
        boolean z28 = (i2 & 1073741824) != 0 ? fVar.F : z11;
        boolean z29 = (i2 & Integer.MIN_VALUE) != 0 ? fVar.G : z12;
        boolean z30 = (i3 & 1) != 0 ? fVar.H : z13;
        fVar.getClass();
        h7j0 h7j0Var2 = (i3 & 4) != 0 ? fVar.I : h7j0Var;
        sz30 sz30Var = fVar.J;
        String str2 = (i3 & 16) != 0 ? fVar.K : str;
        CharSequence charSequence2 = fVar.L;
        CharSequence charSequence3 = fVar.M;
        boolean z31 = (i3 & 128) != 0 ? fVar.N : z14;
        f5v f5vVar = fVar.O;
        fmm fmmVar = fVar.P;
        abi0 abi0Var = fVar.Q;
        fVar.getClass();
        return new f(adapterEntryType2, charSequence, i4, y060Var, oh30Var2, z15, z16, j, z17, cVar, aVar, bubbleColors3, bubbleColors4, utr0Var3, utr0Var4, z18, z19, i5, z20, gl8Var3, gl8Var4, z21, z22, z23, z24, z25, z26, z27, qtd0Var2, ev9Var, z28, z29, z30, h7j0Var2, sz30Var, str2, charSequence2, charSequence3, z31, f5vVar, fmmVar, abi0Var);
    }

    @Override // com.vk.im.ui.components.viewcontrollers.msg_list.adapter.model.g
    public final boolean B() {
        return false;
    }

    @Override // com.vk.im.ui.components.viewcontrollers.msg_list.adapter.model.g
    public final NestedMsg D0() {
        return this.S;
    }

    @Override // com.vk.im.ui.components.viewcontrollers.msg_list.adapter.model.g
    public final c E0() {
        return this.k;
    }

    /* JADX WARN: Code restructure failed: missing block: B:139:0x01f9, code lost:
    
        if (r0.intValue() != r6) goto L203;
     */
    /* JADX WARN: Code restructure failed: missing block: B:164:0x0184, code lost:
    
        if (r6 == false) goto L151;
     */
    /* JADX WARN: Code restructure failed: missing block: B:170:0x0192, code lost:
    
        if (r6.b == r5.b) goto L151;
     */
    /* JADX WARN: Code restructure failed: missing block: B:185:0x0060, code lost:
    
        if (r6.hc(r5 instanceof com.vk.im.engine.models.groups.Group ? (com.vk.im.engine.models.groups.Group) r5 : null) == false) goto L49;
     */
    /* JADX WARN: Code restructure failed: missing block: B:196:0x007b, code lost:
    
        if (r32.H0() == true) goto L50;
     */
    /* JADX WARN: Code restructure failed: missing block: B:226:0x00c4, code lost:
    
        if (super.Q0(r32) == false) goto L50;
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x01e0, code lost:
    
        if (r6.intValue() != r7) goto L178;
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x01ff, code lost:
    
        if (r5.k8() == false) goto L203;
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x0205, code lost:
    
        if (r5.g8() == false) goto L202;
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x0207, code lost:
    
        r0 = r5.H;
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x0209, code lost:
    
        if (r0 == null) goto L196;
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x020f, code lost:
    
        if (r0.isEmpty() == false) goto L196;
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x0212, code lost:
    
        r0 = r0.iterator();
     */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x021a, code lost:
    
        if (r0.hasNext() == false) goto L249;
     */
    /* JADX WARN: Code restructure failed: missing block: B:85:0x0224, code lost:
    
        if ((((com.vk.dto.attaches.Attach) r0.next()) instanceof com.vk.im.engine.models.attaches.AttachLink) != false) goto L250;
     */
    /* JADX WARN: Code restructure failed: missing block: B:89:0x0227, code lost:
    
        r24 = true;
     */
    /* JADX WARN: Removed duplicated region for block: B:102:0x0252  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x0247  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x019f  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0232  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0242  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x024a A[ADDED_TO_REGION] */
    @Override // com.vk.im.ui.components.viewcontrollers.msg_list.adapter.model.g
    /* renamed from: F, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final f B0(g gVar, g gVar2, uk30 uk30Var) {
        c.C1166c c1166c;
        boolean g0;
        boolean z;
        boolean z2;
        q7v0 p3;
        qtd0 qtd0Var;
        MsgFromUser msgFromUser;
        boolean z3;
        AttachChannelMessage attachChannelMessage;
        String str;
        VideoFile videoFile;
        boolean f = uk30Var.f(this, gVar);
        h7j0 h7j0Var = null;
        h7j0Var = null;
        h7j0Var = null;
        h7j0Var = null;
        h7j0Var = null;
        h7j0Var = null;
        utr0 b = gVar != null ? b.b(gVar) : null;
        utr0 b2 = gVar2 != null ? b.b(gVar2) : null;
        ProfilesInfo profilesInfo = uk30Var.e;
        ChatSettings chatSettings = uk30Var.m;
        c cVar = this.k;
        if ((cVar != null ? cVar.F : null) != null) {
            Msg msg = this.R;
            MsgFromChannel msgFromChannel = msg instanceof MsgFromChannel ? (MsgFromChannel) msg : null;
            if (msgFromChannel == null || !msgFromChannel.L) {
                MsgFromChannel msgFromChannel2 = msg instanceof MsgFromChannel ? (MsgFromChannel) msg : null;
                if (msgFromChannel2 != null) {
                    qtd0 Bb = profilesInfo != null ? profilesInfo.Bb(msgFromChannel2.O) : null;
                }
                if (super.Q0(gVar2)) {
                    if (!((gVar2 != null ? gVar2.Q() : null) instanceof MsgFromChannel)) {
                        if (gVar2 != null) {
                        }
                    }
                }
                g0 = true;
            }
            g0 = false;
        } else {
            if ((cVar == null || cVar.B) && cVar != null && (c1166c = cVar.D) != null) {
                boolean z4 = c1166c.F || c1166c.C || c1166c.E;
                boolean z5 = c1166c.J || c1166c.K;
                if (chatSettings == null || chatSettings.N) {
                    if (z4) {
                        g0 = super.g0();
                    } else if (z5) {
                    }
                }
            }
            g0 = false;
        }
        if (uk30Var.w) {
            Msg msg2 = this.R;
            Peer peer = uk30Var.l;
            boolean z6 = msg2 instanceof MsgFromUser;
            if (z6 && com.vk.im.engine.utils.a.j(msg2)) {
                MsgFromUser msgFromUser2 = (MsgFromUser) msg2;
                if (msgFromUser2.i) {
                    List<? extends MsgReaction> list = msgFromUser2.S;
                    ArrayList arrayList = new ArrayList();
                    Iterator<T> it = list.iterator();
                    while (it.hasNext()) {
                        g5g.y(((MsgReaction) it.next()).u2(), arrayList);
                    }
                    if (!arrayList.contains(Long.valueOf(peer.d))) {
                        if (z6 && msgFromUser2.F.length() == 0 && !msgFromUser2.p3() && msgFromUser2.E2()) {
                            Object b0 = j5g.b0(0, msgFromUser2.H);
                            AttachVideo attachVideo = b0 instanceof AttachVideo ? (AttachVideo) b0 : null;
                            if (attachVideo != null && (videoFile = attachVideo.b) != null && videoFile.C2() && !super.H0()) {
                                z = false;
                                z2 = true;
                                if (!uk30Var.t) {
                                    Msg msg3 = this.R;
                                    Msg Q = gVar != null ? gVar.Q() : null;
                                    if ((msg3 instanceof MsgFromUser) && (Q instanceof MsgFromUser) && (((z3 = (msgFromUser = (MsgFromUser) msg3).i) && ((MsgFromUser) Q).i) || (!z3 && !((MsgFromUser) Q).i))) {
                                        MsgFromUser msgFromUser3 = (MsgFromUser) Q;
                                        Integer num = msgFromUser.R;
                                        if (num != null) {
                                            if (num.intValue() == msgFromUser3.d) {
                                                Integer num2 = msgFromUser3.R;
                                                int i = msgFromUser.d;
                                                if (num2 != null) {
                                                }
                                            }
                                        }
                                        Integer num3 = msgFromUser.Q;
                                        if (num3 != null) {
                                            if (num3.intValue() == msgFromUser3.b) {
                                                Integer num4 = msgFromUser3.Q;
                                                int i2 = msgFromUser.b;
                                                if (num4 != null) {
                                                }
                                            }
                                        }
                                    }
                                }
                                boolean z7 = z;
                                boolean z8 = (!super.S() || super.O0()) ? true : z;
                                VkOnboardingComponent vkOnboardingComponent = uk30Var.b0;
                                p3 = vkOnboardingComponent != null ? vkOnboardingComponent.p3() : null;
                                if (p3 != null && gVar2 == null) {
                                    qtd0Var = this.D;
                                    if (qtd0Var instanceof Group) {
                                        Msg msg4 = this.R;
                                        if ((msg4 instanceof MsgFromChannel) && ((MsgFromChannel) msg4).I.g == null) {
                                            VkOnboardingCampaign e = p3.e("me:channel_story_repost");
                                            if (e == null || !p3.d(e)) {
                                                e = null;
                                            }
                                            if (e != null) {
                                                Group group = qtd0Var != null ? (Group) qtd0Var : null;
                                                AdminLevel adminLevel = group != null ? group.q : null;
                                                int i3 = adminLevel == null ? -1 : a.$EnumSwitchMapping$0[adminLevel.ordinal()];
                                                h7j0Var = new h7j0((i3 == 1 || i3 == 2) ? R.string.vkim_repost_message_to_story_admin : R.string.vkim_repost_message_to_story_subscriber, e);
                                            }
                                        }
                                    }
                                }
                                f a2 = a(this, null, null, false, false, null, null, b, b2, f, 0, false, null, null, false, false, false, false, false, false, null, g0, z2, z7, h7j0Var, null, z8, 1073684479, 1914);
                                a2.R = this.R;
                                a2.S = this.S;
                                return a2;
                            }
                        }
                        MsgFromUser msgFromUser4 = z6 ? msgFromUser2 : null;
                        if (msgFromUser4 != null) {
                            z = false;
                            boolean z9 = msgFromUser4.A4(false) && !msgFromUser4.c9().A;
                            boolean z10 = msgFromUser4.D3(AttachChannelMessage.class, false) && ((attachChannelMessage = (AttachChannelMessage) a.C1125a.a(msgFromUser4, AttachChannelMessage.class)) == null || (str = attachChannelMessage.h) == null || !myc0.f(str));
                            if (!z9) {
                            }
                            if (gVar2 != null) {
                                c E0 = gVar2.E0();
                                if (E0 != null) {
                                }
                            }
                            z2 = true;
                            if (!uk30Var.t) {
                            }
                            boolean z72 = z;
                            if (super.S()) {
                            }
                            VkOnboardingComponent vkOnboardingComponent2 = uk30Var.b0;
                            if (vkOnboardingComponent2 != null) {
                            }
                            if (p3 != null) {
                                qtd0Var = this.D;
                                if (qtd0Var instanceof Group) {
                                }
                            }
                            f a22 = a(this, null, null, false, false, null, null, b, b2, f, 0, false, null, null, false, false, false, false, false, false, null, g0, z2, z72, h7j0Var, null, z8, 1073684479, 1914);
                            a22.R = this.R;
                            a22.S = this.S;
                            return a22;
                        }
                    }
                }
            }
        }
        z = false;
        z2 = z;
        if (!uk30Var.t) {
        }
        boolean z722 = z;
        if (super.S()) {
        }
        VkOnboardingComponent vkOnboardingComponent22 = uk30Var.b0;
        if (vkOnboardingComponent22 != null) {
        }
        if (p3 != null) {
        }
        f a222 = a(this, null, null, false, false, null, null, b, b2, f, 0, false, null, null, false, false, false, false, false, false, null, g0, z2, z722, h7j0Var, null, z8, 1073684479, 1914);
        a222.R = this.R;
        a222.S = this.S;
        return a222;
    }

    @Override // com.vk.im.ui.components.viewcontrollers.msg_list.adapter.model.g
    public final /* bridge */ /* synthetic */ g H(Boolean bool, Boolean bool2, Integer num) {
        return i(bool, num);
    }

    @Override // com.vk.im.ui.components.viewcontrollers.msg_list.adapter.model.g
    public final CharSequence K() {
        return this.c;
    }

    @Override // com.vk.im.ui.components.viewcontrollers.msg_list.adapter.model.g
    public final boolean K0() {
        return this.h;
    }

    @Override // xsna.ol8
    public final oh30 M0() {
        return this.f;
    }

    public final boolean P() {
        if (!super.F0()) {
            return false;
        }
        if (super.F0() && d()) {
            return false;
        }
        utr0 utr0Var = this.o;
        return utr0Var == null || !utr0Var.n0();
    }

    @Override // com.vk.im.ui.components.viewcontrollers.msg_list.adapter.model.g
    public final Msg Q() {
        return this.R;
    }

    public final int b() {
        boolean z;
        gl8 gl8Var = dhr0.M() ? this.u : this.v;
        abi0 abi0Var = this.Q;
        if (abi0Var != null) {
            c cVar = this.k;
            z = abi0Var.d(cVar != null ? Integer.valueOf(cVar.b) : null);
        } else {
            z = false;
        }
        return z ? gl8Var.b : gl8Var.a;
    }

    public final int c() {
        c.C1166c c1166c;
        List<MsgReaction> list;
        int i = 0;
        c cVar = this.k;
        if (cVar != null && (c1166c = cVar.D) != null && (list = c1166c.H.a) != null) {
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                i += ((MsgReaction) it.next()).getCount();
            }
        }
        return i;
    }

    public final boolean d() {
        return t() > 0;
    }

    public final boolean e() {
        c.C1166c c1166c;
        if (super.l0() || super.O()) {
            c cVar = this.k;
            if ((cVar == null || (c1166c = cVar.D) == null) ? false : c1166c.m) {
                return true;
            }
        }
        return false;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!f.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        f fVar = (f) obj;
        if (this.b != fVar.b) {
            return false;
        }
        CharSequence charSequence = this.c;
        String obj2 = charSequence != null ? charSequence.toString() : null;
        CharSequence charSequence2 = fVar.c;
        return epx.f(obj2, charSequence2 != null ? charSequence2.toString() : null) && this.d == fVar.d && epx.f(this.e, fVar.e) && epx.f(this.f, fVar.f) && this.g == fVar.g && this.h == fVar.h && this.i == fVar.i && this.j == fVar.j && epx.f(this.k, fVar.k) && epx.f(this.l, fVar.l) && this.N == fVar.N && epx.f(this.K, fVar.K) && epx.f(this.L, fVar.L) && epx.f(this.M, fVar.M) && epx.f(this.n, fVar.n) && epx.f(this.m, fVar.m) && epx.f(this.o, fVar.o) && epx.f(this.p, fVar.p) && this.q == fVar.q && this.r == fVar.r && this.s == fVar.s && this.t == fVar.t && this.w == fVar.w && this.x == fVar.x && this.y == fVar.y && this.z == fVar.z && this.A == fVar.A && this.B == fVar.B && this.C == fVar.C && epx.f(this.D, fVar.D) && epx.f(this.E, fVar.E) && this.F == fVar.F;
    }

    public final boolean f() {
        utr0 utr0Var = this.p;
        if (utr0Var == null) {
            return false;
        }
        boolean m = utr0Var.m();
        c cVar = utr0Var.g;
        return super.z0(m, cVar != null ? Integer.valueOf(cVar.b) : null);
    }

    public final boolean g() {
        utr0 utr0Var = this.o;
        if (utr0Var == null) {
            return false;
        }
        boolean m = utr0Var.m();
        c cVar = utr0Var.g;
        return super.z0(m, cVar != null ? Integer.valueOf(cVar.b) : null);
    }

    public final boolean h() {
        c cVar;
        c.g gVar;
        return (d() || !super.F0() || (cVar = this.k) == null || (gVar = cVar.E) == null || !gVar.c) ? false : true;
    }

    public final int hashCode() {
        int hashCode = this.b.hashCode() * 31;
        CharSequence charSequence = this.c;
        int hashCode2 = (((hashCode + (charSequence != null ? charSequence.hashCode() : 0)) * 31) + this.d) * 31;
        y060 y060Var = this.e;
        int hashCode3 = (hashCode2 + (y060Var != null ? y060Var.hashCode() : 0)) * 31;
        oh30 oh30Var = this.f;
        int b = qoy.b(bh10.a(qoy.b(qoy.b((hashCode3 + (oh30Var != null ? oh30Var.hashCode() : 0)) * 31, 31, this.g), 31, this.h), 31, this.i), 31, this.j);
        c cVar = this.k;
        int hashCode4 = (b + (cVar != null ? cVar.hashCode() : 0)) * 31;
        com.vk.im.ui.components.viewcontrollers.msg_list.adapter.model.a aVar = this.l;
        int hashCode5 = (this.n.hashCode() + ((this.m.hashCode() + qoy.b(u11.c(u11.c(u11.c((hashCode4 + (aVar != null ? aVar.hashCode() : 0)) * 31, 31, this.K), 31, this.L), 31, this.M), 31, this.N)) * 31)) * 31;
        utr0 utr0Var = this.o;
        int hashCode6 = (hashCode5 + (utr0Var != null ? utr0Var.hashCode() : 0)) * 31;
        utr0 utr0Var2 = this.p;
        int b2 = qoy.b(qoy.b(qoy.b(qoy.b(qoy.b(qoy.b(qoy.b(qoy.b((qoy.b(qoy.b((hashCode6 + (utr0Var2 != null ? utr0Var2.hashCode() : 0)) * 31, 31, this.q), 31, this.r) + this.s) * 31, 31, this.t), 31, this.w), 31, this.x), 31, this.y), 31, this.z), 31, this.A), 31, this.B), 31, this.C);
        qtd0 qtd0Var = this.D;
        int hashCode7 = (b2 + (qtd0Var != null ? qtd0Var.hashCode() : 0)) * 31;
        ev9 ev9Var = this.E;
        return Boolean.hashCode(this.F) + ((hashCode7 + (ev9Var != null ? ev9Var.hashCode() : 0)) * 31);
    }

    public final f i(Boolean bool, Integer num) {
        f a2 = a(this, null, null, false, false, null, null, null, null, false, num != null ? num.intValue() : this.s, bool != null ? bool.booleanValue() : this.t, null, null, false, false, false, false, false, false, null, false, false, false, null, null, false, -393217, 2047);
        a2.R = this.R;
        a2.S = this.S;
        return a2;
    }

    @Override // com.vk.im.ui.components.viewcontrollers.msg_list.adapter.model.g
    /* renamed from: j, reason: merged with bridge method [inline-methods] */
    public final f n(oh30 oh30Var) {
        f a2 = a(this, null, oh30Var, false, false, null, null, null, null, false, 0, false, null, null, false, false, false, false, false, false, null, false, false, false, null, null, false, -17, 2047);
        a2.R = this.R;
        a2.S = this.S;
        return a2;
    }

    @Override // com.vk.im.ui.components.viewcontrollers.msg_list.adapter.model.g
    /* renamed from: k, reason: merged with bridge method [inline-methods] */
    public final f X(uk30 uk30Var) {
        vk30 vk30Var = uk30Var.a;
        c cVar = this.k;
        long j = cVar != null ? cVar.d : 0L;
        boolean z = this.r;
        BubbleColors c = vk30Var.c(j, z, false);
        BubbleColors c2 = vk30Var.c(cVar != null ? cVar.d : 0L, z, true);
        boolean f = uk30Var.f(this, this.o);
        boolean e = uk30Var.e(z, this.g);
        boolean z2 = cVar != null ? cVar.v : false;
        int i = this.d;
        gl8 b = vk30Var.b(c, i, z2);
        f a2 = a(this, null, null, e, false, c2, c, null, null, f, 0, false, vk30Var.b(c2, i, cVar != null ? cVar.v : false), b, (super.b0() || cVar == null || !uk30Var.h(this.x)) ? false : true, uk30Var.u, uk30Var.v, uk30Var.t, uk30Var.q, cVar != null ? cVar.w : false, null, false, false, false, null, null, false, -263755809, 2047);
        a2.R = this.R;
        a2.S = this.S;
        return a2;
    }

    @Override // com.vk.im.ui.components.viewcontrollers.msg_list.adapter.model.g
    public final AdapterEntryType l() {
        return this.b;
    }

    @Override // com.vk.im.ui.components.viewcontrollers.msg_list.adapter.model.g
    /* renamed from: p, reason: merged with bridge method [inline-methods] */
    public final f s(ProfilesInfo profilesInfo, uk30 uk30Var) {
        c cVar = this.k;
        qtd0 Bb = profilesInfo.Bb(cVar != null ? cVar.j : null);
        StringBuilder sb = new StringBuilder();
        if ((cVar != null ? cVar.F : null) == null) {
            DisplayNameFormatter displayNameFormatter = uk30Var.f0;
            displayNameFormatter.getClass();
            displayNameFormatter.h(Bb, UserNameCase.NOM, sb, DisplayNameFormatter.NameOrder.START_WITH_FIRSTNAME);
        }
        f a2 = a(this, null, null, false, false, null, null, null, null, false, 0, false, null, null, false, false, false, false, false, false, Bb, false, false, false, null, sb.toString(), false, -268435457, CommonConstant.RETCODE.LOGOUT_REQUEST_SUCCESS);
        a2.R = this.R;
        a2.S = this.S;
        return a2;
    }

    @Override // com.vk.im.ui.components.viewcontrollers.msg_list.adapter.model.g
    public final boolean q() {
        return this.g;
    }

    @Override // com.vk.im.ui.components.viewcontrollers.msg_list.adapter.model.g
    public final y060 q0() {
        return this.e;
    }

    @Override // com.vk.im.ui.components.viewcontrollers.msg_list.adapter.model.g
    /* renamed from: r, reason: merged with bridge method [inline-methods] */
    public final f y(boolean z) {
        f a2 = a(this, null, null, false, z, null, null, null, null, false, 0, false, null, null, false, false, false, false, false, false, null, false, false, false, null, null, false, -257, 2047);
        a2.R = this.R;
        a2.S = this.S;
        return a2;
    }

    @Override // com.vk.im.ui.components.viewcontrollers.msg_list.adapter.model.g
    public final com.vk.im.ui.components.viewcontrollers.msg_list.adapter.model.a s0() {
        return this.l;
    }

    @Override // com.vk.im.ui.components.viewcontrollers.msg_list.adapter.model.g
    public final int t() {
        return this.d;
    }

    public final String toString() {
        return "VhMsgContentData(viewType=" + this.b + ", valueBody=" + ((Object) this.c) + ", valueNestedLevel=" + this.d + ", msgNestedMeta=" + this.e + ", bubbleStyle=" + this.f + ", isAvatarLayout=" + this.g + ", hasLargeEmojis=" + this.h + ", dateMs=" + this.i + ", isShowStatusView=" + this.j + ", msgMeta=" + this.k + ", attachMeta=" + this.l + ", bubbleColorsDark=" + this.m + ", bubbleColorsLight=" + this.n + ", entryPrev=" + this.o + ", entryNext=" + this.p + ", isGradientBubble=" + this.q + ", isIncoming=" + this.r + ", suggestedBubbleMaxWidth=" + this.s + ", isFitAllWidth=" + this.t + ", bubbleColorDark=" + this.u + ", bubbleColorLight=" + this.v + ", isReplyAvailable=" + this.w + ", isMsgSuitableForReply=" + this.x + ", isChat=" + this.y + ", isCasperChat=" + this.z + ", isChannel=" + this.A + ", isBackgroundSet=" + this.B + ", isOrientationFromSelf=" + this.C + ", profile=" + this.D + ", carouselPositionMediator=" + this.E + ", shouldShowIncomingShareButton=" + this.F + ", shouldShowAddReactionFloating=" + this.G + ", shouldShowLinkedToAppendix=" + this.H + ", isMsgWithRedesignWallPost=false, shareButtonOnboarding=" + this.I + ", shareContext=" + this.J + ", accessibilityProfile=" + ((Object) this.K) + ", accessibilityContent=" + ((Object) this.L) + ", accessibilityMarkDownLinks=" + ((Object) this.M) + ", isNotImportantForAccessibility=" + this.N + ", highlightMessageMediator=" + this.O + ", dialogUnreadMsgMediator=" + this.P + ", selectedMessagesMediator=" + this.Q + ')';
    }

    @Override // com.vk.im.ui.components.viewcontrollers.msg_list.adapter.model.g, xsna.zwk
    public final long v() {
        return this.i;
    }

    @Override // com.vk.im.ui.components.viewcontrollers.msg_list.adapter.model.g
    public final boolean w0() {
        return this.j;
    }

    @Override // com.vk.im.ui.components.viewcontrollers.msg_list.adapter.model.g
    public final Attach x() {
        return null;
    }

    public f(AdapterEntryType adapterEntryType, CharSequence charSequence, int i, y060 y060Var, oh30 oh30Var, boolean z, boolean z2, long j, boolean z3, c cVar, com.vk.im.ui.components.viewcontrollers.msg_list.adapter.model.a aVar, BubbleColors bubbleColors, BubbleColors bubbleColors2, utr0 utr0Var, utr0 utr0Var2, boolean z4, boolean z5, int i2, boolean z6, gl8 gl8Var, gl8 gl8Var2, boolean z7, boolean z8, boolean z9, boolean z10, boolean z11, boolean z12, boolean z13, qtd0 qtd0Var, ev9 ev9Var, boolean z14, boolean z15, boolean z16, h7j0 h7j0Var, sz30 sz30Var, CharSequence charSequence2, CharSequence charSequence3, CharSequence charSequence4, boolean z17, f5v f5vVar, fmm fmmVar, abi0 abi0Var) {
        this.b = adapterEntryType;
        this.c = charSequence;
        this.d = i;
        this.e = y060Var;
        this.f = oh30Var;
        this.g = z;
        this.h = z2;
        this.i = j;
        this.j = z3;
        this.k = cVar;
        this.l = aVar;
        this.m = bubbleColors;
        this.n = bubbleColors2;
        this.o = utr0Var;
        this.p = utr0Var2;
        this.q = z4;
        this.r = z5;
        this.s = i2;
        this.t = z6;
        this.u = gl8Var;
        this.v = gl8Var2;
        this.w = z7;
        this.x = z8;
        this.y = z9;
        this.z = z10;
        this.A = z11;
        this.B = z12;
        this.C = z13;
        this.D = qtd0Var;
        this.E = ev9Var;
        this.F = z14;
        this.G = z15;
        this.H = z16;
        this.I = h7j0Var;
        this.J = sz30Var;
        this.K = charSequence2;
        this.L = charSequence3;
        this.M = charSequence4;
        this.N = z17;
        this.O = f5vVar;
        this.P = fmmVar;
        this.Q = abi0Var;
    }

    @Override // com.vk.im.ui.components.viewcontrollers.msg_list.adapter.model.g
    @CheckResult
    public final g u(boolean z) {
        return this;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public /* synthetic */ f(AdapterEntryType adapterEntryType, CharSequence charSequence, int i, y060 y060Var, boolean z, boolean z2, long j, c cVar, com.vk.im.ui.components.viewcontrollers.msg_list.adapter.model.a aVar, BubbleColors bubbleColors, BubbleColors bubbleColors2, boolean z3, gl8 gl8Var, gl8 gl8Var2, boolean z4, boolean z5, boolean z6, boolean z7, boolean z8, boolean z9, boolean z10, qtd0 qtd0Var, ev9 ev9Var, String str, CharSequence charSequence2, String str2, f5v f5vVar, fmm fmmVar, abi0 abi0Var, int i2, int i3) {
        this(r4, r5, r2, r7, null, r9, r10, r11, false, r14, r15, r16, r17, null, null, false, r21, 0, false, r8 != 0 ? r13 : gl8Var, (1048576 & i2) != 0 ? r13 : gl8Var2, (2097152 & i2) != 0 ? false : z4, (4194304 & i2) != 0 ? false : z5, (8388608 & i2) != 0 ? false : z6, (16777216 & i2) != 0 ? false : z7, (33554432 & i2) != 0 ? false : z8, (67108864 & i2) != 0 ? false : z9, (134217728 & i2) != 0 ? false : z10, (268435456 & i2) != 0 ? null : qtd0Var, (i2 & SQLiteDatabase.ENABLE_WRITE_AHEAD_LOGGING) != 0 ? null : ev9Var, false, false, false, null, new sz30(false), (i3 & 16) != 0 ? "" : str, (i3 & 32) != 0 ? "" : charSequence2, (i3 & 64) != 0 ? "" : str2, true, (i3 & 256) != 0 ? null : f5vVar, (i3 & 512) != 0 ? null : fmmVar, (i3 & 1024) != 0 ? null : abi0Var);
        AdapterEntryType adapterEntryType2 = (i2 & 1) != 0 ? AdapterEntryType.TYPE_UNKNOWN : adapterEntryType;
        CharSequence charSequence3 = (i2 & 2) != 0 ? null : charSequence;
        int i4 = (i2 & 4) != 0 ? 0 : i;
        y060 y060Var2 = (i2 & 8) != 0 ? null : y060Var;
        boolean z11 = (i2 & 32) != 0 ? false : z;
        boolean z12 = (i2 & 64) != 0 ? false : z2;
        long j2 = (i2 & 128) != 0 ? 0L : j;
        c cVar2 = (i2 & 512) != 0 ? null : cVar;
        com.vk.im.ui.components.viewcontrollers.msg_list.adapter.model.a aVar2 = (i2 & 1024) != 0 ? null : aVar;
        BubbleColors bubbleColors3 = (i2 & 2048) != 0 ? new BubbleColors(0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, null, 0, 1073741823, null) : bubbleColors;
        BubbleColors bubbleColors4 = (i2 & 4096) != 0 ? new BubbleColors(0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, null, 0, 1073741823, null) : bubbleColors2;
        boolean z13 = (65536 & i2) != 0 ? false : z3;
        int i5 = 524288 & i2;
        gl8 gl8Var3 = gl8.c;
    }
}
