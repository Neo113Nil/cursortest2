package com.vk.im.ui.formatters.spans.dialogitem;

import android.content.Context;
import android.text.Spanned;
import android.widget.TextView;
import com.vk.core.apps.BuildInfo;
import com.vk.im.ui.formatters.spans.dialogitem.MsgBodySpan;
import com.vk.toggle.features.ImFeatures;
import com.vkontakte.android.R;
import kotlin.NoWhenBranchMatchedException;
import xsna.ag20;
import xsna.bpn0;
import xsna.e3m;
import xsna.m1y;
import xsna.ohl;
import xsna.tju;
import xsna.xis;
import xsna.z3i;

/* compiled from: MsgBodySpanRecolorHelper.kt */
/* loaded from: classes2.dex */
public final class a {
    public final Context a;
    public final boolean b;
    public final boolean c;
    public final boolean d;

    /* compiled from: MsgBodySpanRecolorHelper.kt */
    /* renamed from: com.vk.im.ui.formatters.spans.dialogitem.a$a, reason: collision with other inner class name */
    public static final /* synthetic */ class C1174a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[MsgBodySpan.Type.values().length];
            try {
                iArr[MsgBodySpan.Type.MEMBER_NAME.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[MsgBodySpan.Type.DRAFT_LABEL.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[MsgBodySpan.Type.SECONDARY_TEXT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[MsgBodySpan.Type.ATTACH_TEXT.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[MsgBodySpan.Type.COMPOSING_TEXT.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public a(Context context) {
        this.a = context;
        ImFeatures imFeatures = ImFeatures.REDESIGN_DIALOG_LIST_ITEM;
        imFeatures.getClass();
        this.b = com.vk.toggle.b.A.a(imFeatures);
        this.c = BuildInfo.t();
        this.d = BuildInfo.s();
    }

    public final void a(TextView textView) {
        CharSequence text = textView.getText();
        Spanned spanned = text instanceof Spanned ? (Spanned) text : null;
        if (spanned == null) {
            return;
        }
        b(spanned);
    }

    public final void b(Spanned spanned) {
        int intValue;
        MsgBodySpan[] msgBodySpanArr = (MsgBodySpan[]) spanned.getSpans(0, spanned.length(), MsgBodySpan.class);
        if (msgBodySpanArr == null || msgBodySpanArr.length == 0) {
            return;
        }
        bpn0 bpn0Var = new bpn0(new ag20(this, 1));
        bpn0 bpn0Var2 = new bpn0(new xis(this, 18));
        bpn0 bpn0Var3 = new bpn0(new m1y(this, 7));
        bpn0 bpn0Var4 = new bpn0(new z3i(this, 28));
        bpn0 bpn0Var5 = new bpn0(new tju(this, 8));
        for (MsgBodySpan msgBodySpan : msgBodySpanArr) {
            int i = C1174a.$EnumSwitchMapping$0[msgBodySpan.a.ordinal()];
            if (i == 1) {
                intValue = ((Number) bpn0Var.getValue()).intValue();
            } else if (i == 2) {
                intValue = ((Number) bpn0Var2.getValue()).intValue();
            } else if (i == 3) {
                intValue = ((Number) bpn0Var3.getValue()).intValue();
            } else if (i == 4) {
                intValue = ((Number) bpn0Var4.getValue()).intValue();
            } else {
                if (i != 5) {
                    throw new NoWhenBranchMatchedException();
                }
                intValue = ((Number) bpn0Var5.getValue()).intValue();
            }
            msgBodySpan.b = intValue;
        }
    }

    public final void c(Spanned spanned) {
        Integer valueOf = (this.b && this.d) ? Integer.valueOf(R.attr.vk_ui_text_subhead) : null;
        Integer valueOf2 = valueOf != null ? Integer.valueOf(e3m.f(valueOf.intValue(), this.a)) : null;
        if (valueOf2 != null) {
            int intValue = valueOf2.intValue();
            for (Object obj : spanned.getSpans(0, spanned.length(), ohl.class)) {
                ((ohl) obj).d = Integer.valueOf(intValue);
            }
        }
    }
}
