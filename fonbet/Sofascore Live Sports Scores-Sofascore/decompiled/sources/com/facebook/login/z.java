package com.facebook.login;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import androidx.fragment.app.FragmentActivity;
import com.facebook.internal.s0;
import defpackage.bf3;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public final class z extends s0 {
    public static final /* synthetic */ int o = 0;
    public final String n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z(FragmentActivity fragmentActivity, String str, String str2) {
        super(fragmentActivity, str);
        fragmentActivity.getClass();
        str.getClass();
        str2.getClass();
        this.n = str2;
        this.b = str2;
    }

    @Override // com.facebook.internal.s0
    public final Bundle c(String str) {
        String str2 = this.n;
        if (str2.length() <= 0 || !kotlin.text.c.v(str, str2, false)) {
            return super.c(str);
        }
        try {
            Intent intent = new Intent("android.intent.action.VIEW", Uri.parse(str));
            intent.addFlags(268435456);
            getContext().startActivity(intent);
            dismiss();
        } catch (Exception e) {
            e(new com.facebook.o(bf3.j(e, new StringBuilder("Failed to launch custom redirect: ")), -1, str));
        }
        return new Bundle();
    }
}
