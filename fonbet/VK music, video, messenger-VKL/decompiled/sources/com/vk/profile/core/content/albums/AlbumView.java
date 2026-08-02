package com.vk.profile.core.content.albums;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.LinearGradient;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.PaintDrawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.RectShape;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.facebook.drawee.generic.RoundingParams;
import com.unity3d.services.UnityAdsConstants;
import com.vk.dto.common.restrictions.PhotoRestriction;
import com.vk.dto.photo.PhotoAlbum;
import com.vk.imageloader.view.VKImageView;
import com.vk.profile.core.R$styleable;
import com.vkontakte.android.R;
import java.util.Collections;
import xsna.an10;
import xsna.bwt0;
import xsna.el1;
import xsna.enj;
import xsna.gzs;
import xsna.hl1;
import xsna.il1;
import xsna.jl1;
import xsna.m33;
import xsna.s3q0;
import xsna.sjo;
import xsna.t0w0;

/* compiled from: AlbumView.kt */
/* loaded from: classes5.dex */
public final class AlbumView extends ConstraintLayout {
    public static final /* synthetic */ int F = 0;
    public a A;
    public el1 B;
    public final Drawable C;
    public final int D;
    public boolean E;
    public final VKImageView t;
    public final TextView u;
    public final TextView v;
    public final View w;
    public final ImageView x;
    public final View y;
    public final b z;

    /* compiled from: AlbumView.kt */
    public interface a {
        void a(VKImageView vKImageView);

        void b(VKImageView vKImageView, PhotoRestriction photoRestriction, il1 il1Var);
    }

    /* compiled from: AlbumView.kt */
    public final class b extends ShapeDrawable.ShaderFactory {
        @Override // android.graphics.drawable.ShapeDrawable.ShaderFactory
        public final Shader resize(int i, int i2) {
            return new LinearGradient(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, i2, new int[]{0, 67108864, 251658240, 1358954496, 1627389952, 1711276032}, new float[]{UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 0.13f, 0.303f, 0.697f, 0.84f, 1.0f}, Shader.TileMode.MIRROR);
        }
    }

    public AlbumView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        View.inflate(context, R.layout.view_album, this);
        this.t = (VKImageView) findViewById(R.id.iv_album_photo);
        this.u = (TextView) findViewById(R.id.tv_album_photos_count);
        TextView textView = (TextView) findViewById(R.id.tv_album_name);
        this.v = textView;
        View findViewById = findViewById(R.id.view_photo_overlay);
        this.w = findViewById;
        ImageView imageView = (ImageView) findViewById(R.id.iv_privacy_icon);
        this.x = imageView;
        View findViewById2 = findViewById(R.id.iv_album_item_menu);
        this.y = findViewById2;
        this.z = new b();
        this.D = 2;
        findViewById.setBackground(getPhotoOverlayDrawable());
        setClipToOutline(true);
        TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, R$styleable.a, 0, 0);
        float dimension = obtainStyledAttributes.getDimension(1, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        Drawable drawable = obtainStyledAttributes.getDrawable(4);
        this.C = drawable;
        this.D = obtainStyledAttributes.getInteger(5, 2);
        this.E = obtainStyledAttributes.getBoolean(2, false);
        obtainStyledAttributes.recycle();
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) textView.getLayoutParams();
        int b2 = an10.b(dimension);
        marginLayoutParams.leftMargin = b2;
        marginLayoutParams.rightMargin = b2;
        marginLayoutParams.bottomMargin = b2;
        textView.setLayoutParams(marginLayoutParams);
        imageView.setImageDrawable(drawable);
        findViewById2.setVisibility(this.E ? 0 : 8);
    }

    private final Drawable getPhotoOverlayDrawable() {
        PaintDrawable paintDrawable = new PaintDrawable();
        paintDrawable.setShape(new RectShape());
        paintDrawable.setShaderFactory(this.z);
        return paintDrawable;
    }

    public final el1 getAlbumUtils() {
        return this.B;
    }

    public final a getRestrictionsCallback() {
        return this.A;
    }

    public final void setAlbum(PhotoAlbum photoAlbum) {
        this.v.setMaxLines(this.D);
        setTitle(photoAlbum);
        setPhotosCount(photoAlbum);
        setImage(photoAlbum);
        setPrivacy(photoAlbum);
    }

    public final void setAlbumUtils(el1 el1Var) {
        this.B = el1Var;
    }

    public final void setCornerRadius(float f) {
        setOutlineProvider(new t0w0(6, f, false, false));
        RoundingParams roundingParams = this.t.getHierarchy().c;
        if (roundingParams != null) {
            roundingParams.f(f);
        }
    }

    public final void setImage(PhotoAlbum photoAlbum) {
        PhotoRestriction photoRestriction = photoAlbum.s;
        VKImageView vKImageView = this.t;
        if (photoRestriction != null) {
            a aVar = this.A;
            if (aVar != null) {
                aVar.b(vKImageView, photoRestriction, new il1(this, photoAlbum));
                return;
            }
            return;
        }
        a aVar2 = this.A;
        if (aVar2 != null) {
            aVar2.a(vKImageView);
        }
        if (photoAlbum.f != 0) {
            bwt0.S(vKImageView, new hl1(0, this, photoAlbum));
        } else {
            Drawable a2 = m33.a(R.drawable.album_empty_photo_placeholder, getContext());
            vKImageView.setImageDrawable(a2 != null ? sjo.e(a2, getContext(), Collections.singletonList(Integer.valueOf(R.id.album_empty_icon)), R.attr.vk_legacy_icon_secondary) : null);
        }
    }

    public final void setOptionsEnabled(boolean z) {
        this.E = z;
        this.y.setVisibility(z ? 0 : 8);
    }

    public final void setOptionsListener(gzs<s3q0> gzsVar) {
        bwt0.i0(this.y, new jl1(0, gzsVar));
    }

    public final void setPhotosCount(PhotoAlbum photoAlbum) {
        int i = photoAlbum.f;
        this.u.setText(i == 0 ? getContext().getString(R.string.profile_content_photos_zero_count) : enj.f(R.plurals.profile_content_photos_in_album_count, i, getContext()));
    }

    public final void setPrivacy(PhotoAlbum photoAlbum) {
        el1 el1Var = this.B;
        this.x.setVisibility(el1Var != null ? el1Var.a(photoAlbum) : false ? 0 : 8);
    }

    public final void setRestrictionsCallback(a aVar) {
        this.A = aVar;
    }

    public final void setTitle(PhotoAlbum photoAlbum) {
        this.v.setText(photoAlbum.g);
    }
}
