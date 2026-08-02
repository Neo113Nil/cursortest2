package com.sofascore.results.feedback;

import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.util.Patterns;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.textfield.TextInputEditText;
import com.sofascore.model.network.post.FeedbackPost;
import com.sofascore.results.R;
import com.sofascore.results.base.BaseActivity;
import com.sofascore.results.feedback.FeedbackActivity;
import com.sofascore.results.view.SofaTextInputLayout;
import defpackage.ab;
import defpackage.aba;
import defpackage.au7;
import defpackage.ce;
import defpackage.de;
import defpackage.duf;
import defpackage.fd;
import defpackage.i63;
import defpackage.jr2;
import defpackage.kt4;
import defpackage.mqi;
import defpackage.otk;
import defpackage.oy7;
import defpackage.ql4;
import defpackage.qo6;
import defpackage.qy7;
import defpackage.y7;
import defpackage.ypa;
import defpackage.yx7;
import java.util.Calendar;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/sofascore/results/feedback/FeedbackActivity;", "Lcom/sofascore/results/base/BaseActivity;", "<init>", "()V", "mobile_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class FeedbackActivity extends Hilt_FeedbackActivity {
    public static final /* synthetic */ int M = 0;
    public final otk J = new otk(duf.a.getOrCreateKotlinClass(qy7.class), new oy7(this, 1), new oy7(this, 0), new oy7(this, 2));
    public final mqi K = ypa.b(new qo6(this, 24));
    public final de L = registerForActivityResult(new ce(3), new kt4(this, 19));

    public final fd M() {
        return (fd) this.K.getValue();
    }

    public final boolean N() {
        boolean matches = Patterns.EMAIL_ADDRESS.matcher(String.valueOf(M().e.getText())).matches();
        if (matches) {
            M().f.setError(null);
            return matches;
        }
        M().f.setError("*" + getString(R.string.feedback_enter_valid_email));
        return matches;
    }

    public final boolean O() {
        String valueOf = String.valueOf(M().c.getText());
        int length = valueOf.length() - 1;
        int i = 0;
        boolean z = false;
        while (i <= length) {
            boolean z2 = Intrinsics.d(valueOf.charAt(!z ? i : length), 32) <= 0;
            if (z) {
                if (!z2) {
                    break;
                }
                length--;
            } else if (z2) {
                i++;
            } else {
                z = true;
            }
        }
        boolean z3 = valueOf.subSequence(i, length + 1).toString().length() >= 10;
        if (z3) {
            M().d.setError(null);
            return z3;
        }
        M().d.setError(getString(R.string.feedback_text_condition));
        return z3;
    }

    @Override // com.sofascore.results.base.BaseActivity, com.sofascore.results.base.Hilt_BaseActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(M().a);
        this.o = M().l;
        G();
        CoordinatorLayout coordinatorLayout = M().a;
        coordinatorLayout.getClass();
        BaseActivity.r(this, coordinatorLayout);
        String string = getString(R.string.give_us_feedback);
        string.getClass();
        setTitle(string);
        fd M2 = M();
        final int i = 0;
        aba.y(M2.b, 0, 3);
        M2.b.setOnClickListener(new au7(4, M2, this));
        SofaTextInputLayout sofaTextInputLayout = M2.f;
        sofaTextInputLayout.setHelperText("*" + getString(R.string.feedback_required_field));
        sofaTextInputLayout.setHint(getString(R.string.feedback_your_email) + "*");
        M2.h.setOnClickListener(new View.OnClickListener(this) { // from class: ny7
            public final /* synthetic */ FeedbackActivity b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i2 = i;
                rq3 rq3Var = null;
                FeedbackActivity feedbackActivity = this.b;
                switch (i2) {
                    case 0:
                        int i3 = FeedbackActivity.M;
                        feedbackActivity.M().c.clearFocus();
                        feedbackActivity.M().e.clearFocus();
                        Intent intent = new Intent("android.intent.action.PICK");
                        intent.setType("image/*");
                        feedbackActivity.L.a(intent, null);
                        break;
                    case 1:
                        int i4 = FeedbackActivity.M;
                        feedbackActivity.M().e.clearFocus();
                        boolean N = feedbackActivity.N();
                        boolean O = feedbackActivity.O();
                        if (N && O) {
                            String obj = StringsKt.l0(String.valueOf(feedbackActivity.M().c.getText())).toString();
                            String valueOf = String.valueOf(feedbackActivity.M().e.getText());
                            qy7 qy7Var = (qy7) feedbackActivity.J.getValue();
                            obj.getClass();
                            Calendar calendar = ke0.a;
                            String d = ke0.d(qy7Var.i());
                            String i5 = wv8.i(Build.MANUFACTURER, " - ", Build.MODEL);
                            xw3.L(qy7Var.h(), null, null, new yp7(qy7Var, new FeedbackPost(d, Integer.parseInt(iii.H(6, "260720003")), valueOf, vxd.k(Build.VERSION.SDK_INT, "Android ", Build.VERSION.RELEASE, " (", ")"), i5, obj), rq3Var, 7), 3);
                            ke0.f(R.string.feedback_thank_you_message, feedbackActivity);
                            feedbackActivity.finish();
                            break;
                        }
                        break;
                    default:
                        int i6 = FeedbackActivity.M;
                        fd M3 = feedbackActivity.M();
                        ((qy7) feedbackActivity.J.getValue()).f.j(null);
                        M3.g.setImageBitmap(null);
                        break;
                }
            }
        });
        final int i2 = 1;
        M2.k.setOnClickListener(new View.OnClickListener(this) { // from class: ny7
            public final /* synthetic */ FeedbackActivity b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i22 = i2;
                rq3 rq3Var = null;
                FeedbackActivity feedbackActivity = this.b;
                switch (i22) {
                    case 0:
                        int i3 = FeedbackActivity.M;
                        feedbackActivity.M().c.clearFocus();
                        feedbackActivity.M().e.clearFocus();
                        Intent intent = new Intent("android.intent.action.PICK");
                        intent.setType("image/*");
                        feedbackActivity.L.a(intent, null);
                        break;
                    case 1:
                        int i4 = FeedbackActivity.M;
                        feedbackActivity.M().e.clearFocus();
                        boolean N = feedbackActivity.N();
                        boolean O = feedbackActivity.O();
                        if (N && O) {
                            String obj = StringsKt.l0(String.valueOf(feedbackActivity.M().c.getText())).toString();
                            String valueOf = String.valueOf(feedbackActivity.M().e.getText());
                            qy7 qy7Var = (qy7) feedbackActivity.J.getValue();
                            obj.getClass();
                            Calendar calendar = ke0.a;
                            String d = ke0.d(qy7Var.i());
                            String i5 = wv8.i(Build.MANUFACTURER, " - ", Build.MODEL);
                            xw3.L(qy7Var.h(), null, null, new yp7(qy7Var, new FeedbackPost(d, Integer.parseInt(iii.H(6, "260720003")), valueOf, vxd.k(Build.VERSION.SDK_INT, "Android ", Build.VERSION.RELEASE, " (", ")"), i5, obj), rq3Var, 7), 3);
                            ke0.f(R.string.feedback_thank_you_message, feedbackActivity);
                            feedbackActivity.finish();
                            break;
                        }
                        break;
                    default:
                        int i6 = FeedbackActivity.M;
                        fd M3 = feedbackActivity.M();
                        ((qy7) feedbackActivity.J.getValue()).f.j(null);
                        M3.g.setImageBitmap(null);
                        break;
                }
            }
        });
        final int i3 = 2;
        M2.i.setOnClickListener(new View.OnClickListener(this) { // from class: ny7
            public final /* synthetic */ FeedbackActivity b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                int i22 = i3;
                rq3 rq3Var = null;
                FeedbackActivity feedbackActivity = this.b;
                switch (i22) {
                    case 0:
                        int i32 = FeedbackActivity.M;
                        feedbackActivity.M().c.clearFocus();
                        feedbackActivity.M().e.clearFocus();
                        Intent intent = new Intent("android.intent.action.PICK");
                        intent.setType("image/*");
                        feedbackActivity.L.a(intent, null);
                        break;
                    case 1:
                        int i4 = FeedbackActivity.M;
                        feedbackActivity.M().e.clearFocus();
                        boolean N = feedbackActivity.N();
                        boolean O = feedbackActivity.O();
                        if (N && O) {
                            String obj = StringsKt.l0(String.valueOf(feedbackActivity.M().c.getText())).toString();
                            String valueOf = String.valueOf(feedbackActivity.M().e.getText());
                            qy7 qy7Var = (qy7) feedbackActivity.J.getValue();
                            obj.getClass();
                            Calendar calendar = ke0.a;
                            String d = ke0.d(qy7Var.i());
                            String i5 = wv8.i(Build.MANUFACTURER, " - ", Build.MODEL);
                            xw3.L(qy7Var.h(), null, null, new yp7(qy7Var, new FeedbackPost(d, Integer.parseInt(iii.H(6, "260720003")), valueOf, vxd.k(Build.VERSION.SDK_INT, "Android ", Build.VERSION.RELEASE, " (", ")"), i5, obj), rq3Var, 7), 3);
                            ke0.f(R.string.feedback_thank_you_message, feedbackActivity);
                            feedbackActivity.finish();
                            break;
                        }
                        break;
                    default:
                        int i6 = FeedbackActivity.M;
                        fd M3 = feedbackActivity.M();
                        ((qy7) feedbackActivity.J.getValue()).f.j(null);
                        M3.g.setImageBitmap(null);
                        break;
                }
            }
        });
        M2.e.addTextChangedListener(new ql4(this, i2));
        TextInputEditText textInputEditText = M2.c;
        textInputEditText.setOnTouchListener(new ab(3));
        textInputEditText.setOnFocusChangeListener(new jr2(this, 5));
        textInputEditText.addTextChangedListener(new i63(i3, M2, this));
        ((qy7) this.J.getValue()).g.e(this, new y7(25, new yx7(this, 3)));
    }

    @Override // com.sofascore.results.base.BaseActivity
    public final String u() {
        return "FeedbackScreen";
    }
}
