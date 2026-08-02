package com.vk.channelrestrictions;

import android.content.Context;
import android.os.Bundle;
import android.text.Spanned;
import androidx.compose.runtime.a;
import androidx.compose.runtime.f;
import androidx.compose.runtime.k;
import androidx.compose.ui.node.LayoutNode;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import com.unity3d.services.UnityAdsConstants;
import com.vk.channelrestrictions.WarningNotification;
import com.vk.channelrestrictions.WarningReason;
import com.vk.channelrestrictions.b;
import com.vk.common.links.LinksParserData;
import com.vk.core.compose.component.defaults.ButtonAppearance;
import com.vk.core.compose.component.defaults.ButtonSize;
import com.vk.core.compose.component.defaults.ButtonStyle;
import com.vk.core.compose.component.modal.Mode;
import com.vk.core.compose.generated.VkColorToken;
import com.vk.core.compose.generated.VkTypographyToken;
import com.vkontakte.android.R;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import kotlin.Pair;
import xsna.cri;
import xsna.dt1;
import xsna.f57;
import xsna.fdj0;
import xsna.i2v0;
import xsna.i9z;
import xsna.izs;
import xsna.kai;
import xsna.klv0;
import xsna.n1;
import xsna.nr2;
import xsna.q630;
import xsna.qjc;
import xsna.r41;
import xsna.rrv0;
import xsna.s8u0;
import xsna.saz;
import xsna.taz;
import xsna.vpi;
import xsna.wh50;
import xsna.wzs;
import xsna.xwk;
import xsna.yfb;
import xsna.z76;

/* compiled from: ContentWarningModal.kt */
/* loaded from: classes16.dex */
public final class b extends vpi {
    public static final /* synthetic */ int h1 = 0;
    public final wh50 g1 = k.b(new n1(15));

    /* compiled from: ContentWarningModal.kt */
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[WarningReason.values().length];
            try {
                iArr[WarningReason.ANTI_VACCINES.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[WarningReason.QUARANTINE_GATHERING.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[WarningReason.HIV_DENIALISM.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    @Override // xsna.vpi
    public final void Zn(int i, androidx.compose.runtime.a aVar) {
        WarningReason warningReason;
        WarningNotification warningNotification;
        s8u0 s8u0Var;
        final b bVar = this;
        androidx.compose.runtime.a M = aVar.M(-339739417);
        int i2 = (M.J(bVar) ? 4 : 2) | i;
        if (M.t(i2 & 1, (i2 & 3) != 2)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-339739417, i2, -1, "com.vk.channelrestrictions.ContentWarningModal.Content (ContentWarningModal.kt:56)");
            }
            final Context context = (Context) M.r(AndroidCompositionLocals_androidKt.b);
            Object x = M.x();
            a.C0011a.C0012a c0012a = a.C0011a.a;
            if (x == c0012a) {
                WarningReason.a aVar2 = WarningReason.Companion;
                int i3 = bVar.requireArguments().getInt("reason");
                aVar2.getClass();
                x = WarningReason.a.a(i3);
                M.R(x);
            }
            WarningReason warningReason2 = (WarningReason) x;
            Object x2 = M.x();
            if (x2 == c0012a) {
                x2 = Boolean.valueOf(bVar.requireArguments().getBoolean("allowCloseAnonym"));
                M.R(x2);
            }
            final boolean booleanValue = ((Boolean) x2).booleanValue();
            Object x3 = M.x();
            if (x3 == c0012a) {
                x3 = (WarningNotification) bVar.requireArguments().getParcelable("warningNotification");
                M.R(x3);
            }
            WarningNotification warningNotification2 = (WarningNotification) x3;
            boolean J = M.J(warningNotification2 != null ? warningNotification2.d : null);
            Object x4 = M.x();
            if (J || x4 == c0012a) {
                if (warningNotification2 != null) {
                    CharSequence d = xwk.d().a().d(warningNotification2.d, new LinksParserData(112, (Bundle) null, 0, 0, (String) null, (String) null, 0, 0, (LinksParserData.HashtagService) null, (saz) new r41(context, 20), 0, (taz) null, false, 15358));
                    klv0 klv0Var = new klv0(VkTypographyToken.ParagraphNormal, VkColorToken.TextLink);
                    s8u0 s8u0Var2 = new s8u0(0);
                    s8u0Var2.e(d.toString());
                    if (d instanceof Spanned) {
                        Spanned spanned = (Spanned) d;
                        Object[] spans = spanned.getSpans(0, spanned.length(), qjc.class);
                        int length = spans.length;
                        int i4 = 0;
                        while (i4 < length) {
                            final qjc qjcVar = (qjc) spans[i4];
                            WarningReason warningReason3 = warningReason2;
                            s8u0Var2.d(klv0Var, spanned.getSpanStart(qjcVar), spanned.getSpanEnd(qjcVar));
                            String i5 = qjcVar.i();
                            if (i5 == null) {
                                i5 = "";
                            }
                            s8u0Var2.b(new i2v0(i5, null, new i9z() { // from class: xsna.cmj
                                @Override // xsna.i9z
                                public final void a(q8z q8zVar) {
                                    ((gzs) ((zak0) com.vk.channelrestrictions.b.this.g1).getValue()).invoke();
                                    qjcVar.f(context, null);
                                }
                            }), spanned.getSpanStart(qjcVar), spanned.getSpanEnd(qjcVar));
                            i4++;
                            bVar = this;
                            warningReason2 = warningReason3;
                            warningNotification2 = warningNotification2;
                        }
                    }
                    warningReason = warningReason2;
                    warningNotification = warningNotification2;
                    s8u0Var = s8u0Var2;
                } else {
                    warningReason = warningReason2;
                    warningNotification = warningNotification2;
                    s8u0Var = null;
                }
                M.R(s8u0Var);
                x4 = s8u0Var;
            } else {
                warningReason = warningReason2;
                warningNotification = warningNotification2;
            }
            final s8u0 s8u0Var3 = (s8u0) x4;
            Object x5 = M.x();
            if (x5 == c0012a) {
                x5 = new f57(17);
                M.R(x5);
            }
            final fdj0 G = nr2.G(54, 0, M, (izs) x5);
            bVar = this;
            final WarningReason warningReason4 = warningReason;
            final WarningNotification warningNotification3 = warningNotification;
            rrv0.d(null, null, null, null, kai.c(1914857954, new wzs() { // from class: xsna.fmj
                @Override // xsna.wzs
                public final Object invoke(Object obj, Object obj2) {
                    androidx.compose.runtime.a aVar3 = (androidx.compose.runtime.a) obj;
                    int intValue = ((Integer) obj2).intValue();
                    int i6 = com.vk.channelrestrictions.b.h1;
                    int i7 = 2;
                    if (aVar3.t(intValue & 1, (intValue & 3) != 2)) {
                        if (androidx.compose.runtime.b.d()) {
                            androidx.compose.runtime.b.f(1914857954, intValue, -1, "com.vk.channelrestrictions.ContentWarningModal.Content.<anonymous> (ContentWarningModal.kt:77)");
                        }
                        Mode mode = Mode.Card;
                        q630 E = ahn.E(q630.a.a, "MODAL_CONTENT");
                        final com.vk.channelrestrictions.b bVar2 = com.vk.channelrestrictions.b.this;
                        boolean y = aVar3.y(bVar2);
                        Object x6 = aVar3.x();
                        if (y || x6 == a.C0011a.a) {
                            x6 = new m2j(bVar2, i7);
                            aVar3.R(x6);
                        }
                        gzs gzsVar = (gzs) x6;
                        final WarningReason warningReason5 = warningReason4;
                        final WarningNotification warningNotification4 = warningNotification3;
                        final s8u0 s8u0Var4 = s8u0Var3;
                        final Context context2 = context;
                        final boolean z = booleanValue;
                        a030.b(mode, gzsVar, E, G, null, 0L, 0L, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 0L, false, null, false, null, null, false, null, null, kai.c(782959936, new yzs() { // from class: xsna.dmj
                            /* JADX WARN: Type inference failed for: r10v17, types: [java.lang.Object, kotlin.Lazy] */
                            @Override // xsna.yzs
                            public final Object invoke(Object obj3, Object obj4, Object obj5) {
                                int i8;
                                lg90 a2;
                                boolean z2;
                                us2 j;
                                String string;
                                int i9;
                                String string2;
                                int i10;
                                WarningReason warningReason6 = WarningReason.this;
                                WarningNotification warningNotification5 = warningNotification4;
                                final com.vk.channelrestrictions.b bVar3 = bVar2;
                                s8u0 s8u0Var5 = s8u0Var4;
                                Context context3 = context2;
                                boolean z3 = z;
                                androidx.compose.runtime.a aVar4 = (androidx.compose.runtime.a) obj4;
                                int intValue2 = ((Integer) obj5).intValue();
                                int i11 = com.vk.channelrestrictions.b.h1;
                                Object obj6 = a.C0011a.a;
                                if (aVar4.t(intValue2 & 1, (intValue2 & 17) != 16)) {
                                    if (androidx.compose.runtime.b.d()) {
                                        androidx.compose.runtime.b.f(782959936, intValue2, -1, "com.vk.channelrestrictions.ContentWarningModal.Content.<anonymous>.<anonymous> (ContentWarningModal.kt:83)");
                                    }
                                    q630.a aVar5 = q630.a.a;
                                    float f = 16;
                                    q630 E2 = s200.E(aVar5, f, f);
                                    dt1.a.getClass();
                                    androidx.compose.foundation.layout.c a3 = androidx.compose.foundation.layout.b.a(androidx.compose.foundation.layout.a.c, dt1.a.o, aVar4, 48);
                                    int hashCode = Long.hashCode(n34.n(aVar4));
                                    sy90 D = aVar4.D();
                                    q630 c = qri.c(aVar4, E2);
                                    cri.h7.getClass();
                                    LayoutNode.a aVar6 = cri.a.b;
                                    if (aVar4.N() == null) {
                                        n34.r();
                                        throw null;
                                    }
                                    aVar4.H();
                                    if (aVar4.L()) {
                                        aVar4.I(aVar6);
                                    } else {
                                        aVar4.f();
                                    }
                                    k9q0.w(aVar4, a3, cri.a.f);
                                    k9q0.w(aVar4, D, cri.a.e);
                                    k9q0.w(aVar4, Integer.valueOf(hashCode), cri.a.g);
                                    k9q0.t(aVar4, cri.a.h);
                                    k9q0.w(aVar4, c, cri.a.d);
                                    if (warningReason6 == WarningReason.ADULT_CONTENT) {
                                        aVar4.K(-895516950);
                                        if (androidx.compose.runtime.b.d()) {
                                            i10 = 0;
                                            androidx.compose.runtime.b.f(398176796, 0, -1, "com.vk.core.compose.icons.generated.VkSdkIcons.<get-IllustrationLgbt112H> (VkSdkIcons.kt:1172)");
                                        } else {
                                            i10 = 0;
                                        }
                                        a2 = pg90.a(R.drawable.vk_icon_illustration_lgbt_112h, i10, aVar4);
                                        if (androidx.compose.runtime.b.d()) {
                                            androidx.compose.runtime.b.e();
                                        }
                                        aVar4.j();
                                        i8 = 0;
                                    } else {
                                        aVar4.K(-895515856);
                                        qzu0.a.getClass();
                                        if (androidx.compose.runtime.b.d()) {
                                            i8 = 0;
                                            androidx.compose.runtime.b.f(1086329026, 0, -1, "com.vk.core.compose.icons.generated.VkIcons.<get-IllustrationUnreliable112H> (VkIcons.kt:4052)");
                                        } else {
                                            i8 = 0;
                                        }
                                        a2 = pg90.a(R.drawable.vk_icon_illustration_unreliable_112h, i8, aVar4);
                                        if (androidx.compose.runtime.b.d()) {
                                            androidx.compose.runtime.b.e();
                                        }
                                        aVar4.j();
                                    }
                                    vjw.a(a2, null, ahn.E(aVar5, "WARNING_IMAGE"), null, null, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, null, aVar4, 440, 120);
                                    String str = warningNotification5 != null ? warningNotification5.c : null;
                                    if (str == null) {
                                        aVar4.K(-895506871);
                                        if (androidx.compose.runtime.b.d()) {
                                            androidx.compose.runtime.b.f(1763055907, 70, -1, "com.vk.channelrestrictions.ContentWarningModal.createTitle (ContentWarningModal.kt:168)");
                                        }
                                        Object x7 = aVar4.x();
                                        if (x7 == obj6) {
                                            int i12 = b.a.$EnumSwitchMapping$0[warningReason6.ordinal()];
                                            z2 = true;
                                            x7 = i12 != 1 ? i12 != 2 ? i12 != 3 ? bVar3.getString(R.string.vk_channel_warning_title_controversial_materials) : bVar3.getString(R.string.vk_channel_warning_title_fake) : bVar3.getString(R.string.vk_channel_warning_title_quarantine_gathering) : bVar3.getString(R.string.vk_channel_warning_title_fake);
                                            aVar4.R(x7);
                                        } else {
                                            z2 = true;
                                        }
                                        str = (String) x7;
                                        if (androidx.compose.runtime.b.d()) {
                                            androidx.compose.runtime.b.e();
                                        }
                                    } else {
                                        z2 = true;
                                        aVar4.K(-895507801);
                                    }
                                    aVar4.j();
                                    String str2 = str;
                                    float f2 = 8;
                                    yqv0.c(str2, ahn.E(s200.D(txj0.f(aVar5, 1.0f), f2), "TITLE_TEXT"), wlb0.h(aVar4).getText().m, null, null, 0, 3, null, 0, false, 0, 0, null, wlb0.l(aVar4).C, aVar4, 48, 0, 8120);
                                    if (s8u0Var5 == null) {
                                        aVar4.K(-1990410248);
                                        aVar4.j();
                                        j = null;
                                    } else {
                                        aVar4.K(-895490775);
                                        j = s8u0Var5.j(8, aVar4);
                                        aVar4.j();
                                    }
                                    if (j == null) {
                                        aVar4.K(-895489207);
                                        if (androidx.compose.runtime.b.d()) {
                                            androidx.compose.runtime.b.f(-1194667215, 70, -1, "com.vk.channelrestrictions.ContentWarningModal.createDescription (ContentWarningModal.kt:178)");
                                        }
                                        Object x8 = aVar4.x();
                                        if (x8 == obj6) {
                                            int i13 = b.a.$EnumSwitchMapping$0[warningReason6.ordinal()];
                                            if (i13 != 1) {
                                                i9 = 2;
                                                string2 = i13 != 2 ? i13 != 3 ? bVar3.getString(R.string.vk_channel_warning_description_controversial_materials, a0a.d) : bVar3.getString(R.string.vk_channel_warning_description_hiv_denialism, a0a.d) : bVar3.getString(R.string.vk_channel_warning_description_quarantine_gathering, a0a.d);
                                            } else {
                                                i9 = 2;
                                                string2 = bVar3.getString(R.string.vk_channel_warning_description_anti_vaccine, a0a.d);
                                            }
                                            s8u0 s8u0Var6 = new s8u0(0);
                                            Matcher matcher = ((Pattern) eaz.h.getValue()).matcher(string2);
                                            if (matcher.find()) {
                                                int start = matcher.start();
                                                String group = matcher.group(0);
                                                final String group2 = matcher.group(1);
                                                String group3 = matcher.group(i9);
                                                if (group != null && group2 != null && group3 != null) {
                                                    s8u0Var6.e(brm0.y(string2, group, group3));
                                                    s8u0Var6.d(new klv0(VkTypographyToken.SubheadNormal, VkColorToken.TextLink), start, group3.length() + start);
                                                    s8u0Var6.a(new h2v0(group2, null, new i9z() { // from class: xsna.emj
                                                        @Override // xsna.i9z
                                                        public final void a(q8z q8zVar) {
                                                            int i14 = com.vk.channelrestrictions.b.h1;
                                                            new qnl().a(com.vk.channelrestrictions.b.this.requireContext(), group2, new io.reactivex.rxjava3.disposables.b());
                                                        }
                                                    }), start, group3.length() + start);
                                                }
                                            } else {
                                                s8u0Var6.e(string2);
                                            }
                                            aVar4.R(s8u0Var6);
                                            x8 = s8u0Var6;
                                        }
                                        s8u0 s8u0Var7 = (s8u0) x8;
                                        if (androidx.compose.runtime.b.d()) {
                                            androidx.compose.runtime.b.e();
                                        }
                                        j = s8u0Var7.j(8, aVar4);
                                    } else {
                                        aVar4.K(-895491129);
                                    }
                                    aVar4.j();
                                    yqv0.d(j, ahn.E(s200.D(txj0.f(aVar5, 1.0f), f2), "DESCRIPTION_TEXT"), wlb0.h(aVar4).getText().r, 3, null, 0, false, 0, null, null, wlb0.l(aVar4).e0, aVar4, 48, 0, 8120);
                                    f9t.e(txj0.h(aVar5, 32), aVar4, 6);
                                    q630 E3 = ahn.E(txj0.f(aVar5, 1.0f), "BACK_BUTTON");
                                    String string3 = warningNotification5 != null ? warningNotification5.e : bVar3.getString(R.string.vk_channel_warning_button_back);
                                    ButtonSize buttonSize = ButtonSize.Large;
                                    ButtonStyle buttonStyle = ButtonStyle.Primary;
                                    ButtonAppearance buttonAppearance = ButtonAppearance.Accent;
                                    boolean y2 = aVar4.y(bVar3);
                                    Object x9 = aVar4.x();
                                    if (y2 || x9 == obj6) {
                                        x9 = new qzg(bVar3, 5);
                                        aVar4.R(x9);
                                    }
                                    bhu0.e((gzs) x9, buttonSize, buttonStyle, buttonAppearance, E3, null, false, false, null, null, null, string3, null, null, null, null, false, null, null, null, aVar4, 28080, 0, 0, 4190176);
                                    f9t.e(txj0.h(aVar5, 10), aVar4, 6);
                                    q630 E4 = ahn.E(txj0.f(aVar5, 1.0f), "ACCEPT_BUTTON");
                                    if (warningNotification5 == null || (string = warningNotification5.f) == null) {
                                        string = bVar3.getString(R.string.vk_channel_warning_button_accept);
                                    }
                                    String str3 = string;
                                    ButtonStyle buttonStyle2 = ButtonStyle.Secondary;
                                    boolean y3 = aVar4.y(bVar3) | aVar4.y(context3);
                                    Object x10 = aVar4.x();
                                    if (y3 || x10 == obj6) {
                                        x10 = new com.vk.movika.sdk.base.ui.n(bVar3, z3, context3);
                                        aVar4.R(x10);
                                    }
                                    bhu0.e((gzs) x10, buttonSize, buttonStyle2, buttonAppearance, E4, null, false, false, null, null, null, str3, null, null, null, null, false, null, null, null, aVar4, 28080, 0, 0, 4190176);
                                    aVar4.G();
                                    if (androidx.compose.runtime.b.d()) {
                                        androidx.compose.runtime.b.e();
                                    }
                                } else {
                                    aVar4.h();
                                }
                                return s3q0.a;
                            }
                        }, aVar3), aVar3, 390, 100663296, 262128);
                        if (androidx.compose.runtime.b.d()) {
                            androidx.compose.runtime.b.e();
                        }
                    } else {
                        aVar3.h();
                    }
                    return s3q0.a;
                }
            }, M), M, 24576, 15);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        f s = M.s();
        if (s != null) {
            s.d = new z76(bVar, i, 1);
        }
    }

    public final void co(boolean z) {
        getParentFragmentManager().k0(yfb.b(new Pair("WARNING_MODAL_RESULT_KEY", Boolean.valueOf(z))), "WARNING_MODAL_RESULT_REQUEST_KEY");
        dismiss();
    }
}
