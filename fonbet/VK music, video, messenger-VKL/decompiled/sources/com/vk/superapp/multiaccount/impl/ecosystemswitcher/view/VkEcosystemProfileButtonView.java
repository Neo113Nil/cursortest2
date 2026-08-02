package com.vk.superapp.multiaccount.impl.ecosystemswitcher.view;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import com.vk.superapp.bridges.SuperappUiRouterBridge;
import com.vk.superapp.multiaccount.impl.R$styleable;
import com.vk.superapp.multiaccount.impl.ecosystemswitcher.view.configuration.ActionButtonsStyle;
import com.vk.superapp.multiaccount.impl.ecosystemswitcher.view.configuration.LogoStyle;
import kotlin.LazyThreadSafetyMode;
import xsna.ckc;
import xsna.e370;
import xsna.hnj;
import xsna.hvr0;
import xsna.hxo;
import xsna.ixo;
import xsna.jgp;
import xsna.msy;
import xsna.mui0;
import xsna.qqu0;
import xsna.usi0;
import xsna.vj;
import xsna.xxo;

/* compiled from: VkEcosystemProfileButtonView.kt */
/* loaded from: classes6.dex */
public final class VkEcosystemProfileButtonView extends FrameLayout {
    public static final /* synthetic */ int e = 0;
    public final ixo b;
    public final Object c;
    public final qqu0 d;

    /* JADX WARN: Multi-variable type inference failed */
    public VkEcosystemProfileButtonView(Context context, AttributeSet attributeSet) {
        super(hnj.a(context), attributeSet, 0);
        this.b = ixo.b;
        this.c = msy.a(LazyThreadSafetyMode.NONE, new hvr0(this, 16));
        qqu0 qqu0Var = new qqu0(context);
        addView(qqu0Var);
        this.d = qqu0Var;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.b, 0, 0);
        String string = obtainStyledAttributes.getString(3);
        LogoStyle logoStyle = (LogoStyle) LogoStyle.h().get(obtainStyledAttributes.getInt(2, 0));
        ActionButtonsStyle actionButtonsStyle = (ActionButtonsStyle) ActionButtonsStyle.h().get(obtainStyledAttributes.getInt(0, 0));
        int dimension = (int) obtainStyledAttributes.getDimension(1, xxo.f);
        if (string != null) {
            setTitle(string);
        }
        setLogoStyle(logoStyle);
        qqu0Var.setStyleLight(actionButtonsStyle == ActionButtonsStyle.LIGHT);
        qqu0Var.setCornerRadius(dimension);
        obtainStyledAttributes.recycle();
        qqu0Var.setOnClickListener(new ckc(7, this, context));
    }

    public static void a(VkEcosystemProfileButtonView vkEcosystemProfileButtonView, Context context) {
        vj a;
        usi0.a i = vkEcosystemProfileButtonView.getSessionsReadOnlyRepository().i();
        if (i == null || (a = i.a()) == null || a.a == null) {
            return;
        }
        SuperappUiRouterBridge superappUiRouterBridge = e370.d;
        if (superappUiRouterBridge == null) {
            superappUiRouterBridge = null;
        }
        superappUiRouterBridge.V(context, jgp.b);
        vkEcosystemProfileButtonView.b.s(hxo.b.b);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    private final mui0 getSessionsReadOnlyRepository() {
        return (mui0) this.c.getValue();
    }

    public final void setLogoStyle(LogoStyle logoStyle) {
        this.d.setLogoDark(logoStyle == LogoStyle.DARK);
    }

    public final void setTitle(String str) {
        this.d.setTitle(str);
    }
}
