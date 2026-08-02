package com.vk.im.ui.components.viewcontrollers.msg_list.decoration;

import android.content.Context;
import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.vk.dto.common.Peer;
import com.vk.im.engine.models.attaches.AttachStory;
import com.vk.im.engine.models.c;
import com.vk.im.engine.models.messages.Msg;
import com.vk.im.engine.models.messages.MsgFromUser;
import com.vk.im.engine.models.messages.NestedMsg;
import com.vk.im.ui.components.viewcontrollers.msg_list.adapter.model.g;
import com.vk.im.ui.components.viewcontrollers.msg_list.entry.AdapterEntryType;
import com.vkontakte.android.R;
import xsna.a1w;
import xsna.awt0;
import xsna.cn70;
import xsna.e3m;
import xsna.e43;
import xsna.epx;
import xsna.gtx0;
import xsna.iah0;
import xsna.ok30;
import xsna.q1w;
import xsna.qk30;
import xsna.xh30;
import xsna.xuo0;

/* compiled from: ItemDecorationImpl.kt */
/* loaded from: classes2.dex */
public final class a extends RecyclerView.n {
    public static final int j;
    public static final int[][] l;
    public final c b;
    public final ok30 c;
    public final int d;
    public final boolean e;
    public final int f;
    public static final int g = cn70.b(80);
    public static final int h = -iah0.a(24);
    public static final int i = -iah0.a(20);
    public static final int k = -iah0.a(76);

    /* compiled from: ItemDecorationImpl.kt */
    /* renamed from: com.vk.im.ui.components.viewcontrollers.msg_list.decoration.a$a, reason: collision with other inner class name */
    public static final /* synthetic */ class C1169a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[AdapterEntryType.values().length];
            try {
                iArr[AdapterEntryType.TYPE_TEXT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[AdapterEntryType.TYPE_STICKER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[AdapterEntryType.TYPE_REACTIONS.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    static {
        float f = 8;
        j = -iah0.a(f);
        float f2 = 0;
        float f3 = 5;
        float f4 = 1;
        float f5 = 4;
        l = new int[][]{new int[]{iah0.a(f2), iah0.a(f2), iah0.a(f2), iah0.a(f2), iah0.a(f2), iah0.a(f2)}, new int[]{iah0.a(f2), iah0.a(f3), iah0.a(f), iah0.a(f), iah0.a(f2), iah0.a(f)}, new int[]{iah0.a(f2), iah0.a(f4), iah0.a(f5), iah0.a(f), iah0.a(f2), iah0.a(f)}, new int[]{iah0.a(f2), iah0.a(f3), iah0.a(f), iah0.a(f), iah0.a(f2), iah0.a(f)}, new int[]{iah0.a(f2), iah0.a(f4), iah0.a(f5), iah0.a(f), iah0.a(f2), iah0.a(f)}, new int[]{iah0.a(f2), iah0.a(f3), iah0.a(f3), iah0.a(f2), iah0.a(f2), iah0.a(f2)}, new int[]{iah0.a(f2), iah0.a(f3), iah0.a(f3), iah0.a(f2), iah0.a(f2), iah0.a(f2)}, new int[]{iah0.a(f2), iah0.a(f3), iah0.a(f3), iah0.a(f2), iah0.a(f2), iah0.a(f2)}};
    }

    public a(Context context, c cVar, ok30 ok30Var, int i2, boolean z) {
        this.b = cVar;
        this.c = ok30Var;
        this.d = i2;
        this.e = z;
        this.f = e3m.d(R.attr.im_msg_part_story_padding, context);
    }

    public static boolean l(g gVar) {
        Msg Q = gVar.Q();
        NestedMsg D0 = gVar.D0();
        boolean z = false;
        if (Q != null && D0 == null && (gVar.l() == AdapterEntryType.TYPE_PHOTO || gVar.l() == AdapterEntryType.TYPE_VIDEO || gVar.l() == AdapterEntryType.TYPE_VIDEO_AUTOPLAY || gVar.l() == AdapterEntryType.TYPE_GIF_AUTOPLAY || gVar.l() == AdapterEntryType.TYPE_MAP || gVar.l() == AdapterEntryType.TYPE_STICKER || gVar.l() == AdapterEntryType.TYPE_UGC_STICKER || gVar.l() == AdapterEntryType.TYPE_POPUP_STICKER || gVar.l() == AdapterEntryType.TYPE_DOC_PREVIEW || gVar.l() == AdapterEntryType.TYPE_GRAFFITI || gVar.l() == AdapterEntryType.TYPE_STORY || gVar.g0())) {
            z = true;
        }
        return !z;
    }

    /* JADX WARN: Code restructure failed: missing block: B:100:0x0168, code lost:
    
        if (r1.g8() == false) goto L129;
     */
    /* JADX WARN: Code restructure failed: missing block: B:101:0x016a, code lost:
    
        r11 = r1.H;
     */
    /* JADX WARN: Code restructure failed: missing block: B:102:0x016c, code lost:
    
        if (r11 == null) goto L123;
     */
    /* JADX WARN: Code restructure failed: missing block: B:104:0x0172, code lost:
    
        if (r11.isEmpty() == false) goto L123;
     */
    /* JADX WARN: Code restructure failed: missing block: B:105:0x0175, code lost:
    
        r11 = r11.iterator();
     */
    /* JADX WARN: Code restructure failed: missing block: B:107:0x017d, code lost:
    
        if (r11.hasNext() == false) goto L200;
     */
    /* JADX WARN: Code restructure failed: missing block: B:109:0x0187, code lost:
    
        if ((((com.vk.dto.attaches.Attach) r11.next()) instanceof com.vk.im.engine.models.attaches.AttachLink) != false) goto L201;
     */
    /* JADX WARN: Code restructure failed: missing block: B:114:0x0191, code lost:
    
        if (r9.l() != com.vk.im.ui.components.viewcontrollers.msg_list.entry.AdapterEntryType.TYPE_REACTIONS) goto L133;
     */
    /* JADX WARN: Code restructure failed: missing block: B:115:0x0193, code lost:
    
        r8.bottom = -xsna.iah0.a(4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:116:0x019b, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:117:0x019c, code lost:
    
        r10 = r9.Q();
     */
    /* JADX WARN: Code restructure failed: missing block: B:118:0x01a0, code lost:
    
        if (r10 == null) goto L139;
     */
    /* JADX WARN: Code restructure failed: missing block: B:120:0x01a4, code lost:
    
        if (r10.i != true) goto L139;
     */
    /* JADX WARN: Code restructure failed: missing block: B:121:0x01a6, code lost:
    
        r8.bottom = -xsna.iah0.a(4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:122:0x01ae, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:124:0x01b3, code lost:
    
        if (r9.Q() == null) goto L145;
     */
    /* JADX WARN: Code restructure failed: missing block: B:126:0x01b8, code lost:
    
        if ((!r9.i) != true) goto L145;
     */
    /* JADX WARN: Code restructure failed: missing block: B:127:0x01ba, code lost:
    
        r8.bottom = xsna.iah0.a(0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:128:0x01c1, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:129:0x01c2, code lost:
    
        r8.bottom = xsna.iah0.a(0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:130:0x01c9, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:138:0x015c, code lost:
    
        if (r11.intValue() != r0) goto L147;
     */
    /* JADX WARN: Code restructure failed: missing block: B:96:0x0142, code lost:
    
        if (r0.intValue() != r2) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:98:0x0162, code lost:
    
        if (r1.k8() == false) goto L147;
     */
    @Override // androidx.recyclerview.widget.RecyclerView.n
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void getItemOffsets(Rect rect, View view, RecyclerView recyclerView, RecyclerView.a0 a0Var) {
        g b;
        g b2;
        ItemDecorationImpl$Companion$TypeBottom itemDecorationImpl$Companion$TypeBottom;
        boolean z;
        g b3;
        int i2;
        int childAdapterPosition = recyclerView.getChildAdapterPosition(view);
        if (childAdapterPosition == -1) {
            return;
        }
        boolean z2 = this.e;
        ok30 ok30Var = this.c;
        boolean z3 = false;
        if (z2 && (b3 = qk30.b(childAdapterPosition, ok30Var)) != null && b3.B() && childAdapterPosition == 0) {
            rect.top = cn70.b(16);
            int m = awt0.m(view) / 2;
            int i3 = this.d / 2;
            int i4 = 0;
            int i5 = 0;
            while (i5 < recyclerView.getChildCount()) {
                int i6 = i5 + 1;
                View childAt = recyclerView.getChildAt(i5);
                if (childAt == null) {
                    throw new IndexOutOfBoundsException();
                }
                if (recyclerView.getChildAdapterPosition(childAt) > childAdapterPosition) {
                    RecyclerView.o layoutManager = recyclerView.getLayoutManager();
                    int topDecorationHeight = layoutManager != null ? layoutManager.getTopDecorationHeight(childAt) : 0;
                    RecyclerView.o layoutManager2 = recyclerView.getLayoutManager();
                    i2 = awt0.m(childAt) + topDecorationHeight + (layoutManager2 != null ? layoutManager2.getBottomDecorationHeight(childAt) : 0);
                } else {
                    i2 = 0;
                }
                i4 += i2;
                i5 = i6;
            }
            rect.bottom = Math.max(i3 - (m + i4), g);
            return;
        }
        if ((ok30Var == null || childAdapterPosition == e43.h(ok30Var.f)) || (b = qk30.b(childAdapterPosition, ok30Var)) == null || (b2 = qk30.b(childAdapterPosition + 1, ok30Var)) == null) {
            return;
        }
        AdapterEntryType l2 = b.l();
        AdapterEntryType adapterEntryType = AdapterEntryType.TYPE_STORY;
        if (l2 == adapterEntryType) {
            int i7 = this.f;
            rect.left = i7;
            rect.right = i7;
        }
        Msg Q = b.Q();
        Msg Q2 = b2.Q();
        if (Q != null && Q2 != null && b.m() && b2.m() && Q.b == Q2.b) {
            if (b.l() == adapterEntryType) {
                int i8 = C1169a.$EnumSwitchMapping$0[b2.l().ordinal()];
                int i9 = j;
                if (i8 != 1) {
                    if (i8 != 2) {
                        i9 = i8 != 3 ? i : cn70.b(0);
                    } else if (!m(b)) {
                        i9 = k;
                    }
                } else if (!m(b)) {
                    i9 = h;
                }
                rect.bottom = i9;
                return;
            }
            return;
        }
        Msg Q3 = b.Q();
        MsgFromUser msgFromUser = Q3 instanceof MsgFromUser ? (MsgFromUser) Q3 : null;
        Msg Q4 = b2.Q();
        MsgFromUser msgFromUser2 = Q4 instanceof MsgFromUser ? (MsgFromUser) Q4 : null;
        if (msgFromUser != null && msgFromUser2 != null && (((z = msgFromUser2.i) && msgFromUser.i) || (!z && !msgFromUser.i))) {
            Integer num = msgFromUser2.R;
            if (num != null) {
                if (num.intValue() == msgFromUser.d) {
                    Integer num2 = msgFromUser.R;
                    int i10 = msgFromUser2.d;
                    if (num2 != null) {
                    }
                }
            }
            Integer num3 = msgFromUser2.Q;
            if (num3 != null) {
                if (num3.intValue() == msgFromUser.b) {
                    Integer num4 = msgFromUser.Q;
                    int i11 = msgFromUser2.b;
                    if (num4 != null) {
                    }
                }
            }
        }
        ItemDecorationImpl$Companion$TypeTop itemDecorationImpl$Companion$TypeTop = b.m() ? l(b) ? ItemDecorationImpl$Companion$TypeTop.MSG_BUBBLE : ItemDecorationImpl$Companion$TypeTop.MSG_FLAT : b.v0() ? ItemDecorationImpl$Companion$TypeTop.UNREAD : b.M() ? ItemDecorationImpl$Companion$TypeTop.DATE : b.E() ? ItemDecorationImpl$Companion$TypeTop.SERVICE : ItemDecorationImpl$Companion$TypeTop.ETC;
        if (b2.m()) {
            boolean l3 = l(b2);
            Msg Q5 = b.Q();
            Msg Q6 = b2.Q();
            if (Q5 != null && Q6 != null) {
                boolean f = epx.f(Q5.getFrom(), Q6.getFrom());
                boolean z4 = Math.abs(Q5.g - Q6.g) < xh30.a;
                if (f && z4) {
                    z3 = true;
                }
            }
            itemDecorationImpl$Companion$TypeBottom = l3 ? z3 ? ItemDecorationImpl$Companion$TypeBottom.MSG_BUBBLE_GROUP : ItemDecorationImpl$Companion$TypeBottom.MSG_BUBBLE_ANY : z3 ? ItemDecorationImpl$Companion$TypeBottom.MSG_FLAT_GROUP : ItemDecorationImpl$Companion$TypeBottom.MSG_FLAT_ANY;
        } else {
            itemDecorationImpl$Companion$TypeBottom = b2.v0() ? ItemDecorationImpl$Companion$TypeBottom.UNREAD : b2.M() ? ItemDecorationImpl$Companion$TypeBottom.DATE : b2.E() ? ItemDecorationImpl$Companion$TypeBottom.SERVICE : ItemDecorationImpl$Companion$TypeBottom.ETC;
        }
        rect.bottom = l[itemDecorationImpl$Companion$TypeBottom.h()][itemDecorationImpl$Companion$TypeTop.h()];
    }

    public final boolean m(g gVar) {
        Peer peer;
        if (gVar.l() != AdapterEntryType.TYPE_STORY) {
            return false;
        }
        gtx0 Q = gVar.Q();
        com.vk.im.engine.models.messages.a aVar = Q instanceof com.vk.im.engine.models.messages.a ? (com.vk.im.engine.models.messages.a) Q : null;
        if (aVar == null) {
            return false;
        }
        AttachStory story = aVar.getStory();
        if (this.c != null) {
            a1w a1wVar = q1w.a;
            peer = (a1wVar != null ? a1wVar : null).q();
        } else {
            peer = Peer.Unknown.e;
        }
        xuo0.a.getClass();
        return !story.b(peer, xuo0.a());
    }
}
