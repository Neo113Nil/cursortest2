package com.fyber.inneractive.sdk.player.controller;

import android.app.Dialog;
import android.content.Context;
import android.text.TextUtils;
import android.widget.Button;
import android.widget.TextView;
import com.fyber.inneractive.sdk.R;
import com.fyber.inneractive.sdk.util.i1;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public final class f0 {
    public final v a;
    public final Dialog b;

    public f0(Context context, com.fyber.inneractive.sdk.config.global.features.c cVar, v vVar) {
        this.a = vVar;
        Dialog dialog = new Dialog(context);
        this.b = dialog;
        dialog.requestWindowFeature(1);
        dialog.setContentView(R.layout.ia_layout_skip_rewarded_dialog);
        Button button = (Button) dialog.findViewById(R.id.ia_keep_watching_button);
        Button button2 = (Button) dialog.findViewById(R.id.ia_close_button);
        TextView textView = (TextView) dialog.findViewById(R.id.ia_skip_dialog_title_textview);
        TextView textView2 = (TextView) dialog.findViewById(R.id.ia_skip_dialog_sub_title_textview);
        String string = context.getString(R.string.ia_skip_rewarded_dialog_keep_watching);
        String string2 = context.getString(R.string.ia_skip_rewarded_dialog_close_button);
        String string3 = context.getString(R.string.ia_skip_rewarded_dialog_title);
        String string4 = context.getString(R.string.ia_skip_rewarded_dialog_sub_title);
        if (cVar != null) {
            String a = cVar.a("skip_reward_dialog_keep_watching_button", "Resume");
            String trim = a.trim().length() > 0 ? a.trim() : "Resume";
            string = TextUtils.isEmpty(trim) ? string : trim;
            String a2 = cVar.a("skip_reward_dialog_close_button", "Close");
            String trim2 = a2.trim().length() > 0 ? a2.trim() : "Close";
            string2 = TextUtils.isEmpty(trim2) ? string2 : trim2;
            String a3 = cVar.a("skip_reward_dialog_title", "Close Video?");
            String trim3 = a3.trim().length() > 0 ? a3.trim() : "Close Video?";
            string3 = TextUtils.isEmpty(trim3) ? string3 : trim3;
            String a4 = cVar.a("skip_reward_dialog_sub_title", "You will lose your reward");
            String trim4 = a4.trim().length() > 0 ? a4.trim() : "You will lose your reward";
            if (!TextUtils.isEmpty(trim4)) {
                string4 = trim4;
            }
        }
        button.setText(i1.a(string, 13));
        button2.setText(i1.a(string2, 13));
        textView.setText(i1.a(string3, 20));
        textView2.setText(i1.a(string4, 100));
        button2.setOnClickListener(new d0(this));
        button.setOnClickListener(new e0(this));
    }
}
