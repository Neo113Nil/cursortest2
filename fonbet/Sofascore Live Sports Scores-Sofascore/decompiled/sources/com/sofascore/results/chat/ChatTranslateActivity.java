package com.sofascore.results.chat;

import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import com.sofascore.results.R;
import com.sofascore.results.mvvm.base.AbstractActivity;
import defpackage.ao2;
import defpackage.dmi;
import defpackage.duf;
import defpackage.fc6;
import defpackage.haa;
import defpackage.in;
import defpackage.ks2;
import defpackage.ls2;
import defpackage.mqi;
import defpackage.ms2;
import defpackage.ns2;
import defpackage.otk;
import defpackage.ox1;
import defpackage.s0;
import defpackage.t25;
import defpackage.ua5;
import defpackage.uaa;
import defpackage.y7;
import defpackage.yhk;
import defpackage.yj1;
import defpackage.ypa;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003B\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lcom/sofascore/results/chat/ChatTranslateActivity;", "Lcom/sofascore/results/mvvm/base/AbstractActivity;", "Landroid/widget/RadioGroup$OnCheckedChangeListener;", "Landroid/view/View$OnClickListener;", "<init>", "()V", "Landroid/view/View;", "v", "", "onClick", "(Landroid/view/View;)V", "mobile_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class ChatTranslateActivity extends AbstractActivity implements RadioGroup.OnCheckedChangeListener, View.OnClickListener {
    public static final /* synthetic */ int M = 0;
    public final otk J = new otk(duf.a.getOrCreateKotlinClass(ms2.class), new ks2(this, 1), new ks2(this, 0), new ks2(this, 2));
    public final mqi K = ypa.b(new yj1(this, 20));
    public final ArrayList L = ns2.c;

    public final void Q(String str, String str2, Boolean bool) {
        String upperCase;
        LayoutInflater layoutInflater = getLayoutInflater();
        RadioGroup radioGroup = R().d;
        View inflate = layoutInflater.inflate(R.layout.item_translate_radio, (ViewGroup) radioGroup, false);
        radioGroup.addView(inflate);
        if (inflate == null) {
            yhk.s("rootView");
            return;
        }
        RadioButton radioButton = (RadioButton) inflate;
        radioButton.setId(View.generateViewId());
        radioButton.setText(str);
        if (str2 != null) {
            Map map = ns2.a;
            if (str2.equals("en")) {
                upperCase = "GB";
            } else {
                Locale locale = Locale.US;
                locale.getClass();
                upperCase = str2.toUpperCase(locale);
                upperCase.getClass();
            }
            String n = fc6.n((Intrinsics.c(uaa.c, "api.sofascore.com/") ? "https://img.sofascore.com/" : dmi.q("https://", uaa.c)).concat("api/v1/"), "country/", upperCase, "/flag");
            ua5 ua5Var = ua5.a;
            int s = ao2.s(24, this);
            t25.a(s);
            haa.q(radioButton, n, ua5Var, new t25(s));
        } else {
            Drawable drawable = getDrawable(R.drawable.ic_translate);
            if (drawable != null) {
                drawable.setTint(getColor(R.color.neutral_default));
            } else {
                drawable = null;
            }
            radioButton.setCompoundDrawablesRelativeWithIntrinsicBounds(drawable, (Drawable) null, (Drawable) null, (Drawable) null);
        }
        radioButton.setChecked(bool.booleanValue());
    }

    public final ls2 R() {
        return (ls2) this.K.getValue();
    }

    public final ms2 S() {
        return (ms2) this.J.getValue();
    }

    @Override // android.app.Activity
    public final void finish() {
        S().k();
        Intent intent = new Intent();
        intent.putExtra("LANGUAGE", S().i);
        Object d = S().h.d();
        d.getClass();
        intent.putExtra("EXCLUDED_LIST", (Serializable) d);
        setResult(-1, intent);
        super.finish();
    }

    @Override // android.widget.RadioGroup.OnCheckedChangeListener
    public final void onCheckedChanged(RadioGroup radioGroup, int i) {
        radioGroup.getClass();
        Locale locale = (Locale) CollectionsKt.a0(radioGroup.indexOfChild(radioGroup.findViewById(i)) - 1, this.L);
        ms2 S = S();
        String language = locale != null ? locale.getLanguage() : null;
        S.i = language;
        SharedPreferences.Editor edit = S.e.edit();
        edit.getClass();
        edit.putString("LANGUAGE", language);
        edit.apply();
    }

    @Override // android.view.View.OnClickListener
    public void onClick(@NotNull View v) {
        v.getClass();
        R().c.removeView(v);
        ms2 S = S();
        Object tag = v.getTag();
        tag.getClass();
        Set set = S.f;
        set.remove((String) tag);
        S.g.j(set);
        S().k();
    }

    @Override // com.sofascore.results.mvvm.base.AbstractActivity, com.sofascore.results.base.BaseActivity, com.sofascore.results.base.Hilt_BaseActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R().a);
        String string = getString(R.string.translate);
        string.getClass();
        setTitle(string);
        String string2 = getString(R.string.do_not_translate);
        string2.getClass();
        Q(string2, null, Boolean.TRUE);
        Iterator it = this.L.iterator();
        while (it.hasNext()) {
            Locale locale = (Locale) it.next();
            String displayName = locale.getDisplayName();
            displayName.getClass();
            Q(displayName, locale.getLanguage(), Boolean.valueOf(Intrinsics.c(locale.getLanguage(), S().i)));
        }
        R().d.setOnCheckedChangeListener(this);
        R().b.setOnClickListener(new s0(this, 13));
        R().c.setOnCheckedChangeListener(new in(this, 1));
        S().h.e(this, new y7(8, new ox1(this, 17)));
    }

    @Override // com.sofascore.results.base.BaseActivity
    public final String u() {
        return "ChatTranslateScreen";
    }

    @Override // com.sofascore.results.mvvm.base.AbstractActivity
    public final void N() {
    }
}
