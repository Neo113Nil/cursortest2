package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.drawable.AnimationDrawable;
import android.graphics.drawable.BitmapDrawable;
import android.util.Base64;
import android.util.TypedValue;
import android.view.View;
import android.widget.RelativeLayout;
import androidx.appcompat.widget.AppCompatImageView;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public final class sgg extends AppCompatImageView {
    public final sgg a;
    public final ad2 b;
    public final AnimationDrawable c;

    public sgg(Context context) {
        super(context);
        this.a = this;
        hs4 hs4Var = z45.a;
        this.b = s9a.c(rob.a);
        this.c = new AnimationDrawable();
        String[] strArr = {"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"};
        for (int i = 0; i < 8; i++) {
            String str = strArr[i];
            AnimationDrawable animationDrawable = this.c;
            Resources resources = getResources();
            str.getClass();
            byte[] decode = Base64.decode(str, 0);
            Bitmap decodeByteArray = BitmapFactory.decodeByteArray(decode, 0, decode.length);
            decodeByteArray.getClass();
            animationDrawable.addFrame(new BitmapDrawable(resources, decodeByteArray), 80);
        }
        this.c.setOneShot(false);
        this.c.setAlpha(128);
        setImageDrawable(this.c);
        Resources resources2 = getResources();
        resources2.getClass();
        int applyDimension = (int) TypedValue.applyDimension(1, 7.0f, resources2.getDisplayMetrics());
        Resources resources3 = getResources();
        resources3.getClass();
        int applyDimension2 = (applyDimension * 2) + ((int) TypedValue.applyDimension(1, 15.0f, resources3.getDisplayMetrics()));
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(applyDimension2, applyDimension2);
        layoutParams.addRule(21);
        layoutParams.addRule(12);
        setPadding(applyDimension, applyDimension, applyDimension, applyDimension);
        setLayoutParams(layoutParams);
    }

    public final void b() {
        xw3.L(this.b, null, null, new rgg(this, null, 0), 3);
    }

    @NotNull
    public View getView() {
        return this.a;
    }
}
