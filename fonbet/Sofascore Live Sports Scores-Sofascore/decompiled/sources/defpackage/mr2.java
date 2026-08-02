package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.text.Spannable;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.format.DateFormat;
import android.text.method.LinkMovementMethod;
import android.text.style.ForegroundColorSpan;
import android.text.util.Linkify;
import android.util.Patterns;
import android.view.View;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.android.material.imageview.ShapeableImageView;
import com.google.android.material.progressindicator.CircularProgressIndicator;
import com.sofascore.model.chat.ChatImage;
import com.sofascore.model.chat.ChatUser;
import com.sofascore.model.chat.Message;
import com.sofascore.model.profile.UserBadge;
import com.sofascore.results.R;
import java.util.Set;
import java.util.regex.Matcher;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import kotlin.text.c;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class mr2 extends d2 {
    public final ez0 g;
    public final tj4 h;
    public final tj4 i;
    public final tj4 j;
    public final dhc k;
    public final ct8 l;
    public final Function2 m;
    public final int n;
    public final mqi o;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public mr2(ez0 ez0Var, tj4 tj4Var, tj4 tj4Var2, tj4 tj4Var3, dhc dhcVar, ct8 ct8Var, p1 p1Var) {
        super(r0);
        ConstraintLayout constraintLayout = (ConstraintLayout) ez0Var.b;
        constraintLayout.getClass();
        this.g = ez0Var;
        this.h = tj4Var;
        this.i = tj4Var2;
        this.j = tj4Var3;
        this.k = dhcVar;
        this.l = ct8Var;
        this.m = p1Var;
        this.n = ao2.s(16, this.b);
        this.o = ypa.b(new yj1(this, 19));
    }

    /* JADX WARN: Code restructure failed: missing block: B:136:0x01b6, code lost:
    
        if (kotlin.jvm.internal.Intrinsics.c(d().getText(), r5) == false) goto L56;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x03b2, code lost:
    
        if (r13 == null) goto L118;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v23 */
    /* JADX WARN: Type inference failed for: r1v3 */
    /* JADX WARN: Type inference failed for: r1v7, types: [boolean] */
    @Override // defpackage.p8
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void b(int i, int i2, Object obj) {
        String str;
        String str2;
        int i3;
        boolean z;
        Set set;
        ez0 ez0Var;
        tj4 tj4Var;
        final boolean z2;
        zsk zskVar;
        ChatUser user;
        ChatUser chatUser;
        Context context;
        String str3;
        int i4;
        int i5;
        Drawable drawable;
        String e;
        boolean z3;
        Message message = (Message) obj;
        message.getClass();
        this.d = message;
        ez0 ez0Var2 = this.g;
        TextView textView = (TextView) ez0Var2.e;
        ConstraintLayout constraintLayout = (ConstraintLayout) ez0Var2.b;
        textView.setTextDirection(5);
        TextView textView2 = (TextView) ez0Var2.e;
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        long timestamp = d().getTimestamp();
        Context context2 = this.b;
        context2.getClass();
        String bestPattern = hk4.b().getBestPattern(DateFormat.is24HourFormat(context2) ? "Hm" : "hm");
        bestPattern.getClass();
        String str4 = "\u200e" + fc6.i(timestamp, hk4.a(bestPattern)) + "\u200e  ";
        spannableStringBuilder.append((CharSequence) str4);
        spannableStringBuilder.setSpan(new ForegroundColorSpan(d().getIsServer() ? context2.getColor(R.color.n_lv_3) : 0), 0, str4.length(), 33);
        ChatUser user2 = d().getUser();
        int i6 = this.n;
        dhc dhcVar = this.k;
        if (user2 != null) {
            spannableStringBuilder.append((CharSequence) "#IMG#");
            if (((Boolean) dhcVar.invoke()).booleanValue() && e(user2) != null) {
                spannableStringBuilder.append((CharSequence) " #FLAG#");
            }
            if (user2.getUserBadge() == UserBadge.MODERATOR) {
                SpannableString spannableString = new SpannableString(" #IMG# ");
                Drawable drawable2 = context2.getDrawable(R.drawable.ic_moderator_badge);
                if (drawable2 != null) {
                    drawable2.setBounds(0, 0, i6, i6);
                    spannableString.setSpan(new rok(drawable2), 1, spannableString.length(), 33);
                }
                spannableStringBuilder.append((CharSequence) spannableString);
            }
        }
        ChatUser user3 = d().getUser();
        if (user3 != null) {
            String o = hkg.c0(context2) ? lnb.o("  \u200f", user3.getName(), "\u200f:  ") : lnb.o("  \u200e", user3.getName(), "\u200e:  ");
            SpannableString spannableString2 = new SpannableString(o);
            spannableString2.setSpan(new ForegroundColorSpan(context2.getColor(R.color.primary_default)), 0, o.length(), 33);
            spannableStringBuilder.append((CharSequence) spannableString2);
        }
        ((CircularProgressIndicator) ez0Var2.c).setVisibility(!d().getIsServer() ? 0 : 8);
        ChatUser user4 = d().getUser();
        tj4 tj4Var2 = this.h;
        if (user4 == null) {
            str2 = "#IMG#";
            i3 = i6;
            z = true;
        } else {
            if (!Intrinsics.c(user4.getId(), ((ChatUser) tj4Var2.invoke()).getId())) {
                tj4 tj4Var3 = this.j;
                if (tj4Var3.invoke() != null && !Intrinsics.c(tj4Var3.invoke(), d().getSrcLang())) {
                    tj4 tj4Var4 = this.i;
                    if (tj4Var4.invoke() == null || ((set = (Set) tj4Var4.invoke()) != null && !set.contains(d().getSrcLang()))) {
                        str = d().getTranslations().get(tj4Var3.invoke());
                    }
                }
            }
            str = null;
            if (str == null) {
                str = d().getText();
            }
            SpannableString spannableString3 = new SpannableString(str);
            str2 = "#IMG#";
            spannableString3.setSpan(new ForegroundColorSpan(context2.getColor(R.color.n_lv_1)), 0, spannableString3.length(), 33);
            if (d().getIsLinkify()) {
                Matcher matcher = Patterns.WEB_URL.matcher(str);
                while (matcher.find()) {
                    int start = matcher.start(1);
                    int end = matcher.end();
                    fsf fsfVar = new fsf();
                    Matcher matcher2 = matcher;
                    String substring = str.substring(start, end);
                    fsfVar.a = substring;
                    String str5 = str;
                    int i7 = i6;
                    if (!c.v(substring, "http://", false) && !c.v((String) fsfVar.a, "https://", false)) {
                        fsfVar.a = mz1.m(fsfVar.a, "https://");
                    }
                    int i8 = 1;
                    if (StringsKt.J((CharSequence) fsfVar.a, "aircash", true)) {
                        spannableString3.setSpan(new w5(this, fsfVar, i8), start, end, 33);
                    }
                    matcher = matcher2;
                    str = str5;
                    i6 = i7;
                }
                i3 = i6;
                z = true;
                Linkify.addLinks(textView2, 3);
                textView2.setMovementMethod(LinkMovementMethod.getInstance());
            } else {
                i3 = i6;
                z = true;
                textView2.setAutoLinkMask(0);
            }
            spannableStringBuilder.append((CharSequence) spannableString3);
        }
        textView2.setText(spannableStringBuilder, TextView.BufferType.SPANNABLE);
        CharSequence text = textView2.getText();
        Spannable spannable = text instanceof Spannable ? (Spannable) text : null;
        if (spannable == null || (user = d().getUser()) == null) {
            ez0Var = ez0Var2;
            tj4Var = tj4Var2;
            z2 = 0;
        } else {
            if (!((Boolean) dhcVar.invoke()).booleanValue() || (e = e(user)) == null) {
                ez0Var = ez0Var2;
                chatUser = user;
                context = context2;
                tj4Var = tj4Var2;
                str3 = str2;
                i4 = i3;
                z2 = 0;
                i5 = 6;
            } else {
                int P = StringsKt.P(spannable, "#FLAG#", 0, false, 6);
                Integer valueOf = Integer.valueOf(P);
                if (P == -1) {
                    valueOf = null;
                }
                if (valueOf != null) {
                    int intValue = valueOf.intValue();
                    int i9 = intValue + 6;
                    apf a = ajh.a(context2);
                    Drawable drawable3 = context2.getDrawable(R.drawable.player_photo_placeholder);
                    int i10 = this.n;
                    if (drawable3 != null) {
                        drawable3.setBounds(0, 0, i10, i10);
                    } else {
                        drawable3 = null;
                    }
                    ht9 ht9Var = new ht9(context2);
                    chatUser = user;
                    ht9Var.c = fc6.n((Intrinsics.c(uaa.c, "api.sofascore.com/") ? "https://img.sofascore.com/" : dmi.q("https://", uaa.c)).concat("api/v1/"), "country/", e, "/flag");
                    Drawable drawable4 = drawable3;
                    Spannable spannable2 = spannable;
                    tj4Var = tj4Var2;
                    Spannable spannable3 = spannable;
                    ez0Var = ez0Var2;
                    z3 = false;
                    Spannable spannable4 = spannable;
                    Drawable drawable5 = drawable3;
                    str3 = str2;
                    i4 = i3;
                    s03 s03Var = new s03(drawable5, spannable4, intValue, i9, drawable4, spannable2, intValue, i9, context2, i10, spannable3, intValue, i9);
                    spannable = spannable4;
                    context = context2;
                    ht9Var.d = s03Var;
                    a.a(ht9Var.a());
                } else {
                    ez0Var = ez0Var2;
                    chatUser = user;
                    context = context2;
                    tj4Var = tj4Var2;
                    str3 = str2;
                    i4 = i3;
                    z3 = false;
                }
                i5 = 6;
                z2 = z3;
            }
            int P2 = StringsKt.P(spannable, str3, z2 == true ? 1 : 0, z2, i5);
            Integer valueOf2 = Integer.valueOf(P2);
            if (P2 == -1) {
                valueOf2 = null;
            }
            if (valueOf2 != null) {
                int intValue2 = valueOf2.intValue();
                int i11 = intValue2 + 5;
                if (s9a.y(d())) {
                    Integer avatarOverrideRes = d().getAvatarOverrideRes();
                    if (avatarOverrideRes != null) {
                        Drawable drawable6 = context.getDrawable(avatarOverrideRes.intValue());
                        if (drawable6 == null) {
                            drawable = null;
                        } else {
                            Bitmap createBitmap = Bitmap.createBitmap(i4, i4, Bitmap.Config.ARGB_8888);
                            createBitmap.getClass();
                            Canvas canvas = new Canvas(createBitmap);
                            Path path = new Path();
                            float f = i4 / 2.0f;
                            path.addCircle(f, f, f, Path.Direction.CW);
                            canvas.save();
                            canvas.clipPath(path);
                            drawable6.setBounds(z2 == true ? 1 : 0, z2 == true ? 1 : 0, i4, i4);
                            drawable6.draw(canvas);
                            canvas.restore();
                            Resources resources = context.getResources();
                            resources.getClass();
                            drawable = new BitmapDrawable(resources, createBitmap);
                            drawable.setBounds(z2 == true ? 1 : 0, z2 == true ? 1 : 0, i4, i4);
                        }
                    }
                    drawable = (Drawable) this.o.getValue();
                    if (drawable != null) {
                        spannable.setSpan(new rok(drawable), intValue2, i11, 33);
                    }
                } else if (d().getIsAd()) {
                    Drawable drawable7 = context.getDrawable(R.drawable.air_cash);
                    if (drawable7 != null) {
                        drawable7.setBounds(z2 == true ? 1 : 0, z2 == true ? 1 : 0, i4, i4);
                        spannable.setSpan(new rok(drawable7), intValue2, i11, 33);
                    }
                } else if (chatUser.isAdmin()) {
                    Drawable drawable8 = context.getDrawable(R.drawable.ic_chat_admin_logo);
                    if (drawable8 != null) {
                        drawable8.setBounds(z2 == true ? 1 : 0, z2 == true ? 1 : 0, i4, i4);
                        spannable.setSpan(new rok(drawable8), intValue2, i11, 33);
                    }
                } else {
                    String id = chatUser.getId();
                    Drawable drawable9 = context.getDrawable(R.drawable.player_photo_placeholder);
                    if (drawable9 != null) {
                        drawable9.setBounds(z2 == true ? 1 : 0, z2 == true ? 1 : 0, i4, i4);
                        Unit unit = Unit.a;
                    } else {
                        drawable9 = null;
                    }
                    apf a2 = ajh.a(context);
                    id.getClass();
                    ht9 ht9Var2 = new ht9(context);
                    ht9Var2.c = pco.z(id);
                    awj[] awjVarArr = new awj[1];
                    awjVarArr[z2 == true ? 1 : 0] = new vu2();
                    sl6 sl6Var = st9.a;
                    st9.b(ht9Var2, ph0.X(awjVarArr));
                    ht9Var2.d = new s03(spannable, drawable9, intValue2, i11, spannable, drawable9, intValue2, i11, context, this.n, spannable, intValue2, i11);
                    a2.a(ht9Var2.a());
                }
            }
        }
        if (((ChatUser) tj4Var.invoke()).isLoggedIn() && !s9a.y(d())) {
            constraintLayout.getClass();
            aba.y(constraintLayout, z2, 3);
            final int i12 = 1;
            constraintLayout.setOnLongClickListener(new View.OnLongClickListener(this) { // from class: lr2
                public final /* synthetic */ mr2 b;

                {
                    this.b = this;
                }

                /* JADX WARN: Removed duplicated region for block: B:16:0x004e  */
                /* JADX WARN: Removed duplicated region for block: B:19:0x0068  */
                /* JADX WARN: Removed duplicated region for block: B:34:0x0057  */
                @Override // android.view.View.OnLongClickListener
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final boolean onLongClick(View view) {
                    Function2 function2;
                    boolean z4;
                    Function2 function22;
                    int i13 = i12;
                    mr2 mr2Var = this.b;
                    switch (i13) {
                        case 0:
                            Message d = mr2Var.d();
                            tj4 tj4Var5 = mr2Var.h;
                            ChatUser user5 = d.getUser();
                            if ((!Intrinsics.c(user5 != null ? user5.getId() : null, ((ChatUser) tj4Var5.invoke()).getId()) || ((ChatUser) tj4Var5.invoke()).isAdmin() || ((ChatUser) tj4Var5.invoke()).isModerator()) && (function2 = mr2Var.m) != null) {
                                Message d2 = mr2Var.d();
                                ConstraintLayout constraintLayout2 = (ConstraintLayout) mr2Var.g.b;
                                constraintLayout2.getClass();
                                function2.invoke(d2, constraintLayout2);
                                break;
                            }
                            break;
                        default:
                            Message d3 = mr2Var.d();
                            tj4 tj4Var6 = mr2Var.h;
                            ChatUser user6 = d3.getUser();
                            Boolean valueOf3 = user6 != null ? Boolean.valueOf(user6.isAdmin()) : null;
                            Boolean bool = Boolean.FALSE;
                            if (Intrinsics.c(valueOf3, bool)) {
                                ChatUser user7 = mr2Var.d().getUser();
                                if (Intrinsics.c(user7 != null ? Boolean.valueOf(user7.isModerator()) : null, bool)) {
                                    z4 = true;
                                    ChatUser user8 = mr2Var.d().getUser();
                                    boolean c = Intrinsics.c(user8 == null ? Boolean.valueOf(user8.isAdmin()) : null, Boolean.TRUE);
                                    ChatUser user9 = mr2Var.d().getUser();
                                    boolean c2 = Intrinsics.c(user9 != null ? user9.getId() : null, ((ChatUser) tj4Var6.invoke()).getId());
                                    if (mr2Var.d().getUser() != null && (((z4 && !c2) || ((((ChatUser) tj4Var6.invoke()).isModerator() && !c) || ((ChatUser) tj4Var6.invoke()).isAdmin())) && (function22 = mr2Var.m) != null)) {
                                        Message d4 = mr2Var.d();
                                        ConstraintLayout constraintLayout3 = (ConstraintLayout) mr2Var.g.b;
                                        constraintLayout3.getClass();
                                        function22.invoke(d4, constraintLayout3);
                                        break;
                                    }
                                }
                            }
                            z4 = false;
                            ChatUser user82 = mr2Var.d().getUser();
                            boolean c3 = Intrinsics.c(user82 == null ? Boolean.valueOf(user82.isAdmin()) : null, Boolean.TRUE);
                            ChatUser user92 = mr2Var.d().getUser();
                            boolean c22 = Intrinsics.c(user92 != null ? user92.getId() : null, ((ChatUser) tj4Var6.invoke()).getId());
                            if (mr2Var.d().getUser() != null) {
                                Message d42 = mr2Var.d();
                                ConstraintLayout constraintLayout32 = (ConstraintLayout) mr2Var.g.b;
                                constraintLayout32.getClass();
                                function22.invoke(d42, constraintLayout32);
                            }
                            break;
                    }
                    return true;
                }
            });
        }
        ChatImage image = d().getImage();
        ShapeableImageView shapeableImageView = (ShapeableImageView) ez0Var.d;
        if (image != null) {
            shapeableImageView.setVisibility(z2);
            String thumbnail = image.getThumbnail();
            apf a3 = ajh.a(shapeableImageView.getContext());
            ht9 ht9Var3 = new ht9(shapeableImageView.getContext());
            ht9Var3.c = thumbnail;
            vt9.f(ht9Var3, shapeableImageView);
            vt9.e(ht9Var3, R.drawable.ic_image_full);
            vt9.a(ht9Var3, R.drawable.ic_image_full);
            a3.a(ht9Var3.a());
            shapeableImageView.setOnClickListener(new s0(this, 12));
            shapeableImageView.setOnLongClickListener(new View.OnLongClickListener(this) { // from class: lr2
                public final /* synthetic */ mr2 b;

                {
                    this.b = this;
                }

                /* JADX WARN: Removed duplicated region for block: B:16:0x004e  */
                /* JADX WARN: Removed duplicated region for block: B:19:0x0068  */
                /* JADX WARN: Removed duplicated region for block: B:34:0x0057  */
                @Override // android.view.View.OnLongClickListener
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final boolean onLongClick(View view) {
                    Function2 function2;
                    boolean z4;
                    Function2 function22;
                    int i13 = z2;
                    mr2 mr2Var = this.b;
                    switch (i13) {
                        case 0:
                            Message d = mr2Var.d();
                            tj4 tj4Var5 = mr2Var.h;
                            ChatUser user5 = d.getUser();
                            if ((!Intrinsics.c(user5 != null ? user5.getId() : null, ((ChatUser) tj4Var5.invoke()).getId()) || ((ChatUser) tj4Var5.invoke()).isAdmin() || ((ChatUser) tj4Var5.invoke()).isModerator()) && (function2 = mr2Var.m) != null) {
                                Message d2 = mr2Var.d();
                                ConstraintLayout constraintLayout2 = (ConstraintLayout) mr2Var.g.b;
                                constraintLayout2.getClass();
                                function2.invoke(d2, constraintLayout2);
                                break;
                            }
                            break;
                        default:
                            Message d3 = mr2Var.d();
                            tj4 tj4Var6 = mr2Var.h;
                            ChatUser user6 = d3.getUser();
                            Boolean valueOf3 = user6 != null ? Boolean.valueOf(user6.isAdmin()) : null;
                            Boolean bool = Boolean.FALSE;
                            if (Intrinsics.c(valueOf3, bool)) {
                                ChatUser user7 = mr2Var.d().getUser();
                                if (Intrinsics.c(user7 != null ? Boolean.valueOf(user7.isModerator()) : null, bool)) {
                                    z4 = true;
                                    ChatUser user82 = mr2Var.d().getUser();
                                    boolean c3 = Intrinsics.c(user82 == null ? Boolean.valueOf(user82.isAdmin()) : null, Boolean.TRUE);
                                    ChatUser user92 = mr2Var.d().getUser();
                                    boolean c22 = Intrinsics.c(user92 != null ? user92.getId() : null, ((ChatUser) tj4Var6.invoke()).getId());
                                    if (mr2Var.d().getUser() != null && (((z4 && !c22) || ((((ChatUser) tj4Var6.invoke()).isModerator() && !c3) || ((ChatUser) tj4Var6.invoke()).isAdmin())) && (function22 = mr2Var.m) != null)) {
                                        Message d42 = mr2Var.d();
                                        ConstraintLayout constraintLayout32 = (ConstraintLayout) mr2Var.g.b;
                                        constraintLayout32.getClass();
                                        function22.invoke(d42, constraintLayout32);
                                        break;
                                    }
                                }
                            }
                            z4 = false;
                            ChatUser user822 = mr2Var.d().getUser();
                            boolean c32 = Intrinsics.c(user822 == null ? Boolean.valueOf(user822.isAdmin()) : null, Boolean.TRUE);
                            ChatUser user922 = mr2Var.d().getUser();
                            boolean c222 = Intrinsics.c(user922 != null ? user922.getId() : null, ((ChatUser) tj4Var6.invoke()).getId());
                            if (mr2Var.d().getUser() != null) {
                                Message d422 = mr2Var.d();
                                ConstraintLayout constraintLayout322 = (ConstraintLayout) mr2Var.g.b;
                                constraintLayout322.getClass();
                                function22.invoke(d422, constraintLayout322);
                            }
                            break;
                    }
                    return true;
                }
            });
            zskVar = null;
        } else {
            zskVar = null;
            shapeableImageView.setOnClickListener(null);
            shapeableImageView.setOnLongClickListener(null);
            shapeableImageView.setVisibility(8);
        }
        View view = this.c;
        if (!view.isLaidOut() || view.isLayoutRequested()) {
            view.addOnLayoutChangeListener(new b2(this, z2));
            return;
        }
        if (d().getIsAirCashMessage()) {
            zsk zskVar2 = this.f;
            if (zskVar2 == null) {
                g6b t = qea.t(view);
                zsk zskVar3 = t != null ? new zsk(t, 45) : zskVar;
                this.f = zskVar3;
                zskVar2 = zskVar3;
            }
            if (zskVar2 != null) {
                zskVar2.b(view, new c2(this, z2), new c2(this, 1));
            }
        }
    }

    public final String e(ChatUser chatUser) {
        ChatUser chatUser2 = (ChatUser) this.h.invoke();
        return Intrinsics.c(chatUser.getId(), chatUser2.getId()) ? chatUser2.getChatFlag() : d().getCountryFlag();
    }
}
