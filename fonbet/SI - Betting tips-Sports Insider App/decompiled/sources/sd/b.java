package sd;

import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.method.LinkMovementMethod;
import android.view.Window;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.sports.insider.R;
import gf.q;
import gf.u;
import hg.t0;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import rc.x;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class b extends Dialog {

    /* renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ int f23471d = 0;

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f23472a;

    /* renamed from: b, reason: collision with root package name */
    public kf.f f23473b;

    /* renamed from: c, reason: collision with root package name */
    public Bundle f23474c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(Context context, int i5) {
        super(context);
        this.f23472a = i5;
        switch (i5) {
            case 1:
                Intrinsics.checkNotNullParameter(context, "context");
                super(context);
                requestWindowFeature(1);
                setContentView(R.layout.error_billing_dialog);
                FrameLayout frameLayout = (FrameLayout) findViewById(R.id.ok);
                if (frameLayout != null) {
                    final int i10 = 0;
                    io.sentry.config.a.y(frameLayout, 600L, new Function1(this) { // from class: sd.c

                        /* renamed from: b, reason: collision with root package name */
                        public final /* synthetic */ b f23476b;

                        {
                            this.f23476b = this;
                        }

                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            switch (i10) {
                                case 0:
                                    b bVar = this.f23476b;
                                    bVar.a(false);
                                    bVar.dismiss();
                                    break;
                                case 1:
                                    b bVar2 = this.f23476b;
                                    Bundle bundle = bVar2.f23474c;
                                    if (bundle != null) {
                                        bundle.putString("click", "support");
                                    }
                                    bVar2.a(true);
                                    bVar2.dismiss();
                                    break;
                                default:
                                    b bVar3 = this.f23476b;
                                    Bundle bundle2 = bVar3.f23474c;
                                    if (bundle2 != null) {
                                        bundle2.putString("click", "checkAuthGP");
                                    }
                                    bVar3.a(true);
                                    bVar3.dismiss();
                                    break;
                            }
                            return Unit.f19194a;
                        }
                    });
                }
                FrameLayout frameLayout2 = (FrameLayout) findViewById(R.id.support);
                if (frameLayout2 != null) {
                    final int i11 = 1;
                    io.sentry.config.a.y(frameLayout2, 600L, new Function1(this) { // from class: sd.c

                        /* renamed from: b, reason: collision with root package name */
                        public final /* synthetic */ b f23476b;

                        {
                            this.f23476b = this;
                        }

                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            switch (i11) {
                                case 0:
                                    b bVar = this.f23476b;
                                    bVar.a(false);
                                    bVar.dismiss();
                                    break;
                                case 1:
                                    b bVar2 = this.f23476b;
                                    Bundle bundle = bVar2.f23474c;
                                    if (bundle != null) {
                                        bundle.putString("click", "support");
                                    }
                                    bVar2.a(true);
                                    bVar2.dismiss();
                                    break;
                                default:
                                    b bVar3 = this.f23476b;
                                    Bundle bundle2 = bVar3.f23474c;
                                    if (bundle2 != null) {
                                        bundle2.putString("click", "checkAuthGP");
                                    }
                                    bVar3.a(true);
                                    bVar3.dismiss();
                                    break;
                            }
                            return Unit.f19194a;
                        }
                    });
                }
                FrameLayout frameLayout3 = (FrameLayout) findViewById(R.id.checkAuthGP);
                if (frameLayout3 != null) {
                    final int i12 = 2;
                    io.sentry.config.a.y(frameLayout3, 600L, new Function1(this) { // from class: sd.c

                        /* renamed from: b, reason: collision with root package name */
                        public final /* synthetic */ b f23476b;

                        {
                            this.f23476b = this;
                        }

                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            switch (i12) {
                                case 0:
                                    b bVar = this.f23476b;
                                    bVar.a(false);
                                    bVar.dismiss();
                                    break;
                                case 1:
                                    b bVar2 = this.f23476b;
                                    Bundle bundle = bVar2.f23474c;
                                    if (bundle != null) {
                                        bundle.putString("click", "support");
                                    }
                                    bVar2.a(true);
                                    bVar2.dismiss();
                                    break;
                                default:
                                    b bVar3 = this.f23476b;
                                    Bundle bundle2 = bVar3.f23474c;
                                    if (bundle2 != null) {
                                        bundle2.putString("click", "checkAuthGP");
                                    }
                                    bVar3.a(true);
                                    bVar3.dismiss();
                                    break;
                            }
                            return Unit.f19194a;
                        }
                    });
                }
                Window window = getWindow();
                if (window != null) {
                    window.setLayout(-1, -2);
                }
                Window window2 = getWindow();
                if (window2 != null) {
                    window2.setBackgroundDrawable(new ColorDrawable(0));
                }
                setCanceledOnTouchOutside(true);
                break;
            case 2:
                Intrinsics.checkNotNullParameter(context, "context");
                super(context);
                requestWindowFeature(1);
                setContentView(R.layout.message_dialog);
                FrameLayout frameLayout4 = (FrameLayout) findViewById(R.id.ok);
                if (frameLayout4 != null) {
                    io.sentry.config.a.y(frameLayout4, 600L, new a2.f(19, this));
                }
                Window window3 = getWindow();
                if (window3 != null) {
                    window3.setLayout(-1, -2);
                }
                Window window4 = getWindow();
                if (window4 != null) {
                    window4.setBackgroundDrawable(new ColorDrawable(0));
                }
                setCanceledOnTouchOutside(true);
                break;
            case 3:
                Intrinsics.checkNotNullParameter(context, "context");
                super(context);
                requestWindowFeature(1);
                setContentView(R.layout.message_live_dialog);
                FrameLayout frameLayout5 = (FrameLayout) findViewById(R.id.ok);
                if (frameLayout5 != null) {
                    io.sentry.config.a.y(frameLayout5, 600L, new a2.f(20, this));
                }
                Window window5 = getWindow();
                if (window5 != null) {
                    window5.setLayout(-1, -1);
                }
                Window window6 = getWindow();
                if (window6 != null) {
                    window6.setBackgroundDrawable(new ColorDrawable(Color.parseColor("#BB000000")));
                    break;
                }
                break;
            default:
                Intrinsics.checkNotNullParameter(context, "context");
                requestWindowFeature(1);
                setContentView(R.layout.error_dialog);
                FrameLayout frameLayout6 = (FrameLayout) findViewById(R.id.ok);
                if (frameLayout6 != null) {
                    final int i13 = 0;
                    io.sentry.config.a.y(frameLayout6, 600L, new Function1(this) { // from class: sd.a

                        /* renamed from: b, reason: collision with root package name */
                        public final /* synthetic */ b f23470b;

                        {
                            this.f23470b = this;
                        }

                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            switch (i13) {
                                case 0:
                                    b bVar = this.f23470b;
                                    bVar.a(false);
                                    bVar.dismiss();
                                    break;
                                default:
                                    b bVar2 = this.f23470b;
                                    bVar2.a(true);
                                    bVar2.dismiss();
                                    break;
                            }
                            return Unit.f19194a;
                        }
                    });
                }
                FrameLayout frameLayout7 = (FrameLayout) findViewById(R.id.cancel);
                if (frameLayout7 != null) {
                    final int i14 = 1;
                    io.sentry.config.a.y(frameLayout7, 600L, new Function1(this) { // from class: sd.a

                        /* renamed from: b, reason: collision with root package name */
                        public final /* synthetic */ b f23470b;

                        {
                            this.f23470b = this;
                        }

                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            switch (i14) {
                                case 0:
                                    b bVar = this.f23470b;
                                    bVar.a(false);
                                    bVar.dismiss();
                                    break;
                                default:
                                    b bVar2 = this.f23470b;
                                    bVar2.a(true);
                                    bVar2.dismiss();
                                    break;
                            }
                            return Unit.f19194a;
                        }
                    });
                }
                Window window7 = getWindow();
                if (window7 != null) {
                    window7.setLayout(-1, -2);
                }
                Window window8 = getWindow();
                if (window8 != null) {
                    window8.setBackgroundDrawable(new ColorDrawable(0));
                }
                setCanceledOnTouchOutside(true);
                break;
        }
    }

    public static void e() {
        t0 t0Var = x.f22455a;
        Intrinsics.checkNotNullParameter("Error open link", "msg");
        x.f22455a.b(new u(null, 500, "Error open link"));
    }

    public void a(boolean z5) {
        switch (this.f23472a) {
            case 0:
                kf.f fVar = this.f23473b;
                if (fVar != null) {
                    gf.o oVar = q.f10031a;
                    fVar.resumeWith(new Pair(Boolean.valueOf(z5), this.f23474c));
                }
                this.f23473b = null;
                break;
            default:
                kf.f fVar2 = this.f23473b;
                if (fVar2 != null) {
                    gf.o oVar2 = q.f10031a;
                    fVar2.resumeWith(new Pair(Boolean.valueOf(z5), this.f23474c));
                }
                this.f23473b = null;
                break;
        }
    }

    public Object b(Bundle bundle, androidx.lifecycle.c frame) {
        String string;
        this.f23474c = bundle;
        String string2 = bundle.getString("Title");
        String str = "";
        if (string2 == null) {
            string2 = "";
        }
        Bundle bundle2 = this.f23474c;
        if (bundle2 != null && (string = bundle2.getString("Text")) != null) {
            str = string;
        }
        if (string2.length() == 0) {
            TextView textView = (TextView) findViewById(R.id.status);
            if (textView != null) {
                textView.setVisibility(8);
            }
        } else {
            TextView textView2 = (TextView) findViewById(R.id.status);
            if (textView2 != null) {
                textView2.setVisibility(0);
                textView2.setText(string2, TextView.BufferType.SPANNABLE);
            }
        }
        TextView textView3 = (TextView) findViewById(R.id.sportTypeLabel);
        if (textView3 != null) {
            textView3.setText(StringsKt.E(0, str, "Вид спорта:", true) > StringsKt.E(0, str, "Sport type:", true) ? "Вид спорта:" : "Sport type:", TextView.BufferType.SPANNABLE);
        }
        TextView textView4 = (TextView) findViewById(R.id.sportType);
        if (textView4 != null) {
            int max = Math.max(StringsKt.E(0, str, "Вид спорта:", true), StringsKt.E(0, str, "Sport type:", true));
            String substring = str.substring(max + 11, Math.max(StringsKt.E(max, str, "Лига:", true), StringsKt.E(max, str, "League:", true)));
            Intrinsics.checkNotNullExpressionValue(substring, "substring(...)");
            textView4.setText(StringsKt.a0(StringsKt.b0(StringsKt.a0(substring, '\n'), ' '), ' '), TextView.BufferType.SPANNABLE);
        }
        TextView textView5 = (TextView) findViewById(R.id.league);
        if (textView5 != null) {
            textView5.setText(StringsKt.E(0, str, "Лига:", true) > StringsKt.E(0, str, "League:", true) ? "Лига:" : "League:", TextView.BufferType.SPANNABLE);
        }
        TextView textView6 = (TextView) findViewById(R.id.sportLeague);
        if (textView6 != null) {
            int E = StringsKt.E(0, str, "Лига: ", true);
            int E2 = StringsKt.E(0, str, "League: ", true);
            int max2 = Math.max(E, E2);
            String substring2 = str.substring(max2 + (E > E2 ? 6 : 8), Math.max(StringsKt.E(max2, str, "Прогноз: ", true), StringsKt.E(max2, str, "Prediction: ", true)));
            Intrinsics.checkNotNullExpressionValue(substring2, "substring(...)");
            textView6.setText(StringsKt.a0(StringsKt.b0(StringsKt.a0(substring2, '\n'), ' '), ' '), TextView.BufferType.SPANNABLE);
        }
        TextView textView7 = (TextView) findViewById(R.id.sportPrediction);
        if (textView7 != null) {
            int E3 = StringsKt.E(0, str, "Прогноз:", true);
            int E4 = StringsKt.E(0, str, "Prediction:", true);
            int max3 = Math.max(E3, E4);
            String substring3 = str.substring(max3 + (E3 <= E4 ? 11 : 8), Math.max(StringsKt.E(max3, str, "КЭФ:", true), StringsKt.E(max3, str, "Odds:", true)));
            Intrinsics.checkNotNullExpressionValue(substring3, "substring(...)");
            textView7.setText(StringsKt.a0(StringsKt.b0(StringsKt.a0(substring3, '\n'), ' '), ' '), TextView.BufferType.SPANNABLE);
        }
        TextView textView8 = (TextView) findViewById(R.id.labelOdds);
        if (textView8 != null) {
            textView8.setText(StringsKt.E(0, str, "КЭФ:", true) > StringsKt.E(0, str, "Odds:", true) ? "КЭФ:" : "Odds:", TextView.BufferType.SPANNABLE);
        }
        TextView textView9 = (TextView) findViewById(R.id.kef1);
        if (textView9 != null) {
            int E5 = StringsKt.E(0, str, "КЭФ:", true);
            int E6 = StringsKt.E(0, str, "Odds:", true);
            String substring4 = str.substring(Math.max(E5, E6) + (E5 > E6 ? 4 : 5));
            Intrinsics.checkNotNullExpressionValue(substring4, "substring(...)");
            textView9.setText(StringsKt.a0(StringsKt.b0(StringsKt.a0(substring4, '\n'), ' '), ' '), TextView.BufferType.SPANNABLE);
        }
        show();
        kf.f fVar = new kf.f(lf.d.b(frame));
        this.f23473b = fVar;
        Object b10 = fVar.b();
        if (b10 == lf.a.f20034a) {
            Intrinsics.checkNotNullParameter(frame, "frame");
        }
        return b10;
    }

    public Object c(Bundle bundle, cd.k frame) {
        String str;
        String str2;
        this.f23474c = bundle;
        TextView textView = (TextView) findViewById(R.id.title_dialog);
        if (textView != null) {
            Bundle bundle2 = this.f23474c;
            if (bundle2 == null || (str2 = bundle2.getString("Title")) == null) {
                str2 = "Attention";
            }
            textView.setText(str2);
        }
        TextView textView2 = (TextView) findViewById(R.id.text_dialog);
        if (textView2 != null) {
            Bundle bundle3 = this.f23474c;
            if (bundle3 == null || (str = bundle3.getString("Text")) == null) {
                str = "There should be a description";
            }
            textView2.setText(str);
        }
        show();
        kf.f fVar = new kf.f(lf.d.b(frame));
        this.f23473b = fVar;
        Object b10 = fVar.b();
        if (b10 == lf.a.f20034a) {
            Intrinsics.checkNotNullParameter(frame, "frame");
        }
        return b10;
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x0013, code lost:
    
        if (r10 == null) goto L10;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v17, types: [android.widget.TextView] */
    /* JADX WARN: Type inference failed for: r10v11, types: [java.lang.CharSequence, java.lang.String] */
    /* JADX WARN: Type inference failed for: r10v12, types: [java.lang.CharSequence] */
    /* JADX WARN: Type inference failed for: r10v15, types: [android.text.SpannableString] */
    /* JADX WARN: Type inference failed for: r10v19 */
    /* JADX WARN: Type inference failed for: r10v20 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object d(Bundle bundle, mf.i frame) {
        String str;
        String str2;
        ?? r10;
        int i5;
        int i10;
        int i11;
        switch (this.f23472a) {
            case 1:
                this.f23474c = bundle;
                TextView textView = (TextView) findViewById(R.id.title_dialog);
                if (textView != null) {
                    Bundle bundle2 = this.f23474c;
                    if (bundle2 == null || (str2 = bundle2.getString("Title")) == null) {
                        str2 = "Google in app billing";
                    }
                    textView.setText(str2);
                }
                TextView textView2 = (TextView) findViewById(R.id.text_dialog);
                if (textView2 != null) {
                    Bundle bundle3 = this.f23474c;
                    if (bundle3 == null || (str = bundle3.getString("Text")) == null) {
                        str = "ERROR";
                    }
                    textView2.setText(str);
                }
                show();
                kf.f fVar = new kf.f(lf.d.b(frame));
                this.f23473b = fVar;
                Object b10 = fVar.b();
                if (b10 == lf.a.f20034a) {
                    Intrinsics.checkNotNullParameter(frame, "frame");
                }
                return b10;
            default:
                if (bundle != null) {
                    this.f23474c = bundle;
                }
                Bundle bundle4 = this.f23474c;
                if (bundle4 != null) {
                    String string = bundle4.getString("Text");
                    r10 = string;
                    break;
                }
                r10 = "There should be a description";
                Bundle bundle5 = this.f23474c;
                String string2 = bundle5 != null ? bundle5.getString("cancelSubs") : null;
                if (string2 != null && string2.length() != 0) {
                    SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(r10);
                    int length = string2.length();
                    int E = StringsKt.E(0, r10, string2, false);
                    if (E >= 0 && length > 0 && (i5 = E + length) <= r10.length()) {
                        spannableStringBuilder.setSpan(new hd.f(1, this), E, i5, 18);
                        int E2 = StringsKt.E(i5, r10, string2, false);
                        if (E2 >= 0 && (i10 = E2 + length) <= r10.length()) {
                            spannableStringBuilder.setSpan(new hd.f(1, this), E2, i10, 18);
                            int E3 = StringsKt.E(i10, r10, string2, false);
                            if (E3 >= 0 && (i11 = length + E3) <= r10.length()) {
                                spannableStringBuilder.setSpan(new hd.f(1, this), E3, i11, 18);
                            }
                        }
                    }
                    r10 = SpannableString.valueOf(spannableStringBuilder);
                }
                TextView textView3 = (TextView) findViewById(R.id.text_dialog);
                if (textView3 != null) {
                    textView3.setMovementMethod(LinkMovementMethod.getInstance());
                }
                ?? r02 = (TextView) findViewById(R.id.text_dialog);
                if (r02 != 0) {
                    r02.setText(r10, TextView.BufferType.SPANNABLE);
                }
                show();
                kf.f fVar2 = new kf.f(lf.d.b(frame));
                this.f23473b = fVar2;
                Object b11 = fVar2.b();
                if (b11 == lf.a.f20034a) {
                    Intrinsics.checkNotNullParameter(frame, "frame");
                }
                return b11;
        }
    }

    @Override // android.app.Dialog
    public final void setOnDismissListener(DialogInterface.OnDismissListener onDismissListener) {
        switch (this.f23472a) {
            case 0:
                a(false);
                break;
            case 1:
                a(false);
                break;
            case 2:
                kf.f fVar = this.f23473b;
                if (fVar != null) {
                    gf.o oVar = q.f10031a;
                    fVar.resumeWith(new Pair(Boolean.FALSE, this.f23474c));
                }
                this.f23473b = null;
                break;
            default:
                kf.f fVar2 = this.f23473b;
                if (fVar2 != null) {
                    gf.o oVar2 = q.f10031a;
                    fVar2.resumeWith(new Pair(Boolean.FALSE, this.f23474c));
                }
                this.f23473b = null;
                break;
        }
    }
}
