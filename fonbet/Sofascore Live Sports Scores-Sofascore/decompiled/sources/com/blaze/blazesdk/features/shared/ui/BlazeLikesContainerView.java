package com.blaze.blazesdk.features.shared.ui;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.blaze.blazesdk.custom_views.BlazeTextView;
import com.sofascore.results.R;
import defpackage.c9m;
import defpackage.nq8;
import defpackage.yhk;
import defpackage.ytm;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lcom/blaze/blazesdk/features/shared/ui/BlazeLikesContainerView;", "Landroid/widget/LinearLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "blazesdk_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public final class BlazeLikesContainerView extends LinearLayout {
    public static final /* synthetic */ int b = 0;
    public final c9m a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BlazeLikesContainerView(@NotNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        context.getClass();
        View inflate = LayoutInflater.from(context).inflate(R.layout.blaze_layout_likes_container_view, (ViewGroup) this, false);
        addView(inflate);
        int i2 = R.id.blaze_LikeButton;
        ImageView imageView = (ImageView) nq8.B(R.id.blaze_LikeButton, inflate);
        if (imageView != null) {
            i2 = R.id.blaze_likes_count_text_view;
            BlazeTextView blazeTextView = (BlazeTextView) nq8.B(R.id.blaze_likes_count_text_view, inflate);
            if (blazeTextView != null) {
                this.a = new c9m((LinearLayout) inflate, imageView, blazeTextView);
                return;
            }
        }
        yhk.s("Missing required view with ID: ".concat(inflate.getResources().getResourceName(i2)));
        throw null;
    }

    public final void a(ytm ytmVar) {
        BlazeTextView blazeTextView = this.a.c;
        blazeTextView.setText(String.valueOf(ytmVar.getW()));
        blazeTextView.setContentDescription(ytmVar.getW() + " likes");
        if (ytmVar.getW() > ytmVar.getY()) {
            blazeTextView.setVisibility(0);
        } else {
            blazeTextView.setVisibility(4);
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public BlazeLikesContainerView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        context.getClass();
    }

    public /* synthetic */ BlazeLikesContainerView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public BlazeLikesContainerView(@NotNull Context context) {
        this(context, null, 0, 6, null);
        context.getClass();
    }
}
