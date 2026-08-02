package com.sofascore.results.main;

import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.SharedPreferences;
import android.net.Uri;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import com.sofascore.results.R;
import com.sofascore.results.main.PopUpActivity;
import defpackage.a5f;
import defpackage.k1f;
import defpackage.uic;
import kotlin.Unit;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public class PopUpActivity extends AppCompatActivity {
    public static final /* synthetic */ int s = 0;
    public String i;
    public String j;
    public String k;
    public String l;
    public String m;
    public String n;
    public int o;
    public String p;
    public String q;
    public k1f r;

    /* JADX WARN: Type inference failed for: r5v5, types: [k1f] */
    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(Bundle bundle) {
        String str;
        super.onCreate(bundle);
        getWindow().setFlags(32, 32);
        setContentView(R.layout.activity_popup);
        final int i = 0;
        switch (getIntent().getIntExtra("POPUP_TYPE", 0)) {
            case 300:
                p();
                break;
            case MRAID_ERROR_VALUE:
                this.o = getIntent().getIntExtra("POPUP_NOTIFICATION_ID", 0);
                p();
                int i2 = this.o;
                if (i2 != 0) {
                    SharedPreferences sharedPreferences = uic.j;
                    if (sharedPreferences == null) {
                        Context applicationContext = getApplicationContext();
                        synchronized (uic.i) {
                            sharedPreferences = a5f.d(applicationContext);
                            uic.j = sharedPreferences;
                        }
                        sharedPreferences.getClass();
                    }
                    SharedPreferences.Editor edit = sharedPreferences.edit();
                    edit.getClass();
                    edit.putInt("LAST_SYSTEM_NOTIFICATION2", i2);
                    Unit unit = Unit.a;
                    edit.apply();
                    break;
                }
                break;
            case INVALID_IFA_STATUS_VALUE:
                this.i = getIntent().getStringExtra("TITLE_POPUP");
                this.j = getIntent().getStringExtra("SUBTITLE_POPUP");
                this.k = getIntent().getStringExtra("INFO_POPUP");
                this.l = getIntent().getStringExtra("DOWNLOAD_POPUP");
                break;
        }
        this.r = new DialogInterface.OnClickListener(this) { // from class: k1f
            public final /* synthetic */ PopUpActivity b;

            {
                this.b = this;
            }

            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i3) {
                int i4 = i;
                PopUpActivity popUpActivity = this.b;
                switch (i4) {
                    case 0:
                        int i5 = PopUpActivity.s;
                        try {
                            String str2 = popUpActivity.l;
                            if (str2 != null && !str2.isEmpty()) {
                                bea.G(popUpActivity, popUpActivity.l);
                            } else if (popUpActivity.p != null) {
                                popUpActivity.startActivity(popUpActivity.getPackageManager().getLaunchIntentForPackage(popUpActivity.p));
                            } else if (popUpActivity.q != null) {
                                popUpActivity.startActivity(new Intent("android.intent.action.UNINSTALL_PACKAGE", Uri.parse("package:" + popUpActivity.q)));
                            }
                        } catch (Exception e) {
                            s38.a().c(e);
                        }
                        popUpActivity.finish();
                        break;
                    default:
                        int i6 = PopUpActivity.s;
                        popUpActivity.finish();
                        break;
                }
            }
        };
        AlertDialog create = new AlertDialog.Builder(this, R.style.DialogStyle).create();
        View inflate = LayoutInflater.from(this).inflate(R.layout.dialog_sofa_info, (ViewGroup) null);
        create.setView(inflate);
        final int i3 = 1;
        create.setCanceledOnTouchOutside(true);
        create.setOnCancelListener(new DialogInterface.OnCancelListener() { // from class: l1f
            @Override // android.content.DialogInterface.OnCancelListener
            public final void onCancel(DialogInterface dialogInterface) {
                int i4 = PopUpActivity.s;
                PopUpActivity.this.finish();
            }
        });
        TextView textView = (TextView) inflate.findViewById(R.id.dialog_info_subtitle);
        TextView textView2 = (TextView) inflate.findViewById(R.id.dialog_info_text);
        String str2 = this.i;
        if (str2 != null) {
            create.setTitle(str2);
        }
        String str3 = this.j;
        if (str3 != null) {
            textView.setText(str3);
        }
        String str4 = this.k;
        if (str4 != null) {
            textView2.setText(str4);
        } else {
            textView2.setVisibility(8);
        }
        String str5 = this.n;
        if (str5 == null) {
            str5 = getResources().getString(R.string.ok);
        }
        create.setButton(-2, str5, new DialogInterface.OnClickListener(this) { // from class: k1f
            public final /* synthetic */ PopUpActivity b;

            {
                this.b = this;
            }

            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i32) {
                int i4 = i3;
                PopUpActivity popUpActivity = this.b;
                switch (i4) {
                    case 0:
                        int i5 = PopUpActivity.s;
                        try {
                            String str22 = popUpActivity.l;
                            if (str22 != null && !str22.isEmpty()) {
                                bea.G(popUpActivity, popUpActivity.l);
                            } else if (popUpActivity.p != null) {
                                popUpActivity.startActivity(popUpActivity.getPackageManager().getLaunchIntentForPackage(popUpActivity.p));
                            } else if (popUpActivity.q != null) {
                                popUpActivity.startActivity(new Intent("android.intent.action.UNINSTALL_PACKAGE", Uri.parse("package:" + popUpActivity.q)));
                            }
                        } catch (Exception e) {
                            s38.a().c(e);
                        }
                        popUpActivity.finish();
                        break;
                    default:
                        int i6 = PopUpActivity.s;
                        popUpActivity.finish();
                        break;
                }
            }
        });
        if ((this.l != null || this.p != null || this.q != null) && (str = this.m) != null) {
            create.setButton(-1, str, this.r);
        }
        create.show();
    }

    public final void p() {
        this.i = getIntent().getStringExtra("TITLE_POPUP");
        this.j = getIntent().getStringExtra("SUBTITLE_POPUP");
        this.l = getIntent().getStringExtra("DOWNLOAD_POPUP");
        this.m = getIntent().getStringExtra("OK_POPUP");
        this.p = getIntent().getStringExtra("OPEN_PACKAGE_POPUP");
        this.q = getIntent().getStringExtra("DELETE_PACKAGE_POPUP");
        this.n = getIntent().getStringExtra("CANCEL_POPUP");
    }
}
