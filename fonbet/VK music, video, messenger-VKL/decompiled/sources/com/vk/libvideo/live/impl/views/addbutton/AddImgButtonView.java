package com.vk.libvideo.live.impl.views.addbutton;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import androidx.appcompat.widget.AppCompatImageButton;
import com.unity3d.services.UnityAdsConstants;
import com.vk.libvideo.live.api.view.AddButtonContract$State;
import com.vkontakte.android.R;
import xsna.b25;
import xsna.bwt0;
import xsna.enj;
import xsna.lk0;
import xsna.m33;
import xsna.mk0;
import xsna.o25;
import xsna.ql0;

/* loaded from: classes3.dex */
public class AddImgButtonView extends AppCompatImageButton implements mk0 {
    public lk0 e;
    public int f;
    public AddButtonContract$State g;

    public class a implements View.OnClickListener {
        public a() {
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            if (!o25.a().b()) {
                b25 a = o25.a();
                view.getContext();
                a.getClass();
            } else {
                lk0 lk0Var = AddImgButtonView.this.e;
                if (lk0Var != null) {
                    lk0Var.k2();
                }
            }
        }
    }

    public static /* synthetic */ class b {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[AddButtonContract$State.values().length];
            a = iArr;
            try {
                iArr[AddButtonContract$State.ADD_USER.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                a[AddButtonContract$State.ADDED_USER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                a[AddButtonContract$State.FOLLOW_GROUP.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                a[AddButtonContract$State.FOLLOWED_GROUP.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    public AddImgButtonView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        this.f = R.color.vk_white;
        setBackground(m33.a(R.drawable.vkim_ripple_light_borderless, getContext()));
    }

    @Override // xsna.mk0
    public final void Q(String str, AddButtonContract$State addButtonContract$State) {
        a(addButtonContract$State);
        if (addButtonContract$State.h().booleanValue()) {
            animate().cancel();
            animate().alpha(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT).setDuration(300L).setStartDelay(3000L).setListener(new ql0(this, 0)).start();
        } else {
            animate().cancel();
            setAlpha(1.0f);
            bwt0.p0(this, true);
        }
    }

    public final void a(AddButtonContract$State addButtonContract$State) {
        this.g = addButtonContract$State;
        int i = b.a[addButtonContract$State.ordinal()];
        int i2 = i != 1 ? i != 2 ? i != 3 ? i != 4 ? -1 : R.drawable.vk_icon_done_shadow_medium_48 : R.drawable.vk_icon_follow_outline_shadow_medium_48 : R.drawable.vk_icon_user_added_shadow_medium_48 : R.drawable.vk_icon_user_add_shadow_medium_48;
        if (i2 != -1) {
            setImageDrawable(enj.d(i2, this.f, getContext()));
        }
        bwt0.h0(new a(), this);
    }

    @Override // xsna.rr6
    public Context getViewContext() {
        return getContext();
    }

    @Override // xsna.rr6
    public final void pause() {
        lk0 lk0Var = this.e;
        if (lk0Var != null) {
            lk0Var.pause();
        }
    }

    @Override // xsna.rr6
    public final void release() {
        lk0 lk0Var = this.e;
        if (lk0Var != null) {
            lk0Var.release();
        }
        animate().cancel();
    }

    @Override // xsna.rr6
    public final void resume() {
        lk0 lk0Var = this.e;
        if (lk0Var != null) {
            lk0Var.resume();
        }
    }

    public void setIconsTintColor(int i) {
        this.f = i;
        AddButtonContract$State addButtonContract$State = this.g;
        if (addButtonContract$State != null) {
            a(addButtonContract$State);
        }
    }

    @Override // xsna.mk0
    public void setVisible(boolean z) {
        bwt0.p0(this, z);
    }

    @Override // xsna.rr6
    public lk0 getPresenter() {
        return this.e;
    }

    @Override // xsna.rr6
    public void setPresenter(lk0 lk0Var) {
        this.e = lk0Var;
    }

    @Override // xsna.rr6
    public View getView() {
        return this;
    }
}
