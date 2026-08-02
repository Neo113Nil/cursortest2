package com.vk.im.design.view.chat_profile;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.vk.core.apps.BuildInfo;
import com.vk.core.view.components.button.tool.VkToolButton;
import com.vk.movika.sdk.base.logic.processor.actions.f;
import com.vk.movika.sdk.base.logic.processor.actions.g;
import com.vkontakte.android.R;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.LazyThreadSafetyMode;
import xsna.bpn0;
import xsna.bwt0;
import xsna.cn70;
import xsna.e3m;
import xsna.f4m;
import xsna.hg;
import xsna.j5g;
import xsna.jwb;
import xsna.krv0;
import xsna.kwb;
import xsna.lwb;
import xsna.m33;
import xsna.msy;
import xsna.xub;

/* compiled from: ChatProfileActionsView.kt */
/* loaded from: classes2.dex */
public final class ChatProfileActionsView extends ConstraintLayout {
    public static final /* synthetic */ int z = 0;
    public a t;
    public final LinkedHashMap u;
    public final bpn0 v;
    public final bpn0 w;
    public final bpn0 x;
    public final Object y;

    /* compiled from: ChatProfileActionsView.kt */
    public interface a {
        void a(xub xubVar);

        void b(List list);
    }

    public ChatProfileActionsView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.u = new LinkedHashMap();
        if (BuildInfo.t()) {
            bwt0.I(R.layout.vkim_chat_profile_actions_panel_view, this, true);
        } else {
            bwt0.I(R.layout.vkim_chat_profile_actions_view_v2, this, true);
        }
        this.v = new bpn0(new hg(this, 14));
        this.w = new bpn0(new f(this, 14));
        this.x = new bpn0(new g(this, 16));
        this.y = msy.a(LazyThreadSafetyMode.NONE, new jwb(context, 0));
    }

    public static View[] P4(ChatProfileActionsView chatProfileActionsView) {
        return BuildInfo.t() ? chatProfileActionsView.getVkMeActionButtons() : chatProfileActionsView.getVkAppActionButtons();
    }

    private final View[] getActionButtons() {
        return (View[]) this.v.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    private final xub getOverflowAction() {
        return (xub) this.y.getValue();
    }

    private final View[] getVkAppActionButtons() {
        return (View[]) this.w.getValue();
    }

    private final View[] getVkMeActionButtons() {
        return (View[]) this.x.getValue();
    }

    public final boolean Q4() {
        for (View view : getActionButtons()) {
            if (f4m.h(view)) {
                return true;
            }
        }
        return false;
    }

    public final void T4(List<? extends xub> list, List<? extends xub> list2) {
        Integer num;
        int b = list.size() == 4 ? cn70.b(0) : cn70.b(6);
        View[] actionButtons = getActionButtons();
        int length = actionButtons.length;
        int i = 0;
        int i2 = 0;
        while (i < length) {
            View view = actionButtons[i];
            int i3 = i2 + 1;
            boolean z2 = !list2.isEmpty() && i2 == list.size();
            xub overflowAction = z2 ? getOverflowAction() : (xub) j5g.b0(i2, list);
            if (BuildInfo.t()) {
                this.u.put(Integer.valueOf(i2), Integer.valueOf((overflowAction == null || (num = overflowAction.d) == null) ? R.attr.vk_ui_vkontakte_color_content_tint_foreground : num.intValue()));
                ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
                if (layoutParams == null) {
                    throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
                }
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                marginLayoutParams.setMarginStart(b);
                marginLayoutParams.setMarginEnd(b);
                view.setLayoutParams(marginLayoutParams);
                VkMeChatProfileActionButton vkMeChatProfileActionButton = (VkMeChatProfileActionButton) view;
                bwt0.p0(vkMeChatProfileActionButton, overflowAction != null);
                if (overflowAction != null) {
                    Context context = vkMeChatProfileActionButton.getContext();
                    e3m.a aVar = e3m.a;
                    LayerDrawable layerDrawable = new LayerDrawable(new Drawable[]{m33.a(R.drawable.vkim_ic_44_action_bg, context), m33.a(overflowAction.a, vkMeChatProfileActionButton.getContext())});
                    layerDrawable.setLayerInset(1, cn70.b(12), cn70.b(12), cn70.b(12), cn70.b(12));
                    vkMeChatProfileActionButton.setIcon(layerDrawable);
                    vkMeChatProfileActionButton.setText(overflowAction.b);
                    bwt0.i0(vkMeChatProfileActionButton, new kwb(z2, this, list2, overflowAction));
                }
            } else {
                VkToolButton vkToolButton = (VkToolButton) view;
                if (overflowAction == null) {
                    f4m.j(vkToolButton);
                } else {
                    vkToolButton.setVisibility(0);
                    VkToolButton.c(vkToolButton, Integer.valueOf(overflowAction.a));
                    vkToolButton.setText(overflowAction.b);
                    bwt0.i0(vkToolButton, new lwb(z2, this, list2, overflowAction));
                }
            }
            i++;
            i2 = i3;
        }
    }

    public final a getListener() {
        return this.t;
    }

    public final void setListener(a aVar) {
        this.t = aVar;
    }

    public final void setTint(int i) {
        View[] actionButtons = getActionButtons();
        int length = actionButtons.length;
        int i2 = 0;
        int i3 = 0;
        while (i2 < length) {
            View view = actionButtons[i2];
            int i4 = i3 + 1;
            if (view instanceof VkMeChatProfileActionButton) {
                ((VkMeChatProfileActionButton) view).setTint(krv0.m(((Number) this.u.getOrDefault(Integer.valueOf(i3), Integer.valueOf(R.attr.vk_ui_vkontakte_color_content_tint_foreground))).intValue(), getContext()));
            }
            i2++;
            i3 = i4;
        }
    }
}
