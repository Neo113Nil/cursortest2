package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.text.SpannableString;
import android.text.format.DateFormat;
import android.text.method.LinkMovementMethod;
import android.text.style.ForegroundColorSpan;
import android.text.util.Linkify;
import android.util.Patterns;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.android.material.card.MaterialCardView;
import com.google.android.material.imageview.ShapeableImageView;
import com.google.android.material.progressindicator.CircularProgressIndicator;
import com.sofascore.model.chat.ChatImage;
import com.sofascore.model.chat.ChatUser;
import com.sofascore.model.chat.Message;
import com.sofascore.model.profile.UserBadge;
import com.sofascore.results.R;
import com.unity3d.services.UnityAdsConstants;
import java.time.Instant;
import java.util.Locale;
import java.util.Set;
import java.util.regex.Matcher;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.CharsKt;
import kotlin.text.StringsKt;
import kotlin.text.c;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class nr2 extends d2 implements View.OnClickListener {
    public final boolean g;
    public final r0d h;
    public final r0d i;
    public final r0d j;
    public final Function0 k;
    public final ct8 l;
    public final Function2 m;
    public final float n;
    public final zl o;

    public nr2(ConstraintLayout constraintLayout, boolean z, r0d r0dVar, r0d r0dVar2, r0d r0dVar3, Function0 function0, ct8 ct8Var, faa faaVar) {
        super(constraintLayout);
        this.g = z;
        this.h = r0dVar;
        this.i = r0dVar2;
        this.j = r0dVar3;
        this.k = function0;
        this.l = ct8Var;
        this.m = faaVar;
        this.n = ao2.s(16, this.b);
        this.o = zl.b(constraintLayout);
    }

    /* JADX WARN: Code restructure failed: missing block: B:61:0x02e4, code lost:
    
        if (kotlin.jvm.internal.Intrinsics.c(r0.d().getText(), r8) == false) goto L86;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0647  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0650  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0654  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x064b  */
    /* JADX WARN: Type inference failed for: r18v1, types: [hz8] */
    /* JADX WARN: Type inference failed for: r3v6, types: [hz8] */
    @Override // defpackage.p8
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void b(int i, int i2, Object obj) {
        boolean z;
        p7g n;
        dd ddVar;
        q0 q0Var;
        p7g p7gVar;
        q0 q0Var2;
        Object valueOf;
        int i3;
        final nr2 nr2Var;
        String str;
        Context context;
        final SpannableString spannableString;
        int i4;
        int i5;
        Set set;
        Message parent;
        TextView textView;
        TextView textView2;
        FrameLayout frameLayout;
        String thumbnail;
        Message message = (Message) obj;
        message.getClass();
        this.d = message;
        zl zlVar = this.o;
        MaterialCardView materialCardView = (MaterialCardView) zlVar.d;
        e92 e92Var = (e92) zlVar.l;
        ShapeableImageView shapeableImageView = (ShapeableImageView) e92Var.d;
        TextView textView3 = (TextView) e92Var.f;
        TextView textView4 = (TextView) e92Var.e;
        FrameLayout frameLayout2 = (FrameLayout) e92Var.b;
        dd ddVar2 = (dd) zlVar.h;
        ShapeableImageView shapeableImageView2 = (ShapeableImageView) ddVar2.c;
        ImageView imageView = (ImageView) ddVar2.d;
        p7g p7gVar2 = new p7g();
        p7g p7gVar3 = new p7g();
        q0 q0Var3 = new q0(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        q0 q0Var4 = new q0(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        ug5 ug5Var = new ug5();
        ug5 ug5Var2 = new ug5();
        ug5 ug5Var3 = new ug5();
        ug5 ug5Var4 = new ug5();
        hz8 n2 = l4a.n(0);
        float f = this.n;
        q0 q0Var5 = new q0(f);
        hz8 n3 = l4a.n(0);
        q0 q0Var6 = new q0(f);
        Context context2 = this.b;
        boolean c0 = hkg.c0(context2);
        boolean z2 = this.g;
        if (c0 ? z2 : !z2) {
            ?? n4 = l4a.n(0);
            z = z2;
            q0Var2 = new q0(f);
            p7gVar = n4;
            n = p7gVar2;
            ddVar = ddVar2;
            q0Var = q0Var3;
        } else {
            z = z2;
            n = l4a.n(0);
            ddVar = ddVar2;
            q0Var = new q0(f);
            p7gVar = p7gVar3;
            q0Var2 = q0Var4;
        }
        xah xahVar = new xah();
        xahVar.a = n;
        xahVar.b = p7gVar;
        xahVar.c = n3;
        xahVar.d = n2;
        xahVar.e = q0Var;
        xahVar.f = q0Var2;
        xahVar.g = q0Var6;
        xahVar.h = q0Var5;
        xahVar.i = ug5Var;
        xahVar.j = ug5Var2;
        xahVar.k = ug5Var3;
        xahVar.l = ug5Var4;
        materialCardView.setShapeAppearanceModel(xahVar);
        ChatUser user = d().getUser();
        if (user == null) {
            nr2Var = this;
        } else {
            if (user.isAdmin()) {
                valueOf = Integer.valueOf(R.drawable.ic_chat_admin_logo);
            } else if (s9a.y(d())) {
                Integer avatarOverrideRes = d().getAvatarOverrideRes();
                if (avatarOverrideRes != null) {
                    imageView.setBackground(null);
                    imageView.setPaddingRelative(0, 0, 0, 0);
                    i3 = avatarOverrideRes.intValue();
                } else {
                    Context context3 = imageView.getContext();
                    context3.getClass();
                    int s = ao2.s(4, context3);
                    imageView.setBackground(td4.d0(R.drawable.sofascore_spotlight_logo_bg, imageView.getContext()));
                    imageView.setPaddingRelative(s, s, s, s);
                    i3 = R.drawable.ic_sofascore_2;
                }
                valueOf = Integer.valueOf(i3);
            } else {
                valueOf = d().getIsAd() ? Integer.valueOf(R.drawable.air_cash) : pco.z(user.getId());
            }
            TextView textView5 = (TextView) zlVar.m;
            TextView textView6 = (TextView) zlVar.n;
            apf a = ajh.a(imageView.getContext());
            ht9 ht9Var = new ht9(imageView.getContext());
            ht9Var.c = valueOf;
            vt9.f(ht9Var, imageView);
            vt9.e(ht9Var, R.drawable.player_photo_placeholder);
            vt9.a(ht9Var, R.drawable.player_photo_placeholder);
            awj[] awjVarArr = {new vu2()};
            sl6 sl6Var = st9.a;
            st9.b(ht9Var, ph0.X(awjVarArr));
            ht9Var.q = jrg.b;
            a.a(ht9Var.a());
            as9.r(shapeableImageView2, user.getUserBadge(), 2);
            textView5.setText(user.getName());
            String str2 = user.isAdmin() ? "admin" : user.isModerator() ? "moderator" : "";
            ((View) zlVar.i).setVisibility(str2.length() > 0 ? 0 : 8);
            if (user.isAdmin() || user.isModerator()) {
                haa.A(textView6);
            } else if (user.getUserBadge() == UserBadge.EDITOR || user.getUserBadge() == UserBadge.CROWDSOURCER) {
                haa.G(textView6);
            }
            if (str2.length() > 0) {
                StringBuilder sb = new StringBuilder();
                char charAt = str2.charAt(0);
                Locale locale = Locale.US;
                locale.getClass();
                sb.append((Object) CharsKt.c(charAt, locale));
                sb.append(str2.substring(1));
                str2 = sb.toString();
            }
            textView6.setText(str2);
            int i6 = z ? 8388693 : 8388691;
            int i7 = z ? 8388691 : 8388693;
            ViewGroup.LayoutParams layoutParams = imageView.getLayoutParams();
            if (layoutParams == null) {
                yhk.s("null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams");
                return;
            }
            FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) layoutParams;
            layoutParams2.gravity = i6;
            imageView.setLayoutParams(layoutParams2);
            ViewGroup.LayoutParams layoutParams3 = shapeableImageView2.getLayoutParams();
            if (layoutParams3 == null) {
                yhk.s("null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams");
                return;
            }
            FrameLayout.LayoutParams layoutParams4 = (FrameLayout.LayoutParams) layoutParams3;
            layoutParams4.gravity = i7;
            shapeableImageView2.setLayoutParams(layoutParams4);
            nr2Var = this;
            textView5.setOnClickListener(nr2Var);
            ((FrameLayout) ddVar.b).setOnClickListener(nr2Var);
        }
        ChatUser user2 = nr2Var.d().getUser();
        r0d r0dVar = nr2Var.h;
        if (user2 != null) {
            if (!Intrinsics.c(user2.getId(), ((ChatUser) r0dVar.invoke()).getId())) {
                r0d r0dVar2 = nr2Var.j;
                if (r0dVar2.invoke() != null && !Intrinsics.c(r0dVar2.invoke(), nr2Var.d().getSrcLang())) {
                    r0d r0dVar3 = nr2Var.i;
                    if (r0dVar3.invoke() == null || ((set = (Set) r0dVar3.invoke()) != null && !set.contains(nr2Var.d().getSrcLang()))) {
                        str = nr2Var.d().getTranslations().get(r0dVar2.invoke());
                    }
                }
            }
            str = null;
            ImageView imageView2 = (ImageView) zlVar.c;
            ConstraintLayout constraintLayout = (ConstraintLayout) zlVar.b;
            TextView textView7 = (TextView) zlVar.j;
            TextView textView8 = zlVar.g;
            ShapeableImageView shapeableImageView3 = (ShapeableImageView) zlVar.e;
            TextView textView9 = (TextView) zlVar.k;
            aik.Q(imageView2).a();
            if (((Boolean) nr2Var.k.invoke()).booleanValue()) {
                ChatUser chatUser = (ChatUser) r0dVar.invoke();
                String chatFlag = Intrinsics.c(user2.getId(), chatUser.getId()) ? chatUser.getChatFlag() : nr2Var.d().getCountryFlag();
                if (chatFlag != null) {
                    imageView2.setVisibility(0);
                    as9.c(imageView2, chatFlag, true, null, 4);
                } else {
                    imageView2.setVisibility(8);
                }
            } else {
                imageView2.setVisibility(8);
            }
            if (str != null) {
                spannableString = new SpannableString(str);
                textView8.setVisibility(0);
                context = context2;
                textView8.setText(context.getString(R.string.auto_translated, new Locale(nr2Var.d().getSrcLang()).getDisplayLanguage()));
            } else {
                context = context2;
                spannableString = new SpannableString(nr2Var.d().getText());
                textView8.setVisibility(8);
            }
            if (!s9a.y(nr2Var.d())) {
                aba.y(materialCardView, 0, 3);
            }
            materialCardView.setOnLongClickListener(new View.OnLongClickListener() { // from class: t5
                @Override // android.view.View.OnLongClickListener
                public final boolean onLongClick(View view) {
                    Context context4 = nr2.this.b;
                    String spannableString2 = spannableString.toString();
                    spannableString2.getClass();
                    hkg.C(context4, spannableString2, "Chat Message");
                    return true;
                }
            });
            long timestamp = nr2Var.d().getTimestamp();
            String bestPattern = hk4.b().getBestPattern(DateFormat.is24HourFormat(context) ? "Hm" : "hm");
            bestPattern.getClass();
            String format = hk4.a(bestPattern).format(Instant.ofEpochSecond(timestamp));
            format.getClass();
            textView7.setText(format);
            textView9.setVisibility(nr2Var.d().getText().length() > 0 ? 0 : 8);
            textView9.setText(spannableString, TextView.BufferType.SPANNABLE);
            if (nr2Var.d().getImage() != null) {
                ChatImage image = nr2Var.d().getImage();
                shapeableImageView3.setVisibility(0);
                String thumbnail2 = image != null ? image.getThumbnail() : null;
                apf a2 = ajh.a(shapeableImageView3.getContext());
                ht9 ht9Var2 = new ht9(shapeableImageView3.getContext());
                ht9Var2.c = thumbnail2;
                vt9.f(ht9Var2, shapeableImageView3);
                vt9.e(ht9Var2, R.drawable.chat_thumbnail_placeholder);
                ht9Var2.q = jrg.a;
                a2.a(ht9Var2.a());
                shapeableImageView3.setOnClickListener(nr2Var);
            } else {
                shapeableImageView3.setVisibility(8);
            }
            if (nr2Var.d().getIsAirCashMessage()) {
                constraintLayout.getClass();
                if (!constraintLayout.isLaidOut() || constraintLayout.isLayoutRequested()) {
                    constraintLayout.addOnLayoutChangeListener(new b2(nr2Var, 1));
                } else {
                    zsk zskVar = nr2Var.f;
                    if (zskVar == null) {
                        g6b t = qea.t(constraintLayout);
                        zskVar = t != null ? new zsk(t, 45) : null;
                        nr2Var.f = zskVar;
                    }
                    if (zskVar != null) {
                        zskVar.b(constraintLayout, new v5(nr2Var, 0), new v5(nr2Var, 1));
                    }
                }
            }
            if (nr2Var.d().getIsLinkify()) {
                Matcher matcher = Patterns.WEB_URL.matcher(spannableString);
                while (matcher.find()) {
                    int start = matcher.start(1);
                    int end = matcher.end();
                    fsf fsfVar = new fsf();
                    String obj2 = spannableString.subSequence(start, end).toString();
                    fsfVar.a = obj2;
                    if (!c.v(obj2, "http://", false) && !c.v((String) fsfVar.a, "https://", false)) {
                        fsfVar.a = mz1.m(fsfVar.a, "https://");
                    }
                    if (StringsKt.J((CharSequence) fsfVar.a, "aircash", true)) {
                        spannableString.setSpan(new w5(nr2Var, fsfVar, 0), start, end, 33);
                        textView9.setText(spannableString, TextView.BufferType.SPANNABLE);
                    }
                }
                i4 = 0;
                Linkify.addLinks(textView9, 3);
                textView9.setMovementMethod(LinkMovementMethod.getInstance());
            } else {
                i4 = 0;
                textView9.setAutoLinkMask(0);
            }
            boolean isServer = nr2Var.d().getIsServer();
            CircularProgressIndicator circularProgressIndicator = (CircularProgressIndicator) zlVar.f;
            if (isServer) {
                circularProgressIndicator.setVisibility(8);
                textView7.setVisibility(i4);
                if (!Intrinsics.c(user2.getId(), ((ChatUser) r0dVar.invoke()).getId())) {
                    String o = lnb.o("@", ((ChatUser) r0dVar.invoke()).getName(), " ");
                    String spannableString2 = spannableString.toString();
                    spannableString2.getClass();
                    i5 = 0;
                    if (c.v(spannableString2, o, false)) {
                        spannableString.setSpan(new ForegroundColorSpan(context.getColor(R.color.success)), 0, o.length(), 0);
                    }
                }
            } else {
                i5 = i4;
                circularProgressIndicator.setVisibility(i5);
                textView7.setVisibility(8);
            }
            parent = nr2Var.d().getParent();
            if (parent == null && parent.isMessageValid(((ChatUser) r0dVar.invoke()).getId())) {
                frameLayout = frameLayout2;
                frameLayout.setVisibility(i5);
                String text = parent.getText();
                if (text.length() == 0) {
                    text = context.getString(R.string.chat_reply_photo);
                    text.getClass();
                }
                textView2 = textView4;
                textView2.setText(text);
                ChatUser user3 = parent.getUser();
                String name = user3 != null ? user3.getName() : null;
                textView = textView3;
                textView.setText(name);
                frameLayout.setOnClickListener(new u5(nr2Var, parent, i, 0));
                ChatImage image2 = parent.getImage();
                if (image2 != null && (thumbnail = image2.getThumbnail()) != null) {
                    shapeableImageView.setVisibility(0);
                    apf a3 = ajh.a(shapeableImageView.getContext());
                    ht9 ht9Var3 = new ht9(shapeableImageView.getContext());
                    ht9Var3.c = thumbnail;
                    vt9.f(ht9Var3, shapeableImageView);
                    a3.a(ht9Var3.a());
                }
            } else {
                textView = textView3;
                textView2 = textView4;
                frameLayout = frameLayout2;
                if (Intrinsics.c(nr2Var.d().getDeletedParentMessage(), Boolean.TRUE) && (parent == null || parent.isMessageValid(((ChatUser) r0dVar.invoke()).getId()))) {
                    frameLayout.setVisibility(8);
                    textView2.setText((CharSequence) null);
                    textView.setText((CharSequence) null);
                    frameLayout.setOnClickListener(null);
                    shapeableImageView.setVisibility(8);
                } else {
                    frameLayout.setVisibility(0);
                    textView.setText(context.getString(R.string.chat_replied_message_deleted));
                    textView2.setText((CharSequence) null);
                    frameLayout.setOnClickListener(null);
                    shapeableImageView.setVisibility(8);
                }
            }
            int i8 = !z ? R.color.primary_variant : R.color.n_lv_5;
            int i9 = !z ? R.color.on_color_secondary : R.color.n_lv_3;
            frameLayout.setBackgroundTintList(eq3.q(i8, context));
            ColorStateList q = eq3.q(i9, context);
            textView2.setTextColor(q);
            textView.setTextColor(q);
        }
        context = context2;
        i5 = 0;
        parent = nr2Var.d().getParent();
        if (parent == null) {
        }
        textView = textView3;
        textView2 = textView4;
        frameLayout = frameLayout2;
        if (Intrinsics.c(nr2Var.d().getDeletedParentMessage(), Boolean.TRUE)) {
        }
        frameLayout.setVisibility(0);
        textView.setText(context.getString(R.string.chat_replied_message_deleted));
        textView2.setText((CharSequence) null);
        frameLayout.setOnClickListener(null);
        shapeableImageView.setVisibility(8);
        if (!z) {
        }
        if (!z) {
        }
        frameLayout.setBackgroundTintList(eq3.q(i8, context));
        ColorStateList q2 = eq3.q(i9, context);
        textView2.setTextColor(q2);
        textView.setTextColor(q2);
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        view.getClass();
        if (view.getId() == R.id.auto_translated) {
            if (((ChatUser) this.h.invoke()).isAdmin()) {
                ((TextView) view).setText(d().getText());
            }
        } else {
            ct8 ct8Var = this.l;
            if (ct8Var != null) {
                ct8Var.invoke(view, Integer.valueOf(getAbsoluteAdapterPosition()), d());
            }
        }
    }
}
