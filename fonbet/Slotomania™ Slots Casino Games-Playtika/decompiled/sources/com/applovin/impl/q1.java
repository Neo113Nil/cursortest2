package com.applovin.impl;

import android.content.Context;
import android.text.SpannableStringBuilder;
import android.text.SpannedString;
import com.applovin.impl.t2;
import com.applovin.sdk.R;

/* loaded from: classes3.dex */
public class q1 extends t2 {
    private final r1 n;
    private final Context o;

    public q1(r1 r1Var, Context context) {
        super(t2.c.DETAIL);
        this.n = r1Var;
        this.o = context;
        this.c = r();
        this.d = q();
    }

    private SpannedString q() {
        return new SpannedString("Displayed " + q7.a(this.n.b(), true));
    }

    private SpannedString r() {
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        spannableStringBuilder.append((CharSequence) this.n.d());
        spannableStringBuilder.append((CharSequence) " - ");
        spannableStringBuilder.append((CharSequence) this.n.f());
        return new SpannedString(spannableStringBuilder);
    }

    @Override // com.applovin.impl.t2
    public int d() {
        return o() ? R.drawable.applovin_ic_disclosure_arrow : super.h();
    }

    @Override // com.applovin.impl.t2
    public int e() {
        return this.o.getColor(R.color.applovin_sdk_disclosureButtonColor);
    }

    @Override // com.applovin.impl.t2
    public boolean o() {
        return true;
    }
}
