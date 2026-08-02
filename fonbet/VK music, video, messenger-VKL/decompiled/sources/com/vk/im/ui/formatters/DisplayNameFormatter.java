package com.vk.im.ui.formatters;

import android.content.Context;
import com.vk.dto.common.ImageSizeKey;
import com.vk.dto.common.Peer;
import com.vk.im.engine.models.ProfilesInfo;
import com.vk.im.engine.models.ProfilesSimpleInfo;
import com.vk.im.engine.models.dialogs.ChatSettings;
import com.vk.im.engine.models.dialogs.Dialog;
import com.vk.im.engine.models.users.UserNameCase;
import com.vk.toggle.features.ImFeatures;
import com.vkontakte.android.R;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.PropertyReference1Impl;
import xsna.asp;
import xsna.brm0;
import xsna.e43;
import xsna.fpf0;
import xsna.p1p0;
import xsna.pr1;
import xsna.qcy;
import xsna.qtd0;
import xsna.ucp;
import xsna.wqo0;
import xsna.zrp;

/* compiled from: DisplayNameFormatter.kt */
/* loaded from: classes2.dex */
public final class DisplayNameFormatter {
    public static final /* synthetic */ qcy<Object>[] d;
    public final String a;
    public final Context b;
    public final wqo0 c;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: DisplayNameFormatter.kt */
    public static final class NameOrder {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ NameOrder[] $VALUES;
        public static final NameOrder START_WITH_FIRSTNAME;
        public static final NameOrder START_WITH_LASTNAME;

        static {
            NameOrder nameOrder = new NameOrder("START_WITH_FIRSTNAME", 0);
            START_WITH_FIRSTNAME = nameOrder;
            NameOrder nameOrder2 = new NameOrder("START_WITH_LASTNAME", 1);
            START_WITH_LASTNAME = nameOrder2;
            NameOrder[] nameOrderArr = {nameOrder, nameOrder2};
            $VALUES = nameOrderArr;
            $ENTRIES = new asp(nameOrderArr);
        }

        public NameOrder() {
            throw null;
        }

        public static NameOrder valueOf(String str) {
            return (NameOrder) Enum.valueOf(NameOrder.class, str);
        }

        public static NameOrder[] values() {
            return (NameOrder[]) $VALUES.clone();
        }
    }

    /* compiled from: DisplayNameFormatter.kt */
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[NameOrder.values().length];
            try {
                iArr[NameOrder.START_WITH_FIRSTNAME.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[NameOrder.START_WITH_LASTNAME.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    static {
        PropertyReference1Impl propertyReference1Impl = new PropertyReference1Impl(DisplayNameFormatter.class, "sb", "getSb()Ljava/lang/StringBuilder;", 0);
        fpf0.a.getClass();
        d = new qcy[]{propertyReference1Impl};
    }

    public DisplayNameFormatter() {
        this(null, 3, null);
    }

    public final String a(Peer peer, ProfilesInfo profilesInfo, NameOrder nameOrder) {
        j().setLength(0);
        StringBuilder j = j();
        UserNameCase userNameCase = UserNameCase.NOM;
        if (peer == null || profilesInfo == null) {
            j.append(this.a);
        } else {
            h(profilesInfo.Bb(peer), userNameCase, j, nameOrder);
        }
        return j().toString();
    }

    public final String b(Peer peer, ProfilesSimpleInfo profilesSimpleInfo) {
        j().setLength(0);
        f(peer, profilesSimpleInfo, j());
        return j().toString();
    }

    public final String c(Dialog dialog, ProfilesInfo profilesInfo) {
        return d(dialog, profilesInfo != null ? profilesInfo.Ob() : null);
    }

    public final String d(Dialog dialog, ProfilesSimpleInfo profilesSimpleInfo) {
        j().setLength(0);
        g(dialog, profilesSimpleInfo, j());
        return j().toString();
    }

    public final String e(qtd0 qtd0Var, UserNameCase userNameCase) {
        j().setLength(0);
        h(qtd0Var, userNameCase, j(), NameOrder.START_WITH_FIRSTNAME);
        return j().toString();
    }

    public final void f(Peer peer, ProfilesSimpleInfo profilesSimpleInfo, StringBuilder sb) {
        UserNameCase userNameCase = UserNameCase.NOM;
        if (peer == null || profilesSimpleInfo == null) {
            sb.append(this.a);
        } else {
            h(profilesSimpleInfo.zb(peer), userNameCase, sb, NameOrder.START_WITH_FIRSTNAME);
        }
    }

    public final void g(Dialog dialog, ProfilesSimpleInfo profilesSimpleInfo, StringBuilder sb) {
        String str;
        String str2 = this.a;
        if (dialog == null || profilesSimpleInfo == null) {
            sb.append(str2);
            return;
        }
        if (p1p0.a(com.vk.toggle.b.A.i(ImFeatures.SHOW_VISUAL_MESSAGE_DEBUG_INFO))) {
            sb.append(brm0.y(String.valueOf(dialog.Sb().longValue()), "200000", "²ˣ").replace('-', (char) 8315).replace(ImageSizeKey.SIZE_KEY_UNDEFINED, (char) 8304).replace('1', (char) 185).replace('2', (char) 178).replace('3', (char) 179).replace('4', (char) 8308).replace('5', (char) 8309).replace('6', (char) 8310).replace('7', (char) 8311).replace('8', (char) 8312).replace('9', (char) 8313) + ' ');
        }
        if (dialog.Jc()) {
            sb.append(this.b.getString(R.string.vkim_dialog_with_self_title));
            return;
        }
        if (!dialog.uc()) {
            f(dialog.Zb(), profilesSimpleInfo, sb);
            return;
        }
        ChatSettings Hb = dialog.Hb();
        if (Hb != null && (str = Hb.b) != null) {
            str2 = str;
        }
        sb.append(str2);
    }

    public final void h(qtd0 qtd0Var, UserNameCase userNameCase, StringBuilder sb, NameOrder nameOrder) {
        if (qtd0Var == null) {
            sb.append(this.a);
            return;
        }
        int i = a.$EnumSwitchMapping$0[nameOrder.ordinal()];
        if (i == 1) {
            sb.append(qtd0Var.Q2(userNameCase));
            return;
        }
        if (i != 2) {
            throw new NoWhenBranchMatchedException();
        }
        String d6 = qtd0Var.d6(userNameCase);
        String H5 = qtd0Var.H5(userNameCase);
        if (H5.length() > 0) {
            sb.append(H5.concat(" "));
        }
        sb.append(d6);
    }

    public final CharSequence i(qtd0 qtd0Var) {
        j().setLength(0);
        h(qtd0Var, UserNameCase.NOM, j(), NameOrder.START_WITH_FIRSTNAME);
        ucp ucpVar = ucp.a;
        return ucp.i(j());
    }

    public final StringBuilder j() {
        qcy<Object> qcyVar = d[0];
        wqo0 wqo0Var = this.c;
        wqo0Var.getClass();
        return (StringBuilder) wqo0Var.get();
    }

    public DisplayNameFormatter(Context context, int i, String str) {
        str = (i & 1) != 0 ? "…" : str;
        if ((i & 2) != 0 && (context = e43.a) == null) {
            context = null;
        }
        this.a = str;
        this.b = context;
        this.c = new wqo0(new pr1(19));
    }
}
