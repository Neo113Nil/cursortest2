package com.sofascore.results.venue.editvenue;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.core.widget.NestedScrollView;
import com.google.android.material.textfield.TextInputEditText;
import com.sofascore.model.mvvm.model.Stadium;
import com.sofascore.model.mvvm.model.Venue;
import com.sofascore.model.newNetwork.post.VenueSuggestPostBody;
import com.sofascore.results.R;
import com.sofascore.results.view.SofaTextInputLayout;
import defpackage.duf;
import defpackage.ei5;
import defpackage.fi5;
import defpackage.hi5;
import defpackage.j63;
import defpackage.joa;
import defpackage.krk;
import defpackage.m15;
import defpackage.nq8;
import defpackage.ok0;
import defpackage.otk;
import defpackage.p24;
import defpackage.rq3;
import defpackage.wj9;
import defpackage.xw3;
import defpackage.yhk;
import defpackage.ypa;
import defpackage.ysa;
import defpackage.yzc;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/sofascore/results/venue/editvenue/EditVenueDialog;", "Lcom/sofascore/results/dialog/BaseSuggestChangesDialog;", "Lm15;", "<init>", "()V", "mobile_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class EditVenueDialog extends Hilt_EditVenueDialog<m15> {
    public final otk D;

    public EditVenueDialog() {
        joa a = ypa.a(ysa.c, new j63(new j63(this, 19), 20));
        this.D = new otk(duf.a.getOrCreateKotlinClass(hi5.class), new p24(a, 17), new fi5(this, a, 0), new p24(a, 18));
    }

    @Override // com.sofascore.results.dialog.BaseSuggestChangesDialog
    /* renamed from: B, reason: merged with bridge method [inline-methods] */
    public final hi5 v() {
        return (hi5) this.D.getValue();
    }

    @Override // com.sofascore.results.dialog.BaseFullScreenDialog
    public final String q() {
        return "EditVenueModal";
    }

    @Override // com.sofascore.results.dialog.BaseSuggestChangesDialog
    public final boolean w() {
        return false;
    }

    @Override // com.sofascore.results.dialog.BaseSuggestChangesDialog
    public final krk x(LayoutInflater layoutInflater, NestedScrollView nestedScrollView) {
        layoutInflater.getClass();
        View inflate = layoutInflater.inflate(R.layout.dialog_edit_venue_content, (ViewGroup) nestedScrollView, false);
        int i = R.id.input_update_venue_name;
        if (((SofaTextInputLayout) nq8.B(R.id.input_update_venue_name, inflate)) != null) {
            i = R.id.input_venue_capacity;
            if (((SofaTextInputLayout) nq8.B(R.id.input_venue_capacity, inflate)) != null) {
                i = R.id.update_venue_name;
                TextInputEditText textInputEditText = (TextInputEditText) nq8.B(R.id.update_venue_name, inflate);
                if (textInputEditText != null) {
                    i = R.id.venue_capacity;
                    TextInputEditText textInputEditText2 = (TextInputEditText) nq8.B(R.id.venue_capacity, inflate);
                    if (textInputEditText2 != null) {
                        return new m15((LinearLayout) inflate, textInputEditText, textInputEditText2);
                    }
                }
            }
        }
        yhk.s("Missing required view with ID: ".concat(inflate.getResources().getResourceName(i)));
        return null;
    }

    @Override // com.sofascore.results.dialog.BaseSuggestChangesDialog
    public final void y() {
        Stadium stadium;
        m15 m15Var = (m15) this.w;
        if (m15Var != null) {
            TextInputEditText textInputEditText = m15Var.b;
            TextInputEditText textInputEditText2 = m15Var.c;
            textInputEditText.addTextChangedListener(new ei5(this, 0));
            Venue venue = v().g;
            textInputEditText.setText((venue == null || (stadium = venue.getStadium()) == null) ? null : stadium.getName());
            textInputEditText2.addTextChangedListener(new ei5(this, 1));
            textInputEditText2.setEnabled(v().g != null);
            Integer num = v().h;
            textInputEditText2.setText(num != null ? String.valueOf(num.intValue()) : null);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:9:0x0021, code lost:
    
        if (r2.equalsIgnoreCase(r3) == false) goto L14;
     */
    @Override // com.sofascore.results.dialog.BaseSuggestChangesDialog
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void z() {
        Stadium stadium;
        Stadium stadium2;
        hi5 v = v();
        wj9 wj9Var = v.e;
        Venue venue = v.g;
        String str = v.i;
        rq3 rq3Var = null;
        if (str != null) {
            if (venue == null || (stadium2 = venue.getStadium()) == null || (r3 = stadium2.getName()) == null) {
                String str2 = "";
            }
        }
        str = null;
        Integer num = v.h;
        if (Intrinsics.c((venue == null || (stadium = venue.getStadium()) == null) ? null : stadium.getCapacity(), v.h)) {
            num = null;
        }
        VenueSuggestPostBody venueSuggestPostBody = new VenueSuggestPostBody(str, num);
        if (venueSuggestPostBody.getEmpty()) {
            ((yzc) wj9Var.b).j(Boolean.FALSE);
            return;
        }
        Integer valueOf = venue != null ? Integer.valueOf(venue.getId()) : null;
        if (valueOf != null) {
            if (venueSuggestPostBody.getEmpty()) {
                valueOf = null;
            }
            if (valueOf != null) {
                xw3.L(v.h(), null, null, new ok0(v, venueSuggestPostBody, valueOf.intValue(), rq3Var, 12), 3);
            }
        }
        ((yzc) wj9Var.b).j(Boolean.TRUE);
    }
}
