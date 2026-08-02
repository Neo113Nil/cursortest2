package defpackage;

import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.Button;
import android.widget.ImageView;
import com.google.firebase.inappmessaging.display.internal.layout.FiamFrameLayout;
import com.google.firebase.inappmessaging.model.MessageType;
import com.sofascore.results.R;
import java.util.HashMap;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class qr9 extends y0 {
    public FiamFrameLayout d;
    public ViewGroup e;
    public ImageView f;
    public Button g;

    @Override // defpackage.y0
    public final ImageView h() {
        return this.f;
    }

    @Override // defpackage.y0
    public final ViewGroup i() {
        return this.d;
    }

    @Override // defpackage.y0
    public final ViewTreeObserver.OnGlobalLayoutListener j(HashMap hashMap, w38 w38Var) {
        View inflate = ((LayoutInflater) this.c).inflate(R.layout.image, (ViewGroup) null);
        this.d = (FiamFrameLayout) inflate.findViewById(R.id.image_root);
        this.e = (ViewGroup) inflate.findViewById(R.id.image_content_root);
        this.f = (ImageView) inflate.findViewById(R.id.image_view);
        this.g = (Button) inflate.findViewById(R.id.collapse_button);
        ImageView imageView = this.f;
        mw9 mw9Var = (mw9) this.b;
        imageView.setMaxHeight(mw9Var.a());
        this.f.setMaxWidth(mw9Var.b());
        lw9 lw9Var = (lw9) this.a;
        if (lw9Var.a.equals(MessageType.IMAGE_ONLY)) {
            at9 at9Var = (at9) lw9Var;
            ImageView imageView2 = this.f;
            sr9 sr9Var = at9Var.c;
            imageView2.setVisibility((sr9Var == null || TextUtils.isEmpty(sr9Var.a)) ? 8 : 0);
            this.f.setOnClickListener((View.OnClickListener) hashMap.get(at9Var.d));
        }
        this.d.setDismissListener(w38Var);
        this.g.setOnClickListener(w38Var);
        return null;
    }
}
