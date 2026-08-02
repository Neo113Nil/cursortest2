package defpackage;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import com.sofascore.model.mvvm.model.Incident;
import com.sofascore.model.mvvm.model.Player;
import com.sofascore.model.network.response.SearchResponseKt;
import com.sofascore.results.R;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class lae extends Drawable {
    public final int a;
    public final int b;
    public final int c;
    public Bitmap d;
    public final Paint e;
    public final String f;
    public final Rect g;
    public final Paint h;

    public lae(Context context, Player player, int i, boolean z, int i2) {
        String str;
        String str2;
        context.getClass();
        player.getClass();
        this.a = ao2.s(2, context);
        this.b = ao2.s(32, context);
        this.c = ao2.s(28, context);
        this.e = new Paint();
        String jerseyNumber = player.getJerseyNumber();
        jerseyNumber = jerseyNumber == null ? "" : jerseyNumber;
        this.f = jerseyNumber;
        this.g = new Rect();
        Paint paint = new Paint();
        paint.setTypeface(z1g.a(R.font.sofascore_sans_bold_condensed, context));
        paint.setTextSize(ao2.u(jerseyNumber.length() > 2 ? 12 : 18, context));
        paint.setTextAlign(Paint.Align.CENTER);
        paint.setColor(i2);
        this.h = paint;
        if (z) {
            m4j m4jVar = m4j.HOME;
            str = "home";
        } else {
            m4j m4jVar2 = m4j.HOME;
            str = "away";
        }
        if (Intrinsics.c(player.getPosition(), "G")) {
            jxe[] jxeVarArr = jxe.a;
            str2 = Incident.GoalIncident.TYPE_GOALKEEPER;
        } else {
            jxe[] jxeVarArr2 = jxe.a;
            str2 = SearchResponseKt.PLAYER_ENTITY;
        }
        String J = pco.J(i, str, str2);
        mnc mncVar = new mnc(this, 27);
        ht9 ht9Var = new ht9(context);
        ht9Var.c = J;
        ht9Var.f = J;
        ht9Var.c(J);
        z8e.Q(ht9Var, context, R.drawable.ic_jersey_placeholder, null, Integer.valueOf(R.color.neutral_default));
        ht9Var.d = new l2a(16, mncVar, this, mncVar);
        ajh.a(context).a(ht9Var.a());
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        canvas.getClass();
        Bitmap bitmap = this.d;
        if (bitmap != null) {
            float f = getBounds().left;
            float f2 = getBounds().top;
            canvas.drawBitmap(bitmap, f, f2, this.e);
            String str = this.f;
            if (StringsKt.R(str)) {
                return;
            }
            int length = str.length();
            Paint paint = this.h;
            paint.getTextBounds(str, 0, length, this.g);
            canvas.drawText(str, (getBounds().width() / 2.0f) + f, ((r6.height() / 2.0f) + ((getBounds().height() / 2.0f) + f2)) - this.a, paint);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
        this.e.setAlpha(i);
        this.h.setAlpha(i);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        this.e.setColorFilter(colorFilter);
    }
}
