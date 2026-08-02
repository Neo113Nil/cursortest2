package com.vk.newsfeed.common.views.fave;

import android.content.Context;
import android.content.res.Configuration;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.vk.core.view.links.LinkedTextView;
import com.vkontakte.android.R;
import java.io.Serializable;
import kotlin.NoWhenBranchMatchedException;
import xsna.e43;
import xsna.f4m;
import xsna.iah0;

/* compiled from: FavesAllEmptyView.kt */
/* loaded from: classes4.dex */
public final class FavesAllEmptyView extends ConstraintLayout {
    public static final int y = iah0.a(56);
    public final ImageView t;
    public final TextView u;
    public final LinkedTextView v;
    public final TextView w;
    public FaveAllEmptyState x;

    /* compiled from: FavesAllEmptyView.kt */
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[FaveAllEmptyState.values().length];
            try {
                iArr[FaveAllEmptyState.NONE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[FaveAllEmptyState.EMPTY.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[FaveAllEmptyState.EMPTY_TAG.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public FavesAllEmptyView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        this.x = FaveAllEmptyState.NONE;
        setId(R.id.fave_all_empty_view_id);
        LayoutInflater.from(context).inflate(R.layout.fave_all_empty_view, this);
        this.t = (ImageView) findViewById(R.id.iv_stub_image);
        this.u = (TextView) findViewById(R.id.tv_title_view);
        this.v = (LinkedTextView) findViewById(R.id.tv_stub_description);
        this.w = (TextView) findViewById(R.id.tv_stub_button);
    }

    @Override // android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        setState(this.x);
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (parcelable instanceof Bundle) {
            Bundle bundle = (Bundle) parcelable;
            if (bundle.containsKey("super_parce_key")) {
                super.onRestoreInstanceState(bundle.getParcelable("super_parce_key"));
                Serializable serializable = bundle.getSerializable("state_key");
                FaveAllEmptyState faveAllEmptyState = serializable instanceof FaveAllEmptyState ? (FaveAllEmptyState) serializable : null;
                if (faveAllEmptyState == null) {
                    faveAllEmptyState = FaveAllEmptyState.NONE;
                }
                this.x = faveAllEmptyState;
                return;
            }
        }
        super.onRestoreInstanceState(parcelable);
    }

    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        Parcelable onSaveInstanceState = super.onSaveInstanceState();
        Bundle bundle = new Bundle();
        bundle.putSerializable("state_key", this.x);
        bundle.putParcelable("super_parce_key", onSaveInstanceState);
        return bundle;
    }

    public final void setState(FaveAllEmptyState faveAllEmptyState) {
        int i = a.$EnumSwitchMapping$0[faveAllEmptyState.ordinal()];
        TextView textView = this.w;
        LinkedTextView linkedTextView = this.v;
        TextView textView2 = this.u;
        ImageView imageView = this.t;
        if (i != 1) {
            int i2 = y;
            if (i == 2) {
                setMinHeight(0);
                Context context = e43.a;
                if (context == null) {
                    context = null;
                }
                setBackgroundColor(context.getColor(R.color.vk_clear));
                f4m.t(0, imageView);
                imageView.setImageDrawable(null);
                imageView.setVisibility(8);
                textView2.setText(R.string.fave_empty_title);
                linkedTextView.setText(getContext().getString(R.string.fave_empty_description));
                textView.setVisibility(8);
                f4m.q(i2, this);
            } else {
                if (i != 3) {
                    throw new NoWhenBranchMatchedException();
                }
                setMinHeight(0);
                Context context2 = e43.a;
                if (context2 == null) {
                    context2 = null;
                }
                setBackgroundColor(context2.getColor(R.color.vk_clear));
                f4m.t(0, imageView);
                imageView.setImageDrawable(null);
                imageView.setVisibility(8);
                textView2.setText(R.string.fave_empty_title_tag);
                linkedTextView.setText(R.string.fave_empty_description_tag);
                textView.setVisibility(8);
                f4m.q(i2, this);
            }
        } else {
            setMinHeight(0);
            f4m.t(0, imageView);
            imageView.setImageDrawable(null);
            textView2.setText("");
            linkedTextView.setText("");
            textView.setVisibility(8);
            imageView.setVisibility(0);
            f4m.q(0, this);
        }
        this.x = faveAllEmptyState;
    }
}
