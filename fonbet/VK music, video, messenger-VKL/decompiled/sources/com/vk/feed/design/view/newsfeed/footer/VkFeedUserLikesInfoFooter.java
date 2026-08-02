package com.vk.feed.design.view.newsfeed.footer;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.vk.core.view.components.text.VkText;
import com.vk.core.view.components.userstack.VkMiniUserStack;
import com.vk.core.view.components.userstack.VkUserStack;
import com.vkontakte.android.R;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import kotlin.collections.EmptyList;
import xsna.awt0;
import xsna.c5g;
import xsna.cn70;
import xsna.ey2;
import xsna.f4m;
import xsna.itj0;
import xsna.ivu0;
import xsna.tlo0;

/* compiled from: VkFeedUserLikesInfoFooter.kt */
/* loaded from: classes18.dex */
public final class VkFeedUserLikesInfoFooter extends LinearLayout {
    public final VkMiniUserStack b;
    public final VkText c;
    public ivu0 d;
    public tlo0 e;

    public VkFeedUserLikesInfoFooter(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        LayoutInflater.from(context).inflate(R.layout.feed_likes_post_footer, (ViewGroup) this, true);
        this.b = (VkMiniUserStack) findViewById(R.id.avatar_stack);
        this.c = (VkText) findViewById(R.id.label);
        setOrientation(0);
        setGravity(16);
    }

    public final ivu0 getAvatars() {
        return this.d;
    }

    /* renamed from: getLabel-4KLrL5I, reason: not valid java name */
    public final tlo0 m92getLabel4KLrL5I() {
        return this.e;
    }

    public final void setAvatars(ivu0 ivu0Var) {
        VkUserStack.Size size;
        this.d = ivu0Var;
        Collection collection = ivu0Var != null ? ivu0Var.b : null;
        if (collection == null) {
            collection = EmptyList.b;
        }
        boolean isEmpty = collection.isEmpty();
        VkMiniUserStack vkMiniUserStack = this.b;
        awt0.v(vkMiniUserStack, !isEmpty);
        if (!isEmpty) {
            if (ivu0Var == null || (size = ivu0Var.a) == null) {
                size = VkUserStack.Size.Small;
            }
            vkMiniUserStack.setSize(size);
            Collection collection2 = collection;
            ArrayList arrayList = new ArrayList(c5g.u(collection2, 10));
            Iterator it = collection2.iterator();
            while (it.hasNext()) {
                itj0.d((String) it.next(), arrayList);
            }
            vkMiniUserStack.setAvatars(arrayList);
        }
        f4m.s(!isEmpty ? cn70.b(8) : 0, this.c);
    }

    /* renamed from: setLabel-6Rk4EoU, reason: not valid java name */
    public final void m93setLabel6Rk4EoU(tlo0 tlo0Var) {
        this.e = tlo0Var;
        ey2.i(this.c, tlo0Var != null ? tlo0Var.a(getContext()) : null);
    }
}
