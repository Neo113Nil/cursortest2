package ge;

import android.text.SpannableString;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.a0;
import androidx.appcompat.widget.q4;
import androidx.recyclerview.widget.d2;
import androidx.recyclerview.widget.x0;
import c4.v;
import c4.y;
import com.google.android.gms.internal.measurement.y3;
import com.google.android.material.button.MaterialButton;
import com.sports.insider.R;
import com.sports.insider.domain.entity.CustomTypefaceSpan;
import com.sports.insider.ui.live.LiveFragment;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class k extends x0 implements b {

    /* renamed from: a, reason: collision with root package name */
    public List f9978a;

    /* renamed from: b, reason: collision with root package name */
    public final a f9979b;

    /* renamed from: c, reason: collision with root package name */
    public LiveFragment f9980c;

    public k(ArrayList elements, a diffCallBack, LiveFragment liveFragment) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        Intrinsics.checkNotNullParameter(diffCallBack, "diffCallBack");
        this.f9978a = elements;
        this.f9979b = diffCallBack;
        this.f9980c = liveFragment;
    }

    @Override // ge.b
    public final void b(nc.b live) {
        Intrinsics.checkNotNullParameter(live, "live");
        LiveFragment liveFragment = this.f9980c;
        if (liveFragment != null) {
            liveFragment.b(live);
        }
    }

    public final m c(ViewGroup viewGroup) {
        View k6 = r4.k.k(viewGroup, R.layout.holder_prediction_live, viewGroup, false);
        int i5 = R.id.btn;
        MaterialButton materialButton = (MaterialButton) y3.j(R.id.btn, k6);
        if (materialButton != null) {
            i5 = R.id.btn_frame;
            LinearLayout linearLayout = (LinearLayout) y3.j(R.id.btn_frame, k6);
            if (linearLayout != null) {
                i5 = R.id.cart_data;
                if (((FrameLayout) y3.j(R.id.cart_data, k6)) != null) {
                    i5 = R.id.ic_copy;
                    AppCompatImageView appCompatImageView = (AppCompatImageView) y3.j(R.id.ic_copy, k6);
                    if (appCompatImageView != null) {
                        i5 = R.id.image;
                        ImageView imageView = (ImageView) y3.j(R.id.image, k6);
                        if (imageView != null) {
                            i5 = R.id.message;
                            TextView textView = (TextView) y3.j(R.id.message, k6);
                            if (textView != null) {
                                i5 = R.id.mouse;
                                if (((FrameLayout) y3.j(R.id.mouse, k6)) != null) {
                                    i5 = R.id.time;
                                    TextView textView2 = (TextView) y3.j(R.id.time, k6);
                                    if (textView2 != null) {
                                        q4 binding = new q4((LinearLayout) k6, materialButton, linearLayout, appCompatImageView, imageView, textView, textView2);
                                        Intrinsics.checkNotNullExpressionValue(binding, "inflate(...)");
                                        Intrinsics.checkNotNullParameter(binding, "binding");
                                        m mVar = new m(binding, 0);
                                        mVar.f9982c = binding;
                                        mVar.f9976b = this;
                                        return mVar;
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(k6.getResources().getResourceName(i5)));
    }

    @Override // androidx.recyclerview.widget.x0
    public final int getItemCount() {
        return this.f9978a.size();
    }

    @Override // androidx.recyclerview.widget.x0
    public final int getItemViewType(int i5) {
        hc.f fVar = (hc.f) this.f9978a.get(i5);
        if (!(fVar instanceof nc.b)) {
            return fVar instanceof hc.c ? 3 : 2;
        }
        String imageUrl = ((nc.b) fVar).getImageUrl();
        return (imageUrl == null || imageUrl.length() == 0) ? 0 : 1;
    }

    @Override // ge.b
    public final void n(nc.b live) {
        Intrinsics.checkNotNullParameter(live, "live");
    }

    @Override // androidx.recyclerview.widget.x0
    public final void onBindViewHolder(d2 holder, int i5) {
        SpannableString spannableString;
        SpannableString spannableString2;
        Intrinsics.checkNotNullParameter(holder, "holder");
        if (i5 == -1 || i5 >= this.f9978a.size()) {
            return;
        }
        hc.f fVar = (hc.f) this.f9978a.get(i5);
        if ((holder instanceof l) && (fVar instanceof nc.b)) {
            l lVar = (l) holder;
            nc.b obj = (nc.b) fVar;
            zc.k kVar = (zc.k) lVar.f9975a;
            Intrinsics.checkNotNullParameter(obj, "obj");
            a0 a0Var = lVar.f9981c;
            AppCompatImageView icCopy = (AppCompatImageView) a0Var.f683e;
            TextView view = (TextView) a0Var.f684f;
            Intrinsics.checkNotNullExpressionValue(icCopy, "icCopy");
            i.i(icCopy, obj, (k) lVar.f9976b);
            MaterialButton btn = (MaterialButton) a0Var.f681c;
            Intrinsics.checkNotNullExpressionValue(btn, "btn");
            i.k(btn, obj, (k) lVar.f9976b);
            LinearLayout btnFrame = (LinearLayout) a0Var.f682d;
            Intrinsics.checkNotNullExpressionValue(btnFrame, "btnFrame");
            i.h(btnFrame, obj);
            TextView time = (TextView) a0Var.f685g;
            Intrinsics.checkNotNullExpressionValue(time, "time");
            i.l(time, obj);
            String title = obj.getTitle();
            if (title == null || title.length() == 0) {
                spannableString2 = new SpannableString(obj.getMsgWithEndSpace());
                kVar.getClass();
                CustomTypefaceSpan d10 = zc.k.d();
                String msgWithEndSpace = obj.getMsgWithEndSpace();
                i.b(spannableString2, d10, 0, msgWithEndSpace != null ? msgWithEndSpace.length() : 0);
            } else {
                spannableString2 = new SpannableString(obj.getTitle() + '\n' + obj.getMsgWithEndSpace());
                kVar.getClass();
                CustomTypefaceSpan b10 = zc.k.b();
                String title2 = obj.getTitle();
                i.b(spannableString2, b10, 0, title2 != null ? title2.length() : 0);
                CustomTypefaceSpan d11 = zc.k.d();
                String title3 = obj.getTitle();
                i.b(spannableString2, d11, title3 != null ? title3.length() : 0, spannableString2.length());
            }
            i.j(spannableString2);
            view.setText(spannableString2);
            Intrinsics.checkNotNullExpressionValue(view, "message");
            k kVar2 = (k) lVar.f9976b;
            Intrinsics.checkNotNullParameter(view, "view");
            io.sentry.config.a.y(view, 600L, new h(kVar2, obj, 1));
            return;
        }
        if (!(holder instanceof m) || !(fVar instanceof nc.b)) {
            if ((holder instanceof j) && (fVar instanceof hc.b)) {
                TextView textView = (TextView) ((j) holder).f9977a.f25410b;
                String str = ((hc.b) fVar).f10488a;
                if (str == null) {
                    str = "";
                }
                textView.setText(str);
                return;
            }
            if ((holder instanceof g) && (fVar instanceof hc.c)) {
                g gVar = (g) holder;
                hc.c obj2 = (hc.c) fVar;
                Intrinsics.checkNotNullParameter(obj2, "obj");
                MaterialButton btn2 = (MaterialButton) gVar.f9970a.f19315c;
                Intrinsics.checkNotNullExpressionValue(btn2, "btn");
                k kVar3 = gVar.f9971b;
                btn2.setOnClickListener(null);
                io.sentry.config.a.y(btn2, 600L, new fg.d(1, kVar3, obj2));
                return;
            }
            return;
        }
        m mVar = (m) holder;
        q4 q4Var = mVar.f9982c;
        nc.b obj3 = (nc.b) fVar;
        zc.k kVar4 = (zc.k) mVar.f9975a;
        Intrinsics.checkNotNullParameter(obj3, "obj");
        AppCompatImageView icCopy2 = (AppCompatImageView) q4Var.f896f;
        ImageView image = (ImageView) q4Var.f897g;
        TextView view2 = (TextView) q4Var.f894d;
        Intrinsics.checkNotNullExpressionValue(icCopy2, "icCopy");
        i.i(icCopy2, obj3, (k) mVar.f9976b);
        MaterialButton btn3 = (MaterialButton) q4Var.f893c;
        Intrinsics.checkNotNullExpressionValue(btn3, "btn");
        i.k(btn3, obj3, (k) mVar.f9976b);
        LinearLayout btnFrame2 = (LinearLayout) q4Var.f895e;
        Intrinsics.checkNotNullExpressionValue(btnFrame2, "btnFrame");
        i.h(btnFrame2, obj3);
        TextView time2 = (TextView) q4Var.f898h;
        Intrinsics.checkNotNullExpressionValue(time2, "time");
        i.l(time2, obj3);
        String title4 = obj3.getTitle();
        if (title4 == null || title4.length() == 0) {
            spannableString = new SpannableString(obj3.getMsgWithEndSpace());
            kVar4.getClass();
            CustomTypefaceSpan d12 = zc.k.d();
            String msgWithEndSpace2 = obj3.getMsgWithEndSpace();
            i.b(spannableString, d12, 0, msgWithEndSpace2 != null ? msgWithEndSpace2.length() : 0);
        } else {
            spannableString = new SpannableString(obj3.getTitle() + '\n' + obj3.getMsgWithEndSpace());
            kVar4.getClass();
            CustomTypefaceSpan b11 = zc.k.b();
            String title5 = obj3.getTitle();
            i.b(spannableString, b11, 0, title5 != null ? title5.length() : 0);
            CustomTypefaceSpan d13 = zc.k.d();
            String title6 = obj3.getTitle();
            i.b(spannableString, d13, title6 != null ? title6.length() : 0, spannableString.length());
        }
        i.j(spannableString);
        view2.setText(spannableString);
        Intrinsics.checkNotNullExpressionValue(image, "image");
        String imageUrl = obj3.getImageUrl();
        image.setVisibility((imageUrl == null || imageUrl.length() == 0) ? 8 : 0);
        Intrinsics.checkNotNullExpressionValue(image, "image");
        io.sentry.config.a.y(image, 600L, new h((k) mVar.f9976b, obj3, 3));
        Intrinsics.checkNotNullExpressionValue(view2, "message");
        k kVar5 = (k) mVar.f9976b;
        Intrinsics.checkNotNullParameter(view2, "view");
        io.sentry.config.a.y(view2, 600L, new h(kVar5, obj3, 1));
        String imageUrl2 = obj3.getImageUrl();
        if (imageUrl2 != null) {
            c4.o a7 = y.a(image.getContext());
            q4.e eVar = new q4.e(image.getContext());
            eVar.f21940c = imageUrl2;
            q4.j.d(eVar, image);
            ((v) a7).a(eVar.a());
        }
    }

    @Override // androidx.recyclerview.widget.x0
    public final d2 onCreateViewHolder(ViewGroup parent, int i5) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        int i10 = R.id.btn;
        if (i5 == 0) {
            View k6 = r4.k.k(parent, R.layout.holder_prediction_text_live, parent, false);
            MaterialButton materialButton = (MaterialButton) y3.j(R.id.btn, k6);
            if (materialButton != null) {
                i10 = R.id.btn_frame;
                LinearLayout linearLayout = (LinearLayout) y3.j(R.id.btn_frame, k6);
                if (linearLayout != null) {
                    i10 = R.id.cart_data;
                    if (((FrameLayout) y3.j(R.id.cart_data, k6)) != null) {
                        i10 = R.id.ic_copy;
                        AppCompatImageView appCompatImageView = (AppCompatImageView) y3.j(R.id.ic_copy, k6);
                        if (appCompatImageView != null) {
                            i10 = R.id.message;
                            TextView textView = (TextView) y3.j(R.id.message, k6);
                            if (textView != null) {
                                i10 = R.id.mouse;
                                if (((FrameLayout) y3.j(R.id.mouse, k6)) != null) {
                                    i10 = R.id.time;
                                    TextView textView2 = (TextView) y3.j(R.id.time, k6);
                                    if (textView2 != null) {
                                        a0 binding = new a0((LinearLayout) k6, materialButton, linearLayout, appCompatImageView, textView, textView2, 9);
                                        Intrinsics.checkNotNullExpressionValue(binding, "inflate(...)");
                                        Intrinsics.checkNotNullParameter(binding, "binding");
                                        l lVar = new l(binding, 0);
                                        lVar.f9981c = binding;
                                        lVar.f9976b = this;
                                        return lVar;
                                    }
                                }
                            }
                        }
                    }
                }
            }
            throw new NullPointerException("Missing required view with ID: ".concat(k6.getResources().getResourceName(i10)));
        }
        if (i5 == 1) {
            return c(parent);
        }
        if (i5 == 2) {
            View k9 = r4.k.k(parent, R.layout.holder_prediction_live_date, parent, false);
            TextView textView3 = (TextView) y3.j(R.id.tv_date_live, k9);
            if (textView3 == null) {
                throw new NullPointerException("Missing required view with ID: ".concat(k9.getResources().getResourceName(R.id.tv_date_live)));
            }
            FrameLayout frameLayout = (FrameLayout) k9;
            x5.h binding2 = new x5.h(frameLayout, textView3, false);
            Intrinsics.checkNotNullExpressionValue(binding2, "inflate(...)");
            Intrinsics.checkNotNullParameter(binding2, "binding");
            j jVar = new j(frameLayout);
            jVar.f9977a = binding2;
            return jVar;
        }
        if (i5 != 3) {
            return c(parent);
        }
        View k10 = r4.k.k(parent, R.layout.holder_live_placement, parent, false);
        MaterialButton materialButton2 = (MaterialButton) y3.j(R.id.btn, k10);
        if (materialButton2 == null) {
            throw new NullPointerException("Missing required view with ID: ".concat(k10.getResources().getResourceName(R.id.btn)));
        }
        LinearLayout linearLayout2 = (LinearLayout) k10;
        l1.a binding3 = new l1.a(14, linearLayout2, materialButton2, false);
        Intrinsics.checkNotNullExpressionValue(binding3, "inflate(...)");
        Intrinsics.checkNotNullParameter(binding3, "binding");
        g gVar = new g(linearLayout2);
        gVar.f9970a = binding3;
        gVar.f9971b = this;
        return gVar;
    }

    @Override // androidx.recyclerview.widget.x0
    public final void onViewRecycled(d2 holder) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        super.onViewRecycled(holder);
        if (holder instanceof m) {
            ImageView image = (ImageView) ((m) holder).f9982c.f897g;
            Intrinsics.checkNotNullExpressionValue(image, "image");
            a.a.p(image);
        }
    }

    @Override // ge.b
    public final void r(nc.b live) {
        Intrinsics.checkNotNullParameter(live, "live");
        LiveFragment liveFragment = this.f9980c;
        if (liveFragment != null) {
            liveFragment.r(live);
        }
    }

    @Override // ge.b
    public final void t(String str) {
        LiveFragment liveFragment;
        if (str == null || (liveFragment = this.f9980c) == null) {
            return;
        }
        liveFragment.t(str);
    }

    @Override // ge.b
    public final void v(hc.c data) {
        Intrinsics.checkNotNullParameter(data, "data");
        LiveFragment liveFragment = this.f9980c;
        if (liveFragment != null) {
            liveFragment.v(data);
        }
    }
}
