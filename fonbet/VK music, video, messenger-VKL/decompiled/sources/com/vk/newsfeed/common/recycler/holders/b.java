package com.vk.newsfeed.common.recycler.holders;

import android.text.Editable;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.SpannedString;
import android.text.TextUtils;
import android.text.method.LinkMovementMethod;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatEditText;
import com.vk.dto.common.id.UserId;
import com.vk.newsfeed.common.recycler.holders.LeadFormHolder;
import com.vk.repository.data.api.ExtendedProfilesRepository;
import com.vkontakte.android.R;
import com.vkontakte.android.api.ExtendedUserProfile;
import com.vkontakte.android.attachments.ShitAttachment;
import io.reactivex.rxjava3.core.b0;
import io.reactivex.rxjava3.core.x;
import io.reactivex.rxjava3.internal.operators.observable.f0;
import io.reactivex.rxjava3.internal.operators.single.k;
import java.util.ArrayList;
import java.util.List;
import kotlin.LazyThreadSafetyMode;
import kotlin.NoWhenBranchMatchedException;
import kotlin.text.Regex;
import xsna.asu0;
import xsna.bq1;
import xsna.bwt0;
import xsna.dhr0;
import xsna.dvq0;
import xsna.e3m;
import xsna.e43;
import xsna.epx;
import xsna.er90;
import xsna.f3a0;
import xsna.f4m;
import xsna.f6w;
import xsna.gky;
import xsna.gt;
import xsna.gzs;
import xsna.h2s;
import xsna.hg1;
import xsna.hms;
import xsna.it80;
import xsna.izs;
import xsna.j5g;
import xsna.lpj;
import xsna.mg;
import xsna.msy;
import xsna.myc0;
import xsna.myy;
import xsna.n21;
import xsna.nyy;
import xsna.o25;
import xsna.o7;
import xsna.oa01;
import xsna.og;
import xsna.oyy;
import xsna.p4g;
import xsna.pcv0;
import xsna.ptk;
import xsna.qpj;
import xsna.rl3;
import xsna.rsg0;
import xsna.rt0;
import xsna.ryy;
import xsna.s3q0;
import xsna.s6k;
import xsna.t7;
import xsna.tfx;
import xsna.tr;
import xsna.tyy;
import xsna.um0;
import xsna.vam;
import xsna.vif0;
import xsna.wq;
import xsna.x50;
import xsna.xq;
import xsna.yam;
import xsna.yfb;

/* compiled from: LeadFormContactsHolder.kt */
/* loaded from: classes4.dex */
public final class b extends vif0<ryy.b> {
    public static final /* synthetic */ int Q = 0;
    public final pcv0 A;
    public boolean B;
    public boolean C;
    public final String D;
    public final ArrayList E;
    public AppCompatEditText F;
    public AppCompatEditText G;
    public AppCompatEditText H;
    public AppCompatEditText I;
    public AppCompatEditText J;
    public AppCompatEditText K;
    public LinearLayout L;
    public LinearLayout M;
    public String N;
    public boolean O;
    public final Object P;
    public final dvq0 n;
    public final ExtendedProfilesRepository o;
    public final tyy p;
    public final izs<LeadFormHolder.ButtonAction, s3q0> q;
    public final TextView r;
    public final TextView s;
    public final TextView t;
    public final LinearLayout u;
    public final int v;
    public final int w;
    public final int x;
    public final myy y;
    public boolean z;

    /* compiled from: LeadFormContactsHolder.kt */
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[ShitAttachment.LeadForm.ContactField.values().length];
            try {
                iArr[ShitAttachment.LeadForm.ContactField.FIRST_NAME.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ShitAttachment.LeadForm.ContactField.EMAIL.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[ShitAttachment.LeadForm.ContactField.PHONE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[ShitAttachment.LeadForm.ContactField.SOCIAL_MEDIA_PROFILE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[ShitAttachment.LeadForm.ContactField.CITY.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[ShitAttachment.LeadForm.ContactField.BIRTH_DATE.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[ShitAttachment.LeadForm.ContactField.UNSUPPORTED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public b(ViewGroup viewGroup, dvq0 dvq0Var, ExtendedProfilesRepository extendedProfilesRepository, tyy tyyVar, LeadFormHolder.b bVar) {
        super(viewGroup, R.layout.lead_ads_contacts_page, 0);
        this.n = dvq0Var;
        this.o = extendedProfilesRepository;
        this.p = tyyVar;
        this.q = bVar;
        TextView textView = (TextView) this.itemView.findViewById(R.id.button);
        this.r = textView;
        this.s = (TextView) this.itemView.findViewById(R.id.title);
        this.t = (TextView) this.itemView.findViewById(R.id.agreement_text);
        this.u = (LinearLayout) this.itemView.findViewById(R.id.fields_container);
        this.v = e3m.a(R.dimen.lead_form_contact_fields_top_margin, this.itemView.getContext());
        this.w = e3m.a(R.dimen.lead_form_answer_padding_vertical, this.itemView.getContext());
        this.x = e3m.a(R.dimen.lead_form_answer_padding_horizontal, this.itemView.getContext());
        this.y = new myy(this);
        this.A = new pcv0(new io.michaelrocks.libphonenumber.android.a(f3a0.a.a(this.itemView.getContext()), f3a0.c), true, true);
        this.D = this.itemView.getContext().getString(R.string.lead_ads_phone_plus_seven);
        this.E = new ArrayList(4);
        this.P = msy.a(LazyThreadSafetyMode.NONE, new mg(16));
        textView.setOnClickListener(new og(this, 2));
    }

    public final void A6() {
        Editable text;
        AppCompatEditText appCompatEditText = this.G;
        String obj = (appCompatEditText == null || (text = appCompatEditText.getText()) == null) ? null : text.toString();
        if (obj == null) {
            obj = "";
        }
        int i = !s6(obj) ? R.drawable.vkui_bg_edittext_error : R.drawable.bg_lead_form_edit_text;
        LinearLayout linearLayout = this.M;
        if (linearLayout != null) {
            linearLayout.setBackgroundResource(i);
        }
    }

    public final void B6() {
        Editable text;
        AppCompatEditText appCompatEditText = this.F;
        String obj = (appCompatEditText == null || (text = appCompatEditText.getText()) == null) ? null : text.toString();
        if (obj == null) {
            obj = "";
        }
        int i = !t6(obj) ? R.drawable.vkui_bg_edittext_error : R.drawable.bg_lead_form_edit_text;
        LinearLayout linearLayout = this.L;
        if (linearLayout != null) {
            linearLayout.setBackgroundResource(i);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // xsna.vif0
    public final void i6(ryy.b bVar) {
        LinearLayout linearLayout;
        b0 b;
        b bVar2 = this;
        ryy.b bVar3 = bVar;
        String str = bVar2.N;
        String str2 = bVar3.a;
        if (epx.f(str, str2) && bVar2.O) {
            return;
        }
        bVar2.N = str2;
        bVar2.O = false;
        bwt0.a0(bVar2.r, false);
        bVar2.s.setText(bVar3.b);
        AppCompatEditText appCompatEditText = bVar2.G;
        Throwable th = null;
        if (appCompatEditText != null) {
            appCompatEditText.setOnFocusChangeListener(null);
        }
        AppCompatEditText appCompatEditText2 = bVar2.F;
        if (appCompatEditText2 != null) {
            appCompatEditText2.setOnFocusChangeListener(null);
        }
        List<ShitAttachment.LeadForm.ContactField> list = bVar3.c;
        int i = 0;
        while (true) {
            linearLayout = bVar2.u;
            if (i >= linearLayout.getChildCount()) {
                break;
            }
            View childAt = linearLayout.getChildAt(i);
            if (childAt instanceof ViewGroup) {
                ((ViewGroup) childAt).removeAllViews();
            }
            i++;
        }
        linearLayout.removeAllViews();
        int i2 = 0;
        for (Object obj : j5g.H0(list, 4)) {
            int i3 = i2 + 1;
            if (i2 < 0) {
                Throwable th2 = th;
                e43.t();
                throw th2;
            }
            ShitAttachment.LeadForm.ContactField contactField = (ShitAttachment.LeadForm.ContactField) obj;
            int i4 = a.$EnumSwitchMapping$0[contactField.ordinal()];
            Throwable th3 = th;
            pcv0 pcv0Var = bVar2.A;
            int i5 = bVar2.v;
            switch (i4) {
                case 1:
                    bVar2.I = bVar2.q6(i2, 8192, R.string.lead_ads_name_hint, R.id.lead_form_name_field, contactField.h(), true, null);
                    break;
                case 2:
                    int i6 = i2;
                    qpj qpjVar = new qpj(bVar2, 23);
                    LinearLayout linearLayout2 = new LinearLayout(bVar2.itemView.getContext());
                    linearLayout2.setOrientation(0);
                    linearLayout2.setBackgroundResource(R.drawable.bg_lead_form_edit_text);
                    LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
                    layoutParams.topMargin = i5;
                    linearLayout2.setLayoutParams(layoutParams);
                    bVar2 = this;
                    AppCompatEditText q6 = bVar2.q6(i6, 32, R.string.lead_ads_email_hint, R.id.lead_form_email_field, ShitAttachment.LeadForm.ContactField.EMAIL.h(), false, new nyy(0, this, b.class, "validateEmail", "validateEmail()V", 0, 0));
                    q6.addTextChangedListener(pcv0Var);
                    q6.setEnabled(false);
                    q6.setBackgroundResource(0);
                    q6.setLayoutParams(new LinearLayout.LayoutParams(0, -2, 1.0f));
                    linearLayout2.addView(q6);
                    TextView textView = new TextView(linearLayout2.getContext());
                    LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-2, -2);
                    layoutParams2.setMarginEnd(e3m.a(R.dimen.lead_form_answer_padding_horizontal, linearLayout2.getContext()));
                    textView.setLayoutParams(layoutParams2);
                    textView.setTextAppearance(R.style.VkUiTypography_FootnoteMedium);
                    textView.setTextColor(dhr0.t.c(R.attr.vk_ui_text_link_themed));
                    textView.setText(R.string.lead_ads_change_phone);
                    f4m.w(textView.getWidth(), q6);
                    textView.setOnClickListener(new oyy(textView, qpjVar, q6));
                    bVar2.G = q6;
                    linearLayout2.addView(textView);
                    bVar2.M = linearLayout2;
                    linearLayout.addView(linearLayout2);
                    break;
                case 3:
                    int i7 = i2;
                    vam vamVar = new vam(bVar2, 18);
                    LinearLayout linearLayout3 = new LinearLayout(bVar2.itemView.getContext());
                    linearLayout3.setOrientation(0);
                    linearLayout3.setBackgroundResource(R.drawable.bg_lead_form_edit_text);
                    LinearLayout.LayoutParams layoutParams3 = new LinearLayout.LayoutParams(-1, -2);
                    layoutParams3.topMargin = i5;
                    linearLayout3.setLayoutParams(layoutParams3);
                    bVar2 = this;
                    AppCompatEditText q62 = bVar2.q6(i7, 3, R.string.lead_ads_phone_hint, R.id.lead_form_phone_field, ShitAttachment.LeadForm.ContactField.PHONE.h(), false, new yam(0, this, b.class, "validatePhoneField", "validatePhoneField()V", 0));
                    q62.addTextChangedListener(pcv0Var);
                    q62.setEnabled(false);
                    q62.setBackgroundResource(0);
                    q62.setLayoutParams(new LinearLayout.LayoutParams(0, -2, 1.0f));
                    linearLayout3.addView(q62);
                    TextView textView2 = new TextView(linearLayout3.getContext());
                    LinearLayout.LayoutParams layoutParams4 = new LinearLayout.LayoutParams(-2, -2);
                    layoutParams4.setMarginEnd(e3m.a(R.dimen.lead_form_answer_padding_horizontal, linearLayout3.getContext()));
                    textView2.setLayoutParams(layoutParams4);
                    textView2.setTextAppearance(R.style.VkUiTypography_FootnoteMedium);
                    textView2.setTextColor(dhr0.t.c(R.attr.vk_ui_text_link_themed));
                    textView2.setText(R.string.lead_ads_change_phone);
                    f4m.w(textView2.getWidth(), q62);
                    textView2.setOnClickListener(new oyy(textView2, vamVar, q62));
                    bVar2.F = q62;
                    linearLayout3.addView(textView2);
                    bVar2.L = linearLayout3;
                    linearLayout.addView(linearLayout3);
                    break;
                case 4:
                    bVar2.J = bVar2.q6(i2, 16, R.string.lead_ads_profile_link_hint, R.id.lead_form_social_media_profile_field, contactField.h(), true, null);
                    break;
                case 5:
                    bVar2.H = bVar2.q6(i2, 8192, R.string.lead_ads_city_hint, R.id.lead_form_city_field, contactField.h(), true, null);
                    break;
                case 6:
                    bVar2.K = bVar2.q6(i2, 16, R.string.lead_ads_birth_date_hint, R.id.lead_form_birth_date_field, contactField.h(), true, null);
                    break;
                case 7:
                    break;
                default:
                    throw new NoWhenBranchMatchedException();
            }
            th = th3;
            i2 = i3;
        }
        bVar2.x6();
        String string = bVar2.itemView.getContext().getString(R.string.lead_ads_agreement_clickable);
        String string2 = bVar2.itemView.getContext().getString(R.string.lead_ads_agreement, string);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        SpannableString spannableString = new SpannableString(string2);
        spannableString.setSpan(bVar2.y, string2.length() - string.length(), string2.length(), 33);
        spannableStringBuilder.append((CharSequence) spannableString);
        SpannedString spannedString = new SpannedString(spannableStringBuilder);
        TextView textView3 = bVar2.t;
        textView3.setText(spannedString);
        textView3.setMovementMethod(new LinkMovementMethod());
        if (bVar2.O || bVar2.z) {
            return;
        }
        bVar2.z = true;
        List<ShitAttachment.LeadForm.ContactField> list2 = ((ryy.b) bVar2.m).c;
        ShitAttachment.LeadForm.ContactField[] contactFieldArr = {ShitAttachment.LeadForm.ContactField.EMAIL, ShitAttachment.LeadForm.ContactField.PHONE};
        p4g.a aVar = p4g.a;
        boolean b2 = p4g.b(list2, rl3.u0(contactFieldArr));
        int i8 = 19;
        b0 l = b2 ? rsg0.D0(yfb.x(new tfx("leadForms.getUserFormData", new wq(20), new xq(19)))).l(new o7(new gt(26), 18)) : tr.b(it80.b);
        if (p4g.b(((ryy.b) bVar2.m).c, rl3.u0(new ShitAttachment.LeadForm.ContactField[]{ShitAttachment.LeadForm.ContactField.FIRST_NAME, ShitAttachment.LeadForm.ContactField.SOCIAL_MEDIA_PROFILE, ShitAttachment.LeadForm.ContactField.CITY, ShitAttachment.LeadForm.ContactField.BIRTH_DATE}))) {
            UserId c = o25.a().c();
            ExtendedProfilesRepository extendedProfilesRepository = bVar2.o;
            ExtendedUserProfile L0 = extendedProfilesRepository.L0(c);
            if (L0 == null) {
                f0 K = extendedProfilesRepository.w(new com.vk.repository.data.api.a(o25.a().c(), new gky(1), new f6w(4))).K();
                asu0 asu0Var = asu0.a;
                b = K.q(asu0Var.c()).m(asu0Var.d()).l(new rt0(new x50(25), 18));
            } else {
                it80.a aVar2 = it80.b;
                ptk ptkVar = new ptk(L0, true);
                aVar2.getClass();
                b = x.k(new it80(ptkVar));
            }
        } else {
            b = tr.b(it80.b);
        }
        hg1.b(bVar2.itemView, new k(x.B(l, b, new t7(new n21(4), i8)), new bq1(bVar2, 3)).subscribe(new um0(new h2s(bVar2, 8), 29), new hms(new s6k(bVar2, 27), 8)));
    }

    public final AppCompatEditText q6(final int i, int i2, int i3, int i4, String str, boolean z, final gzs<s3q0> gzsVar) {
        ArrayList arrayList = this.E;
        final AppCompatEditText appCompatEditText = (AppCompatEditText) j5g.b0(i, arrayList);
        if (appCompatEditText == null) {
            appCompatEditText = new AppCompatEditText(new lpj(this.itemView.getContext(), R.style.VKUIEditText));
            appCompatEditText.setEllipsize(TextUtils.TruncateAt.END);
            int i5 = this.x;
            int i6 = this.w;
            appCompatEditText.setPadding(i5, i6, i5, i6);
            oa01.a(appCompatEditText, new com.vk.movika.sdk.base.logic.processor.d(19, this, appCompatEditText));
            arrayList.add(appCompatEditText);
        }
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
        layoutParams.topMargin = this.v;
        appCompatEditText.setLayoutParams(layoutParams);
        appCompatEditText.setId(i4);
        appCompatEditText.setHint(this.itemView.getContext().getString(i3));
        appCompatEditText.setInputType(i2);
        appCompatEditText.setTag(str);
        Editable text = appCompatEditText.getText();
        if (text != null) {
            text.clear();
        }
        appCompatEditText.setBackgroundResource(R.drawable.bg_lead_form_edit_text);
        if (i == 3) {
            appCompatEditText.setImeOptions(6);
        } else {
            appCompatEditText.setImeOptions(5);
        }
        appCompatEditText.setOnEditorActionListener(new TextView.OnEditorActionListener() { // from class: xsna.kyy
            @Override // android.widget.TextView.OnEditorActionListener
            public final boolean onEditorAction(TextView textView, int i7, KeyEvent keyEvent) {
                AppCompatEditText appCompatEditText2;
                com.vk.newsfeed.common.recycler.holders.b bVar = com.vk.newsfeed.common.recycler.holders.b.this;
                ArrayList arrayList2 = bVar.E;
                if (i7 == 5) {
                    int i8 = 0;
                    do {
                        i8++;
                        appCompatEditText2 = (AppCompatEditText) j5g.b0(i + i8, arrayList2);
                        if (appCompatEditText2 == null) {
                            break;
                        }
                    } while (!appCompatEditText2.isEnabled());
                    if (appCompatEditText2 == null) {
                        appCompatEditText2 = (AppCompatEditText) j5g.a0(arrayList2);
                    }
                    if (appCompatEditText2 != null) {
                        appCompatEditText2.requestFocus();
                        return true;
                    }
                } else if (i7 == 6) {
                    mhy.b(bVar.itemView.getContext());
                }
                return true;
            }
        });
        if (z) {
            this.u.addView(appCompatEditText);
        }
        appCompatEditText.setOnFocusChangeListener(new View.OnFocusChangeListener() { // from class: xsna.lyy
            @Override // android.view.View.OnFocusChangeListener
            public final void onFocusChange(View view, boolean z2) {
                if (z2) {
                    AppCompatEditText appCompatEditText2 = AppCompatEditText.this;
                    appCompatEditText2.setSelection(appCompatEditText2.length());
                    mhy.j(appCompatEditText2);
                } else {
                    gzs gzsVar2 = gzsVar;
                    if (gzsVar2 != null) {
                        gzsVar2.invoke();
                    }
                }
            }
        });
        return appCompatEditText;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean s6(String str) {
        if (!(this.C && myc0.f(str)) && ((ryy.b) this.m).c.contains(ShitAttachment.LeadForm.ContactField.EMAIL)) {
            return er90.c.matcher(str).matches();
        }
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.Object, kotlin.Lazy] */
    public final boolean t6(String str) {
        if (!(this.B && myc0.f(str)) && ((ryy.b) this.m).c.contains(ShitAttachment.LeadForm.ContactField.PHONE)) {
            return ((Regex) this.P.getValue()).f(str);
        }
        return true;
    }

    public final void v6(ViewGroup viewGroup) {
        int childCount = viewGroup.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = viewGroup.getChildAt(i);
            if (childAt instanceof ViewGroup) {
                v6((ViewGroup) childAt);
            }
            AppCompatEditText appCompatEditText = childAt instanceof AppCompatEditText ? (AppCompatEditText) childAt : null;
            if (appCompatEditText != null) {
                Object tag = appCompatEditText.getTag();
                String str = tag instanceof String ? (String) tag : null;
                if (str != null) {
                    String valueOf = String.valueOf(appCompatEditText.getText());
                    if (str.equals(ShitAttachment.LeadForm.ContactField.PHONE.h()) && !this.B) {
                        StringBuilder sb = new StringBuilder();
                        int length = valueOf.length();
                        for (int i2 = 0; i2 < length; i2++) {
                            char charAt = valueOf.charAt(i2);
                            if (Character.isDigit(charAt)) {
                                sb.append(charAt);
                            }
                        }
                        valueOf = sb.toString();
                    }
                    this.p.m(str, valueOf);
                }
            }
        }
    }

    public final void x6() {
        Editable text;
        Editable text2;
        AppCompatEditText appCompatEditText = this.F;
        String obj = (appCompatEditText == null || (text2 = appCompatEditText.getText()) == null) ? null : text2.toString();
        if (obj == null) {
            obj = "";
        }
        boolean t6 = t6(obj);
        AppCompatEditText appCompatEditText2 = this.G;
        String obj2 = (appCompatEditText2 == null || (text = appCompatEditText2.getText()) == null) ? null : text.toString();
        boolean s6 = s6(obj2 != null ? obj2 : "");
        LinearLayout linearLayout = this.u;
        int childCount = linearLayout.getChildCount();
        boolean z = false;
        boolean z2 = true;
        for (int i = 0; i < childCount; i++) {
            View childAt = linearLayout.getChildAt(i);
            AppCompatEditText appCompatEditText3 = childAt instanceof AppCompatEditText ? (AppCompatEditText) childAt : null;
            if (appCompatEditText3 != null && z2) {
                Editable text3 = appCompatEditText3.getText();
                z2 = !(text3 == null || text3.length() == 0);
            }
        }
        if (z2 && s6 && t6) {
            z = true;
        }
        bwt0.a0(this.r, z);
    }
}
