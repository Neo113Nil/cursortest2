package ge;

import android.graphics.Color;
import android.text.Spannable;
import android.text.SpannableString;
import android.text.style.ForegroundColorSpan;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.recyclerview.widget.d2;
import androidx.recyclerview.widget.x0;
import c4.v;
import c4.y;
import com.google.android.material.button.MaterialButton;
import com.sports.insider.R;
import com.sports.insider.domain.entity.CustomTypefaceSpan;
import j$.time.Instant;
import j$.time.LocalDateTime;
import j$.time.ZoneId;
import j$.time.format.DateTimeFormatter;
import k2.x;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public abstract class i extends d2 {

    /* renamed from: a, reason: collision with root package name */
    public final Object f9975a;

    /* renamed from: b, reason: collision with root package name */
    public x0 f9976b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(b3.a bindingIn, int i5) {
        super(bindingIn.getRoot());
        switch (i5) {
            case 1:
                Intrinsics.checkNotNullParameter(bindingIn, "bindingIn");
                super(bindingIn.getRoot());
                this.f9975a = bindingIn;
                break;
            default:
                Intrinsics.checkNotNullParameter(bindingIn, "binding");
                this.f9975a = new zc.k();
                break;
        }
    }

    public static void b(SpannableString spannable, CustomTypefaceSpan font, int i5, int i10) {
        Intrinsics.checkNotNullParameter(spannable, "spannable");
        Intrinsics.checkNotNullParameter(font, "font");
        try {
            spannable.setSpan(font, i5, i10, 18);
        } catch (Exception e7) {
            e7.printStackTrace();
        }
    }

    public static void d(ka.a aVar, ImageView imageView) {
        int i5 = aVar.f18948d;
        if (i5 == -1) {
            Integer valueOf = Integer.valueOf(R.drawable.ic_cross);
            c4.o a7 = y.a(imageView.getContext());
            q4.e eVar = new q4.e(imageView.getContext());
            eVar.f21940c = valueOf;
            q4.j.d(eVar, imageView);
            ((v) a7).a(eVar.a());
            return;
        }
        if (i5 == 0) {
            x.s(imageView).a();
            return;
        }
        if (i5 != 3) {
            Integer valueOf2 = Integer.valueOf(R.drawable.ic_send);
            c4.o a10 = y.a(imageView.getContext());
            q4.e eVar2 = new q4.e(imageView.getContext());
            eVar2.f21940c = valueOf2;
            q4.j.d(eVar2, imageView);
            ((v) a10).a(eVar2.a());
            return;
        }
        Integer valueOf3 = Integer.valueOf(R.drawable.ic_read);
        c4.o a11 = y.a(imageView.getContext());
        q4.e eVar3 = new q4.e(imageView.getContext());
        eVar3.f21940c = valueOf3;
        q4.j.d(eVar3, imageView);
        ((v) a11).a(eVar3.a());
    }

    public static void f(ka.a aVar, TextView view) {
        Intrinsics.checkNotNullParameter(view, "view");
        int i5 = aVar.f18948d;
        if (i5 > 0) {
            view.setText("");
            return;
        }
        if ((i5 > 0 ? 100 : aVar.f18955l) == 0) {
            view.setText("");
            return;
        }
        StringBuilder sb2 = new StringBuilder("  ");
        sb2.append(aVar.f18948d <= 0 ? aVar.f18955l : 100);
        sb2.append(" %");
        view.setText(sb2.toString());
    }

    public static void g(ka.a aVar, TextView textView) {
        textView.setText(LocalDateTime.ofInstant(Instant.ofEpochSecond(aVar.f18947c), ZoneId.systemDefault()).format(DateTimeFormatter.ofPattern("HH:mm")));
    }

    public static void h(LinearLayout view, nc.b bVar) {
        String btnText;
        Intrinsics.checkNotNullParameter(view, "view");
        String btnUrl = bVar.getBtnUrl();
        view.setVisibility((btnUrl == null || btnUrl.length() == 0 || (btnText = bVar.getBtnText()) == null || btnText.length() == 0) ? 8 : 0);
    }

    public static void i(View view, nc.b bVar, b bVar2) {
        Intrinsics.checkNotNullParameter(view, "view");
        String btnUrl = bVar.getBtnUrl();
        if (btnUrl != null && StringsKt.A(btnUrl, "insightsapp", false)) {
            view.setVisibility(8);
        } else {
            view.setVisibility(0);
            io.sentry.config.a.y(view, 600L, new h(bVar2, bVar, 0));
        }
    }

    public static Spannable j(SpannableString source) {
        Intrinsics.checkNotNullParameter(source, "source");
        try {
            if (source.length() != 0) {
                int E = StringsKt.E(0, source, "КЭФ:", true);
                int E2 = StringsKt.E(0, source, "Odds:", true);
                if (E <= -1) {
                    E = E2 > -1 ? E2 : -1;
                }
                if (E >= 0) {
                    int E3 = StringsKt.E(E, source, "\n", true);
                    if (E3 < 0) {
                        E3 = source.length();
                    }
                    if (E3 > E) {
                        source.setSpan(new ForegroundColorSpan(Color.parseColor("#03F39E")), E, E3, 18);
                    }
                }
            }
        } catch (Exception unused) {
        }
        return source;
    }

    public static void k(MaterialButton view, nc.b bVar, b bVar2) {
        Intrinsics.checkNotNullParameter(view, "view");
        view.setVisibility(0);
        io.sentry.config.a.y(view, 600L, new h(bVar2, bVar, 2));
        String btnText = bVar.getBtnText();
        if (btnText == null) {
            btnText = "";
        }
        view.setText(btnText);
    }

    public static void l(TextView view, nc.b bVar) {
        Intrinsics.checkNotNullParameter(view, "view");
        bVar.getCreateDate();
        view.setText(bVar.toHHmm());
    }

    public void c(ka.a aVar, View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        if (aVar == null) {
            return;
        }
        view.setOnLongClickListener(new te.a(this, aVar, 0));
    }

    public void e(ka.a aVar, AppCompatImageView view) {
        Intrinsics.checkNotNullParameter(view, "view");
        view.setVisibility((aVar.f18954k == null || aVar.j == null) ? 8 : 0);
        io.sentry.config.a.y(view, 600L, new fg.d(15, this, aVar));
        view.setOnLongClickListener(new te.a(this, aVar, 1));
    }
}
