package com.vk.superapp.multiaccount.impl.ecosystemswitcher.view;

import android.content.Context;
import android.content.res.TypedArray;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import com.vk.mvi.MviViewContainer;
import com.vk.superapp.bridges.dto.LkPage;
import com.vk.superapp.multiaccount.api.MultiAccountComponent;
import com.vk.superapp.multiaccount.api.SwitcherUiMode;
import com.vk.superapp.multiaccount.impl.R$styleable;
import com.vk.superapp.multiaccount.impl.ecosystemswitcher.view.a;
import com.vk.superapp.multiaccount.impl.ecosystemswitcher.view.c;
import com.vk.superapp.multiaccount.impl.ecosystemswitcher.view.configuration.ActionButtonsStyle;
import com.vk.superapp.multiaccount.impl.ecosystemswitcher.view.configuration.EcosystemViewConfigurationTypeEnum;
import com.vk.superapp.multiaccount.impl.ecosystemswitcher.view.configuration.LogoStyle;
import com.vk.superapp.sessionmanagment.api.domain.di.SessionManagementComponent;
import com.vkontakte.android.R;
import kotlin.NoWhenBranchMatchedException;
import xsna.ao50;
import xsna.b3i0;
import xsna.bpn0;
import xsna.c3i0;
import xsna.dyo;
import xsna.e3m;
import xsna.e89;
import xsna.ekh;
import xsna.eyo;
import xsna.fgm;
import xsna.fpf0;
import xsna.gl6;
import xsna.gm50;
import xsna.hg1;
import xsna.hnj;
import xsna.i340;
import xsna.ixo;
import xsna.jzq0;
import xsna.k7m;
import xsna.km50;
import xsna.m200;
import xsna.m7m;
import xsna.maj;
import xsna.mk50;
import xsna.mui0;
import xsna.vk50;
import xsna.wg1;
import xsna.xwo;
import xsna.xxo;
import xsna.yr00;

/* compiled from: EcosystemProfileView.kt */
/* loaded from: classes6.dex */
public final class EcosystemProfileView extends MviViewContainer<b, i, com.vk.superapp.multiaccount.impl.ecosystemswitcher.view.a> {
    public static final /* synthetic */ int m = 0;
    public c f;
    public final c3i0 g;
    public final xwo h;
    public final ixo i;
    public SwitcherUiMode j;
    public final bpn0 k;
    public final bpn0 l;

    /* compiled from: EcosystemProfileView.kt */
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[LkPage.values().length];
            try {
                iArr[LkPage.DEFAULT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[LkPage.RECOMMENDATIONS.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public EcosystemProfileView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 4);
    }

    private final com.vk.superapp.multiaccount.api.d getMultiAccountRepository() {
        return (com.vk.superapp.multiaccount.api.d) this.k.getValue();
    }

    private final jzq0 getUserResourceProvider() {
        return (jzq0) this.l.getValue();
    }

    @Override // xsna.xn50
    public final mk50 Fl() {
        return new mk50.c(e3m.b(getContext()).inflate(R.layout.vk_auth_ecosystem_profile_view, (ViewGroup) null, false));
    }

    @Override // xsna.xn50
    public final void Jh(ao50 ao50Var, View view) {
        f fVar = new f(this, view, new e89(1, this, EcosystemProfileView.class, "sendAction", "sendAction(Lcom/vk/mvi/core/data/MviAction;)V", 0, 6), getUserResourceProvider());
        gm50.a.b(fVar, ((i) ao50Var).a, new ekh(fVar, 4));
    }

    @Override // com.vk.mvi.MviViewContainer, xsna.xn50
    public final void R4(vk50 vk50Var) {
        int i = 0;
        int i2 = 1;
        ((b) vk50Var).l.a(new gl6(i2, this, EcosystemProfileView.class, "dispatchSideEffect", "dispatchSideEffect(Lcom/vk/superapp/multiaccount/impl/ecosystemswitcher/view/EcosystemProfileSideEffects;)V", i, 7), getViewOwner());
        wg1 wg1Var = new wg1(i2, this, EcosystemProfileView.class, "sendAction", "sendAction(Lcom/vk/mvi/core/data/MviAction;)V", i, 11);
        io.reactivex.rxjava3.subjects.d dVar = (io.reactivex.rxjava3.subjects.d) this.h.a;
        if (dVar != null) {
            hg1.b(this, hg1.h(dVar, new yr00(wg1Var, 8)));
        }
    }

    @Override // com.vk.mvi.MviViewContainer, android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        c3i0 c3i0Var = this.g;
        com.vk.core.tips.b bVar = c3i0Var.a;
        if (bVar != null) {
            bVar.b(false);
        }
        c3i0Var.a = null;
    }

    public final void setProfileMode$impl_release(c cVar) {
        this.f = cVar;
    }

    @Override // xsna.xn50
    public final vk50 x8(Bundle bundle, km50 km50Var) {
        mui0 J2 = ((SessionManagementComponent) ((k7m) m7m.c(this)).a(fpf0.a(SessionManagementComponent.class))).J2();
        MultiAccountComponent multiAccountComponent = (MultiAccountComponent) ((k7m) m7m.c(this)).a(fpf0.a(MultiAccountComponent.class));
        return new b((i340) multiAccountComponent.c(), J2, this.f, new b3i0(), this.j, m200.b.l(this.j, multiAccountComponent.d(), multiAccountComponent.c(), this.f));
    }

    /* JADX WARN: Finally extract failed */
    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public EcosystemProfileView(Context context, AttributeSet attributeSet, int i) {
        super(hnj.a(context), attributeSet, 0);
        dyo dyoVar;
        attributeSet = (i & 2) != 0 ? null : attributeSet;
        this.f = c.b.a;
        this.g = new c3i0();
        xwo xwoVar = new xwo(4);
        this.h = xwoVar;
        this.i = ixo.b;
        this.j = SwitcherUiMode.Ecoplate.b;
        this.k = new bpn0(new fgm(this, 3));
        this.l = new bpn0(new maj(this, 7));
        getMultiAccountRepository().c();
        TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, R$styleable.c, 0, 0);
        try {
            LogoStyle logoStyle = ((LogoStyle[]) LogoStyle.h().toArray(new LogoStyle[0]))[obtainStyledAttributes.getInt(4, 0)];
            ActionButtonsStyle actionButtonsStyle = ((ActionButtonsStyle[]) ActionButtonsStyle.h().toArray(new ActionButtonsStyle[0]))[obtainStyledAttributes.getInt(0, 0)];
            EcosystemViewConfigurationTypeEnum ecosystemViewConfigurationTypeEnum = ((EcosystemViewConfigurationTypeEnum[]) EcosystemViewConfigurationTypeEnum.h().toArray(new EcosystemViewConfigurationTypeEnum[0]))[obtainStyledAttributes.getInt(2, 0)];
            boolean z = obtainStyledAttributes.getBoolean(3, true);
            int dimension = (int) obtainStyledAttributes.getDimension(1, xxo.f);
            obtainStyledAttributes.recycle();
            int i2 = eyo.$EnumSwitchMapping$0[ecosystemViewConfigurationTypeEnum.ordinal()];
            if (i2 == 1) {
                dyoVar = dyo.a.a;
            } else {
                if (i2 != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                dyoVar = dyo.b.a;
            }
            xwoVar.s(new a.i(new xxo(dyoVar, logoStyle, z, dimension, actionButtonsStyle)));
        } catch (Throwable th) {
            obtainStyledAttributes.recycle();
            throw th;
        }
    }
}
