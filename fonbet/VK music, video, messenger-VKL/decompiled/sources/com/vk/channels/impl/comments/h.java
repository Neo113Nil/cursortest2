package com.vk.channels.impl.comments;

import android.content.res.Resources;
import android.view.View;
import android.widget.EditText;
import com.ironsource.X3;
import com.vk.channels.impl.comments.g;
import com.vk.dto.common.id.UserId;
import com.vk.writebar.WriteBar;
import kotlin.LazyThreadSafetyMode;
import kotlin.text.Regex;
import xsna.a1y0;
import xsna.b1y0;
import xsna.drm0;
import xsna.eaz;
import xsna.fkq0;
import xsna.fw3;
import xsna.g20;
import xsna.hr80;
import xsna.l420;
import xsna.msy;
import xsna.q420;
import xsna.q6s0;
import xsna.qjo0;

/* compiled from: WriteBarController.kt */
/* loaded from: classes16.dex */
public final class h {
    public static final Regex h = new Regex("^\\s*" + eaz.c() + ",\\s?");
    public final WriteBar a;
    public final g20 b;
    public final Resources c;
    public final Object d;
    public final Object e;
    public g.b f;
    public final q420 g;

    public h(WriteBar writeBar, g20 g20Var) {
        this.a = writeBar;
        this.b = g20Var;
        this.c = writeBar.getResources();
        qjo0 qjo0Var = new qjo0(this, 16);
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.NONE;
        this.d = msy.a(lazyThreadSafetyMode, qjo0Var);
        this.e = msy.a(lazyThreadSafetyMode, new q6s0(this, 12));
        EditText input = writeBar.getInput();
        l420.w7.getClass();
        q420 q420Var = new q420(input, l420.a.b, new a1y0(), 24);
        q420Var.e(true);
        q420Var.g = new hr80();
        this.g = q420Var;
        writeBar.getInput().addTextChangedListener(new b1y0(this));
    }

    public final String a() {
        return drm0.p0(this.g.b()).toString();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    public final View b() {
        return (View) this.d.getValue();
    }

    public final void c(g.b.a.c cVar) {
        String str;
        UserId userId = cVar != null ? cVar.d : null;
        String str2 = cVar != null ? cVar.c : null;
        if (str2 == null || drm0.N(str2) || userId == null) {
            str = "";
        } else {
            StringBuilder sb = new StringBuilder(X3.j.d);
            sb.append(fkq0.b(userId) ? "club" : "id");
            sb.append(fkq0.a(userId).b);
            sb.append('|');
            sb.append(str2);
            sb.append("], ");
            str = sb.toString();
        }
        String a = a();
        Regex regex = h;
        boolean a2 = regex.a(a);
        WriteBar writeBar = this.a;
        if (a2) {
            writeBar.setText(regex.i(a(), str));
            return;
        }
        StringBuilder e = fw3.e(str);
        e.append(a());
        writeBar.setText(e.toString());
    }
}
