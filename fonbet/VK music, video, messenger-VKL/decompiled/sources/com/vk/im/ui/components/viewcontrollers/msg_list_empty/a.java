package com.vk.im.ui.components.viewcontrollers.msg_list_empty;

import android.app.Activity;
import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.ImageView;
import android.widget.TextView;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.unity3d.services.UnityAdsConstants;
import com.vk.core.view.OverSizeChildLayout;
import com.vk.core.view.components.button.VkButton;
import com.vk.core.view.components.picture.c;
import com.vk.core.view.components.placeholder.main.VkPlaceholder;
import com.vk.dto.common.OccupationType;
import com.vk.dto.common.Peer;
import com.vk.dto.user.SocialButtonType;
import com.vk.dto.user.UserSex;
import com.vk.im.design.view.placeholder.ImChipPlaceholder;
import com.vk.im.design.view.placeholder.ImPlaceholder;
import com.vk.im.design.view.placeholder.a;
import com.vk.im.design.view.placeholder.b;
import com.vk.im.engine.models.ProfilesSimpleInfo;
import com.vk.im.engine.models.contacts.Contact;
import com.vk.im.engine.models.dialogs.ChatSettings;
import com.vk.im.engine.models.dialogs.Dialog;
import com.vk.im.engine.models.groups.Group;
import com.vk.im.engine.models.users.User;
import com.vk.im.ui.components.viewcontrollers.msg_list_empty.MsgListEmptyViewState;
import com.vk.im.ui.components.viewcontrollers.msg_list_empty.b;
import com.vk.im.ui.views.avatars.AvatarView;
import com.vk.im.ui.views.avatars.StackAvatarView;
import com.vk.toggle.features.ImFeatures;
import com.vkontakte.android.R;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.RandomAccess;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.collections.EmptyList;
import xsna.bpn0;
import xsna.bwt0;
import xsna.c5g;
import xsna.cn70;
import xsna.cnh;
import xsna.cr20;
import xsna.drm0;
import xsna.e3m;
import xsna.eg1;
import xsna.eko;
import xsna.enj;
import xsna.ers;
import xsna.f4m;
import xsna.fg1;
import xsna.fxj0;
import xsna.gdp;
import xsna.gko;
import xsna.itj0;
import xsna.ixj0;
import xsna.kkm;
import xsna.law;
import xsna.m33;
import xsna.maw;
import xsna.ol30;
import xsna.oq;
import xsna.qtd0;
import xsna.s0w0;
import xsna.ss3;
import xsna.tlo0;
import xsna.tq;
import xsna.u11;
import xsna.uqm0;
import xsna.x7g;
import xsna.xo8;
import xsna.xus;

/* compiled from: MsgListEmptyView.kt */
/* loaded from: classes2.dex */
public final class a {
    public ImageView A;
    public TextView B;
    public ImageView C;
    public TextView D;
    public ImageView E;
    public ImPlaceholder F;
    public Drawable G;
    public Drawable H;
    public Drawable I;
    public Drawable J;
    public final OverSizeChildLayout K;
    public gdp L;
    public SimpleDateFormat M;
    public final Handler N;
    public final ViewTreeObserverOnGlobalLayoutListenerC1171a O;
    public final ArrayList P;
    public MsgListEmptyViewState Q;
    public boolean R;
    public boolean S;
    public boolean T;
    public final boolean U;
    public final bpn0 V;
    public final Context a;
    public final ViewGroup b;
    public final kkm c;
    public final boolean d;
    public ViewGroup e;
    public ViewGroup f;
    public ImageView g;
    public TextView h;
    public TextView i;
    public AvatarView j;
    public TextView k;
    public TextView l;
    public TextView m;
    public ViewGroup n;
    public ImageView o;
    public StackAvatarView p;
    public TextView q;
    public VkButton r;
    public VkButton s;
    public ViewGroup t;
    public View u;
    public View v;
    public View w;
    public VkPlaceholder x;
    public ImChipPlaceholder y;
    public ViewGroup z;

    /* compiled from: MsgListEmptyView.kt */
    /* renamed from: com.vk.im.ui.components.viewcontrollers.msg_list_empty.a$a, reason: collision with other inner class name */
    public final class ViewTreeObserverOnGlobalLayoutListenerC1171a implements ViewTreeObserver.OnGlobalLayoutListener {
        public ViewTreeObserverOnGlobalLayoutListenerC1171a() {
        }

        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public final void onGlobalLayout() {
            a aVar = a.this;
            ViewGroup viewGroup = aVar.e;
            if (viewGroup == null) {
                viewGroup = null;
            }
            aVar.getClass();
            boolean z = false;
            for (int i = 0; i < viewGroup.getChildCount(); i++) {
                View childAt = viewGroup.getChildAt(i);
                boolean K = bwt0.K(childAt);
                int measuredWidth = childAt.getMeasuredWidth();
                int measuredHeight = childAt.getMeasuredHeight();
                if (K && (measuredWidth == 0 || measuredHeight == 0)) {
                    z = true;
                    break;
                }
            }
            aVar.c(z);
        }
    }

    /* compiled from: MsgListEmptyView.kt */
    public static final /* synthetic */ class b {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;
        public static final /* synthetic */ int[] $EnumSwitchMapping$2;
        public static final /* synthetic */ int[] $EnumSwitchMapping$3;

        static {
            int[] iArr = new int[SocialButtonType.values().length];
            try {
                iArr[SocialButtonType.ADD.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[SocialButtonType.FOLLOW.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[MsgListEmptyViewState.DrawStyle.values().length];
            try {
                iArr2[MsgListEmptyViewState.DrawStyle.NORMAL.ordinal()] = 1;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr2[MsgListEmptyViewState.DrawStyle.CONTRAST.ordinal()] = 2;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$1 = iArr2;
            int[] iArr3 = new int[UserSex.values().length];
            try {
                iArr3[UserSex.FEMALE.ordinal()] = 1;
            } catch (NoSuchFieldError unused5) {
            }
            $EnumSwitchMapping$2 = iArr3;
            int[] iArr4 = new int[MsgListEmptyViewState.ForDialog.Motivation.values().length];
            try {
                iArr4[MsgListEmptyViewState.ForDialog.Motivation.TEXT_TO_VIEW_PROFILE.ordinal()] = 1;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr4[MsgListEmptyViewState.ForDialog.Motivation.TEXT_OR_SEND_STICKER.ordinal()] = 2;
            } catch (NoSuchFieldError unused7) {
            }
            $EnumSwitchMapping$3 = iArr4;
        }
    }

    public a(Activity activity, ViewGroup viewGroup, kkm kkmVar, boolean z) {
        this.a = activity;
        this.b = viewGroup;
        this.c = kkmVar;
        this.d = z;
        this.K = viewGroup instanceof OverSizeChildLayout ? (OverSizeChildLayout) viewGroup : null;
        this.N = new Handler();
        this.O = new ViewTreeObserverOnGlobalLayoutListenerC1171a();
        this.P = new ArrayList();
        this.S = true;
        ImFeatures imFeatures = ImFeatures.IM_CHAT_EMPTY_STATES_REDESIGN;
        imFeatures.getClass();
        this.U = com.vk.toggle.b.A.a(imFeatures);
        this.V = new bpn0(new cnh(this, 21));
    }

    public static void a(TextView textView) {
        textView.setClipToOutline(true);
        textView.setOutlineProvider(new s0w0(cn70.a() * 8.0f, 6));
        textView.setBackground(xus.a(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 0, 0, 254));
    }

    public final CharSequence b(String str) {
        gdp gdpVar = this.L;
        if (gdpVar == null) {
            gdpVar = null;
        }
        gdpVar.getClass();
        return gdp.a(str);
    }

    public final void c(final boolean z) {
        ViewGroup viewGroup = this.e;
        if (viewGroup == null) {
            viewGroup = null;
        }
        if (viewGroup.isInLayout()) {
            this.N.post(new Runnable() { // from class: xsna.ml30
                @Override // java.lang.Runnable
                public final void run() {
                    com.vk.im.ui.components.viewcontrollers.msg_list_empty.a.this.c(z);
                }
            });
        } else {
            ViewGroup viewGroup2 = this.e;
            (viewGroup2 != null ? viewGroup2 : null).setVisibility(z ? 4 : 0);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:198:0x015a, code lost:
    
        if (r2 == null) goto L88;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0bec  */
    /* JADX WARN: Removed duplicated region for block: B:47:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r11v23, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r11v24 */
    /* JADX WARN: Type inference failed for: r11v29, types: [kotlin.collections.EmptyList] */
    /* JADX WARN: Type inference failed for: r36v0, types: [com.vk.im.ui.components.viewcontrollers.msg_list_empty.a, java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void d(MsgListEmptyViewState msgListEmptyViewState) {
        boolean z;
        View view;
        boolean z2;
        View view2;
        View view3;
        Drawable drawable;
        boolean z3;
        String i;
        maw mawVar;
        b.C1104b c1104b;
        Drawable drawable2;
        String format;
        String str;
        Drawable drawable3;
        String format2;
        Drawable drawable4;
        Integer num;
        Drawable drawable5;
        String str2;
        boolean z4;
        Drawable drawable6;
        String str3;
        Integer valueOf;
        maw mawVar2;
        com.vk.im.design.view.placeholder.b bVar;
        b.C1104b c1104b2;
        b.a aVar;
        boolean z5 = this.U;
        OverSizeChildLayout overSizeChildLayout = this.K;
        if (overSizeChildLayout != null) {
            overSizeChildLayout.setDisableChangingSize(z5);
        }
        boolean z6 = msgListEmptyViewState instanceof MsgListEmptyViewState.ForDialog;
        Context context = this.a;
        ViewGroup viewGroup = this.b;
        if (z6) {
            if (!z5 ? (view3 = this.f) == null : (view3 = this.F) == null) {
                view3 = null;
            }
            bwt0.p0(view3, true);
            ViewGroup viewGroup2 = this.z;
            if (viewGroup2 == null) {
                viewGroup2 = null;
            }
            bwt0.p0(viewGroup2, false);
            ViewGroup viewGroup3 = this.t;
            if (viewGroup3 == null) {
                viewGroup3 = null;
            }
            bwt0.p0(viewGroup3, false);
            viewGroup.setBackground(null);
            MsgListEmptyViewState.ForDialog forDialog = (MsgListEmptyViewState.ForDialog) msgListEmptyViewState;
            Dialog dialog = forDialog.a;
            boolean z7 = forDialog.f;
            MsgListEmptyViewState.ForDialog.Motivation motivation = forDialog.g;
            boolean z8 = forDialog.d;
            boolean z9 = forDialog.e;
            MsgListEmptyViewState.DrawStyle drawStyle = forDialog.h;
            ers ersVar = forDialog.c;
            ProfilesSimpleInfo profilesSimpleInfo = forDialog.b;
            boolean t1 = dialog.t1();
            Dialog dialog2 = forDialog.a;
            boolean E8 = dialog2.E8();
            ChatSettings Hb = dialog2.Hb();
            boolean z10 = Hb != null && Hb.g;
            boolean Jc = dialog2.Jc();
            boolean Va = dialog2.Va();
            if (Jc) {
                MsgListEmptyViewState.b bVar2 = new MsgListEmptyViewState.b(null, context.getString(R.string.vkim_msg_list_empty), null, MsgListEmptyViewState.DrawStyle.CONTRAST, 12);
                if (z5) {
                    ImPlaceholder imPlaceholder = this.F;
                    if (imPlaceholder == null) {
                        imPlaceholder = null;
                    }
                    f4m.j(imPlaceholder);
                    ImChipPlaceholder imChipPlaceholder = this.y;
                    if (imChipPlaceholder == null) {
                        imChipPlaceholder = null;
                    }
                    tlo0.Companion.getClass();
                    ImChipPlaceholder.a(imChipPlaceholder, new tlo0.h(bVar2.b));
                    ImChipPlaceholder imChipPlaceholder2 = this.y;
                    (imChipPlaceholder2 == null ? null : imChipPlaceholder2).setVisibility(0);
                } else {
                    h(bVar2);
                }
            } else {
                int i2 = R.string.vkim_msg_list_empty_friends_status_follow;
                int i3 = R.string.vkim_msg_list_empty_friends_status_following;
                if (t1) {
                    int i4 = R.string.vkim_msg_list_empty_friends_status_add;
                    if (z5) {
                        qtd0 zb = profilesSimpleInfo.zb(dialog2.Zb());
                        User user = zb instanceof User ? (User) zb : null;
                        List<Peer> list = ersVar.a;
                        Collection arrayList = new ArrayList();
                        Iterator it = list.iterator();
                        while (it.hasNext()) {
                            qtd0 Bb = ersVar.e.Bb((Peer) it.next());
                            if (Bb != null) {
                                arrayList.add(Bb);
                            }
                        }
                        SimpleDateFormat simpleDateFormat = this.M;
                        if (user == null) {
                            j(forDialog);
                        } else {
                            String str4 = user.K;
                            String str5 = user.I;
                            Integer num2 = user.M;
                            Integer num3 = user.L;
                            g(user);
                            boolean isEmpty = arrayList.isEmpty();
                            OccupationType occupationType = user.J;
                            boolean z11 = occupationType == OccupationType.WORK;
                            boolean z12 = (simpleDateFormat == null || num3 == null || num2 == null) ? false : true;
                            boolean z13 = z11;
                            boolean z14 = occupationType == OccupationType.SCHOOL || occupationType == OccupationType.UNIVERSITY;
                            boolean N = drm0.N(str5);
                            boolean z15 = !isEmpty || z12 || z13 || z14 || !N;
                            if (!isEmpty) {
                                z4 = z14;
                            } else if (z13) {
                                z4 = z14;
                                drawable6 = this.H;
                            } else {
                                z4 = z14;
                                if (!z12) {
                                }
                            }
                            drawable6 = null;
                            if (isEmpty) {
                                arrayList = EmptyList.b;
                            }
                            if (isEmpty) {
                                if (!z13) {
                                    if (z12) {
                                        str3 = simpleDateFormat.format(new Date(1900, num2.intValue() - 1, num3.intValue()));
                                    } else if (!z4) {
                                        str3 = !N ? str5 : null;
                                    }
                                }
                                str3 = str4;
                            } else {
                                str3 = enj.f(R.plurals.vkim_msg_list_empty_common_friends_count, ersVar.f, context);
                            }
                            User user2 = (User) profilesSimpleInfo.zb(dialog2.Zb());
                            int i5 = user2.z;
                            SocialButtonType socialButtonType = user2.R;
                            if (i5 == 0) {
                                int i6 = b.$EnumSwitchMapping$0[socialButtonType.ordinal()];
                                if (i6 == 1) {
                                    i2 = R.string.vkim_msg_list_empty_friends_status_add;
                                } else if (i6 != 2) {
                                    throw new NoWhenBranchMatchedException();
                                }
                                valueOf = Integer.valueOf(i2);
                            } else if (i5 == 1) {
                                int i7 = b.$EnumSwitchMapping$0[socialButtonType.ordinal()];
                                if (i7 == 1) {
                                    i3 = R.string.vkim_msg_list_empty_friends_status_sent;
                                } else if (i7 != 2) {
                                    throw new NoWhenBranchMatchedException();
                                }
                                valueOf = Integer.valueOf(i3);
                            } else if (i5 != 2) {
                                valueOf = null;
                            } else {
                                if (!z9) {
                                    i4 = R.string.vkim_msg_list_empty_friends_status_accept;
                                }
                                valueOf = Integer.valueOf(i4);
                            }
                            boolean z16 = valueOf != null && z8;
                            String string = b.$EnumSwitchMapping$2[user2.g.ordinal()] == 1 ? context.getString(R.string.vkim_msg_list_empty_motivation_user_female) : context.getString(R.string.vkim_msg_list_empty_motivation_user_male);
                            CharSequence b2 = b(user2.Db());
                            ImPlaceholder imPlaceholder2 = this.F;
                            if (imPlaceholder2 == null) {
                                imPlaceholder2 = null;
                            }
                            maw middle = imPlaceholder2.getMiddle();
                            if (middle != null) {
                                tlo0.a aVar2 = tlo0.Companion;
                                String format3 = String.format(string, Arrays.copyOf(new Object[]{b2}, 1));
                                aVar2.getClass();
                                tlo0.h hVar = new tlo0.h(format3);
                                if (!z15 || str3 == null) {
                                    bVar = null;
                                } else {
                                    if (isEmpty || arrayList.isEmpty()) {
                                        c1104b2 = null;
                                    } else {
                                        ArrayList arrayList2 = new ArrayList();
                                        Iterator it2 = arrayList.iterator();
                                        while (it2.hasNext()) {
                                            fxj0 o = ixj0.o(((qtd0) it2.next()).C8());
                                            String url = o != null ? o.getUrl() : null;
                                            if (url != null) {
                                                arrayList2.add(url);
                                            }
                                        }
                                        ArrayList arrayList3 = new ArrayList(c5g.u(arrayList2, 10));
                                        Iterator it3 = arrayList2.iterator();
                                        while (it3.hasNext()) {
                                            itj0.d((String) it3.next(), arrayList3);
                                        }
                                        c1104b2 = new b.C1104b(arrayList3, oq.d(tlo0.Companion, str3));
                                    }
                                    if (isEmpty) {
                                        aVar = new b.a(oq.d(tlo0.Companion, str3), drawable6 != null ? new b.a.C1103a(new eko(drawable6), new x7g(R.attr.vk_ui_icon_secondary)) : null);
                                    } else {
                                        aVar = null;
                                    }
                                    bVar = new com.vk.im.design.view.placeholder.b(aVar, c1104b2);
                                }
                                mawVar2 = new maw(middle.a, hVar, bVar);
                            } else {
                                mawVar2 = null;
                            }
                            imPlaceholder2.setMiddle(mawVar2);
                            a.C1102a c1102a = valueOf != null ? new a.C1102a(tq.h(tlo0.Companion, valueOf.intValue()), new fg1(16, forDialog, this), VkButton.Size.Small, null, null, 476) : null;
                            a.C1102a c1102a2 = new a.C1102a(tq.h(tlo0.Companion, R.string.vkim_msg_list_empty_open_profile), new eg1(10, forDialog, this), VkButton.Size.Small, VkButton.Mode.Tertiary, VkButton.Appearance.Accent, 284);
                            Pair pair = new Pair((!z16 || c1102a == null) ? c1102a2 : c1102a, (!z16 || c1102a == null) ? null : c1102a2);
                            imPlaceholder2.setBottom(new law(new com.vk.im.design.view.placeholder.a((a.C1102a) pair.d(), (a.C1102a) pair.g(), 4), 1));
                        }
                    } else {
                        qtd0 zb2 = profilesSimpleInfo.zb(dialog2.Zb());
                        User user3 = zb2 instanceof User ? (User) zb2 : null;
                        List<Peer> list2 = ersVar.a;
                        ArrayList arrayList4 = new ArrayList();
                        Iterator it4 = list2.iterator();
                        while (it4.hasNext()) {
                            qtd0 Bb2 = ersVar.e.Bb((Peer) it4.next());
                            if (Bb2 != null) {
                                arrayList4.add(Bb2);
                            }
                        }
                        SimpleDateFormat simpleDateFormat2 = this.M;
                        if (user3 == null) {
                            j(forDialog);
                        } else {
                            String str6 = user3.K;
                            String str7 = user3.I;
                            Integer num4 = user3.M;
                            Integer num5 = user3.L;
                            UserSex userSex = user3.g;
                            SocialButtonType socialButtonType2 = user3.R;
                            ViewGroup viewGroup4 = this.f;
                            if (viewGroup4 == null) {
                                viewGroup4 = null;
                            }
                            int i8 = b.$EnumSwitchMapping$1[drawStyle.ordinal()];
                            if (i8 == 1) {
                                drawable4 = null;
                            } else {
                                if (i8 != 2) {
                                    throw new NoWhenBranchMatchedException();
                                }
                                e3m.a aVar3 = e3m.a;
                                drawable4 = m33.a(R.drawable.bg_msg_list_empty, context);
                            }
                            viewGroup4.setBackground(drawable4);
                            int i9 = user3.z;
                            if (i9 == 0) {
                                int i10 = b.$EnumSwitchMapping$0[socialButtonType2.ordinal()];
                                if (i10 == 1) {
                                    i2 = R.string.vkim_msg_list_empty_friends_status_add;
                                } else if (i10 != 2) {
                                    throw new NoWhenBranchMatchedException();
                                }
                                num = Integer.valueOf(i2);
                            } else if (i9 == 1) {
                                int i11 = b.$EnumSwitchMapping$0[socialButtonType2.ordinal()];
                                if (i11 == 1) {
                                    i3 = R.string.vkim_msg_list_empty_friends_status_sent;
                                } else if (i11 != 2) {
                                    throw new NoWhenBranchMatchedException();
                                }
                                num = Integer.valueOf(i3);
                            } else if (i9 == 2) {
                                num = Integer.valueOf(z9 ? R.string.vkim_msg_list_empty_friends_status_add : R.string.vkim_msg_list_empty_friends_status_accept);
                            } else {
                                num = null;
                            }
                            f(user3, num != null && z8, num != null ? num.intValue() : 0);
                            String str8 = user3.d;
                            if (str8 == null || drm0.N(str8)) {
                                TextView textView = this.l;
                                if (textView == null) {
                                    textView = null;
                                }
                                bwt0.p0(textView, false);
                            } else {
                                String string2 = b.$EnumSwitchMapping$2[userSex.ordinal()] == 1 ? context.getString(R.string.vkim_msg_list_empty_name_in_contacts_female) : context.getString(R.string.vkim_msg_list_empty_name_in_contacts_male);
                                CharSequence b3 = b(user3.h8());
                                TextView textView2 = this.l;
                                if (textView2 == null) {
                                    textView2 = null;
                                }
                                bwt0.p0(textView2, true);
                                TextView textView3 = this.l;
                                if (textView3 == null) {
                                    textView3 = null;
                                }
                                textView3.setText(String.format(string2, Arrays.copyOf(new Object[]{b3}, 1)));
                            }
                            String string3 = b.$EnumSwitchMapping$2[userSex.ordinal()] == 1 ? context.getString(R.string.vkim_msg_list_empty_motivation_user_female) : context.getString(R.string.vkim_msg_list_empty_motivation_user_male);
                            CharSequence b4 = b(user3.Db());
                            TextView textView4 = this.m;
                            if (textView4 == null) {
                                textView4 = null;
                            }
                            textView4.setText(String.format(string3, Arrays.copyOf(new Object[]{b4}, 1)));
                            boolean isEmpty2 = arrayList4.isEmpty();
                            OccupationType occupationType2 = user3.J;
                            boolean z17 = occupationType2 == OccupationType.WORK;
                            boolean z18 = (simpleDateFormat2 == null || num5 == null || num4 == null) ? false : true;
                            boolean z19 = occupationType2 == OccupationType.SCHOOL || occupationType2 == OccupationType.UNIVERSITY;
                            boolean N2 = drm0.N(str7);
                            boolean z20 = !isEmpty2 || z18 || z17 || z19 || !N2;
                            if (!isEmpty2 || (!z17 ? !z18 ? !z19 ? N2 || (drawable5 = this.I) == null : (drawable5 = this.G) == null : (drawable5 = this.J) == null : (drawable5 = this.H) == null)) {
                                drawable5 = null;
                            }
                            Collection<? extends qtd0> collection = !isEmpty2 ? arrayList4 : EmptyList.b;
                            if (isEmpty2) {
                                if (!z17) {
                                    if (z18) {
                                        str2 = simpleDateFormat2.format(new Date(1900, num4.intValue() - 1, num5.intValue()));
                                    } else if (!z19) {
                                        str2 = !N2 ? str7 : null;
                                    }
                                }
                                str2 = str6;
                            } else {
                                str2 = enj.f(R.plurals.vkim_msg_list_empty_common_friends_count, ersVar.f, context);
                            }
                            if (z20) {
                                ViewGroup viewGroup5 = this.n;
                                if (viewGroup5 == null) {
                                    viewGroup5 = null;
                                }
                                bwt0.p0(viewGroup5, true);
                                ImageView imageView = this.o;
                                if (imageView == null) {
                                    imageView = null;
                                }
                                bwt0.p0(imageView, drawable5 != null);
                                ImageView imageView2 = this.o;
                                if (imageView2 == null) {
                                    imageView2 = null;
                                }
                                imageView2.setImageDrawable(drawable5);
                                StackAvatarView stackAvatarView = this.p;
                                if (stackAvatarView == null) {
                                    stackAvatarView = null;
                                }
                                Collection<? extends qtd0> collection2 = collection;
                                bwt0.p0(stackAvatarView, !collection2.isEmpty());
                                StackAvatarView stackAvatarView2 = this.p;
                                if (stackAvatarView2 == null) {
                                    stackAvatarView2 = null;
                                }
                                stackAvatarView2.f(collection2);
                                TextView textView5 = this.q;
                                if (textView5 == null) {
                                    textView5 = null;
                                }
                                bwt0.p0(textView5, str2 != null);
                                TextView textView6 = this.q;
                                if (textView6 == null) {
                                    textView6 = null;
                                }
                                textView6.setText(str2);
                            } else {
                                ViewGroup viewGroup6 = this.n;
                                if (viewGroup6 == null) {
                                    viewGroup6 = null;
                                }
                                bwt0.p0(viewGroup6, false);
                            }
                            VkButton vkButton = this.s;
                            if (vkButton == null) {
                                vkButton = null;
                            }
                            bwt0.p0(vkButton, z8);
                            VkButton vkButton2 = this.s;
                            (vkButton2 == null ? null : vkButton2).setText(R.string.vkim_msg_list_empty_open_profile);
                        }
                    }
                } else if (E8) {
                    if (z5) {
                        qtd0 zb3 = profilesSimpleInfo.zb(dialog2.Zb());
                        Contact contact = zb3 instanceof Contact ? (Contact) zb3 : null;
                        ImPlaceholder imPlaceholder3 = this.F;
                        if (imPlaceholder3 == null) {
                            imPlaceholder3 = null;
                        }
                        fxj0 o2 = ixj0.o(contact != null ? contact.h : null);
                        if (o2 == null || (str = o2.getUrl()) == null) {
                            str = "";
                        }
                        if (contact != null) {
                            com.vk.im.ui.views.avatars.b bVar3 = (com.vk.im.ui.views.avatars.b) this.V.getValue();
                            bVar3.getClass();
                            drawable3 = bVar3.e(contact.name(), contact.t8());
                        } else {
                            drawable3 = null;
                        }
                        imPlaceholder3.setTop(new ImPlaceholder.a.C1101a(new c.d(str, drawable3 != null ? new eko(drawable3) : null), cn70.b(56)));
                        tlo0.h f = u11.f(tlo0.Companion, b(contact != null ? contact.c : null));
                        int i12 = b.$EnumSwitchMapping$3[motivation.ordinal()];
                        if (i12 == 1) {
                            format2 = String.format(imPlaceholder3.getContext().getString(R.string.vkim_msg_list_empty_motivation_contact), Arrays.copyOf(new Object[]{b(contact != null ? contact.c : null)}, 1));
                        } else {
                            if (i12 != 2) {
                                throw new NoWhenBranchMatchedException();
                            }
                            UserSex userSex2 = contact != null ? UserSex.UNKNOWN : null;
                            format2 = (userSex2 != null ? b.$EnumSwitchMapping$2[userSex2.ordinal()] : -1) == 1 ? imPlaceholder3.getContext().getString(R.string.vkim_msg_list_empty_motivation_user_female) : imPlaceholder3.getContext().getString(R.string.vkim_msg_list_empty_motivation_user_male);
                        }
                        imPlaceholder3.setMiddle(new maw(f, new tlo0.h(format2), 4));
                    } else {
                        qtd0 zb4 = profilesSimpleInfo.zb(dialog2.Zb());
                        Contact contact2 = zb4 instanceof Contact ? (Contact) zb4 : null;
                        ViewGroup viewGroup7 = this.f;
                        if (viewGroup7 == null) {
                            viewGroup7 = null;
                        }
                        int i13 = b.$EnumSwitchMapping$1[drawStyle.ordinal()];
                        if (i13 == 1) {
                            drawable2 = null;
                        } else {
                            if (i13 != 2) {
                                throw new NoWhenBranchMatchedException();
                            }
                            e3m.a aVar4 = e3m.a;
                            drawable2 = m33.a(R.drawable.bg_msg_list_empty, context);
                        }
                        viewGroup7.setBackground(drawable2);
                        ImageView imageView3 = this.g;
                        if (imageView3 == null) {
                            imageView3 = null;
                        }
                        bwt0.p0(imageView3, false);
                        TextView textView7 = this.h;
                        if (textView7 == null) {
                            textView7 = null;
                        }
                        bwt0.p0(textView7, false);
                        TextView textView8 = this.i;
                        if (textView8 == null) {
                            textView8 = null;
                        }
                        bwt0.p0(textView8, false);
                        TextView textView9 = this.l;
                        if (textView9 == null) {
                            textView9 = null;
                        }
                        bwt0.p0(textView9, false);
                        ViewGroup viewGroup8 = this.n;
                        if (viewGroup8 == null) {
                            viewGroup8 = null;
                        }
                        bwt0.p0(viewGroup8, false);
                        VkButton vkButton3 = this.r;
                        if (vkButton3 == null) {
                            vkButton3 = null;
                        }
                        bwt0.p0(vkButton3, false);
                        VkButton vkButton4 = this.s;
                        if (vkButton4 == null) {
                            vkButton4 = null;
                        }
                        bwt0.p0(vkButton4, false);
                        AvatarView avatarView = this.j;
                        if (avatarView == null) {
                            avatarView = null;
                        }
                        bwt0.p0(avatarView, true);
                        AvatarView avatarView2 = this.j;
                        if (avatarView2 == null) {
                            avatarView2 = null;
                        }
                        avatarView2.Y0(contact2);
                        TextView textView10 = this.k;
                        if (textView10 == null) {
                            textView10 = null;
                        }
                        bwt0.p0(textView10, true);
                        TextView textView11 = this.k;
                        if (textView11 == null) {
                            textView11 = null;
                        }
                        textView11.setText(b(contact2 != null ? contact2.c : null));
                        TextView textView12 = this.m;
                        if (textView12 == null) {
                            textView12 = null;
                        }
                        bwt0.p0(textView12, true);
                        TextView textView13 = this.m;
                        if (textView13 == null) {
                            textView13 = null;
                        }
                        int i14 = b.$EnumSwitchMapping$3[motivation.ordinal()];
                        if (i14 == 1) {
                            format = String.format(context.getString(R.string.vkim_msg_list_empty_motivation_contact), Arrays.copyOf(new Object[]{b(contact2 != null ? contact2.c : null)}, 1));
                        } else {
                            if (i14 != 2) {
                                throw new NoWhenBranchMatchedException();
                            }
                            UserSex userSex3 = contact2 != null ? UserSex.UNKNOWN : null;
                            format = (userSex3 != null ? b.$EnumSwitchMapping$2[userSex3.ordinal()] : -1) == 1 ? context.getString(R.string.vkim_msg_list_empty_motivation_user_female) : context.getString(R.string.vkim_msg_list_empty_motivation_user_male);
                        }
                        textView13.setText(format);
                    }
                } else if (z10) {
                    MsgListEmptyViewState.b bVar4 = new MsgListEmptyViewState.b(enj.d(R.drawable.vk_icon_ghost_outline_56, R.color.vk_steel_gray_300, context), null, context.getString(R.string.vkim_casper_chat_empty_description), forDialog.h, 8);
                    if (z5) {
                        i(bVar4);
                    } else {
                        h(bVar4);
                    }
                } else if (!Va) {
                    j(forDialog);
                } else if (z5) {
                    qtd0 zb5 = profilesSimpleInfo.zb(dialog2.Zb());
                    Group group = zb5 instanceof Group ? (Group) zb5 : null;
                    if (!z7 || group == null) {
                        j(forDialog);
                    } else {
                        List<Peer> list3 = ersVar.a;
                        ArrayList arrayList5 = new ArrayList();
                        Iterator it5 = list3.iterator();
                        while (it5.hasNext()) {
                            qtd0 Bb3 = ersVar.e.Bb((Peer) it5.next());
                            if (Bb3 != null) {
                                arrayList5.add(Bb3);
                            }
                        }
                        boolean isEmpty3 = arrayList5.isEmpty();
                        RandomAccess randomAccess = arrayList5;
                        if (isEmpty3) {
                            randomAccess = EmptyList.b;
                        }
                        String f2 = !isEmpty3 ? enj.f(R.plurals.vkim_msg_list_empty_community_friends_count, ersVar.f, context) : uqm0.i(group.m, R.plurals.community_subscribers, R.string.community_subscribers_formatted, true);
                        g(group);
                        int i15 = group.Cb() ? R.string.vkim_msg_list_empty_friends_status_following : R.string.vkim_msg_list_empty_friends_status_follow;
                        boolean z21 = !group.Cb() || this.T;
                        ImPlaceholder imPlaceholder4 = this.F;
                        if (imPlaceholder4 == null) {
                            imPlaceholder4 = null;
                        }
                        maw middle2 = imPlaceholder4.getMiddle();
                        if (middle2 != null) {
                            tlo0.f h = tq.h(tlo0.Companion, R.string.vkim_msg_list_empty_motivation_community);
                            if (((Collection) randomAccess).isEmpty()) {
                                c1104b = null;
                            } else {
                                ArrayList arrayList6 = new ArrayList();
                                Iterator it6 = ((Iterable) randomAccess).iterator();
                                while (it6.hasNext()) {
                                    fxj0 o3 = ixj0.o(((qtd0) it6.next()).C8());
                                    String url2 = o3 != null ? o3.getUrl() : null;
                                    if (url2 != null) {
                                        arrayList6.add(url2);
                                    }
                                }
                                ArrayList arrayList7 = new ArrayList(c5g.u(arrayList6, 10));
                                Iterator it7 = arrayList6.iterator();
                                while (it7.hasNext()) {
                                    itj0.d((String) it7.next(), arrayList7);
                                }
                                c1104b = new b.C1104b(arrayList7, oq.d(tlo0.Companion, f2));
                            }
                            mawVar = new maw(middle2.a, h, new com.vk.im.design.view.placeholder.b(null, c1104b));
                        } else {
                            mawVar = null;
                        }
                        imPlaceholder4.setMiddle(mawVar);
                        tlo0.f h2 = tq.h(tlo0.Companion, i15);
                        xo8 xo8Var = new xo8(imPlaceholder4, group, this, 4);
                        VkButton.Size size = VkButton.Size.Small;
                        a.C1102a c1102a3 = new a.C1102a(h2, xo8Var, size, null, null, 476);
                        a.C1102a c1102a4 = new a.C1102a(new tlo0.f(R.string.vkim_msg_list_empty_open_community), new ss3(13, forDialog, this), size, VkButton.Mode.Tertiary, VkButton.Appearance.Accent, 284);
                        imPlaceholder4.setBottom(new law(new com.vk.im.design.view.placeholder.a(z21 ? c1102a3 : c1102a4, z21 ? c1102a4 : null, 4), 1));
                    }
                } else {
                    qtd0 zb6 = profilesSimpleInfo.zb(dialog2.Zb());
                    Group group2 = zb6 instanceof Group ? (Group) zb6 : null;
                    if (!z7 || group2 == null) {
                        j(forDialog);
                    } else {
                        List<Peer> list4 = ersVar.a;
                        ArrayList arrayList8 = new ArrayList();
                        Iterator it8 = list4.iterator();
                        while (it8.hasNext()) {
                            qtd0 Bb4 = ersVar.e.Bb((Peer) it8.next());
                            if (Bb4 != null) {
                                arrayList8.add(Bb4);
                            }
                        }
                        ViewGroup viewGroup9 = this.f;
                        if (viewGroup9 == null) {
                            viewGroup9 = null;
                        }
                        int i16 = b.$EnumSwitchMapping$1[drawStyle.ordinal()];
                        if (i16 == 1) {
                            drawable = null;
                        } else {
                            if (i16 != 2) {
                                throw new NoWhenBranchMatchedException();
                            }
                            e3m.a aVar5 = e3m.a;
                            drawable = m33.a(R.drawable.bg_msg_list_empty, context);
                        }
                        viewGroup9.setBackground(drawable);
                        f(group2, !group2.Cb() || this.T, group2.Cb() ? R.string.vkim_msg_list_empty_friends_status_following : R.string.vkim_msg_list_empty_friends_status_follow);
                        TextView textView14 = this.l;
                        if (textView14 == null) {
                            textView14 = null;
                        }
                        bwt0.p0(textView14, false);
                        TextView textView15 = this.m;
                        if (textView15 == null) {
                            textView15 = null;
                        }
                        textView15.setText(context.getString(R.string.vkim_msg_list_empty_motivation_community));
                        boolean isEmpty4 = arrayList8.isEmpty();
                        RandomAccess randomAccess2 = arrayList8;
                        if (isEmpty4) {
                            randomAccess2 = EmptyList.b;
                        }
                        if (isEmpty4) {
                            z3 = true;
                            i = uqm0.i(group2.m, R.plurals.community_subscribers, R.string.community_subscribers_formatted, true);
                        } else {
                            i = enj.f(R.plurals.vkim_msg_list_empty_community_friends_count, ersVar.f, context);
                            z3 = true;
                        }
                        ViewGroup viewGroup10 = this.n;
                        if (viewGroup10 == null) {
                            viewGroup10 = null;
                        }
                        bwt0.p0(viewGroup10, z3);
                        ImageView imageView4 = this.o;
                        if (imageView4 == null) {
                            imageView4 = null;
                        }
                        bwt0.p0(imageView4, false);
                        StackAvatarView stackAvatarView3 = this.p;
                        if (stackAvatarView3 == null) {
                            stackAvatarView3 = null;
                        }
                        ArrayList arrayList9 = (Collection) randomAccess2;
                        bwt0.p0(stackAvatarView3, !arrayList9.isEmpty());
                        StackAvatarView stackAvatarView4 = this.p;
                        if (stackAvatarView4 == null) {
                            stackAvatarView4 = null;
                        }
                        stackAvatarView4.f(arrayList9);
                        TextView textView16 = this.q;
                        if (textView16 == null) {
                            textView16 = null;
                        }
                        bwt0.p0(textView16, true);
                        TextView textView17 = this.q;
                        if (textView17 == null) {
                            textView17 = null;
                        }
                        textView17.setText(i);
                        VkButton vkButton5 = this.s;
                        if (vkButton5 == null) {
                            vkButton5 = null;
                        }
                        bwt0.p0(vkButton5, true);
                        VkButton vkButton6 = this.s;
                        (vkButton6 == null ? null : vkButton6).setText(R.string.vkim_msg_list_empty_open_community);
                    }
                }
            }
        } else if (msgListEmptyViewState instanceof MsgListEmptyViewState.b) {
            ViewGroup viewGroup11 = this.z;
            if (viewGroup11 == null) {
                viewGroup11 = null;
            }
            bwt0.p0(viewGroup11, false);
            ViewGroup viewGroup12 = this.t;
            if (viewGroup12 == null) {
                viewGroup12 = null;
            }
            bwt0.p0(viewGroup12, false);
            viewGroup.setBackground(null);
            MsgListEmptyViewState.b bVar5 = (MsgListEmptyViewState.b) msgListEmptyViewState;
            if (z5) {
                CharSequence charSequence = bVar5.b;
                if (charSequence != null && bVar5.c == null && bVar5.a == null) {
                    ImChipPlaceholder imChipPlaceholder3 = this.y;
                    if (imChipPlaceholder3 == null) {
                        imChipPlaceholder3 = null;
                    }
                    tlo0.Companion.getClass();
                    ImChipPlaceholder.a(imChipPlaceholder3, new tlo0.h(charSequence));
                    ImChipPlaceholder imChipPlaceholder4 = this.y;
                    (imChipPlaceholder4 == null ? null : imChipPlaceholder4).setVisibility(0);
                } else {
                    ImPlaceholder imPlaceholder5 = this.F;
                    (imPlaceholder5 == null ? null : imPlaceholder5).setVisibility(0);
                    i(bVar5);
                }
            } else {
                ViewGroup viewGroup13 = this.f;
                (viewGroup13 == null ? null : viewGroup13).setVisibility(0);
                h(bVar5);
            }
        } else if (msgListEmptyViewState instanceof MsgListEmptyViewState.c) {
            if (!z5 ? (view2 = this.f) == null : (view2 = this.F) == null) {
                view2 = null;
            }
            bwt0.p0(view2, true);
            ViewGroup viewGroup14 = this.z;
            if (viewGroup14 == null) {
                viewGroup14 = null;
            }
            bwt0.p0(viewGroup14, false);
            ViewGroup viewGroup15 = this.t;
            if (viewGroup15 == null) {
                viewGroup15 = null;
            }
            bwt0.p0(viewGroup15, false);
            viewGroup.setBackground(null);
            if (z5) {
                ImPlaceholder imPlaceholder6 = this.F;
                if (imPlaceholder6 == null) {
                    imPlaceholder6 = null;
                }
                imPlaceholder6.setTop(new ImPlaceholder.a.b(new gko(R.drawable.vk_icon_illustration_three_people_64h)));
                imPlaceholder6.setMiddle(new maw((tlo0.h) null, tq.h(tlo0.Companion, R.string.vkim_edu_empty_chat_text), 5));
                imPlaceholder6.setBottom(new law(new com.vk.im.design.view.placeholder.a(new a.C1102a(new tlo0.f(R.string.vkim_edu_empty_chat_button), new cr20(this, 2), null, null, null, IronSourceError.ERROR_CODE_INIT_FAILED), null, 6), 1));
            } else {
                k((MsgListEmptyViewState.c) msgListEmptyViewState);
            }
        } else if (msgListEmptyViewState instanceof MsgListEmptyViewState.a) {
            if (!z5 ? (view = this.f) == null : (view = this.F) == null) {
                z2 = false;
            } else {
                z2 = false;
                view = null;
            }
            bwt0.p0(view, z2);
            ViewGroup viewGroup16 = this.z;
            if (viewGroup16 == null) {
                viewGroup16 = null;
            }
            bwt0.p0(viewGroup16, true);
            ViewGroup viewGroup17 = this.t;
            bwt0.p0(viewGroup17 == null ? null : viewGroup17, z2);
            viewGroup.setBackground(new ColorDrawable(e3m.f(R.attr.vk_ui_background_content, context)));
        } else {
            if (!(msgListEmptyViewState instanceof MsgListEmptyViewState.d)) {
                if (!(msgListEmptyViewState instanceof MsgListEmptyViewState.e)) {
                    throw new NoWhenBranchMatchedException();
                }
                ViewGroup viewGroup18 = this.z;
                if (viewGroup18 == null) {
                    viewGroup18 = null;
                }
                bwt0.p0(viewGroup18, false);
                ViewGroup viewGroup19 = this.t;
                if (viewGroup19 == null) {
                    viewGroup19 = null;
                }
                bwt0.p0(viewGroup19, false);
                if (z5) {
                    ImPlaceholder imPlaceholder7 = this.F;
                    if (imPlaceholder7 == null) {
                        imPlaceholder7 = null;
                    }
                    bwt0.p0(imPlaceholder7, false);
                } else {
                    h(new MsgListEmptyViewState.b(null, null, null, null, 31));
                }
                viewGroup.setBackground(null);
                if (z5) {
                    ImChipPlaceholder imChipPlaceholder5 = this.y;
                    if (imChipPlaceholder5 == null) {
                        imChipPlaceholder5 = null;
                    }
                    tlo0.Companion.getClass();
                    ImChipPlaceholder.a(imChipPlaceholder5, new tlo0.f(R.string.vkm_empty_channel_postponed_posts));
                    ImChipPlaceholder imChipPlaceholder6 = this.y;
                    z = false;
                    (imChipPlaceholder6 == null ? null : imChipPlaceholder6).setVisibility(0);
                } else {
                    z = false;
                }
                if (this.R) {
                    return;
                }
                this.R = z;
                if ((msgListEmptyViewState instanceof MsgListEmptyViewState.d) && ((MsgListEmptyViewState.d) msgListEmptyViewState).c) {
                    e(b.e.a);
                    return;
                }
                return;
            }
            l((MsgListEmptyViewState.d) msgListEmptyViewState);
        }
        z = false;
        if (this.R) {
        }
    }

    public final void e(com.vk.im.ui.components.viewcontrollers.msg_list_empty.b bVar) {
        if (this.S) {
            Iterator it = this.P.iterator();
            while (it.hasNext()) {
                ((ol30) it.next()).a(bVar);
            }
        }
    }

    public final void f(qtd0 qtd0Var, boolean z, int i) {
        ImageView imageView = this.g;
        if (imageView == null) {
            imageView = null;
        }
        bwt0.p0(imageView, false);
        TextView textView = this.h;
        if (textView == null) {
            textView = null;
        }
        bwt0.p0(textView, false);
        TextView textView2 = this.i;
        if (textView2 == null) {
            textView2 = null;
        }
        bwt0.p0(textView2, false);
        AvatarView avatarView = this.j;
        if (avatarView == null) {
            avatarView = null;
        }
        bwt0.p0(avatarView, true);
        TextView textView3 = this.k;
        if (textView3 == null) {
            textView3 = null;
        }
        bwt0.p0(textView3, true);
        TextView textView4 = this.m;
        if (textView4 == null) {
            textView4 = null;
        }
        bwt0.p0(textView4, true);
        AvatarView avatarView2 = this.j;
        if (avatarView2 == null) {
            avatarView2 = null;
        }
        avatarView2.Y0(qtd0Var);
        TextView textView5 = this.k;
        if (textView5 == null) {
            textView5 = null;
        }
        textView5.setText(b(qtd0Var.B3()));
        if (!z) {
            VkButton vkButton = this.r;
            bwt0.p0(vkButton != null ? vkButton : null, false);
            return;
        }
        VkButton vkButton2 = this.r;
        if (vkButton2 == null) {
            vkButton2 = null;
        }
        bwt0.p0(vkButton2, true);
        VkButton vkButton3 = this.r;
        (vkButton3 != null ? vkButton3 : null).setText(i);
    }

    public final void g(qtd0 qtd0Var) {
        String str;
        ImPlaceholder imPlaceholder = this.F;
        if (imPlaceholder == null) {
            imPlaceholder = null;
        }
        fxj0 o = ixj0.o(qtd0Var.C8());
        if (o == null || (str = o.getUrl()) == null) {
            str = "";
        }
        com.vk.im.ui.views.avatars.b bVar = (com.vk.im.ui.views.avatars.b) this.V.getValue();
        bVar.getClass();
        Drawable e = bVar.e(qtd0Var.name(), qtd0Var.t8());
        imPlaceholder.setTop(new ImPlaceholder.a.C1101a(new c.d(str, e != null ? new eko(e) : null), cn70.b(56)));
        tlo0.a aVar = tlo0.Companion;
        CharSequence b2 = b(qtd0Var.B3());
        aVar.getClass();
        imPlaceholder.setMiddle(new maw(new tlo0.h(b2), (tlo0) null, 6));
    }

    public final void h(MsgListEmptyViewState.b bVar) {
        int f;
        Drawable drawable;
        int f2;
        Drawable drawable2;
        AvatarView avatarView = this.j;
        if (avatarView == null) {
            avatarView = null;
        }
        bwt0.p0(avatarView, false);
        TextView textView = this.k;
        if (textView == null) {
            textView = null;
        }
        bwt0.p0(textView, false);
        TextView textView2 = this.l;
        if (textView2 == null) {
            textView2 = null;
        }
        bwt0.p0(textView2, false);
        TextView textView3 = this.m;
        if (textView3 == null) {
            textView3 = null;
        }
        bwt0.p0(textView3, false);
        ViewGroup viewGroup = this.n;
        if (viewGroup == null) {
            viewGroup = null;
        }
        bwt0.p0(viewGroup, false);
        VkButton vkButton = this.r;
        if (vkButton == null) {
            vkButton = null;
        }
        bwt0.p0(vkButton, false);
        VkButton vkButton2 = this.s;
        if (vkButton2 == null) {
            vkButton2 = null;
        }
        bwt0.p0(vkButton2, false);
        ImageView imageView = this.g;
        if (imageView == null) {
            imageView = null;
        }
        Drawable drawable3 = bVar.a;
        CharSequence charSequence = bVar.c;
        CharSequence charSequence2 = bVar.b;
        MsgListEmptyViewState.DrawStyle drawStyle = bVar.d;
        bwt0.p0(imageView, drawable3 != null);
        ImageView imageView2 = this.g;
        if (imageView2 == null) {
            imageView2 = null;
        }
        imageView2.setImageDrawable(bVar.a);
        TextView textView4 = this.h;
        if (textView4 == null) {
            textView4 = null;
        }
        bwt0.p0(textView4, !(charSequence2 == null || drm0.N(charSequence2)));
        TextView textView5 = this.h;
        if (textView5 == null) {
            textView5 = null;
        }
        textView5.setText(charSequence2);
        TextView textView6 = this.h;
        if (textView6 == null) {
            textView6 = null;
        }
        int[] iArr = b.$EnumSwitchMapping$1;
        int i = iArr[drawStyle.ordinal()];
        Context context = this.a;
        if (i == 1) {
            f = e3m.f(R.attr.vk_ui_text_primary, context);
        } else {
            if (i != 2) {
                throw new NoWhenBranchMatchedException();
            }
            f = e3m.f(R.attr.vk_ui_text_contrast, context);
        }
        textView6.setTextColor(f);
        TextView textView7 = this.h;
        if (textView7 == null) {
            textView7 = null;
        }
        int i2 = iArr[drawStyle.ordinal()];
        if (i2 == 1) {
            drawable = null;
        } else {
            if (i2 != 2) {
                throw new NoWhenBranchMatchedException();
            }
            drawable = m33.a(R.drawable.bg_im_system_msg, context);
        }
        textView7.setBackground(drawable);
        TextView textView8 = this.i;
        if (textView8 == null) {
            textView8 = null;
        }
        bwt0.p0(textView8, !(charSequence == null || drm0.N(charSequence)));
        TextView textView9 = this.i;
        if (textView9 == null) {
            textView9 = null;
        }
        textView9.setText(charSequence);
        TextView textView10 = this.i;
        if (textView10 == null) {
            textView10 = null;
        }
        int i3 = iArr[drawStyle.ordinal()];
        if (i3 == 1) {
            f2 = e3m.f(R.attr.vk_ui_text_secondary, context);
        } else {
            if (i3 != 2) {
                throw new NoWhenBranchMatchedException();
            }
            f2 = e3m.f(R.attr.vk_ui_text_contrast, context);
        }
        textView10.setTextColor(f2);
        TextView textView11 = this.i;
        if (textView11 == null) {
            textView11 = null;
        }
        int i4 = iArr[drawStyle.ordinal()];
        if (i4 == 1) {
            drawable2 = null;
        } else {
            if (i4 != 2) {
                throw new NoWhenBranchMatchedException();
            }
            drawable2 = m33.a(R.drawable.bg_im_system_msg, context);
        }
        textView11.setBackground(drawable2);
        VkButton vkButton3 = this.r;
        if (vkButton3 == null) {
            vkButton3 = null;
        }
        bwt0.p0(vkButton3, false);
        VkButton vkButton4 = this.r;
        if (vkButton4 == null) {
            vkButton4 = null;
        }
        vkButton4.setText((CharSequence) null);
    }

    public final void i(MsgListEmptyViewState.b bVar) {
        ImPlaceholder imPlaceholder = this.F;
        if (imPlaceholder == null) {
            imPlaceholder = null;
        }
        Drawable drawable = bVar.a;
        CharSequence charSequence = bVar.c;
        CharSequence charSequence2 = bVar.b;
        imPlaceholder.setTop(drawable != null ? new ImPlaceholder.a.b(new eko(drawable)) : null);
        imPlaceholder.setMiddle(new maw((charSequence2 == null || drm0.N(charSequence2)) ? null : u11.f(tlo0.Companion, charSequence2), (charSequence == null || drm0.N(charSequence)) ? null : u11.f(tlo0.Companion, charSequence), 4));
        imPlaceholder.setBottom((law) null);
    }

    public final void j(MsgListEmptyViewState.ForDialog forDialog) {
        Context context = this.a;
        MsgListEmptyViewState.b bVar = new MsgListEmptyViewState.b(null, context.getString(R.string.vkim_msg_list_empty), context.getString(R.string.vkim_msg_list_empty_subtitle), forDialog.h, 8);
        if (this.U) {
            i(bVar);
        } else {
            h(bVar);
        }
    }

    public final void k(MsgListEmptyViewState.c cVar) {
        int i;
        AvatarView avatarView = this.j;
        if (avatarView == null) {
            avatarView = null;
        }
        bwt0.p0(avatarView, false);
        TextView textView = this.k;
        if (textView == null) {
            textView = null;
        }
        bwt0.p0(textView, false);
        TextView textView2 = this.l;
        if (textView2 == null) {
            textView2 = null;
        }
        bwt0.p0(textView2, false);
        TextView textView3 = this.m;
        if (textView3 == null) {
            textView3 = null;
        }
        bwt0.p0(textView3, false);
        ViewGroup viewGroup = this.n;
        if (viewGroup == null) {
            viewGroup = null;
        }
        bwt0.p0(viewGroup, false);
        VkButton vkButton = this.r;
        if (vkButton == null) {
            vkButton = null;
        }
        bwt0.p0(vkButton, false);
        VkButton vkButton2 = this.s;
        if (vkButton2 == null) {
            vkButton2 = null;
        }
        bwt0.p0(vkButton2, false);
        ImageView imageView = this.g;
        if (imageView == null) {
            imageView = null;
        }
        bwt0.p0(imageView, true);
        ImageView imageView2 = this.g;
        if (imageView2 == null) {
            imageView2 = null;
        }
        imageView2.setImageResource(R.drawable.vk_icon_illustration_three_people_64h);
        ViewGroup viewGroup2 = this.e;
        if (viewGroup2 == null) {
            viewGroup2 = null;
        }
        int i2 = b.$EnumSwitchMapping$1[cVar.a.ordinal()];
        if (i2 == 1) {
            i = 0;
        } else {
            if (i2 != 2) {
                throw new NoWhenBranchMatchedException();
            }
            i = R.drawable.bg_stroked_white_r20;
        }
        viewGroup2.setBackgroundResource(i);
        TextView textView4 = this.h;
        if (textView4 == null) {
            textView4 = null;
        }
        bwt0.p0(textView4, false);
        TextView textView5 = this.i;
        if (textView5 == null) {
            textView5 = null;
        }
        bwt0.p0(textView5, true);
        TextView textView6 = this.i;
        if (textView6 == null) {
            textView6 = null;
        }
        textView6.setText(R.string.vkim_edu_empty_chat_text);
        TextView textView7 = this.i;
        if (textView7 == null) {
            textView7 = null;
        }
        textView7.setTextColor(e3m.f(R.attr.vk_ui_text_secondary, this.a));
        TextView textView8 = this.i;
        if (textView8 == null) {
            textView8 = null;
        }
        textView8.setBackground(null);
        VkButton vkButton3 = this.r;
        if (vkButton3 == null) {
            vkButton3 = null;
        }
        bwt0.p0(vkButton3, true);
        VkButton vkButton4 = this.r;
        (vkButton4 != null ? vkButton4 : null).setText(R.string.vkim_edu_empty_chat_button);
    }

    public final void l(MsgListEmptyViewState.d dVar) {
        ViewGroup viewGroup = this.f;
        if (viewGroup == null) {
            viewGroup = null;
        }
        bwt0.p0(viewGroup, false);
        ViewGroup viewGroup2 = this.z;
        if (viewGroup2 == null) {
            viewGroup2 = null;
        }
        bwt0.p0(viewGroup2, false);
        ViewGroup viewGroup3 = this.t;
        if (viewGroup3 == null) {
            viewGroup3 = null;
        }
        bwt0.p0(viewGroup3, true);
        View view = this.u;
        if (view == null) {
            view = null;
        }
        boolean z = dVar.a;
        boolean z2 = dVar.b;
        boolean z3 = dVar.c;
        bwt0.p0(view, z);
        View view2 = this.v;
        if (view2 == null) {
            view2 = null;
        }
        bwt0.p0(view2, z3);
        View view3 = this.w;
        if (view3 == null) {
            view3 = null;
        }
        bwt0.p0(view3, z2);
        VkPlaceholder vkPlaceholder = this.x;
        if (vkPlaceholder == null) {
            vkPlaceholder = null;
        }
        ViewGroup.LayoutParams layoutParams = vkPlaceholder.getLayoutParams();
        if (layoutParams == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        marginLayoutParams.bottomMargin = cn70.b((dVar.a || z3 || z2) ? 16 : 12);
        vkPlaceholder.setLayoutParams(marginLayoutParams);
        this.b.setBackground(null);
        OverSizeChildLayout overSizeChildLayout = this.K;
        if (overSizeChildLayout != null) {
            overSizeChildLayout.setDisableChangingSize(true);
        }
    }
}
