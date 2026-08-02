package com.vk.im.design.view.listitem.infobar;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewStub;
import android.widget.TextView;
import androidx.constraintlayout.widget.Barrier;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.vk.core.view.components.button.VkButton;
import com.vk.imageloader.view.VKImageView;
import com.vk.vas.design.view.FriendsBirthdayBannerVerticalUserStack;
import com.vkontakte.android.R;
import java.util.ArrayList;
import java.util.List;
import xsna.e3m;
import xsna.epx;
import xsna.f4m;
import xsna.j5g;
import xsna.m33;
import xsna.uqi;

/* compiled from: FriendsBirthdayInfoBarView.kt */
/* loaded from: classes2.dex */
public final class FriendsBirthdayInfoBarView extends ConstraintLayout {
    public static final /* synthetic */ int B = 0;
    public final Barrier A;
    public final VKImageView t;
    public final VKImageView u;
    public final TextView v;
    public final VkButton w;
    public FriendsBirthdayBannerVerticalUserStack x;
    public final VkButton y;
    public final ViewStub z;

    /* compiled from: FriendsBirthdayInfoBarView.kt */
    public static final class a {
        public final String a;
        public final Integer b;

        public a(String str, Integer num) {
            this.a = str;
            this.b = num;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return epx.f(this.a, aVar.a) && epx.f(this.b, aVar.b);
        }

        public final int hashCode() {
            int hashCode = this.a.hashCode() * 31;
            Integer num = this.b;
            return hashCode + (num == null ? 0 : num.hashCode());
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("InfoBarButton(text=");
            sb.append(this.a);
            sb.append(", icon=");
            return uqi.b(sb, this.b, ')');
        }
    }

    public FriendsBirthdayInfoBarView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        View.inflate(context, R.layout.friends_birthdray_banner_view, this);
        View rootView = getRootView();
        e3m.a aVar = e3m.a;
        rootView.setBackground(m33.a(R.drawable.birthday_banner_background, context));
        ConstraintLayout constraintLayout = (ConstraintLayout) findViewById(R.id.banner_content);
        this.A = (Barrier) findViewById(R.id.stack_barrier);
        this.t = (VKImageView) findViewById(R.id.background_image_view);
        this.u = (VKImageView) findViewById(R.id.trailing_image_view);
        this.v = (TextView) findViewById(R.id.title);
        this.w = (VkButton) findViewById(R.id.hide);
        VkButton vkButton = (VkButton) findViewById(R.id.actionButton);
        this.y = vkButton;
        this.z = (ViewStub) findViewById(R.id.vertical_user_stack_stub);
        vkButton.setVisibility(8);
        int a2 = e3m.a(R.dimen.vk_ui_spacing_size_xl, context);
        constraintLayout.setPadding(a2, a2, a2, a2);
        f4m.t(e3m.a(R.dimen.vk_ui_spacing_size_xl, context), vkButton);
    }

    private final void setupButtons(List<a> list) {
        a aVar = (a) j5g.a0(list);
        if (aVar == null) {
            return;
        }
        String str = aVar.a;
        VkButton vkButton = this.y;
        vkButton.setText(str);
        Integer num = aVar.b;
        if (num != null) {
            vkButton.a5(true, Integer.valueOf(num.intValue()));
        }
        vkButton.setVisibility(0);
    }

    public final void P4(String str, String str2, String str3, ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3) {
        Integer num;
        this.v.setText(str);
        if (str2 != null) {
            this.t.load(str2);
        }
        if (str3 != null) {
            this.u.load(str3);
        }
        if (this.x == null) {
            this.x = (FriendsBirthdayBannerVerticalUserStack) this.z.inflate();
        }
        List V = j5g.V(arrayList);
        ArrayList arrayList4 = (ArrayList) V;
        int size = arrayList2.size() + arrayList4.size();
        if (size <= 3 || arrayList4.size() <= 1) {
            num = null;
        } else {
            num = Integer.valueOf(size - 2);
            V = j5g.H0(V, 2);
        }
        List y0 = j5g.y0(V);
        FriendsBirthdayBannerVerticalUserStack friendsBirthdayBannerVerticalUserStack = this.x;
        if (friendsBirthdayBannerVerticalUserStack != null) {
            friendsBirthdayBannerVerticalUserStack.b(num, y0);
        }
        FriendsBirthdayBannerVerticalUserStack friendsBirthdayBannerVerticalUserStack2 = this.x;
        if (friendsBirthdayBannerVerticalUserStack2 != null) {
            friendsBirthdayBannerVerticalUserStack2.setVisibility(0);
        }
        this.A.setReferencedIds(new int[]{R.id.vertical_user_stack});
        setupButtons(arrayList3);
    }
}
