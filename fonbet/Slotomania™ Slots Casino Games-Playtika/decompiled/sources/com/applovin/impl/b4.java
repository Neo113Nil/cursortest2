package com.applovin.impl;

import android.content.Context;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.SpannedString;
import android.text.TextUtils;
import androidx.core.internal.view.SupportMenu;
import androidx.core.view.ViewCompat;
import com.applovin.impl.g3;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.impl.t2;
import com.applovin.sdk.R;

/* loaded from: classes5.dex */
public class b4 extends t2 {
    private final g3 n;
    private final Context o;

    public b4(g3 g3Var, Context context) {
        super(t2.c.DETAIL);
        this.n = g3Var;
        this.o = context;
        this.c = t();
        this.d = s();
    }

    private SpannedString q() {
        if (!this.n.z()) {
            return StringUtils.createListItemDetailSpannedString("Adapter Missing", SupportMenu.CATEGORY_MASK);
        }
        if (TextUtils.isEmpty(this.n.c())) {
            return StringUtils.createListItemDetailSpannedString("Adapter Found", ViewCompat.MEASURED_STATE_MASK);
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(StringUtils.createListItemDetailSubSpannedString("ADAPTER  ", -7829368));
        spannableStringBuilder.append((CharSequence) StringUtils.createListItemDetailSpannedString(this.n.c(), ViewCompat.MEASURED_STATE_MASK));
        if (this.n.A()) {
            spannableStringBuilder.append((CharSequence) StringUtils.createListItemDetailSubSpannedString("  LATEST  ", this.o.getColor(R.color.applovin_sdk_orangeColor)));
            spannableStringBuilder.append((CharSequence) StringUtils.createListItemDetailSpannedString(this.n.k(), ViewCompat.MEASURED_STATE_MASK));
        }
        if (!this.n.B()) {
            spannableStringBuilder.append((CharSequence) new SpannableString("\n"));
            spannableStringBuilder.append((CharSequence) StringUtils.createListItemDetailSubSpannedString("INCOMPATIBLE WITH MAX SDK VERSION", SupportMenu.CATEGORY_MASK));
        }
        return new SpannedString(spannableStringBuilder);
    }

    private SpannedString s() {
        if (!o()) {
            return null;
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        spannableStringBuilder.append((CharSequence) u());
        spannableStringBuilder.append((CharSequence) new SpannableString("\n"));
        spannableStringBuilder.append((CharSequence) q());
        if (this.n.q() == g3.a.INVALID_INTEGRATION) {
            spannableStringBuilder.append((CharSequence) new SpannableString("\n"));
            spannableStringBuilder.append((CharSequence) StringUtils.createListItemDetailSpannedString("Invalid Integration", SupportMenu.CATEGORY_MASK));
        } else if (this.n.q() == g3.a.INCOMPLETE_INTEGRATION && this.n.E()) {
            spannableStringBuilder.append((CharSequence) new SpannableString("\n"));
            spannableStringBuilder.append((CharSequence) StringUtils.createListItemDetailSpannedString("Mismatched SDK/Adapter Versions", SupportMenu.CATEGORY_MASK));
        }
        return new SpannedString(spannableStringBuilder);
    }

    private SpannedString t() {
        return StringUtils.createSpannedString(this.n.g(), o() ? ViewCompat.MEASURED_STATE_MASK : -7829368, 18, 1);
    }

    private SpannedString u() {
        if (!this.n.F()) {
            return StringUtils.createListItemDetailSpannedString("SDK Missing", SupportMenu.CATEGORY_MASK);
        }
        if (!StringUtils.isValidString(this.n.p())) {
            return StringUtils.createListItemDetailSpannedString(this.n.z() ? "Retrieving SDK Version..." : "SDK Found", ViewCompat.MEASURED_STATE_MASK);
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(StringUtils.createListItemDetailSubSpannedString("SDK\t\t\t\t\t  ", -7829368));
        spannableStringBuilder.append((CharSequence) StringUtils.createListItemDetailSpannedString(this.n.p(), ViewCompat.MEASURED_STATE_MASK));
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
    public int h() {
        int h = this.n.h();
        return h > 0 ? h : R.drawable.applovin_ic_mediation_placeholder;
    }

    @Override // com.applovin.impl.t2
    public boolean o() {
        return this.n.q() != g3.a.MISSING;
    }

    public g3 r() {
        return this.n;
    }

    public String toString() {
        return "MediatedNetworkListItemViewModel{text=" + ((Object) this.c) + ", detailText=" + ((Object) this.d) + ", network=" + this.n + "}";
    }
}
