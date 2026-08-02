package com.vk.avatarchange;

import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.graphics.RectF;
import android.graphics.drawable.GradientDrawable;
import android.net.Uri;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.ironsource.X3;
import com.unity3d.services.UnityAdsConstants;
import com.vk.avatar.api.border.AvatarBorderType;
import com.vk.avatarchange.AvatarChangeCropFragment;
import com.vk.core.fragments.FragmentImpl;
import com.vk.crop.CropImageView;
import com.vk.crop.d;
import com.vk.crop.g;
import com.vkontakte.android.R;
import kotlin.LazyThreadSafetyMode;
import xsna.asu0;
import xsna.bb;
import xsna.dhr0;
import xsna.e3m;
import xsna.gq5;
import xsna.iah0;
import xsna.jjc;
import xsna.jy;
import xsna.mcr0;
import xsna.msy;
import xsna.n8g;
import xsna.o25;
import xsna.ot;
import xsna.s3q0;
import xsna.um0;
import xsna.wf1;

/* compiled from: AvatarChangeCropFragment.kt */
/* loaded from: classes15.dex */
public final class AvatarChangeCropFragment extends FragmentImpl implements View.OnClickListener {
    public static final /* synthetic */ int a0 = 0;
    public final GradientDrawable N;
    public final Matrix O;
    public CropAvatarView P;
    public CropImageView Q;
    public int R;
    public Bitmap S;
    public String T;
    public boolean U;
    public float V;
    public boolean W;
    public boolean X;
    public final AvatarBorderType Y;
    public final Object Z;

    /* compiled from: AvatarChangeCropFragment.kt */
    public static final class a implements g.a {
        public a() {
        }

        @Override // com.vk.crop.g.a
        public final void a(float f, float f2, float f3, boolean z) {
            AvatarChangeCropFragment avatarChangeCropFragment = AvatarChangeCropFragment.this;
            Matrix matrix = avatarChangeCropFragment.O;
            if (z || avatarChangeCropFragment.W) {
                return;
            }
            CropImageView cropImageView = avatarChangeCropFragment.Q;
            if (cropImageView == null) {
                cropImageView = null;
            }
            com.vk.crop.a aVar = (com.vk.crop.a) cropImageView.c;
            float x0 = aVar.getX0() - aVar.getLeft();
            float y0 = aVar.getY0() - aVar.getTop();
            float f4 = avatarChangeCropFragment.V;
            matrix.postScale(f, f, (f2 - x0) * f4, (f3 - y0) * f4);
            CropAvatarView cropAvatarView = avatarChangeCropFragment.P;
            if (cropAvatarView == null) {
                cropAvatarView = null;
            }
            cropAvatarView.setMatrix(matrix);
            CropAvatarView cropAvatarView2 = avatarChangeCropFragment.P;
            (cropAvatarView2 != null ? cropAvatarView2 : null).invalidate();
        }

        @Override // com.vk.crop.g.a
        public final void b(float f, float f2, boolean z) {
            AvatarChangeCropFragment avatarChangeCropFragment = AvatarChangeCropFragment.this;
            Matrix matrix = avatarChangeCropFragment.O;
            if (z || avatarChangeCropFragment.W) {
                return;
            }
            float f3 = avatarChangeCropFragment.V;
            matrix.postTranslate(f * f3, f2 * f3);
            CropAvatarView cropAvatarView = avatarChangeCropFragment.P;
            if (cropAvatarView == null) {
                cropAvatarView = null;
            }
            cropAvatarView.setMatrix(matrix);
            CropAvatarView cropAvatarView2 = avatarChangeCropFragment.P;
            (cropAvatarView2 != null ? cropAvatarView2 : null).invalidate();
        }
    }

    /* compiled from: View.kt */
    public static final class b implements View.OnLayoutChangeListener {
        public b() {
        }

        @Override // android.view.View.OnLayoutChangeListener
        public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
            view.removeOnLayoutChangeListener(this);
            AvatarChangeCropFragment avatarChangeCropFragment = AvatarChangeCropFragment.this;
            avatarChangeCropFragment.U = true;
            avatarChangeCropFragment.eo();
        }
    }

    public AvatarChangeCropFragment() {
        GradientDrawable gradientDrawable = new GradientDrawable(GradientDrawable.Orientation.TOP_BOTTOM, new int[]{n8g.l(-16777216, 255), n8g.l(-16777216, 127), n8g.l(-16777216, 0), n8g.l(-16777216, 0), n8g.l(-16777216, 127), n8g.l(-16777216, 255)});
        gradientDrawable.setShape(0);
        gradientDrawable.setGradientType(0);
        this.N = gradientDrawable;
        this.O = new Matrix();
        this.V = 1.0f;
        this.Y = AvatarBorderType.CIRCLE;
        this.Z = msy.a(LazyThreadSafetyMode.NONE, new bb(this, 6));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r8v4, types: [xsna.fq5] */
    public final void eo() {
        Bitmap bitmap = this.S;
        if (bitmap != null && this.U) {
            CropImageView cropImageView = this.Q;
            if (cropImageView == null) {
                cropImageView = null;
            }
            final com.vk.crop.a aVar = (com.vk.crop.a) cropImageView.c;
            float min = Math.min(aVar.getX1() - aVar.getX0(), aVar.getY1() - aVar.getY0());
            final float f = (((((float) bitmap.getWidth()) / ((float) bitmap.getHeight())) > 1.0f ? 1 : ((((float) bitmap.getWidth()) / ((float) bitmap.getHeight())) == 1.0f ? 0 : -1)) > 0) != (((float) aVar.getWidth()) / ((float) aVar.getHeight()) > 1.0f) ? 1.0f : 2.0f;
            this.V = (this.R * 1.0f) / min;
            g gVar = new g(bitmap.getWidth(), bitmap.getHeight());
            gVar.k = 4.0f / f;
            gVar.c();
            CropImageView cropImageView2 = this.Q;
            CropImageView cropImageView3 = cropImageView2;
            if (cropImageView2 == null) {
                cropImageView3 = 0;
            }
            cropImageView3.b(bitmap, gVar, false, new Runnable() { // from class: xsna.fq5
                @Override // java.lang.Runnable
                public final void run() {
                    float f2 = f;
                    if (f2 == 1.0f) {
                        int i = AvatarChangeCropFragment.a0;
                        return;
                    }
                    AvatarChangeCropFragment avatarChangeCropFragment = this;
                    avatarChangeCropFragment.W = true;
                    CropImageView cropImageView4 = avatarChangeCropFragment.Q;
                    if (cropImageView4 == null) {
                        cropImageView4 = null;
                    }
                    com.vk.crop.b cropController = cropImageView4.getCropController();
                    com.vk.crop.a aVar2 = aVar;
                    cropController.e.a(f2, aVar2.getCenterX(), aVar2.getCenterY(), false);
                    cropController.e();
                    avatarChangeCropFragment.W = false;
                }
            });
            CropAvatarView cropAvatarView = this.P;
            if (cropAvatarView == null) {
                cropAvatarView = null;
            }
            cropAvatarView.e1(bitmap, this.Y);
            float min2 = (this.R * 1.0f) / Math.min(bitmap.getWidth(), bitmap.getHeight());
            Matrix matrix = this.O;
            matrix.setScale(min2, min2);
            float width = bitmap.getWidth() * min2;
            float height = min2 * bitmap.getHeight();
            if (width > height) {
                matrix.postTranslate((-(width - this.R)) * 0.5f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
            } else {
                matrix.postTranslate(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, (-(height - this.R)) * 0.5f);
            }
            if (f != 1.0f) {
                float f2 = this.R * 0.5f;
                matrix.postScale(f, f, f2, f2);
            }
            CropAvatarView cropAvatarView2 = this.P;
            (cropAvatarView2 != null ? cropAvatarView2 : null).setMatrix(matrix);
        }
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        Integer valueOf = view != null ? Integer.valueOf(view.getId()) : null;
        if (valueOf != null && valueOf.intValue() == R.id.avatar_crop_back_btn) {
            kn().onBackPressed();
            return;
        }
        if (valueOf != null && valueOf.intValue() == R.id.avatar_crop_continue) {
            CropImageView cropImageView = this.Q;
            if (cropImageView == null) {
                cropImageView = null;
            }
            com.vk.crop.b cropController = cropImageView.getCropController();
            if (cropController != null) {
                RectF b2 = cropController.b();
                Bitmap bitmap = this.S;
                int width = bitmap != null ? bitmap.getWidth() : 0;
                Bitmap bitmap2 = this.S;
                int height = bitmap2 != null ? bitmap2.getHeight() : 0;
                if (width * height == 0) {
                    return;
                }
                LayoutInflater.Factory kn = kn();
                gq5 gq5Var = kn instanceof gq5 ? (gq5) kn : null;
                if (gq5Var != null && !this.X) {
                    gq5Var.E0(b2.left, b2.top, b2.right, b2.bottom, width, height);
                    return;
                }
                Intent intent = new Intent();
                String str = this.T;
                intent.putExtra(X3.i.b, str != null ? str : null);
                intent.putExtra("rect", b2);
                s3q0 s3q0Var = s3q0.a;
                Mf(-1, intent);
            }
        }
    }

    @Override // com.vk.core.fragments.FragmentImpl, androidx.fragment.app.d, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        String str;
        super.onCreate(bundle);
        Bundle arguments = getArguments();
        if (arguments == null || (str = arguments.getString(X3.i.b)) == null) {
            str = "";
        }
        this.T = str;
        Bundle arguments2 = getArguments();
        this.X = arguments2 != null ? arguments2.getBoolean("skip_avatar_publish") : false;
        this.R = e3m.a(R.dimen.avatar_crop_preview_image_size, requireContext());
    }

    /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.Object, kotlin.Lazy] */
    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        dhr0.a.getClass();
        View inflate = LayoutInflater.from(dhr0.q0(dhr0.u().c)).inflate(R.layout.fragment_avatar_change_crop, viewGroup, false);
        jjc.f(this, inflate.findViewById(R.id.avatar_crop_back_btn));
        jjc.f(this, inflate.findViewById(R.id.avatar_crop_continue));
        Bundle arguments = getArguments();
        int i = arguments != null ? arguments.getInt("subtitle_res", 0) : 0;
        if (i != 0) {
            ((TextView) inflate.findViewById(R.id.avatar_crop_subtitle_text)).setText(i);
        }
        Bundle arguments2 = getArguments();
        inflate.findViewById(R.id.avatar_crop_preview_container).setVisibility(arguments2 != null ? arguments2.getBoolean("show_preview", true) : true ? 0 : 8);
        Bundle arguments3 = getArguments();
        String string = arguments3 != null ? arguments3.getString("username") : null;
        if (string == null || string.length() == 0) {
            string = o25.a().o().b;
        }
        ((TextView) inflate.findViewById(R.id.avatar_crop_username_text)).setText(string);
        this.P = (CropAvatarView) inflate.findViewById(R.id.avatar_crop_preview_image);
        CropImageView cropImageView = (CropImageView) inflate.findViewById(R.id.avatar_crop_crop_image_view);
        cropImageView.setGeometryCallback((a) this.Z.getValue());
        d dVar = cropImageView.c;
        com.vk.crop.a aVar = (com.vk.crop.a) dVar;
        aVar.setDrawBorder(true);
        aVar.setOverlayColor(1375731712);
        aVar.setOverlayDrawable(this.N);
        float v = iah0.v() * 0.5f * 0.5f;
        aVar.setLeftSidePadding(v);
        aVar.setRightSidePadding(v);
        if (!dVar.isLaidOut() || dVar.isLayoutRequested()) {
            dVar.addOnLayoutChangeListener(new b());
        } else {
            this.U = true;
            eo();
        }
        this.Q = cropImageView;
        return inflate;
    }

    @Override // com.vk.core.fragments.FragmentImpl, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        String str = this.T;
        if (str == null) {
            str = null;
        }
        mcr0.h(Uri.parse(str)).r0(asu0.a.c()).a0(io.reactivex.rxjava3.android.schedulers.a.b()).subscribe(new um0(new jy(this, 9), 4), new wf1(new ot(6), 6));
    }
}
