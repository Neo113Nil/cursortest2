package ud;

import android.view.View;
import android.widget.ImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.zoho.livechat.android.modules.common.ui.views.MobilistenTextView;
import od.q;

/* loaded from: classes4.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public final ConstraintLayout f66286a;

    /* renamed from: b, reason: collision with root package name */
    public final ImageView f66287b;

    /* renamed from: c, reason: collision with root package name */
    public final ConstraintLayout f66288c;

    /* renamed from: d, reason: collision with root package name */
    public final MobilistenTextView f66289d;

    public e(ConstraintLayout constraintLayout, ImageView imageView, ConstraintLayout constraintLayout2, MobilistenTextView mobilistenTextView) {
        this.f66286a = constraintLayout;
        this.f66287b = imageView;
        this.f66288c = constraintLayout2;
        this.f66289d = mobilistenTextView;
    }

    public static e a(View view) {
        int i10 = q.f60666u;
        ImageView imageView = (ImageView) N2.a.a(view, i10);
        if (imageView != null) {
            ConstraintLayout constraintLayout = (ConstraintLayout) view;
            int i11 = q.f60458Z8;
            MobilistenTextView mobilistenTextView = (MobilistenTextView) N2.a.a(view, i11);
            if (mobilistenTextView != null) {
                return new e(constraintLayout, imageView, constraintLayout, mobilistenTextView);
            }
            i10 = i11;
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    public ConstraintLayout b() {
        return this.f66286a;
    }
}
