package com.vk.im.ui.views.msg;

import android.content.Context;
import android.text.TextPaint;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.vk.dto.messages.MsgSyncState;
import com.vkontakte.android.R;
import kotlin.InitializedLazyImpl;
import kotlin.LazyThreadSafetyMode;
import kotlin.Pair;
import xsna.awt0;
import xsna.bh10;
import xsna.bwt0;
import xsna.da50;
import xsna.dhr0;
import xsna.epx;
import xsna.f4m;
import xsna.ho8;
import xsna.hr30;
import xsna.iah0;
import xsna.msy;
import xsna.qcy;
import xsna.qoy;
import xsna.shy;
import xsna.x9l0;

/* compiled from: TimeAndStatusView.kt */
/* loaded from: classes2.dex */
public final class TimeAndStatusView extends LinearLayout {
    public static final /* synthetic */ int h = 0;
    public boolean b;
    public final Object c;
    public final Object d;
    public final ImageView e;
    public final InitializedLazyImpl f;
    public Integer g;

    /* compiled from: TimeAndStatusView.kt */
    public static final class a {
        public final boolean a;
        public final boolean b;
        public final boolean c;
        public final int d;
        public final boolean e;
        public final boolean f;
        public final boolean g;
        public final boolean h;
        public final boolean i;
        public final long j;
        public final int k;
        public final MsgSyncState l;
        public final boolean m;
        public final boolean n;
        public final String o;

        public a(boolean z, boolean z2, boolean z3, int i, boolean z4, boolean z5, boolean z6, boolean z7, boolean z8, long j, int i2, MsgSyncState msgSyncState, boolean z9, boolean z10, String str) {
            this.a = z;
            this.b = z2;
            this.c = z3;
            this.d = i;
            this.e = z4;
            this.f = z5;
            this.g = z6;
            this.h = z7;
            this.i = z8;
            this.j = j;
            this.k = i2;
            this.l = msgSyncState;
            this.m = z9;
            this.n = z10;
            this.o = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return this.a == aVar.a && this.b == aVar.b && this.c == aVar.c && this.d == aVar.d && this.e == aVar.e && this.f == aVar.f && this.g == aVar.g && this.h == aVar.h && this.i == aVar.i && this.j == aVar.j && this.k == aVar.k && this.l == aVar.l && this.m == aVar.m && this.n == aVar.n && epx.f(this.o, aVar.o);
        }

        public final int hashCode() {
            return this.o.hashCode() + qoy.b(qoy.b((this.l.hashCode() + shy.a(this.k, bh10.a(qoy.b(qoy.b(qoy.b(qoy.b(qoy.b(shy.a(this.d, qoy.b(qoy.b(Boolean.hashCode(this.a) * 31, 31, this.b), 31, this.c), 31), 31, this.e), 31, this.f), 31, this.g), 31, this.h), 31, this.i), 31, this.j), 31)) * 31, 31, this.m), 31, this.n);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("TimeAndStatusViewConfig(showTime=");
            sb.append(this.a);
            sb.append(", showStatus=");
            sb.append(this.b);
            sb.append(", isEditTxtMarkEnabled=");
            sb.append(this.c);
            sb.append(", readTillOutMsgCnvId=");
            sb.append(this.d);
            sb.append(", showSendingAsUnread=");
            sb.append(this.e);
            sb.append(", isMsgToSelf=");
            sb.append(this.f);
            sb.append(", isGradientBubble=");
            sb.append(this.g);
            sb.append(", msgIsEdited=");
            sb.append(this.h);
            sb.append(", msgIsPinned=");
            sb.append(this.i);
            sb.append(", msgTime=");
            sb.append(this.j);
            sb.append(", cnvMsgId=");
            sb.append(this.k);
            sb.append(", msgSyncState=");
            sb.append(this.l);
            sb.append(", isOutgoing=");
            sb.append(this.m);
            sb.append(", msgIsExists=");
            sb.append(this.n);
            sb.append(", viewsCount=");
            return ho8.a(sb, this.o, ')');
        }
    }

    /* compiled from: TimeAndStatusView.kt */
    public static final /* synthetic */ class b {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[MsgSyncState.values().length];
            try {
                iArr[MsgSyncState.DONE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[MsgSyncState.EDITING.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[MsgSyncState.SENDING.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public TimeAndStatusView(Context context) {
        this(context, null, 0, 14, 0);
    }

    public static ViewsCountView a(TimeAndStatusView timeAndStatusView) {
        ViewsCountView viewsCountView = (ViewsCountView) ((ViewStub) timeAndStatusView.findViewById(R.id.im_time_and_status__views_count_viewstub)).inflate();
        viewsCountView.setColor(timeAndStatusView.getTimeView().getCurrentTextColor());
        return viewsCountView;
    }

    private final MsgStatusViewV2 getStatusView() {
        return (MsgStatusViewV2) this.f.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    private final TextView getTimeView() {
        return (TextView) this.c.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    private final ViewsCountView getViewsCountView() {
        return (ViewsCountView) this.d.getValue();
    }

    private final void setOutgoingStatus(a aVar) {
        MsgSyncState msgSyncState = aVar.l;
        boolean z = aVar.f;
        int i = b.$EnumSwitchMapping$0[msgSyncState.ordinal()];
        MsgStatus msgStatus = i != 1 ? (i == 2 || i == 3) ? aVar.e ? z ? MsgStatus.READ : MsgStatus.UNREAD : MsgStatus.SENDING : MsgStatus.ERROR : (aVar.k > aVar.d && !z) ? MsgStatus.UNREAD : MsgStatus.READ;
        bwt0.Q(this, R.id.autotests_msg_status, Integer.valueOf(msgStatus.ordinal()));
        getStatusView().setVisibility(0);
        getStatusView().setStatus(msgStatus);
    }

    private final void setupStatus(a aVar) {
        boolean z = aVar.b;
        InitializedLazyImpl initializedLazyImpl = this.f;
        if (!z) {
            initializedLazyImpl.getClass();
            f4m.j(getStatusView());
        } else if (aVar.n) {
            if (aVar.m) {
                setOutgoingStatus(aVar);
            } else {
                initializedLazyImpl.getClass();
                f4m.j(getStatusView());
            }
        }
    }

    /* JADX WARN: Type inference failed for: r5v4, types: [java.lang.Object, kotlin.Lazy] */
    public final void b(a aVar, Pair pair) {
        String str;
        CharSequence charSequence = hr30.b;
        this.g = pair != null ? (Integer) pair.j() : null;
        if (pair != null && (str = (String) pair.i()) != null && str.length() > 0) {
            charSequence = ((Object) charSequence) + ' ' + ((String) pair.i());
            getTimeView().setTextAlignment(6);
            getTimeView().setLines(2);
            getTimeView().setMaxWidth(iah0.a(200));
        }
        boolean z = !TextUtils.isEmpty(charSequence) && aVar.a;
        if (z || aVar.b) {
            if (z) {
                getTimeView().setVisibility(0);
                getTimeView().setText(charSequence);
            } else {
                f4m.j(getTimeView());
            }
            setupStatus(aVar);
            String str2 = aVar.o;
            if (z && str2.length() > 0) {
                getViewsCountView().setVisibility(0);
                getViewsCountView().setCount(str2);
            } else if (this.d.isInitialized()) {
                f4m.j(getViewsCountView());
            }
            awt0.v(this.e, aVar.i);
        } else {
            f4m.j(this);
        }
        bwt0.Q(this, R.id.autotests_msg_edited, Boolean.valueOf(aVar.c));
    }

    public final TextPaint getTimeTextViewPaint() {
        TextPaint textPaint = new TextPaint();
        textPaint.setTypeface(getTimeView().getTypeface());
        textPaint.setTextSize(getTimeView().getTextSize());
        return textPaint;
    }

    public final void setDarkBackground(boolean z) {
        setBackground(z ? dhr0.t.d(R.attr.im_msg_part_time_contrast_bg) : null);
    }

    public final void setGradientBubble(boolean z) {
        this.b = z;
        this.f.getClass();
        getStatusView().setGradientBubble(z);
    }

    /* JADX WARN: Type inference failed for: r3v5, types: [java.lang.Object, kotlin.Lazy] */
    public final void setTimeTextAppearance(int i) {
        TextView timeView = getTimeView();
        qcy<Object>[] qcyVarArr = bwt0.a;
        timeView.setTextAppearance(i);
        Integer num = this.g;
        if (num != null) {
            getTimeView().setTextColor(num.intValue());
        }
        this.f.getClass();
        Integer num2 = this.g;
        if (num2 != null) {
            getStatusView().setStatusColor(num2.intValue());
        } else {
            getStatusView().setStatusColor(getTimeView().getCurrentTextColor());
        }
        if (this.d.isInitialized()) {
            getViewsCountView().setColor(getTimeView().getCurrentTextColor());
        }
    }

    /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object, kotlin.Lazy] */
    public final void setTimeTextColor(int i) {
        Integer num = this.g;
        if (num != null) {
            i = num.intValue();
        }
        getTimeView().setTextColor(i);
        this.e.getDrawable().setTint(i);
        this.f.getClass();
        getStatusView().setStatusColor(i);
        if (this.d.isInitialized()) {
            getViewsCountView().setColor(i);
        }
    }

    public TimeAndStatusView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 12, 0);
    }

    public TimeAndStatusView(Context context, AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, 8, 0);
    }

    public /* synthetic */ TimeAndStatusView(Context context, AttributeSet attributeSet, int i, int i2, int i3) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i, 0);
    }

    public TimeAndStatusView(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        LayoutInflater.from(context).inflate(R.layout.im_time_and_status, (ViewGroup) this, true);
        da50 da50Var = new da50(this, 28);
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.NONE;
        this.c = msy.a(lazyThreadSafetyMode, da50Var);
        this.d = msy.a(lazyThreadSafetyMode, new x9l0(this, 6));
        this.e = (ImageView) findViewById(R.id.im_pin_mark);
        MsgStatusViewV2 msgStatusViewV2 = (MsgStatusViewV2) findViewById(R.id.im_time_and_status__status);
        msgStatusViewV2.setGradientBubble(this.b);
        msgStatusViewV2.setStatusColor(getTimeView().getCurrentTextColor());
        this.f = new InitializedLazyImpl(msgStatusViewV2);
    }
}
