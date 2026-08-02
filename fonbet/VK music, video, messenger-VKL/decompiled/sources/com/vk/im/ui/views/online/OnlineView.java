package com.vk.im.ui.views.online;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.ImageView;
import androidx.appcompat.widget.AppCompatImageView;
import com.vk.api.generated.users.dto.UsersOnlineInfoDto;
import com.vk.dto.user.OnlineInfo;
import com.vk.im.ui.views.online.OnlineMode;
import xsna.ep80;
import xsna.qtd0;

/* compiled from: OnlineView.kt */
/* loaded from: classes2.dex */
public final class OnlineView extends AppCompatImageView {
    public final ep80 b;

    public OnlineView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        ep80 ep80Var = new ep80(context);
        this.b = ep80Var;
        setImageDrawable(ep80Var);
        setAdjustViewBounds(true);
        setScaleType(ImageView.ScaleType.CENTER_INSIDE);
    }

    public final void setFromOnlineInfo(OnlineInfo onlineInfo) {
        OnlineMode.Companion.getClass();
        setMode(OnlineMode.a.a(onlineInfo));
    }

    public final void setFromProfile(qtd0 qtd0Var) {
        OnlineInfo onlineInfo;
        OnlineMode.a aVar = OnlineMode.Companion;
        if (qtd0Var != null) {
            aVar.getClass();
            onlineInfo = qtd0Var.mb();
        } else {
            onlineInfo = null;
        }
        aVar.getClass();
        setMode(OnlineMode.a.a(onlineInfo));
    }

    public final void setFromUsersOnlineInfo(UsersOnlineInfoDto usersOnlineInfoDto) {
        OnlineMode.Companion.getClass();
        setMode(OnlineMode.a.b(usersOnlineInfoDto));
    }

    public final void setMode(OnlineMode onlineMode) {
        ep80 ep80Var = this.b;
        if (ep80Var.d != onlineMode) {
            Drawable drawable = ep80Var.e;
            Drawable drawable2 = null;
            if (drawable != null) {
                drawable.setCallback(null);
            }
            ep80Var.d = onlineMode;
            int i = ep80.a.$EnumSwitchMapping$0[onlineMode.ordinal()];
            if (i == 1 || i == 2) {
                drawable2 = ep80Var.c;
            } else if (i == 3) {
                drawable2 = ep80Var.b;
            }
            ep80Var.e = drawable2;
            if (drawable2 != null) {
                drawable2.setBounds(ep80Var.getBounds());
            }
            Drawable drawable3 = ep80Var.e;
            if (drawable3 != null) {
                drawable3.setCallback(ep80Var);
            }
            ep80Var.invalidateSelf();
        }
    }
}
