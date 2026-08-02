package com.vk.superapp.vkpay.checkout.feature.success.states;

import com.vkontakte.android.R;
import xsna.epx;
import xsna.ho8;

/* compiled from: StatusState.kt */
/* loaded from: classes6.dex */
public final class ErrorState extends StatusState {
    private final String subtitle;
    private final String title;

    public ErrorState(String str, String str2) {
        super(new Icon(R.drawable.vk_icon_error_outline_56, R.attr.vk_legacy_accent), str, str2);
        this.title = str;
        this.subtitle = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ErrorState)) {
            return false;
        }
        ErrorState errorState = (ErrorState) obj;
        return epx.f(this.title, errorState.title) && epx.f(this.subtitle, errorState.subtitle);
    }

    @Override // com.vk.superapp.vkpay.checkout.feature.success.states.StatusState
    public final String g() {
        return this.subtitle;
    }

    @Override // com.vk.superapp.vkpay.checkout.feature.success.states.StatusState
    public final String h() {
        return this.title;
    }

    public final int hashCode() {
        return this.subtitle.hashCode() + (this.title.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ErrorState(title=");
        sb.append(this.title);
        sb.append(", subtitle=");
        return ho8.a(sb, this.subtitle, ')');
    }
}
