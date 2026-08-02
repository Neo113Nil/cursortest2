package com.safedk.android.utils;

import android.content.Context;
import android.widget.Toast;
import com.safedk.android.SafeDK;

/* loaded from: classes6.dex */
public class m implements Runnable {
    String a;
    String b;

    public m(String str) {
        this(str, null);
    }

    public m(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    @Override // java.lang.Runnable
    public void run() {
        String str;
        Context m = SafeDK.getInstance().m();
        StringBuilder sb = new StringBuilder();
        sb.append("SDK '");
        sb.append(this.a);
        sb.append("' ");
        if (this.b == null) {
            str = "";
        } else {
            str = "Toggle '" + this.b + "'";
        }
        sb.append(str);
        sb.append(" blocked by SafeDK");
        Toast.makeText(m, sb.toString(), 0).show();
    }
}
