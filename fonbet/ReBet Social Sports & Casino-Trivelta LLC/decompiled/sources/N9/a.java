package N9;

import android.R;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.google.android.gms.common.GoogleApiAvailability;
import com.google.android.gms.common.internal.AbstractC3201z;
import java.util.LinkedList;

/* loaded from: classes2.dex */
public abstract class a {

    /* renamed from: a, reason: collision with root package name */
    public c f7964a;

    /* renamed from: b, reason: collision with root package name */
    public Bundle f7965b;

    /* renamed from: c, reason: collision with root package name */
    public LinkedList f7966c;

    /* renamed from: d, reason: collision with root package name */
    public final e f7967d = new g(this);

    public static void h(FrameLayout frameLayout) {
        GoogleApiAvailability r10 = GoogleApiAvailability.r();
        Context context = frameLayout.getContext();
        int i10 = r10.i(context);
        String c10 = AbstractC3201z.c(context, i10);
        String b10 = AbstractC3201z.b(context, i10);
        LinearLayout linearLayout = new LinearLayout(frameLayout.getContext());
        linearLayout.setOrientation(1);
        linearLayout.setLayoutParams(new FrameLayout.LayoutParams(-2, -2));
        frameLayout.addView(linearLayout);
        TextView textView = new TextView(frameLayout.getContext());
        textView.setLayoutParams(new FrameLayout.LayoutParams(-2, -2));
        textView.setText(c10);
        linearLayout.addView(textView);
        Intent d10 = r10.d(context, i10, null);
        if (d10 != null) {
            Button button = new Button(context);
            button.setId(R.id.button1);
            button.setLayoutParams(new FrameLayout.LayoutParams(-2, -2));
            button.setText(b10);
            linearLayout.addView(button);
            button.setOnClickListener(new i(context, d10));
        }
    }

    public abstract void a(e eVar);

    public c b() {
        return this.f7964a;
    }

    public void c(Bundle bundle) {
        n(bundle, new h(this, bundle));
    }

    public void d() {
        c cVar = this.f7964a;
        if (cVar != null) {
            cVar.a();
        } else {
            m(1);
        }
    }

    public void e() {
        c cVar = this.f7964a;
        if (cVar != null) {
            cVar.onLowMemory();
        }
    }

    public void f() {
        c cVar = this.f7964a;
        if (cVar != null) {
            cVar.h();
        } else {
            m(5);
        }
    }

    public void g() {
        n(null, new j(this));
    }

    public final void m(int i10) {
        while (!this.f7966c.isEmpty() && ((k) this.f7966c.getLast()).a() >= i10) {
            this.f7966c.removeLast();
        }
    }

    public final void n(Bundle bundle, k kVar) {
        c cVar = this.f7964a;
        if (cVar != null) {
            kVar.b(cVar);
            return;
        }
        if (this.f7966c == null) {
            this.f7966c = new LinkedList();
        }
        this.f7966c.add(kVar);
        if (bundle != null) {
            Bundle bundle2 = this.f7965b;
            if (bundle2 == null) {
                this.f7965b = (Bundle) bundle.clone();
            } else {
                bundle2.putAll(bundle);
            }
        }
        a(this.f7967d);
    }
}
